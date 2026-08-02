package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kka implements kbd {
    public static final Logger a = Logger.getLogger(kka.class.getName());
    private static final kmf c = new kmf();
    private static final hac b = new khb(2);

    public kka() {
        hac hacVar = b;
        kmf kmfVar = c;
        hacVar.getClass();
        kmfVar.getClass();
    }

    public static final kbc a(InetSocketAddress inetSocketAddress) {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> select = proxySelector.select(uri);
            if (select == null || select.isEmpty()) {
                String name = proxySelector.getClass().getName();
                StringBuilder sb = new StringBuilder("ProxySelector ");
                sb.append(name);
                sb.append(" returned ");
                sb.append(select == null ? "null" : "an empty list");
                sb.append(", which violates the java.net.ProxySelector#select(URI) contract");
                throw new IOException(sb.toString());
            }
            if (select.size() > 1) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = select.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication b2 = kmf.b(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            InetSocketAddress inetSocketAddress3 = inetSocketAddress2.isUnresolved() ? new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort()) : inetSocketAddress2;
            Map map = Collections.EMPTY_MAP;
            inetSocketAddress.getClass();
            inetSocketAddress3.getClass();
            if (b2 == null) {
                return new jyg(inetSocketAddress3, inetSocketAddress, map, null, null);
            }
            return new jyg(inetSocketAddress3, inetSocketAddress, map, b2.getUserName(), b2.getPassword() != null ? new String(b2.getPassword()) : null);
        } catch (URISyntaxException e) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }
}
