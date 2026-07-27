package G;

import kotlin.jvm.functions.Function0;

/* renamed from: G.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235z extends AbstractC0217p0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2978b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2979c;

    public C0235z(M0 m02, Function0 function0) {
        super(function0);
        this.f2979c = m02;
    }

    @Override // G.AbstractC0217p0
    public final C0219q0 a(Object obj) {
        switch (this.f2978b) {
            case 0:
                return new C0219q0(this, obj, obj == null, null, true);
            default:
                return new C0219q0(this, obj, obj == null, (M0) this.f2979c, true);
        }
    }

    @Override // G.AbstractC0217p0
    public a1 b() {
        switch (this.f2978b) {
            case 0:
                return (A) this.f2979c;
            default:
                return super.b();
        }
    }

    public C0235z() {
        super(C0186a.f2786i);
        this.f2979c = new A();
    }
}
