package com.squareup.protos.cash.aegis.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.CustomLimit;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetCustomLimitsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetCustomLimitsResponse((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CustomLimit.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetCustomLimitsResponse setCustomLimitsResponse = (SetCustomLimitsResponse) obj;
        reverseProtoWriter.getClass();
        setCustomLimitsResponse.getClass();
        reverseProtoWriter.writeBytes(setCustomLimitsResponse.unknownFields());
        CustomLimit.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, setCustomLimitsResponse.custom_limits);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setCustomLimitsResponse.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetCustomLimitsResponse setCustomLimitsResponse = (SetCustomLimitsResponse) obj;
        setCustomLimitsResponse.getClass();
        return CustomLimit.ADAPTER.asRepeated().encodedSizeWithTag(2, setCustomLimitsResponse.custom_limits) + ProtoAdapter.STRING.encodedSizeWithTag(1, setCustomLimitsResponse.customer_token) + setCustomLimitsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetCustomLimitsResponse setCustomLimitsResponse = (SetCustomLimitsResponse) obj;
        setCustomLimitsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(setCustomLimitsResponse.custom_limits, CustomLimit.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = setCustomLimitsResponse.customer_token;
        byteString.getClass();
        return new SetCustomLimitsResponse(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetCustomLimitsResponse setCustomLimitsResponse = (SetCustomLimitsResponse) obj;
        setCustomLimitsResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setCustomLimitsResponse.customer_token);
        CustomLimit.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, setCustomLimitsResponse.custom_limits);
        protoWriter.writeBytes(setCustomLimitsResponse.unknownFields());
    }
}
