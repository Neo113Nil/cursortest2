package M;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f601a;

    /* renamed from: b, reason: collision with root package name */
    public final j f602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f603c;

    public a(int i, j jVar, int i2) {
        this.f601a = i;
        this.f602b = jVar;
        this.f603c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f601a);
        this.f602b.f615a.performAction(this.f603c, bundle);
    }
}
