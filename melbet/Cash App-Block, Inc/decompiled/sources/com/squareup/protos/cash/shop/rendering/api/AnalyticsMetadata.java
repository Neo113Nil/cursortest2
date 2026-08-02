package com.squareup.protos.cash.shop.rendering.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AnalyticsMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnalyticsMetadata> CREATOR;
    public final String business_name;
    public final String business_token;
    public final String entity_name;
    public final String entity_token;
    public final EntityType entity_type;
    public final String initial_url;
    public final String store_id;

    public enum EntityType implements WireEnum {
        BUSINESS(1),
        OFFER(2);

        public final int value;
        public static final TextSize.Companion Companion = new TextSize.Companion();
        public static final AnalyticsMetadata$EntityType$Companion$ADAPTER$1 ADAPTER = new AnalyticsMetadata$EntityType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntityType.class), Syntax.PROTO_2, null);

        EntityType(int i) {
            this.value = i;
        }

        public static final EntityType fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BUSINESS;
            }
            if (i != 2) {
                return null;
            }
            return OFFER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AnalyticsMetadata$Companion$ADAPTER$1 analyticsMetadata$Companion$ADAPTER$1 = new AnalyticsMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AnalyticsMetadata.class), "type.googleapis.com/squareup.cash.shop.rendering.api.AnalyticsMetadata", Syntax.PROTO_2, null, "squareup/cash/shop/rendering/api/Common.proto");
        ADAPTER = analyticsMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(analyticsMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsMetadata(String str, String str2, EntityType entityType, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_token = str;
        this.entity_name = str2;
        this.entity_type = entityType;
        this.store_id = str3;
        this.initial_url = str4;
        this.business_token = str5;
        this.business_name = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalyticsMetadata)) {
            return false;
        }
        AnalyticsMetadata analyticsMetadata = (AnalyticsMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), analyticsMetadata.unknownFields()) && Intrinsics.areEqual(this.entity_token, analyticsMetadata.entity_token) && Intrinsics.areEqual(this.entity_name, analyticsMetadata.entity_name) && this.entity_type == analyticsMetadata.entity_type && Intrinsics.areEqual(this.store_id, analyticsMetadata.store_id) && Intrinsics.areEqual(this.initial_url, analyticsMetadata.initial_url) && Intrinsics.areEqual(this.business_token, analyticsMetadata.business_token) && Intrinsics.areEqual(this.business_name, analyticsMetadata.business_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.entity_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EntityType entityType = this.entity_type;
        int hashCode4 = (hashCode3 + (entityType != null ? entityType.hashCode() : 0)) * 37;
        String str3 = this.store_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.initial_url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.business_token;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.business_name;
        int hashCode8 = hashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(17);
        builder.customer_identifier = this.entity_token;
        builder.full_name = this.entity_name;
        builder.added_at = this.entity_type;
        builder.profile_photo_url = this.store_id;
        builder.cashtag = this.initial_url;
        builder.participant_type = this.business_token;
        builder.aggregated_contribution_amount = this.business_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_token=", arrayList);
        }
        String str2 = this.entity_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "entity_name=", arrayList);
        }
        EntityType entityType = this.entity_type;
        if (entityType != null) {
            arrayList.add("entity_type=" + entityType);
        }
        String str3 = this.store_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "store_id=", arrayList);
        }
        String str4 = this.initial_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "initial_url=", arrayList);
        }
        String str5 = this.business_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "business_token=", arrayList);
        }
        String str6 = this.business_name;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "business_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsMetadata{", "}", 0, null, null, 56);
    }
}
