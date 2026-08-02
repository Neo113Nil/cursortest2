package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.GetShortlinkRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetShortlinkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetShortlinkRequest> CREATOR;
    public final InvocationContext invocation_context;
    public final String shortlink_flow_state;
    public final String shortlink_key;

    /* loaded from: classes7.dex */
    public enum InvocationContext implements WireEnum {
        INVOCATION_CONTEXT_UNSPECIFIED(0),
        INVOCATION_CONTEXT_INTERACTION(1),
        INVOCATION_CONTEXT_AUTO_DISPLAY(2);

        public static final GetShortlinkRequest$InvocationContext$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            InvocationContext invocationContext = INVOCATION_CONTEXT_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new GetShortlinkRequest$InvocationContext$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InvocationContext.class), Syntax.PROTO_2, invocationContext);
        }

        InvocationContext(int i) {
            this.value = i;
        }

        public static final InvocationContext fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVOCATION_CONTEXT_UNSPECIFIED;
            }
            if (i == 1) {
                return INVOCATION_CONTEXT_INTERACTION;
            }
            if (i != 2) {
                return null;
            }
            return INVOCATION_CONTEXT_AUTO_DISPLAY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetShortlinkRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.GetShortlinkRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetShortlinkRequest((String) obj, (String) obj2, (GetShortlinkRequest.InvocationContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = GetShortlinkRequest.InvocationContext.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetShortlinkRequest getShortlinkRequest = (GetShortlinkRequest) obj;
                reverseProtoWriter.getClass();
                getShortlinkRequest.getClass();
                reverseProtoWriter.writeBytes(getShortlinkRequest.unknownFields());
                GetShortlinkRequest.InvocationContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, getShortlinkRequest.invocation_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, getShortlinkRequest.shortlink_flow_state);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, getShortlinkRequest.shortlink_key);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetShortlinkRequest getShortlinkRequest = (GetShortlinkRequest) obj;
                getShortlinkRequest.getClass();
                int size$okio = getShortlinkRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return GetShortlinkRequest.InvocationContext.ADAPTER.encodedSizeWithTag(3, getShortlinkRequest.invocation_context) + protoAdapter2.encodedSizeWithTag(2, getShortlinkRequest.shortlink_flow_state) + protoAdapter2.encodedSizeWithTag(1, getShortlinkRequest.shortlink_key) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetShortlinkRequest getShortlinkRequest = (GetShortlinkRequest) obj;
                getShortlinkRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = getShortlinkRequest.shortlink_key;
                String str2 = getShortlinkRequest.shortlink_flow_state;
                GetShortlinkRequest.InvocationContext invocationContext = getShortlinkRequest.invocation_context;
                byteString.getClass();
                return new GetShortlinkRequest(str, str2, invocationContext, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetShortlinkRequest getShortlinkRequest = (GetShortlinkRequest) obj;
                getShortlinkRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, getShortlinkRequest.shortlink_key);
                protoAdapter2.encodeWithTag(protoWriter, 2, getShortlinkRequest.shortlink_flow_state);
                GetShortlinkRequest.InvocationContext.ADAPTER.encodeWithTag(protoWriter, 3, getShortlinkRequest.invocation_context);
                protoWriter.writeBytes(getShortlinkRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShortlinkRequest(String str, String str2, InvocationContext invocationContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.shortlink_key = str;
        this.shortlink_flow_state = str2;
        this.invocation_context = invocationContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetShortlinkRequest)) {
            return false;
        }
        GetShortlinkRequest getShortlinkRequest = (GetShortlinkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getShortlinkRequest.unknownFields()) && Intrinsics.areEqual(this.shortlink_key, getShortlinkRequest.shortlink_key) && Intrinsics.areEqual(this.shortlink_flow_state, getShortlinkRequest.shortlink_flow_state) && this.invocation_context == getShortlinkRequest.invocation_context;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.shortlink_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shortlink_flow_state;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        InvocationContext invocationContext = this.invocation_context;
        int hashCode4 = hashCode3 + (invocationContext != null ? invocationContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(21);
        builder.name = this.shortlink_key;
        builder.group_image = this.shortlink_flow_state;
        builder.participants = this.invocation_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.shortlink_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "shortlink_key=", arrayList);
        }
        String str2 = this.shortlink_flow_state;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shortlink_flow_state=", arrayList);
        }
        InvocationContext invocationContext = this.invocation_context;
        if (invocationContext != null) {
            arrayList.add("invocation_context=" + invocationContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetShortlinkRequest{", "}", 0, null, null, 56);
    }
}
