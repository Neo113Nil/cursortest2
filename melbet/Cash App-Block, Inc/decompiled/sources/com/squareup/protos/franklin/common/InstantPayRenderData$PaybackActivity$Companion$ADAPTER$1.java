package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.InstantPayRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InstantPayRenderData$PaybackActivity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantPayRenderData.PaybackActivity(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InstantPayRenderData.InstantPayout.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstantPayRenderData.PaybackActivity paybackActivity = (InstantPayRenderData.PaybackActivity) obj;
        reverseProtoWriter.getClass();
        paybackActivity.getClass();
        reverseProtoWriter.writeBytes(paybackActivity.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, paybackActivity.employer_name);
        InstantPayRenderData.InstantPayout.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paybackActivity.past_instant_payouts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantPayRenderData.PaybackActivity paybackActivity = (InstantPayRenderData.PaybackActivity) obj;
        paybackActivity.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, paybackActivity.employer_name) + InstantPayRenderData.InstantPayout.ADAPTER.asRepeated().encodedSizeWithTag(1, paybackActivity.past_instant_payouts) + paybackActivity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantPayRenderData.PaybackActivity paybackActivity = (InstantPayRenderData.PaybackActivity) obj;
        paybackActivity.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paybackActivity.past_instant_payouts, InstantPayRenderData.InstantPayout.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = paybackActivity.employer_name;
        byteString.getClass();
        return new InstantPayRenderData.PaybackActivity(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantPayRenderData.PaybackActivity paybackActivity = (InstantPayRenderData.PaybackActivity) obj;
        paybackActivity.getClass();
        InstantPayRenderData.InstantPayout.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paybackActivity.past_instant_payouts);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, paybackActivity.employer_name);
        protoWriter.writeBytes(paybackActivity.unknownFields());
    }
}
