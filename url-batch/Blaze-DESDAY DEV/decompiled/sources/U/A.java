package U;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class A implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f843a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f844b;

    public A(Spannable spannable) {
        this.f844b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f844b;
        if (!this.f843a) {
            if ((Build.VERSION.SDK_INT < 28 ? new J0.e(10) : new z(10)).n(spannable)) {
                this.f844b = new SpannableString(spannable);
            }
        }
        this.f843a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f844b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f844b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f844b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f844b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f844b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f844b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f844b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f844b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f844b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f844b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f844b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f844b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f844b.toString();
    }
}
