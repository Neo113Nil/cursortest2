package V5;

import U5.AbstractC0216c;
import f0.C0362b;
import g0.InterfaceC0390a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.j implements InterfaceC0732a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2738f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2739g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i7, Object obj2) {
        super(0);
        this.f2738f = i7;
        this.f2739g = obj;
        this.f2740h = obj2;
    }

    @Override // x5.InterfaceC0732a
    public final Object invoke() {
        String[] names;
        switch (this.f2738f) {
            case 0:
                R5.e eVar = (R5.e) this.f2739g;
                AbstractC0216c abstractC0216c = (AbstractC0216c) this.f2740h;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                N3.k kVar = abstractC0216c.f2635a;
                n.g(eVar, abstractC0216c);
                int d7 = eVar.d();
                for (int i7 = 0; i7 < d7; i7++) {
                    List g7 = eVar.g(i7);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : g7) {
                        if (obj instanceof U5.t) {
                            arrayList.add(obj);
                        }
                    }
                    U5.t tVar = (U5.t) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (tVar != null && (names = tVar.names()) != null) {
                        for (String str : names) {
                            String str2 = kotlin.jvm.internal.i.a(eVar.c(), R5.h.f2171c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                String message = "The suggested name '" + str + "' for " + str2 + ' ' + eVar.e(i7) + " is already one of the names for " + str2 + ' ' + eVar.e(((Number) l5.t.o0(linkedHashMap, str)).intValue()) + " in " + eVar;
                                kotlin.jvm.internal.i.e(message, "message");
                                throw new l(message);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i7));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? l5.q.f5304f : linkedHashMap;
            default:
                ((InterfaceC0390a) ((C0362b) this.f2739g).f4175g).a((D3.p) this.f2740h);
                return k5.v.f5219a;
        }
    }
}
