package com.squareup.protos.cash.weaver.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.common.time.DateTime;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/weaver/api/DismissRecommendationCandidateResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/common/time/DateTime$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DismissRecommendationCandidateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DismissRecommendationCandidateResponse> CREATOR;
    public final String generic_recommendation_name;
    public final String item_id;
    public final RecommendationType recommendation_type;
    public final String source_entity_token;
    public final Long suppressed_until_epoch_millis;

    static {
        DismissRecommendationCandidateResponse$Companion$ADAPTER$1 dismissRecommendationCandidateResponse$Companion$ADAPTER$1 = new DismissRecommendationCandidateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DismissRecommendationCandidateResponse.class), "type.googleapis.com/squareup.cash.weaver.api.DismissRecommendationCandidateResponse", Syntax.PROTO_2, null, "squareup/cash/weaver/api/service.proto");
        ADAPTER = dismissRecommendationCandidateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dismissRecommendationCandidateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DismissRecommendationCandidateResponse(String str, RecommendationType recommendationType, String str2, String str3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source_entity_token = str;
        this.recommendation_type = recommendationType;
        this.generic_recommendation_name = str2;
        this.item_id = str3;
        this.suppressed_until_epoch_millis = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DismissRecommendationCandidateResponse)) {
            return false;
        }
        DismissRecommendationCandidateResponse dismissRecommendationCandidateResponse = (DismissRecommendationCandidateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), dismissRecommendationCandidateResponse.unknownFields()) && Intrinsics.areEqual(this.source_entity_token, dismissRecommendationCandidateResponse.source_entity_token) && this.recommendation_type == dismissRecommendationCandidateResponse.recommendation_type && Intrinsics.areEqual(this.generic_recommendation_name, dismissRecommendationCandidateResponse.generic_recommendation_name) && Intrinsics.areEqual(this.item_id, dismissRecommendationCandidateResponse.item_id) && Intrinsics.areEqual(this.suppressed_until_epoch_millis, dismissRecommendationCandidateResponse.suppressed_until_epoch_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.source_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RecommendationType recommendationType = this.recommendation_type;
        int hashCode3 = (hashCode2 + (recommendationType != null ? recommendationType.hashCode() : 0)) * 37;
        String str2 = this.generic_recommendation_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.item_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.suppressed_until_epoch_millis;
        int hashCode6 = hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(22, false);
        builder.posix_tz = this.source_entity_token;
        builder.ordinal = this.recommendation_type;
        builder.timezone_offset_min = this.generic_recommendation_name;
        builder.tz_name = this.item_id;
        builder.instant_usec = this.suppressed_until_epoch_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.source_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_entity_token=", arrayList);
        }
        RecommendationType recommendationType = this.recommendation_type;
        if (recommendationType != null) {
            arrayList.add("recommendation_type=" + recommendationType);
        }
        String str2 = this.generic_recommendation_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "generic_recommendation_name=", arrayList);
        }
        String str3 = this.item_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "item_id=", arrayList);
        }
        Long l = this.suppressed_until_epoch_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppressed_until_epoch_millis=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DismissRecommendationCandidateResponse{", "}", 0, null, null, 56);
    }
}
