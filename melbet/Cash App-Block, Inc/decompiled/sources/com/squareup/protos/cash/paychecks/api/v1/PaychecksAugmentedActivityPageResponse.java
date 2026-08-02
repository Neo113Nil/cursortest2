package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.protos.cash.postcard.CardModule;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/PaychecksAugmentedActivityPageResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaychecksAugmentedActivityPageResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaychecksAugmentedActivityPageResponse> CREATOR;
    public final List monthly_aggregations;
    public final ActivityPageResponse response;

    static {
        PaychecksAugmentedActivityPageResponse$Companion$ADAPTER$1 paychecksAugmentedActivityPageResponse$Companion$ADAPTER$1 = new PaychecksAugmentedActivityPageResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaychecksAugmentedActivityPageResponse.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.PaychecksAugmentedActivityPageResponse", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/paychecks_app_service.proto");
        ADAPTER = paychecksAugmentedActivityPageResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paychecksAugmentedActivityPageResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaychecksAugmentedActivityPageResponse(ActivityPageResponse activityPageResponse, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.response = activityPageResponse;
        this.monthly_aggregations = TransactorKt.immutableCopyOf("monthly_aggregations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaychecksAugmentedActivityPageResponse)) {
            return false;
        }
        PaychecksAugmentedActivityPageResponse paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) obj;
        return Intrinsics.areEqual(unknownFields(), paychecksAugmentedActivityPageResponse.unknownFields()) && Intrinsics.areEqual(this.response, paychecksAugmentedActivityPageResponse.response) && Intrinsics.areEqual(this.monthly_aggregations, paychecksAugmentedActivityPageResponse.monthly_aggregations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivityPageResponse activityPageResponse = this.response;
        int hashCode2 = this.monthly_aggregations.hashCode() + ((hashCode + (activityPageResponse != null ? activityPageResponse.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(8);
        builder.f1329type = this.response;
        builder.use_case = this.monthly_aggregations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivityPageResponse activityPageResponse = this.response;
        if (activityPageResponse != null) {
            arrayList.add("response=" + activityPageResponse);
        }
        List list = this.monthly_aggregations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("monthly_aggregations=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaychecksAugmentedActivityPageResponse{", "}", 0, null, null, 56);
    }
}
