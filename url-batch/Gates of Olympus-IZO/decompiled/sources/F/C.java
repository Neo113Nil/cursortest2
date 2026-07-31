package F;

import java.util.List;
import java.util.NoSuchElementException;
import r0.InterfaceC0827A;

/* loaded from: classes.dex */
public final class C implements InterfaceC0827A {

    /* renamed from: a, reason: collision with root package name */
    public static final C f875a = new C();

    @Override // r0.InterfaceC0827A
    public final r0.B f(t0.O o3, List list, long j3) {
        Object obj;
        Object obj2;
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (Z1.i.a(androidx.compose.ui.layout.a.a((r0.z) obj), "leadingIcon")) {
                break;
            }
            i3++;
        }
        r0.z zVar = (r0.z) obj;
        r0.H b2 = zVar != null ? zVar.b(M0.a.a(j3, 0, 0, 0, 0, 10)) : null;
        int i4 = G.h.f1523a;
        int i5 = b2 != null ? b2.f7114d : 0;
        int i6 = b2 != null ? b2.f7115e : 0;
        int size2 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i7);
            if (Z1.i.a(androidx.compose.ui.layout.a.a((r0.z) obj2), "trailingIcon")) {
                break;
            }
            i7++;
        }
        r0.z zVar2 = (r0.z) obj2;
        r0.H b3 = zVar2 != null ? zVar2.b(M0.a.a(j3, 0, 0, 0, 0, 10)) : null;
        int i8 = b3 != null ? b3.f7114d : 0;
        int i9 = b3 != null ? b3.f7115e : 0;
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            r0.z zVar3 = (r0.z) list.get(i10);
            if (Z1.i.a(androidx.compose.ui.layout.a.a(zVar3), "label")) {
                r0.H b4 = zVar3.b(I2.l.J(-(i5 + i8), 0, j3));
                int i11 = b4.f7114d + i5 + i8;
                int max = Math.max(i6, Math.max(b4.f7115e, i9));
                return o3.Y(i11, max, M1.v.f2804d, new B(b2, i6, max, b4, i5, b3, i9));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
