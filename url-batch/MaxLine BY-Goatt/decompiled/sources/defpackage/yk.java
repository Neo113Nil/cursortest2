package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yk extends pr2 implements au0 {
    public /* synthetic */ List m;
    public /* synthetic */ Map n;
    public /* synthetic */ int o;
    public /* synthetic */ int p;
    public /* synthetic */ jk q;
    public final /* synthetic */ zk r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(zk zkVar, o30 o30Var) {
        super(6, o30Var);
        this.r = zkVar;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        List list = this.m;
        Map map = this.n;
        int i = this.o;
        int i2 = this.p;
        jk jkVar = this.q;
        b50 b50Var = b50.m;
        ca2.b(obj);
        return new vk(jkVar, (String) this.r.d.getValue(), list, map, i, i2);
    }
}
