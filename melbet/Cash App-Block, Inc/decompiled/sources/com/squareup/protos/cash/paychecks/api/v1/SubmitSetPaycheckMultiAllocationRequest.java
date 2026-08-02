package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CopyCardNumber;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes.dex */
public final class SubmitSetPaycheckMultiAllocationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitSetPaycheckMultiAllocationRequest> CREATOR;
    public final RequestContext request_context;
    public final zzkf submit_result;

    /* loaded from: classes7.dex */
    public final class Cancel extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Cancel> CREATOR;

        static {
            SubmitSetPaycheckMultiAllocationRequest$Cancel$Companion$ADAPTER$1 submitSetPaycheckMultiAllocationRequest$Cancel$Companion$ADAPTER$1 = new SubmitSetPaycheckMultiAllocationRequest$Cancel$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Cancel.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest.Cancel", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/submit_set_paycheck_multi_allocation_blocker.proto");
            ADAPTER = submitSetPaycheckMultiAllocationRequest$Cancel$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitSetPaycheckMultiAllocationRequest$Cancel$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Cancel) && Intrinsics.areEqual(unknownFields(), ((Cancel) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CopyCardNumber.Builder builder = new CopyCardNumber.Builder(18);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Cancel{}";
        }
    }

    /* loaded from: classes7.dex */
    public final class Disable extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disable> CREATOR;
        public final AllocationDistribution allocation_distribution;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public AllocationDistribution allocation_distribution;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Disable(this.allocation_distribution, buildUnknownFields());
                    default:
                        return new SubmitAll(this.allocation_distribution, buildUnknownFields());
                }
            }
        }

        static {
            SubmitSetPaycheckMultiAllocationRequest$Disable$Companion$ADAPTER$1 submitSetPaycheckMultiAllocationRequest$Disable$Companion$ADAPTER$1 = new SubmitSetPaycheckMultiAllocationRequest$Disable$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disable.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest.Disable", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/submit_set_paycheck_multi_allocation_blocker.proto");
            ADAPTER = submitSetPaycheckMultiAllocationRequest$Disable$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitSetPaycheckMultiAllocationRequest$Disable$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disable(AllocationDistribution allocationDistribution, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.allocation_distribution = allocationDistribution;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Disable)) {
                return false;
            }
            Disable disable = (Disable) obj;
            return Intrinsics.areEqual(unknownFields(), disable.unknownFields()) && Intrinsics.areEqual(this.allocation_distribution, disable.allocation_distribution);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDistribution allocationDistribution = this.allocation_distribution;
            int hashCode2 = hashCode + (allocationDistribution != null ? allocationDistribution.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.allocation_distribution = this.allocation_distribution;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDistribution allocationDistribution = this.allocation_distribution;
            if (allocationDistribution != null) {
                arrayList.add("allocation_distribution=" + allocationDistribution);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Disable{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class SubmitAll extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SubmitAll> CREATOR;
        public final AllocationDistribution allocation_distribution;

        static {
            SubmitSetPaycheckMultiAllocationRequest$SubmitAll$Companion$ADAPTER$1 submitSetPaycheckMultiAllocationRequest$SubmitAll$Companion$ADAPTER$1 = new SubmitSetPaycheckMultiAllocationRequest$SubmitAll$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitAll.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest.SubmitAll", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/submit_set_paycheck_multi_allocation_blocker.proto");
            ADAPTER = submitSetPaycheckMultiAllocationRequest$SubmitAll$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitSetPaycheckMultiAllocationRequest$SubmitAll$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitAll(AllocationDistribution allocationDistribution, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.allocation_distribution = allocationDistribution;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubmitAll)) {
                return false;
            }
            SubmitAll submitAll = (SubmitAll) obj;
            return Intrinsics.areEqual(unknownFields(), submitAll.unknownFields()) && Intrinsics.areEqual(this.allocation_distribution, submitAll.allocation_distribution);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDistribution allocationDistribution = this.allocation_distribution;
            int hashCode2 = hashCode + (allocationDistribution != null ? allocationDistribution.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Disable.Builder builder = new Disable.Builder(1);
            builder.allocation_distribution = this.allocation_distribution;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDistribution allocationDistribution = this.allocation_distribution;
            if (allocationDistribution != null) {
                arrayList.add("allocation_distribution=" + allocationDistribution);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitAll{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class SubmitSingle extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SubmitSingle> CREATOR;
        public final AllocationDistribution allocation_distribution;
        public final Integer selected_destination_index;

        static {
            SubmitSetPaycheckMultiAllocationRequest$SubmitSingle$Companion$ADAPTER$1 submitSetPaycheckMultiAllocationRequest$SubmitSingle$Companion$ADAPTER$1 = new SubmitSetPaycheckMultiAllocationRequest$SubmitSingle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubmitSingle.class), "type.googleapis.com/squareup.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest.SubmitSingle", Syntax.PROTO_2, null, "squareup/cash/paychecks/api/v1/submit_set_paycheck_multi_allocation_blocker.proto");
            ADAPTER = submitSetPaycheckMultiAllocationRequest$SubmitSingle$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitSetPaycheckMultiAllocationRequest$SubmitSingle$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitSingle(AllocationDistribution allocationDistribution, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.allocation_distribution = allocationDistribution;
            this.selected_destination_index = num;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubmitSingle)) {
                return false;
            }
            SubmitSingle submitSingle = (SubmitSingle) obj;
            return Intrinsics.areEqual(unknownFields(), submitSingle.unknownFields()) && Intrinsics.areEqual(this.allocation_distribution, submitSingle.allocation_distribution) && Intrinsics.areEqual(this.selected_destination_index, submitSingle.selected_destination_index);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AllocationDistribution allocationDistribution = this.allocation_distribution;
            int hashCode2 = (hashCode + (allocationDistribution != null ? allocationDistribution.hashCode() : 0)) * 37;
            Integer num = this.selected_destination_index;
            int hashCode3 = hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardModule.Builder builder = new CardModule.Builder(12);
            builder.f1329type = this.allocation_distribution;
            builder.use_case = this.selected_destination_index;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AllocationDistribution allocationDistribution = this.allocation_distribution;
            if (allocationDistribution != null) {
                arrayList.add("allocation_distribution=" + allocationDistribution);
            }
            Integer num = this.selected_destination_index;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("selected_destination_index=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitSingle{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitSetPaycheckMultiAllocationRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                zzkf zzkfVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitSetPaycheckMultiAllocationRequest((RequestContext) obj, zzkfVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        zzkfVar = new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll((SubmitSetPaycheckMultiAllocationRequest.SubmitAll) SubmitSetPaycheckMultiAllocationRequest.SubmitAll.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        zzkfVar = new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle((SubmitSetPaycheckMultiAllocationRequest.SubmitSingle) SubmitSetPaycheckMultiAllocationRequest.SubmitSingle.ADAPTER.decode(protoReader));
                    } else if (nextTag == 4) {
                        zzkfVar = new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable((SubmitSetPaycheckMultiAllocationRequest.Disable) SubmitSetPaycheckMultiAllocationRequest.Disable.ADAPTER.decode(protoReader));
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzkfVar = new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel((SubmitSetPaycheckMultiAllocationRequest.Cancel) SubmitSetPaycheckMultiAllocationRequest.Cancel.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest = (SubmitSetPaycheckMultiAllocationRequest) obj;
                reverseProtoWriter.getClass();
                submitSetPaycheckMultiAllocationRequest.getClass();
                reverseProtoWriter.writeBytes(submitSetPaycheckMultiAllocationRequest.unknownFields());
                zzkf zzkfVar = submitSetPaycheckMultiAllocationRequest.submit_result;
                if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) {
                    SubmitSetPaycheckMultiAllocationRequest.SubmitAll.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) zzkfVar).value);
                } else if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) {
                    SubmitSetPaycheckMultiAllocationRequest.SubmitSingle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) zzkfVar).value);
                } else if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) {
                    SubmitSetPaycheckMultiAllocationRequest.Disable.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) zzkfVar).value);
                } else if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) {
                    SubmitSetPaycheckMultiAllocationRequest.Cancel.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) zzkfVar).value);
                } else if (zzkfVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitSetPaycheckMultiAllocationRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest = (SubmitSetPaycheckMultiAllocationRequest) obj;
                submitSetPaycheckMultiAllocationRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, submitSetPaycheckMultiAllocationRequest.request_context) + submitSetPaycheckMultiAllocationRequest.unknownFields().getSize$okio();
                zzkf zzkfVar = submitSetPaycheckMultiAllocationRequest.submit_result;
                if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) {
                    return SubmitSetPaycheckMultiAllocationRequest.SubmitAll.ADAPTER.encodedSizeWithTag(2, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) zzkfVar).value) + encodedSizeWithTag;
                }
                if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) {
                    return SubmitSetPaycheckMultiAllocationRequest.SubmitSingle.ADAPTER.encodedSizeWithTag(3, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) zzkfVar).value) + encodedSizeWithTag;
                }
                if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) {
                    return SubmitSetPaycheckMultiAllocationRequest.Disable.ADAPTER.encodedSizeWithTag(4, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) zzkfVar).value) + encodedSizeWithTag;
                }
                if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) {
                    return SubmitSetPaycheckMultiAllocationRequest.Cancel.ADAPTER.encodedSizeWithTag(5, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) zzkfVar).value) + encodedSizeWithTag;
                }
                if (zzkfVar == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest = (SubmitSetPaycheckMultiAllocationRequest) obj;
                submitSetPaycheckMultiAllocationRequest.getClass();
                RequestContext requestContext = submitSetPaycheckMultiAllocationRequest.request_context;
                return SubmitSetPaycheckMultiAllocationRequest.copy$default(submitSetPaycheckMultiAllocationRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest = (SubmitSetPaycheckMultiAllocationRequest) obj;
                submitSetPaycheckMultiAllocationRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitSetPaycheckMultiAllocationRequest.request_context);
                zzkf zzkfVar = submitSetPaycheckMultiAllocationRequest.submit_result;
                if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) {
                    SubmitSetPaycheckMultiAllocationRequest.SubmitAll.ADAPTER.encodeWithTag(protoWriter, 2, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll) zzkfVar).value);
                } else if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) {
                    SubmitSetPaycheckMultiAllocationRequest.SubmitSingle.ADAPTER.encodeWithTag(protoWriter, 3, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle) zzkfVar).value);
                } else if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) {
                    SubmitSetPaycheckMultiAllocationRequest.Disable.ADAPTER.encodeWithTag(protoWriter, 4, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable) zzkfVar).value);
                } else if (zzkfVar instanceof SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) {
                    SubmitSetPaycheckMultiAllocationRequest.Cancel.ADAPTER.encodeWithTag(protoWriter, 5, ((SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel) zzkfVar).value);
                } else if (zzkfVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(submitSetPaycheckMultiAllocationRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitSetPaycheckMultiAllocationRequest(RequestContext requestContext, zzkf zzkfVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.submit_result = zzkfVar;
    }

    public static SubmitSetPaycheckMultiAllocationRequest copy$default(SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest, RequestContext requestContext, ByteString byteString, int i) {
        zzkf zzkfVar = submitSetPaycheckMultiAllocationRequest.submit_result;
        if ((i & 4) != 0) {
            byteString = submitSetPaycheckMultiAllocationRequest.unknownFields();
        }
        submitSetPaycheckMultiAllocationRequest.getClass();
        byteString.getClass();
        return new SubmitSetPaycheckMultiAllocationRequest(requestContext, zzkfVar, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitSetPaycheckMultiAllocationRequest)) {
            return false;
        }
        SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest = (SubmitSetPaycheckMultiAllocationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitSetPaycheckMultiAllocationRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitSetPaycheckMultiAllocationRequest.request_context) && Intrinsics.areEqual(this.submit_result, submitSetPaycheckMultiAllocationRequest.submit_result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzkf zzkfVar = this.submit_result;
        int hashCode3 = hashCode2 + (zzkfVar != null ? zzkfVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(11);
        builder.f1329type = this.request_context;
        builder.use_case = this.submit_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        zzkf zzkfVar = this.submit_result;
        if (zzkfVar != null) {
            arrayList.add("submit_result=" + zzkfVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitSetPaycheckMultiAllocationRequest{", "}", 0, null, null, 56);
    }
}
