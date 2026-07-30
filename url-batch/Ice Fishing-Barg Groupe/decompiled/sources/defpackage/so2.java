package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class so2 implements Spannable {
    public Spannable OPXfSBeufaJ8;
    public boolean rtx2ld2ELZv4 = false;

    public so2(Spannable spannable) {
        this.OPXfSBeufaJ8 = spannable;
    }

    public final void PxuCJdSBwIXG() {
        Spannable spannable = this.OPXfSBeufaJ8;
        if (!this.rtx2ld2ELZv4) {
            if ((Build.VERSION.SDK_INT < 28 ? new fb0(21) : new ro2(21)).EcgxDIVH5in8(spannable)) {
                this.OPXfSBeufaJ8 = new SpannableString(spannable);
            }
        }
        this.rtx2ld2ELZv4 = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.OPXfSBeufaJ8.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.OPXfSBeufaJ8.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.OPXfSBeufaJ8.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.OPXfSBeufaJ8.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.OPXfSBeufaJ8.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.OPXfSBeufaJ8.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.OPXfSBeufaJ8.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.OPXfSBeufaJ8.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.OPXfSBeufaJ8.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        PxuCJdSBwIXG();
        this.OPXfSBeufaJ8.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        PxuCJdSBwIXG();
        this.OPXfSBeufaJ8.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.OPXfSBeufaJ8.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.OPXfSBeufaJ8.toString();
    }
}
