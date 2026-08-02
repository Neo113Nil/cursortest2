package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.postcard.CardModule;
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
import squareup.cash.earnings.EarningStreamIdentifier;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes.dex */
public final class GetEarningStreamsSummaryRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetEarningStreamsSummaryRequest> CREATOR;
    public final EarningsTimeFrame period;
    public final EarningStreamIdentifier stream_identifier;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetEarningStreamsSummaryRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.GetEarningStreamsSummaryRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetEarningStreamsSummaryRequest((EarningsTimeFrame) obj, (EarningStreamIdentifier) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(EarningsTimeFrame.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(EarningStreamIdentifier.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest = (GetEarningStreamsSummaryRequest) obj;
                reverseProtoWriter.getClass();
                getEarningStreamsSummaryRequest.getClass();
                reverseProtoWriter.writeBytes(getEarningStreamsSummaryRequest.unknownFields());
                EarningStreamIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getEarningStreamsSummaryRequest.stream_identifier);
                EarningsTimeFrame.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getEarningStreamsSummaryRequest.period);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest = (GetEarningStreamsSummaryRequest) obj;
                getEarningStreamsSummaryRequest.getClass();
                return EarningStreamIdentifier.ADAPTER.encodedSizeWithTag(2, getEarningStreamsSummaryRequest.stream_identifier) + EarningsTimeFrame.ADAPTER.encodedSizeWithTag(1, getEarningStreamsSummaryRequest.period) + getEarningStreamsSummaryRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest = (GetEarningStreamsSummaryRequest) obj;
                getEarningStreamsSummaryRequest.getClass();
                EarningsTimeFrame earningsTimeFrame = getEarningStreamsSummaryRequest.period;
                EarningsTimeFrame earningsTimeFrame2 = earningsTimeFrame != null ? (EarningsTimeFrame) EarningsTimeFrame.ADAPTER.redact(earningsTimeFrame) : null;
                EarningStreamIdentifier earningStreamIdentifier = getEarningStreamsSummaryRequest.stream_identifier;
                EarningStreamIdentifier earningStreamIdentifier2 = earningStreamIdentifier != null ? (EarningStreamIdentifier) EarningStreamIdentifier.ADAPTER.redact(earningStreamIdentifier) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GetEarningStreamsSummaryRequest(earningsTimeFrame2, earningStreamIdentifier2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest = (GetEarningStreamsSummaryRequest) obj;
                getEarningStreamsSummaryRequest.getClass();
                EarningsTimeFrame.ADAPTER.encodeWithTag(protoWriter, 1, getEarningStreamsSummaryRequest.period);
                EarningStreamIdentifier.ADAPTER.encodeWithTag(protoWriter, 2, getEarningStreamsSummaryRequest.stream_identifier);
                protoWriter.writeBytes(getEarningStreamsSummaryRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEarningStreamsSummaryRequest(EarningsTimeFrame earningsTimeFrame, EarningStreamIdentifier earningStreamIdentifier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.period = earningsTimeFrame;
        this.stream_identifier = earningStreamIdentifier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetEarningStreamsSummaryRequest)) {
            return false;
        }
        GetEarningStreamsSummaryRequest getEarningStreamsSummaryRequest = (GetEarningStreamsSummaryRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getEarningStreamsSummaryRequest.unknownFields()) && Intrinsics.areEqual(this.period, getEarningStreamsSummaryRequest.period) && Intrinsics.areEqual(this.stream_identifier, getEarningStreamsSummaryRequest.stream_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningsTimeFrame earningsTimeFrame = this.period;
        int hashCode2 = (hashCode + (earningsTimeFrame != null ? earningsTimeFrame.hashCode() : 0)) * 37;
        EarningStreamIdentifier earningStreamIdentifier = this.stream_identifier;
        int hashCode3 = hashCode2 + (earningStreamIdentifier != null ? earningStreamIdentifier.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(7);
        builder.f1329type = this.period;
        builder.use_case = this.stream_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningsTimeFrame earningsTimeFrame = this.period;
        if (earningsTimeFrame != null) {
            arrayList.add("period=" + earningsTimeFrame);
        }
        EarningStreamIdentifier earningStreamIdentifier = this.stream_identifier;
        if (earningStreamIdentifier != null) {
            arrayList.add("stream_identifier=" + earningStreamIdentifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetEarningStreamsSummaryRequest{", "}", 0, null, null, 56);
    }
}
