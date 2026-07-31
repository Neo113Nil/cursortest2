package F;

import b0.C0352v;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements b0.w, f2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0 f1817a;

    public t1(P0 p02) {
        this.f1817a = p02;
    }

    @Override // b0.w
    public final long a() {
        return ((C0352v) this.f1817a.get()).f5441a;
    }

    @Override // f2.f
    public final R1.e b() {
        return this.f1817a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0.w) || !(obj instanceof f2.f)) {
            return false;
        }
        return this.f1817a.equals(((f2.f) obj).b());
    }

    public final int hashCode() {
        return this.f1817a.hashCode();
    }
}
