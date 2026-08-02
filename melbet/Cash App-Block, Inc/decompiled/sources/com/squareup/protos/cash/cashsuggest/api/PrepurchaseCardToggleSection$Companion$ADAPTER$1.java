package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.PrepurchaseCardToggleSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCardToggleSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCardToggleSection((PrepurchaseCardToggleSection.ToggleState) obj, (PrepurchaseCardToggleSection.ToggleState) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PrepurchaseCardToggleSection.ToggleState.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(PrepurchaseCardToggleSection.ToggleState.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCardToggleSection prepurchaseCardToggleSection = (PrepurchaseCardToggleSection) obj;
        reverseProtoWriter.getClass();
        prepurchaseCardToggleSection.getClass();
        reverseProtoWriter.writeBytes(prepurchaseCardToggleSection.unknownFields());
        ProtoAdapter protoAdapter = PrepurchaseCardToggleSection.ToggleState.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, prepurchaseCardToggleSection.toggle_turned_off_state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, prepurchaseCardToggleSection.toggle_turned_on_state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PrepurchaseCardToggleSection prepurchaseCardToggleSection = (PrepurchaseCardToggleSection) obj;
        prepurchaseCardToggleSection.getClass();
        int size$okio = prepurchaseCardToggleSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = PrepurchaseCardToggleSection.ToggleState.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, prepurchaseCardToggleSection.toggle_turned_off_state) + protoAdapter.encodedSizeWithTag(1, prepurchaseCardToggleSection.toggle_turned_on_state) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCardToggleSection prepurchaseCardToggleSection = (PrepurchaseCardToggleSection) obj;
        prepurchaseCardToggleSection.getClass();
        PrepurchaseCardToggleSection.ToggleState toggleState = prepurchaseCardToggleSection.toggle_turned_on_state;
        PrepurchaseCardToggleSection.ToggleState toggleState2 = toggleState != null ? (PrepurchaseCardToggleSection.ToggleState) PrepurchaseCardToggleSection.ToggleState.ADAPTER.redact(toggleState) : null;
        PrepurchaseCardToggleSection.ToggleState toggleState3 = prepurchaseCardToggleSection.toggle_turned_off_state;
        PrepurchaseCardToggleSection.ToggleState toggleState4 = toggleState3 != null ? (PrepurchaseCardToggleSection.ToggleState) PrepurchaseCardToggleSection.ToggleState.ADAPTER.redact(toggleState3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PrepurchaseCardToggleSection(toggleState2, toggleState4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCardToggleSection prepurchaseCardToggleSection = (PrepurchaseCardToggleSection) obj;
        prepurchaseCardToggleSection.getClass();
        ProtoAdapter protoAdapter = PrepurchaseCardToggleSection.ToggleState.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, prepurchaseCardToggleSection.toggle_turned_on_state);
        protoAdapter.encodeWithTag(protoWriter, 2, prepurchaseCardToggleSection.toggle_turned_off_state);
        protoWriter.writeBytes(prepurchaseCardToggleSection.unknownFields());
    }
}
