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
public final class UnsubscribeFromIncidentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnsubscribeFromIncidentRequest> CREATOR;
    public final String incident_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UnsubscribeFromIncidentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.incidentalerts.app.v1.UnsubscribeFromIncidentRequest$Companion$ADAPTER$1
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
                        return new UnsubscribeFromIncidentRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest = (UnsubscribeFromIncidentRequest) obj;
                reverseProtoWriter.getClass();
                unsubscribeFromIncidentRequest.getClass();
                reverseProtoWriter.writeBytes(unsubscribeFromIncidentRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, unsubscribeFromIncidentRequest.incident_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest = (UnsubscribeFromIncidentRequest) obj;
                unsubscribeFromIncidentRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, unsubscribeFromIncidentRequest.incident_id) + unsubscribeFromIncidentRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest = (UnsubscribeFromIncidentRequest) obj;
                unsubscribeFromIncidentRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = unsubscribeFromIncidentRequest.incident_id;
                byteString.getClass();
                return new UnsubscribeFromIncidentRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest = (UnsubscribeFromIncidentRequest) obj;
                unsubscribeFromIncidentRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, unsubscribeFromIncidentRequest.incident_id);
                protoWriter.writeBytes(unsubscribeFromIncidentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsubscribeFromIncidentRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.incident_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnsubscribeFromIncidentRequest)) {
            return false;
        }
        UnsubscribeFromIncidentRequest unsubscribeFromIncidentRequest = (UnsubscribeFromIncidentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), unsubscribeFromIncidentRequest.unknownFields()) && Intrinsics.areEqual(this.incident_id, unsubscribeFromIncidentRequest.incident_id);
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
        Favorite.Builder builder = new Favorite.Builder(21);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnsubscribeFromIncidentRequest{", "}", 0, null, null, 56);
    }
}
