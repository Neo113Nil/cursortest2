package z6;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import c7.c0;
import c7.z;
import com.google.android.gms.internal.measurement.id;
import com.google.android.gms.internal.measurement.nc;
import com.google.android.gms.internal.measurement.oc;
import com.google.android.gms.internal.measurement.rb;
import com.google.android.gms.internal.measurement.sa;
import com.google.android.gms.internal.measurement.v5;
import com.google.android.gms.internal.measurement.vc;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static j f10888c;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f10889a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10890b;

    public static j a(Context context) {
        c0.g(context);
        synchronized (j.class) {
            if (f10888c == null) {
                n nVar = s.f10903a;
                synchronized (s.class) {
                    if (s.f10907e == null) {
                        s.f10907e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                j jVar = new j();
                jVar.f10890b = context.getApplicationContext();
                f10888c = jVar;
            }
        }
        return f10888c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        r5 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(PackageInfo packageInfo, boolean z10) {
        o7.f fVar;
        SigningInfo signingInfo;
        o7.f fVar2;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] signingCertificateHistory2;
        int i3;
        if (packageInfo != null) {
            if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                fVar = z10 ? r.f10902c : r.f10901b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] bArr = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        bArr = signatureArr[0].toByteArray();
                    }
                    if (bArr != null) {
                        o7.b bVar = o7.e.f7546e;
                        Object[] objArr = {bArr};
                        w.R(1, objArr);
                        fVar2 = new o7.f(1, objArr);
                    } else {
                        o7.b bVar2 = o7.e.f7546e;
                        fVar2 = o7.f.f7547s;
                    }
                } else {
                    if (i10 < 28) {
                        throw new IllegalStateException();
                    }
                    signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        hasMultipleSigners = signingInfo.hasMultipleSigners();
                        if (!hasMultipleSigners) {
                            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                            if (signingCertificateHistory != null) {
                                o7.b bVar3 = o7.e.f7546e;
                                Object[] objArr2 = new Object[4];
                                signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                                int length = signingCertificateHistory2.length;
                                int i11 = 0;
                                int i12 = 0;
                                while (i11 < length) {
                                    byte[] byteArray = signingCertificateHistory2[i11].toByteArray();
                                    byteArray.getClass();
                                    int length2 = objArr2.length;
                                    int i13 = i12 + 1;
                                    if (i13 < 0) {
                                        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                                    }
                                    if (i13 <= length2) {
                                        i3 = length2;
                                    } else {
                                        i3 = (length2 >> 1) + length2 + 1;
                                        if (i3 < i13) {
                                            int highestOneBit = Integer.highestOneBit(i12);
                                            i3 = highestOneBit + highestOneBit;
                                        }
                                        if (i3 < 0) {
                                            i3 = Integer.MAX_VALUE;
                                        }
                                    }
                                    if (i3 > length2) {
                                        objArr2 = Arrays.copyOf(objArr2, i3);
                                    }
                                    objArr2[i12] = byteArray;
                                    i11++;
                                    i12 = i13;
                                }
                                fVar2 = i12 == 0 ? o7.f.f7547s : new o7.f(i12, objArr2);
                            }
                        }
                    }
                    o7.b bVar4 = o7.e.f7546e;
                    fVar2 = o7.f.f7547s;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z10 ? e(packageInfo, r.f10900a) : e(packageInfo, r.f10900a[0])) != null) {
                }
            }
            if (fVar2.isEmpty()) {
                throw new IllegalArgumentException("Unable to obtain package certificate history.");
            }
            o7.e g = fVar2.g();
            int size = g.size();
            int i14 = 0;
            while (i14 < size) {
                byte[] bArr2 = (byte[]) g.get(i14);
                o7.b listIterator = fVar.listIterator(0);
                do {
                    int i15 = i14 + 1;
                    if (listIterator.hasNext()) {
                    }
                } while (!Arrays.equals(bArr2, (byte[]) listIterator.next()));
                return true;
            }
        }
        return false;
    }

    public static o e(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p pVar = new p(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < oVarArr.length; i3++) {
                if (oVarArr[i3].equals(pVar)) {
                    return oVarArr[i3];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(int i3) {
        v b10;
        int length;
        ApplicationInfo applicationInfo;
        boolean I;
        String[] packagesForUid = ((Context) this.f10890b).getPackageManager().getPackagesForUid(i3);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            b10 = v.b("no pkgs");
        } else {
            b10 = null;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    c0.g(b10);
                    break;
                }
                String str = packagesForUid[i10];
                if (str == null) {
                    b10 = v.b("null pkg");
                } else if (str.equals((String) this.f10889a)) {
                    b10 = v.f10914d;
                } else {
                    n nVar = s.f10903a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            s.a();
                            I = ((z) s.f10905c).I();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } finally {
                        }
                    } catch (RemoteException | k7.a e2) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                    if (I) {
                        boolean a9 = i.a((Context) this.f10890b);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            c0.g(s.f10907e);
                            try {
                                s.a();
                                c0.g(s.f10907e);
                                Context context = (Context) j7.b.F(j7.b.E(new j7.b(s.f10907e)));
                                try {
                                    z zVar = (z) s.f10905c;
                                    Parcel F = zVar.F();
                                    int i11 = o7.h.f7551a;
                                    F.writeInt(1);
                                    int Z = cf.c.Z(F, 20293);
                                    cf.c.V(F, 1, str);
                                    cf.c.Y(F, 2, 4);
                                    F.writeInt(a9 ? 1 : 0);
                                    cf.c.Y(F, 3, 4);
                                    F.writeInt(0);
                                    cf.c.S(F, 4, new j7.b(context));
                                    cf.c.Y(F, 5, 4);
                                    F.writeInt(0);
                                    cf.c.Y(F, 6, 4);
                                    F.writeInt(1);
                                    cf.c.Y(F, 8, 4);
                                    F.writeInt(0);
                                    cf.c.a0(F, Z);
                                    Parcel D = zVar.D(F, 6);
                                    t tVar = (t) o7.h.a(D, t.CREATOR);
                                    D.recycle();
                                    if (tVar.f10908d) {
                                        m.b(tVar.f10911r);
                                        b10 = new v(true, null, null);
                                    } else {
                                        String str2 = tVar.f10909e;
                                        PackageManager.NameNotFoundException nameNotFoundException = x3.c0.c(tVar.f10910i) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        m.b(tVar.f10911r);
                                        x3.c0.c(tVar.f10910i);
                                        b10 = new v(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e9) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                                    b10 = v.c("module call", e9);
                                }
                            } catch (k7.a e10) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                b10 = v.c("module init: ".concat(String.valueOf(e10.getMessage())), e10);
                            }
                            if (b10.f10915a) {
                                this.f10889a = str;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = ((Context) this.f10890b).getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                            boolean a10 = i.a((Context) this.f10890b);
                            if (packageInfo == null) {
                                b10 = v.b("null pkg");
                                if (b10.f10915a) {
                                }
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    b10 = v.b("single cert required");
                                } else {
                                    p pVar = new p(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        v b11 = s.b(str3, pVar, a10, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        if (b11.f10915a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                v b12 = s.b(str3, pVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                if (b12.f10915a) {
                                                    b10 = v.b("debuggable release cert app rejected");
                                                }
                                            } finally {
                                            }
                                        }
                                        b10 = b11;
                                    } finally {
                                    }
                                }
                                if (b10.f10915a) {
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e11) {
                            b10 = v.c("no pkg ".concat(str), e11);
                        }
                    }
                }
                if (b10.f10915a) {
                    break;
                }
                i10++;
            }
        }
        if (!b10.f10915a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th2 = b10.f10917c;
            if (th2 != null) {
                Log.d("GoogleCertificatesRslt", b10.a(), th2);
            } else {
                Log.d("GoogleCertificatesRslt", b10.a());
            }
        }
        return b10.f10915a;
    }

    public vc c(final sa saVar) {
        final nc ncVar = (nc) this.f10889a;
        nc ncVar2 = vc.j;
        if (ncVar != ncVar2) {
            v5 v5Var = vc.f2884i;
            v5Var.getClass();
            final rb rbVar = new rb();
            rbVar.f2743d = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) v5Var.f2870e;
            Context context = saVar.f2787b;
            String str = ncVar.f2580d;
            if (str == null) {
                str = (String) ncVar.f2577a.apply(context);
                ncVar.f2580d = str;
            }
            oc ocVar = (oc) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.uc
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    oc ocVar2 = new oc(new vc(sa.this, ncVar));
                    rbVar.f2743d = true;
                    return ocVar2;
                }
            });
            if (rbVar.f2743d) {
                Context context2 = saVar.f2787b;
                v5 v5Var2 = new v5(13, v5Var);
                if (id.f2407a == null) {
                    synchronized (id.class) {
                        try {
                            if (id.f2407a == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new id(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new id(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                id.f2407a = v5Var2;
                            }
                        } finally {
                        }
                    }
                }
            }
            this.f10890b = ocVar.f2647a;
            this.f10889a = ncVar2;
        }
        return (vc) this.f10890b;
    }
}
