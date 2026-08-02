package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.BenefitsDetails;

/* loaded from: classes10.dex */
public final class BenefitsDetails$MoneyTabSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BenefitsDetails.MoneyTabSection((BenefitsDetails.State) obj, (LocalizedString) obj2, (LocalizedString) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = BenefitsDetails.State.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsDetails.MoneyTabSection moneyTabSection = (BenefitsDetails.MoneyTabSection) obj;
        reverseProtoWriter.getClass();
        moneyTabSection.getClass();
        reverseProtoWriter.writeBytes(moneyTabSection.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, moneyTabSection.client_route);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, moneyTabSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, moneyTabSection.title);
        BenefitsDetails.State.ADAPTER.encodeWithTag(reverseProtoWriter, 1, moneyTabSection.state);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsDetails.MoneyTabSection moneyTabSection = (BenefitsDetails.MoneyTabSection) obj;
        moneyTabSection.getClass();
        int encodedSizeWithTag = BenefitsDetails.State.ADAPTER.encodedSizeWithTag(1, moneyTabSection.state) + moneyTabSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(4, moneyTabSection.client_route) + protoAdapter.encodedSizeWithTag(3, moneyTabSection.subtitle) + protoAdapter.encodedSizeWithTag(2, moneyTabSection.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsDetails.MoneyTabSection moneyTabSection = (BenefitsDetails.MoneyTabSection) obj;
        moneyTabSection.getClass();
        LocalizedString localizedString = moneyTabSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = moneyTabSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        BenefitsDetails.State state = moneyTabSection.state;
        String str = moneyTabSection.client_route;
        byteString.getClass();
        return new BenefitsDetails.MoneyTabSection(state, localizedString2, localizedString4, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsDetails.MoneyTabSection moneyTabSection = (BenefitsDetails.MoneyTabSection) obj;
        moneyTabSection.getClass();
        BenefitsDetails.State.ADAPTER.encodeWithTag(protoWriter, 1, moneyTabSection.state);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, moneyTabSection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, moneyTabSection.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, moneyTabSection.client_route);
        protoWriter.writeBytes(moneyTabSection.unknownFields());
    }
}
