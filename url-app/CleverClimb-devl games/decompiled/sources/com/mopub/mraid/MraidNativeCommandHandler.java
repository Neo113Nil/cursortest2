package com.mopub.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.mopub.common.MoPubHttpUrlConnection;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.DeviceUtils;
import com.mopub.common.util.Intents;
import com.mopub.common.util.ResponseHeader;
import com.mopub.common.util.Streams;
import com.mopub.common.util.Utils;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TJAdUnitConstants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class MraidNativeCommandHandler {
    public static final String ANDROID_CALENDAR_CONTENT_TYPE = "vnd.android.cursor.item/event";
    private static final String[] DATE_FORMATS = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    private static final int MAX_NUMBER_DAYS_IN_MONTH = 31;

    @VisibleForTesting
    static final String MIME_TYPE_HEADER = "Content-Type";

    interface MraidCommandFailureListener {
        void onFailure(MraidCommandException mraidCommandException);
    }

    void createCalendarEvent(Context context, Map<String, String> map) throws MraidCommandException {
        if (isCalendarAvailable(context)) {
            try {
                Map<String, Object> translateJSParamsToAndroidCalendarEventMapping = translateJSParamsToAndroidCalendarEventMapping(map);
                Intent type = new Intent("android.intent.action.INSERT").setType(ANDROID_CALENDAR_CONTENT_TYPE);
                for (String str : translateJSParamsToAndroidCalendarEventMapping.keySet()) {
                    Object obj = translateJSParamsToAndroidCalendarEventMapping.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                context.startActivity(type);
                return;
            } catch (ActivityNotFoundException unused) {
                MoPubLog.d("no calendar app installed");
                throw new MraidCommandException("Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e) {
                MoPubLog.d("create calendar: invalid parameters " + e.getMessage());
                throw new MraidCommandException(e);
            } catch (Exception e2) {
                MoPubLog.d("could not create calendar event");
                throw new MraidCommandException(e2);
            }
        }
        MoPubLog.d("unsupported action createCalendarEvent for devices pre-ICS");
        throw new MraidCommandException("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
    }

    void storePicture(Context context, String str, MraidCommandFailureListener mraidCommandFailureListener) throws MraidCommandException {
        if (!isStorePictureSupported(context)) {
            MoPubLog.d("Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
            throw new MraidCommandException("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
        }
        if (context instanceof Activity) {
            showUserDialog(context, str, mraidCommandFailureListener);
        } else {
            Toast.makeText(context, "Downloading image to Picture gallery...", 0).show();
            downloadImage(context, str, mraidCommandFailureListener);
        }
    }

    boolean isTelAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return Intents.deviceCanHandleIntent(context, intent);
    }

    boolean isSmsAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return Intents.deviceCanHandleIntent(context, intent);
    }

    public static boolean isStorePictureSupported(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && DeviceUtils.isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    static boolean isCalendarAvailable(Context context) {
        return Intents.deviceCanHandleIntent(context, new Intent("android.intent.action.INSERT").setType(ANDROID_CALENDAR_CONTENT_TYPE));
    }

    boolean isInlineVideoAvailable(Activity activity, View view) {
        while (view.isHardwareAccelerated() && !Utils.bitMaskContainsFlag(view.getLayerType(), 1)) {
            if (view.getParent() instanceof View) {
                view = (View) view.getParent();
            } else {
                Window window = activity.getWindow();
                return window != null && Utils.bitMaskContainsFlag(window.getAttributes().flags, 16777216);
            }
        }
        return false;
    }

    private Map<String, Object> translateJSParamsToAndroidCalendarEventMapping(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (!map.containsKey("description") || !map.containsKey("start")) {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        hashMap.put(TJAdUnitConstants.String.TITLE, map.get("description"));
        if (map.containsKey("start") && map.get("start") != null) {
            Date parseDate = parseDate(map.get("start"));
            if (parseDate != null) {
                hashMap.put("beginTime", Long.valueOf(parseDate.getTime()));
                if (map.containsKey("end") && map.get("end") != null) {
                    Date parseDate2 = parseDate(map.get("end"));
                    if (parseDate2 != null) {
                        hashMap.put("endTime", Long.valueOf(parseDate2.getTime()));
                    } else {
                        throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                    }
                }
                if (map.containsKey(GooglePlayServicesInterstitial.LOCATION_KEY)) {
                    hashMap.put("eventLocation", map.get(GooglePlayServicesInterstitial.LOCATION_KEY));
                }
                if (map.containsKey("summary")) {
                    hashMap.put("description", map.get("summary"));
                }
                if (map.containsKey("transparency")) {
                    hashMap.put("availability", Integer.valueOf(map.get("transparency").equals(TJAdUnitConstants.String.TRANSPARENT) ? 1 : 0));
                }
                hashMap.put("rrule", parseRecurrenceRule(map));
                return hashMap;
            }
            throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
        }
        throw new IllegalArgumentException("Invalid calendar event: start is null.");
    }

    private Date parseDate(String str) {
        Date parse;
        Date date = null;
        for (String str2 : DATE_FORMATS) {
            try {
                parse = new SimpleDateFormat(str2, Locale.US).parse(str);
            } catch (ParseException unused) {
            }
            if (parse != null) {
                return parse;
            }
            date = parse;
        }
        return date;
    }

    private String parseRecurrenceRule(Map<String, String> map) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        if (map.containsKey("frequency")) {
            String str = map.get("frequency");
            int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
            if ("daily".equals(str)) {
                sb.append("FREQ=DAILY;");
                if (parseInt != -1) {
                    sb.append("INTERVAL=" + parseInt + ";");
                }
            } else if ("weekly".equals(str)) {
                sb.append("FREQ=WEEKLY;");
                if (parseInt != -1) {
                    sb.append("INTERVAL=" + parseInt + ";");
                }
                if (map.containsKey("daysInWeek")) {
                    String translateWeekIntegersToDays = translateWeekIntegersToDays(map.get("daysInWeek"));
                    if (translateWeekIntegersToDays == null) {
                        throw new IllegalArgumentException("invalid ");
                    }
                    sb.append("BYDAY=" + translateWeekIntegersToDays + ";");
                }
            } else if ("monthly".equals(str)) {
                sb.append("FREQ=MONTHLY;");
                if (parseInt != -1) {
                    sb.append("INTERVAL=" + parseInt + ";");
                }
                if (map.containsKey("daysInMonth")) {
                    String translateMonthIntegersToDays = translateMonthIntegersToDays(map.get("daysInMonth"));
                    if (translateMonthIntegersToDays == null) {
                        throw new IllegalArgumentException();
                    }
                    sb.append("BYMONTHDAY=" + translateMonthIntegersToDays + ";");
                }
            } else {
                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
            }
        }
        return sb.toString();
    }

    private String translateWeekIntegersToDays(String str) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] split = str.split(",");
        for (String str2 : split) {
            int parseInt = Integer.parseInt(str2);
            if (parseInt == 7) {
                parseInt = 0;
            }
            if (!zArr[parseInt]) {
                sb.append(dayNumberToDayOfWeekString(parseInt) + ",");
                zArr[parseInt] = true;
            }
        }
        if (split.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String translateMonthIntegersToDays(String str) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] split = str.split(",");
        for (String str2 : split) {
            int parseInt = Integer.parseInt(str2);
            int i = parseInt + 31;
            if (!zArr[i]) {
                sb.append(dayNumberToDayOfMonthString(parseInt) + ",");
                zArr[i] = true;
            }
        }
        if (split.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String dayNumberToDayOfWeekString(int i) throws IllegalArgumentException {
        switch (i) {
            case 0:
                return "SU";
            case 1:
                return "MO";
            case 2:
                return "TU";
            case 3:
                return "WE";
            case 4:
                return "TH";
            case 5:
                return "FR";
            case 6:
                return "SA";
            default:
                throw new IllegalArgumentException("invalid day of week " + i);
        }
    }

    private String dayNumberToDayOfMonthString(int i) throws IllegalArgumentException {
        if (i != 0 && i >= -31 && i <= 31) {
            return "" + i;
        }
        throw new IllegalArgumentException("invalid day of month " + i);
    }

    void downloadImage(final Context context, String str, final MraidCommandFailureListener mraidCommandFailureListener) {
        AsyncTasks.safeExecuteOnExecutor(new DownloadImageAsyncTask(context, new DownloadImageAsyncTask.DownloadImageAsyncTaskListener() { // from class: com.mopub.mraid.MraidNativeCommandHandler.1
            @Override // com.mopub.mraid.MraidNativeCommandHandler.DownloadImageAsyncTask.DownloadImageAsyncTaskListener
            public void onSuccess() {
                MoPubLog.d("Image successfully saved.");
            }

            @Override // com.mopub.mraid.MraidNativeCommandHandler.DownloadImageAsyncTask.DownloadImageAsyncTaskListener
            public void onFailure() {
                Toast.makeText(context, "Image failed to download.", 0).show();
                MoPubLog.d("Error downloading and saving image file.");
                mraidCommandFailureListener.onFailure(new MraidCommandException("Error downloading and saving image file."));
            }
        }), str);
    }

    private void showUserDialog(final Context context, final String str, final MraidCommandFailureListener mraidCommandFailureListener) {
        new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: com.mopub.mraid.MraidNativeCommandHandler.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                MraidNativeCommandHandler.this.downloadImage(context, str, mraidCommandFailureListener);
            }
        }).setCancelable(true).show();
    }

    @VisibleForTesting
    static class DownloadImageAsyncTask extends AsyncTask<String, Void, Boolean> {
        private final Context mContext;
        private final DownloadImageAsyncTaskListener mListener;

        interface DownloadImageAsyncTaskListener {
            void onFailure();

            void onSuccess();
        }

        public DownloadImageAsyncTask(Context context, DownloadImageAsyncTaskListener downloadImageAsyncTaskListener) {
            this.mContext = context.getApplicationContext();
            this.mListener = downloadImageAsyncTaskListener;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v12 */
        /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(String[] strArr) {
            BufferedInputStream bufferedInputStream;
            ?? r8;
            Throwable th;
            HttpURLConnection httpUrlConnection;
            if (strArr == null || strArr.length == 0 || strArr[0] == null) {
                return false;
            }
            File pictureStoragePath = getPictureStoragePath();
            pictureStoragePath.mkdirs();
            String str = strArr[0];
            URI create = URI.create(str);
            BufferedInputStream bufferedInputStream2 = null;
            try {
                httpUrlConnection = MoPubHttpUrlConnection.getHttpUrlConnection(str);
                bufferedInputStream = new BufferedInputStream(httpUrlConnection.getInputStream());
            } catch (Exception unused) {
                r8 = 0;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = null;
            }
            try {
                String headerField = httpUrlConnection.getHeaderField(ResponseHeader.LOCATION.getKey());
                if (!TextUtils.isEmpty(headerField)) {
                    create = URI.create(headerField);
                }
                File file = new File(pictureStoragePath, getFileNameForUriAndHeaders(create, httpUrlConnection.getHeaderFields()));
                r8 = new FileOutputStream(file);
                try {
                    Streams.copyContent(bufferedInputStream, r8);
                    loadPictureIntoGalleryApp(file.toString());
                    Streams.closeStream(bufferedInputStream);
                    Streams.closeStream(r8);
                    return true;
                } catch (Exception unused2) {
                    bufferedInputStream2 = bufferedInputStream;
                    r8 = r8;
                    try {
                        Streams.closeStream(bufferedInputStream2);
                        Streams.closeStream(r8);
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = bufferedInputStream2;
                        bufferedInputStream2 = r8;
                        th = th;
                        Streams.closeStream(bufferedInputStream);
                        Streams.closeStream(bufferedInputStream2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream2 = r8;
                    th = th;
                    Streams.closeStream(bufferedInputStream);
                    Streams.closeStream(bufferedInputStream2);
                    throw th;
                }
            } catch (Exception unused3) {
                r8 = 0;
            } catch (Throwable th5) {
                th = th5;
                Streams.closeStream(bufferedInputStream);
                Streams.closeStream(bufferedInputStream2);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            if (bool != null && bool.booleanValue()) {
                this.mListener.onSuccess();
            } else {
                this.mListener.onFailure();
            }
        }

        private String getFileNameForUriAndHeaders(URI uri, Map<String, List<String>> map) {
            Preconditions.checkNotNull(uri);
            String path = uri.getPath();
            if (path == null || map == null) {
                return null;
            }
            String name = new File(path).getName();
            List<String> list = map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                if (list.get(0) != null) {
                    for (String str : list.get(0).split(";")) {
                        if (str.contains("image/")) {
                            String str2 = "." + str.split("/")[1];
                            if (name.endsWith(str2)) {
                                return name;
                            }
                            return name + str2;
                        }
                    }
                    return name;
                }
            }
            return name;
        }

        private File getPictureStoragePath() {
            return new File(Environment.getExternalStorageDirectory(), "Pictures");
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void loadPictureIntoGalleryApp(String str) {
            MoPubMediaScannerConnectionClient moPubMediaScannerConnectionClient = new MoPubMediaScannerConnectionClient(str, null);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.mContext, moPubMediaScannerConnectionClient);
            moPubMediaScannerConnectionClient.setMediaScannerConnection(mediaScannerConnection);
            mediaScannerConnection.connect();
        }

        @VisibleForTesting
        @Deprecated
        DownloadImageAsyncTaskListener getListener() {
            return this.mListener;
        }
    }

    private static class MoPubMediaScannerConnectionClient implements MediaScannerConnection.MediaScannerConnectionClient {
        private final String mFilename;
        private MediaScannerConnection mMediaScannerConnection;
        private final String mMimeType;

        private MoPubMediaScannerConnectionClient(String str, String str2) {
            this.mFilename = str;
            this.mMimeType = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMediaScannerConnection(MediaScannerConnection mediaScannerConnection) {
            this.mMediaScannerConnection = mediaScannerConnection;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            if (this.mMediaScannerConnection != null) {
                this.mMediaScannerConnection.scanFile(this.mFilename, this.mMimeType);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            if (this.mMediaScannerConnection != null) {
                this.mMediaScannerConnection.disconnect();
            }
        }
    }
}
