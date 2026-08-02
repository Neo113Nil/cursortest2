package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cbu implements gbj {
    final /* synthetic */ cbw a;

    public cbu(cbw cbwVar) {
        this.a = cbwVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        cbw cbwVar = this.a;
        cbwVar.j.k(bool.booleanValue());
        cbwVar.k.I(bool.booleanValue());
        jkj k = hqs.a.k();
        if (!k.b.M()) {
            k.t();
        }
        hqs hqsVar = (hqs) k.b;
        hqsVar.c = 28;
        hqsVar.b |= 1;
        jkj k2 = hqv.a.k();
        boolean booleanValue = bool.booleanValue();
        if (!k2.b.M()) {
            k2.t();
        }
        hqv hqvVar = (hqv) k2.b;
        hqvVar.b |= 1;
        hqvVar.c = booleanValue;
        hqv hqvVar2 = (hqv) k2.q();
        if (!k.b.M()) {
            k.t();
        }
        hqs hqsVar2 = (hqs) k.b;
        hqvVar2.getClass();
        hqsVar2.i = hqvVar2;
        hqsVar2.b |= 256;
        String a = cch.a(cbwVar.a);
        if (!k.b.M()) {
            k.t();
        }
        bov bovVar = cbwVar.i;
        hqs hqsVar3 = (hqs) k.b;
        a.getClass();
        hqsVar3.b |= 64;
        hqsVar3.g = a;
        bovVar.a((hqs) k.q());
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
