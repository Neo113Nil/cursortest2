package com.stripe.android.core.exception;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/core/exception/APIConnectionException;", "Lcom/stripe/android/core/exception/StripeException;", "com/datadog/android/trace/Trace", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class APIConnectionException extends StripeException {
    public static final Set SENSITIVE_PARAM_NAMES = ArraysKt___ArraysKt.toSet(new String[]{"key", "client_secret", "ephemeral_key", "legacy_customer_ephemeral_key"});
    public static final List SENSITIVE_VALUE_PREFIXES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ek_live_", "ek_test_", "pk_live_", "pk_test_", "sk_live_", "sk_test_", "uk_live_", "uk_test_", "rk_live_", "rk_test_"});

    public APIConnectionException(String str, Throwable th) {
        super(0, 7, null, null, str, th);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public final String analyticsValue() {
        return "connectionError";
    }
}
