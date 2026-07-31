package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.exception.RuStoreException;

/* loaded from: classes3.dex */
public final class m1 extends RuStoreException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f44617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(@NotNull String bankName, @NotNull String bankSchema) {
        super("Cannot find bank app " + bankName + " with schema " + bankSchema);
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(bankSchema, "bankSchema");
        this.f44617a = bankName;
    }
}
