package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class u extends ClickableSpan {
    public final int f;
    public final i0 g;
    public final int h;

    public u(int i, i0 i0Var, int i2) {
        this.f = i;
        this.g = i0Var;
        this.h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f);
        this.g.a.performAction(this.h, bundle);
    }
}
