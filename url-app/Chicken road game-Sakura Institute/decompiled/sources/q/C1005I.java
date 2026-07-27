package q;

import A.AbstractC0017m;
import i.C0673h;
import l.AbstractC0784j;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import y2.C1338m;

/* renamed from: q.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005I {

    /* renamed from: a, reason: collision with root package name */
    public final int f9163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9164b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0944E f9165c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0954O f9166d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0944E f9167e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0954O f9168f;

    /* renamed from: g, reason: collision with root package name */
    public C0673h f9169g;

    /* renamed from: h, reason: collision with root package name */
    public C0673h f9170h;

    public C1005I(int i2, int i4) {
        this.f9163a = i2;
        this.f9164b = i4;
    }

    public final C0673h a(int i2, int i4, boolean z4) {
        int d4 = AbstractC0784j.d(2);
        if (d4 == 0 || d4 == 1) {
            return null;
        }
        if (d4 == 2) {
            if (z4) {
                return this.f9169g;
            }
            return null;
        }
        if (d4 != 3) {
            throw new C1338m();
        }
        if (z4) {
            return this.f9169g;
        }
        if (i2 + 1 < this.f9163a || i4 < this.f9164b) {
            return null;
        }
        return this.f9170h;
    }

    public final void b(InterfaceC0944E interfaceC0944E, InterfaceC0944E interfaceC0944E2, long j4) {
        long c4 = AbstractC1024c.c(j4, 1);
        if (interfaceC0944E != null) {
            int S3 = interfaceC0944E.S(M0.a.h(c4));
            this.f9169g = new C0673h(C0673h.a(S3, interfaceC0944E.Z(S3)));
            this.f9165c = interfaceC0944E;
            this.f9166d = null;
        }
        if (interfaceC0944E2 != null) {
            int S4 = interfaceC0944E2.S(M0.a.h(c4));
            this.f9170h = new C0673h(C0673h.a(S4, interfaceC0944E2.Z(S4)));
            this.f9167e = interfaceC0944E2;
            this.f9168f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005I)) {
            return false;
        }
        C1005I c1005i = (C1005I) obj;
        c1005i.getClass();
        return this.f9163a == c1005i.f9163a && this.f9164b == c1005i.f9164b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9164b) + AbstractC0784j.c(this.f9163a, AbstractC0784j.d(2) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append("Clip");
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.f9163a);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        return AbstractC0017m.l(sb, this.f9164b, ')');
    }
}
