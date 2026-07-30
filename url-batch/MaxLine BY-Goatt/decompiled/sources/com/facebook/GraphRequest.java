package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import defpackage.ey;
import defpackage.lh;
import defpackage.mi0;
import defpackage.oi;
import defpackage.q1;
import defpackage.q40;
import defpackage.tp2;
import defpackage.up2;
import defpackage.yt;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class GraphRequest {
    private static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    public static final String ACCESS_TOKEN_PARAM = "access_token";
    private static final String ATTACHED_FILES_PARAM = "attached_files";
    private static final String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final String BATCH_BODY_PARAM = "body";
    private static final String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final String BATCH_ENTRY_NAME_PARAM = "name";
    private static final String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final String BATCH_METHOD_PARAM = "method";
    private static final String BATCH_PARAM = "batch";
    private static final String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final String CAPTION_PARAM = "caption";
    private static final String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String DEBUG_KEY = "__debug__";
    private static final String DEBUG_MESSAGES_KEY = "messages";
    private static final String DEBUG_MESSAGE_KEY = "message";
    private static final String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final String DEBUG_PARAM = "debug";
    private static final String DEBUG_SEVERITY_INFO = "info";
    private static final String DEBUG_SEVERITY_WARNING = "warning";
    public static final String FIELDS_PARAM = "fields";
    private static final String FORMAT_JSON = "json";
    private static final String FORMAT_PARAM = "format";
    private static final String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final String ME = "me";
    private static final String MIME_BOUNDARY;
    private static final String MY_FRIENDS = "me/friends";
    private static final String MY_PHOTOS = "me/photos";
    private static final String PICTURE_PARAM = "picture";
    private static final String SDK_ANDROID = "android";
    private static final String SDK_PARAM = "sdk";
    private static final String SEARCH = "search";
    private static final String USER_AGENT_BASE = "FBAndroidSDK";
    private static final String USER_AGENT_HEADER = "User-Agent";
    private static final String VIDEOS_SUFFIX = "/videos";
    private static String defaultBatchApplicationId;
    private static volatile String userAgent;
    private static final Pattern versionPattern;
    private AccessToken accessToken;
    private String batchEntryDependsOn;
    private String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private Callback callback;
    private boolean forceApplicationRequest;
    private JSONObject graphObject;
    private String graphPath;
    private HttpMethod httpMethod;
    private String overriddenURL;
    private Bundle parameters;
    private Object tag;
    private String version;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "GraphRequest";

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Attachment {
        private final GraphRequest request;
        private final Object value;

        public Attachment(GraphRequest graphRequest, Object obj) {
            graphRequest.getClass();
            this.request = graphRequest;
            this.value = obj;
        }

        public final GraphRequest getRequest() {
            return this.request;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Callback {
        void onCompleted(GraphResponse graphResponse);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface GraphJSONArrayCallback {
        void onCompleted(JSONArray jSONArray, GraphResponse graphResponse);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface GraphJSONObjectCallback {
        void onCompleted(JSONObject jSONObject, GraphResponse graphResponse);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface KeyValueSerializer {
        void writeString(String str, String str2);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnProgressCallback extends Callback {
        void onProgress(long j, long j2);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Serializer implements KeyValueSerializer {
        private boolean firstWrite;
        private final Logger logger;
        private final OutputStream outputStream;
        private final boolean useUrlEncode;

        public Serializer(OutputStream outputStream, Logger logger, boolean z) {
            outputStream.getClass();
            this.outputStream = outputStream;
            this.logger = logger;
            this.firstWrite = true;
            this.useUrlEncode = z;
        }

        private final RuntimeException getInvalidTypeError() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void write(String str, Object... objArr) {
            str.getClass();
            objArr.getClass();
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                String encode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length)), "UTF-8");
                encode.getClass();
                byte[] bytes = encode.getBytes(yt.b);
                bytes.getClass();
                outputStream.write(bytes);
                return;
            }
            if (this.firstWrite) {
                OutputStream outputStream2 = this.outputStream;
                Charset charset = yt.b;
                byte[] bytes2 = "--".getBytes(charset);
                bytes2.getClass();
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.outputStream;
                byte[] bytes3 = GraphRequest.MIME_BOUNDARY.getBytes(charset);
                bytes3.getClass();
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.outputStream;
                byte[] bytes4 = "\r\n".getBytes(charset);
                bytes4.getClass();
                outputStream4.write(bytes4);
                this.firstWrite = false;
            }
            OutputStream outputStream5 = this.outputStream;
            Object[] copyOf2 = Arrays.copyOf(objArr, objArr.length);
            byte[] bytes5 = String.format(str, Arrays.copyOf(copyOf2, copyOf2.length)).getBytes(yt.b);
            bytes5.getClass();
            outputStream5.write(bytes5);
        }

        public final void writeBitmap(String str, Bitmap bitmap) {
            str.getClass();
            bitmap.getClass();
            writeContentDisposition(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.outputStream);
            writeLine(com.google.firebase.encoders.json.BuildConfig.FLAVOR, new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + str, "<Image>");
            }
        }

        public final void writeBytes(String str, byte[] bArr) {
            str.getClass();
            bArr.getClass();
            writeContentDisposition(str, str, "content/unknown");
            this.outputStream.write(bArr);
            writeLine(com.google.firebase.encoders.json.BuildConfig.FLAVOR, new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue(q40.l("    ", str), String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1)));
            }
        }

        public final void writeContentDisposition(String str, String str2, String str3) {
            if (this.useUrlEncode) {
                OutputStream outputStream = this.outputStream;
                byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(yt.b);
                bytes.getClass();
                outputStream.write(bytes);
                return;
            }
            write("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                write("; filename=\"%s\"", str2);
            }
            writeLine(com.google.firebase.encoders.json.BuildConfig.FLAVOR, new Object[0]);
            if (str3 != null) {
                writeLine("%s: %s", GraphRequest.CONTENT_TYPE_HEADER, str3);
            }
            writeLine(com.google.firebase.encoders.json.BuildConfig.FLAVOR, new Object[0]);
        }

        public final void writeContentUri(String str, Uri uri, String str2) {
            int copyAndCloseInputStream;
            str.getClass();
            uri.getClass();
            if (str2 == null) {
                str2 = "content/unknown";
            }
            writeContentDisposition(str, str, str2);
            if (this.outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) this.outputStream).addProgress(Utility.getContentSize(uri));
                copyAndCloseInputStream = 0;
            } else {
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(uri), this.outputStream);
            }
            writeLine(com.google.firebase.encoders.json.BuildConfig.FLAVOR, new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue(q40.l("    ", str), String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1)));
            }
        }

        public final void writeFile(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int copyAndCloseInputStream;
            str.getClass();
            parcelFileDescriptor.getClass();
            if (str2 == null) {
                str2 = "content/unknown";
            }
            writeContentDisposition(str, str, str2);
            OutputStream outputStream = this.outputStream;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).addProgress(parcelFileDescriptor.getStatSize());
                copyAndCloseInputStream = 0;
            } else {
                copyAndCloseInputStream = Utility.copyAndCloseInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.outputStream);
            }
            writeLine(com.google.firebase.encoders.json.BuildConfig.FLAVOR, new Object[0]);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue(q40.l("    ", str), String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(copyAndCloseInputStream)}, 1)));
            }
        }

        public final void writeLine(String str, Object... objArr) {
            str.getClass();
            objArr.getClass();
            write(str, Arrays.copyOf(objArr, objArr.length));
            if (this.useUrlEncode) {
                return;
            }
            write("\r\n", new Object[0]);
        }

        public final void writeObject(String str, Object obj, GraphRequest graphRequest) {
            str.getClass();
            Closeable closeable = this.outputStream;
            if (closeable instanceof RequestOutputStream) {
                closeable.getClass();
                ((RequestOutputStream) closeable).setCurrentRequest(graphRequest);
            }
            Companion companion = GraphRequest.Companion;
            if (companion.isSupportedParameterType(obj)) {
                writeString(str, companion.parameterToString(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                writeBitmap(str, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                writeBytes(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                writeContentUri(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                writeFile(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw getInvalidTypeError();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                writeFile(str, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw getInvalidTypeError();
                }
                writeContentUri(str, (Uri) resource, mimeType);
            }
        }

        public final void writeRecordBoundary() {
            if (!this.useUrlEncode) {
                writeLine("--%s", GraphRequest.MIME_BOUNDARY);
                return;
            }
            OutputStream outputStream = this.outputStream;
            byte[] bytes = "&".getBytes(yt.b);
            bytes.getClass();
            outputStream.write(bytes);
        }

        public final void writeRequestsAsJson(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            str.getClass();
            jSONArray.getClass();
            collection.getClass();
            Closeable closeable = this.outputStream;
            if (!(closeable instanceof RequestOutputStream)) {
                String jSONArray2 = jSONArray.toString();
                jSONArray2.getClass();
                writeString(str, jSONArray2);
                return;
            }
            closeable.getClass();
            RequestOutputStream requestOutputStream = (RequestOutputStream) closeable;
            writeContentDisposition(str, null, null);
            write("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i > 0) {
                    write(",%s", jSONObject.toString());
                } else {
                    write("%s", jSONObject.toString());
                }
                i = i2;
            }
            write("]", new Object[0]);
            Logger logger = this.logger;
            if (logger != null) {
                String l = q40.l("    ", str);
                String jSONArray3 = jSONArray.toString();
                jSONArray3.getClass();
                logger.appendKeyValue(l, jSONArray3);
            }
        }

        @Override // com.facebook.GraphRequest.KeyValueSerializer
        public void writeString(String str, String str2) {
            str.getClass();
            str2.getClass();
            writeContentDisposition(str, null, null);
            writeLine("%s", str2);
            writeRecordBoundary();
            Logger logger = this.logger;
            if (logger != null) {
                logger.appendKeyValue("    " + str, str2);
            }
        }
    }

    static {
        char[] cArr = {'-', '_', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(cArr[secureRandom.nextInt(64)]);
        }
        MIME_BOUNDARY = sb.toString();
        versionPattern = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new Bundle(bundle);
        } else {
            this.parameters = new Bundle();
        }
        if (this.version == null) {
            this.version = FacebookSdk.getGraphApiVersion();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _set_callback_$lambda$0(Callback callback, GraphResponse graphResponse) {
        graphResponse.getClass();
        JSONObject jSONObject = graphResponse.getJSONObject();
        JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject(DEBUG_KEY) : null;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray(DEBUG_MESSAGES_KEY) : null;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                if (optString != null && optString2 != null) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (optString2.equals(DEBUG_SEVERITY_WARNING)) {
                        loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!Utility.isNullOrEmpty(optString3)) {
                        optString = optString + " Link: " + optString3;
                    }
                    Logger.Companion companion = Logger.Companion;
                    String str = TAG;
                    str.getClass();
                    companion.log(loggingBehavior, str, optString);
                }
            }
        }
        if (callback != null) {
            callback.onCompleted(graphResponse);
        }
    }

    private final void addCommonParameters() {
        Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token") && Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
            Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", "android");
        bundle.putString(FORMAT_PARAM, FORMAT_JSON);
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_INFO);
        } else if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString(DEBUG_PARAM, DEBUG_SEVERITY_WARNING);
        }
    }

    private final String appendParametersToBaseUrl(String str, boolean z) {
        if (!z && this.httpMethod == HttpMethod.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.parameters.keySet()) {
            Object obj = this.parameters.get(str2);
            if (obj == null) {
                obj = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
            }
            Companion companion = Companion;
            if (companion.isSupportedParameterType(obj)) {
                buildUpon.appendQueryParameter(str2, companion.parameterToString(obj).toString());
            } else if (this.httpMethod != HttpMethod.GET) {
                lh.e(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String builder = buildUpon.toString();
        builder.getClass();
        return builder;
    }

    public static final GraphResponse executeAndWait(GraphRequest graphRequest) {
        return Companion.executeAndWait(graphRequest);
    }

    public static final List<GraphResponse> executeBatchAndWait(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAndWait(graphRequestBatch);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphRequestBatch) {
        return Companion.executeBatchAsync(graphRequestBatch);
    }

    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    public static final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    private final String getAccessTokenToUseForRequest() {
        AccessToken accessToken = this.accessToken;
        Bundle bundle = this.parameters;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String token = accessToken.getToken();
                Logger.Companion.registerAccessToken(token);
                return token;
            }
        } else if (!bundle.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final String getClientTokenForRequest() {
        String applicationId = FacebookSdk.getApplicationId();
        String clientToken = FacebookSdk.getClientToken();
        if (applicationId.length() <= 0 || clientToken.length() <= 0) {
            Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return applicationId + '|' + clientToken;
    }

    public static final String getDefaultBatchApplicationId() {
        return Companion.getDefaultBatchApplicationId();
    }

    private final String getGraphPathWithVersion() {
        return versionPattern.matcher(this.graphPath).matches() ? this.graphPath : String.format("%s/%s", Arrays.copyOf(new Object[]{this.version, this.graphPath}, 2));
    }

    private final String getUrlWithGraphPath(String str) {
        if (!isValidGraphRequestForDomain()) {
            str = ServerProtocol.getFacebookGraphUrlBase();
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, getGraphPathWithVersion()}, 2));
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(FacebookSdk.getApplicationId());
        sb.append("/?.*");
        return this.forceApplicationRequest || Pattern.matches(sb.toString(), this.graphPath) || Pattern.matches("^/?app/?.*", this.graphPath);
    }

    private final boolean isValidGraphRequestForDomain() {
        if (Intrinsics.b(FacebookSdk.getGraphDomain(), FacebookSdk.INSTAGRAM_COM)) {
            return !isApplicationRequest();
        }
        return true;
    }

    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    public static final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
        return Companion.newDeleteObjectRequest(accessToken, str, callback);
    }

    public static final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
        return Companion.newGraphPathRequest(accessToken, str, callback);
    }

    public static final GraphRequest newMeRequest(AccessToken accessToken, GraphJSONObjectCallback graphJSONObjectCallback) {
        return Companion.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    public static final GraphRequest newMyFriendsRequest(AccessToken accessToken, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    public static final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i, int i2, String str, GraphJSONArrayCallback graphJSONArrayCallback) {
        return Companion.newPlacesSearchRequest(accessToken, location, i, i2, str, graphJSONArrayCallback);
    }

    public static final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
        return Companion.newPostRequest(accessToken, str, jSONObject, callback);
    }

    public static final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
        return Companion.newPostRequestWithBundle(accessToken, str, bundle, callback);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap bitmap, String str2, Bundle bundle, Callback callback) {
        return Companion.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void serializeToBatch(JSONArray jSONArray, Map<String, Attachment> map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            Logger.Companion.registerAccessToken(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.parameters.get(it.next());
            if (Companion.isSupportedAttachmentType(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                arrayList.add(format);
                map.put(format, new Attachment(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final ArrayList arrayList2 = new ArrayList();
            Companion.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new KeyValueSerializer() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                @Override // com.facebook.GraphRequest.KeyValueSerializer
                public void writeString(String str3, String str4) {
                    str3.getClass();
                    str4.getClass();
                    arrayList2.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str3, URLEncoder.encode(str4, "UTF-8")}, 2)));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public static final void setDefaultBatchApplicationId(String str) {
        Companion.setDefaultBatchApplicationId(str);
    }

    private final boolean shouldForceClientTokenForRequest() {
        String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        boolean q = accessTokenToUseForRequest != null ? up2.q(accessTokenToUseForRequest, "|") : false;
        if (accessTokenToUseForRequest == null || !tp2.o(accessTokenToUseForRequest, "IG", false) || q || !isApplicationRequest()) {
            return (isValidGraphRequestForDomain() || q) ? false : true;
        }
        return true;
    }

    public static final HttpURLConnection toHttpConnection(GraphRequestBatch graphRequestBatch) {
        return Companion.toHttpConnection(graphRequestBatch);
    }

    public final GraphRequestAsyncTask executeAsync() {
        return Companion.executeBatchAsync(this);
    }

    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    public final String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    public final Callback getCallback() {
        return this.callback;
    }

    public final JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final String getGraphPath() {
        return this.graphPath;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final Bundle getParameters() {
        return this.parameters;
    }

    public final String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL != null) {
            ey.i("Can't override URL for a batch request");
            return null;
        }
        String urlWithGraphPath = getUrlWithGraphPath(ServerProtocol.getGraphUrlBase());
        addCommonParameters();
        Uri parse = Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
        return String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
    }

    public final Object getTag() {
        return this.tag;
    }

    public final String getUrlForSingleRequest() {
        String str = this.overriddenURL;
        if (str != null) {
            return str;
        }
        String str2 = this.graphPath;
        String urlWithGraphPath = getUrlWithGraphPath((this.httpMethod == HttpMethod.POST && str2 != null && tp2.h(str2, VIDEOS_SUFFIX, false)) ? ServerProtocol.getGraphVideoUrlBase() : ServerProtocol.getGraphUrlBaseForSubdomain(FacebookSdk.getGraphDomain()));
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath, false);
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public final void setBatchEntryDependsOn(String str) {
        this.batchEntryDependsOn = str;
    }

    public final void setBatchEntryName(String str) {
        this.batchEntryName = str;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z) {
        this.batchEntryOmitResultOnSuccess = z;
    }

    public final void setCallback(Callback callback) {
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_INFO) || FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.callback = new mi0(2, callback);
        } else {
            this.callback = callback;
        }
    }

    public final void setForceApplicationRequest(boolean z) {
        this.forceApplicationRequest = z;
    }

    public final void setGraphObject(JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final void setGraphPath(String str) {
        this.graphPath = str;
    }

    public final void setHttpMethod(HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != HttpMethod.GET) {
            ey.i("Can't change HTTP method on request with overridden URL.");
            return;
        }
        if (httpMethod == null) {
            httpMethod = HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    public final void setParameters(Bundle bundle) {
        bundle.getClass();
        this.parameters = bundle;
    }

    public final void setTag(Object obj) {
        this.tag = obj;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.accessToken;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append("}");
        return sb.toString();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        private final String mimeType;
        private final RESOURCE resource;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new Parcelable.Creator<ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new GraphRequest.ParcelableResourceWithMimeType<>(parcel, (DefaultConstructorMarker) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int i) {
                return new GraphRequest.ParcelableResourceWithMimeType[i];
            }
        };

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = (RESOURCE) parcel.readParcelable(FacebookSdk.getApplicationContext().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.mimeType);
            parcel.writeParcelable(this.resource, i);
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HttpURLConnection createConnection(URL url) {
            URLConnection openConnection = url.openConnection();
            openConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty(GraphRequest.USER_AGENT_HEADER, getUserAgent());
            httpURLConnection.setRequestProperty(GraphRequest.ACCEPT_LANGUAGE_HEADER, Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final String getBatchAppId(GraphRequestBatch graphRequestBatch) {
            String batchApplicationId = graphRequestBatch.getBatchApplicationId();
            if (batchApplicationId != null && !graphRequestBatch.isEmpty()) {
                return batchApplicationId;
            }
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            String str = GraphRequest.defaultBatchApplicationId;
            return (str == null || str.length() <= 0) ? FacebookSdk.getApplicationId() : str;
        }

        private final String getDefaultPhotoPathIfNull(String str) {
            return str == null ? GraphRequest.MY_PHOTOS : str;
        }

        private final String getMimeContentType() {
            return String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.MIME_BOUNDARY}, 1));
        }

        private final String getUserAgent() {
            if (GraphRequest.userAgent == null) {
                GraphRequest.userAgent = String.format("%s.%s", Arrays.copyOf(new Object[]{GraphRequest.USER_AGENT_BASE, FacebookSdkVersion.BUILD}, 2));
                String customUserAgent = InternalSettings.getCustomUserAgent();
                if (!Utility.isNullOrEmpty(customUserAgent)) {
                    GraphRequest.userAgent = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.userAgent, customUserAgent}, 2));
                }
            }
            return GraphRequest.userAgent;
        }

        private final boolean hasOnProgressCallbacks(GraphRequestBatch graphRequestBatch) {
            Iterator<GraphRequestBatch.Callback> it = graphRequestBatch.getCallbacks().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            Iterator<GraphRequest> it2 = graphRequestBatch.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isGzipCompressible(GraphRequestBatch graphRequestBatch) {
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                Iterator<String> it2 = next.getParameters().keySet().iterator();
                while (it2.hasNext()) {
                    if (isSupportedAttachmentType(next.getParameters().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final boolean isMeRequest(String str) {
            Matcher matcher = GraphRequest.versionPattern.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                str.getClass();
            }
            return tp2.o(str, "me/", false) || tp2.o(str, "/me/", false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedAttachmentType(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedParameterType(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newMeRequest$lambda$0(GraphJSONObjectCallback graphJSONObjectCallback, GraphResponse graphResponse) {
            graphResponse.getClass();
            if (graphJSONObjectCallback != null) {
                graphJSONObjectCallback.onCompleted(graphResponse.getJSONObject(), graphResponse);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void newPlacesSearchRequest$lambda$1(GraphJSONArrayCallback graphJSONArrayCallback, GraphResponse graphResponse) {
            graphResponse.getClass();
            if (graphJSONArrayCallback != null) {
                JSONObject jSONObject = graphResponse.getJSONObject();
                graphJSONArrayCallback.onCompleted(jSONObject != null ? jSONObject.optJSONArray("data") : null, graphResponse);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String parameterToString(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                lh.e("Unsupported parameter type.");
                return null;
            }
            String format = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
            format.getClass();
            return format;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void processGraphObject(JSONObject jSONObject, String str, KeyValueSerializer keyValueSerializer) {
            boolean z;
            Iterator<String> keys;
            if (isMeRequest(str)) {
                int w = up2.w(str, ":", 0, 6);
                int w2 = up2.w(str, "?", 0, 6);
                if (w > 3 && (w2 == -1 || w < w2)) {
                    z = true;
                    keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        boolean z2 = z && tp2.i(next, "image", true);
                        next.getClass();
                        opt.getClass();
                        processGraphObjectProperty(next, opt, keyValueSerializer, z2);
                    }
                }
            }
            z = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        private final void processGraphObjectProperty(String str, Object obj, KeyValueSerializer keyValueSerializer, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Object opt = jSONObject.opt(next);
                        opt.getClass();
                        processGraphObjectProperty(format, opt, keyValueSerializer, z);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    optString.getClass();
                    processGraphObjectProperty(str, optString, keyValueSerializer, z);
                    return;
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    optString2.getClass();
                    processGraphObjectProperty(str, optString2, keyValueSerializer, z);
                    return;
                } else {
                    if (jSONObject.has(NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                        String jSONObject2 = jSONObject.toString();
                        jSONObject2.getClass();
                        processGraphObjectProperty(str, jSONObject2, keyValueSerializer, z);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Object opt2 = jSONArray.opt(i);
                    opt2.getClass();
                    processGraphObjectProperty(format2, opt2, keyValueSerializer, z);
                }
                return;
            }
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                keyValueSerializer.writeString(str, obj.toString());
                return;
            }
            if (Date.class.isAssignableFrom(cls)) {
                String format3 = new SimpleDateFormat(GraphRequest.ISO_8601_FORMAT_STRING, Locale.US).format((Date) obj);
                format3.getClass();
                keyValueSerializer.writeString(str, format3);
                return;
            }
            Utility.logd(GraphRequest.TAG, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
        }

        private final void processRequest(GraphRequestBatch graphRequestBatch, Logger logger, int i, URL url, OutputStream outputStream, boolean z) {
            Serializer serializer = new Serializer(outputStream, logger, z);
            if (i != 1) {
                String batchAppId = getBatchAppId(graphRequestBatch);
                if (batchAppId.length() == 0) {
                    ey.i("App ID was not specified at the request or Settings.");
                    return;
                }
                serializer.writeString(GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
                HashMap hashMap = new HashMap();
                serializeRequestsAsJSON(serializer, graphRequestBatch, hashMap);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap, serializer);
                return;
            }
            GraphRequest graphRequest = graphRequestBatch.get(0);
            HashMap hashMap2 = new HashMap();
            for (String str : graphRequest.getParameters().keySet()) {
                Object obj = graphRequest.getParameters().get(str);
                if (isSupportedAttachmentType(obj)) {
                    str.getClass();
                    hashMap2.put(str, new Attachment(graphRequest, obj));
                }
            }
            if (logger != null) {
                logger.append("  Parameters:\n");
            }
            serializeParameters(graphRequest.getParameters(), serializer, graphRequest);
            if (logger != null) {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(hashMap2, serializer);
            JSONObject graphObject = graphRequest.getGraphObject();
            if (graphObject != null) {
                String path = url.getPath();
                path.getClass();
                processGraphObject(graphObject, path, serializer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runCallbacks$lambda$2(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
            arrayList.getClass();
            graphRequestBatch.getClass();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Pair pair = (Pair) obj;
                Callback callback = (Callback) pair.first;
                Object obj2 = pair.second;
                obj2.getClass();
                callback.onCompleted((GraphResponse) obj2);
            }
            Iterator<GraphRequestBatch.Callback> it = graphRequestBatch.getCallbacks().iterator();
            while (it.hasNext()) {
                it.next().onBatchCompleted(graphRequestBatch);
            }
        }

        private final void serializeAttachments(Map<String, Attachment> map, Serializer serializer) {
            for (Map.Entry<String, Attachment> entry : map.entrySet()) {
                if (GraphRequest.Companion.isSupportedAttachmentType(entry.getValue().getValue())) {
                    serializer.writeObject(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }

        private final void serializeParameters(Bundle bundle, Serializer serializer, GraphRequest graphRequest) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (isSupportedParameterType(obj)) {
                    str.getClass();
                    serializer.writeObject(str, obj, graphRequest);
                }
            }
        }

        private final void serializeRequestsAsJSON(Serializer serializer, Collection<GraphRequest> collection, Map<String, Attachment> map) {
            JSONArray jSONArray = new JSONArray();
            Iterator<GraphRequest> it = collection.iterator();
            while (it.hasNext()) {
                it.next().serializeToBatch(jSONArray, map);
            }
            serializer.writeRequestsAsJson(GraphRequest.BATCH_PARAM, jSONArray, collection);
        }

        private final void setConnectionContentType(HttpURLConnection httpURLConnection, boolean z) {
            if (!z) {
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_TYPE_HEADER, getMimeContentType());
            } else {
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_TYPE_HEADER, "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty(GraphRequest.CONTENT_ENCODING_HEADER, "gzip");
            }
        }

        public final GraphResponse executeAndWait(GraphRequest graphRequest) {
            graphRequest.getClass();
            List<GraphResponse> executeBatchAndWait = executeBatchAndWait(graphRequest);
            if (executeBatchAndWait.size() == 1) {
                return executeBatchAndWait.get(0);
            }
            ey.i("invalid state: expected a single response");
            return null;
        }

        public final List<GraphResponse> executeBatchAndWait(GraphRequestBatch graphRequestBatch) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<GraphResponse> list;
            graphRequestBatch.getClass();
            Validate.notEmptyAndContainsNoNulls(graphRequestBatch, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = toHttpConnection(graphRequestBatch);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = executeConnectionAndWait(httpURLConnection, graphRequestBatch);
                } else {
                    List<GraphResponse> constructErrorResponses = GraphResponse.Companion.constructErrorResponses(graphRequestBatch.getRequests(), null, new FacebookException(exc));
                    runCallbacks$facebook_core_release(graphRequestBatch, constructErrorResponses);
                    list = constructErrorResponses;
                }
                Utility.disconnectQuietly(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                Utility.disconnectQuietly(httpURLConnection2);
                throw th;
            }
        }

        public final GraphRequestAsyncTask executeBatchAsync(GraphRequestBatch graphRequestBatch) {
            graphRequestBatch.getClass();
            Validate.notEmptyAndContainsNoNulls(graphRequestBatch, "requests");
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(graphRequestBatch);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            httpURLConnection.getClass();
            graphRequestBatch.getClass();
            List<GraphResponse> fromHttpConnection$facebook_core_release = GraphResponse.Companion.fromHttpConnection$facebook_core_release(httpURLConnection, graphRequestBatch);
            Utility.disconnectQuietly(httpURLConnection);
            int size = graphRequestBatch.size();
            if (size != fromHttpConnection$facebook_core_release.size()) {
                throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(fromHttpConnection$facebook_core_release.size()), Integer.valueOf(size)}, 2)));
            }
            runCallbacks$facebook_core_release(graphRequestBatch, fromHttpConnection$facebook_core_release);
            AccessTokenManager.Companion.getInstance().extendAccessTokenIfNeeded();
            return fromHttpConnection$facebook_core_release;
        }

        public final GraphRequestAsyncTask executeConnectionAsync(Handler handler, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            httpURLConnection.getClass();
            graphRequestBatch.getClass();
            GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(httpURLConnection, graphRequestBatch);
            graphRequestBatch.setCallbackHandler(handler);
            graphRequestAsyncTask.executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
            return graphRequestAsyncTask;
        }

        public final String getDefaultBatchApplicationId() {
            return GraphRequest.defaultBatchApplicationId;
        }

        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
            context.getClass();
            if (str == null && accessToken != null) {
                str = accessToken.getApplicationId();
            }
            if (str == null) {
                str = Utility.getMetadataApplicationId(context);
            }
            if (str == null) {
                ey.i("Facebook App ID cannot be determined");
                return null;
            }
            String concat = str.concat("/custom_audience_third_party_id");
            AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.Companion.getAttributionIdentifiers(context);
            Bundle bundle = new Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    ey.i("There is no access token and attribution identifiers could not be retrieved");
                    return null;
                }
                String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                if (attributionId != null) {
                    bundle.putString("udid", attributionId);
                }
            }
            if (FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.isTrackingLimited())) {
                bundle.putString("limit_event_usage", AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
            return new GraphRequest(accessToken, concat, bundle, HttpMethod.GET, callback, null, 32, null);
        }

        public final GraphRequest newDeleteObjectRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, null, HttpMethod.DELETE, callback, null, 32, null);
        }

        public final GraphRequest newGraphPathRequest(AccessToken accessToken, String str, Callback callback) {
            return new GraphRequest(accessToken, str, null, null, callback, null, 32, null);
        }

        public final GraphRequest newMeRequest(AccessToken accessToken, GraphJSONObjectCallback graphJSONObjectCallback) {
            return new GraphRequest(accessToken, "me", null, null, new mi0(4, graphJSONObjectCallback), null, 32, null);
        }

        public final GraphRequest newMyFriendsRequest(AccessToken accessToken, final GraphJSONArrayCallback graphJSONArrayCallback) {
            return new GraphRequest(accessToken, GraphRequest.MY_FRIENDS, null, null, new Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(GraphResponse graphResponse) {
                    graphResponse.getClass();
                    if (GraphRequest.GraphJSONArrayCallback.this != null) {
                        JSONObject jSONObject = graphResponse.getJSONObject();
                        GraphRequest.GraphJSONArrayCallback.this.onCompleted(jSONObject != null ? jSONObject.optJSONArray("data") : null, graphResponse);
                    }
                }
            }, null, 32, null);
        }

        public final GraphRequest newPlacesSearchRequest(AccessToken accessToken, Location location, int i, int i2, String str, GraphJSONArrayCallback graphJSONArrayCallback) {
            if (location == null && Utility.isNullOrEmpty(str)) {
                ey.i("Either location or searchText must be specified.");
                return null;
            }
            Bundle bundle = new Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", i2);
            if (location != null) {
                bundle.putString("center", String.format(Locale.US, "%f,%f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2)));
                bundle.putInt("distance", i);
            }
            if (!Utility.isNullOrEmpty(str)) {
                bundle.putString("q", str);
            }
            return new GraphRequest(accessToken, "search", bundle, HttpMethod.GET, new mi0(3, graphJSONArrayCallback), null, 32, null);
        }

        public final GraphRequest newPostRequest(AccessToken accessToken, String str, JSONObject jSONObject, Callback callback) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(jSONObject);
            return graphRequest;
        }

        public final GraphRequest newPostRequestWithBundle(AccessToken accessToken, String str, Bundle bundle, Callback callback) {
            return new GraphRequest(accessToken, str, bundle, HttpMethod.POST, callback, null, 32, null);
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri uri, String str2, Bundle bundle, Callback callback) {
            uri.getClass();
            if (Utility.isFileUri(uri)) {
                return newUploadPhotoRequest(accessToken, str, new File(uri.getPath()), str2, bundle, callback);
            }
            if (!Utility.isContentUri(uri)) {
                ey.i("The photo Uri must be either a file:// or content:// Uri");
                return null;
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", uri);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        public final void runCallbacks$facebook_core_release(GraphRequestBatch graphRequestBatch, List<GraphResponse> list) {
            graphRequestBatch.getClass();
            list.getClass();
            int size = graphRequestBatch.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequest = graphRequestBatch.get(i);
                if (graphRequest.getCallback() != null) {
                    arrayList.add(new Pair(graphRequest.getCallback(), list.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                q1 q1Var = new q1(11, arrayList, graphRequestBatch);
                Handler callbackHandler = graphRequestBatch.getCallbackHandler();
                if (callbackHandler != null) {
                    callbackHandler.post(q1Var);
                } else {
                    q1Var.run();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void serializeToUrlConnection$facebook_core_release(GraphRequestBatch graphRequestBatch, HttpURLConnection httpURLConnection) {
            Throwable th;
            OutputStream gZIPOutputStream;
            OutputStream outputStream;
            Companion companion;
            boolean z;
            GraphRequestBatch graphRequestBatch2;
            OutputStream outputStream2;
            URL url;
            graphRequestBatch.getClass();
            httpURLConnection.getClass();
            Logger logger = new Logger(LoggingBehavior.REQUESTS, "Request");
            int size = graphRequestBatch.size();
            boolean isGzipCompressible = isGzipCompressible(graphRequestBatch);
            OutputStream outputStream3 = null;
            HttpMethod httpMethod = size == 1 ? graphRequestBatch.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = HttpMethod.POST;
            }
            httpURLConnection.setRequestMethod(httpMethod.name());
            setConnectionContentType(httpURLConnection, isGzipCompressible);
            URL url2 = httpURLConnection.getURL();
            logger.append("Request:\n");
            logger.appendKeyValue("Id", graphRequestBatch.getId());
            url2.getClass();
            logger.appendKeyValue("URL", url2);
            Object requestMethod = httpURLConnection.getRequestMethod();
            requestMethod.getClass();
            logger.appendKeyValue("Method", requestMethod);
            Object requestProperty = httpURLConnection.getRequestProperty(GraphRequest.USER_AGENT_HEADER);
            requestProperty.getClass();
            logger.appendKeyValue(GraphRequest.USER_AGENT_HEADER, requestProperty);
            Object requestProperty2 = httpURLConnection.getRequestProperty(GraphRequest.CONTENT_TYPE_HEADER);
            requestProperty2.getClass();
            logger.appendKeyValue(GraphRequest.CONTENT_TYPE_HEADER, requestProperty2);
            httpURLConnection.setConnectTimeout(graphRequestBatch.getTimeout());
            httpURLConnection.setReadTimeout(graphRequestBatch.getTimeout());
            if (httpMethod != HttpMethod.POST) {
                logger.log();
                return;
            }
            httpURLConnection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                if (isGzipCompressible) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream3 = bufferedOutputStream;
                        if (outputStream3 == null) {
                        }
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    if (hasOnProgressCallbacks(graphRequestBatch)) {
                        ProgressNoopOutputStream progressNoopOutputStream = new ProgressNoopOutputStream(graphRequestBatch.getCallbackHandler());
                        processRequest(graphRequestBatch, null, size, url2, progressNoopOutputStream, isGzipCompressible);
                        companion = this;
                        graphRequestBatch2 = graphRequestBatch;
                        size = size;
                        url = url2;
                        z = isGzipCompressible;
                        outputStream = gZIPOutputStream;
                        try {
                            outputStream2 = new ProgressOutputStream(outputStream, graphRequestBatch2, progressNoopOutputStream.getProgressMap(), progressNoopOutputStream.getMaxProgress());
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            outputStream3 = outputStream;
                            if (outputStream3 == null) {
                            }
                        }
                    } else {
                        companion = this;
                        z = isGzipCompressible;
                        graphRequestBatch2 = graphRequestBatch;
                        outputStream2 = gZIPOutputStream;
                        url = url2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = gZIPOutputStream;
                }
                try {
                    companion.processRequest(graphRequestBatch2, logger, size, url, outputStream2, z);
                    outputStream2.close();
                    logger.log();
                } catch (Throwable th5) {
                    th = th5;
                    outputStream3 = outputStream2;
                    th = th;
                    if (outputStream3 == null) {
                        throw th;
                    }
                    outputStream3.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        public final void setDefaultBatchApplicationId(String str) {
            GraphRequest.defaultBatchApplicationId = str;
        }

        public final HttpURLConnection toHttpConnection(GraphRequestBatch graphRequestBatch) {
            graphRequestBatch.getClass();
            validateFieldsParamForGetRequests$facebook_core_release(graphRequestBatch);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = createConnection(graphRequestBatch.size() == 1 ? new URL(graphRequestBatch.get(0).getUrlForSingleRequest()) : new URL(ServerProtocol.getGraphUrlBase()));
                    serializeToUrlConnection$facebook_core_release(graphRequestBatch, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    Utility.disconnectQuietly(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        public final void validateFieldsParamForGetRequests$facebook_core_release(GraphRequestBatch graphRequestBatch) {
            graphRequestBatch.getClass();
            Iterator<GraphRequest> it = graphRequestBatch.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                if (HttpMethod.GET == next.getHttpMethod() && Utility.isNullOrEmpty(next.getParameters().getString(GraphRequest.FIELDS_PARAM))) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                    StringBuilder sb = new StringBuilder("GET requests for /");
                    String graphPath = next.getGraphPath();
                    if (graphPath == null) {
                        graphPath = com.google.firebase.encoders.json.BuildConfig.FLAVOR;
                    }
                    companion.log(loggingBehavior, 5, "Request", q40.p(sb, graphPath, " should contain an explicit \"fields\" parameter."));
                }
            }
        }

        private Companion() {
        }

        public final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> collection) {
            collection.getClass();
            return executeBatchAsync(new GraphRequestBatch(collection));
        }

        public final GraphRequestAsyncTask executeBatchAsync(GraphRequest... graphRequestArr) {
            graphRequestArr.getClass();
            return executeBatchAsync(oi.y(graphRequestArr));
        }

        public final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
            httpURLConnection.getClass();
            graphRequestBatch.getClass();
            return executeConnectionAsync(null, httpURLConnection, graphRequestBatch);
        }

        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        public final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> collection) {
            collection.getClass();
            return executeBatchAndWait(new GraphRequestBatch(collection));
        }

        public final List<GraphResponse> executeBatchAndWait(GraphRequest... graphRequestArr) {
            graphRequestArr.getClass();
            return executeBatchAndWait(oi.y(graphRequestArr));
        }

        public final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
            httpURLConnection.getClass();
            collection.getClass();
            return executeConnectionAndWait(httpURLConnection, new GraphRequestBatch(collection));
        }

        public final HttpURLConnection toHttpConnection(Collection<GraphRequest> collection) {
            collection.getClass();
            Validate.notEmpty(collection, "requests");
            return toHttpConnection(new GraphRequestBatch(collection));
        }

        public final HttpURLConnection toHttpConnection(GraphRequest... graphRequestArr) {
            graphRequestArr.getClass();
            return toHttpConnection(oi.y(graphRequestArr));
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) {
            file.getClass();
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", open);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        public final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Bitmap bitmap, String str2, Bundle bundle, Callback callback) {
            bitmap.getClass();
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            bundle2.putParcelable("picture", bitmap);
            if (str2 != null && str2.length() > 0) {
                bundle2.putString("caption", str2);
            }
            return new GraphRequest(accessToken, getDefaultPhotoPathIfNull(str), bundle2, HttpMethod.POST, callback, null, 32, null);
        }

        public final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, Callback callback) {
            context.getClass();
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }
    }

    public static final List<GraphResponse> executeBatchAndWait(Collection<GraphRequest> collection) {
        return Companion.executeBatchAndWait(collection);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(Collection<GraphRequest> collection) {
        return Companion.executeBatchAsync(collection);
    }

    public static final List<GraphResponse> executeConnectionAndWait(HttpURLConnection httpURLConnection, Collection<GraphRequest> collection) {
        return Companion.executeConnectionAndWait(httpURLConnection, collection);
    }

    public static final GraphRequestAsyncTask executeConnectionAsync(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) {
        return Companion.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    public static final GraphRequest newCustomAudienceThirdPartyIdRequest(AccessToken accessToken, Context context, String str, Callback callback) {
        return Companion.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    public static final HttpURLConnection toHttpConnection(Collection<GraphRequest> collection) {
        return Companion.toHttpConnection(collection);
    }

    public final GraphResponse executeAndWait() {
        return Companion.executeAndWait(this);
    }

    public static final List<GraphResponse> executeBatchAndWait(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAndWait(graphRequestArr);
    }

    public static final GraphRequestAsyncTask executeBatchAsync(GraphRequest... graphRequestArr) {
        return Companion.executeBatchAsync(graphRequestArr);
    }

    public static final HttpURLConnection toHttpConnection(GraphRequest... graphRequestArr) {
        return Companion.toHttpConnection(graphRequestArr);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, Uri uri, String str2, Bundle bundle, Callback callback) {
        return Companion.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    public static final GraphRequest newUploadPhotoRequest(AccessToken accessToken, String str, File file, String str2, Bundle bundle, Callback callback) {
        return Companion.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    public GraphRequest(AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    public GraphRequest(AccessToken accessToken, String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, Callback callback, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : str2);
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GraphRequest(AccessToken accessToken, URL url) {
        url.getClass();
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = url.toString();
        setHttpMethod(HttpMethod.GET);
        this.parameters = new Bundle();
    }
}
