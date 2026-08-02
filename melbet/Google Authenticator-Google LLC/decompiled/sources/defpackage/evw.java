package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evw extends BroadcastReceiver {
    public static volatile kee a;
    private static volatile kee b;

    public static void a(Context context, kee keeVar, kee keeVar2) {
        if (a == null) {
            synchronized (evw.class) {
                if (a == null) {
                    if (keeVar != null && !Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            context.registerReceiver(new evw(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                        } else {
                            context.registerReceiver(new evw(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                        }
                        b = keeVar;
                    }
                    a = keeVar2;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", a.Z(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
            return;
        }
        kee keeVar = b;
        if (keeVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        bry bryVar = (bry) ((evh) keeVar.a).b.get(stringExtra);
        if (bryVar != null) {
            bryVar.d(new evf(1));
        }
    }
}
