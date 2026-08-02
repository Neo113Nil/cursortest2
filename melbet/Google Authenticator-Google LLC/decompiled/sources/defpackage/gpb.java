package defpackage;

import android.accounts.NetworkErrorException;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpb implements ifg {
    private hvi a;

    static {
        jzr jzrVar = kaa.b;
        int i = jzw.d;
        new jzq("Authorization", jzrVar);
        new jzq("X-Auth-Time", kaa.b);
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
            throw null;
        } catch (ExecutionException e) {
            kbn kbnVar = ((iel) ((jww) iwqVar.b).e(iem.a)).i() ? e.getCause() instanceof NetworkErrorException ? kbn.UNAVAILABLE : kbn.UNAUTHENTICATED : kbn.UNKNOWN;
            List list = kbq.a;
            return ifs.b(kbnVar.a().d(e.getCause()).e("Could not obtain auth token"), new kaa());
        }
    }

    @Override // defpackage.ifg
    public final ifs e(iwq iwqVar) {
        jww jwwVar = (jww) iwqVar.b;
        hvi hviVar = (hvi) jwwVar.e(gop.a);
        jww d = jwwVar.d(idj.a, new idj());
        if (hviVar == null) {
            return new ifs(1, null, null, d);
        }
        this.a = hviVar;
        hviVar.getClass();
        return new ifs(4, null, hviVar, d);
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
