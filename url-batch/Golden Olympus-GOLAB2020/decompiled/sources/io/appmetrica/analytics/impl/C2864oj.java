package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.oj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2864oj implements InterfaceC2740k {

    /* renamed from: a, reason: collision with root package name */
    public C2730jf f39582a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f39583b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39584c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39585d;

    /* renamed from: e, reason: collision with root package name */
    public final C2838nj f39586e = new C2838nj();

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f39587f = new WeakReference(null);

    public final synchronized void a(@NotNull Activity activity) {
        try {
            this.f39587f = new WeakReference(activity);
            if (!this.f39585d) {
                if (this.f39582a == null) {
                    this.f39582a = new C2730jf(C3007u7.a(activity).a());
                }
                C2730jf c2730jf = this.f39582a;
                Intrinsics.checkNotNull(c2730jf);
                this.f39583b = c2730jf.p();
                if (this.f39582a == null) {
                    this.f39582a = new C2730jf(C3007u7.a(activity).a());
                }
                C2730jf c2730jf2 = this.f39582a;
                Intrinsics.checkNotNull(c2730jf2);
                this.f39584c = c2730jf2.t();
                this.f39585d = true;
            }
            if (this.f39583b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f39586e.getClass();
            ScreenInfo a4 = C2838nj.a(context);
            if (a4 == null || Intrinsics.areEqual(a4, this.f39583b)) {
                return;
            }
            this.f39583b = a4;
            if (this.f39582a == null) {
                this.f39582a = new C2730jf(C3007u7.a(context).a());
            }
            C2730jf c2730jf = this.f39582a;
            Intrinsics.checkNotNull(c2730jf);
            c2730jf.a(this.f39583b);
        }
    }

    @Nullable
    public final synchronized ScreenInfo a(@NotNull Context context) {
        try {
            if (!this.f39585d) {
                if (this.f39582a == null) {
                    this.f39582a = new C2730jf(C3007u7.a(context).a());
                }
                C2730jf c2730jf = this.f39582a;
                Intrinsics.checkNotNull(c2730jf);
                this.f39583b = c2730jf.p();
                if (this.f39582a == null) {
                    this.f39582a = new C2730jf(C3007u7.a(context).a());
                }
                C2730jf c2730jf2 = this.f39582a;
                Intrinsics.checkNotNull(c2730jf2);
                this.f39584c = c2730jf2.t();
                this.f39585d = true;
            }
            b((Context) this.f39587f.get());
            if (this.f39583b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f39584c) {
                        b(context);
                        this.f39584c = true;
                        if (this.f39582a == null) {
                            this.f39582a = new C2730jf(C3007u7.a(context).a());
                        }
                        C2730jf c2730jf3 = this.f39582a;
                        Intrinsics.checkNotNull(c2730jf3);
                        c2730jf3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f39583b;
    }

    public final void a(@NotNull C2730jf c2730jf) {
        this.f39582a = c2730jf;
    }
}
