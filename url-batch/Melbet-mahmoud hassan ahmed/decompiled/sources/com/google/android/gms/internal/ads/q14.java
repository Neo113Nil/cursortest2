package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class q14 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f10540a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f10541b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f10542c;

    /* renamed from: d, reason: collision with root package name */
    private long f10543d;

    /* renamed from: e, reason: collision with root package name */
    private long f10544e;

    public q14(AudioTrack audioTrack) {
        this.f10540a = audioTrack;
    }

    public final long a() {
        return this.f10544e;
    }

    public final long b() {
        return this.f10541b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f10540a.getTimestamp(this.f10541b);
        if (timestamp) {
            long j7 = this.f10541b.framePosition;
            if (this.f10543d > j7) {
                this.f10542c++;
            }
            this.f10543d = j7;
            this.f10544e = j7 + (this.f10542c << 32);
        }
        return timestamp;
    }
}
