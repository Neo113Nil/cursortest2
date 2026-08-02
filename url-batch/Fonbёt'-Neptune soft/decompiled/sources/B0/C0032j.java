package B0;

/* renamed from: B0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032j {

    /* renamed from: a, reason: collision with root package name */
    public final String f157a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158b;

    public C0032j(String str, boolean z2) {
        this.f157a = str;
        this.f158b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0032j)) {
            return false;
        }
        C0032j c0032j = (C0032j) obj;
        return Q0.h.a(this.f157a, c0032j.f157a) && this.f158b == c0032j.f158b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.f157a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z2 = this.f158b;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f157a + ", useDataStore=" + this.f158b + ")";
    }
}
