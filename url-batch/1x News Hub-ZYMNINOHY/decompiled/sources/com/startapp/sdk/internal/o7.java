package com.startapp.sdk.internal;

import Y1.C0120q;
import android.content.Context;
import b2.C0195i;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o7 implements j0 {
    public static final Object f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4230a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4231b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4232c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4233d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4234e;

    public o7(Context context, ib executor) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(executor, "executor");
        this.f4230a = context;
        this.f4231b = executor;
        this.f4234e = new ArrayList();
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a() {
        b(new C0120q(7));
    }

    public final void b(l2.l lVar) {
        synchronized (f) {
            try {
                if (this.f4233d) {
                    lVar.invoke(Boolean.TRUE);
                    return;
                }
                if (!this.f4232c) {
                    this.f4232c = true;
                    ((Executor) this.f4231b.a()).execute(new B0.n(13, this));
                }
                a(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final C0195i a(boolean z) {
        return C0195i.f2555a;
    }

    public static final void a(o7 this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        try {
            MobileAds.initialize(this$0.f4230a, new F());
        } catch (Throwable unused) {
            synchronized (f) {
                List Y2 = c2.e.Y(this$0.f4234e);
                this$0.f4234e.clear();
                this$0.f4232c = false;
                Iterator it = Y2.iterator();
                while (it.hasNext()) {
                    ((l2.l) it.next()).invoke(Boolean.FALSE);
                }
            }
        }
    }

    public static final C0195i b(l2.l listener, o7 this$0, AdUnitConfig config, boolean z) {
        kotlin.jvm.internal.j.e(listener, "$listener");
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(config, "$config");
        listener.invoke(z ? new q7(this$0.f4230a, config) : null);
        return C0195i.f2555a;
    }

    public static final void a(o7 this$0, InitializationStatus it) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(it, "it");
        synchronized (f) {
            List Y2 = c2.e.Y(this$0.f4234e);
            this$0.f4234e.clear();
            this$0.f4232c = false;
            this$0.f4233d = true;
            Iterator it2 = Y2.iterator();
            while (it2.hasNext()) {
                ((l2.l) it2.next()).invoke(Boolean.TRUE);
            }
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void b(AdUnitConfig config, l2.l listener) {
        kotlin.jvm.internal.j.e(config, "config");
        kotlin.jvm.internal.j.e(listener, "listener");
        b(new G(listener, this, config, 1));
    }

    public final void a(l2.l lVar) {
        synchronized (f) {
            this.f4234e.add(lVar);
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a(AdUnitConfig config, l2.l listener) {
        kotlin.jvm.internal.j.e(config, "config");
        kotlin.jvm.internal.j.e(listener, "listener");
        b(new G(listener, this, config, 0));
    }

    public static final C0195i a(l2.l listener, o7 this$0, AdUnitConfig config, boolean z) {
        kotlin.jvm.internal.j.e(listener, "$listener");
        kotlin.jvm.internal.j.e(this$0, "this$0");
        kotlin.jvm.internal.j.e(config, "$config");
        listener.invoke(z ? new n7(this$0.f4230a, config) : null);
        return C0195i.f2555a;
    }
}
