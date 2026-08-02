package com.squareup.protos.franklin.app;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitFormRequest$ElementResult$MerchantTransactionOptionPickerResult$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult merchantTransactionOptionPickerResult = (SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult) obj;
        reverseProtoWriter.getClass();
        merchantTransactionOptionPickerResult.getClass();
        reverseProtoWriter.writeBytes(merchantTransactionOptionPickerResult.unknownFields());
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, merchantTransactionOptionPickerResult.selected_transactions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult merchantTransactionOptionPickerResult = (SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult) obj;
        merchantTransactionOptionPickerResult.getClass();
        return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, merchantTransactionOptionPickerResult.selected_transactions) + merchantTransactionOptionPickerResult.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult) obj).getClass();
        EmptyList emptyList = EmptyList.INSTANCE;
        ByteString byteString = ByteString.EMPTY;
        emptyList.getClass();
        byteString.getClass();
        return new SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult(emptyList, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult merchantTransactionOptionPickerResult = (SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult) obj;
        merchantTransactionOptionPickerResult.getClass();
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, merchantTransactionOptionPickerResult.selected_transactions);
        protoWriter.writeBytes(merchantTransactionOptionPickerResult.unknownFields());
    }
}
