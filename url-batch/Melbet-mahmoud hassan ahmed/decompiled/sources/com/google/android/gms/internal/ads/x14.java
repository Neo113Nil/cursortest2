package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class x14 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f13991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13993c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f13994d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13995e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13996f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13997g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13998h;

    /* renamed from: i, reason: collision with root package name */
    public final w04[] f13999i;

    public x14(c0 c0Var, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z6, w04[] w04VarArr) {
        this.f13991a = c0Var;
        this.f13992b = i7;
        this.f13994d = i9;
        this.f13995e = i10;
        this.f13996f = i11;
        this.f13997g = i12;
        this.f13999i = w04VarArr;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        wu1.f(minBufferSize != -2);
        this.f13998h = n13.L(minBufferSize * 4, ((int) a(250000L)) * i9, Math.max(minBufferSize, ((int) a(750000L)) * i9));
    }

    public final long a(long j7) {
        return (j7 * this.f13995e) / 1000000;
    }

    public final long b(long j7) {
        return (j7 * 1000000) / this.f13995e;
    }

    public final AudioTrack c(boolean z6, ef3 ef3Var, int i7) {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i8 = n13.f8865a;
            if (i8 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.f13995e).setChannelMask(this.f13996f).setEncoding(this.f13997g).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(ef3Var.a()).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.f13998h).setSessionId(i7).setOffloadedPlayback(false).build();
            } else if (i8 >= 21) {
                AudioAttributes a7 = ef3Var.a();
                build = new AudioFormat.Builder().setSampleRate(this.f13995e).setChannelMask(this.f13996f).setEncoding(this.f13997g).build();
                audioTrack = new AudioTrack(a7, build, this.f13998h, 1, i7);
            } else {
                int i9 = ef3Var.f4597a;
                audioTrack = i7 == 0 ? new AudioTrack(3, this.f13995e, this.f13996f, this.f13997g, this.f13998h, 1) : new AudioTrack(3, this.f13995e, this.f13996f, this.f13997g, this.f13998h, 1, i7);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new k14(state, this.f13995e, this.f13996f, this.f13998h, this.f13991a, false, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e7) {
            throw new k14(0, this.f13995e, this.f13996f, this.f13998h, this.f13991a, false, e7);
        }
    }
}
