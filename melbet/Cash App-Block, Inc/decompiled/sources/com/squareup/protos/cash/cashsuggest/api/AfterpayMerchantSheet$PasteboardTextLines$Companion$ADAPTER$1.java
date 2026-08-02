package com.squareup.protos.cash.cashsuggest.api;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AfterpayMerchantSheet$PasteboardTextLines$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AfterpayMerchantSheet.PasteboardTextLines(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AfterpayMerchantSheet.PasteboardTextLines pasteboardTextLines = (AfterpayMerchantSheet.PasteboardTextLines) obj;
        reverseProtoWriter.getClass();
        pasteboardTextLines.getClass();
        reverseProtoWriter.writeBytes(pasteboardTextLines.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, pasteboardTextLines.pasteboard_text_lines);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AfterpayMerchantSheet.PasteboardTextLines pasteboardTextLines = (AfterpayMerchantSheet.PasteboardTextLines) obj;
        pasteboardTextLines.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pasteboardTextLines.pasteboard_text_lines) + pasteboardTextLines.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AfterpayMerchantSheet.PasteboardTextLines pasteboardTextLines = (AfterpayMerchantSheet.PasteboardTextLines) obj;
        pasteboardTextLines.getClass();
        ByteString byteString = ByteString.EMPTY;
        List list = pasteboardTextLines.pasteboard_text_lines;
        list.getClass();
        byteString.getClass();
        return new AfterpayMerchantSheet.PasteboardTextLines(list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AfterpayMerchantSheet.PasteboardTextLines pasteboardTextLines = (AfterpayMerchantSheet.PasteboardTextLines) obj;
        pasteboardTextLines.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pasteboardTextLines.pasteboard_text_lines);
        protoWriter.writeBytes(pasteboardTextLines.unknownFields());
    }
}
