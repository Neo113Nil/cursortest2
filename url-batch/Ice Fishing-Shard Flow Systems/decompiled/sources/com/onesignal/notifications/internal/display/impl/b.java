package com.onesignal.notifications.internal.display.impl;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.json.JSONArray;
import org.json.JSONObject;
import p3.C0827a;
import q3.InterfaceC0834a;
import s3.e;
import u3.InterfaceC0945a;
import v2.f;
import y.h;
import y.j;
import y.k;
import y.l;

/* loaded from: classes.dex */
public final class b implements InterfaceC0945a {
    private final f _applicationService;
    private final InterfaceC0834a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    public static final class a {
        private l compatBuilder;
        private boolean hasLargeIcon;

        public final l getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(l lVar) {
            this.compatBuilder = lVar;
        }

        public final void setHasLargeIcon(boolean z7) {
            this.hasLargeIcon = z7;
        }
    }

    public b(f _applicationService, InterfaceC0834a _notificationChannelManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationChannelManager, "_notificationChannelManager");
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
            Intrinsics.b(resourceString);
            list.add(resourceString);
            list2.add(C0827a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(s3.c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(C0827a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(C0827a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i2);
                    String optString = jSONObject4.optString("text");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i2) {
        return s3.f.INSTANCE.toAndroidPriority(i2);
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
        int i2 = 0;
        boolean z7 = false;
        while (i2 <= length) {
            boolean z8 = Intrinsics.d(str.charAt(!z7 ? i2 : length), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                }
                length--;
            } else if (z8) {
                i2++;
            } else {
                z7 = true;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
        return (p.l(obj, "http://") || p.l(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            Intrinsics.b(currentContext);
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
                    Intrinsics.b(currentContext2);
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
        Intrinsics.b(contextResources);
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
        int i2 = 0;
        boolean z7 = false;
        while (i2 <= length) {
            boolean z8 = Intrinsics.d(str.charAt(!z7 ? i2 : length), 32) <= 0;
            if (z7) {
                if (!z8) {
                    break;
                }
                length--;
            } else if (z8) {
                i2++;
            } else {
                z7 = true;
            }
        }
        String obj = str.subSequence(i2, length + 1).toString();
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
            Intrinsics.b(contextResources);
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            Intrinsics.b(contextResources2);
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

    private final void setAlertnessOptions(JSONObject jSONObject, l lVar) {
        int convertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        lVar.j = convertOSToAndroidPriority;
        if (convertOSToAndroidPriority < 0) {
            return;
        }
        int i2 = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = lVar.f8495v;
                notification.ledARGB = intValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i2 = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (parseVibrationPattern != null) {
                    lVar.f8495v.vibrate = parseVibrationPattern;
                }
            } else {
                i2 |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            Intrinsics.b(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                lVar.f(soundUri);
            } else {
                i2 |= 1;
            }
        }
        lVar.c(i2);
    }

    @Override // u3.InterfaceC0945a
    public void addNotificationActionButtons(JSONObject fcmJson, com.onesignal.notifications.internal.display.impl.a intentGenerator, l lVar, int i2, String str) {
        int i5;
        Intrinsics.checkNotNullParameter(fcmJson, "fcmJson");
        Intrinsics.checkNotNullParameter(intentGenerator, "intentGenerator");
        try {
            JSONObject jSONObject = new JSONObject(fcmJson.optString(s3.c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject.has(C0827a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(C0827a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject2.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                        JSONObject jSONObject3 = new JSONObject(fcmJson.toString());
                        Intent newBaseIntent = intentGenerator.getNewBaseIntent(i2);
                        newBaseIntent.setAction("" + i7);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject3.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject3.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (fcmJson.has("grp")) {
                            newBaseIntent.putExtra("grp", fcmJson.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(i2, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i5 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            i5 = 0;
                        }
                        Intrinsics.b(lVar);
                        lVar.f8476b.add(new h(i5, optJSONObject.optString("text"), newActionPendingIntent));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // u3.InterfaceC0945a
    public void addXiaomiSettings(a aVar, Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.b(aVar);
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

    @Override // u3.InterfaceC0945a
    public a getBaseOneSignalNotificationBuilder(s3.d notificationJob) {
        int i2;
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        Intrinsics.b(jsonPayload);
        a aVar = new a();
        l lVar = new l(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(notificationJob));
        String optString = jsonPayload.optString("alert", null);
        lVar.d(16, true);
        lVar.f8495v.icon = getSmallIconId(jsonPayload);
        k kVar = new k(0);
        kVar.f8474f = l.b(optString);
        lVar.g(kVar);
        lVar.f8480f = l.b(optString);
        lVar.f8495v.tickerText = l.b(optString);
        if (!Intrinsics.a(jsonPayload.optString("title"), "")) {
            lVar.f8479e = l.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                lVar.f8490q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String optString2 = jsonPayload.optString("vis");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                i2 = Integer.parseInt(optString2);
            } else {
                i2 = 1;
            }
            lVar.f8491r = i2;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            lVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            j jVar = new j();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f3369b = bitmap;
            jVar.f8470e = iconCompat;
            jVar.f8499c = l.b(optString);
            jVar.f8500d = true;
            lVar.g(jVar);
        }
        if (notificationJob.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = notificationJob.getShownTimeStamp();
                Intrinsics.b(shownTimeStamp);
                lVar.f8495v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, lVar);
        aVar.setCompatBuilder(lVar);
        return aVar;
    }

    @Override // u3.InterfaceC0945a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // u3.InterfaceC0945a
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

    @Override // u3.InterfaceC0945a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // u3.InterfaceC0945a
    public Intent getNewBaseDismissIntent(int i2) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i2).putExtra("dismissed", true);
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // u3.InterfaceC0945a
    public PendingIntent getNewDismissActionPendingIntent(int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i2, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    @Override // u3.InterfaceC0945a
    public CharSequence getTitle(JSONObject fcmJson) {
        Intrinsics.checkNotNullParameter(fcmJson, "fcmJson");
        String optString = fcmJson.optString("title", null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        Intrinsics.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        Intrinsics.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        Intrinsics.checkNotNullExpressionValue(applicationLabel, "getApplicationLabel(...)");
        return applicationLabel;
    }

    @Override // u3.InterfaceC0945a
    public void removeNotifyOptions(l lVar) {
        Intrinsics.b(lVar);
        lVar.d(8, true);
        lVar.c(0);
        lVar.f(null);
        Notification notification = lVar.f8495v;
        notification.vibrate = null;
        notification.tickerText = l.b(null);
    }
}
