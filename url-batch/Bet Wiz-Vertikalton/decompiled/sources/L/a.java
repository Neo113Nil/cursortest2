package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f527a;

    /* renamed from: b, reason: collision with root package name */
    public final j f528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f529c;

    public a(int i, j jVar, int i2) {
        this.f527a = i;
        this.f528b = jVar;
        this.f529c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f527a);
        this.f528b.f541a.performAction(this.f529c, bundle);
    }
}
