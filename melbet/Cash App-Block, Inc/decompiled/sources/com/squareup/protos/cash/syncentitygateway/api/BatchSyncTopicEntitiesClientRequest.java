package com.squareup.protos.cash.syncentitygateway.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes.dex */
public final class BatchSyncTopicEntitiesClientRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchSyncTopicEntitiesClientRequest> CREATOR;
    public final List all_known_ranges;
    public final List requests;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BatchSyncTopicEntitiesClientRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.syncentitygateway.api.BatchSyncTopicEntitiesClientRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new BatchSyncTopicEntitiesClientRequest(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(SyncTopicEntitiesClientRequest.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BatchSyncTopicEntitiesClientRequest batchSyncTopicEntitiesClientRequest = (BatchSyncTopicEntitiesClientRequest) obj;
                reverseProtoWriter.getClass();
                batchSyncTopicEntitiesClientRequest.getClass();
                reverseProtoWriter.writeBytes(batchSyncTopicEntitiesClientRequest.unknownFields());
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 2, batchSyncTopicEntitiesClientRequest.all_known_ranges);
                SyncTopicEntitiesClientRequest.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, batchSyncTopicEntitiesClientRequest.requests);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BatchSyncTopicEntitiesClientRequest batchSyncTopicEntitiesClientRequest = (BatchSyncTopicEntitiesClientRequest) obj;
                batchSyncTopicEntitiesClientRequest.getClass();
                return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(2, batchSyncTopicEntitiesClientRequest.all_known_ranges) + SyncTopicEntitiesClientRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, batchSyncTopicEntitiesClientRequest.requests) + batchSyncTopicEntitiesClientRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BatchSyncTopicEntitiesClientRequest batchSyncTopicEntitiesClientRequest = (BatchSyncTopicEntitiesClientRequest) obj;
                batchSyncTopicEntitiesClientRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(batchSyncTopicEntitiesClientRequest.requests, SyncTopicEntitiesClientRequest.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                List list = batchSyncTopicEntitiesClientRequest.all_known_ranges;
                list.getClass();
                byteString.getClass();
                return new BatchSyncTopicEntitiesClientRequest(m1169redactElements, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BatchSyncTopicEntitiesClientRequest batchSyncTopicEntitiesClientRequest = (BatchSyncTopicEntitiesClientRequest) obj;
                batchSyncTopicEntitiesClientRequest.getClass();
                SyncTopicEntitiesClientRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchSyncTopicEntitiesClientRequest.requests);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 2, batchSyncTopicEntitiesClientRequest.all_known_ranges);
                protoWriter.writeBytes(batchSyncTopicEntitiesClientRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchSyncTopicEntitiesClientRequest(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.requests = TransactorKt.immutableCopyOf("requests", list);
        this.all_known_ranges = TransactorKt.immutableCopyOf("all_known_ranges", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchSyncTopicEntitiesClientRequest)) {
            return false;
        }
        BatchSyncTopicEntitiesClientRequest batchSyncTopicEntitiesClientRequest = (BatchSyncTopicEntitiesClientRequest) obj;
        return Intrinsics.areEqual(unknownFields(), batchSyncTopicEntitiesClientRequest.unknownFields()) && Intrinsics.areEqual(this.requests, batchSyncTopicEntitiesClientRequest.requests) && Intrinsics.areEqual(this.all_known_ranges, batchSyncTopicEntitiesClientRequest.all_known_ranges);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.all_known_ranges.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.requests);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(13);
        builder.card_holder_benefits = this.requests;
        builder.green_status_benefits = this.all_known_ranges;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("requests=", arrayList, list);
        }
        List list2 = this.all_known_ranges;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("all_known_ranges=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchSyncTopicEntitiesClientRequest{", "}", 0, null, null, 56);
    }
}
