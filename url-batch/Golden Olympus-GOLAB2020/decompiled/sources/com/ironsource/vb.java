package com.ironsource;

import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class vb implements cm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSourceError f20022a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e7 f20023b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f20024c;

    public vb(@NotNull IronSourceError error, @NotNull e7 adLoadTaskListener, @NotNull InterfaceC1541q3 analytics) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.f20022a = error;
        this.f20023b = adLoadTaskListener;
        this.f20024c = analytics;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f20022a;
    }

    @Override // com.ironsource.cm
    public void start() {
        InterfaceC1490j3.c.a aVar = InterfaceC1490j3.c.f16799a;
        aVar.a().a(this.f20024c);
        aVar.a(new C1511m3.j(this.f20022a.getErrorCode()), new C1511m3.k(this.f20022a.getErrorMessage()), new C1511m3.f(0L)).a(this.f20024c);
        this.f20023b.onAdLoadFailed(this.f20022a);
    }
}
