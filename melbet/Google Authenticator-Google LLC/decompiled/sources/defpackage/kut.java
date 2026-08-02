package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kut implements kuu {
    private final /* synthetic */ int a;
    private final Object b;

    public kut(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future, kwc] */
    @Override // defpackage.kuu
    public final void b(Throwable th) {
        int i = this.a;
        if (i == 0) {
            this.b.a(th);
            return;
        }
        ?? r1 = this.b;
        if (i != 1) {
            r1.bQ();
        } else {
            r1.cancel(false);
        }
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "CancelHandler.UserSupplied[" + kvp.a(this.b) + "@" + kvp.b(this) + "]";
        }
        Object obj = this.b;
        if (i != 1) {
            return "DisposeOnCancel[" + obj + "]";
        }
        return "CancelFutureOnCancel[" + obj + "]";
    }
}
