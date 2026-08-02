package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523gj implements InterfaceC0632l {

    /* renamed from: a, reason: collision with root package name */
    public C0364af f7409a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f7410b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7411c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7412d;

    /* renamed from: e, reason: collision with root package name */
    public final C0497fj f7413e = new C0497fj();
    public WeakReference f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        try {
            this.f = new WeakReference(activity);
            if (!this.f7412d) {
                if (this.f7409a == null) {
                    this.f7409a = new C0364af(C0511g7.a(activity).a());
                }
                C0364af c0364af = this.f7409a;
                kotlin.jvm.internal.j.b(c0364af);
                this.f7410b = c0364af.p();
                if (this.f7409a == null) {
                    this.f7409a = new C0364af(C0511g7.a(activity).a());
                }
                C0364af c0364af2 = this.f7409a;
                kotlin.jvm.internal.j.b(c0364af2);
                this.f7411c = c0364af2.t();
                this.f7412d = true;
            }
            if (this.f7410b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f7413e.getClass();
            ScreenInfo a3 = C0497fj.a(context);
            if (a3 == null || a3.equals(this.f7410b)) {
                return;
            }
            this.f7410b = a3;
            if (this.f7409a == null) {
                this.f7409a = new C0364af(C0511g7.a(context).a());
            }
            C0364af c0364af = this.f7409a;
            kotlin.jvm.internal.j.b(c0364af);
            c0364af.a(this.f7410b);
        }
    }

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.f7412d) {
                if (this.f7409a == null) {
                    this.f7409a = new C0364af(C0511g7.a(context).a());
                }
                C0364af c0364af = this.f7409a;
                kotlin.jvm.internal.j.b(c0364af);
                this.f7410b = c0364af.p();
                if (this.f7409a == null) {
                    this.f7409a = new C0364af(C0511g7.a(context).a());
                }
                C0364af c0364af2 = this.f7409a;
                kotlin.jvm.internal.j.b(c0364af2);
                this.f7411c = c0364af2.t();
                this.f7412d = true;
            }
            b((Context) this.f.get());
            if (this.f7410b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f7411c) {
                        b(context);
                        this.f7411c = true;
                        if (this.f7409a == null) {
                            this.f7409a = new C0364af(C0511g7.a(context).a());
                        }
                        C0364af c0364af3 = this.f7409a;
                        kotlin.jvm.internal.j.b(c0364af3);
                        c0364af3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7410b;
    }

    public final void a(C0364af c0364af) {
        this.f7409a = c0364af;
    }
}
