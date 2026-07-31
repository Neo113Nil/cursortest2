package d1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f5658a;

    /* renamed from: b, reason: collision with root package name */
    public final h f5659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5660c;

    public a(int i3, h hVar, int i4) {
        this.f5658a = i3;
        this.f5659b = hVar;
        this.f5660c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5658a);
        this.f5659b.f5672a.performAction(this.f5660c, bundle);
    }
}
