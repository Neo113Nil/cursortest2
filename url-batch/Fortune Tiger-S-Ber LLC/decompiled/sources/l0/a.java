package l0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    public final int f2846f;
    public final e g;
    public final int h;

    public a(int i4, e eVar, int i5) {
        this.f2846f = i4;
        this.g = eVar;
        this.h = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2846f);
        this.g.f2855a.performAction(this.h, bundle);
    }
}
