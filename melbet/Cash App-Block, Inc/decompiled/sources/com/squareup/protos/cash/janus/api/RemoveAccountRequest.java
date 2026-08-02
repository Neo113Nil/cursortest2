package com.squareup.protos.cash.janus.api;

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
public final class RemoveAccountRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoveAccountRequest> CREATOR;
    public final String account_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RemoveAccountRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.janus.api.RemoveAccountRequest$Companion$ADAPTER$1
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
                        return new RemoveAccountRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                RemoveAccountRequest removeAccountRequest = (RemoveAccountRequest) obj;
                reverseProtoWriter.getClass();
                removeAccountRequest.getClass();
                reverseProtoWriter.writeBytes(removeAccountRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, removeAccountRequest.account_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RemoveAccountRequest removeAccountRequest = (RemoveAccountRequest) obj;
                removeAccountRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, removeAccountRequest.account_id) + removeAccountRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RemoveAccountRequest removeAccountRequest = (RemoveAccountRequest) obj;
                removeAccountRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = removeAccountRequest.account_id;
                byteString.getClass();
                return new RemoveAccountRequest(str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RemoveAccountRequest removeAccountRequest = (RemoveAccountRequest) obj;
                removeAccountRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, removeAccountRequest.account_id);
                protoWriter.writeBytes(removeAccountRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveAccountRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.account_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoveAccountRequest)) {
            return false;
        }
        RemoveAccountRequest removeAccountRequest = (RemoveAccountRequest) obj;
        return Intrinsics.areEqual(unknownFields(), removeAccountRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, removeAccountRequest.account_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.account_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Favorite.Builder builder = new Favorite.Builder(25);
        builder.favorite_customer_token = this.account_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.account_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "account_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoveAccountRequest{", "}", 0, null, null, 56);
    }
}
