package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dic {
    public static final boolean a(int i) {
        return (i & 1) != 0;
    }

    public static final boolean b(int i) {
        return (i & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int c(int i, int i2, boolean z, boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = i >> 2;
        }
        int i4 = z;
        if ((i3 & 2) != 0) {
            i4 = b(i);
        }
        int i5 = z2;
        if ((i3 & 4) != 0) {
            i5 = a(i);
        }
        int i6 = (i2 + i2) | i4;
        return (i6 + i6) | i5;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
