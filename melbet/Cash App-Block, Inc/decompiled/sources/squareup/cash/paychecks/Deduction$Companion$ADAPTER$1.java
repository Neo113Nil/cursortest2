package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class Deduction$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Deduction((Money) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Color) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Deduction deduction = (Deduction) obj;
        reverseProtoWriter.getClass();
        deduction.getClass();
        reverseProtoWriter.writeBytes(deduction.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 5, deduction.tint_color);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, deduction.note);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, deduction.description);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, deduction.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Deduction deduction = (Deduction) obj;
        deduction.getClass();
        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(2, deduction.amount) + deduction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(5, deduction.tint_color) + protoAdapter.encodedSizeWithTag(4, deduction.note) + protoAdapter.encodedSizeWithTag(3, deduction.description) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Deduction deduction = (Deduction) obj;
        deduction.getClass();
        Money money = deduction.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LocalizedString localizedString = deduction.description;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = deduction.note;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Color color = deduction.tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Deduction(money2, localizedString2, localizedString4, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Deduction deduction = (Deduction) obj;
        deduction.getClass();
        Money.ADAPTER.encodeWithTag(protoWriter, 2, deduction.amount);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, deduction.description);
        protoAdapter.encodeWithTag(protoWriter, 4, deduction.note);
        Color.ADAPTER.encodeWithTag(protoWriter, 5, deduction.tint_color);
        protoWriter.writeBytes(deduction.unknownFields());
    }
}
