package ru.rustore.sdk.pay.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.model.RuStorePaymentException;
import ru.rustore.sdk.pay.model.Url;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final f1 f44150a;

    public g1(@NotNull f1 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f44150a = dataSource;
    }

    @NotNull
    public final Url a() {
        Object obj;
        Map<String, Object> map = this.f44150a.f44052a;
        if (map == null || (obj = map.get("scheme")) == null) {
            throw new RuStorePaymentException.ApplicationSchemeWasNotProvided();
        }
        return new Url(obj + "://rustore/sdkPay/back");
    }
}
