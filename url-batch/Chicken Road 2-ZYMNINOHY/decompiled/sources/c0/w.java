package c0;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final v f5614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5615b;

    /* renamed from: c, reason: collision with root package name */
    public final t1.h f5616c;

    /* renamed from: d, reason: collision with root package name */
    public int f5617d;

    /* renamed from: e, reason: collision with root package name */
    public long f5618e;

    /* renamed from: f, reason: collision with root package name */
    public long f5619f;

    /* renamed from: g, reason: collision with root package name */
    public long f5620g;

    /* renamed from: h, reason: collision with root package name */
    public long f5621h;

    /* renamed from: i, reason: collision with root package name */
    public long f5622i;

    public w(AudioTrack audioTrack, t1.h hVar) {
        this.f5614a = new v(audioTrack);
        this.f5615b = audioTrack.getSampleRate();
        this.f5616c = hVar;
        a(0);
    }

    public final void a(int i4) {
        this.f5617d = i4;
        if (i4 == 0) {
            this.f5620g = 0L;
            this.f5621h = -1L;
            this.f5622i = -9223372036854775807L;
            this.f5618e = System.nanoTime() / 1000;
            this.f5619f = 10000L;
            return;
        }
        if (i4 == 1) {
            this.f5619f = 10000L;
            return;
        }
        if (i4 == 2 || i4 == 3) {
            this.f5619f = 10000000L;
        } else {
            if (i4 != 4) {
                throw new IllegalStateException();
            }
            this.f5619f = 500000L;
        }
    }
}
