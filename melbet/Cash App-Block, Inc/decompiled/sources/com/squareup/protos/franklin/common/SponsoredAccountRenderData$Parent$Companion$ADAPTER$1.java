package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Parent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SponsoredAccountRenderData.Parent((SponsoredAccountRenderData.Parent.Type) obj, (String) obj2, (String) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SponsoredAccountRenderData.Parent.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SponsoredAccountRenderData.Parent parent = (SponsoredAccountRenderData.Parent) obj;
        reverseProtoWriter.getClass();
        parent.getClass();
        reverseProtoWriter.writeBytes(parent.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, parent.declined_due_to_ineligibility);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, parent.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, parent.action_url);
        SponsoredAccountRenderData.Parent.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, parent.f1386type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SponsoredAccountRenderData.Parent parent = (SponsoredAccountRenderData.Parent) obj;
        parent.getClass();
        int encodedSizeWithTag = SponsoredAccountRenderData.Parent.Type.ADAPTER.encodedSizeWithTag(1, parent.f1386type) + parent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, parent.declined_due_to_ineligibility) + protoAdapter.encodedSizeWithTag(3, parent.icon_url) + protoAdapter.encodedSizeWithTag(2, parent.action_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SponsoredAccountRenderData.Parent parent = (SponsoredAccountRenderData.Parent) obj;
        parent.getClass();
        ByteString byteString = ByteString.EMPTY;
        SponsoredAccountRenderData.Parent.Type type2 = parent.f1386type;
        String str = parent.action_url;
        String str2 = parent.icon_url;
        Boolean bool = parent.declined_due_to_ineligibility;
        byteString.getClass();
        return new SponsoredAccountRenderData.Parent(type2, str, str2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SponsoredAccountRenderData.Parent parent = (SponsoredAccountRenderData.Parent) obj;
        parent.getClass();
        SponsoredAccountRenderData.Parent.Type.ADAPTER.encodeWithTag(protoWriter, 1, parent.f1386type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, parent.action_url);
        protoAdapter.encodeWithTag(protoWriter, 3, parent.icon_url);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, parent.declined_due_to_ineligibility);
        protoWriter.writeBytes(parent.unknownFields());
    }
}
