package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public class b {
    private final k a;
    private final WeakReference b;
    private final WeakReference c;
    private g7 d;

    private b(t1 t1Var, a.InterfaceC0083a interfaceC0083a, k kVar) {
        this.b = new WeakReference(t1Var);
        this.c = new WeakReference(interfaceC0083a);
        this.a = kVar;
    }

    public static b a(t1 t1Var, a.InterfaceC0083a interfaceC0083a, k kVar) {
        b bVar = new b(t1Var, interfaceC0083a, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.a.f().a(this);
    }

    public t1 b() {
        return (t1) this.b.get();
    }

    public void d() {
        a();
        t1 b = b();
        if (b == null) {
            return;
        }
        b.setExpired();
        a.InterfaceC0083a interfaceC0083a = (a.InterfaceC0083a) this.c.get();
        if (interfaceC0083a == null) {
            return;
        }
        interfaceC0083a.onAdExpired(b);
    }

    public void a(long j) {
        a();
        if (((Boolean) this.a.a(x4.b1)).booleanValue() || !this.a.m0().isApplicationPaused()) {
            this.d = g7.a(j, this.a, new Runnable() { // from class: com.applovin.impl.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    }

    public void a() {
        g7 g7Var = this.d;
        if (g7Var != null) {
            g7Var.a();
            this.d = null;
        }
    }
}
