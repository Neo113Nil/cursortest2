package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.genericelements.ui.BoostCarouselContainer;
import com.squareup.protos.franklin.common.RewardsData;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetRewardsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/GetRewardsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetRewardsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetRewardsResponse> CREATOR;
    public final RewardsData rewards_data;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public RewardsData rewards_data;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetRewardsResponse(this.rewards_data, buildUnknownFields());
                case 1:
                    return new GenericProfileElement.BoostElement(this.rewards_data, buildUnknownFields());
                default:
                    return new BoostCarouselContainer(this.rewards_data, buildUnknownFields());
            }
        }
    }

    static {
        GetRewardsResponse$Companion$ADAPTER$1 getRewardsResponse$Companion$ADAPTER$1 = new GetRewardsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetRewardsResponse.class), "type.googleapis.com/squareup.franklin.app.GetRewardsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/rewards.proto");
        ADAPTER = getRewardsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getRewardsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRewardsResponse(RewardsData rewardsData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rewards_data = rewardsData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetRewardsResponse)) {
            return false;
        }
        GetRewardsResponse getRewardsResponse = (GetRewardsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getRewardsResponse.unknownFields()) && Intrinsics.areEqual(this.rewards_data, getRewardsResponse.rewards_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RewardsData rewardsData = this.rewards_data;
        int hashCode2 = hashCode + (rewardsData != null ? rewardsData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.rewards_data = this.rewards_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RewardsData rewardsData = this.rewards_data;
        if (rewardsData != null) {
            arrayList.add("rewards_data=" + rewardsData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetRewardsResponse{", "}", 0, null, null, 56);
    }
}
