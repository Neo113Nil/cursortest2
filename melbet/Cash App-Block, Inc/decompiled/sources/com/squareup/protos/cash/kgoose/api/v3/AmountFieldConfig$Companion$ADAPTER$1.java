package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/AmountFieldConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AmountFieldConfig$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AmountFieldConfig((Money) obj, (Money) obj2, (Money) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AmountFieldConfig amountFieldConfig = (AmountFieldConfig) obj;
        reverseProtoWriter.getClass();
        amountFieldConfig.getClass();
        reverseProtoWriter.writeBytes(amountFieldConfig.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 4, amountFieldConfig.cta);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, amountFieldConfig.max_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, amountFieldConfig.min_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, amountFieldConfig.prefilled_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AmountFieldConfig amountFieldConfig = (AmountFieldConfig) obj;
        amountFieldConfig.getClass();
        int size$okio = amountFieldConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return LocalizedString.ADAPTER.encodedSizeWithTag(4, amountFieldConfig.cta) + protoAdapter.encodedSizeWithTag(2, amountFieldConfig.max_amount) + protoAdapter.encodedSizeWithTag(1, amountFieldConfig.min_amount) + protoAdapter.encodedSizeWithTag(3, amountFieldConfig.prefilled_amount) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AmountFieldConfig amountFieldConfig = (AmountFieldConfig) obj;
        amountFieldConfig.getClass();
        Money money = amountFieldConfig.prefilled_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = amountFieldConfig.min_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = amountFieldConfig.max_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        LocalizedString localizedString = amountFieldConfig.cta;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AmountFieldConfig(money2, money4, money6, localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AmountFieldConfig amountFieldConfig = (AmountFieldConfig) obj;
        amountFieldConfig.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, amountFieldConfig.prefilled_amount);
        protoAdapter.encodeWithTag(protoWriter, 1, amountFieldConfig.min_amount);
        protoAdapter.encodeWithTag(protoWriter, 2, amountFieldConfig.max_amount);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 4, amountFieldConfig.cta);
        protoWriter.writeBytes(amountFieldConfig.unknownFields());
    }
}
