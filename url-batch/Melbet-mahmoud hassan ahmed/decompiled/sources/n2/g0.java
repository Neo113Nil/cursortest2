package n2;

import java.io.IOException;

/* loaded from: classes.dex */
public interface g0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f19418a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19419b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19420c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19421d;

        public a(int i7, int i8, int i9, int i10) {
            this.f19418a = i7;
            this.f19419b = i8;
            this.f19420c = i9;
            this.f19421d = i10;
        }

        public boolean a(int i7) {
            if (i7 == 1) {
                if (this.f19418a - this.f19419b <= 1) {
                    return false;
                }
            } else if (this.f19420c - this.f19421d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f19422a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19423b;

        public b(int i7, long j7) {
            o2.a.a(j7 >= 0);
            this.f19422a = i7;
            this.f19423b = j7;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final t1.q f19424a;

        /* renamed from: b, reason: collision with root package name */
        public final t1.t f19425b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f19426c;

        /* renamed from: d, reason: collision with root package name */
        public final int f19427d;

        public c(t1.q qVar, t1.t tVar, IOException iOException, int i7) {
            this.f19424a = qVar;
            this.f19425b = tVar;
            this.f19426c = iOException;
            this.f19427d = i7;
        }
    }

    void a(long j7);

    b b(a aVar, c cVar);

    long c(c cVar);

    int d(int i7);
}
