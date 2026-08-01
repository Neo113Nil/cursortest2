package d2;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public static c f3348e;

    /* renamed from: f, reason: collision with root package name */
    public static c f3349f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3350c;

    /* renamed from: d, reason: collision with root package name */
    public BreakIterator f3351d;

    @Override // d2.b
    public final int[] a(int i3) {
        switch (this.f3350c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 >= length) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f3351d;
                    if (breakIterator == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i3);
                    BreakIterator breakIterator2 = this.f3351d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.f("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i3);
                        if (following == -1) {
                            return null;
                        }
                        return b(i3, following);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i3 = breakIterator2.following(i3);
                } while (i3 != -1);
                return null;
            default:
                if (c().length() <= 0 || i3 >= c().length()) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                while (!l(i3) && (!l(i3) || (i3 != 0 && l(i3 - 1)))) {
                    BreakIterator breakIterator3 = this.f3351d;
                    if (breakIterator3 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i3 = breakIterator3.following(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f3351d;
                if (breakIterator4 == null) {
                    Intrinsics.f("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i3);
                if (following2 == -1 || !k(following2)) {
                    return null;
                }
                return b(i3, following2);
        }
    }

    @Override // d2.b
    public final int[] i(int i3) {
        switch (this.f3350c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length) {
                    i3 = length;
                }
                do {
                    BreakIterator breakIterator = this.f3351d;
                    if (breakIterator == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i3);
                    BreakIterator breakIterator2 = this.f3351d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.f("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i3);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i3);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i3 = breakIterator2.preceding(i3);
                } while (i3 != -1);
                return null;
            default:
                int length2 = c().length();
                if (length2 <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length2) {
                    i3 = length2;
                }
                while (i3 > 0 && !l(i3 - 1) && !k(i3)) {
                    BreakIterator breakIterator3 = this.f3351d;
                    if (breakIterator3 == null) {
                        Intrinsics.f("impl");
                        throw null;
                    }
                    i3 = breakIterator3.preceding(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f3351d;
                if (breakIterator4 == null) {
                    Intrinsics.f("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i3);
                if (preceding2 == -1 || !l(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !l(preceding2 - 1)) {
                    return b(preceding2, i3);
                }
                return null;
        }
    }

    public final void j(String str) {
        switch (this.f3350c) {
            case 0:
                this.f3336a = str;
                BreakIterator breakIterator = this.f3351d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.f("impl");
                    throw null;
                }
            default:
                this.f3336a = str;
                BreakIterator breakIterator2 = this.f3351d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.f("impl");
                    throw null;
                }
        }
    }

    public boolean k(int i3) {
        if (i3 <= 0 || !l(i3 - 1)) {
            return false;
        }
        return i3 == c().length() || !l(i3);
    }

    public boolean l(int i3) {
        if (i3 < 0 || i3 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i3));
    }
}
