package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.Mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2668Mc implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f26352n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2770Sc f26353u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2634Kc f26354v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c7.m f26355w;

    public C2668Mc(c7.m mVar, long j9, C2770Sc c2770Sc, C2634Kc c2634Kc) {
        this.f26352n = j9;
        this.f26353u = c2770Sc;
        this.f26354v = c2634Kc;
        Objects.requireNonNull(mVar);
        this.f26355w = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        p2.j.f39798C.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f26352n;
        StringBuilder sb = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        t2.C.k(sb.toString());
        t2.C.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        c7.m mVar = this.f26355w;
        synchronized (mVar.f5721d) {
            t2.C.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            C2770Sc c2770Sc = this.f26353u;
            if (((AtomicInteger) c2770Sc.f684v).get() != -1 && ((AtomicInteger) c2770Sc.f684v).get() != 1) {
                mVar.f5720c = 0;
                C2634Kc c2634Kc = this.f26354v;
                c2634Kc.f("/log", AbstractC2935ac.f29212c);
                c2634Kc.f("/result", AbstractC2935ac.f29218j);
                ((C3320hg) c2770Sc.f683u).a(c2634Kc);
                mVar.f5725h = c2770Sc;
                t2.C.k("Successfully loaded JS Engine.");
                t2.C.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            t2.C.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
