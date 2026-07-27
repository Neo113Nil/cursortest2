package x3;

import B0.o;
import L3.l;
import V0.j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import s0.k;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f12320l = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f12321a;

    /* renamed from: b, reason: collision with root package name */
    public String f12322b;

    /* renamed from: c, reason: collision with root package name */
    public long f12323c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12324d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f12325e;

    /* renamed from: f, reason: collision with root package name */
    public final D3.h f12326f;

    /* renamed from: g, reason: collision with root package name */
    public final k f12327g;

    /* renamed from: h, reason: collision with root package name */
    public final K3.a f12328h;

    /* renamed from: i, reason: collision with root package name */
    public final D3.h f12329i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12330j;

    /* renamed from: k, reason: collision with root package name */
    public final j f12331k;

    public g() {
        l lVar = l.OTLP_HTTP_LOG_EXPORTER;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f12323c = timeUnit.toNanos(10L);
        this.f12324d = timeUnit.toNanos(10L);
        this.f12325e = new HashMap();
        this.f12326f = new D3.h(4);
        this.f12327g = new k();
        this.f12328h = K3.a.f1412d;
        this.f12329i = new D3.h(5);
        this.f12330j = 1;
        this.f12331k = new j(6, g.class.getClassLoader());
        this.f12321a = lVar;
        this.f12322b = "http://localhost:4318/v1/logs";
    }

    public final String a(boolean z) {
        StringJoiner stringJoiner = z ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.f12322b);
        stringJoiner.add("timeoutNanos=" + this.f12323c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new A3.b(27)).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.f12324d);
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        final int i2 = 0;
        this.f12325e.forEach(new BiConsumer() { // from class: x3.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                switch (i2) {
                    case 0:
                        stringJoiner2.add(str + "=OBFUSCATED");
                        break;
                    default:
                        stringJoiner2.add(str + "=OBFUSCATED");
                        break;
                }
            }
        });
        this.f12326f.getClass();
        Map emptyMap = Collections.emptyMap();
        if (emptyMap != null) {
            final int i3 = 1;
            emptyMap.forEach(new BiConsumer() { // from class: x3.d
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    switch (i3) {
                        case 0:
                            stringJoiner2.add(str + "=OBFUSCATED");
                            break;
                        default:
                            stringJoiner2.add(str + "=OBFUSCATED");
                            break;
                    }
                }
            });
        }
        stringJoiner.add("headers=" + stringJoiner2);
        K3.a aVar = this.f12328h;
        if (aVar != null) {
            stringJoiner.add("retryPolicy=" + aVar);
        }
        stringJoiner.add("componentLoader=" + this.f12331k);
        stringJoiner.add("exporterType=" + this.f12321a);
        stringJoiner.add("internalTelemetrySchemaVersion=".concat(o.o(this.f12330j)));
        return stringJoiner.toString();
    }

    public final String toString() {
        return a(true);
    }
}
