package j5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Logger;
import w5.C0992a;
import x5.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f6004l = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f6005a;

    /* renamed from: b, reason: collision with root package name */
    public String f6006b;

    /* renamed from: c, reason: collision with root package name */
    public long f6007c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6008d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f6009e;

    /* renamed from: f, reason: collision with root package name */
    public final G3.a f6010f;

    /* renamed from: g, reason: collision with root package name */
    public final c2.e f6011g;

    /* renamed from: h, reason: collision with root package name */
    public final C0992a f6012h;

    /* renamed from: i, reason: collision with root package name */
    public final G3.a f6013i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final L4.a f6014k;

    public g() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f6007c = timeUnit.toNanos(10L);
        this.f6008d = timeUnit.toNanos(10L);
        this.f6009e = new HashMap();
        this.f6010f = new G3.a(2);
        this.f6011g = new c2.e();
        this.f6012h = C0992a.f8284c;
        this.f6013i = new G3.a(3);
        this.j = 1;
        this.f6014k = new L4.a(g.class.getClassLoader(), 0);
        this.f6005a = l.OTLP_HTTP_LOG_EXPORTER;
        this.f6006b = "http://localhost:4318/v1/logs";
    }

    public final String a(boolean z7) {
        StringJoiner stringJoiner = z7 ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.f6006b);
        stringJoiner.add("timeoutNanos=" + this.f6007c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new C4.a(15)).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.f6008d);
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        final int i2 = 0;
        this.f6009e.forEach(new BiConsumer() { // from class: j5.c
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
        this.f6010f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i5 = 1;
            map.forEach(new BiConsumer() { // from class: j5.c
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    switch (i5) {
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
        C0992a c0992a = this.f6012h;
        if (c0992a != null) {
            stringJoiner.add("retryPolicy=" + c0992a);
        }
        stringJoiner.add("componentLoader=" + this.f6014k);
        stringJoiner.add("exporterType=" + this.f6005a);
        stringJoiner.add("internalTelemetrySchemaVersion=".concat(r4.f.j(this.j)));
        return stringJoiner.toString();
    }

    public final String toString() {
        return a(true);
    }
}
