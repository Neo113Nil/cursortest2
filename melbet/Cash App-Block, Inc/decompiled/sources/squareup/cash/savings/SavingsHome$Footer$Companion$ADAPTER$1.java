package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.Icon;

/* loaded from: classes10.dex */
public final class SavingsHome$Footer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome.Footer((Icon) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Icon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.Footer footer = (SavingsHome.Footer) obj;
        reverseProtoWriter.getClass();
        footer.getClass();
        reverseProtoWriter.writeBytes(footer.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 2, footer.text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, footer.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.Footer footer = (SavingsHome.Footer) obj;
        footer.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(2, footer.text) + Icon.ADAPTER.encodedSizeWithTag(1, footer.icon) + footer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.Footer footer = (SavingsHome.Footer) obj;
        footer.getClass();
        LocalizedString localizedString = footer.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        Icon icon = footer.icon;
        byteString.getClass();
        return new SavingsHome.Footer(icon, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.Footer footer = (SavingsHome.Footer) obj;
        footer.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, footer.icon);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 2, footer.text);
        protoWriter.writeBytes(footer.unknownFields());
    }
}
