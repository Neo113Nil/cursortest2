package ru.rustore.unitysdk.billingclient;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.billingclient.presentation.BillingClientTheme;
import ru.rustore.sdk.billingclient.provider.BillingClientThemeProvider;

@Metadata
/* loaded from: classes3.dex */
public final class RuStoreBillingClientThemeProviderImpl implements BillingClientThemeProvider {

    @NotNull
    public static final RuStoreBillingClientThemeProviderImpl INSTANCE = new RuStoreBillingClientThemeProviderImpl();

    @NotNull
    private static volatile BillingClientTheme theme = BillingClientTheme.Light;

    private RuStoreBillingClientThemeProviderImpl() {
    }

    @NotNull
    public final BillingClientTheme getTheme() {
        return theme;
    }

    @NotNull
    public BillingClientTheme provide() {
        return theme;
    }

    public final void setTheme(@NotNull BillingClientTheme value) {
        Intrinsics.checkNotNullParameter(value, "value");
        theme = value;
    }
}
