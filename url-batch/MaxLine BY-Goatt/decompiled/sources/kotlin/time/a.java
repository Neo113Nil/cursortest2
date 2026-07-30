package kotlin.time;

import defpackage.re0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a implements Comparable<a> {
    public static final C0002a m = new C0002a(null);
    public static final long n;
    public static final long o;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0002a {
        public C0002a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i = re0.a;
        n = b.a(4611686018427387903L);
        o = b.a(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return b.a(d.d(j4, -4611686018427387903L, 4611686018427387903L));
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = re0.a;
        return j5;
    }

    public static final boolean b(long j) {
        return j == n || j == o;
    }
}
