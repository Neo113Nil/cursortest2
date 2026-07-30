package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ak implements Function1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ hk n;
    public final /* synthetic */ List o;

    public /* synthetic */ ak(hk hkVar, List list, int i) {
        this.m = i;
        this.n = hkVar;
        this.o = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.m;
        List list = this.o;
        hk hkVar = this.n;
        nc2 nc2Var = (nc2) obj;
        switch (i) {
            case 0:
                nc2Var.getClass();
                hkVar.b.K(nc2Var, list);
                break;
            default:
                nc2Var.getClass();
                hkVar.e.K(nc2Var, list);
                break;
        }
        return Unit.a;
    }
}
