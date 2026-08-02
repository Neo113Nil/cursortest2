package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gcs implements htr {
    private final /* synthetic */ int a;

    public /* synthetic */ gcs(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((gbv) obj).b();
        }
        if (i == 1) {
            return ((gbv) obj).c();
        }
        int i2 = 2;
        if (i == 2) {
            ((hkf) ((hkf) ((hkf) gon.a.f()).h((TimeoutException) obj)).i("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver", "maybeAddTimeout", 334, "IntentFilterAcledReceiver.java")).s("Receiver future timed out. Cancelling and returning due to HasReceiverTimeout.");
            return hnu.aH();
        }
        if (i != 3) {
            ldt ldtVar = (ldt) obj;
            return !((Boolean) ldtVar.d).booleanValue() ? hve.a : hti.f(((gnp) ldtVar.b).a(), gvx.a(new grv(ldtVar, i2)), ldtVar.c);
        }
        ldt ldtVar2 = (ldt) obj;
        return !((Boolean) ldtVar2.d).booleanValue() ? hve.a : hti.f(((gnp) ldtVar2.b).a(), gvx.a(new grv(ldtVar2, 0)), ldtVar2.c);
    }
}
