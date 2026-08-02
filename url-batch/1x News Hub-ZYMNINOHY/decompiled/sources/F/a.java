package F;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f473a;

    /* renamed from: b, reason: collision with root package name */
    public final e f474b;

    /* renamed from: c, reason: collision with root package name */
    public final int f475c;

    public a(int i3, e eVar, int i4) {
        this.f473a = i3;
        this.f474b = eVar;
        this.f475c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f473a);
        this.f474b.f482a.performAction(this.f475c, bundle);
    }
}
