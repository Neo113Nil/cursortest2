package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaf extends ClickableSpan {
    private final int a;
    private final aah b;
    private final int c;

    public aaf(int i, aah aahVar, int i2) {
        this.a = i;
        this.b = aahVar;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
