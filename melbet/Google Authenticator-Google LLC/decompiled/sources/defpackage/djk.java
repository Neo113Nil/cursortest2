package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class djk extends BroadcastReceiver {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Context b;
    final /* synthetic */ hvw c;
    final /* synthetic */ htq d;
    final /* synthetic */ Executor e;

    public djk(AtomicBoolean atomicBoolean, Context context, hvw hvwVar, htq htqVar, Executor executor) {
        this.a = atomicBoolean;
        this.b = context;
        this.c = hvwVar;
        this.d = htqVar;
        this.e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.compareAndSet(false, true)) {
            djl.f(this.b, this);
            this.c.q(hnu.aN(this.d, this.e));
        }
    }
}
