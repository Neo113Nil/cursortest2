package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.devicegrip.service.RemoveDevicesRequest;
import com.squareup.protos.cash.aegis.api.SelectAllowlistCustomersRequest;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsRequest;
import com.squareup.protos.cash.notificationsettings.api.v1.UpdateCategoryNotificationSettingsRequest;
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
public final class InviteContactsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InviteContactsRequest> CREATOR;
    public final List email_addresses;
    public final RequestContext request_context;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List email_addresses;
        public RequestContext request_context;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                case 2:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                case 3:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                case 4:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                case 5:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                case 6:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                case 7:
                    break;
                case 8:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
                default:
                    this.email_addresses = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new InviteContactsRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 1:
                    return new RefreshCashGreenSyncValuesRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 2:
                    return new RemoveDevicesRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 3:
                    return new SelectAllowlistCustomersRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 4:
                    return new BulkAddBrandsRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 5:
                    return new BulkRemoveBrandsRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 6:
                    return new UpdateCategoryNotificationSettingsRequest(this.request_context, this.email_addresses, buildUnknownFields());
                case 7:
                    return new SelectParticipantRequest(this.request_context, this.email_addresses, buildUnknownFields());
                default:
                    return new VerifyContactsRequest(this.request_context, this.email_addresses, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InviteContactsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.InviteContactsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InviteContactsRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InviteContactsRequest inviteContactsRequest = (InviteContactsRequest) obj;
                reverseProtoWriter.getClass();
                inviteContactsRequest.getClass();
                reverseProtoWriter.writeBytes(inviteContactsRequest.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, inviteContactsRequest.email_addresses);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, inviteContactsRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                InviteContactsRequest inviteContactsRequest = (InviteContactsRequest) obj;
                inviteContactsRequest.getClass();
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, inviteContactsRequest.email_addresses) + RequestContext.ADAPTER.encodedSizeWithTag(2, inviteContactsRequest.request_context) + inviteContactsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InviteContactsRequest inviteContactsRequest = (InviteContactsRequest) obj;
                inviteContactsRequest.getClass();
                RequestContext requestContext = inviteContactsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new InviteContactsRequest(requestContext2, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InviteContactsRequest inviteContactsRequest = (InviteContactsRequest) obj;
                inviteContactsRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, inviteContactsRequest.request_context);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, inviteContactsRequest.email_addresses);
                protoWriter.writeBytes(inviteContactsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.email_addresses = TransactorKt.immutableCopyOf("email_addresses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteContactsRequest)) {
            return false;
        }
        InviteContactsRequest inviteContactsRequest = (InviteContactsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), inviteContactsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, inviteContactsRequest.request_context) && Intrinsics.areEqual(this.email_addresses, inviteContactsRequest.email_addresses);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = this.email_addresses.hashCode() + ((hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.email_addresses = this.email_addresses;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (!this.email_addresses.isEmpty()) {
            arrayList.add("email_addresses=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InviteContactsRequest{", "}", 0, null, null, 56);
    }
}
