package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningHeaderSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningHeaderSection((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningHeaderSection earningHeaderSection = (EarningHeaderSection) obj;
        reverseProtoWriter.getClass();
        earningHeaderSection.getClass();
        reverseProtoWriter.writeBytes(earningHeaderSection.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningHeaderSection.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningHeaderSection earningHeaderSection = (EarningHeaderSection) obj;
        earningHeaderSection.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, earningHeaderSection.title) + earningHeaderSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningHeaderSection earningHeaderSection = (EarningHeaderSection) obj;
        earningHeaderSection.getClass();
        LocalizedString localizedString = earningHeaderSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningHeaderSection(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningHeaderSection earningHeaderSection = (EarningHeaderSection) obj;
        earningHeaderSection.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, earningHeaderSection.title);
        protoWriter.writeBytes(earningHeaderSection.unknownFields());
    }
}
