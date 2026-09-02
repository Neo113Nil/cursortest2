package k0;

import a.y;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import f1.j1;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f2147a = new j1(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2148b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2149c;
    public static final q.j d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2148b = threadPoolExecutor;
        f2149c = new Object();
        d = new q.j(0);
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((d) list.get(i4)).f2138g);
            sb.append("-");
            sb.append(i);
            if (i4 < list.size() - 1) {
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
    public static g b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i4;
        Typeface s3;
        j1 j1Var = f2147a;
        h.a.e("getFontSync");
        try {
            typeface = (Typeface) j1Var.f(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new g(typeface);
        }
        g.f a2 = c.a(context, list);
        List list2 = (List) a2.f1632g;
        int i5 = a2.f1631f;
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = -2;
                if (i4 == 0) {
                    return new g(i4);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    i[] iVarArr = (i[]) list2.get(0);
                    y yVar = f0.g.f1272a;
                    h.a.e("TypefaceCompat.createFromFontInfo");
                    s3 = f0.g.f1272a.s(context, iVarArr, i);
                    Trace.endSection();
                    if (s3 != null) {
                        return new g(-3);
                    }
                    j1Var.j(str, s3);
                    return new g(s3);
                }
                y yVar2 = f0.g.f1272a;
                h.a.e("TypefaceCompat.createFromFontInfoWithFallback");
                s3 = f0.g.f1272a.t(context, list2, i);
                Trace.endSection();
                if (s3 != null) {
                }
            }
            i4 = -3;
            if (i4 == 0) {
            }
        } else {
            i[] iVarArr2 = (i[]) list2.get(0);
            if (iVarArr2 != null && iVarArr2.length != 0) {
                int length = iVarArr2.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        i4 = 0;
                        break;
                    }
                    int i7 = iVarArr2[i6].f2154f;
                    if (i7 == 0) {
                        i6++;
                    } else if (i7 >= 0) {
                        i4 = i7;
                    }
                }
                if (i4 == 0) {
                }
            }
            i4 = 1;
            if (i4 == 0) {
            }
        }
    }
}
