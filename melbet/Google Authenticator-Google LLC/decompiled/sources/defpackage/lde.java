package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lde implements kxu {
    private final Object a;
    private final ThreadLocal b;
    private final kqm c;

    public lde(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new ldf(threadLocal);
    }

    @Override // defpackage.kxu
    public final Object a(kqn kqnVar) {
        ThreadLocal threadLocal = this.b;
        Object obj = this.a;
        Object obj2 = threadLocal.get();
        threadLocal.set(obj);
        return obj2;
    }

    @Override // defpackage.kxu
    public final void b(kqn kqnVar, Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return ixe.e(this, obj, krxVar);
    }

    @Override // defpackage.kql, defpackage.kqn
    public final kql get(kqm kqmVar) {
        if (ksp.b(this.c, kqmVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.kql
    public final kqm getKey() {
        return this.c;
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        return ksp.b(this.c, kqmVar) ? kqo.a : this;
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        return ixe.h(this, kqnVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ")";
    }
}
