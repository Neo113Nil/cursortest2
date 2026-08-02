package com.stripe.android.uicore.elements;

import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes8.dex */
public final class AddressFieldConfiguration {

    /* JADX INFO: Fake field, exist only in values array */
    AddressFieldConfiguration EF5;
    public static final /* synthetic */ AddressFieldConfiguration[] $VALUES = {new AddressFieldConfiguration("HIDDEN", 0), new AddressFieldConfiguration("OPTIONAL", 1), new AddressFieldConfiguration("REQUIRED", 2)};
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(20));

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/elements/AddressFieldConfiguration$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) AddressFieldConfiguration.$cachedSerializer$delegate.getValue();
        }
    }

    public static AddressFieldConfiguration valueOf(String str) {
        return (AddressFieldConfiguration) Enum.valueOf(AddressFieldConfiguration.class, str);
    }

    public static AddressFieldConfiguration[] values() {
        return (AddressFieldConfiguration[]) $VALUES.clone();
    }
}
