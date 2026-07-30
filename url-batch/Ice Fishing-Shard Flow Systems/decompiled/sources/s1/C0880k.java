package s1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import n.w1;
import r1.InterfaceC0844c;
import t1.C0916c;
import t1.InterfaceC0915b;

/* renamed from: s1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880k extends Q0.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7668i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0883n f7669l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7670m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0880k(C0883n c0883n, Object obj, int i2) {
        super(c0883n);
        this.f7668i = i2;
        this.f7669l = c0883n;
        this.f7670m = obj;
    }

    @Override // Q0.c
    public final void c() {
        I1.a aVar;
        Set set;
        switch (this.f7668i) {
            case 0:
                C0883n c0883n = this.f7669l;
                q1.f fVar = c0883n.f7679l;
                C0888s c0888s = c0883n.f7676d;
                Context context = c0883n.f7678i;
                P0.s sVar = new P0.s(fVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f7670m;
                for (InterfaceC0844c interfaceC0844c : hashMap.keySet()) {
                    interfaceC0844c.getClass();
                    if (((C0877h) hashMap.get(interfaceC0844c)).f7663c) {
                        arrayList2.add(interfaceC0844c);
                    } else {
                        arrayList.add(interfaceC0844c);
                    }
                }
                int i2 = 0;
                int i5 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i2 < size) {
                        i5 = sVar.z(context, (InterfaceC0844c) arrayList2.get(i2));
                        i2++;
                        if (i5 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        i5 = sVar.z(context, (InterfaceC0844c) arrayList.get(i2));
                        i2++;
                        if (i5 != 0) {
                        }
                    }
                }
                if (i5 != 0) {
                    C0878i c0878i = new C0878i(this, c0883n, new q1.b(i5, null, null));
                    HandlerC0884o handlerC0884o = c0888s.f7724i;
                    handlerC0884o.sendMessage(handlerC0884o.obtainMessage(1, c0878i));
                    return;
                }
                if (c0883n.f7688u && (aVar = c0883n.f7686s) != null) {
                    aVar.f4389n = new C0916c(aVar);
                    aVar.p(2, null);
                }
                for (InterfaceC0844c interfaceC0844c2 : hashMap.keySet()) {
                    InterfaceC0915b interfaceC0915b = (InterfaceC0915b) hashMap.get(interfaceC0844c2);
                    interfaceC0844c2.getClass();
                    if (sVar.z(context, interfaceC0844c2) != 0) {
                        C0879j c0879j = new C0879j(this, c0883n, interfaceC0915b);
                        HandlerC0884o handlerC0884o2 = c0888s.f7724i;
                        handlerC0884o2.sendMessage(handlerC0884o2.obtainMessage(1, c0879j));
                    } else {
                        com.google.android.gms.common.internal.a aVar2 = (com.google.android.gms.common.internal.a) interfaceC0844c2;
                        t1.u.g(interfaceC0915b, "Connection progress callbacks cannot be null.");
                        aVar2.f4389n = interfaceC0915b;
                        aVar2.p(2, null);
                    }
                }
                return;
            default:
                C0883n c0883n2 = this.f7669l;
                C0888s c0888s2 = c0883n2.f7676d;
                C0885p c0885p = c0888s2.f7731q;
                w1 w1Var = c0883n2.f7693z;
                if (w1Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) w1Var.f6941d);
                    Map map = (Map) w1Var.f6943i;
                    for (r1.e eVar : map.keySet()) {
                        if (!c0888s2.f7725k.containsKey(eVar.f7436b)) {
                            map.get(eVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                c0885p.f7716x = set;
                ArrayList arrayList3 = (ArrayList) this.f7670m;
                int size3 = arrayList3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ((com.google.android.gms.common.internal.a) ((InterfaceC0844c) arrayList3.get(i7))).h(c0883n2.f7690w, c0888s2.f7731q.f7716x);
                }
                return;
        }
    }
}
