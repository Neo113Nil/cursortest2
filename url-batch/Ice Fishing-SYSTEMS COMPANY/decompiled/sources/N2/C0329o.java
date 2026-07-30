package N2;

import O2.InterfaceC0367d;
import android.content.Context;
import f3.C4502a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.c1;

/* renamed from: N2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329o extends r {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2080v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0332s f2081w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f2082x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0329o(C0332s c0332s, Object obj, int i) {
        super(c0332s);
        this.f2080v = i;
        this.f2081w = c0332s;
        this.f2082x = obj;
    }

    @Override // N2.r
    public final void c() {
        C4502a c4502a;
        Set set;
        switch (this.f2080v) {
            case 0:
                C0332s c0332s = this.f2081w;
                S0.c cVar = new S0.c(c0332s.f2103w);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f2082x;
                for (M2.c cVar2 : hashMap.keySet()) {
                    cVar2.getClass();
                    if (((C0326l) hashMap.get(cVar2)).f2075c) {
                        arrayList2.add(cVar2);
                    } else {
                        arrayList.add(cVar2);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                Context context = c0332s.f2102v;
                int i = -1;
                int i4 = 0;
                if (isEmpty) {
                    int size = arrayList2.size();
                    while (i4 < size) {
                        i = cVar.C(context, (M2.c) arrayList2.get(i4));
                        i4++;
                        if (i == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i4 < size2) {
                        i = cVar.C(context, (M2.c) arrayList.get(i4));
                        i4++;
                        if (i != 0) {
                        }
                    }
                }
                y yVar = c0332s.f2100n;
                if (i != 0) {
                    C0327m c0327m = new C0327m(this, c0332s, new L2.b(i, null, null));
                    HandlerC0333t handlerC0333t = yVar.f2143x;
                    handlerC0333t.sendMessage(handlerC0333t.obtainMessage(1, c0327m));
                    return;
                }
                if (c0332s.f2092F && (c4502a = c0332s.f2090D) != null) {
                    c4502a.A();
                }
                for (M2.c cVar3 : hashMap.keySet()) {
                    InterfaceC0367d interfaceC0367d = (InterfaceC0367d) hashMap.get(cVar3);
                    cVar3.getClass();
                    if (cVar.C(context, cVar3) != 0) {
                        C0328n c0328n = new C0328n(c0332s, interfaceC0367d);
                        HandlerC0333t handlerC0333t2 = yVar.f2143x;
                        handlerC0333t2.sendMessage(handlerC0333t2.obtainMessage(1, c0328n));
                    } else {
                        cVar3.i(interfaceC0367d);
                    }
                }
                return;
            default:
                C0332s c0332s2 = this.f2081w;
                v vVar = c0332s2.f2100n.f2137F;
                y yVar2 = c0332s2.f2100n;
                c1 c1Var = c0332s2.f2096K;
                if (c1Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) c1Var.f39394n);
                    Map map = (Map) c1Var.f39396v;
                    for (M2.e eVar : map.keySet()) {
                        if (!yVar2.f2145z.containsKey(eVar.f1882b)) {
                            map.get(eVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                vVar.f2118I = set;
                ArrayList arrayList3 = (ArrayList) this.f2082x;
                int size3 = arrayList3.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    ((M2.c) arrayList3.get(i9)).g(c0332s2.f2094H, yVar2.f2137F.f2118I);
                }
                return;
        }
    }
}
