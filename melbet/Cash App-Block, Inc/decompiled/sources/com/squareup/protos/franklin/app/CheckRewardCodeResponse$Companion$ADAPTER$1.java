package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CheckRewardCodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckRewardCodeResponse((String) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CheckRewardCodeResponse checkRewardCodeResponse = (CheckRewardCodeResponse) obj;
        reverseProtoWriter.getClass();
        checkRewardCodeResponse.getClass();
        reverseProtoWriter.writeBytes(checkRewardCodeResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, checkRewardCodeResponse.inviter_customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, checkRewardCodeResponse.inviter_full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, checkRewardCodeResponse.inviter_photo_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, checkRewardCodeResponse.reward_text);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, checkRewardCodeResponse.valid);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckRewardCodeResponse checkRewardCodeResponse = (CheckRewardCodeResponse) obj;
        checkRewardCodeResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, checkRewardCodeResponse.valid) + checkRewardCodeResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, checkRewardCodeResponse.inviter_customer_token) + protoAdapter.encodedSizeWithTag(4, checkRewardCodeResponse.inviter_full_name) + protoAdapter.encodedSizeWithTag(3, checkRewardCodeResponse.inviter_photo_url) + protoAdapter.encodedSizeWithTag(2, checkRewardCodeResponse.reward_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckRewardCodeResponse checkRewardCodeResponse = (CheckRewardCodeResponse) obj;
        checkRewardCodeResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = checkRewardCodeResponse.valid;
        String str = checkRewardCodeResponse.inviter_photo_url;
        String str2 = checkRewardCodeResponse.inviter_customer_token;
        byteString.getClass();
        return new CheckRewardCodeResponse(null, str, null, str2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckRewardCodeResponse checkRewardCodeResponse = (CheckRewardCodeResponse) obj;
        checkRewardCodeResponse.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkRewardCodeResponse.valid);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, checkRewardCodeResponse.reward_text);
        protoAdapter.encodeWithTag(protoWriter, 3, checkRewardCodeResponse.inviter_photo_url);
        protoAdapter.encodeWithTag(protoWriter, 4, checkRewardCodeResponse.inviter_full_name);
        protoAdapter.encodeWithTag(protoWriter, 5, checkRewardCodeResponse.inviter_customer_token);
        protoWriter.writeBytes(checkRewardCodeResponse.unknownFields());
    }
}
