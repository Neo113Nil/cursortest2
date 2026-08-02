package B;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n0.C1125E;
import p.C1173i;
import p.C1174j;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1173i f99a = new C1173i(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f100b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f101c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1174j f102d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f100b = threadPoolExecutor;
        f101c = new Object();
        f102d = new C1174j(0);
    }

    public static String a(int i3, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((f) list.get(i4)).f89g);
            sb.append(TokenBuilder.TOKEN_DELIMITER);
            sb.append(i3);
            if (i4 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, NameNotFoundException -> 0x00b8, all -> 0x00b3, all -> 0x007d, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0053, B:20:0x005c, B:22:0x0062, B:24:0x0068, B:27:0x0079, B:29:0x009e, B:32:0x00aa, B:37:0x007e, B:38:0x0081, B:39:0x0082, B:42:0x0099, B:45:0x00b4, B:46:0x00b7, B:48:0x0031, B:50:0x0039, B:53:0x003d, B:55:0x0041, B:57:0x004c, B:66:0x00b8, B:41:0x0093, B:26:0x0073), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #1 {all -> 0x00c2, NameNotFoundException -> 0x00b8, all -> 0x00b3, all -> 0x007d, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0053, B:20:0x005c, B:22:0x0062, B:24:0x0068, B:27:0x0079, B:29:0x009e, B:32:0x00aa, B:37:0x007e, B:38:0x0081, B:39:0x0082, B:42:0x0099, B:45:0x00b4, B:46:0x00b7, B:48:0x0031, B:50:0x0039, B:53:0x003d, B:55:0x0041, B:57:0x004c, B:66:0x00b8, B:41:0x0093, B:26:0x0073), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, NameNotFoundException -> 0x00b8, all -> 0x00b3, all -> 0x007d, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0053, B:20:0x005c, B:22:0x0062, B:24:0x0068, B:27:0x0079, B:29:0x009e, B:32:0x00aa, B:37:0x007e, B:38:0x0081, B:39:0x0082, B:42:0x0099, B:45:0x00b4, B:46:0x00b7, B:48:0x0031, B:50:0x0039, B:53:0x003d, B:55:0x0041, B:57:0x004c, B:66:0x00b8, B:41:0x0093, B:26:0x0073), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: all -> 0x00c2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c2, NameNotFoundException -> 0x00b8, all -> 0x00b3, all -> 0x007d, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:17:0x0053, B:20:0x005c, B:22:0x0062, B:24:0x0068, B:27:0x0079, B:29:0x009e, B:32:0x00aa, B:37:0x007e, B:38:0x0081, B:39:0x0082, B:42:0x0099, B:45:0x00b4, B:46:0x00b7, B:48:0x0031, B:50:0x0039, B:53:0x003d, B:55:0x0041, B:57:0x004c, B:66:0x00b8, B:41:0x0093, B:26:0x0073), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i b(String str, Context context, List list, int i3) {
        Typeface typeface;
        int i4;
        Typeface m3;
        Trace.beginSection(S0.a.N("getFontSync"));
        C1173i c1173i = f99a;
        try {
            typeface = (Typeface) c1173i.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new i(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new i(typeface);
        }
        C1125E a3 = e.a(context, list);
        int i5 = a3.f9994a;
        List list2 = (List) a3.f9995b;
        if (i5 != 0) {
            if (i5 == 1) {
                i4 = -2;
                if (i4 == 0) {
                    return new i(i4);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    k[] kVarArr = (k[]) list2.get(0);
                    android.support.v4.media.session.a aVar = x.c.f10698a;
                    Trace.beginSection(S0.a.N("TypefaceCompat.createFromFontInfo"));
                    m3 = x.c.f10698a.m(context, kVarArr, i3);
                    Trace.endSection();
                    if (m3 != null) {
                        return new i(-3);
                    }
                    c1173i.b(str, m3);
                    return new i(m3);
                }
                android.support.v4.media.session.a aVar2 = x.c.f10698a;
                Trace.beginSection(S0.a.N("TypefaceCompat.createFromFontInfoWithFallback"));
                m3 = x.c.f10698a.n(context, list2, i3);
                Trace.endSection();
                if (m3 != null) {
                }
            }
            i4 = -3;
            if (i4 == 0) {
            }
        } else {
            k[] kVarArr2 = (k[]) list2.get(0);
            if (kVarArr2 != null && kVarArr2.length != 0) {
                int length = kVarArr2.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        i4 = 0;
                        break;
                    }
                    int i7 = kVarArr2[i6].f;
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
        Trace.endSection();
    }
}
