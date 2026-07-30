package L;

import B2.N;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.internal.ads.B0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.k;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final B0 f1682a = new B0(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1683b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1684c;

    /* renamed from: d, reason: collision with root package name */
    public static final k f1685d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1683b = threadPoolExecutor;
        f1684c = new Object();
        f1685d = new k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(String str, Context context, N n9, int i) {
        B0 b02 = f1682a;
        Typeface typeface = (Typeface) b02.b(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            G1.a a9 = c.a(context, n9);
            int i4 = 1;
            h[] hVarArr = (h[]) a9.f1195v;
            int i9 = a9.f1194u;
            if (i9 != 0) {
                if (i9 == 1) {
                    i4 = -2;
                    if (i4 != 0) {
                        return new f(i4);
                    }
                    Typeface i10 = G.j.f1158a.i(context, hVarArr, i);
                    if (i10 == null) {
                        return new f(-3);
                    }
                    b02.c(str, i10);
                    return new f(i10);
                }
                i4 = -3;
                if (i4 != 0) {
                }
            } else {
                if (hVarArr != null && hVarArr.length != 0) {
                    int length = hVarArr.length;
                    i4 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        }
                        int i12 = hVarArr[i11].f1690e;
                        if (i12 == 0) {
                            i11++;
                        } else if (i12 >= 0) {
                            i4 = i12;
                        }
                    }
                }
                if (i4 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
