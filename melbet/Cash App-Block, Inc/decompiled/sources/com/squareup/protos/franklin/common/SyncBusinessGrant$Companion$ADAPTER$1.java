package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncBusinessGrant$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SyncBusinessGrant((String) obj4, (String) obj5, (Long) obj6, (Long) obj7, (Long) obj8, (String) obj9, (SyncBusinessGrant.ActionType) obj10, (String) obj11, (SyncBusinessGrant.RenderingBehavior) obj12, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 4:
                    obj7 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 5:
                    obj8 = ProtoAdapter.UINT64.decode(protoReader);
                    break;
                case 6:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj10 = SyncBusinessGrant.ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 8:
                    obj11 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    try {
                        obj12 = SyncBusinessGrant.RenderingBehavior.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SyncBusinessGrant syncBusinessGrant = (SyncBusinessGrant) obj;
        reverseProtoWriter.getClass();
        syncBusinessGrant.getClass();
        reverseProtoWriter.writeBytes(syncBusinessGrant.unknownFields());
        SyncBusinessGrant.RenderingBehavior.ADAPTER.encodeWithTag(reverseProtoWriter, 9, syncBusinessGrant.rendering_behavior);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, syncBusinessGrant.account_reference_id);
        SyncBusinessGrant.ActionType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, syncBusinessGrant.action_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, syncBusinessGrant.client_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, syncBusinessGrant.expires_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, syncBusinessGrant.created_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, syncBusinessGrant.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, syncBusinessGrant.merchant_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, syncBusinessGrant.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SyncBusinessGrant syncBusinessGrant = (SyncBusinessGrant) obj;
        syncBusinessGrant.getClass();
        int size$okio = syncBusinessGrant.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, syncBusinessGrant.merchant_id) + protoAdapter.encodedSizeWithTag(1, syncBusinessGrant.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        return SyncBusinessGrant.RenderingBehavior.ADAPTER.encodedSizeWithTag(9, syncBusinessGrant.rendering_behavior) + protoAdapter.encodedSizeWithTag(8, syncBusinessGrant.account_reference_id) + SyncBusinessGrant.ActionType.ADAPTER.encodedSizeWithTag(7, syncBusinessGrant.action_type) + protoAdapter.encodedSizeWithTag(6, syncBusinessGrant.client_id) + protoAdapter2.encodedSizeWithTag(5, syncBusinessGrant.expires_at) + protoAdapter2.encodedSizeWithTag(4, syncBusinessGrant.created_at) + protoAdapter2.encodedSizeWithTag(3, syncBusinessGrant.updated_at) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SyncBusinessGrant syncBusinessGrant = (SyncBusinessGrant) obj;
        syncBusinessGrant.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = syncBusinessGrant.id;
        String str2 = syncBusinessGrant.merchant_id;
        Long l = syncBusinessGrant.updated_at;
        Long l2 = syncBusinessGrant.created_at;
        Long l3 = syncBusinessGrant.expires_at;
        String str3 = syncBusinessGrant.client_id;
        SyncBusinessGrant.ActionType actionType = syncBusinessGrant.action_type;
        String str4 = syncBusinessGrant.account_reference_id;
        SyncBusinessGrant.RenderingBehavior renderingBehavior = syncBusinessGrant.rendering_behavior;
        byteString.getClass();
        return new SyncBusinessGrant(str, str2, l, l2, l3, str3, actionType, str4, renderingBehavior, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SyncBusinessGrant syncBusinessGrant = (SyncBusinessGrant) obj;
        syncBusinessGrant.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, syncBusinessGrant.id);
        protoAdapter.encodeWithTag(protoWriter, 2, syncBusinessGrant.merchant_id);
        ProtoAdapter protoAdapter2 = ProtoAdapter.UINT64;
        protoAdapter2.encodeWithTag(protoWriter, 3, syncBusinessGrant.updated_at);
        protoAdapter2.encodeWithTag(protoWriter, 4, syncBusinessGrant.created_at);
        protoAdapter2.encodeWithTag(protoWriter, 5, syncBusinessGrant.expires_at);
        protoAdapter.encodeWithTag(protoWriter, 6, syncBusinessGrant.client_id);
        SyncBusinessGrant.ActionType.ADAPTER.encodeWithTag(protoWriter, 7, syncBusinessGrant.action_type);
        protoAdapter.encodeWithTag(protoWriter, 8, syncBusinessGrant.account_reference_id);
        SyncBusinessGrant.RenderingBehavior.ADAPTER.encodeWithTag(protoWriter, 9, syncBusinessGrant.rendering_behavior);
        protoWriter.writeBytes(syncBusinessGrant.unknownFields());
    }
}
