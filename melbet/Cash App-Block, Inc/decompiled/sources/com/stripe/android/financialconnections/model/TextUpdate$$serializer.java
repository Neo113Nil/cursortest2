package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/TextUpdate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/TextUpdate;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/TextUpdate;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class TextUpdate$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final TextUpdate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TextUpdate$$serializer textUpdate$$serializer = new TextUpdate$$serializer();
        INSTANCE = textUpdate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.TextUpdate", textUpdate$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("account_picker_pane", true);
        pluginGeneratedSerialDescriptor.addElement("consent_pane", true);
        pluginGeneratedSerialDescriptor.addElement("link_login_pane", true);
        pluginGeneratedSerialDescriptor.addElement("networking_link_signup_pane", true);
        pluginGeneratedSerialDescriptor.addElement("oauth_prepane", true);
        pluginGeneratedSerialDescriptor.addElement("returning_networking_user_account_picker", true);
        pluginGeneratedSerialDescriptor.addElement("success_pane", true);
        pluginGeneratedSerialDescriptor.addElement("id_consent_content_pane", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(AccountPickerPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConsentPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LinkLoginPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(NetworkingLinkSignupPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OauthPrepane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ReturningNetworkingUserAccountPicker$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SuccessPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IDConsentContentPane$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final TextUpdate deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        TextUpdate textUpdate = null;
        boolean z = true;
        int i = 0;
        AccountPickerPane accountPickerPane = null;
        ConsentPane consentPane = null;
        LinkLoginPane linkLoginPane = null;
        NetworkingLinkSignupPane networkingLinkSignupPane = null;
        OauthPrepane oauthPrepane = null;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = null;
        SuccessPane successPane = null;
        IDConsentContentPane iDConsentContentPane = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    accountPickerPane = (AccountPickerPane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AccountPickerPane$$serializer.INSTANCE, accountPickerPane);
                    i |= 1;
                    break;
                case 1:
                    consentPane = (ConsentPane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ConsentPane$$serializer.INSTANCE, consentPane);
                    i |= 2;
                    break;
                case 2:
                    linkLoginPane = (LinkLoginPane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LinkLoginPane$$serializer.INSTANCE, linkLoginPane);
                    i |= 4;
                    break;
                case 3:
                    networkingLinkSignupPane = (NetworkingLinkSignupPane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, NetworkingLinkSignupPane$$serializer.INSTANCE, networkingLinkSignupPane);
                    i |= 8;
                    break;
                case 4:
                    oauthPrepane = (OauthPrepane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, OauthPrepane$$serializer.INSTANCE, oauthPrepane);
                    i |= 16;
                    break;
                case 5:
                    returningNetworkingUserAccountPicker = (ReturningNetworkingUserAccountPicker) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE, returningNetworkingUserAccountPicker);
                    i |= 32;
                    break;
                case 6:
                    successPane = (SuccessPane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, SuccessPane$$serializer.INSTANCE, successPane);
                    i |= 64;
                    break;
                case 7:
                    iDConsentContentPane = (IDConsentContentPane) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IDConsentContentPane$$serializer.INSTANCE, iDConsentContentPane);
                    i |= 128;
                    break;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return textUpdate;
            }
            textUpdate = null;
        }
        beginStructure.endStructure(serialDescriptor);
        return new TextUpdate(i, accountPickerPane, consentPane, linkLoginPane, networkingLinkSignupPane, oauthPrepane, returningNetworkingUserAccountPicker, successPane, iDConsentContentPane);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TextUpdate value) {
        encoder.getClass();
        value.getClass();
        IDConsentContentPane iDConsentContentPane = value.idConsentContentPane;
        SuccessPane successPane = value.successPane;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker = value.returningNetworkingUserAccountPicker;
        OauthPrepane oauthPrepane = value.oauthPrepane;
        NetworkingLinkSignupPane networkingLinkSignupPane = value.networkingLinkSignupPane;
        LinkLoginPane linkLoginPane = value.linkLoginPane;
        ConsentPane consentPane = value.consent;
        AccountPickerPane accountPickerPane = value.accountPicker;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || accountPickerPane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 0, AccountPickerPane$$serializer.INSTANCE, accountPickerPane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || consentPane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ConsentPane$$serializer.INSTANCE, consentPane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || linkLoginPane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LinkLoginPane$$serializer.INSTANCE, linkLoginPane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || networkingLinkSignupPane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 3, NetworkingLinkSignupPane$$serializer.INSTANCE, networkingLinkSignupPane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || oauthPrepane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 4, OauthPrepane$$serializer.INSTANCE, oauthPrepane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || returningNetworkingUserAccountPicker != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 5, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE, returningNetworkingUserAccountPicker);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || successPane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 6, SuccessPane$$serializer.INSTANCE, successPane);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || iDConsentContentPane != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 7, IDConsentContentPane$$serializer.INSTANCE, iDConsentContentPane);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
