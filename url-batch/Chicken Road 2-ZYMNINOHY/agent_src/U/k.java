package U;

import W.J;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final k f3054e = new k(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f3055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3056b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3057c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3058d;

    public k(int i4, int i5, int i6) {
        this.f3055a = i4;
        this.f3056b = i5;
        this.f3057c = i6;
        this.f3058d = J.H(i6) ? J.s(i6) * i5 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3055a == kVar.f3055a && this.f3056b == kVar.f3056b && this.f3057c == kVar.f3057c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3055a), Integer.valueOf(this.f3056b), Integer.valueOf(this.f3057c));
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f3055a + ", channelCount=" + this.f3056b + ", encoding=" + this.f3057c + ']';
    }
}
