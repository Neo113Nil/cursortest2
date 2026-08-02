package F;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f732a;

    /* renamed from: b, reason: collision with root package name */
    public final f f733b;

    /* renamed from: c, reason: collision with root package name */
    public final int f734c;

    public a(int i4, f fVar, int i5) {
        this.f732a = i4;
        this.f733b = fVar;
        this.f734c = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f732a);
        this.f733b.f742a.performAction(this.f734c, bundle);
    }
}
