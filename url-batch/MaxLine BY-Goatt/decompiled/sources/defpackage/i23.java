package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i23 implements Spannable {
    public boolean m = false;
    public Spannable n;

    public i23(Spannable spannable) {
        this.n = spannable;
    }

    public final void a() {
        Spannable spannable = this.n;
        if (!this.m) {
            if ((Build.VERSION.SDK_INT < 28 ? new dq2(8) : new h23(8)).i(spannable)) {
                this.n = new SpannableString(spannable);
            }
        }
        this.m = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.n.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.n.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.n.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.n.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.n.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.n.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.n.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.n.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.n.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.n.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.n.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.n.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.n.toString();
    }
}
