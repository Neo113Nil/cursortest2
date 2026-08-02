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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/messagingplatformcommon/app/GetAppMessagesV2Response;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetAppMessagesV2Response extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetAppMessagesV2Response> CREATOR;
    public final List messages;

    static {
        GetAppMessagesV2Response$Companion$ADAPTER$1 getAppMessagesV2Response$Companion$ADAPTER$1 = new GetAppMessagesV2Response$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetAppMessagesV2Response.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.GetAppMessagesV2Response", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppServiceProto.proto");
        ADAPTER = getAppMessagesV2Response$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getAppMessagesV2Response$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAppMessagesV2Response(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.messages = TransactorKt.immutableCopyOf("messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppMessagesV2Response)) {
            return false;
        }
        GetAppMessagesV2Response getAppMessagesV2Response = (GetAppMessagesV2Response) obj;
        return Intrinsics.areEqual(unknownFields(), getAppMessagesV2Response.unknownFields()) && Intrinsics.areEqual(this.messages, getAppMessagesV2Response.messages);
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
        MoneyTab.Builder builder = new MoneyTab.Builder(20, false);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAppMessagesV2Response{", "}", 0, null, null, 56);
    }
}
