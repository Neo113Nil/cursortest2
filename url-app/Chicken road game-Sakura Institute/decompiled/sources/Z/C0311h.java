package Z;

import Z2.InterfaceC0330f;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311h {

    /* renamed from: a, reason: collision with root package name */
    public int f4524a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4525b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4526c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4527d;

    public C0311h(Paint paint) {
        this.f4525b = paint;
        this.f4524a = 3;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f4525b).getStrokeCap();
        int i2 = strokeCap == null ? -1 : AbstractC0312i.f4528a[strokeCap.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f4525b).getStrokeJoin();
        int i2 = strokeJoin == null ? -1 : AbstractC0312i.f4529b[strokeJoin.ordinal()];
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f4) {
        ((Paint) this.f4525b).setAlpha((int) Math.rint(f4 * 255.0f));
    }

    public void d(int i2) {
        if (K.o(this.f4524a, i2)) {
            return;
        }
        this.f4524a = i2;
        int i4 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f4525b;
        if (i4 >= 29) {
            V.f4513a.a(paint, i2);
        } else {
            paint.setXfermode(new PorterDuffXfermode(K.G(i2)));
        }
    }

    public void e(long j4) {
        ((Paint) this.f4525b).setColor(K.D(j4));
    }

    public void f(C0316m c0316m) {
        this.f4527d = c0316m;
        ((Paint) this.f4525b).setColorFilter(c0316m != null ? c0316m.f4534a : null);
    }

    public void g(int i2) {
        ((Paint) this.f4525b).setFilterBitmap(!K.q(i2, 0));
    }

    public void h(Shader shader) {
        this.f4526c = shader;
        ((Paint) this.f4525b).setShader(shader);
    }

    public void i(int i2) {
        ((Paint) this.f4525b).setStrokeCap(K.r(i2, 2) ? Paint.Cap.SQUARE : K.r(i2, 1) ? Paint.Cap.ROUND : K.r(i2, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void j(int i2) {
        ((Paint) this.f4525b).setStrokeJoin(K.s(i2, 0) ? Paint.Join.MITER : K.s(i2, 2) ? Paint.Join.BEVEL : K.s(i2, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void k(float f4) {
        ((Paint) this.f4525b).setStrokeWidth(f4);
    }

    public void l(int i2) {
        ((Paint) this.f4525b).setStyle(i2 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public C0311h(int i2, Y2.a aVar, InterfaceC0330f interfaceC0330f, CoroutineContext coroutineContext) {
        this.f4525b = interfaceC0330f;
        this.f4524a = i2;
        this.f4526c = aVar;
        this.f4527d = coroutineContext;
    }
}
