package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ljb {
    private static final Object a = new Object();
    private static Context b;
    private static Bundle c;

    private ljb() {
    }

    public static Bundle a(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                ServiceInfo serviceInfo = null;
                new cyi("CronetManifest#getMetaData fetching info", 2, null);
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    c = (serviceInfo == null || serviceInfo.metaData == null) ? new Bundle() : serviceInfo.metaData;
                    b = applicationContext;
                    Trace.endSection();
                } finally {
                }
            }
            bundle = c;
        }
        return bundle;
    }

    public static boolean b(Context context, liw liwVar) {
        boolean z = true;
        if (liwVar != liw.e && liwVar != liw.c) {
            z = false;
        }
        return a(context).getBoolean("android.net.http.EnableTelemetry", z);
    }
}
