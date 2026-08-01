package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f650a;

    /* renamed from: b, reason: collision with root package name */
    public final j f651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f652c;

    public a(int i, j jVar, int i2) {
        this.f650a = i;
        this.f651b = jVar;
        this.f652c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f650a);
        this.f651b.f665a.performAction(this.f652c, bundle);
    }
}
