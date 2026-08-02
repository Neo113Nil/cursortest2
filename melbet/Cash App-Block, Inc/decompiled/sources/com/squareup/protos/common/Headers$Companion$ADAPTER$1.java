package com.squareup.protos.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Headers$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Headers(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Header.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Headers headers = (Headers) obj;
        reverseProtoWriter.getClass();
        headers.getClass();
        reverseProtoWriter.writeBytes(headers.unknownFields());
        Header.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, headers.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Headers headers = (Headers) obj;
        headers.getClass();
        return Header.ADAPTER.asRepeated().encodedSizeWithTag(1, headers.header) + headers.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Headers headers = (Headers) obj;
        headers.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(headers.header, Header.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Headers(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Headers headers = (Headers) obj;
        headers.getClass();
        Header.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, headers.header);
        protoWriter.writeBytes(headers.unknownFields());
    }
}
