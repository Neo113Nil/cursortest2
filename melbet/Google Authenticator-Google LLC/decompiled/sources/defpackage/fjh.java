package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjh extends lr {
    final /* synthetic */ fjj d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjh(fjj fjjVar, RecyclerView recyclerView) {
        super(recyclerView);
        this.d = fjjVar;
    }

    @Override // defpackage.lr, defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        fjc fjcVar = this.d.e;
        int i = 0;
        int i2 = 0;
        while (true) {
            fjj fjjVar = fjcVar.g;
            if (i >= fjjVar.e.a()) {
                aahVar.q(new brn(AccessibilityNodeInfo.CollectionInfo.obtain(i2, 1, false), (byte[]) null));
                return;
            }
            int b = fjjVar.e.b(i);
            if (b == 0 || b == 1) {
                i2++;
            }
            i++;
        }
    }
}
