package U;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class w implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2709d = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f2710e;

    public w(Spannable spannable) {
        this.f2710e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f2710e;
        if (!this.f2709d) {
            if ((Build.VERSION.SDK_INT < 28 ? new q1.h(9) : new v(9)).r(spannable)) {
                this.f2710e = new SpannableString(spannable);
            }
        }
        this.f2709d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f2710e.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f2710e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f2710e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2710e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2710e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2710e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i5, Class cls) {
        return this.f2710e.getSpans(i2, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2710e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i5, Class cls) {
        return this.f2710e.nextSpanTransition(i2, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f2710e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i5, int i7) {
        a();
        this.f2710e.setSpan(obj, i2, i5, i7);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i5) {
        return this.f2710e.subSequence(i2, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2710e.toString();
    }

    public w(CharSequence charSequence) {
        this.f2710e = new SpannableString(charSequence);
    }
}
