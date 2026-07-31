package t;

import j.AbstractC0521C;
import j.C0549w;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final C0549w f8455a;

    /* renamed from: b, reason: collision with root package name */
    public final C0549w f8456b;

    /* renamed from: c, reason: collision with root package name */
    public long f8457c;

    /* renamed from: d, reason: collision with root package name */
    public long f8458d;

    public K() {
        int i3 = AbstractC0521C.f6253a;
        this.f8455a = new C0549w(6);
        this.f8456b = new C0549w(6);
    }

    public static final long a(K k3, long j3, long j4) {
        k3.getClass();
        if (j4 == 0) {
            return j3;
        }
        long j5 = 4;
        return (j3 / j5) + ((j4 / j5) * 3);
    }
}
