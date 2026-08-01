package l3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.google.android.gms.internal.measurement.bf;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s.r;
import s.r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5849a = new r(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f5850b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5851c;

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f5852d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5850b = threadPoolExecutor;
        f5851c = new Object();
        f5852d = new r0(0);
    }

    public static String a(int i3, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((c) list.get(i10)).g);
            sb2.append("-");
            sb2.append(i3);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f b(String str, Context context, List list, int i3) {
        Typeface typeface;
        int i10;
        Typeface n10;
        r rVar = f5849a;
        i7.a.n("getFontSync");
        try {
            typeface = (Typeface) rVar.c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new f(typeface);
        }
        bf a9 = b.a(context, list);
        List list2 = (List) a9.f2175e;
        int i11 = a9.f2174d;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = -2;
                if (i10 == 0) {
                    return new f(i10);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr = (h[]) list2.get(0);
                    a.a aVar = h3.c.f4447a;
                    i7.a.n("TypefaceCompat.createFromFontInfo");
                    n10 = h3.c.f4447a.n(context, hVarArr, i3);
                    Trace.endSection();
                    if (n10 != null) {
                        return new f(-3);
                    }
                    rVar.d(str, n10);
                    return new f(n10);
                }
                a.a aVar2 = h3.c.f4447a;
                i7.a.n("TypefaceCompat.createFromFontInfoWithFallback");
                n10 = h3.c.f4447a.o(context, list2, i3);
                Trace.endSection();
                if (n10 != null) {
                }
            }
            i10 = -3;
            if (i10 == 0) {
            }
        } else {
            h[] hVarArr2 = (h[]) list2.get(0);
            if (hVarArr2 != null && hVarArr2.length != 0) {
                int length = hVarArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        i10 = 0;
                        break;
                    }
                    int i13 = hVarArr2[i12].f5858f;
                    if (i13 == 0) {
                        i12++;
                    } else if (i13 >= 0) {
                        i10 = i13;
                    }
                }
                if (i10 == 0) {
                }
            }
            i10 = 1;
            if (i10 == 0) {
            }
        }
    }
}
