package s4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.b0;
import je.l0;
import je.w;
import kotlin.collections.d0;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f8427a = b0.b(h.f8439a);

    /* renamed from: b, reason: collision with root package name */
    public final l0 f8428b;

    /* renamed from: c, reason: collision with root package name */
    public final w f8429c;

    /* renamed from: d, reason: collision with root package name */
    public final s f8430d;

    /* renamed from: e, reason: collision with root package name */
    public final s f8431e;

    /* renamed from: f, reason: collision with root package name */
    public d f8432f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public f f8433h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f8434i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f8435k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8436l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8437m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8438n;

    public g() {
        l0 b10 = b0.b(new e());
        this.f8428b = b10;
        this.f8429c = b0.e(b10);
        this.f8430d = new s();
        this.f8431e = new s();
        this.f8434i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.f8435k = new LinkedHashSet();
    }

    public final void a(c6.i iVar, f fVar, int i3) {
        iVar.getClass();
        if (fVar.f8425a == null) {
            (i3 != 0 ? i3 != 1 ? this.f8434i : this.j : this.f8435k).add(fVar);
            fVar.f8425a = iVar;
            ((e) this.f8429c.f5239d.getValue()).getClass();
            fVar.b(i3 != 0 ? i3 != 1 ? this.f8438n : this.f8436l : this.f8437m);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Input '");
        sb2.append(fVar);
        c6.i iVar2 = fVar.f8425a;
        sb2.append("' is already added to dispatcher ");
        sb2.append(iVar2);
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void b() {
        boolean z10;
        boolean z11;
        e eVar;
        s sVar = this.f8430d;
        if (sVar == null || !sVar.isEmpty()) {
            Iterator it = sVar.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f8421d) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        s sVar2 = this.f8431e;
        if (sVar2 == null || !sVar2.isEmpty()) {
            Iterator it2 = sVar2.iterator();
            while (it2.hasNext()) {
                if (((d) it2.next()).f8421d) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z12 = z10 || z11;
        boolean z13 = this.f8437m != z10;
        boolean z14 = this.f8436l != z11;
        boolean z15 = this.f8438n != z12;
        LinkedHashSet linkedHashSet = this.f8435k;
        if (z13) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((f) it3.next()).b(z10);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z14) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((f) it4.next()).b(z11);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f8434i;
        if (z15) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((f) it5.next()).b(z12);
            }
        }
        this.f8437m = z10;
        this.f8436l = z11;
        this.f8438n = z12;
        d dVar = this.f8432f;
        if (dVar == null) {
            dVar = c(0);
        }
        d dVar2 = this.f8432f;
        if (dVar2 == null) {
            dVar2 = c(0);
        }
        if (Intrinsics.a(dVar2, dVar)) {
            if (dVar2 == null) {
                eVar = new e();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = sVar.iterator();
                while (it6.hasNext()) {
                    d dVar3 = (d) it6.next();
                    if (dVar3.f8421d) {
                        dVar3.f8419b.getClass();
                    }
                }
                Iterator<E> it7 = sVar2.iterator();
                while (it7.hasNext()) {
                    d dVar4 = (d) it7.next();
                    if (dVar4.f8421d) {
                        dVar4.f8419b.getClass();
                    }
                }
                a.a aVar = dVar2.f8418a;
                j0 j0Var = dVar2.f8420c;
                j0Var.getClass();
                id.d b10 = x.b();
                d0.l(b10, arrayList);
                b10.add(aVar);
                d0.l(b10, j0Var);
                eVar = new e(arrayList.size(), x.a(b10));
            }
            l0 l0Var = this.f8428b;
            if (Intrinsics.a((e) l0Var.getValue(), eVar)) {
                return;
            }
            l0Var.k(null, eVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((f) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((f) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((f) it10.next()).getClass();
            }
        }
    }

    public final d c(int i3) {
        Object obj;
        Object obj2;
        s sVar = this.f8431e;
        s sVar2 = this.f8430d;
        Object obj3 = null;
        if (i3 == -1) {
            Iterator it = sVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((d) obj).f8421d) {
                    break;
                }
            }
            d dVar = (d) obj;
            if (dVar != null) {
                return dVar;
            }
            Iterator it2 = sVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((d) next).f8421d) {
                    obj3 = next;
                    break;
                }
            }
            return (d) obj3;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i3 + "'.").toString());
            }
            Iterator it3 = sVar2.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).getClass();
            }
            Iterator it4 = sVar.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = sVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((d) obj2).f8421d) {
                break;
            }
        }
        d dVar2 = (d) obj2;
        if (dVar2 != null) {
            return dVar2;
        }
        Iterator it6 = sVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((d) next2).f8421d) {
                obj3 = next2;
                break;
            }
        }
        return (d) obj3;
    }
}
