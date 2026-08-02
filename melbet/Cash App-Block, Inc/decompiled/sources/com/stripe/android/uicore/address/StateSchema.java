package com.stripe.android.uicore.address;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class StateSchema {
    public static final Companion Companion = new Companion();
    public final String key;
    public final String name;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/address/StateSchema$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/address/StateSchema;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return StateSchema$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StateSchema(int i, String str, String str2) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, StateSchema$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.key = str;
        this.name = str2;
    }
}
