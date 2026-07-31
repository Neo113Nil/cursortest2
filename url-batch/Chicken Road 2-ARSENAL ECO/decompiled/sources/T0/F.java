package T0;

import a.AbstractC0219a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class F extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2242a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0219a f2243b;

    public F(AbstractC0219a abstractC0219a) {
        this.f2243b = abstractC0219a;
    }

    public final synchronized void a() {
        try {
            Context context = this.f2242a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f2242a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2243b.N();
            a();
        }
    }
}
