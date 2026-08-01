package n0;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e2 extends c1.b {

    /* renamed from: e, reason: collision with root package name */
    public Object f6670e;

    /* renamed from: i, reason: collision with root package name */
    public Object f6671i;

    /* renamed from: r, reason: collision with root package name */
    public s.i0 f6672r;

    /* renamed from: s, reason: collision with root package name */
    public s.i0 f6673s;

    /* renamed from: t, reason: collision with root package name */
    public ie.o f6674t;

    /* renamed from: u, reason: collision with root package name */
    public final a1.d f6675u;

    /* renamed from: v, reason: collision with root package name */
    public final b1.h f6676v;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public e2() {
        super(1);
        this.f6675u = new a1.d(10, this);
        b1.y yVar = new b1.y(6, this);
        b1.r.e(b1.r.f1028a);
        synchronized (b1.r.f1030c) {
            b1.r.f1034h = CollectionsKt.F(b1.r.f1034h, yVar);
        }
        this.f6676v = new b1.h(0, yVar);
    }

    @Override // c1.b
    public final void i(ie.o oVar) {
        this.f6671i = null;
        this.f6673s = null;
    }

    @Override // c1.b
    public final void j() {
        synchronized (this.f1478d) {
            try {
                this.f6670e = this.f6671i;
                if (this.f6673s == null) {
                    this.f6672r = null;
                } else {
                    if (this.f6672r == null) {
                        int i3 = s.q0.f8360a;
                        this.f6672r = new s.i0();
                    }
                    s.i0 i0Var = this.f6672r;
                    this.f6672r = this.f6673s;
                    this.f6673s = i0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c1.b
    public final void k() {
        this.f6676v.d();
        this.f6671i = null;
        this.f6673s = null;
        synchronized (this.f1478d) {
            this.f6674t = null;
            this.f6670e = null;
            this.f6672r = null;
        }
    }

    @Override // c1.b
    public final Function1 n(ie.o oVar) {
        ie.o oVar2 = this.f6674t;
        if (oVar2 != null && !oVar2.equals(oVar)) {
            n1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f6674t = oVar;
        return this.f6675u;
    }

    @Override // c1.b
    public final void o(ie.g gVar) {
        this.f6674t = null;
        this.f6671i = null;
        this.f6673s = null;
        j();
    }
}
