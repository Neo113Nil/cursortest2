package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class knv extends knr {
    final /* synthetic */ knw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knv(knw knwVar) {
        super(knwVar);
        this.b = knwVar;
    }

    @Override // defpackage.knr, defpackage.knq, defpackage.jzc
    public final void f(jxi jxiVar, jzi jziVar) {
        super.f(jxiVar, jziVar);
        knw knwVar = this.b;
        if (knwVar.f.i || jxiVar != jxi.d) {
            return;
        }
        knwVar.b.c();
    }
}
