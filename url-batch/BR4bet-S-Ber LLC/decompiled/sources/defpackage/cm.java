package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class cm {
    public static final fu a = new fu(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final w50 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new d30());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new w50(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((wl) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bm b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface l;
        fu fuVar = a;
        mz.f("getFontSync");
        try {
            typeface = (Typeface) fuVar.f(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new bm(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new bm(typeface);
        }
        l2 a2 = vl.a(context, list);
        List list2 = (List) a2.g;
        int i3 = a2.f;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new bm(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    hm[] hmVarArr = (hm[]) list2.get(0);
                    xf xfVar = na0.a;
                    mz.f("TypefaceCompat.createFromFontInfo");
                    l = na0.a.l(context, hmVarArr, i);
                    Trace.endSection();
                    if (l != null) {
                        return new bm(-3);
                    }
                    fuVar.j(str, l);
                    return new bm(l);
                }
                xf xfVar2 = na0.a;
                mz.f("TypefaceCompat.createFromFontInfoWithFallback");
                l = na0.a.m(context, list2, i);
                Trace.endSection();
                if (l != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            hm[] hmVarArr2 = (hm[]) list2.get(0);
            if (hmVarArr2 != null && hmVarArr2.length != 0) {
                int length = hmVarArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = hmVarArr2[i4].f;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
    }
}
