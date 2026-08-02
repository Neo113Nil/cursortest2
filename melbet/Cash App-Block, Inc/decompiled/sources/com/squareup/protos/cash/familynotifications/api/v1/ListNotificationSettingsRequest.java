package com.squareup.protos.cash.familynotifications.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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
public final class ListNotificationSettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ListNotificationSettingsRequest> CREATOR;
    public final List notification_types;
    public final List subscribed_to_customer_tokens;
    public final String subscriber_customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ListNotificationSettingsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.familynotifications.api.v1.ListNotificationSettingsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ListNotificationSettingsRequest((String) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            NotificationType.ADAPTER.tryDecode(protoReader, arrayList);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ListNotificationSettingsRequest listNotificationSettingsRequest = (ListNotificationSettingsRequest) obj;
                reverseProtoWriter.getClass();
                listNotificationSettingsRequest.getClass();
                reverseProtoWriter.writeBytes(listNotificationSettingsRequest.unknownFields());
                NotificationType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, listNotificationSettingsRequest.notification_types);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, listNotificationSettingsRequest.subscribed_to_customer_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, listNotificationSettingsRequest.subscriber_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ListNotificationSettingsRequest listNotificationSettingsRequest = (ListNotificationSettingsRequest) obj;
                listNotificationSettingsRequest.getClass();
                int size$okio = listNotificationSettingsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return NotificationType.ADAPTER.asRepeated().encodedSizeWithTag(3, listNotificationSettingsRequest.notification_types) + protoAdapter2.asRepeated().encodedSizeWithTag(2, listNotificationSettingsRequest.subscribed_to_customer_tokens) + protoAdapter2.encodedSizeWithTag(1, listNotificationSettingsRequest.subscriber_customer_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ListNotificationSettingsRequest listNotificationSettingsRequest = (ListNotificationSettingsRequest) obj;
                listNotificationSettingsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = listNotificationSettingsRequest.subscriber_customer_token;
                List list = listNotificationSettingsRequest.subscribed_to_customer_tokens;
                List list2 = listNotificationSettingsRequest.notification_types;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new ListNotificationSettingsRequest(str, list, list2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ListNotificationSettingsRequest listNotificationSettingsRequest = (ListNotificationSettingsRequest) obj;
                listNotificationSettingsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, listNotificationSettingsRequest.subscriber_customer_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, listNotificationSettingsRequest.subscribed_to_customer_tokens);
                NotificationType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, listNotificationSettingsRequest.notification_types);
                protoWriter.writeBytes(listNotificationSettingsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListNotificationSettingsRequest(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.subscriber_customer_token = str;
        this.subscribed_to_customer_tokens = TransactorKt.immutableCopyOf("subscribed_to_customer_tokens", list);
        this.notification_types = TransactorKt.immutableCopyOf("notification_types", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListNotificationSettingsRequest)) {
            return false;
        }
        ListNotificationSettingsRequest listNotificationSettingsRequest = (ListNotificationSettingsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), listNotificationSettingsRequest.unknownFields()) && Intrinsics.areEqual(this.subscriber_customer_token, listNotificationSettingsRequest.subscriber_customer_token) && Intrinsics.areEqual(this.subscribed_to_customer_tokens, listNotificationSettingsRequest.subscribed_to_customer_tokens) && Intrinsics.areEqual(this.notification_types, listNotificationSettingsRequest.notification_types);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.subscriber_customer_token;
        int hashCode2 = this.notification_types.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.subscribed_to_customer_tokens);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(6);
        builder.sync_token = this.subscriber_customer_token;
        builder.add_hashed_aliases = this.subscribed_to_customer_tokens;
        builder.remove_hashed_aliases = this.notification_types;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.subscriber_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subscriber_customer_token=", arrayList);
        }
        List list = this.subscribed_to_customer_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("subscribed_to_customer_tokens=", arrayList, list);
        }
        List list2 = this.notification_types;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("notification_types=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ListNotificationSettingsRequest{", "}", 0, null, null, 56);
    }
}
