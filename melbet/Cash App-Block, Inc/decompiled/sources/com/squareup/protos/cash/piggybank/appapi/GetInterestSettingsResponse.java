package com.squareup.protos.cash.piggybank.appapi;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/piggybank/appapi/GetInterestSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetInterestSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetInterestSettingsResponse> CREATOR;
    public final InterestYieldStatus interest_yield_status;

    static {
        GetInterestSettingsResponse$Companion$ADAPTER$1 getInterestSettingsResponse$Companion$ADAPTER$1 = new GetInterestSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetInterestSettingsResponse.class), "type.googleapis.com/squareup.cash.piggybank.appapi.GetInterestSettingsResponse", Syntax.PROTO_2, null, "squareup/cash/app/get_interest_settings.proto");
        ADAPTER = getInterestSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getInterestSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInterestSettingsResponse(InterestYieldStatus interestYieldStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.interest_yield_status = interestYieldStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetInterestSettingsResponse)) {
            return false;
        }
        GetInterestSettingsResponse getInterestSettingsResponse = (GetInterestSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getInterestSettingsResponse.unknownFields()) && this.interest_yield_status == getInterestSettingsResponse.interest_yield_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InterestYieldStatus interestYieldStatus = this.interest_yield_status;
        int hashCode2 = hashCode + (interestYieldStatus != null ? interestYieldStatus.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(29);
        builder.local_buyer = this.interest_yield_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InterestYieldStatus interestYieldStatus = this.interest_yield_status;
        if (interestYieldStatus != null) {
            arrayList.add("interest_yield_status=" + interestYieldStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetInterestSettingsResponse{", "}", 0, null, null, 56);
    }
}
