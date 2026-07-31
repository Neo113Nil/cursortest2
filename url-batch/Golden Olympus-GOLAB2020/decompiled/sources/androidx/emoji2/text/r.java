package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
class r implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    private boolean f12220b = false;

    /* renamed from: c, reason: collision with root package name */
    private Spannable f12221c;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof PrecomputedTextCompat;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.r.b
        boolean a(CharSequence charSequence) {
            return androidx.core.text.c.a(charSequence) || (charSequence instanceof PrecomputedTextCompat);
        }
    }

    r(Spannable spannable) {
        this.f12221c = spannable;
    }

    private void a() {
        Spannable spannable = this.f12221c;
        if (!this.f12220b && c().a(spannable)) {
            this.f12221c = new SpannableString(spannable);
        }
        this.f12220b = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f12221c;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i4) {
        return this.f12221c.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f12221c);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f12221c);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f12221c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f12221c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f12221c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i4, int i5, Class cls) {
        return this.f12221c.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f12221c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        return this.f12221c.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f12221c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.f12221c.setSpan(obj, i4, i5, i6);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return this.f12221c.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f12221c.toString();
    }

    r(CharSequence charSequence) {
        this.f12221c = new SpannableString(charSequence);
    }
}
