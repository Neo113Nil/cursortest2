package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final v2.h f7407a = new v2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f7408b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static p.b f7409c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static p.b b() {
        p.b bVar = new p.b(9);
        f7409c = bVar;
        v2.h hVar = f7407a;
        hVar.getClass();
        if (v2.g.i.n(hVar, null, bVar)) {
            v2.g.b(hVar);
        }
        return f7409c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        boolean z7;
        h a8;
        h hVar;
        int i;
        if (z3 || f7409c == null) {
            synchronized (f7408b) {
                if (!z3) {
                    if (f7409c != null) {
                        return;
                    }
                }
                int i8 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z7 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z7 = false;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28 && i9 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z8 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z9 = file2.exists() && length2 > 0;
                    try {
                        long a9 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a8 = h.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a8 = null;
                        }
                        if (a8 != null && a8.f7405c == a9 && (i = a8.f7404b) != 2) {
                            i8 = i;
                            if (z3 && z9 && i8 != 1) {
                                i8 = 2;
                            }
                            if (a8 != null && a8.f7404b == 2 && i8 == 1 && length < a8.f7406d) {
                                i8 = 3;
                            }
                            hVar = new h(1, i8, a9, length2);
                            if (a8 != null || !a8.equals(hVar)) {
                                hVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z8) {
                            i8 = 1;
                        } else if (z9) {
                            i8 = 2;
                        }
                        if (z3) {
                            i8 = 2;
                        }
                        if (a8 != null) {
                            i8 = 3;
                        }
                        hVar = new h(1, i8, a9, length2);
                        if (a8 != null) {
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
