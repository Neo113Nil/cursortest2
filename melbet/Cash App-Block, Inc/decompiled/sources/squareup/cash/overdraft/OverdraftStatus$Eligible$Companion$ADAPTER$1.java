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
public final class OverdraftStatus$Eligible$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Eligible((LocalizedString) obj, (OverdraftStatus.ToggleButton) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.ToggleButton.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.Eligible eligible = (OverdraftStatus.Eligible) obj;
        reverseProtoWriter.getClass();
        eligible.getClass();
        reverseProtoWriter.writeBytes(eligible.unknownFields());
        OverdraftStatus.ToggleButton.ADAPTER.encodeWithTag(reverseProtoWriter, 2, eligible.toggle_button);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, eligible.localized_body_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Eligible eligible = (OverdraftStatus.Eligible) obj;
        eligible.getClass();
        return OverdraftStatus.ToggleButton.ADAPTER.encodedSizeWithTag(2, eligible.toggle_button) + LocalizedString.ADAPTER.encodedSizeWithTag(1, eligible.localized_body_text) + eligible.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.Eligible eligible = (OverdraftStatus.Eligible) obj;
        eligible.getClass();
        LocalizedString localizedString = eligible.localized_body_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        OverdraftStatus.ToggleButton toggleButton = eligible.toggle_button;
        OverdraftStatus.ToggleButton toggleButton2 = toggleButton != null ? (OverdraftStatus.ToggleButton) OverdraftStatus.ToggleButton.ADAPTER.redact(toggleButton) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftStatus.Eligible(localizedString2, toggleButton2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Eligible eligible = (OverdraftStatus.Eligible) obj;
        eligible.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, eligible.localized_body_text);
        OverdraftStatus.ToggleButton.ADAPTER.encodeWithTag(protoWriter, 2, eligible.toggle_button);
        protoWriter.writeBytes(eligible.unknownFields());
    }
}
