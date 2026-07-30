package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j50 extends ap {
    public final yn j;

    public j50(yn ynVar) {
        this.j = ynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j50) && Intrinsics.b(this.j, ((j50) obj).j);
    }

    public final int hashCode() {
        return Float.hashCode(this.j.a);
    }

    @Override // defpackage.ap
    public final int o(int i, u81 u81Var) {
        return this.j.a(0, i, u81Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.j + ')';
    }
}
