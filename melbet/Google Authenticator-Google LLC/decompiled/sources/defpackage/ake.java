package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ake implements kql {
    public static final ale b = new ale();
    public final kqk a;

    public ake(kqk kqkVar) {
        this.a = kqkVar;
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return ixe.e(this, obj, krxVar);
    }

    @Override // defpackage.kql, defpackage.kqn
    public final kql get(kqm kqmVar) {
        return ixe.f(this, kqmVar);
    }

    @Override // defpackage.kql
    public final kqm getKey() {
        return b;
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        return ixe.g(this, kqmVar);
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        return ixe.h(this, kqnVar);
    }
}
