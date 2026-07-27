package k;

import A.S;
import java.util.ArrayList;
import java.util.List;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0977m;
import z2.C1412P;
import z2.C1441y;

/* renamed from: k.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747m implements InterfaceC0945F {

    /* renamed from: a, reason: collision with root package name */
    public final r f7304a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7305b;

    public C0747m(r rVar) {
        this.f7304a = rVar;
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
        Object obj;
        InterfaceC0946G t4;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC0944E) list.get(i2)).a(j4));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i4 = ((AbstractC0954O) obj).f9005d;
            int d4 = C1441y.d(arrayList);
            if (1 <= d4) {
                int i5 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i5);
                    int i6 = ((AbstractC0954O) obj3).f9005d;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == d4) {
                        break;
                    }
                    i5++;
                }
            }
        }
        AbstractC0954O abstractC0954O = (AbstractC0954O) obj;
        int i7 = abstractC0954O != null ? abstractC0954O.f9005d : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i8 = ((AbstractC0954O) obj2).f9006e;
            int d5 = C1441y.d(arrayList);
            if (1 <= d5) {
                int i9 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i9);
                    int i10 = ((AbstractC0954O) obj4).f9006e;
                    if (i8 < i10) {
                        obj2 = obj4;
                        i8 = i10;
                    }
                    if (i9 == d5) {
                        break;
                    }
                    i9++;
                }
            }
        }
        AbstractC0954O abstractC0954O2 = (AbstractC0954O) obj2;
        int i11 = abstractC0954O2 != null ? abstractC0954O2.f9006e : 0;
        boolean A4 = interfaceC0947H.A();
        r rVar = this.f7304a;
        if (A4) {
            this.f7305b = true;
            rVar.f7320a.setValue(new M0.j(u3.d.c(i7, i11)));
        } else if (!this.f7305b) {
            rVar.f7320a.setValue(new M0.j(u3.d.c(i7, i11)));
        }
        t4 = interfaceC0947H.t(i7, i11, C1412P.c(), new S(6, arrayList));
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
