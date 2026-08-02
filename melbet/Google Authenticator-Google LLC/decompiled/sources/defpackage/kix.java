package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kix {
    static final jwv a = new jwv("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final kkz f;
    final khe g;

    public kix(Map map, boolean z, int i, int i2) {
        boolean z2;
        long j;
        kkz kkzVar;
        khe kheVar;
        this.b = ixb.d(map, "timeout");
        this.c = ixb.a(map, "waitForReady");
        Integer c = ixb.c(map, "maxResponseMessageBytes");
        this.d = c;
        if (c != null) {
            hoq.C(c.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", c);
        }
        Integer c2 = ixb.c(map, "maxRequestMessageBytes");
        this.e = c2;
        if (c2 != null) {
            hoq.C(c2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", c2);
        }
        Map i3 = z ? ixb.i(map, "retryPolicy") : null;
        if (i3 == null) {
            j = 0;
            kkzVar = null;
            z2 = true;
        } else {
            Integer c3 = ixb.c(i3, "maxAttempts");
            c3.getClass();
            int intValue = c3.intValue();
            hoq.A(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long d = ixb.d(i3, "initialBackoff");
            d.getClass();
            long longValue = d.longValue();
            hoq.B(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long d2 = ixb.d(i3, "maxBackoff");
            d2.getClass();
            z2 = true;
            long longValue2 = d2.longValue();
            hoq.B(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double b = ixb.b(i3, "backoffMultiplier");
            b.getClass();
            double doubleValue = b.doubleValue();
            j = 0;
            hoq.C(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", b);
            Long d3 = ixb.d(i3, "perAttemptRecvTimeout");
            hoq.C(d3 == null || d3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", d3);
            Set a2 = kmf.a(i3, "retryableStatusCodes");
            hoq.t(a2 != null, "%s is required in retry policy", "retryableStatusCodes");
            hoq.t(!a2.contains(kbn.OK), "%s must not contain OK", "retryableStatusCodes");
            hoq.y((d3 == null && a2.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            kkzVar = new kkz(min, longValue, longValue2, doubleValue, d3, a2);
        }
        this.f = kkzVar;
        Map i4 = z ? ixb.i(map, "hedgingPolicy") : null;
        if (i4 == null) {
            kheVar = null;
        } else {
            Integer c4 = ixb.c(i4, "maxAttempts");
            c4.getClass();
            int intValue2 = c4.intValue();
            hoq.A(intValue2 >= 2 ? z2 : false, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, i2);
            Long d4 = ixb.d(i4, "hedgingDelay");
            d4.getClass();
            long longValue3 = d4.longValue();
            hoq.B(longValue3 >= j ? z2 : false, "hedgingDelay must not be negative: %s", longValue3);
            Set a3 = kmf.a(i4, "nonFatalStatusCodes");
            if (a3 == null) {
                a3 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(kbn.class));
            } else {
                hoq.t(!a3.contains(kbn.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            kheVar = new khe(min2, longValue3, a3);
        }
        this.g = kheVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kix)) {
            return false;
        }
        kix kixVar = (kix) obj;
        return Objects.equals(this.b, kixVar.b) && Objects.equals(this.c, kixVar.c) && Objects.equals(this.d, kixVar.d) && Objects.equals(this.e, kixVar.e) && Objects.equals(this.f, kixVar.f) && Objects.equals(this.g, kixVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("timeoutNanos", this.b);
        T.b("waitForReady", this.c);
        T.b("maxInboundMessageSize", this.d);
        T.b("maxOutboundMessageSize", this.e);
        T.b("retryPolicy", this.f);
        T.b("hedgingPolicy", this.g);
        return T.toString();
    }
}
