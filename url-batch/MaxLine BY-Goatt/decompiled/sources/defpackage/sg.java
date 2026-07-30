package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sg {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public sg(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            i21.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            i21.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new wt(charSequence, i));
    }

    public void a(int i) {
        new Handler(Looper.getMainLooper()).post(new ie(i, 1, this));
    }

    public void b(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        i21.a("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public int c() {
        gn gnVar = (gn) this.e;
        String str = (String) this.d;
        if (gnVar == null) {
            return str.length();
        }
        return (gnVar.b - gnVar.c()) + (str.length() - (this.c - this.b));
    }

    public boolean d(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!ag0.d()) {
                    return false;
                }
                ag0 a = ag0.a();
                if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean e(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return ph2.i(Character.codePointBefore((CharSequence) this.d, i));
    }

    public boolean f(int i) {
        b(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (h(i) && h(i - 1) && h(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(g(i) || g(i + 1));
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.b(of, unicodeBlock) && Intrinsics.b(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.b(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.b(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!ag0.d()) {
                return false;
            }
            ag0 a = ag0.a();
            if (a.c() != 1 || a.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean i(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return ph2.i(Character.codePointAt((CharSequence) this.d, i));
    }

    public void j(int i, int i2, int i3, int i4) {
        int i5 = this.c;
        if (i < 0) {
            int i6 = this.b;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.e)[(i * i5) + i2] = (byte) ((((String) this.d).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public int k(int i) {
        b(i);
        int following = ((BreakIterator) this.e).following(i);
        return (h(following + (-1)) && h(following) && !g(following)) ? k(following) : following;
    }

    public void m(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            typeface = wg.a(typeface, i, (this.c & 2) != 0);
        }
        xg xgVar = (xg) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (xgVar.m) {
            xgVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = xgVar.j;
                if (isAttachedToWindow) {
                    textView.post(new tg(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public int n(int i) {
        b(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        return (h(preceding) && d(preceding) && !g(preceding)) ? n(preceding) : preceding;
    }

    public void o(String str, int i, int i2) {
        if (i > i2) {
            i21.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            i21.a("start must be non-negative, but was " + i);
        }
        gn gnVar = (gn) this.e;
        if (gnVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            gn gnVar2 = new gn(3);
            gnVar2.b = max;
            gnVar2.e = cArr;
            gnVar2.c = length;
            gnVar2.d = i4;
            this.e = gnVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > gnVar.b - gnVar.c()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            o(str, i, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > gnVar.c()) {
            int c = length2 - gnVar.c();
            int i9 = gnVar.b;
            do {
                i9 *= 2;
            } while (i9 - gnVar.b < c);
            char[] cArr2 = new char[i9];
            ni.f((char[]) gnVar.e, cArr2, 0, 0, gnVar.c);
            int i10 = gnVar.b;
            int i11 = gnVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            ni.f((char[]) gnVar.e, cArr2, i13, i11, i12 + i11);
            gnVar.e = cArr2;
            gnVar.b = i9;
            gnVar.d = i13;
        }
        int i14 = gnVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) gnVar.e;
            ni.f(cArr3, cArr3, gnVar.d - i15, i8, i14);
            gnVar.c = i7;
            gnVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int c2 = gnVar.c() + i7;
            int c3 = gnVar.c() + i8;
            int i16 = gnVar.d;
            char[] cArr4 = (char[]) gnVar.e;
            ni.f(cArr4, cArr4, gnVar.c, i16, c2);
            gnVar.c += c2 - i16;
            gnVar.d = c3;
        } else {
            gnVar.d = gnVar.c() + i8;
            gnVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) gnVar.e, gnVar.c);
        gnVar.c = str.length() + gnVar.c;
    }

    public void p(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        j(i4, i5, i3, 1);
        int i6 = i2 - 1;
        j(i4, i6, i3, 2);
        int i7 = i - 1;
        j(i7, i5, i3, 3);
        j(i7, i6, i3, 4);
        j(i7, i2, i3, 5);
        j(i, i5, i3, 6);
        j(i, i6, i3, 7);
        j(i, i2, i3, 8);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                gn gnVar = (gn) this.e;
                String str = (String) this.d;
                if (gnVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) gnVar.e, 0, gnVar.c);
                char[] cArr = (char[]) gnVar.e;
                int i = gnVar.d;
                sb.append(cArr, i, gnVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void l(int i) {
    }

    public /* synthetic */ sg() {
    }

    public sg(String str, int i, int i2) {
        this.d = str;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.e = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public sg(xg xgVar, int i, int i2, WeakReference weakReference) {
        this.e = xgVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
