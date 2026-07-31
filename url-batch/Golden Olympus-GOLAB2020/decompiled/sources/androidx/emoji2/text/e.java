package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;

/* loaded from: classes.dex */
class e implements f.e {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f12129b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f12130a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f12130a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal threadLocal = f12129b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i4, int i5, int i6) {
        StringBuilder b4 = b();
        b4.setLength(0);
        while (i4 < i5) {
            b4.append(charSequence.charAt(i4));
            i4++;
        }
        return androidx.core.graphics.b.a(this.f12130a, b4.toString());
    }
}
