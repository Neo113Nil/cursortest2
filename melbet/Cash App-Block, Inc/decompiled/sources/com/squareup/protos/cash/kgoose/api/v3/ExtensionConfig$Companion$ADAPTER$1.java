package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ExtensionConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ExtensionConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtensionConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ExtensionConfig((String) obj, (String) obj2, m, (Integer) obj3, (Boolean) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    m.add(ToolConfig.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    obj3 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
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
        ExtensionConfig extensionConfig = (ExtensionConfig) obj;
        reverseProtoWriter.getClass();
        extensionConfig.getClass();
        reverseProtoWriter.writeBytes(extensionConfig.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, extensionConfig.parent_extension);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, extensionConfig.auto_picked);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, extensionConfig.version);
        ToolConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, extensionConfig.tools);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, extensionConfig.instruction);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, extensionConfig.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ExtensionConfig extensionConfig = (ExtensionConfig) obj;
        extensionConfig.getClass();
        int size$okio = extensionConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, extensionConfig.parent_extension) + ProtoAdapter.BOOL.encodedSizeWithTag(5, extensionConfig.auto_picked) + ProtoAdapter.INT32.encodedSizeWithTag(4, extensionConfig.version) + ToolConfig.ADAPTER.asRepeated().encodedSizeWithTag(3, extensionConfig.tools) + protoAdapter.encodedSizeWithTag(2, extensionConfig.instruction) + protoAdapter.encodedSizeWithTag(1, extensionConfig.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ExtensionConfig extensionConfig = (ExtensionConfig) obj;
        extensionConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(extensionConfig.tools, ToolConfig.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = extensionConfig.name;
        String str2 = extensionConfig.instruction;
        Integer num = extensionConfig.version;
        Boolean bool = extensionConfig.auto_picked;
        String str3 = extensionConfig.parent_extension;
        byteString.getClass();
        return new ExtensionConfig(str, str2, m1169redactElements, num, bool, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ExtensionConfig extensionConfig = (ExtensionConfig) obj;
        extensionConfig.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, extensionConfig.name);
        protoAdapter.encodeWithTag(protoWriter, 2, extensionConfig.instruction);
        ToolConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, extensionConfig.tools);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, extensionConfig.version);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, extensionConfig.auto_picked);
        protoAdapter.encodeWithTag(protoWriter, 6, extensionConfig.parent_extension);
        protoWriter.writeBytes(extensionConfig.unknownFields());
    }
}
