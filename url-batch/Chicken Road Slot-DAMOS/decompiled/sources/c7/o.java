package c7;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements a7.b {

    /* renamed from: c, reason: collision with root package name */
    public static final o f1959c = new o(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f1960b;

    public /* synthetic */ o(String str) {
        this.f1960b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return c0.k(this.f1960b, ((o) obj).f1960b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1960b});
    }
}
