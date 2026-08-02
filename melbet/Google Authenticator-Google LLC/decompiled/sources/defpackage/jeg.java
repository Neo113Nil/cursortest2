package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeg implements jdy {
    private icd a;
    private final icd b;
    private final jdz c;

    public jeg(Context context, jdz jdzVar) {
        byte[] bytes;
        this.c = jdzVar;
        ccq ccqVar = ccq.c;
        ceu.b(context);
        boolean z = ccqVar instanceof cel;
        ceu a = ceu.a();
        Set unmodifiableSet = z ? DesugarCollections.unmodifiableSet(ccq.b) : Collections.singleton(new ccl("proto"));
        iyh c = ces.c();
        c.k("cct");
        String str = ccqVar.e;
        int i = 2;
        int i2 = 0;
        if (str == null && ccqVar.d == null) {
            bytes = null;
        } else {
            bytes = String.format("%s%s%s%s", "1$", ccqVar.d, "\\", str == null ? "" : str).getBytes(Charset.forName("UTF-8"));
        }
        c.b = bytes;
        bvw bvwVar = new bvw(unmodifiableSet, c.j(), a, (byte[]) null);
        if (ccq.b.contains(new ccl("json"))) {
            this.a = new iat(new jee(bvwVar, i2));
        }
        this.b = new iat(new jee(bvwVar, i));
    }

    static ccm b(jdz jdzVar, jed jedVar) {
        byte[] a;
        int i = jdzVar.c;
        ((jdc) jedVar.b).i = Boolean.valueOf(1 == (i ^ 1));
        ((jdc) jedVar.b).g = false;
        jdd jddVar = new jdd((jdc) jedVar.b);
        iyh iyhVar = (iyh) jedVar.a;
        iyhVar.a = jddVar;
        jeh.a();
        if (i == 0) {
            iyi iyiVar = new iyi(iyhVar);
            ibn ibnVar = new ibn();
            ila.a(ibnVar);
            ibnVar.b();
            kee keeVar = new kee(ibnVar);
            StringWriter stringWriter = new StringWriter();
            try {
                keeVar.a(iyiVar, stringWriter);
            } catch (IOException unused) {
            }
            a = stringWriter.toString().getBytes(StandardCharsets.UTF_8);
        } else {
            iyi iyiVar2 = new iyi(iyhVar);
            ibx ibxVar = new ibx();
            ila.a(ibxVar);
            a = ibxVar.b().a(iyiVar2);
        }
        return new ccm(a, ccn.b);
    }

    @Override // defpackage.jdy
    public final void a(jed jedVar) {
        jdz jdzVar = this.c;
        if (jdzVar.c != 0) {
            ((cfz) this.b.a()).a(b(jdzVar, jedVar));
            return;
        }
        icd icdVar = this.a;
        if (icdVar != null) {
            ((cfz) icdVar.a()).a(b(jdzVar, jedVar));
        }
    }
}
