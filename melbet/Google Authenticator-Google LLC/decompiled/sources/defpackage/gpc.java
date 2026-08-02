package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpc implements ifg {
    final /* synthetic */ frv a;
    final /* synthetic */ cka b;
    private hvi c;

    public gpc(cka ckaVar, frv frvVar) {
        this.b = ckaVar;
        this.a = frvVar;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs a() {
        return ifs.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift b() {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift c() {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final ifs d(iwq iwqVar) {
        try {
            return new ifs(1, null, null, ((jww) iwqVar.b).d(idf.a, (idf) hnu.aR(this.c)));
        } catch (ExecutionException e) {
            kbn kbnVar = kbn.UNAUTHENTICATED;
            List list = kbq.a;
            return ifs.b(kbnVar.a().d(e).e("Cannot get auth token for account id: ".concat(this.a.toString())), new kaa());
        }
    }

    @Override // defpackage.ifg
    public final ifs e(iwq iwqVar) {
        hoq.I(((jww) iwqVar.b).e(idf.a) == null, "xrpc AuthContext should not be set on a TikTok RPC stub");
        hvi c = ((gbc) this.b.a).c();
        this.c = c;
        return ifs.c(c);
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift f(ikm ikmVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift g(ikm ikmVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift h(bry bryVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ift i(bry bryVar) {
        return ift.a;
    }

    @Override // defpackage.ifg
    public final /* synthetic */ ifs j(bry bryVar) {
        return ifs.a;
    }
}
