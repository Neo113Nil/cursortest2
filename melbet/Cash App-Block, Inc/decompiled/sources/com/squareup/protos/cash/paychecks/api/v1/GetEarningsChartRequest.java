package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes.dex */
public final class GetEarningsChartRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEarningsChartRequest> CREATOR;
    public final EarningsTimeFrame period;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetEarningsChartRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.GetEarningsChartRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetEarningsChartRequest((EarningsTimeFrame) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(EarningsTimeFrame.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetEarningsChartRequest getEarningsChartRequest = (GetEarningsChartRequest) obj;
                reverseProtoWriter.getClass();
                getEarningsChartRequest.getClass();
                reverseProtoWriter.writeBytes(getEarningsChartRequest.unknownFields());
                EarningsTimeFrame.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getEarningsChartRequest.period);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetEarningsChartRequest getEarningsChartRequest = (GetEarningsChartRequest) obj;
                getEarningsChartRequest.getClass();
                return EarningsTimeFrame.ADAPTER.encodedSizeWithTag(1, getEarningsChartRequest.period) + getEarningsChartRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetEarningsChartRequest getEarningsChartRequest = (GetEarningsChartRequest) obj;
                getEarningsChartRequest.getClass();
                EarningsTimeFrame earningsTimeFrame = getEarningsChartRequest.period;
                EarningsTimeFrame earningsTimeFrame2 = earningsTimeFrame != null ? (EarningsTimeFrame) EarningsTimeFrame.ADAPTER.redact(earningsTimeFrame) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetEarningsChartRequest(earningsTimeFrame2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetEarningsChartRequest getEarningsChartRequest = (GetEarningsChartRequest) obj;
                getEarningsChartRequest.getClass();
                EarningsTimeFrame.ADAPTER.encodeWithTag(protoWriter, 1, getEarningsChartRequest.period);
                protoWriter.writeBytes(getEarningsChartRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEarningsChartRequest(EarningsTimeFrame earningsTimeFrame, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.period = earningsTimeFrame;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEarningsChartRequest)) {
            return false;
        }
        GetEarningsChartRequest getEarningsChartRequest = (GetEarningsChartRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEarningsChartRequest.unknownFields()) && Intrinsics.areEqual(this.period, getEarningsChartRequest.period);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningsTimeFrame earningsTimeFrame = this.period;
        int hashCode2 = hashCode + (earningsTimeFrame != null ? earningsTimeFrame.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(27);
        builder.local_buyer = this.period;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningsTimeFrame earningsTimeFrame = this.period;
        if (earningsTimeFrame != null) {
            arrayList.add("period=" + earningsTimeFrame);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEarningsChartRequest{", "}", 0, null, null, 56);
    }
}
