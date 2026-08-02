package squareup.cash.overdraft;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Upsell$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Upsell((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OverdraftStatus.Upsell upsell = (OverdraftStatus.Upsell) obj;
        reverseProtoWriter.getClass();
        upsell.getClass();
        reverseProtoWriter.writeBytes(upsell.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, upsell.localized_body_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Upsell upsell = (OverdraftStatus.Upsell) obj;
        upsell.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, upsell.localized_body_text) + upsell.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.Upsell upsell = (OverdraftStatus.Upsell) obj;
        upsell.getClass();
        LocalizedString localizedString = upsell.localized_body_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftStatus.Upsell(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Upsell upsell = (OverdraftStatus.Upsell) obj;
        upsell.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, upsell.localized_body_text);
        protoWriter.writeBytes(upsell.unknownFields());
    }
}
