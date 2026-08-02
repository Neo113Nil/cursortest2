package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SheetStyledDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SheetStyledDetails((StyledText) obj, (StyledText) obj2, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SheetStyledDetails sheetStyledDetails = (SheetStyledDetails) obj;
        reverseProtoWriter.getClass();
        sheetStyledDetails.getClass();
        reverseProtoWriter.writeBytes(sheetStyledDetails.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 3, sheetStyledDetails.background_color);
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sheetStyledDetails.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, sheetStyledDetails.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SheetStyledDetails sheetStyledDetails = (SheetStyledDetails) obj;
        sheetStyledDetails.getClass();
        int size$okio = sheetStyledDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(3, sheetStyledDetails.background_color) + protoAdapter.encodedSizeWithTag(2, sheetStyledDetails.subtitle) + protoAdapter.encodedSizeWithTag(1, sheetStyledDetails.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SheetStyledDetails sheetStyledDetails = (SheetStyledDetails) obj;
        sheetStyledDetails.getClass();
        StyledText styledText = sheetStyledDetails.title;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = sheetStyledDetails.subtitle;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        Color color = sheetStyledDetails.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SheetStyledDetails(styledText2, styledText4, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SheetStyledDetails sheetStyledDetails = (SheetStyledDetails) obj;
        sheetStyledDetails.getClass();
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, sheetStyledDetails.title);
        protoAdapter.encodeWithTag(protoWriter, 2, sheetStyledDetails.subtitle);
        Color.ADAPTER.encodeWithTag(protoWriter, 3, sheetStyledDetails.background_color);
        protoWriter.writeBytes(sheetStyledDetails.unknownFields());
    }
}
