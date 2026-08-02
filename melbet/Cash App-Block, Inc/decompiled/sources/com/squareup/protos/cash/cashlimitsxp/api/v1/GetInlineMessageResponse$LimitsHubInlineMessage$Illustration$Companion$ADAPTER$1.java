package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetInlineMessageResponse$LimitsHubInlineMessage$Illustration$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetInlineMessageResponse.LimitsHubInlineMessage.Illustration((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration = (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) obj;
        reverseProtoWriter.getClass();
        illustration.getClass();
        reverseProtoWriter.writeBytes(illustration.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, illustration.android_illustration_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, illustration.dark_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, illustration.light_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, illustration.arcade_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration = (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) obj;
        illustration.getClass();
        int size$okio = illustration.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, illustration.android_illustration_id) + protoAdapter.encodedSizeWithTag(3, illustration.dark_url) + protoAdapter.encodedSizeWithTag(2, illustration.light_url) + protoAdapter.encodedSizeWithTag(1, illustration.arcade_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration = (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) obj;
        illustration.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = illustration.arcade_id;
        String str2 = illustration.light_url;
        String str3 = illustration.dark_url;
        String str4 = illustration.android_illustration_id;
        byteString.getClass();
        return new GetInlineMessageResponse.LimitsHubInlineMessage.Illustration(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration = (GetInlineMessageResponse.LimitsHubInlineMessage.Illustration) obj;
        illustration.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, illustration.arcade_id);
        protoAdapter.encodeWithTag(protoWriter, 2, illustration.light_url);
        protoAdapter.encodeWithTag(protoWriter, 3, illustration.dark_url);
        protoAdapter.encodeWithTag(protoWriter, 5, illustration.android_illustration_id);
        protoWriter.writeBytes(illustration.unknownFields());
    }
}
