package ru.rustore.sdk.pay.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f45128a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final i6 f45129b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final m f45130c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final jn f45131d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f45132e;

    public vc(@NotNull s5 generalAnalyticsParametersFactory, @NotNull i6 getSandboxModeUseCase, @NotNull m analyticsSender, @NotNull jn userRepository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(getSandboxModeUseCase, "getSandboxModeUseCase");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45128a = generalAnalyticsParametersFactory;
        this.f45129b = getSandboxModeUseCase;
        this.f45130c = analyticsSender;
        this.f45131d = userRepository;
        this.f45132e = context;
    }
}
