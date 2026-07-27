package g2;

import G.C0231x;
import h2.C0659a;
import j2.AbstractC0720j;
import j2.C0715e;
import j2.InterfaceC0711a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6744e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0711a f6745i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f6746j;

    public q(s sVar, long j4, boolean z4, InterfaceC0711a interfaceC0711a) {
        this.f6746j = sVar;
        this.f6743d = j4;
        this.f6744e = z4;
        this.f6745i = interfaceC0711a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j4;
        v vVar;
        v vVar2;
        e eVar;
        C0715e c0715e;
        boolean z4;
        s sVar = this.f6746j;
        ((C0231x) sVar.f6757g).b();
        Iterator it = ((ArrayList) ((x) sVar.f6753c).f6772b).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j4 = this.f6743d;
            vVar = null;
            if (!hasNext) {
                vVar2 = null;
                break;
            }
            vVar2 = (v) it.next();
            if (vVar2.f6760a == j4) {
                break;
            }
        }
        x xVar = (x) sVar.f6753c;
        ArrayList arrayList = (ArrayList) xVar.f6772b;
        Iterator it2 = arrayList.iterator();
        boolean z5 = false;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            v vVar3 = (v) it2.next();
            if (vVar3.f6760a == j4) {
                vVar = vVar3;
                break;
            }
            i2++;
        }
        AbstractC0720j.b("removeWrite called with nonexistent writeId", vVar != null);
        arrayList.remove(vVar);
        vVar.getClass();
        int size = arrayList.size() - 1;
        boolean z6 = true;
        boolean z7 = false;
        while (true) {
            eVar = vVar.f6761b;
            if (!z6 || size < 0) {
                break;
            }
            v vVar4 = (v) arrayList.get(size);
            vVar4.getClass();
            e eVar2 = vVar4.f6761b;
            if (size >= i2) {
                if (!vVar4.c()) {
                    Iterator it3 = vVar4.a().f6678d.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if (eVar2.h((e) ((Map.Entry) it3.next()).getKey()).w(eVar)) {
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    z4 = eVar2.w(eVar);
                }
                if (z4) {
                    z6 = false;
                    size--;
                }
            }
            if (eVar.w(eVar2)) {
                z7 = true;
            }
            size--;
        }
        if (z6) {
            if (z7) {
                xVar.f6771a = x.b(arrayList, x.f6770d, e.f6694j);
                if (arrayList.size() > 0) {
                    xVar.f6773c = Long.valueOf(((v) arrayList.get(arrayList.size() - 1)).f6760a);
                } else {
                    xVar.f6773c = -1L;
                }
            } else if (vVar.c()) {
                C0639b c0639b = (C0639b) xVar.f6771a;
                c0639b.getClass();
                xVar.f6771a = eVar.isEmpty() ? C0639b.f6677e : new C0639b(c0639b.f6678d.C(eVar, C0715e.f7158j));
            } else {
                Iterator it4 = vVar.a().f6678d.iterator();
                while (it4.hasNext()) {
                    e eVar3 = (e) ((Map.Entry) it4.next()).getKey();
                    C0639b c0639b2 = (C0639b) xVar.f6771a;
                    e h4 = eVar.h(eVar3);
                    c0639b2.getClass();
                    xVar.f6771a = h4.isEmpty() ? C0639b.f6677e : new C0639b(c0639b2.f6678d.C(h4, C0715e.f7158j));
                }
            }
            z5 = true;
        }
        vVar2.getClass();
        e eVar4 = vVar2.f6761b;
        boolean z8 = this.f6744e;
        if (!z8) {
            HashMap C3 = M1.a.C(this.f6745i);
            boolean c4 = vVar2.c();
            C0231x c0231x = (C0231x) sVar.f6757g;
            if (c4) {
                M1.a.T(vVar2.b(), new y.t(sVar, 23, eVar4), C3);
                c0231x.b();
            } else {
                M1.a.S(vVar2.a(), sVar, eVar4, C3);
                c0231x.b();
            }
        }
        if (!z5) {
            return Collections.emptyList();
        }
        C0715e c0715e2 = C0715e.f7158j;
        if (vVar2.c()) {
            c0715e = c0715e2.B(e.f6694j, Boolean.TRUE);
        } else {
            Iterator it5 = vVar2.a().f6678d.iterator();
            while (it5.hasNext()) {
                c0715e2 = c0715e2.B((e) ((Map.Entry) it5.next()).getKey(), Boolean.TRUE);
            }
            c0715e = c0715e2;
        }
        return s.h(sVar, new C0659a(eVar4, c0715e, z8));
    }
}
