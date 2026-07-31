package j1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class w implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5297a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f5298b;

    public w(Spannable spannable) {
        this.f5298b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f5298b;
        if (!this.f5297a) {
            if ((Build.VERSION.SDK_INT < 28 ? new F0.a(29) : new v(29)).p(spannable)) {
                this.f5298b = new SpannableString(spannable);
            }
        }
        this.f5297a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f5298b.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f5298b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f5298b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f5298b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f5298b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f5298b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.f5298b.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f5298b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f5298b.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f5298b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        a();
        this.f5298b.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.f5298b.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f5298b.toString();
    }
}
