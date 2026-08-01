package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f474a;

    /* renamed from: b, reason: collision with root package name */
    public final j f475b;

    /* renamed from: c, reason: collision with root package name */
    public final int f476c;

    public a(int i, j jVar, int i2) {
        this.f474a = i;
        this.f475b = jVar;
        this.f476c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f474a);
        this.f475b.f488a.performAction(this.f476c, bundle);
    }
}
