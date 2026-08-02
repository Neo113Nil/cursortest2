package com.squareup.protos.cash.deviceintegritly.api;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiAppLock;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/deviceintegritly/api/SendMRIContextResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiAppLock$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendMRIContextResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendMRIContextResponse> CREATOR;
    public final boolean message_received;

    static {
        SendMRIContextResponse$Companion$ADAPTER$1 sendMRIContextResponse$Companion$ADAPTER$1 = new SendMRIContextResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SendMRIContextResponse.class), "type.googleapis.com/squareup.cash.deviceintegritly.api.SendMRIContextResponse", Syntax.PROTO_2, null, "squareup/cash/deviceintegritly/api/service.proto");
        ADAPTER = sendMRIContextResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sendMRIContextResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMRIContextResponse(boolean z, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message_received = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendMRIContextResponse)) {
            return false;
        }
        SendMRIContextResponse sendMRIContextResponse = (SendMRIContextResponse) obj;
        return Intrinsics.areEqual(unknownFields(), sendMRIContextResponse.unknownFields()) && this.message_received == sendMRIContextResponse.message_received;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Boolean.hashCode(this.message_received) + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(8);
        builder.activated = Boolean.valueOf(this.message_received);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("message_received=" + this.message_received);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendMRIContextResponse{", "}", 0, null, null, 56);
    }
}
