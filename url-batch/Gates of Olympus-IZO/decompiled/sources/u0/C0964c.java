package u0;

import B0.C0004a;
import a.AbstractC0157a;
import java.text.BreakIterator;
import java.util.ArrayList;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964c extends AbstractC0962b {

    /* renamed from: e, reason: collision with root package name */
    public static C0964c f8311e;

    /* renamed from: f, reason: collision with root package name */
    public static C0964c f8312f;

    /* renamed from: g, reason: collision with root package name */
    public static C0964c f8313g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8314c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8315d;

    public /* synthetic */ C0964c(int i3) {
        this.f8314c = i3;
    }

    @Override // u0.AbstractC0962b
    public final int[] a(int i3) {
        int i4;
        switch (this.f8314c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 >= length) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8315d;
                    if (breakIterator == null) {
                        Z1.i.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8315d;
                        if (breakIterator2 == null) {
                            Z1.i.j("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i3);
                        if (following == -1) {
                            return null;
                        }
                        return b(i3, following);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8315d;
                    if (breakIterator3 == null) {
                        Z1.i.j("impl");
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
                    BreakIterator breakIterator4 = (BreakIterator) this.f8315d;
                    if (breakIterator4 == null) {
                        Z1.i.j("impl");
                        throw null;
                    }
                    i3 = breakIterator4.following(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8315d;
                if (breakIterator5 == null) {
                    Z1.i.j("impl");
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
                if (i3 < 0) {
                    B0.z zVar = (B0.z) this.f8315d;
                    if (zVar == null) {
                        Z1.i.j("layoutResult");
                        throw null;
                    }
                    i4 = zVar.a(0);
                } else {
                    B0.z zVar2 = (B0.z) this.f8315d;
                    if (zVar2 == null) {
                        Z1.i.j("layoutResult");
                        throw null;
                    }
                    int a3 = zVar2.a(i3);
                    i4 = e(a3, 2) == i3 ? a3 : a3 + 1;
                }
                B0.z zVar3 = (B0.z) this.f8315d;
                if (zVar3 == null) {
                    Z1.i.j("layoutResult");
                    throw null;
                }
                if (i4 >= zVar3.f395b.f273f) {
                    return null;
                }
                return b(e(i4, 2), e(i4, 1) + 1);
        }
    }

    @Override // u0.AbstractC0962b
    public final int[] d(int i3) {
        int i4;
        switch (this.f8314c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length) {
                    i3 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f8315d;
                    if (breakIterator == null) {
                        Z1.i.j("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f8315d;
                        if (breakIterator2 == null) {
                            Z1.i.j("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i3);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i3);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f8315d;
                    if (breakIterator3 == null) {
                        Z1.i.j("impl");
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
                    BreakIterator breakIterator4 = (BreakIterator) this.f8315d;
                    if (breakIterator4 == null) {
                        Z1.i.j("impl");
                        throw null;
                    }
                    i3 = breakIterator4.preceding(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f8315d;
                if (breakIterator5 == null) {
                    Z1.i.j("impl");
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
                if (i3 > c().length()) {
                    B0.z zVar = (B0.z) this.f8315d;
                    if (zVar == null) {
                        Z1.i.j("layoutResult");
                        throw null;
                    }
                    i4 = zVar.a(c().length());
                } else {
                    B0.z zVar2 = (B0.z) this.f8315d;
                    if (zVar2 == null) {
                        Z1.i.j("layoutResult");
                        throw null;
                    }
                    int a3 = zVar2.a(i3);
                    i4 = e(a3, 1) + 1 == i3 ? a3 : a3 - 1;
                }
                if (i4 < 0) {
                    return null;
                }
                return b(e(i4, 2), e(i4, 1) + 1);
        }
    }

    public int e(int i3, int i4) {
        B0.z zVar = (B0.z) this.f8315d;
        if (zVar == null) {
            Z1.i.j("layoutResult");
            throw null;
        }
        int c3 = zVar.c(i3);
        B0.z zVar2 = (B0.z) this.f8315d;
        if (zVar2 == null) {
            Z1.i.j("layoutResult");
            throw null;
        }
        if (i4 != zVar2.e(c3)) {
            B0.z zVar3 = (B0.z) this.f8315d;
            if (zVar3 != null) {
                return zVar3.c(i3);
            }
            Z1.i.j("layoutResult");
            throw null;
        }
        B0.z zVar4 = (B0.z) this.f8315d;
        if (zVar4 == null) {
            Z1.i.j("layoutResult");
            throw null;
        }
        B0.j jVar = zVar4.f395b;
        jVar.b(i3);
        ArrayList arrayList = jVar.f275h;
        C0004a c0004a = ((B0.l) arrayList.get(AbstractC0157a.B(i3, arrayList))).f278a;
        return (c0004a.f243d.e(i3 - r6.f281d) + r6.f279b) - 1;
    }

    public void f(String str) {
        switch (this.f8314c) {
            case 0:
                this.f8289a = str;
                BreakIterator breakIterator = (BreakIterator) this.f8315d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Z1.i.j("impl");
                    throw null;
                }
            default:
                this.f8289a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f8315d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Z1.i.j("impl");
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
