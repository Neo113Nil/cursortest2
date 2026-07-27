package Z2;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final long f4649a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4650b;

    public O(long j4, long j5) {
        this.f4649a = j4;
        this.f4650b = j5;
        if (j4 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j4 + " ms) cannot be negative").toString());
        }
        if (j5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j5 + " ms) cannot be negative").toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O) {
            O o4 = (O) obj;
            if (this.f4649a == o4.f4649a && this.f4650b == o4.f4650b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4650b) + (Long.hashCode(this.f4649a) * 31);
    }

    public final String toString() {
        A2.d builder = new A2.d(2);
        long j4 = this.f4649a;
        if (j4 > 0) {
            builder.add("stopTimeout=" + j4 + "ms");
        }
        long j5 = this.f4650b;
        if (j5 < Long.MAX_VALUE) {
            builder.add("replayExpiration=" + j5 + "ms");
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.C();
        builder.f816i = true;
        if (builder.f815e <= 0) {
            builder = A2.d.f813j;
        }
        return AbstractC0017m.m(new StringBuilder("SharingStarted.WhileSubscribed("), C1403G.w(builder, null, null, null, null, 63), ')');
    }
}
