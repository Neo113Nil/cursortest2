package squareup.cash.overdraft;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes10.dex */
public final class OverdraftStatus$Activated$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OverdraftStatus.Activated((Money) obj, (LocalizedString) obj2, (OverdraftStatus.Button) obj3, (OverdraftStatus.ToggleButton) obj4, (LocalizedString) obj5, (LocalizedString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.Button.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(OverdraftStatus.ToggleButton.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OverdraftStatus.Activated activated = (OverdraftStatus.Activated) obj;
        reverseProtoWriter.getClass();
        activated.getClass();
        reverseProtoWriter.writeBytes(activated.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, activated.localized_detailed_usage_summary_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, activated.localized_usage_summary_label);
        OverdraftStatus.ToggleButton.ADAPTER.encodeWithTag(reverseProtoWriter, 4, activated.toggle_button);
        OverdraftStatus.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activated.repayment_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activated.localized_usage_subtitle);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 1, activated.limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OverdraftStatus.Activated activated = (OverdraftStatus.Activated) obj;
        activated.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, activated.limit) + activated.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(6, activated.localized_detailed_usage_summary_label) + protoAdapter.encodedSizeWithTag(5, activated.localized_usage_summary_label) + OverdraftStatus.ToggleButton.ADAPTER.encodedSizeWithTag(4, activated.toggle_button) + OverdraftStatus.Button.ADAPTER.encodedSizeWithTag(3, activated.repayment_button) + protoAdapter.encodedSizeWithTag(2, activated.localized_usage_subtitle) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OverdraftStatus.Activated activated = (OverdraftStatus.Activated) obj;
        activated.getClass();
        Money money = activated.limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = activated.localized_usage_subtitle;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        OverdraftStatus.Button button = activated.repayment_button;
        OverdraftStatus.Button button2 = button != null ? (OverdraftStatus.Button) OverdraftStatus.Button.ADAPTER.redact(button) : null;
        OverdraftStatus.ToggleButton toggleButton = activated.toggle_button;
        OverdraftStatus.ToggleButton toggleButton2 = toggleButton != null ? (OverdraftStatus.ToggleButton) OverdraftStatus.ToggleButton.ADAPTER.redact(toggleButton) : null;
        LocalizedString localizedString3 = activated.localized_usage_summary_label;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = activated.localized_detailed_usage_summary_label;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OverdraftStatus.Activated(money2, localizedString2, button2, toggleButton2, localizedString4, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OverdraftStatus.Activated activated = (OverdraftStatus.Activated) obj;
        activated.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 1, activated.limit);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, activated.localized_usage_subtitle);
        OverdraftStatus.Button.ADAPTER.encodeWithTag(protoWriter, 3, activated.repayment_button);
        OverdraftStatus.ToggleButton.ADAPTER.encodeWithTag(protoWriter, 4, activated.toggle_button);
        protoAdapter.encodeWithTag(protoWriter, 5, activated.localized_usage_summary_label);
        protoAdapter.encodeWithTag(protoWriter, 6, activated.localized_detailed_usage_summary_label);
        protoWriter.writeBytes(activated.unknownFields());
    }
}
