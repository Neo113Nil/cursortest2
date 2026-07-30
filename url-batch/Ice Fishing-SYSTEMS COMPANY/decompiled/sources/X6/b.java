package X6;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3838b = new b(Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final int f3839a;

    public b(int i) {
        this.f3839a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f3839a == bVar.f3839a;
    }

    public final int hashCode() {
        return (-593379575) ^ this.f3839a;
    }

    public final String toString() {
        return AbstractC5051n.e(this.f3839a, "}", new StringBuilder("LogLimits{maxNumberOfAttributes=128, maxAttributeValueLength="));
    }
}
