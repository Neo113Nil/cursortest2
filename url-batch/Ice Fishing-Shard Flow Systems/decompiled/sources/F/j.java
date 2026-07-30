package F;

import B6.p;
import a.AbstractC0169a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u.C0938i;
import u.C0939j;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0938i f740a = new C0938i(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f741b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f742c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0939j f743d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f741b = threadPoolExecutor;
        f742c = new Object();
        f743d = new C0939j(0);
    }

    public static String a(int i2, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((f) list.get(i5)).f730g);
            sb.append("-");
            sb.append(i2);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[Catch: all -> 0x00c3, TRY_ENTER, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: all -> 0x00c3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c3, NameNotFoundException -> 0x00b9, all -> 0x00b4, all -> 0x007e, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0054, B:19:0x005d, B:21:0x0063, B:23:0x0069, B:26:0x007a, B:28:0x009f, B:31:0x00ab, B:36:0x007f, B:37:0x0082, B:38:0x0083, B:41:0x009a, B:44:0x00b5, B:45:0x00b8, B:47:0x0031, B:49:0x0039, B:52:0x003d, B:54:0x0041, B:56:0x004c, B:65:0x00b9, B:40:0x0094, B:25:0x0074), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i b(String str, Context context, List list, int i2) {
        Typeface typeface;
        int i5;
        Typeface p7;
        C0938i c0938i = f740a;
        Trace.beginSection(AbstractC0169a.G("getFontSync"));
        try {
            typeface = (Typeface) c0938i.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new i(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new i(typeface);
        }
        p a7 = e.a(context, list);
        List list2 = (List) a7.f234c;
        int i7 = a7.f233b;
        if (i7 != 0) {
            if (i7 == 1) {
                i5 = -2;
                if (i5 == 0) {
                    return new i(i5);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    k[] kVarArr = (k[]) list2.get(0);
                    V6.b bVar = B.g.f153a;
                    Trace.beginSection(AbstractC0169a.G("TypefaceCompat.createFromFontInfo"));
                    p7 = B.g.f153a.p(context, kVarArr, i2);
                    Trace.endSection();
                    if (p7 != null) {
                        return new i(-3);
                    }
                    c0938i.b(str, p7);
                    return new i(p7);
                }
                V6.b bVar2 = B.g.f153a;
                Trace.beginSection(AbstractC0169a.G("TypefaceCompat.createFromFontInfoWithFallback"));
                p7 = B.g.f153a.q(context, list2, i2);
                Trace.endSection();
                if (p7 != null) {
                }
            }
            i5 = -3;
            if (i5 == 0) {
            }
        } else {
            k[] kVarArr2 = (k[]) list2.get(0);
            if (kVarArr2 != null && kVarArr2.length != 0) {
                int length = kVarArr2.length;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        i5 = 0;
                        break;
                    }
                    int i9 = kVarArr2[i8].f749f;
                    if (i9 == 0) {
                        i8++;
                    } else if (i9 >= 0) {
                        i5 = i9;
                    }
                }
                if (i5 == 0) {
                }
            }
            i5 = 1;
            if (i5 == 0) {
            }
        }
        Trace.endSection();
    }
}
