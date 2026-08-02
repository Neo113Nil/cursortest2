package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileAlias;
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
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LinkBankAccountRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkBankAccountRequest> CREATOR;
    public final String account_number;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String routing_number;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LinkBankAccountRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.LinkBankAccountRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new LinkBankAccountRequest((RequestContext) obj, (String) obj2, (String) obj3, m, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                LinkBankAccountRequest linkBankAccountRequest = (LinkBankAccountRequest) obj;
                reverseProtoWriter.getClass();
                linkBankAccountRequest.getClass();
                reverseProtoWriter.writeBytes(linkBankAccountRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, linkBankAccountRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, linkBankAccountRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, linkBankAccountRequest.account_number);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, linkBankAccountRequest.routing_number);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, linkBankAccountRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LinkBankAccountRequest linkBankAccountRequest = (LinkBankAccountRequest) obj;
                linkBankAccountRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(5, linkBankAccountRequest.request_context) + linkBankAccountRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, linkBankAccountRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(3, linkBankAccountRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(2, linkBankAccountRequest.account_number) + protoAdapter2.encodedSizeWithTag(1, linkBankAccountRequest.routing_number) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                LinkBankAccountRequest linkBankAccountRequest = (LinkBankAccountRequest) obj;
                linkBankAccountRequest.getClass();
                RequestContext requestContext = linkBankAccountRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new LinkBankAccountRequest(requestContext2, null, null, emptyList, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LinkBankAccountRequest linkBankAccountRequest = (LinkBankAccountRequest) obj;
                linkBankAccountRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 5, linkBankAccountRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, linkBankAccountRequest.routing_number);
                protoAdapter2.encodeWithTag(protoWriter, 2, linkBankAccountRequest.account_number);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, linkBankAccountRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 4, linkBankAccountRequest.transfer_token);
                protoWriter.writeBytes(linkBankAccountRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBankAccountRequest(RequestContext requestContext, String str, String str2, List list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.routing_number = str;
        this.account_number = str2;
        this.transfer_token = str3;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkBankAccountRequest)) {
            return false;
        }
        LinkBankAccountRequest linkBankAccountRequest = (LinkBankAccountRequest) obj;
        return Intrinsics.areEqual(unknownFields(), linkBankAccountRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, linkBankAccountRequest.request_context) && Intrinsics.areEqual(this.routing_number, linkBankAccountRequest.routing_number) && Intrinsics.areEqual(this.account_number, linkBankAccountRequest.account_number) && Intrinsics.areEqual(this.payment_tokens, linkBankAccountRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, linkBankAccountRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.routing_number;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_number;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str3 = this.transfer_token;
        int hashCode4 = m + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(1);
        builder.alias = this.request_context;
        builder.verified = this.routing_number;
        builder.expires_at = this.account_number;
        builder.version = this.payment_tokens;
        builder.display_date = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.routing_number != null) {
            arrayList.add("routing_number=██");
        }
        if (this.account_number != null) {
            arrayList.add("account_number=██");
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkBankAccountRequest{", "}", 0, null, null, 56);
    }
}
