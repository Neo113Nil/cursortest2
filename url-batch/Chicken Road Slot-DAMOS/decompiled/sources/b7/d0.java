package b7;

import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 implements c7.d {

    /* renamed from: a, reason: collision with root package name */
    public final c7.i f1275a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1276b;

    /* renamed from: c, reason: collision with root package name */
    public c7.j f1277c;

    /* renamed from: d, reason: collision with root package name */
    public Set f1278d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1280f;

    public d0(d dVar, c7.i iVar, a aVar) {
        Objects.requireNonNull(dVar);
        this.f1280f = dVar;
        this.f1277c = null;
        this.f1278d = null;
        this.f1279e = false;
        this.f1275a = iVar;
        this.f1276b = aVar;
    }

    @Override // c7.d
    public final void a(z6.b bVar) {
        this.f1280f.f1273m.post(new f8.j0(2, this, bVar, false));
    }

    public final void b(z6.b bVar) {
        b0 b0Var = (b0) this.f1280f.j.get(this.f1276b);
        if (b0Var != null) {
            b0Var.k(bVar);
        }
    }
}
