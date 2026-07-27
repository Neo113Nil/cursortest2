package C0;

import A.AbstractC0017m;
import A.C0020p;
import B0.o;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import r0.B;
import z2.C1436t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1155a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1156b;

    /* renamed from: c, reason: collision with root package name */
    public int f1157c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1158d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1159e;

    public /* synthetic */ f() {
    }

    public void a(int i2) {
        int i4 = this.f1156b;
        int i5 = this.f1157c;
        if (i2 > i5 || i4 > i2) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(i2);
            sb.append(". Valid range is [");
            sb.append(i4);
            sb.append(" , ");
            throw new IllegalArgumentException(AbstractC0017m.l(sb, i5, ']').toString());
        }
    }

    public int b() {
        C0020p c0020p = (C0020p) this.f1159e;
        if (c0020p == null) {
            return ((String) this.f1158d).length();
        }
        return (c0020p.f172b - c0020p.b()) + (((String) this.f1158d).length() - (this.f1157c - this.f1156b));
    }

    public boolean c(int i2) {
        return i2 <= this.f1157c && this.f1156b + 1 <= i2 && Character.isLetterOrDigit(Character.codePointBefore(this.f1158d, i2));
    }

    public boolean d(int i2) {
        int i4 = this.f1156b + 1;
        if (i2 > this.f1157c || i4 > i2) {
            return false;
        }
        return M1.a.I(Character.codePointBefore(this.f1158d, i2));
    }

    public boolean e(int i2) {
        return i2 < this.f1157c && this.f1156b <= i2 && Character.isLetterOrDigit(Character.codePointAt(this.f1158d, i2));
    }

    public boolean f(int i2) {
        if (i2 >= this.f1157c || this.f1156b > i2) {
            return false;
        }
        return M1.a.I(Character.codePointAt(this.f1158d, i2));
    }

    public void g(String str, int i2, int i4) {
        if (i2 > i4) {
            throw new IllegalArgumentException(B.b(i2, i4, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.g(i2, "start must be non-negative, but was ").toString());
        }
        C0020p c0020p = (C0020p) this.f1159e;
        if (c0020p == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(((String) this.f1158d).length() - i4, 64);
            String str2 = (String) this.f1158d;
            int i5 = i2 - min;
            Intrinsics.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i5, i2, cArr, 0);
            String str3 = (String) this.f1158d;
            int i6 = max - min2;
            int i7 = min2 + i4;
            Intrinsics.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i4, i7, cArr, i6);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            C0020p c0020p2 = new C0020p();
            c0020p2.f172b = max;
            c0020p2.f175e = cArr;
            c0020p2.f173c = length;
            c0020p2.f174d = i6;
            this.f1159e = c0020p2;
            this.f1156b = i5;
            this.f1157c = i7;
            return;
        }
        int i8 = this.f1156b;
        int i9 = i2 - i8;
        int i10 = i4 - i8;
        if (i9 < 0 || i10 > c0020p.f172b - c0020p.b()) {
            this.f1158d = toString();
            this.f1159e = null;
            this.f1156b = -1;
            this.f1157c = -1;
            g(str, i2, i4);
            return;
        }
        int length2 = str.length() - (i10 - i9);
        if (length2 > c0020p.b()) {
            int b4 = length2 - c0020p.b();
            int i11 = c0020p.f172b;
            do {
                i11 *= 2;
            } while (i11 - c0020p.f172b < b4);
            char[] cArr2 = new char[i11];
            C1436t.d((char[]) c0020p.f175e, cArr2, 0, 0, c0020p.f173c);
            int i12 = c0020p.f172b;
            int i13 = c0020p.f174d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            C1436t.d((char[]) c0020p.f175e, cArr2, i15, i13, i14 + i13);
            c0020p.f175e = cArr2;
            c0020p.f172b = i11;
            c0020p.f174d = i15;
        }
        int i16 = c0020p.f173c;
        if (i9 < i16 && i10 <= i16) {
            int i17 = i16 - i10;
            char[] cArr3 = (char[]) c0020p.f175e;
            C1436t.d(cArr3, cArr3, c0020p.f174d - i17, i10, i16);
            c0020p.f173c = i9;
            c0020p.f174d -= i17;
        } else if (i9 >= i16 || i10 < i16) {
            int b5 = c0020p.b() + i9;
            int b6 = c0020p.b() + i10;
            int i18 = c0020p.f174d;
            char[] cArr4 = (char[]) c0020p.f175e;
            C1436t.d(cArr4, cArr4, c0020p.f173c, i18, b5);
            c0020p.f173c += b5 - i18;
            c0020p.f174d = b6;
        } else {
            c0020p.f174d = c0020p.b() + i10;
            c0020p.f173c = i9;
        }
        str.getChars(0, str.length(), (char[]) c0020p.f175e, c0020p.f173c);
        c0020p.f173c = str.length() + c0020p.f173c;
    }

    public String toString() {
        switch (this.f1155a) {
            case 1:
                C0020p c0020p = (C0020p) this.f1159e;
                if (c0020p == null) {
                    return (String) this.f1158d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1158d, 0, this.f1156b);
                sb.append((char[]) c0020p.f175e, 0, c0020p.f173c);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, start…x, endIndex - startIndex)");
                char[] cArr = (char[]) c0020p.f175e;
                int i2 = c0020p.f174d;
                sb.append(cArr, i2, c0020p.f172b - i2);
                Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, start…x, endIndex - startIndex)");
                String str = (String) this.f1158d;
                sb.append((CharSequence) str, this.f1157c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(CharSequence charSequence, int i2, Locale locale) {
        this.f1158d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f1159e = wordInstance;
        this.f1156b = Math.max(0, -50);
        this.f1157c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new o(charSequence, i2));
    }
}
