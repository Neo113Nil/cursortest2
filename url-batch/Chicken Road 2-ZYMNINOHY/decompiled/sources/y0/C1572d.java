package y0;

import W.AbstractC0110c;
import java.util.ArrayList;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1572d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f16130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16131b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16132c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16134e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16135f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16136g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16137h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16138i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16139j;

    /* renamed from: k, reason: collision with root package name */
    public final float f16140k;

    /* renamed from: l, reason: collision with root package name */
    public final String f16141l;

    public C1572d(ArrayList arrayList, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f4, String str) {
        this.f16130a = arrayList;
        this.f16131b = i4;
        this.f16132c = i5;
        this.f16133d = i6;
        this.f16134e = i7;
        this.f16135f = i8;
        this.f16136g = i9;
        this.f16137h = i10;
        this.f16138i = i11;
        this.f16139j = i12;
        this.f16140k = f4;
        this.f16141l = str;
    }

    public static C1572d a(W.u uVar) {
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        int i10;
        int i11;
        try {
            uVar.N(4);
            int z = (uVar.z() & 3) + 1;
            if (z == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int z4 = uVar.z() & 31;
            for (int i12 = 0; i12 < z4; i12++) {
                int G4 = uVar.G();
                int i13 = uVar.f3352b;
                uVar.N(G4);
                byte[] bArr = uVar.f3351a;
                byte[] bArr2 = new byte[G4 + 4];
                System.arraycopy(AbstractC0110c.f3295a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i13, bArr2, 4, G4);
                arrayList.add(bArr2);
            }
            int z5 = uVar.z();
            for (int i14 = 0; i14 < z5; i14++) {
                int G5 = uVar.G();
                int i15 = uVar.f3352b;
                uVar.N(G5);
                byte[] bArr3 = uVar.f3351a;
                byte[] bArr4 = new byte[G5 + 4];
                System.arraycopy(AbstractC0110c.f3295a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i15, bArr4, 4, G5);
                arrayList.add(bArr4);
            }
            if (z4 > 0) {
                X.o k4 = X.p.k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i16 = k4.f3539e;
                int i17 = k4.f3540f;
                int i18 = k4.f3542h + 8;
                int i19 = k4.f3543i + 8;
                int i20 = k4.f3548p;
                int i21 = k4.f3549q;
                int i22 = k4.f3550r;
                int i23 = k4.f3551s;
                float f5 = k4.f3541g;
                str = AbstractC0110c.a(k4.f3535a, k4.f3536b, k4.f3537c);
                i7 = i21;
                i8 = i22;
                i9 = i23;
                f4 = f5;
                i5 = i17;
                i6 = i18;
                i10 = i19;
                i11 = i20;
                i4 = i16;
            } else {
                str = null;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = 16;
                f4 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new C1572d(arrayList, z, i4, i5, i6, i10, i11, i7, i8, i9, f4, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw T.G.a(e4, "Error parsing AVC config");
        }
    }
}
