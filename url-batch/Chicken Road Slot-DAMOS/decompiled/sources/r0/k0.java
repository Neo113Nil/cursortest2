package r0;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k0 extends a.a {

    /* renamed from: b, reason: collision with root package name */
    public int f8114b;

    /* renamed from: d, reason: collision with root package name */
    public int f8116d;

    /* renamed from: f, reason: collision with root package name */
    public int f8118f;

    /* renamed from: a, reason: collision with root package name */
    public i0[] f8113a = new i0[16];

    /* renamed from: c, reason: collision with root package name */
    public int[] f8115c = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public Object[] f8117e = new Object[16];

    public final void i0() {
        this.f8114b = 0;
        this.f8116d = 0;
        Arrays.fill(this.f8117e, 0, this.f8118f, (Object) null);
        this.f8118f = 0;
    }

    public final void j0(n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        if (this.f8114b != 0) {
            androidx.datastore.preferences.protobuf.j jVar = new androidx.datastore.preferences.protobuf.j(this);
            k0 k0Var = (k0) jVar.f567d;
            while (true) {
                i0 i0Var = k0Var.f8113a[jVar.f564a];
                q0.b b10 = i0Var.b(jVar);
                n0.a aVar2 = aVar;
                q0.k kVar2 = kVar;
                c6.q qVar2 = qVar;
                j0 j0Var2 = j0Var;
                try {
                    i0Var.a(jVar, aVar2, kVar2, qVar2, j0Var2);
                    int i3 = jVar.f564a;
                    int i10 = k0Var.f8114b;
                    if (i3 < i10) {
                        i0 i0Var2 = k0Var.f8113a[i3];
                        jVar.f565b += i0Var2.f8109a;
                        jVar.f566c += i0Var2.f8110b;
                        int i11 = i3 + 1;
                        jVar.f564a = i11;
                        if (i11 >= i10) {
                            break;
                        }
                        aVar = aVar2;
                        kVar = kVar2;
                        qVar = qVar2;
                        j0Var = j0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        i0();
    }

    public final boolean k0() {
        return this.f8114b == 0;
    }

    public final void l0(i0 i0Var) {
        int i3 = this.f8114b;
        i0[] i0VarArr = this.f8113a;
        if (i3 == i0VarArr.length) {
            i0[] i0VarArr2 = new i0[(i3 > 1024 ? 1024 : i3) + i3];
            System.arraycopy(i0VarArr, 0, i0VarArr2, 0, i3);
            this.f8113a = i0VarArr2;
        }
        int i10 = this.f8116d;
        int i11 = i0Var.f8109a;
        int i12 = i0Var.f8110b;
        int i13 = i10 + i11;
        int[] iArr = this.f8115c;
        int length = iArr.length;
        if (i13 > length) {
            int i14 = (length > 1024 ? 1024 : length) + length;
            if (i14 >= i13) {
                i13 = i14;
            }
            int[] iArr2 = new int[i13];
            kotlin.collections.v.c(0, 0, length, iArr, iArr2);
            this.f8115c = iArr2;
        }
        int i15 = this.f8118f + i12;
        Object[] objArr = this.f8117e;
        int length2 = objArr.length;
        if (i15 > length2) {
            int i16 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i16 >= i15) {
                i15 = i16;
            }
            Object[] objArr2 = new Object[i15];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f8117e = objArr2;
        }
        i0[] i0VarArr3 = this.f8113a;
        int i17 = this.f8114b;
        this.f8114b = i17 + 1;
        i0VarArr3[i17] = i0Var;
        this.f8116d += i0Var.f8109a;
        this.f8118f += i12;
    }
}
