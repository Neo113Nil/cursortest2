package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/SlottedCard$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/SlottedCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SlottedCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SlottedCard((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (SlotContent) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(SlotContent.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SlottedCard slottedCard = (SlottedCard) obj;
        reverseProtoWriter.getClass();
        slottedCard.getClass();
        reverseProtoWriter.writeBytes(slottedCard.unknownFields());
        SlotContent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, slottedCard.slot);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, slottedCard.subtext);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, slottedCard.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, slottedCard.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SlottedCard slottedCard = (SlottedCard) obj;
        slottedCard.getClass();
        int size$okio = slottedCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return SlotContent.ADAPTER.encodedSizeWithTag(4, slottedCard.slot) + protoAdapter.encodedSizeWithTag(3, slottedCard.subtext) + protoAdapter.encodedSizeWithTag(2, slottedCard.text) + protoAdapter.encodedSizeWithTag(1, slottedCard.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SlottedCard slottedCard = (SlottedCard) obj;
        slottedCard.getClass();
        LocalizedString localizedString = slottedCard.label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = slottedCard.text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = slottedCard.subtext;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        SlotContent slotContent = slottedCard.slot;
        SlotContent slotContent2 = slotContent != null ? (SlotContent) SlotContent.ADAPTER.redact(slotContent) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SlottedCard(localizedString2, localizedString4, localizedString6, slotContent2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SlottedCard slottedCard = (SlottedCard) obj;
        slottedCard.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, slottedCard.label);
        protoAdapter.encodeWithTag(protoWriter, 2, slottedCard.text);
        protoAdapter.encodeWithTag(protoWriter, 3, slottedCard.subtext);
        SlotContent.ADAPTER.encodeWithTag(protoWriter, 4, slottedCard.slot);
        protoWriter.writeBytes(slottedCard.unknownFields());
    }
}
