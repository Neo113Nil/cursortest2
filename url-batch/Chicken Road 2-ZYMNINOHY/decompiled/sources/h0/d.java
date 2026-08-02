package h0;

import a.AbstractC0124a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f9067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9068b;

    /* renamed from: c, reason: collision with root package name */
    public final double f9069c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9070d;

    public d(String str, double d4) {
        this.f9067a = str;
        this.f9068b = 2;
        this.f9069c = d4;
        this.f9070d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9068b == dVar.f9068b && Double.compare(this.f9069c, dVar.f9069c) == 0 && Objects.equals(this.f9067a, dVar.f9067a) && Objects.equals(this.f9070d, dVar.f9070d);
    }

    public final int hashCode() {
        return Objects.hash(this.f9067a, Integer.valueOf(this.f9068b), Double.valueOf(this.f9069c), this.f9070d);
    }

    public d(String str, String str2, int i4) {
        boolean z = true;
        if (i4 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        AbstractC0124a.t(z);
        this.f9067a = str;
        this.f9068b = i4;
        this.f9070d = str2;
        this.f9069c = 0.0d;
    }
}
