package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ManageCustomersTool$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ManageCustomersTool((LocalizedString) obj, (LocalizedString) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ManageCustomersTool manageCustomersTool = (ManageCustomersTool) obj;
        reverseProtoWriter.getClass();
        manageCustomersTool.getClass();
        reverseProtoWriter.writeBytes(manageCustomersTool.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, manageCustomersTool.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, manageCustomersTool.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, manageCustomersTool.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ManageCustomersTool manageCustomersTool = (ManageCustomersTool) obj;
        manageCustomersTool.getClass();
        int size$okio = manageCustomersTool.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(3, manageCustomersTool.client_route) + protoAdapter.encodedSizeWithTag(2, manageCustomersTool.subtitle) + protoAdapter.encodedSizeWithTag(1, manageCustomersTool.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ManageCustomersTool manageCustomersTool = (ManageCustomersTool) obj;
        manageCustomersTool.getClass();
        LocalizedString localizedString = manageCustomersTool.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = manageCustomersTool.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = manageCustomersTool.client_route;
        byteString.getClass();
        return new ManageCustomersTool(localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ManageCustomersTool manageCustomersTool = (ManageCustomersTool) obj;
        manageCustomersTool.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, manageCustomersTool.title);
        protoAdapter.encodeWithTag(protoWriter, 2, manageCustomersTool.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, manageCustomersTool.client_route);
        protoWriter.writeBytes(manageCustomersTool.unknownFields());
    }
}
