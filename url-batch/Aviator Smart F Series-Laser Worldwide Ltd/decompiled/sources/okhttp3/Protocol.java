package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final Protocol get(String protocol) {
            s.checkNotNullParameter(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!s.areEqual(protocol, protocol2.protocol)) {
                protocol2 = Protocol.HTTP_1_1;
                if (!s.areEqual(protocol, protocol2.protocol)) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!s.areEqual(protocol, protocol2.protocol)) {
                        protocol2 = Protocol.HTTP_2;
                        if (!s.areEqual(protocol, protocol2.protocol)) {
                            protocol2 = Protocol.SPDY_3;
                            if (!s.areEqual(protocol, protocol2.protocol)) {
                                protocol2 = Protocol.QUIC;
                                if (!s.areEqual(protocol, protocol2.protocol)) {
                                    throw new IOException(s.stringPlus("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
