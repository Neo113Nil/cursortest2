package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s1 extends ClickableSpan {
    public final int m;
    public final g2 n;
    public final int o;

    public s1(int i, g2 g2Var, int i2) {
        this.m = i;
        this.n = g2Var;
        this.o = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.m);
        this.n.a.performAction(this.o, bundle);
    }
}
