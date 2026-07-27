package s0;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135c extends AbstractC1133b {

    /* renamed from: e, reason: collision with root package name */
    public static C1135c f10176e;

    /* renamed from: f, reason: collision with root package name */
    public static C1135c f10177f;

    /* renamed from: g, reason: collision with root package name */
    public static C1135c f10178g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10179c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10180d;

    @Override // s0.AbstractC1133b
    public final int[] a(int i2) {
        int i4;
        switch (this.f10179c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f10180d;
                    if (breakIterator == null) {
                        Intrinsics.g("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i2)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f10180d;
                        if (breakIterator2 == null) {
                            Intrinsics.g("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i2);
                        if (following == -1) {
                            return null;
                        }
                        return b(i2, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f10180d;
                    if (breakIterator3 == null) {
                        Intrinsics.g("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!h(i2) && (!h(i2) || (i2 != 0 && h(i2 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f10180d;
                    if (breakIterator4 == null) {
                        Intrinsics.g("impl");
                        throw null;
                    }
                    i2 = breakIterator4.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f10180d;
                if (breakIterator5 == null) {
                    Intrinsics.g("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i2);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i2, following2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                L0.h hVar = L0.h.f3507e;
                if (i2 < 0) {
                    A0.I i5 = (A0.I) this.f10180d;
                    if (i5 == null) {
                        Intrinsics.g("layoutResult");
                        throw null;
                    }
                    i4 = i5.e(0);
                } else {
                    A0.I i6 = (A0.I) this.f10180d;
                    if (i6 == null) {
                        Intrinsics.g("layoutResult");
                        throw null;
                    }
                    int e4 = i6.e(i2);
                    i4 = e(e4, hVar) == i2 ? e4 : e4 + 1;
                }
                A0.I i7 = (A0.I) this.f10180d;
                if (i7 == null) {
                    Intrinsics.g("layoutResult");
                    throw null;
                }
                if (i4 >= i7.f290b.f355f) {
                    return null;
                }
                return b(e(i4, hVar), e(i4, L0.h.f3506d) + 1);
        }
    }

    @Override // s0.AbstractC1133b
    public final int[] d(int i2) {
        int i4;
        switch (this.f10179c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f10180d;
                    if (breakIterator == null) {
                        Intrinsics.g("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i2)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f10180d;
                        if (breakIterator2 == null) {
                            Intrinsics.g("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i2);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i2);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f10180d;
                    if (breakIterator3 == null) {
                        Intrinsics.g("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !h(i2 - 1) && !g(i2)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f10180d;
                    if (breakIterator4 == null) {
                        Intrinsics.g("impl");
                        throw null;
                    }
                    i2 = breakIterator4.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f10180d;
                if (breakIterator5 == null) {
                    Intrinsics.g("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i2);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                L0.h hVar = L0.h.f3506d;
                if (i2 > length3) {
                    A0.I i5 = (A0.I) this.f10180d;
                    if (i5 == null) {
                        Intrinsics.g("layoutResult");
                        throw null;
                    }
                    i4 = i5.e(c().length());
                } else {
                    A0.I i6 = (A0.I) this.f10180d;
                    if (i6 == null) {
                        Intrinsics.g("layoutResult");
                        throw null;
                    }
                    int e4 = i6.e(i2);
                    i4 = e(e4, hVar) + 1 == i2 ? e4 : e4 - 1;
                }
                if (i4 < 0) {
                    return null;
                }
                return b(e(i4, L0.h.f3507e), e(i4, hVar) + 1);
        }
    }

    public int e(int i2, L0.h hVar) {
        A0.I i4 = (A0.I) this.f10180d;
        if (i4 == null) {
            Intrinsics.g("layoutResult");
            throw null;
        }
        int h4 = i4.h(i2);
        A0.I i5 = (A0.I) this.f10180d;
        if (i5 == null) {
            Intrinsics.g("layoutResult");
            throw null;
        }
        if (hVar != i5.i(h4)) {
            A0.I i6 = (A0.I) this.f10180d;
            if (i6 != null) {
                return i6.h(i2);
            }
            Intrinsics.g("layoutResult");
            throw null;
        }
        if (((A0.I) this.f10180d) != null) {
            return r6.d(i2, false) - 1;
        }
        Intrinsics.g("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.f10179c) {
            case 0:
                this.f10173a = str;
                BreakIterator breakIterator = (BreakIterator) this.f10180d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.g("impl");
                    throw null;
                }
            default:
                this.f10173a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f10180d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.g("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i2) {
        return i2 > 0 && h(i2 + (-1)) && (i2 == c().length() || !h(i2));
    }

    public boolean h(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
