package com.squareup.protos.client.timecards;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/client/timecards/UpdateTimecardNotesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/GetProfileRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UpdateTimecardNotesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateTimecardNotesResponse> CREATOR;

    static {
        UpdateTimecardNotesResponse$Companion$ADAPTER$1 updateTimecardNotesResponse$Companion$ADAPTER$1 = new UpdateTimecardNotesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateTimecardNotesResponse.class), "type.googleapis.com/squareup.client.timecards.UpdateTimecardNotesResponse", Syntax.PROTO_2, null, "squareup/client/timecards/service.proto");
        ADAPTER = updateTimecardNotesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateTimecardNotesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTimecardNotesResponse(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UpdateTimecardNotesResponse) && Intrinsics.areEqual(unknownFields(), ((UpdateTimecardNotesResponse) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetProfileRequest.Builder builder = new GetProfileRequest.Builder(18);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "UpdateTimecardNotesResponse{}";
    }
}
