package okhttp3;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class Route {

    /* renamed from: a, reason: collision with root package name */
    private final Address f42578a;

    /* renamed from: b, reason: collision with root package name */
    private final Proxy f42579b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f42580c;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f42578a = address;
        this.f42579b = proxy;
        this.f42580c = socketAddress;
    }

    public final Address a() {
        return this.f42578a;
    }

    public final Proxy b() {
        return this.f42579b;
    }

    public final boolean c() {
        return this.f42578a.k() != null && this.f42579b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f42580c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return Intrinsics.areEqual(route.f42578a, this.f42578a) && Intrinsics.areEqual(route.f42579b, this.f42579b) && Intrinsics.areEqual(route.f42580c, this.f42580c);
    }

    public int hashCode() {
        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f42578a.hashCode()) * 31) + this.f42579b.hashCode()) * 31) + this.f42580c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f42580c + '}';
    }
}
