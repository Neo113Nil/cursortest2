package androidx.emoji2.text;

import android.text.TextPaint;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f442b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f443a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f443a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
