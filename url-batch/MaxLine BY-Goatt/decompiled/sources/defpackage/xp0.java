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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xp0 {
    public static final yg1 a = new yg1(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final fl2 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new d92());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new fl2(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((rp0) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b5, all -> 0x0074, all -> 0x00a6, NameNotFoundException -> 0x00ab, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x004e, B:19:0x0057, B:21:0x005d, B:23:0x0063, B:26:0x0070, B:28:0x0091, B:31:0x009d, B:36:0x0075, B:37:0x0078, B:38:0x0079, B:41:0x008c, B:44:0x00a7, B:45:0x00aa, B:47:0x002b, B:49:0x0033, B:52:0x0037, B:54:0x003b, B:56:0x0046, B:65:0x00ab, B:25:0x006a, B:40:0x0086), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wp0 b(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface e;
        yg1 yg1Var = a;
        ak2.f("getFontSync");
        try {
            typeface = (Typeface) yg1Var.c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new wp0(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new wp0(typeface);
        }
        lq0 a2 = qp0.a(context, list);
        List list2 = a2.b;
        int i3 = a2.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new wp0(i2);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    mq0[] mq0VarArr = (mq0[]) list2.get(0);
                    th2 th2Var = w03.a;
                    ak2.f("TypefaceCompat.createFromFontInfo");
                    e = w03.a.e(context, mq0VarArr, i);
                    Trace.endSection();
                    if (e != null) {
                        return new wp0(-3);
                    }
                    yg1Var.d(str, e);
                    return new wp0(e);
                }
                th2 th2Var2 = w03.a;
                ak2.f("TypefaceCompat.createFromFontInfoWithFallback");
                e = w03.a.f(context, list2, i);
                Trace.endSection();
                if (e != null) {
                }
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            mq0[] mq0VarArr2 = (mq0[]) list2.get(0);
            if (mq0VarArr2 != null && mq0VarArr2.length != 0) {
                int length = mq0VarArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = mq0VarArr2[i4].f;
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
