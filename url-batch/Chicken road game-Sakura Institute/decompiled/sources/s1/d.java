package s1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public static d f8193e;

    /* renamed from: c, reason: collision with root package name */
    public a2.h0 f8194c;

    /* renamed from: d, reason: collision with root package name */
    public y1.m f8195d;

    @Override // s1.b
    public final int[] a(int i7) {
        int i8;
        if (c().length() <= 0 || i7 >= c().length()) {
            return null;
        }
        try {
            y1.m mVar = this.f8195d;
            if (mVar == null) {
                r6.k.j("node");
                throw null;
            }
            int round = Math.round(mVar.e().b());
            if (i7 <= 0) {
                i7 = 0;
            }
            a2.h0 h0Var = this.f8194c;
            if (h0Var == null) {
                r6.k.j("layoutResult");
                throw null;
            }
            int e9 = h0Var.e(i7);
            a2.h0 h0Var2 = this.f8194c;
            if (h0Var2 == null) {
                r6.k.j("layoutResult");
                throw null;
            }
            float d8 = h0Var2.f389b.d(e9) + round;
            a2.h0 h0Var3 = this.f8194c;
            if (h0Var3 == null) {
                r6.k.j("layoutResult");
                throw null;
            }
            if (h0Var3 == null) {
                r6.k.j("layoutResult");
                throw null;
            }
            if (d8 < h0Var3.f389b.d(r0.f429f - 1)) {
                a2.h0 h0Var4 = this.f8194c;
                if (h0Var4 == null) {
                    r6.k.j("layoutResult");
                    throw null;
                }
                i8 = h0Var4.f389b.c(d8);
            } else {
                a2.h0 h0Var5 = this.f8194c;
                if (h0Var5 == null) {
                    r6.k.j("layoutResult");
                    throw null;
                }
                i8 = h0Var5.f389b.f429f;
            }
            return b(i7, e(i8 - 1, l2.h.f5873f) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // s1.b
    public final int[] d(int i7) {
        int i8;
        if (c().length() <= 0 || i7 <= 0) {
            return null;
        }
        try {
            y1.m mVar = this.f8195d;
            if (mVar == null) {
                r6.k.j("node");
                throw null;
            }
            int round = Math.round(mVar.e().b());
            int length = c().length();
            if (length <= i7) {
                i7 = length;
            }
            a2.h0 h0Var = this.f8194c;
            if (h0Var == null) {
                r6.k.j("layoutResult");
                throw null;
            }
            int e9 = h0Var.e(i7);
            a2.h0 h0Var2 = this.f8194c;
            if (h0Var2 == null) {
                r6.k.j("layoutResult");
                throw null;
            }
            float d8 = h0Var2.f389b.d(e9) - round;
            if (d8 > 0.0f) {
                a2.h0 h0Var3 = this.f8194c;
                if (h0Var3 == null) {
                    r6.k.j("layoutResult");
                    throw null;
                }
                i8 = h0Var3.f389b.c(d8);
            } else {
                i8 = 0;
            }
            if (i7 == c().length() && i8 < e9) {
                i8++;
            }
            return b(e(i8, l2.h.f5874g), i7);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i7, l2.h hVar) {
        a2.h0 h0Var = this.f8194c;
        if (h0Var == null) {
            r6.k.j("layoutResult");
            throw null;
        }
        int h3 = h0Var.h(i7);
        a2.h0 h0Var2 = this.f8194c;
        if (h0Var2 == null) {
            r6.k.j("layoutResult");
            throw null;
        }
        if (hVar != h0Var2.i(h3)) {
            a2.h0 h0Var3 = this.f8194c;
            if (h0Var3 != null) {
                return h0Var3.h(i7);
            }
            r6.k.j("layoutResult");
            throw null;
        }
        if (this.f8194c != null) {
            return r6.d(i7, false) - 1;
        }
        r6.k.j("layoutResult");
        throw null;
    }
}
