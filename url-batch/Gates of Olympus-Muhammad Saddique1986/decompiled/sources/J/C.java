package J;

import B.C0014o;
import I.C0174t;
import I.H0;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f3102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3103b;

    public C(int i3, int i4) {
        this.f3102a = i3;
        this.f3103b = i4;
    }

    public abstract void a(C0014o c0014o, G1.m mVar, H0 h02, C0174t c0174t);

    public String b(int i3) {
        return "IntParameter(" + i3 + ')';
    }

    public String c(int i3) {
        return "ObjectParameter(" + i3 + ')';
    }

    public final String toString() {
        String b3 = f2.v.a(getClass()).b();
        return b3 == null ? "" : b3;
    }

    public /* synthetic */ C(int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i3, (i5 & 2) != 0 ? 0 : i4);
    }
}
