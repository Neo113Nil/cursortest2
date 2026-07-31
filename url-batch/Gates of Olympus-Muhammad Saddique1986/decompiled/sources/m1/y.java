package m1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class y implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6992a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f6993b;

    public y(Spannable spannable) {
        this.f6993b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f6993b;
        if (!this.f6992a) {
            if ((Build.VERSION.SDK_INT < 28 ? new w(0) : new x(0)).b(spannable)) {
                this.f6993b = new SpannableString(spannable);
            }
        }
        this.f6992a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f6993b.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f6993b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f6993b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f6993b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f6993b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f6993b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.f6993b.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6993b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f6993b.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f6993b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        a();
        this.f6993b.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.f6993b.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6993b.toString();
    }
}
