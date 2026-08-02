package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516bj implements InterfaceC0754l {

    /* renamed from: a, reason: collision with root package name */
    public Ve f11545a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f11546b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11548d;

    /* renamed from: e, reason: collision with root package name */
    public final C0490aj f11549e = new C0490aj();

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f11550f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        this.f11550f = new WeakReference(activity);
        if (!this.f11548d) {
            this.f11546b = a((Context) activity).p();
            this.f11547c = a((Context) activity).t();
            this.f11548d = true;
        }
        if (this.f11546b == null) {
            c(activity);
        }
    }

    public final synchronized ScreenInfo b(Context context) {
        try {
            if (!this.f11548d) {
                this.f11546b = a(context).p();
                this.f11547c = a(context).t();
                this.f11548d = true;
            }
            c((Context) this.f11550f.get());
            if (this.f11546b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.f11547c) {
                    c(context);
                    this.f11547c = true;
                    a(context).v();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11546b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.f11549e.getClass();
            ScreenInfo a3 = C0490aj.a(context);
            if (a3 == null || a3.equals(this.f11546b)) {
                return;
            }
            this.f11546b = a3;
            a(context).a(this.f11546b);
        }
    }

    public final Ve a(Context context) {
        if (this.f11545a == null) {
            this.f11545a = new Ve(C0501b4.l().c(context).a(context));
        }
        Ve ve = this.f11545a;
        kotlin.jvm.internal.i.b(ve);
        return ve;
    }

    public final void a(Ve ve) {
        this.f11545a = ve;
    }
}
