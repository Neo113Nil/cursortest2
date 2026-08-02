package com.squareup.protos.cash.notificationsettings.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.InviteContactsRequest;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateCategoryNotificationSettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateCategoryNotificationSettingsRequest> CREATOR;
    public final RequestContext request_context;
    public final List updates;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateCategoryNotificationSettingsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.notificationsettings.api.v1.UpdateCategoryNotificationSettingsRequest$Companion$ADAPTER$1
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
                        return new UpdateCategoryNotificationSettingsRequest((RequestContext) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(CategoryPreferenceUpdate.ADAPTER.decode(protoReader));
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = (UpdateCategoryNotificationSettingsRequest) obj;
                reverseProtoWriter.getClass();
                updateCategoryNotificationSettingsRequest.getClass();
                reverseProtoWriter.writeBytes(updateCategoryNotificationSettingsRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, updateCategoryNotificationSettingsRequest.request_context);
                CategoryPreferenceUpdate.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, updateCategoryNotificationSettingsRequest.updates);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = (UpdateCategoryNotificationSettingsRequest) obj;
                updateCategoryNotificationSettingsRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, updateCategoryNotificationSettingsRequest.request_context) + CategoryPreferenceUpdate.ADAPTER.asRepeated().encodedSizeWithTag(1, updateCategoryNotificationSettingsRequest.updates) + updateCategoryNotificationSettingsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = (UpdateCategoryNotificationSettingsRequest) obj;
                updateCategoryNotificationSettingsRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(updateCategoryNotificationSettingsRequest.updates, CategoryPreferenceUpdate.ADAPTER);
                RequestContext requestContext = updateCategoryNotificationSettingsRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new UpdateCategoryNotificationSettingsRequest(requestContext2, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = (UpdateCategoryNotificationSettingsRequest) obj;
                updateCategoryNotificationSettingsRequest.getClass();
                CategoryPreferenceUpdate.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateCategoryNotificationSettingsRequest.updates);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, updateCategoryNotificationSettingsRequest.request_context);
                protoWriter.writeBytes(updateCategoryNotificationSettingsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateCategoryNotificationSettingsRequest(RequestContext requestContext, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.updates = TransactorKt.immutableCopyOf("updates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateCategoryNotificationSettingsRequest)) {
            return false;
        }
        UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = (UpdateCategoryNotificationSettingsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateCategoryNotificationSettingsRequest.unknownFields()) && Intrinsics.areEqual(this.updates, updateCategoryNotificationSettingsRequest.updates) && Intrinsics.areEqual(this.request_context, updateCategoryNotificationSettingsRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.updates);
        RequestContext requestContext = this.request_context;
        int hashCode = m + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InviteContactsRequest.Builder builder = new InviteContactsRequest.Builder(6);
        builder.email_addresses = this.updates;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.updates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("updates=", arrayList, list);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateCategoryNotificationSettingsRequest{", "}", 0, null, null, 56);
    }

    public UpdateCategoryNotificationSettingsRequest(List list) {
        this(null, list, ByteString.EMPTY);
    }
}
