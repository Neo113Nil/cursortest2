package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class y extends ClickableSpan {
    public final int f;
    public final m0 g;
    public final int h;

    public y(int i, m0 m0Var, int i2) {
        this.f = i;
        this.g = m0Var;
        this.h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f);
        this.g.a.performAction(this.h, bundle);
    }
}
