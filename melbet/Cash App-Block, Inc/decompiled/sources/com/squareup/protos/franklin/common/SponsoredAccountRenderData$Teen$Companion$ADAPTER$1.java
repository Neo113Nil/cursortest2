package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SponsoredAccountRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SponsoredAccountRenderData$Teen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SponsoredAccountRenderData.Teen((SponsoredAccountRenderData.Teen.Type) obj, (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = SponsoredAccountRenderData.Teen.Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SponsoredAccountRenderData.Teen teen = (SponsoredAccountRenderData.Teen) obj;
        reverseProtoWriter.getClass();
        teen.getClass();
        reverseProtoWriter.writeBytes(teen.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, teen.sponsor_specified_unverified_legal_name);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, teen.allow_new_sponsor_selection);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, teen.legal_name_changed);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, teen.action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, teen.icon_url);
        SponsoredAccountRenderData.Teen.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, teen.f1387type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SponsoredAccountRenderData.Teen teen = (SponsoredAccountRenderData.Teen) obj;
        teen.getClass();
        int encodedSizeWithTag = SponsoredAccountRenderData.Teen.Type.ADAPTER.encodedSizeWithTag(1, teen.f1387type) + teen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(3, teen.action_url) + protoAdapter.encodedSizeWithTag(2, teen.icon_url) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(6, teen.sponsor_specified_unverified_legal_name) + protoAdapter2.encodedSizeWithTag(5, teen.allow_new_sponsor_selection) + protoAdapter2.encodedSizeWithTag(4, teen.legal_name_changed) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SponsoredAccountRenderData.Teen teen = (SponsoredAccountRenderData.Teen) obj;
        teen.getClass();
        ByteString byteString = ByteString.EMPTY;
        SponsoredAccountRenderData.Teen.Type type2 = teen.f1387type;
        String str = teen.icon_url;
        String str2 = teen.action_url;
        Boolean bool = teen.legal_name_changed;
        Boolean bool2 = teen.allow_new_sponsor_selection;
        byteString.getClass();
        return new SponsoredAccountRenderData.Teen(type2, str, str2, bool, bool2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SponsoredAccountRenderData.Teen teen = (SponsoredAccountRenderData.Teen) obj;
        teen.getClass();
        SponsoredAccountRenderData.Teen.Type.ADAPTER.encodeWithTag(protoWriter, 1, teen.f1387type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, teen.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 3, teen.action_url);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 4, teen.legal_name_changed);
        protoAdapter2.encodeWithTag(protoWriter, 5, teen.allow_new_sponsor_selection);
        protoAdapter.encodeWithTag(protoWriter, 6, teen.sponsor_specified_unverified_legal_name);
        protoWriter.writeBytes(teen.unknownFields());
    }
}
