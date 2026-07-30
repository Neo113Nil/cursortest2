package f7;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import z0.t0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3487a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3488b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3489c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3490d;

    public i0(Paint paint) {
        this.f3488b = paint;
        this.f3487a = 3;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f3488b).getStrokeCap();
        int i7 = strokeCap == null ? -1 : z0.i.f9998a[strokeCap.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f3488b).getStrokeJoin();
        int i7 = strokeJoin == null ? -1 : z0.i.f9999b[strokeJoin.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f9) {
        ((Paint) this.f3488b).setAlpha((int) Math.rint(f9 * 255.0f));
    }

    public void d(int i7) {
        if (this.f3487a == i7) {
            return;
        }
        this.f3487a = i7;
        Paint paint = (Paint) this.f3488b;
        if (Build.VERSION.SDK_INT >= 29) {
            t0.f10051a.a(paint, i7);
        } else {
            paint.setXfermode(new PorterDuffXfermode(z0.l0.z(i7)));
        }
    }

    public void e(long j8) {
        ((Paint) this.f3488b).setColor(z0.l0.w(j8));
    }

    public void f(z0.m mVar) {
        this.f3490d = mVar;
        ((Paint) this.f3488b).setColorFilter(mVar != null ? mVar.f10010a : null);
    }

    public void g(int i7) {
        ((Paint) this.f3488b).setFilterBitmap(!(i7 == 0));
    }

    public void h(Shader shader) {
        this.f3489c = shader;
        ((Paint) this.f3488b).setShader(shader);
    }

    public void i(int i7) {
        ((Paint) this.f3488b).setStrokeCap(i7 == 2 ? Paint.Cap.SQUARE : i7 == 1 ? Paint.Cap.ROUND : i7 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void j(int i7) {
        ((Paint) this.f3488b).setStrokeJoin(i7 == 0 ? Paint.Join.MITER : i7 == 2 ? Paint.Join.BEVEL : i7 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void k(float f9) {
        ((Paint) this.f3488b).setStrokeWidth(f9);
    }

    public void l(int i7) {
        ((Paint) this.f3488b).setStyle(i7 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public i0(int i7, e7.a aVar, f fVar, h6.i iVar) {
        this.f3488b = fVar;
        this.f3487a = i7;
        this.f3489c = aVar;
        this.f3490d = iVar;
    }
}
