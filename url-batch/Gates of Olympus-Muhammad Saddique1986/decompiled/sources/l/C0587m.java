package l;

import B.Q;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587m implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final t f6505a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6506b;

    public C0587m(t tVar) {
        this.f6505a = tVar;
    }

    @Override // r0.InterfaceC0885G
    public final int a(InterfaceC0916m interfaceC0916m, List list, int i3) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0884F) list.get(0)).c(i3));
            int z02 = S1.m.z0(list);
            int i4 = 1;
            if (1 <= z02) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0884F) list.get(i4)).c(i3));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == z02) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // r0.InterfaceC0885G
    public final int b(InterfaceC0916m interfaceC0916m, List list, int i3) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0884F) list.get(0)).V(i3));
            int z02 = S1.m.z0(list);
            int i4 = 1;
            if (1 <= z02) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0884F) list.get(i4)).V(i3));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == z02) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // r0.InterfaceC0885G
    public final int e(InterfaceC0916m interfaceC0916m, List list, int i3) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0884F) list.get(0)).O(i3));
            int z02 = S1.m.z0(list);
            int i4 = 1;
            if (1 <= z02) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0884F) list.get(i4)).O(i3));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == z02) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((InterfaceC0884F) list.get(i3)).b(j3));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((AbstractC0893O) obj).f8126d;
            int z02 = S1.m.z0(arrayList);
            if (1 <= z02) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((AbstractC0893O) obj3).f8126d;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == z02) {
                        break;
                    }
                    i5++;
                }
            }
        }
        AbstractC0893O abstractC0893O = (AbstractC0893O) obj;
        int i7 = abstractC0893O != null ? abstractC0893O.f8126d : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i8 = ((AbstractC0893O) obj2).f8127e;
            int z03 = S1.m.z0(arrayList);
            if (1 <= z03) {
                int i9 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i9);
                    int i10 = ((AbstractC0893O) obj4).f8127e;
                    if (i8 < i10) {
                        obj2 = obj4;
                        i8 = i10;
                    }
                    if (i9 == z03) {
                        break;
                    }
                    i9++;
                }
            }
        }
        AbstractC0893O abstractC0893O2 = (AbstractC0893O) obj2;
        int i11 = abstractC0893O2 != null ? abstractC0893O2.f8127e : 0;
        boolean D = interfaceC0887I.D();
        t tVar = this.f6505a;
        if (D) {
            this.f6506b = true;
            tVar.f6537a.setValue(new O0.j(O2.d.d(i7, i11)));
        } else if (!this.f6506b) {
            tVar.f6537a.setValue(new O0.j(O2.d.d(i7, i11)));
        }
        return interfaceC0887I.i0(i7, i11, S1.v.f4321d, new Q(3, arrayList));
    }

    @Override // r0.InterfaceC0885G
    public final int h(InterfaceC0916m interfaceC0916m, List list, int i3) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0884F) list.get(0)).U(i3));
            int z02 = S1.m.z0(list);
            int i4 = 1;
            if (1 <= z02) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0884F) list.get(i4)).U(i3));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == z02) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
