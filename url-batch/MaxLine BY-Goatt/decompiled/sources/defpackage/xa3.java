package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xa3 extends o70 {
    public static void Q(Context context, da3 da3Var, IntentFilter intentFilter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            context.registerReceiver(da3Var, intentFilter, i >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(da3Var, intentFilter);
        }
    }
}
