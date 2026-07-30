package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.os.Handler;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.sP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3903sP implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f34241n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f34242u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f34243v;

    public /* synthetic */ RunnableC3903sP(int i, Object obj, Object obj2) {
        this.f34241n = i;
        this.f34242u = obj;
        this.f34243v = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4287ze c4287ze;
        boolean z8 = false;
        switch (this.f34241n) {
            case 0:
                PE pe = (PE) this.f34242u;
                pe.getClass();
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f34243v).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) pe.f26884d).post(new RunnableC3903sP(r0, pe, routedDevice));
                    return;
                }
                return;
            case 1:
                PE pe2 = (PE) this.f34242u;
                if (((C3957tP) pe2.f26885e) == null || (c4287ze = (C4287ze) ((C4313b) ((C4086vt) pe2.f26883c).f34886u).f35816f) == null) {
                    return;
                }
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f34243v;
                if (audioDeviceInfo.equals((AudioDeviceInfo) c4287ze.f35570C)) {
                    return;
                }
                c4287ze.f35570C = audioDeviceInfo;
                C2777Sj c2777Sj = (C2777Sj) c4287ze.f35571D;
                List j9 = c4287ze.j();
                C3675oC c3675oC = XO.f28641e;
                IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
                Context context = c4287ze.f35572n;
                c4287ze.k(XO.a(context, context.registerReceiver(null, intentFilter), c2777Sj, audioDeviceInfo, j9));
                return;
            case 2:
                QP qp = (QP) this.f34242u;
                qp.f27159v.e();
                VP vp = qp.f27158u;
                RunnableC3903sP runnableC3903sP = (RunnableC3903sP) this.f34243v;
                synchronized (vp.f28247a) {
                    vp.b();
                    runnableC3903sP.run();
                }
                return;
            case 3:
                AbstractC3149eQ abstractC3149eQ = (AbstractC3149eQ) this.f34242u;
                abstractC3149eQ.f30399X.set(abstractC3149eQ.n((C4164xG) this.f34243v, abstractC3149eQ.f30387R, 0));
                return;
            case 4:
                ((InterfaceC3273gn) this.f34242u).mo2b(this.f34243v);
                return;
            default:
                PQ pq = (PQ) this.f34242u;
                R1 r12 = pq.J;
                InterfaceC3015c1 interfaceC3015c1 = (InterfaceC3015c1) this.f34243v;
                pq.f26947S = r12 == null ? interfaceC3015c1 : new T0(com.anythink.basead.exoplayer.b.f6539b, 0L);
                pq.f26948T = interfaceC3015c1.a();
                if (!pq.f26955n0 && interfaceC3015c1.a() == com.anythink.basead.exoplayer.b.f6539b) {
                    z8 = true;
                }
                pq.f26949U = z8;
                pq.f26950V = true == z8 ? 7 : 1;
                if (pq.f26943O) {
                    pq.f26966y.s(pq.f26948T, interfaceC3015c1, z8);
                    return;
                } else {
                    pq.s();
                    return;
                }
        }
    }
}
