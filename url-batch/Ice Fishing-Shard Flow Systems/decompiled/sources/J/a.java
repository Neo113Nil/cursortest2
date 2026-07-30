package J;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f1308d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1309e;

    /* renamed from: i, reason: collision with root package name */
    public final int f1310i;

    public a(int i2, g gVar, int i5) {
        this.f1308d = i2;
        this.f1309e = gVar;
        this.f1310i = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1308d);
        this.f1309e.f1318a.performAction(this.f1310i, bundle);
    }
}
