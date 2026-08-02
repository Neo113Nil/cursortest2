package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;
import squareup.cash.paychecks.Paycheck;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/PaycheckRow$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaycheckRow$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaycheckRow((Paycheck) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Paycheck.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaycheckRow paycheckRow = (PaycheckRow) obj;
        reverseProtoWriter.getClass();
        paycheckRow.getClass();
        reverseProtoWriter.writeBytes(paycheckRow.unknownFields());
        Paycheck.ADAPTER.encodeWithTag(reverseProtoWriter, 1, paycheckRow.paycheck);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaycheckRow paycheckRow = (PaycheckRow) obj;
        paycheckRow.getClass();
        return Paycheck.ADAPTER.encodedSizeWithTag(1, paycheckRow.paycheck) + paycheckRow.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaycheckRow paycheckRow = (PaycheckRow) obj;
        paycheckRow.getClass();
        Paycheck paycheck = paycheckRow.paycheck;
        Paycheck paycheck2 = paycheck != null ? (Paycheck) Paycheck.ADAPTER.redact(paycheck) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaycheckRow(paycheck2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaycheckRow paycheckRow = (PaycheckRow) obj;
        paycheckRow.getClass();
        Paycheck.ADAPTER.encodeWithTag(protoWriter, 1, paycheckRow.paycheck);
        protoWriter.writeBytes(paycheckRow.unknownFields());
    }
}
