package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcm extends fcw {
    public static final fcw a = new fcm();

    @Override // defpackage.fcw
    public final String a() {
        return "signal";
    }

    @Override // defpackage.fcw
    public final /* synthetic */ fcv b(fck fckVar, String str, Executor executor, iyi iyiVar) {
        fcs fcsVar = fckVar.e;
        hoq.x(fcsVar instanceof fcl);
        return new fcn(str, hnu.aJ(fckVar.a), new fcz(fckVar.b, fckVar.f ? jkd.a() : jkd.a), executor, iyiVar, ((fcl) fcsVar).a, fckVar.c, new gtf());
    }
}
