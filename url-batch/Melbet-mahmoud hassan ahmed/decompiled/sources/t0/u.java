package t0;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import o2.m0;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final a f21838a;

    /* renamed from: b, reason: collision with root package name */
    private int f21839b;

    /* renamed from: c, reason: collision with root package name */
    private long f21840c;

    /* renamed from: d, reason: collision with root package name */
    private long f21841d;

    /* renamed from: e, reason: collision with root package name */
    private long f21842e;

    /* renamed from: f, reason: collision with root package name */
    private long f21843f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f21844a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f21845b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f21846c;

        /* renamed from: d, reason: collision with root package name */
        private long f21847d;

        /* renamed from: e, reason: collision with root package name */
        private long f21848e;

        public a(AudioTrack audioTrack) {
            this.f21844a = audioTrack;
        }

        public long a() {
            return this.f21848e;
        }

        public long b() {
            return this.f21845b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f21844a.getTimestamp(this.f21845b);
            if (timestamp) {
                long j7 = this.f21845b.framePosition;
                if (this.f21847d > j7) {
                    this.f21846c++;
                }
                this.f21847d = j7;
                this.f21848e = j7 + (this.f21846c << 32);
            }
            return timestamp;
        }
    }

    public u(AudioTrack audioTrack) {
        if (m0.f19752a >= 19) {
            this.f21838a = new a(audioTrack);
            g();
        } else {
            this.f21838a = null;
            h(3);
        }
    }

    private void h(int i7) {
        this.f21839b = i7;
        long j7 = 10000;
        if (i7 == 0) {
            this.f21842e = 0L;
            this.f21843f = -1L;
            this.f21840c = System.nanoTime() / 1000;
        } else if (i7 != 1) {
            if (i7 == 2 || i7 == 3) {
                j7 = 10000000;
            } else {
                if (i7 != 4) {
                    throw new IllegalStateException();
                }
                j7 = 500000;
            }
        }
        this.f21841d = j7;
    }

    public void a() {
        if (this.f21839b == 4) {
            g();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f21838a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f21838a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public boolean d() {
        return this.f21839b == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0 == false) goto L26;
     */
    @TargetApi(19)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(long j7) {
        a aVar = this.f21838a;
        if (aVar == null || j7 - this.f21842e < this.f21841d) {
            return false;
        }
        this.f21842e = j7;
        boolean c7 = aVar.c();
        int i7 = this.f21839b;
        if (i7 != 0) {
            if (i7 == 1) {
                if (c7) {
                    if (this.f21838a.a() > this.f21843f) {
                        h(2);
                    }
                }
                g();
            } else if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                }
            }
        } else if (c7) {
            if (this.f21838a.b() < this.f21840c) {
                return false;
            }
            this.f21843f = this.f21838a.a();
            h(1);
        } else if (j7 - this.f21840c > 500000) {
            h(3);
        }
        return c7;
    }

    public void f() {
        h(4);
    }

    public void g() {
        if (this.f21838a != null) {
            h(0);
        }
    }
}
