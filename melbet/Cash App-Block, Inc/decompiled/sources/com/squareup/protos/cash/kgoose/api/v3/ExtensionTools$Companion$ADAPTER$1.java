package com.squareup.protos.cash.kgoose.api.v3;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ExtensionTools$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionTools;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionTools$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ExtensionTools((Boolean) obj2, (String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ExtensionTools extensionTools = (ExtensionTools) obj;
        reverseProtoWriter.getClass();
        extensionTools.getClass();
        reverseProtoWriter.writeBytes(extensionTools.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, extensionTools.auto_picked);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, extensionTools.tool_names);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, extensionTools.extension_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExtensionTools extensionTools = (ExtensionTools) obj;
        extensionTools.getClass();
        int size$okio = extensionTools.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, extensionTools.auto_picked) + protoAdapter.asRepeated().encodedSizeWithTag(2, extensionTools.tool_names) + protoAdapter.encodedSizeWithTag(1, extensionTools.extension_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExtensionTools extensionTools = (ExtensionTools) obj;
        extensionTools.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = extensionTools.extension_name;
        List<String> list = extensionTools.tool_names;
        Boolean bool = extensionTools.auto_picked;
        list.getClass();
        byteString.getClass();
        return new ExtensionTools(bool, str, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExtensionTools extensionTools = (ExtensionTools) obj;
        extensionTools.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, extensionTools.extension_name);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, extensionTools.tool_names);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, extensionTools.auto_picked);
        protoWriter.writeBytes(extensionTools.unknownFields());
    }
}
