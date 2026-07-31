package u0;

import java.text.BreakIterator;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1092c extends AbstractC1090b {

    /* renamed from: e, reason: collision with root package name */
    public static C1092c f9314e;

    /* renamed from: f, reason: collision with root package name */
    public static C1092c f9315f;

    /* renamed from: g, reason: collision with root package name */
    public static C1092c f9316g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9317c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9318d;

    @Override // u0.AbstractC1090b
    public final int[] a(int i3) {
        int i4;
        switch (this.f9317c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 >= length) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f9318d;
                    if (breakIterator == null) {
                        f2.j.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f9318d;
                        if (breakIterator2 == null) {
                            f2.j.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i3);
                        if (following == -1) {
                            return null;
                        }
                        return b(i3, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f9318d;
                    if (breakIterator3 == null) {
                        f2.j.j("impl");
                        throw null;
                    }
                    i3 = breakIterator3.following(i3);
                } while (i3 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i3 >= c().length()) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                while (!h(i3) && (!h(i3) || (i3 != 0 && h(i3 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f9318d;
                    if (breakIterator4 == null) {
                        f2.j.j("impl");
                        throw null;
                    }
                    i3 = breakIterator4.following(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f9318d;
                if (breakIterator5 == null) {
                    f2.j.j("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i3);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i3, following2);
            default:
                if (c().length() <= 0 || i3 >= c().length()) {
                    return null;
                }
                N0.h hVar = N0.h.f3545e;
                if (i3 < 0) {
                    C0.H h3 = (C0.H) this.f9318d;
                    if (h3 == null) {
                        f2.j.j("layoutResult");
                        throw null;
                    }
                    i4 = h3.e(0);
                } else {
                    C0.H h4 = (C0.H) this.f9318d;
                    if (h4 == null) {
                        f2.j.j("layoutResult");
                        throw null;
                    }
                    int e3 = h4.e(i3);
                    i4 = e(e3, hVar) == i3 ? e3 : e3 + 1;
                }
                C0.H h5 = (C0.H) this.f9318d;
                if (h5 == null) {
                    f2.j.j("layoutResult");
                    throw null;
                }
                if (i4 >= h5.f558b.f623f) {
                    return null;
                }
                return b(e(i4, hVar), e(i4, N0.h.f3544d) + 1);
        }
    }

    @Override // u0.AbstractC1090b
    public final int[] d(int i3) {
        int i4;
        switch (this.f9317c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length) {
                    i3 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f9318d;
                    if (breakIterator == null) {
                        f2.j.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f9318d;
                        if (breakIterator2 == null) {
                            f2.j.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i3);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i3);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f9318d;
                    if (breakIterator3 == null) {
                        f2.j.j("impl");
                        throw null;
                    }
                    i3 = breakIterator3.preceding(i3);
                } while (i3 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length2) {
                    i3 = length2;
                }
                while (i3 > 0 && !h(i3 - 1) && !g(i3)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f9318d;
                    if (breakIterator4 == null) {
                        f2.j.j("impl");
                        throw null;
                    }
                    i3 = breakIterator4.preceding(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f9318d;
                if (breakIterator5 == null) {
                    f2.j.j("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i3);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i3);
                }
                return null;
            default:
                if (c().length() <= 0 || i3 <= 0) {
                    return null;
                }
                int length3 = c().length();
                N0.h hVar = N0.h.f3544d;
                if (i3 > length3) {
                    C0.H h3 = (C0.H) this.f9318d;
                    if (h3 == null) {
                        f2.j.j("layoutResult");
                        throw null;
                    }
                    i4 = h3.e(c().length());
                } else {
                    C0.H h4 = (C0.H) this.f9318d;
                    if (h4 == null) {
                        f2.j.j("layoutResult");
                        throw null;
                    }
                    int e3 = h4.e(i3);
                    i4 = e(e3, hVar) + 1 == i3 ? e3 : e3 - 1;
                }
                if (i4 < 0) {
                    return null;
                }
                return b(e(i4, N0.h.f3545e), e(i4, hVar) + 1);
        }
    }

    public int e(int i3, N0.h hVar) {
        C0.H h3 = (C0.H) this.f9318d;
        if (h3 == null) {
            f2.j.j("layoutResult");
            throw null;
        }
        int h4 = h3.h(i3);
        C0.H h5 = (C0.H) this.f9318d;
        if (h5 == null) {
            f2.j.j("layoutResult");
            throw null;
        }
        if (hVar != h5.i(h4)) {
            C0.H h6 = (C0.H) this.f9318d;
            if (h6 != null) {
                return h6.h(i3);
            }
            f2.j.j("layoutResult");
            throw null;
        }
        if (((C0.H) this.f9318d) != null) {
            return r6.d(i3, false) - 1;
        }
        f2.j.j("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.f9317c) {
            case 0:
                this.f9309a = str;
                BreakIterator breakIterator = (BreakIterator) this.f9318d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    f2.j.j("impl");
                    throw null;
                }
            default:
                this.f9309a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f9318d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    f2.j.j("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i3) {
        return i3 > 0 && h(i3 + (-1)) && (i3 == c().length() || !h(i3));
    }

    public boolean h(int i3) {
        if (i3 < 0 || i3 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i3));
    }
}
