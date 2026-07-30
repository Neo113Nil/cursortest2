package c3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    public final int f1639f;

    /* renamed from: g, reason: collision with root package name */
    public final i f1640g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1641h;

    public a(int i7, i iVar, int i8) {
        this.f1639f = i7;
        this.f1640g = iVar;
        this.f1641h = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1639f);
        this.f1640g.f1655a.performAction(this.f1641h, bundle);
    }
}
