package N;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f617a;

    /* renamed from: b, reason: collision with root package name */
    public final j f618b;

    /* renamed from: c, reason: collision with root package name */
    public final int f619c;

    public a(int i, j jVar, int i2) {
        this.f617a = i;
        this.f618b = jVar;
        this.f619c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f617a);
        this.f618b.f631a.performAction(this.f619c, bundle);
    }
}
