package E;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    public final int f574f;

    /* renamed from: g, reason: collision with root package name */
    public final h f575g;

    /* renamed from: h, reason: collision with root package name */
    public final int f576h;

    public a(int i7, h hVar, int i8) {
        this.f574f = i7;
        this.f575g = hVar;
        this.f576h = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f574f);
        this.f575g.f585a.performAction(this.f576h, bundle);
    }
}
