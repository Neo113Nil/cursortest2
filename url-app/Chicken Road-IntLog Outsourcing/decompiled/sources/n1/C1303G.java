package n1;

import java.util.Set;
import m1.InterfaceC1276c;
import o1.InterfaceC1364b;
import o1.InterfaceC1369g;

/* renamed from: n1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303G implements InterfaceC1364b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1276c f11311a;

    /* renamed from: b, reason: collision with root package name */
    public final C1314a f11312b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1369g f11313c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f11314d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11315e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1318e f11316f;

    public C1303G(C1318e c1318e, InterfaceC1276c interfaceC1276c, C1314a c1314a) {
        this.f11316f = c1318e;
        this.f11311a = interfaceC1276c;
        this.f11312b = c1314a;
    }

    @Override // o1.InterfaceC1364b
    public final void a(l1.b bVar) {
        this.f11316f.f11383m.post(new RunnableC1302F(this, bVar, 0));
    }

    public final void b(l1.b bVar) {
        C1300D c1300d = (C1300D) this.f11316f.f11380j.get(this.f11312b);
        if (c1300d != null) {
            c1300d.m(bVar);
        }
    }
}
