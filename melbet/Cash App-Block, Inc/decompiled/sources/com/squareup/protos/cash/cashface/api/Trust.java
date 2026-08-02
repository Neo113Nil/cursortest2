package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import app.cash.redwood.compose.HostFocusDirectorKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse;
import com.squareup.protos.cash.cashapproxy.api.SemanticColor;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashapproxy.api.TextAlignment;
import com.squareup.protos.cash.cashapproxy.api.TextStyle;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.AcceptanceState;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.LanguageDisclosure;
import com.squareup.protos.cash.cashface.api.GetP2pProfileDetailsResponse;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.cashfavorites.api.v1.FavoriteOrigin;
import com.squareup.protos.cash.cashfavorites.api.v1.RemoveFavoriteRequest;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Address;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.AddressType;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.Chain;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.ExecuteUserOpRequest;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapEstimate;
import com.squareup.protos.cash.cashliteorchestrator.api.v1.SwapQuote;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletEntrypoint;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHome;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletPurchaseHistoryResponse;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.cashsuggest.api.HeroBalanceSection;
import com.squareup.protos.cash.cashsuggest.api.PaymentMgmtSection;
import com.squareup.protos.cash.cashsuggest.api.TileSection;
import com.squareup.protos.cash.cashvoice.verification.app.v1.AcceptPhoneVerificationAttemptResponse;
import com.squareup.protos.cash.cashvoice.verification.app.v1.PhoneVerificationAttemptState;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetRequest;
import com.squareup.protos.cash.commerce.CommerceOrderRenderData;
import com.squareup.protos.cash.composer.app.Action;
import com.squareup.protos.cash.composer.app.ButtonElement;
import com.squareup.protos.cash.cryptoinvestflow.service.CashInInstrument;
import com.squareup.protos.cash.cryptoinvestflow.service.CashInInstrumentType;
import com.squareup.protos.cash.customersearch.api.ClientCandidate;
import com.squareup.protos.cash.customersearch.api.SearchCommonTextRowItem;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.Footer;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Trust extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Trust> CREATOR;
    public final Boolean enabled;
    public final Image icon;
    public final Id id;
    public final String title;

    public enum Id implements WireEnum {
        JOINED_AT(1),
        PAID_BY(2),
        CONTACTS(3);

        public final int value;
        public static final CardProduct.Companion Companion = new CardProduct.Companion(26);
        public static final Trust$Id$Companion$ADAPTER$1 ADAPTER = new Trust$Id$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Id.class), Syntax.PROTO_2, null);

        Id(int i) {
            this.value = i;
        }

        public static final Id fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return JOINED_AT;
            }
            if (i == 2) {
                return PAID_BY;
            }
            if (i != 3) {
                return null;
            }
            return CONTACTS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Trust$Companion$ADAPTER$1 trust$Companion$ADAPTER$1 = new Trust$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Trust.class), "type.googleapis.com/squareup.cash.cashface.api.Trust", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = trust$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(trust$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trust(Image image, String str, Boolean bool, Id id, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = image;
        this.title = str;
        this.enabled = bool;
        this.id = id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Trust)) {
            return false;
        }
        Trust trust = (Trust) obj;
        return Intrinsics.areEqual(unknownFields(), trust.unknownFields()) && Intrinsics.areEqual(this.icon, trust.icon) && Intrinsics.areEqual(this.title, trust.title) && Intrinsics.areEqual(this.enabled, trust.enabled) && this.id == trust.id;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Id id = this.id;
        int hashCode5 = hashCode4 + (id != null ? id.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.icon = this.icon;
        builder.title = this.title;
        builder.enabled = this.enabled;
        builder.id = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        Id id = this.id;
        if (id != null) {
            arrayList.add("id=" + id);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Trust{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object enabled;
        public Object icon;
        public Object id;
        public Serializable title;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 22:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.icon = emptyList;
                    this.id = emptyList;
                    break;
                default:
                    this.id = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Trust((Image) this.icon, (String) this.title, (Boolean) this.enabled, (Id) this.id, buildUnknownFields());
                case 1:
                    return new GetThreeDsEligibleInstrumentsInfoResponse((String) this.title, (String) this.icon, (List) this.enabled, (ResponseContext) this.id, buildUnknownFields());
                case 2:
                    return new Text((String) this.title, (SemanticColor) this.icon, (TextStyle) this.enabled, (TextAlignment) this.id, buildUnknownFields());
                case 3:
                    return new LanguageDisclosure((String) this.title, (String) this.icon, (AcceptanceState) this.enabled, (List) this.id, buildUnknownFields());
                case 4:
                    return new GetP2pProfileDetailsResponse((GetP2pProfileDetailsResponse.HeaderData) this.icon, (String) this.title, (String) this.enabled, (List) this.id, buildUnknownFields());
                case 5:
                    return new GetProfileDetailsRequest((ContactsStatus) this.icon, (String) this.title, (GetProfileDetailsContext) this.enabled, (String) this.id, buildUnknownFields());
                case 6:
                    return new GenericProfileElement.AchievementsWidgetElement.AchievementsProfileElement((Image) this.icon, (String) this.title, (String) this.enabled, (GenericProfileElement.ProgressMeterElement) this.id, buildUnknownFields());
                case 7:
                    return new GenericProfileElement.ProgressMeterElement((Image) this.icon, (GenericProfileElement.ColorScheme) this.title, (Long) this.enabled, (Long) this.id, buildUnknownFields());
                case 8:
                    return new RemoveFavoriteRequest((String) this.title, (RequestContext) this.icon, (Instant) this.enabled, (FavoriteOrigin) this.id, buildUnknownFields());
                case 9:
                    return new Address((String) this.title, (AddressType) this.icon, (String) this.enabled, (Chain) this.id, buildUnknownFields());
                case 10:
                    return new ExecuteUserOpRequest((ByteString) this.icon, (Chain) this.enabled, (List) this.id, (String) this.title, buildUnknownFields());
                case 11:
                    return new SwapQuote((String) this.title, (SwapEstimate) this.icon, (String) this.enabled, (String) this.id, buildUnknownFields());
                case 12:
                    return new AfterpayAppletEntrypoint.V3LoanBrief((UiAvatar) this.icon, (Money) this.title, (LocalizedString) this.enabled, (LocalizedString) this.id, buildUnknownFields());
                case 13:
                    return new AfterpayAppletPurchaseHistoryResponse((LocalizedString) this.icon, (Footer) this.title, (LocalizedString) this.enabled, (LocalizedString) this.id, buildUnknownFields());
                case 14:
                    return new AfterpayAppletResponse((Long) this.icon, (CreditLineSnapshot) this.title, (AfterpayAppletEntrypoint) this.enabled, (AfterpayAppletHome) this.id, buildUnknownFields());
                case 15:
                    return new AppletCardSection.ImageTextContent((zzux) this.icon, (LocalizedString) this.title, (LocalizedString) this.enabled, (TapAction) this.id, buildUnknownFields());
                case 16:
                    return new AppletCardSection.TappableFooter((HostFocusDirectorKt) this.icon, (LocalizedString) this.title, (TapAction) this.enabled, (LocalizedString) this.id, buildUnknownFields());
                case 17:
                    return new HeroBalanceSection.PaymentCalendar((List) this.icon, (HeroBalanceSection.PaymentCalendar.Overdue) this.title, (Button) this.enabled, (HeroBalanceSection.SectionCTA) this.id, buildUnknownFields());
                case 18:
                    return new HeroBalanceSection.PaymentCalendar.Payment((Long) this.icon, (Money) this.title, (AnalyticsEvent) this.enabled, (AnalyticsEvent) this.id, buildUnknownFields());
                case 19:
                    return new PaymentMgmtSection((PaymentMgmtSection.BalanceRow) this.icon, (PaymentMgmtSection.BalanceRow) this.title, (PaymentMgmtSection.BalanceRow) this.enabled, (Button) this.id, buildUnknownFields());
                case 20:
                    return new TileSection((Image) this.icon, (Double) this.title, (TileSection.Composition) this.enabled, (TileSection.SubtitlePlacement) this.id, buildUnknownFields());
                case 21:
                    return new AcceptPhoneVerificationAttemptResponse((PhoneVerificationAttemptState) this.icon, (String) this.title, (String) this.enabled, (ResponseContext) this.id, buildUnknownFields());
                case 22:
                    return new GetSyncEntitiesByTargetRequest((String) this.title, (List) this.icon, (Integer) this.enabled, (List) this.id, buildUnknownFields());
                case 23:
                    return new CommerceOrderRenderData((String) this.title, (Long) this.icon, (CommerceOrderRenderData.Product) this.enabled, (List) this.id, buildUnknownFields());
                case 24:
                    return new Action((String) this.title, (Color) this.enabled, (String) this.icon, (Color) this.id, buildUnknownFields());
                case 25:
                    return new ButtonElement((String) this.title, (ButtonElement.ButtonStyle) this.icon, (String) this.enabled, (String) this.id, buildUnknownFields());
                case 26:
                    return new CashInInstrument((String) this.title, (String) this.icon, (CashInInstrumentType) this.enabled, (Money) this.id, buildUnknownFields());
                case 27:
                    return new ClientCandidate((String) this.title, (Boolean) this.enabled, (Long) this.icon, (Boolean) this.id, buildUnknownFields());
                case 28:
                    return new SearchCommonTextRowItem((SearchCommonTextRowItem.Metadata) this.enabled, (HighlightText) this.id, (Image) this.icon, (String) this.title, buildUnknownFields());
                default:
                    return new GetSupportSurveyResponse.Survey((GetSupportSurveyResponse.Survey.ResolutionQuestion) this.icon, (GetSupportSurveyResponse.Survey.RatingQuestion) this.enabled, (String) this.title, (GetSupportSurveyResponse.Survey.SatisfactionQuestion) this.id, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
