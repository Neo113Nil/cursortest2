package com.squareup.protos.cash.activity.api.v1;

import com.squareup.protos.common.CurrencyCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/SearchFilterAmount$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterAmount;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterAmount$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SearchFilterAmount((Long) obj, (Long) obj2, (CurrencyCode) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchFilterAmount searchFilterAmount = (SearchFilterAmount) obj;
        reverseProtoWriter.getClass();
        searchFilterAmount.getClass();
        reverseProtoWriter.writeBytes(searchFilterAmount.unknownFields());
        CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 3, searchFilterAmount.currency);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, searchFilterAmount.amount_lte_in_base_unit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, searchFilterAmount.amount_gte_in_base_unit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchFilterAmount searchFilterAmount = (SearchFilterAmount) obj;
        searchFilterAmount.getClass();
        int size$okio = searchFilterAmount.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return CurrencyCode.ADAPTER.encodedSizeWithTag(3, searchFilterAmount.currency) + protoAdapter.encodedSizeWithTag(2, searchFilterAmount.amount_lte_in_base_unit) + protoAdapter.encodedSizeWithTag(1, searchFilterAmount.amount_gte_in_base_unit) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchFilterAmount searchFilterAmount = (SearchFilterAmount) obj;
        searchFilterAmount.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = searchFilterAmount.amount_gte_in_base_unit;
        Long l2 = searchFilterAmount.amount_lte_in_base_unit;
        CurrencyCode currencyCode = searchFilterAmount.currency;
        byteString.getClass();
        return new SearchFilterAmount(l, l2, currencyCode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchFilterAmount searchFilterAmount = (SearchFilterAmount) obj;
        searchFilterAmount.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, searchFilterAmount.amount_gte_in_base_unit);
        protoAdapter.encodeWithTag(protoWriter, 2, searchFilterAmount.amount_lte_in_base_unit);
        CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 3, searchFilterAmount.currency);
        protoWriter.writeBytes(searchFilterAmount.unknownFields());
    }
}
