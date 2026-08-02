package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ConfirmationSheetData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ConfirmationSheetData((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ConfirmationSheetData confirmationSheetData = (ConfirmationSheetData) obj;
        reverseProtoWriter.getClass();
        confirmationSheetData.getClass();
        reverseProtoWriter.writeBytes(confirmationSheetData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, confirmationSheetData.version_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, confirmationSheetData.subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, confirmationSheetData.cancel_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, confirmationSheetData.confirm_button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, confirmationSheetData.main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ConfirmationSheetData confirmationSheetData = (ConfirmationSheetData) obj;
        confirmationSheetData.getClass();
        int size$okio = confirmationSheetData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, confirmationSheetData.version_code) + protoAdapter.encodedSizeWithTag(4, confirmationSheetData.subtext) + protoAdapter.encodedSizeWithTag(3, confirmationSheetData.cancel_button_text) + protoAdapter.encodedSizeWithTag(2, confirmationSheetData.confirm_button_text) + protoAdapter.encodedSizeWithTag(1, confirmationSheetData.main_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ConfirmationSheetData confirmationSheetData = (ConfirmationSheetData) obj;
        confirmationSheetData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = confirmationSheetData.main_text;
        String str2 = confirmationSheetData.confirm_button_text;
        String str3 = confirmationSheetData.cancel_button_text;
        String str4 = confirmationSheetData.subtext;
        String str5 = confirmationSheetData.version_code;
        byteString.getClass();
        return new ConfirmationSheetData(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ConfirmationSheetData confirmationSheetData = (ConfirmationSheetData) obj;
        confirmationSheetData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, confirmationSheetData.main_text);
        protoAdapter.encodeWithTag(protoWriter, 2, confirmationSheetData.confirm_button_text);
        protoAdapter.encodeWithTag(protoWriter, 3, confirmationSheetData.cancel_button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, confirmationSheetData.subtext);
        protoAdapter.encodeWithTag(protoWriter, 5, confirmationSheetData.version_code);
        protoWriter.writeBytes(confirmationSheetData.unknownFields());
    }
}
