package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;

@Metadata
/* loaded from: classes3.dex */
public final class RouteDatabase {

    /* renamed from: a, reason: collision with root package name */
    private final Set f42816a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.f42816a.remove(route);
    }

    public final synchronized void b(Route failedRoute) {
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        this.f42816a.add(failedRoute);
    }

    public final synchronized boolean c(Route route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return this.f42816a.contains(route);
    }
}
