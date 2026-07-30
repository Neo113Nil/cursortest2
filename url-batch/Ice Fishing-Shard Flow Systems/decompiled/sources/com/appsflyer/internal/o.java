package com.appsflyer.internal;

import D6.w;
import D6.y;
import D6.z;
import H6.q;
import P0.s;
import android.content.Context;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import j5.C0583a;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import t1.u;
import x4.C1009d;
import x4.C1010e;
import x4.RunnableC1008c;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4344e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4345i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4347m;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f4343d = i2;
        this.f4344e = obj;
        this.f4345i = obj2;
        this.f4346l = obj3;
        this.f4347m = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4343d) {
            case 0:
                ((AFj1rSDK) this.f4344e).getMonetizationNetwork((Context) this.f4345i, (Runnable) this.f4346l, (AFd1zSDK) this.f4347m);
                return;
            case 1:
                p5.d dVar = (p5.d) this.f4344e;
                y yVar = (y) this.f4345i;
                C0583a c0583a = (C0583a) this.f4346l;
                C0583a c0583a2 = (C0583a) this.f4347m;
                w wVar = (w) dVar.f7205b;
                z request = new z(yVar);
                wVar.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                q call = new q(wVar, request);
                s responseCallback = new s(c0583a, c0583a2);
                Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
                if (!call.f1074m.compareAndSet(false, true)) {
                    throw new IllegalStateException("Already Executed");
                }
                N6.e eVar = N6.e.f1879a;
                call.f1075n = N6.e.f1879a.h();
                Intrinsics.checkNotNullParameter(call, "call");
                D6.n nVar = wVar.f598a;
                H6.n call2 = new H6.n(call, responseCallback);
                nVar.getClass();
                Intrinsics.checkNotNullParameter(call2, "call");
                D6.n.e(nVar, call2, null, 6);
                return;
            default:
                C1009d c1009d = (C1009d) this.f4344e;
                C1010e c1010e = (C1010e) this.f4345i;
                String str = (String) this.f4346l;
                K1.h hVar = (K1.h) this.f4347m;
                HashMap hashMap = C1009d.f8340i;
                c1009d.getClass();
                try {
                    String str2 = c1010e.f8343a;
                    u.d(str2, "ApiKey must be set.");
                    String str3 = c1010e.f8344b;
                    u.d(str3, "ApplicationId must be set.");
                    String str4 = c1010e.f8348f;
                    String str5 = c1010e.f8345c;
                    String str6 = c1010e.f8346d;
                    P1.h hVar2 = new P1.h(str3, str2, str4, c1010e.f8351i, str5, c1010e.f8349g, c1010e.f8356o, str6);
                    try {
                        Looper.prepare();
                    } catch (Exception unused) {
                    }
                    String str7 = c1010e.f8347e;
                    if (str7 != null) {
                        C1009d.f8340i.put(str, str7);
                    }
                    P1.g i2 = P1.g.i(hVar2, c1009d.f8341d, str);
                    K1.h hVar3 = new K1.h();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new RunnableC1008c(c1009d, i2, hVar3));
                    hVar.b((x4.f) AbstractC1053a.e(hVar3.f1428a));
                    return;
                } catch (Exception e7) {
                    hVar.a(e7);
                    return;
                }
        }
    }
}
