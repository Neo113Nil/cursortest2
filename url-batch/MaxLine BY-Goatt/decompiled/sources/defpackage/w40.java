package defpackage;

import kotlin.coroutines.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w40 extends a {
    public static final u30 o = new u30(1);
    public final String n;

    public w40() {
        super(o);
        this.n = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w40) && Intrinsics.b(this.n, ((w40) obj).n);
    }

    public final int hashCode() {
        return this.n.hashCode();
    }

    public final String toString() {
        return in1.m(new StringBuilder("CoroutineName("), this.n, ')');
    }
}
