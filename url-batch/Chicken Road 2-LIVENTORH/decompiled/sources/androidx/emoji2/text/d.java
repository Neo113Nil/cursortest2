package androidx.emoji2.text;

import android.text.TextPaint;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f319b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f320a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f320a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
