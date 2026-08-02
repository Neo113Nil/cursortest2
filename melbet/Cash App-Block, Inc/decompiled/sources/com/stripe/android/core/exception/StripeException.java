package com.stripe.android.core.exception;

import com.stripe.android.core.StripeError;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/core/exception/StripeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Account", "stripe-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class StripeException extends Exception {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final boolean isClientError;
    public final String requestId;
    public final int statusCode;
    public final StripeError stripeError;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StripeException(int i, int i2, StripeError stripeError, String str, String str2, Throwable th) {
        this(stripeError, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : th, (i2 & 16) != 0 ? stripeError != null ? stripeError.message : null : str2);
        stripeError = (i2 & 1) != 0 ? null : stripeError;
    }

    public String analyticsValue() {
        return "stripeException";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeException) {
            StripeException stripeException = (StripeException) obj;
            if (Intrinsics.areEqual(this.stripeError, stripeException.stripeError) && Intrinsics.areEqual(this.requestId, stripeException.requestId) && this.statusCode == stripeException.statusCode && Intrinsics.areEqual(getMessage(), stripeException.getMessage())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.stripeError, this.requestId, Integer.valueOf(this.statusCode), getMessage());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.requestId;
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str != null ? "Request-id: ".concat(str) : null, super.toString()}), "\n", null, null, 0, null, null, 62);
    }

    public StripeException(StripeError stripeError, String str, int i, Throwable th, String str2) {
        super(str2, th);
        this.stripeError = stripeError;
        this.requestId = str;
        this.statusCode = i;
        boolean z = false;
        if (400 <= i && i < 500) {
            z = true;
        }
        this.isClientError = z;
    }
}
