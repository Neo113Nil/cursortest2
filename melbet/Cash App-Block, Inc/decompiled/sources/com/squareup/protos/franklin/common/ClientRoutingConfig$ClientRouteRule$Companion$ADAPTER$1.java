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
public final class ClientRoutingConfig$ClientRouteRule$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientRoutingConfig.ClientRouteRule((String) obj, (Boolean) obj2, (Boolean) obj3, m, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 4) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientRoutingConfig.ClientRouteRule clientRouteRule = (ClientRoutingConfig.ClientRouteRule) obj;
        reverseProtoWriter.getClass();
        clientRouteRule.getClass();
        reverseProtoWriter.writeBytes(clientRouteRule.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, clientRouteRule.spec_name);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, clientRouteRule.required_parameter_names);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, clientRouteRule.include_raw_query_params);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, clientRouteRule.is_supported_on_latest_version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientRouteRule.path_regex);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientRoutingConfig.ClientRouteRule clientRouteRule = (ClientRoutingConfig.ClientRouteRule) obj;
        clientRouteRule.getClass();
        int size$okio = clientRouteRule.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, clientRouteRule.path_regex) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(5, clientRouteRule.spec_name) + protoAdapter.asRepeated().encodedSizeWithTag(4, clientRouteRule.required_parameter_names) + protoAdapter2.encodedSizeWithTag(3, clientRouteRule.include_raw_query_params) + protoAdapter2.encodedSizeWithTag(2, clientRouteRule.is_supported_on_latest_version) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientRoutingConfig.ClientRouteRule clientRouteRule = (ClientRoutingConfig.ClientRouteRule) obj;
        clientRouteRule.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientRouteRule.path_regex;
        Boolean bool = clientRouteRule.is_supported_on_latest_version;
        Boolean bool2 = clientRouteRule.include_raw_query_params;
        List list = clientRouteRule.required_parameter_names;
        String str2 = clientRouteRule.spec_name;
        list.getClass();
        byteString.getClass();
        return new ClientRoutingConfig.ClientRouteRule(str, bool, bool2, list, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientRoutingConfig.ClientRouteRule clientRouteRule = (ClientRoutingConfig.ClientRouteRule) obj;
        clientRouteRule.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientRouteRule.path_regex);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 2, clientRouteRule.is_supported_on_latest_version);
        protoAdapter2.encodeWithTag(protoWriter, 3, clientRouteRule.include_raw_query_params);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, clientRouteRule.required_parameter_names);
        protoAdapter.encodeWithTag(protoWriter, 5, clientRouteRule.spec_name);
        protoWriter.writeBytes(clientRouteRule.unknownFields());
    }
}
