package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e61 extends pr2 implements zt0 {
    public /* synthetic */ List m;
    public /* synthetic */ String n;
    public /* synthetic */ String o;
    public /* synthetic */ String p;

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        List list = this.m;
        String str = this.n;
        String str2 = this.o;
        String str3 = this.p;
        b50 b50Var = b50.m;
        ca2.b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            a61 a61Var = (a61) obj2;
            if (str == null || Intrinsics.b(a61Var.c, str)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj3 = arrayList.get(i2);
            i2++;
            a61 a61Var2 = (a61) obj3;
            if (str2 == null || Intrinsics.b(a61Var2.d, str2)) {
                arrayList2.add(obj3);
            }
        }
        int size2 = arrayList2.size();
        int size3 = arrayList2.size();
        double d = 0.0d;
        while (i < size3) {
            Object obj4 = arrayList2.get(i);
            i++;
            Double d2 = ((a61) obj4).i;
            d += d2 != null ? d2.doubleValue() : 0.0d;
        }
        return new d61(str3, str, str2, arrayList2, size2, d);
    }
}
