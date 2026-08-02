package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class AddPaycheckTool$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AddPaycheckTool((LocalizedString) obj, (LocalizedString) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AddPaycheckTool addPaycheckTool = (AddPaycheckTool) obj;
        reverseProtoWriter.getClass();
        addPaycheckTool.getClass();
        reverseProtoWriter.writeBytes(addPaycheckTool.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, addPaycheckTool.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, addPaycheckTool.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, addPaycheckTool.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AddPaycheckTool addPaycheckTool = (AddPaycheckTool) obj;
        addPaycheckTool.getClass();
        int size$okio = addPaycheckTool.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, addPaycheckTool.client_route) + protoAdapter.encodedSizeWithTag(2, addPaycheckTool.subtitle) + protoAdapter.encodedSizeWithTag(1, addPaycheckTool.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AddPaycheckTool addPaycheckTool = (AddPaycheckTool) obj;
        addPaycheckTool.getClass();
        LocalizedString localizedString = addPaycheckTool.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = addPaycheckTool.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = addPaycheckTool.client_route;
        byteString.getClass();
        return new AddPaycheckTool(localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AddPaycheckTool addPaycheckTool = (AddPaycheckTool) obj;
        addPaycheckTool.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, addPaycheckTool.title);
        protoAdapter.encodeWithTag(protoWriter, 2, addPaycheckTool.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, addPaycheckTool.client_route);
        protoWriter.writeBytes(addPaycheckTool.unknownFields());
    }
}
