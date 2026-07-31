package E2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class L implements Q {

    /* renamed from: a, reason: collision with root package name */
    private char[] f529a = C0378i.f606c.d();

    /* renamed from: b, reason: collision with root package name */
    private int f530b;

    private final void e(int i4, int i5, String str) {
        int i6;
        int length = str.length();
        while (i4 < length) {
            int g4 = g(i5, 2);
            char charAt = str.charAt(i4);
            if (charAt < a0.a().length) {
                byte b4 = a0.a()[charAt];
                if (b4 == 0) {
                    i6 = g4 + 1;
                    this.f529a[g4] = charAt;
                } else {
                    if (b4 == 1) {
                        String str2 = a0.b()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int g5 = g(g4, str2.length());
                        str2.getChars(0, str2.length(), this.f529a, g5);
                        i5 = g5 + str2.length();
                        this.f530b = i5;
                    } else {
                        char[] cArr = this.f529a;
                        cArr[g4] = '\\';
                        cArr[g4 + 1] = (char) b4;
                        i5 = g4 + 2;
                        this.f530b = i5;
                    }
                    i4++;
                }
            } else {
                i6 = g4 + 1;
                this.f529a[g4] = charAt;
            }
            i5 = i6;
            i4++;
        }
        int g6 = g(i5, 1);
        this.f529a[g6] = '\"';
        this.f530b = g6 + 1;
    }

    private final void f(int i4) {
        g(this.f530b, i4);
    }

    private final int g(int i4, int i5) {
        int i6 = i5 + i4;
        char[] cArr = this.f529a;
        if (cArr.length <= i6) {
            char[] copyOf = Arrays.copyOf(cArr, kotlin.ranges.g.d(i6, i4 * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f529a = copyOf;
        }
        return i4;
    }

    @Override // E2.Q
    public void a(char c4) {
        f(1);
        char[] cArr = this.f529a;
        int i4 = this.f530b;
        this.f530b = i4 + 1;
        cArr[i4] = c4;
    }

    @Override // E2.Q
    public void b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        f(text.length() + 2);
        char[] cArr = this.f529a;
        int i4 = this.f530b;
        int i5 = i4 + 1;
        cArr[i4] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i5);
        int i6 = length + i5;
        for (int i7 = i5; i7 < i6; i7++) {
            char c4 = cArr[i7];
            if (c4 < a0.a().length && a0.a()[c4] != 0) {
                e(i7 - i5, i7, text);
                return;
            }
        }
        cArr[i6] = '\"';
        this.f530b = i6 + 1;
    }

    @Override // E2.Q
    public void c(long j4) {
        d(String.valueOf(j4));
    }

    @Override // E2.Q
    public void d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        f(length);
        text.getChars(0, text.length(), this.f529a, this.f530b);
        this.f530b += length;
    }

    public void h() {
        C0378i.f606c.c(this.f529a);
    }

    public String toString() {
        return new String(this.f529a, 0, this.f530b);
    }
}
