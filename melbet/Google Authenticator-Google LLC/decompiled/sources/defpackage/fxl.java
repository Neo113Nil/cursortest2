package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxl {
    public static final gpk a = new gpk(1, 2);
    public final gpj b;
    public final frv c;
    public final hvl d;

    public fxl(gpj gpjVar, frv frvVar, hvl hvlVar) {
        this.b = gpjVar;
        this.c = frvVar;
        this.d = hvlVar;
        hoq.I(frvVar.a != -1, "Account Id is invalid");
    }

    public static String a(frv frvVar) {
        return "accounts" + File.separator + frvVar.a;
    }

    public final ikm b(gpk gpkVar, String str) {
        return new ikm(new iyi(gpkVar, this.b, a(this.c) + File.separator + str), this.d);
    }
}
