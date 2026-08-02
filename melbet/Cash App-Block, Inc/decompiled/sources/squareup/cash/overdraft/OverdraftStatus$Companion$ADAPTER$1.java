package squareup.cash.overdraft;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        OverdraftStatus.State_ upsell;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        OverdraftStatus.State_ state_ = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus((LocalizedString) obj, (OverdraftStatus.Button) obj2, (OverdraftStatus.Button) obj3, state_, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.Button.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    upsell = new OverdraftStatus.State_.Upsell((OverdraftStatus.Upsell) OverdraftStatus.Upsell.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    upsell = new OverdraftStatus.State_.Eligible((OverdraftStatus.Eligible) OverdraftStatus.Eligible.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    upsell = new OverdraftStatus.State_.Activated((OverdraftStatus.Activated) OverdraftStatus.Activated.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    upsell = new OverdraftStatus.State_.Disabled((OverdraftStatus.Disabled) OverdraftStatus.Disabled.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    upsell = new OverdraftStatus.State_.PermanentlyDisabled((OverdraftStatus.PermanentlyDisabled) OverdraftStatus.PermanentlyDisabled.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.Button.ADAPTER, protoReader, obj3);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            state_ = upsell;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus overdraftStatus = (OverdraftStatus) obj;
        reverseProtoWriter.getClass();
        overdraftStatus.getClass();
        reverseProtoWriter.writeBytes(overdraftStatus.unknownFields());
        OverdraftStatus.State_ state_ = overdraftStatus.State;
        if (state_ instanceof OverdraftStatus.State_.Upsell) {
            OverdraftStatus.Upsell.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((OverdraftStatus.State_.Upsell) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Eligible) {
            OverdraftStatus.Eligible.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((OverdraftStatus.State_.Eligible) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Activated) {
            OverdraftStatus.Activated.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((OverdraftStatus.State_.Activated) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Disabled) {
            OverdraftStatus.Disabled.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((OverdraftStatus.State_.Disabled) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.PermanentlyDisabled) {
            OverdraftStatus.PermanentlyDisabled.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((OverdraftStatus.State_.PermanentlyDisabled) state_).value);
        } else if (state_ != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = OverdraftStatus.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, overdraftStatus.footer_button_override);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, overdraftStatus.footer_button);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overdraftStatus.localized_header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        OverdraftStatus overdraftStatus = (OverdraftStatus) obj;
        overdraftStatus.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(1, overdraftStatus.localized_header_text) + overdraftStatus.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = OverdraftStatus.Button.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(8, overdraftStatus.footer_button_override) + protoAdapter.encodedSizeWithTag(2, overdraftStatus.footer_button) + encodedSizeWithTag2;
        OverdraftStatus.State_ state_ = overdraftStatus.State;
        if (state_ instanceof OverdraftStatus.State_.Upsell) {
            encodedSizeWithTag = OverdraftStatus.Upsell.ADAPTER.encodedSizeWithTag(3, ((OverdraftStatus.State_.Upsell) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Eligible) {
            encodedSizeWithTag = OverdraftStatus.Eligible.ADAPTER.encodedSizeWithTag(4, ((OverdraftStatus.State_.Eligible) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Activated) {
            encodedSizeWithTag = OverdraftStatus.Activated.ADAPTER.encodedSizeWithTag(5, ((OverdraftStatus.State_.Activated) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Disabled) {
            encodedSizeWithTag = OverdraftStatus.Disabled.ADAPTER.encodedSizeWithTag(6, ((OverdraftStatus.State_.Disabled) state_).value);
        } else {
            if (!(state_ instanceof OverdraftStatus.State_.PermanentlyDisabled)) {
                if (state_ == null) {
                    return encodedSizeWithTag3;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = OverdraftStatus.PermanentlyDisabled.ADAPTER.encodedSizeWithTag(7, ((OverdraftStatus.State_.PermanentlyDisabled) state_).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus overdraftStatus = (OverdraftStatus) obj;
        overdraftStatus.getClass();
        LocalizedString localizedString = overdraftStatus.localized_header_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        OverdraftStatus.Button button = overdraftStatus.footer_button;
        OverdraftStatus.Button button2 = button != null ? (OverdraftStatus.Button) OverdraftStatus.Button.ADAPTER.redact(button) : null;
        OverdraftStatus.Button button3 = overdraftStatus.footer_button_override;
        OverdraftStatus.Button button4 = button3 != null ? (OverdraftStatus.Button) OverdraftStatus.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        OverdraftStatus.State_ state_ = overdraftStatus.State;
        byteString.getClass();
        return new OverdraftStatus(localizedString2, button2, button4, state_, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus overdraftStatus = (OverdraftStatus) obj;
        overdraftStatus.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, overdraftStatus.localized_header_text);
        ProtoAdapter protoAdapter = OverdraftStatus.Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, overdraftStatus.footer_button);
        protoAdapter.encodeWithTag(protoWriter, 8, overdraftStatus.footer_button_override);
        OverdraftStatus.State_ state_ = overdraftStatus.State;
        if (state_ instanceof OverdraftStatus.State_.Upsell) {
            OverdraftStatus.Upsell.ADAPTER.encodeWithTag(protoWriter, 3, ((OverdraftStatus.State_.Upsell) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Eligible) {
            OverdraftStatus.Eligible.ADAPTER.encodeWithTag(protoWriter, 4, ((OverdraftStatus.State_.Eligible) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Activated) {
            OverdraftStatus.Activated.ADAPTER.encodeWithTag(protoWriter, 5, ((OverdraftStatus.State_.Activated) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.Disabled) {
            OverdraftStatus.Disabled.ADAPTER.encodeWithTag(protoWriter, 6, ((OverdraftStatus.State_.Disabled) state_).value);
        } else if (state_ instanceof OverdraftStatus.State_.PermanentlyDisabled) {
            OverdraftStatus.PermanentlyDisabled.ADAPTER.encodeWithTag(protoWriter, 7, ((OverdraftStatus.State_.PermanentlyDisabled) state_).value);
        } else if (state_ != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(overdraftStatus.unknownFields());
    }
}
