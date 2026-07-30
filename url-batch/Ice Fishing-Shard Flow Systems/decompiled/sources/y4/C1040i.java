package y4;

import z1.AbstractC1053a;

/* renamed from: y4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040i {

    /* renamed from: a, reason: collision with root package name */
    public final String f8591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8592b;

    public C1040i(String str, boolean z7) {
        this.f8591a = str;
        this.f8592b = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(C1040i.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1040i c1040i = (C1040i) obj;
        return AbstractC1053a.n(this.f8591a, c1040i.f8591a) && AbstractC1053a.n(Boolean.valueOf(this.f8592b), Boolean.valueOf(c1040i.f8592b));
    }

    public final int hashCode() {
        return AbstractC1053a.o(Boolean.valueOf(this.f8592b)) + ((AbstractC1053a.o(this.f8591a) + (C1040i.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f8591a + ", useDataStore=" + this.f8592b + ")";
    }
}
