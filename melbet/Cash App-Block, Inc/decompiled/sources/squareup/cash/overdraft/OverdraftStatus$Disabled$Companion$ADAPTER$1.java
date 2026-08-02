package squareup.cash.overdraft;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Disabled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        long j;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Disabled((LocalizedString) obj, (Money) obj2, (LocalizedString) obj3, (OverdraftStatus.Button) obj4, (OverdraftStatus.ToggleButton) obj5, (LocalizedString) obj6, (Boolean) obj7, (LocalizedString) obj8, (OverdraftStatus.Disabled.Reason) obj9, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    j = beginMessage;
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    continue;
                case 2:
                    j = beginMessage;
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    continue;
                case 3:
                    j = beginMessage;
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    continue;
                case 4:
                    j = beginMessage;
                    obj4 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.Button.ADAPTER, protoReader, obj4);
                    continue;
                case 5:
                    j = beginMessage;
                    obj5 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.ToggleButton.ADAPTER, protoReader, obj5);
                    continue;
                case 6:
                    j = beginMessage;
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    continue;
                case 7:
                    j = beginMessage;
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    continue;
                case 8:
                    j = beginMessage;
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj8);
                    continue;
                case 9:
                    try {
                        obj9 = OverdraftStatus.Disabled.Reason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        j = beginMessage;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
            j = beginMessage;
            beginMessage = j;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.Disabled disabled = (OverdraftStatus.Disabled) obj;
        reverseProtoWriter.getClass();
        disabled.getClass();
        reverseProtoWriter.writeBytes(disabled.unknownFields());
        OverdraftStatus.Disabled.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 9, disabled.reason);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, disabled.localized_detailed_usage_summary_label);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, disabled.needs_alert_treatment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, disabled.localized_usage_summary_label);
        OverdraftStatus.ToggleButton.ADAPTER.encodeWithTag(reverseProtoWriter, 5, disabled.toggle_button);
        OverdraftStatus.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, disabled.repayment_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, disabled.localized_usage_subtitle);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, disabled.usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, disabled.localized_body_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Disabled disabled = (OverdraftStatus.Disabled) obj;
        disabled.getClass();
        int size$okio = disabled.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return OverdraftStatus.Disabled.Reason.ADAPTER.encodedSizeWithTag(9, disabled.reason) + protoAdapter.encodedSizeWithTag(8, disabled.localized_detailed_usage_summary_label) + ProtoAdapter.BOOL.encodedSizeWithTag(7, disabled.needs_alert_treatment) + protoAdapter.encodedSizeWithTag(6, disabled.localized_usage_summary_label) + OverdraftStatus.ToggleButton.ADAPTER.encodedSizeWithTag(5, disabled.toggle_button) + OverdraftStatus.Button.ADAPTER.encodedSizeWithTag(4, disabled.repayment_button) + protoAdapter.encodedSizeWithTag(3, disabled.localized_usage_subtitle) + Money.ADAPTER.encodedSizeWithTag(2, disabled.usage) + protoAdapter.encodedSizeWithTag(1, disabled.localized_body_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.Disabled disabled = (OverdraftStatus.Disabled) obj;
        disabled.getClass();
        LocalizedString localizedString = disabled.localized_body_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Money money = disabled.usage;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString3 = disabled.localized_usage_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        OverdraftStatus.Button button = disabled.repayment_button;
        OverdraftStatus.Button button2 = button != null ? (OverdraftStatus.Button) OverdraftStatus.Button.ADAPTER.redact(button) : null;
        OverdraftStatus.ToggleButton toggleButton = disabled.toggle_button;
        OverdraftStatus.ToggleButton toggleButton2 = toggleButton != null ? (OverdraftStatus.ToggleButton) OverdraftStatus.ToggleButton.ADAPTER.redact(toggleButton) : null;
        LocalizedString localizedString5 = disabled.localized_usage_summary_label;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = disabled.localized_detailed_usage_summary_label;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = disabled.needs_alert_treatment;
        OverdraftStatus.Disabled.Reason reason = disabled.reason;
        byteString.getClass();
        return new OverdraftStatus.Disabled(localizedString2, money2, localizedString4, button2, toggleButton2, localizedString6, bool, localizedString8, reason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Disabled disabled = (OverdraftStatus.Disabled) obj;
        disabled.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, disabled.localized_body_text);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, disabled.usage);
        protoAdapter.encodeWithTag(protoWriter, 3, disabled.localized_usage_subtitle);
        OverdraftStatus.Button.ADAPTER.encodeWithTag(protoWriter, 4, disabled.repayment_button);
        OverdraftStatus.ToggleButton.ADAPTER.encodeWithTag(protoWriter, 5, disabled.toggle_button);
        protoAdapter.encodeWithTag(protoWriter, 6, disabled.localized_usage_summary_label);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, disabled.needs_alert_treatment);
        protoAdapter.encodeWithTag(protoWriter, 8, disabled.localized_detailed_usage_summary_label);
        OverdraftStatus.Disabled.Reason.ADAPTER.encodeWithTag(protoWriter, 9, disabled.reason);
        protoWriter.writeBytes(disabled.unknownFields());
    }
}
