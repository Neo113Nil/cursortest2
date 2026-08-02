package com.squareup.protos.cash.blockly.api;

import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.BlockSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BlockSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocalBrandBanner.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BlockSearchResponse(companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                companion = new BlockSearchResponse$Results$BlockSuggestions((BlockSearchResponse.BlockSuggestions) BlockSearchResponse.BlockSuggestions.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new BlockSearchResponse$Results$BlockSearchResults((BlockSearchResponse.BlockSearchResults) BlockSearchResponse.BlockSearchResults.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BlockSearchResponse blockSearchResponse = (BlockSearchResponse) obj;
        reverseProtoWriter.getClass();
        blockSearchResponse.getClass();
        reverseProtoWriter.writeBytes(blockSearchResponse.unknownFields());
        LocalBrandBanner.Companion companion = blockSearchResponse.results;
        if (companion instanceof BlockSearchResponse$Results$BlockSuggestions) {
            BlockSearchResponse.BlockSuggestions.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((BlockSearchResponse$Results$BlockSuggestions) companion).value);
        } else if (companion instanceof BlockSearchResponse$Results$BlockSearchResults) {
            BlockSearchResponse.BlockSearchResults.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BlockSearchResponse$Results$BlockSearchResults) companion).value);
        } else {
            if (companion == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        BlockSearchResponse blockSearchResponse = (BlockSearchResponse) obj;
        blockSearchResponse.getClass();
        int size$okio = blockSearchResponse.unknownFields().getSize$okio();
        LocalBrandBanner.Companion companion = blockSearchResponse.results;
        if (companion instanceof BlockSearchResponse$Results$BlockSuggestions) {
            encodedSizeWithTag = BlockSearchResponse.BlockSuggestions.ADAPTER.encodedSizeWithTag(1, ((BlockSearchResponse$Results$BlockSuggestions) companion).value);
        } else {
            if (!(companion instanceof BlockSearchResponse$Results$BlockSearchResults)) {
                if (companion == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = BlockSearchResponse.BlockSearchResults.ADAPTER.encodedSizeWithTag(2, ((BlockSearchResponse$Results$BlockSearchResults) companion).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BlockSearchResponse blockSearchResponse = (BlockSearchResponse) obj;
        blockSearchResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalBrandBanner.Companion companion = blockSearchResponse.results;
        byteString.getClass();
        return new BlockSearchResponse(companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BlockSearchResponse blockSearchResponse = (BlockSearchResponse) obj;
        blockSearchResponse.getClass();
        LocalBrandBanner.Companion companion = blockSearchResponse.results;
        if (companion instanceof BlockSearchResponse$Results$BlockSuggestions) {
            BlockSearchResponse.BlockSuggestions.ADAPTER.encodeWithTag(protoWriter, 1, ((BlockSearchResponse$Results$BlockSuggestions) companion).value);
        } else if (companion instanceof BlockSearchResponse$Results$BlockSearchResults) {
            BlockSearchResponse.BlockSearchResults.ADAPTER.encodeWithTag(protoWriter, 2, ((BlockSearchResponse$Results$BlockSearchResults) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(blockSearchResponse.unknownFields());
    }
}
