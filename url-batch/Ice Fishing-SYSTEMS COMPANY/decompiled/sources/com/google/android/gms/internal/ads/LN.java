package com.google.android.gms.internal.ads;

import java.util.Locale;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class LN {

    /* renamed from: a, reason: collision with root package name */
    public int f26147a;

    /* renamed from: b, reason: collision with root package name */
    public int f26148b;

    /* renamed from: c, reason: collision with root package name */
    public int f26149c;

    /* renamed from: d, reason: collision with root package name */
    public int f26150d;

    /* renamed from: e, reason: collision with root package name */
    public int f26151e;

    /* renamed from: f, reason: collision with root package name */
    public int f26152f;

    /* renamed from: g, reason: collision with root package name */
    public int f26153g;

    /* renamed from: h, reason: collision with root package name */
    public int f26154h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f26155j;

    /* renamed from: k, reason: collision with root package name */
    public long f26156k;

    /* renamed from: l, reason: collision with root package name */
    public int f26157l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i = this.f26147a;
        int i4 = this.f26148b;
        int i9 = this.f26149c;
        int i10 = this.f26150d;
        int i11 = this.f26151e;
        int i12 = this.f26152f;
        int i13 = this.f26153g;
        int i14 = this.f26154h;
        int i15 = this.i;
        int i16 = this.f26155j;
        long j9 = this.f26156k;
        int i17 = this.f26157l;
        String str = AbstractC3548lu.f32613a;
        Locale locale = Locale.US;
        StringBuilder h9 = AbstractC5051n.h(i, i4, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        h9.append(i9);
        h9.append("\n skippedInputBuffers=");
        h9.append(i10);
        h9.append("\n renderedOutputBuffers=");
        h9.append(i11);
        h9.append("\n skippedOutputBuffers=");
        h9.append(i12);
        h9.append("\n droppedBuffers=");
        h9.append(i13);
        h9.append("\n droppedInputBuffers=");
        h9.append(i14);
        h9.append("\n maxConsecutiveDroppedBuffers=");
        h9.append(i15);
        h9.append("\n droppedToKeyframeEvents=");
        h9.append(i16);
        h9.append("\n totalVideoFrameProcessingOffsetUs=");
        h9.append(j9);
        h9.append("\n videoFrameProcessingOffsetCount=");
        h9.append(i17);
        h9.append("\n}");
        return h9.toString();
    }
}
