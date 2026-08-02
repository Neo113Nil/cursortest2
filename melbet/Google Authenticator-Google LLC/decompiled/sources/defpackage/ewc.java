package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewc {
    public final etd a;
    public final hac b;
    public final String c;
    public final String d;
    public final boolean e;

    public ewc(final etd etdVar, final String str, final String str2, final boolean z) {
        this.a = etdVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.b = hoq.v(new hac() { // from class: evz
            @Override // defpackage.hac
            public final Object bB() {
                boolean z2 = z;
                etd etdVar2 = etdVar;
                Context a = z2 ? djl.a(etdVar2.c) : etdVar2.c;
                String str3 = str2;
                return String.valueOf(etb.b(a)) + File.separator + "phenotype" + File.separator + "shared" + File.separator + (str3.isEmpty() ? "" : String.valueOf(str3).concat(String.valueOf(File.separator))) + str + ".pb";
            }
        });
    }

    public final hvi a(String str) {
        etd etdVar = this.a;
        return hti.f(etdVar.b().c(this.c, str), new evy(), etdVar.d());
    }

    public final hvi b(ewd ewdVar) {
        return hnu.aM(new bsp(this, ewdVar, 10), this.a.d());
    }
}
