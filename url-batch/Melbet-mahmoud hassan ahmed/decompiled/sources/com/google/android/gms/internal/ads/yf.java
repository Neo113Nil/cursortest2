package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* loaded from: classes.dex */
class yf {

    /* renamed from: a, reason: collision with root package name */
    protected AudioTrack f14639a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14640b;

    /* renamed from: c, reason: collision with root package name */
    private int f14641c;

    /* renamed from: d, reason: collision with root package name */
    private long f14642d;

    /* renamed from: e, reason: collision with root package name */
    private long f14643e;

    /* renamed from: f, reason: collision with root package name */
    private long f14644f;

    /* renamed from: g, reason: collision with root package name */
    private long f14645g;

    /* renamed from: h, reason: collision with root package name */
    private long f14646h;

    /* renamed from: i, reason: collision with root package name */
    private long f14647i;

    /* synthetic */ yf(xf xfVar) {
    }

    public final long a() {
        if (this.f14645g != -9223372036854775807L) {
            return Math.min(this.f14647i, this.f14646h + ((((SystemClock.elapsedRealtime() * 1000) - this.f14645g) * this.f14641c) / 1000000));
        }
        int playState = this.f14639a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f14639a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f14640b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f14644f = this.f14642d;
            }
            playbackHeadPosition += this.f14644f;
        }
        if (this.f14642d > playbackHeadPosition) {
            this.f14643e++;
        }
        this.f14642d = playbackHeadPosition;
        return playbackHeadPosition + (this.f14643e << 32);
    }

    public final long b() {
        return (a() * 1000000) / this.f14641c;
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public long d() {
        throw new UnsupportedOperationException();
    }

    public final void e(long j7) {
        this.f14646h = a();
        this.f14645g = SystemClock.elapsedRealtime() * 1000;
        this.f14647i = j7;
        this.f14639a.stop();
    }

    public final void f() {
        if (this.f14645g != -9223372036854775807L) {
            return;
        }
        this.f14639a.pause();
    }

    public void g(AudioTrack audioTrack, boolean z6) {
        this.f14639a = audioTrack;
        this.f14640b = z6;
        this.f14645g = -9223372036854775807L;
        this.f14642d = 0L;
        this.f14643e = 0L;
        this.f14644f = 0L;
        if (audioTrack != null) {
            this.f14641c = audioTrack.getSampleRate();
        }
    }

    public boolean h() {
        return false;
    }
}
