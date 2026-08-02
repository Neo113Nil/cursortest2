package com.squareup.protos.franklin.common;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ClientRoutingConfig$DeepLinkRule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientRoutingConfig.DeepLinkRule((Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (String) obj, (String) obj5, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 6:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientRoutingConfig.DeepLinkRule deepLinkRule = (ClientRoutingConfig.DeepLinkRule) obj;
        reverseProtoWriter.getClass();
        deepLinkRule.getClass();
        reverseProtoWriter.writeBytes(deepLinkRule.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, deepLinkRule.spec_name);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, deepLinkRule.required_parameter_names);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, deepLinkRule.include_raw_query_params);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, deepLinkRule.external_browser_fallback);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, deepLinkRule.is_supported_on_latest_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, deepLinkRule.path_regex);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientRoutingConfig.DeepLinkRule deepLinkRule = (ClientRoutingConfig.DeepLinkRule) obj;
        deepLinkRule.getClass();
        int size$okio = deepLinkRule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, deepLinkRule.path_regex) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(6, deepLinkRule.spec_name) + protoAdapter.asRepeated().encodedSizeWithTag(5, deepLinkRule.required_parameter_names) + protoAdapter2.encodedSizeWithTag(4, deepLinkRule.include_raw_query_params) + protoAdapter2.encodedSizeWithTag(3, deepLinkRule.external_browser_fallback) + protoAdapter2.encodedSizeWithTag(2, deepLinkRule.is_supported_on_latest_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientRoutingConfig.DeepLinkRule deepLinkRule = (ClientRoutingConfig.DeepLinkRule) obj;
        deepLinkRule.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = deepLinkRule.path_regex;
        Boolean bool = deepLinkRule.is_supported_on_latest_version;
        Boolean bool2 = deepLinkRule.external_browser_fallback;
        Boolean bool3 = deepLinkRule.include_raw_query_params;
        List list = deepLinkRule.required_parameter_names;
        String str2 = deepLinkRule.spec_name;
        list.getClass();
        byteString.getClass();
        return new ClientRoutingConfig.DeepLinkRule(bool, bool2, bool3, str, str2, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientRoutingConfig.DeepLinkRule deepLinkRule = (ClientRoutingConfig.DeepLinkRule) obj;
        deepLinkRule.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, deepLinkRule.path_regex);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, deepLinkRule.is_supported_on_latest_version);
        protoAdapter2.encodeWithTag(protoWriter, 3, deepLinkRule.external_browser_fallback);
        protoAdapter2.encodeWithTag(protoWriter, 4, deepLinkRule.include_raw_query_params);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, deepLinkRule.required_parameter_names);
        protoAdapter.encodeWithTag(protoWriter, 6, deepLinkRule.spec_name);
        protoWriter.writeBytes(deepLinkRule.unknownFields());
    }
}
