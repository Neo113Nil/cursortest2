package k;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements p1.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f5244a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5245b;

    public n(r rVar) {
        this.f5244a = rVar;
    }

    @Override // p1.f0
    public final p1.g0 a(p1.h0 h0Var, List list, long j8) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((p1.e0) list.get(i7)).b(j8));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i8 = ((p1.n0) obj).f7063f;
            int W = e6.m.W(arrayList);
            if (1 <= W) {
                int i9 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i9);
                    int i10 = ((p1.n0) obj3).f7063f;
                    if (i8 < i10) {
                        obj = obj3;
                        i8 = i10;
                    }
                    if (i9 == W) {
                        break;
                    }
                    i9++;
                }
            }
        }
        p1.n0 n0Var = (p1.n0) obj;
        int i11 = n0Var != null ? n0Var.f7063f : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i12 = ((p1.n0) obj2).f7064g;
            int W2 = e6.m.W(arrayList);
            if (1 <= W2) {
                int i13 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i13);
                    int i14 = ((p1.n0) obj4).f7064g;
                    if (i12 < i14) {
                        obj2 = obj4;
                        i12 = i14;
                    }
                    if (i13 == W2) {
                        break;
                    }
                    i13++;
                }
            }
        }
        p1.n0 n0Var2 = (p1.n0) obj2;
        int i15 = n0Var2 != null ? n0Var2.f7064g : 0;
        boolean v5 = h0Var.v();
        r rVar = this.f5244a;
        if (v5) {
            this.f5245b = true;
            rVar.f5261a.setValue(new m2.j(j1.c.G(i11, i15)));
        } else if (!this.f5245b) {
            rVar.f5261a.setValue(new m2.j(j1.c.G(i11, i15)));
        }
        return h0Var.C(i11, i15, e6.v.f2827f, new a0.p0(1, arrayList));
    }

    @Override // p1.f0
    public final int b(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).e0(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).e0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // p1.f0
    public final int c(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).a0(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).a0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // p1.f0
    public final int e(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).d0(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).d0(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // p1.f0
    public final int g(p1.m mVar, List list, int i7) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((p1.e0) list.get(0)).c(i7));
            int W = e6.m.W(list);
            int i8 = 1;
            if (1 <= W) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((p1.e0) list.get(i8)).c(i7));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i8 == W) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
