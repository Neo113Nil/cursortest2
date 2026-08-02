package B;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f66a;

    /* renamed from: b, reason: collision with root package name */
    public final l f67b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68c;

    public a(int i2, l lVar, int i3) {
        this.f66a = i2;
        this.f67b = lVar;
        this.f68c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f66a);
        this.f67b.f76a.performAction(this.f68c, bundle);
    }
}
