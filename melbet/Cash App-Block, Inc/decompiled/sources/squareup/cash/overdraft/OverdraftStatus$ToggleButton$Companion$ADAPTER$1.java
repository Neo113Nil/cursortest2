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
public final class OverdraftStatus$ToggleButton$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new OverdraftStatus.ToggleButton((LocalizedString) obj, (Boolean) obj2, (Boolean) obj3, (OverdraftStatus.Action) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.Action.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.ToggleButton toggleButton = (OverdraftStatus.ToggleButton) obj;
        reverseProtoWriter.getClass();
        toggleButton.getClass();
        reverseProtoWriter.writeBytes(toggleButton.unknownFields());
        OverdraftStatus.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, toggleButton.action);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, toggleButton.is_user_interaction_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, toggleButton.is_on);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, toggleButton.localized_header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.ToggleButton toggleButton = (OverdraftStatus.ToggleButton) obj;
        toggleButton.getClass();
        int encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(1, toggleButton.localized_header_text) + toggleButton.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return OverdraftStatus.Action.ADAPTER.encodedSizeWithTag(4, toggleButton.action) + protoAdapter.encodedSizeWithTag(3, toggleButton.is_user_interaction_enabled) + protoAdapter.encodedSizeWithTag(2, toggleButton.is_on) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.ToggleButton toggleButton = (OverdraftStatus.ToggleButton) obj;
        toggleButton.getClass();
        LocalizedString localizedString = toggleButton.localized_header_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        OverdraftStatus.Action action = toggleButton.action;
        OverdraftStatus.Action action2 = action != null ? (OverdraftStatus.Action) OverdraftStatus.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = toggleButton.is_on;
        Boolean bool2 = toggleButton.is_user_interaction_enabled;
        byteString.getClass();
        return new OverdraftStatus.ToggleButton(localizedString2, bool, bool2, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.ToggleButton toggleButton = (OverdraftStatus.ToggleButton) obj;
        toggleButton.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, toggleButton.localized_header_text);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, toggleButton.is_on);
        protoAdapter.encodeWithTag(protoWriter, 3, toggleButton.is_user_interaction_enabled);
        OverdraftStatus.Action.ADAPTER.encodeWithTag(protoWriter, 4, toggleButton.action);
        protoWriter.writeBytes(toggleButton.unknownFields());
    }
}
