package c;

import a0.s0;
import c7.x;
import d6.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f1427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1428h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, boolean z8, h6.d dVar) {
        super(2, dVar);
        this.f1427g = eVar;
        this.f1428h = z8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new f(this.f1427g, this.f1428h, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        f fVar = (f) create((x) obj, (h6.d) obj2);
        z zVar = z.f2639a;
        fVar.invokeSuspend(zVar);
        return zVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [q6.a, r6.h] */
    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        s0 s0Var;
        d6.a.e(obj);
        e eVar = this.f1427g;
        boolean z8 = this.f1428h;
        if (!z8 && eVar.f1220a && (s0Var = eVar.f1426f) != null) {
            s0Var.c();
        }
        eVar.f1220a = z8;
        ?? r32 = eVar.f1222c;
        if (r32 != 0) {
            r32.a();
        }
        return z.f2639a;
    }
}
