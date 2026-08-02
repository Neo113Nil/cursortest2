package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.DirectDepositBlockerBenefitsIcon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes10.dex */
public final class SavingsConfig$DirectDepositSavingsBenefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsConfig.DirectDepositSavingsBenefit((LocalizedString) obj, (DirectDepositBlockerBenefitsIcon) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = DirectDepositBlockerBenefitsIcon.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig.DirectDepositSavingsBenefit directDepositSavingsBenefit = (SavingsConfig.DirectDepositSavingsBenefit) obj;
        reverseProtoWriter.getClass();
        directDepositSavingsBenefit.getClass();
        reverseProtoWriter.writeBytes(directDepositSavingsBenefit.unknownFields());
        DirectDepositBlockerBenefitsIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 2, directDepositSavingsBenefit.icon);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, directDepositSavingsBenefit.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig.DirectDepositSavingsBenefit directDepositSavingsBenefit = (SavingsConfig.DirectDepositSavingsBenefit) obj;
        directDepositSavingsBenefit.getClass();
        return DirectDepositBlockerBenefitsIcon.ADAPTER.encodedSizeWithTag(2, directDepositSavingsBenefit.icon) + LocalizedString.ADAPTER.encodedSizeWithTag(1, directDepositSavingsBenefit.text) + directDepositSavingsBenefit.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig.DirectDepositSavingsBenefit directDepositSavingsBenefit = (SavingsConfig.DirectDepositSavingsBenefit) obj;
        directDepositSavingsBenefit.getClass();
        LocalizedString localizedString = directDepositSavingsBenefit.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        DirectDepositBlockerBenefitsIcon directDepositBlockerBenefitsIcon = directDepositSavingsBenefit.icon;
        byteString.getClass();
        return new SavingsConfig.DirectDepositSavingsBenefit(localizedString2, directDepositBlockerBenefitsIcon, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig.DirectDepositSavingsBenefit directDepositSavingsBenefit = (SavingsConfig.DirectDepositSavingsBenefit) obj;
        directDepositSavingsBenefit.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, directDepositSavingsBenefit.text);
        DirectDepositBlockerBenefitsIcon.ADAPTER.encodeWithTag(protoWriter, 2, directDepositSavingsBenefit.icon);
        protoWriter.writeBytes(directDepositSavingsBenefit.unknownFields());
    }
}
