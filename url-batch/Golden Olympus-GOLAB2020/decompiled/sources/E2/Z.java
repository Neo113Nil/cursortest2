package E2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class Z extends AbstractC0370a {

    /* renamed from: e, reason: collision with root package name */
    private final String f582e;

    public Z(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f582e = source;
    }

    @Override // E2.AbstractC0370a
    public int H(int i4) {
        if (i4 < D().length()) {
            return i4;
        }
        return -1;
    }

    @Override // E2.AbstractC0370a
    public int J() {
        char charAt;
        int i4 = this.f583a;
        if (i4 == -1) {
            return i4;
        }
        while (i4 < D().length() && ((charAt = D().charAt(i4)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i4++;
        }
        this.f583a = i4;
        return i4;
    }

    @Override // E2.AbstractC0370a
    public boolean M() {
        int J3 = J();
        if (J3 == D().length() || J3 == -1 || D().charAt(J3) != ',') {
            return false;
        }
        this.f583a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E2.AbstractC0370a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public String D() {
        return this.f582e;
    }

    @Override // E2.AbstractC0370a
    public boolean f() {
        int i4 = this.f583a;
        if (i4 == -1) {
            return false;
        }
        while (i4 < D().length()) {
            char charAt = D().charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f583a = i4;
                return E(charAt);
            }
            i4++;
        }
        this.f583a = i4;
        return false;
    }

    @Override // E2.AbstractC0370a
    public String k() {
        o('\"');
        int i4 = this.f583a;
        int b02 = StringsKt.b0(D(), '\"', i4, false, 4, null);
        if (b02 == -1) {
            z((byte) 1);
            throw new W1.f();
        }
        for (int i5 = i4; i5 < b02; i5++) {
            if (D().charAt(i5) == '\\') {
                return r(D(), this.f583a, i5);
            }
        }
        this.f583a = b02 + 1;
        String substring = D().substring(i4, b02);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @Override // E2.AbstractC0370a
    public String l(String keyToMatch, boolean z4) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i4 = this.f583a;
        try {
            if (m() != 6) {
                this.f583a = i4;
                return null;
            }
            if (!Intrinsics.areEqual(z4 ? k() : t(), keyToMatch)) {
                this.f583a = i4;
                return null;
            }
            if (m() != 5) {
                this.f583a = i4;
                return null;
            }
            String q4 = z4 ? q() : t();
            this.f583a = i4;
            return q4;
        } catch (Throwable th) {
            this.f583a = i4;
            throw th;
        }
    }

    @Override // E2.AbstractC0370a
    public byte m() {
        byte a4;
        String D4 = D();
        do {
            int i4 = this.f583a;
            if (i4 == -1 || i4 >= D4.length()) {
                return (byte) 10;
            }
            int i5 = this.f583a;
            this.f583a = i5 + 1;
            a4 = AbstractC0371b.a(D4.charAt(i5));
        } while (a4 == 3);
        return a4;
    }

    @Override // E2.AbstractC0370a
    public void o(char c4) {
        if (this.f583a == -1) {
            P(c4);
        }
        String D4 = D();
        while (this.f583a < D4.length()) {
            int i4 = this.f583a;
            this.f583a = i4 + 1;
            char charAt = D4.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c4) {
                    return;
                } else {
                    P(c4);
                }
            }
        }
        P(c4);
    }
}
