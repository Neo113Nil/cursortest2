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
public final class PrepurchaseCashCardAppletData$InfoViewData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.InfoViewData((LocalizedString) obj, (LocalizedString) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(PrepurchaseCashCardAppletData.InfoViewData.TextBlock.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData infoViewData = (PrepurchaseCashCardAppletData.InfoViewData) obj;
        reverseProtoWriter.getClass();
        infoViewData.getClass();
        reverseProtoWriter.writeBytes(infoViewData.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, infoViewData.primary_footer_button_text);
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, infoViewData.text_blocks);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, infoViewData.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData infoViewData = (PrepurchaseCashCardAppletData.InfoViewData) obj;
        infoViewData.getClass();
        int size$okio = infoViewData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, infoViewData.primary_footer_button_text) + PrepurchaseCashCardAppletData.InfoViewData.TextBlock.ADAPTER.asRepeated().encodedSizeWithTag(2, infoViewData.text_blocks) + protoAdapter.encodedSizeWithTag(1, infoViewData.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData infoViewData = (PrepurchaseCashCardAppletData.InfoViewData) obj;
        infoViewData.getClass();
        LocalizedString localizedString = infoViewData.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(infoViewData.text_blocks, PrepurchaseCashCardAppletData.InfoViewData.TextBlock.ADAPTER);
        LocalizedString localizedString3 = infoViewData.primary_footer_button_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.InfoViewData(localizedString2, localizedString4, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.InfoViewData infoViewData = (PrepurchaseCashCardAppletData.InfoViewData) obj;
        infoViewData.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, infoViewData.title);
        PrepurchaseCashCardAppletData.InfoViewData.TextBlock.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, infoViewData.text_blocks);
        protoAdapter.encodeWithTag(protoWriter, 3, infoViewData.primary_footer_button_text);
        protoWriter.writeBytes(infoViewData.unknownFields());
    }
}
