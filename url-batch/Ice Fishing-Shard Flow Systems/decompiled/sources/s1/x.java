package s1;

import java.util.Objects;
import java.util.Set;
import r1.InterfaceC0844c;
import t1.InterfaceC0915b;
import t1.InterfaceC0919f;

/* loaded from: classes.dex */
public final class x implements InterfaceC0915b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0844c f7749a;

    /* renamed from: b, reason: collision with root package name */
    public final C0870a f7750b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0919f f7751c;

    /* renamed from: d, reason: collision with root package name */
    public Set f7752d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873d f7754f;

    public x(C0873d c0873d, InterfaceC0844c interfaceC0844c, C0870a c0870a) {
        Objects.requireNonNull(c0873d);
        this.f7754f = c0873d;
        this.f7751c = null;
        this.f7752d = null;
        this.f7753e = false;
        this.f7749a = interfaceC0844c;
        this.f7750b = c0870a;
    }

    @Override // t1.InterfaceC0915b
    public final void a(q1.b bVar) {
        this.f7754f.f7658m.post(new F.a(25, this, bVar, false));
    }

    public final void b(q1.b bVar) {
        v vVar = (v) this.f7754f.j.get(this.f7750b);
        if (vVar != null) {
            vVar.j(bVar);
        }
    }
}
