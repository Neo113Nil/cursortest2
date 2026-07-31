package b0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import s2.EnumC0967a;
import t2.InterfaceC1053f;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339h {

    /* renamed from: a, reason: collision with root package name */
    public int f5414a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5415b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5416c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5417d;

    public C0339h(Paint paint) {
        this.f5415b = paint;
        this.f5414a = 3;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f5415b).getStrokeCap();
        int i3 = strokeCap == null ? -1 : AbstractC0340i.f5418a[strokeCap.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f5415b).getStrokeJoin();
        int i3 = strokeJoin == null ? -1 : AbstractC0340i.f5419b[strokeJoin.ordinal()];
        if (i3 == 1) {
            return 0;
        }
        if (i3 != 2) {
            return i3 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f3) {
        ((Paint) this.f5415b).setAlpha((int) Math.rint(f3 * 255.0f));
    }

    public void d(int i3) {
        if (M.p(this.f5414a, i3)) {
            return;
        }
        this.f5414a = i3;
        int i4 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f5415b;
        if (i4 >= 29) {
            V.f5403a.a(paint, i3);
        } else {
            paint.setXfermode(new PorterDuffXfermode(M.G(i3)));
        }
    }

    public void e(long j3) {
        ((Paint) this.f5415b).setColor(M.D(j3));
    }

    public void f(C0344m c0344m) {
        this.f5417d = c0344m;
        ((Paint) this.f5415b).setColorFilter(c0344m != null ? c0344m.f5424a : null);
    }

    public void g(int i3) {
        ((Paint) this.f5415b).setStrokeCap(M.s(i3, 2) ? Paint.Cap.SQUARE : M.s(i3, 1) ? Paint.Cap.ROUND : M.s(i3, 0) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void h(int i3) {
        ((Paint) this.f5415b).setStrokeJoin(M.t(i3, 0) ? Paint.Join.MITER : M.t(i3, 2) ? Paint.Join.BEVEL : M.t(i3, 1) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void i(int i3) {
        ((Paint) this.f5415b).setStyle(i3 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public C0339h(int i3, V1.i iVar, EnumC0967a enumC0967a, InterfaceC1053f interfaceC1053f) {
        this.f5415b = interfaceC1053f;
        this.f5414a = i3;
        this.f5416c = enumC0967a;
        this.f5417d = iVar;
    }
}
