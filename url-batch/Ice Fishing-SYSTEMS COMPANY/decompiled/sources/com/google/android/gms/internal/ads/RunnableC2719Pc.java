package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2719Pc implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26970n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c7.m f26971u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2770Sc f26972v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C2634Kc f26973w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26974x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f26975y;

    public RunnableC2719Pc(c7.m mVar, C2770Sc c2770Sc, C2634Kc c2634Kc, ArrayList arrayList, long j9, int i) {
        this.f26970n = i;
        switch (i) {
            case 1:
                this.f26971u = mVar;
                this.f26972v = c2770Sc;
                this.f26973w = c2634Kc;
                this.f26974x = arrayList;
                this.f26975y = j9;
                break;
            default:
                this.f26972v = c2770Sc;
                this.f26973w = c2634Kc;
                this.f26974x = arrayList;
                this.f26975y = j9;
                Objects.requireNonNull(mVar);
                this.f26971u = mVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String sb;
        switch (this.f26970n) {
            case 0:
                t2.C.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                c7.m mVar = this.f26971u;
                synchronized (mVar.f5721d) {
                    try {
                        t2.C.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        C2770Sc c2770Sc = this.f26972v;
                        if (((AtomicInteger) c2770Sc.f684v).get() != -1 && ((AtomicInteger) c2770Sc.f684v).get() != 1) {
                            C3151ea c3151ea = AbstractC3368ia.C8;
                            q2.r rVar = q2.r.f40116e;
                            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                                c2770Sc.r("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                c2770Sc.q();
                            }
                            AbstractC3212fg.f30743f.execute(new RunnableC2702Oc(this.f26973w, 0));
                            String valueOf = String.valueOf(rVar.f40119c.a(AbstractC3368ia.f31650e));
                            int i = ((AtomicInteger) c2770Sc.f684v).get();
                            int i4 = mVar.f5720c;
                            ArrayList arrayList = this.f26974x;
                            if (arrayList.isEmpty()) {
                                sb = ". Still waiting for the engine to be loaded";
                            } else {
                                String valueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                                sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb2.append(valueOf2);
                                sb = sb2.toString();
                            }
                            p2.j.f39798C.f39810k.getClass();
                            long currentTimeMillis = System.currentTimeMillis() - this.f26975y;
                            StringBuilder sb3 = new StringBuilder(valueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i4).length() + sb.length() + 39 + String.valueOf(currentTimeMillis).length() + 26);
                            sb3.append("Could not finish the full JS engine loading in ");
                            sb3.append(valueOf);
                            sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb3.append(i);
                            sb3.append(". Update status(fullLoadTimeout) is ");
                            sb3.append(i4);
                            sb3.append(sb);
                            sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb3.append(currentTimeMillis);
                            sb3.append(" ms at timeout. Rejecting.");
                            t2.C.k(sb3.toString());
                            t2.C.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        t2.C.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
            default:
                c7.m mVar2 = this.f26971u;
                C2770Sc c2770Sc2 = this.f26972v;
                C2634Kc c2634Kc = this.f26973w;
                ArrayList arrayList2 = this.f26974x;
                long j9 = this.f26975y;
                mVar2.getClass();
                t2.C.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (mVar2.f5721d) {
                    try {
                        t2.C.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) c2770Sc2.f684v).get() != -1 && ((AtomicInteger) c2770Sc2.f684v).get() != 1) {
                            C3151ea c3151ea2 = AbstractC3368ia.C8;
                            q2.r rVar2 = q2.r.f40116e;
                            if (((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                                c2770Sc2.r("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                c2770Sc2.q();
                            }
                            AbstractC3212fg.f30743f.execute(new RunnableC2702Oc(c2634Kc, 1));
                            String valueOf3 = String.valueOf(rVar2.f40119c.a(AbstractC3368ia.f31642d));
                            int i9 = ((AtomicInteger) c2770Sc2.f684v).get();
                            int i10 = mVar2.f5720c;
                            String valueOf4 = String.valueOf(arrayList2.get(0));
                            p2.j.f39798C.f39810k.getClass();
                            long currentTimeMillis2 = System.currentTimeMillis() - j9;
                            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 94 + String.valueOf(i9).length() + 39 + String.valueOf(i10).length() + 57 + valueOf4.length() + 42 + String.valueOf(currentTimeMillis2).length() + 15);
                            sb4.append("Could not receive /jsLoaded in ");
                            sb4.append(valueOf3);
                            sb4.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb4.append(i9);
                            sb4.append(". Update status(onEngLoadedTimeout) is ");
                            sb4.append(i10);
                            sb4.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb4.append(valueOf4);
                            sb4.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb4.append(currentTimeMillis2);
                            sb4.append(" ms. Rejecting.");
                            t2.C.k(sb4.toString());
                            t2.C.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        t2.C.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } finally {
                    }
                }
        }
    }
}
