package com.squareup.protos.cash.weaver.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.weaver.api.shared.RecommendationType;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/weaver/api/GetRecommendationsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/out/sync_entity/CashOutFeeData$Builder;", "Builder", "RecommendationSet", "RecommendationItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRecommendationsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRecommendationsResponse> CREATOR;
    public final Long created_at_millis;
    public final List recommendation_sets;

    /* loaded from: classes.dex */
    public final class RecommendationItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecommendationItem> CREATOR;
        public final Boolean is_missing_ml_result;
        public final Boolean is_post_processing_overridden;
        public final String item_id;
        public final GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata item_metadata;
        public final Long item_store_id;
        public final ApStoreList item_store_list;
        public final String predicted_at;
        public final String recommendation_id;
        public final Double score;

        static {
            GetRecommendationsResponse$RecommendationItem$Companion$ADAPTER$1 getRecommendationsResponse$RecommendationItem$Companion$ADAPTER$1 = new GetRecommendationsResponse$RecommendationItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecommendationItem.class), "type.googleapis.com/squareup.cash.weaver.api.GetRecommendationsResponse.RecommendationItem", Syntax.PROTO_2, null, "squareup/cash/weaver/api/service.proto");
            ADAPTER = getRecommendationsResponse$RecommendationItem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRecommendationsResponse$RecommendationItem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationItem(String str, Double d, String str2, String str3, Boolean bool, Boolean bool2, Long l, ApStoreList apStoreList, GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.item_id = str;
            this.score = d;
            this.recommendation_id = str2;
            this.predicted_at = str3;
            this.is_missing_ml_result = bool;
            this.is_post_processing_overridden = bool2;
            this.item_store_id = l;
            this.item_store_list = apStoreList;
            this.item_metadata = getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecommendationItem)) {
                return false;
            }
            RecommendationItem recommendationItem = (RecommendationItem) obj;
            return Intrinsics.areEqual(unknownFields(), recommendationItem.unknownFields()) && Intrinsics.areEqual(this.item_id, recommendationItem.item_id) && Intrinsics.areEqual(this.score, recommendationItem.score) && Intrinsics.areEqual(this.recommendation_id, recommendationItem.recommendation_id) && Intrinsics.areEqual(this.predicted_at, recommendationItem.predicted_at) && Intrinsics.areEqual(this.is_missing_ml_result, recommendationItem.is_missing_ml_result) && Intrinsics.areEqual(this.is_post_processing_overridden, recommendationItem.is_post_processing_overridden) && Intrinsics.areEqual(this.item_store_id, recommendationItem.item_store_id) && Intrinsics.areEqual(this.item_store_list, recommendationItem.item_store_list) && Intrinsics.areEqual(this.item_metadata, recommendationItem.item_metadata);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.item_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Double d = this.score;
            int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
            String str2 = this.recommendation_id;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.predicted_at;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Boolean bool = this.is_missing_ml_result;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_post_processing_overridden;
            int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Long l = this.item_store_id;
            int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            ApStoreList apStoreList = this.item_store_list;
            int hashCode9 = (hashCode8 + (apStoreList != null ? apStoreList.hashCode() : 0)) * 37;
            GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = this.item_metadata;
            int hashCode10 = hashCode9 + (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null ? getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(3, false);
            builder.token = this.item_id;
            builder.source = this.score;
            builder.target = this.recommendation_id;
            builder.state = this.predicted_at;
            builder.amount = this.is_missing_ml_result;
            builder.push_amount = this.is_post_processing_overridden;
            builder.created_at = this.item_store_id;
            builder.completed_at = this.item_store_list;
            builder.failed_at = this.item_metadata;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.item_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "item_id=", arrayList);
            }
            Double d = this.score;
            if (d != null) {
                SizeMode$EnumUnboxingLocalUtility.m("score=", d, arrayList);
            }
            String str2 = this.recommendation_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "recommendation_id=", arrayList);
            }
            String str3 = this.predicted_at;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "predicted_at=", arrayList);
            }
            Boolean bool = this.is_missing_ml_result;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_missing_ml_result=", bool, arrayList);
            }
            Boolean bool2 = this.is_post_processing_overridden;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_post_processing_overridden=", bool2, arrayList);
            }
            Long l = this.item_store_id;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("item_store_id=", l, arrayList);
            }
            ApStoreList apStoreList = this.item_store_list;
            if (apStoreList != null) {
                arrayList.add("item_store_list=" + apStoreList);
            }
            GetRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata = this.item_metadata;
            if (getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata != null) {
                arrayList.add("item_metadata=" + getRecommendationsResponse$RecommendationItem$ItemMetadata$PromoterMessagingMetadata);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecommendationItem{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes8.dex */
    public final class RecommendationSet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecommendationSet> CREATOR;
        public final Boolean eligible_for_personalization;
        public final String generic_recommendation_name;
        public final Boolean is_default_set;
        public final String model_version;
        public final List recommendation_items;
        public final RecommendationType recommendation_type;
        public final List retriever_input_names;
        public final String source_entity_token;
        public final String variation_name;

        static {
            GetRecommendationsResponse$RecommendationSet$Companion$ADAPTER$1 getRecommendationsResponse$RecommendationSet$Companion$ADAPTER$1 = new GetRecommendationsResponse$RecommendationSet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecommendationSet.class), "type.googleapis.com/squareup.cash.weaver.api.GetRecommendationsResponse.RecommendationSet", Syntax.PROTO_2, null, "squareup/cash/weaver/api/service.proto");
            ADAPTER = getRecommendationsResponse$RecommendationSet$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getRecommendationsResponse$RecommendationSet$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendationSet(RecommendationType recommendationType, String str, List list, Boolean bool, String str2, String str3, List list2, Boolean bool2, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.recommendation_type = recommendationType;
            this.model_version = str;
            this.is_default_set = bool;
            this.source_entity_token = str2;
            this.variation_name = str3;
            this.eligible_for_personalization = bool2;
            this.generic_recommendation_name = str4;
            this.recommendation_items = TransactorKt.immutableCopyOf("recommendation_items", list);
            this.retriever_input_names = TransactorKt.immutableCopyOf("retriever_input_names", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RecommendationSet)) {
                return false;
            }
            RecommendationSet recommendationSet = (RecommendationSet) obj;
            return Intrinsics.areEqual(unknownFields(), recommendationSet.unknownFields()) && this.recommendation_type == recommendationSet.recommendation_type && Intrinsics.areEqual(this.model_version, recommendationSet.model_version) && Intrinsics.areEqual(this.recommendation_items, recommendationSet.recommendation_items) && Intrinsics.areEqual(this.is_default_set, recommendationSet.is_default_set) && Intrinsics.areEqual(this.source_entity_token, recommendationSet.source_entity_token) && Intrinsics.areEqual(this.variation_name, recommendationSet.variation_name) && Intrinsics.areEqual(this.retriever_input_names, recommendationSet.retriever_input_names) && Intrinsics.areEqual(this.eligible_for_personalization, recommendationSet.eligible_for_personalization) && Intrinsics.areEqual(this.generic_recommendation_name, recommendationSet.generic_recommendation_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RecommendationType recommendationType = this.recommendation_type;
            int hashCode2 = (hashCode + (recommendationType != null ? recommendationType.hashCode() : 0)) * 37;
            String str = this.model_version;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.recommendation_items);
            Boolean bool = this.is_default_set;
            int hashCode3 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str2 = this.source_entity_token;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.variation_name;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.retriever_input_names);
            Boolean bool2 = this.eligible_for_personalization;
            int hashCode5 = (m2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str4 = this.generic_recommendation_name;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Transfer.Builder builder = new Transfer.Builder(4, false);
            builder.source = this.recommendation_type;
            builder.token = this.model_version;
            builder.target = this.recommendation_items;
            builder.state = this.is_default_set;
            builder.amount = this.source_entity_token;
            builder.push_amount = this.variation_name;
            builder.created_at = this.retriever_input_names;
            builder.completed_at = this.eligible_for_personalization;
            builder.failed_at = this.generic_recommendation_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RecommendationType recommendationType = this.recommendation_type;
            if (recommendationType != null) {
                arrayList.add("recommendation_type=" + recommendationType);
            }
            String str = this.model_version;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "model_version=", arrayList);
            }
            List list = this.recommendation_items;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("recommendation_items=", arrayList, list);
            }
            Boolean bool = this.is_default_set;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_default_set=", bool, arrayList);
            }
            String str2 = this.source_entity_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "source_entity_token=", arrayList);
            }
            String str3 = this.variation_name;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "variation_name=", arrayList);
            }
            List list2 = this.retriever_input_names;
            if (!list2.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("retriever_input_names=", arrayList, list2);
            }
            Boolean bool2 = this.eligible_for_personalization;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("eligible_for_personalization=", bool2, arrayList);
            }
            String str4 = this.generic_recommendation_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "generic_recommendation_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RecommendationSet{", "}", 0, null, null, 56);
        }
    }

    static {
        GetRecommendationsResponse$Companion$ADAPTER$1 getRecommendationsResponse$Companion$ADAPTER$1 = new GetRecommendationsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRecommendationsResponse.class), "type.googleapis.com/squareup.cash.weaver.api.GetRecommendationsResponse", Syntax.PROTO_2, null, "squareup/cash/weaver/api/service.proto");
        ADAPTER = getRecommendationsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRecommendationsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRecommendationsResponse(Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.created_at_millis = l;
        this.recommendation_sets = TransactorKt.immutableCopyOf("recommendation_sets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRecommendationsResponse)) {
            return false;
        }
        GetRecommendationsResponse getRecommendationsResponse = (GetRecommendationsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRecommendationsResponse.unknownFields()) && Intrinsics.areEqual(this.created_at_millis, getRecommendationsResponse.created_at_millis) && Intrinsics.areEqual(this.recommendation_sets, getRecommendationsResponse.recommendation_sets);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.created_at_millis;
        int hashCode2 = this.recommendation_sets.hashCode() + ((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashOutFeeData.Builder builder = new CashOutFeeData.Builder(4);
        builder.version = this.created_at_millis;
        builder.min_fee_steps = this.recommendation_sets;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.created_at_millis;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_millis=", l, arrayList);
        }
        List list = this.recommendation_sets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("recommendation_sets=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRecommendationsResponse{", "}", 0, null, null, 56);
    }
}
