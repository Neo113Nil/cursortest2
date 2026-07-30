package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mw2 {
    public final String a;
    public String b;
    public boolean c = false;
    public dz1 d = null;

    public mw2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw2)) {
            return false;
        }
        mw2 mw2Var = (mw2) obj;
        return Intrinsics.b(this.a, mw2Var.a) && Intrinsics.b(this.b, mw2Var.b) && this.c == mw2Var.c && Intrinsics.b(this.d, mw2Var.d);
    }

    public final int hashCode() {
        int i = in1.i(in1.j(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        dz1 dz1Var = this.d;
        return i + (dz1Var == null ? 0 : dz1Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
