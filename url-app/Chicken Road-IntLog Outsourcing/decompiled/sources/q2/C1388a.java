package q2;

import B0.l;
import D2.b;
import H2.f;
import H2.o;
import U.e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import kotlin.jvm.internal.i;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388a implements b {

    /* renamed from: a, reason: collision with root package name */
    public o f11666a;

    @Override // D2.b
    public final void onAttachedToEngine(D2.a binding) {
        ConnectivityManager connectivityManager;
        i.e(binding, "binding");
        f fVar = binding.f435c;
        i.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f433a;
        i.d(context, "getApplicationContext(...)");
        this.f11666a = new o(fVar, "dev.fluttercommunity.plus/network_info");
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        i.c(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager wifiManager = (WifiManager) systemService;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService2 = context.getApplicationContext().getSystemService("connectivity");
            i.c(systemService2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            connectivityManager = (ConnectivityManager) systemService2;
        } else {
            connectivityManager = null;
        }
        e eVar = new e(new l(wifiManager, 12, connectivityManager));
        o oVar = this.f11666a;
        if (oVar != null) {
            oVar.b(eVar);
        } else {
            i.l("methodChannel");
            throw null;
        }
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a binding) {
        i.e(binding, "binding");
        o oVar = this.f11666a;
        if (oVar != null) {
            oVar.b(null);
        } else {
            i.l("methodChannel");
            throw null;
        }
    }
}
