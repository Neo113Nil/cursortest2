package defpackage;

import android.os.Handler;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nv implements aep {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public nv(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.aep
    public final void a(aer aerVar, aej aejVar) {
        int i = this.c;
        if (i == 0) {
            int ordinal = aejVar.ordinal();
            if (ordinal == 1) {
                ((nr) this.a).d(true);
                return;
            }
            if (ordinal == 4) {
                ((nr) this.a).d(false);
                return;
            } else {
                if (ordinal != 5) {
                    return;
                }
                ((ahe) this.a).f();
                ((ael) this.b).c(this);
                return;
            }
        }
        if (i == 1) {
            if (aejVar == aej.ON_CREATE) {
                Object obj = this.a;
                Object obj2 = this.b;
                OnBackInvokedDispatcher onBackInvokedDispatcher = ((ng) obj).getOnBackInvokedDispatcher();
                onBackInvokedDispatcher.getClass();
                ((oe) obj2).d(onBackInvokedDispatcher);
                return;
            }
            return;
        }
        if (i == 2) {
            if (aejVar == aej.ON_DESTROY) {
                ((afu) this.b).a = false;
                ((ael) this.a).c(this);
                return;
            }
            return;
        }
        if (i == 3) {
            if (aejVar == aej.ON_START) {
                ((ael) this.a).c(this);
                ((boe) this.b).c(aft.class);
                return;
            }
            return;
        }
        if (i == 4) {
            ara araVar = (ara) this.b;
            if (araVar.w()) {
                return;
            }
            aerVar.L().c(this);
            lp lpVar = (lp) this.a;
            if (lpVar.B().isAttachedToWindow()) {
                araVar.A(lpVar);
                return;
            }
            return;
        }
        if (i != 5) {
            if (aejVar == aej.ON_DESTROY) {
                ((dsg) this.a).f((dja) this.b);
                aerVar.L().c(this);
                return;
            }
            return;
        }
        if (aejVar == aej.ON_DESTROY) {
            ((Handler) this.a).removeCallbacks(this.b);
            aerVar.L().c(this);
        }
    }

    public nv(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ nv(oe oeVar, ng ngVar, int i) {
        this.c = i;
        this.b = oeVar;
        this.a = ngVar;
    }
}
