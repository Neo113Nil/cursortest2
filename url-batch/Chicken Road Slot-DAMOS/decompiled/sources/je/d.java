package je;

import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final e f5149d;

    public d(e eVar) {
        this.f5149d = eVar;
    }

    @Override // je.e
    public final Object c(f fVar, ld.a aVar) {
        wd.b0 b0Var = new wd.b0();
        b0Var.f10141d = ke.c.f5511b;
        Object c10 = this.f5149d.c(new i0.g(this, b0Var, fVar), aVar);
        return c10 == md.a.f6622d ? c10 : Unit.f5554a;
    }
}
