package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.qP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3796qP implements InterfaceC3865ro, InterfaceC3367iQ, InterfaceC3273gn {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33729n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33723u = new C3796qP(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33724v = new C3796qP(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33725w = new C3796qP(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33726x = new C3796qP(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33727y = new C3796qP(4);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33728z = new C3796qP(5);

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33721A = new C3796qP(6);

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ C3796qP f33722B = new C3796qP(9);

    public /* synthetic */ C3796qP(int i) {
        this.f33729n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3367iQ
    public /* synthetic */ int b(Object obj) {
        HashMap hashMap = AbstractC3419jQ.f32115a;
        String str = ((C2986bQ) obj).f29490a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        long j9;
        C3554m c3554m;
        switch (this.f33729n) {
            case 0:
                C4281zP c4281zP = (C4281zP) obj;
                EP ep = c4281zP.f35549b;
                if (c4281zP.equals(ep.f24749h) && ep.f24752l != null) {
                    BP bp = ep.f24754n;
                    int i = bp.f24036b;
                    if (i != -1) {
                        long j10 = ((C3366iP) bp.f24039e).f31387d / i;
                        C4119wP c4119wP = ep.f24758r;
                        c4119wP.getClass();
                        j9 = AbstractC3548lu.v(c4119wP.f34984a.getSampleRate(), j10);
                    } else {
                        j9 = com.anythink.basead.exoplayer.b.f6539b;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime() - ep.f24737T;
                    Mt mt = ep.f24752l;
                    C3366iP c3366iP = (C3366iP) ep.f24754n.f24039e;
                    C3932t0 c3932t0 = ((GP) mt.f26393u).f25156m1;
                    long t9 = AbstractC3548lu.t(j9);
                    Handler handler = c3932t0.f34332a;
                    if (handler != null) {
                        handler.post(new RunnableC3418jP(c3932t0, c3366iP.f31387d, t9, elapsedRealtime));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C4281zP c4281zP2 = (C4281zP) obj;
                EP ep2 = c4281zP2.f35549b;
                if (c4281zP2.equals(ep2.f24749h) && ep2.f24729L) {
                    ep2.f24730M = true;
                    return;
                }
                return;
            case 2:
                ((C4281zP) obj).a();
                return;
            case 3:
                ((C4281zP) obj).a();
                return;
            case 4:
                Mt mt2 = ((CP) obj).f24173a.f24752l;
                if (mt2 != null) {
                    GP gp = (GP) mt2.f26393u;
                    synchronized (gp.f30414n) {
                        c3554m = gp.f30375L;
                    }
                    if (c3554m != null) {
                        synchronized (c3554m.f32632c) {
                            c3554m.f32634e.getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TQ) obj).getClass();
                return;
        }
    }
}
