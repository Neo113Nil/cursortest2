package com.squareup.protos.cash.nearby.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.local.client.v1.InputValue;
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
public final class ConnectionData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ConnectionData> CREATOR;
    public final BLEPayload ble_payload;
    public final NFCPayload nfc_payload;

    static {
        ConnectionData$Companion$ADAPTER$1 connectionData$Companion$ADAPTER$1 = new ConnectionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConnectionData.class), "type.googleapis.com/squareup.cash.nearby.api.v1beta1.ConnectionData", Syntax.PROTO_2, null, "squareup/cash/nearby/api/v1beta1/connection_data.proto");
        ADAPTER = connectionData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(connectionData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionData(BLEPayload bLEPayload, NFCPayload nFCPayload, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.ble_payload = bLEPayload;
        this.nfc_payload = nFCPayload;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionData)) {
            return false;
        }
        ConnectionData connectionData = (ConnectionData) obj;
        return Intrinsics.areEqual(unknownFields(), connectionData.unknownFields()) && Intrinsics.areEqual(this.ble_payload, connectionData.ble_payload) && Intrinsics.areEqual(this.nfc_payload, connectionData.nfc_payload);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BLEPayload bLEPayload = this.ble_payload;
        int hashCode2 = (hashCode + (bLEPayload != null ? bLEPayload.hashCode() : 0)) * 37;
        NFCPayload nFCPayload = this.nfc_payload;
        int hashCode3 = hashCode2 + (nFCPayload != null ? nFCPayload.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(27);
        builder.input_id = this.ble_payload;
        builder.value = this.nfc_payload;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BLEPayload bLEPayload = this.ble_payload;
        if (bLEPayload != null) {
            arrayList.add("ble_payload=" + bLEPayload);
        }
        NFCPayload nFCPayload = this.nfc_payload;
        if (nFCPayload != null) {
            arrayList.add("nfc_payload=" + nFCPayload);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConnectionData{", "}", 0, null, null, 56);
    }
}
