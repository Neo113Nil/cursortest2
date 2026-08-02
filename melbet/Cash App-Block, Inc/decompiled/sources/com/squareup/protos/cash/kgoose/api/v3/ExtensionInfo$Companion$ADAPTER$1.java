package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ExtensionInfo$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionInfo;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionInfo$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExtensionInfo((String) obj, (String) obj2, (Integer) obj3, (Boolean) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 5) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 6) {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExtensionInfo extensionInfo = (ExtensionInfo) obj;
        reverseProtoWriter.getClass();
        extensionInfo.getClass();
        reverseProtoWriter.writeBytes(extensionInfo.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, extensionInfo.auth_satisfied_for_caller);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, extensionInfo.any_tool_requires_user_auth);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, extensionInfo.tool_count);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, extensionInfo.description);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, extensionInfo.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExtensionInfo extensionInfo = (ExtensionInfo) obj;
        extensionInfo.getClass();
        int size$okio = extensionInfo.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(5, extensionInfo.tool_count) + protoAdapter.encodedSizeWithTag(2, extensionInfo.description) + protoAdapter.encodedSizeWithTag(1, extensionInfo.name) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(7, extensionInfo.auth_satisfied_for_caller) + protoAdapter2.encodedSizeWithTag(6, extensionInfo.any_tool_requires_user_auth) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExtensionInfo extensionInfo = (ExtensionInfo) obj;
        extensionInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = extensionInfo.name;
        String str2 = extensionInfo.description;
        Integer num = extensionInfo.tool_count;
        Boolean bool = extensionInfo.any_tool_requires_user_auth;
        Boolean bool2 = extensionInfo.auth_satisfied_for_caller;
        byteString.getClass();
        return new ExtensionInfo(str, str2, num, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExtensionInfo extensionInfo = (ExtensionInfo) obj;
        extensionInfo.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, extensionInfo.name);
        protoAdapter.encodeWithTag(protoWriter, 2, extensionInfo.description);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, extensionInfo.tool_count);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 6, extensionInfo.any_tool_requires_user_auth);
        protoAdapter2.encodeWithTag(protoWriter, 7, extensionInfo.auth_satisfied_for_caller);
        protoWriter.writeBytes(extensionInfo.unknownFields());
    }
}
