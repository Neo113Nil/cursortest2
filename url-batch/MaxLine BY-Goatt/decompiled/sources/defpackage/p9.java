package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p9 extends z92 implements Function2 {
    public final /* synthetic */ int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9(int i, o30 o30Var, Object obj) {
        super(o30Var);
        this.n = i;
        this.q = obj;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.n;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                p9 p9Var = new p9(0, o30Var, (q9) obj2);
                p9Var.p = obj;
                return p9Var;
            case 1:
                p9 p9Var2 = new p9(1, o30Var, (j6) obj2);
                p9Var2.p = obj;
                return p9Var2;
            default:
                p9 p9Var3 = new p9(2, o30Var, (Function1) obj2);
                p9Var3.p = obj;
                return p9Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ur2 ur2Var = (ur2) obj;
        o30 o30Var = (o30) obj2;
        switch (this.n) {
            case 0:
                return ((p9) create(ur2Var, o30Var)).invokeSuspend(Unit.a);
            case 1:
                return ((p9) create(ur2Var, o30Var)).invokeSuspend(Unit.a);
            default:
                ((p9) create(ur2Var, o30Var)).invokeSuspend(Unit.a);
                return b50.m;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00fa -> B:37:0x00ff). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:7:0x0036). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
