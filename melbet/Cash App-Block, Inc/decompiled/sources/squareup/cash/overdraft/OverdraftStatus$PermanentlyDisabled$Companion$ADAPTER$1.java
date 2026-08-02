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
public final class OverdraftStatus$PermanentlyDisabled$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.PermanentlyDisabled((LocalizedString) obj, (Money) obj2, (LocalizedString) obj3, (OverdraftStatus.Button) obj4, (LocalizedString) obj5, (Boolean) obj6, (LocalizedString) obj7, (OverdraftStatus.PermanentlyDisabled.Reason) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.Button.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    try {
                        obj8 = OverdraftStatus.PermanentlyDisabled.Reason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled = (OverdraftStatus.PermanentlyDisabled) obj;
        reverseProtoWriter.getClass();
        permanentlyDisabled.getClass();
        reverseProtoWriter.writeBytes(permanentlyDisabled.unknownFields());
        OverdraftStatus.PermanentlyDisabled.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 8, permanentlyDisabled.reason);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, permanentlyDisabled.localized_detailed_usage_summary_label);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, permanentlyDisabled.needs_alert_treatment);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, permanentlyDisabled.localized_usage_summary_label);
        OverdraftStatus.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, permanentlyDisabled.repayment_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, permanentlyDisabled.localized_usage_subtitle);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, permanentlyDisabled.usage);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, permanentlyDisabled.localized_body_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled = (OverdraftStatus.PermanentlyDisabled) obj;
        permanentlyDisabled.getClass();
        int size$okio = permanentlyDisabled.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return OverdraftStatus.PermanentlyDisabled.Reason.ADAPTER.encodedSizeWithTag(8, permanentlyDisabled.reason) + protoAdapter.encodedSizeWithTag(7, permanentlyDisabled.localized_detailed_usage_summary_label) + ProtoAdapter.BOOL.encodedSizeWithTag(6, permanentlyDisabled.needs_alert_treatment) + protoAdapter.encodedSizeWithTag(5, permanentlyDisabled.localized_usage_summary_label) + OverdraftStatus.Button.ADAPTER.encodedSizeWithTag(4, permanentlyDisabled.repayment_button) + protoAdapter.encodedSizeWithTag(3, permanentlyDisabled.localized_usage_subtitle) + Money.ADAPTER.encodedSizeWithTag(2, permanentlyDisabled.usage) + protoAdapter.encodedSizeWithTag(1, permanentlyDisabled.localized_body_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled = (OverdraftStatus.PermanentlyDisabled) obj;
        permanentlyDisabled.getClass();
        LocalizedString localizedString = permanentlyDisabled.localized_body_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Money money = permanentlyDisabled.usage;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString3 = permanentlyDisabled.localized_usage_subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        OverdraftStatus.Button button = permanentlyDisabled.repayment_button;
        OverdraftStatus.Button button2 = button != null ? (OverdraftStatus.Button) OverdraftStatus.Button.ADAPTER.redact(button) : null;
        LocalizedString localizedString5 = permanentlyDisabled.localized_usage_summary_label;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = permanentlyDisabled.localized_detailed_usage_summary_label;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = permanentlyDisabled.needs_alert_treatment;
        OverdraftStatus.PermanentlyDisabled.Reason reason = permanentlyDisabled.reason;
        byteString.getClass();
        return new OverdraftStatus.PermanentlyDisabled(localizedString2, money2, localizedString4, button2, localizedString6, bool, localizedString8, reason, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.PermanentlyDisabled permanentlyDisabled = (OverdraftStatus.PermanentlyDisabled) obj;
        permanentlyDisabled.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, permanentlyDisabled.localized_body_text);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, permanentlyDisabled.usage);
        protoAdapter.encodeWithTag(protoWriter, 3, permanentlyDisabled.localized_usage_subtitle);
        OverdraftStatus.Button.ADAPTER.encodeWithTag(protoWriter, 4, permanentlyDisabled.repayment_button);
        protoAdapter.encodeWithTag(protoWriter, 5, permanentlyDisabled.localized_usage_summary_label);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, permanentlyDisabled.needs_alert_treatment);
        protoAdapter.encodeWithTag(protoWriter, 7, permanentlyDisabled.localized_detailed_usage_summary_label);
        OverdraftStatus.PermanentlyDisabled.Reason.ADAPTER.encodeWithTag(protoWriter, 8, permanentlyDisabled.reason);
        protoWriter.writeBytes(permanentlyDisabled.unknownFields());
    }
}
