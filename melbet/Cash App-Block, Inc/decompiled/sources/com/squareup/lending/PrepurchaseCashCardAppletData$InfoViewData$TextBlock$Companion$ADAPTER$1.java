package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$InfoViewData$TextBlock$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.InfoViewData.TextBlock((LocalizedString) obj, (LocalizedString) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock textBlock = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock) obj;
        reverseProtoWriter.getClass();
        textBlock.getClass();
        reverseProtoWriter.writeBytes(textBlock.unknownFields());
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, textBlock.rows);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, textBlock.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, textBlock.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock textBlock = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock) obj;
        textBlock.getClass();
        int size$okio = textBlock.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row.ADAPTER.asRepeated().encodedSizeWithTag(3, textBlock.rows) + protoAdapter.encodedSizeWithTag(2, textBlock.body) + protoAdapter.encodedSizeWithTag(1, textBlock.header) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock textBlock = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock) obj;
        textBlock.getClass();
        LocalizedString localizedString = textBlock.header;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = textBlock.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(textBlock.rows, PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.InfoViewData.TextBlock(localizedString2, localizedString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock textBlock = (PrepurchaseCashCardAppletData.InfoViewData.TextBlock) obj;
        textBlock.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, textBlock.header);
        protoAdapter.encodeWithTag(protoWriter, 2, textBlock.body);
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, textBlock.rows);
        protoWriter.writeBytes(textBlock.unknownFields());
    }
}
