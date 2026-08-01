package bc;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.onesignal.common.AndroidUtils;
import e3.t;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {
    public static final int GROUPLESS_SUMMARY_ID = -718463522;
    public static final String GROUPLESS_SUMMARY_KEY = "os_group_undefined";
    public static final e INSTANCE = new e();

    private e() {
    }

    public static /* synthetic */ boolean areNotificationsEnabled$default(e eVar, Context context, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        return eVar.areNotificationsEnabled(context, str);
    }

    public final boolean areNotificationsEnabled(Context context, String str) {
        int importance;
        context.getClass();
        try {
            if (!new t(context).f3851b.areNotificationsEnabled()) {
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

    public final void assignGrouplessNotifications(Context context, ArrayList<StatusBarNotification> arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            StatusBarNotification statusBarNotification = arrayList.get(i3);
            i3++;
            StatusBarNotification statusBarNotification2 = statusBarNotification;
            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification2.getNotification());
            recoverBuilder.getClass();
            Notification build = recoverBuilder.setGroup(GROUPLESS_SUMMARY_KEY).setOnlyAlertOnce(true).build();
            build.getClass();
            context.getClass();
            new t(context).a(statusBarNotification2.getId(), build);
        }
    }

    public final com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications(JSONArray jSONArray, sa.a aVar) {
        jSONArray.getClass();
        aVar.getClass();
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        JSONObject jSONObject = null;
        String str = null;
        for (int i3 = 0; i3 < length; i3++) {
            try {
                jSONObject = jSONArray.getJSONObject(i3);
                if (str == null && jSONObject.has("actionId")) {
                    str = jSONObject.optString("actionId", null);
                }
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new com.onesignal.notifications.internal.c(jSONObject, aVar));
                }
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error parsing JSON item " + i3 + '/' + length + " for callback.", th);
            }
        }
        jSONObject.getClass();
        com.onesignal.notifications.internal.c cVar = new com.onesignal.notifications.internal.c(arrayList, jSONObject, optInt, aVar);
        return new com.onesignal.notifications.internal.d(cVar, new com.onesignal.notifications.internal.e(str, cVar.getLaunchURL()));
    }

    public final ArrayList<StatusBarNotification> getActiveGrouplessNotifications(Context context) {
        context.getClass();
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean isGroupSummary = isGroupSummary(statusBarNotification);
            boolean z10 = notification.getGroup() == null || Intrinsics.a(notification.getGroup(), GROUPLESS_SUMMARY_KEY);
            if (!isGroupSummary && z10) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final StatusBarNotification[] getActiveNotifications(Context context) {
        context.getClass();
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            StatusBarNotification[] activeNotifications = getNotificationManager(context).getActiveNotifications();
            activeNotifications.getClass();
            return activeNotifications;
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public final String getCampaignNameFromNotification(qb.f fVar) {
        String templateId;
        fVar.getClass();
        String templateName = fVar.getTemplateName();
        if ((templateName == null || templateName.length() != 0) && ((templateId = fVar.getTemplateId()) == null || templateId.length() != 0)) {
            return fVar.getTemplateName() + " - " + fVar.getTemplateId();
        }
        if (fVar.getTitle() == null) {
            return "";
        }
        String title = fVar.getTitle();
        title.getClass();
        String title2 = fVar.getTitle();
        title2.getClass();
        return title.substring(0, Math.min(10, title2.length()));
    }

    public final JSONObject getCustomJSONObject(JSONObject jSONObject) {
        jSONObject.getClass();
        return new JSONObject(jSONObject.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
    }

    public final int getGrouplessNotifsCount(Context context) {
        context.getClass();
        int i3 = 0;
        for (StatusBarNotification statusBarNotification : getActiveNotifications(context)) {
            if ((statusBarNotification.getNotification().flags & 512) == 0 && GROUPLESS_SUMMARY_KEY.equals(statusBarNotification.getNotification().getGroup())) {
                i3++;
            }
        }
        return i3;
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
        context.getClass();
        Object systemService = context.getSystemService("notification");
        systemService.getClass();
        return (NotificationManager) systemService;
    }

    public final Uri getSoundUri(Context context, String str) {
        int identifier;
        context.getClass();
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

    public final boolean isGroupSummary(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }

    public final long[] parseVibrationPattern(JSONObject jSONObject) {
        JSONArray jSONArray;
        jSONObject.getClass();
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                opt.getClass();
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            int length = jSONArray.length();
            for (int i3 = 0; i3 < length; i3++) {
                jArr[i3] = jSONArray.optLong(i3);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }
}
