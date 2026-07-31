package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1432b1 implements InterfaceC1425a1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final co f15153a;

    public C1432b1(@NotNull co networkShowApi) {
        Intrinsics.checkNotNullParameter(networkShowApi, "networkShowApi");
        this.f15153a = networkShowApi;
    }

    @Override // com.ironsource.InterfaceC1425a1
    public void a(@NotNull Activity activity, @NotNull sj adInstance) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.f15153a.a(activity, adInstance, new HashMap());
    }

    @Override // com.ironsource.InterfaceC1425a1
    public boolean a(@NotNull sj adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return this.f15153a.a(adInstance);
    }
}
