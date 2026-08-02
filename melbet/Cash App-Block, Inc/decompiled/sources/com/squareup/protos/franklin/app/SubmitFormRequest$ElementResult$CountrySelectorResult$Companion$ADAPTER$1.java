package com.squareup.protos.franklin.app;

import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$CountrySelectorResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.CountrySelectorResult((Country) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Country.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CountrySelectorResult countrySelectorResult = (SubmitFormRequest.ElementResult.CountrySelectorResult) obj;
        reverseProtoWriter.getClass();
        countrySelectorResult.getClass();
        reverseProtoWriter.writeBytes(countrySelectorResult.unknownFields());
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 1, countrySelectorResult.selected_country);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.CountrySelectorResult countrySelectorResult = (SubmitFormRequest.ElementResult.CountrySelectorResult) obj;
        countrySelectorResult.getClass();
        return Country.ADAPTER.encodedSizeWithTag(1, countrySelectorResult.selected_country) + countrySelectorResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitFormRequest.ElementResult.CountrySelectorResult countrySelectorResult = (SubmitFormRequest.ElementResult.CountrySelectorResult) obj;
        countrySelectorResult.getClass();
        ByteString byteString = ByteString.EMPTY;
        Country country = countrySelectorResult.selected_country;
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.CountrySelectorResult(country, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.CountrySelectorResult countrySelectorResult = (SubmitFormRequest.ElementResult.CountrySelectorResult) obj;
        countrySelectorResult.getClass();
        Country.ADAPTER.encodeWithTag(protoWriter, 1, countrySelectorResult.selected_country);
        protoWriter.writeBytes(countrySelectorResult.unknownFields());
    }
}
