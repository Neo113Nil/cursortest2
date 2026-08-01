package T;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class B implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f775a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f776b;

    public B(Spannable spannable) {
        this.f776b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f776b;
        if (!this.f775a) {
            if ((Build.VERSION.SDK_INT < 28 ? new H0.e(8) : new A(8)).k(spannable)) {
                this.f776b = new SpannableString(spannable);
            }
        }
        this.f775a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f776b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f776b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f776b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f776b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f776b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f776b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f776b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f776b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f776b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f776b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f776b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f776b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f776b.toString();
    }
}
