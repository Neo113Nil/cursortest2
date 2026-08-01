package N;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f864a;

    /* renamed from: b, reason: collision with root package name */
    public final i f865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f866c;

    public a(int i, i iVar, int i2) {
        this.f864a = i;
        this.f865b = iVar;
        this.f866c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f864a);
        this.f865b.f878a.performAction(this.f866c, bundle);
    }
}
