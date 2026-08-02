package com.squareup.protos.cash.activity.api.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivityToken$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivityToken;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityToken$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivityToken((ActivityTokenType) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = ActivityTokenType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivityToken activityToken = (ActivityToken) obj;
        reverseProtoWriter.getClass();
        activityToken.getClass();
        reverseProtoWriter.writeBytes(activityToken.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, activityToken.sub_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activityToken.token);
        ActivityTokenType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activityToken.activity_token_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivityToken activityToken = (ActivityToken) obj;
        activityToken.getClass();
        int encodedSizeWithTag = ActivityTokenType.ADAPTER.encodedSizeWithTag(1, activityToken.activity_token_type) + activityToken.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, activityToken.sub_token) + protoAdapter.encodedSizeWithTag(2, activityToken.token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivityToken activityToken = (ActivityToken) obj;
        activityToken.getClass();
        ByteString byteString = ByteString.EMPTY;
        ActivityTokenType activityTokenType = activityToken.activity_token_type;
        String str = activityToken.token;
        String str2 = activityToken.sub_token;
        byteString.getClass();
        return new ActivityToken(activityTokenType, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivityToken activityToken = (ActivityToken) obj;
        activityToken.getClass();
        ActivityTokenType.ADAPTER.encodeWithTag(protoWriter, 1, activityToken.activity_token_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, activityToken.token);
        protoAdapter.encodeWithTag(protoWriter, 3, activityToken.sub_token);
        protoWriter.writeBytes(activityToken.unknownFields());
    }
}
