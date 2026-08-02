package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.local.presenters.internal.CashBalanceKt;
import app.cash.local.presenters.internal.CashBannerKt;
import app.cash.local.primitives.BrandKt;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.lending.PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData;
import com.squareup.lending.sync_values.PrepurchaseCashCardAppletSyncData;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.aegis.api.ModifyAllowlistForDependentResponse;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.protos.cash.aegis.sync_values.FamilyTileContent;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyTile;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.appthemes.AppThemeDefinition;
import com.squareup.protos.cash.appthemes.AppThemeName;
import com.squareup.protos.cash.appthemes.ButtonColors;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.protos.cash.badging.api.BadgeCounts;
import com.squareup.protos.cash.badging.api.ClearBadgeClientRequest;
import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.balancebasedaddcash.core.models.DisablePreferenceReason;
import com.squareup.protos.cash.blockly.api.BlockSearchRequest;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.CardBlockedBusinessesUIConfig;
import com.squareup.protos.cash.blockstable.api.v1.GetAvailableNetworksRequest;
import com.squareup.protos.cash.blockstable.api.v1.InputSource;
import com.squareup.protos.cash.cashabilities.api.CapabilityName;
import com.squareup.protos.cash.cashabilities.api.CapabilityStatus;
import com.squareup.protos.cash.cashabilities.api.MarketCapability;
import com.squareup.protos.cash.cashapproxy.api.GetApOrdersHubResponse;
import com.squareup.protos.cash.cashapproxy.api.HalfsheetId;
import com.squareup.protos.cash.cashapproxy.api.InfoTile;
import com.squareup.protos.cash.cashapproxy.api.InfoTileIcon;
import com.squareup.protos.cash.cashapproxy.api.Summary;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashapproxy.api.TextWithInfo;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.Attachment;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.AttachmentIdentifier;
import com.squareup.protos.cash.cashbusinessaccounts.EarningsTrackerSummary;
import com.squareup.protos.cash.cashbusinessaccounts.TapToPay;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsNoticeParams;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataRequest;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.KybUseCase;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.MonthlyData;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.protos.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes7.dex */
public final class Section extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Section> CREATOR;
    public final List groups;
    public final HeaderButton header_button;
    public final String header_text;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object groups;
        public Object header_button;
        public Object header_text;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Section((String) this.header_text, (HeaderButton) this.header_button, (List) this.groups, buildUnknownFields());
                case 1:
                    return new PrepurchaseCashCardAppletData.FooterButtonContent((LocalizedString) this.header_text, (CashBalanceKt) this.header_button, (Boolean) this.groups, buildUnknownFields());
                case 2:
                    return new PrepurchaseCashCardAppletData.InfoRow((LocalizedString) this.header_text, (PrepurchaseCashCardAppletData$InfoRow$LeadingTextAction$ShowInfoViewData) this.header_button, (CashBannerKt) this.groups, buildUnknownFields());
                case 3:
                    return new PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row((LocalizedString) this.header_text, (LocalizedString) this.header_button, (PrepurchaseCashCardAppletData.InfoViewData.TextBlock.RowStyle) this.groups, buildUnknownFields());
                case 4:
                    return new PrepurchaseCashCardAppletSyncData((List) this.groups, (PrepurchaseCashCardAppletData) this.header_text, (List) this.header_button, buildUnknownFields());
                case 5:
                    return new ToggleEntryPointData.CardTabCta((LocalizedString) this.header_text, (LocalizedString) this.header_button, (ToggleEntryPointData.CardTabCta.Button) this.groups, buildUnknownFields());
                case 6:
                    return new ModifyAllowlistForDependentResponse((ResponseContext) this.header_text, (Boolean) this.header_button, (Integer) this.groups, buildUnknownFields());
                case 7:
                    return new CustomLimit((CustomLimit.LimitType) this.header_text, (Money) this.header_button, (Money) this.groups, buildUnknownFields());
                case 8:
                    return new UiFamilyTile((LocalizedString) this.header_button, (String) this.header_text, (FamilyTileContent) this.groups, buildUnknownFields());
                case 9:
                    return new AppThemeDefinition((AppThemeName) this.header_text, (BrandKt) this.header_button, (ButtonColors) this.groups, buildUnknownFields());
                case 10:
                    return new BadgeCounts((String) this.header_text, (Integer) this.header_button, (Map) this.groups, buildUnknownFields());
                case 11:
                    return new ClearBadgeClientRequest((String) this.header_text, (ItemType) this.header_button, (Long) this.groups, buildUnknownFields());
                case 12:
                    return new BalanceBasedAddCashPreference((ComputedOrderSummaryKt) this.header_text, (LocalizedString) this.header_button, (LocalizedString) this.groups, buildUnknownFields());
                case 13:
                    return new BalanceBasedAddCashPreference.Disabled((DisablePreferenceReason) this.header_text, (Boolean) this.header_button, (BalanceBasedAddCashPreference.DialogBox) this.groups, buildUnknownFields());
                case 14:
                    return new BlockSearchRequest((String) this.header_text, (String) this.header_button, (BlockingContext) this.groups, buildUnknownFields());
                case 15:
                    return new CardBlockedBusinessesUIConfig.NavigationHelpItem((String) this.header_text, (CdfEvent) this.header_button, (LocalizedString) this.groups, buildUnknownFields());
                case 16:
                    return new GetAvailableNetworksRequest((String) this.header_text, (InputSource) this.header_button, (RequestContext) this.groups, buildUnknownFields());
                case 17:
                    return new MarketCapability((CapabilityName) this.header_button, (CapabilityStatus) this.groups, (String) this.header_text, buildUnknownFields());
                case 18:
                    return new GetApOrdersHubResponse((Summary) this.header_button, (List) this.groups, (String) this.header_text, buildUnknownFields());
                case 19:
                    return new InfoTile((Text) this.header_text, (Text) this.header_button, (InfoTileIcon) this.groups, buildUnknownFields());
                case 20:
                    return new TextWithInfo((Text) this.header_text, (List) this.groups, (HalfsheetId) this.header_button, buildUnknownFields());
                case 21:
                    return new Attachment((AttachmentIdentifier) this.header_button, (String) this.header_text, (ByteString) this.groups, buildUnknownFields());
                case 22:
                    return new EarningsTrackerSummary((Boolean) this.header_text, (EarningsTrackerSummary.Earnings) this.header_button, (Long) this.groups, buildUnknownFields());
                case 23:
                    return new TapToPay((TapToPay.OnboardingStatus) this.header_button, (List) this.groups, (String) this.header_text, buildUnknownFields());
                case 24:
                    return new EarningsNoticeParams((Integer) this.header_text, (Integer) this.header_button, (EarningsNoticeParams.EntryPoint) this.groups, buildUnknownFields());
                case 25:
                    return new EarningsTrackerDataRequest((Integer) this.header_text, (Integer) this.header_button, (RequestContext) this.groups, buildUnknownFields());
                case 26:
                    return new MonthlyData((Money) this.header_text, (Integer) this.header_button, (Integer) this.groups, buildUnknownFields());
                case 27:
                    return new Trend((Money) this.header_button, (Trend.TrendDirection) this.groups, (String) this.header_text, buildUnknownFields());
                case 28:
                    return new C4BOnboardingFlowParameters((C4BOnboardingFlowParameters.EntryPoint) this.header_button, (String) this.header_text, (KybUseCase) this.groups, buildUnknownFields());
                default:
                    return new GetListingDetailsResponse.Customer((UiAvatar) this.header_button, (String) this.header_text, (String) this.groups, buildUnknownFields());
            }
        }
    }

    public final class Group extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Group> CREATOR;
        public final List items;

        public final class RowItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<RowItem> CREATOR;
            public final String analytical_identifier;
            public final Icon arcade_icon;
            public final FormBlocker.Element.SelectableRowElement.Icon icon;
            public final String title;
            public final String url;

            public final class Builder extends Message.Builder {
                public String analytical_identifier;
                public Icon arcade_icon;
                public FormBlocker.Element.SelectableRowElement.Icon icon;
                public String title;
                public String url;

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    return new RowItem(this.icon, this.title, this.url, this.analytical_identifier, this.arcade_icon, buildUnknownFields());
                }
            }

            static {
                Section$Group$RowItem$Companion$ADAPTER$1 section$Group$RowItem$Companion$ADAPTER$1 = new Section$Group$RowItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RowItem.class), "type.googleapis.com/squareup.cash.aegis.core.Section.Group.RowItem", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
                ADAPTER = section$Group$RowItem$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Group$RowItem$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RowItem(FormBlocker.Element.SelectableRowElement.Icon icon, String str, String str2, String str3, Icon icon2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.title = str;
                this.url = str2;
                this.analytical_identifier = str3;
                this.arcade_icon = icon2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RowItem)) {
                    return false;
                }
                RowItem rowItem = (RowItem) obj;
                return Intrinsics.areEqual(unknownFields(), rowItem.unknownFields()) && this.icon == rowItem.icon && Intrinsics.areEqual(this.title, rowItem.title) && Intrinsics.areEqual(this.url, rowItem.url) && Intrinsics.areEqual(this.analytical_identifier, rowItem.analytical_identifier) && Intrinsics.areEqual(this.arcade_icon, rowItem.arcade_icon);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                FormBlocker.Element.SelectableRowElement.Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                String str = this.title;
                int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.url;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.analytical_identifier;
                int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
                Icon icon2 = this.arcade_icon;
                int hashCode6 = hashCode5 + (icon2 != null ? icon2.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.icon = this.icon;
                builder.title = this.title;
                builder.url = this.url;
                builder.analytical_identifier = this.analytical_identifier;
                builder.arcade_icon = this.arcade_icon;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                FormBlocker.Element.SelectableRowElement.Icon icon = this.icon;
                if (icon != null) {
                    arrayList.add("icon=" + icon);
                }
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.url;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
                }
                String str3 = this.analytical_identifier;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "analytical_identifier=", arrayList);
                }
                Icon icon2 = this.arcade_icon;
                if (icon2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "RowItem{", "}", 0, null, null, 56);
            }
        }

        static {
            Section$Group$Companion$ADAPTER$1 section$Group$Companion$ADAPTER$1 = new Section$Group$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Group.class), "type.googleapis.com/squareup.cash.aegis.core.Section.Group", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
            ADAPTER = section$Group$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Group$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Group(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Group)) {
                return false;
            }
            Group group = (Group) obj;
            return Intrinsics.areEqual(unknownFields(), group.unknownFields()) && Intrinsics.areEqual(this.items, group.items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(18, false);
            builder.colors = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Group{", "}", 0, null, null, 56);
        }
    }

    public final class HeaderButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeaderButton> CREATOR;
        public final String title;
        public final String url;

        static {
            Section$HeaderButton$Companion$ADAPTER$1 section$HeaderButton$Companion$ADAPTER$1 = new Section$HeaderButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HeaderButton.class), "type.googleapis.com/squareup.cash.aegis.core.Section.HeaderButton", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
            ADAPTER = section$HeaderButton$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(section$HeaderButton$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderButton(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.url = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeaderButton)) {
                return false;
            }
            HeaderButton headerButton = (HeaderButton) obj;
            return Intrinsics.areEqual(unknownFields(), headerButton.unknownFields()) && Intrinsics.areEqual(this.title, headerButton.title) && Intrinsics.areEqual(this.url, headerButton.url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Cashtag.Builder builder = new Cashtag.Builder(6);
            builder.prefix = this.title;
            builder.name = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderButton{", "}", 0, null, null, 56);
        }
    }

    static {
        Section$Companion$ADAPTER$1 section$Companion$ADAPTER$1 = new Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.aegis.core.Section", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = section$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Section(String str, HeaderButton headerButton, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header_text = str;
        this.header_button = headerButton;
        this.groups = TransactorKt.immutableCopyOf("groups", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.header_text, section.header_text) && Intrinsics.areEqual(this.header_button, section.header_button) && Intrinsics.areEqual(this.groups, section.groups);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        HeaderButton headerButton = this.header_button;
        int hashCode3 = this.groups.hashCode() + ((hashCode2 + (headerButton != null ? headerButton.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.header_text = this.header_text;
        builder.header_button = this.header_button;
        builder.groups = this.groups;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
        }
        HeaderButton headerButton = this.header_button;
        if (headerButton != null) {
            arrayList.add("header_button=" + headerButton);
        }
        List list = this.groups;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("groups=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
    }
}
