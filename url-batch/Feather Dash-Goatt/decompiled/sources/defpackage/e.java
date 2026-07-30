package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e extends c40 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.m = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i2 = 0;
        switch (this.m) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eh ehVar = (eh) this.e;
                in0 in0Var = ehVar.D;
                if (booleanValue) {
                    ehVar.G0();
                } else {
                    if (ehVar.u != null) {
                        Object[] objArr3 = in0Var.c;
                        long[] jArr = in0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8;
                                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            i = i4;
                                            uq1.N(ehVar.n0(), null, new j(ehVar, (zy0) objArr3[(i3 << 3) + i6], objArr2 == true ? 1 : 0, i2), 3);
                                        } else {
                                            i = i4;
                                        }
                                        j >>= i;
                                        i6++;
                                        i4 = i;
                                    }
                                    if (i5 != i4) {
                                    }
                                }
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        }
                        zy0 zy0Var = ehVar.F;
                        if (zy0Var != null) {
                            uq1.N(ehVar.n0(), null, new j(ehVar, zy0Var, objArr == true ? 1 : 0, 1), 3);
                        }
                    }
                    in0Var.a();
                    ehVar.F = null;
                }
                break;
            case 1:
                ((mb0) this.e).s((Throwable) obj);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                z8 z8Var = (z8) this.e;
                z8Var.getClass();
                ArrayList e = z8.e(z8Var.g);
                int size = e.size();
                while (true) {
                    if (i2 < size) {
                        Object obj3 = e.get(i2);
                        i2++;
                        if (((b2) obj3).a.a.equals(str)) {
                            obj2 = obj3;
                        }
                    }
                }
                b2 b2Var = (b2) obj2;
                if (b2Var != null) {
                    d2 d2Var = b2Var.a;
                    if (b2Var.c && !b2Var.d) {
                        iw0 iw0Var = z8Var.g;
                        int i7 = iw0Var.b + d2Var.f;
                        Set set = iw0Var.g;
                        set.getClass();
                        LinkedHashSet linkedHashSet = new LinkedHashSet(hk0.a(set.size() + 1));
                        linkedHashSet.addAll(set);
                        linkedHashSet.add(str);
                        z8Var.r(iw0.a(iw0Var, null, i7, 0, null, null, z8.m(z8Var.g.f, d2Var.f), linkedHashSet, 29));
                        z8Var.j(gc1.k, 28L);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
