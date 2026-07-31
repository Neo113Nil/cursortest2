package E0;

import A.k;
import B.C0014o;
import D0.p;
import a.AbstractC0235a;
import f2.j;
import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1027a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1028b;

    /* renamed from: c, reason: collision with root package name */
    public int f1029c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1030d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1031e;

    public /* synthetic */ f() {
    }

    public void a(int i3) {
        int i4 = this.f1028b;
        int i5 = this.f1029c;
        if (i3 > i5 || i4 > i3) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(i3);
            sb.append(". Valid range is [");
            sb.append(i4);
            sb.append(" , ");
            throw new IllegalArgumentException(k.j(sb, i5, ']').toString());
        }
    }

    public int b() {
        C0014o c0014o = (C0014o) this.f1031e;
        if (c0014o == null) {
            return ((String) this.f1030d).length();
        }
        return (c0014o.f428b - c0014o.b()) + (((String) this.f1030d).length() - (this.f1029c - this.f1028b));
    }

    public boolean c(int i3) {
        return i3 <= this.f1029c && this.f1028b + 1 <= i3 && Character.isLetterOrDigit(Character.codePointBefore(this.f1030d, i3));
    }

    public boolean d(int i3) {
        int i4 = this.f1028b + 1;
        if (i3 > this.f1029c || i4 > i3) {
            return false;
        }
        return AbstractC0235a.D(Character.codePointBefore(this.f1030d, i3));
    }

    public boolean e(int i3) {
        return i3 < this.f1029c && this.f1028b <= i3 && Character.isLetterOrDigit(Character.codePointAt(this.f1030d, i3));
    }

    public boolean f(int i3) {
        if (i3 >= this.f1029c || this.f1028b > i3) {
            return false;
        }
        return AbstractC0235a.D(Character.codePointAt(this.f1030d, i3));
    }

    public void g(int i3, int i4, String str) {
        if (i3 > i4) {
            throw new IllegalArgumentException(k.f(i3, i4, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(k.h("start must be non-negative, but was ", i3).toString());
        }
        C0014o c0014o = (C0014o) this.f1031e;
        if (c0014o == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i3, 64);
            int min2 = Math.min(((String) this.f1030d).length() - i4, 64);
            String str2 = (String) this.f1030d;
            int i5 = i3 - min;
            j.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i5, i3, cArr, 0);
            String str3 = (String) this.f1030d;
            int i6 = max - min2;
            int i7 = min2 + i4;
            j.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i4, i7, cArr, i6);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            C0014o c0014o2 = new C0014o();
            c0014o2.f428b = max;
            c0014o2.f431e = cArr;
            c0014o2.f429c = length;
            c0014o2.f430d = i6;
            this.f1031e = c0014o2;
            this.f1028b = i5;
            this.f1029c = i7;
            return;
        }
        int i8 = this.f1028b;
        int i9 = i3 - i8;
        int i10 = i4 - i8;
        if (i9 < 0 || i10 > c0014o.f428b - c0014o.b()) {
            this.f1030d = toString();
            this.f1031e = null;
            this.f1028b = -1;
            this.f1029c = -1;
            g(i3, i4, str);
            return;
        }
        int length2 = str.length() - (i10 - i9);
        if (length2 > c0014o.b()) {
            int b3 = length2 - c0014o.b();
            int i11 = c0014o.f428b;
            do {
                i11 *= 2;
            } while (i11 - c0014o.f428b < b3);
            char[] cArr2 = new char[i11];
            S1.k.k0((char[]) c0014o.f431e, cArr2, 0, 0, c0014o.f429c);
            int i12 = c0014o.f428b;
            int i13 = c0014o.f430d;
            int i14 = i12 - i13;
            int i15 = i11 - i14;
            S1.k.k0((char[]) c0014o.f431e, cArr2, i15, i13, i14 + i13);
            c0014o.f431e = cArr2;
            c0014o.f428b = i11;
            c0014o.f430d = i15;
        }
        int i16 = c0014o.f429c;
        if (i9 < i16 && i10 <= i16) {
            int i17 = i16 - i10;
            char[] cArr3 = (char[]) c0014o.f431e;
            S1.k.k0(cArr3, cArr3, c0014o.f430d - i17, i10, i16);
            c0014o.f429c = i9;
            c0014o.f430d -= i17;
        } else if (i9 >= i16 || i10 < i16) {
            int b4 = c0014o.b() + i9;
            int b5 = c0014o.b() + i10;
            int i18 = c0014o.f430d;
            char[] cArr4 = (char[]) c0014o.f431e;
            S1.k.k0(cArr4, cArr4, c0014o.f429c, i18, b4);
            c0014o.f429c += b4 - i18;
            c0014o.f430d = b5;
        } else {
            c0014o.f430d = c0014o.b() + i10;
            c0014o.f429c = i9;
        }
        str.getChars(0, str.length(), (char[]) c0014o.f431e, c0014o.f429c);
        c0014o.f429c = str.length() + c0014o.f429c;
    }

    public String toString() {
        switch (this.f1027a) {
            case 1:
                C0014o c0014o = (C0014o) this.f1031e;
                if (c0014o == null) {
                    return (String) this.f1030d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1030d, 0, this.f1028b);
                sb.append((char[]) c0014o.f431e, 0, c0014o.f429c);
                char[] cArr = (char[]) c0014o.f431e;
                int i3 = c0014o.f430d;
                sb.append(cArr, i3, c0014o.f428b - i3);
                String str = (String) this.f1030d;
                sb.append((CharSequence) str, this.f1029c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(CharSequence charSequence, int i3, Locale locale) {
        this.f1030d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i3 < 0 || i3 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f1031e = wordInstance;
        this.f1028b = Math.max(0, -50);
        this.f1029c = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new p(charSequence, i3));
    }
}
