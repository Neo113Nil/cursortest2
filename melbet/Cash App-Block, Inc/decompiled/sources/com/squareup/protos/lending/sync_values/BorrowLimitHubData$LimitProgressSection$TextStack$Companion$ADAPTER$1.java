package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowLimitHubData$LimitProgressSection$TextStack$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BorrowLimitHubData.LimitProgressSection.TextStack((LocalizedString) obj, (LocalizedString) obj2, (Color) obj3, (Color) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            } else if (nextTag == 5) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowLimitHubData.LimitProgressSection.TextStack textStack = (BorrowLimitHubData.LimitProgressSection.TextStack) obj;
        reverseProtoWriter.getClass();
        textStack.getClass();
        reverseProtoWriter.writeBytes(textStack.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, textStack.value_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, textStack.label_color);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, textStack.value_text);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, textStack.label_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BorrowLimitHubData.LimitProgressSection.TextStack textStack = (BorrowLimitHubData.LimitProgressSection.TextStack) obj;
        textStack.getClass();
        int size$okio = textStack.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(6, textStack.value_text) + protoAdapter.encodedSizeWithTag(5, textStack.label_text) + size$okio;
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, textStack.value_color) + protoAdapter2.encodedSizeWithTag(3, textStack.label_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowLimitHubData.LimitProgressSection.TextStack textStack = (BorrowLimitHubData.LimitProgressSection.TextStack) obj;
        textStack.getClass();
        LocalizedString localizedString = textStack.label_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = textStack.value_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Color color = textStack.label_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = textStack.value_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BorrowLimitHubData.LimitProgressSection.TextStack(localizedString2, localizedString4, color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowLimitHubData.LimitProgressSection.TextStack textStack = (BorrowLimitHubData.LimitProgressSection.TextStack) obj;
        textStack.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, textStack.label_text);
        protoAdapter.encodeWithTag(protoWriter, 6, textStack.value_text);
        ProtoAdapter protoAdapter2 = Color.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, textStack.label_color);
        protoAdapter2.encodeWithTag(protoWriter, 4, textStack.value_color);
        protoWriter.writeBytes(textStack.unknownFields());
    }
}
