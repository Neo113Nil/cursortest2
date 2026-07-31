package o4;

import d7.n0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5628d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f5629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f5630f;

    public /* synthetic */ f(g gVar, d dVar) {
        this.f5629e = gVar;
        this.f5630f = dVar;
    }

    @Override // p6.a
    public final Object b() {
        switch (this.f5628d) {
            case 0:
                g gVar = this.f5629e;
                d dVar = this.f5630f;
                q6.i.e(dVar, "entry");
                n0 n0Var = gVar.f5633c;
                Set set = (Set) n0Var.getValue();
                q6.i.e(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(d6.y.F(set.size()));
                boolean z3 = false;
                for (Object obj : set) {
                    boolean z7 = true;
                    if (!z3 && q6.i.a(obj, dVar)) {
                        z3 = true;
                        z7 = false;
                    }
                    if (z7) {
                        linkedHashSet.add(obj);
                    }
                }
                n0Var.j(null, linkedHashSet);
                break;
            default:
                g gVar2 = this.f5629e;
                d dVar2 = this.f5630f;
                synchronized (gVar2.f5631a) {
                    try {
                        n0 n0Var2 = gVar2.f5632b;
                        Iterable iterable = (Iterable) n0Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (q6.i.a((d) obj2, dVar2)) {
                                n0Var2.getClass();
                                n0Var2.j(null, arrayList);
                                break;
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        n0Var2.getClass();
                        n0Var2.j(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ f(g gVar, d dVar, boolean z3) {
        this.f5629e = gVar;
        this.f5630f = dVar;
    }
}
