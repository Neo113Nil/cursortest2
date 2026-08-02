package T;

import java.util.Objects;

/* renamed from: T.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099q {

    /* renamed from: a, reason: collision with root package name */
    public final String f2879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2880b;

    static {
        W.J.G(0);
        W.J.G(1);
    }

    public C0099q(String str, String str2) {
        this.f2879a = W.J.N(str);
        this.f2880b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0099q.class == obj.getClass()) {
            C0099q c0099q = (C0099q) obj;
            if (Objects.equals(this.f2879a, c0099q.f2879a) && Objects.equals(this.f2880b, c0099q.f2880b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2880b.hashCode() * 31;
        String str = this.f2879a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
