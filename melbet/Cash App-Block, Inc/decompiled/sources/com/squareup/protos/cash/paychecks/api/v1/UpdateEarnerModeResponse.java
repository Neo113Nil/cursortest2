package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.franklin.common.ResponseContext;
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
import squareup.cash.earnings.EarnerModeStatus;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/paychecks/api/v1/UpdateEarnerModeResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/postcard/CardModule$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateEarnerModeResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateEarnerModeResponse> CREATOR;
    public final ResponseContext response_context;
    public final EarnerModeStatus status;

    static {
        UpdateEarnerModeResponse$Companion$ADAPTER$1 updateEarnerModeResponse$Companion$ADAPTER$1 = new UpdateEarnerModeResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateEarnerModeResponse.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.UpdateEarnerModeResponse", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/paychecks_app_service.proto");
        ADAPTER = updateEarnerModeResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateEarnerModeResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateEarnerModeResponse(EarnerModeStatus earnerModeStatus, ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = earnerModeStatus;
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateEarnerModeResponse)) {
            return false;
        }
        UpdateEarnerModeResponse updateEarnerModeResponse = (UpdateEarnerModeResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateEarnerModeResponse.unknownFields()) && Intrinsics.areEqual(this.status, updateEarnerModeResponse.status) && Intrinsics.areEqual(this.response_context, updateEarnerModeResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarnerModeStatus earnerModeStatus = this.status;
        int hashCode2 = (hashCode + (earnerModeStatus != null ? earnerModeStatus.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode3 = hashCode2 + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(13);
        builder.f1329type = this.status;
        builder.use_case = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarnerModeStatus earnerModeStatus = this.status;
        if (earnerModeStatus != null) {
            arrayList.add("status=" + earnerModeStatus);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateEarnerModeResponse{", "}", 0, null, null, 56);
    }
}
