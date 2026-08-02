package com.stripe.android.financialconnections.model;

import android.os.Parcelable;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable(with = PaymentAccountSerializer.class)
/* loaded from: classes8.dex */
public abstract class PaymentAccount implements Parcelable {
    public static final Companion Companion = new Companion();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/PaymentAccount$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return PaymentAccountSerializer.INSTANCE;
        }
    }

    public abstract String getId();
}
