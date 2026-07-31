package n3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.s;
import o.t0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final s f5355a = new s(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f5356b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f5357c;

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f5358d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5356b = threadPoolExecutor;
        f5357c = new Object();
        f5358d = new t0(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((c) list.get(i8)).f5345g);
            sb.append("-");
            sb.append(i);
            if (i8 < list.size() - 1) {
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
    public static f b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i8;
        Typeface t3;
        s sVar = f5355a;
        a.a.e("getFontSync");
        try {
            typeface = (Typeface) sVar.c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new f(typeface);
        }
        k5.e a8 = b.a(context, list);
        List list2 = (List) a8.f4190e;
        int i9 = a8.f4189d;
        if (i9 != 0) {
            if (i9 == 1) {
                i8 = -2;
                if (i8 == 0) {
                    return new f(i8);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    h[] hVarArr = (h[]) list2.get(0);
                    h0.a aVar = i3.g.f3428a;
                    a.a.e("TypefaceCompat.createFromFontInfo");
                    t3 = i3.g.f3428a.t(context, hVarArr, i);
                    Trace.endSection();
                    if (t3 != null) {
                        return new f(-3);
                    }
                    sVar.f(str, t3);
                    return new f(t3);
                }
                h0.a aVar2 = i3.g.f3428a;
                a.a.e("TypefaceCompat.createFromFontInfoWithFallback");
                t3 = i3.g.f3428a.u(context, list2, i);
                Trace.endSection();
                if (t3 != null) {
                }
            }
            i8 = -3;
            if (i8 == 0) {
            }
        } else {
            h[] hVarArr2 = (h[]) list2.get(0);
            if (hVarArr2 != null && hVarArr2.length != 0) {
                int length = hVarArr2.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i8 = 0;
                        break;
                    }
                    int i11 = hVarArr2[i10].f5364f;
                    if (i11 == 0) {
                        i10++;
                    } else if (i11 >= 0) {
                        i8 = i11;
                    }
                }
                if (i8 == 0) {
                }
            }
            i8 = 1;
            if (i8 == 0) {
            }
        }
    }
}
