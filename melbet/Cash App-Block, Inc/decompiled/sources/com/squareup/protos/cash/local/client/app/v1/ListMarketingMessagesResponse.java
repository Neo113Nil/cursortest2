package com.squareup.protos.cash.local.client.app.v1;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/local/client/app/v1/ListMarketingMessagesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListMarketingMessagesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListMarketingMessagesResponse> CREATOR;
    public final List marketing_messages;

    static {
        ListMarketingMessagesResponse$Companion$ADAPTER$1 listMarketingMessagesResponse$Companion$ADAPTER$1 = new ListMarketingMessagesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ListMarketingMessagesResponse.class), "type.googleapis.com/squareup.cash.local.client.app.v1.ListMarketingMessagesResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/cash_app_local_client_app_service.proto");
        ADAPTER = listMarketingMessagesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(listMarketingMessagesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMarketingMessagesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.marketing_messages = TransactorKt.immutableCopyOf("marketing_messages", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListMarketingMessagesResponse)) {
            return false;
        }
        ListMarketingMessagesResponse listMarketingMessagesResponse = (ListMarketingMessagesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), listMarketingMessagesResponse.unknownFields()) && Intrinsics.areEqual(this.marketing_messages, listMarketingMessagesResponse.marketing_messages);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.marketing_messages.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(1, false);
        builder.applets = this.marketing_messages;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.marketing_messages;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("marketing_messages=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListMarketingMessagesResponse{", "}", 0, null, null, 56);
    }
}
