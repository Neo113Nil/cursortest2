package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c0 implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f330f = false;
    public Spannable g;

    public c0(Spannable spannable) {
        this.g = spannable;
    }

    public final void a() {
        Spannable spannable = this.g;
        if (!this.f330f) {
            if ((Build.VERSION.SDK_INT < 28 ? new g2.f(5) : new b0(5)).p(spannable)) {
                this.g = new SpannableString(spannable);
            }
        }
        this.f330f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.g.charAt(i4);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i4, int i5, Class cls) {
        return this.g.getSpans(i4, i5, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i4, int i5, Class cls) {
        return this.g.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i4, int i5, int i6) {
        a();
        this.g.setSpan(obj, i4, i5, i6);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i5) {
        return this.g.subSequence(i4, i5);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.g.toString();
    }
}
