package com.squareup.protos.cash.papermate.app;

import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPaperCashDepositBarcodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        zzke zzkeVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPaperCashDepositBarcodeResponse(zzkeVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                zzkeVar = new GetPaperCashDepositBarcodeResponse$Result$Success((GetPaperCashDepositBarcodeResponse.Success) GetPaperCashDepositBarcodeResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzkeVar = new GetPaperCashDepositBarcodeResponse$Result$Failure((GetPaperCashDepositBarcodeResponse.Failure) GetPaperCashDepositBarcodeResponse.Failure.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse getPaperCashDepositBarcodeResponse = (GetPaperCashDepositBarcodeResponse) obj;
        reverseProtoWriter.getClass();
        getPaperCashDepositBarcodeResponse.getClass();
        reverseProtoWriter.writeBytes(getPaperCashDepositBarcodeResponse.unknownFields());
        zzke zzkeVar = getPaperCashDepositBarcodeResponse.result;
        if (zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Success) {
            GetPaperCashDepositBarcodeResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetPaperCashDepositBarcodeResponse$Result$Success) zzkeVar).value);
        } else if (zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Failure) {
            GetPaperCashDepositBarcodeResponse.Failure.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetPaperCashDepositBarcodeResponse$Result$Failure) zzkeVar).value);
        } else {
            if (zzkeVar == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GetPaperCashDepositBarcodeResponse getPaperCashDepositBarcodeResponse = (GetPaperCashDepositBarcodeResponse) obj;
        getPaperCashDepositBarcodeResponse.getClass();
        int size$okio = getPaperCashDepositBarcodeResponse.unknownFields().getSize$okio();
        zzke zzkeVar = getPaperCashDepositBarcodeResponse.result;
        if (zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Success) {
            encodedSizeWithTag = GetPaperCashDepositBarcodeResponse.Success.ADAPTER.encodedSizeWithTag(1, ((GetPaperCashDepositBarcodeResponse$Result$Success) zzkeVar).value);
        } else {
            if (!(zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Failure)) {
                if (zzkeVar == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GetPaperCashDepositBarcodeResponse.Failure.ADAPTER.encodedSizeWithTag(2, ((GetPaperCashDepositBarcodeResponse$Result$Failure) zzkeVar).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPaperCashDepositBarcodeResponse getPaperCashDepositBarcodeResponse = (GetPaperCashDepositBarcodeResponse) obj;
        getPaperCashDepositBarcodeResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        zzke zzkeVar = getPaperCashDepositBarcodeResponse.result;
        byteString.getClass();
        return new GetPaperCashDepositBarcodeResponse(zzkeVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPaperCashDepositBarcodeResponse getPaperCashDepositBarcodeResponse = (GetPaperCashDepositBarcodeResponse) obj;
        getPaperCashDepositBarcodeResponse.getClass();
        zzke zzkeVar = getPaperCashDepositBarcodeResponse.result;
        if (zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Success) {
            GetPaperCashDepositBarcodeResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((GetPaperCashDepositBarcodeResponse$Result$Success) zzkeVar).value);
        } else if (zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Failure) {
            GetPaperCashDepositBarcodeResponse.Failure.ADAPTER.encodeWithTag(protoWriter, 2, ((GetPaperCashDepositBarcodeResponse$Result$Failure) zzkeVar).value);
        } else if (zzkeVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(getPaperCashDepositBarcodeResponse.unknownFields());
    }
}
