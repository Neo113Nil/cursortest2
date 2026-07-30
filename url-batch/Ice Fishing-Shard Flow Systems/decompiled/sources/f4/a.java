package f4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import l2.c;
import s4.g;
import s4.h;

/* loaded from: classes.dex */
public final class a extends BroadcastReceiver implements h {

    /* renamed from: a, reason: collision with root package name */
    public final c f4799a;

    /* renamed from: b, reason: collision with root package name */
    public g f4800b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4801c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public N0.h f4802d;

    public a(Context context, c cVar) {
        this.f4799a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        g gVar = this.f4800b;
        if (gVar != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f4799a.f6269d;
            gVar.a(c.w(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
