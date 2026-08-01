package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f531a;

    /* renamed from: b, reason: collision with root package name */
    public final j f532b;

    /* renamed from: c, reason: collision with root package name */
    public final int f533c;

    public a(int i, j jVar, int i2) {
        this.f531a = i;
        this.f532b = jVar;
        this.f533c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f531a);
        this.f532b.f544a.performAction(this.f533c, bundle);
    }
}
