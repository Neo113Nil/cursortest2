package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.wP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4119wP {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f34981o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f34982p;

    /* renamed from: q, reason: collision with root package name */
    public static int f34983q;

    /* renamed from: a, reason: collision with root package name */
    public final AudioTrack f34984a;

    /* renamed from: b, reason: collision with root package name */
    public final C3366iP f34985b;

    /* renamed from: c, reason: collision with root package name */
    public final C4086vt f34986c;

    /* renamed from: d, reason: collision with root package name */
    public PE f34987d;

    /* renamed from: e, reason: collision with root package name */
    public final C4173xP f34988e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34989f;

    /* renamed from: g, reason: collision with root package name */
    public final int f34990g;

    /* renamed from: h, reason: collision with root package name */
    public final C3602mu f34991h;
    public final C3759pp i = new C3759pp(Thread.currentThread());

    /* renamed from: j, reason: collision with root package name */
    public boolean f34992j;

    /* renamed from: k, reason: collision with root package name */
    public long f34993k;

    /* renamed from: l, reason: collision with root package name */
    public long f34994l;

    /* renamed from: m, reason: collision with root package name */
    public int f34995m;

    /* renamed from: n, reason: collision with root package name */
    public int f34996n;

    public C4119wP(AudioTrack audioTrack, C3366iP c3366iP, C4086vt c4086vt, T2 t22) {
        this.f34984a = audioTrack;
        this.f34985b = c3366iP;
        this.f34986c = c4086vt;
        int i = c3366iP.f31384a;
        boolean d2 = AbstractC3548lu.d(i);
        this.f34989f = d2;
        if (d2) {
            this.f34990g = AbstractC3548lu.f(i) * Integer.bitCount(c3366iP.f31386c);
        } else {
            this.f34990g = -1;
        }
        this.f34988e = new C4173xP(new Mu(this), t22, audioTrack, c3366iP.f31384a, this.f34990g, c3366iP.f31387d);
        if (c4086vt != null) {
            this.f34987d = new PE(audioTrack, c4086vt);
        }
        this.f34991h = b() ? new C3602mu(this) : null;
    }

    public final boolean a(int i, ByteBuffer byteBuffer) {
        boolean z8;
        C4086vt c4086vt;
        boolean z9 = this.f34989f;
        if (!z9 && this.f34995m == 0) {
            this.f34995m = EP.c(this.f34985b.f31384a, byteBuffer);
        }
        C3759pp c3759pp = this.i;
        c3759pp.getClass();
        boolean z10 = Thread.currentThread() == c3759pp.f33512a;
        AudioTrack audioTrack = this.f34984a;
        if (z10) {
            c();
            int underrunCount = audioTrack.getUnderrunCount();
            int i4 = this.f34996n;
            this.f34996n = underrunCount;
            if (underrunCount > i4) {
                c3759pp.c(-1, C3796qP.f33723u);
                c3759pp.d();
            }
        }
        int remaining = byteBuffer.remaining();
        int write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (write >= 0) {
            z8 = write == remaining;
            if (z9) {
                this.f34993k += write;
                return z8;
            }
            if (z8) {
                this.f34994l = (this.f34995m * i) + this.f34994l;
            }
            return z8;
        }
        z8 = write == -6 || write == -32;
        if (z8 && (c4086vt = this.f34986c) != null) {
            C4313b c4313b = (C4313b) c4086vt.f34886u;
            C4287ze c4287ze = (C4287ze) c4313b.f35816f;
            if (c4287ze != null) {
                XO xo = XO.f28642f;
                c4313b.f35815e = xo;
                c4287ze.k(xo);
            }
        }
        throw new C3039cP(write, z8);
    }

    public final boolean b() {
        boolean isOffloadedPlayback;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isOffloadedPlayback = this.f34984a.isOffloadedPlayback();
        return isOffloadedPlayback;
    }

    public final long c() {
        if (!this.f34989f) {
            return this.f34994l;
        }
        long j9 = this.f34993k;
        String str = AbstractC3548lu.f32613a;
        return ((j9 + r2) - 1) / this.f34990g;
    }
}
