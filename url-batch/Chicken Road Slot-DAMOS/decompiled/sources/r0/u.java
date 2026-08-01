package r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f8131c = new u(1, 0, 2);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        int[] iArr;
        q0.b bVar;
        int c10;
        int b10 = jVar.b(0);
        if (kVar.f7771n != 0) {
            n0.m.a("Cannot move a group while inserting");
        }
        if (b10 < 0) {
            n0.m.a("Parameter offset is out of bounds");
        }
        if (b10 == 0) {
            return;
        }
        int i3 = kVar.f7777t;
        int i10 = kVar.f7779v;
        int i11 = kVar.f7778u;
        int i12 = i3;
        while (true) {
            iArr = kVar.f7761b;
            if (b10 <= 0) {
                break;
            }
            i12 += iArr[(kVar.r(i12) * 5) + 3];
            if (i12 > i11) {
                n0.m.a("Parameter offset is out of bounds");
            }
            b10--;
        }
        int i13 = iArr[(kVar.r(i12) * 5) + 3];
        int g = kVar.g(kVar.f7761b, kVar.r(kVar.f7777t));
        int g2 = kVar.g(kVar.f7761b, kVar.r(i12));
        int i14 = i12 + i13;
        int g10 = kVar.g(kVar.f7761b, kVar.r(i14));
        int i15 = g10 - g2;
        kVar.x(i15, Math.max(kVar.f7777t - 1, 0));
        kVar.w(i13);
        int[] iArr2 = kVar.f7761b;
        int r9 = kVar.r(i14) * 5;
        kotlin.collections.v.c(kVar.r(i3) * 5, r9, (i13 * 5) + r9, iArr2, iArr2);
        if (i15 > 0) {
            Object[] objArr = kVar.f7762c;
            int h10 = kVar.h(g2 + i15);
            System.arraycopy(objArr, h10, objArr, g, kVar.h(g10 + i15) - h10);
        }
        int i16 = g2 + i15;
        int i17 = i16 - g;
        int i18 = kVar.f7768k;
        int i19 = kVar.f7769l;
        int length = kVar.f7762c.length;
        int i20 = kVar.f7770m;
        int i21 = i3 + i13;
        int i22 = i3;
        while (i22 < i21) {
            int r10 = kVar.r(i22);
            int i23 = i17;
            int[] iArr3 = iArr2;
            iArr3[(r10 * 5) + 4] = q0.k.i(q0.k.i(kVar.g(iArr2, r10) - i23, i20 < r10 ? 0 : i18, i19, length), kVar.f7768k, kVar.f7769l, kVar.f7762c.length);
            i22++;
            i17 = i23;
            iArr2 = iArr3;
            i18 = i18;
        }
        int i24 = i14 + i13;
        int p4 = kVar.p();
        int a9 = q0.j.a(kVar.f7763d, i14, p4);
        ArrayList arrayList = new ArrayList();
        if (a9 >= 0) {
            while (a9 < kVar.f7763d.size() && (c10 = kVar.c((bVar = (q0.b) kVar.f7763d.get(a9)))) >= i14 && c10 < i24) {
                arrayList.add(bVar);
            }
        }
        int i25 = i3 - i14;
        int size = arrayList.size();
        for (int i26 = 0; i26 < size; i26++) {
            q0.b bVar2 = (q0.b) arrayList.get(i26);
            int c11 = kVar.c(bVar2) + i25;
            if (c11 >= kVar.g) {
                bVar2.f7722a = -(p4 - c11);
            } else {
                bVar2.f7722a = c11;
            }
            kVar.f7763d.add(q0.j.a(kVar.f7763d, c11, p4), bVar2);
        }
        if (kVar.I(i14, i13)) {
            n0.m.a("Unexpectedly removed anchors");
        }
        kVar.m(i10, kVar.f7778u, i3);
        if (i15 > 0) {
            kVar.J(i16, i15, i14 - 1);
        }
    }
}
