package com.squareup.protos.cash.incidentalerts.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.favorites.Favorite;
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

/* loaded from: classes.dex */
public final class SubscribeToIncidentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubscribeToIncidentRequest> CREATOR;
    public final String incident_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubscribeToIncidentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.incidentalerts.app.v1.SubscribeToIncidentRequest$Companion$ADAPTER$1
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
                        return new SubscribeToIncidentRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubscribeToIncidentRequest subscribeToIncidentRequest = (SubscribeToIncidentRequest) obj;
                reverseProtoWriter.getClass();
                subscribeToIncidentRequest.getClass();
                reverseProtoWriter.writeBytes(subscribeToIncidentRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, subscribeToIncidentRequest.incident_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubscribeToIncidentRequest subscribeToIncidentRequest = (SubscribeToIncidentRequest) obj;
                subscribeToIncidentRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, subscribeToIncidentRequest.incident_id) + subscribeToIncidentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubscribeToIncidentRequest subscribeToIncidentRequest = (SubscribeToIncidentRequest) obj;
                subscribeToIncidentRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = subscribeToIncidentRequest.incident_id;
                byteString.getClass();
                return new SubscribeToIncidentRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubscribeToIncidentRequest subscribeToIncidentRequest = (SubscribeToIncidentRequest) obj;
                subscribeToIncidentRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, subscribeToIncidentRequest.incident_id);
                protoWriter.writeBytes(subscribeToIncidentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeToIncidentRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.incident_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscribeToIncidentRequest)) {
            return false;
        }
        SubscribeToIncidentRequest subscribeToIncidentRequest = (SubscribeToIncidentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), subscribeToIncidentRequest.unknownFields()) && Intrinsics.areEqual(this.incident_id, subscribeToIncidentRequest.incident_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.incident_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(19);
        builder.favorite_customer_token = this.incident_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.incident_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "incident_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubscribeToIncidentRequest{", "}", 0, null, null, 56);
    }
}
