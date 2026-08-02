package com.squareup.protos.cash.weaver.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
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

/* loaded from: classes8.dex */
public final class PromoterMessagingMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PromoterMessagingMetadata> CREATOR;
    public final String campaign_token;
    public final Boolean eligibility;

    static {
        PromoterMessagingMetadata$Companion$ADAPTER$1 promoterMessagingMetadata$Companion$ADAPTER$1 = new PromoterMessagingMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PromoterMessagingMetadata.class), "type.googleapis.com/squareup.cash.weaver.api.PromoterMessagingMetadata", Syntax.PROTO_2, null, "squareup/cash/weaver/api/service.proto");
        ADAPTER = promoterMessagingMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(promoterMessagingMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoterMessagingMetadata(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.campaign_token = str;
        this.eligibility = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PromoterMessagingMetadata)) {
            return false;
        }
        PromoterMessagingMetadata promoterMessagingMetadata = (PromoterMessagingMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), promoterMessagingMetadata.unknownFields()) && Intrinsics.areEqual(this.campaign_token, promoterMessagingMetadata.campaign_token) && Intrinsics.areEqual(this.eligibility, promoterMessagingMetadata.eligibility);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.campaign_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.eligibility;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(9);
        builder.main_text = this.campaign_token;
        builder.show_payments = this.eligibility;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.campaign_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "campaign_token=", arrayList);
        }
        Boolean bool = this.eligibility;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("eligibility=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PromoterMessagingMetadata{", "}", 0, null, null, 56);
    }
}
