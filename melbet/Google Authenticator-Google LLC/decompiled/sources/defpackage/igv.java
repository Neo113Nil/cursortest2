package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igv implements hmz {
    private final /* synthetic */ int a;
    private final hmx b;

    public igv(Context context, ckb ckbVar, erx erxVar, Executor executor, koe koeVar, ikg ikgVar, boolean z, koe koeVar2, ikj ikjVar, int i) {
        this.a = i;
        this.b = new igs(context, ckbVar, erxVar, executor, koeVar, ikgVar, koeVar2, z, ikjVar);
    }

    @Override // defpackage.hmz
    public final hlw a(String str) {
        return this.b;
    }

    public igv(eka ekaVar, int i) {
        this.a = i;
        this.b = ekaVar;
    }
}
