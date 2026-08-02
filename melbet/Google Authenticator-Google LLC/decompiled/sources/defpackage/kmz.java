package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmz implements kxu {
    public static final ale a = new ale();
    private final jxr b;

    public kmz(jxr jxrVar) {
        this.b = jxrVar;
    }

    @Override // defpackage.kxu
    public final /* bridge */ /* synthetic */ Object a(kqn kqnVar) {
        kqnVar.getClass();
        jxr a2 = this.b.a();
        a2.getClass();
        return a2;
    }

    @Override // defpackage.kxu
    public final /* bridge */ /* synthetic */ void b(kqn kqnVar, Object obj) {
        jxr jxrVar = (jxr) obj;
        kqnVar.getClass();
        jxrVar.getClass();
        this.b.f(jxrVar);
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
        return a;
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
