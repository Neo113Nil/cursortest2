package d;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends s4.d {

    /* renamed from: f, reason: collision with root package name */
    public final d0 f3270f;
    public boolean g;

    public x(d0 d0Var, y yVar) {
        super(yVar, d0Var.f3220b);
        this.f3270f = d0Var;
        this.g = true;
    }

    @Override // s4.d
    public final void a() {
        d0 d0Var = this.f3270f;
        switch (d0Var.f3222d) {
            case 1:
                ((d2.b) d0Var.f3223e).e();
                return;
            case 2:
                f4.j jVar = (f4.j) d0Var.f3223e;
                if (f4.j.j(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + jVar);
                }
                if (f4.j.j(3)) {
                    Log.d("FragmentManager", "cancelBackStackTransition for transition " + jVar.f4092d);
                }
                f4.a aVar = jVar.f4092d;
                if (aVar != null) {
                    aVar.f4068d = false;
                    ArrayList arrayList = aVar.f4065a;
                    int size = arrayList.size() - 1;
                    while (size >= 0) {
                        f4.l lVar = (f4.l) arrayList.get(size);
                        if (lVar.f4098c) {
                            if (lVar.f4096a == 8) {
                                lVar.f4098c = false;
                                arrayList.remove(size - 1);
                                size--;
                            } else {
                                lVar.f4097b.getClass();
                                lVar.f4096a = 2;
                                lVar.f4098c = false;
                                for (int i3 = size - 1; i3 >= 0; i3--) {
                                    f4.l lVar2 = (f4.l) arrayList.get(i3);
                                    if (lVar2.f4098c) {
                                        lVar2.f4097b.getClass();
                                        arrayList.remove(i3);
                                        size--;
                                    }
                                }
                            }
                        }
                        size--;
                    }
                    f4.a aVar2 = jVar.f4092d;
                    androidx.lifecycle.d0 d0Var2 = new androidx.lifecycle.d0(13, jVar);
                    if (aVar2.f4066b == null) {
                        aVar2.f4066b = new ArrayList();
                    }
                    aVar2.f4066b.add(d0Var2);
                    jVar.f4092d.a(false);
                    jVar.i();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    @Override // s4.d
    public final void b() {
        d0 d0Var = this.f3270f;
        switch (d0Var.f3222d) {
            case 0:
                ((b3.b) d0Var.f3223e).invoke(d0Var);
                return;
            case 1:
                ((d2.b) d0Var.f3223e).f();
                return;
            case 2:
                f4.j jVar = (f4.j) d0Var.f3223e;
                if (f4.j.j(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + jVar);
                }
                jVar.i();
                throw null;
            default:
                ((n4.x) d0Var.f3223e).b();
                return;
        }
    }

    @Override // s4.d
    public final void c(s4.b bVar) {
        a aVar = new a(bVar);
        d0 d0Var = this.f3270f;
        switch (d0Var.f3222d) {
            case 1:
                ((d2.b) d0Var.f3223e).g(aVar);
                return;
            case 2:
                f4.j jVar = (f4.j) d0Var.f3223e;
                if (f4.j.j(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + jVar);
                }
                if (jVar.f4092d != null) {
                    ArrayList arrayList = new ArrayList(Collections.singletonList(jVar.f4092d));
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = ((f4.a) arrayList.get(0)).f4065a;
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        f4.f fVar = ((f4.l) obj).f4097b;
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        f4.b bVar2 = (f4.b) it.next();
                        bVar2.getClass();
                        if (f4.j.j(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + aVar.f3206c);
                        }
                        ArrayList arrayList3 = bVar2.f4072c;
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj2 = arrayList3.get(i10);
                            i10++;
                            ((f4.o) obj2).getClass();
                            kotlin.collections.d0.l(arrayList4, null);
                        }
                        List Q = CollectionsKt.Q(CollectionsKt.T(arrayList4));
                        int size3 = Q.size();
                        for (int i11 = 0; i11 < size3; i11++) {
                            ((f4.n) Q.get(i11)).a(aVar, bVar2.f4070a);
                        }
                    }
                    Iterator it2 = jVar.f4094f.iterator();
                    if (it2.hasNext()) {
                        throw v4.a.i(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // s4.d
    public final void d(s4.b bVar) {
        bVar.getClass();
        d0 d0Var = this.f3270f;
        new a(bVar);
        switch (d0Var.f3222d) {
            case 1:
                ((d2.b) d0Var.f3223e).h();
                return;
            case 2:
                f4.j jVar = (f4.j) d0Var.f3223e;
                if (f4.j.j(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + jVar);
                }
                jVar.getClass();
                HashSet hashSet = new HashSet();
                c6.e eVar = jVar.f4090b;
                eVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (f4.k kVar : ((HashMap) eVar.f1815i).values()) {
                }
                if (arrayList.size() > 0) {
                    ((f4.k) arrayList.get(0)).getClass();
                    throw null;
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f4.b bVar2 = (f4.b) it.next();
                    bVar2.getClass();
                    if (f4.j.j(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
                    }
                    boolean isAttachedToWindow = bVar2.f4070a.isAttachedToWindow();
                    synchronized (bVar2.f4071b) {
                        try {
                            ArrayList arrayList2 = bVar2.f4071b;
                            int size = arrayList2.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList2.get(i3);
                                i3++;
                                ((f4.o) obj).getClass();
                            }
                            bVar2.a(bVar2.f4071b);
                            ArrayList R = CollectionsKt.R(bVar2.f4072c);
                            int size2 = R.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj2 = R.get(i11);
                                i11++;
                                ((f4.o) obj2).getClass();
                            }
                            int size3 = R.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                Object obj3 = R.get(i12);
                                i12++;
                                f4.o oVar = (f4.o) obj3;
                                if (f4.j.j(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar2.f4070a + " is not attached to window. ") + "Cancelling running operation " + oVar);
                                }
                                oVar.a(bVar2.f4070a);
                            }
                            ArrayList R2 = CollectionsKt.R(bVar2.f4071b);
                            int size4 = R2.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj4 = R2.get(i13);
                                i13++;
                                ((f4.o) obj4).getClass();
                            }
                            int size5 = R2.size();
                            while (i10 < size5) {
                                Object obj5 = R2.get(i10);
                                i10++;
                                f4.o oVar2 = (f4.o) obj5;
                                if (f4.j.j(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + bVar2.f4070a + " is not attached to window. ") + "Cancelling pending operation " + oVar2);
                                }
                                oVar2.a(bVar2.f4070a);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            default:
                return;
        }
    }

    public final void g(boolean z10) {
        this.g = z10;
        f(z10 && this.f3270f.f3220b);
    }
}
