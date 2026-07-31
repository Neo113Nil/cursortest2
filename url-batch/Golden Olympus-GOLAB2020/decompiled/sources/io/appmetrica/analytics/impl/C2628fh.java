package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2628fh implements InterfaceC3136z6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38969a;

    /* renamed from: b, reason: collision with root package name */
    public final C3056w4 f38970b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f38971c = Ia.j().w().e();

    public C2628fh(@NotNull Context context, @NotNull C3056w4 c3056w4) {
        this.f38969a = context;
        this.f38970b = c3056w4;
    }

    public final void a(@NotNull C2773l6 c2773l6, @Nullable Bundle bundle) {
        if (c2773l6.m()) {
            return;
        }
        this.f38971c.execute(new RunnableC3121yh(this.f38969a, c2773l6, bundle, this.f38970b));
    }

    public final void a(@NotNull C2771l4 c2771l4, @NotNull C2773l6 c2773l6, @NotNull K4 k4) {
        this.f38970b.a(c2771l4, k4).a(c2773l6, k4);
        this.f38970b.a(c2771l4.f39370b, c2771l4.f39371c, c2771l4.f39372d);
    }
}
