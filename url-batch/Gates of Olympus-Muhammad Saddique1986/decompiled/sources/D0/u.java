package D0;

import I.O;
import java.util.Comparator;
import u0.C1087D;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f865a;

    public /* synthetic */ u(int i3) {
        this.f865a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f865a) {
            case 0:
                R1.i iVar = (R1.i) obj;
                R1.i iVar2 = (R1.i) obj2;
                return (((Number) iVar.f4151e).intValue() - ((Number) iVar.f4150d).intValue()) - (((Number) iVar2.f4151e).intValue() - ((Number) iVar2.f4150d).intValue());
            case 1:
                return f2.j.g(((O) obj).f2730b, ((O) obj2).f2730b);
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b3 = bArr[i3];
                    byte b4 = bArr2[i3];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                t0.E e3 = (t0.E) obj;
                t0.E e4 = (t0.E) obj2;
                float f3 = e3.f8562z.f8642r.f8599B;
                float f4 = e4.f8562z.f8642r.f8599B;
                return f3 == f4 ? f2.j.g(e3.t(), e4.t()) : Float.compare(f3, f4);
            default:
                return ((Number) C1087D.f9133f.h(obj, obj2)).intValue();
        }
    }
}
