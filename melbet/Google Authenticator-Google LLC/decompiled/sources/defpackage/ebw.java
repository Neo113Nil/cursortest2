package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebw {
    public final dov a;
    public final cvp b;
    public final aec c;
    public ecb d;
    public her e;
    public final cwy f;

    public ebw(dov dovVar, Context context, fwm fwmVar) {
        cwy cwyVar = new cwy(context.getApplicationContext());
        gzp.h(fwmVar);
        context.getPackageName();
        this.c = new ecd(this);
        this.e = hix.b;
        this.a = dovVar;
        this.f = cwyVar;
        this.b = new cvp() { // from class: ecc
            @Override // defpackage.cvp
            public final void a(her herVar) {
                ebw ebwVar = ebw.this;
                ebwVar.e = her.i(herVar);
                ecb ecbVar = ebwVar.d;
                if (ecbVar != null) {
                    ecbVar.b(ebwVar.e);
                }
            }
        };
    }
}
