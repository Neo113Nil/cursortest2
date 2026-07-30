package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q3 implements w40 {
    public final Context PxuCJdSBwIXG;

    public q3(Context context, int i) {
        switch (i) {
            case 4:
                this.PxuCJdSBwIXG = context.getApplicationContext();
                break;
            default:
                this.PxuCJdSBwIXG = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.w40
    public void PxuCJdSBwIXG(bs0 bs0Var) {
        hq hqVar = new hq("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), hqVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new i6(this, bs0Var, threadPoolExecutor, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface lS5Rgt96tfkO(mb0 mb0Var) {
        int i;
        String str;
        int i2;
        if (!(mb0Var instanceof jv1)) {
            return null;
        }
        jv1 jv1Var = (jv1) mb0Var;
        yb0.Companion.getClass();
        Context context = this.PxuCJdSBwIXG;
        Typeface dgRBjINgWbAK = bs0.dgRBjINgWbAK(jv1Var, context);
        List list = jv1Var.lS5Rgt96tfkO.PxuCJdSBwIXG;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            ThreadLocal threadLocal = sm2.PxuCJdSBwIXG;
            if (dgRBjINgWbAK == null) {
                return null;
            }
            if (!list.isEmpty()) {
                ThreadLocal threadLocal2 = sm2.PxuCJdSBwIXG;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(dgRBjINgWbAK);
                my lS5Rgt96tfkO = f2.lS5Rgt96tfkO(context);
                if (i3 >= 31) {
                    i2 = context.getResources().getConfiguration().fontWeightAdjustment;
                    if (i2 != Integer.MAX_VALUE) {
                        i = context.getResources().getConfiguration().fontWeightAdjustment;
                        if (i != 0) {
                            str = c21.PxuCJdSBwIXG(list, null, new xy0(lS5Rgt96tfkO), 31);
                        } else {
                            if (list.size() > 0) {
                                list.get(0).getClass();
                                u9.VhhvGxCb8gfr();
                                return null;
                            }
                            float OPXfSBeufaJ8 = ng0.OPXfSBeufaJ8(i + 400.0f, 1.0f, 1000.0f);
                            str = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + OPXfSBeufaJ8;
                        }
                        paint.setFontVariationSettings(str);
                        return paint.getTypeface();
                    }
                }
                i = 0;
                if (i != 0) {
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        return dgRBjINgWbAK;
    }

    public /* synthetic */ q3(Context context, byte b) {
        this.PxuCJdSBwIXG = context;
    }
}
