package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyb implements kql, kqm {
    private final /* synthetic */ int c;
    public static final kyb b = new kyb(1);
    public static final kyb a = new kyb(0);

    private kyb(int i) {
        this.c = i;
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return this.c != 0 ? ixe.e(this, obj, krxVar) : ixe.e(this, obj, krxVar);
    }

    @Override // defpackage.kql, defpackage.kqn
    public final kql get(kqm kqmVar) {
        return this.c != 0 ? ixe.f(this, kqmVar) : ixe.f(this, kqmVar);
    }

    @Override // defpackage.kql
    public final kqm getKey() {
        return this.c != 0 ? b : this;
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        return this.c != 0 ? ixe.g(this, kqmVar) : ixe.g(this, kqmVar);
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        return this.c != 0 ? ixe.h(this, kqnVar) : ixe.h(this, kqnVar);
    }
}
