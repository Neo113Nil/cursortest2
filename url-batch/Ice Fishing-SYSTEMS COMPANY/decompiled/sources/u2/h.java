package u2;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f41239a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41240b;

    /* renamed from: c, reason: collision with root package name */
    public final double f41241c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f41242d;

    public h(int i, int i4, double d2, boolean z8) {
        this.f41239a = i;
        this.f41240b = i4;
        this.f41241c = d2;
        this.f41242d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f41239a == hVar.f41239a && this.f41240b == hVar.f41240b && Double.doubleToLongBits(this.f41241c) == Double.doubleToLongBits(hVar.f41241c) && this.f41242d == hVar.f41242d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d2 = this.f41241c;
        return ((((int) (Double.doubleToLongBits(d2) ^ (Double.doubleToLongBits(d2) >>> 32))) ^ ((((this.f41239a ^ 1000003) * 1000003) ^ this.f41240b) * 1000003)) * 1000003) ^ (true != this.f41242d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f41239a;
        int length = String.valueOf(i).length();
        int i4 = this.f41240b;
        int length2 = String.valueOf(i4).length();
        double d2 = this.f41241c;
        int length3 = String.valueOf(d2).length();
        boolean z8 = this.f41242d;
        StringBuilder sb = new StringBuilder(length + 44 + length2 + 20 + length3 + 25 + String.valueOf(z8).length() + 1);
        AbstractC5051n.i(sb, "PingStrategy{maxAttempts=", i, ", initialBackoffMs=", i4);
        sb.append(", backoffMultiplier=");
        sb.append(d2);
        sb.append(", bufferAfterMaxAttempts=");
        sb.append(z8);
        sb.append("}");
        return sb.toString();
    }
}
