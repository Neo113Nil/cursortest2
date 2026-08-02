package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.CashDrawerData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashDrawerData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashDrawerData((CashDrawerData.CardControls) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(CashDrawerData.CardControls.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashDrawerData cashDrawerData = (CashDrawerData) obj;
        reverseProtoWriter.getClass();
        cashDrawerData.getClass();
        reverseProtoWriter.writeBytes(cashDrawerData.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, cashDrawerData.skip_null_state);
        CashDrawerData.CardControls.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashDrawerData.card_controls);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashDrawerData cashDrawerData = (CashDrawerData) obj;
        cashDrawerData.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, cashDrawerData.skip_null_state) + CashDrawerData.CardControls.ADAPTER.encodedSizeWithTag(3, cashDrawerData.card_controls) + cashDrawerData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashDrawerData cashDrawerData = (CashDrawerData) obj;
        cashDrawerData.getClass();
        CashDrawerData.CardControls cardControls = cashDrawerData.card_controls;
        CashDrawerData.CardControls cardControls2 = cardControls != null ? (CashDrawerData.CardControls) CashDrawerData.CardControls.ADAPTER.redact(cardControls) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cashDrawerData.skip_null_state;
        byteString.getClass();
        return new CashDrawerData(cardControls2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashDrawerData cashDrawerData = (CashDrawerData) obj;
        cashDrawerData.getClass();
        CashDrawerData.CardControls.ADAPTER.encodeWithTag(protoWriter, 3, cashDrawerData.card_controls);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, cashDrawerData.skip_null_state);
        protoWriter.writeBytes(cashDrawerData.unknownFields());
    }
}
