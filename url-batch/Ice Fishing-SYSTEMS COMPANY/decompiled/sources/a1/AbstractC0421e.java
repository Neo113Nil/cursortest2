package a1;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import k1.C4628a;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0421e {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0418b f4304c;

    /* renamed from: e, reason: collision with root package name */
    public S0.s f4306e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4302a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f4303b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f4305d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f4307f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f4308g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f4309h = -1.0f;

    public AbstractC0421e(List list) {
        InterfaceC0418b c0420d;
        if (list.isEmpty()) {
            c0420d = new W3.e(10);
        } else {
            c0420d = list.size() == 1 ? new C0420d(list) : new C0419c(list);
        }
        this.f4304c = c0420d;
    }

    public final void a(InterfaceC0417a interfaceC0417a) {
        this.f4302a.add(interfaceC0417a);
    }

    public float b() {
        if (this.f4309h == -1.0f) {
            this.f4309h = this.f4304c.m();
        }
        return this.f4309h;
    }

    public final float c() {
        Interpolator interpolator;
        C4628a h9 = this.f4304c.h();
        if (h9 == null || h9.c() || (interpolator = h9.f38674d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(d());
    }

    public final float d() {
        if (this.f4303b) {
            return 0.0f;
        }
        C4628a h9 = this.f4304c.h();
        if (h9.c()) {
            return 0.0f;
        }
        return (this.f4305d - h9.b()) / (h9.a() - h9.b());
    }

    public Object e() {
        Interpolator interpolator;
        float d2 = d();
        S0.s sVar = this.f4306e;
        InterfaceC0418b interfaceC0418b = this.f4304c;
        if (sVar == null && interfaceC0418b.g(d2) && !k()) {
            return this.f4307f;
        }
        C4628a h9 = interfaceC0418b.h();
        Interpolator interpolator2 = h9.f38675e;
        Object f6 = (interpolator2 == null || (interpolator = h9.f38676f) == null) ? f(h9, c()) : g(h9, d2, interpolator2.getInterpolation(d2), interpolator.getInterpolation(d2));
        this.f4307f = f6;
        return f6;
    }

    public abstract Object f(C4628a c4628a, float f6);

    public Object g(C4628a c4628a, float f6, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4302a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0417a) arrayList.get(i)).a();
            i++;
        }
    }

    public void i(float f6) {
        InterfaceC0418b interfaceC0418b = this.f4304c;
        if (interfaceC0418b.isEmpty()) {
            return;
        }
        if (this.f4308g == -1.0f) {
            this.f4308g = interfaceC0418b.n();
        }
        float f9 = this.f4308g;
        if (f6 < f9) {
            if (f9 == -1.0f) {
                this.f4308g = interfaceC0418b.n();
            }
            f6 = this.f4308g;
        } else if (f6 > b()) {
            f6 = b();
        }
        if (f6 == this.f4305d) {
            return;
        }
        this.f4305d = f6;
        if (interfaceC0418b.i(f6)) {
            h();
        }
    }

    public final void j(S0.s sVar) {
        S0.s sVar2 = this.f4306e;
        if (sVar2 != null) {
            sVar2.getClass();
        }
        this.f4306e = sVar;
    }

    public boolean k() {
        return false;
    }
}
