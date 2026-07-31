package P0;

import M1.v;
import java.util.ArrayList;
import java.util.List;
import r0.B;
import r0.H;
import r0.InterfaceC0827A;
import r0.z;
import t0.O;

/* loaded from: classes.dex */
public final class i implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3043a = new i();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // r0.InterfaceC0827A
    public final B f(O o3, List list, long j3) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((z) list.get(i3)).b(j3));
        }
        int i4 = 1;
        H h3 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i5 = ((H) obj).f7114d;
            int b02 = M1.m.b0(arrayList);
            if (1 <= b02) {
                int i6 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i6);
                    int i7 = ((H) obj2).f7114d;
                    if (i5 < i7) {
                        obj = obj2;
                        i5 = i7;
                    }
                    if (i6 == b02) {
                        break;
                    }
                    i6++;
                }
            }
        }
        H h4 = (H) obj;
        int j4 = h4 != null ? h4.f7114d : M0.a.j(j3);
        if (!arrayList.isEmpty()) {
            ?? r22 = arrayList.get(0);
            int i8 = ((H) r22).f7115e;
            int b03 = M1.m.b0(arrayList);
            boolean z3 = r22;
            if (1 <= b03) {
                while (true) {
                    Object obj3 = arrayList.get(i4);
                    int i9 = ((H) obj3).f7115e;
                    r22 = z3;
                    if (i8 < i9) {
                        r22 = obj3;
                        i8 = i9;
                    }
                    if (i4 == b03) {
                        break;
                    }
                    i4++;
                    z3 = r22;
                }
            }
            h3 = r22;
        }
        H h5 = h3;
        return o3.Y(j4, h5 != null ? h5.f7115e : M0.a.i(j3), v.f2804d, new h(0, arrayList));
    }
}
