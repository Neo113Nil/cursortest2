package com.squareup.protos.cash.cashlimitsxp.api.v1;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetCustomerLimitsResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerLimitsResponse$LimitsSection$LimitsCategory$ProgressBar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar((String) obj, (String) obj2, (Double) obj3, (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj4 = GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar progressBar = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) obj;
        reverseProtoWriter.getClass();
        progressBar.getClass();
        reverseProtoWriter.writeBytes(progressBar.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, progressBar.color);
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 4, progressBar.f1249type);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 3, progressBar.progress);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, progressBar.secondary_display_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, progressBar.primary_display_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar progressBar = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) obj;
        progressBar.getClass();
        int size$okio = progressBar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, progressBar.color) + GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.ADAPTER.encodedSizeWithTag(4, progressBar.f1249type) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, progressBar.progress) + protoAdapter.encodedSizeWithTag(2, progressBar.secondary_display_text) + protoAdapter.encodedSizeWithTag(1, progressBar.primary_display_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar progressBar = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) obj;
        progressBar.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = progressBar.primary_display_text;
        String str2 = progressBar.secondary_display_text;
        Double d = progressBar.progress;
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type type2 = progressBar.f1249type;
        String str3 = progressBar.color;
        byteString.getClass();
        return new GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar(str, str2, d, type2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar progressBar = (GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar) obj;
        progressBar.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, progressBar.primary_display_text);
        protoAdapter.encodeWithTag(protoWriter, 2, progressBar.secondary_display_text);
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, progressBar.progress);
        GetCustomerLimitsResponse.LimitsSection.LimitsCategory.ProgressBar.Type.ADAPTER.encodeWithTag(protoWriter, 4, progressBar.f1249type);
        protoAdapter.encodeWithTag(protoWriter, 5, progressBar.color);
        protoWriter.writeBytes(progressBar.unknownFields());
    }
}
