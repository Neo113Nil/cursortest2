package com.startapp.sdk.internal;

import android.content.Context;
import c3.C0297i;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class o7 implements j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f7363f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7364a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f7365b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7366c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7367d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7368e;

    public o7(Context context, ib executor) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(executor, "executor");
        this.f7364a = context;
        this.f7365b = executor;
        this.f7368e = new ArrayList();
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a() {
        b(new A(3));
    }

    public final void b(InterfaceC1339l interfaceC1339l) {
        synchronized (f7363f) {
            try {
                if (this.f7367d) {
                    interfaceC1339l.invoke(Boolean.TRUE);
                    return;
                }
                if (!this.f7366c) {
                    this.f7366c = true;
                    ((Executor) this.f7365b.a()).execute(new R1.n(20, this));
                }
                a(interfaceC1339l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final C0297i a(boolean z) {
        return C0297i.f5732a;
    }

    public static final void a(o7 this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        try {
            MobileAds.initialize(this$0.f7364a, new H());
        } catch (Throwable unused) {
            synchronized (f7363f) {
                List n02 = d3.i.n0(this$0.f7368e);
                this$0.f7368e.clear();
                this$0.f7366c = false;
                Iterator it = n02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1339l) it.next()).invoke(Boolean.FALSE);
                }
            }
        }
    }

    public static final C0297i b(InterfaceC1339l listener, o7 this$0, AdUnitConfig config, boolean z) {
        kotlin.jvm.internal.i.e(listener, "$listener");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(config, "$config");
        listener.invoke(z ? new q7(this$0.f7364a, config) : null);
        return C0297i.f5732a;
    }

    public static final void a(o7 this$0, InitializationStatus it) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(it, "it");
        synchronized (f7363f) {
            List n02 = d3.i.n0(this$0.f7368e);
            this$0.f7368e.clear();
            this$0.f7366c = false;
            this$0.f7367d = true;
            Iterator it2 = n02.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1339l) it2.next()).invoke(Boolean.TRUE);
            }
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void b(AdUnitConfig config, InterfaceC1339l listener) {
        kotlin.jvm.internal.i.e(config, "config");
        kotlin.jvm.internal.i.e(listener, "listener");
        b(new I(listener, this, config, 1));
    }

    public final void a(InterfaceC1339l interfaceC1339l) {
        synchronized (f7363f) {
            this.f7368e.add(interfaceC1339l);
        }
    }

    @Override // com.startapp.sdk.internal.j0
    public final void a(AdUnitConfig config, InterfaceC1339l listener) {
        kotlin.jvm.internal.i.e(config, "config");
        kotlin.jvm.internal.i.e(listener, "listener");
        b(new I(listener, this, config, 0));
    }

    public static final C0297i a(InterfaceC1339l listener, o7 this$0, AdUnitConfig config, boolean z) {
        kotlin.jvm.internal.i.e(listener, "$listener");
        kotlin.jvm.internal.i.e(this$0, "this$0");
        kotlin.jvm.internal.i.e(config, "$config");
        listener.invoke(z ? new n7(this$0.f7364a, config) : null);
        return C0297i.f5732a;
    }
}
