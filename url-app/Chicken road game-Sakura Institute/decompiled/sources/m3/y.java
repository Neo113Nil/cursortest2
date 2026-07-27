package m3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0862a f8490a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f8491b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f8492c;

    public y(C0862a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f8490a = address;
        this.f8491b = proxy;
        this.f8492c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (Intrinsics.a(yVar.f8490a, this.f8490a) && Intrinsics.a(yVar.f8491b, this.f8491b) && Intrinsics.a(yVar.f8492c, this.f8492c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8492c.hashCode() + ((this.f8491b.hashCode() + ((this.f8490a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f8492c + '}';
    }
}
