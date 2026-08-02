package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxz extends kvj {
    public static final /* synthetic */ int a = 0;

    static {
        new kxz();
    }

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        kyd kydVar = (kyd) kqnVar.get(kyd.b);
        if (kydVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        kydVar.a = true;
    }

    @Override // defpackage.kvj
    public final boolean b(kqn kqnVar) {
        return false;
    }

    @Override // defpackage.kvj
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
