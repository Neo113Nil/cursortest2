package K2;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.DefaultBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {
    private static final List<Class<? extends a>> BADGERS;
    private static final String LOG_TAG = "ShortcutBadger";
    private static final int SUPPORTED_CHECK_ATTEMPTS = 3;
    private static ComponentName sComponentName;
    private static final Object sCounterSupportedLock;
    private static volatile Boolean sIsBadgeCounterSupported;
    private static a sShortcutBadger;

    static {
        LinkedList linkedList = new LinkedList();
        BADGERS = linkedList;
        sCounterSupportedLock = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    private c() {
    }

    public static boolean applyCount(Context context, int i7) {
        try {
            applyCountOrThrow(context, i7);
            return true;
        } catch (b e4) {
            if (!Log.isLoggable(LOG_TAG, SUPPORTED_CHECK_ATTEMPTS)) {
                return false;
            }
            Log.d(LOG_TAG, "Unable to execute badge", e4);
            return false;
        }
    }

    public static void applyCountOrThrow(Context context, int i7) {
        if (sShortcutBadger == null && !initBadger(context)) {
            throw new b("No default launcher available");
        }
        try {
            sShortcutBadger.executeBadge(context, sComponentName, i7);
        } catch (Exception e4) {
            throw new b("Unable to execute badge", e4);
        }
    }

    public static void applyNotification(Context context, Notification notification, int i7) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i7));
            } catch (Exception e4) {
                if (Log.isLoggable(LOG_TAG, SUPPORTED_CHECK_ATTEMPTS)) {
                    Log.d(LOG_TAG, "Unable to execute badge", e4);
                }
            }
        }
    }

    private static boolean initBadger(Context context) {
        a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e(LOG_TAG, "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        sComponentName = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends a>> it = BADGERS.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                aVar = it.next().newInstance();
            } catch (Exception unused) {
                aVar = null;
            }
            if (aVar != null && aVar.getSupportLaunchers().contains(str)) {
                sShortcutBadger = aVar;
                break;
            }
        }
        if (sShortcutBadger != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            sShortcutBadger = new ZukHomeBadger();
            return true;
        }
        if (str2.equalsIgnoreCase("OPPO")) {
            sShortcutBadger = new OPPOHomeBader();
            return true;
        }
        if (str2.equalsIgnoreCase("VIVO")) {
            sShortcutBadger = new VivoHomeBadger();
            return true;
        }
        sShortcutBadger = new DefaultBadger();
        return true;
    }

    public static boolean isBadgeCounterSupported(Context context) {
        String str;
        if (sIsBadgeCounterSupported == null) {
            synchronized (sCounterSupportedLock) {
                try {
                } catch (Exception e4) {
                    str = e4.getMessage();
                } finally {
                }
                if (sIsBadgeCounterSupported == null) {
                    str = null;
                    for (int i7 = 0; i7 < SUPPORTED_CHECK_ATTEMPTS; i7++) {
                        Log.i(LOG_TAG, "Checking if platform supports badge counters, attempt " + String.format("%d/%d.", Integer.valueOf(i7 + 1), Integer.valueOf(SUPPORTED_CHECK_ATTEMPTS)));
                        if (initBadger(context)) {
                            sShortcutBadger.executeBadge(context, sComponentName, 0);
                            sIsBadgeCounterSupported = Boolean.TRUE;
                            Log.i(LOG_TAG, "Badge counter is supported in this platform.");
                            break;
                        }
                        str = "Failed to initialize the badge counter.";
                    }
                    if (sIsBadgeCounterSupported == null) {
                        Log.w(LOG_TAG, "Badge counter seems not supported for this platform: " + str);
                        sIsBadgeCounterSupported = Boolean.FALSE;
                    }
                }
            }
        }
        return sIsBadgeCounterSupported.booleanValue();
    }

    public static boolean removeCount(Context context) {
        return applyCount(context, 0);
    }

    public static void removeCountOrThrow(Context context) {
        applyCountOrThrow(context, 0);
    }
}
