package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2685Nc implements InterfaceC2990bc {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26569n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26570u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f26571v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f26572w;

    public C2685Nc(c7.m mVar, C2634Kc c2634Kc, t2.w wVar) {
        this.f26570u = c2634Kc;
        this.f26571v = wVar;
        Objects.requireNonNull(mVar);
        this.f26572w = mVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    public final void g(Object obj, Map map) {
        switch (this.f26569n) {
            case 0:
                t2.C.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
                c7.m mVar = (c7.m) this.f26572w;
                synchronized (mVar.f5721d) {
                    try {
                        t2.C.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                        u2.i.e("JS Engine is requesting an update");
                        if (mVar.f5720c == 0) {
                            u2.i.e("Starting reload.");
                            mVar.f5720c = 2;
                            mVar.e();
                        }
                        ((C2634Kc) this.f26570u).e("/requestReload", (C2685Nc) ((t2.w) this.f26571v).f40939u);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                t2.C.k("loadJavascriptEngine > /requestReload handler: Lock released");
                return;
            default:
                String str = (String) map.get("asset");
                try {
                    ((InterfaceC2514Db) this.f26570u).m1((InterfaceC4284zb) ((InterfaceC3901sN) this.f26572w).d(), str);
                    return;
                } catch (RemoteException e6) {
                    String o9 = D.y.o(new StringBuilder(String.valueOf(str).length() + 40), "Failed to call onCustomClick for asset ", str, com.anythink.core.common.d.j.f12535z);
                    int i = t2.C.f40822b;
                    u2.i.g(o9, e6);
                    return;
                }
        }
    }

    public C2685Nc(C4133wm c4133wm, C3917sm c3917sm, C4026un c4026un, InterfaceC3901sN interfaceC3901sN) {
        this.f26570u = (InterfaceC2514Db) c4133wm.f35067g.getOrDefault(c3917sm.g(), null);
        this.f26571v = c4026un;
        this.f26572w = interfaceC3901sN;
    }
}
