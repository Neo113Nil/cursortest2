package com.stripe.android.uicore.address;

import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes8.dex */
public final class FieldSchema {
    public static final Lazy[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final ArrayList examples;
    public final boolean isNumeric;
    public final NameType nameType;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/address/FieldSchema$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/address/FieldSchema;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FieldSchema$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(16)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(17))};
    }

    public /* synthetic */ FieldSchema(int i, boolean z, ArrayList arrayList, NameType nameType) {
        if (4 != (i & 4)) {
            TuplesKt.throwMissingFieldException(i, 4, FieldSchema$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.isNumeric = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.examples = new ArrayList();
        } else {
            this.examples = arrayList;
        }
        this.nameType = nameType;
    }
}
