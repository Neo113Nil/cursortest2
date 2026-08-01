package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f683a;

    /* renamed from: b, reason: collision with root package name */
    public final j f684b;

    /* renamed from: c, reason: collision with root package name */
    public final int f685c;

    public a(int i, j jVar, int i2) {
        this.f683a = i;
        this.f684b = jVar;
        this.f685c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f683a);
        this.f684b.f696a.performAction(this.f685c, bundle);
    }
}
