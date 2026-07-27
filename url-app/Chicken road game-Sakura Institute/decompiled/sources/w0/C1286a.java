package w0;

import A.AbstractC0017m;
import f0.C0585f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1286a {

    /* renamed from: a, reason: collision with root package name */
    public final C0585f f11372a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11373b;

    public C1286a(C0585f c0585f, int i2) {
        this.f11372a = c0585f;
        this.f11373b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1286a)) {
            return false;
        }
        C1286a c1286a = (C1286a) obj;
        return Intrinsics.a(this.f11372a, c1286a.f11372a) && this.f11373b == c1286a.f11373b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11373b) + (this.f11372a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f11372a);
        sb.append(", configFlags=");
        return AbstractC0017m.l(sb, this.f11373b, ')');
    }
}
