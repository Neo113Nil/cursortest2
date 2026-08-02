package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.document.DocumentEntity;
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
public final class VerifyIdentityRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VerifyIdentityRequest> CREATOR;
    public final GlobalAddress address;
    public final String birth_date;
    public final String name;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String ssn;
    public final String ssn_last_four;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerifyIdentityRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.VerifyIdentityRequest$Companion$ADAPTER$1
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
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new VerifyIdentityRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (GlobalAddress) obj6, m, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 4:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            obj7 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 11:
                            obj6 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj6);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                VerifyIdentityRequest verifyIdentityRequest = (VerifyIdentityRequest) obj;
                reverseProtoWriter.getClass();
                verifyIdentityRequest.getClass();
                reverseProtoWriter.writeBytes(verifyIdentityRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, verifyIdentityRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, verifyIdentityRequest.payment_tokens);
                GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 11, verifyIdentityRequest.address);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 9, verifyIdentityRequest.ssn);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, verifyIdentityRequest.ssn_last_four);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, verifyIdentityRequest.birth_date);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, verifyIdentityRequest.name);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 10, verifyIdentityRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                VerifyIdentityRequest verifyIdentityRequest = (VerifyIdentityRequest) obj;
                verifyIdentityRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(10, verifyIdentityRequest.request_context) + verifyIdentityRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, verifyIdentityRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(7, verifyIdentityRequest.payment_tokens) + GlobalAddress.ADAPTER.encodedSizeWithTag(11, verifyIdentityRequest.address) + protoAdapter2.encodedSizeWithTag(9, verifyIdentityRequest.ssn) + protoAdapter2.encodedSizeWithTag(6, verifyIdentityRequest.ssn_last_four) + protoAdapter2.encodedSizeWithTag(5, verifyIdentityRequest.birth_date) + protoAdapter2.encodedSizeWithTag(4, verifyIdentityRequest.name) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                VerifyIdentityRequest verifyIdentityRequest = (VerifyIdentityRequest) obj;
                verifyIdentityRequest.getClass();
                RequestContext requestContext = verifyIdentityRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                GlobalAddress globalAddress = verifyIdentityRequest.address;
                GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new VerifyIdentityRequest(requestContext2, null, null, null, null, globalAddress2, emptyList, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                VerifyIdentityRequest verifyIdentityRequest = (VerifyIdentityRequest) obj;
                verifyIdentityRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 10, verifyIdentityRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 4, verifyIdentityRequest.name);
                protoAdapter2.encodeWithTag(protoWriter, 5, verifyIdentityRequest.birth_date);
                protoAdapter2.encodeWithTag(protoWriter, 6, verifyIdentityRequest.ssn_last_four);
                protoAdapter2.encodeWithTag(protoWriter, 9, verifyIdentityRequest.ssn);
                GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 11, verifyIdentityRequest.address);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, verifyIdentityRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 8, verifyIdentityRequest.transfer_token);
                protoWriter.writeBytes(verifyIdentityRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyIdentityRequest(RequestContext requestContext, String str, String str2, String str3, String str4, GlobalAddress globalAddress, List list, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.name = str;
        this.birth_date = str2;
        this.ssn_last_four = str3;
        this.ssn = str4;
        this.address = globalAddress;
        this.transfer_token = str5;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerifyIdentityRequest)) {
            return false;
        }
        VerifyIdentityRequest verifyIdentityRequest = (VerifyIdentityRequest) obj;
        return Intrinsics.areEqual(unknownFields(), verifyIdentityRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, verifyIdentityRequest.request_context) && Intrinsics.areEqual(this.name, verifyIdentityRequest.name) && Intrinsics.areEqual(this.birth_date, verifyIdentityRequest.birth_date) && Intrinsics.areEqual(this.ssn_last_four, verifyIdentityRequest.ssn_last_four) && Intrinsics.areEqual(this.ssn, verifyIdentityRequest.ssn) && Intrinsics.areEqual(this.address, verifyIdentityRequest.address) && Intrinsics.areEqual(this.payment_tokens, verifyIdentityRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, verifyIdentityRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.birth_date;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.ssn_last_four;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.ssn;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.address;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str5 = this.transfer_token;
        int hashCode7 = m + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(23);
        builder.owner_token = this.request_context;
        builder.category = this.name;
        builder.token = this.birth_date;
        builder.title = this.ssn_last_four;
        builder.client_route = this.ssn;
        builder.version_data = this.address;
        builder.localizable_title = this.payment_tokens;
        builder.url = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        if (this.birth_date != null) {
            arrayList.add("birth_date=██");
        }
        if (this.ssn_last_four != null) {
            arrayList.add("ssn_last_four=██");
        }
        if (this.ssn != null) {
            arrayList.add("ssn=██");
        }
        GlobalAddress globalAddress = this.address;
        if (globalAddress != null) {
            arrayList.add("address=" + globalAddress);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VerifyIdentityRequest{", "}", 0, null, null, 56);
    }
}
