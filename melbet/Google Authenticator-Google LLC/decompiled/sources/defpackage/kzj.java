package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzj implements kzq {
    private final krx a;

    public kzj(krx krxVar) {
        this.a = krxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.kzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kzr kzrVar, kqj kqjVar) {
        kzi kziVar;
        int i;
        Throwable th;
        lbe lbeVar;
        if (kqjVar instanceof kzi) {
            kziVar = (kzi) kqjVar;
            int i2 = kziVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kziVar.c = i2 - Integer.MIN_VALUE;
                Object obj = kziVar.a;
                kqp kqpVar = kqp.a;
                i = kziVar.c;
                if (i != 0) {
                    ixc.Y(obj);
                    lbe lbeVar2 = new lbe(kzrVar, kziVar.bU());
                    try {
                        kziVar.d = lbeVar2;
                        kziVar.c = 1;
                        Object a = this.a.a(lbeVar2, kziVar);
                        if (a != kqpVar) {
                            a = kow.a;
                        }
                        if (a == kqpVar) {
                            return kqpVar;
                        }
                        lbeVar = lbeVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        lbeVar = lbeVar2;
                        lbeVar.h();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lbeVar = kziVar.d;
                    try {
                        ixc.Y(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        lbeVar.h();
                        throw th;
                    }
                }
                lbeVar.h();
                return kow.a;
            }
        }
        kziVar = new kzi(this, kqjVar);
        Object obj2 = kziVar.a;
        kqp kqpVar2 = kqp.a;
        i = kziVar.c;
        if (i != 0) {
        }
        lbeVar.h();
        return kow.a;
    }
}
