package r3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f6538d;

    /* renamed from: e, reason: collision with root package name */
    public final f f6539e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6540f;

    public a(int i, f fVar, int i8) {
        this.f6538d = i;
        this.f6539e = fVar;
        this.f6540f = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f6538d);
        this.f6539e.f6557a.performAction(this.f6540f, bundle);
    }
}
