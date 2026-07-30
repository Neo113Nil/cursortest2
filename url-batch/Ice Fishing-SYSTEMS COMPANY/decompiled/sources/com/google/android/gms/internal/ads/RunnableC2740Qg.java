package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Qg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2740Qg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27193n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27194u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27195v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27196w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27197x;

    public /* synthetic */ RunnableC2740Qg(C2588Hh c2588Hh, View view, InterfaceC4180xf interfaceC4180xf, int i) {
        this.f27195v = c2588Hh;
        this.f27196w = view;
        this.f27197x = interfaceC4180xf;
        this.f27194u = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27193n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheComplete");
                hashMap.put("src", (String) this.f27195v);
                hashMap.put("cachedSrc", (String) this.f27196w);
                hashMap.put("totalBytes", Integer.toString(this.f27194u));
                ((AbstractC2791Tg) this.f27197x).n(hashMap);
                return;
            case 1:
                ((C2588Hh) this.f27195v).o((View) this.f27196w, (InterfaceC4180xf) this.f27197x, this.f27194u - 1);
                return;
            default:
                GA ga = (GA) this.f27196w;
                int i = this.f27194u;
                h8.d dVar = (h8.d) this.f27197x;
                IA ia = (IA) this.f27195v;
                String str = ia.f25535b;
                try {
                    C2631Jq c2631Jq = ia.f25534a;
                    if (c2631Jq == null) {
                        throw null;
                    }
                    BA ba = (BA) c2631Jq.f25821C;
                    if (ba == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    String str2 = ga.f25106a;
                    if (!IA.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = ga.f25107b;
                    if (!IA.b(str3)) {
                        str3.getClass();
                        bundle.putString(com.anythink.expressad.videocommon.e.b.f22565u, str3.trim());
                    }
                    HA ha = new HA(ia, dVar);
                    C4266zA c4266zA = (C4266zA) ba;
                    Parcel A02 = c4266zA.A0();
                    AbstractC3241g8.c(A02, bundle);
                    AbstractC3241g8.e(A02, ha);
                    c4266zA.N0(A02, 3);
                    return;
                } catch (RemoteException e6) {
                    IA.f25532c.d(e6, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC2740Qg(IA ia, GA ga, int i, h8.d dVar) {
        this.f27195v = ia;
        this.f27196w = ga;
        this.f27194u = i;
        this.f27197x = dVar;
    }

    public RunnableC2740Qg(AbstractC2791Tg abstractC2791Tg, String str, String str2, int i) {
        this.f27195v = str;
        this.f27196w = str2;
        this.f27194u = i;
        Objects.requireNonNull(abstractC2791Tg);
        this.f27197x = abstractC2791Tg;
    }
}
