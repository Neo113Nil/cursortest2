package androidx.emoji2.text;

import android.text.TextPaint;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f331b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f332a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f332a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
