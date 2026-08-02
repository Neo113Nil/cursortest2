package com.squareup.protos.cash.cashidv.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.RewardStatus;
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
public final class IdvEndResultScreenConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IdvEndResultScreenConfig> CREATOR;
    public final Button custom_didv_failure_primary_button;
    public final String custom_didv_failure_subtitle;
    public final Button custom_didv_in_review_primary_button;
    public final String custom_didv_in_review_subtitle;
    public final String custom_didv_verified_subtitle;
    public final String custom_verified_subtext;
    public final Button denylist_secondary_button;
    public final Button didv_failure_secondary_button;
    public final Button didv_in_review_secondary_button;
    public final Boolean show_idv_end_result_screen_on_didv_cancel_failure;
    public final Boolean suppress_CTA_component;
    public final Boolean suppress_idv_end_result_screen_on_verified_status;
    public final Boolean suppress_primary_button_on_idv_attempt_exhausted;

    static {
        IdvEndResultScreenConfig$Companion$ADAPTER$1 idvEndResultScreenConfig$Companion$ADAPTER$1 = new IdvEndResultScreenConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IdvEndResultScreenConfig.class), "type.googleapis.com/squareup.cash.cashidv.common.IdvEndResultScreenConfig", Syntax.PROTO_2, null, "squareup/cash/cashidv/common/IdvRenderConfig.proto");
        ADAPTER = idvEndResultScreenConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(idvEndResultScreenConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdvEndResultScreenConfig(Boolean bool, String str, String str2, String str3, String str4, Button button, Button button2, Button button3, Button button4, Boolean bool2, Button button5, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.suppress_idv_end_result_screen_on_verified_status = bool;
        this.custom_didv_verified_subtitle = str;
        this.custom_didv_failure_subtitle = str2;
        this.custom_didv_in_review_subtitle = str3;
        this.custom_verified_subtext = str4;
        this.didv_failure_secondary_button = button;
        this.didv_in_review_secondary_button = button2;
        this.custom_didv_failure_primary_button = button3;
        this.custom_didv_in_review_primary_button = button4;
        this.suppress_primary_button_on_idv_attempt_exhausted = bool2;
        this.denylist_secondary_button = button5;
        this.suppress_CTA_component = bool3;
        this.show_idv_end_result_screen_on_didv_cancel_failure = bool4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdvEndResultScreenConfig)) {
            return false;
        }
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        return Intrinsics.areEqual(unknownFields(), idvEndResultScreenConfig.unknownFields()) && Intrinsics.areEqual(this.suppress_idv_end_result_screen_on_verified_status, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status) && Intrinsics.areEqual(this.custom_didv_verified_subtitle, idvEndResultScreenConfig.custom_didv_verified_subtitle) && Intrinsics.areEqual(this.custom_didv_failure_subtitle, idvEndResultScreenConfig.custom_didv_failure_subtitle) && Intrinsics.areEqual(this.custom_didv_in_review_subtitle, idvEndResultScreenConfig.custom_didv_in_review_subtitle) && Intrinsics.areEqual(this.custom_verified_subtext, idvEndResultScreenConfig.custom_verified_subtext) && Intrinsics.areEqual(this.didv_failure_secondary_button, idvEndResultScreenConfig.didv_failure_secondary_button) && Intrinsics.areEqual(this.didv_in_review_secondary_button, idvEndResultScreenConfig.didv_in_review_secondary_button) && Intrinsics.areEqual(this.custom_didv_failure_primary_button, idvEndResultScreenConfig.custom_didv_failure_primary_button) && Intrinsics.areEqual(this.custom_didv_in_review_primary_button, idvEndResultScreenConfig.custom_didv_in_review_primary_button) && Intrinsics.areEqual(this.suppress_primary_button_on_idv_attempt_exhausted, idvEndResultScreenConfig.suppress_primary_button_on_idv_attempt_exhausted) && Intrinsics.areEqual(this.denylist_secondary_button, idvEndResultScreenConfig.denylist_secondary_button) && Intrinsics.areEqual(this.suppress_CTA_component, idvEndResultScreenConfig.suppress_CTA_component) && Intrinsics.areEqual(this.show_idv_end_result_screen_on_didv_cancel_failure, idvEndResultScreenConfig.show_idv_end_result_screen_on_didv_cancel_failure);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.suppress_idv_end_result_screen_on_verified_status;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.custom_didv_verified_subtitle;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.custom_didv_failure_subtitle;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.custom_didv_in_review_subtitle;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.custom_verified_subtext;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Button button = this.didv_failure_secondary_button;
        int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
        Button button2 = this.didv_in_review_secondary_button;
        int hashCode8 = (hashCode7 + (button2 != null ? button2.hashCode() : 0)) * 37;
        Button button3 = this.custom_didv_failure_primary_button;
        int hashCode9 = (hashCode8 + (button3 != null ? button3.hashCode() : 0)) * 37;
        Button button4 = this.custom_didv_in_review_primary_button;
        int hashCode10 = (hashCode9 + (button4 != null ? button4.hashCode() : 0)) * 37;
        Boolean bool2 = this.suppress_primary_button_on_idv_attempt_exhausted;
        int hashCode11 = (hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Button button5 = this.denylist_secondary_button;
        int hashCode12 = (hashCode11 + (button5 != null ? button5.hashCode() : 0)) * 37;
        Boolean bool3 = this.suppress_CTA_component;
        int hashCode13 = (hashCode12 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.show_idv_end_result_screen_on_didv_cancel_failure;
        int hashCode14 = hashCode13 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(2);
        builder.code_entry_enabled = this.suppress_idv_end_result_screen_on_verified_status;
        builder.code_entry_client_route = this.custom_didv_verified_subtitle;
        builder.reward_button_text = this.custom_didv_failure_subtitle;
        builder.reward_header_text = this.custom_didv_in_review_subtitle;
        builder.reward_main_text = this.custom_verified_subtext;
        builder.minimum_code_length = this.didv_failure_secondary_button;
        builder.reward_button_priority = this.didv_in_review_secondary_button;
        builder.completed_reward_payments = this.custom_didv_failure_primary_button;
        builder.available_reward_payments = this.custom_didv_in_review_primary_button;
        builder.reward_screen_enabled = this.suppress_primary_button_on_idv_attempt_exhausted;
        builder.reward_payment_amount = this.denylist_secondary_button;
        builder.expiration = this.suppress_CTA_component;
        builder.referral_status_screen = this.show_idv_end_result_screen_on_didv_cancel_failure;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.suppress_idv_end_result_screen_on_verified_status;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_idv_end_result_screen_on_verified_status=", bool, arrayList);
        }
        String str = this.custom_didv_verified_subtitle;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "custom_didv_verified_subtitle=", arrayList);
        }
        String str2 = this.custom_didv_failure_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "custom_didv_failure_subtitle=", arrayList);
        }
        String str3 = this.custom_didv_in_review_subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "custom_didv_in_review_subtitle=", arrayList);
        }
        String str4 = this.custom_verified_subtext;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "custom_verified_subtext=", arrayList);
        }
        Button button = this.didv_failure_secondary_button;
        if (button != null) {
            arrayList.add("didv_failure_secondary_button=" + button);
        }
        Button button2 = this.didv_in_review_secondary_button;
        if (button2 != null) {
            arrayList.add("didv_in_review_secondary_button=" + button2);
        }
        Button button3 = this.custom_didv_failure_primary_button;
        if (button3 != null) {
            arrayList.add("custom_didv_failure_primary_button=" + button3);
        }
        Button button4 = this.custom_didv_in_review_primary_button;
        if (button4 != null) {
            arrayList.add("custom_didv_in_review_primary_button=" + button4);
        }
        Boolean bool2 = this.suppress_primary_button_on_idv_attempt_exhausted;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_primary_button_on_idv_attempt_exhausted=", bool2, arrayList);
        }
        Button button5 = this.denylist_secondary_button;
        if (button5 != null) {
            arrayList.add("denylist_secondary_button=" + button5);
        }
        Boolean bool3 = this.suppress_CTA_component;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_CTA_component=", bool3, arrayList);
        }
        Boolean bool4 = this.show_idv_end_result_screen_on_didv_cancel_failure;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_idv_end_result_screen_on_didv_cancel_failure=", bool4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdvEndResultScreenConfig{", "}", 0, null, null, 56);
    }
}
