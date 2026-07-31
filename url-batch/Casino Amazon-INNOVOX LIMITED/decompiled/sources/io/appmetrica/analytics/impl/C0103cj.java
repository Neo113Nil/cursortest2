package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0103cj implements InterfaceC0315l {

    /* renamed from: a, reason: collision with root package name */
    public We f1202a;
    public ScreenInfo b;
    public boolean c;
    public boolean d;
    public final C0077bj e = new C0077bj();
    public WeakReference f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        this.f = new WeakReference(activity);
        if (!this.d) {
            this.b = a((Context) activity).p();
            this.c = a((Context) activity).t();
            this.d = true;
        }
        if (this.b == null) {
            c(activity);
        }
    }

    public final synchronized ScreenInfo b(Context context) {
        if (!this.d) {
            this.b = a(context).p();
            this.c = a(context).t();
            this.d = true;
        }
        c((Context) this.f.get());
        if (this.b == null) {
            if (!AndroidUtils.isApiAchieved(30)) {
                c(context);
            } else if (!this.c) {
                c(context);
                this.c = true;
                a(context).v();
            }
        }
        return this.b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.e.getClass();
            ScreenInfo a2 = C0077bj.a(context);
            if (a2 == null || Intrinsics.areEqual(a2, this.b)) {
                return;
            }
            this.b = a2;
            a(context).a(this.b);
        }
    }

    public final We a(Context context) {
        if (this.f1202a == null) {
            this.f1202a = new We(C0088c4.l().c(context).a(context));
        }
        We we = this.f1202a;
        Intrinsics.checkNotNull(we);
        return we;
    }

    public final void a(We we) {
        this.f1202a = we;
    }
}
