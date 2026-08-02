package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kzp implements kzq {
    public final krt a;
    public final krx b;
    private final kzq c;

    public kzp(kzq kzqVar, krt krtVar, krx krxVar) {
        this.c = kzqVar;
        this.a = krtVar;
        this.b = krxVar;
    }

    @Override // defpackage.kzq
    public final Object a(kzr kzrVar, kqj kqjVar) {
        ksw kswVar = new ksw();
        kswVar.a = lbd.a;
        return this.c.a(new kzo(this, kswVar, kzrVar), kqjVar);
    }
}
