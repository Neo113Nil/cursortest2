package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akw implements kzr {
    final /* synthetic */ kzr a;
    final /* synthetic */ ajw b;
    final /* synthetic */ krt c;

    public akw(kzr kzrVar, ajw ajwVar, krt krtVar) {
        this.a = kzrVar;
        this.b = ajwVar;
        this.c = krtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r6.cg(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(Object obj, kqj kqjVar) {
        akv akvVar;
        int i;
        kzr kzrVar;
        if (kqjVar instanceof akv) {
            akvVar = (akv) kqjVar;
            int i2 = akvVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                akvVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = akvVar.a;
                kqp kqpVar = kqp.a;
                i = akvVar.b;
                if (i != 0) {
                    ixc.Y(obj2);
                    kzr kzrVar2 = this.a;
                    ajw ajwVar = this.b;
                    krt krtVar = this.c;
                    akvVar.c = kzrVar2;
                    akvVar.b = 1;
                    Object g = abf.g(ajwVar, true, krtVar, akvVar);
                    if (g != kqpVar) {
                        obj2 = g;
                        kzrVar = kzrVar2;
                    }
                    return kqpVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj2);
                    return kow.a;
                }
                Object obj3 = akvVar.c;
                ixc.Y(obj2);
                kzrVar = obj3;
                akvVar.c = null;
                akvVar.b = 2;
            }
        }
        akvVar = new akv(this, kqjVar);
        Object obj22 = akvVar.a;
        kqp kqpVar2 = kqp.a;
        i = akvVar.b;
        if (i != 0) {
        }
        akvVar.c = null;
        akvVar.b = 2;
    }
}
