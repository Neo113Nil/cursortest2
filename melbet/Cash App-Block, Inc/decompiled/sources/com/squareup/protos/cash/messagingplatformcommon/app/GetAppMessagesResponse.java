package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.money.content.MoneyTab;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAppMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppMessagesResponse> CREATOR;
    public final List messages;

    static {
        GetAppMessagesResponse$Companion$ADAPTER$1 getAppMessagesResponse$Companion$ADAPTER$1 = new GetAppMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAppMessagesResponse.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.GetAppMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppServiceProto.proto");
        ADAPTER = getAppMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAppMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppMessagesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.messages = TransactorKt.immutableCopyOf("messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppMessagesResponse)) {
            return false;
        }
        GetAppMessagesResponse getAppMessagesResponse = (GetAppMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getAppMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.messages, getAppMessagesResponse.messages);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.messages.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(19, false);
        builder.applets = this.messages;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.messages;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("messages=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppMessagesResponse{", "}", 0, null, null, 56);
    }
}
