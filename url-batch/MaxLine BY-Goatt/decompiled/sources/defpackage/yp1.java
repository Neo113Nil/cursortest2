package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yp1 extends o81 implements yt0 {
    public final /* synthetic */ jd2 m;
    public final /* synthetic */ zn1 n;
    public final /* synthetic */ so2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp1(kd2 kd2Var, zn1 zn1Var, so2 so2Var) {
        super(4);
        this.m = kd2Var;
        this.n = zn1Var;
        this.o = so2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        cp1 cp1Var;
        vc vcVar = (vc) obj;
        cp1 cp1Var2 = (cp1) obj2;
        a00 a00Var = (a00) obj3;
        ((Number) obj4).intValue();
        if (!((Boolean) this.n.getValue()).booleanValue()) {
            List list = (List) this.o.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    cp1Var = 0;
                    break;
                }
                cp1Var = listIterator.previous();
                if (Intrinsics.b(cp1Var2, (cp1) cp1Var)) {
                    break;
                }
            }
            cp1Var2 = cp1Var;
        }
        if (cp1Var2 != null) {
            tk3.o(cp1Var2, this.m, yj1.H(-1263531443, new n8(17, cp1Var2, vcVar), a00Var), a00Var, 384);
        }
        return Unit.a;
    }
}
