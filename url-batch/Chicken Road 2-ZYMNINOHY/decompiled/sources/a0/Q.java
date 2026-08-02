package a0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final long f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3986b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3987c;

    public Q(P p2) {
        this.f3985a = p2.f3982a;
        this.f3986b = p2.f3983b;
        this.f3987c = p2.f3984c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q4 = (Q) obj;
        return this.f3985a == q4.f3985a && this.f3986b == q4.f3986b && this.f3987c == q4.f3987c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f3985a), Float.valueOf(this.f3986b), Long.valueOf(this.f3987c));
    }
}
