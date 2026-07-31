package com.onesignal.notifications.internal.display.impl;

import F5.q;
import Q2.e;
import T1.f;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import t.j;
import t.m;
import t.n;
import t.p;

/* loaded from: classes.dex */
public final class b implements S2.a {
    private final f _applicationService;
    private final O2.a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    public static final class a {
        private p compatBuilder;
        private boolean hasLargeIcon;

        public final p getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(p pVar) {
            this.compatBuilder = pVar;
        }

        public final void setHasLargeIcon(boolean z5) {
            this.hasLargeIcon = z5;
        }
    }

    public b(f _applicationService, O2.a _notificationChannelManager) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationChannelManager, "_notificationChannelManager");
        this._applicationService = _applicationService;
        this._notificationChannelManager = _notificationChannelManager;
        this.notificationDismissedClass = NotificationDismissReceiver.class;
    }

    private final void addAlertButtons(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            addCustomAlertButtons(jSONObject, list, list2);
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.error("Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(context, "onesignal_in_app_alert_ok_button_text", "Ok");
            i.b(resourceString);
            list.add(resourceString);
            list2.add(N2.a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(Q2.c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(N2.a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(N2.a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i7);
                    String optString = jSONObject4.optString("text");
                    i.d(optString, "optString(...)");
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    i.d(optString2, "optString(...)");
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i7) {
        return Q2.f.INSTANCE.toAndroidPriority(i7);
    }

    private final BigInteger getAccentColor(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String resourceString = AndroidUtils.INSTANCE.getResourceString(this._applicationService.getAppContext(), "onesignal_notification_accent_color", null);
            if (resourceString != null) {
                return new BigInteger(resourceString, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(this._applicationService.getAppContext(), "com.onesignal.NotificationAccentColor.DEFAULT");
            if (manifestMeta != null) {
                return new BigInteger(manifestMeta, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmap(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean z6 = i.g(str.charAt(!z5 ? i7 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length--;
            } else if (z6) {
                i7++;
            } else {
                z5 = true;
            }
        }
        String obj = str.subSequence(i7, length + 1).toString();
        return (q.I(obj, "http://") || q.I(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            i.b(currentContext);
            bitmap = BitmapFactory.decodeStream(currentContext.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    i.b(currentContext2);
                    bitmap = BitmapFactory.decodeStream(currentContext2.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int resourceIcon = getResourceIcon(str);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String str) {
        Resources contextResources = getContextResources();
        i.b(contextResources);
        return contextResources.getIdentifier(str, "drawable", getPackageName());
    }

    private final Bitmap getLargeIcon(JSONObject jSONObject) {
        Bitmap bitmap = getBitmap(jSONObject.optString("licon"));
        if (bitmap == null) {
            bitmap = getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default");
        }
        if (bitmap == null) {
            return null;
        }
        return resizeBitmapForLargeIconArea(bitmap);
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length() - 1;
        int i7 = 0;
        boolean z5 = false;
        while (i7 <= length) {
            boolean z6 = i.g(str.charAt(!z5 ? i7 : length), 32) <= 0;
            if (z5) {
                if (!z6) {
                    break;
                }
                length--;
            } else if (z6) {
                i7++;
            } else {
                z5 = true;
            }
        }
        String obj = str.subSequence(i7, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(obj)) {
            return 0;
        }
        int drawableId = getDrawableId(obj);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final int getSmallIconId(JSONObject jSONObject) {
        int resourceIcon = getResourceIcon(jSONObject.optString("sicon", null));
        return resourceIcon != 0 ? resourceIcon : getDefaultSmallIconId();
    }

    private final boolean isSoundEnabled(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", null);
        return ("null".equals(optString) || "nil".equals(optString)) ? false : true;
    }

    private final Bitmap resizeBitmapForLargeIconArea(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Resources contextResources = getContextResources();
            i.b(contextResources);
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            i.b(contextResources2);
            int dimension2 = (int) contextResources2.getDimension(R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private final void setAlertnessOptions(JSONObject jSONObject, p pVar) {
        int convertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        pVar.f5926j = convertOSToAndroidPriority;
        if (convertOSToAndroidPriority < 0) {
            return;
        }
        int i7 = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = pVar.f5938v;
                notification.ledARGB = intValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i7 = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (parseVibrationPattern != null) {
                    pVar.f5938v.vibrate = parseVibrationPattern;
                }
            } else {
                i7 |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            i.b(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                pVar.f(soundUri);
            } else {
                i7 |= 1;
            }
        }
        pVar.c(i7);
    }

    @Override // S2.a
    public void addNotificationActionButtons(JSONObject fcmJson, com.onesignal.notifications.internal.display.impl.a intentGenerator, p pVar, int i7, String str) {
        int i8;
        i.e(fcmJson, "fcmJson");
        i.e(intentGenerator, "intentGenerator");
        try {
            JSONObject jSONObject = new JSONObject(fcmJson.optString(Q2.c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject.has(N2.a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(N2.a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject2.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                        JSONObject jSONObject3 = new JSONObject(fcmJson.toString());
                        Intent newBaseIntent = intentGenerator.getNewBaseIntent(i7);
                        newBaseIntent.setAction("" + i9);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject3.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject3.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (fcmJson.has("grp")) {
                            newBaseIntent.putExtra("grp", fcmJson.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(i7, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i8 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            i8 = 0;
                        }
                        i.b(pVar);
                        pVar.f5918b.add(new j(i8, optJSONObject.optString("text"), newActionPendingIntent));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // S2.a
    public void addXiaomiSettings(a aVar, Notification notification) {
        i.e(notification, "notification");
        i.b(aVar);
        if (aVar.getHasLargeIcon()) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // S2.a
    public a getBaseOneSignalNotificationBuilder(Q2.d notificationJob) {
        int i7;
        i.e(notificationJob, "notificationJob");
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        i.b(jsonPayload);
        a aVar = new a();
        p pVar = new p(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(notificationJob));
        String optString = jsonPayload.optString("alert", null);
        pVar.d(16, true);
        pVar.f5938v.icon = getSmallIconId(jsonPayload);
        n nVar = new n(0);
        nVar.f5916f = p.b(optString);
        pVar.g(nVar);
        pVar.f5922f = p.b(optString);
        pVar.f5938v.tickerText = p.b(optString);
        if (!i.a(jsonPayload.optString("title"), "")) {
            pVar.f5921e = p.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                pVar.f5933q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String optString2 = jsonPayload.optString("vis");
                i.d(optString2, "optString(...)");
                i7 = Integer.parseInt(optString2);
            } else {
                i7 = 1;
            }
            pVar.f5934r = i7;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            pVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            m mVar = new m();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f3408b = bitmap;
            mVar.f5912e = iconCompat;
            mVar.f5942c = p.b(optString);
            mVar.f5943d = true;
            pVar.g(mVar);
        }
        if (notificationJob.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = notificationJob.getShownTimeStamp();
                i.b(shownTimeStamp);
                pVar.f5938v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, pVar);
        aVar.setCompatBuilder(pVar);
        return aVar;
    }

    @Override // S2.a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // S2.a
    public int getDefaultSmallIconId() {
        int drawableId = getDrawableId("ic_stat_onesignal_default");
        if (drawableId != 0) {
            return drawableId;
        }
        int drawableId2 = getDrawableId("corona_statusbar_icon_default");
        if (drawableId2 != 0) {
            return drawableId2;
        }
        int drawableId3 = getDrawableId("ic_os_notification_fallback_white_24dp");
        return drawableId3 != 0 ? drawableId3 : R.drawable.ic_popup_reminder;
    }

    @Override // S2.a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // S2.a
    public Intent getNewBaseDismissIntent(int i7) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i7).putExtra("dismissed", true);
        i.d(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // S2.a
    public PendingIntent getNewDismissActionPendingIntent(int i7, Intent intent) {
        i.e(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i7, intent, 201326592);
        i.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    @Override // S2.a
    public CharSequence getTitle(JSONObject fcmJson) {
        i.e(fcmJson, "fcmJson");
        String optString = fcmJson.optString("title", null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        i.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        i.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        i.d(applicationLabel, "getApplicationLabel(...)");
        return applicationLabel;
    }

    @Override // S2.a
    public void removeNotifyOptions(p pVar) {
        i.b(pVar);
        pVar.d(8, true);
        pVar.c(0);
        pVar.f(null);
        Notification notification = pVar.f5938v;
        notification.vibrate = null;
        notification.tickerText = p.b(null);
    }
}
