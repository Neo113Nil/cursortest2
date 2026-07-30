package com.google.android.gms.internal.ads;

import O2.InterfaceC0365b;
import O2.InterfaceC0366c;
import android.content.Context;
import android.os.Binder;

/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4082vp implements InterfaceC0365b, InterfaceC0366c {

    /* renamed from: n, reason: collision with root package name */
    public final C3320hg f34864n = new C3320hg();

    /* renamed from: u, reason: collision with root package name */
    public final Object f34865u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public boolean f34866v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34867w = false;

    /* renamed from: x, reason: collision with root package name */
    public C2687Ne f34868x;

    /* renamed from: y, reason: collision with root package name */
    public T8 f34869y;

    public static void b(Context context, C3320hg c3320hg, SD sd) {
        if (((Boolean) AbstractC2530Ea.f24775j.r()).booleanValue() || ((Boolean) AbstractC2530Ea.f24774h.r()).booleanValue()) {
            c3320hg.c(new MD(0, c3320hg, new C3314ha(context, 2)), sd);
        }
    }

    public final void a() {
        synchronized (this.f34865u) {
            try {
                this.f34867w = true;
                if (!this.f34869y.j()) {
                    if (this.f34869y.d()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f34869y.h();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onConnectionFailed(L2.b bVar) {
        int i = t2.C.f40822b;
        u2.i.a("Disconnected from remote ad request service.");
        this.f34864n.b(new C2494Bp(1));
    }

    @Override // O2.InterfaceC0365b
    public void onConnectionSuspended(int i) {
        int i4 = t2.C.f40822b;
        u2.i.a("Cannot connect to remote service, fallback to local instance.");
    }
}
