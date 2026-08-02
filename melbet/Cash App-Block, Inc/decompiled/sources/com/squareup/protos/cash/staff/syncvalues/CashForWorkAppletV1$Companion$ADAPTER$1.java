package com.squareup.protos.cash.staff.syncvalues;

import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashForWorkAppletV1$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashForWorkAppletV1((CashForWorkAppletV1.Visibility) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CashForWorkAppletV1.Visibility.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashForWorkAppletV1 cashForWorkAppletV1 = (CashForWorkAppletV1) obj;
        reverseProtoWriter.getClass();
        cashForWorkAppletV1.getClass();
        reverseProtoWriter.writeBytes(cashForWorkAppletV1.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, cashForWorkAppletV1.shows_banner);
        CashForWorkAppletV1.Visibility.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashForWorkAppletV1.visibility);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashForWorkAppletV1 cashForWorkAppletV1 = (CashForWorkAppletV1) obj;
        cashForWorkAppletV1.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, cashForWorkAppletV1.shows_banner) + CashForWorkAppletV1.Visibility.ADAPTER.encodedSizeWithTag(1, cashForWorkAppletV1.visibility) + cashForWorkAppletV1.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashForWorkAppletV1 cashForWorkAppletV1 = (CashForWorkAppletV1) obj;
        cashForWorkAppletV1.getClass();
        ByteString byteString = ByteString.EMPTY;
        CashForWorkAppletV1.Visibility visibility = cashForWorkAppletV1.visibility;
        Boolean bool = cashForWorkAppletV1.shows_banner;
        byteString.getClass();
        return new CashForWorkAppletV1(visibility, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashForWorkAppletV1 cashForWorkAppletV1 = (CashForWorkAppletV1) obj;
        cashForWorkAppletV1.getClass();
        CashForWorkAppletV1.Visibility.ADAPTER.encodeWithTag(protoWriter, 1, cashForWorkAppletV1.visibility);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, cashForWorkAppletV1.shows_banner);
        protoWriter.writeBytes(cashForWorkAppletV1.unknownFields());
    }
}
