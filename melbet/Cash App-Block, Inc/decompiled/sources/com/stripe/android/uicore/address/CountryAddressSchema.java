package com.stripe.android.uicore.address;

import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
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
public final class CountryAddressSchema {
    public final boolean required;
    public final FieldSchema schema;

    /* renamed from: type, reason: collision with root package name */
    public final FieldType f1447type;
    public static final Companion Companion = new Companion();
    public static final Lazy[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(15)), null, null};

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/address/CountryAddressSchema$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return CountryAddressSchema$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CountryAddressSchema(int i, FieldType fieldType, boolean z, FieldSchema fieldSchema) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, CountryAddressSchema$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f1447type = fieldType;
        this.required = z;
        if ((i & 4) == 0) {
            this.schema = null;
        } else {
            this.schema = fieldSchema;
        }
    }
}
