package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fag implements fah {
    private static final String a = "fah";

    @Override // defpackage.fah
    public final void a(bsh bshVar) {
        Context context;
        Context context2;
        try {
            Object obj = bshVar.b;
            Object obj2 = dcm.a;
            cmd.c((Context) obj, 11925000);
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (dcm.a) {
                Context context3 = null;
                if (!dcm.b) {
                    try {
                        context = ctg.b((Context) obj, ctg.b, "com.google.android.gms.providerinstaller.dynamite").c;
                    } catch (ctc e) {
                        Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                        context = null;
                    }
                    if (context != null) {
                        dcm.a(context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                        return;
                    }
                }
                boolean z = dcm.b;
                try {
                    context2 = ((Context) obj).createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                if (context2 != null) {
                    dcm.b = true;
                    if (!z) {
                        try {
                            dih.ar(context2.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", new fwm(Context.class, obj, (short[]) null), fwm.V(uptimeMillis), fwm.V(SystemClock.uptimeMillis()));
                        } catch (Exception e2) {
                            Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                        }
                    }
                    context3 = context2;
                }
                if (context3 != null) {
                    dcm.a(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new cmb(8);
                }
            }
        } catch (cmb e3) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.", e3);
            cll.a.i((Context) bshVar.b, e3.a);
            int i = bshVar.a;
            throw new IOException("Blocked unpatched use of SSL stack.", e3);
        } catch (cmc e4) {
            cll.a.i((Context) bshVar.b, e4.a);
            int i2 = bshVar.a;
            throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.", e4);
        }
    }
}
