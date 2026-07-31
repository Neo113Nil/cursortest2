package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import l.C3250b;

/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1359z extends B {

    /* renamed from: l, reason: collision with root package name */
    private C3250b f12707l = new C3250b();

    /* renamed from: androidx.lifecycle.z$a */
    private static class a implements C {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1358y f12708a;

        /* renamed from: b, reason: collision with root package name */
        final C f12709b;

        /* renamed from: c, reason: collision with root package name */
        int f12710c = -1;

        a(AbstractC1358y abstractC1358y, C c4) {
            this.f12708a = abstractC1358y;
            this.f12709b = c4;
        }

        void a() {
            this.f12708a.j(this);
        }

        void b() {
            this.f12708a.n(this);
        }

        @Override // androidx.lifecycle.C
        public void d(Object obj) {
            if (this.f12710c != this.f12708a.g()) {
                this.f12710c = this.f12708a.g();
                this.f12709b.d(obj);
            }
        }
    }

    @Override // androidx.lifecycle.AbstractC1358y
    protected void k() {
        Iterator it = this.f12707l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1358y
    protected void l() {
        Iterator it = this.f12707l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    public void p(AbstractC1358y abstractC1358y, C c4) {
        if (abstractC1358y == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(abstractC1358y, c4);
        a aVar2 = (a) this.f12707l.h(abstractC1358y, aVar);
        if (aVar2 != null && aVar2.f12709b != c4) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVar2 == null && h()) {
            aVar.a();
        }
    }
}
