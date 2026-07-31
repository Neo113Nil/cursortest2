package b1;

import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1615a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f1616b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1617a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1618b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1619c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1620d;

        public a(String str, String str2, long j7, long j8) {
            this.f1617a = str;
            this.f1618b = str2;
            this.f1619c = j7;
            this.f1620d = j8;
        }
    }

    public b(long j7, List<a> list) {
        this.f1615a = j7;
        this.f1616b = list;
    }

    public p1.b a(long j7) {
        long j8;
        if (this.f1616b.size() < 2) {
            return null;
        }
        long j9 = j7;
        long j10 = -1;
        long j11 = -1;
        long j12 = -1;
        long j13 = -1;
        boolean z6 = false;
        for (int size = this.f1616b.size() - 1; size >= 0; size--) {
            a aVar = this.f1616b.get(size);
            boolean equals = "video/mp4".equals(aVar.f1617a) | z6;
            if (size == 0) {
                j8 = j9 - aVar.f1620d;
                j9 = 0;
            } else {
                long j14 = j9;
                j9 -= aVar.f1619c;
                j8 = j14;
            }
            if (!equals || j9 == j8) {
                z6 = equals;
            } else {
                j13 = j8 - j9;
                j12 = j9;
                z6 = false;
            }
            if (size == 0) {
                j10 = j9;
                j11 = j8;
            }
        }
        if (j12 == -1 || j13 == -1 || j10 == -1 || j11 == -1) {
            return null;
        }
        return new p1.b(j10, j11, this.f1615a, j12, j13);
    }
}
