package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ColoredButton;
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
public final class SetNotificationPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetNotificationPreferenceRequest> CREATOR;
    public final String app_token;
    public final NotificationPreference notification_preference;
    public final RequestContext request_context;
    public final String session_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetNotificationPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.api.SetNotificationPreferenceRequest$Companion$ADAPTER$1
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
                        return new SetNotificationPreferenceRequest((String) obj, (String) obj2, (NotificationPreference) obj3, (RequestContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(NotificationPreference.ADAPTER, protoReader, obj3);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetNotificationPreferenceRequest setNotificationPreferenceRequest = (SetNotificationPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                setNotificationPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(setNotificationPreferenceRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, setNotificationPreferenceRequest.request_context);
                NotificationPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 3, setNotificationPreferenceRequest.notification_preference);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, setNotificationPreferenceRequest.session_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, setNotificationPreferenceRequest.app_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetNotificationPreferenceRequest setNotificationPreferenceRequest = (SetNotificationPreferenceRequest) obj;
                setNotificationPreferenceRequest.getClass();
                int size$okio = setNotificationPreferenceRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(4, setNotificationPreferenceRequest.request_context) + NotificationPreference.ADAPTER.encodedSizeWithTag(3, setNotificationPreferenceRequest.notification_preference) + protoAdapter2.encodedSizeWithTag(2, setNotificationPreferenceRequest.session_token) + protoAdapter2.encodedSizeWithTag(1, setNotificationPreferenceRequest.app_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetNotificationPreferenceRequest setNotificationPreferenceRequest = (SetNotificationPreferenceRequest) obj;
                setNotificationPreferenceRequest.getClass();
                NotificationPreference notificationPreference = setNotificationPreferenceRequest.notification_preference;
                NotificationPreference notificationPreference2 = notificationPreference != null ? (NotificationPreference) NotificationPreference.ADAPTER.redact(notificationPreference) : null;
                RequestContext requestContext = setNotificationPreferenceRequest.request_context;
                return SetNotificationPreferenceRequest.copy$default(setNotificationPreferenceRequest, notificationPreference2, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetNotificationPreferenceRequest setNotificationPreferenceRequest = (SetNotificationPreferenceRequest) obj;
                setNotificationPreferenceRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, setNotificationPreferenceRequest.app_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, setNotificationPreferenceRequest.session_token);
                NotificationPreference.ADAPTER.encodeWithTag(protoWriter, 3, setNotificationPreferenceRequest.notification_preference);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, setNotificationPreferenceRequest.request_context);
                protoWriter.writeBytes(setNotificationPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNotificationPreferenceRequest(String str, String str2, NotificationPreference notificationPreference, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_token = str;
        this.session_token = str2;
        this.notification_preference = notificationPreference;
        this.request_context = requestContext;
    }

    public static SetNotificationPreferenceRequest copy$default(SetNotificationPreferenceRequest setNotificationPreferenceRequest, NotificationPreference notificationPreference, RequestContext requestContext, ByteString byteString, int i) {
        String str = setNotificationPreferenceRequest.app_token;
        String str2 = (i & 2) != 0 ? setNotificationPreferenceRequest.session_token : null;
        if ((i & 4) != 0) {
            notificationPreference = setNotificationPreferenceRequest.notification_preference;
        }
        NotificationPreference notificationPreference2 = notificationPreference;
        if ((i & 16) != 0) {
            byteString = setNotificationPreferenceRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        setNotificationPreferenceRequest.getClass();
        byteString2.getClass();
        return new SetNotificationPreferenceRequest(str, str2, notificationPreference2, requestContext, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetNotificationPreferenceRequest)) {
            return false;
        }
        SetNotificationPreferenceRequest setNotificationPreferenceRequest = (SetNotificationPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setNotificationPreferenceRequest.unknownFields()) && Intrinsics.areEqual(this.app_token, setNotificationPreferenceRequest.app_token) && Intrinsics.areEqual(this.session_token, setNotificationPreferenceRequest.session_token) && Intrinsics.areEqual(this.notification_preference, setNotificationPreferenceRequest.notification_preference) && Intrinsics.areEqual(this.request_context, setNotificationPreferenceRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.session_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        NotificationPreference notificationPreference = this.notification_preference;
        int hashCode4 = (hashCode3 + (notificationPreference != null ? notificationPreference.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode5 = hashCode4 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(11);
        builder.button_color = this.app_token;
        builder.text_color = this.session_token;
        builder.text = this.notification_preference;
        builder.action = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_token=", arrayList);
        }
        if (this.session_token != null) {
            arrayList.add("session_token=██");
        }
        NotificationPreference notificationPreference = this.notification_preference;
        if (notificationPreference != null) {
            arrayList.add("notification_preference=" + notificationPreference);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetNotificationPreferenceRequest{", "}", 0, null, null, 56);
    }
}
