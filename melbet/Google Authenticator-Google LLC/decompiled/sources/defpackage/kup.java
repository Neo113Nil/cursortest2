package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kup implements kuu {
    private final kuo[] a;

    public kup(kuo[] kuoVarArr) {
        this.a = kuoVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            kuo[] kuoVarArr = this.a;
            if (i >= kuoVarArr.length) {
                return;
            }
            kwc kwcVar = kuoVarArr[i].a;
            if (kwcVar == null) {
                ksp.a("handle");
                kwcVar = null;
            }
            kwcVar.bQ();
            i++;
        }
    }

    @Override // defpackage.kuu
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}
