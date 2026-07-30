package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yv0 {
    public static yv0 c;
    public final Context a;
    public volatile String b;

    public yv0(Context context) {
        this.a = context.getApplicationContext();
    }

    public static yv0 a(Context context) {
        ll3.v(context);
        synchronized (yv0.class) {
            if (c == null) {
                yf3 yf3Var = zn3.a;
                synchronized (zn3.class) {
                    if (zn3.e == null) {
                        zn3.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new yv0(context);
            }
        }
        return c;
    }

    public static final jk3 c(PackageInfo packageInfo, jk3... jk3VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            ml3 ml3Var = new ml3(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < jk3VarArr.length; i++) {
                if (jk3VarArr[i].equals(ml3Var)) {
                    return jk3VarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (z) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z ? c(packageInfo2, an3.a) : c(packageInfo2, an3.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z ? c(packageInfo2, an3.a) : c(packageInfo2, an3.a[0])) == null) {
            }
        }
        return false;
    }

    public final boolean b(int i) {
        kl3 kl3Var;
        int length;
        boolean z;
        ApplicationInfo applicationInfo;
        kl3 kl3Var2;
        hr3 hr3Var;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        int i2 = 1;
        Object obj = null;
        boolean z2 = false;
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            kl3Var = new kl3(1, "no pkgs", null, false);
        } else {
            kl3Var = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    ll3.v(kl3Var);
                    break;
                }
                String str = packagesForUid[i3];
                if (str == null) {
                    kl3Var = new kl3(i2, "null pkg", obj, z2);
                } else if (str.equals(this.b)) {
                    kl3Var = kl3.f;
                } else {
                    yf3 yf3Var = zn3.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            zn3.b();
                            z = ((pb3) zn3.c).J();
                        } finally {
                        }
                    } catch (RemoteException | ve0 e) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                        z = z2;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    Context context = this.a;
                    if (z) {
                        boolean a = xv0.a(context);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            ll3.v(zn3.e);
                            try {
                                zn3.b();
                                Context context2 = (Context) st1.J(st1.I(new st1(zn3.e)));
                                try {
                                    pb3 pb3Var = (pb3) zn3.c;
                                    Parcel d = pb3Var.d();
                                    int i4 = wd3.a;
                                    d.writeInt(i2);
                                    int b0 = yk3.b0(d, 20293);
                                    yk3.W(d, i2, str);
                                    yk3.d0(d, 2, 4);
                                    d.writeInt(a ? 1 : 0);
                                    yk3.d0(d, 3, 4);
                                    d.writeInt(0);
                                    yk3.U(d, 4, new st1(context2));
                                    yk3.d0(d, 5, 4);
                                    d.writeInt(0);
                                    yk3.d0(d, 6, 4);
                                    d.writeInt(1);
                                    yk3.c0(d, b0);
                                    Parcel b = pb3Var.b(d, 6);
                                    hr3Var = (hr3) wd3.a(b, hr3.CREATOR);
                                    b.recycle();
                                } catch (RemoteException e2) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                    kl3Var2 = new kl3(1, "module call", e2, false);
                                }
                            } catch (ve0 e3) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                kl3Var2 = new kl3(1, "module init: ".concat(String.valueOf(e3.getMessage())), e3, false);
                            }
                            if (hr3Var.m) {
                                ij2.o(hr3Var.p);
                                kl3Var = new kl3(1, null, null, true);
                            } else {
                                String str2 = hr3Var.n;
                                PackageManager.NameNotFoundException nameNotFoundException = mi2.r(hr3Var.o) == 4 ? new PackageManager.NameNotFoundException() : null;
                                if (str2 == null) {
                                    str2 = "error checking package certificate";
                                }
                                ij2.o(hr3Var.p);
                                mi2.r(hr3Var.o);
                                kl3Var2 = new kl3(1, str2, nameNotFoundException, false);
                                kl3Var = kl3Var2;
                            }
                        } finally {
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                            boolean a2 = xv0.a(this.a);
                            if (packageInfo == null) {
                                kl3Var = new kl3(1, "null pkg", null, false);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    kl3Var = new kl3(1, "single cert required", null, false);
                                } else {
                                    ml3 ml3Var = new ml3(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        kl3 a3 = zn3.a(str3, ml3Var, a2, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        if (a3.b && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                kl3 a4 = zn3.a(str3, ml3Var, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                if (a4.b) {
                                                    kl3Var = new kl3(1, "debuggable release cert app rejected", null, false);
                                                }
                                            } finally {
                                            }
                                        }
                                        kl3Var = a3;
                                    } finally {
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            kl3Var = new kl3(1, "no pkg ".concat(str), e4, false);
                        }
                    }
                    if (kl3Var.b) {
                        this.b = str;
                    }
                }
                if (kl3Var.b) {
                    break;
                }
                i3++;
                i2 = 1;
                obj = null;
                z2 = false;
            }
        }
        Throwable th = (Throwable) kl3Var.d;
        if (!kl3Var.b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (th != null) {
                Log.d("GoogleCertificatesRslt", kl3Var.c(), th);
            } else {
                Log.d("GoogleCertificatesRslt", kl3Var.c());
            }
        }
        return kl3Var.b;
    }
}
