package com.squareup.protos.franklin.bankbook;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzdj;
import com.google.android.gms.internal.mlkit_vision_face.zzdu;
import com.google.android.gms.internal.mlkit_vision_face.zzdv;
import com.google.android.gms.internal.mlkit_vision_face.zzdw;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Header;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.protos.franklin.app.SetAddressResponse;
import com.squareup.protos.franklin.app.SetAppLockActivatedResponse;
import com.squareup.protos.franklin.app.SetProfilePhotoResponse;
import com.squareup.protos.franklin.app.SetSignatureRequest;
import com.squareup.protos.franklin.app.SubmitBlockerRequest;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.SubmitFidesmoProvisioningBlockerRequest;
import com.squareup.protos.franklin.app.SubmitLiteRecoveryEmailOtpBlockerRequest;
import com.squareup.protos.franklin.app.SubmitPayrollProviderSelectionRequest;
import com.squareup.protos.franklin.app.VerifyEmailResponse;
import com.squareup.protos.franklin.app.VerifySmsResponse;
import com.squareup.protos.franklin.common.BlockersConfig;
import com.squareup.protos.franklin.common.CardModuleElement;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.protos.franklin.common.ClientDisplayTheme;
import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.protos.franklin.common.DigitalWalletToken$Issuer;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.protos.franklin.common.DisputedTransactionRenderData;
import com.squareup.protos.franklin.common.EncryptedSyncEntity;
import com.squareup.protos.franklin.common.FeeRenderData;
import com.squareup.protos.franklin.common.GenericNonPaymentRenderData;
import com.squareup.protos.franklin.common.GiftCardRenderData;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.protos.franklin.common.IssuedCardElement;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.NewDeviceLoginRenderData;
import com.squareup.protos.franklin.common.PersonalizationRenderData;
import com.squareup.protos.franklin.common.RecipientConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RestrictedCashInTransferRenderData;
import com.squareup.protos.franklin.common.SetPasscodeResponse;
import com.squareup.protos.franklin.common.SignInType;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import com.squareup.protos.franklin.common.SyncEntityType;
import com.squareup.protos.franklin.common.SyncInvestmentFilterGroup;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class Institution extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Institution> CREATOR;
    public final DisplayInformation display_info;
    public final List help_menu_items;
    public final String institution_token;

    /* loaded from: classes8.dex */
    public final class BankbookMenuItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BankbookMenuItem> CREATOR;
        public final String label;
        public final String url;

        static {
            Institution$BankbookMenuItem$Companion$ADAPTER$1 institution$BankbookMenuItem$Companion$ADAPTER$1 = new Institution$BankbookMenuItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BankbookMenuItem.class), "type.googleapis.com/squareup.franklin.bankbook.Institution.BankbookMenuItem", Syntax.PROTO_2, null, "squareup/franklin/bankbook.proto");
            ADAPTER = institution$BankbookMenuItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(institution$BankbookMenuItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BankbookMenuItem(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.url = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BankbookMenuItem)) {
                return false;
            }
            BankbookMenuItem bankbookMenuItem = (BankbookMenuItem) obj;
            return Intrinsics.areEqual(unknownFields(), bankbookMenuItem.unknownFields()) && Intrinsics.areEqual(this.label, bankbookMenuItem.label) && Intrinsics.areEqual(this.url, bankbookMenuItem.url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(28);
            builder.name = this.label;
            builder.value = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BankbookMenuItem{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class DisplayInformation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DisplayInformation> CREATOR;
        public final String banner_logo_url;
        public final String display_name;
        public final String help_button_label;
        public final String icon_url;
        public final String password_hint_text;
        public final String pin_hint_text;
        public final String submit_button_label;
        public final ClientDisplayTheme theme;
        public final String username_hint_text;

        static {
            Institution$DisplayInformation$Companion$ADAPTER$1 institution$DisplayInformation$Companion$ADAPTER$1 = new Institution$DisplayInformation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DisplayInformation.class), "type.googleapis.com/squareup.franklin.bankbook.Institution.DisplayInformation", Syntax.PROTO_2, null, "squareup/franklin/bankbook.proto");
            ADAPTER = institution$DisplayInformation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(institution$DisplayInformation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayInformation(String str, String str2, String str3, ClientDisplayTheme clientDisplayTheme, String str4, String str5, String str6, String str7, String str8, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
            this.icon_url = str2;
            this.banner_logo_url = str3;
            this.theme = clientDisplayTheme;
            this.username_hint_text = str4;
            this.password_hint_text = str5;
            this.pin_hint_text = str6;
            this.help_button_label = str7;
            this.submit_button_label = str8;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayInformation)) {
                return false;
            }
            DisplayInformation displayInformation = (DisplayInformation) obj;
            return Intrinsics.areEqual(unknownFields(), displayInformation.unknownFields()) && Intrinsics.areEqual(this.display_name, displayInformation.display_name) && Intrinsics.areEqual(this.icon_url, displayInformation.icon_url) && Intrinsics.areEqual(this.banner_logo_url, displayInformation.banner_logo_url) && Intrinsics.areEqual(this.theme, displayInformation.theme) && Intrinsics.areEqual(this.username_hint_text, displayInformation.username_hint_text) && Intrinsics.areEqual(this.password_hint_text, displayInformation.password_hint_text) && Intrinsics.areEqual(this.pin_hint_text, displayInformation.pin_hint_text) && Intrinsics.areEqual(this.help_button_label, displayInformation.help_button_label) && Intrinsics.areEqual(this.submit_button_label, displayInformation.submit_button_label);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.icon_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.banner_logo_url;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            ClientDisplayTheme clientDisplayTheme = this.theme;
            int hashCode5 = (hashCode4 + (clientDisplayTheme != null ? clientDisplayTheme.hashCode() : 0)) * 37;
            String str4 = this.username_hint_text;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.password_hint_text;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            String str6 = this.pin_hint_text;
            int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.help_button_label;
            int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
            String str8 = this.submit_button_label;
            int hashCode10 = hashCode9 + (str8 != null ? str8.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(6, false);
            builder.token = this.display_name;
            builder.source = this.icon_url;
            builder.target = this.banner_logo_url;
            builder.state = this.theme;
            builder.amount = this.username_hint_text;
            builder.push_amount = this.password_hint_text;
            builder.created_at = this.pin_hint_text;
            builder.completed_at = this.help_button_label;
            builder.failed_at = this.submit_button_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            String str2 = this.icon_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_url=", arrayList);
            }
            String str3 = this.banner_logo_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "banner_logo_url=", arrayList);
            }
            ClientDisplayTheme clientDisplayTheme = this.theme;
            if (clientDisplayTheme != null) {
                arrayList.add("theme=" + clientDisplayTheme);
            }
            String str4 = this.username_hint_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "username_hint_text=", arrayList);
            }
            String str5 = this.password_hint_text;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "password_hint_text=", arrayList);
            }
            String str6 = this.pin_hint_text;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "pin_hint_text=", arrayList);
            }
            String str7 = this.help_button_label;
            if (str7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "help_button_label=", arrayList);
            }
            String str8 = this.submit_button_label;
            if (str8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "submit_button_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DisplayInformation{", "}", 0, null, null, 56);
        }
    }

    static {
        Institution$Companion$ADAPTER$1 institution$Companion$ADAPTER$1 = new Institution$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Institution.class), "type.googleapis.com/squareup.franklin.bankbook.Institution", Syntax.PROTO_2, null, "squareup/franklin/bankbook.proto");
        ADAPTER = institution$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(institution$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Institution(String str, DisplayInformation displayInformation, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.institution_token = str;
        this.display_info = displayInformation;
        this.help_menu_items = TransactorKt.immutableCopyOf("help_menu_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Institution)) {
            return false;
        }
        Institution institution = (Institution) obj;
        return Intrinsics.areEqual(unknownFields(), institution.unknownFields()) && Intrinsics.areEqual(this.institution_token, institution.institution_token) && Intrinsics.areEqual(this.display_info, institution.display_info) && Intrinsics.areEqual(this.help_menu_items, institution.help_menu_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.institution_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        DisplayInformation displayInformation = this.display_info;
        int hashCode3 = this.help_menu_items.hashCode() + ((hashCode2 + (displayInformation != null ? displayInformation.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.institution_token = this.institution_token;
        builder.display_info = this.display_info;
        builder.help_menu_items = this.help_menu_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.institution_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "institution_token=", arrayList);
        }
        DisplayInformation displayInformation = this.display_info;
        if (displayInformation != null) {
            arrayList.add("display_info=" + displayInformation);
        }
        List list = this.help_menu_items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("help_menu_items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Institution{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object display_info;
        public Object help_menu_items;
        public Object institution_token;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 5:
                    this.help_menu_items = EmptyList.INSTANCE;
                    break;
                default:
                    this.help_menu_items = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Institution((String) this.institution_token, (DisplayInformation) this.display_info, (List) this.help_menu_items, buildUnknownFields());
                case 1:
                    return new SetAddressResponse((ResponseContext) this.institution_token, (SetAddressResponse.Status) this.display_info, (GlobalAddress) this.help_menu_items, buildUnknownFields());
                case 2:
                    return new SetAppLockActivatedResponse((ResponseContext) this.display_info, (SetAppLockActivatedResponse.Status) this.help_menu_items, (String) this.institution_token, buildUnknownFields());
                case 3:
                    return new SetProfilePhotoResponse((SetProfilePhotoResponse.Status) this.display_info, (String) this.institution_token, (ResponseContext) this.help_menu_items, buildUnknownFields());
                case 4:
                    return new SetSignatureRequest((RequestContext) this.display_info, (ByteString) this.help_menu_items, (String) this.institution_token, buildUnknownFields());
                case 5:
                    return new SubmitBlockerRequest((String) this.institution_token, (SubmitBlockerRequest.AppRequestContext) this.display_info, (List) this.help_menu_items, buildUnknownFields());
                case 6:
                    return new SubmitBlockerResponse((SubmitBlockerResponse.AppResponseContext) this.institution_token, (SubmitBlockerResponse.BlockerResponseContext) this.display_info, (SubmitBlockerResponse.FlowResponseContext) this.help_menu_items, buildUnknownFields());
                case 7:
                    return new SubmitFidesmoProvisioningBlockerRequest((RequestContext) this.display_info, (SubmitFidesmoProvisioningBlockerRequest.Result) this.help_menu_items, (String) this.institution_token, buildUnknownFields());
                case 8:
                    return new SubmitLiteRecoveryEmailOtpBlockerRequest((RequestContext) this.display_info, (String) this.institution_token, (SubmitLiteRecoveryEmailOtpBlockerRequest.ClientSignature) this.help_menu_items, buildUnknownFields());
                case 9:
                    return new SubmitPayrollProviderSelectionRequest((RequestContext) this.display_info, (String) this.institution_token, (zzdj) this.help_menu_items, buildUnknownFields());
                case 10:
                    return new VerifyEmailResponse((ResponseContext) this.institution_token, (VerifyEmailResponse.Status) this.display_info, (SignInType) this.help_menu_items, buildUnknownFields());
                case 11:
                    return new VerifySmsResponse((ResponseContext) this.institution_token, (VerifySmsResponse.Status) this.display_info, (SignInType) this.help_menu_items, buildUnknownFields());
                case 12:
                    return new BlockersConfig((Boolean) this.display_info, (String) this.institution_token, (Money) this.help_menu_items, buildUnknownFields());
                case 13:
                    return new CashDrawerData.CardControls((UiControl) this.institution_token, (UiControl) this.display_info, (List) this.help_menu_items, buildUnknownFields());
                case 14:
                    return new CustomerAdjustmentRenderData.AdditionalAchContext((CustomerAdjustmentRenderData.BitcoinContext) this.display_info, (String) this.institution_token, (String) this.help_menu_items, buildUnknownFields());
                case 15:
                    return new DigitalWalletTokenProvisioningResponseData((DigitalWalletToken$Issuer) this.institution_token, (zzdu) this.display_info, (DigitalWalletTokenProvisioningResponseData.Status) this.help_menu_items, buildUnknownFields());
                case 16:
                    return new DisputedTransactionRenderData.DisputedCapture((Money) this.institution_token, (Long) this.display_info, (List) this.help_menu_items, buildUnknownFields());
                case 17:
                    return new EncryptedSyncEntity((ByteString) this.institution_token, (SyncEntityType) this.display_info, (SyncValueType) this.help_menu_items, buildUnknownFields());
                case 18:
                    return new FeeRenderData((Money) this.display_info, (String) this.institution_token, (FeeRenderData.FeeType) this.help_menu_items, buildUnknownFields());
                case 19:
                    return new GenericNonPaymentRenderData.Title((String) this.institution_token, (LocalizedString) this.display_info, (LocalizableString) this.help_menu_items, buildUnknownFields());
                case 20:
                    return new GiftCardRenderData((GiftCardRenderData.GiftCardType) this.display_info, (String) this.institution_token, (zzdv) this.help_menu_items, buildUnknownFields());
                case 21:
                    return new InstantPayRenderData((zzdw) this.institution_token, (Avatar) this.display_info, (Image) this.help_menu_items, buildUnknownFields());
                case 22:
                    return new IssuedCardElement((String) this.institution_token, (CardModuleElement) this.display_info, (List) this.help_menu_items, buildUnknownFields());
                case 23:
                    return new LendingRenderData.RelatedTransaction((Money) this.display_info, (LendingRenderData.RelatedTransaction.Type) this.help_menu_items, (String) this.institution_token, buildUnknownFields());
                case 24:
                    return new NewDeviceLoginRenderData((String) this.institution_token, (String) this.display_info, (NewDeviceLoginRenderData.Status) this.help_menu_items, buildUnknownFields());
                case 25:
                    return new PersonalizationRenderData((Personalization) this.institution_token, (Boolean) this.display_info, (com.squareup.cash.mosaic.personalization.api.v2.Personalization) this.help_menu_items, buildUnknownFields());
                case 26:
                    return new RecipientConfig((SuggestedRecipientsData) this.institution_token, (SuggestedRecipientsData) this.display_info, (Boolean) this.help_menu_items, buildUnknownFields());
                case 27:
                    return new RestrictedCashInTransferRenderData((Long) this.institution_token, (Long) this.display_info, (Boolean) this.help_menu_items, buildUnknownFields());
                case 28:
                    return new SetPasscodeResponse((ResponseContext) this.display_info, (SetPasscodeResponse.Status) this.help_menu_items, (String) this.institution_token, buildUnknownFields());
                default:
                    return new SyncInvestmentFilterGroup.SubfilterOption((String) this.institution_token, (String) this.display_info, (SyncInvestmentFilterGroup.SubfilterOption.OptionGlyph) this.help_menu_items, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
