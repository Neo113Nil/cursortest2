package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes10.dex */
public final class SavingsApplet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsApplet((Boolean) obj, (SavingsCustomerActiveState) obj2, (SavingsAction) obj3, (LocalizedString) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SavingsCustomerActiveState.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(SavingsAction.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsApplet savingsApplet = (SavingsApplet) obj;
        reverseProtoWriter.getClass();
        savingsApplet.getClass();
        reverseProtoWriter.writeBytes(savingsApplet.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, savingsApplet.override_subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, savingsApplet.override_title);
        SavingsAction.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsApplet.override_action);
        SavingsCustomerActiveState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, savingsApplet.active_state);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, savingsApplet.visible);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsApplet savingsApplet = (SavingsApplet) obj;
        savingsApplet.getClass();
        int encodedSizeWithTag = SavingsAction.ADAPTER.encodedSizeWithTag(3, savingsApplet.override_action) + SavingsCustomerActiveState.ADAPTER.encodedSizeWithTag(2, savingsApplet.active_state) + ProtoAdapter.BOOL.encodedSizeWithTag(1, savingsApplet.visible) + savingsApplet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, savingsApplet.override_subtitle) + protoAdapter.encodedSizeWithTag(4, savingsApplet.override_title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsApplet savingsApplet = (SavingsApplet) obj;
        savingsApplet.getClass();
        SavingsAction savingsAction = savingsApplet.override_action;
        SavingsAction savingsAction2 = savingsAction != null ? (SavingsAction) SavingsAction.ADAPTER.redact(savingsAction) : null;
        LocalizedString localizedString = savingsApplet.override_title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = savingsApplet.override_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = savingsApplet.visible;
        SavingsCustomerActiveState savingsCustomerActiveState = savingsApplet.active_state;
        byteString.getClass();
        return new SavingsApplet(bool, savingsCustomerActiveState, savingsAction2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsApplet savingsApplet = (SavingsApplet) obj;
        savingsApplet.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, savingsApplet.visible);
        SavingsCustomerActiveState.ADAPTER.encodeWithTag(protoWriter, 2, savingsApplet.active_state);
        SavingsAction.ADAPTER.encodeWithTag(protoWriter, 3, savingsApplet.override_action);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, savingsApplet.override_title);
        protoAdapter.encodeWithTag(protoWriter, 5, savingsApplet.override_subtitle);
        protoWriter.writeBytes(savingsApplet.unknownFields());
    }
}
