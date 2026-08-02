package W1;

import java.util.List;

/* renamed from: W1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1673a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1674b;

    public C0096h(String str, boolean z) {
        this.f1673a = str;
        this.f1674b = z;
    }

    public final List a() {
        return c2.f.L(this.f1673a, Boolean.valueOf(this.f1674b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0096h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C2.b.l(a(), ((C0096h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f1673a + ", useDataStore=" + this.f1674b + ")";
    }
}
