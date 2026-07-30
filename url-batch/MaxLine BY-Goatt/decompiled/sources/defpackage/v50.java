package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class v50 {
    public final rz0 a;
    public final ComponentName b;

    public v50(rz0 rz0Var, ComponentName componentName) {
        this.a = rz0Var;
        this.b = componentName;
    }

    public static boolean a(Context context, String str, y50 y50Var) {
        y50Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            lh.e("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(str);
        return context.bindService(intent, y50Var, 33);
    }
}
