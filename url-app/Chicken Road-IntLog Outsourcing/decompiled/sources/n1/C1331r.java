package n1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import l.q0;
import m1.InterfaceC1276c;
import o1.InterfaceC1364b;

/* renamed from: n1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331r extends C0.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11411c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1334u f11412d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1331r(C1334u c1334u, Object obj, int i2) {
        super(c1334u);
        this.f11411c = i2;
        this.f11412d = c1334u;
        this.f11413e = obj;
    }

    @Override // C0.c
    public final void c() {
        G1.a aVar;
        Set set;
        switch (this.f11411c) {
            case 0:
                C1334u c1334u = this.f11412d;
                x1.e eVar = new x1.e(c1334u.f11419d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f11413e;
                for (InterfaceC1276c interfaceC1276c : hashMap.keySet()) {
                    interfaceC1276c.getClass();
                    if (((C1329p) hashMap.get(interfaceC1276c)).f11407c) {
                        arrayList2.add(interfaceC1276c);
                    } else {
                        arrayList.add(interfaceC1276c);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                Context context = c1334u.f11418c;
                int i2 = 0;
                int i3 = -1;
                if (isEmpty) {
                    int size = arrayList2.size();
                    while (i2 < size) {
                        i3 = eVar.v(context, (InterfaceC1276c) arrayList2.get(i2));
                        i2++;
                        if (i3 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        i3 = eVar.v(context, (InterfaceC1276c) arrayList.get(i2));
                        i2++;
                        if (i3 != 0) {
                        }
                    }
                }
                C1297A c1297a = c1334u.f11416a;
                if (i3 != 0) {
                    C1330q c1330q = new C1330q(this, c1334u, new l1.b(i3, null));
                    HandlerC1335v handlerC1335v = c1297a.f11281h;
                    handlerC1335v.sendMessage(handlerC1335v.obtainMessage(1, c1330q));
                    return;
                }
                if (c1334u.f11428m && (aVar = c1334u.f11426k) != null) {
                    aVar.A();
                }
                for (InterfaceC1276c interfaceC1276c2 : hashMap.keySet()) {
                    InterfaceC1364b interfaceC1364b = (InterfaceC1364b) hashMap.get(interfaceC1276c2);
                    interfaceC1276c2.getClass();
                    if (eVar.v(context, interfaceC1276c2) != 0) {
                        C1327n c1327n = new C1327n(c1334u, interfaceC1364b);
                        HandlerC1335v handlerC1335v2 = c1297a.f11281h;
                        handlerC1335v2.sendMessage(handlerC1335v2.obtainMessage(1, c1327n));
                    } else {
                        interfaceC1276c2.d(interfaceC1364b);
                    }
                }
                return;
            default:
                C1334u c1334u2 = this.f11412d;
                C1337x c1337x = c1334u2.f11416a.f11289p;
                C1297A c1297a2 = c1334u2.f11416a;
                q0 q0Var = c1334u2.f11433r;
                if (q0Var == null) {
                    set = Collections.emptySet();
                } else {
                    HashSet hashSet = new HashSet((Set) q0Var.f10941a);
                    Map map = (Map) q0Var.f10943c;
                    for (m1.e eVar2 : map.keySet()) {
                        if (!c1297a2.f11283j.containsKey(eVar2.f11124b)) {
                            map.get(eVar2).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                c1337x.f11454p = set;
                ArrayList arrayList3 = (ArrayList) this.f11413e;
                int size3 = arrayList3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((InterfaceC1276c) arrayList3.get(i6)).o(c1334u2.f11430o, c1297a2.f11289p.f11454p);
                }
                return;
        }
    }
}
