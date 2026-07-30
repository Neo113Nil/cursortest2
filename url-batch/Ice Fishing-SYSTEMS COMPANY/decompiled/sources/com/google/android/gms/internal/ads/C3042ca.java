package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.anythink.expressad.foundation.d.d;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3042ca implements InterfaceC3701ol, InterfaceC3404jB {

    /* renamed from: n, reason: collision with root package name */
    public final Context f29713n;

    public /* synthetic */ C3042ca(Context context, boolean z8) {
        this.f29713n = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
    public /* synthetic */ Object a() {
        int i = SN.f27536z;
        return new C3554m(this.f29713n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3701ol, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public /* synthetic */ void mo2b(Object obj) {
        ((InterfaceC2523Dk) obj).b(this.f29713n);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public YP c(r rVar) {
        String str;
        MediaCodec mediaCodec;
        int i;
        ZP up;
        Context context;
        C2986bQ c2986bQ;
        MediaCodec createByCodecName;
        int i4 = Build.VERSION.SDK_INT;
        int i9 = 0;
        QP qp = null;
        r5 = null;
        MediaCodec mediaCodec2 = null;
        qp = null;
        if (i4 < 31 && ((context = this.f29713n) == null || i4 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            try {
                c2986bQ = (C2986bQ) rVar.f33919u;
                String str2 = c2986bQ.f29490a;
                Trace.beginSection("createCodec:".concat(str2));
                createByCodecName = MediaCodec.createByCodecName(str2);
                Trace.endSection();
            } catch (IOException e6) {
                e = e6;
            } catch (RuntimeException e9) {
                e = e9;
            }
            try {
                Trace.beginSection("configureCodec");
                Surface surface = (Surface) rVar.f33922x;
                if (surface == null && c2986bQ.f29497h && i4 >= 35) {
                    i9 = 8;
                }
                createByCodecName.configure((MediaFormat) rVar.f33920v, surface, (MediaCrypto) null, i9);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new C4164xG(createByCodecName, (C4164xG) rVar.f33923y);
            } catch (IOException e10) {
                e = e10;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                    mediaCodec2.release();
                }
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                mediaCodec2 = createByCodecName;
                if (mediaCodec2 != null) {
                }
                throw e;
            }
        }
        int f6 = K4.f(((TP) rVar.f33921w).f27776o);
        switch (f6) {
            case -2:
                str = "none";
                break;
            case -1:
                str = com.anythink.core.common.v.m.f16967e;
                break;
            case 0:
                str = com.anythink.core.express.b.a.f17688f;
                break;
            case 1:
                str = com.anythink.basead.exoplayer.k.o.f8602b;
                break;
            case 2:
                str = com.anythink.basead.exoplayer.k.o.f8601a;
                break;
            case 3:
                str = com.anythink.basead.exoplayer.k.o.f8603c;
                break;
            case 4:
                str = d.c.f18793e;
                break;
            case 5:
                str = "metadata";
                break;
            default:
                str = "camera motion";
                break;
        }
        AbstractC3217fl.y("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(str));
        C2986bQ c2986bQ2 = (C2986bQ) rVar.f33919u;
        String str3 = c2986bQ2.f29490a;
        try {
            StringBuilder sb = new StringBuilder(str3.length() + 12);
            sb.append("createCodec:");
            sb.append(str3);
            Trace.beginSection(sb.toString());
            mediaCodec = MediaCodec.createByCodecName(str3);
            try {
                if (i4 >= 36) {
                    up = new Mt(16, mediaCodec);
                    i = 4;
                } else {
                    i = 0;
                    up = new UP(mediaCodec, new HandlerThread(QP.b(f6, "ExoPlayer:MediaCodecQueueingThread:")));
                }
                QP qp2 = new QP(mediaCodec, new HandlerThread(QP.b(f6, "ExoPlayer:MediaCodecAsyncAdapter:")), up, (C4164xG) rVar.f33923y);
                try {
                    Trace.endSection();
                    Surface surface2 = (Surface) rVar.f33922x;
                    if (surface2 == null && c2986bQ2.f29497h && i4 >= 35) {
                        i |= 8;
                    }
                    qp2.a((MediaFormat) rVar.f33920v, surface2, i);
                    return qp2;
                } catch (Exception e12) {
                    e = e12;
                    qp = qp2;
                    if (qp != null) {
                        qp.k();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Exception e14) {
            e = e14;
            mediaCodec = null;
        }
    }

    public boolean d(Intent intent) {
        O2.w.i(intent, "Intent can not be null");
        return !this.f29713n.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public C3042ca(Context context) {
        O2.w.i(context, "Context can not be null");
        this.f29713n = context;
    }
}
