package com.squareup.protos.franklin.app;

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
public final class SetAppLockActivatedRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetAppLockActivatedRequest> CREATOR;
    public final Boolean app_lock_activated;
    public final String passcode;
    public final String passcode_token;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetAppLockActivatedRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetAppLockActivatedRequest$Companion$ADAPTER$1
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
                        return new SetAppLockActivatedRequest((RequestContext) obj, (Boolean) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj4 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetAppLockActivatedRequest setAppLockActivatedRequest = (SetAppLockActivatedRequest) obj;
                reverseProtoWriter.getClass();
                setAppLockActivatedRequest.getClass();
                reverseProtoWriter.writeBytes(setAppLockActivatedRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, setAppLockActivatedRequest.passcode_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setAppLockActivatedRequest.passcode);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, setAppLockActivatedRequest.app_lock_activated);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAppLockActivatedRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetAppLockActivatedRequest setAppLockActivatedRequest = (SetAppLockActivatedRequest) obj;
                setAppLockActivatedRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, setAppLockActivatedRequest.app_lock_activated) + RequestContext.ADAPTER.encodedSizeWithTag(1, setAppLockActivatedRequest.request_context) + setAppLockActivatedRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, setAppLockActivatedRequest.passcode_token) + protoAdapter2.encodedSizeWithTag(3, setAppLockActivatedRequest.passcode) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetAppLockActivatedRequest setAppLockActivatedRequest = (SetAppLockActivatedRequest) obj;
                setAppLockActivatedRequest.getClass();
                RequestContext requestContext = setAppLockActivatedRequest.request_context;
                return SetAppLockActivatedRequest.copy$default(setAppLockActivatedRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, null, null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetAppLockActivatedRequest setAppLockActivatedRequest = (SetAppLockActivatedRequest) obj;
                setAppLockActivatedRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setAppLockActivatedRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setAppLockActivatedRequest.app_lock_activated);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, setAppLockActivatedRequest.passcode);
                protoAdapter2.encodeWithTag(protoWriter, 4, setAppLockActivatedRequest.passcode_token);
                protoWriter.writeBytes(setAppLockActivatedRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAppLockActivatedRequest(RequestContext requestContext, Boolean bool, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.app_lock_activated = bool;
        this.passcode = str;
        this.passcode_token = str2;
    }

    public static SetAppLockActivatedRequest copy$default(SetAppLockActivatedRequest setAppLockActivatedRequest, RequestContext requestContext, String str, String str2, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestContext = setAppLockActivatedRequest.request_context;
        }
        RequestContext requestContext2 = requestContext;
        Boolean bool = setAppLockActivatedRequest.app_lock_activated;
        if ((i & 4) != 0) {
            str = setAppLockActivatedRequest.passcode;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = setAppLockActivatedRequest.passcode_token;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            byteString = setAppLockActivatedRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        setAppLockActivatedRequest.getClass();
        byteString2.getClass();
        return new SetAppLockActivatedRequest(requestContext2, bool, str3, str4, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetAppLockActivatedRequest)) {
            return false;
        }
        SetAppLockActivatedRequest setAppLockActivatedRequest = (SetAppLockActivatedRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setAppLockActivatedRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setAppLockActivatedRequest.request_context) && Intrinsics.areEqual(this.app_lock_activated, setAppLockActivatedRequest.app_lock_activated) && Intrinsics.areEqual(this.passcode, setAppLockActivatedRequest.passcode) && Intrinsics.areEqual(this.passcode_token, setAppLockActivatedRequest.passcode_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        Boolean bool = this.app_lock_activated;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.passcode;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ColoredButton.Builder builder = new ColoredButton.Builder(15);
        builder.button_color = this.request_context;
        builder.text_color = this.app_lock_activated;
        builder.text = this.passcode;
        builder.action = this.passcode_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        Boolean bool = this.app_lock_activated;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_lock_activated=", bool, arrayList);
        }
        if (this.passcode != null) {
            arrayList.add("passcode=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAppLockActivatedRequest{", "}", 0, null, null, 56);
    }
}
