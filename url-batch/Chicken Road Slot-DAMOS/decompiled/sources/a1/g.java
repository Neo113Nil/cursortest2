package a1;

import androidx.lifecycle.o;
import androidx.lifecycle.u;
import b1.w;
import com.google.firebase.messaging.v;
import ge.b2;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m2.t;
import n0.j1;
import s.h0;
import te.a1;
import wd.b0;
import wd.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f21i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f22r;

    public /* synthetic */ g(u8.g gVar, String str, String str2, b4.c cVar) {
        this.f19d = 3;
        this.f20e = str;
        this.f21i = str2;
        this.f22r = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        Object obj2;
        Object hVar;
        switch (this.f19d) {
            case 0:
                j jVar = (j) this.f20e;
                q qVar = (q) this.f22r;
                h0 h0Var = jVar.f34b;
                Object obj3 = this.f21i;
                if (h0Var.b(obj3)) {
                    a1.c(obj3, " was used multiple times ", "Key ");
                    break;
                } else {
                    jVar.f33a.remove(obj3);
                    h0Var.m(obj3, qVar);
                    break;
                }
            case 1:
                u uVar = (u) this.f20e;
                final i4.d dVar = (i4.d) this.f21i;
                final Function1 function1 = (Function1) this.f22r;
                final b0 b0Var = new b0();
                androidx.lifecycle.s sVar = new androidx.lifecycle.s() { // from class: i4.a
                    @Override // androidx.lifecycle.s
                    public final void d(u uVar2, o oVar) {
                        int i3 = c.f4644a[oVar.ordinal()];
                        b0 b0Var2 = b0Var;
                        if (i3 == 1) {
                            b0Var2.f10141d = function1.invoke(d.this);
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            e.d dVar2 = (e.d) b0Var2.f10141d;
                            if (dVar2 != null) {
                                dVar2.a();
                            }
                            b0Var2.f10141d = null;
                        }
                    }
                };
                uVar.g().a(sVar);
                break;
            case 2:
                w wVar = (w) this.f20e;
                n4.h hVar2 = (n4.h) this.f21i;
                o4.o oVar = (o4.o) this.f22r;
                wVar.add(hVar2);
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) this.f20e;
                String str2 = (String) this.f21i;
                b4.c cVar = (b4.c) this.f22r;
                b4.a aVar = (b4.a) obj;
                b4.c cVar2 = u8.g.f9697c;
                b4.c cVar3 = u8.g.f9698d;
                String str3 = "";
                if (((String) g8.b.D(aVar, cVar3, "")).equals(str)) {
                    b4.c c10 = u8.g.c(aVar, str);
                    if (c10 != null && !c10.f1098a.equals(str2)) {
                        u8.g.d(aVar, str);
                        HashSet hashSet = new HashSet((Collection) g8.b.D(aVar, cVar, new HashSet()));
                        hashSet.add(str);
                        aVar.d(cVar, hashSet);
                        break;
                    }
                } else {
                    long longValue = ((Long) g8.b.D(aVar, cVar2, 0L)).longValue();
                    long j3 = 1;
                    if (longValue + 1 == 30) {
                        long longValue2 = ((Long) g8.b.D(aVar, cVar2, 0L)).longValue();
                        Set hashSet2 = new HashSet();
                        String str4 = null;
                        for (Map.Entry entry : aVar.a().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                Set<String> set = (Set) entry.getValue();
                                for (String str5 : set) {
                                    long j10 = j3;
                                    if (str4 == null || str4.compareTo(str5) > 0) {
                                        str3 = ((b4.c) entry.getKey()).f1098a;
                                        hashSet2 = set;
                                        str4 = str5;
                                    }
                                    j3 = j10;
                                }
                            }
                            j3 = j3;
                        }
                        j = j3;
                        obj2 = null;
                        HashSet hashSet3 = new HashSet(hashSet2);
                        hashSet3.remove(str4);
                        str3.getClass();
                        aVar.d(new b4.c(str3), hashSet3);
                        longValue = longValue2 - j;
                        aVar.d(cVar2, Long.valueOf(longValue));
                    } else {
                        j = 1;
                        obj2 = null;
                    }
                    HashSet hashSet4 = new HashSet((Collection) g8.b.D(aVar, cVar, new HashSet()));
                    hashSet4.add(str);
                    aVar.d(cVar, hashSet4);
                    aVar.d(cVar2, Long.valueOf(longValue + j));
                    aVar.d(cVar3, str);
                    break;
                }
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                v.b bVar = (v.b) this.f20e;
                v.g gVar = (v.g) this.f21i;
                z zVar = (z) this.f22r;
                v.e eVar = (v.e) obj;
                v.c.i(eVar, bVar.f9734a);
                j1 j1Var = eVar.f9782d;
                Object value = j1Var.getValue();
                c6.s sVar2 = v.c.f9754k;
                v.l lVar = bVar.f9740h;
                v.l lVar2 = bVar.g;
                if (!Intrinsics.a(lVar2, bVar.f9738e) || !Intrinsics.a(lVar, bVar.f9739f)) {
                    v.l lVar3 = (v.l) ((Function1) sVar2.f1868d).invoke(value);
                    int b10 = lVar3.b();
                    boolean z10 = false;
                    for (int i3 = 0; i3 < b10; i3++) {
                        if (lVar3.a(i3) < lVar2.a(i3) || lVar3.a(i3) > lVar.a(i3)) {
                            lVar3.e(i3, be.f.b(lVar3.a(i3), lVar2.a(i3), lVar.a(i3)));
                            z10 = true;
                        }
                    }
                    if (z10) {
                        value = ((Function1) sVar2.f1869e).invoke(lVar3);
                    }
                }
                if (!Intrinsics.a(value, j1Var.getValue())) {
                    bVar.f9734a.f9798e.setValue(value);
                    gVar.f9798e.setValue(value);
                    eVar.f9785h.setValue(Boolean.FALSE);
                    eVar.f9781c.invoke();
                    zVar.f10164d = true;
                }
                break;
            default:
                d dVar2 = (d) this.f20e;
                v vVar = (v) this.f21i;
                t tVar = (t) this.f22r;
                Throwable th = (Throwable) obj;
                dVar2.invoke(th);
                ie.c cVar4 = (ie.c) vVar.f3177i;
                cVar4.h(th, false);
                while (true) {
                    cVar4.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = ie.c.f4720i;
                    long j11 = atomicLongFieldUpdater.get(cVar4);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = ie.c.f4719e;
                    long j12 = atomicLongFieldUpdater2.get(cVar4);
                    boolean z11 = true;
                    if (cVar4.s(true, j12)) {
                        hVar = new ie.h(cVar4.n());
                    } else {
                        long j13 = j12 & 1152921504606846975L;
                        ie.i iVar = ie.j.f4751a;
                        if (j11 >= j13) {
                            hVar = iVar;
                        } else {
                            Object obj4 = ie.e.f4738k;
                            ie.k kVar = (ie.k) ie.c.f4724u.get(cVar4);
                            while (true) {
                                if (cVar4.s(z11, atomicLongFieldUpdater2.get(cVar4))) {
                                    hVar = new ie.h(cVar4.n());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar4);
                                    long j14 = ie.e.f4731b;
                                    ie.i iVar2 = iVar;
                                    long j15 = andIncrement / j14;
                                    int i10 = (int) (andIncrement % j14);
                                    if (kVar.f5999c != j15) {
                                        ie.k m10 = cVar4.m(j15, kVar);
                                        if (m10 == null) {
                                            continue;
                                            iVar = iVar2;
                                            z11 = true;
                                        } else {
                                            kVar = m10;
                                        }
                                    }
                                    Object B = cVar4.B(kVar, i10, andIncrement, obj4);
                                    if (B == ie.e.f4740m) {
                                        b2 b2Var = obj4 instanceof b2 ? (b2) obj4 : null;
                                        if (b2Var != null) {
                                            b2Var.a(kVar, i10);
                                        }
                                        cVar4.D(andIncrement);
                                        kVar.h();
                                        hVar = iVar2;
                                    } else if (B == ie.e.f4742o) {
                                        if (andIncrement < cVar4.q()) {
                                            kVar.a();
                                        }
                                        iVar = iVar2;
                                        z11 = true;
                                    } else if (B != ie.e.f4741n) {
                                        kVar.a();
                                        hVar = B;
                                    } else {
                                        i0.l("unexpected");
                                        hVar = null;
                                    }
                                }
                            }
                        }
                    }
                    if (hVar instanceof ie.i) {
                        hVar = null;
                    }
                    if (hVar == null) {
                        break;
                    } else {
                        tVar.invoke(hVar, th);
                    }
                }
        }
        return Unit.f5554a;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i3) {
        this.f19d = i3;
        this.f20e = obj;
        this.f21i = obj2;
        this.f22r = obj3;
    }
}
