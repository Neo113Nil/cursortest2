package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k50 extends ap {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k50)) {
            return false;
        }
        zn znVar = qb2.y;
        return znVar.equals(znVar);
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f);
    }

    @Override // defpackage.ap
    public final int o(int i, u81 u81Var) {
        return Math.round((1.0f - 1.0f) * ((i + 0) / 2.0f));
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + qb2.y + ')';
    }
}
