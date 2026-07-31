package T0;

import U0.InterfaceC0211b;
import android.content.Context;
import i1.C0420a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k.v0;
import u0.C0689s;

/* renamed from: T0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179n extends AbstractRunnableC0182q {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2313h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f2314i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f2315j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0179n(r rVar, Object obj, int i7) {
        super(rVar);
        this.f2313h = i7;
        this.f2314i = rVar;
        this.f2315j = obj;
    }

    @Override // T0.AbstractRunnableC0182q
    public final void c() {
        C0420a c0420a;
        Set set;
        switch (this.f2313h) {
            case 0:
                r rVar = this.f2314i;
                x xVar = rVar.f2320f;
                Context context = rVar.f2322h;
                C0689s c0689s = new C0689s(rVar.f2323i);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f2315j;
                for (S0.a aVar : hashMap.keySet()) {
                    aVar.getClass();
                    if (((C0176k) hashMap.get(aVar)).f2308c) {
                        arrayList2.add(aVar);
                    } else {
                        arrayList.add(aVar);
                    }
                }
                int i7 = -1;
                int i8 = 0;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i8 < size) {
                        i7 = c0689s.v(context, (S0.a) arrayList2.get(i8));
                        i8++;
                        if (i7 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i8 < size2) {
                        i7 = c0689s.v(context, (S0.a) arrayList.get(i8));
                        i8++;
                        if (i7 != 0) {
                        }
                    }
                }
                if (i7 != 0) {
                    C0177l c0177l = new C0177l(this, rVar, new R0.a(i7, null));
                    HandlerC0183s handlerC0183s = xVar.f2369h;
                    handlerC0183s.sendMessage(handlerC0183s.obtainMessage(1, c0177l));
                    return;
                }
                if (rVar.f2332r && (c0420a = rVar.f2330p) != null) {
                    c0420a.x();
                }
                for (S0.a aVar2 : hashMap.keySet()) {
                    InterfaceC0211b interfaceC0211b = (InterfaceC0211b) hashMap.get(aVar2);
                    aVar2.getClass();
                    if (c0689s.v(context, aVar2) != 0) {
                        C0178m c0178m = new C0178m(rVar, interfaceC0211b);
                        HandlerC0183s handlerC0183s2 = xVar.f2369h;
                        handlerC0183s2.sendMessage(handlerC0183s2.obtainMessage(1, c0178m));
                    } else {
                        aVar2.j(interfaceC0211b);
                    }
                }
                return;
            default:
                r rVar2 = this.f2314i;
                x xVar2 = rVar2.f2320f;
                u uVar = xVar2.f2377p;
                v0 v0Var = rVar2.f2337w;
                if (v0Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) v0Var.f5136f);
                    Map map = (Map) v0Var.f5138h;
                    for (S0.c cVar : map.keySet()) {
                        if (!xVar2.f2371j.containsKey(cVar.f2201b)) {
                            map.get(cVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                uVar.f2359u = set;
                ArrayList arrayList3 = (ArrayList) this.f2315j;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((S0.a) arrayList3.get(i9)).n(rVar2.f2334t, xVar2.f2377p.f2359u);
                }
                return;
        }
    }
}
