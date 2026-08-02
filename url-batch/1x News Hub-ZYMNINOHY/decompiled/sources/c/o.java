package c;

import android.util.Log;
import b2.C0195i;
import c2.C0204b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.k implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2603e;
    public final /* synthetic */ t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, int i3) {
        super(1);
        this.f2603e = i3;
        this.f = tVar;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f2603e) {
            case 0:
                kotlin.jvm.internal.j.e((C0197b) obj, "backEvent");
                t tVar = this.f;
                C0204b c0204b = tVar.f2612b;
                c0204b.getClass();
                ListIterator listIterator = c0204b.listIterator(c0204b.f2633c);
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((P.h) obj2).f1236a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                P.h hVar = (P.h) obj2;
                if (tVar.f2613c != null) {
                    tVar.a();
                }
                tVar.f2613c = hVar;
                if (hVar == null) {
                    return C0195i.f2555a;
                }
                boolean j3 = P.k.j(3);
                P.k kVar = hVar.f1237b;
                if (j3) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + kVar);
                }
                kVar.getClass();
                HashSet hashSet = new HashSet();
                V0.e eVar = kVar.f1239b;
                eVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (P.l lVar : ((HashMap) eVar.f1600c).values()) {
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((P.l) it.next()).getClass();
                    throw null;
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    P.b bVar = (P.b) it2.next();
                    bVar.getClass();
                    if (P.k.j(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = bVar.f1214a.isAttachedToWindow();
                    synchronized (bVar.f1215b) {
                        try {
                            Iterator it3 = bVar.f1215b.iterator();
                            while (it3.hasNext()) {
                                ((P.p) it3.next()).getClass();
                            }
                            bVar.a(bVar.f1215b);
                            Iterator it4 = c2.e.Z(bVar.f1216c).iterator();
                            while (it4.hasNext()) {
                                P.p pVar = (P.p) it4.next();
                                if (P.k.j(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f1214a + " is not attached to window. ") + "Cancelling running operation " + pVar);
                                }
                                pVar.a(bVar.f1214a);
                            }
                            Iterator it5 = c2.e.Z(bVar.f1215b).iterator();
                            while (it5.hasNext()) {
                                P.p pVar2 = (P.p) it5.next();
                                if (P.k.j(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f1214a + " is not attached to window. ") + "Cancelling pending operation " + pVar2);
                                }
                                pVar2.a(bVar.f1214a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            default:
                C0197b backEvent = (C0197b) obj;
                kotlin.jvm.internal.j.e(backEvent, "backEvent");
                t tVar2 = this.f;
                P.h hVar2 = tVar2.f2613c;
                if (hVar2 == null) {
                    C0204b c0204b2 = tVar2.f2612b;
                    c0204b2.getClass();
                    ListIterator listIterator2 = c0204b2.listIterator(c0204b2.f2633c);
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((P.h) obj3).f1236a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    hVar2 = (P.h) obj3;
                }
                if (hVar2 != null) {
                    boolean j4 = P.k.j(2);
                    P.k kVar2 = hVar2.f1237b;
                    if (j4) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + kVar2);
                    }
                    if (kVar2.f1241d != null) {
                        ArrayList arrayList2 = new ArrayList(Collections.singletonList(kVar2.f1241d));
                        HashSet hashSet2 = new HashSet();
                        Iterator it6 = ((P.a) arrayList2.get(0)).f1210a.iterator();
                        while (it6.hasNext()) {
                            P.f fVar = ((P.m) it6.next()).f1246b;
                        }
                        Iterator it7 = hashSet2.iterator();
                        while (it7.hasNext()) {
                            P.b bVar2 = (P.b) it7.next();
                            bVar2.getClass();
                            if (P.k.j(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f2559c);
                            }
                            ArrayList arrayList3 = bVar2.f1216c;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                ((P.p) it8.next()).getClass();
                                c2.k.O(arrayList4, null);
                            }
                            List Y2 = c2.e.Y(c2.e.a0(arrayList4));
                            int size = Y2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((P.o) Y2.get(i3)).a(backEvent, bVar2.f1214a);
                            }
                        }
                        Iterator it9 = kVar2.f.iterator();
                        if (it9.hasNext()) {
                            it9.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return C0195i.f2555a;
        }
    }
}
