package com.squareup.protos.cash.paychecks.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
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

/* loaded from: classes.dex */
public final class UpdatePayersForCustomerRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdatePayersForCustomerRequest> CREATOR;
    public final List payer_updates;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdatePayersForCustomerRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.paychecks.api.v1.UpdatePayersForCustomerRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdatePayersForCustomerRequest(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(PayerUpdate.ADAPTER.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdatePayersForCustomerRequest updatePayersForCustomerRequest = (UpdatePayersForCustomerRequest) obj;
                reverseProtoWriter.getClass();
                updatePayersForCustomerRequest.getClass();
                reverseProtoWriter.writeBytes(updatePayersForCustomerRequest.unknownFields());
                PayerUpdate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, updatePayersForCustomerRequest.payer_updates);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdatePayersForCustomerRequest updatePayersForCustomerRequest = (UpdatePayersForCustomerRequest) obj;
                updatePayersForCustomerRequest.getClass();
                return PayerUpdate.ADAPTER.asRepeated().encodedSizeWithTag(1, updatePayersForCustomerRequest.payer_updates) + updatePayersForCustomerRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdatePayersForCustomerRequest updatePayersForCustomerRequest = (UpdatePayersForCustomerRequest) obj;
                updatePayersForCustomerRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(updatePayersForCustomerRequest.payer_updates, PayerUpdate.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new UpdatePayersForCustomerRequest(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdatePayersForCustomerRequest updatePayersForCustomerRequest = (UpdatePayersForCustomerRequest) obj;
                updatePayersForCustomerRequest.getClass();
                PayerUpdate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updatePayersForCustomerRequest.payer_updates);
                protoWriter.writeBytes(updatePayersForCustomerRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePayersForCustomerRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.payer_updates = TransactorKt.immutableCopyOf("payer_updates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdatePayersForCustomerRequest)) {
            return false;
        }
        UpdatePayersForCustomerRequest updatePayersForCustomerRequest = (UpdatePayersForCustomerRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updatePayersForCustomerRequest.unknownFields()) && Intrinsics.areEqual(this.payer_updates, updatePayersForCustomerRequest.payer_updates);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.payer_updates.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(2);
        builder.pools = this.payer_updates;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.payer_updates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payer_updates=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdatePayersForCustomerRequest{", "}", 0, null, null, 56);
    }
}
