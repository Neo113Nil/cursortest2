package b2;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.n0;
import java.util.Comparator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1303a;

    public /* synthetic */ s(int i7) {
        this.f1303a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1303a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                d6.j jVar = (d6.j) obj;
                d6.j jVar2 = (d6.j) obj2;
                return (((Number) jVar.f2619g).intValue() - ((Number) jVar.f2618f).intValue()) - (((Number) jVar2.f2619g).intValue() - ((Number) jVar2.f2618f).intValue());
            case 1:
                return r6.k.g(((n0) obj).f3803b, ((n0) obj2).f3803b);
            case 2:
                r1.d0 d0Var = (r1.d0) obj;
                r1.d0 d0Var2 = (r1.d0) obj2;
                float f9 = d0Var.B.f7848r.D;
                float f10 = d0Var2.B.f7848r.D;
                return f9 == f10 ? r6.k.g(d0Var.t(), d0Var2.t()) : Float.compare(f9, f10);
            case 3:
                y1.m mVar = (y1.m) obj2;
                Object valueOf = Float.valueOf(0.0f);
                y1.i iVar = ((y1.m) obj).f9840d;
                y1.s sVar = y1.p.f9872n;
                Object obj3 = iVar.f9832f.get(sVar);
                if (obj3 == null) {
                    obj3 = valueOf;
                }
                float floatValue = ((Number) obj3).floatValue();
                Object obj4 = mVar.f9840d.f9832f.get(sVar);
                if (obj4 != null) {
                    valueOf = obj4;
                }
                return Float.compare(floatValue, ((Number) valueOf).floatValue());
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b9 = bArr[i7];
                    byte b10 = bArr2[i7];
                    if (b9 != b10) {
                        return b9 - b10;
                    }
                }
                return 0;
        }
    }
}
