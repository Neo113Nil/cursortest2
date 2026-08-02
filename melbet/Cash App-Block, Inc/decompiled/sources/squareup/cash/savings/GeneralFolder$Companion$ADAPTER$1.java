package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class GeneralFolder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GeneralFolder((LocalizedString) obj2, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GeneralFolder generalFolder = (GeneralFolder) obj;
        reverseProtoWriter.getClass();
        generalFolder.getClass();
        reverseProtoWriter.writeBytes(generalFolder.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, generalFolder.localized_label);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, generalFolder.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GeneralFolder generalFolder = (GeneralFolder) obj;
        generalFolder.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, generalFolder.localized_label) + ProtoAdapter.STRING.encodedSizeWithTag(1, generalFolder.label) + generalFolder.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GeneralFolder generalFolder = (GeneralFolder) obj;
        generalFolder.getClass();
        LocalizedString localizedString = generalFolder.localized_label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = generalFolder.label;
        byteString.getClass();
        return new GeneralFolder(localizedString2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GeneralFolder generalFolder = (GeneralFolder) obj;
        generalFolder.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, generalFolder.label);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, generalFolder.localized_label);
        protoWriter.writeBytes(generalFolder.unknownFields());
    }
}
