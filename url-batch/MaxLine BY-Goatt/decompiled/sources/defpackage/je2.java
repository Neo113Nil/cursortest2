package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class je2 extends o81 implements Function1 {
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ ArrayList p;
    public final /* synthetic */ ak0 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ z63 t;
    public final /* synthetic */ hq2 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Integer x;
    public final /* synthetic */ ArrayList y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ak0 ak0Var, int i, int i2, z63 z63Var, hq2 hq2Var, int i3, int i4, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.m = arrayList;
        this.n = arrayList2;
        this.o = arrayList3;
        this.p = arrayList4;
        this.q = ak0Var;
        this.r = i;
        this.s = i2;
        this.t = z63Var;
        this.u = hq2Var;
        this.v = i3;
        this.w = i4;
        this.x = num;
        this.y = arrayList5;
        this.z = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        m12 m12Var = (m12) obj;
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m12.g(m12Var, (n12) arrayList.get(i2), 0, 0);
        }
        ArrayList arrayList2 = this.n;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            m12.g(m12Var, (n12) arrayList2.get(i3), 0, 0);
        }
        ArrayList arrayList3 = this.o;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (true) {
            i = this.v;
            if (i4 >= size3) {
                break;
            }
            n12 n12Var = (n12) arrayList3.get(i4);
            int i5 = (this.r - this.s) / 2;
            hq2 hq2Var = this.u;
            m12.g(m12Var, n12Var, this.t.d(hq2Var, hq2Var.getLayoutDirection()) + i5, i - this.w);
            i4++;
        }
        ArrayList arrayList4 = this.p;
        int size4 = arrayList4.size();
        for (int i6 = 0; i6 < size4; i6++) {
            n12 n12Var2 = (n12) arrayList4.get(i6);
            Integer num = this.x;
            m12.g(m12Var, n12Var2, 0, i - (num != null ? num.intValue() : 0));
        }
        ak0 ak0Var = this.q;
        if (ak0Var != null) {
            ArrayList arrayList5 = this.y;
            int size5 = arrayList5.size();
            for (int i7 = 0; i7 < size5; i7++) {
                n12 n12Var3 = (n12) arrayList5.get(i7);
                int i8 = ak0Var.m;
                Integer num2 = this.z;
                num2.getClass();
                m12.g(m12Var, n12Var3, i8, i - num2.intValue());
            }
        }
        return Unit.a;
    }
}
