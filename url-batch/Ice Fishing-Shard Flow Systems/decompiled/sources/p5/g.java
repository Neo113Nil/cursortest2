package p5;

import C4.p;
import D6.C;
import D6.q;
import D6.t;
import I6.i;
import M4.h;
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
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import w5.C0992a;

/* loaded from: classes.dex */
public final class g implements t {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f7209f = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final C0992a f7210a;

    /* renamed from: b, reason: collision with root package name */
    public final C4.a f7211b;

    /* renamed from: c, reason: collision with root package name */
    public final Predicate f7212c;

    /* renamed from: d, reason: collision with root package name */
    public final f f7213d;

    /* renamed from: e, reason: collision with root package name */
    public final G3.a f7214e;

    public g(C0992a c0992a, C4.a aVar) {
        c0992a.getClass();
        h hVar = new h(2);
        Objects.requireNonNull(TimeUnit.NANOSECONDS);
        f fVar = new f();
        G3.a aVar2 = new G3.a(11);
        this.f7210a = c0992a;
        this.f7211b = aVar;
        this.f7212c = hVar;
        this.f7213d = fVar;
        this.f7214e = aVar2;
    }

    public static String b(C c7) {
        StringJoiner stringJoiner = new StringJoiner(",", "Response{", "}");
        stringJoiner.add("code=" + c7.f429l);
        StringBuilder sb = new StringBuilder("headers=");
        q qVar = c7.f431n;
        Intrinsics.checkNotNullParameter(H.f6155a, "<this>");
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = qVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b7 = qVar.b(i2);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = b7.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(qVar.d(i2));
        }
        sb.append((String) treeMap.entrySet().stream().map(new C4.a(29)).collect(Collectors.joining(",", "[", "]")));
        stringJoiner.add(sb.toString());
        return stringJoiner.toString();
    }

    @Override // D6.t
    public final C a(i iVar) {
        long nanos;
        long nanos2;
        Logger logger = f7209f;
        C0992a c0992a = this.f7210a;
        nanos = c0992a.f8285a.toNanos();
        long j = nanos;
        IOException iOException = null;
        int i2 = 0;
        C c7 = null;
        do {
            if (i2 > 0) {
                nanos2 = c0992a.f8286b.toNanos();
                double min = Math.min(j, nanos2);
                long doubleValue = (long) (((Double) this.f7214e.get()).doubleValue() * min);
                j = (long) (min * 1.5d);
                try {
                    this.f7213d.getClass();
                    TimeUnit.NANOSECONDS.sleep(doubleValue);
                    if (c7 != null) {
                        c7.close();
                    }
                    iOException = null;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                c7 = iVar.b(iVar.f1300e);
                boolean equals = Boolean.TRUE.equals(this.f7211b.apply(c7));
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempt ");
                    sb.append(i2);
                    sb.append(" returned ");
                    sb.append(equals ? "retryable" : "non-retryable");
                    sb.append(" response: ");
                    sb.append(b(c7));
                    logger.log(level, sb.toString());
                }
                if (!equals) {
                    return c7;
                }
            } catch (IOException e7) {
                boolean test = this.f7212c.test(e7);
                Level level2 = Level.FINER;
                if (logger.isLoggable(level2)) {
                    logger.log(level2, r4.f.f(p.k(i2, "Attempt ", " failed with "), test ? "retryable" : "non-retryable", " exception"), (Throwable) e7);
                }
                if (!test) {
                    throw e7;
                }
                iOException = e7;
                c7 = null;
            }
            i2++;
        } while (i2 < 5);
        if (c7 != null) {
            return c7;
        }
        throw iOException;
    }
}
