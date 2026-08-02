package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/RecurringPaymentsConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/RecurringPaymentsConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RecurringPaymentsConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RecurringPaymentsConfig(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RecurringPaymentsConfig recurringPaymentsConfig = (RecurringPaymentsConfig) obj;
        reverseProtoWriter.getClass();
        recurringPaymentsConfig.getClass();
        reverseProtoWriter.writeBytes(recurringPaymentsConfig.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RecurringPaymentsConfig recurringPaymentsConfig = (RecurringPaymentsConfig) obj;
        recurringPaymentsConfig.getClass();
        return recurringPaymentsConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((RecurringPaymentsConfig) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RecurringPaymentsConfig(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RecurringPaymentsConfig recurringPaymentsConfig = (RecurringPaymentsConfig) obj;
        recurringPaymentsConfig.getClass();
        protoWriter.writeBytes(recurringPaymentsConfig.unknownFields());
    }
}
