package b1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f4303a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4305c;

    public C0294a(int i3, h hVar, int i4) {
        this.f4303a = i3;
        this.f4304b = hVar;
        this.f4305c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4303a);
        this.f4304b.f4317a.performAction(this.f4305c, bundle);
    }
}
