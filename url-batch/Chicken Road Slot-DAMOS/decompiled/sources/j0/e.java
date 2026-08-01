package j0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f4806e;

    public /* synthetic */ e(f fVar, int i3) {
        this.f4805d = i3;
        this.f4806e = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i3 = this.f4805d;
        f fVar = this.f4806e;
        switch (i3) {
            case 0:
                v vVar = (v) c2.k.h(fVar, x.f4898a);
                i0.a aVar = fVar.I;
                if (vVar == null) {
                    if (aVar != null) {
                        fVar.J(aVar);
                    }
                    fVar.I = null;
                } else if (aVar == null) {
                    d9.c cVar = new d9.c(25, fVar);
                    e eVar = new e(fVar, 1);
                    z.f fVar2 = fVar.E;
                    boolean z10 = fVar.F;
                    float f3 = fVar.G;
                    a1 a1Var = i0.f.f4571a;
                    i0.a aVar2 = new i0.a(fVar2, z10, f3, cVar, eVar);
                    fVar.I(aVar2);
                    fVar.I = aVar2;
                }
                return Unit.f5554a;
            default:
                return w.f4897a;
        }
    }
}
