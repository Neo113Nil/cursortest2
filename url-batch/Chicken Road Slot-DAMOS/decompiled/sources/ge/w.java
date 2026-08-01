package ge;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends kotlin.coroutines.a {

    /* renamed from: i, reason: collision with root package name */
    public static final u f4409i = new u();

    /* renamed from: e, reason: collision with root package name */
    public final String f4410e;

    public w() {
        super(f4409i);
        this.f4410e = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.a(this.f4410e, ((w) obj).f4410e);
    }

    public final int hashCode() {
        return this.f4410e.hashCode();
    }

    public final String toString() {
        return n0.l.h(new StringBuilder("CoroutineName("), this.f4410e, ')');
    }
}
