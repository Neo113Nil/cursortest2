package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: com.yandex.mobile.ads.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2071lh {

    /* renamed from: a, reason: collision with root package name */
    private final a f28569a;

    /* renamed from: b, reason: collision with root package name */
    private int f28570b;

    /* renamed from: c, reason: collision with root package name */
    private long f28571c;

    /* renamed from: d, reason: collision with root package name */
    private long f28572d;

    /* renamed from: e, reason: collision with root package name */
    private long f28573e;

    /* renamed from: f, reason: collision with root package name */
    private long f28574f;

    /* renamed from: com.yandex.mobile.ads.impl.lh$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f28575a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f28576b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f28577c;

        /* renamed from: d, reason: collision with root package name */
        private long f28578d;

        /* renamed from: e, reason: collision with root package name */
        private long f28579e;

        public a(AudioTrack audioTrack) {
            this.f28575a = audioTrack;
        }

        public final boolean b() {
            boolean timestamp = this.f28575a.getTimestamp(this.f28576b);
            if (timestamp) {
                long j4 = this.f28576b.framePosition;
                if (this.f28578d > j4) {
                    this.f28577c++;
                }
                this.f28578d = j4;
                this.f28579e = j4 + (this.f28577c << 32);
            }
            return timestamp;
        }

        public final long a() {
            return this.f28576b.nanoTime / 1000;
        }
    }

    public C2071lh(AudioTrack audioTrack) {
        if (u82.f32873a >= 19) {
            this.f28569a = new a(audioTrack);
            f();
        } else {
            this.f28569a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.f28570b == 4) {
            f();
        }
    }

    @TargetApi(19)
    public final long b() {
        a aVar = this.f28569a;
        if (aVar != null) {
            return aVar.f28579e;
        }
        return -1L;
    }

    @TargetApi(19)
    public final long c() {
        a aVar = this.f28569a;
        if (aVar != null) {
            return aVar.a();
        }
        return -9223372036854775807L;
    }

    public final boolean d() {
        return this.f28570b == 2;
    }

    public final void e() {
        a(4);
    }

    public final void f() {
        if (this.f28569a != null) {
            a(0);
        }
    }

    @TargetApi(19)
    public final boolean a(long j4) {
        a aVar = this.f28569a;
        if (aVar == null || j4 - this.f28573e < this.f28572d) {
            return false;
        }
        this.f28573e = j4;
        boolean b4 = aVar.b();
        int i4 = this.f28570b;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (b4) {
                        f();
                        return b4;
                    }
                } else if (!b4) {
                    f();
                    return b4;
                }
            } else {
                if (!b4) {
                    f();
                    return b4;
                }
                if (this.f28569a.f28579e > this.f28574f) {
                    a(2);
                    return b4;
                }
            }
        } else {
            if (b4) {
                if (this.f28569a.a() < this.f28571c) {
                    return false;
                }
                this.f28574f = this.f28569a.f28579e;
                a(1);
                return b4;
            }
            if (j4 - this.f28571c > 500000) {
                a(3);
            }
        }
        return b4;
    }

    private void a(int i4) {
        this.f28570b = i4;
        if (i4 == 0) {
            this.f28573e = 0L;
            this.f28574f = -1L;
            this.f28571c = System.nanoTime() / 1000;
            this.f28572d = 10000L;
            return;
        }
        if (i4 == 1) {
            this.f28572d = 10000L;
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.f28572d = 10000000L;
        } else {
            if (i4 == 4) {
                this.f28572d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
