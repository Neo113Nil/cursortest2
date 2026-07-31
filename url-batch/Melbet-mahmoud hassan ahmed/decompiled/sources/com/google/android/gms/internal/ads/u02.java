package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import r3.c;

/* loaded from: classes.dex */
public abstract class u02 implements c.a, c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final bp0<InputStream> f12533a = new bp0<>();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f12534b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f12535c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f12536d = false;

    /* renamed from: e, reason: collision with root package name */
    protected vi0 f12537e;

    /* renamed from: f, reason: collision with root package name */
    protected gi0 f12538f;

    public void E(o3.b bVar) {
        io0.b("Disconnected from remote ad request service.");
        this.f12533a.f(new k12(1));
    }

    protected final void a() {
        synchronized (this.f12534b) {
            this.f12536d = true;
            if (this.f12538f.a() || this.f12538f.k()) {
                this.f12538f.d();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // r3.c.a
    public final void q0(int i7) {
        io0.b("Cannot connect to remote service, fallback to local instance.");
    }
}
