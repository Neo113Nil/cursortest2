package com.squareup.protos.cash.blockly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlockSearchResponse$BlockSearchResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlockSearchResponse.BlockSearchResults(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(BlocklyCustomer.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BlockSearchResponse.BlockSearchResults blockSearchResults = (BlockSearchResponse.BlockSearchResults) obj;
        reverseProtoWriter.getClass();
        blockSearchResults.getClass();
        reverseProtoWriter.writeBytes(blockSearchResults.unknownFields());
        BlocklyCustomer.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, blockSearchResults.customers);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BlockSearchResponse.BlockSearchResults blockSearchResults = (BlockSearchResponse.BlockSearchResults) obj;
        blockSearchResults.getClass();
        return BlocklyCustomer.ADAPTER.asRepeated().encodedSizeWithTag(1, blockSearchResults.customers) + blockSearchResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlockSearchResponse.BlockSearchResults blockSearchResults = (BlockSearchResponse.BlockSearchResults) obj;
        blockSearchResults.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(blockSearchResults.customers, BlocklyCustomer.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BlockSearchResponse.BlockSearchResults(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlockSearchResponse.BlockSearchResults blockSearchResults = (BlockSearchResponse.BlockSearchResults) obj;
        blockSearchResults.getClass();
        BlocklyCustomer.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, blockSearchResults.customers);
        protoWriter.writeBytes(blockSearchResults.unknownFields());
    }
}
