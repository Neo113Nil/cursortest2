package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckc implements ckb {
    private final koe a;

    public ckc(koe koeVar) {
        this.a = koeVar;
    }

    @Override // defpackage.ckb
    public final cji a(Context context, String str) {
        gzp gzpVar = (gzp) ((jrx) this.a).a;
        if (!gzpVar.f()) {
            return new cji(context, "CLIENT_LOGGING_PROD", str);
        }
        List list = cji.n;
        cjd cjdVar = new cjd(context, "CLIENT_LOGGING_PROD");
        ddw ddwVar = (ddw) gzpVar.e();
        if (ddwVar != null) {
            cjdVar.h = ddwVar;
        }
        if (str != null) {
            cjdVar.d = str;
        }
        return cjdVar.a();
    }
}
