package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c0 implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f440f = false;

    /* renamed from: g, reason: collision with root package name */
    public Spannable f441g;

    public c0(Spannable spannable) {
        this.f441g = spannable;
    }

    public final void a() {
        Spannable spannable = this.f441g;
        if (!this.f440f) {
            if ((Build.VERSION.SDK_INT < 28 ? new o2.f(5) : new b0(5)).k(spannable)) {
                this.f441g = new SpannableString(spannable);
            }
        }
        this.f440f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f441g.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f441g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f441g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f441g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f441g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f441g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        return this.f441g.getSpans(i, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f441g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        return this.f441g.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f441g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i5) {
        a();
        this.f441g.setSpan(obj, i, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return this.f441g.subSequence(i, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f441g.toString();
    }
}
