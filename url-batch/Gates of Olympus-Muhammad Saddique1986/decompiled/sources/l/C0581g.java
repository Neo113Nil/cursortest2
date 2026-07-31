package l;

import java.util.List;
import java.util.NoSuchElementException;
import k2.C0572d;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0916m;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581g implements InterfaceC0885G {

    /* renamed from: a, reason: collision with root package name */
    public final C0586l f6493a;

    public C0581g(C0586l c0586l) {
        this.f6493a = c0586l;
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
        AbstractC0893O abstractC0893O;
        AbstractC0893O abstractC0893O2;
        int i3;
        int i4;
        int i5;
        int size = list.size();
        AbstractC0893O[] abstractC0893OArr = new AbstractC0893O[size];
        int size2 = list.size();
        long j4 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            abstractC0893O = null;
            if (i7 >= size2) {
                break;
            }
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list.get(i7);
            Object t3 = interfaceC0884F.t();
            C0583i c0583i = t3 instanceof C0583i ? (C0583i) t3 : null;
            if (c0583i != null && ((Boolean) c0583i.f6494a.getValue()).booleanValue()) {
                AbstractC0893O b3 = interfaceC0884F.b(j3);
                long d3 = O2.d.d(b3.f8126d, b3.f8127e);
                abstractC0893OArr[i7] = b3;
                j4 = d3;
            }
            i7++;
        }
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list.get(i8);
            if (abstractC0893OArr[i8] == null) {
                abstractC0893OArr[i8] = interfaceC0884F2.b(j3);
            }
        }
        if (interfaceC0887I.D()) {
            i4 = (int) (j4 >> 32);
        } else {
            if (size == 0) {
                abstractC0893O2 = null;
            } else {
                abstractC0893O2 = abstractC0893OArr[0];
                int i9 = size - 1;
                if (i9 != 0) {
                    int i10 = abstractC0893O2 != null ? abstractC0893O2.f8126d : 0;
                    C0572d c0572d = new C0572d(1, i9, 1);
                    int i11 = c0572d.f6421f;
                    int i12 = c0572d.f6420e;
                    boolean z3 = i11 <= 0 ? 1 >= i12 : 1 <= i12;
                    int i13 = z3 ? 1 : i12;
                    while (z3) {
                        if (i13 != i12) {
                            i3 = i13 + i11;
                            z3 = z3;
                        } else {
                            if (!z3) {
                                throw new NoSuchElementException();
                            }
                            z3 = false;
                            i3 = i13;
                        }
                        AbstractC0893O abstractC0893O3 = abstractC0893OArr[i13];
                        int i14 = abstractC0893O3 != null ? abstractC0893O3.f8126d : 0;
                        if (i10 < i14) {
                            abstractC0893O2 = abstractC0893O3;
                            i13 = i3;
                            i10 = i14;
                        } else {
                            i13 = i3;
                        }
                    }
                }
            }
            i4 = abstractC0893O2 != null ? abstractC0893O2.f8126d : 0;
        }
        if (interfaceC0887I.D()) {
            i6 = (int) (4294967295L & j4);
        } else {
            if (size != 0) {
                abstractC0893O = abstractC0893OArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = abstractC0893O != null ? abstractC0893O.f8127e : 0;
                    C0572d c0572d2 = new C0572d(1, i15, 1);
                    int i17 = c0572d2.f6421f;
                    int i18 = c0572d2.f6420e;
                    boolean z4 = i17 <= 0 ? 1 >= i18 : 1 <= i18;
                    int i19 = z4 ? 1 : i18;
                    while (z4) {
                        if (i19 != i18) {
                            i5 = i19 + i17;
                            z4 = z4;
                        } else {
                            if (!z4) {
                                throw new NoSuchElementException();
                            }
                            z4 = false;
                            i5 = i19;
                        }
                        AbstractC0893O abstractC0893O4 = abstractC0893OArr[i19];
                        int i20 = abstractC0893O4 != null ? abstractC0893O4.f8127e : 0;
                        i19 = i5;
                        if (i16 < i20) {
                            abstractC0893O = abstractC0893O4;
                            i16 = i20;
                        }
                    }
                }
            }
            if (abstractC0893O != null) {
                i6 = abstractC0893O.f8127e;
            }
        }
        if (!interfaceC0887I.D()) {
            this.f6493a.f6503c.setValue(new O0.j(O2.d.d(i4, i6)));
        }
        return interfaceC0887I.i0(i4, i6, S1.v.f4321d, new C0580f(abstractC0893OArr, this, i4, i6));
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
