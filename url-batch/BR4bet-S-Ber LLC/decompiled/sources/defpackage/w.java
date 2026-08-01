package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class w extends ClickableSpan {
    public final int f;
    public final k0 g;
    public final int h;

    public w(int i, k0 k0Var, int i2) {
        this.f = i;
        this.g = k0Var;
        this.h = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f);
        this.g.a.performAction(this.h, bundle);
    }
}
