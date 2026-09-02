package d1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final s.h f1115a = new s.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1116b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static l2.f f1117c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static l2.f b() {
        l2.f fVar = new l2.f(13);
        f1117c = fVar;
        s.h hVar = f1115a;
        hVar.getClass();
        if (s.g.f3169k.i(hVar, null, fVar)) {
            s.g.b(hVar);
        }
        return f1117c;
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
        j a2;
        j jVar;
        int i;
        if (z3 || f1117c == null) {
            synchronized (f1116b) {
                if (!z3) {
                    if (f1117c != null) {
                        return;
                    }
                }
                int i4 = 0;
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
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28 && i5 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z5 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z6 = file2.exists() && length2 > 0;
                    try {
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = j.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.f1114c == a4 && (i = a2.f1113b) != 2) {
                            i4 = i;
                            if (z3 && z6 && i4 != 1) {
                                i4 = 2;
                            }
                            if (a2 != null && a2.f1113b == 2 && i4 == 1 && length < a2.d) {
                                i4 = 3;
                            }
                            jVar = new j(1, i4, a4, length2);
                            if (a2 != null || !a2.equals(jVar)) {
                                jVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z5) {
                            i4 = 1;
                        } else if (z6) {
                            i4 = 2;
                        }
                        if (z3) {
                            i4 = 2;
                        }
                        if (a2 != null) {
                            i4 = 3;
                        }
                        jVar = new j(1, i4, a4, length2);
                        if (a2 != null) {
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
