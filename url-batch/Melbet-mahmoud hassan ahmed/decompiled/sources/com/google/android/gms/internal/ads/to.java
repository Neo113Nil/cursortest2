package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public final class to {

    /* renamed from: a, reason: collision with root package name */
    private final Object f12286a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ro f12287b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12288c = false;

    public final Activity a() {
        synchronized (this.f12286a) {
            ro roVar = this.f12287b;
            if (roVar == null) {
                return null;
            }
            return roVar.a();
        }
    }

    public final Context b() {
        synchronized (this.f12286a) {
            ro roVar = this.f12287b;
            if (roVar == null) {
                return null;
            }
            return roVar.b();
        }
    }

    public final void c(so soVar) {
        synchronized (this.f12286a) {
            if (this.f12287b == null) {
                this.f12287b = new ro();
            }
            this.f12287b.f(soVar);
        }
    }

    public final void d(Context context) {
        synchronized (this.f12286a) {
            if (!this.f12288c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    io0.g("Can not cast Context to Application");
                    return;
                }
                if (this.f12287b == null) {
                    this.f12287b = new ro();
                }
                this.f12287b.g(application, context);
                this.f12288c = true;
            }
        }
    }

    public final void e(so soVar) {
        synchronized (this.f12286a) {
            ro roVar = this.f12287b;
            if (roVar == null) {
                return;
            }
            roVar.h(soVar);
        }
    }
}
