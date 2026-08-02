package com.squareup.protos.cash.moneta.api.v1_0;

import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_common.zzka;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectInstrumentRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzka zzkaVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectInstrumentRequest((RequestContext) obj, (ByteString) obj2, zzkaVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag == 3) {
                zzkaVar = new SelectInstrumentRequest$AdditionalParams$ApplePayPayload((SelectInstrumentRequest.ApplePayPayload) SelectInstrumentRequest.ApplePayPayload.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkaVar = new SelectInstrumentRequest$AdditionalParams$GooglePayPayload((SelectInstrumentRequest.GooglePayPayload) SelectInstrumentRequest.GooglePayPayload.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
        reverseProtoWriter.getClass();
        selectInstrumentRequest.getClass();
        reverseProtoWriter.writeBytes(selectInstrumentRequest.unknownFields());
        zzka zzkaVar = selectInstrumentRequest.additional_params;
        if (zzkaVar instanceof SelectInstrumentRequest$AdditionalParams$ApplePayPayload) {
            SelectInstrumentRequest.ApplePayPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SelectInstrumentRequest$AdditionalParams$ApplePayPayload) zzkaVar).value);
        } else if (zzkaVar instanceof SelectInstrumentRequest$AdditionalParams$GooglePayPayload) {
            SelectInstrumentRequest.GooglePayPayload.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SelectInstrumentRequest$AdditionalParams$GooglePayPayload) zzkaVar).value);
        } else if (zzkaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, selectInstrumentRequest.encoded_selected_option);
        RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, selectInstrumentRequest.request_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
        selectInstrumentRequest.getClass();
        int encodedSizeWithTag2 = ProtoAdapter.BYTES.encodedSizeWithTag(2, selectInstrumentRequest.encoded_selected_option) + RequestContext.ADAPTER.encodedSizeWithTag(1, selectInstrumentRequest.request_context) + selectInstrumentRequest.unknownFields().getSize$okio();
        zzka zzkaVar = selectInstrumentRequest.additional_params;
        if (zzkaVar instanceof SelectInstrumentRequest$AdditionalParams$ApplePayPayload) {
            encodedSizeWithTag = SelectInstrumentRequest.ApplePayPayload.ADAPTER.encodedSizeWithTag(3, ((SelectInstrumentRequest$AdditionalParams$ApplePayPayload) zzkaVar).value);
        } else {
            if (!(zzkaVar instanceof SelectInstrumentRequest$AdditionalParams$GooglePayPayload)) {
                if (zzkaVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = SelectInstrumentRequest.GooglePayPayload.ADAPTER.encodedSizeWithTag(4, ((SelectInstrumentRequest$AdditionalParams$GooglePayPayload) zzkaVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
        selectInstrumentRequest.getClass();
        RequestContext requestContext = selectInstrumentRequest.request_context;
        RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = selectInstrumentRequest.encoded_selected_option;
        zzka zzkaVar = selectInstrumentRequest.additional_params;
        byteString.getClass();
        return new SelectInstrumentRequest(requestContext2, byteString2, zzkaVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectInstrumentRequest selectInstrumentRequest = (SelectInstrumentRequest) obj;
        selectInstrumentRequest.getClass();
        RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, selectInstrumentRequest.request_context);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, selectInstrumentRequest.encoded_selected_option);
        zzka zzkaVar = selectInstrumentRequest.additional_params;
        if (zzkaVar instanceof SelectInstrumentRequest$AdditionalParams$ApplePayPayload) {
            SelectInstrumentRequest.ApplePayPayload.ADAPTER.encodeWithTag(protoWriter, 3, ((SelectInstrumentRequest$AdditionalParams$ApplePayPayload) zzkaVar).value);
        } else if (zzkaVar instanceof SelectInstrumentRequest$AdditionalParams$GooglePayPayload) {
            SelectInstrumentRequest.GooglePayPayload.ADAPTER.encodeWithTag(protoWriter, 4, ((SelectInstrumentRequest$AdditionalParams$GooglePayPayload) zzkaVar).value);
        } else if (zzkaVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(selectInstrumentRequest.unknownFields());
    }
}
