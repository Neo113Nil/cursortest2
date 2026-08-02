package M0;

import N0.InterfaceC0063b;
import java.util.Collection;

/* loaded from: classes.dex */
public final class o implements InterfaceC0063b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f944a;

    /* renamed from: b, reason: collision with root package name */
    public Object f945b;

    /* renamed from: c, reason: collision with root package name */
    public Object f946c;

    /* renamed from: d, reason: collision with root package name */
    public Object f947d;

    /* renamed from: e, reason: collision with root package name */
    public Collection f948e;
    public Object f;

    @Override // N0.InterfaceC0063b
    public void a(K0.b bVar) {
        ((c) this.f).f923m.post(new B.a(this, bVar, 2, false));
    }

    public void b(K0.b bVar) {
        m mVar = (m) ((c) this.f).f920j.get((a) this.f946c);
        if (mVar != null) {
            mVar.p(bVar);
        }
    }
}
