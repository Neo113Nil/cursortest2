package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hg2 extends pr2 implements yt0 {
    public /* synthetic */ String m;
    public /* synthetic */ List n;
    public /* synthetic */ List o;

    @Override // defpackage.yt0
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        hg2 hg2Var = new hg2(4, (o30) obj4);
        hg2Var.m = (String) obj;
        hg2Var.n = (List) obj2;
        hg2Var.o = (List) obj3;
        return hg2Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        String str = this.m;
        List list = this.n;
        List list2 = this.o;
        b50 b50Var = b50.m;
        ca2.b(obj);
        return new eg2(str, list, list2);
    }
}
