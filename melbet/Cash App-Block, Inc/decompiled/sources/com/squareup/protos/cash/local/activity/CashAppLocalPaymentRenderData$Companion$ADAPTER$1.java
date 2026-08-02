package com.squareup.protos.cash.local.activity;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.activity.CashAppLocalPaymentRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppLocalPaymentRenderData((CashAppLocalPaymentRenderData.Actions) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashAppLocalPaymentRenderData.Actions.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = (CashAppLocalPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppLocalPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppLocalPaymentRenderData.unknownFields());
        CashAppLocalPaymentRenderData.Actions.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashAppLocalPaymentRenderData.actions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = (CashAppLocalPaymentRenderData) obj;
        cashAppLocalPaymentRenderData.getClass();
        return CashAppLocalPaymentRenderData.Actions.ADAPTER.encodedSizeWithTag(1, cashAppLocalPaymentRenderData.actions) + cashAppLocalPaymentRenderData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = (CashAppLocalPaymentRenderData) obj;
        cashAppLocalPaymentRenderData.getClass();
        CashAppLocalPaymentRenderData.Actions actions = cashAppLocalPaymentRenderData.actions;
        CashAppLocalPaymentRenderData.Actions actions2 = actions != null ? (CashAppLocalPaymentRenderData.Actions) CashAppLocalPaymentRenderData.Actions.ADAPTER.redact(actions) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashAppLocalPaymentRenderData(actions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalPaymentRenderData cashAppLocalPaymentRenderData = (CashAppLocalPaymentRenderData) obj;
        cashAppLocalPaymentRenderData.getClass();
        CashAppLocalPaymentRenderData.Actions.ADAPTER.encodeWithTag(protoWriter, 1, cashAppLocalPaymentRenderData.actions);
        protoWriter.writeBytes(cashAppLocalPaymentRenderData.unknownFields());
    }
}
