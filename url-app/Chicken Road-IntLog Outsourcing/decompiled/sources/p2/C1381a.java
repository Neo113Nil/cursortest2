package p2;

import B0.c;
import D2.b;
import H2.f;
import H2.o;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.i;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381a implements b {

    /* renamed from: a, reason: collision with root package name */
    public o f11638a;

    @Override // D2.b
    public final void onAttachedToEngine(D2.a binding) {
        i.e(binding, "binding");
        f fVar = binding.f435c;
        i.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f433a;
        i.d(context, "getApplicationContext(...)");
        this.f11638a = new o(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        i.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        c cVar = new c(packageManager, 12, (ActivityManager) systemService);
        o oVar = this.f11638a;
        if (oVar != null) {
            oVar.b(cVar);
        } else {
            i.l("methodChannel");
            throw null;
        }
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a binding) {
        i.e(binding, "binding");
        o oVar = this.f11638a;
        if (oVar != null) {
            oVar.b(null);
        } else {
            i.l("methodChannel");
            throw null;
        }
    }
}
