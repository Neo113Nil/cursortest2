package okhttp3.internal.authenticator;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@Metadata
/* loaded from: classes3.dex */
public final class JavaNetAuthenticator implements Authenticator {

    /* renamed from: d, reason: collision with root package name */
    private final Dns f42598d;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42599a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f42599a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.f42599a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first(dns.a(httpUrl.h()));
        }
        SocketAddress address = proxy.address();
        Intrinsics.checkNotNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        Intrinsics.checkNotNullExpressionValue(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    @Override // okhttp3.Authenticator
    public Request a(Route route, Response response) {
        Proxy proxy;
        Dns dns;
        PasswordAuthentication requestPasswordAuthentication;
        Address a4;
        Intrinsics.checkNotNullParameter(response, "response");
        List<Challenge> p4 = response.p();
        Request e02 = response.e0();
        HttpUrl j4 = e02.j();
        boolean z4 = response.J() == 407;
        if (route == null || (proxy = route.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : p4) {
            if (StringsKt.w("Basic", challenge.c(), true)) {
                if (route == null || (a4 = route.a()) == null || (dns = a4.c()) == null) {
                    dns = this.f42598d;
                }
                if (z4) {
                    SocketAddress address = proxy.address();
                    Intrinsics.checkNotNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, b(proxy, j4, dns), inetSocketAddress.getPort(), j4.p(), challenge.b(), challenge.c(), j4.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String h4 = j4.h();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(h4, b(proxy, j4, dns), j4.l(), j4.p(), challenge.b(), challenge.c(), j4.r(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z4 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    return e02.i().d(str, Credentials.a(userName, new String(password), challenge.a())).a();
                }
            }
        }
        return null;
    }

    public JavaNetAuthenticator(Dns defaultDns) {
        Intrinsics.checkNotNullParameter(defaultDns, "defaultDns");
        this.f42598d = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Dns.f42368b : dns);
    }
}
