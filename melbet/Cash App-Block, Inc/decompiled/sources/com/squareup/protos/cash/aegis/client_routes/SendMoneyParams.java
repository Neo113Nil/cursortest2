package com.squareup.protos.cash.aegis.client_routes;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SendMoneyParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendMoneyParams> CREATOR;
    public final String exit_route;

    static {
        SendMoneyParams$Companion$ADAPTER$1 sendMoneyParams$Companion$ADAPTER$1 = new SendMoneyParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SendMoneyParams.class), "type.googleapis.com/squareup.cash.aegis.client_routes.SendMoneyParams", Syntax.PROTO_2, null, "squareup/cash/aegis/client_routes/parameters.proto");
        ADAPTER = sendMoneyParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sendMoneyParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMoneyParams(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.exit_route = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendMoneyParams)) {
            return false;
        }
        SendMoneyParams sendMoneyParams = (SendMoneyParams) obj;
        return Intrinsics.areEqual(unknownFields(), sendMoneyParams.unknownFields()) && Intrinsics.areEqual(this.exit_route, sendMoneyParams.exit_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.exit_route;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(15);
        builder.display_name = this.exit_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.exit_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "exit_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendMoneyParams{", "}", 0, null, null, 56);
    }
}
