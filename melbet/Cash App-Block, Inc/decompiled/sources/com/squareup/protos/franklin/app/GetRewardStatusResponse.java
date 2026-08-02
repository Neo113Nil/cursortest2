package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.common.RewardStatus;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetRewardStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/ClaimData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetRewardStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRewardStatusResponse> CREATOR;
    public final RewardStatus reward_status;

    static {
        GetRewardStatusResponse$Companion$ADAPTER$1 getRewardStatusResponse$Companion$ADAPTER$1 = new GetRewardStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRewardStatusResponse.class), "type.googleapis.com/squareup.franklin.app.GetRewardStatusResponse", Syntax.PROTO_2, null, "squareup/franklin/app/reward_status.proto");
        ADAPTER = getRewardStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRewardStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRewardStatusResponse(RewardStatus rewardStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.reward_status = rewardStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRewardStatusResponse)) {
            return false;
        }
        GetRewardStatusResponse getRewardStatusResponse = (GetRewardStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRewardStatusResponse.unknownFields()) && Intrinsics.areEqual(this.reward_status, getRewardStatusResponse.reward_status);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RewardStatus rewardStatus = this.reward_status;
        int hashCode2 = hashCode + (rewardStatus != null ? rewardStatus.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(13);
        builder.claimable_payment = this.reward_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RewardStatus rewardStatus = this.reward_status;
        if (rewardStatus != null) {
            arrayList.add("reward_status=" + rewardStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRewardStatusResponse{", "}", 0, null, null, 56);
    }
}
