package com.squareup.protos.cash.aliases;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.lynx.api.v1_0.model.BankMetadata;
import com.squareup.cash.mosaic.resources.api.v2.SearchMusicResourcesRequest;
import com.squareup.cash.supportarticles.app.v1.AnalyticsTag;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleRequest;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.aegis.core.ViewRequestLink;
import com.squareup.protos.cash.bankinfo.api.Bank$DisplaySettings;
import com.squareup.protos.cash.blockly.api.AllowlistSearchRequest;
import com.squareup.protos.cash.cash3dsauthentication.api.v1.GetThreeDsEligibleInstrumentsInfoResponse;
import com.squareup.protos.cash.cashautomationtooling.api.v1.external.CustomerContext;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateListingResponse;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.IOSCardData;
import com.squareup.protos.cash.cashface.api.GetGenericElementTreeRequest;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.cashface.api.ProfileElement;
import com.squareup.protos.cash.cashidv.common.SsnTooltipConfig;
import com.squareup.protos.cash.cashliteflow.api.v1.CardProcessorDetails;
import com.squareup.protos.cash.cashliteflow.api.v1.PreparedRecoveryActivity;
import com.squareup.protos.cash.cashsuggest.api.Experiments;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetMetadata;
import com.squareup.protos.cash.cashsuggest.api.SearchBar;
import com.squareup.protos.cash.cashsuggest.api.ShopInfoRequest;
import com.squareup.protos.cash.cashsuggest.api.ShopMerchantInfo;
import com.squareup.protos.cash.cashvoice.inappcallback.app.v1.StartOutboundPhoneSupportFlowParameters;
import com.squareup.protos.cash.composer.app.LottieAsset;
import com.squareup.protos.cash.contacts.app.LabeledString;
import com.squareup.protos.cash.customersurveyor.app.GetSupportSurveyResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.ShareSheet;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Cashtag extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Cashtag> CREATOR;
    public final String name;
    public final String prefix;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String name;
        public String prefix;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Cashtag(this.prefix, this.name, buildUnknownFields());
                case 1:
                    return new BenefitsHub.CommonQuestions.QuestionAndAnswer(this.prefix, this.name, buildUnknownFields());
                case 2:
                    return new BankMetadata.DisplaySettings.Theme(this.prefix, this.name, buildUnknownFields());
                case 3:
                    return new SearchMusicResourcesRequest(this.prefix, this.name, buildUnknownFields());
                case 4:
                    return new AnalyticsTag(this.prefix, this.name, buildUnknownFields());
                case 5:
                    return new GetSupportArticleRequest(this.prefix, this.name, buildUnknownFields());
                case 6:
                    return new Section.HeaderButton(this.prefix, this.name, buildUnknownFields());
                case 7:
                    return new ViewRequestLink(this.prefix, this.name, buildUnknownFields());
                case 8:
                    return new Bank$DisplaySettings.Theme(this.prefix, this.name, buildUnknownFields());
                case 9:
                    return new AllowlistSearchRequest(this.prefix, this.name, buildUnknownFields());
                case 10:
                    return new GetThreeDsEligibleInstrumentsInfoResponse.InstrumentInfo(this.prefix, this.name, buildUnknownFields());
                case 11:
                    return new CustomerContext(this.prefix, this.name, buildUnknownFields());
                case 12:
                    return new CreateListingResponse(this.prefix, this.name, buildUnknownFields());
                case 13:
                    return new IOSCardData(this.prefix, this.name, buildUnknownFields());
                case 14:
                    return new GetGenericElementTreeRequest(this.prefix, this.name, buildUnknownFields());
                case 15:
                    return new GetProfileDetailsResponse.MerchantData.MerchantProfileImage(this.prefix, this.name, buildUnknownFields());
                case 16:
                    String str = this.prefix;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "icon_url");
                        throw null;
                    }
                    String str2 = this.name;
                    if (str2 != null) {
                        return new ProfileElement(str, str2, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(str2, "text");
                    throw null;
                case 17:
                    return new SsnTooltipConfig(this.prefix, this.name, buildUnknownFields());
                case 18:
                    return new CardProcessorDetails(this.prefix, this.name, buildUnknownFields());
                case 19:
                    return new PreparedRecoveryActivity(this.prefix, this.name, buildUnknownFields());
                case 20:
                    return new Experiments.BNPLAssistantExperiment.Message(this.prefix, this.name, buildUnknownFields());
                case 21:
                    return new OffersSheetMetadata(this.prefix, this.name, buildUnknownFields());
                case 22:
                    return new SearchBar(this.prefix, this.name, buildUnknownFields());
                case 23:
                    return new ShopInfoRequest(this.prefix, this.name, buildUnknownFields());
                case 24:
                    return new ShopMerchantInfo(this.prefix, this.name, buildUnknownFields());
                case 25:
                    return new StartOutboundPhoneSupportFlowParameters(this.prefix, this.name, buildUnknownFields());
                case 26:
                    return new LottieAsset(this.prefix, this.name, buildUnknownFields());
                case 27:
                    return new LabeledString(this.prefix, this.name, buildUnknownFields());
                case 28:
                    return new GetSupportSurveyResponse.Survey.ResolutionQuestion(this.prefix, this.name, buildUnknownFields());
                default:
                    return new ShareSheet(this.prefix, this.name, buildUnknownFields());
            }
        }
    }

    static {
        Cashtag$Companion$ADAPTER$1 cashtag$Companion$ADAPTER$1 = new Cashtag$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Cashtag.class), "type.googleapis.com/squareup.cash.aliases.Cashtag", Syntax.PROTO_2, null, "squareup/cash/aliases/Cashtag.proto");
        ADAPTER = cashtag$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashtag$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cashtag(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prefix = str;
        this.name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cashtag)) {
            return false;
        }
        Cashtag cashtag = (Cashtag) obj;
        return Intrinsics.areEqual(unknownFields(), cashtag.unknownFields()) && Intrinsics.areEqual(this.prefix, cashtag.prefix) && Intrinsics.areEqual(this.name, cashtag.name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prefix;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.prefix = this.prefix;
        builder.name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prefix;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prefix=", arrayList);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Cashtag{", "}", 0, null, null, 56);
    }
}
