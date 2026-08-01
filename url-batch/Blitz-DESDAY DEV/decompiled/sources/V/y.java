package V;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class y implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f922a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f923b;

    public y(Spannable spannable) {
        this.f923b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f923b;
        if (!this.f922a) {
            if ((Build.VERSION.SDK_INT < 28 ? new L0.e(10) : new x(10)).j(spannable)) {
                this.f923b = new SpannableString(spannable);
            }
        }
        this.f922a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f923b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f923b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f923b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f923b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f923b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f923b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f923b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f923b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f923b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f923b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f923b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f923b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f923b.toString();
    }
}
