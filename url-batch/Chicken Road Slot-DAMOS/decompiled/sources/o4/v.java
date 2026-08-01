package o4;

import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n0.i0;
import n0.m2;
import n0.z0;
import v.h0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements vd.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f7527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n4.h f7528e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a1.j f7529i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z0 f7530r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m2 f7531s;

    public v(h0 h0Var, n4.h hVar, a1.j jVar, z0 z0Var, m2 m2Var) {
        this.f7527d = h0Var;
        this.f7528e = hVar;
        this.f7529i = jVar;
        this.f7530r = z0Var;
        this.f7531s = m2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // vd.o
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        n4.h hVar;
        u.i iVar = (u.i) obj;
        n4.h hVar2 = (n4.h) obj2;
        i0 i0Var = (i0) obj3;
        ((Number) obj4).intValue();
        boolean a9 = Intrinsics.a(this.f7527d.f9809i.getValue(), this.f7528e);
        if (!((Boolean) this.f7530r.getValue()).booleanValue() && !a9) {
            List list = (List) this.f7531s.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    hVar = 0;
                    break;
                }
                hVar = listIterator.previous();
                if (Intrinsics.a(hVar2, (n4.h) hVar)) {
                    break;
                }
            }
            hVar2 = hVar;
        }
        if (hVar2 == null) {
            i0Var.W(105930796);
        } else {
            i0Var.W(-1520603531);
            a.a.d(hVar2, this.f7529i, x0.i.d(-1263531443, new j0.q(3, hVar2, iVar), i0Var), i0Var, 384);
        }
        i0Var.p(false);
        return Unit.f5554a;
    }
}
