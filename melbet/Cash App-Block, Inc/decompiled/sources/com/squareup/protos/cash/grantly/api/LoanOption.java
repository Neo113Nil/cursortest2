package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Image_androidKt;
import com.android.volley.toolbox.NetworkUtility;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.composer.app.ButtonElement;
import com.squareup.protos.cash.composer.app.CardTabNullStateSwipeConfig;
import com.squareup.protos.cash.contacts.app.SyncContactsRequest;
import com.squareup.protos.cash.contacts.app.SyncContactsResponse;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.customersearch.api.SearchCommonAvatarSection;
import com.squareup.protos.cash.customersearch.api.privacy.GetSearchPrivacySettingsResponse;
import com.squareup.protos.cash.deviceintegritly.api.GetSignedCertificateRequest;
import com.squareup.protos.cash.deviceintegritly.api.GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion;
import com.squareup.protos.cash.deviceintegritly.api.PublishClientTrustSignalsRequest;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarOverlayCardSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Bullet;
import com.squareup.protos.cash.discover.api.app.v1.model.EmbeddedImageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.GraphSection;
import com.squareup.protos.cash.discover.api.app.v1.model.ImageLayout;
import com.squareup.protos.cash.discover.api.app.v1.model.ItemMetadata;
import com.squareup.protos.cash.discover.api.app.v1.model.TextCardSection;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.model.Section;
import com.squareup.protos.cash.fiatly.api.v1.CustomP2PLimit;
import com.squareup.protos.cash.fiatly.api.v1.GetP2PControlsResponse;
import com.squareup.protos.cash.fiatly.api.v1.P2PControls;
import com.squareup.protos.cash.fiatly.api.v2.GetPaymentUpdatesBySessionRequest;
import com.squareup.protos.cash.fiatly.syncvalues.P2PControl;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.BaseCardComponent;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.security.mri.api.v1.MRIContext;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LoanOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoanOption> CREATOR;
    public final LoanType loan_type;
    public final List payment_schedule;
    public final TilaData tila_data;

    public enum LoanType implements WireEnum {
        PAY_IN_FOUR(1),
        PAY_IN_TWO(2);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final LoanOption$LoanType$Companion$ADAPTER$1 ADAPTER = new LoanOption$LoanType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LoanType.class), Syntax.PROTO_2, null);

        LoanType(int i) {
            this.value = i;
        }

        public static final LoanType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PAY_IN_FOUR;
            }
            if (i != 2) {
                return null;
            }
            return PAY_IN_TWO;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LoanOption$Companion$ADAPTER$1 loanOption$Companion$ADAPTER$1 = new LoanOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanOption.class), "type.googleapis.com/squareup.cash.grantly.api.LoanOption", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = loanOption$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loanOption$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanOption(LoanType loanType, List list, TilaData tilaData, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.loan_type = loanType;
        this.tila_data = tilaData;
        this.payment_schedule = TransactorKt.immutableCopyOf("payment_schedule", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoanOption)) {
            return false;
        }
        LoanOption loanOption = (LoanOption) obj;
        return Intrinsics.areEqual(unknownFields(), loanOption.unknownFields()) && this.loan_type == loanOption.loan_type && Intrinsics.areEqual(this.payment_schedule, loanOption.payment_schedule) && Intrinsics.areEqual(this.tila_data, loanOption.tila_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LoanType loanType = this.loan_type;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (loanType != null ? loanType.hashCode() : 0)) * 37, 37, this.payment_schedule);
        TilaData tilaData = this.tila_data;
        int hashCode2 = m + (tilaData != null ? tilaData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.loan_type = this.loan_type;
        builder.payment_schedule = this.payment_schedule;
        builder.tila_data = this.tila_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LoanType loanType = this.loan_type;
        if (loanType != null) {
            arrayList.add("loan_type=" + loanType);
        }
        List list = this.payment_schedule;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_schedule=", arrayList, list);
        }
        TilaData tilaData = this.tila_data;
        if (tilaData != null) {
            arrayList.add("tila_data=" + tilaData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoanOption{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable loan_type;
        public Object payment_schedule;
        public Object tila_data;

        public Builder() {
            this.$r8$classId = 2;
            this.payment_schedule = EmptyList.INSTANCE;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new LoanOption((LoanType) this.loan_type, (List) this.payment_schedule, (TilaData) this.tila_data, buildUnknownFields());
                case 1:
                    return new CardTabNullStateSwipeConfig((List) this.payment_schedule, (ButtonElement) this.loan_type, (String) this.tila_data, buildUnknownFields());
                case 2:
                    return new SyncContactsRequest((String) this.loan_type, (List) this.payment_schedule, (ByteString) this.tila_data, buildUnknownFields());
                case 3:
                    return new SyncContactsResponse((Long) this.loan_type, (String) this.payment_schedule, (SyncContactsResponse.ResponseCode) this.tila_data, buildUnknownFields());
                case 4:
                    return new ProfileDirectorySearchResponse.Section((String) this.loan_type, (List) this.payment_schedule, (ProfileDirectorySearchResponse.Section.ResultsType) this.tila_data, buildUnknownFields());
                case 5:
                    return new SearchCommonAvatarSection.SearchCommonAvatarItem((Metadata) this.loan_type, (Avatar) this.payment_schedule, (Text) this.tila_data, buildUnknownFields());
                case 6:
                    return new GetSearchPrivacySettingsResponse((GetSearchPrivacySettingsResponse.BooleanSetting) this.loan_type, (GetSearchPrivacySettingsResponse.BooleanSetting) this.payment_schedule, (GetSearchPrivacySettingsResponse.BooleanSetting) this.tila_data, buildUnknownFields());
                case 7:
                    return new GetSignedCertificateRequest((ByteString) this.loan_type, (String) this.payment_schedule, (GetSignedCertificateRequest$DeviceAssertion$AppAttestAssertion) this.tila_data, buildUnknownFields());
                case 8:
                    return new PublishClientTrustSignalsRequest((SignedSerializedMRIContext) this.loan_type, (MRIContext) this.payment_schedule, (SigningData) this.tila_data, buildUnknownFields());
                case 9:
                    return new AvatarOverlayCardSection((List) this.payment_schedule, (ImageLayout) this.loan_type, (List) this.tila_data, buildUnknownFields());
                case 10:
                    return new Bullet((Image) this.loan_type, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.payment_schedule, (com.squareup.protos.cash.discover.api.app.v1.model.Text) this.tila_data, buildUnknownFields());
                case 11:
                    return new EmbeddedImageSection((ItemMetadata) this.loan_type, (String) this.payment_schedule, (Image_androidKt) this.tila_data, buildUnknownFields());
                case 12:
                    return new GraphSection((List) this.payment_schedule, (Color) this.loan_type, (Color) this.tila_data, buildUnknownFields());
                case 13:
                    return new TextCardSection((List) this.payment_schedule, (Integer) this.loan_type, (TextCardSection.OverflowCard) this.tila_data, buildUnknownFields());
                case 14:
                    return new RowSection((com.squareup.protos.cash.discover.api.app.v2.model.Text) this.loan_type, (RowSection.Page) this.payment_schedule, (String) this.tila_data, buildUnknownFields());
                case 15:
                    return new RowSection.Page((List) this.payment_schedule, (String) this.loan_type, (Section.Modal) this.tila_data, buildUnknownFields());
                case 16:
                    return new com.squareup.protos.cash.discover.api.app.v2.model.Text((String) this.loan_type, (Color) this.payment_schedule, (Icon) this.tila_data, buildUnknownFields());
                case 17:
                    return new CustomP2PLimit((CustomP2PLimit.LimitType) this.loan_type, (Money) this.payment_schedule, (Money) this.tila_data, buildUnknownFields());
                case 18:
                    return new GetP2PControlsResponse((P2PControls) this.loan_type, (List) this.payment_schedule, (Long) this.tila_data, buildUnknownFields());
                case 19:
                    return new P2PControls((Boolean) this.loan_type, (P2PControls.ControlSource) this.tila_data, (List) this.payment_schedule, buildUnknownFields());
                case 20:
                    return new GetPaymentUpdatesBySessionRequest((String) this.loan_type, (List) this.payment_schedule, (SigningData) this.tila_data, buildUnknownFields());
                case 21:
                    return new P2PControl((Boolean) this.loan_type, (LocalizedString) this.payment_schedule, (Long) this.tila_data, buildUnknownFields());
                case 22:
                    return new Action.OverlayAction((List) this.payment_schedule, (String) this.loan_type, (ContainerElement) this.tila_data, buildUnknownFields());
                case 23:
                    return new BaseCardComponent((List) this.payment_schedule, (StyleAttributes) this.loan_type, (com.squareup.protos.cash.genericelements.ui.Action) this.tila_data, buildUnknownFields());
                case 24:
                    return new Action.OAuth((List) this.payment_schedule, (Action.OAuth.Metadata) this.loan_type, (List) this.tila_data, buildUnknownFields());
                case 25:
                    return new Action.UnlinkedRefund((Long) this.loan_type, (CurrencyCode) this.payment_schedule, (String) this.tila_data, buildUnknownFields());
                case 26:
                    Grant.AppData.Type type2 = (Grant.AppData.Type) this.loan_type;
                    if (type2 != null) {
                        return new Grant.AppData(type2, (NetworkUtility) this.payment_schedule, (ByteString) this.tila_data, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(type2, "type");
                    throw null;
                case 27:
                    return new InTransactionTopUpInfo((Instrument) this.loan_type, (Money) this.payment_schedule, (Money) this.tila_data, buildUnknownFields());
                case 28:
                    return new RiskSignals((BrowserInteraction) this.loan_type, (ClientInfo) this.payment_schedule, (String) this.tila_data, buildUnknownFields());
                default:
                    return new RetrieveDefaultShippingAddressResponse((ResponseMetadata) this.loan_type, (ShippingAddress) this.payment_schedule, (ResponseContext) this.tila_data, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }
    }
}
