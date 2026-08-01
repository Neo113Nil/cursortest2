package y4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import c3.l;
import java.io.File;
import java.io.IOException;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final l f10613a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f10614b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c0 f10615c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? h.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c0 b() {
        c0 c0Var = new c0(27);
        f10615c = c0Var;
        f10613a.j(c0Var);
        return f10615c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z10) {
        boolean z11;
        i a9;
        i iVar;
        int i3;
        if (z10 || f10615c == null) {
            synchronized (f10614b) {
                if (!z10) {
                    if (f10615c != null) {
                        return;
                    }
                }
                int i10 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z11 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z12 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z13 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a9 = i.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a9 = null;
                        }
                        if (a9 != null && a9.f10611c == a10 && (i3 = a9.f10610b) != 2) {
                            i10 = i3;
                            if (z10 && z13 && i10 != 1) {
                                i10 = 2;
                            }
                            if (a9 != null && a9.f10610b == 2 && i10 == 1 && length < a9.f10612d) {
                                i10 = 3;
                            }
                            iVar = new i(1, i10, a10, length2);
                            if (a9 != null || !a9.equals(iVar)) {
                                iVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z12) {
                            i10 = 1;
                        } else if (z13) {
                            i10 = 2;
                        }
                        if (z10) {
                            i10 = 2;
                        }
                        if (a9 != null) {
                            i10 = 3;
                        }
                        iVar = new i(1, i10, a10, length2);
                        if (a9 != null) {
                        }
                        iVar.b(file3);
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
