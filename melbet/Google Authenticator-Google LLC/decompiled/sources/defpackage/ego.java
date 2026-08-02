package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ego implements htr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ego(dok dokVar, dop dopVar, dog dogVar, int i, int i2) {
        this.e = i2;
        this.b = dokVar;
        this.d = dopVar;
        this.c = dogVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [egm, java.lang.Object] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        if (this.e == 0) {
            egp egpVar = (egp) this.b;
            egpVar.g((egi) obj);
            return this.c.a(egpVar.a, (String) this.d, this.a);
        }
        gzp gzpVar = (gzp) obj;
        if (!gzpVar.f()) {
            return ((dok) this.b).j(this.a);
        }
        if (dok.i((dop) this.d)) {
            return hnu.aJ((InputStream) gzpVar.b());
        }
        dih.n((InputStream) gzpVar.b());
        return hnu.aI(new doh());
    }

    public /* synthetic */ ego(egp egpVar, egm egmVar, String str, int i, int i2) {
        this.e = i2;
        this.b = egpVar;
        this.c = egmVar;
        this.d = str;
        this.a = i;
    }
}
