package l3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f5945f = false;

    /* renamed from: g, reason: collision with root package name */
    public Spannable f5946g;

    public y(Spannable spannable) {
        this.f5946g = spannable;
    }

    public final void a() {
        Spannable spannable = this.f5946g;
        if (!this.f5945f) {
            if ((Build.VERSION.SDK_INT < 28 ? new m4.f() : new x()).k(spannable)) {
                this.f5946g = new SpannableString(spannable);
            }
        }
        this.f5945f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f5946g.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5946g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5946g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5946g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5946g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5946g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f5946g.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5946g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f5946g.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5946g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f5946g.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f5946g.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5946g.toString();
    }
}
