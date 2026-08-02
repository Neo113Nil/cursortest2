package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionControlsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPromotionControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPromotionControlsResponse> CREATOR;
    public final PromotionControls controls;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public PromotionControls controls;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GetPromotionControlsResponse(this.controls, buildUnknownFields());
                default:
                    return new SetPromotionControlsResponse(this.controls, buildUnknownFields());
            }
        }
    }

    static {
        GetPromotionControlsResponse$Companion$ADAPTER$1 getPromotionControlsResponse$Companion$ADAPTER$1 = new GetPromotionControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPromotionControlsResponse.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.GetPromotionControlsResponse", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/GetPromotionControlsAPI.proto");
        ADAPTER = getPromotionControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPromotionControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPromotionControlsResponse(PromotionControls promotionControls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.controls = promotionControls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPromotionControlsResponse)) {
            return false;
        }
        GetPromotionControlsResponse getPromotionControlsResponse = (GetPromotionControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPromotionControlsResponse.unknownFields()) && Intrinsics.areEqual(this.controls, getPromotionControlsResponse.controls);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PromotionControls promotionControls = this.controls;
        int hashCode2 = hashCode + (promotionControls != null ? promotionControls.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.controls = this.controls;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PromotionControls promotionControls = this.controls;
        if (promotionControls != null) {
            arrayList.add("controls=" + promotionControls);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPromotionControlsResponse{", "}", 0, null, null, 56);
    }
}
