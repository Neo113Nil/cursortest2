package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    public final int f2868f;

    /* renamed from: g, reason: collision with root package name */
    public final g f2869g;
    public final int h;

    public a(int i, g gVar, int i4) {
        this.f2868f = i;
        this.f2869g = gVar;
        this.h = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2868f);
        this.f2869g.f2882a.performAction(this.h, bundle);
    }
}
