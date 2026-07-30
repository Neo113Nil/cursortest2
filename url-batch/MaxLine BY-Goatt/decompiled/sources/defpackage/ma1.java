package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ma1 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ zn1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma1(ArrayList arrayList, zn1 zn1Var, int i) {
        super(1);
        this.m = i;
        this.n = arrayList;
        this.o = zn1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        String str;
        zn1 zn1Var;
        int i2;
        int i3;
        int i4;
        int i5 = this.m;
        zn1 zn1Var2 = this.o;
        String str2 = "position() should be called first";
        int i6 = Integer.MIN_VALUE;
        ArrayList arrayList = this.n;
        switch (i5) {
            case 0:
                m12 m12Var = (m12) obj;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    oa1 oa1Var = (oa1) arrayList.get(i7);
                    oa1Var.getClass();
                    List list = oa1Var.e;
                    if (oa1Var.m == Integer.MIN_VALUE) {
                        lh.e("position() should be called first");
                        break;
                    } else {
                        int size2 = list.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            n12 n12Var = (n12) list.get(i8);
                            int i9 = n12Var.n;
                            long j = oa1Var.o;
                            q40.t(oa1Var.h.a.g(oa1Var.b));
                            m12.m(m12Var, n12Var, s31.c(j, oa1Var.f));
                        }
                    }
                }
                zn1Var2.getValue();
                break;
            default:
                m12 m12Var2 = (m12) obj;
                int size3 = arrayList.size();
                int i10 = 0;
                while (i10 < size3) {
                    rj1 rj1Var = (rj1) arrayList.get(i10);
                    List list2 = rj1Var.b;
                    boolean z = rj1Var.i;
                    if (rj1Var.m == i6) {
                        lh.e(str2);
                        break;
                    } else {
                        int size4 = list2.size();
                        int i11 = 0;
                        while (i11 < size4) {
                            n12 n12Var2 = (n12) list2.get(i11);
                            int[] iArr = rj1Var.k;
                            int i12 = i11 * 2;
                            long h = yk3.h(iArr[i12], iArr[i12 + 1]);
                            if (rj1Var.h) {
                                if (z) {
                                    i = size3;
                                    i3 = (int) (h >> 32);
                                } else {
                                    i = size3;
                                    i3 = (rj1Var.m - ((int) (h >> 32))) - (z ? n12Var2.n : n12Var2.m);
                                }
                                if (z) {
                                    str = str2;
                                    i4 = (rj1Var.m - ((int) (h & 4294967295L))) - (z ? n12Var2.n : n12Var2.m);
                                } else {
                                    str = str2;
                                    i4 = (int) (h & 4294967295L);
                                }
                                h = yk3.h(i3, i4);
                            } else {
                                i = size3;
                                str = str2;
                            }
                            long c = s31.c(h, rj1Var.c);
                            if (z) {
                                m12.m(m12Var2, n12Var2, c);
                                zn1Var = zn1Var2;
                                str2 = str;
                            } else {
                                int i13 = o12.b;
                                gs1 gs1Var = gs1.y;
                                zn1Var = zn1Var2;
                                if (m12Var2.c() == u81.m || m12Var2.e() == 0) {
                                    str2 = str;
                                    m12.a(m12Var2, n12Var2);
                                    i2 = i10;
                                    n12Var2.i0(s31.c(c, n12Var2.q), 0.0f, gs1Var);
                                    i11++;
                                    size3 = i;
                                    i10 = i2;
                                    zn1Var2 = zn1Var;
                                } else {
                                    m12.a(m12Var2, n12Var2);
                                    str2 = str;
                                    n12Var2.i0(s31.c((((m12Var2.e() - n12Var2.m) - ((int) (c >> 32))) << 32) | (((int) (c & 4294967295L)) & 4294967295L), n12Var2.q), 0.0f, gs1Var);
                                }
                            }
                            i2 = i10;
                            i11++;
                            size3 = i;
                            i10 = i2;
                            zn1Var2 = zn1Var;
                        }
                        i10++;
                        i6 = Integer.MIN_VALUE;
                    }
                }
                zn1Var2.getValue();
                break;
        }
        return Unit.a;
    }
}
