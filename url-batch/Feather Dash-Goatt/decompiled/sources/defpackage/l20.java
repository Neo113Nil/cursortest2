package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class l20 {
    public static final lj0 a = new lj0(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final qa1 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new v21());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new qa1(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, NameNotFoundException -> 0x0099, all -> 0x0073, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:24:0x006f, B:26:0x0084, B:29:0x0090, B:34:0x0074, B:35:0x0077, B:36:0x0078, B:38:0x002d, B:40:0x0035, B:43:0x0039, B:45:0x003d, B:47:0x0048, B:56:0x0099, B:23:0x0066), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #2 {all -> 0x00a3, NameNotFoundException -> 0x0099, all -> 0x0073, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:24:0x006f, B:26:0x0084, B:29:0x0090, B:34:0x0074, B:35:0x0077, B:36:0x0078, B:38:0x002d, B:40:0x0035, B:43:0x0039, B:45:0x003d, B:47:0x0048, B:56:0x0099, B:23:0x0066), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k20 a(String str, Context context, List list) {
        Typeface typeface;
        int i;
        Typeface a2;
        lj0 lj0Var = a;
        ca0.e("getFontSync");
        try {
            typeface = (Typeface) lj0Var.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new k20(-1);
        } finally {
        }
        if (typeface != null) {
            return new k20(typeface);
        }
        jj a3 = e20.a(context, list);
        List list2 = (List) a3.e;
        int i2 = a3.d;
        if (i2 != 0) {
            if (i2 == 1) {
                i = -2;
                if (i == 0) {
                    return new k20(i);
                }
                if (list2.size() > 1) {
                    tc1 tc1Var = wj1.a;
                    ca0.e("TypefaceCompat.createFromFontInfoWithFallback");
                    wj1.a.getClass();
                    a2 = tc1.b(context, list2);
                    Trace.endSection();
                } else {
                    a2 = wj1.a(context, (z20[]) list2.get(0));
                }
                if (a2 == null) {
                    return new k20(-3);
                }
                lj0Var.b(str, a2);
                return new k20(a2);
            }
            i = -3;
            if (i == 0) {
            }
        } else {
            z20[] z20VarArr = (z20[]) list2.get(0);
            if (z20VarArr != null && z20VarArr.length != 0) {
                int length = z20VarArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i = 0;
                        break;
                    }
                    int i4 = z20VarArr[i3].e;
                    if (i4 == 0) {
                        i3++;
                    } else if (i4 >= 0) {
                        i = i4;
                    }
                }
                if (i == 0) {
                }
            }
            i = 1;
            if (i == 0) {
            }
        }
    }
}
