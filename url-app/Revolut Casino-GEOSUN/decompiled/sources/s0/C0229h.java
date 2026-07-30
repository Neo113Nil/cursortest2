package s0;

import java.util.List;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2896a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2897b;

    public C0229h(String str, boolean z2) {
        this.f2896a = str;
        this.f2897b = z2;
    }

    public final List a() {
        return v0.e.B(this.f2896a, Boolean.valueOf(this.f2897b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0229h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return o.g.k(a(), ((C0229h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f2896a + ", useDataStore=" + this.f2897b + ")";
    }
}
