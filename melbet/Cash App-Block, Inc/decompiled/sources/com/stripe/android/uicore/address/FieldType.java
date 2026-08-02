package com.stripe.android.uicore.address;

import com.stripe.android.uicore.address.NameType;
import com.stripe.android.uicore.elements.IdentifierSpec;
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
public class FieldType {
    public static final /* synthetic */ FieldType[] $VALUES;
    public static final Lazy $cachedSerializer$delegate;
    public static final Companion Companion;

    /* JADX INFO: Fake field, exist only in values array */
    FieldType EF0;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/uicore/address/FieldType$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/uicore/address/FieldType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "stripe-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) FieldType.$cachedSerializer$delegate.getValue();
        }
    }

    static {
        IdentifierSpec.Companion.getClass();
        FieldType fieldType = new FieldType("AddressLine1", 0);
        FieldType fieldType2 = new FieldType("AddressLine2", 1);
        FieldType fieldType3 = new FieldType("Locality", 2);
        FieldType fieldType4 = new FieldType("DependentLocality", 3);
        FieldType fieldType5 = new FieldType() { // from class: com.stripe.android.uicore.address.FieldType.PostalCode
            {
                IdentifierSpec.Companion.getClass();
            }
        };
        FieldType fieldType6 = new FieldType() { // from class: com.stripe.android.uicore.address.FieldType.SortingCode
            {
                IdentifierSpec.Companion.getClass();
            }
        };
        NameType.Companion companion = NameType.Companion;
        $VALUES = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, new FieldType("AdministrativeArea", 6), new FieldType("Name", 7)};
        Companion = new Companion();
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(18));
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }
}
