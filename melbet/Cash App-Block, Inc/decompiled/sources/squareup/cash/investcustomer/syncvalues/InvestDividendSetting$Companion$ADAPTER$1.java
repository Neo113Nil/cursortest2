package squareup.cash.investcustomer.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.investcustomer.syncvalues.InvestDividendSetting;

/* loaded from: classes10.dex */
public final class InvestDividendSetting$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                try {
                    obj = InvestDividendSetting.DividendSetting.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        InvestDividendSetting.DividendSetting dividendSetting = (InvestDividendSetting.DividendSetting) obj;
        if (dividendSetting != null) {
            return new InvestDividendSetting(dividendSetting, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "dividend_setting");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestDividendSetting investDividendSetting = (InvestDividendSetting) obj;
        reverseProtoWriter.getClass();
        investDividendSetting.getClass();
        reverseProtoWriter.writeBytes(investDividendSetting.unknownFields());
        InvestDividendSetting.DividendSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 1, investDividendSetting.dividend_setting);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestDividendSetting investDividendSetting = (InvestDividendSetting) obj;
        investDividendSetting.getClass();
        return InvestDividendSetting.DividendSetting.ADAPTER.encodedSizeWithTag(1, investDividendSetting.dividend_setting) + investDividendSetting.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestDividendSetting investDividendSetting = (InvestDividendSetting) obj;
        investDividendSetting.getClass();
        ByteString byteString = ByteString.EMPTY;
        InvestDividendSetting.DividendSetting dividendSetting = investDividendSetting.dividend_setting;
        dividendSetting.getClass();
        byteString.getClass();
        return new InvestDividendSetting(dividendSetting, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestDividendSetting investDividendSetting = (InvestDividendSetting) obj;
        investDividendSetting.getClass();
        InvestDividendSetting.DividendSetting.ADAPTER.encodeWithTag(protoWriter, 1, investDividendSetting.dividend_setting);
        protoWriter.writeBytes(investDividendSetting.unknownFields());
    }
}
