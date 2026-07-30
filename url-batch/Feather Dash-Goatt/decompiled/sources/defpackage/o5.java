package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class o5 implements xu, ir1 {
    public Context d;

    public o5(Context context, int i) {
        switch (i) {
            case 2:
                this.d = context.getApplicationContext();
                break;
            default:
                this.d = context.getApplicationContext();
                break;
        }
    }

    @Override // defpackage.kr1
    public Object a() {
        return this.d;
    }

    @Override // defpackage.xu
    public void b(la0 la0Var) {
        bm bmVar = new bm("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), bmVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new lq(this, la0Var, threadPoolExecutor, 1));
    }

    public io c() {
        Context context = this.d;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        io ioVar = new io();
        ioVar.d = ys.a(m90.j);
        l90 l90Var = new l90(context);
        ioVar.e = l90Var;
        ioVar.g = ys.a(new yw(l90Var, 18, new s40(15, l90Var)));
        l90 l90Var2 = ioVar.e;
        ioVar.h = new kw(l90Var2, 1);
        o01 a = ys.a(new c51(ioVar.h, 0, ys.a(new kw(l90Var2, 0))));
        ioVar.i = a;
        a60 a60Var = new a60(29);
        l90 l90Var3 = ioVar.e;
        i8 i8Var = new i8(l90Var3, a, a60Var, 20);
        o01 o01Var = ioVar.d;
        o01 o01Var2 = ioVar.g;
        mc mcVar = new mc(o01Var, o01Var2, i8Var, a, a);
        ek ekVar = new ek();
        ekVar.d = l90Var3;
        ekVar.e = o01Var2;
        ekVar.g = a;
        ekVar.h = i8Var;
        ekVar.i = o01Var;
        ekVar.j = a;
        ekVar.k = a;
        ioVar.j = ys.a(new i8(mcVar, ekVar, new o91(o01Var, a, i8Var, a), 23));
        return ioVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface d(c31 c31Var) {
        int i;
        String str;
        int i2;
        Context context = this.d;
        if (!(c31Var instanceof c31)) {
            return null;
        }
        Typeface d = mo.d(c31Var, context);
        w20 w20Var = c31Var.b;
        ThreadLocal threadLocal = xj1.a;
        if (d == null) {
            return null;
        }
        ArrayList arrayList = w20Var.a;
        if (arrayList.isEmpty()) {
            return d;
        }
        ThreadLocal threadLocal2 = xj1.a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(d);
        pr k = yr1.k(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    str = zh0.a(arrayList, null, new q1(k), 31);
                } else {
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        af.c();
                        return null;
                    }
                    float b = b11.b(i + 400.0f, 1.0f, 1000.0f);
                    str = (arrayList.isEmpty() ? "" : "".concat(",")) + "'wght' " + b;
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

    public /* synthetic */ o5(Context context, byte b) {
        this.d = context;
    }
}
