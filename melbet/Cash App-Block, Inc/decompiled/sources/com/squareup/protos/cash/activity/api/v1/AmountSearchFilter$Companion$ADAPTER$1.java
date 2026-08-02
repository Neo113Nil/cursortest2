package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/AmountSearchFilter$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/AmountSearchFilter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AmountSearchFilter$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AmountSearchFilter((Long) obj, (SearchFilterComparison) obj2, (CurrencyCode) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SearchFilterComparison.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AmountSearchFilter amountSearchFilter = (AmountSearchFilter) obj;
        reverseProtoWriter.getClass();
        amountSearchFilter.getClass();
        reverseProtoWriter.writeBytes(amountSearchFilter.unknownFields());
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, amountSearchFilter.currency);
        SearchFilterComparison.ADAPTER.encodeWithTag(reverseProtoWriter, 2, amountSearchFilter.comparison);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, amountSearchFilter.amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AmountSearchFilter amountSearchFilter = (AmountSearchFilter) obj;
        amountSearchFilter.getClass();
        return CurrencyCode.ADAPTER.encodedSizeWithTag(3, amountSearchFilter.currency) + SearchFilterComparison.ADAPTER.encodedSizeWithTag(2, amountSearchFilter.comparison) + ProtoAdapter.INT64.encodedSizeWithTag(1, amountSearchFilter.amount) + amountSearchFilter.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AmountSearchFilter amountSearchFilter = (AmountSearchFilter) obj;
        amountSearchFilter.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = amountSearchFilter.amount;
        SearchFilterComparison searchFilterComparison = amountSearchFilter.comparison;
        CurrencyCode currencyCode = amountSearchFilter.currency;
        byteString.getClass();
        return new AmountSearchFilter(l, searchFilterComparison, currencyCode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AmountSearchFilter amountSearchFilter = (AmountSearchFilter) obj;
        amountSearchFilter.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, amountSearchFilter.amount);
        SearchFilterComparison.ADAPTER.encodeWithTag(protoWriter, 2, amountSearchFilter.comparison);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 3, amountSearchFilter.currency);
        protoWriter.writeBytes(amountSearchFilter.unknownFields());
    }
}
