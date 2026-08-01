package b7;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1322i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f1323r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f1324s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(s sVar, Object obj, int i3) {
        super(sVar);
        this.f1322i = i3;
        this.f1323r = sVar;
        this.f1324s = obj;
    }

    @Override // b7.r
    public final void c() {
        u7.a aVar;
        Set set;
        switch (this.f1322i) {
            case 0:
                s sVar = this.f1323r;
                z6.g gVar = sVar.f1347r;
                y yVar = sVar.f1344d;
                Context context = sVar.f1346i;
                c6.s sVar2 = new c6.s(gVar);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = (HashMap) this.f1324s;
                for (c7.i iVar : hashMap.keySet()) {
                    iVar.getClass();
                    if (((l) hashMap.get(iVar)).f1311c) {
                        arrayList2.add(iVar);
                    } else {
                        arrayList.add(iVar);
                    }
                }
                int i3 = 0;
                int i10 = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i3 < size) {
                        i10 = sVar2.i(context, (c7.i) arrayList2.get(i3));
                        i3++;
                        if (i10 == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i3 < size2) {
                        i10 = sVar2.i(context, (c7.i) arrayList.get(i3));
                        i3++;
                        if (i10 != 0) {
                        }
                    }
                }
                if (i10 != 0) {
                    m mVar = new m(this, sVar, new z6.b(i10, null, null));
                    t tVar = yVar.f1400h;
                    tVar.sendMessage(tVar.obtainMessage(1, mVar));
                    break;
                } else {
                    if (sVar.A && (aVar = sVar.f1354y) != null) {
                        aVar.b(new c7.e(aVar));
                    }
                    for (c7.i iVar2 : hashMap.keySet()) {
                        c7.d dVar = (c7.d) hashMap.get(iVar2);
                        iVar2.getClass();
                        if (sVar2.i(context, iVar2) != 0) {
                            n nVar = new n(this, sVar, dVar);
                            t tVar2 = yVar.f1400h;
                            tVar2.sendMessage(tVar2.obtainMessage(1, nVar));
                        } else {
                            iVar2.b(dVar);
                        }
                    }
                    break;
                }
            default:
                s sVar3 = this.f1323r;
                y yVar2 = sVar3.f1344d;
                v vVar = yVar2.f1407p;
                g2 g2Var = sVar3.F;
                if (g2Var == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) g2Var.f6077d);
                    Map map = (Map) g2Var.f6079i;
                    for (a7.d dVar2 : map.keySet()) {
                        if (!yVar2.j.containsKey(dVar2.f314b)) {
                            map.get(dVar2).getClass();
                            kotlin.collections.i0.j();
                            break;
                        }
                    }
                    set = hashSet;
                }
                vVar.f1378p = set;
                ArrayList arrayList3 = (ArrayList) this.f1324s;
                int size3 = arrayList3.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    ((c7.i) arrayList3.get(i11)).k(sVar3.C, yVar2.f1407p.f1378p);
                }
                break;
        }
    }
}
