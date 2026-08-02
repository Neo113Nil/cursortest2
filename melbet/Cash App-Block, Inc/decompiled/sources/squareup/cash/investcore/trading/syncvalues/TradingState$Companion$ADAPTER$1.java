package squareup.cash.investcore.trading.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;
import squareup.cash.investcore.trading.syncvalues.TradingState;

/* loaded from: classes10.dex */
public final class TradingState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj3 = TradingState.DividendSetting.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return new TradingState(bool.booleanValue(), (TradingState.DividendSetting) obj3, (Instant) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "has_active_brokerage_account");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TradingState tradingState = (TradingState) obj;
        reverseProtoWriter.getClass();
        tradingState.getClass();
        reverseProtoWriter.writeBytes(tradingState.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 3, tradingState.brokerage_account_transfer_estimated_completion);
        TradingState.DividendSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tradingState.dividend_setting);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, Boolean.valueOf(tradingState.has_active_brokerage_account));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TradingState tradingState = (TradingState) obj;
        tradingState.getClass();
        int size$okio = tradingState.unknownFields().getSize$okio();
        return ProtoAdapter.INSTANT.encodedSizeWithTag(3, tradingState.brokerage_account_transfer_estimated_completion) + TradingState.DividendSetting.ADAPTER.encodedSizeWithTag(2, tradingState.dividend_setting) + SizeMode$EnumUnboxingLocalUtility.m(tradingState.has_active_brokerage_account, ProtoAdapter.BOOL, 1, size$okio);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TradingState tradingState = (TradingState) obj;
        tradingState.getClass();
        Instant instant = tradingState.brokerage_account_transfer_estimated_completion;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        boolean z = tradingState.has_active_brokerage_account;
        TradingState.DividendSetting dividendSetting = tradingState.dividend_setting;
        byteString.getClass();
        return new TradingState(z, dividendSetting, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TradingState tradingState = (TradingState) obj;
        tradingState.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, Boolean.valueOf(tradingState.has_active_brokerage_account));
        TradingState.DividendSetting.ADAPTER.encodeWithTag(protoWriter, 2, tradingState.dividend_setting);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 3, tradingState.brokerage_account_transfer_estimated_completion);
        protoWriter.writeBytes(tradingState.unknownFields());
    }
}
