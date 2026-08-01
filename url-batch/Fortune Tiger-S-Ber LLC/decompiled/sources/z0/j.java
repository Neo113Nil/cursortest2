package z0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p.h f3656a = new p.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3657b = new Object();
    public static i c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static i b() {
        i iVar = new i();
        c = iVar;
        p.h hVar = f3656a;
        hVar.getClass();
        if (p.g.f3013k.e(hVar, null, iVar)) {
            p.g.b(hVar);
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        boolean z4;
        h a4;
        h hVar;
        int i4;
        if (z3 || c == null) {
            synchronized (f3657b) {
                if (!z3) {
                    if (c != null) {
                        return;
                    }
                }
                int i5 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z4 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z4 = false;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28 && i6 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z5 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z6 = file2.exists() && length2 > 0;
                    try {
                        long a5 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a4 = h.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a4 = null;
                        }
                        if (a4 != null && a4.c == a5 && (i4 = a4.f3654b) != 2) {
                            i5 = i4;
                            if (z3 && z6 && i5 != 1) {
                                i5 = 2;
                            }
                            if (a4 != null && a4.f3654b == 2 && i5 == 1 && length < a4.f3655d) {
                                i5 = 3;
                            }
                            hVar = new h(1, i5, a5, length2);
                            if (a4 != null || !a4.equals(hVar)) {
                                hVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z5) {
                            i5 = 1;
                        } else if (z6) {
                            i5 = 2;
                        }
                        if (z3) {
                            i5 = 2;
                        }
                        if (a4 != null) {
                            i5 = 3;
                        }
                        hVar = new h(1, i5, a5, length2);
                        if (a4 != null) {
                        }
                        hVar.b(file3);
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
