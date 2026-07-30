package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class to {
    public y9 a = null;
    public y6 b = null;
    public ns c = null;
    public oa d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to)) {
            return false;
        }
        to toVar = (to) obj;
        return Intrinsics.b(this.a, toVar.a) && Intrinsics.b(this.b, toVar.b) && Intrinsics.b(this.c, toVar.c) && Intrinsics.b(this.d, toVar.d);
    }

    public final int hashCode() {
        y9 y9Var = this.a;
        int hashCode = (y9Var == null ? 0 : y9Var.hashCode()) * 31;
        y6 y6Var = this.b;
        int hashCode2 = (hashCode + (y6Var == null ? 0 : y6Var.hashCode())) * 31;
        ns nsVar = this.c;
        int hashCode3 = (hashCode2 + (nsVar == null ? 0 : nsVar.hashCode())) * 31;
        oa oaVar = this.d;
        return hashCode3 + (oaVar != null ? oaVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
