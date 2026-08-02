package c0;

import android.os.Build;
import java.util.Objects;
import java.util.Set;
import v2.p0;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269b {

    /* renamed from: d, reason: collision with root package name */
    public static final C0269b f5538d;

    /* renamed from: a, reason: collision with root package name */
    public final int f5539a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5540b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.M f5541c;

    static {
        C0269b c0269b;
        if (Build.VERSION.SDK_INT >= 33) {
            v2.L l4 = new v2.L(4);
            for (int i4 = 1; i4 <= 10; i4++) {
                l4.b(Integer.valueOf(W.J.r(i4)));
            }
            c0269b = new C0269b(2, l4.f());
        } else {
            c0269b = new C0269b(2, 10);
        }
        f5538d = c0269b;
    }

    public C0269b(int i4, Set set) {
        this.f5539a = i4;
        v2.M k4 = v2.M.k(set);
        this.f5541c = k4;
        p0 it = k4.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 = Math.max(i5, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f5540b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0269b)) {
            return false;
        }
        C0269b c0269b = (C0269b) obj;
        return this.f5539a == c0269b.f5539a && this.f5540b == c0269b.f5540b && Objects.equals(this.f5541c, c0269b.f5541c);
    }

    public final int hashCode() {
        int i4 = ((this.f5539a * 31) + this.f5540b) * 31;
        v2.M m4 = this.f5541c;
        return i4 + (m4 == null ? 0 : m4.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f5539a + ", maxChannelCount=" + this.f5540b + ", channelMasks=" + this.f5541c + "]";
    }

    public C0269b(int i4, int i5) {
        this.f5539a = i4;
        this.f5540b = i5;
        this.f5541c = null;
    }
}
