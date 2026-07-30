package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class ME extends AE {

    /* renamed from: a, reason: collision with root package name */
    public final int f26313a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26314b;

    /* renamed from: c, reason: collision with root package name */
    public final LE f26315c;

    public ME(int i, int i4, LE le) {
        this.f26313a = i;
        this.f26314b = i4;
        this.f26315c = le;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f26315c != LE.f26126x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ME)) {
            return false;
        }
        ME me = (ME) obj;
        return me.f26313a == this.f26313a && me.f26314b == this.f26314b && me.f26315c == this.f26315c;
    }

    public final int hashCode() {
        return Objects.hash(ME.class, Integer.valueOf(this.f26313a), Integer.valueOf(this.f26314b), 16, this.f26315c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f26315c);
        int length = valueOf.length();
        int i = this.f26314b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i4 = this.f26313a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i4).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        return AbstractC5051n.d(i4, "-byte IV, 16-byte tag, and ", "-byte key)", sb);
    }
}
