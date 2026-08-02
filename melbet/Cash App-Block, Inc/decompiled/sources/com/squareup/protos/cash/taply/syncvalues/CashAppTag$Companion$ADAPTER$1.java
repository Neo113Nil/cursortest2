package com.squareup.protos.cash.taply.syncvalues;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.syncvalues.CashAppTag;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashAppTag$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppTag((Boolean) obj, (Boolean) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(CashAppTag.Tag.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppTag cashAppTag = (CashAppTag) obj;
        reverseProtoWriter.getClass();
        cashAppTag.getClass();
        reverseProtoWriter.writeBytes(cashAppTag.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppTag.show_tag_support);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppTag.show_tag_activation);
        CashAppTag.Tag.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cashAppTag.tags);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppTag cashAppTag = (CashAppTag) obj;
        cashAppTag.getClass();
        int encodedSizeWithTag = CashAppTag.Tag.ADAPTER.asRepeated().encodedSizeWithTag(1, cashAppTag.tags) + cashAppTag.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(3, cashAppTag.show_tag_support) + protoAdapter.encodedSizeWithTag(2, cashAppTag.show_tag_activation) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppTag cashAppTag = (CashAppTag) obj;
        cashAppTag.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppTag.tags, CashAppTag.Tag.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = cashAppTag.show_tag_activation;
        Boolean bool2 = cashAppTag.show_tag_support;
        byteString.getClass();
        return new CashAppTag(bool, bool2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppTag cashAppTag = (CashAppTag) obj;
        cashAppTag.getClass();
        CashAppTag.Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cashAppTag.tags);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppTag.show_tag_activation);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppTag.show_tag_support);
        protoWriter.writeBytes(cashAppTag.unknownFields());
    }
}
