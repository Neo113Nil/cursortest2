package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzalr {
    public final int count;
    public final String name;
    private final double zzcsz;
    private final double zzcta;
    public final double zzctb;

    public zzalr(String str, double d2, double d3, double d4, int i) {
        this.name = str;
        this.zzcta = d2;
        this.zzcsz = d3;
        this.zzctb = d4;
        this.count = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzalr)) {
            return false;
        }
        zzalr zzalrVar = (zzalr) obj;
        return Objects.equal(this.name, zzalrVar.name) && this.zzcsz == zzalrVar.zzcsz && this.zzcta == zzalrVar.zzcta && this.count == zzalrVar.count && Double.compare(this.zzctb, zzalrVar.zzctb) == 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.name, Double.valueOf(this.zzcsz), Double.valueOf(this.zzcta), Double.valueOf(this.zzctb), Integer.valueOf(this.count));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("minBound", Double.valueOf(this.zzcta)).add("maxBound", Double.valueOf(this.zzcsz)).add("percent", Double.valueOf(this.zzctb)).add("count", Integer.valueOf(this.count)).toString();
    }
}
