package com.squareup.protos.lending.sync_values;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.lending.sync_values.GlobalBorrowData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GlobalBorrowData$CountrySupport$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GlobalBorrowData.CountrySupport((Country) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Country.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GlobalBorrowData.CountrySupport countrySupport = (GlobalBorrowData.CountrySupport) obj;
        reverseProtoWriter.getClass();
        countrySupport.getClass();
        reverseProtoWriter.writeBytes(countrySupport.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, countrySupport.supported_states);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 1, countrySupport.country);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GlobalBorrowData.CountrySupport countrySupport = (GlobalBorrowData.CountrySupport) obj;
        countrySupport.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, countrySupport.supported_states) + Country.ADAPTER.encodedSizeWithTag(1, countrySupport.country) + countrySupport.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GlobalBorrowData.CountrySupport countrySupport = (GlobalBorrowData.CountrySupport) obj;
        countrySupport.getClass();
        ByteString byteString = ByteString.EMPTY;
        Country country = countrySupport.country;
        List list = countrySupport.supported_states;
        list.getClass();
        byteString.getClass();
        return new GlobalBorrowData.CountrySupport(country, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GlobalBorrowData.CountrySupport countrySupport = (GlobalBorrowData.CountrySupport) obj;
        countrySupport.getClass();
        Country.ADAPTER.encodeWithTag(protoWriter, 1, countrySupport.country);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, countrySupport.supported_states);
        protoWriter.writeBytes(countrySupport.unknownFields());
    }
}
