package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.common.ProfileAlias;
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
public final class SetAddressRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetAddressRequest> CREATOR;
    public final List payment_tokens;
    public final GlobalAddress postal_address;
    public final RequestContext request_context;
    public final String transfer_token;
    public final Boolean validated;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetAddressRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetAddressRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetAddressRequest((RequestContext) obj, (GlobalAddress) obj2, m, (String) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj2 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 2) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetAddressRequest setAddressRequest = (SetAddressRequest) obj;
                reverseProtoWriter.getClass();
                setAddressRequest.getClass();
                reverseProtoWriter.writeBytes(setAddressRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, setAddressRequest.validated);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setAddressRequest.transfer_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, setAddressRequest.payment_tokens);
                GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAddressRequest.postal_address);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, setAddressRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetAddressRequest setAddressRequest = (SetAddressRequest) obj;
                setAddressRequest.getClass();
                int encodedSizeWithTag = GlobalAddress.ADAPTER.encodedSizeWithTag(1, setAddressRequest.postal_address) + RequestContext.ADAPTER.encodedSizeWithTag(5, setAddressRequest.request_context) + setAddressRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(4, setAddressRequest.validated) + protoAdapter2.encodedSizeWithTag(3, setAddressRequest.transfer_token) + protoAdapter2.asRepeated().encodedSizeWithTag(2, setAddressRequest.payment_tokens) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetAddressRequest setAddressRequest = (SetAddressRequest) obj;
                setAddressRequest.getClass();
                RequestContext requestContext = setAddressRequest.request_context;
                return SetAddressRequest.copy$default(setAddressRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, EmptyList.INSTANCE, ByteString.EMPTY, 16);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetAddressRequest setAddressRequest = (SetAddressRequest) obj;
                setAddressRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 5, setAddressRequest.request_context);
                GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 1, setAddressRequest.postal_address);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, setAddressRequest.payment_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 3, setAddressRequest.transfer_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, setAddressRequest.validated);
                protoWriter.writeBytes(setAddressRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAddressRequest(RequestContext requestContext, GlobalAddress globalAddress, List list, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.postal_address = globalAddress;
        this.transfer_token = str;
        this.validated = bool;
        this.payment_tokens = TransactorKt.immutableCopyOf("payment_tokens", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    public static SetAddressRequest copy$default(SetAddressRequest setAddressRequest, RequestContext requestContext, EmptyList emptyList, ByteString byteString, int i) {
        GlobalAddress globalAddress = (i & 2) != 0 ? setAddressRequest.postal_address : null;
        EmptyList emptyList2 = emptyList;
        if ((i & 4) != 0) {
            emptyList2 = setAddressRequest.payment_tokens;
        }
        EmptyList emptyList3 = emptyList2;
        String str = (i & 8) != 0 ? setAddressRequest.transfer_token : null;
        Boolean bool = setAddressRequest.validated;
        if ((i & 32) != 0) {
            byteString = setAddressRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        setAddressRequest.getClass();
        emptyList3.getClass();
        byteString2.getClass();
        return new SetAddressRequest(requestContext, globalAddress, emptyList3, str, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetAddressRequest)) {
            return false;
        }
        SetAddressRequest setAddressRequest = (SetAddressRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setAddressRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setAddressRequest.request_context) && Intrinsics.areEqual(this.postal_address, setAddressRequest.postal_address) && Intrinsics.areEqual(this.payment_tokens, setAddressRequest.payment_tokens) && Intrinsics.areEqual(this.transfer_token, setAddressRequest.transfer_token) && Intrinsics.areEqual(this.validated, setAddressRequest.validated);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.postal_address;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37, 37, this.payment_tokens);
        String str = this.transfer_token;
        int hashCode3 = (m + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.validated;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(3);
        builder.alias = this.request_context;
        builder.expires_at = this.postal_address;
        builder.version = this.payment_tokens;
        builder.display_date = this.transfer_token;
        builder.verified = this.validated;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.postal_address != null) {
            arrayList.add("postal_address=██");
        }
        if (!this.payment_tokens.isEmpty()) {
            arrayList.add("payment_tokens=██");
        }
        if (this.transfer_token != null) {
            arrayList.add("transfer_token=██");
        }
        Boolean bool = this.validated;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("validated=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAddressRequest{", "}", 0, null, null, 56);
    }
}
