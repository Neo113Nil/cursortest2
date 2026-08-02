package com.squareup.protos.cash.clientsync.service;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetSyncEntitiesByTargetRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSyncEntitiesByTargetRequest> CREATOR;
    public final String customer_token;
    public final List offsets;
    public final Integer target_page_size_limit;
    public final List target_specifications;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetSyncEntitiesByTargetRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetSyncEntitiesByTargetRequest((String) obj, m, (Integer) obj2, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        m.add(TargetSpecifications.ADAPTER.decode(protoReader));
                    } else if (nextTag == 4) {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = (GetSyncEntitiesByTargetRequest) obj;
                reverseProtoWriter.getClass();
                getSyncEntitiesByTargetRequest.getClass();
                reverseProtoWriter.writeBytes(getSyncEntitiesByTargetRequest.unknownFields());
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(reverseProtoWriter, 5, getSyncEntitiesByTargetRequest.offsets);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, getSyncEntitiesByTargetRequest.target_page_size_limit);
                TargetSpecifications.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, getSyncEntitiesByTargetRequest.target_specifications);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getSyncEntitiesByTargetRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = (GetSyncEntitiesByTargetRequest) obj;
                getSyncEntitiesByTargetRequest.getClass();
                return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(5, getSyncEntitiesByTargetRequest.offsets) + ProtoAdapter.INT32.encodedSizeWithTag(4, getSyncEntitiesByTargetRequest.target_page_size_limit) + TargetSpecifications.ADAPTER.asRepeated().encodedSizeWithTag(3, getSyncEntitiesByTargetRequest.target_specifications) + ProtoAdapter.STRING.encodedSizeWithTag(1, getSyncEntitiesByTargetRequest.customer_token) + getSyncEntitiesByTargetRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = (GetSyncEntitiesByTargetRequest) obj;
                getSyncEntitiesByTargetRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(getSyncEntitiesByTargetRequest.target_specifications, TargetSpecifications.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = getSyncEntitiesByTargetRequest.customer_token;
                Integer num = getSyncEntitiesByTargetRequest.target_page_size_limit;
                List list = getSyncEntitiesByTargetRequest.offsets;
                list.getClass();
                byteString.getClass();
                return new GetSyncEntitiesByTargetRequest(str, m1169redactElements, num, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = (GetSyncEntitiesByTargetRequest) obj;
                getSyncEntitiesByTargetRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getSyncEntitiesByTargetRequest.customer_token);
                TargetSpecifications.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getSyncEntitiesByTargetRequest.target_specifications);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getSyncEntitiesByTargetRequest.target_page_size_limit);
                ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 5, getSyncEntitiesByTargetRequest.offsets);
                protoWriter.writeBytes(getSyncEntitiesByTargetRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSyncEntitiesByTargetRequest(String str, List list, Integer num, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.customer_token = str;
        this.target_page_size_limit = num;
        this.target_specifications = TransactorKt.immutableCopyOf("target_specifications", list);
        this.offsets = TransactorKt.immutableCopyOf("offsets", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSyncEntitiesByTargetRequest)) {
            return false;
        }
        GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = (GetSyncEntitiesByTargetRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getSyncEntitiesByTargetRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, getSyncEntitiesByTargetRequest.customer_token) && Intrinsics.areEqual(this.target_specifications, getSyncEntitiesByTargetRequest.target_specifications) && Intrinsics.areEqual(this.target_page_size_limit, getSyncEntitiesByTargetRequest.target_page_size_limit) && Intrinsics.areEqual(this.offsets, getSyncEntitiesByTargetRequest.offsets);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.target_specifications);
        Integer num = this.target_page_size_limit;
        int hashCode2 = this.offsets.hashCode() + ((m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(22);
        builder.title = this.customer_token;
        builder.icon = this.target_specifications;
        builder.enabled = this.target_page_size_limit;
        builder.id = this.offsets;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        List list = this.target_specifications;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("target_specifications=", arrayList, list);
        }
        Integer num = this.target_page_size_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("target_page_size_limit=", num, arrayList);
        }
        List list2 = this.offsets;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("offsets=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSyncEntitiesByTargetRequest{", "}", 0, null, null, 56);
    }

    public GetSyncEntitiesByTargetRequest(String str, List list, Integer num, int i) {
        this(str, list, (i & 4) != 0 ? null : num, EmptyList.INSTANCE, ByteString.EMPTY);
    }
}
