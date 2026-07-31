package B0;

import a.AbstractC0086a;
import java.util.List;

/* renamed from: B0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public final String f87a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88b;

    public C0009j(String str, boolean z2) {
        this.f87a = str;
        this.f88b = z2;
    }

    public final List a() {
        return E0.g.O(this.f87a, Boolean.valueOf(this.f88b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0009j)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC0086a.n(a(), ((C0009j) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f87a + ", useDataStore=" + this.f88b + ")";
    }
}
