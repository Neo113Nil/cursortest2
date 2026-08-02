package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionControlsResponse;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/referly/api/incentives/client/SetPromotionControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionControlsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetPromotionControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPromotionControlsResponse> CREATOR;
    public final PromotionControls controls;

    static {
        SetPromotionControlsResponse$Companion$ADAPTER$1 setPromotionControlsResponse$Companion$ADAPTER$1 = new SetPromotionControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetPromotionControlsResponse.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.SetPromotionControlsResponse", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/SetPromotionControlsAPI.proto");
        ADAPTER = setPromotionControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setPromotionControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPromotionControlsResponse(PromotionControls promotionControls, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.controls = promotionControls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPromotionControlsResponse)) {
            return false;
        }
        SetPromotionControlsResponse setPromotionControlsResponse = (SetPromotionControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setPromotionControlsResponse.unknownFields()) && Intrinsics.areEqual(this.controls, setPromotionControlsResponse.controls);
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
        GetPromotionControlsResponse.Builder builder = new GetPromotionControlsResponse.Builder(1);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPromotionControlsResponse{", "}", 0, null, null, 56);
    }
}
