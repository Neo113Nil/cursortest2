package E2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U extends AbstractC0370a {

    /* renamed from: e, reason: collision with root package name */
    private final V f558e;

    /* renamed from: f, reason: collision with root package name */
    private final char[] f559f;

    /* renamed from: g, reason: collision with root package name */
    private int f560g;

    /* renamed from: h, reason: collision with root package name */
    private final C0373d f561h;

    public /* synthetic */ U(V v4, char[] cArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(v4, (i4 & 2) != 0 ? C0380k.f609c.d() : cArr);
    }

    private final void T(int i4) {
        char[] cArr;
        cArr = D().f599b;
        if (i4 != 0) {
            int i5 = this.f583a;
            AbstractC3219i.g(cArr, cArr, 0, i5, i5 + i4);
        }
        int length = D().length();
        while (true) {
            if (i4 == length) {
                break;
            }
            int a4 = this.f558e.a(cArr, i4, length - i4);
            if (a4 == -1) {
                D().f(i4);
                this.f560g = -1;
                break;
            }
            i4 += a4;
        }
        this.f583a = 0;
    }

    @Override // E2.AbstractC0370a
    public int H(int i4) {
        if (i4 < D().length()) {
            return i4;
        }
        this.f583a = i4;
        v();
        return (this.f583a != 0 || D().length() == 0) ? -1 : 0;
    }

    @Override // E2.AbstractC0370a
    public String K(int i4, int i5) {
        return D().e(i4, i5);
    }

    @Override // E2.AbstractC0370a
    public boolean M() {
        int J3 = J();
        if (J3 >= D().length() || J3 == -1 || D().charAt(J3) != ',') {
            return false;
        }
        this.f583a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // E2.AbstractC0370a
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C0373d D() {
        return this.f561h;
    }

    public int S(char c4, int i4) {
        C0373d D4 = D();
        int length = D4.length();
        while (i4 < length) {
            if (D4.charAt(i4) == c4) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public final void U() {
        C0380k.f609c.c(this.f559f);
    }

    @Override // E2.AbstractC0370a
    protected void e(int i4, int i5) {
        char[] cArr;
        StringBuilder C4 = C();
        cArr = D().f599b;
        C4.append(cArr, i4, i5 - i4);
        Intrinsics.checkNotNullExpressionValue(C4, "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override // E2.AbstractC0370a
    public boolean f() {
        v();
        int i4 = this.f583a;
        while (true) {
            int H3 = H(i4);
            if (H3 == -1) {
                this.f583a = H3;
                return false;
            }
            char charAt = D().charAt(H3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f583a = H3;
                return E(charAt);
            }
            i4 = H3 + 1;
        }
    }

    @Override // E2.AbstractC0370a
    public String k() {
        o('\"');
        int i4 = this.f583a;
        int S3 = S('\"', i4);
        if (S3 == -1) {
            int H3 = H(i4);
            if (H3 != -1) {
                return r(D(), this.f583a, H3);
            }
            z((byte) 1);
            throw new W1.f();
        }
        for (int i5 = i4; i5 < S3; i5++) {
            if (D().charAt(i5) == '\\') {
                return r(D(), this.f583a, i5);
            }
        }
        this.f583a = S3 + 1;
        return K(i4, S3);
    }

    @Override // E2.AbstractC0370a
    public String l(String keyToMatch, boolean z4) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // E2.AbstractC0370a
    public byte m() {
        v();
        C0373d D4 = D();
        int i4 = this.f583a;
        while (true) {
            int H3 = H(i4);
            if (H3 == -1) {
                this.f583a = H3;
                return (byte) 10;
            }
            int i5 = H3 + 1;
            byte a4 = AbstractC0371b.a(D4.charAt(H3));
            if (a4 != 3) {
                this.f583a = i5;
                return a4;
            }
            i4 = i5;
        }
    }

    @Override // E2.AbstractC0370a
    public void v() {
        int length = D().length() - this.f583a;
        if (length > this.f560g) {
            return;
        }
        T(length);
    }

    public U(V reader, char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f558e = reader;
        this.f559f = buffer;
        this.f560g = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.f561h = new C0373d(buffer);
        T(0);
    }
}
