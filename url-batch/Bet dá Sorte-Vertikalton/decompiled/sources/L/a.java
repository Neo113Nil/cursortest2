package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f450a;

    /* renamed from: b, reason: collision with root package name */
    public final j f451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f452c;

    public a(int i, j jVar, int i2) {
        this.f450a = i;
        this.f451b = jVar;
        this.f452c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f450a);
        this.f451b.f464a.performAction(this.f452c, bundle);
    }
}
