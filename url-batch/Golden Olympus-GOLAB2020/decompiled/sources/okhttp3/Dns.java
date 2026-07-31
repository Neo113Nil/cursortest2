package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public interface Dns {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f42367a = Companion.f42369a;

    /* renamed from: b, reason: collision with root package name */
    public static final Dns f42368b = new Companion.DnsSystem();

    @Metadata
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f42369a = new Companion();

        @Metadata
        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List a(String hostname) {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return AbstractC3219i.G0(allByName);
                } catch (NullPointerException e4) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e4);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List a(String str);
}
