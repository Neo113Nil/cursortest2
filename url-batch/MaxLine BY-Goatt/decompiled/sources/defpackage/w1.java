package defpackage;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w1 extends b90 {
    public static w1 e;
    public static w1 f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    @Override // defpackage.b90
    public final int[] f(int i) {
        switch (this.c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.f("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return i(i, following);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (j().length() <= 0 || i >= j().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!q(i) && (!q(i) || (i != 0 && q(i - 1)))) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.f("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !p(following2)) {
                    return null;
                }
                return i(i, following2);
        }
    }

    @Override // defpackage.b90
    public final int[] m(int i) {
        switch (this.c) {
            case 0:
                int length = j().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.f("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return i(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = j().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !q(i - 1) && !p(i)) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.f("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !q(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !q(preceding2 - 1)) {
                    return i(preceding2, i);
                }
                return null;
        }
    }

    public final void o(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.f("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.f("impl");
                    throw null;
                }
        }
    }

    public boolean p(int i) {
        if (i <= 0 || !q(i - 1)) {
            return false;
        }
        return i == j().length() || !q(i);
    }

    public boolean q(int i) {
        if (i < 0 || i >= j().length()) {
            return false;
        }
        return Character.isLetterOrDigit(j().codePointAt(i));
    }
}
