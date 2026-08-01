package e1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final s.i f1378a = new s.i();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1379b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static o2.f f1380c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static o2.f b() {
        o2.f fVar = new o2.f(14);
        f1380c = fVar;
        s.i iVar = f1378a;
        iVar.getClass();
        if (s.h.f3230k.g(iVar, null, fVar)) {
            s.h.b(iVar);
        }
        return f1380c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z4) {
        boolean z5;
        j a5;
        j jVar;
        int i;
        if (z4 || f1380c == null) {
            synchronized (f1379b) {
                if (!z4) {
                    if (f1380c != null) {
                        return;
                    }
                }
                int i4 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z5 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z5 = false;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28 && i5 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z6 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z7 = file2.exists() && length2 > 0;
                    try {
                        long a6 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a5 = j.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a5 = null;
                        }
                        if (a5 != null && a5.f1377c == a6 && (i = a5.f1376b) != 2) {
                            i4 = i;
                            if (z4 && z7 && i4 != 1) {
                                i4 = 2;
                            }
                            if (a5 != null && a5.f1376b == 2 && i4 == 1 && length < a5.d) {
                                i4 = 3;
                            }
                            jVar = new j(1, i4, a6, length2);
                            if (a5 != null || !a5.equals(jVar)) {
                                jVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z6) {
                            i4 = 1;
                        } else if (z7) {
                            i4 = 2;
                        }
                        if (z4) {
                            i4 = 2;
                        }
                        if (a5 != null) {
                            i4 = 3;
                        }
                        jVar = new j(1, i4, a6, length2);
                        if (a5 != null) {
                        }
                        jVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
