package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azf {
    public static final String a = asq.b("ConstraintTrkngWrkr");

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(brn brnVar, axt axtVar, kqj kqjVar) {
        azd azdVar;
        int i;
        if (kqjVar instanceof azd) {
            azdVar = (azd) kqjVar;
            int i2 = azdVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                azdVar.b = i2 - Integer.MIN_VALUE;
                Object obj = azdVar.a;
                kqp kqpVar = kqp.a;
                i = azdVar.b;
                if (i != 0) {
                    ixc.Y(obj);
                    azc azcVar = new azc(new kni(brnVar.w(axtVar), new aze(axtVar, (kqj) null, 0), 4), 0);
                    azdVar.b = 1;
                    obj = ixk.b(azcVar, azdVar);
                    if (obj == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                return new Integer(((avu) obj).a);
            }
        }
        azdVar = new azd(kqjVar);
        Object obj2 = azdVar.a;
        kqp kqpVar2 = kqp.a;
        i = azdVar.b;
        if (i != 0) {
        }
        return new Integer(((avu) obj2).a);
    }
}
