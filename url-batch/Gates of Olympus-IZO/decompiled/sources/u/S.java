package u;

import j.AbstractC0477C;
import j.C0505w;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final C0505w f8044a;

    /* renamed from: b, reason: collision with root package name */
    public final C0505w f8045b;

    /* renamed from: c, reason: collision with root package name */
    public long f8046c;

    /* renamed from: d, reason: collision with root package name */
    public long f8047d;

    public S() {
        int i3 = AbstractC0477C.f5135a;
        this.f8044a = new C0505w(6);
        this.f8045b = new C0505w(6);
    }

    public static final long a(S s3, long j3, long j4) {
        s3.getClass();
        if (j4 == 0) {
            return j3;
        }
        long j5 = 4;
        return (j3 / j5) + ((j4 / j5) * 3);
    }
}
