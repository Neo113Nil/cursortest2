package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetProfileDetailsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetProfileDetailsRequest> CREATOR;
    public final ContactsStatus contacts_status;
    public final String customer_token;
    public final GetProfileDetailsContext origin_context;
    public final String profile_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetProfileDetailsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashface.api.GetProfileDetailsRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetProfileDetailsRequest((ContactsStatus) obj, (String) obj2, (GetProfileDetailsContext) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = ContactsStatus.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = GetProfileDetailsContext.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetProfileDetailsRequest getProfileDetailsRequest = (GetProfileDetailsRequest) obj;
                reverseProtoWriter.getClass();
                getProfileDetailsRequest.getClass();
                reverseProtoWriter.writeBytes(getProfileDetailsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getProfileDetailsRequest.profile_context);
                GetProfileDetailsContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getProfileDetailsRequest.origin_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getProfileDetailsRequest.customer_token);
                ContactsStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getProfileDetailsRequest.contacts_status);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetProfileDetailsRequest getProfileDetailsRequest = (GetProfileDetailsRequest) obj;
                getProfileDetailsRequest.getClass();
                int encodedSizeWithTag = ContactsStatus.ADAPTER.encodedSizeWithTag(1, getProfileDetailsRequest.contacts_status) + getProfileDetailsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, getProfileDetailsRequest.profile_context) + GetProfileDetailsContext.ADAPTER.encodedSizeWithTag(3, getProfileDetailsRequest.origin_context) + protoAdapter2.encodedSizeWithTag(2, getProfileDetailsRequest.customer_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetProfileDetailsRequest getProfileDetailsRequest = (GetProfileDetailsRequest) obj;
                getProfileDetailsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                ContactsStatus contactsStatus = getProfileDetailsRequest.contacts_status;
                String str = getProfileDetailsRequest.customer_token;
                GetProfileDetailsContext getProfileDetailsContext = getProfileDetailsRequest.origin_context;
                String str2 = getProfileDetailsRequest.profile_context;
                byteString.getClass();
                return new GetProfileDetailsRequest(contactsStatus, str, getProfileDetailsContext, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetProfileDetailsRequest getProfileDetailsRequest = (GetProfileDetailsRequest) obj;
                getProfileDetailsRequest.getClass();
                ContactsStatus.ADAPTER.encodeWithTag(protoWriter, 1, getProfileDetailsRequest.contacts_status);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, getProfileDetailsRequest.customer_token);
                GetProfileDetailsContext.ADAPTER.encodeWithTag(protoWriter, 3, getProfileDetailsRequest.origin_context);
                protoAdapter2.encodeWithTag(protoWriter, 4, getProfileDetailsRequest.profile_context);
                protoWriter.writeBytes(getProfileDetailsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ GetProfileDetailsRequest(ContactsStatus contactsStatus, String str, GetProfileDetailsContext getProfileDetailsContext, String str2, int i) {
        this((i & 1) != 0 ? null : contactsStatus, str, getProfileDetailsContext, (i & 8) != 0 ? null : str2, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetProfileDetailsRequest)) {
            return false;
        }
        GetProfileDetailsRequest getProfileDetailsRequest = (GetProfileDetailsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getProfileDetailsRequest.unknownFields()) && this.contacts_status == getProfileDetailsRequest.contacts_status && Intrinsics.areEqual(this.customer_token, getProfileDetailsRequest.customer_token) && this.origin_context == getProfileDetailsRequest.origin_context && Intrinsics.areEqual(this.profile_context, getProfileDetailsRequest.profile_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ContactsStatus contactsStatus = this.contacts_status;
        int hashCode2 = (hashCode + (contactsStatus != null ? contactsStatus.hashCode() : 0)) * 37;
        String str = this.customer_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        GetProfileDetailsContext getProfileDetailsContext = this.origin_context;
        int hashCode4 = (hashCode3 + (getProfileDetailsContext != null ? getProfileDetailsContext.hashCode() : 0)) * 37;
        String str2 = this.profile_context;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(5, false);
        builder.icon = this.contacts_status;
        builder.title = this.customer_token;
        builder.enabled = this.origin_context;
        builder.id = this.profile_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ContactsStatus contactsStatus = this.contacts_status;
        if (contactsStatus != null) {
            arrayList.add("contacts_status=" + contactsStatus);
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        GetProfileDetailsContext getProfileDetailsContext = this.origin_context;
        if (getProfileDetailsContext != null) {
            arrayList.add("origin_context=" + getProfileDetailsContext);
        }
        String str2 = this.profile_context;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "profile_context=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetProfileDetailsRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileDetailsRequest(ContactsStatus contactsStatus, String str, GetProfileDetailsContext getProfileDetailsContext, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.contacts_status = contactsStatus;
        this.customer_token = str;
        this.origin_context = getProfileDetailsContext;
        this.profile_context = str2;
    }
}
