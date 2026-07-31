package u0;

import o2.m0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f22398a;

    /* renamed from: b, reason: collision with root package name */
    public int f22399b;

    /* renamed from: c, reason: collision with root package name */
    public int f22400c;

    /* renamed from: d, reason: collision with root package name */
    public int f22401d;

    /* renamed from: e, reason: collision with root package name */
    public int f22402e;

    /* renamed from: f, reason: collision with root package name */
    public int f22403f;

    /* renamed from: g, reason: collision with root package name */
    public int f22404g;

    /* renamed from: h, reason: collision with root package name */
    public int f22405h;

    /* renamed from: i, reason: collision with root package name */
    public int f22406i;

    /* renamed from: j, reason: collision with root package name */
    public int f22407j;

    /* renamed from: k, reason: collision with root package name */
    public long f22408k;

    /* renamed from: l, reason: collision with root package name */
    public int f22409l;

    private void b(long j7, int i7) {
        this.f22408k += j7;
        this.f22409l += i7;
    }

    public void a(long j7) {
        b(j7, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return m0.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f22398a), Integer.valueOf(this.f22399b), Integer.valueOf(this.f22400c), Integer.valueOf(this.f22401d), Integer.valueOf(this.f22402e), Integer.valueOf(this.f22403f), Integer.valueOf(this.f22404g), Integer.valueOf(this.f22405h), Integer.valueOf(this.f22406i), Integer.valueOf(this.f22407j), Long.valueOf(this.f22408k), Integer.valueOf(this.f22409l));
    }
}
