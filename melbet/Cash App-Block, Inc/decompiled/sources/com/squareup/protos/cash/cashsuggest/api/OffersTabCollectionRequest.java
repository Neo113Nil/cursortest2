package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class OffersTabCollectionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersTabCollectionRequest> CREATOR;
    public final String collection_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OffersTabCollectionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionRequest$Companion$ADAPTER$1
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
                        return new OffersTabCollectionRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                OffersTabCollectionRequest offersTabCollectionRequest = (OffersTabCollectionRequest) obj;
                reverseProtoWriter.getClass();
                offersTabCollectionRequest.getClass();
                reverseProtoWriter.writeBytes(offersTabCollectionRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, offersTabCollectionRequest.collection_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OffersTabCollectionRequest offersTabCollectionRequest = (OffersTabCollectionRequest) obj;
                offersTabCollectionRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, offersTabCollectionRequest.collection_token) + offersTabCollectionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OffersTabCollectionRequest offersTabCollectionRequest = (OffersTabCollectionRequest) obj;
                offersTabCollectionRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = offersTabCollectionRequest.collection_token;
                byteString.getClass();
                return new OffersTabCollectionRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OffersTabCollectionRequest offersTabCollectionRequest = (OffersTabCollectionRequest) obj;
                offersTabCollectionRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, offersTabCollectionRequest.collection_token);
                protoWriter.writeBytes(offersTabCollectionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersTabCollectionRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.collection_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersTabCollectionRequest)) {
            return false;
        }
        OffersTabCollectionRequest offersTabCollectionRequest = (OffersTabCollectionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), offersTabCollectionRequest.unknownFields()) && Intrinsics.areEqual(this.collection_token, offersTabCollectionRequest.collection_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.collection_token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(14);
        builder.banner_color = this.collection_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.collection_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "collection_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersTabCollectionRequest{", "}", 0, null, null, 56);
    }
}
