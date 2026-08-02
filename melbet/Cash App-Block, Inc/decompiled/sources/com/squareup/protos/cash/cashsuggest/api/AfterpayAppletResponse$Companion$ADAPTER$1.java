package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AfterpayAppletResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayAppletResponse((Long) obj, (CreditLineSnapshot) obj2, (AfterpayAppletEntrypoint) obj3, (AfterpayAppletHome) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(CreditLineSnapshot.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(AfterpayAppletEntrypoint.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(AfterpayAppletHome.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) obj;
        reverseProtoWriter.getClass();
        afterpayAppletResponse.getClass();
        reverseProtoWriter.writeBytes(afterpayAppletResponse.unknownFields());
        AfterpayAppletHome.ADAPTER.encodeWithTag(reverseProtoWriter, 4, afterpayAppletResponse.home);
        AfterpayAppletEntrypoint.ADAPTER.encodeWithTag(reverseProtoWriter, 3, afterpayAppletResponse.entrypoint);
        CreditLineSnapshot.ADAPTER.encodeWithTag(reverseProtoWriter, 2, afterpayAppletResponse.credit_line_snapshot);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, afterpayAppletResponse.expired_at_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) obj;
        afterpayAppletResponse.getClass();
        return AfterpayAppletHome.ADAPTER.encodedSizeWithTag(4, afterpayAppletResponse.home) + AfterpayAppletEntrypoint.ADAPTER.encodedSizeWithTag(3, afterpayAppletResponse.entrypoint) + CreditLineSnapshot.ADAPTER.encodedSizeWithTag(2, afterpayAppletResponse.credit_line_snapshot) + ProtoAdapter.INT64.encodedSizeWithTag(1, afterpayAppletResponse.expired_at_ms) + afterpayAppletResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) obj;
        afterpayAppletResponse.getClass();
        CreditLineSnapshot creditLineSnapshot = afterpayAppletResponse.credit_line_snapshot;
        CreditLineSnapshot creditLineSnapshot2 = creditLineSnapshot != null ? (CreditLineSnapshot) CreditLineSnapshot.ADAPTER.redact(creditLineSnapshot) : null;
        AfterpayAppletEntrypoint afterpayAppletEntrypoint = afterpayAppletResponse.entrypoint;
        AfterpayAppletEntrypoint afterpayAppletEntrypoint2 = afterpayAppletEntrypoint != null ? (AfterpayAppletEntrypoint) AfterpayAppletEntrypoint.ADAPTER.redact(afterpayAppletEntrypoint) : null;
        AfterpayAppletHome afterpayAppletHome = afterpayAppletResponse.home;
        return AfterpayAppletResponse.copy$default(afterpayAppletResponse, creditLineSnapshot2, afterpayAppletEntrypoint2, afterpayAppletHome != null ? (AfterpayAppletHome) AfterpayAppletHome.ADAPTER.redact(afterpayAppletHome) : null, ByteString.EMPTY, 1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayAppletResponse afterpayAppletResponse = (AfterpayAppletResponse) obj;
        afterpayAppletResponse.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, afterpayAppletResponse.expired_at_ms);
        CreditLineSnapshot.ADAPTER.encodeWithTag(protoWriter, 2, afterpayAppletResponse.credit_line_snapshot);
        AfterpayAppletEntrypoint.ADAPTER.encodeWithTag(protoWriter, 3, afterpayAppletResponse.entrypoint);
        AfterpayAppletHome.ADAPTER.encodeWithTag(protoWriter, 4, afterpayAppletResponse.home);
        protoWriter.writeBytes(afterpayAppletResponse.unknownFields());
    }
}
