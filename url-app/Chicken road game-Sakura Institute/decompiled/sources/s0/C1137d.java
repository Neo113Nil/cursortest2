package s0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137d extends AbstractC1133b {

    /* renamed from: e, reason: collision with root package name */
    public static C1137d f10186e;

    /* renamed from: c, reason: collision with root package name */
    public A0.I f10187c;

    /* renamed from: d, reason: collision with root package name */
    public y0.n f10188d;

    @Override // s0.AbstractC1133b
    public final int[] a(int i2) {
        int i4;
        if (c().length() <= 0 || i2 >= c().length()) {
            return null;
        }
        try {
            y0.n nVar = this.f10188d;
            if (nVar == null) {
                Intrinsics.g("node");
                throw null;
            }
            int round = Math.round(nVar.e().b());
            if (i2 <= 0) {
                i2 = 0;
            }
            A0.I i5 = this.f10187c;
            if (i5 == null) {
                Intrinsics.g("layoutResult");
                throw null;
            }
            int e4 = i5.e(i2);
            A0.I i6 = this.f10187c;
            if (i6 == null) {
                Intrinsics.g("layoutResult");
                throw null;
            }
            float d4 = i6.f290b.d(e4) + round;
            A0.I i7 = this.f10187c;
            if (i7 == null) {
                Intrinsics.g("layoutResult");
                throw null;
            }
            if (i7 == null) {
                Intrinsics.g("layoutResult");
                throw null;
            }
            if (d4 < i7.f290b.d(r0.f355f - 1)) {
                A0.I i8 = this.f10187c;
                if (i8 == null) {
                    Intrinsics.g("layoutResult");
                    throw null;
                }
                i4 = i8.f290b.c(d4);
            } else {
                A0.I i9 = this.f10187c;
                if (i9 == null) {
                    Intrinsics.g("layoutResult");
                    throw null;
                }
                i4 = i9.f290b.f355f;
            }
            return b(i2, e(i4 - 1, L0.h.f3506d) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // s0.AbstractC1133b
    public final int[] d(int i2) {
        int i4;
        if (c().length() <= 0 || i2 <= 0) {
            return null;
        }
        try {
            y0.n nVar = this.f10188d;
            if (nVar == null) {
                Intrinsics.g("node");
                throw null;
            }
            int round = Math.round(nVar.e().b());
            int length = c().length();
            if (length <= i2) {
                i2 = length;
            }
            A0.I i5 = this.f10187c;
            if (i5 == null) {
                Intrinsics.g("layoutResult");
                throw null;
            }
            int e4 = i5.e(i2);
            A0.I i6 = this.f10187c;
            if (i6 == null) {
                Intrinsics.g("layoutResult");
                throw null;
            }
            float d4 = i6.f290b.d(e4) - round;
            if (d4 > 0.0f) {
                A0.I i7 = this.f10187c;
                if (i7 == null) {
                    Intrinsics.g("layoutResult");
                    throw null;
                }
                i4 = i7.f290b.c(d4);
            } else {
                i4 = 0;
            }
            if (i2 == c().length() && i4 < e4) {
                i4++;
            }
            return b(e(i4, L0.h.f3507e), i2);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int e(int i2, L0.h hVar) {
        A0.I i4 = this.f10187c;
        if (i4 == null) {
            Intrinsics.g("layoutResult");
            throw null;
        }
        int h4 = i4.h(i2);
        A0.I i5 = this.f10187c;
        if (i5 == null) {
            Intrinsics.g("layoutResult");
            throw null;
        }
        if (hVar != i5.i(h4)) {
            A0.I i6 = this.f10187c;
            if (i6 != null) {
                return i6.h(i2);
            }
            Intrinsics.g("layoutResult");
            throw null;
        }
        if (this.f10187c != null) {
            return r6.d(i2, false) - 1;
        }
        Intrinsics.g("layoutResult");
        throw null;
    }
}
