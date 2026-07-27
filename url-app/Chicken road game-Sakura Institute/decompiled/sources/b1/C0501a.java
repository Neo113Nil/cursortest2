package b1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f5612a;

    /* renamed from: b, reason: collision with root package name */
    public final C0508h f5613b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5614c;

    public C0501a(int i2, C0508h c0508h, int i4) {
        this.f5612a = i2;
        this.f5613b = c0508h;
        this.f5614c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f5612a);
        this.f5613b.f5625a.performAction(this.f5614c, bundle);
    }
}
