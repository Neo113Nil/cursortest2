package androidx.activity;

import a.c0;
import a.g0;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.lifecycle.t;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$addCallback$lifecycleObserver$1 implements p, AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c0 f118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f119g;

    public OnBackPressedDispatcher$addCallback$lifecycleObserver$1(c0 c0Var, g0 g0Var, t tVar) {
        this.f118f = c0Var;
        this.f119g = tVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        l lVar2 = l.ON_START;
        c0 c0Var = this.f118f;
        if (lVar == lVar2) {
            c0Var.b(true);
        } else if (lVar == l.ON_STOP) {
            c0Var.b(false);
        }
        if (lVar == l.ON_DESTROY) {
            c0Var.a();
            this.f119g.f(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f119g.f(this);
    }
}
