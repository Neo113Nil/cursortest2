package c2;

import a0.m;
import a0.p;
import b2.n;
import java.text.BreakIterator;
import java.util.Locale;
import r6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1634a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1635b;

    /* renamed from: c, reason: collision with root package name */
    public int f1636c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1637d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1638e;

    public /* synthetic */ f() {
    }

    public void a(int i7) {
        int i8 = this.f1635b;
        int i9 = this.f1636c;
        if (i7 > i9 || i8 > i7) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(i7);
            sb.append(". Valid range is [");
            sb.append(i8);
            sb.append(" , ");
            throw new IllegalArgumentException(m.l(sb, i9, ']').toString());
        }
    }

    public int b() {
        p pVar = (p) this.f1638e;
        if (pVar == null) {
            return ((String) this.f1637d).length();
        }
        return (pVar.f118b - pVar.b()) + (((String) this.f1637d).length() - (this.f1636c - this.f1635b));
    }

    public boolean c(int i7) {
        return i7 <= this.f1636c && this.f1635b + 1 <= i7 && Character.isLetterOrDigit(Character.codePointBefore(this.f1637d, i7));
    }

    public boolean d(int i7) {
        int i8 = this.f1635b + 1;
        if (i7 > this.f1636c || i8 > i7) {
            return false;
        }
        return a8.m.B(Character.codePointBefore(this.f1637d, i7));
    }

    public boolean e(int i7) {
        return i7 < this.f1636c && this.f1635b <= i7 && Character.isLetterOrDigit(Character.codePointAt(this.f1637d, i7));
    }

    public boolean f(int i7) {
        int i8 = this.f1635b;
        if (i7 >= this.f1636c || i8 > i7) {
            return false;
        }
        return a8.m.B(Character.codePointAt(this.f1637d, i7));
    }

    public void g(int i7, int i8, String str) {
        if (i7 > i8) {
            throw new IllegalArgumentException(i.b(i7, i8, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(m.i("start must be non-negative, but was ", i7).toString());
        }
        p pVar = (p) this.f1638e;
        if (pVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i7, 64);
            int min2 = Math.min(((String) this.f1637d).length() - i8, 64);
            String str2 = (String) this.f1637d;
            int i9 = i7 - min;
            k.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i9, i7, cArr, 0);
            String str3 = (String) this.f1637d;
            int i10 = max - min2;
            int i11 = min2 + i8;
            k.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i8, i11, cArr, i10);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            p pVar2 = new p();
            pVar2.f118b = max;
            pVar2.f121e = cArr;
            pVar2.f119c = length;
            pVar2.f120d = i10;
            this.f1638e = pVar2;
            this.f1635b = i9;
            this.f1636c = i11;
            return;
        }
        int i12 = this.f1635b;
        int i13 = i7 - i12;
        int i14 = i8 - i12;
        if (i13 < 0 || i14 > pVar.f118b - pVar.b()) {
            this.f1637d = toString();
            this.f1638e = null;
            this.f1635b = -1;
            this.f1636c = -1;
            g(i7, i8, str);
            return;
        }
        int length2 = str.length() - (i14 - i13);
        if (length2 > pVar.b()) {
            int b9 = length2 - pVar.b();
            int i15 = pVar.f118b;
            do {
                i15 *= 2;
            } while (i15 - pVar.f118b < b9);
            char[] cArr2 = new char[i15];
            e6.k.V((char[]) pVar.f121e, cArr2, 0, 0, pVar.f119c);
            int i16 = pVar.f118b;
            int i17 = pVar.f120d;
            int i18 = i16 - i17;
            int i19 = i15 - i18;
            e6.k.V((char[]) pVar.f121e, cArr2, i19, i17, i18 + i17);
            pVar.f121e = cArr2;
            pVar.f118b = i15;
            pVar.f120d = i19;
        }
        int i20 = pVar.f119c;
        if (i13 < i20 && i14 <= i20) {
            int i21 = i20 - i14;
            char[] cArr3 = (char[]) pVar.f121e;
            e6.k.V(cArr3, cArr3, pVar.f120d - i21, i14, i20);
            pVar.f119c = i13;
            pVar.f120d -= i21;
        } else if (i13 >= i20 || i14 < i20) {
            int b10 = pVar.b() + i13;
            int b11 = pVar.b() + i14;
            int i22 = pVar.f120d;
            char[] cArr4 = (char[]) pVar.f121e;
            e6.k.V(cArr4, cArr4, pVar.f119c, i22, b10);
            pVar.f119c += b10 - i22;
            pVar.f120d = b11;
        } else {
            pVar.f120d = pVar.b() + i14;
            pVar.f119c = i13;
        }
        str.getChars(0, str.length(), (char[]) pVar.f121e, pVar.f119c);
        pVar.f119c = str.length() + pVar.f119c;
    }

    public String toString() {
        switch (this.f1634a) {
            case 1:
                p pVar = (p) this.f1638e;
                if (pVar == null) {
                    return (String) this.f1637d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1637d, 0, this.f1635b);
                sb.append((char[]) pVar.f121e, 0, pVar.f119c);
                char[] cArr = (char[]) pVar.f121e;
                int i7 = pVar.f120d;
                sb.append(cArr, i7, pVar.f118b - i7);
                String str = (String) this.f1637d;
                sb.append((CharSequence) str, this.f1636c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(CharSequence charSequence, int i7, Locale locale) {
        this.f1637d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i7 < 0 || i7 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f1638e = wordInstance;
        this.f1635b = Math.max(0, -50);
        this.f1636c = Math.min(charSequence.length(), i7 + 50);
        wordInstance.setText(new n(charSequence, i7));
    }
}
