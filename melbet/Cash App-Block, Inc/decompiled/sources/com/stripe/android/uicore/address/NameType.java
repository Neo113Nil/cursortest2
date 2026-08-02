package com.stripe.android.uicore.address;

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
public final class NameType {

    /* JADX INFO: Fake field, exist only in values array */
    NameType EF5;
    public static final /* synthetic */ NameType[] $VALUES = {new NameType("Area", 0), new NameType("Cedex", 1), new NameType("City", 2), new NameType("Country", 3), new NameType("County", 4), new NameType("Department", 5), new NameType("District", 6), new NameType("DoSi", 7), new NameType("Eircode", 8), new NameType("Emirate", 9), new NameType("Island", 10), new NameType("Neighborhood", 11), new NameType("Oblast", 12), new NameType("Parish", 13), new NameType("Pin", 14), new NameType("PostTown", 15), new NameType("Postal", 16), new NameType("Perfecture", 17), new NameType("Province", 18), new NameType("State", 19), new NameType("Suburb", 20), new NameType("SuburbOrCity", 21), new NameType("Townload", 22), new NameType("VillageTownship", 23), new NameType("Zip", 24)};
    public static final Companion Companion = new Companion();
    public static final Lazy $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(19));

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/address/NameType$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/address/NameType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) NameType.$cachedSerializer$delegate.getValue();
        }
    }

    public static NameType valueOf(String str) {
        return (NameType) Enum.valueOf(NameType.class, str);
    }

    public static NameType[] values() {
        return (NameType[]) $VALUES.clone();
    }
}
