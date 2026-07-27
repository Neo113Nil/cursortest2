package D;

import Z.C0323u;
import Z.InterfaceC0324v;
import y2.InterfaceC1332g;

/* loaded from: classes.dex */
public final /* synthetic */ class L1 implements InterfaceC0324v, M2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f1480a;

    public L1(I0 i02) {
        this.f1480a = i02;
    }

    @Override // Z.InterfaceC0324v
    public final long a() {
        return ((C0323u) this.f1480a.get()).f4549a;
    }

    @Override // M2.k
    public final InterfaceC1332g b() {
        return this.f1480a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0324v) || !(obj instanceof M2.k)) {
            return false;
        }
        return this.f1480a.equals(((M2.k) obj).b());
    }

    public final int hashCode() {
        return this.f1480a.hashCode();
    }
}
