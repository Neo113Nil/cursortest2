package squareup.cash.savings.bespoke_elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.bespoke_elements.FolderList;

/* loaded from: classes10.dex */
public final class FolderList$LocalizedTemplateString$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FolderList.LocalizedTemplateString((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FolderList.LocalizedTemplateString localizedTemplateString = (FolderList.LocalizedTemplateString) obj;
        reverseProtoWriter.getClass();
        localizedTemplateString.getClass();
        reverseProtoWriter.writeBytes(localizedTemplateString.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, localizedTemplateString.argument_count);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localizedTemplateString.web);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localizedTemplateString.ios);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localizedTemplateString.f1645android);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FolderList.LocalizedTemplateString localizedTemplateString = (FolderList.LocalizedTemplateString) obj;
        localizedTemplateString.getClass();
        int size$okio = localizedTemplateString.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(4, localizedTemplateString.argument_count) + protoAdapter.encodedSizeWithTag(3, localizedTemplateString.web) + protoAdapter.encodedSizeWithTag(2, localizedTemplateString.ios) + protoAdapter.encodedSizeWithTag(1, localizedTemplateString.f1645android) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FolderList.LocalizedTemplateString localizedTemplateString = (FolderList.LocalizedTemplateString) obj;
        localizedTemplateString.getClass();
        LocalizedString localizedString = localizedTemplateString.f1645android;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = localizedTemplateString.ios;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = localizedTemplateString.web;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = localizedTemplateString.argument_count;
        byteString.getClass();
        return new FolderList.LocalizedTemplateString(localizedString2, localizedString4, localizedString6, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FolderList.LocalizedTemplateString localizedTemplateString = (FolderList.LocalizedTemplateString) obj;
        localizedTemplateString.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, localizedTemplateString.f1645android);
        protoAdapter.encodeWithTag(protoWriter, 2, localizedTemplateString.ios);
        protoAdapter.encodeWithTag(protoWriter, 3, localizedTemplateString.web);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, localizedTemplateString.argument_count);
        protoWriter.writeBytes(localizedTemplateString.unknownFields());
    }
}
