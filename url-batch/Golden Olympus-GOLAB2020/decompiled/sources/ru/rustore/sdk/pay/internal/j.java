package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.s9;
import ru.rustore.sdk.pay.model.ProductType;
import ru.rustore.sdk.pay.model.RuStorePaymentException;

/* loaded from: classes3.dex */
public final class j {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44353a;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE_PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.NON_CONSUMABLE_PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44353a = iArr;
        }
    }

    @NotNull
    public static final k a(@NotNull ProductType productType) {
        Intrinsics.checkNotNullParameter(productType, "<this>");
        int i4 = a.f44353a[productType.ordinal()];
        if (i4 == 1) {
            return k.CONSUMABLE_PRODUCT;
        }
        if (i4 == 2) {
            return k.NON_CONSUMABLE_PRODUCT;
        }
        if (i4 == 3) {
            return k.SUBSCRIPTION;
        }
        throw new W1.m();
    }

    @NotNull
    public static final String a(@NotNull s9 s9Var) {
        Intrinsics.checkNotNullParameter(s9Var, "<this>");
        if (s9Var instanceof s9.b) {
            return "new_card";
        }
        if (s9Var instanceof s9.c) {
            return "vk_id";
        }
        if (s9Var instanceof s9.e) {
            return "sbp";
        }
        if (s9Var instanceof s9.d) {
            return "sberpay";
        }
        if (s9Var instanceof s9.a) {
            return "mobile";
        }
        if (s9Var instanceof s9.f) {
            return "unsupported";
        }
        throw new W1.m();
    }

    @NotNull
    public static final String a(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        String simpleName = th.getClass().getSimpleName();
        if (th instanceof RuStorePaymentException.RuStorePaymentNetworkException) {
            return simpleName + '_' + ((RuStorePaymentException.RuStorePaymentNetworkException) th).getCode();
        }
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n        throwableClassName\n    }");
        return simpleName;
    }
}
