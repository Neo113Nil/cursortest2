package defpackage;

import com.google.firebase.messaging.ServiceStarter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jq0 implements Comparable {
    public static final jq0 n;
    public static final jq0 o;
    public static final jq0 p;
    public static final jq0 q;
    public static final jq0 r;
    public static final jq0 s;
    public static final jq0 t;
    public static final jq0 u;
    public final int m;

    static {
        jq0 jq0Var = new jq0(100);
        jq0 jq0Var2 = new jq0(200);
        jq0 jq0Var3 = new jq0(300);
        jq0 jq0Var4 = new jq0(400);
        n = jq0Var4;
        jq0 jq0Var5 = new jq0(ServiceStarter.ERROR_UNKNOWN);
        o = jq0Var5;
        jq0 jq0Var6 = new jq0(600);
        p = jq0Var6;
        jq0 jq0Var7 = new jq0(700);
        jq0 jq0Var8 = new jq0(800);
        jq0 jq0Var9 = new jq0(900);
        q = jq0Var4;
        r = jq0Var5;
        s = jq0Var6;
        t = jq0Var7;
        u = jq0Var8;
        qv.g(jq0Var, jq0Var2, jq0Var3, jq0Var4, jq0Var5, jq0Var6, jq0Var7, jq0Var8, jq0Var9);
    }

    public jq0(int i) {
        this.m = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        i21.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jq0 jq0Var) {
        return Intrinsics.c(this.m, jq0Var.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jq0) {
            return this.m == ((jq0) obj).m;
        }
        return false;
    }

    public final int hashCode() {
        return this.m;
    }

    public final String toString() {
        return q40.o(new StringBuilder("FontWeight(weight="), this.m, ')');
    }
}
