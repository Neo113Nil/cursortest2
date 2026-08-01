package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f548a;

    /* renamed from: b, reason: collision with root package name */
    public final j f549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f550c;

    public a(int i, j jVar, int i2) {
        this.f548a = i;
        this.f549b = jVar;
        this.f550c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f548a);
        this.f549b.f561a.performAction(this.f550c, bundle);
    }
}
