package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalLocationLinks$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalLocationLinks((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
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
        LocalLocationLinks localLocationLinks = (LocalLocationLinks) obj;
        reverseProtoWriter.getClass();
        localLocationLinks.getClass();
        reverseProtoWriter.writeBytes(localLocationLinks.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, localLocationLinks.upsell_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localLocationLinks.onboarding_flow_deep_link_payload);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localLocationLinks.onboarding_flow_client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localLocationLinks.download_app_for_onboarding_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localLocationLinks.web_ordering_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localLocationLinks.profile_share_link_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalLocationLinks localLocationLinks = (LocalLocationLinks) obj;
        localLocationLinks.getClass();
        int size$okio = localLocationLinks.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, localLocationLinks.upsell_client_route) + protoAdapter.encodedSizeWithTag(5, localLocationLinks.onboarding_flow_deep_link_payload) + protoAdapter.encodedSizeWithTag(4, localLocationLinks.onboarding_flow_client_route) + protoAdapter.encodedSizeWithTag(3, localLocationLinks.download_app_for_onboarding_url) + protoAdapter.encodedSizeWithTag(2, localLocationLinks.web_ordering_url) + protoAdapter.encodedSizeWithTag(1, localLocationLinks.profile_share_link_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalLocationLinks localLocationLinks = (LocalLocationLinks) obj;
        localLocationLinks.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localLocationLinks.profile_share_link_url;
        String str2 = localLocationLinks.web_ordering_url;
        String str3 = localLocationLinks.download_app_for_onboarding_url;
        String str4 = localLocationLinks.onboarding_flow_client_route;
        String str5 = localLocationLinks.onboarding_flow_deep_link_payload;
        String str6 = localLocationLinks.upsell_client_route;
        byteString.getClass();
        return new LocalLocationLinks(str, str2, str3, str4, str5, str6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalLocationLinks localLocationLinks = (LocalLocationLinks) obj;
        localLocationLinks.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localLocationLinks.profile_share_link_url);
        protoAdapter.encodeWithTag(protoWriter, 2, localLocationLinks.web_ordering_url);
        protoAdapter.encodeWithTag(protoWriter, 3, localLocationLinks.download_app_for_onboarding_url);
        protoAdapter.encodeWithTag(protoWriter, 4, localLocationLinks.onboarding_flow_client_route);
        protoAdapter.encodeWithTag(protoWriter, 5, localLocationLinks.onboarding_flow_deep_link_payload);
        protoAdapter.encodeWithTag(protoWriter, 6, localLocationLinks.upsell_client_route);
        protoWriter.writeBytes(localLocationLinks.unknownFields());
    }
}
