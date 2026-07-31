package n0;

import java.util.ArrayList;
import m0.h2;
import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f5297c = new u(1, 0, 2);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        m0.a aVar;
        int c8;
        int b8 = kVar.b(0);
        if (i2Var.f4964n != 0) {
            m0.t.c("Cannot move a group while inserting");
        }
        if (b8 < 0) {
            m0.t.c("Parameter offset is out of bounds");
        }
        if (b8 == 0) {
            return;
        }
        int i = i2Var.f4970t;
        int i8 = i2Var.f4972v;
        int i9 = i2Var.f4971u;
        int i10 = i;
        while (b8 > 0) {
            i10 += i2Var.f4953b[(i2Var.r(i10) * 5) + 3];
            if (i10 > i9) {
                m0.t.c("Parameter offset is out of bounds");
            }
            b8--;
        }
        int i11 = i2Var.f4953b[(i2Var.r(i10) * 5) + 3];
        int g3 = i2Var.g(i2Var.f4953b, i2Var.r(i2Var.f4970t));
        int g7 = i2Var.g(i2Var.f4953b, i2Var.r(i10));
        int i12 = i10 + i11;
        int g8 = i2Var.g(i2Var.f4953b, i2Var.r(i12));
        int i13 = g8 - g7;
        i2Var.w(i13, Math.max(i2Var.f4970t - 1, 0));
        i2Var.v(i11);
        int[] iArr = i2Var.f4953b;
        int r7 = i2Var.r(i12) * 5;
        d6.l.F(i2Var.r(i) * 5, r7, (i11 * 5) + r7, iArr, iArr);
        if (i13 > 0) {
            Object[] objArr = i2Var.f4954c;
            int h8 = i2Var.h(g7 + i13);
            System.arraycopy(objArr, h8, objArr, g3, i2Var.h(g8 + i13) - h8);
        }
        int i14 = g7 + i13;
        int i15 = i14 - g3;
        int i16 = i2Var.f4961k;
        int i17 = i2Var.f4962l;
        int length = i2Var.f4954c.length;
        int i18 = i2Var.f4963m;
        int i19 = i + i11;
        int i20 = i;
        while (i20 < i19) {
            int r8 = i2Var.r(i20);
            int i21 = i15;
            int[] iArr2 = iArr;
            iArr2[(r8 * 5) + 4] = i2.i(i2.i(i2Var.g(iArr, r8) - i21, i18 < r8 ? 0 : i16, i17, length), i2Var.f4961k, i2Var.f4962l, i2Var.f4954c.length);
            i20++;
            i15 = i21;
            iArr = iArr2;
            i16 = i16;
        }
        int i22 = i12 + i11;
        int p7 = i2Var.p();
        int b9 = h2.b(i2Var.f4955d, i12, p7);
        ArrayList arrayList = new ArrayList();
        if (b9 >= 0) {
            while (b9 < i2Var.f4955d.size() && (c8 = i2Var.c((aVar = (m0.a) i2Var.f4955d.get(b9)))) >= i12 && c8 < i22) {
                arrayList.add(aVar);
            }
        }
        int i23 = i - i12;
        int size = arrayList.size();
        for (int i24 = 0; i24 < size; i24++) {
            m0.a aVar2 = (m0.a) arrayList.get(i24);
            int c9 = i2Var.c(aVar2) + i23;
            if (c9 >= i2Var.f4958g) {
                aVar2.f4874a = -(p7 - c9);
            } else {
                aVar2.f4874a = c9;
            }
            i2Var.f4955d.add(h2.b(i2Var.f4955d, c9, p7), aVar2);
        }
        if (i2Var.H(i12, i11)) {
            m0.t.c("Unexpectedly removed anchors");
        }
        i2Var.m(i8, i2Var.f4971u, i);
        if (i13 > 0) {
            i2Var.I(i14, i13, i12 - 1);
        }
    }
}
