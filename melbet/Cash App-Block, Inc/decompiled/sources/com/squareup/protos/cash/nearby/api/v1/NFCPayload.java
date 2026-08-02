package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.Instrument;
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
public final class NFCPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NFCPayload> CREATOR;
    public final String payload_data;

    static {
        NFCPayload$Companion$ADAPTER$1 nFCPayload$Companion$ADAPTER$1 = new NFCPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NFCPayload.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.NFCPayload", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/connection_data.proto");
        ADAPTER = nFCPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(nFCPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NFCPayload(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payload_data = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NFCPayload)) {
            return false;
        }
        NFCPayload nFCPayload = (NFCPayload) obj;
        return Intrinsics.areEqual(unknownFields(), nFCPayload.unknownFields()) && Intrinsics.areEqual(this.payload_data, nFCPayload.payload_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payload_data;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Instrument.Builder builder = new Instrument.Builder(20);
        builder.token = this.payload_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payload_data;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payload_data=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NFCPayload{", "}", 0, null, null, 56);
    }
}
