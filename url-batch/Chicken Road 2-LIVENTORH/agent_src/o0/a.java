package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    public final int f2847f;

    /* renamed from: g, reason: collision with root package name */
    public final e f2848g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2849h;

    public a(int i, e eVar, int i4) {
        this.f2847f = i;
        this.f2848g = eVar;
        this.f2849h = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2847f);
        this.f2848g.f2861a.performAction(this.f2849h, bundle);
    }
}
