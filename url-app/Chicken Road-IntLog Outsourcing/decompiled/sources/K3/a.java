package K3;

import V2.d;
import java.time.Duration;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1412d;

    /* renamed from: a, reason: collision with root package name */
    public final Duration f1413a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f1414b;

    /* renamed from: c, reason: collision with root package name */
    public final double f1415c;

    static {
        Duration ofSeconds;
        Duration ofSeconds2;
        long nanos;
        long nanos2;
        byte b6 = (byte) 1;
        ofSeconds = Duration.ofSeconds(1L);
        if (ofSeconds == null) {
            throw new NullPointerException("Null initialBackoff");
        }
        ofSeconds2 = Duration.ofSeconds(5L);
        if (ofSeconds2 == null) {
            throw new NullPointerException("Null maxBackoff");
        }
        byte b7 = (byte) (b6 | 2);
        if (b7 == 3) {
            a aVar = new a(ofSeconds, ofSeconds2, 1.5d);
            nanos = ofSeconds.toNanos();
            d.a("initialBackoff must be greater than 0", nanos > 0);
            nanos2 = ofSeconds2.toNanos();
            d.a("maxBackoff must be greater than 0", nanos2 > 0);
            f1412d = aVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" maxAttempts");
        }
        if ((b7 & 2) == 0) {
            sb.append(" backoffMultiplier");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public a(Duration duration, Duration duration2, double d6) {
        this.f1413a = duration;
        this.f1414b = duration2;
        this.f1415c = d6;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        equals = this.f1413a.equals(aVar.f1413a);
        if (equals) {
            equals2 = this.f1414b.equals(aVar.f1414b);
            if (equals2 && Double.doubleToLongBits(this.f1415c) == Double.doubleToLongBits(aVar.f1415c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        hashCode = this.f1413a.hashCode();
        hashCode2 = this.f1414b.hashCode();
        int i2 = (((hashCode ^ (-718379950)) * 1000003) ^ hashCode2) * 1000003;
        double d6 = this.f1415c;
        return (i2 ^ ((int) (Double.doubleToLongBits(d6) ^ (Double.doubleToLongBits(d6) >>> 32)))) * 1000003;
    }

    public final String toString() {
        return "RetryPolicy{maxAttempts=5, initialBackoff=" + this.f1413a + ", maxBackoff=" + this.f1414b + ", backoffMultiplier=" + this.f1415c + ", retryExceptionPredicate=null}";
    }
}
