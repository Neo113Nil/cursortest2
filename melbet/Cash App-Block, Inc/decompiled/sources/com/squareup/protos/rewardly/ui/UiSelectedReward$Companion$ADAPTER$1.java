package com.squareup.protos.rewardly.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiSelectedReward$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiSelectedReward((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiSelectedReward uiSelectedReward = (UiSelectedReward) obj;
        reverseProtoWriter.getClass();
        uiSelectedReward.getClass();
        reverseProtoWriter.writeBytes(uiSelectedReward.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiSelectedReward.reward_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiSelectedReward.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiSelectedReward uiSelectedReward = (UiSelectedReward) obj;
        uiSelectedReward.getClass();
        int size$okio = uiSelectedReward.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, uiSelectedReward.reward_token) + protoAdapter.encodedSizeWithTag(1, uiSelectedReward.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiSelectedReward uiSelectedReward = (UiSelectedReward) obj;
        uiSelectedReward.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = uiSelectedReward.token;
        String str2 = uiSelectedReward.reward_token;
        byteString.getClass();
        return new UiSelectedReward(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiSelectedReward uiSelectedReward = (UiSelectedReward) obj;
        uiSelectedReward.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, uiSelectedReward.token);
        protoAdapter.encodeWithTag(protoWriter, 2, uiSelectedReward.reward_token);
        protoWriter.writeBytes(uiSelectedReward.unknownFields());
    }
}
