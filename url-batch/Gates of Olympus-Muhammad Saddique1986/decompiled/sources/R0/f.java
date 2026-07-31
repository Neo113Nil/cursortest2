package R0;

import B.Q;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0885G;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;

/* loaded from: classes.dex */
public final class f implements InterfaceC0885G {

    /* renamed from: b, reason: collision with root package name */
    public static final f f4080b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f4081c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4082a;

    public /* synthetic */ f(int i3) {
        this.f4082a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // r0.InterfaceC0885G
    public final InterfaceC0886H f(InterfaceC0887I interfaceC0887I, List list, long j3) {
        Object obj;
        int i3;
        switch (this.f4082a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(((InterfaceC0884F) list.get(i4)).b(j3));
                }
                int i5 = 1;
                AbstractC0893O abstractC0893O = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i6 = ((AbstractC0893O) obj).f8126d;
                    int z02 = S1.m.z0(arrayList);
                    if (1 <= z02) {
                        int i7 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i7);
                            int i8 = ((AbstractC0893O) obj2).f8126d;
                            if (i6 < i8) {
                                obj = obj2;
                                i6 = i8;
                            }
                            if (i7 != z02) {
                                i7++;
                            }
                        }
                    }
                }
                AbstractC0893O abstractC0893O2 = (AbstractC0893O) obj;
                int j4 = abstractC0893O2 != null ? abstractC0893O2.f8126d : O0.a.j(j3);
                if (!arrayList.isEmpty()) {
                    ?? r22 = arrayList.get(0);
                    int i9 = ((AbstractC0893O) r22).f8127e;
                    int z03 = S1.m.z0(arrayList);
                    boolean z3 = r22;
                    if (1 <= z03) {
                        while (true) {
                            Object obj3 = arrayList.get(i5);
                            int i10 = ((AbstractC0893O) obj3).f8127e;
                            r22 = z3;
                            if (i9 < i10) {
                                r22 = obj3;
                                i9 = i10;
                            }
                            if (i5 != z03) {
                                i5++;
                                z3 = r22;
                            }
                        }
                    }
                    abstractC0893O = r22;
                }
                AbstractC0893O abstractC0893O3 = abstractC0893O;
                return interfaceC0887I.i0(j4, abstractC0893O3 != null ? abstractC0893O3.f8127e : O0.a.i(j3), S1.v.f4321d, new Q(1, arrayList));
            default:
                int size2 = list.size();
                S1.v vVar = S1.v.f4321d;
                int i11 = 0;
                if (size2 == 0) {
                    return interfaceC0887I.i0(0, 0, vVar, C0215d.f4073j);
                }
                if (size2 == 1) {
                    AbstractC0893O b3 = ((InterfaceC0884F) list.get(0)).b(j3);
                    return interfaceC0887I.i0(b3.f8126d, b3.f8127e, vVar, new A.i(b3, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    arrayList2.add(((InterfaceC0884F) list.get(i12)).b(j3));
                }
                int z04 = S1.m.z0(arrayList2);
                if (z04 >= 0) {
                    int i13 = 0;
                    i3 = 0;
                    while (true) {
                        AbstractC0893O abstractC0893O4 = (AbstractC0893O) arrayList2.get(i11);
                        i13 = Math.max(i13, abstractC0893O4.f8126d);
                        i3 = Math.max(i3, abstractC0893O4.f8127e);
                        if (i11 != z04) {
                            i11++;
                        } else {
                            i11 = i13;
                        }
                    }
                } else {
                    i3 = 0;
                }
                return interfaceC0887I.i0(i11, i3, vVar, new Q(2, arrayList2));
        }
    }
}
