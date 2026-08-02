package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R-\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/CallToolRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/CallToolRequest;", "", "", "headersAdapter$delegate", "Lkotlin/Lazy;", "getHeadersAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "headersAdapter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallToolRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* renamed from: headersAdapter$delegate, reason: from kotlin metadata */
    private final Lazy headersAdapter;

    public CallToolRequest$Companion$ADAPTER$1(KClass kClass) {
        super(FieldEncoding.LENGTH_DELIMITED, kClass, "type.googleapis.com/squareup.cash.kgoose.api.v3.CallToolRequest", Syntax.PROTO_2, (Object) null, "squareup/cash/kgoose/api/v3/tool_endpoint_messages.proto");
        this.headersAdapter = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(7));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CallToolRequest((String) obj, (String) obj2, (String) obj3, m, (Source) obj4, (Tenancy) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                    m.putAll((Map) ((ProtoAdapter) this.headersAdapter.getValue()).decode(protoReader));
                    break;
                case 5:
                    try {
                        obj4 = Source.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    try {
                        obj5 = Tenancy.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CallToolRequest callToolRequest = (CallToolRequest) obj;
        reverseProtoWriter.getClass();
        callToolRequest.getClass();
        reverseProtoWriter.writeBytes(callToolRequest.unknownFields());
        Tenancy.ADAPTER.encodeWithTag(reverseProtoWriter, 6, callToolRequest.tenancy);
        Source.ADAPTER.encodeWithTag(reverseProtoWriter, 5, callToolRequest.source);
        ((ProtoAdapter) this.headersAdapter.getValue()).encodeWithTag(reverseProtoWriter, 4, callToolRequest.headers);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, callToolRequest.arguments_json);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, callToolRequest.tool_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, callToolRequest.extension_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CallToolRequest callToolRequest = (CallToolRequest) obj;
        callToolRequest.getClass();
        int size$okio = callToolRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Tenancy.ADAPTER.encodedSizeWithTag(6, callToolRequest.tenancy) + Source.ADAPTER.encodedSizeWithTag(5, callToolRequest.source) + ((ProtoAdapter) this.headersAdapter.getValue()).encodedSizeWithTag(4, callToolRequest.headers) + protoAdapter.encodedSizeWithTag(3, callToolRequest.arguments_json) + protoAdapter.encodedSizeWithTag(2, callToolRequest.tool_name) + protoAdapter.encodedSizeWithTag(1, callToolRequest.extension_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CallToolRequest callToolRequest = (CallToolRequest) obj;
        callToolRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = callToolRequest.extension_name;
        String str2 = callToolRequest.tool_name;
        String str3 = callToolRequest.arguments_json;
        Map<String, String> map = callToolRequest.headers;
        Source source = callToolRequest.source;
        Tenancy tenancy = callToolRequest.tenancy;
        map.getClass();
        byteString.getClass();
        return new CallToolRequest(str, str2, str3, map, source, tenancy, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CallToolRequest callToolRequest = (CallToolRequest) obj;
        callToolRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, callToolRequest.extension_name);
        protoAdapter.encodeWithTag(protoWriter, 2, callToolRequest.tool_name);
        protoAdapter.encodeWithTag(protoWriter, 3, callToolRequest.arguments_json);
        ((ProtoAdapter) this.headersAdapter.getValue()).encodeWithTag(protoWriter, 4, callToolRequest.headers);
        Source.ADAPTER.encodeWithTag(protoWriter, 5, callToolRequest.source);
        Tenancy.ADAPTER.encodeWithTag(protoWriter, 6, callToolRequest.tenancy);
        protoWriter.writeBytes(callToolRequest.unknownFields());
    }
}
