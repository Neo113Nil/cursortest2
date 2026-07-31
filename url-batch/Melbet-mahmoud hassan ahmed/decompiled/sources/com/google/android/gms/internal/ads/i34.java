package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class i34 implements w34 {

    /* renamed from: b, reason: collision with root package name */
    private final c53<HandlerThread> f6525b;

    /* renamed from: c, reason: collision with root package name */
    private final c53<HandlerThread> f6526c;

    public i34(int i7, boolean z6) {
        g34 g34Var = new g34(i7);
        h34 h34Var = new h34(i7);
        this.f6525b = g34Var;
        this.f6526c = h34Var;
    }

    static /* synthetic */ HandlerThread a(int i7) {
        String n7;
        n7 = k34.n(i7, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(n7);
    }

    static /* synthetic */ HandlerThread b(int i7) {
        String n7;
        n7 = k34.n(i7, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(n7);
    }

    public final k34 c(v34 v34Var) {
        MediaCodec mediaCodec;
        String str = v34Var.f13116a.f14931a;
        k34 k34Var = null;
        try {
            String valueOf = String.valueOf(str);
            lz2.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                k34 k34Var2 = new k34(mediaCodec, a(((g34) this.f6525b).f5446f), b(((h34) this.f6526c).f6064f), false, null);
                try {
                    lz2.b();
                    k34.m(k34Var2, v34Var.f13117b, v34Var.f13119d, null, 0, false);
                    return k34Var2;
                } catch (Exception e7) {
                    e = e7;
                    k34Var = k34Var2;
                    if (k34Var != null) {
                        k34Var.k();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodec = null;
        }
    }
}
