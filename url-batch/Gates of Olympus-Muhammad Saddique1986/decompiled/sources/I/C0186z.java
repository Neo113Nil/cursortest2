package I;

import e2.InterfaceC0422a;

/* renamed from: I.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186z extends AbstractC0168p0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2980b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2981c;

    public C0186z(M0 m02, InterfaceC0422a interfaceC0422a) {
        super(interfaceC0422a);
        this.f2981c = m02;
    }

    @Override // I.AbstractC0168p0
    public final C0170q0 a(Object obj) {
        switch (this.f2980b) {
            case 0:
                return new C0170q0(this, obj, obj == null, null, true);
            default:
                return new C0170q0(this, obj, obj == null, (M0) this.f2981c, true);
        }
    }

    @Override // I.AbstractC0168p0
    public Z0 b() {
        switch (this.f2980b) {
            case 0:
                return (A) this.f2981c;
            default:
                return super.b();
        }
    }

    public C0186z() {
        super(C0137a.f2789g);
        this.f2981c = new A();
    }
}
