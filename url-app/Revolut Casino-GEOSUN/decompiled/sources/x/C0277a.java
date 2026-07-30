package x;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f3083a;

    /* renamed from: b, reason: collision with root package name */
    public final C0284h f3084b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3085c;

    public C0277a(int i2, C0284h c0284h, int i3) {
        this.f3083a = i2;
        this.f3084b = c0284h;
        this.f3085c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3083a);
        this.f3084b.f3093a.performAction(this.f3085c, bundle);
    }
}
