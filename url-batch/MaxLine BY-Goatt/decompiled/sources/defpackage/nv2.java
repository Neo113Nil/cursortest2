package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class nv2 {
    public final yd a;
    public final long b;
    public final jw2 c;

    public nv2(yd ydVar, long j, jw2 jw2Var) {
        this.a = ydVar;
        this.b = th2.b(j, ydVar.n.length());
        this.c = jw2Var != null ? new jw2(th2.b(jw2Var.a, ydVar.n.length())) : null;
    }

    public static nv2 a(nv2 nv2Var, yd ydVar, long j, int i) {
        if ((i & 1) != 0) {
            ydVar = nv2Var.a;
        }
        if ((i & 2) != 0) {
            j = nv2Var.b;
        }
        jw2 jw2Var = (i & 4) != 0 ? nv2Var.c : null;
        nv2Var.getClass();
        return new nv2(ydVar, j, jw2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv2)) {
            return false;
        }
        nv2 nv2Var = (nv2) obj;
        return jw2.a(this.b, nv2Var.b) && Intrinsics.b(this.c, nv2Var.c) && Intrinsics.b(this.a, nv2Var.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = jw2.c;
        int h = in1.h(hashCode, 31, this.b);
        jw2 jw2Var = this.c;
        return h + (jw2Var != null ? Long.hashCode(jw2Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) jw2.g(this.b)) + ", composition=" + this.c + ')';
    }

    public nv2(String str, int i, long j) {
        this(new yd((i & 1) != 0 ? BuildConfig.FLAVOR : str), (i & 2) != 0 ? jw2.b : j, (jw2) null);
    }
}
