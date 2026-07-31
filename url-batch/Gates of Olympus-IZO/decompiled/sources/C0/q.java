package C0;

import I.P;
import h1.C0438i;
import java.util.Comparator;
import u0.C0958E;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f461a;

    public /* synthetic */ q(int i3) {
        this.f461a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f461a) {
            case 0:
                L1.j jVar = (L1.j) obj;
                L1.j jVar2 = (L1.j) obj2;
                return (((Number) jVar.f2709e).intValue() - ((Number) jVar.f2708d).intValue()) - (((Number) jVar2.f2709e).intValue() - ((Number) jVar2.f2708d).intValue());
            case 1:
                return Z1.i.g(((P) obj).f2175b, ((P) obj2).f2175b);
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b2 = bArr[i3];
                    byte b3 = bArr2[i3];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                t0.D d3 = (t0.D) obj;
                t0.D d4 = (t0.D) obj2;
                float f3 = d3.f7736y.f7813r.B;
                float f4 = d4.f7736y.f7813r.B;
                return f3 == f4 ? Z1.i.g(d3.r(), d4.r()) : Float.compare(f3, f4);
            default:
                return ((Number) C0958E.f8120f.g(obj, obj2)).intValue();
        }
    }
}
