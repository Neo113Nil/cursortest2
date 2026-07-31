package E2;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: E2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0370a {

    /* renamed from: a, reason: collision with root package name */
    protected int f583a;

    /* renamed from: c, reason: collision with root package name */
    private String f585c;

    /* renamed from: b, reason: collision with root package name */
    public final H f584b = new H();

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f586d = new StringBuilder();

    private final int B(CharSequence charSequence, int i4) {
        char charAt = charSequence.charAt(i4);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        throw new W1.f();
    }

    private final String L() {
        String str = this.f585c;
        Intrinsics.checkNotNull(str);
        this.f585c = null;
        return str;
    }

    public static /* synthetic */ boolean O(AbstractC0370a abstractC0370a, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return abstractC0370a.N(z4);
    }

    private final boolean Q() {
        return D().charAt(this.f583a - 1) != '\"';
    }

    private final int b(int i4) {
        int H3 = H(i4);
        if (H3 == -1) {
            y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new W1.f();
        }
        int i5 = H3 + 1;
        char charAt = D().charAt(H3);
        if (charAt == 'u') {
            return d(D(), i5);
        }
        char b4 = AbstractC0371b.b(charAt);
        if (b4 != 0) {
            this.f586d.append(b4);
            return i5;
        }
        y(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
        throw new W1.f();
    }

    private final int c(int i4, int i5) {
        e(i4, i5);
        return b(i5 + 1);
    }

    private final int d(CharSequence charSequence, int i4) {
        int i5 = i4 + 4;
        if (i5 < charSequence.length()) {
            this.f586d.append((char) ((B(charSequence, i4) << 12) + (B(charSequence, i4 + 1) << 8) + (B(charSequence, i4 + 2) << 4) + B(charSequence, i4 + 3)));
            return i5;
        }
        this.f583a = i4;
        v();
        if (this.f583a + 4 < charSequence.length()) {
            return d(charSequence, this.f583a);
        }
        y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new W1.f();
    }

    private final boolean h(int i4) {
        int H3 = H(i4);
        if (H3 >= D().length() || H3 == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new W1.f();
        }
        int i5 = H3 + 1;
        int charAt = D().charAt(H3) | ' ';
        if (charAt == 102) {
            j("alse", i5);
            return false;
        }
        if (charAt == 116) {
            j("rue", i5);
            return true;
        }
        y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
        throw new W1.f();
    }

    private final void j(String str, int i4) {
        if (D().length() - i4 < str.length()) {
            y(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new W1.f();
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) != (D().charAt(i4 + i5) | ' ')) {
                y(this, "Expected valid boolean literal prefix, but had '" + s() + '\'', 0, null, 6, null);
                throw new W1.f();
            }
        }
        this.f583a = i4 + str.length();
    }

    private final String u(int i4, int i5) {
        e(i4, i5);
        String sb = this.f586d.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "escapedString.toString()");
        this.f586d.setLength(0);
        return sb;
    }

    public static /* synthetic */ Void y(AbstractC0370a abstractC0370a, String str, int i4, String str2, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i5 & 2) != 0) {
            i4 = abstractC0370a.f583a;
        }
        if ((i5 & 4) != 0) {
            str2 = "";
        }
        return abstractC0370a.x(str, i4, str2);
    }

    public final void A(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        x("Encountered an unknown key '" + key + '\'', StringsKt.h0(K(0, this.f583a), key, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new W1.f();
    }

    protected final StringBuilder C() {
        return this.f586d;
    }

    protected abstract CharSequence D();

    protected final boolean E(char c4) {
        return !(c4 == '}' || c4 == ']' || c4 == ':' || c4 == ',');
    }

    public final byte F() {
        CharSequence D4 = D();
        int i4 = this.f583a;
        while (true) {
            int H3 = H(i4);
            if (H3 == -1) {
                this.f583a = H3;
                return (byte) 10;
            }
            char charAt = D4.charAt(H3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f583a = H3;
                return AbstractC0371b.a(charAt);
            }
            i4 = H3 + 1;
        }
    }

    public final String G(boolean z4) {
        String q4;
        byte F4 = F();
        if (z4) {
            if (F4 != 1 && F4 != 0) {
                return null;
            }
            q4 = s();
        } else {
            if (F4 != 1) {
                return null;
            }
            q4 = q();
        }
        this.f585c = q4;
        return q4;
    }

    public abstract int H(int i4);

    public final void I(boolean z4) {
        ArrayList arrayList = new ArrayList();
        byte F4 = F();
        if (F4 != 8 && F4 != 6) {
            s();
            return;
        }
        while (true) {
            byte F5 = F();
            if (F5 != 1) {
                if (F5 == 8 || F5 == 6) {
                    arrayList.add(Byte.valueOf(F5));
                } else if (F5 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw F.e(this.f583a, "found ] instead of } at path: " + this.f584b, D());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (F5 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw F.e(this.f583a, "found } instead of ] at path: " + this.f584b, D());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (F5 == 10) {
                    y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new W1.f();
                }
                m();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z4) {
                s();
            } else {
                k();
            }
        }
    }

    public int J() {
        int H3;
        char charAt;
        int i4 = this.f583a;
        while (true) {
            H3 = H(i4);
            if (H3 == -1 || !((charAt = D().charAt(H3)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i4 = H3 + 1;
        }
        this.f583a = H3;
        return H3;
    }

    public String K(int i4, int i5) {
        return D().subSequence(i4, i5).toString();
    }

    public abstract boolean M();

    public final boolean N(boolean z4) {
        int H3 = H(J());
        int length = D().length() - H3;
        if (length < 4 || H3 == -1) {
            return false;
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if ("null".charAt(i4) != D().charAt(H3 + i4)) {
                return false;
            }
        }
        if (length > 4 && AbstractC0371b.a(D().charAt(H3 + 4)) == 0) {
            return false;
        }
        if (!z4) {
            return true;
        }
        this.f583a = H3 + 4;
        return true;
    }

    protected final void P(char c4) {
        int i4 = this.f583a - 1;
        this.f583a = i4;
        if (i4 >= 0 && c4 == '\"' && Intrinsics.areEqual(s(), "null")) {
            x("Expected string literal but 'null' literal was found", this.f583a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new W1.f();
        }
        z(AbstractC0371b.a(c4));
        throw new W1.f();
    }

    protected void e(int i4, int i5) {
        this.f586d.append(D(), i4, i5);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(J());
    }

    public final boolean i() {
        boolean z4;
        int J3 = J();
        if (J3 == D().length()) {
            y(this, "EOF", 0, null, 6, null);
            throw new W1.f();
        }
        if (D().charAt(J3) == '\"') {
            J3++;
            z4 = true;
        } else {
            z4 = false;
        }
        boolean h4 = h(J3);
        if (!z4) {
            return h4;
        }
        if (this.f583a == D().length()) {
            y(this, "EOF", 0, null, 6, null);
            throw new W1.f();
        }
        if (D().charAt(this.f583a) == '\"') {
            this.f583a++;
            return h4;
        }
        y(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new W1.f();
    }

    public abstract String k();

    public abstract String l(String str, boolean z4);

    public abstract byte m();

    public final byte n(byte b4) {
        byte m4 = m();
        if (m4 == b4) {
            return m4;
        }
        z(b4);
        throw new W1.f();
    }

    public void o(char c4) {
        v();
        CharSequence D4 = D();
        int i4 = this.f583a;
        while (true) {
            int H3 = H(i4);
            if (H3 == -1) {
                this.f583a = H3;
                P(c4);
                return;
            }
            int i5 = H3 + 1;
            char charAt = D4.charAt(H3);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f583a = i5;
                if (charAt == c4) {
                    return;
                } else {
                    P(c4);
                }
            }
            i4 = i5;
        }
    }

    public final long p() {
        boolean z4;
        int H3 = H(J());
        if (H3 >= D().length() || H3 == -1) {
            y(this, "EOF", 0, null, 6, null);
            throw new W1.f();
        }
        if (D().charAt(H3) == '\"') {
            H3++;
            if (H3 == D().length()) {
                y(this, "EOF", 0, null, 6, null);
                throw new W1.f();
            }
            z4 = true;
        } else {
            z4 = false;
        }
        int i4 = H3;
        boolean z5 = false;
        boolean z6 = true;
        long j4 = 0;
        while (z6) {
            char charAt = D().charAt(i4);
            if (charAt != '-') {
                if (AbstractC0371b.a(charAt) != 0) {
                    break;
                }
                i4++;
                z6 = i4 != D().length();
                int i5 = charAt - '0';
                if (i5 < 0 || i5 >= 10) {
                    y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                    throw new W1.f();
                }
                j4 = (j4 * 10) - i5;
                if (j4 > 0) {
                    y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new W1.f();
                }
            } else {
                if (i4 != H3) {
                    y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new W1.f();
                }
                i4++;
                z5 = true;
            }
        }
        if (H3 == i4 || (z5 && H3 == i4 - 1)) {
            y(this, "Expected numeric literal", 0, null, 6, null);
            throw new W1.f();
        }
        if (z4) {
            if (!z6) {
                y(this, "EOF", 0, null, 6, null);
                throw new W1.f();
            }
            if (D().charAt(i4) != '\"') {
                y(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new W1.f();
            }
            i4++;
        }
        this.f583a = i4;
        if (z5) {
            return j4;
        }
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        y(this, "Numeric value overflow", 0, null, 6, null);
        throw new W1.f();
    }

    public final String q() {
        return this.f585c != null ? L() : k();
    }

    protected final String r(CharSequence source, int i4, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(i5);
        boolean z4 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                int H3 = H(c(i4, i5));
                if (H3 == -1) {
                    y(this, "EOF", H3, null, 4, null);
                    throw new W1.f();
                }
                z4 = true;
                i4 = H3;
                i5 = i4;
            } else {
                i5++;
                if (i5 >= source.length()) {
                    e(i4, i5);
                    int H4 = H(i5);
                    if (H4 == -1) {
                        y(this, "EOF", H4, null, 4, null);
                        throw new W1.f();
                    }
                    i4 = H4;
                    i5 = i4;
                    z4 = true;
                } else {
                    continue;
                }
            }
            charAt = source.charAt(i5);
        }
        String K3 = !z4 ? K(i4, i5) : u(i4, i5);
        this.f583a = i5 + 1;
        return K3;
    }

    public final String s() {
        if (this.f585c != null) {
            return L();
        }
        int J3 = J();
        if (J3 >= D().length() || J3 == -1) {
            y(this, "EOF", J3, null, 4, null);
            throw new W1.f();
        }
        byte a4 = AbstractC0371b.a(D().charAt(J3));
        if (a4 == 1) {
            return q();
        }
        if (a4 != 0) {
            y(this, "Expected beginning of the string, but got " + D().charAt(J3), 0, null, 6, null);
            throw new W1.f();
        }
        boolean z4 = false;
        while (AbstractC0371b.a(D().charAt(J3)) == 0) {
            J3++;
            if (J3 >= D().length()) {
                e(this.f583a, J3);
                int H3 = H(J3);
                if (H3 == -1) {
                    this.f583a = J3;
                    return u(0, 0);
                }
                J3 = H3;
                z4 = true;
            }
        }
        String K3 = !z4 ? K(this.f583a, J3) : u(this.f583a, J3);
        this.f583a = J3;
        return K3;
    }

    public final String t() {
        String s4 = s();
        if (!Intrinsics.areEqual(s4, "null") || !Q()) {
            return s4;
        }
        y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new W1.f();
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) D()) + "', currentPosition=" + this.f583a + ')';
    }

    public final void w() {
        if (m() == 10) {
            return;
        }
        y(this, "Expected EOF after parsing, but had " + D().charAt(this.f583a - 1) + " instead", 0, null, 6, null);
        throw new W1.f();
    }

    public final Void x(String message, int i4, String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw F.e(i4, message + " at path: " + this.f584b.a() + str, D());
    }

    public final Void z(byte b4) {
        y(this, "Expected " + (b4 == 1 ? "quotation mark '\"'" : b4 == 4 ? "comma ','" : b4 == 5 ? "colon ':'" : b4 == 6 ? "start of the object '{'" : b4 == 7 ? "end of the object '}'" : b4 == 8 ? "start of the array '['" : b4 == 9 ? "end of the array ']'" : "valid token") + ", but had '" + ((this.f583a == D().length() || this.f583a <= 0) ? "EOF" : String.valueOf(D().charAt(this.f583a - 1))) + "' instead", this.f583a - 1, null, 4, null);
        throw new W1.f();
    }

    public void v() {
    }
}
