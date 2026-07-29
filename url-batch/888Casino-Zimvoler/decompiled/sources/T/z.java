package T;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class z implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f756a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f757b;

    public z(Spannable spannable) {
        this.f757b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f757b;
        if (!this.f756a) {
            if ((Build.VERSION.SDK_INT < 28 ? new H0.e(8) : new y(8)).o(spannable)) {
                this.f757b = new SpannableString(spannable);
            }
        }
        this.f756a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f757b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f757b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f757b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f757b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f757b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f757b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f757b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f757b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f757b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f757b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f757b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f757b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f757b.toString();
    }
}
