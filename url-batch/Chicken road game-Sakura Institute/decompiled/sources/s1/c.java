package s1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.text.BreakIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public static c f8155e;

    /* renamed from: f, reason: collision with root package name */
    public static c f8156f;

    /* renamed from: g, reason: collision with root package name */
    public static c f8157g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8158c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8159d;

    @Override // s1.b
    public final int[] a(int i7) {
        int i8;
        switch (this.f8158c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = c().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8159d;
                    if (breakIterator == null) {
                        r6.k.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8159d;
                        if (breakIterator2 == null) {
                            r6.k.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i7);
                        if (following == -1) {
                            return null;
                        }
                        return b(i7, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8159d;
                    if (breakIterator3 == null) {
                        r6.k.j("impl");
                        throw null;
                    }
                    i7 = breakIterator3.following(i7);
                } while (i7 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i7 >= c().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!h(i7) && (!h(i7) || (i7 != 0 && h(i7 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f8159d;
                    if (breakIterator4 == null) {
                        r6.k.j("impl");
                        throw null;
                    }
                    i7 = breakIterator4.following(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8159d;
                if (breakIterator5 == null) {
                    r6.k.j("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i7);
                if (following2 == -1 || !g(following2)) {
                    return null;
                }
                return b(i7, following2);
            default:
                if (c().length() <= 0 || i7 >= c().length()) {
                    return null;
                }
                l2.h hVar = l2.h.f5874g;
                if (i7 < 0) {
                    a2.h0 h0Var = (a2.h0) this.f8159d;
                    if (h0Var == null) {
                        r6.k.j("layoutResult");
                        throw null;
                    }
                    i8 = h0Var.e(0);
                } else {
                    a2.h0 h0Var2 = (a2.h0) this.f8159d;
                    if (h0Var2 == null) {
                        r6.k.j("layoutResult");
                        throw null;
                    }
                    int e9 = h0Var2.e(i7);
                    i8 = e(e9, hVar) == i7 ? e9 : e9 + 1;
                }
                a2.h0 h0Var3 = (a2.h0) this.f8159d;
                if (h0Var3 == null) {
                    r6.k.j("layoutResult");
                    throw null;
                }
                if (i8 >= h0Var3.f389b.f429f) {
                    return null;
                }
                return b(e(i8, hVar), e(i8, l2.h.f5873f) + 1);
        }
    }

    @Override // s1.b
    public final int[] d(int i7) {
        int i8;
        switch (this.f8158c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = c().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8159d;
                    if (breakIterator == null) {
                        r6.k.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i7)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8159d;
                        if (breakIterator2 == null) {
                            r6.k.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i7);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i7);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8159d;
                    if (breakIterator3 == null) {
                        r6.k.j("impl");
                        throw null;
                    }
                    i7 = breakIterator3.preceding(i7);
                } while (i7 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !h(i7 - 1) && !g(i7)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f8159d;
                    if (breakIterator4 == null) {
                        r6.k.j("impl");
                        throw null;
                    }
                    i7 = breakIterator4.preceding(i7);
                    if (i7 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8159d;
                if (breakIterator5 == null) {
                    r6.k.j("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i7);
                if (preceding2 == -1 || !h(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !h(preceding2 - 1)) {
                    return b(preceding2, i7);
                }
                return null;
            default:
                if (c().length() <= 0 || i7 <= 0) {
                    return null;
                }
                int length3 = c().length();
                l2.h hVar = l2.h.f5873f;
                if (i7 > length3) {
                    a2.h0 h0Var = (a2.h0) this.f8159d;
                    if (h0Var == null) {
                        r6.k.j("layoutResult");
                        throw null;
                    }
                    i8 = h0Var.e(c().length());
                } else {
                    a2.h0 h0Var2 = (a2.h0) this.f8159d;
                    if (h0Var2 == null) {
                        r6.k.j("layoutResult");
                        throw null;
                    }
                    int e9 = h0Var2.e(i7);
                    i8 = e(e9, hVar) + 1 == i7 ? e9 : e9 - 1;
                }
                if (i8 < 0) {
                    return null;
                }
                return b(e(i8, l2.h.f5874g), e(i8, hVar) + 1);
        }
    }

    public int e(int i7, l2.h hVar) {
        a2.h0 h0Var = (a2.h0) this.f8159d;
        if (h0Var == null) {
            r6.k.j("layoutResult");
            throw null;
        }
        int h3 = h0Var.h(i7);
        a2.h0 h0Var2 = (a2.h0) this.f8159d;
        if (h0Var2 == null) {
            r6.k.j("layoutResult");
            throw null;
        }
        if (hVar != h0Var2.i(h3)) {
            a2.h0 h0Var3 = (a2.h0) this.f8159d;
            if (h0Var3 != null) {
                return h0Var3.h(i7);
            }
            r6.k.j("layoutResult");
            throw null;
        }
        if (((a2.h0) this.f8159d) != null) {
            return r6.d(i7, false) - 1;
        }
        r6.k.j("layoutResult");
        throw null;
    }

    public void f(String str) {
        switch (this.f8158c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f8135a = str;
                BreakIterator breakIterator = (BreakIterator) this.f8159d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    r6.k.j("impl");
                    throw null;
                }
            default:
                this.f8135a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f8159d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    r6.k.j("impl");
                    throw null;
                }
        }
    }

    public boolean g(int i7) {
        if (i7 <= 0 || !h(i7 - 1)) {
            return false;
        }
        return i7 == c().length() || !h(i7);
    }

    public boolean h(int i7) {
        if (i7 < 0 || i7 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i7));
    }
}
