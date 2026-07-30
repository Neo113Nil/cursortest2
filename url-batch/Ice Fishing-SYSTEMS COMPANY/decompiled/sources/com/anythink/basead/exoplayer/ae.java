package com.anythink.basead.exoplayer;

import android.util.Pair;
import com.anythink.basead.exoplayer.h.a.a;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public abstract class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f6498a = new ae() { // from class: com.anythink.basead.exoplayer.ae.1
        @Override // com.anythink.basead.exoplayer.ae
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int b() {
            return 0;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final int c() {
            return 0;
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final b a(int i, b bVar, boolean z8, long j9) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.anythink.basead.exoplayer.ae
        public final a a(int i, a aVar, boolean z8) {
            throw new IndexOutOfBoundsException();
        }
    };

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f6499a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6500b;

        /* renamed from: c, reason: collision with root package name */
        public int f6501c;

        /* renamed from: d, reason: collision with root package name */
        public long f6502d;

        /* renamed from: e, reason: collision with root package name */
        private long f6503e;

        /* renamed from: f, reason: collision with root package name */
        private com.anythink.basead.exoplayer.h.a.a f6504f;

        private long e() {
            return com.anythink.basead.exoplayer.b.a(this.f6502d);
        }

        private long f() {
            return this.f6502d;
        }

        public final a a(Object obj, Object obj2, long j9, long j10) {
            return a(obj, obj2, 0, j9, j10, com.anythink.basead.exoplayer.h.a.a.f7566f);
        }

        public final long b() {
            return this.f6503e;
        }

        public final int c() {
            return this.f6504f.f7567g;
        }

        public final int d(int i) {
            return this.f6504f.i[i].f7571a;
        }

        public final a a(Object obj, Object obj2, int i, long j9, long j10, com.anythink.basead.exoplayer.h.a.a aVar) {
            this.f6499a = obj;
            this.f6500b = obj2;
            this.f6501c = i;
            this.f6502d = j9;
            this.f6503e = j10;
            this.f6504f = aVar;
            return this;
        }

        public final int b(int i) {
            return this.f6504f.i[i].a(-1);
        }

        public final boolean c(int i) {
            return !this.f6504f.i[i].a();
        }

        public final long d() {
            return this.f6504f.f7569j;
        }

        public final long c(int i, int i4) {
            a.C0025a c0025a = this.f6504f.i[i];
            return c0025a.f7571a != -1 ? c0025a.f7574d[i4] : com.anythink.basead.exoplayer.b.f6539b;
        }

        public final int b(long j9) {
            com.anythink.basead.exoplayer.h.a.a aVar = this.f6504f;
            int i = 0;
            while (true) {
                long[] jArr = aVar.f7568h;
                if (i >= jArr.length) {
                    break;
                }
                long j10 = jArr[i];
                if (j10 == Long.MIN_VALUE || (j9 < j10 && aVar.i[i].a())) {
                    break;
                }
                i++;
            }
            if (i < aVar.f7568h.length) {
                return i;
            }
            return -1;
        }

        public final long a() {
            return com.anythink.basead.exoplayer.b.a(this.f6503e);
        }

        public final boolean b(int i, int i4) {
            a.C0025a c0025a = this.f6504f.i[i];
            return (c0025a.f7571a == -1 || c0025a.f7573c[i4] == 0) ? false : true;
        }

        public final long a(int i) {
            return this.f6504f.f7568h[i];
        }

        public final int a(int i, int i4) {
            return this.f6504f.i[i].a(i4);
        }

        public final int a(long j9) {
            com.anythink.basead.exoplayer.h.a.a aVar = this.f6504f;
            int length = aVar.f7568h.length - 1;
            while (length >= 0) {
                long j10 = aVar.f7568h[length];
                if (j10 != Long.MIN_VALUE && j10 <= j9) {
                    break;
                }
                length--;
            }
            if (length < 0 || !aVar.i[length].a()) {
                return -1;
            }
            return length;
        }
    }

    public abstract int a(Object obj);

    public abstract a a(int i, a aVar, boolean z8);

    public abstract b a(int i, b bVar, boolean z8, long j9);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public int b(int i, int i4, boolean z8) {
        if (i4 == 0) {
            if (i == b(z8)) {
                return -1;
            }
            return i - 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == b(z8) ? a(z8) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract int c();

    public int a(int i, int i4, boolean z8) {
        if (i4 == 0) {
            if (i == a(z8)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == a(z8) ? b(z8) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int b(boolean z8) {
        return a() ? -1 : 0;
    }

    public int a(boolean z8) {
        if (a()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean b(int i, a aVar, b bVar, int i4, boolean z8) {
        return a(i, aVar, bVar, i4, z8) == -1;
    }

    private b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public final b a(int i, b bVar, boolean z8) {
        return a(i, bVar, z8, 0L);
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j9) {
        return a(bVar, aVar, i, j9, 0L);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f6505a;

        /* renamed from: b, reason: collision with root package name */
        public long f6506b;

        /* renamed from: c, reason: collision with root package name */
        public long f6507c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f6508d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6509e;

        /* renamed from: f, reason: collision with root package name */
        public int f6510f;

        /* renamed from: g, reason: collision with root package name */
        public int f6511g;

        /* renamed from: h, reason: collision with root package name */
        public long f6512h;
        public long i;

        /* renamed from: j, reason: collision with root package name */
        public long f6513j;

        private long b() {
            return this.f6512h;
        }

        private long c() {
            return com.anythink.basead.exoplayer.b.a(this.i);
        }

        private long d() {
            return this.i;
        }

        private long e() {
            return com.anythink.basead.exoplayer.b.a(this.f6513j);
        }

        private long f() {
            return this.f6513j;
        }

        public final b a(Object obj, long j9, long j10, boolean z8, boolean z9, long j11, long j12, long j13) {
            this.f6505a = obj;
            this.f6506b = j9;
            this.f6507c = j10;
            this.f6508d = z8;
            this.f6509e = z9;
            this.f6512h = j11;
            this.i = j12;
            this.f6510f = 0;
            this.f6511g = 0;
            this.f6513j = j13;
            return this;
        }

        private long a() {
            return com.anythink.basead.exoplayer.b.a(this.f6512h);
        }
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j9, long j10) {
        C0544a.a(i, b());
        a(i, bVar, false, j10);
        if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
            j9 = bVar.f6512h;
            if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                return null;
            }
        }
        int i4 = bVar.f6510f;
        long j11 = bVar.f6513j + j9;
        long j12 = a(i4, aVar, false).f6502d;
        while (j12 != com.anythink.basead.exoplayer.b.f6539b && j11 >= j12 && i4 < bVar.f6511g) {
            j11 -= j12;
            i4++;
            j12 = a(i4, aVar, false).f6502d;
        }
        return Pair.create(Integer.valueOf(i4), Long.valueOf(j11));
    }

    private a a(int i, a aVar) {
        return a(i, aVar, false);
    }

    public final int a(int i, a aVar, b bVar, int i4, boolean z8) {
        int i9 = a(i, aVar, false).f6501c;
        if (a(i9, bVar, false).f6511g != i) {
            return i + 1;
        }
        int a9 = a(i9, i4, z8);
        if (a9 == -1) {
            return -1;
        }
        return a(a9, bVar, false).f6510f;
    }
}
