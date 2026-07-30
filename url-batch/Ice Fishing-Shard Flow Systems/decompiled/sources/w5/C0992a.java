package w5;

import H4.d;
import java.time.Duration;

/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0992a f8284c;

    /* renamed from: a, reason: collision with root package name */
    public final Duration f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f8286b;

    static {
        Duration ofSeconds;
        Duration ofSeconds2;
        long nanos;
        long nanos2;
        byte b7 = (byte) 1;
        ofSeconds = Duration.ofSeconds(1L);
        if (ofSeconds == null) {
            throw new NullPointerException("Null initialBackoff");
        }
        ofSeconds2 = Duration.ofSeconds(5L);
        if (ofSeconds2 == null) {
            throw new NullPointerException("Null maxBackoff");
        }
        byte b8 = (byte) (b7 | 2);
        if (b8 == 3) {
            C0992a c0992a = new C0992a(ofSeconds, ofSeconds2);
            nanos = ofSeconds.toNanos();
            d.a("initialBackoff must be greater than 0", nanos > 0);
            nanos2 = ofSeconds2.toNanos();
            d.a("maxBackoff must be greater than 0", nanos2 > 0);
            f8284c = c0992a;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb.append(" maxAttempts");
        }
        if ((b8 & 2) == 0) {
            sb.append(" backoffMultiplier");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public C0992a(Duration duration, Duration duration2) {
        this.f8285a = duration;
        this.f8286b = duration2;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0992a)) {
            return false;
        }
        C0992a c0992a = (C0992a) obj;
        c0992a.getClass();
        equals = this.f8285a.equals(c0992a.f8285a);
        if (!equals) {
            return false;
        }
        equals2 = this.f8286b.equals(c0992a.f8286b);
        return equals2 && Double.doubleToLongBits(1.5d) == Double.doubleToLongBits(1.5d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        hashCode = this.f8285a.hashCode();
        hashCode2 = this.f8286b.hashCode();
        return (((((hashCode ^ (-718379950)) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (Double.doubleToLongBits(1.5d) ^ (Double.doubleToLongBits(1.5d) >>> 32)))) * 1000003;
    }

    public final String toString() {
        return "RetryPolicy{maxAttempts=5, initialBackoff=" + this.f8285a + ", maxBackoff=" + this.f8286b + ", backoffMultiplier=1.5, retryExceptionPredicate=null}";
    }
}
