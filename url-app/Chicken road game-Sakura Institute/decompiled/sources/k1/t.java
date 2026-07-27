package k1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class t implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7417a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f7418b;

    public t(Spannable spannable) {
        this.f7418b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f7418b;
        if (!this.f7417a) {
            if ((Build.VERSION.SDK_INT < 28 ? new H1.f(16, false) : new s(16, false)).p(spannable)) {
                this.f7418b = new SpannableString(spannable);
            }
        }
        this.f7417a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f7418b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f7418b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f7418b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f7418b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f7418b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f7418b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i4, Class cls) {
        return this.f7418b.getSpans(i2, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7418b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i4, Class cls) {
        return this.f7418b.nextSpanTransition(i2, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f7418b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i4, int i5) {
        a();
        this.f7418b.setSpan(obj, i2, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i4) {
        return this.f7418b.subSequence(i2, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f7418b.toString();
    }
}
