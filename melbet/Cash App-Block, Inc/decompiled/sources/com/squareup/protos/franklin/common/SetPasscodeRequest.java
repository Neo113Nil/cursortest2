package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
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
public final class SetPasscodeRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPasscodeRequest> CREATOR;
    public final String new_passcode;
    public final String old_instrument_token;
    public final String old_passcode;
    public final String old_passcode_token;
    public final List payment_tokens;
    public final RequestContext request_context;
    public final String transfer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetPasscodeRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.common.SetPasscodeRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetPasscodeRequest((RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, m, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetPasscodeRequest setPasscodeRequest = (SetPasscodeRequest) obj;
                reverseProtoWriter.getClass();
                setPasscodeRequest.getClass();
                reverseProtoWriter.writeBytes(setPasscodeRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, setPasscodeRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, setPasscodeRequest.payment_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, setPasscodeRequest.old_instrument_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setPasscodeRequest.old_passcode_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, setPasscodeRequest.old_passcode);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, setPasscodeRequest.new_passcode);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, setPasscodeRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetPasscodeRequest setPasscodeRequest = (SetPasscodeRequest) obj;
                setPasscodeRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(7, setPasscodeRequest.request_context) + setPasscodeRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, setPasscodeRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(5, setPasscodeRequest.payment_tokens) + protoAdapter2.encodedSizeWithTag(4, setPasscodeRequest.old_instrument_token) + protoAdapter2.encodedSizeWithTag(3, setPasscodeRequest.old_passcode_token) + protoAdapter2.encodedSizeWithTag(2, setPasscodeRequest.old_passcode) + protoAdapter2.encodedSizeWithTag(1, setPasscodeRequest.new_passcode) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetPasscodeRequest setPasscodeRequest = (SetPasscodeRequest) obj;
                setPasscodeRequest.getClass();
                RequestContext requestContext = setPasscodeRequest.request_context;
                return SetPasscodeRequest.copy$default(setPasscodeRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, EmptyList.INSTANCE, ByteString.EMPTY, 16);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetPasscodeRequest setPasscodeRequest = (SetPasscodeRequest) obj;
                setPasscodeRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 7, setPasscodeRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, setPasscodeRequest.new_passcode);
                protoAdapter2.encodeWithTag(protoWriter, 2, setPasscodeRequest.old_passcode);
                protoAdapter2.encodeWithTag(protoWriter, 3, setPasscodeRequest.old_passcode_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, setPasscodeRequest.old_instrument_token);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, setPasscodeRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 6, setPasscodeRequest.transfer_token);
                protoWriter.writeBytes(setPasscodeRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPasscodeRequest(RequestContext requestContext, String str, String str2, String str3, String str4, List list, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.new_passcode = str;
        this.old_passcode = str2;
        this.old_passcode_token = str3;
        this.old_instrument_token = str4;
        this.transfer_token = str5;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    public static SetPasscodeRequest copy$default(SetPasscodeRequest setPasscodeRequest, RequestContext requestContext, EmptyList emptyList, ByteString byteString, int i) {
        String str = (i & 2) != 0 ? setPasscodeRequest.new_passcode : null;
        String str2 = (i & 4) != 0 ? setPasscodeRequest.old_passcode : null;
        String str3 = (i & 8) != 0 ? setPasscodeRequest.old_passcode_token : null;
        String str4 = setPasscodeRequest.old_instrument_token;
        EmptyList emptyList2 = emptyList;
        if ((i & 32) != 0) {
            emptyList2 = setPasscodeRequest.payment_tokens;
        }
        EmptyList emptyList3 = emptyList2;
        String str5 = (i & 64) != 0 ? setPasscodeRequest.transfer_token : null;
        if ((i & 128) != 0) {
            byteString = setPasscodeRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        setPasscodeRequest.getClass();
        emptyList3.getClass();
        byteString2.getClass();
        return new SetPasscodeRequest(requestContext, str, str2, str3, str4, emptyList3, str5, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPasscodeRequest)) {
            return false;
        }
        SetPasscodeRequest setPasscodeRequest = (SetPasscodeRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setPasscodeRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setPasscodeRequest.request_context) && Intrinsics.areEqual(this.new_passcode, setPasscodeRequest.new_passcode) && Intrinsics.areEqual(this.old_passcode, setPasscodeRequest.old_passcode) && Intrinsics.areEqual(this.old_passcode_token, setPasscodeRequest.old_passcode_token) && Intrinsics.areEqual(this.old_instrument_token, setPasscodeRequest.old_instrument_token) && Intrinsics.areEqual(this.payment_tokens, setPasscodeRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, setPasscodeRequest.transfer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.new_passcode;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.old_passcode;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.old_passcode_token;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.old_instrument_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str5 = this.transfer_token;
        int hashCode6 = m + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(8);
        builder.f1407type = this.request_context;
        builder.scope = this.new_passcode;
        builder.value = this.old_passcode;
        builder.first_verified_at_ms = this.old_passcode_token;
        builder.last_verified_at_ms = this.old_instrument_token;
        builder.created_at = this.payment_tokens;
        builder.updated_at = this.transfer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.new_passcode != null) {
            arrayList.add("new_passcode=██");
        }
        if (this.old_passcode != null) {
            arrayList.add("old_passcode=██");
        }
        if (this.old_passcode_token != null) {
            arrayList.add("old_passcode_token=██");
        }
        String str = this.old_instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "old_instrument_token=", arrayList);
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPasscodeRequest{", "}", 0, null, null, 56);
    }
}
