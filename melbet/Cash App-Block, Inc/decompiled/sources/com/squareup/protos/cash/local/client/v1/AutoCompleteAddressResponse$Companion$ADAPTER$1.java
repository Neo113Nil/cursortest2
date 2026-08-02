package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.squareup.protos.cash.local.client.v1.AutoCompleteAddressResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AutoCompleteAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzhk zzhkVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AutoCompleteAddressResponse(zzhkVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzhkVar = new AutoCompleteAddressResponse$Response$Success((AutoCompleteAddressResponse.Success) AutoCompleteAddressResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzhkVar = new AutoCompleteAddressResponse$Response$ErrorResponse((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AutoCompleteAddressResponse autoCompleteAddressResponse = (AutoCompleteAddressResponse) obj;
        reverseProtoWriter.getClass();
        autoCompleteAddressResponse.getClass();
        reverseProtoWriter.writeBytes(autoCompleteAddressResponse.unknownFields());
        zzhk zzhkVar = autoCompleteAddressResponse.response;
        if (zzhkVar instanceof AutoCompleteAddressResponse$Response$Success) {
            AutoCompleteAddressResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AutoCompleteAddressResponse$Response$Success) zzhkVar).value);
        } else if (zzhkVar instanceof AutoCompleteAddressResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AutoCompleteAddressResponse$Response$ErrorResponse) zzhkVar).value);
        } else {
            if (zzhkVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        AutoCompleteAddressResponse autoCompleteAddressResponse = (AutoCompleteAddressResponse) obj;
        autoCompleteAddressResponse.getClass();
        int size$okio = autoCompleteAddressResponse.unknownFields().getSize$okio();
        zzhk zzhkVar = autoCompleteAddressResponse.response;
        if (zzhkVar instanceof AutoCompleteAddressResponse$Response$Success) {
            encodedSizeWithTag = AutoCompleteAddressResponse.Success.ADAPTER.encodedSizeWithTag(1, ((AutoCompleteAddressResponse$Response$Success) zzhkVar).value);
        } else {
            if (!(zzhkVar instanceof AutoCompleteAddressResponse$Response$ErrorResponse)) {
                if (zzhkVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, ((AutoCompleteAddressResponse$Response$ErrorResponse) zzhkVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AutoCompleteAddressResponse autoCompleteAddressResponse = (AutoCompleteAddressResponse) obj;
        autoCompleteAddressResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzhk zzhkVar = autoCompleteAddressResponse.response;
        byteString.getClass();
        return new AutoCompleteAddressResponse(zzhkVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AutoCompleteAddressResponse autoCompleteAddressResponse = (AutoCompleteAddressResponse) obj;
        autoCompleteAddressResponse.getClass();
        zzhk zzhkVar = autoCompleteAddressResponse.response;
        if (zzhkVar instanceof AutoCompleteAddressResponse$Response$Success) {
            AutoCompleteAddressResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((AutoCompleteAddressResponse$Response$Success) zzhkVar).value);
        } else if (zzhkVar instanceof AutoCompleteAddressResponse$Response$ErrorResponse) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((AutoCompleteAddressResponse$Response$ErrorResponse) zzhkVar).value);
        } else if (zzhkVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(autoCompleteAddressResponse.unknownFields());
    }
}
