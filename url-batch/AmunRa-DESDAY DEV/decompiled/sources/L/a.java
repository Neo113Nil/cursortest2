package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f463a;

    /* renamed from: b, reason: collision with root package name */
    public final j f464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f465c;

    public a(int i, j jVar, int i2) {
        this.f463a = i;
        this.f464b = jVar;
        this.f465c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f463a);
        this.f464b.f477a.performAction(this.f465c, bundle);
    }
}
