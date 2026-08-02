package com.squareup.protos.cash.blockly.api;

import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.blockly.api.AllowlistSearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AllowlistSearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocalBrandBanner.Action action = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AllowlistSearchResponse(action, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                action = new AllowlistSearchResponse$Results$AllowlistSuggestions((AllowlistSearchResponse.AllowlistSuggestions) AllowlistSearchResponse.AllowlistSuggestions.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                action = new AllowlistSearchResponse$Results$AllowlistSearchResults((AllowlistSearchResponse.AllowlistSearchResults) AllowlistSearchResponse.AllowlistSearchResults.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AllowlistSearchResponse allowlistSearchResponse = (AllowlistSearchResponse) obj;
        reverseProtoWriter.getClass();
        allowlistSearchResponse.getClass();
        reverseProtoWriter.writeBytes(allowlistSearchResponse.unknownFields());
        LocalBrandBanner.Action action = allowlistSearchResponse.results;
        if (action instanceof AllowlistSearchResponse$Results$AllowlistSuggestions) {
            AllowlistSearchResponse.AllowlistSuggestions.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AllowlistSearchResponse$Results$AllowlistSuggestions) action).value);
        } else if (action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults) {
            AllowlistSearchResponse.AllowlistSearchResults.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AllowlistSearchResponse$Results$AllowlistSearchResults) action).value);
        } else {
            if (action == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AllowlistSearchResponse allowlistSearchResponse = (AllowlistSearchResponse) obj;
        allowlistSearchResponse.getClass();
        int size$okio = allowlistSearchResponse.unknownFields().getSize$okio();
        LocalBrandBanner.Action action = allowlistSearchResponse.results;
        if (action instanceof AllowlistSearchResponse$Results$AllowlistSuggestions) {
            encodedSizeWithTag = AllowlistSearchResponse.AllowlistSuggestions.ADAPTER.encodedSizeWithTag(1, ((AllowlistSearchResponse$Results$AllowlistSuggestions) action).value);
        } else {
            if (!(action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults)) {
                if (action == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = AllowlistSearchResponse.AllowlistSearchResults.ADAPTER.encodedSizeWithTag(2, ((AllowlistSearchResponse$Results$AllowlistSearchResults) action).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AllowlistSearchResponse allowlistSearchResponse = (AllowlistSearchResponse) obj;
        allowlistSearchResponse.getClass();
        return AllowlistSearchResponse.copy$default(allowlistSearchResponse, null, ByteString.EMPTY, 1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AllowlistSearchResponse allowlistSearchResponse = (AllowlistSearchResponse) obj;
        allowlistSearchResponse.getClass();
        LocalBrandBanner.Action action = allowlistSearchResponse.results;
        if (action instanceof AllowlistSearchResponse$Results$AllowlistSuggestions) {
            AllowlistSearchResponse.AllowlistSuggestions.ADAPTER.encodeWithTag(protoWriter, 1, ((AllowlistSearchResponse$Results$AllowlistSuggestions) action).value);
        } else if (action instanceof AllowlistSearchResponse$Results$AllowlistSearchResults) {
            AllowlistSearchResponse.AllowlistSearchResults.ADAPTER.encodeWithTag(protoWriter, 2, ((AllowlistSearchResponse$Results$AllowlistSearchResults) action).value);
        } else if (action != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(allowlistSearchResponse.unknownFields());
    }
}
