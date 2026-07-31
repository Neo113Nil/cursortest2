package u0;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1094d extends AbstractC1090b {

    /* renamed from: e, reason: collision with root package name */
    public static C1094d f9328e;

    /* renamed from: c, reason: collision with root package name */
    public C0.H f9329c;

    /* renamed from: d, reason: collision with root package name */
    public A0.p f9330d;

    @Override // u0.AbstractC1090b
    public final int[] a(int i3) {
        int i4;
        if (c().length() <= 0 || i3 >= c().length()) {
            return null;
        }
        try {
            A0.p pVar = this.f9330d;
            if (pVar == null) {
                f2.j.j("node");
                throw null;
            }
            int round = Math.round(pVar.e().b());
            if (i3 <= 0) {
                i3 = 0;
            }
            C0.H h3 = this.f9329c;
            if (h3 == null) {
                f2.j.j("layoutResult");
                throw null;
            }
            int e3 = h3.e(i3);
            C0.H h4 = this.f9329c;
            if (h4 == null) {
                f2.j.j("layoutResult");
                throw null;
            }
            float d3 = h4.f558b.d(e3) + round;
            C0.H h5 = this.f9329c;
            if (h5 == null) {
                f2.j.j("layoutResult");
                throw null;
            }
            if (h5 == null) {
                f2.j.j("layoutResult");
                throw null;
            }
            if (d3 < h5.f558b.d(r0.f623f - 1)) {
                C0.H h6 = this.f9329c;
                if (h6 == null) {
                    f2.j.j("layoutResult");
                    throw null;
                }
                i4 = h6.f558b.c(d3);
            } else {
                C0.H h7 = this.f9329c;
                if (h7 == null) {
                    f2.j.j("layoutResult");
                    throw null;
                }
                i4 = h7.f558b.f623f;
            }
            return b(i3, e(i4 - 1, N0.h.f3544d) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // u0.AbstractC1090b
    public final int[] d(int i3) {
        int i4;
        if (c().length() <= 0 || i3 <= 0) {
            return null;
        }
        try {
            A0.p pVar = this.f9330d;
            if (pVar == null) {
                f2.j.j("node");
                throw null;
            }
            int round = Math.round(pVar.e().b());
            int length = c().length();
            if (length <= i3) {
                i3 = length;
            }
            C0.H h3 = this.f9329c;
            if (h3 == null) {
                f2.j.j("layoutResult");
                throw null;
            }
            int e3 = h3.e(i3);
            C0.H h4 = this.f9329c;
            if (h4 == null) {
                f2.j.j("layoutResult");
                throw null;
            }
            float d3 = h4.f558b.d(e3) - round;
            if (d3 > 0.0f) {
                C0.H h5 = this.f9329c;
                if (h5 == null) {
                    f2.j.j("layoutResult");
                    throw null;
                }
                i4 = h5.f558b.c(d3);
            } else {
                i4 = 0;
            }
            if (i3 == c().length() && i4 < e3) {
                i4++;
            }
            return b(e(i4, N0.h.f3545e), i3);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i3, N0.h hVar) {
        C0.H h3 = this.f9329c;
        if (h3 == null) {
            f2.j.j("layoutResult");
            throw null;
        }
        int h4 = h3.h(i3);
        C0.H h5 = this.f9329c;
        if (h5 == null) {
            f2.j.j("layoutResult");
            throw null;
        }
        if (hVar != h5.i(h4)) {
            C0.H h6 = this.f9329c;
            if (h6 != null) {
                return h6.h(i3);
            }
            f2.j.j("layoutResult");
            throw null;
        }
        if (this.f9329c != null) {
            return r6.d(i3, false) - 1;
        }
        f2.j.j("layoutResult");
        throw null;
    }
}
