package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.FeatureInvitationRenderData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FeatureInvitationRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FeatureInvitationRenderData((FeatureInvitationRenderData.Status) obj, (FeatureInvitationRenderData.Feature) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = FeatureInvitationRenderData.Status.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj2 = FeatureInvitationRenderData.Feature.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
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
        FeatureInvitationRenderData featureInvitationRenderData = (FeatureInvitationRenderData) obj;
        reverseProtoWriter.getClass();
        featureInvitationRenderData.getClass();
        reverseProtoWriter.writeBytes(featureInvitationRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, featureInvitationRenderData.invitee_full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, featureInvitationRenderData.invitee_alias);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, featureInvitationRenderData.icon_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, featureInvitationRenderData.action_url);
        FeatureInvitationRenderData.Feature.ADAPTER.encodeWithTag(reverseProtoWriter, 2, featureInvitationRenderData.feature);
        FeatureInvitationRenderData.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, featureInvitationRenderData.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FeatureInvitationRenderData featureInvitationRenderData = (FeatureInvitationRenderData) obj;
        featureInvitationRenderData.getClass();
        int encodedSizeWithTag = FeatureInvitationRenderData.Feature.ADAPTER.encodedSizeWithTag(2, featureInvitationRenderData.feature) + FeatureInvitationRenderData.Status.ADAPTER.encodedSizeWithTag(1, featureInvitationRenderData.status) + featureInvitationRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, featureInvitationRenderData.invitee_full_name) + protoAdapter.encodedSizeWithTag(5, featureInvitationRenderData.invitee_alias) + protoAdapter.encodedSizeWithTag(4, featureInvitationRenderData.icon_url) + protoAdapter.encodedSizeWithTag(3, featureInvitationRenderData.action_url) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FeatureInvitationRenderData featureInvitationRenderData = (FeatureInvitationRenderData) obj;
        featureInvitationRenderData.getClass();
        ByteString byteString = ByteString.EMPTY;
        FeatureInvitationRenderData.Status status = featureInvitationRenderData.status;
        FeatureInvitationRenderData.Feature feature = featureInvitationRenderData.feature;
        String str = featureInvitationRenderData.action_url;
        String str2 = featureInvitationRenderData.icon_url;
        byteString.getClass();
        return new FeatureInvitationRenderData(status, feature, str, str2, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FeatureInvitationRenderData featureInvitationRenderData = (FeatureInvitationRenderData) obj;
        featureInvitationRenderData.getClass();
        FeatureInvitationRenderData.Status.ADAPTER.encodeWithTag(protoWriter, 1, featureInvitationRenderData.status);
        FeatureInvitationRenderData.Feature.ADAPTER.encodeWithTag(protoWriter, 2, featureInvitationRenderData.feature);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, featureInvitationRenderData.action_url);
        protoAdapter.encodeWithTag(protoWriter, 4, featureInvitationRenderData.icon_url);
        protoAdapter.encodeWithTag(protoWriter, 5, featureInvitationRenderData.invitee_alias);
        protoAdapter.encodeWithTag(protoWriter, 6, featureInvitationRenderData.invitee_full_name);
        protoWriter.writeBytes(featureInvitationRenderData.unknownFields());
    }
}
