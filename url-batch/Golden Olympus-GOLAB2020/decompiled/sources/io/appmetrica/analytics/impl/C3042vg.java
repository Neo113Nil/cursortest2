package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3042vg implements InterfaceC2726jb {

    /* renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f39977a;

    /* renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f39978b;

    public C3042vg(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor) {
        this.f39977a = iCommonExecutor;
        this.f39978b = InstallReferrerClient.newBuilder(context).build();
    }

    public static final void b(Fg fg, Throwable th) {
        fg.a(th);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2726jb
    public final void a(@NotNull Fg fg) {
        this.f39978b.startConnection(new C3016ug(this, fg));
    }

    public final void a(final Fg fg, final Throwable th) {
        this.f39977a.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Fp
            @Override // java.lang.Runnable
            public final void run() {
                C3042vg.b(Fg.this, th);
            }
        });
    }
}
