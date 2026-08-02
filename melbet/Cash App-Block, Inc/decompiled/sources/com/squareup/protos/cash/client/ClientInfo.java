package com.squareup.protos.cash.client;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.internal.mlkit_vision_common.zzjq;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.cashcustomergateway.api.v1.Customer;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.grantly.api.DecisionMethod;
import com.squareup.protos.cash.grantly.api.Discount;
import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.protos.cash.grantly.api.RiskSignals;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.DetailsPageView;
import com.squareup.protos.cash.messagingplatformcommon.app.NavigationIcon;
import com.squareup.protos.cash.messagingplatformcommon.app.ShareSheet;
import com.squareup.protos.cash.messagingplatformcommon.app.Text;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsMetadata;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.EngagedItemToken;
import com.squareup.protos.cash.shop.rendering.api.OfferBadge;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import com.squareup.protos.franklin.lending.LendingProduct;
import com.squareup.protos.franklin.lending.LoanTransaction;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ClientInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientInfo> CREATOR;
    public final String accept_language;
    public final Integer client_scenario;
    public final String date_format;
    public final String device_id;
    public final String device_installation_id;
    public final String device_name;
    public final String device_uuid;
    public final String device_vendor_id;
    public final String drm_id;
    public final String ip_address;
    public final NavigationParadigm navigation_paradigm;
    public final String threatmetrix_smart_id;
    public final String time_format;
    public final DateTime timestamp;
    public final String user_agent;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable accept_language;
        public Object client_scenario;
        public Serializable date_format;
        public Object device_id;
        public Object device_installation_id;
        public Serializable device_name;
        public Object device_uuid;
        public Object device_vendor_id;
        public Object drm_id;
        public Serializable ip_address;
        public Object navigation_paradigm;
        public Object threatmetrix_smart_id;
        public Serializable time_format;
        public Serializable timestamp;
        public String user_agent;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            Message clientInfo;
            switch (this.$r8$classId) {
                case 0:
                    clientInfo = new ClientInfo(this.user_agent, (String) this.device_uuid, (DateTime) this.timestamp, (String) this.date_format, (String) this.time_format, (String) this.ip_address, (String) this.device_name, (NavigationParadigm) this.navigation_paradigm, (String) this.accept_language, (Integer) this.client_scenario, (String) this.device_installation_id, (String) this.drm_id, (String) this.device_vendor_id, (String) this.device_id, (String) this.threatmetrix_smart_id, buildUnknownFields());
                    break;
                case 1:
                    return new Customer(this.user_agent, (String) this.device_uuid, (String) this.date_format, (String) this.time_format, (String) this.ip_address, (String) this.device_name, (Region) this.device_installation_id, (Boolean) this.drm_id, (Boolean) this.device_vendor_id, (Boolean) this.device_id, (Boolean) this.threatmetrix_smart_id, (Boolean) this.timestamp, (String) this.accept_language, (BlockState) this.navigation_paradigm, (Instant) this.client_scenario, buildUnknownFields());
                case 2:
                    return new RecipientSelectorCustomer(this.user_agent, (Avatar) this.device_name, (String) this.device_uuid, (Cashtag) this.accept_language, (Region) this.device_installation_id, (Boolean) this.drm_id, (Boolean) this.device_vendor_id, (Long) this.device_id, (RecipientSelectorCustomer.Metadata) this.threatmetrix_smart_id, (Boolean) this.timestamp, (Boolean) this.navigation_paradigm, (String) this.date_format, (RecipientSelectorCustomer.C4bInfo) this.client_scenario, (String) this.time_format, (String) this.ip_address, buildUnknownFields());
                case 3:
                    clientInfo = new Discount(this.user_agent, (Integer) this.client_scenario, (Integer) this.time_format, (String) this.device_uuid, (Integer) this.ip_address, (Integer) this.device_name, (Integer) this.accept_language, (Integer) this.device_installation_id, (String) this.date_format, (List) this.drm_id, (Integer) this.device_vendor_id, (List) this.device_id, (Boolean) this.threatmetrix_smart_id, (Integer) this.timestamp, (Discount.PaymentMethodTarget) this.navigation_paradigm, buildUnknownFields());
                    break;
                case 4:
                    String str = this.user_agent;
                    String str2 = (String) this.device_uuid;
                    String str3 = (String) this.date_format;
                    Action action = (Action) this.ip_address;
                    Grant.Status status = (Grant.Status) this.device_name;
                    Grant.Type type2 = (Grant.Type) this.accept_language;
                    Long l = (Long) this.device_installation_id;
                    Long l2 = (Long) this.drm_id;
                    Long l3 = (Long) this.device_vendor_id;
                    String str4 = (String) this.time_format;
                    Channel channel = (Channel) this.device_id;
                    if (channel != null) {
                        return new Grant(str, str2, str3, action, status, type2, l, l2, l3, str4, channel, (List) this.threatmetrix_smart_id, (DecisionMethod) this.timestamp, (RiskSignals) this.navigation_paradigm, (Long) this.client_scenario, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(channel, AppsFlyerProperties.CHANNEL);
                    throw null;
                case 5:
                    return new DetailsPageView(this.user_agent, (Text) this.time_format, (Text) this.ip_address, (Text) this.device_name, (DetailsPageView.TextPlacement) this.accept_language, (AppMessageAction) this.device_installation_id, (AppMessageAction) this.drm_id, (ShareSheet) this.device_vendor_id, (String) this.device_uuid, (String) this.date_format, (NavigationIcon) this.device_id, (AppMessageAction) this.threatmetrix_smart_id, (AppMessageAction) this.timestamp, (List) this.navigation_paradigm, (zzjq) this.client_scenario, buildUnknownFields());
                case 6:
                    return new RowSection.OfferRow((AnalyticsEvent) this.time_format, (TapAction) this.ip_address, (com.squareup.protos.franklin.ui.Avatar) this.device_name, (LocalizedString) this.accept_language, (LocalizedString) this.device_installation_id, (AnalyticsMetadata) this.drm_id, (EngagedItemToken) this.device_vendor_id, this.user_agent, (String) this.device_uuid, (StyledText) this.device_id, (StyledText) this.threatmetrix_smart_id, (Button) this.timestamp, (String) this.date_format, (Button) this.navigation_paradigm, (OfferBadge) this.client_scenario, buildUnknownFields());
                case 7:
                    return new SyncInvestmentEntity(this.user_agent, (String) this.device_uuid, (String) this.date_format, (InvestmentEntityType) this.accept_language, (String) this.time_format, (Long) this.device_installation_id, (InvestmentEntityStatus) this.drm_id, (String) this.ip_address, (String) this.device_name, (List) this.device_vendor_id, (Boolean) this.device_id, (Color) this.threatmetrix_smart_id, (Image) this.timestamp, (Color) this.navigation_paradigm, (SyncInvestmentEntity.ReleaseStage) this.client_scenario, buildUnknownFields());
                case 8:
                    return new LoanTransaction((LoanTransaction.Type) this.accept_language, this.user_agent, (String) this.device_uuid, (String) this.date_format, (Long) this.device_installation_id, (LendingProduct) this.drm_id, (LoanTransaction.LoanPayment) this.device_vendor_id, (LoanTransaction.LoanDrawdown) this.device_id, (LoanTransaction.LoanCharge) this.threatmetrix_smart_id, (String) this.time_format, (LoanTransaction.LoanRefund) this.timestamp, (LoanTransaction.LoanAdjustment) this.navigation_paradigm, (String) this.ip_address, (String) this.device_name, (LocalizableString) this.client_scenario, buildUnknownFields());
                case 9:
                    return new BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet((BorrowAppletBulletinsTile.Data.Bulletin.Icon) this.device_uuid, (Image) this.date_format, (LocalizedString) this.time_format, (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment) this.ip_address, (LocalizedString) this.device_name, (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment) this.accept_language, (List) this.device_installation_id, (Timeline) this.drm_id, (LocalizedString) this.device_vendor_id, (LocalizedString) this.device_id, this.user_agent, (LoanRepaymentSelectionData) this.threatmetrix_smart_id, (LocalizedString) this.timestamp, (Color) this.navigation_paradigm, (Boolean) this.client_scenario, buildUnknownFields());
                default:
                    return new TimecardBreak(this.user_agent, (String) this.device_uuid, (String) this.date_format, (Long) this.device_installation_id, (Long) this.drm_id, (String) this.time_format, (Boolean) this.device_vendor_id, (String) this.ip_address, (Integer) this.client_scenario, (Long) this.device_id, (Long) this.threatmetrix_smart_id, (Boolean) this.timestamp, (Integer) this.navigation_paradigm, (String) this.device_name, (String) this.accept_language, buildUnknownFields());
            }
            return clientInfo;
        }
    }

    public enum NavigationParadigm implements WireEnum {
        TRADITIONAL(1),
        TABBAR(2);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final ClientInfo$NavigationParadigm$Companion$ADAPTER$1 ADAPTER = new ClientInfo$NavigationParadigm$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NavigationParadigm.class), Syntax.PROTO_2, null);

        NavigationParadigm(int i) {
            this.value = i;
        }

        public static final NavigationParadigm fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TRADITIONAL;
            }
            if (i != 2) {
                return null;
            }
            return TABBAR;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ClientInfo$Companion$ADAPTER$1 clientInfo$Companion$ADAPTER$1 = new ClientInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientInfo.class), "type.googleapis.com/squareup.cash.client.ClientInfo", Syntax.PROTO_2, null, "squareup/cash/client/client_info.proto");
        ADAPTER = clientInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientInfo(String str, String str2, DateTime dateTime, String str3, String str4, String str5, String str6, NavigationParadigm navigationParadigm, String str7, Integer num, String str8, String str9, String str10, String str11, String str12, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.user_agent = str;
        this.device_uuid = str2;
        this.timestamp = dateTime;
        this.date_format = str3;
        this.time_format = str4;
        this.ip_address = str5;
        this.device_name = str6;
        this.navigation_paradigm = navigationParadigm;
        this.accept_language = str7;
        this.client_scenario = num;
        this.device_installation_id = str8;
        this.drm_id = str9;
        this.device_vendor_id = str10;
        this.device_id = str11;
        this.threatmetrix_smart_id = str12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientInfo)) {
            return false;
        }
        ClientInfo clientInfo = (ClientInfo) obj;
        return Intrinsics.areEqual(unknownFields(), clientInfo.unknownFields()) && Intrinsics.areEqual(this.user_agent, clientInfo.user_agent) && Intrinsics.areEqual(this.device_uuid, clientInfo.device_uuid) && Intrinsics.areEqual(this.timestamp, clientInfo.timestamp) && Intrinsics.areEqual(this.date_format, clientInfo.date_format) && Intrinsics.areEqual(this.time_format, clientInfo.time_format) && Intrinsics.areEqual(this.ip_address, clientInfo.ip_address) && Intrinsics.areEqual(this.device_name, clientInfo.device_name) && this.navigation_paradigm == clientInfo.navigation_paradigm && Intrinsics.areEqual(this.accept_language, clientInfo.accept_language) && Intrinsics.areEqual(this.client_scenario, clientInfo.client_scenario) && Intrinsics.areEqual(this.device_installation_id, clientInfo.device_installation_id) && Intrinsics.areEqual(this.drm_id, clientInfo.drm_id) && Intrinsics.areEqual(this.device_vendor_id, clientInfo.device_vendor_id) && Intrinsics.areEqual(this.device_id, clientInfo.device_id) && Intrinsics.areEqual(this.threatmetrix_smart_id, clientInfo.threatmetrix_smart_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.user_agent;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_uuid;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        DateTime dateTime = this.timestamp;
        int hashCode4 = (hashCode3 + (dateTime != null ? dateTime.hashCode() : 0)) * 37;
        String str3 = this.date_format;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.time_format;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.ip_address;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.device_name;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        NavigationParadigm navigationParadigm = this.navigation_paradigm;
        int hashCode9 = (hashCode8 + (navigationParadigm != null ? navigationParadigm.hashCode() : 0)) * 37;
        String str7 = this.accept_language;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Integer num = this.client_scenario;
        int hashCode11 = (hashCode10 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str8 = this.device_installation_id;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.drm_id;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.device_vendor_id;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.device_id;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.threatmetrix_smart_id;
        int hashCode16 = hashCode15 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.user_agent = this.user_agent;
        builder.device_uuid = this.device_uuid;
        builder.timestamp = this.timestamp;
        builder.date_format = this.date_format;
        builder.time_format = this.time_format;
        builder.ip_address = this.ip_address;
        builder.device_name = this.device_name;
        builder.navigation_paradigm = this.navigation_paradigm;
        builder.accept_language = this.accept_language;
        builder.client_scenario = this.client_scenario;
        builder.device_installation_id = this.device_installation_id;
        builder.drm_id = this.drm_id;
        builder.device_vendor_id = this.device_vendor_id;
        builder.device_id = this.device_id;
        builder.threatmetrix_smart_id = this.threatmetrix_smart_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.user_agent;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "user_agent=", arrayList);
        }
        String str2 = this.device_uuid;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "device_uuid=", arrayList);
        }
        DateTime dateTime = this.timestamp;
        if (dateTime != null) {
            arrayList.add("timestamp=" + dateTime);
        }
        String str3 = this.date_format;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "date_format=", arrayList);
        }
        String str4 = this.time_format;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "time_format=", arrayList);
        }
        String str5 = this.ip_address;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "ip_address=", arrayList);
        }
        if (this.device_name != null) {
            arrayList.add("device_name=██");
        }
        NavigationParadigm navigationParadigm = this.navigation_paradigm;
        if (navigationParadigm != null) {
            arrayList.add("navigation_paradigm=" + navigationParadigm);
        }
        String str6 = this.accept_language;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "accept_language=", arrayList);
        }
        Integer num = this.client_scenario;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("client_scenario=", num, arrayList);
        }
        if (this.device_installation_id != null) {
            arrayList.add("device_installation_id=██");
        }
        if (this.drm_id != null) {
            arrayList.add("drm_id=██");
        }
        if (this.device_vendor_id != null) {
            arrayList.add("device_vendor_id=██");
        }
        if (this.device_id != null) {
            arrayList.add("device_id=██");
        }
        if (this.threatmetrix_smart_id != null) {
            arrayList.add("threatmetrix_smart_id=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientInfo{", "}", 0, null, null, 56);
    }
}
