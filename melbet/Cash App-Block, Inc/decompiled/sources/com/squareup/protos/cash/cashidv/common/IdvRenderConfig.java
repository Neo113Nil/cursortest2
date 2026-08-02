package com.squareup.protos.cash.cashidv.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.lending.CreditLine;
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
public final class IdvRenderConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IdvRenderConfig> CREATOR;
    public final String address_req_main_text;
    public final String address_req_subtext;
    public final String birthdate_req_subtext;
    public final EidvFailedBlockerTemplateName eidv_failed_blocker_template;
    public final EIdvIntroBlockerTemplateName eidv_intro_blocker_template;
    public final IdvEndResultScreenConfig idv_end_result_screen_config;
    public final InReviewBlockerTemplateName in_review_blocker_template;
    public final NotVerifiedBlockerTemplateName not_verified_blocker_template;
    public final ProvideLegalBlockerTemplateName provide_legal_name_blocker_template;
    public final Boolean skip_didv_ssn_denylist_intro;
    public final SsnCollectionBlockerTemplateName ssn_collection_blocker_template;
    public final String ssn_main_text;
    public final String ssn_main_text_compare_full_9;
    public final SsnScreenRenderConfig ssn_screen_render_config;
    public final String ssn_subtext_message;
    public final SsnTooltipConfig ssn_tooltip_config;
    public final Boolean suppress_sponsored_account_error_message;
    public final Boolean suppress_underage_error_message;
    public final VerifiedBlockerTemplateName verified_blocker_template;

    static {
        IdvRenderConfig$Companion$ADAPTER$1 idvRenderConfig$Companion$ADAPTER$1 = new IdvRenderConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IdvRenderConfig.class), "type.googleapis.com/squareup.cash.cashidv.common.IdvRenderConfig", Syntax.PROTO_2, null, "squareup/cash/cashidv/common/IdvRenderConfig.proto");
        ADAPTER = idvRenderConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(idvRenderConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdvRenderConfig(String str, Boolean bool, Boolean bool2, String str2, String str3, String str4, IdvEndResultScreenConfig idvEndResultScreenConfig, String str5, String str6, SsnTooltipConfig ssnTooltipConfig, SsnScreenRenderConfig ssnScreenRenderConfig, SsnCollectionBlockerTemplateName ssnCollectionBlockerTemplateName, EidvFailedBlockerTemplateName eidvFailedBlockerTemplateName, InReviewBlockerTemplateName inReviewBlockerTemplateName, NotVerifiedBlockerTemplateName notVerifiedBlockerTemplateName, EIdvIntroBlockerTemplateName eIdvIntroBlockerTemplateName, VerifiedBlockerTemplateName verifiedBlockerTemplateName, ProvideLegalBlockerTemplateName provideLegalBlockerTemplateName, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.birthdate_req_subtext = str;
        this.suppress_underage_error_message = bool;
        this.suppress_sponsored_account_error_message = bool2;
        this.ssn_main_text = str2;
        this.ssn_main_text_compare_full_9 = str3;
        this.ssn_subtext_message = str4;
        this.idv_end_result_screen_config = idvEndResultScreenConfig;
        this.address_req_main_text = str5;
        this.address_req_subtext = str6;
        this.ssn_tooltip_config = ssnTooltipConfig;
        this.ssn_screen_render_config = ssnScreenRenderConfig;
        this.ssn_collection_blocker_template = ssnCollectionBlockerTemplateName;
        this.eidv_failed_blocker_template = eidvFailedBlockerTemplateName;
        this.in_review_blocker_template = inReviewBlockerTemplateName;
        this.not_verified_blocker_template = notVerifiedBlockerTemplateName;
        this.eidv_intro_blocker_template = eIdvIntroBlockerTemplateName;
        this.verified_blocker_template = verifiedBlockerTemplateName;
        this.provide_legal_name_blocker_template = provideLegalBlockerTemplateName;
        this.skip_didv_ssn_denylist_intro = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdvRenderConfig)) {
            return false;
        }
        IdvRenderConfig idvRenderConfig = (IdvRenderConfig) obj;
        return Intrinsics.areEqual(unknownFields(), idvRenderConfig.unknownFields()) && Intrinsics.areEqual(this.birthdate_req_subtext, idvRenderConfig.birthdate_req_subtext) && Intrinsics.areEqual(this.suppress_underage_error_message, idvRenderConfig.suppress_underage_error_message) && Intrinsics.areEqual(this.suppress_sponsored_account_error_message, idvRenderConfig.suppress_sponsored_account_error_message) && Intrinsics.areEqual(this.ssn_main_text, idvRenderConfig.ssn_main_text) && Intrinsics.areEqual(this.ssn_main_text_compare_full_9, idvRenderConfig.ssn_main_text_compare_full_9) && Intrinsics.areEqual(this.ssn_subtext_message, idvRenderConfig.ssn_subtext_message) && Intrinsics.areEqual(this.idv_end_result_screen_config, idvRenderConfig.idv_end_result_screen_config) && Intrinsics.areEqual(this.address_req_main_text, idvRenderConfig.address_req_main_text) && Intrinsics.areEqual(this.address_req_subtext, idvRenderConfig.address_req_subtext) && Intrinsics.areEqual(this.ssn_tooltip_config, idvRenderConfig.ssn_tooltip_config) && Intrinsics.areEqual(this.ssn_screen_render_config, idvRenderConfig.ssn_screen_render_config) && this.ssn_collection_blocker_template == idvRenderConfig.ssn_collection_blocker_template && this.eidv_failed_blocker_template == idvRenderConfig.eidv_failed_blocker_template && this.in_review_blocker_template == idvRenderConfig.in_review_blocker_template && this.not_verified_blocker_template == idvRenderConfig.not_verified_blocker_template && this.eidv_intro_blocker_template == idvRenderConfig.eidv_intro_blocker_template && this.verified_blocker_template == idvRenderConfig.verified_blocker_template && this.provide_legal_name_blocker_template == idvRenderConfig.provide_legal_name_blocker_template && Intrinsics.areEqual(this.skip_didv_ssn_denylist_intro, idvRenderConfig.skip_didv_ssn_denylist_intro);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.birthdate_req_subtext;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.suppress_underage_error_message;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.suppress_sponsored_account_error_message;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str2 = this.ssn_main_text;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.ssn_main_text_compare_full_9;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.ssn_subtext_message;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        IdvEndResultScreenConfig idvEndResultScreenConfig = this.idv_end_result_screen_config;
        int hashCode8 = (hashCode7 + (idvEndResultScreenConfig != null ? idvEndResultScreenConfig.hashCode() : 0)) * 37;
        String str5 = this.address_req_main_text;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.address_req_subtext;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        SsnTooltipConfig ssnTooltipConfig = this.ssn_tooltip_config;
        int hashCode11 = (hashCode10 + (ssnTooltipConfig != null ? ssnTooltipConfig.hashCode() : 0)) * 37;
        SsnScreenRenderConfig ssnScreenRenderConfig = this.ssn_screen_render_config;
        int hashCode12 = (hashCode11 + (ssnScreenRenderConfig != null ? ssnScreenRenderConfig.hashCode() : 0)) * 37;
        SsnCollectionBlockerTemplateName ssnCollectionBlockerTemplateName = this.ssn_collection_blocker_template;
        int hashCode13 = (hashCode12 + (ssnCollectionBlockerTemplateName != null ? ssnCollectionBlockerTemplateName.hashCode() : 0)) * 37;
        EidvFailedBlockerTemplateName eidvFailedBlockerTemplateName = this.eidv_failed_blocker_template;
        int hashCode14 = (hashCode13 + (eidvFailedBlockerTemplateName != null ? eidvFailedBlockerTemplateName.hashCode() : 0)) * 37;
        InReviewBlockerTemplateName inReviewBlockerTemplateName = this.in_review_blocker_template;
        int hashCode15 = (hashCode14 + (inReviewBlockerTemplateName != null ? inReviewBlockerTemplateName.hashCode() : 0)) * 37;
        NotVerifiedBlockerTemplateName notVerifiedBlockerTemplateName = this.not_verified_blocker_template;
        int hashCode16 = (hashCode15 + (notVerifiedBlockerTemplateName != null ? notVerifiedBlockerTemplateName.hashCode() : 0)) * 37;
        EIdvIntroBlockerTemplateName eIdvIntroBlockerTemplateName = this.eidv_intro_blocker_template;
        int hashCode17 = (hashCode16 + (eIdvIntroBlockerTemplateName != null ? eIdvIntroBlockerTemplateName.hashCode() : 0)) * 37;
        VerifiedBlockerTemplateName verifiedBlockerTemplateName = this.verified_blocker_template;
        int hashCode18 = (hashCode17 + (verifiedBlockerTemplateName != null ? verifiedBlockerTemplateName.hashCode() : 0)) * 37;
        ProvideLegalBlockerTemplateName provideLegalBlockerTemplateName = this.provide_legal_name_blocker_template;
        int hashCode19 = (hashCode18 + (provideLegalBlockerTemplateName != null ? provideLegalBlockerTemplateName.hashCode() : 0)) * 37;
        Boolean bool3 = this.skip_didv_ssn_denylist_intro;
        int hashCode20 = hashCode19 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode20;
        return hashCode20;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CreditLine.Builder builder = new CreditLine.Builder(1);
        builder.token = this.birthdate_req_subtext;
        builder.skip_loan_amount_selection = this.suppress_underage_error_message;
        builder.credit_limit = this.suppress_sponsored_account_error_message;
        builder.instrument_display_name = this.ssn_main_text;
        builder.instrument_subtitle = this.ssn_main_text_compare_full_9;
        builder.available_amount = this.ssn_subtext_message;
        builder.outstanding_amount = this.idv_end_result_screen_config;
        builder.minimum_loan_amount = this.address_req_main_text;
        builder.setup_fee_bps = this.address_req_subtext;
        builder.quick_amounts = this.ssn_tooltip_config;
        builder.first_time_borrow_data = this.ssn_screen_render_config;
        builder.unlock_borrow_data = this.ssn_collection_blocker_template;
        builder.credit_line_status_icon = this.eidv_failed_blocker_template;
        builder.lending_product = this.in_review_blocker_template;
        builder.credit_line_status_data = this.not_verified_blocker_template;
        builder.credit_line_limit_data = this.eidv_intro_blocker_template;
        builder.alert = this.verified_blocker_template;
        builder.localizable_instrument_display_name = this.provide_legal_name_blocker_template;
        builder.localizable_instrument_subtitle = this.skip_didv_ssn_denylist_intro;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.birthdate_req_subtext;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "birthdate_req_subtext=", arrayList);
        }
        Boolean bool = this.suppress_underage_error_message;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_underage_error_message=", bool, arrayList);
        }
        Boolean bool2 = this.suppress_sponsored_account_error_message;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_sponsored_account_error_message=", bool2, arrayList);
        }
        String str2 = this.ssn_main_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ssn_main_text=", arrayList);
        }
        String str3 = this.ssn_main_text_compare_full_9;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "ssn_main_text_compare_full_9=", arrayList);
        }
        String str4 = this.ssn_subtext_message;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "ssn_subtext_message=", arrayList);
        }
        IdvEndResultScreenConfig idvEndResultScreenConfig = this.idv_end_result_screen_config;
        if (idvEndResultScreenConfig != null) {
            arrayList.add("idv_end_result_screen_config=" + idvEndResultScreenConfig);
        }
        String str5 = this.address_req_main_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "address_req_main_text=", arrayList);
        }
        String str6 = this.address_req_subtext;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "address_req_subtext=", arrayList);
        }
        SsnTooltipConfig ssnTooltipConfig = this.ssn_tooltip_config;
        if (ssnTooltipConfig != null) {
            arrayList.add("ssn_tooltip_config=" + ssnTooltipConfig);
        }
        SsnScreenRenderConfig ssnScreenRenderConfig = this.ssn_screen_render_config;
        if (ssnScreenRenderConfig != null) {
            arrayList.add("ssn_screen_render_config=" + ssnScreenRenderConfig);
        }
        SsnCollectionBlockerTemplateName ssnCollectionBlockerTemplateName = this.ssn_collection_blocker_template;
        if (ssnCollectionBlockerTemplateName != null) {
            arrayList.add("ssn_collection_blocker_template=" + ssnCollectionBlockerTemplateName);
        }
        EidvFailedBlockerTemplateName eidvFailedBlockerTemplateName = this.eidv_failed_blocker_template;
        if (eidvFailedBlockerTemplateName != null) {
            arrayList.add("eidv_failed_blocker_template=" + eidvFailedBlockerTemplateName);
        }
        InReviewBlockerTemplateName inReviewBlockerTemplateName = this.in_review_blocker_template;
        if (inReviewBlockerTemplateName != null) {
            arrayList.add("in_review_blocker_template=" + inReviewBlockerTemplateName);
        }
        NotVerifiedBlockerTemplateName notVerifiedBlockerTemplateName = this.not_verified_blocker_template;
        if (notVerifiedBlockerTemplateName != null) {
            arrayList.add("not_verified_blocker_template=" + notVerifiedBlockerTemplateName);
        }
        EIdvIntroBlockerTemplateName eIdvIntroBlockerTemplateName = this.eidv_intro_blocker_template;
        if (eIdvIntroBlockerTemplateName != null) {
            arrayList.add("eidv_intro_blocker_template=" + eIdvIntroBlockerTemplateName);
        }
        VerifiedBlockerTemplateName verifiedBlockerTemplateName = this.verified_blocker_template;
        if (verifiedBlockerTemplateName != null) {
            arrayList.add("verified_blocker_template=" + verifiedBlockerTemplateName);
        }
        ProvideLegalBlockerTemplateName provideLegalBlockerTemplateName = this.provide_legal_name_blocker_template;
        if (provideLegalBlockerTemplateName != null) {
            arrayList.add("provide_legal_name_blocker_template=" + provideLegalBlockerTemplateName);
        }
        Boolean bool3 = this.skip_didv_ssn_denylist_intro;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_didv_ssn_denylist_intro=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdvRenderConfig{", "}", 0, null, null, 56);
    }
}
