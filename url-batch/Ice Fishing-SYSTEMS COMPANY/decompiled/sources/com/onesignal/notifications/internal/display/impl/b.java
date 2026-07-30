package com.onesignal.notifications.internal.display.impl;

import D.C0296p;
import D.C0298s;
import D.t;
import D.v;
import M7.q;
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
import com.anythink.basead.exoplayer.k.o;
import com.anythink.expressad.foundation.h.k;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.h;
import m5.C4782a;
import n5.InterfaceC4813a;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.e;
import r5.InterfaceC4965a;
import t4.f;

/* loaded from: classes2.dex */
public final class b implements InterfaceC4965a {
    private final f _applicationService;
    private final InterfaceC4813a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    public static final class a {
        private v compatBuilder;
        private boolean hasLargeIcon;

        public final v getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(v vVar) {
            this.compatBuilder = vVar;
        }

        public final void setHasLargeIcon(boolean z8) {
            this.hasLargeIcon = z8;
        }
    }

    public b(f _applicationService, InterfaceC4813a _notificationChannelManager) {
        h.e(_applicationService, "_applicationService");
        h.e(_notificationChannelManager, "_notificationChannelManager");
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
            h.b(resourceString);
            list.add(resourceString);
            list2.add(C4782a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
        if (jSONObject2.has("a")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject4.optString(o.f8603c);
                    h.d(optString, "optString(...)");
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    h.d(optString2, "optString(...)");
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i) {
        return p5.f.INSTANCE.toAndroidPriority(i);
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
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean z9 = h.f(str.charAt(!z8 ? i : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                }
                length--;
            } else if (z9) {
                i++;
            } else {
                z8 = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
        return (q.I(obj, "http://") || q.I(obj, "https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            h.b(currentContext);
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
                    h.b(currentContext2);
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
        h.b(contextResources);
        return contextResources.getIdentifier(str, k.f19790c, getPackageName());
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
        int i = 0;
        boolean z8 = false;
        while (i <= length) {
            boolean z9 = h.f(str.charAt(!z8 ? i : length), 32) <= 0;
            if (z8) {
                if (!z9) {
                    break;
                }
                length--;
            } else if (z9) {
                i++;
            } else {
                z8 = true;
            }
        }
        String obj = str.subSequence(i, length + 1).toString();
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
            h.b(contextResources);
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            h.b(contextResources2);
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

    private final void setAlertnessOptions(JSONObject jSONObject, v vVar) {
        int convertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        vVar.f557j = convertOSToAndroidPriority;
        if (convertOSToAndroidPriority < 0) {
            return;
        }
        int i = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = vVar.f569v;
                notification.ledARGB = intValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (parseVibrationPattern != null) {
                    vVar.f569v.vibrate = parseVibrationPattern;
                }
            } else {
                i |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            h.b(currentContext);
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                vVar.f(soundUri);
            } else {
                i |= 1;
            }
        }
        vVar.c(i);
    }

    @Override // r5.InterfaceC4965a
    public void addNotificationActionButtons(JSONObject fcmJson, com.onesignal.notifications.internal.display.impl.a intentGenerator, v vVar, int i, String str) {
        int i4;
        h.e(fcmJson, "fcmJson");
        h.e(intentGenerator, "intentGenerator");
        try {
            JSONObject jSONObject = new JSONObject(fcmJson.optString("custom"));
            if (jSONObject.has("a")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("a");
                if (jSONObject2.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                        JSONObject jSONObject3 = new JSONObject(fcmJson.toString());
                        Intent newBaseIntent = intentGenerator.getNewBaseIntent(i);
                        newBaseIntent.setAction("" + i9);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject3.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject3.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (fcmJson.has("grp")) {
                            newBaseIntent.putExtra("grp", fcmJson.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(i, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i4 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            i4 = 0;
                        }
                        h.b(vVar);
                        vVar.f550b.add(new C0296p(i4, newActionPendingIntent, optJSONObject.optString(o.f8603c)));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // r5.InterfaceC4965a
    public void addXiaomiSettings(a aVar, Notification notification) {
        h.e(notification, "notification");
        h.b(aVar);
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

    @Override // r5.InterfaceC4965a
    public a getBaseOneSignalNotificationBuilder(p5.d notificationJob) {
        int i;
        h.e(notificationJob, "notificationJob");
        JSONObject jsonPayload = notificationJob.getJsonPayload();
        h.b(jsonPayload);
        a aVar = new a();
        v vVar = new v(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(notificationJob));
        String optString = jsonPayload.optString("alert", null);
        vVar.d(16, true);
        vVar.f569v.icon = getSmallIconId(jsonPayload);
        t tVar = new t(0);
        tVar.f548f = v.b(optString);
        vVar.g(tVar);
        vVar.f554f = v.b(optString);
        vVar.f569v.tickerText = v.b(optString);
        if (!h.a(jsonPayload.optString("title"), "")) {
            vVar.f553e = v.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                vVar.f564q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String optString2 = jsonPayload.optString("vis");
                h.d(optString2, "optString(...)");
                i = Integer.parseInt(optString2);
            } else {
                i = 1;
            }
            vVar.f565r = i;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            vVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            C0298s c0298s = new C0298s();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f4805b = bitmap;
            c0298s.f544e = iconCompat;
            c0298s.f573c = v.b(optString);
            c0298s.f574d = true;
            vVar.g(c0298s);
        }
        if (notificationJob.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = notificationJob.getShownTimeStamp();
                h.b(shownTimeStamp);
                vVar.f569v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, vVar);
        aVar.setCompatBuilder(vVar);
        return aVar;
    }

    @Override // r5.InterfaceC4965a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // r5.InterfaceC4965a
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

    @Override // r5.InterfaceC4965a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // r5.InterfaceC4965a
    public Intent getNewBaseDismissIntent(int i) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i).putExtra("dismissed", true);
        h.d(putExtra, "putExtra(...)");
        return putExtra;
    }

    @Override // r5.InterfaceC4965a
    public PendingIntent getNewDismissActionPendingIntent(int i, Intent intent) {
        h.e(intent, "intent");
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i, intent, 201326592);
        h.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    @Override // r5.InterfaceC4965a
    public CharSequence getTitle(JSONObject fcmJson) {
        h.e(fcmJson, "fcmJson");
        String optString = fcmJson.optString("title", null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        h.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        h.b(currentContext2);
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        h.d(applicationLabel, "getApplicationLabel(...)");
        return applicationLabel;
    }

    @Override // r5.InterfaceC4965a
    public void removeNotifyOptions(v vVar) {
        h.b(vVar);
        vVar.d(8, true);
        vVar.c(0);
        vVar.f(null);
        Notification notification = vVar.f569v;
        notification.vibrate = null;
        notification.tickerText = v.b(null);
    }
}
