package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cb0 {
    public final boolean a;
    public final boolean b;
    public final jg2 c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public cb0() {
        jg2 jg2Var = jg2.m;
        this.a = true;
        this.b = true;
        this.c = jg2Var;
        this.d = true;
        this.e = true;
        this.f = BuildConfig.FLAVOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return this.a == cb0Var.a && this.b == cb0Var.b && this.c == cb0Var.c && this.d == cb0Var.d && this.e == cb0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + in1.i((this.c.hashCode() + in1.i(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }
}
