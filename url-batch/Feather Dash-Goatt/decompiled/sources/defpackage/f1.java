package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f1 extends e1 {
    public static f1 e;
    public static f1 f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    @Override // defpackage.e1
    public final int[] a(int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = c().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.e("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.e("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return b(i, following);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.e("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (c().length() <= 0 || i >= c().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!g(i) && (!g(i) || (i != 0 && g(i - 1)))) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.e("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.e("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !f(following2)) {
                    return null;
                }
                return b(i, following2);
        }
    }

    @Override // defpackage.e1
    public final int[] d(int i) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = c().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.e("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.e("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return b(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.e("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = c().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !g(i - 1) && !f(i)) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.e("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.e("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !g(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !g(preceding2 - 1)) {
                    return b(preceding2, i);
                }
                return null;
        }
    }

    public final void e(String str) {
        switch (this.c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.e("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.e("impl");
                    throw null;
                }
        }
    }

    public boolean f(int i) {
        if (i <= 0 || !g(i - 1)) {
            return false;
        }
        return i == c().length() || !g(i);
    }

    public boolean g(int i) {
        if (i < 0 || i >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i));
    }
}
