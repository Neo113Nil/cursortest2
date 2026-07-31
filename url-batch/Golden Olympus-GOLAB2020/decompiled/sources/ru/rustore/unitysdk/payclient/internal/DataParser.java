package ru.rustore.unitysdk.payclient.internal;

import io.jsonwebtoken.JwtParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.model.ApplicationPurchaseStatus;
import ru.rustore.sdk.pay.model.PreferredPurchaseType;
import ru.rustore.sdk.pay.model.ProductPurchaseStatus;
import ru.rustore.sdk.pay.model.PurchaseStatus;
import ru.rustore.sdk.pay.model.SdkTheme;
import ru.rustore.sdk.pay.model.SubscriptionPurchaseStatus;

@Metadata
/* loaded from: classes3.dex */
public final class DataParser {

    @NotNull
    public static final DataParser INSTANCE = new DataParser();

    @NotNull
    private static final PreferredPurchaseType PreferredPurchaseTypeDefault = PreferredPurchaseType.ONE_STEP;

    @NotNull
    private static final SdkTheme SdkThemeDefault = SdkTheme.LIGHT;

    private DataParser() {
    }

    @Nullable
    public final PurchaseStatus parsePurchaseStatus(@NotNull String statusString) {
        Object m243constructorimpl;
        Object m243constructorimpl2;
        Object m243constructorimpl3;
        Intrinsics.checkNotNullParameter(statusString, "statusString");
        List D02 = StringsKt.D0(statusString, new char[]{JwtParser.SEPARATOR_CHAR}, false, 0, 6, null);
        if (D02.size() != 2) {
            return null;
        }
        String str = (String) D02.get(0);
        String str2 = (String) D02.get(1);
        int hashCode = str.hashCode();
        if (hashCode != -35432702) {
            if (hashCode != 573064944) {
                if (hashCode == 1726996899 && str.equals("ApplicationPurchaseStatus")) {
                    try {
                        Result.Companion companion = Result.Companion;
                        m243constructorimpl3 = Result.m243constructorimpl(ApplicationPurchaseStatus.valueOf(str2));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        m243constructorimpl3 = Result.m243constructorimpl(ResultKt.createFailure(th));
                    }
                    return (PurchaseStatus) (Result.m244isFailureimpl(m243constructorimpl3) ? null : m243constructorimpl3);
                }
            } else if (str.equals("SubscriptionPurchaseStatus")) {
                try {
                    Result.Companion companion3 = Result.Companion;
                    m243constructorimpl2 = Result.m243constructorimpl(SubscriptionPurchaseStatus.valueOf(str2));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.Companion;
                    m243constructorimpl2 = Result.m243constructorimpl(ResultKt.createFailure(th2));
                }
                return (PurchaseStatus) (Result.m244isFailureimpl(m243constructorimpl2) ? null : m243constructorimpl2);
            }
        } else if (str.equals("ProductPurchaseStatus")) {
            try {
                Result.Companion companion5 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ProductPurchaseStatus.valueOf(str2));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th3));
            }
            return (PurchaseStatus) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
        }
        return null;
    }

    @NotNull
    public final PreferredPurchaseType parsePurchaseType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return PreferredPurchaseType.valueOf(value);
        } catch (IllegalArgumentException unused) {
            return PreferredPurchaseTypeDefault;
        }
    }

    @NotNull
    public final SdkTheme parseSdkTheme(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return SdkTheme.valueOf(value);
        } catch (IllegalArgumentException unused) {
            return SdkThemeDefault;
        }
    }
}
