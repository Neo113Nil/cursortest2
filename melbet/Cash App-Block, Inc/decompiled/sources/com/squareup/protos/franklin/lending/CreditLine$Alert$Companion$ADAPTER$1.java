package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreditLine$Alert$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CreditLine.Alert((String) obj, (String) obj2, (String) obj3, (CreditLine.Alert.DisplayTime) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = CreditLine.Alert.DisplayTime.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLine.Alert alert = (CreditLine.Alert) obj;
        reverseProtoWriter.getClass();
        alert.getClass();
        reverseProtoWriter.writeBytes(alert.unknownFields());
        CreditLine.Alert.DisplayTime.ADAPTER.encodeWithTag(reverseProtoWriter, 4, alert.displayTime);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, alert.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, alert.dismiss_button_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, alert.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLine.Alert alert = (CreditLine.Alert) obj;
        alert.getClass();
        int size$okio = alert.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CreditLine.Alert.DisplayTime.ADAPTER.encodedSizeWithTag(4, alert.displayTime) + protoAdapter.encodedSizeWithTag(3, alert.title) + protoAdapter.encodedSizeWithTag(2, alert.dismiss_button_title) + protoAdapter.encodedSizeWithTag(1, alert.message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLine.Alert alert = (CreditLine.Alert) obj;
        alert.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = alert.message;
        String str2 = alert.dismiss_button_title;
        String str3 = alert.title;
        CreditLine.Alert.DisplayTime displayTime = alert.displayTime;
        byteString.getClass();
        return new CreditLine.Alert(str, str2, str3, displayTime, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLine.Alert alert = (CreditLine.Alert) obj;
        alert.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, alert.message);
        protoAdapter.encodeWithTag(protoWriter, 2, alert.dismiss_button_title);
        protoAdapter.encodeWithTag(protoWriter, 3, alert.title);
        CreditLine.Alert.DisplayTime.ADAPTER.encodeWithTag(protoWriter, 4, alert.displayTime);
        protoWriter.writeBytes(alert.unknownFields());
    }
}
