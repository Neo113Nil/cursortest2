package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzl extends kzn {
    private final krx d;

    public /* synthetic */ kzl(krx krxVar) {
        this(krxVar, kqo.a, -2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.kzn, defpackage.lar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kzd kzdVar, kqj kqjVar) {
        kzk kzkVar;
        int i;
        if (kqjVar instanceof kzk) {
            kzkVar = (kzk) kqjVar;
            int i2 = kzkVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kzkVar.c = i2 - Integer.MIN_VALUE;
                Object obj = kzkVar.a;
                kqp kqpVar = kqp.a;
                i = kzkVar.c;
                if (i != 0) {
                    ixc.Y(obj);
                    kzkVar.d = kzdVar;
                    kzkVar.c = 1;
                    if (kzn.f(this, kzdVar, kzkVar) == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kzdVar = kzkVar.d;
                    ixc.Y(obj);
                }
                if (kzdVar.b.y()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return kow.a;
            }
        }
        kzkVar = new kzk(this, kqjVar);
        Object obj2 = kzkVar.a;
        kqp kqpVar2 = kqp.a;
        i = kzkVar.c;
        if (i != 0) {
        }
        if (kzdVar.b.y()) {
        }
    }

    @Override // defpackage.kzn, defpackage.lar
    protected final lar c(kqn kqnVar, int i, int i2) {
        return new kzl(this.d, kqnVar, 0, 2);
    }

    public kzl(krx krxVar, kqn kqnVar, int i, int i2) {
        super(krxVar, kqnVar, i, i2);
        this.d = krxVar;
    }
}
