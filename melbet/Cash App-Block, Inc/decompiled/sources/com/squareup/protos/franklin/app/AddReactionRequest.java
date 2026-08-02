package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.Reaction;
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
public final class AddReactionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AddReactionRequest> CREATOR;
    public final Reaction reaction;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddReactionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.AddReactionRequest$Companion$ADAPTER$1
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
                        return new AddReactionRequest((RequestContext) obj, (Reaction) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Reaction.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AddReactionRequest addReactionRequest = (AddReactionRequest) obj;
                reverseProtoWriter.getClass();
                addReactionRequest.getClass();
                reverseProtoWriter.writeBytes(addReactionRequest.unknownFields());
                Reaction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, addReactionRequest.reaction);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, addReactionRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AddReactionRequest addReactionRequest = (AddReactionRequest) obj;
                addReactionRequest.getClass();
                return Reaction.ADAPTER.encodedSizeWithTag(2, addReactionRequest.reaction) + RequestContext.ADAPTER.encodedSizeWithTag(1, addReactionRequest.request_context) + addReactionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AddReactionRequest addReactionRequest = (AddReactionRequest) obj;
                addReactionRequest.getClass();
                RequestContext requestContext = addReactionRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Reaction reaction = addReactionRequest.reaction;
                Reaction reaction2 = reaction != null ? (Reaction) Reaction.ADAPTER.redact(reaction) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new AddReactionRequest(requestContext2, reaction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AddReactionRequest addReactionRequest = (AddReactionRequest) obj;
                addReactionRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, addReactionRequest.request_context);
                Reaction.ADAPTER.encodeWithTag(protoWriter, 2, addReactionRequest.reaction);
                protoWriter.writeBytes(addReactionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddReactionRequest(RequestContext requestContext, Reaction reaction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.reaction = reaction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddReactionRequest)) {
            return false;
        }
        AddReactionRequest addReactionRequest = (AddReactionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), addReactionRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, addReactionRequest.request_context) && Intrinsics.areEqual(this.reaction, addReactionRequest.reaction);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Reaction reaction = this.reaction;
        int hashCode3 = hashCode2 + (reaction != null ? reaction.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(2);
        builder.strings = this.request_context;
        builder.recurring_deposits_dda_upsell = this.reaction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Reaction reaction = this.reaction;
        if (reaction != null) {
            arrayList.add("reaction=" + reaction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AddReactionRequest{", "}", 0, null, null, 56);
    }

    public /* synthetic */ AddReactionRequest(RequestContext requestContext, Reaction reaction) {
        this(requestContext, reaction, ByteString.EMPTY);
    }
}
