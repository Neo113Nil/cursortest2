package z;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279a extends ClickableSpan {

    /* renamed from: e, reason: collision with root package name */
    public final int f3166e;

    /* renamed from: f, reason: collision with root package name */
    public final C0286h f3167f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3168g;

    public C0279a(int i2, C0286h c0286h, int i3) {
        this.f3166e = i2;
        this.f3167f = c0286h;
        this.f3168g = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3166e);
        this.f3167f.f3177a.performAction(this.f3168g, bundle);
    }
}
