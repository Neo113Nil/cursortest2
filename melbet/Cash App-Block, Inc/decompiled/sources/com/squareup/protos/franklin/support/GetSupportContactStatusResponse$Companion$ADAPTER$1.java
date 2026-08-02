package com.squareup.protos.franklin.support;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSupportContactStatusResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSupportContactStatusResponse((Boolean) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 5) {
                switch (nextTag) {
                    case 9:
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 10:
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 11:
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                m.add(ContactOption.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSupportContactStatusResponse getSupportContactStatusResponse = (GetSupportContactStatusResponse) obj;
        reverseProtoWriter.getClass();
        getSupportContactStatusResponse.getClass();
        reverseProtoWriter.writeBytes(getSupportContactStatusResponse.unknownFields());
        ContactOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, getSupportContactStatusResponse.contact_options);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, getSupportContactStatusResponse.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, getSupportContactStatusResponse.title);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 11, getSupportContactStatusResponse.chat_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSupportContactStatusResponse getSupportContactStatusResponse = (GetSupportContactStatusResponse) obj;
        getSupportContactStatusResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(11, getSupportContactStatusResponse.chat_enabled) + getSupportContactStatusResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ContactOption.ADAPTER.asRepeated().encodedSizeWithTag(5, getSupportContactStatusResponse.contact_options) + protoAdapter.encodedSizeWithTag(10, getSupportContactStatusResponse.text) + protoAdapter.encodedSizeWithTag(9, getSupportContactStatusResponse.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSupportContactStatusResponse getSupportContactStatusResponse = (GetSupportContactStatusResponse) obj;
        getSupportContactStatusResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getSupportContactStatusResponse.contact_options, ContactOption.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = getSupportContactStatusResponse.chat_enabled;
        String str = getSupportContactStatusResponse.title;
        String str2 = getSupportContactStatusResponse.text;
        byteString.getClass();
        return new GetSupportContactStatusResponse(bool, str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSupportContactStatusResponse getSupportContactStatusResponse = (GetSupportContactStatusResponse) obj;
        getSupportContactStatusResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, getSupportContactStatusResponse.chat_enabled);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 9, getSupportContactStatusResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 10, getSupportContactStatusResponse.text);
        ContactOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, getSupportContactStatusResponse.contact_options);
        protoWriter.writeBytes(getSupportContactStatusResponse.unknownFields());
    }
}
