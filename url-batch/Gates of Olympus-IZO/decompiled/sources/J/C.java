package J;

import D1.C0014b;
import I.C0120t;
import I.I0;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public final int f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2524b;

    public C(int i3, int i4) {
        this.f2523a = i3;
        this.f2524b = i4;
    }

    public abstract void a(D d3, C0014b c0014b, I0 i02, C0120t c0120t);

    public String b(int i3) {
        return "IntParameter(" + i3 + ')';
    }

    public String c(int i3) {
        return "ObjectParameter(" + i3 + ')';
    }

    public final String toString() {
        String b2 = Z1.u.a(getClass()).b();
        return b2 == null ? "" : b2;
    }

    public /* synthetic */ C(int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i3, (i5 & 2) != 0 ? 0 : i4);
    }
}
