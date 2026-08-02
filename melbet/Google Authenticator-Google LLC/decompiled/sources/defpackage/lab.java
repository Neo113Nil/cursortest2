package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lab implements kzr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lab(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kzr] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kzr] */
    @Override // defpackage.kzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(Object obj, kqj kqjVar) {
        azb azbVar;
        int i;
        Object cg;
        int i2 = this.b;
        if (i2 == 0) {
            ((ksw) this.a).a = obj;
            throw new lan(this);
        }
        if (i2 != 1) {
            return (obj == null || (cg = this.a.cg(obj, kqjVar)) != kqp.a) ? kow.a : cg;
        }
        if (kqjVar instanceof azb) {
            azbVar = (azb) kqjVar;
            int i3 = azbVar.b;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                azbVar.b = i3 - Integer.MIN_VALUE;
                Object obj2 = azbVar.a;
                kqp kqpVar = kqp.a;
                i = azbVar.b;
                if (i != 0) {
                    ixc.Y(obj2);
                    ?? r5 = this.a;
                    if (obj instanceof avu) {
                        azbVar.b = 1;
                        if (r5.cg(obj, azbVar) == kqpVar) {
                            return kqpVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj2);
                }
                return kow.a;
            }
        }
        azbVar = new azb(this, kqjVar);
        Object obj22 = azbVar.a;
        kqp kqpVar2 = kqp.a;
        i = azbVar.b;
        if (i != 0) {
        }
        return kow.a;
    }
}
