package b0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import m2.EnumC0626a;
import n2.InterfaceC0700f;

/* renamed from: b0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276i {

    /* renamed from: a, reason: collision with root package name */
    public int f4272a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4273b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4274c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4275d;

    public C0276i(Paint paint) {
        this.f4273b = paint;
        this.f4272a = 3;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f4273b).getStrokeCap();
        int i3 = strokeCap == null ? -1 : AbstractC0277j.f4276a[strokeCap.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f4273b).getStrokeJoin();
        int i3 = strokeJoin == null ? -1 : AbstractC0277j.f4277b[strokeJoin.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f3) {
        ((Paint) this.f4273b).setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public void d(int i3) {
        if (AbstractC0259J.n(this.f4272a, i3)) {
            return;
        }
        this.f4272a = i3;
        int i4 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f4273b;
        if (i4 >= 29) {
            C0267S.f4261a.a(paint, i3);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC0259J.G(i3)));
        }
    }

    public void e(long j3) {
        ((Paint) this.f4273b).setColor(AbstractC0259J.E(j3));
    }

    public void f(C0281n c0281n) {
        this.f4275d = c0281n;
        ((Paint) this.f4273b).setColorFilter(c0281n != null ? c0281n.f4282a : null);
    }

    public void g(Shader shader) {
        this.f4274c = shader;
        ((Paint) this.f4273b).setShader(shader);
    }

    public void h(int i3) {
        ((Paint) this.f4273b).setStrokeCap(AbstractC0259J.q(i3, 2) ? Paint.Cap.SQUARE : AbstractC0259J.q(i3, 1) ? Paint.Cap.ROUND : AbstractC0259J.q(i3, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void i(int i3) {
        ((Paint) this.f4273b).setStrokeJoin(AbstractC0259J.r(i3, 0) ? Paint.Join.MITER : AbstractC0259J.r(i3, 2) ? Paint.Join.BEVEL : AbstractC0259J.r(i3, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void j(int i3) {
        ((Paint) this.f4273b).setStyle(i3 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public C0276i(int i3, P1.i iVar, EnumC0626a enumC0626a, InterfaceC0700f interfaceC0700f) {
        this.f4273b = interfaceC0700f;
        this.f4272a = i3;
        this.f4274c = enumC0626a;
        this.f4275d = iVar;
    }
}
