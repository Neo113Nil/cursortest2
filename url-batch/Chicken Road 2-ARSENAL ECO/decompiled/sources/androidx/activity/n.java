package androidx.activity;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k5.v;
import l5.AbstractC0506j;
import l5.C0504h;
import u0.C0689s;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.j implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f3206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(s sVar, int i7) {
        super(1);
        this.f3205f = i7;
        this.f3206g = sVar;
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f3205f) {
            case 0:
                kotlin.jvm.internal.i.e((b) obj, "backEvent");
                s sVar = this.f3206g;
                C0504h c0504h = sVar.f3216b;
                ListIterator listIterator = c0504h.listIterator(c0504h.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((N.h) obj2).f1664a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                N.h hVar = (N.h) obj2;
                sVar.f3217c = hVar;
                if (hVar == null) {
                    return v.f5219a;
                }
                F3.g gVar = hVar.f1665b;
                if (F3.g.o(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + gVar);
                }
                gVar.getClass();
                HashSet hashSet = new HashSet();
                C0689s c0689s = (C0689s) gVar.f735i;
                c0689s.getClass();
                ArrayList arrayList = new ArrayList();
                for (N.k kVar : ((HashMap) c0689s.f6035g).values()) {
                }
                if (arrayList.size() > 0) {
                    ((N.k) arrayList.get(0)).getClass();
                    throw null;
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    N.b bVar = (N.b) it.next();
                    bVar.getClass();
                    if (F3.g.o(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = bVar.f1639a.isAttachedToWindow();
                    synchronized (bVar.f1640b) {
                        try {
                            ArrayList arrayList2 = bVar.f1640b;
                            int size = arrayList2.size();
                            int i7 = 0;
                            while (i7 < size) {
                                Object obj4 = arrayList2.get(i7);
                                i7++;
                                ((N.o) obj4).getClass();
                            }
                            bVar.b(bVar.f1640b);
                            ArrayList Q6 = AbstractC0506j.Q(bVar.f1641c);
                            int size2 = Q6.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj5 = Q6.get(i9);
                                i9++;
                                N.o oVar = (N.o) obj5;
                                if (F3.g.o(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f1639a + " is not attached to window. ") + "Cancelling running operation " + oVar);
                                }
                                oVar.a(bVar.f1639a);
                            }
                            ArrayList Q7 = AbstractC0506j.Q(bVar.f1640b);
                            int size3 = Q7.size();
                            while (i8 < size3) {
                                Object obj6 = Q7.get(i8);
                                i8++;
                                N.o oVar2 = (N.o) obj6;
                                if (F3.g.o(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f1639a + " is not attached to window. ") + "Cancelling pending operation " + oVar2);
                                }
                                oVar2.a(bVar.f1639a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            default:
                b backEvent = (b) obj;
                kotlin.jvm.internal.i.e(backEvent, "backEvent");
                s sVar2 = this.f3206g;
                N.h hVar2 = sVar2.f3217c;
                if (hVar2 == null) {
                    C0504h c0504h2 = sVar2.f3216b;
                    ListIterator listIterator2 = c0504h2.listIterator(c0504h2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((N.h) obj3).f1664a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    hVar2 = (N.h) obj3;
                }
                if (hVar2 != null) {
                    F3.g gVar2 = hVar2.f1665b;
                    if (F3.g.o(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + gVar2);
                    }
                    if (((N.a) gVar2.f737k) != null) {
                        ArrayList arrayList3 = new ArrayList(Collections.singletonList((N.a) gVar2.f737k));
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList4 = ((N.a) arrayList3.get(0)).f1635a;
                        int size4 = arrayList4.size();
                        int i10 = 0;
                        while (i10 < size4) {
                            Object obj7 = arrayList4.get(i10);
                            i10++;
                            N.f fVar = ((N.l) obj7).f1668b;
                        }
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            N.b bVar2 = (N.b) it2.next();
                            bVar2.getClass();
                            if (F3.g.o(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f3188c);
                            }
                            ArrayList arrayList5 = bVar2.f1641c;
                            ArrayList arrayList6 = new ArrayList();
                            int size5 = arrayList5.size();
                            int i11 = 0;
                            while (i11 < size5) {
                                Object obj8 = arrayList5.get(i11);
                                i11++;
                                ((N.o) obj8).getClass();
                                AbstractC0506j.D(null, arrayList6);
                            }
                            List P6 = AbstractC0506j.P(AbstractC0506j.T(arrayList6));
                            int size6 = P6.size();
                            for (int i12 = 0; i12 < size6; i12++) {
                                ((N.n) P6.get(i12)).a(backEvent, bVar2.f1639a);
                            }
                        }
                        Iterator it3 = ((ArrayList) gVar2.f739m).iterator();
                        if (it3.hasNext()) {
                            it3.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return v.f5219a;
        }
    }
}
