package com.squareup.protos.cash.cashbusinessaccounts;

import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class KybEligibilityWarning$Action$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new KybEligibilityWarning.Action((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        KybEligibilityWarning.Action action = (KybEligibilityWarning.Action) obj;
        reverseProtoWriter.getClass();
        action.getClass();
        reverseProtoWriter.writeBytes(action.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, action.deeplink_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, action.route_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, action.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        KybEligibilityWarning.Action action = (KybEligibilityWarning.Action) obj;
        action.getClass();
        int size$okio = action.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, action.deeplink_url) + protoAdapter.encodedSizeWithTag(2, action.route_url) + protoAdapter.encodedSizeWithTag(1, action.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        KybEligibilityWarning.Action action = (KybEligibilityWarning.Action) obj;
        action.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = action.route_url;
        String str2 = action.deeplink_url;
        byteString.getClass();
        return new KybEligibilityWarning.Action(null, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        KybEligibilityWarning.Action action = (KybEligibilityWarning.Action) obj;
        action.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, action.title);
        protoAdapter.encodeWithTag(protoWriter, 2, action.route_url);
        protoAdapter.encodeWithTag(protoWriter, 3, action.deeplink_url);
        protoWriter.writeBytes(action.unknownFields());
    }
}
