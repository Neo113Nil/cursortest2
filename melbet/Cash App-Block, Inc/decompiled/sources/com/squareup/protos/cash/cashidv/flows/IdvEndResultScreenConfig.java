package com.squareup.protos.cash.cashidv.flows;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoalEmoji;
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
    public final String custom_didv_failure_subtitle;
    public final String custom_didv_in_review_subtitle;
    public final String custom_didv_verified_subtitle;
    public final Boolean suppress_idv_end_result_screen_on_verified_status;

    static {
        IdvEndResultScreenConfig$Companion$ADAPTER$1 idvEndResultScreenConfig$Companion$ADAPTER$1 = new IdvEndResultScreenConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IdvEndResultScreenConfig.class), "type.googleapis.com/squareup.cash.cashidv.flows.IdvEndResultScreenConfig", Syntax.PROTO_2, null, "squareup/cash/cashidv/flows/RequirementParameters.proto");
        ADAPTER = idvEndResultScreenConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(idvEndResultScreenConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdvEndResultScreenConfig(Boolean bool, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.suppress_idv_end_result_screen_on_verified_status = bool;
        this.custom_didv_verified_subtitle = str;
        this.custom_didv_failure_subtitle = str2;
        this.custom_didv_in_review_subtitle = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdvEndResultScreenConfig)) {
            return false;
        }
        IdvEndResultScreenConfig idvEndResultScreenConfig = (IdvEndResultScreenConfig) obj;
        return Intrinsics.areEqual(unknownFields(), idvEndResultScreenConfig.unknownFields()) && Intrinsics.areEqual(this.suppress_idv_end_result_screen_on_verified_status, idvEndResultScreenConfig.suppress_idv_end_result_screen_on_verified_status) && Intrinsics.areEqual(this.custom_didv_verified_subtitle, idvEndResultScreenConfig.custom_didv_verified_subtitle) && Intrinsics.areEqual(this.custom_didv_failure_subtitle, idvEndResultScreenConfig.custom_didv_failure_subtitle) && Intrinsics.areEqual(this.custom_didv_in_review_subtitle, idvEndResultScreenConfig.custom_didv_in_review_subtitle);
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
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SavingsGoalEmoji.Builder builder = new SavingsGoalEmoji.Builder(1);
        builder.active = this.suppress_idv_end_result_screen_on_verified_status;
        builder.name = this.custom_didv_verified_subtitle;
        builder.text = this.custom_didv_failure_subtitle;
        builder.accessibility_text = this.custom_didv_in_review_subtitle;
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdvEndResultScreenConfig{", "}", 0, null, null, 56);
    }
}
