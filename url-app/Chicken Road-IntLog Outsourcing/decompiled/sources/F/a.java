package F;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f661a;

    /* renamed from: b, reason: collision with root package name */
    public final i f662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f663c;

    public a(int i2, i iVar, int i3) {
        this.f661a = i2;
        this.f662b = iVar;
        this.f663c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f661a);
        this.f662b.f671a.performAction(this.f663c, bundle);
    }
}
