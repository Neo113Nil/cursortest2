package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$AddOrUpdateDirectDepositSection$HalfSheet$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet((Icon) obj2, (LocalizedString) obj, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) obj;
        reverseProtoWriter.getClass();
        halfSheet.getClass();
        reverseProtoWriter.writeBytes(halfSheet.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, halfSheet.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, halfSheet.body);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, halfSheet.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, halfSheet.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) obj;
        halfSheet.getClass();
        int size$okio = halfSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, halfSheet.button_text) + protoAdapter.encodedSizeWithTag(3, halfSheet.body) + Icon.ADAPTER.encodedSizeWithTag(2, halfSheet.icon) + protoAdapter.encodedSizeWithTag(1, halfSheet.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) obj;
        halfSheet.getClass();
        LocalizedString localizedString = halfSheet.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Icon icon = halfSheet.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString3 = halfSheet.body;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = halfSheet.button_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet(icon2, localizedString2, localizedString4, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet = (PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet) obj;
        halfSheet.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, halfSheet.title);
        Icon.ADAPTER.encodeWithTag(protoWriter, 2, halfSheet.icon);
        protoAdapter.encodeWithTag(protoWriter, 3, halfSheet.body);
        protoAdapter.encodeWithTag(protoWriter, 4, halfSheet.button_text);
        protoWriter.writeBytes(halfSheet.unknownFields());
    }
}
