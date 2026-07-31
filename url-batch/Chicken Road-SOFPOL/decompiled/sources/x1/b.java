package x1;

import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends w4.u {

    /* renamed from: e, reason: collision with root package name */
    public static b f8356e;

    /* renamed from: f, reason: collision with root package name */
    public static b f8357f;

    /* renamed from: g, reason: collision with root package name */
    public static b f8358g;

    /* renamed from: h, reason: collision with root package name */
    public static final q2.j f8359h = q2.j.f6053e;
    public static final q2.j i = q2.j.f6052d;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8360c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8361d;

    public /* synthetic */ b(int i8) {
        this.f8360c = i8;
    }

    @Override // w4.u
    public final int[] b(int i8) {
        int i9;
        switch (this.f8360c) {
            case 0:
                int length = n().length();
                if (length <= 0 || i8 >= length) {
                    return null;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8361d;
                    if (breakIterator == null) {
                        q6.i.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i8)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8361d;
                        if (breakIterator2 == null) {
                            q6.i.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i8);
                        if (following == -1) {
                            return null;
                        }
                        return l(i8, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8361d;
                    if (breakIterator3 == null) {
                        q6.i.j("impl");
                        throw null;
                    }
                    i8 = breakIterator3.following(i8);
                } while (i8 != -1);
                return null;
            case 1:
                if (n().length() <= 0 || i8 >= n().length()) {
                    return null;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                while (!w(i8) && (!w(i8) || (i8 != 0 && w(i8 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f8361d;
                    if (breakIterator4 == null) {
                        q6.i.j("impl");
                        throw null;
                    }
                    i8 = breakIterator4.following(i8);
                    if (i8 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8361d;
                if (breakIterator5 == null) {
                    q6.i.j("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i8);
                if (following2 == -1 || !v(following2)) {
                    return null;
                }
                return l(i8, following2);
            default:
                if (n().length() <= 0 || i8 >= n().length()) {
                    return null;
                }
                q2.j jVar = f8359h;
                if (i8 < 0) {
                    g2.f0 f0Var = (g2.f0) this.f8361d;
                    if (f0Var == null) {
                        q6.i.j("layoutResult");
                        throw null;
                    }
                    i9 = f0Var.a(0);
                } else {
                    g2.f0 f0Var2 = (g2.f0) this.f8361d;
                    if (f0Var2 == null) {
                        q6.i.j("layoutResult");
                        throw null;
                    }
                    int a8 = f0Var2.a(i8);
                    i9 = t(a8, jVar) == i8 ? a8 : a8 + 1;
                }
                g2.f0 f0Var3 = (g2.f0) this.f8361d;
                if (f0Var3 == null) {
                    q6.i.j("layoutResult");
                    throw null;
                }
                if (i9 >= f0Var3.f2942b.f2972b) {
                    return null;
                }
                return l(t(i9, jVar), t(i9, i) + 1);
        }
    }

    @Override // w4.u
    public final int[] s(int i8) {
        int i9;
        switch (this.f8360c) {
            case 0:
                int length = n().length();
                if (length <= 0 || i8 <= 0) {
                    return null;
                }
                if (i8 > length) {
                    i8 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8361d;
                    if (breakIterator == null) {
                        q6.i.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i8)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8361d;
                        if (breakIterator2 == null) {
                            q6.i.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i8);
                        if (preceding == -1) {
                            return null;
                        }
                        return l(preceding, i8);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8361d;
                    if (breakIterator3 == null) {
                        q6.i.j("impl");
                        throw null;
                    }
                    i8 = breakIterator3.preceding(i8);
                } while (i8 != -1);
                return null;
            case 1:
                int length2 = n().length();
                if (length2 <= 0 || i8 <= 0) {
                    return null;
                }
                if (i8 > length2) {
                    i8 = length2;
                }
                while (i8 > 0 && !w(i8 - 1) && !v(i8)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f8361d;
                    if (breakIterator4 == null) {
                        q6.i.j("impl");
                        throw null;
                    }
                    i8 = breakIterator4.preceding(i8);
                    if (i8 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8361d;
                if (breakIterator5 == null) {
                    q6.i.j("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i8);
                if (preceding2 == -1 || !w(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !w(preceding2 - 1)) {
                    return l(preceding2, i8);
                }
                return null;
            default:
                if (n().length() <= 0 || i8 <= 0) {
                    return null;
                }
                int length3 = n().length();
                q2.j jVar = i;
                if (i8 > length3) {
                    g2.f0 f0Var = (g2.f0) this.f8361d;
                    if (f0Var == null) {
                        q6.i.j("layoutResult");
                        throw null;
                    }
                    i9 = f0Var.a(n().length());
                } else {
                    g2.f0 f0Var2 = (g2.f0) this.f8361d;
                    if (f0Var2 == null) {
                        q6.i.j("layoutResult");
                        throw null;
                    }
                    int a8 = f0Var2.a(i8);
                    i9 = t(a8, jVar) + 1 == i8 ? a8 : a8 - 1;
                }
                if (i9 < 0) {
                    return null;
                }
                return l(t(i9, f8359h), t(i9, jVar) + 1);
        }
    }

    public int t(int i8, q2.j jVar) {
        g2.f0 f0Var = (g2.f0) this.f8361d;
        if (f0Var == null) {
            q6.i.j("layoutResult");
            throw null;
        }
        int c8 = f0Var.c(i8);
        g2.f0 f0Var2 = (g2.f0) this.f8361d;
        if (f0Var2 == null) {
            q6.i.j("layoutResult");
            throw null;
        }
        if (jVar != f0Var2.e(c8)) {
            g2.f0 f0Var3 = (g2.f0) this.f8361d;
            if (f0Var3 != null) {
                return f0Var3.c(i8);
            }
            q6.i.j("layoutResult");
            throw null;
        }
        g2.f0 f0Var4 = (g2.f0) this.f8361d;
        if (f0Var4 == null) {
            q6.i.j("layoutResult");
            throw null;
        }
        g2.l lVar = f0Var4.f2942b;
        lVar.b(i8);
        ArrayList arrayList = (ArrayList) lVar.f2975e;
        g2.a aVar = ((g2.o) arrayList.get(g2.a0.d(i8, arrayList))).f2983a;
        return (aVar.f2897d.e(i8 - r6.f2986d) + r6.f2984b) - 1;
    }

    public void u(String str) {
        switch (this.f8360c) {
            case 0:
                this.f8038a = str;
                BreakIterator breakIterator = (BreakIterator) this.f8361d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    q6.i.j("impl");
                    throw null;
                }
            default:
                this.f8038a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f8361d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    q6.i.j("impl");
                    throw null;
                }
        }
    }

    public boolean v(int i8) {
        if (i8 <= 0 || !w(i8 - 1)) {
            return false;
        }
        return i8 == n().length() || !w(i8);
    }

    public boolean w(int i8) {
        if (i8 < 0 || i8 >= n().length()) {
            return false;
        }
        return Character.isLetterOrDigit(n().codePointAt(i8));
    }
}
