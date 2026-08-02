package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class na implements aep {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ na(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        View view;
        int i = this.b;
        if (i == 0) {
            if (aejVar == aej.ON_DESTROY) {
                ng ngVar = (ng) this.a;
                ngVar.f.a();
                if (!ngVar.isChangingConfigurations()) {
                    ngVar.O().c();
                }
                nf nfVar = ngVar.m;
                ng ngVar2 = nfVar.b;
                ngVar2.getWindow().getDecorView().removeCallbacks(nfVar);
                ngVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nfVar);
                return;
            }
            return;
        }
        if (i == 1) {
            if (aejVar != aej.ON_STOP || (view = ((bd) this.a).R) == null) {
                return;
            }
            view.cancelPendingInputEvents();
            return;
        }
        if (i == 2) {
            Object obj = this.a;
            if (aejVar == aej.ON_START) {
                ((amg) obj).e = true;
                return;
            } else {
                if (aejVar == aej.ON_STOP) {
                    ((amg) obj).e = false;
                    return;
                }
                return;
            }
        }
        if (i == 3) {
            ((aqy) this.a).a(false);
            return;
        }
        if (i != 4) {
            if (aejVar == aej.ON_DESTROY) {
                aerVar.L().c(this);
                ((klw) this.a).b();
                return;
            }
            return;
        }
        if (aejVar == aej.ON_DESTROY) {
            jrg jrgVar = (jrg) this.a;
            jrgVar.a = null;
            jrgVar.b = null;
            jrgVar.c = null;
        }
    }

    public na(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
