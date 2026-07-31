package Q2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import g2.InterfaceC0391a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.AbstractC0634A;
import t.C0639F;

/* loaded from: classes.dex */
public final class e {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final e INSTANCE = new e();

    private e() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(e eVar, Context context, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        return eVar.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        int importance;
        kotlin.jvm.internal.i.e(context, "context");
        try {
            if (!AbstractC0634A.a(new C0639F(context).f5902b)) {
                return false;
            }
            if (str == null || Build.VERSION.SDK_INT < 26) {
                return true;
            }
            NotificationManager notificationManager = getNotificationManager(context);
            NotificationChannel notificationChannel = notificationManager != null ? notificationManager.getNotificationChannel(str) : null;
            if (notificationChannel == null) {
                return true;
            }
            importance = notificationChannel.getImportance();
            return importance != 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> grouplessNotifs) {
        kotlin.jvm.internal.i.e(grouplessNotifs, "grouplessNotifs");
        int size = grouplessNotifs.size();
        int i7 = 0;
        while (i7 < size) {
            StatusBarNotification statusBarNotification = grouplessNotifs.get(i7);
            i7++;
            StatusBarNotification statusBarNotification2 = statusBarNotification;
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification2.getNotification());
            kotlin.jvm.internal.i.d(recoverBuilder, "recoverBuilder(...)");
            Notification build = recoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            kotlin.jvm.internal.i.d(build, "build(...)");
            kotlin.jvm.internal.i.b(context);
            new C0639F(context).a(statusBarNotification2.getId(), build);
        }
    }

    public final com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jsonArray, InterfaceC0391a time) {
        kotlin.jvm.internal.i.e(jsonArray, "jsonArray");
        kotlin.jvm.internal.i.e(time, "time");
        int length = jsonArray.length();
        int optInt = jsonArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z5 = true;
        JSONObject jSONObject = null;
        String str = null;
        for (int i7 = 0; i7 < length; i7++) {
            try {
                jSONObject = jsonArray.getJSONObject(i7);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", null);
                }
                if (z5) {
                    z5 = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.c(jSONObject, time));
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error parsing JSON item " + i7 + '/' + length + " for callback.", th);
            }
        }
        kotlin.jvm.internal.i.b(jSONObject);
        com.onesignal.notifications.internal.c cVar = new com.onesignal.notifications.internal.c(arrayList, jSONObject, optInt, time);
        return new com.onesignal.notifications.internal.d(cVar, new com.onesignal.notifications.internal.e(str, cVar.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean isGroupSummary = isGroupSummary(statusBarNotification);
            boolean z5 = notification.getGroup() == null || kotlin.jvm.internal.i.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!isGroupSummary && z5) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            kotlin.jvm.internal.i.d(activeNotifications, "getActiveNotifications(...)");
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(F2.f notification) {
        String templateId;
        kotlin.jvm.internal.i.e(notification, "notification");
        String templateName = notification.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = notification.getTemplateId()) == null || templateId.length() != 0)) {
            return notification.getTemplateName() + " - " + notification.getTemplateId();
        }
        if (notification.getTitle() == null) {
            return "";
        }
        String title = notification.getTitle();
        kotlin.jvm.internal.i.b(title);
        String title2 = notification.getTitle();
        kotlin.jvm.internal.i.b(title2);
        String substring = title.substring(0, Math.min(10, title2.length()));
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final JSONObject getCustomJSONObject(JSONObject jsonObject) {
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        return new JSONObject(jsonObject.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        int i7 = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i7++;
            }
        }
        return i7;
    }

    public final String getNotificationIdFromFCMJson(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString(c.PAYLOAD_OS_ROOT_CUSTOM));
        } catch (JSONException unused) {
            com.onesignal.debug.internal.logging.b.debug$default("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.", null, 2, null);
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        com.onesignal.debug.internal.logging.b.debug$default("Not a OneSignal formatted FCM message. No 'i' field in custom.", null, 2, null);
        return null;
    }

    public final NotificationManager getNotificationManager(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        kotlin.jvm.internal.i.e(context, "context");
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (AndroidUtils.INSTANCE.isValidResourceName(str) && (identifier = resources.getIdentifier(str, "raw", packageName)) != 0) {
            return Uri.parse("android.resource://" + packageName + '/' + identifier);
        }
        int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
        if (identifier2 == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + packageName + '/' + identifier2);
    }

    public final boolean isGroupSummary(StatusBarNotification notif) {
        kotlin.jvm.internal.i.e(notif, "notif");
        return (notif.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject fcmBundle) {
        JSONArray jSONArray;
        kotlin.jvm.internal.i.e(fcmBundle, "fcmBundle");
        try {
            Object opt = fcmBundle.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                kotlin.jvm.internal.i.c(opt, "null cannot be cast to non-null type org.json.JSONArray");
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                jArr[i7] = jSONArray.optLong(i7);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
