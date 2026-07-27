package H;

import A.C0020p;
import B1.C0097d;
import G.C0223t;
import G.H0;
import M2.F;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3173b;

    public C(int i2, int i4) {
        this.f3172a = i2;
        this.f3173b = i4;
    }

    public abstract void a(C0020p c0020p, C0097d c0097d, H0 h02, C0223t c0223t);

    public String b(int i2) {
        return "IntParameter(" + i2 + ')';
    }

    public String c(int i2) {
        return "ObjectParameter(" + i2 + ')';
    }

    public final String toString() {
        String b4 = F.a(getClass()).b();
        return b4 == null ? "" : b4;
    }

    public /* synthetic */ C(int i2, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i4);
    }
}
