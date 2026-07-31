package f1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f2659a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2660b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2661c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2662d;

    public h(o4.d dVar, int i) {
        this.f2660b = dVar.i;
        this.f2659a = i;
        r4.c cVar = dVar.f5626k;
        this.f2661c = cVar.a();
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        this.f2662d = j7;
        cVar.f6570h.e(j7);
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f2660b).getStrokeCap();
        int i = strokeCap == null ? -1 : i.f2667a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f2660b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : i.f2668b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f6) {
        ((Paint) this.f2660b).setAlpha((int) Math.rint(f6 * 255.0f));
    }

    public void d(int i) {
        if (this.f2659a == i) {
            return;
        }
        this.f2659a = i;
        Paint paint = (Paint) this.f2660b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(p.r(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(p.x(i)));
        }
    }

    public void e(long j7) {
        ((Paint) this.f2660b).setColor(p.u(j7));
    }

    public void f(m mVar) {
        this.f2662d = mVar;
        ((Paint) this.f2660b).setColorFilter(mVar != null ? mVar.f2686a : null);
    }

    public void g(Shader shader) {
        this.f2661c = shader;
        ((Paint) this.f2660b).setShader(shader);
    }

    public void h(int i) {
        ((Paint) this.f2660b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void i(int i) {
        ((Paint) this.f2660b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void j(int i) {
        ((Paint) this.f2660b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public h(Paint paint) {
        this.f2660b = paint;
        this.f2659a = 3;
    }

    public h(Bundle bundle) {
        q6.i.e(bundle, "state");
        String string = bundle.getString("nav-entry-state:id");
        if (string != null) {
            this.f2660b = string;
            int i = bundle.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
            if (i == Integer.MIN_VALUE && bundle.getInt("nav-entry-state:destination-id", Integer.MAX_VALUE) == Integer.MAX_VALUE) {
                r2.r.F("nav-entry-state:destination-id");
                throw null;
            }
            this.f2659a = i;
            this.f2661c = r2.o.M("nav-entry-state:args", bundle);
            this.f2662d = r2.o.M("nav-entry-state:saved-state", bundle);
            return;
        }
        r2.r.F("nav-entry-state:id");
        throw null;
    }
}
