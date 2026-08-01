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
import bc.e;
import com.onesignal.common.AndroidUtils;
import com.onesignal.notifications.receivers.NotificationDismissReceiver;
import e3.g;
import ea.f;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements dc.a {
    private final f _applicationService;
    private final zb.a _notificationChannelManager;
    private final Class<?> notificationDismissedClass;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        private g compatBuilder;
        private boolean hasLargeIcon;

        public final g getCompatBuilder() {
            return this.compatBuilder;
        }

        public final boolean getHasLargeIcon() {
            return this.hasLargeIcon;
        }

        public final void setCompatBuilder(g gVar) {
            this.compatBuilder = gVar;
        }

        public final void setHasLargeIcon(boolean z10) {
            this.hasLargeIcon = z10;
        }
    }

    public b(f fVar, zb.a aVar) {
        fVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._notificationChannelManager = aVar;
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
            resourceString.getClass();
            list.add(resourceString);
            list2.add(yb.a.DEFAULT_ACTION);
        }
    }

    private final void addCustomAlertButtons(JSONObject jSONObject, List<String> list, List<String> list2) {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(bc.c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject2.has(yb.a.PUSH_ADDITIONAL_DATA_KEY)) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject(yb.a.PUSH_ADDITIONAL_DATA_KEY);
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                int length = optJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i3);
                    String optString = jSONObject4.optString("text");
                    optString.getClass();
                    list.add(optString);
                    String optString2 = jSONObject4.optString("id");
                    optString2.getClass();
                    list2.add(optString2);
                }
            }
        }
    }

    private final int convertOSToAndroidPriority(int i3) {
        if (i3 > 9) {
            return 2;
        }
        if (i3 > 7) {
            return 1;
        }
        if (i3 > 4) {
            return 0;
        }
        return i3 > 2 ? -1 : -2;
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
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean z11 = Intrinsics.b(str.charAt(!z10 ? i3 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i3++;
            } else {
                z10 = true;
            }
        }
        String obj = str.subSequence(i3, length + 1).toString();
        return (o.h(obj, "http://") || obj.startsWith("https://")) ? getBitmapFromURL(obj) : getBitmapFromAssetsOrResourceName(str);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String str) {
        Bitmap bitmap;
        try {
            Context currentContext = getCurrentContext();
            currentContext.getClass();
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
                    currentContext2.getClass();
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
        contextResources.getClass();
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
        int i3 = 0;
        boolean z10 = false;
        while (i3 <= length) {
            boolean z11 = Intrinsics.b(str.charAt(!z10 ? i3 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i3++;
            } else {
                z10 = true;
            }
        }
        String obj = str.subSequence(i3, length + 1).toString();
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
            contextResources.getClass();
            int dimension = (int) contextResources.getDimension(R.dimen.notification_large_icon_height);
            Resources contextResources2 = getContextResources();
            contextResources2.getClass();
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

    private final void setAlertnessOptions(JSONObject jSONObject, g gVar) {
        int convertOSToAndroidPriority = convertOSToAndroidPriority(jSONObject.optInt("pri", 6));
        gVar.j = convertOSToAndroidPriority;
        if (convertOSToAndroidPriority < 0) {
            return;
        }
        int i3 = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                Notification notification = gVar.f3821v;
                notification.ledARGB = intValue;
                notification.ledOnMS = 2000;
                notification.ledOffMS = 5000;
                notification.flags = (notification.flags & (-2)) | 1;
                i3 = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] parseVibrationPattern = e.INSTANCE.parseVibrationPattern(jSONObject);
                if (parseVibrationPattern != null) {
                    gVar.f3821v.vibrate = parseVibrationPattern;
                }
            } else {
                i3 |= 2;
            }
        }
        if (isSoundEnabled(jSONObject)) {
            e eVar = e.INSTANCE;
            Context currentContext = getCurrentContext();
            currentContext.getClass();
            Uri soundUri = eVar.getSoundUri(currentContext, jSONObject.optString("sound", null));
            if (soundUri != null) {
                gVar.f(soundUri);
            } else {
                i3 |= 1;
            }
        }
        gVar.c(i3);
    }

    @Override // dc.a
    public void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, g gVar, int i3, String str) {
        int i10;
        jSONObject.getClass();
        aVar.getClass();
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString(bc.c.PAYLOAD_OS_ROOT_CUSTOM));
            if (jSONObject2.has(yb.a.PUSH_ADDITIONAL_DATA_KEY)) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(yb.a.PUSH_ADDITIONAL_DATA_KEY);
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent newBaseIntent = aVar.getNewBaseIntent(i3);
                        newBaseIntent.setAction("" + i11);
                        newBaseIntent.putExtra("action_button", true);
                        jSONObject4.put("actionId", optJSONObject.optString("id"));
                        newBaseIntent.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            newBaseIntent.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            newBaseIntent.putExtra("grp", jSONObject.optString("grp"));
                        }
                        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(i3, newBaseIntent);
                        if (optJSONObject.has("icon")) {
                            try {
                                i10 = getResourceIcon(optJSONObject.optString("icon"));
                            } catch (Throwable th) {
                                th = th;
                                th.printStackTrace();
                                return;
                            }
                        } else {
                            i10 = 0;
                        }
                        gVar.getClass();
                        gVar.f3803b.add(new e3.c(i10, optJSONObject.optString("text"), newActionPendingIntent));
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // dc.a
    public void addXiaomiSettings(a aVar, Notification notification) {
        notification.getClass();
        aVar.getClass();
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

    @Override // dc.a
    public a getBaseOneSignalNotificationBuilder(bc.d dVar) {
        int i3;
        dVar.getClass();
        JSONObject jsonPayload = dVar.getJsonPayload();
        jsonPayload.getClass();
        a aVar = new a();
        g gVar = new g(getCurrentContext(), this._notificationChannelManager.createNotificationChannel(dVar));
        String optString = jsonPayload.optString("alert", null);
        gVar.d(16, true);
        gVar.f3821v.icon = getSmallIconId(jsonPayload);
        e3.f fVar = new e3.f(0);
        fVar.f3801f = g.b(optString);
        gVar.g(fVar);
        gVar.f3807f = g.b(optString);
        gVar.f3821v.tickerText = g.b(optString);
        if (!Intrinsics.a(jsonPayload.optString("title"), "")) {
            gVar.f3806e = g.b(getTitle(jsonPayload));
        }
        try {
            BigInteger accentColor = getAccentColor(jsonPayload);
            if (accentColor != null) {
                gVar.f3816q = accentColor.intValue();
            }
        } catch (Throwable unused) {
        }
        try {
            if (jsonPayload.has("vis")) {
                String optString2 = jsonPayload.optString("vis");
                optString2.getClass();
                i3 = Integer.parseInt(optString2);
            } else {
                i3 = 1;
            }
            gVar.f3817r = i3;
        } catch (Throwable unused2) {
        }
        Bitmap largeIcon = getLargeIcon(jsonPayload);
        if (largeIcon != null) {
            aVar.setHasLargeIcon(true);
            gVar.e(largeIcon);
        }
        Bitmap bitmap = getBitmap(jsonPayload.optString("bicon", null));
        if (bitmap != null) {
            e3.e eVar = new e3.e();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f478b = bitmap;
            eVar.f3798e = iconCompat;
            eVar.f3825c = g.b(optString);
            eVar.f3826d = true;
            gVar.g(eVar);
        }
        if (dVar.getShownTimeStamp() != null) {
            try {
                Long shownTimeStamp = dVar.getShownTimeStamp();
                shownTimeStamp.getClass();
                gVar.f3821v.when = shownTimeStamp.longValue() * 1000;
            } catch (Throwable unused3) {
            }
        }
        setAlertnessOptions(jsonPayload, gVar);
        aVar.setCompatBuilder(gVar);
        return aVar;
    }

    @Override // dc.a
    public Bitmap getDefaultLargeIcon() {
        return resizeBitmapForLargeIconArea(getBitmapFromAssetsOrResourceName("ic_onesignal_large_icon_default"));
    }

    @Override // dc.a
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

    @Override // dc.a
    public int getGroupAlertBehavior() {
        return 2;
    }

    @Override // dc.a
    public Intent getNewBaseDismissIntent(int i3) {
        Intent putExtra = new Intent(getCurrentContext(), this.notificationDismissedClass).putExtra("androidNotificationId", i3).putExtra("dismissed", true);
        putExtra.getClass();
        return putExtra;
    }

    @Override // dc.a
    public PendingIntent getNewDismissActionPendingIntent(int i3, Intent intent) {
        intent.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(getCurrentContext(), i3, intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    @Override // dc.a
    public CharSequence getTitle(JSONObject jSONObject) {
        jSONObject.getClass();
        String optString = jSONObject.optString("title", null);
        if (optString != null) {
            return optString;
        }
        Context currentContext = getCurrentContext();
        currentContext.getClass();
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = getCurrentContext();
        currentContext2.getClass();
        CharSequence applicationLabel = packageManager.getApplicationLabel(currentContext2.getApplicationInfo());
        applicationLabel.getClass();
        return applicationLabel;
    }

    @Override // dc.a
    public void removeNotifyOptions(g gVar) {
        gVar.getClass();
        gVar.d(8, true);
        gVar.c(0);
        gVar.f(null);
        Notification notification = gVar.f3821v;
        notification.vibrate = null;
        notification.tickerText = g.b(null);
    }
}
