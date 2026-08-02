package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kqe implements kql {
    private final kqm key;

    public kqe(kqm kqmVar) {
        kqmVar.getClass();
        this.key = kqmVar;
    }

    @Override // defpackage.kqn
    public /* bridge */ Object fold(Object obj, krx krxVar) {
        return ixe.e(this, obj, krxVar);
    }

    @Override // defpackage.kql, defpackage.kqn
    public /* bridge */ kql get(kqm kqmVar) {
        return ixe.f(this, kqmVar);
    }

    @Override // defpackage.kql
    public kqm getKey() {
        return this.key;
    }

    @Override // defpackage.kqn
    public /* bridge */ kqn minusKey(kqm kqmVar) {
        return ixe.g(this, kqmVar);
    }

    @Override // defpackage.kqn
    public /* bridge */ kqn plus(kqn kqnVar) {
        return ixe.h(this, kqnVar);
    }
}
