package com.stripe.android.financialconnections.model;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.ManualEntryMode;
import com.stripe.android.model.LinkBrand;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsSessionManifest$$serializer implements GeneratedSerializer {
    public static final int $stable;
    public static final FinancialConnectionsSessionManifest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FinancialConnectionsSessionManifest$$serializer financialConnectionsSessionManifest$$serializer = new FinancialConnectionsSessionManifest$$serializer();
        INSTANCE = financialConnectionsSessionManifest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest", financialConnectionsSessionManifest$$serializer, 46);
        pluginGeneratedSerialDescriptor.addElement("allow_manual_entry", false);
        pluginGeneratedSerialDescriptor.addElement("consent_required", false);
        pluginGeneratedSerialDescriptor.addElement("consent_acquired_at", false);
        pluginGeneratedSerialDescriptor.addElement("custom_manual_entry_handling", false);
        pluginGeneratedSerialDescriptor.addElement("disable_link_more_accounts", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("instant_verification_disabled", false);
        pluginGeneratedSerialDescriptor.addElement("institution_search_disabled", false);
        pluginGeneratedSerialDescriptor.addElement("app_verification_enabled", false);
        pluginGeneratedSerialDescriptor.addElement("livemode", false);
        pluginGeneratedSerialDescriptor.addElement("manual_entry_uses_microdeposits", false);
        pluginGeneratedSerialDescriptor.addElement("mobile_handoff_enabled", false);
        pluginGeneratedSerialDescriptor.addElement("next_pane", false);
        pluginGeneratedSerialDescriptor.addElement("manual_entry_mode", false);
        pluginGeneratedSerialDescriptor.addElement("permissions", false);
        pluginGeneratedSerialDescriptor.addElement("product", false);
        pluginGeneratedSerialDescriptor.addElement("single_account", false);
        pluginGeneratedSerialDescriptor.addElement("use_single_sort_search", false);
        pluginGeneratedSerialDescriptor.addElement("account_disconnection_method", true);
        pluginGeneratedSerialDescriptor.addElement("accountholder_customer_email_address", true);
        pluginGeneratedSerialDescriptor.addElement("accountholder_is_link_consumer", true);
        pluginGeneratedSerialDescriptor.addElement("accountholder_phone_number", true);
        pluginGeneratedSerialDescriptor.addElement("accountholder_token", true);
        pluginGeneratedSerialDescriptor.addElement("active_auth_session", true);
        pluginGeneratedSerialDescriptor.addElement("active_institution", true);
        pluginGeneratedSerialDescriptor.addElement("assignment_event_id", true);
        pluginGeneratedSerialDescriptor.addElement("business_name", true);
        pluginGeneratedSerialDescriptor.addElement("cancel_url", true);
        pluginGeneratedSerialDescriptor.addElement("connect_platform_name", true);
        pluginGeneratedSerialDescriptor.addElement("connected_account_name", true);
        pluginGeneratedSerialDescriptor.addElement("experiment_assignments", true);
        pluginGeneratedSerialDescriptor.addElement("display_text", true);
        pluginGeneratedSerialDescriptor.addElement("features", true);
        pluginGeneratedSerialDescriptor.addElement("hosted_auth_url", true);
        pluginGeneratedSerialDescriptor.addElement("initial_institution", true);
        pluginGeneratedSerialDescriptor.addElement("is_end_user_facing", true);
        pluginGeneratedSerialDescriptor.addElement("is_link_with_stripe", true);
        pluginGeneratedSerialDescriptor.addElement("is_networking_user_flow", true);
        pluginGeneratedSerialDescriptor.addElement("is_stripe_direct", true);
        pluginGeneratedSerialDescriptor.addElement("link_account_session_cancellation_behavior", true);
        pluginGeneratedSerialDescriptor.addElement("modal_customization", true);
        pluginGeneratedSerialDescriptor.addElement("payment_method_type", true);
        pluginGeneratedSerialDescriptor.addElement("success_url", true);
        pluginGeneratedSerialDescriptor.addElement("skip_success_pane", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        pluginGeneratedSerialDescriptor.addElement("link_brand", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FinancialConnectionsSessionManifest.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        FinancialConnectionsInstitution$$serializer financialConnectionsInstitution$$serializer = FinancialConnectionsInstitution$$serializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), booleanSerializer, booleanSerializer, stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, ManualEntryMode.Serializer.INSTANCE, lazyArr[14].getValue(), FinancialConnectionsSessionManifest.Product.Serializer.INSTANCE, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.AccountDisconnectionMethod.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsAuthorizationSession$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(financialConnectionsInstitution$$serializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[30].getValue()), BuiltinSerializersKt.getNullable(TextUpdate$$serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[32].getValue()), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(financialConnectionsInstitution$$serializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior.Serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer) lazyArr[40].getValue()), BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.Theme.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(LinkBrand.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FinancialConnectionsSessionManifest deserialize(Decoder decoder) {
        FinancialConnectionsSessionManifest.Theme theme;
        String str;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        int i;
        List list;
        Boolean bool;
        String str2;
        Boolean bool2;
        String str3;
        List list2;
        Boolean bool3;
        int i2;
        int i3;
        int i4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsSessionManifest.$childSerializers;
        FinancialConnectionsSessionManifest.Theme theme2 = null;
        Boolean bool4 = null;
        String str4 = null;
        Map map = null;
        LinkBrand linkBrand = null;
        FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = null;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = null;
        int i5 = 0;
        String str5 = null;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        String str6 = null;
        String str7 = null;
        FinancialConnectionsSessionManifest.Pane pane = null;
        ManualEntryMode manualEntryMode = null;
        int i6 = 0;
        List list3 = null;
        FinancialConnectionsSessionManifest.Product product = null;
        FinancialConnectionsSessionManifest.AccountDisconnectionMethod accountDisconnectionMethod = null;
        String str8 = null;
        Boolean bool9 = null;
        String str9 = null;
        String str10 = null;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = null;
        FinancialConnectionsInstitution financialConnectionsInstitution3 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        Map map2 = null;
        TextUpdate textUpdate = null;
        Map map3 = null;
        while (z7) {
            int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
            switch (decodeElementIndex) {
                case -1:
                    theme = theme2;
                    str = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i = i6;
                    list = list3;
                    bool = bool4;
                    z7 = false;
                    bool4 = bool;
                    list3 = list;
                    i6 = i;
                    str5 = str;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 0:
                    theme = theme2;
                    str = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i7 = i6;
                    list = list3;
                    bool = bool4;
                    i = i7 | 1;
                    z8 = beginStructure.decodeBooleanElement(serialDescriptor, 0);
                    bool4 = bool;
                    list3 = list;
                    i6 = i;
                    str5 = str;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 1:
                    theme = theme2;
                    str = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i8 = i6;
                    list = list3;
                    i = i8 | 2;
                    z11 = beginStructure.decodeBooleanElement(serialDescriptor, 1);
                    bool4 = bool4;
                    list3 = list;
                    i6 = i;
                    str5 = str;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 2:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i9 = i6;
                    i6 = i9 | 4;
                    bool4 = bool4;
                    list3 = list3;
                    str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str7);
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 3:
                    theme = theme2;
                    str = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i10 = i6;
                    list = list3;
                    bool2 = bool4;
                    i = i10 | 8;
                    z12 = beginStructure.decodeBooleanElement(serialDescriptor, 3);
                    bool4 = bool2;
                    list3 = list;
                    i6 = i;
                    str5 = str;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 4:
                    theme = theme2;
                    str = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i11 = i6;
                    list = list3;
                    bool2 = bool4;
                    i = i11 | 16;
                    z13 = beginStructure.decodeBooleanElement(serialDescriptor, 4);
                    bool4 = bool2;
                    list3 = list;
                    i6 = i;
                    str5 = str;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 5:
                    theme = theme2;
                    str = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i12 = i6;
                    list = list3;
                    bool2 = bool4;
                    i = i12 | 32;
                    str6 = beginStructure.decodeStringElement(serialDescriptor, 5);
                    bool4 = bool2;
                    list3 = list;
                    i6 = i;
                    str5 = str;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 6:
                    theme = theme2;
                    str3 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i13 = i6;
                    list2 = list3;
                    bool3 = bool4;
                    z = beginStructure.decodeBooleanElement(serialDescriptor, 6);
                    i2 = i13 | 64;
                    bool4 = bool3;
                    str5 = str3;
                    list3 = list2;
                    i6 = i2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 7:
                    theme = theme2;
                    str3 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i14 = i6;
                    list2 = list3;
                    bool3 = bool4;
                    z2 = beginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i2 = i14 | 128;
                    bool4 = bool3;
                    str5 = str3;
                    list3 = list2;
                    i6 = i2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 8:
                    theme = theme2;
                    str3 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i15 = i6;
                    list2 = list3;
                    bool3 = bool4;
                    z3 = beginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i2 = i15 | 256;
                    bool4 = bool3;
                    str5 = str3;
                    list3 = list2;
                    i6 = i2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 9:
                    theme = theme2;
                    str3 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i16 = i6;
                    list2 = list3;
                    bool3 = bool4;
                    z4 = beginStructure.decodeBooleanElement(serialDescriptor, 9);
                    i2 = i16 | 512;
                    bool4 = bool3;
                    str5 = str3;
                    list3 = list2;
                    i6 = i2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 10:
                    theme = theme2;
                    str3 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i17 = i6;
                    list2 = list3;
                    bool3 = bool4;
                    z5 = beginStructure.decodeBooleanElement(serialDescriptor, 10);
                    i2 = i17 | 1024;
                    bool4 = bool3;
                    str5 = str3;
                    list3 = list2;
                    i6 = i2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 11:
                    theme = theme2;
                    str3 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i18 = i6;
                    list2 = list3;
                    bool3 = bool4;
                    z6 = beginStructure.decodeBooleanElement(serialDescriptor, 11);
                    i2 = i18 | 2048;
                    bool4 = bool3;
                    str5 = str3;
                    list3 = list2;
                    i6 = i2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 12:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    int i19 = i6;
                    i6 = i19 | 4096;
                    bool4 = bool4;
                    list3 = list3;
                    pane = (FinancialConnectionsSessionManifest.Pane) beginStructure.decodeSerializableElement(serialDescriptor, 12, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane);
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 13:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    ManualEntryMode manualEntryMode2 = (ManualEntryMode) beginStructure.decodeSerializableElement(serialDescriptor, 13, ManualEntryMode.Serializer.INSTANCE, manualEntryMode);
                    i6 |= PKIFailureInfo.certRevoked;
                    bool4 = bool4;
                    list3 = list3;
                    manualEntryMode = manualEntryMode2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 14:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 16384;
                    list3 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), list3);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 15:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 32768;
                    product = (FinancialConnectionsSessionManifest.Product) beginStructure.decodeSerializableElement(serialDescriptor, 15, FinancialConnectionsSessionManifest.Product.Serializer.INSTANCE, product);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 16:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    z9 = beginStructure.decodeBooleanElement(serialDescriptor, 16);
                    i4 = 65536;
                    i3 = i6 | i4;
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 17:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    z10 = beginStructure.decodeBooleanElement(serialDescriptor, 17);
                    i4 = PKIFailureInfo.unsupportedVersion;
                    i3 = i6 | i4;
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 18:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    FinancialConnectionsSessionManifest.AccountDisconnectionMethod accountDisconnectionMethod2 = (FinancialConnectionsSessionManifest.AccountDisconnectionMethod) beginStructure.decodeNullableSerializableElement(serialDescriptor, 18, FinancialConnectionsSessionManifest.AccountDisconnectionMethod.Serializer.INSTANCE, accountDisconnectionMethod);
                    i3 = i6 | PKIFailureInfo.transactionIdInUse;
                    accountDisconnectionMethod = accountDisconnectionMethod2;
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 19:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    String str16 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, str8);
                    i3 = i6 | PKIFailureInfo.signerNotTrusted;
                    str8 = str16;
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 20:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    Boolean bool10 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, bool9);
                    i6 |= PKIFailureInfo.badCertTemplate;
                    bool9 = bool10;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 21:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    String str17 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, str9);
                    i6 |= PKIFailureInfo.badSenderNonce;
                    str9 = str17;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 22:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 4194304;
                    str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, str10);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 23:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 8388608;
                    financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) beginStructure.decodeNullableSerializableElement(serialDescriptor, 23, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE, financialConnectionsAuthorizationSession);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 24:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 16777216;
                    financialConnectionsInstitution3 = (FinancialConnectionsInstitution) beginStructure.decodeNullableSerializableElement(serialDescriptor, 24, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution3);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 25:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 33554432;
                    str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, str11);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 26:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 67108864;
                    str12 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, str12);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 27:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 134217728;
                    str13 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, str13);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 28:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 268435456;
                    str14 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, str14);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 29:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    String str18 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, str15);
                    i3 = i6 | PKIFailureInfo.duplicateCertReq;
                    str15 = str18;
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 30:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    i3 = i6 | 1073741824;
                    map2 = (Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 30, (KSerializer) lazyArr[30].getValue(), map2);
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 31:
                    theme = theme2;
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    TextUpdate textUpdate2 = (TextUpdate) beginStructure.decodeNullableSerializableElement(serialDescriptor, 31, TextUpdate$$serializer.INSTANCE, textUpdate);
                    i3 = i6 | PKIFailureInfo.systemUnavail;
                    textUpdate = textUpdate2;
                    i6 = i3;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 32:
                    theme = theme2;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    str2 = str5;
                    i5 |= 1;
                    map3 = (Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 32, (KSerializer) lazyArr[32].getValue(), map3);
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 33:
                    theme = theme2;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, str5);
                    i5 |= 2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 34:
                    str2 = str5;
                    theme = theme2;
                    i5 |= 4;
                    financialConnectionsInstitution = (FinancialConnectionsInstitution) beginStructure.decodeNullableSerializableElement(serialDescriptor, 34, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution2);
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 35:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    bool6 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 35, BooleanSerializer.INSTANCE, bool6);
                    i5 |= 8;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 36:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    bool7 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 36, BooleanSerializer.INSTANCE, bool7);
                    i5 |= 16;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 37:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    bool8 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 37, BooleanSerializer.INSTANCE, bool8);
                    i5 |= 32;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 38:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    bool5 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 38, BooleanSerializer.INSTANCE, bool5);
                    i5 |= 64;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 39:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    linkAccountSessionCancellationBehavior = (FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior) beginStructure.decodeNullableSerializableElement(serialDescriptor, 39, FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior.Serializer.INSTANCE, linkAccountSessionCancellationBehavior);
                    i5 |= 128;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 40:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    map = (Map) beginStructure.decodeNullableSerializableElement(serialDescriptor, 40, (KSerializer) lazyArr[40].getValue(), map);
                    i5 |= 256;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 41:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    supportedPaymentMethodTypes = (FinancialConnectionsAccount.SupportedPaymentMethodTypes) beginStructure.decodeNullableSerializableElement(serialDescriptor, 41, FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE, supportedPaymentMethodTypes);
                    i5 |= 512;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 42:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, str4);
                    i5 |= 1024;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 43:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    bool4 = (Boolean) beginStructure.decodeNullableSerializableElement(serialDescriptor, 43, BooleanSerializer.INSTANCE, bool4);
                    i5 |= 2048;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 44:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    theme2 = (FinancialConnectionsSessionManifest.Theme) beginStructure.decodeNullableSerializableElement(serialDescriptor, 44, FinancialConnectionsSessionManifest.Theme.Serializer.INSTANCE, theme2);
                    i5 |= 4096;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                case 45:
                    str2 = str5;
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                    linkBrand = (LinkBrand) beginStructure.decodeNullableSerializableElement(serialDescriptor, 45, LinkBrand.Serializer.INSTANCE, linkBrand);
                    i5 |= PKIFailureInfo.certRevoked;
                    theme = theme2;
                    str5 = str2;
                    financialConnectionsInstitution2 = financialConnectionsInstitution;
                    theme2 = theme;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        FinancialConnectionsSessionManifest.Theme theme3 = theme2;
        int i20 = i6;
        List list4 = list3;
        Boolean bool11 = bool4;
        String str19 = str7;
        beginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsSessionManifest(i20, i5, z8, z11, str19, z12, z13, str6, z, z2, z3, z4, z5, z6, pane, manualEntryMode, list4, product, z9, z10, accountDisconnectionMethod, str8, bool9, str9, str10, financialConnectionsAuthorizationSession, financialConnectionsInstitution3, str11, str12, str13, str14, str15, map2, textUpdate, map3, str5, financialConnectionsInstitution2, bool6, bool7, bool8, bool5, linkAccountSessionCancellationBehavior, map, supportedPaymentMethodTypes, str4, bool11, theme3, linkBrand);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FinancialConnectionsSessionManifest value) {
        encoder.getClass();
        value.getClass();
        LinkBrand linkBrand = value.rawLinkBrand;
        FinancialConnectionsSessionManifest.Theme theme = value.theme;
        Boolean bool = value.skipSuccessPane;
        String str = value.successUrl;
        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = value.paymentMethodType;
        Map map = value.modalCustomization;
        FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior linkAccountSessionCancellationBehavior = value.linkAccountSessionCancellationBehavior;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FinancialConnectionsSessionManifest.$childSerializers;
        boolean z = value.allowManualEntry;
        Boolean bool2 = value.isStripeDirect;
        Boolean bool3 = value.isNetworkingUserFlow;
        Boolean bool4 = value.isLinkWithStripe;
        Boolean bool5 = value.isEndUserFacing;
        FinancialConnectionsInstitution financialConnectionsInstitution = value.initialInstitution;
        String str2 = value.hostedAuthUrl;
        Map map2 = value.features;
        TextUpdate textUpdate = value.displayText;
        Map map3 = value.experimentAssignments;
        String str3 = value.connectedAccountName;
        String str4 = value.connectPlatformName;
        String str5 = value.cancelUrl;
        String str6 = value.businessName;
        String str7 = value.assignmentEventId;
        FinancialConnectionsInstitution financialConnectionsInstitution2 = value.activeInstitution;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = value.activeAuthSession;
        String str8 = value.accountholderToken;
        String str9 = value.accountholderPhoneNumber;
        Boolean bool6 = value.accountholderIsLinkConsumer;
        String str10 = value.accountholderCustomerEmailAddress;
        FinancialConnectionsSessionManifest.AccountDisconnectionMethod accountDisconnectionMethod = value.accountDisconnectionMethod;
        beginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        beginStructure.encodeBooleanElement(serialDescriptor, 1, value.consentRequired);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        beginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.consentAcquiredAt);
        beginStructure.encodeBooleanElement(serialDescriptor, 3, value.customManualEntryHandling);
        beginStructure.encodeBooleanElement(serialDescriptor, 4, value.disableLinkMoreAccounts);
        beginStructure.encodeStringElement(serialDescriptor, 5, value.id);
        beginStructure.encodeBooleanElement(serialDescriptor, 6, value.instantVerificationDisabled);
        beginStructure.encodeBooleanElement(serialDescriptor, 7, value.institutionSearchDisabled);
        beginStructure.encodeBooleanElement(serialDescriptor, 8, value.appVerificationEnabled);
        beginStructure.encodeBooleanElement(serialDescriptor, 9, value.livemode);
        beginStructure.encodeBooleanElement(serialDescriptor, 10, value.manualEntryUsesMicrodeposits);
        beginStructure.encodeBooleanElement(serialDescriptor, 11, value.mobileHandoffEnabled);
        beginStructure.encodeSerializableElement(serialDescriptor, 12, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, value.nextPane);
        beginStructure.encodeSerializableElement(serialDescriptor, 13, ManualEntryMode.Serializer.INSTANCE, value.manualEntryMode);
        beginStructure.encodeSerializableElement(serialDescriptor, 14, (KSerializer) lazyArr[14].getValue(), value.permissions);
        beginStructure.encodeSerializableElement(serialDescriptor, 15, FinancialConnectionsSessionManifest.Product.Serializer.INSTANCE, value.product);
        beginStructure.encodeBooleanElement(serialDescriptor, 16, value.singleAccount);
        beginStructure.encodeBooleanElement(serialDescriptor, 17, value.useSingleSortSearch);
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || accountDisconnectionMethod != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 18, FinancialConnectionsSessionManifest.AccountDisconnectionMethod.Serializer.INSTANCE, accountDisconnectionMethod);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str10 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str10);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool6 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, bool6);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str9 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, str9);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str8 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, str8);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsAuthorizationSession != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 23, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE, financialConnectionsAuthorizationSession);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsInstitution2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 24, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str7 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, str7);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str6 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, str6);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str5 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 27, stringSerializer, str5);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 28, stringSerializer, str4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 29, stringSerializer, str3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || map3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 30, (KSerializer) lazyArr[30].getValue(), map3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || textUpdate != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 31, TextUpdate$$serializer.INSTANCE, textUpdate);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || map2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 32, (KSerializer) lazyArr[32].getValue(), map2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 33, stringSerializer, str2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || financialConnectionsInstitution != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 34, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool5 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 35, BooleanSerializer.INSTANCE, bool5);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 36, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 37, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 38, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || linkAccountSessionCancellationBehavior != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 39, FinancialConnectionsSessionManifest.LinkAccountSessionCancellationBehavior.Serializer.INSTANCE, linkAccountSessionCancellationBehavior);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || map != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 40, (KSerializer) lazyArr[40].getValue(), map);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || supportedPaymentMethodTypes != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 41, FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE, supportedPaymentMethodTypes);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 42, stringSerializer, str);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 43, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || theme != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 44, FinancialConnectionsSessionManifest.Theme.Serializer.INSTANCE, theme);
        }
        if (beginStructure.shouldEncodeElementDefault(serialDescriptor) || linkBrand != null) {
            beginStructure.encodeNullableSerializableElement(serialDescriptor, 45, LinkBrand.Serializer.INSTANCE, linkBrand);
        }
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
