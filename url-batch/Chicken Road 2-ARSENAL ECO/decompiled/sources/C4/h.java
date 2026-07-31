package C4;

import Q4.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: l, reason: collision with root package name */
    public static final Logger f216l = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f217a;

    /* renamed from: b, reason: collision with root package name */
    public String f218b;

    /* renamed from: c, reason: collision with root package name */
    public long f219c;

    /* renamed from: d, reason: collision with root package name */
    public final long f220d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f221e;

    /* renamed from: f, reason: collision with root package name */
    public final d f222f;

    /* renamed from: g, reason: collision with root package name */
    public final R0.g f223g;

    /* renamed from: h, reason: collision with root package name */
    public final P4.a f224h;

    /* renamed from: i, reason: collision with root package name */
    public final d f225i;

    /* renamed from: j, reason: collision with root package name */
    public final int f226j;

    /* renamed from: k, reason: collision with root package name */
    public final V5.g f227k;

    public h() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f219c = timeUnit.toNanos(10L);
        this.f220d = timeUnit.toNanos(10L);
        this.f221e = new HashMap();
        this.f222f = new d(0);
        this.f223g = new R0.g();
        this.f224h = P4.a.f1878c;
        this.f225i = new d(1);
        this.f226j = 1;
        this.f227k = new V5.g(5, h.class.getClassLoader());
        this.f217a = l.f2034h;
        this.f218b = "http://localhost:4318/v1/logs";
    }

    public final String a(boolean z5) {
        StringJoiner stringJoiner = z5 ? new StringJoiner(", ", "HttpExporterBuilder{", "}") : new StringJoiner(", ");
        stringJoiner.add("endpoint=" + this.f218b);
        stringJoiner.add("timeoutNanos=" + this.f219c);
        stringJoiner.add("proxyOptions=null");
        stringJoiner.add("compressorEncoding=" + ((String) Optional.ofNullable(null).map(new A4.b(1)).orElse(null)));
        stringJoiner.add("connectTimeoutNanos=" + this.f220d);
        stringJoiner.add("exportAsJson=false");
        final StringJoiner stringJoiner2 = new StringJoiner(", ", "Headers{", "}");
        final int i7 = 0;
        this.f221e.forEach(new BiConsumer() { // from class: C4.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                switch (i7) {
                    case 0:
                        stringJoiner2.add(str + "=OBFUSCATED");
                        break;
                    default:
                        stringJoiner2.add(str + "=OBFUSCATED");
                        break;
                }
            }
        });
        this.f222f.getClass();
        Map map = Collections.EMPTY_MAP;
        if (map != null) {
            final int i8 = 1;
            map.forEach(new BiConsumer() { // from class: C4.c
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    String str = (String) obj;
                    switch (i8) {
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
        P4.a aVar = this.f224h;
        if (aVar != null) {
            stringJoiner.add("retryPolicy=" + aVar);
        }
        stringJoiner.add("componentLoader=" + this.f227k);
        stringJoiner.add("exporterType=" + this.f217a);
        stringJoiner.add("internalTelemetrySchemaVersion=".concat(C1.c.m(this.f226j)));
        return stringJoiner.toString();
    }

    public final String toString() {
        return a(true);
    }
}
