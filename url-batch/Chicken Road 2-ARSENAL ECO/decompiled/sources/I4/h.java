package I4;

import X5.n;
import X5.p;
import X5.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class h implements p {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f1215f = Logger.getLogger(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final P4.a f1216a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.b f1217b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f1218c;

    /* renamed from: d, reason: collision with root package name */
    public final B1.g f1219d;

    /* renamed from: e, reason: collision with root package name */
    public final C4.d f1220e;

    public h(P4.a aVar, A4.b bVar) {
        aVar.getClass();
        g gVar = new g(0);
        Objects.requireNonNull(TimeUnit.NANOSECONDS);
        B1.g gVar2 = new B1.g(10);
        C4.d dVar = new C4.d(9);
        this.f1216a = aVar;
        this.f1217b = bVar;
        this.f1218c = gVar;
        this.f1219d = gVar2;
        this.f1220e = dVar;
    }

    public static String b(w wVar) {
        StringJoiner stringJoiner = new StringJoiner(",", "Response{", "}");
        stringJoiner.add("code=" + wVar.f3064i);
        StringBuilder sb = new StringBuilder("headers=");
        n nVar = wVar.f3066k;
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        i.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = nVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            String b7 = nVar.b(i7);
            Locale US = Locale.US;
            i.d(US, "US");
            String lowerCase = b7.toLowerCase(US);
            i.d(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(nVar.d(i7));
        }
        sb.append((String) treeMap.entrySet().stream().map(new A4.b(15)).collect(Collectors.joining(",", "[", "]")));
        stringJoiner.add(sb.toString());
        return stringJoiner.toString();
    }

    @Override // X5.p
    public final w a(c6.h hVar) {
        long nanos;
        long nanos2;
        Logger logger = f1215f;
        P4.a aVar = this.f1216a;
        nanos = aVar.f1879a.toNanos();
        long j4 = nanos;
        IOException iOException = null;
        int i7 = 0;
        w wVar = null;
        do {
            if (i7 > 0) {
                nanos2 = aVar.f1880b.toNanos();
                double min = Math.min(j4, nanos2);
                long doubleValue = (long) (((Double) this.f1220e.get()).doubleValue() * min);
                j4 = (long) (min * 1.5d);
                try {
                    this.f1219d.getClass();
                    TimeUnit.NANOSECONDS.sleep(doubleValue);
                    if (wVar != null) {
                        wVar.close();
                    }
                    iOException = null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                wVar = hVar.b(hVar.f3830e);
                boolean equals = Boolean.TRUE.equals(this.f1217b.apply(wVar));
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt ");
                    sb.append(i7);
                    sb.append(" returned ");
                    sb.append(equals ? "retryable" : "non-retryable");
                    sb.append(" response: ");
                    sb.append(b(wVar));
                    logger.log(level, sb.toString());
                }
                if (!equals) {
                    return wVar;
                }
            } catch (IOException e4) {
                boolean test = this.f1218c.test(e4);
                Level level2 = Level.FINER;
                if (logger.isLoggable(level2)) {
                    StringBuilder sb2 = new StringBuilder("Attempt ");
                    sb2.append(i7);
                    sb2.append(" failed with ");
                    logger.log(level2, N.p.b(sb2, test ? "retryable" : "non-retryable", " exception"), (Throwable) e4);
                }
                if (!test) {
                    throw e4;
                }
                iOException = e4;
                wVar = null;
            }
            i7++;
        } while (i7 < 5);
        if (wVar != null) {
            return wVar;
        }
        throw iOException;
    }
}
