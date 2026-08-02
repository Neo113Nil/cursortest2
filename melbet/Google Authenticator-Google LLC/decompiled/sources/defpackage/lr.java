package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lr extends wv {
    final RecyclerView a;
    public final lq b;

    public lr(RecyclerView recyclerView) {
        this.a = recyclerView;
        wv j = j();
        if (j == null || !(j instanceof lq)) {
            this.b = new lq(this);
        } else {
            this.b = (lq) j;
        }
    }

    @Override // defpackage.wv
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        ky kyVar;
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k() || (kyVar = ((RecyclerView) view).m) == null) {
            return;
        }
        kyVar.W(accessibilityEvent);
    }

    @Override // defpackage.wv
    public void c(View view, aah aahVar) {
        ky kyVar;
        super.c(view, aahVar);
        if (k() || (kyVar = this.a.m) == null) {
            return;
        }
        RecyclerView recyclerView = kyVar.s;
        kyVar.n(recyclerView.e, recyclerView.M, aahVar);
    }

    @Override // defpackage.wv
    public final boolean i(View view, int i, Bundle bundle) {
        ky kyVar;
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k() || (kyVar = this.a.m) == null) {
            return false;
        }
        return kyVar.u(i, bundle);
    }

    public wv j() {
        return this.b;
    }

    final boolean k() {
        return this.a.ai();
    }
}
