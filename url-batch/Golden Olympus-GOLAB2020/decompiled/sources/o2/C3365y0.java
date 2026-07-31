package o2;

/* renamed from: o2.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3365y0 extends D0 implements InterfaceC3366z {

    /* renamed from: d, reason: collision with root package name */
    private final boolean f42108d;

    public C3365y0(InterfaceC3359v0 interfaceC3359v0) {
        super(true);
        h0(interfaceC3359v0);
        this.f42108d = O0();
    }

    private final boolean O0() {
        D0 u4;
        InterfaceC3354t b02 = b0();
        C3356u c3356u = b02 instanceof C3356u ? (C3356u) b02 : null;
        if (c3356u != null && (u4 = c3356u.u()) != null) {
            while (!u4.X()) {
                InterfaceC3354t b03 = u4.b0();
                C3356u c3356u2 = b03 instanceof C3356u ? (C3356u) b03 : null;
                if (c3356u2 != null && (u4 = c3356u2.u()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o2.D0
    public boolean X() {
        return this.f42108d;
    }

    @Override // o2.D0
    public boolean Z() {
        return true;
    }
}
