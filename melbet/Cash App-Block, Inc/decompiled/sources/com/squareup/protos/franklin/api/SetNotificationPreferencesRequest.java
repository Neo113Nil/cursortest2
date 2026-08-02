package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetFullNameRequest;
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
public final class SetNotificationPreferencesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetNotificationPreferencesRequest> CREATOR;
    public final String app_token;
    public final List notification_preferences;
    public final RequestContext request_context;
    public final String session_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetNotificationPreferencesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.api.SetNotificationPreferencesRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetNotificationPreferencesRequest((RequestContext) obj3, (String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        m.add(NotificationPreference.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetNotificationPreferencesRequest setNotificationPreferencesRequest = (SetNotificationPreferencesRequest) obj;
                reverseProtoWriter.getClass();
                setNotificationPreferencesRequest.getClass();
                reverseProtoWriter.writeBytes(setNotificationPreferencesRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, setNotificationPreferencesRequest.request_context);
                NotificationPreference.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, setNotificationPreferencesRequest.notification_preferences);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, setNotificationPreferencesRequest.session_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, setNotificationPreferencesRequest.app_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetNotificationPreferencesRequest setNotificationPreferencesRequest = (SetNotificationPreferencesRequest) obj;
                setNotificationPreferencesRequest.getClass();
                int size$okio = setNotificationPreferencesRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RequestContext.ADAPTER.encodedSizeWithTag(4, setNotificationPreferencesRequest.request_context) + NotificationPreference.ADAPTER.asRepeated().encodedSizeWithTag(3, setNotificationPreferencesRequest.notification_preferences) + protoAdapter2.encodedSizeWithTag(2, setNotificationPreferencesRequest.session_token) + protoAdapter2.encodedSizeWithTag(1, setNotificationPreferencesRequest.app_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetNotificationPreferencesRequest setNotificationPreferencesRequest = (SetNotificationPreferencesRequest) obj;
                setNotificationPreferencesRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(setNotificationPreferencesRequest.notification_preferences, NotificationPreference.ADAPTER);
                RequestContext requestContext = setNotificationPreferencesRequest.request_context;
                return SetNotificationPreferencesRequest.copy$default(setNotificationPreferencesRequest, m1169redactElements, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetNotificationPreferencesRequest setNotificationPreferencesRequest = (SetNotificationPreferencesRequest) obj;
                setNotificationPreferencesRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, setNotificationPreferencesRequest.app_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, setNotificationPreferencesRequest.session_token);
                NotificationPreference.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, setNotificationPreferencesRequest.notification_preferences);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 4, setNotificationPreferencesRequest.request_context);
                protoWriter.writeBytes(setNotificationPreferencesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetNotificationPreferencesRequest(RequestContext requestContext, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.app_token = str;
        this.session_token = str2;
        this.request_context = requestContext;
        this.notification_preferences = TransactorKt.immutableCopyOf("notification_preferences", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    public static SetNotificationPreferencesRequest copy$default(SetNotificationPreferencesRequest setNotificationPreferencesRequest, ArrayList arrayList, RequestContext requestContext, ByteString byteString, int i) {
        String str = setNotificationPreferencesRequest.app_token;
        String str2 = (i & 2) != 0 ? setNotificationPreferencesRequest.session_token : null;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = setNotificationPreferencesRequest.notification_preferences;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            byteString = setNotificationPreferencesRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        setNotificationPreferencesRequest.getClass();
        arrayList3.getClass();
        byteString2.getClass();
        return new SetNotificationPreferencesRequest(requestContext, str, str2, arrayList3, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetNotificationPreferencesRequest)) {
            return false;
        }
        SetNotificationPreferencesRequest setNotificationPreferencesRequest = (SetNotificationPreferencesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setNotificationPreferencesRequest.unknownFields()) && Intrinsics.areEqual(this.app_token, setNotificationPreferencesRequest.app_token) && Intrinsics.areEqual(this.session_token, setNotificationPreferencesRequest.session_token) && Intrinsics.areEqual(this.notification_preferences, setNotificationPreferencesRequest.notification_preferences) && Intrinsics.areEqual(this.request_context, setNotificationPreferencesRequest.request_context);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.notification_preferences);
        RequestContext requestContext = this.request_context;
        int hashCode3 = m + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetFullNameRequest.Builder builder = new SetFullNameRequest.Builder(1);
        builder.full_name = this.app_token;
        builder.transfer_token = this.session_token;
        builder.payment_tokens = this.notification_preferences;
        builder.request_context = this.request_context;
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
        List list = this.notification_preferences;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("notification_preferences=", arrayList, list);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetNotificationPreferencesRequest{", "}", 0, null, null, 56);
    }
}
