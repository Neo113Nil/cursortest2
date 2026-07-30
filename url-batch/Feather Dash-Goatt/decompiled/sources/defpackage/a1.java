package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class a1 extends ClickableSpan {
    public final int d;
    public final o1 e;
    public final int g;

    public a1(int i, o1 o1Var, int i2) {
        this.d = i;
        this.e = o1Var;
        this.g = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.d);
        this.e.a.performAction(this.g, bundle);
    }
}
