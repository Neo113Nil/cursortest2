package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w5 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(ArrayList arrayList, qj1 qj1Var, int i, ArrayList arrayList2) {
        super(1);
        this.m = 0;
        this.p = arrayList;
        this.n = qj1Var;
        this.o = i;
        this.q = arrayList2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        int i2 = this.o;
        Object obj2 = this.p;
        Object obj3 = this.n;
        Object obj4 = this.q;
        switch (i) {
            case 0:
                m12 m12Var = (m12) obj;
                ArrayList arrayList = (ArrayList) obj2;
                qj1 qj1Var = (qj1) obj3;
                ArrayList arrayList2 = (ArrayList) obj4;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    List list = (List) arrayList.get(i3);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (i4 < size2) {
                        iArr[i4] = ((n12) list.get(i4)).m + (i4 < list.size() - 1 ? qj1Var.R(8.0f) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size2];
                    for (int i5 = 0; i5 < size2; i5++) {
                        iArr2[i5] = 0;
                    }
                    if (qj1Var.getLayoutDirection() == u81.m) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < size2; i7++) {
                            i6 += iArr[i7];
                        }
                        int i8 = i2 - i6;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size2) {
                            int i11 = iArr[i9];
                            iArr2[i10] = i8;
                            i8 += i11;
                            i9++;
                            i10++;
                        }
                    } else {
                        int i12 = 0;
                        for (int i13 = size2 - 1; -1 < i13; i13--) {
                            int i14 = iArr[i13];
                            iArr2[i13] = i12;
                            i12 += i14;
                        }
                    }
                    int size3 = list.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        m12.g(m12Var, (n12) list.get(i15), iArr2[i15], ((Number) arrayList2.get(i3)).intValue());
                    }
                }
                break;
            case 1:
                m12 m12Var2 = (m12) obj;
                n12 n12Var = (n12) obj4;
                qj1 qj1Var2 = (qj1) obj3;
                by0 by0Var = (by0) obj2;
                int i16 = by0Var.b;
                dv2 dv2Var = by0Var.a;
                xy2 xy2Var = by0Var.c;
                cw2 cw2Var = (cw2) by0Var.d.invoke();
                dv2Var.a(ww1.n, gk2.b(qj1Var2, i16, xy2Var, cw2Var != null ? cw2Var.a : null, qj1Var2.getLayoutDirection() == u81.n, n12Var.m), i2, n12Var.m);
                m12.i(m12Var2, n12Var, Math.round(-dv2Var.a.h()), 0);
                break;
            case 2:
                m12 m12Var3 = (m12) obj;
                n12[] n12VarArr = (n12[]) obj2;
                fc2 fc2Var = (fc2) obj4;
                int[] iArr3 = (int[]) obj3;
                int length = n12VarArr.length;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length) {
                    n12 n12Var2 = n12VarArr[i17];
                    int i19 = i18 + 1;
                    n12Var2.getClass();
                    Object i20 = n12Var2.i();
                    dc2 dc2Var = i20 instanceof dc2 ? (dc2) i20 : null;
                    j50 j50Var = dc2Var != null ? dc2Var.c : null;
                    m12.g(m12Var3, n12Var2, iArr3[i18], j50Var != null ? j50Var.o(i2 - n12Var2.n, u81.m) : fc2Var.b.a(0, i2 - n12Var2.n));
                    i17++;
                    i18 = i19;
                }
                break;
            default:
                m12 m12Var4 = (m12) obj;
                n12 n12Var3 = (n12) obj4;
                qj1 qj1Var3 = (qj1) obj3;
                r43 r43Var = (r43) obj2;
                int i21 = r43Var.b;
                dv2 dv2Var2 = r43Var.a;
                xy2 xy2Var2 = r43Var.c;
                cw2 cw2Var2 = (cw2) r43Var.d.invoke();
                dv2Var2.a(ww1.m, gk2.b(qj1Var3, i21, xy2Var2, cw2Var2 != null ? cw2Var2.a : null, false, n12Var3.m), i2, n12Var3.n);
                m12.i(m12Var4, n12Var3, 0, Math.round(-dv2Var2.a.h()));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5(qj1 qj1Var, y81 y81Var, n12 n12Var, int i, int i2) {
        super(1);
        this.m = i2;
        this.n = qj1Var;
        this.p = y81Var;
        this.q = n12Var;
        this.o = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(n12[] n12VarArr, fc2 fc2Var, int i, int[] iArr) {
        super(1);
        this.m = 2;
        this.p = n12VarArr;
        this.q = fc2Var;
        this.o = i;
        this.n = iArr;
    }
}
