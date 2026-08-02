package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcp extends fcw {
    public static final fcw a = new fcp();

    @Override // defpackage.fcw
    public final String a() {
        return "singleproc";
    }

    @Override // defpackage.fcw
    public final /* bridge */ /* synthetic */ fcv b(fck fckVar, String str, Executor executor, iyi iyiVar) {
        return new fcr(str, hnu.aJ(fckVar.a), new fcz(fckVar.b, fckVar.f ? jkd.a() : jkd.a), executor, iyiVar, fckVar.c, new gtf());
    }
}
