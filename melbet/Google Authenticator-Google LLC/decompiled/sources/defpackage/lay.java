package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lay implements kqn {
    public final Throwable a;
    private final /* synthetic */ kqn b;

    public lay(Throwable th, kqn kqnVar) {
        this.b = kqnVar;
        this.a = th;
    }

    @Override // defpackage.kqn
    public final Object fold(Object obj, krx krxVar) {
        return this.b.fold(obj, krxVar);
    }

    @Override // defpackage.kqn
    public final kql get(kqm kqmVar) {
        return this.b.get(kqmVar);
    }

    @Override // defpackage.kqn
    public final kqn minusKey(kqm kqmVar) {
        return this.b.minusKey(kqmVar);
    }

    @Override // defpackage.kqn
    public final kqn plus(kqn kqnVar) {
        return this.b.plus(kqnVar);
    }
}
