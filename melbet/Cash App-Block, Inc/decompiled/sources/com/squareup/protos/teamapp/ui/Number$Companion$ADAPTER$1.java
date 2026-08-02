package com.squareup.protos.teamapp.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.teamapp.ui.Number;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Number$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = Number.Format.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Double d = (Double) obj;
        if (d != null) {
            return new Number(d.doubleValue(), (Number.Format) obj2, (Integer) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "amount");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Number number = (Number) obj;
        reverseProtoWriter.getClass();
        number.getClass();
        reverseProtoWriter.writeBytes(number.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, number.max_fractional_digits);
        Number.Format.ADAPTER.encodeWithTag(reverseProtoWriter, 2, number.f1413format);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 1, Double.valueOf(number.amount));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Number number = (Number) obj;
        number.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(3, number.max_fractional_digits) + Number.Format.ADAPTER.encodedSizeWithTag(2, number.f1413format) + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(number.amount)) + number.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Number number = (Number) obj;
        number.getClass();
        ByteString byteString = ByteString.EMPTY;
        double d = number.amount;
        Number.Format format2 = number.f1413format;
        Integer num = number.max_fractional_digits;
        byteString.getClass();
        return new Number(d, format2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Number number = (Number) obj;
        number.getClass();
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, Double.valueOf(number.amount));
        Number.Format.ADAPTER.encodeWithTag(protoWriter, 2, number.f1413format);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, number.max_fractional_digits);
        protoWriter.writeBytes(number.unknownFields());
    }
}
