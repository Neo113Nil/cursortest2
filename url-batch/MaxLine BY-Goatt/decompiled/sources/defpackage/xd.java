package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xd {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public xd(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        i21.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return Intrinsics.b(this.a, xdVar.a) && this.b == xdVar.b && this.c == xdVar.c && Intrinsics.b(this.d, xdVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + q40.e(this.c, q40.e(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return in1.m(sb, this.d, ')');
    }

    public xd(int i, int i2, Object obj) {
        this(i, i2, obj, BuildConfig.FLAVOR);
    }
}
