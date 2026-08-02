package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;

/* loaded from: classes10.dex */
public final class SavingsHome$TransfersSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsHome.TransfersSection((SplitButtons) obj, (SavingsHome.TransfersSection.AddCashConfig) obj2, (SavingsHome.TransfersSection.AlternativeButtonBehavior) obj3, (SavingsHome.TransfersSection.AlternativeButtonBehavior) obj4, (SavingsHome.TransfersSection.TransferOutConfig) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(SplitButtons.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(SavingsHome.TransfersSection.AddCashConfig.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                try {
                    obj3 = SavingsHome.TransfersSection.AlternativeButtonBehavior.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 5) {
                try {
                    obj4 = SavingsHome.TransfersSection.AlternativeButtonBehavior.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(SavingsHome.TransfersSection.TransferOutConfig.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.TransfersSection transfersSection = (SavingsHome.TransfersSection) obj;
        reverseProtoWriter.getClass();
        transfersSection.getClass();
        reverseProtoWriter.writeBytes(transfersSection.unknownFields());
        SavingsHome.TransfersSection.TransferOutConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 6, transfersSection.transfer_out_config);
        SavingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 = SavingsHome.TransfersSection.AlternativeButtonBehavior.ADAPTER;
        savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 5, transfersSection.secondary_split_button_zero_balance_behavior);
        savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 4, transfersSection.primary_split_button_zero_balance_behavior);
        SavingsHome.TransfersSection.AddCashConfig.ADAPTER.encodeWithTag(reverseProtoWriter, 3, transfersSection.add_cash_config);
        SplitButtons.ADAPTER.encodeWithTag(reverseProtoWriter, 2, transfersSection.buttons);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.TransfersSection transfersSection = (SavingsHome.TransfersSection) obj;
        transfersSection.getClass();
        int encodedSizeWithTag = SavingsHome.TransfersSection.AddCashConfig.ADAPTER.encodedSizeWithTag(3, transfersSection.add_cash_config) + SplitButtons.ADAPTER.encodedSizeWithTag(2, transfersSection.buttons) + transfersSection.unknownFields().getSize$okio();
        SavingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 = SavingsHome.TransfersSection.AlternativeButtonBehavior.ADAPTER;
        return SavingsHome.TransfersSection.TransferOutConfig.ADAPTER.encodedSizeWithTag(6, transfersSection.transfer_out_config) + savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1.encodedSizeWithTag(5, transfersSection.secondary_split_button_zero_balance_behavior) + savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1.encodedSizeWithTag(4, transfersSection.primary_split_button_zero_balance_behavior) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.TransfersSection transfersSection = (SavingsHome.TransfersSection) obj;
        transfersSection.getClass();
        SplitButtons splitButtons = transfersSection.buttons;
        SplitButtons splitButtons2 = splitButtons != null ? (SplitButtons) SplitButtons.ADAPTER.redact(splitButtons) : null;
        SavingsHome.TransfersSection.AddCashConfig addCashConfig = transfersSection.add_cash_config;
        SavingsHome.TransfersSection.AddCashConfig addCashConfig2 = addCashConfig != null ? (SavingsHome.TransfersSection.AddCashConfig) SavingsHome.TransfersSection.AddCashConfig.ADAPTER.redact(addCashConfig) : null;
        SavingsHome.TransfersSection.TransferOutConfig transferOutConfig = transfersSection.transfer_out_config;
        SavingsHome.TransfersSection.TransferOutConfig transferOutConfig2 = transferOutConfig != null ? (SavingsHome.TransfersSection.TransferOutConfig) SavingsHome.TransfersSection.TransferOutConfig.ADAPTER.redact(transferOutConfig) : null;
        ByteString byteString = ByteString.EMPTY;
        SavingsHome.TransfersSection.AlternativeButtonBehavior alternativeButtonBehavior = transfersSection.primary_split_button_zero_balance_behavior;
        SavingsHome.TransfersSection.AlternativeButtonBehavior alternativeButtonBehavior2 = transfersSection.secondary_split_button_zero_balance_behavior;
        byteString.getClass();
        return new SavingsHome.TransfersSection(splitButtons2, addCashConfig2, alternativeButtonBehavior, alternativeButtonBehavior2, transferOutConfig2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.TransfersSection transfersSection = (SavingsHome.TransfersSection) obj;
        transfersSection.getClass();
        SplitButtons.ADAPTER.encodeWithTag(protoWriter, 2, transfersSection.buttons);
        SavingsHome.TransfersSection.AddCashConfig.ADAPTER.encodeWithTag(protoWriter, 3, transfersSection.add_cash_config);
        SavingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1 = SavingsHome.TransfersSection.AlternativeButtonBehavior.ADAPTER;
        savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1.encodeWithTag(protoWriter, 4, transfersSection.primary_split_button_zero_balance_behavior);
        savingsHome$TransfersSection$AlternativeButtonBehavior$Companion$ADAPTER$1.encodeWithTag(protoWriter, 5, transfersSection.secondary_split_button_zero_balance_behavior);
        SavingsHome.TransfersSection.TransferOutConfig.ADAPTER.encodeWithTag(protoWriter, 6, transfersSection.transfer_out_config);
        protoWriter.writeBytes(transfersSection.unknownFields());
    }
}
