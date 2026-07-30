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

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class hc0 {
    public static final b41 PxuCJdSBwIXG = new b41(16);
    public static final Object TSizfFm2Yiuu;
    public static final t52 Y1f8riQaR6yg;
    public static final ThreadPoolExecutor lS5Rgt96tfkO;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new cv1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        lS5Rgt96tfkO = threadPoolExecutor;
        TSizfFm2Yiuu = new Object();
        Y1f8riQaR6yg = new t52(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gc0 PxuCJdSBwIXG(String str, Context context, List list) {
        Typeface typeface;
        int i;
        Typeface x50lh2ztY7Y5;
        b41 b41Var = PxuCJdSBwIXG;
        sj0.wdg6QnbFHrFF("getFontSync");
        try {
            typeface = (Typeface) b41Var.TSizfFm2Yiuu(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new gc0(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new gc0(typeface);
        }
        um PxuCJdSBwIXG2 = ac0.PxuCJdSBwIXG(context, list);
        List list2 = (List) PxuCJdSBwIXG2.TSizfFm2Yiuu;
        int i2 = PxuCJdSBwIXG2.lS5Rgt96tfkO;
        if (i2 != 0) {
            if (i2 == 1) {
                i = -2;
                if (i == 0) {
                    return new gc0(i);
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    zc0[] zc0VarArr = (zc0[]) list2.get(0);
                    vi0 vi0Var = pm2.PxuCJdSBwIXG;
                    sj0.wdg6QnbFHrFF("TypefaceCompat.createFromFontInfo");
                    x50lh2ztY7Y5 = pm2.PxuCJdSBwIXG.x50lh2ztY7Y5(context, zc0VarArr);
                    Trace.endSection();
                    if (x50lh2ztY7Y5 != null) {
                        return new gc0(-3);
                    }
                    b41Var.Y1f8riQaR6yg(str, x50lh2ztY7Y5);
                    return new gc0(x50lh2ztY7Y5);
                }
                vi0 vi0Var2 = pm2.PxuCJdSBwIXG;
                sj0.wdg6QnbFHrFF("TypefaceCompat.createFromFontInfoWithFallback");
                x50lh2ztY7Y5 = pm2.PxuCJdSBwIXG.cpQdD2nAriOS(context, list2);
                Trace.endSection();
                if (x50lh2ztY7Y5 != null) {
                }
            }
            i = -3;
            if (i == 0) {
            }
        } else {
            zc0[] zc0VarArr2 = (zc0[]) list2.get(0);
            if (zc0VarArr2 != null && zc0VarArr2.length != 0) {
                int length = zc0VarArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i = 0;
                        break;
                    }
                    int i4 = zc0VarArr2[i3].a92UlCVFR9N8;
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
