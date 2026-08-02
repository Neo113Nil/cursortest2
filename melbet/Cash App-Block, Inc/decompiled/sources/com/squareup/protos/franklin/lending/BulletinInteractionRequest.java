package com.squareup.protos.franklin.lending;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.EndFlowRequest;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class BulletinInteractionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BulletinInteractionRequest> CREATOR;
    public final String bulletin_identifier;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BulletinInteractionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.lending.BulletinInteractionRequest$Companion$ADAPTER$1
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
                        return new BulletinInteractionRequest((RequestContext) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                BulletinInteractionRequest bulletinInteractionRequest = (BulletinInteractionRequest) obj;
                reverseProtoWriter.getClass();
                bulletinInteractionRequest.getClass();
                reverseProtoWriter.writeBytes(bulletinInteractionRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, bulletinInteractionRequest.bulletin_identifier);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, bulletinInteractionRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                BulletinInteractionRequest bulletinInteractionRequest = (BulletinInteractionRequest) obj;
                bulletinInteractionRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, bulletinInteractionRequest.bulletin_identifier) + RequestContext.ADAPTER.encodedSizeWithTag(1, bulletinInteractionRequest.request_context) + bulletinInteractionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                BulletinInteractionRequest bulletinInteractionRequest = (BulletinInteractionRequest) obj;
                bulletinInteractionRequest.getClass();
                RequestContext requestContext = bulletinInteractionRequest.request_context;
                return BulletinInteractionRequest.copy$default(bulletinInteractionRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                BulletinInteractionRequest bulletinInteractionRequest = (BulletinInteractionRequest) obj;
                bulletinInteractionRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, bulletinInteractionRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bulletinInteractionRequest.bulletin_identifier);
                protoWriter.writeBytes(bulletinInteractionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletinInteractionRequest(RequestContext requestContext, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.bulletin_identifier = str;
    }

    public static BulletinInteractionRequest copy$default(BulletinInteractionRequest bulletinInteractionRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = bulletinInteractionRequest.bulletin_identifier;
        if ((i & 4) != 0) {
            byteString = bulletinInteractionRequest.unknownFields();
        }
        bulletinInteractionRequest.getClass();
        byteString.getClass();
        return new BulletinInteractionRequest(requestContext, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulletinInteractionRequest)) {
            return false;
        }
        BulletinInteractionRequest bulletinInteractionRequest = (BulletinInteractionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), bulletinInteractionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, bulletinInteractionRequest.request_context) && Intrinsics.areEqual(this.bulletin_identifier, bulletinInteractionRequest.bulletin_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.bulletin_identifier;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EndFlowRequest.Builder builder = new EndFlowRequest.Builder(24);
        builder.request_context = this.request_context;
        builder.action_id = this.bulletin_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.bulletin_identifier;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "bulletin_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BulletinInteractionRequest{", "}", 0, null, null, 56);
    }
}
