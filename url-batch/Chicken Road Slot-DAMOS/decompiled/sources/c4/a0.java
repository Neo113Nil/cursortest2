package c4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1745d = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f1746e;

    public a0(Spannable spannable) {
        this.f1746e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f1746e;
        if (!this.f1745d) {
            if ((Build.VERSION.SDK_INT < 28 ? new u8.d(17) : new z(17)).e(spannable)) {
                this.f1746e = new SpannableString(spannable);
            }
        }
        this.f1745d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f1746e.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1746e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1746e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1746e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1746e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1746e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i10, Class cls) {
        return this.f1746e.getSpans(i3, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1746e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i10, Class cls) {
        return this.f1746e.nextSpanTransition(i3, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1746e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i10, int i11) {
        a();
        this.f1746e.setSpan(obj, i3, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i10) {
        return this.f1746e.subSequence(i3, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1746e.toString();
    }
}
