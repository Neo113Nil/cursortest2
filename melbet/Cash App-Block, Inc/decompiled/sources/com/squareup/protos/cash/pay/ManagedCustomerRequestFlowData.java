package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ManagedCustomerRequestFlowData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ManagedCustomerRequestFlowData> CREATOR;
    public final String payload;
    public final Map payloadMap;
    public final String source;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ManagedCustomerRequestFlowData.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.pay.ManagedCustomerRequestFlowData$Companion$ADAPTER$1
            public final Lazy payloadMapAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.payloadMapAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(24));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ManagedCustomerRequestFlowData((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.putAll((Map) ((ProtoAdapter) this.payloadMapAdapter$delegate.getValue()).decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ManagedCustomerRequestFlowData managedCustomerRequestFlowData = (ManagedCustomerRequestFlowData) obj;
                reverseProtoWriter.getClass();
                managedCustomerRequestFlowData.getClass();
                reverseProtoWriter.writeBytes(managedCustomerRequestFlowData.unknownFields());
                ((ProtoAdapter) this.payloadMapAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 3, managedCustomerRequestFlowData.payloadMap);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, managedCustomerRequestFlowData.payload);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, managedCustomerRequestFlowData.source);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ManagedCustomerRequestFlowData managedCustomerRequestFlowData = (ManagedCustomerRequestFlowData) obj;
                managedCustomerRequestFlowData.getClass();
                int size$okio = managedCustomerRequestFlowData.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ((ProtoAdapter) this.payloadMapAdapter$delegate.getValue()).encodedSizeWithTag(3, managedCustomerRequestFlowData.payloadMap) + protoAdapter2.encodedSizeWithTag(2, managedCustomerRequestFlowData.payload) + protoAdapter2.encodedSizeWithTag(1, managedCustomerRequestFlowData.source) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ManagedCustomerRequestFlowData managedCustomerRequestFlowData = (ManagedCustomerRequestFlowData) obj;
                managedCustomerRequestFlowData.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = managedCustomerRequestFlowData.source;
                String str2 = managedCustomerRequestFlowData.payload;
                Map map = managedCustomerRequestFlowData.payloadMap;
                map.getClass();
                byteString.getClass();
                return new ManagedCustomerRequestFlowData(str, str2, map, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ManagedCustomerRequestFlowData managedCustomerRequestFlowData = (ManagedCustomerRequestFlowData) obj;
                managedCustomerRequestFlowData.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, managedCustomerRequestFlowData.source);
                protoAdapter2.encodeWithTag(protoWriter, 2, managedCustomerRequestFlowData.payload);
                ((ProtoAdapter) this.payloadMapAdapter$delegate.getValue()).encodeWithTag(protoWriter, 3, managedCustomerRequestFlowData.payloadMap);
                protoWriter.writeBytes(managedCustomerRequestFlowData.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedCustomerRequestFlowData(String str, String str2, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.source = str;
        this.payload = str2;
        this.payloadMap = TransactorKt.immutableCopyOf("payloadMap", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ManagedCustomerRequestFlowData)) {
            return false;
        }
        ManagedCustomerRequestFlowData managedCustomerRequestFlowData = (ManagedCustomerRequestFlowData) obj;
        return Intrinsics.areEqual(unknownFields(), managedCustomerRequestFlowData.unknownFields()) && Intrinsics.areEqual(this.source, managedCustomerRequestFlowData.source) && Intrinsics.areEqual(this.payload, managedCustomerRequestFlowData.payload) && Intrinsics.areEqual(this.payloadMap, managedCustomerRequestFlowData.payloadMap);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.source;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payload;
        int hashCode3 = this.payloadMap.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(21);
        builder.advertisement_data = this.source;
        builder.transmission_level = this.payload;
        builder.frequency = this.payloadMap;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.source;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source=", arrayList);
        }
        String str2 = this.payload;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payload=", arrayList);
        }
        Map map = this.payloadMap;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payloadMap=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagedCustomerRequestFlowData{", "}", 0, null, null, 56);
    }
}
