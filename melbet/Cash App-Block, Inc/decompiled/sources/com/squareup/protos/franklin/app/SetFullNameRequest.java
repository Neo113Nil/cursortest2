package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SetNotificationPreferencesRequest;
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
public final class SetFullNameRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetFullNameRequest> CREATOR;
    public final String full_name;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String transfer_token;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String full_name;
        public List payment_tokens;
        public RequestContext request_context;
        public String transfer_token;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.payment_tokens = EmptyList.INSTANCE;
                    break;
                case 2:
                    break;
                case 3:
                    this.payment_tokens = EmptyList.INSTANCE;
                    break;
                case 4:
                    this.payment_tokens = EmptyList.INSTANCE;
                    break;
                default:
                    this.payment_tokens = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SetFullNameRequest(this.request_context, this.full_name, this.transfer_token, this.payment_tokens, buildUnknownFields());
                case 1:
                    return new SetNotificationPreferencesRequest(this.request_context, this.full_name, this.transfer_token, this.payment_tokens, buildUnknownFields());
                case 2:
                    return new ActivateDigitalWalletRequest(this.request_context, this.full_name, this.transfer_token, this.payment_tokens, buildUnknownFields());
                case 3:
                    return new CompleteScenarioRequest(this.request_context, this.full_name, this.transfer_token, this.payment_tokens, buildUnknownFields());
                default:
                    return new SelectOptionRequest(this.request_context, this.full_name, this.transfer_token, this.payment_tokens, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetFullNameRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetFullNameRequest$Companion$ADAPTER$1
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
                        return new SetFullNameRequest((RequestContext) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 5) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 6) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetFullNameRequest setFullNameRequest = (SetFullNameRequest) obj;
                reverseProtoWriter.getClass();
                setFullNameRequest.getClass();
                reverseProtoWriter.writeBytes(setFullNameRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, setFullNameRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, setFullNameRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setFullNameRequest.full_name);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, setFullNameRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetFullNameRequest setFullNameRequest = (SetFullNameRequest) obj;
                setFullNameRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(6, setFullNameRequest.request_context) + setFullNameRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, setFullNameRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(4, setFullNameRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(3, setFullNameRequest.full_name) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetFullNameRequest setFullNameRequest = (SetFullNameRequest) obj;
                setFullNameRequest.getClass();
                RequestContext requestContext = setFullNameRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new SetFullNameRequest(requestContext2, null, null, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetFullNameRequest setFullNameRequest = (SetFullNameRequest) obj;
                setFullNameRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 6, setFullNameRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, setFullNameRequest.full_name);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, setFullNameRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 5, setFullNameRequest.transfer_token);
                protoWriter.writeBytes(setFullNameRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetFullNameRequest(RequestContext requestContext, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.full_name = str;
        this.transfer_token = str2;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetFullNameRequest)) {
            return false;
        }
        SetFullNameRequest setFullNameRequest = (SetFullNameRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setFullNameRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setFullNameRequest.request_context) && Intrinsics.areEqual(this.full_name, setFullNameRequest.full_name) && Intrinsics.areEqual(this.payment_tokens, setFullNameRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, setFullNameRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.full_name;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str2 = this.transfer_token;
        int hashCode3 = m + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.full_name = this.full_name;
        builder.payment_tokens = this.payment_tokens;
        builder.transfer_token = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetFullNameRequest{", "}", 0, null, null, 56);
    }
}
