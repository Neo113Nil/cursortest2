package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$AddOrUpdateDirectDepositSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaychecksHomeUi.AddOrUpdateDirectDepositSection((String) obj, (LocalizedString) obj2, (String) obj3, (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (PaychecksHomeUi.AddOrUpdateDirectDepositSection) obj;
        reverseProtoWriter.getClass();
        addOrUpdateDirectDepositSection.getClass();
        reverseProtoWriter.writeBytes(addOrUpdateDirectDepositSection.unknownFields());
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 5, addOrUpdateDirectDepositSection.pending_direct_deposit_info);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, addOrUpdateDirectDepositSection.denylisted_customer_client_route);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, addOrUpdateDirectDepositSection.button_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, addOrUpdateDirectDepositSection.button_client_route);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (PaychecksHomeUi.AddOrUpdateDirectDepositSection) obj;
        addOrUpdateDirectDepositSection.getClass();
        int size$okio = addOrUpdateDirectDepositSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo.ADAPTER.encodedSizeWithTag(5, addOrUpdateDirectDepositSection.pending_direct_deposit_info) + protoAdapter.encodedSizeWithTag(4, addOrUpdateDirectDepositSection.denylisted_customer_client_route) + LocalizedString.ADAPTER.encodedSizeWithTag(3, addOrUpdateDirectDepositSection.button_text) + protoAdapter.encodedSizeWithTag(2, addOrUpdateDirectDepositSection.button_client_route) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (PaychecksHomeUi.AddOrUpdateDirectDepositSection) obj;
        addOrUpdateDirectDepositSection.getClass();
        LocalizedString localizedString = addOrUpdateDirectDepositSection.button_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = addOrUpdateDirectDepositSection.pending_direct_deposit_info;
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo2 = pendingDirectDepositInfo != null ? (PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo) PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo.ADAPTER.redact(pendingDirectDepositInfo) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = addOrUpdateDirectDepositSection.button_client_route;
        String str2 = addOrUpdateDirectDepositSection.denylisted_customer_client_route;
        byteString.getClass();
        return new PaychecksHomeUi.AddOrUpdateDirectDepositSection(str, localizedString2, str2, pendingDirectDepositInfo2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (PaychecksHomeUi.AddOrUpdateDirectDepositSection) obj;
        addOrUpdateDirectDepositSection.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, addOrUpdateDirectDepositSection.button_client_route);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, addOrUpdateDirectDepositSection.button_text);
        protoAdapter.encodeWithTag(protoWriter, 4, addOrUpdateDirectDepositSection.denylisted_customer_client_route);
        PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo.ADAPTER.encodeWithTag(protoWriter, 5, addOrUpdateDirectDepositSection.pending_direct_deposit_info);
        protoWriter.writeBytes(addOrUpdateDirectDepositSection.unknownFields());
    }
}
