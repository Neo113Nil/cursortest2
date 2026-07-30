package v6;

import c2.j;
import e6.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import l0.C0654a;
import n6.C0774g;
import n6.C0775h;
import n6.InterfaceC0773f;
import n6.w0;
import s6.r;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980b implements InterfaceC0773f, w0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0775h f8236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f8237e;

    public C0980b(c cVar, C0775h c0775h) {
        this.f8237e = cVar;
        this.f8236d = c0775h;
    }

    @Override // n6.w0
    public final void a(r rVar, int i2) {
        this.f8236d.a(rVar, i2);
    }

    @Override // n6.InterfaceC0773f
    public final C0654a c(Object obj, n nVar) {
        c cVar = this.f8237e;
        C0774g c0774g = new C0774g(cVar, this);
        C0654a c7 = this.f8236d.c((Unit) obj, c0774g);
        if (c7 != null) {
            c.f8238g.set(cVar, null);
        }
        return c7;
    }

    @Override // n6.InterfaceC0773f
    public final void e(Object obj, n nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f8238g;
        c cVar = this.f8237e;
        atomicReferenceFieldUpdater.set(cVar, null);
        j jVar = new j(cVar, this);
        C0775h c0775h = this.f8236d;
        c0775h.A((Unit) obj, c0775h.f7010i, new C0774g(0, jVar));
    }

    @Override // V5.b
    public final CoroutineContext getContext() {
        return this.f8236d.f7063m;
    }

    @Override // n6.InterfaceC0773f
    public final void k(Object obj) {
        this.f8236d.k(obj);
    }

    @Override // V5.b
    public final void resumeWith(Object obj) {
        this.f8236d.resumeWith(obj);
    }
}
