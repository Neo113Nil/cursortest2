package l5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6072a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6073b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o5.a f6074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l.v f6075d;

    public r(l.v vVar, long j8, boolean z8, o5.a aVar) {
        this.f6075d = vVar;
        this.f6072a = j8;
        this.f6073b = z8;
        this.f6074c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        v vVar;
        long j8;
        v vVar2;
        boolean z8;
        boolean z9;
        l.v vVar3 = this.f6075d;
        n5.a aVar = (n5.a) vVar3.f5686g;
        aVar.b();
        x xVar = (x) vVar3.f5682c;
        ArrayList arrayList = (ArrayList) xVar.f6093b;
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            vVar = null;
            j8 = this.f6072a;
            if (i7 >= size) {
                vVar2 = null;
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            vVar2 = (v) obj;
            if (vVar2.f6081a == j8) {
                break;
            }
        }
        ArrayList arrayList2 = (ArrayList) xVar.f6093b;
        int size2 = arrayList2.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i9);
            i9++;
            v vVar4 = (v) obj2;
            if (vVar4.f6081a == j8) {
                vVar = vVar4;
                break;
            }
            i8++;
        }
        boolean z11 = true;
        o5.j.b("removeWrite called with nonexistent writeId", vVar != null);
        arrayList2.remove(vVar);
        vVar.getClass();
        f fVar = vVar.f6082b;
        int size3 = arrayList2.size() - 1;
        boolean z12 = true;
        boolean z13 = false;
        while (z12 && size3 >= 0) {
            v vVar5 = (v) arrayList2.get(size3);
            vVar5.getClass();
            f fVar2 = vVar5.f6082b;
            if (size3 >= i8) {
                if (!vVar5.c()) {
                    Iterator it = vVar5.a().f6007f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z8 = z11;
                            z9 = false;
                            break;
                        }
                        z8 = z11;
                        if (fVar2.g((f) ((Map.Entry) it.next()).getKey()).x(fVar)) {
                            z9 = z8;
                            break;
                        }
                        z11 = z8;
                    }
                } else {
                    z9 = fVar2.x(fVar);
                    z8 = z11;
                }
                if (z9) {
                    z12 = false;
                    size3--;
                    z11 = z8;
                }
            } else {
                z8 = z11;
            }
            if (fVar.x(fVar2)) {
                z13 = z8;
            }
            size3--;
            z11 = z8;
        }
        boolean z14 = z11;
        if (z12) {
            if (z13) {
                xVar.f6092a = x.b(arrayList2, x.f6091d, f.f6023i);
                if (arrayList2.size() > 0) {
                    xVar.f6094c = Long.valueOf(((v) arrayList2.get(arrayList2.size() - 1)).f6081a);
                } else {
                    xVar.f6094c = -1L;
                }
            } else if (vVar.c()) {
                b bVar = (b) xVar.f6092a;
                bVar.getClass();
                xVar.f6092a = fVar.isEmpty() ? b.f6006g : new b(bVar.f6007f.z(fVar, o5.e.f6845i));
            } else {
                Iterator it2 = vVar.a().f6007f.iterator();
                while (it2.hasNext()) {
                    f fVar3 = (f) ((Map.Entry) it2.next()).getKey();
                    b bVar2 = (b) xVar.f6092a;
                    f g9 = fVar.g(fVar3);
                    bVar2.getClass();
                    xVar.f6092a = g9.isEmpty() ? b.f6006g : new b(bVar2.f6007f.z(g9, o5.e.f6845i));
                }
            }
            z10 = z14;
        }
        vVar2.getClass();
        f fVar4 = vVar2.f6082b;
        boolean z15 = this.f6073b;
        if (!z15) {
            HashMap A = t6.a.A(this.f6074c);
            if (vVar2.c()) {
                t6.a.M(vVar2.b(), new androidx.room.c(vVar3, 21, fVar4), A);
                aVar.b();
            } else {
                t6.a.L(vVar2.a(), vVar3, fVar4, A);
                aVar.b();
            }
        }
        if (!z10) {
            return Collections.EMPTY_LIST;
        }
        o5.e eVar = o5.e.f6845i;
        if (vVar2.c()) {
            eVar = eVar.y(f.f6023i, Boolean.TRUE);
        } else {
            Iterator it3 = vVar2.a().f6007f.iterator();
            while (it3.hasNext()) {
                eVar = eVar.y((f) ((Map.Entry) it3.next()).getKey(), Boolean.TRUE);
            }
        }
        return l.v.h(vVar3, new m5.a(fVar4, eVar, z15));
    }
}
