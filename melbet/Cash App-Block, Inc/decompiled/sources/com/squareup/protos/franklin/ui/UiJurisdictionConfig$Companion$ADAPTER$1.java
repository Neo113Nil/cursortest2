package com.squareup.protos.franklin.ui;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiJurisdictionConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiJurisdictionConfig((CurrencyCode) obj, (Country) obj2, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = CurrencyCode.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                try {
                    obj2 = Country.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag == 3) {
                try {
                    CurrencyCode.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    Region.ADAPTER.tryDecode(protoReader, arrayList);
                } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiJurisdictionConfig uiJurisdictionConfig = (UiJurisdictionConfig) obj;
        reverseProtoWriter.getClass();
        uiJurisdictionConfig.getClass();
        reverseProtoWriter.writeBytes(uiJurisdictionConfig.unknownFields());
        Region.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, uiJurisdictionConfig.available_p2p_target_regions);
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, uiJurisdictionConfig.available_p2p_currencies);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 2, uiJurisdictionConfig.country_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiJurisdictionConfig.default_currency);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiJurisdictionConfig uiJurisdictionConfig = (UiJurisdictionConfig) obj;
        uiJurisdictionConfig.getClass();
        int size$okio = uiJurisdictionConfig.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        return Region.ADAPTER.asRepeated().encodedSizeWithTag(4, uiJurisdictionConfig.available_p2p_target_regions) + protoAdapter.asRepeated().encodedSizeWithTag(3, uiJurisdictionConfig.available_p2p_currencies) + Country.ADAPTER.encodedSizeWithTag(2, uiJurisdictionConfig.country_code) + protoAdapter.encodedSizeWithTag(1, uiJurisdictionConfig.default_currency) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiJurisdictionConfig uiJurisdictionConfig = (UiJurisdictionConfig) obj;
        uiJurisdictionConfig.getClass();
        ByteString byteString = ByteString.EMPTY;
        CurrencyCode currencyCode = uiJurisdictionConfig.default_currency;
        Country country = uiJurisdictionConfig.country_code;
        List list = uiJurisdictionConfig.available_p2p_currencies;
        List list2 = uiJurisdictionConfig.available_p2p_target_regions;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new UiJurisdictionConfig(currencyCode, country, list, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiJurisdictionConfig uiJurisdictionConfig = (UiJurisdictionConfig) obj;
        uiJurisdictionConfig.getClass();
        ProtoAdapter protoAdapter = CurrencyCode.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, uiJurisdictionConfig.default_currency);
        Country.ADAPTER.encodeWithTag(protoWriter, 2, uiJurisdictionConfig.country_code);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, uiJurisdictionConfig.available_p2p_currencies);
        Region.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, uiJurisdictionConfig.available_p2p_target_regions);
        protoWriter.writeBytes(uiJurisdictionConfig.unknownFields());
    }
}
