package N0;

import G0.s;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f1792f;

    /* renamed from: g, reason: collision with root package name */
    public final h f1793g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, D0.j taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = this.f1785b.getSystemService("connectivity");
        Intrinsics.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f1792f = (ConnectivityManager) systemService;
        this.f1793g = new h(0, this);
    }

    @Override // N0.f
    public final Object a() {
        return j.a(this.f1792f);
    }

    @Override // N0.f
    public final void d() {
        try {
            s.d().a(j.f1794a, "Registering network callback");
            Q0.j.a(this.f1792f, this.f1793g);
        } catch (IllegalArgumentException e7) {
            s.d().c(j.f1794a, "Received exception while registering network callback", e7);
        } catch (SecurityException e8) {
            s.d().c(j.f1794a, "Received exception while registering network callback", e8);
        }
    }

    @Override // N0.f
    public final void e() {
        try {
            s.d().a(j.f1794a, "Unregistering network callback");
            Q0.h.c(this.f1792f, this.f1793g);
        } catch (IllegalArgumentException e7) {
            s.d().c(j.f1794a, "Received exception while unregistering network callback", e7);
        } catch (SecurityException e8) {
            s.d().c(j.f1794a, "Received exception while unregistering network callback", e8);
        }
    }
}
