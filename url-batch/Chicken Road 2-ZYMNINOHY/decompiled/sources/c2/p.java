package c2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f5697a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.e f5698b;

    public p(l2.e eVar) {
        this.f5698b = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f5698b.f14271c;
            throw null;
        }
    }
}
