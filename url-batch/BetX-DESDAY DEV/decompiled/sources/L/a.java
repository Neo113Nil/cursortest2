package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f651a;

    /* renamed from: b, reason: collision with root package name */
    public final j f652b;

    /* renamed from: c, reason: collision with root package name */
    public final int f653c;

    public a(int i, j jVar, int i2) {
        this.f651a = i;
        this.f652b = jVar;
        this.f653c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f651a);
        this.f652b.f666a.performAction(this.f653c, bundle);
    }
}
