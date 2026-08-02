package defpackage;

import android.content.Context;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxl extends cms implements cmw {
    private static final bxm k;
    private static final ow l = new ow(null);
    private static final ox m;

    static {
        cxk cxkVar = new cxk();
        m = cxkVar;
        k = new bxm("MdiSync.API", cxkVar);
    }

    public cxl(Context context, cxh cxhVar) {
        super(context, null, k, cxhVar, cmr.a);
    }

    public final ddi a(byte[] bArr, cxi cxiVar, cxf cxfVar) {
        hsl hslVar = ((cxh) this.d).c;
        cxn cxnVar = new cxn(1, bArr, cxiVar, Instant.now().toEpochMilli());
        cpa cpaVar = new cpa();
        cpaVar.a = new cik(cxnVar, cxfVar, 11);
        int i = cxnVar.d - 1;
        cpaVar.b = (i == 1 || i == 2 || i == 3) ? new cli[]{cxg.b} : i != 4 ? new cli[0] : new cli[]{cxg.a};
        cpaVar.c = 15902;
        return super.i(0, cpaVar.a());
    }
}
