package B;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import i2.AbstractC0457a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x.AbstractC1516e;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p.i f172a = new p.i(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f173b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f174c;

    /* renamed from: d, reason: collision with root package name */
    public static final p.j f175d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f173b = threadPoolExecutor;
        f174c = new Object();
        f175d = new p.j(0);
    }

    public static String a(int i4, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((f) list.get(i5)).f162g);
            sb.append(TokenBuilder.TOKEN_DELIMITER);
            sb.append(i4);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, all -> 0x00b2, NameNotFoundException -> 0x00b7, all -> 0x007c, blocks: (B:3:0x000b, B:5:0x0013, B:10:0x001c, B:11:0x0020, B:16:0x0052, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:26:0x0078, B:28:0x009d, B:31:0x00a9, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:41:0x0098, B:44:0x00b3, B:45:0x00b6, B:47:0x002f, B:49:0x0037, B:52:0x003b, B:54:0x003f, B:56:0x004a, B:65:0x00b7, B:40:0x0092, B:25:0x0072), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i b(String str, Context context, List list, int i4) {
        Typeface typeface;
        int i5;
        Typeface j4;
        p.i iVar = f172a;
        Trace.beginSection(AbstractC0457a.E("getFontSync"));
        try {
            typeface = (Typeface) iVar.a(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new i(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
        if (typeface != null) {
            return new i(typeface);
        }
        k a3 = e.a(context, list);
        List list2 = a3.f177b;
        int i6 = a3.f176a;
        if (i6 != 0) {
            if (i6 == 1) {
                i5 = -2;
                if (i5 == 0) {
                    return new i(i5);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    l[] lVarArr = (l[]) list2.get(0);
                    O3.l lVar = AbstractC1516e.f15959a;
                    Trace.beginSection(AbstractC0457a.E("TypefaceCompat.createFromFontInfo"));
                    j4 = AbstractC1516e.f15959a.j(context, lVarArr, i4);
                    Trace.endSection();
                    if (j4 != null) {
                        return new i(-3);
                    }
                    iVar.b(str, j4);
                    return new i(j4);
                }
                O3.l lVar2 = AbstractC1516e.f15959a;
                Trace.beginSection(AbstractC0457a.E("TypefaceCompat.createFromFontInfoWithFallback"));
                j4 = AbstractC1516e.f15959a.k(context, list2, i4);
                Trace.endSection();
                if (j4 != null) {
                }
            }
            i5 = -3;
            if (i5 == 0) {
            }
        } else {
            l[] lVarArr2 = (l[]) list2.get(0);
            if (lVarArr2 != null && lVarArr2.length != 0) {
                int length = lVarArr2.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        i5 = 0;
                        break;
                    }
                    int i8 = lVarArr2[i7].f183f;
                    if (i8 == 0) {
                        i7++;
                    } else if (i8 >= 0) {
                        i5 = i8;
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
