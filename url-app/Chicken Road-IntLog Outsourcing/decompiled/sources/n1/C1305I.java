package n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: n1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305I extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f11317a;

    /* renamed from: b, reason: collision with root package name */
    public final e5.g f11318b;

    public C1305I(e5.g gVar) {
        this.f11318b = gVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f11317a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f11317a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f11318b.D();
            a();
        }
    }
}
