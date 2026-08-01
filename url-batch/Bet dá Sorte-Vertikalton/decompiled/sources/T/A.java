package T;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class A implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f776a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f777b;

    public A(Spannable spannable) {
        this.f777b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f777b;
        if (!this.f776a) {
            if ((Build.VERSION.SDK_INT < 28 ? new M0.e(8) : new z(8)).n(spannable)) {
                this.f777b = new SpannableString(spannable);
            }
        }
        this.f776a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f777b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f777b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f777b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f777b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f777b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f777b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f777b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f777b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f777b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f777b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f777b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f777b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f777b.toString();
    }
}
