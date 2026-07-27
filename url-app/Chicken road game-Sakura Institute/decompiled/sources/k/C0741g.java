package k;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0977m;
import z2.C1412P;
import z2.C1441y;

/* renamed from: k.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741g implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final C0746l f7292a;

    public C0741g(C0746l c0746l) {
        this.f7292a = c0746l;
    }

    @Override // p0.InterfaceC0945F
    public final int a(InterfaceC0977m interfaceC0977m, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0944E) list.get(0)).S(i2));
            int d4 = C1441y.d(list);
            int i4 = 1;
            if (1 <= d4) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0944E) list.get(i4)).S(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == d4) {
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

    @Override // p0.InterfaceC0945F
    public final int e(InterfaceC0977m interfaceC0977m, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0944E) list.get(0)).Z(i2));
            int d4 = C1441y.d(list);
            int i4 = 1;
            if (1 <= d4) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0944E) list.get(i4)).Z(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == d4) {
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

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        AbstractC0954O abstractC0954O;
        AbstractC0954O abstractC0954O2;
        int i2;
        InterfaceC0946G t4;
        int size = list.size();
        AbstractC0954O[] abstractC0954OArr = new AbstractC0954O[size];
        int size2 = list.size();
        long j5 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            abstractC0954O = null;
            if (i5 >= size2) {
                break;
            }
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i5);
            Object r2 = interfaceC0944E.r();
            C0743i c0743i = r2 instanceof C0743i ? (C0743i) r2 : null;
            if (c0743i != null && ((Boolean) c0743i.f7293a.getValue()).booleanValue()) {
                AbstractC0954O a4 = interfaceC0944E.a(j4);
                long c4 = u3.d.c(a4.f9005d, a4.f9006e);
                Unit unit = Unit.f7487a;
                abstractC0954OArr[i5] = a4;
                j5 = c4;
            }
            i5++;
        }
        int size3 = list.size();
        for (int i6 = 0; i6 < size3; i6++) {
            InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list.get(i6);
            if (abstractC0954OArr[i6] == null) {
                abstractC0954OArr[i6] = interfaceC0944E2.a(j4);
            }
        }
        if (interfaceC0947H.A()) {
            i2 = (int) (j5 >> 32);
        } else {
            if (size == 0) {
                abstractC0954O2 = null;
            } else {
                abstractC0954O2 = abstractC0954OArr[0];
                Intrinsics.checkNotNullParameter(abstractC0954OArr, "<this>");
                int i7 = size - 1;
                if (i7 != 0) {
                    int i8 = abstractC0954O2 != null ? abstractC0954O2.f9005d : 0;
                    R2.b it = new IntRange(1, i7, 1).iterator();
                    while (it.f3947i) {
                        AbstractC0954O abstractC0954O3 = abstractC0954OArr[it.b()];
                        int i9 = abstractC0954O3 != null ? abstractC0954O3.f9005d : 0;
                        if (i8 < i9) {
                            abstractC0954O2 = abstractC0954O3;
                            i8 = i9;
                        }
                    }
                }
            }
            i2 = abstractC0954O2 != null ? abstractC0954O2.f9005d : 0;
        }
        if (interfaceC0947H.A()) {
            i4 = (int) (4294967295L & j5);
        } else {
            if (size != 0) {
                abstractC0954O = abstractC0954OArr[0];
                Intrinsics.checkNotNullParameter(abstractC0954OArr, "<this>");
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = abstractC0954O != null ? abstractC0954O.f9006e : 0;
                    R2.b it2 = new IntRange(1, i10, 1).iterator();
                    while (it2.f3947i) {
                        AbstractC0954O abstractC0954O4 = abstractC0954OArr[it2.b()];
                        int i12 = abstractC0954O4 != null ? abstractC0954O4.f9006e : 0;
                        if (i11 < i12) {
                            abstractC0954O = abstractC0954O4;
                            i11 = i12;
                        }
                    }
                }
            }
            if (abstractC0954O != null) {
                i4 = abstractC0954O.f9006e;
            }
        }
        if (!interfaceC0947H.A()) {
            this.f7292a.f7302c.setValue(new M0.j(u3.d.c(i2, i4)));
        }
        t4 = interfaceC0947H.t(i2, i4, C1412P.c(), new C0740f(abstractC0954OArr, this, i2, i4));
        return t4;
    }

    @Override // p0.InterfaceC0945F
    public final int g(InterfaceC0977m interfaceC0977m, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0944E) list.get(0)).b(i2));
            int d4 = C1441y.d(list);
            int i4 = 1;
            if (1 <= d4) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0944E) list.get(i4)).b(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == d4) {
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

    @Override // p0.InterfaceC0945F
    public final int h(InterfaceC0977m interfaceC0977m, List list, int i2) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC0944E) list.get(0)).X(i2));
            int d4 = C1441y.d(list);
            int i4 = 1;
            if (1 <= d4) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC0944E) list.get(i4)).X(i2));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i4 == d4) {
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
