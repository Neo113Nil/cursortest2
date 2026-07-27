package androidx.activity;

import android.util.Log;
import f4.v;
import g4.AbstractC0465j;
import g4.C0463h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f4063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(t tVar, int i2) {
        super(1);
        this.f4062e = i2;
        this.f4063f = tVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f4062e) {
            case 0:
                kotlin.jvm.internal.i.e((b) obj, "backEvent");
                t tVar = this.f4063f;
                C0463h c0463h = tVar.f4075b;
                ListIterator listIterator = c0463h.listIterator(c0463h.c());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((R.i) obj2).f2594a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                R.i iVar = (R.i) obj2;
                tVar.f4076c = iVar;
                if (iVar == null) {
                    return v.f5689a;
                }
                boolean isLoggable = Log.isLoggable("FragmentManager", 3);
                R.m mVar = iVar.f2595b;
                if (isLoggable) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + mVar);
                }
                mVar.getClass();
                HashSet hashSet = new HashSet();
                B0.c cVar = mVar.f2598b;
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (R.o oVar : ((HashMap) cVar.f141c).values()) {
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ((R.o) it.next()).getClass();
                    throw null;
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    R.b bVar = (R.b) it2.next();
                    bVar.getClass();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = bVar.f2571a.isAttachedToWindow();
                    synchronized (bVar.f2572b) {
                        try {
                            Iterator it3 = bVar.f2572b.iterator();
                            while (it3.hasNext()) {
                                ((R.s) it3.next()).getClass();
                            }
                            bVar.b(bVar.f2572b);
                            Iterator it4 = AbstractC0465j.U0(bVar.f2573c).iterator();
                            while (it4.hasNext()) {
                                R.s sVar = (R.s) it4.next();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f2571a + " is not attached to window. ") + "Cancelling running operation " + sVar);
                                }
                                sVar.a(bVar.f2571a);
                            }
                            Iterator it5 = AbstractC0465j.U0(bVar.f2572b).iterator();
                            while (it5.hasNext()) {
                                R.s sVar2 = (R.s) it5.next();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar.f2571a + " is not attached to window. ") + "Cancelling pending operation " + sVar2);
                                }
                                sVar2.a(bVar.f2571a);
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
                t tVar2 = this.f4063f;
                R.i iVar2 = tVar2.f4076c;
                if (iVar2 == null) {
                    C0463h c0463h2 = tVar2.f4075b;
                    ListIterator listIterator2 = c0463h2.listIterator(c0463h2.c());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((R.i) obj3).f2594a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    iVar2 = (R.i) obj3;
                }
                if (iVar2 != null) {
                    boolean isLoggable2 = Log.isLoggable("FragmentManager", 2);
                    R.m mVar2 = iVar2.f2595b;
                    if (isLoggable2) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + mVar2);
                    }
                    if (mVar2.f2600d != null) {
                        ArrayList arrayList2 = new ArrayList(Collections.singletonList(mVar2.f2600d));
                        HashSet hashSet2 = new HashSet();
                        Iterator it6 = ((R.a) arrayList2.get(0)).f2567a.iterator();
                        while (it6.hasNext()) {
                            R.f fVar = ((R.p) it6.next()).f2607b;
                        }
                        Iterator it7 = hashSet2.iterator();
                        while (it7.hasNext()) {
                            R.b bVar2 = (R.b) it7.next();
                            bVar2.getClass();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.f4044c);
                            }
                            ArrayList arrayList3 = bVar2.f2573c;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                ((R.s) it8.next()).getClass();
                                kotlin.jvm.internal.i.e(null, "elements");
                                arrayList4.addAll(null);
                            }
                            List S02 = AbstractC0465j.S0(AbstractC0465j.X0(arrayList4));
                            int size = S02.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ((R.r) S02.get(i2)).a(backEvent, bVar2.f2571a);
                            }
                        }
                        Iterator it9 = mVar2.f2602f.iterator();
                        if (it9.hasNext()) {
                            it9.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return v.f5689a;
        }
    }
}
