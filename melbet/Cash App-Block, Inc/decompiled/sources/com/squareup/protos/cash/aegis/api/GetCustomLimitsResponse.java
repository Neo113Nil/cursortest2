package com.squareup.protos.cash.aegis.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/aegis/api/GetCustomLimitsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/moneybot/genie/protos/ForEach$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCustomLimitsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomLimitsResponse> CREATOR;
    public final Long custom_card_spend_limit_30_day_max_amount;
    public final List custom_card_spend_limit_30_day_presets;
    public final List custom_limits;
    public final String customer_token;

    static {
        GetCustomLimitsResponse$Companion$ADAPTER$1 getCustomLimitsResponse$Companion$ADAPTER$1 = new GetCustomLimitsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomLimitsResponse.class), "type.googleapis.com/squareup.cash.aegis.api.GetCustomLimitsResponse", Syntax.PROTO_2, null, "squareup/cash/aegis/api/GetCustomLimitsResponse.proto");
        ADAPTER = getCustomLimitsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomLimitsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomLimitsResponse(String str, List list, List list2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.customer_token = str;
        this.custom_card_spend_limit_30_day_max_amount = l;
        this.custom_limits = TransactorKt.immutableCopyOf("custom_limits", list);
        this.custom_card_spend_limit_30_day_presets = TransactorKt.immutableCopyOf("custom_card_spend_limit_30_day_presets", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomLimitsResponse)) {
            return false;
        }
        GetCustomLimitsResponse getCustomLimitsResponse = (GetCustomLimitsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomLimitsResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token, getCustomLimitsResponse.customer_token) && Intrinsics.areEqual(this.custom_limits, getCustomLimitsResponse.custom_limits) && Intrinsics.areEqual(this.custom_card_spend_limit_30_day_presets, getCustomLimitsResponse.custom_card_spend_limit_30_day_presets) && Intrinsics.areEqual(this.custom_card_spend_limit_30_day_max_amount, getCustomLimitsResponse.custom_card_spend_limit_30_day_max_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.custom_limits), 37, this.custom_card_spend_limit_30_day_presets);
        Long l = this.custom_card_spend_limit_30_day_max_amount;
        int hashCode2 = m + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(19);
        builder.item_variable = this.customer_token;
        builder.collection = this.custom_limits;
        builder.template = this.custom_card_spend_limit_30_day_presets;
        builder.source = this.custom_card_spend_limit_30_day_max_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.custom_limits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("custom_limits=", arrayList, list);
        }
        List list2 = this.custom_card_spend_limit_30_day_presets;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("custom_card_spend_limit_30_day_presets=", arrayList, list2);
        }
        Long l = this.custom_card_spend_limit_30_day_max_amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("custom_card_spend_limit_30_day_max_amount=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomLimitsResponse{", "}", 0, null, null, 56);
    }
}
