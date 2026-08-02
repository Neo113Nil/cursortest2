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
public final class InstantPayRenderData$PayoutActivity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InstantPayRenderData.PayoutActivity(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InstantPayRenderData.Paycheck.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InstantPayRenderData.PayoutActivity payoutActivity = (InstantPayRenderData.PayoutActivity) obj;
        reverseProtoWriter.getClass();
        payoutActivity.getClass();
        reverseProtoWriter.writeBytes(payoutActivity.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, payoutActivity.employer_name);
        InstantPayRenderData.Paycheck.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, payoutActivity.paychecks_to_deduct_from);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InstantPayRenderData.PayoutActivity payoutActivity = (InstantPayRenderData.PayoutActivity) obj;
        payoutActivity.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, payoutActivity.employer_name) + InstantPayRenderData.Paycheck.ADAPTER.asRepeated().encodedSizeWithTag(1, payoutActivity.paychecks_to_deduct_from) + payoutActivity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InstantPayRenderData.PayoutActivity payoutActivity = (InstantPayRenderData.PayoutActivity) obj;
        payoutActivity.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(payoutActivity.paychecks_to_deduct_from, InstantPayRenderData.Paycheck.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = payoutActivity.employer_name;
        byteString.getClass();
        return new InstantPayRenderData.PayoutActivity(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InstantPayRenderData.PayoutActivity payoutActivity = (InstantPayRenderData.PayoutActivity) obj;
        payoutActivity.getClass();
        InstantPayRenderData.Paycheck.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, payoutActivity.paychecks_to_deduct_from);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, payoutActivity.employer_name);
        protoWriter.writeBytes(payoutActivity.unknownFields());
    }
}
