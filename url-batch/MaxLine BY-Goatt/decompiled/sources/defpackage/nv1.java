package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nv1 extends pw1 {
    public static final nv1 c = new nv1(0, 2, 1);

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        int i = ((v31) gnVar.g(0)).a;
        List list = (List) gnVar.g(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            rhVar.b(i3, obj);
            rhVar.f(i3, obj);
        }
    }
}
