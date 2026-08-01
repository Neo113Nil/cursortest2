package c7;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1943b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1944c;

    public l0(String str, boolean z10) {
        c0.d(str);
        this.f1942a = str;
        c0.d("com.google.android.gms");
        this.f1943b = "com.google.android.gms";
        this.f1944c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return c0.k(this.f1942a, l0Var.f1942a) && c0.k(this.f1943b, l0Var.f1943b) && c0.k(null, null) && this.f1944c == l0Var.f1944c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1942a, this.f1943b, null, 4225, Boolean.valueOf(this.f1944c)});
    }

    public final String toString() {
        String str = this.f1942a;
        if (str != null) {
            return str;
        }
        c0.g(null);
        throw null;
    }
}
