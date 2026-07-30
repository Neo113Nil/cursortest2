package P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f2656a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2658c;

    public a(int i, k kVar, int i4) {
        this.f2656a = i;
        this.f2657b = kVar;
        this.f2658c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2656a);
        this.f2657b.f2675a.performAction(this.f2658c, bundle);
    }
}
