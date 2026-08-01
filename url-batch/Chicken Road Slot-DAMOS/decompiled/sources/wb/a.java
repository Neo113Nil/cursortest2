package wb;

import a2.r;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class a {
    public static boolean canResolveBroadcast(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0;
    }

    public static List<ResolveInfo> resolveBroadcast(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.EMPTY_LIST;
    }

    public static void sendIntentExplicitly(Context context, Intent intent) {
        List<ResolveInfo> resolveBroadcast = resolveBroadcast(context, intent);
        if (resolveBroadcast.size() == 0) {
            r.g(intent);
            return;
        }
        for (ResolveInfo resolveInfo : resolveBroadcast) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
