package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.PurchaseId;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.Url;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;

/* loaded from: classes3.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f44814a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final y4 f44815b;

    public q9(@NotNull r0 requestFactory, @NotNull y4 deviceIdProvider) {
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f44814a = requestFactory;
        this.f44815b = deviceIdProvider;
    }

    public static Single a(q9 q9Var, Url url, Url url2, Url url3, String str, SdkTheme sdkTheme, String str2, PurchaseId purchaseId, int i4) {
        if ((i4 & 1) != 0) {
            url = null;
        }
        if ((i4 & 2) != 0) {
            url2 = null;
        }
        if ((i4 & 4) != 0) {
            url3 = null;
        }
        if ((i4 & 8) != 0) {
            str = null;
        }
        SdkTheme sdkTheme2 = (i4 & 16) != 0 ? null : sdkTheme;
        q9Var.getClass();
        return SingleSubscribeOnKt.subscribeOn(Single.Companion.from(new k9(q9Var, url, url2, url3, str, str2, purchaseId, sdkTheme2)), Dispatchers.INSTANCE.getIo());
    }
}
