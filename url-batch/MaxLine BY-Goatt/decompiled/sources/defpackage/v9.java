package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v9 implements c22 {
    public final int m;

    public v9(int i) {
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9) && this.m == ((v9) obj).m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m);
    }

    public final String toString() {
        return q40.o(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.m, ')');
    }
}
