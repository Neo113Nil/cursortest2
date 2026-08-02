package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nd implements aep {
    final /* synthetic */ ng a;
    private final /* synthetic */ int b;

    public nd(ng ngVar, int i) {
        this.b = i;
        this.a = ngVar;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        Window window;
        View peekDecorView;
        if (this.b == 0) {
            ng ngVar = this.a;
            ngVar.t();
            ngVar.L().c(this);
        } else {
            if (aejVar != aej.ON_STOP || (window = this.a.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                return;
            }
            peekDecorView.cancelPendingInputEvents();
        }
    }

    public /* synthetic */ nd(ng ngVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ngVar;
    }
}
