package defpackage;

import android.content.Intent;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggu implements goo, gol {
    private final ggt a;
    private final Set b;
    private final fym c;

    public ggu(Optional optional, Map map, fym fymVar, hvm hvmVar) {
        map.getClass();
        fymVar.getClass();
        hvmVar.getClass();
        this.c = fymVar;
        this.a = (ggt) optional.orElse(null);
        this.b = map.keySet();
    }

    @Override // defpackage.goo
    public final hvi a(Intent intent) {
        hvi aJ;
        intent.getClass();
        ggt ggtVar = this.a;
        if (ggtVar != null) {
            ggtVar.a();
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        gty aB = hoq.aB(154, "Updating experiments", gub.a, true);
        try {
            if (stringExtra == null) {
                aJ = this.c.f(false);
            } else if (this.b.contains(stringExtra)) {
                fym fymVar = this.c;
                aJ = fymVar.e(((kee) fymVar.e).d(stringExtra), false);
            } else {
                aJ = hnu.aJ(null);
            }
            gaj.d(155, aJ, "Failed updating experiments for package %s", stringExtra);
            hvi ao = hoq.ao(aJ, Exception.class, new fyc(new dvm(14), 12), huf.a);
            ixf.j(aB, null);
            return ao;
        } finally {
        }
    }

    @Override // defpackage.gol
    public final long b() {
        return 25000L;
    }

    @Override // defpackage.gol
    public final long c() {
        return 25000L;
    }
}
