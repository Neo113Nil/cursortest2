package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j9 extends o81 implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ ArrayList n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9(int i, ArrayList arrayList) {
        super(1);
        this.m = i;
        this.n = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        ArrayList arrayList = this.n;
        switch (i) {
            case 0:
                m12 m12Var = (m12) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m12.i(m12Var, (n12) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                m12 m12Var2 = (m12) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        m12.i(m12Var2, (n12) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                m12 m12Var3 = (m12) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    m12.g(m12Var3, (n12) arrayList.get(i4), 0, 0);
                }
                break;
            case 3:
                m12 m12Var4 = (m12) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    m12.j(m12Var4, (n12) arrayList.get(i5), 0, 0);
                }
                break;
            default:
                m12 m12Var5 = (m12) obj;
                int size5 = arrayList.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    m12.g(m12Var5, (n12) arrayList.get(i6), 0, 0);
                }
                break;
        }
        return Unit.a;
    }
}
