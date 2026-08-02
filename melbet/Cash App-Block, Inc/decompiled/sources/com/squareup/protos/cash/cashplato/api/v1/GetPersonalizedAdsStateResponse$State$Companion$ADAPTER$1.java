package com.squareup.protos.cash.cashplato.api.v1;

import com.squareup.protos.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPersonalizedAdsStateResponse$State$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPersonalizedAdsStateResponse.State((String) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPersonalizedAdsStateResponse.State state = (GetPersonalizedAdsStateResponse.State) obj;
        reverseProtoWriter.getClass();
        state.getClass();
        reverseProtoWriter.writeBytes(state.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, state.copy_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, state.personalized_ads_enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPersonalizedAdsStateResponse.State state = (GetPersonalizedAdsStateResponse.State) obj;
        state.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, state.copy_text) + ProtoAdapter.BOOL.encodedSizeWithTag(1, state.personalized_ads_enabled) + state.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPersonalizedAdsStateResponse.State state = (GetPersonalizedAdsStateResponse.State) obj;
        state.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = state.personalized_ads_enabled;
        String str = state.copy_text;
        byteString.getClass();
        return new GetPersonalizedAdsStateResponse.State(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPersonalizedAdsStateResponse.State state = (GetPersonalizedAdsStateResponse.State) obj;
        state.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, state.personalized_ads_enabled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, state.copy_text);
        protoWriter.writeBytes(state.unknownFields());
    }
}
