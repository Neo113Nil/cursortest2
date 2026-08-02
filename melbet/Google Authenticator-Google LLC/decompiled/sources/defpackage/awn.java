package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class awn extends awp {
    private final BroadcastReceiver e;

    public awn(Context context, ldt ldtVar) {
        super(context, ldtVar);
        this.e = new awm(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.awp
    public final void d() {
        asq.a();
        int i = awo.a;
        getClass().getSimpleName();
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.awp
    public final void e() {
        asq.a();
        int i = awo.a;
        getClass().getSimpleName();
        this.a.unregisterReceiver(this.e);
    }
}
