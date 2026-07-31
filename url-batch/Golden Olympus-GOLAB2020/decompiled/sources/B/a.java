package B;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    private final int f111b;

    /* renamed from: c, reason: collision with root package name */
    private final w f112c;

    /* renamed from: d, reason: collision with root package name */
    private final int f113d;

    public a(int i4, w wVar, int i5) {
        this.f111b = i4;
        this.f112c = wVar;
        this.f113d = i5;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f111b);
        this.f112c.a0(this.f113d, bundle);
    }
}
