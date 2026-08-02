package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse$TextLineItemSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RetroOrderSelectionResponse.TextLineItemSection(m, (RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalizedString.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj = RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RetroOrderSelectionResponse.TextLineItemSection textLineItemSection = (RetroOrderSelectionResponse.TextLineItemSection) obj;
        reverseProtoWriter.getClass();
        textLineItemSection.getClass();
        reverseProtoWriter.writeBytes(textLineItemSection.unknownFields());
        RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, textLineItemSection.display_style);
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, textLineItemSection.line_items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RetroOrderSelectionResponse.TextLineItemSection textLineItemSection = (RetroOrderSelectionResponse.TextLineItemSection) obj;
        textLineItemSection.getClass();
        return RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.ADAPTER.encodedSizeWithTag(2, textLineItemSection.display_style) + LocalizedString.ADAPTER.asRepeated().encodedSizeWithTag(1, textLineItemSection.line_items) + textLineItemSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RetroOrderSelectionResponse.TextLineItemSection textLineItemSection = (RetroOrderSelectionResponse.TextLineItemSection) obj;
        textLineItemSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(textLineItemSection.line_items, LocalizedString.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle displayStyle = textLineItemSection.display_style;
        byteString.getClass();
        return new RetroOrderSelectionResponse.TextLineItemSection(m1169redactElements, displayStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RetroOrderSelectionResponse.TextLineItemSection textLineItemSection = (RetroOrderSelectionResponse.TextLineItemSection) obj;
        textLineItemSection.getClass();
        LocalizedString.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, textLineItemSection.line_items);
        RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.ADAPTER.encodeWithTag(protoWriter, 2, textLineItemSection.display_style);
        protoWriter.writeBytes(textLineItemSection.unknownFields());
    }
}
