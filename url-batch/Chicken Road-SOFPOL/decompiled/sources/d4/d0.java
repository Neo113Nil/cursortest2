package d4;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 implements Spannable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f2255d = false;

    /* renamed from: e, reason: collision with root package name */
    public Spannable f2256e;

    public d0(Spannable spannable) {
        this.f2256e = spannable;
    }

    public final void a() {
        Spannable spannable = this.f2256e;
        if (!this.f2255d) {
            if ((Build.VERSION.SDK_INT < 28 ? new w5.f(11) : new c0(11)).k(spannable)) {
                this.f2256e = new SpannableString(spannable);
            }
        }
        this.f2255d = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f2256e.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f2256e.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f2256e.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2256e.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2256e.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2256e.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i8, Class cls) {
        return this.f2256e.getSpans(i, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2256e.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i8, Class cls) {
        return this.f2256e.nextSpanTransition(i, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f2256e.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i8, int i9) {
        a();
        this.f2256e.setSpan(obj, i, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i8) {
        return this.f2256e.subSequence(i, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2256e.toString();
    }
}
