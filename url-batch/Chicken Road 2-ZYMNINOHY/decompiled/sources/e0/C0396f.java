package e0;

import java.util.Objects;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396f {

    /* renamed from: a, reason: collision with root package name */
    public final String f8371a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8372b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8373c;

    public C0396f(String str, String str2, String str3) {
        this.f8371a = str;
        this.f8372b = str2;
        this.f8373c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0396f.class == obj.getClass()) {
            C0396f c0396f = (C0396f) obj;
            if (Objects.equals(this.f8371a, c0396f.f8371a) && Objects.equals(this.f8372b, c0396f.f8372b) && Objects.equals(this.f8373c, c0396f.f8373c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f8371a.hashCode() * 31;
        String str = this.f8372b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8373c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
