package I;

import e2.InterfaceC0422a;

/* renamed from: I.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0168p0 {

    /* renamed from: a, reason: collision with root package name */
    public final U f2891a;

    public AbstractC0168p0(InterfaceC0422a interfaceC0422a) {
        this.f2891a = new U(interfaceC0422a);
    }

    public abstract C0170q0 a(Object obj);

    public Z0 b() {
        return this.f2891a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Z0 c(C0170q0 c0170q0, Z0 z02) {
        Z0 y02;
        J j3 = null;
        if (z02 instanceof J) {
            if (c0170q0.f2895d) {
                j3 = (J) z02;
                j3.f2712a.setValue(c0170q0.a());
            }
        } else if (z02 instanceof Y0) {
            if ((c0170q0.f2893b || c0170q0.f2896e != null) && !c0170q0.f2895d) {
                Y0 y03 = (Y0) z02;
                if (f2.j.a(c0170q0.a(), y03.f2787a)) {
                    j3 = y03;
                }
            }
        } else if (z02 instanceof A) {
            c0170q0.getClass();
            ((A) z02).getClass();
        }
        if (j3 != null) {
            return j3;
        }
        if (c0170q0.f2895d) {
            M0 m02 = c0170q0.f2894c;
            if (m02 == null) {
                m02 = W.f2783i;
            }
            y02 = new J(C0143d.K(c0170q0.f2896e, m02));
        } else {
            y02 = new Y0(c0170q0.a());
        }
        return y02;
    }
}
