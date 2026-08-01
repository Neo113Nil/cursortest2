package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c0 implements Spannable {

    /* renamed from: f, reason: collision with root package name */
    public boolean f317f = false;

    /* renamed from: g, reason: collision with root package name */
    public Spannable f318g;

    public c0(Spannable spannable) {
        this.f318g = spannable;
    }

    public final void a() {
        Spannable spannable = this.f318g;
        if (!this.f317f) {
            if ((Build.VERSION.SDK_INT < 28 ? new l2.f(5) : new b0(5)).j(spannable)) {
                this.f318g = new SpannableString(spannable);
            }
        }
        this.f317f = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f318g.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f318g.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f318g.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f318g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f318g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f318g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        return this.f318g.getSpans(i, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f318g.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        return this.f318g.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f318g.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i5) {
        a();
        this.f318g.setSpan(obj, i, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return this.f318g.subSequence(i, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f318g.toString();
    }
}
