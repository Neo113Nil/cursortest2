package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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
public final class OpenChatRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenChatRequest> CREATOR;
    public final String entity_id;
    public final String moneybot_session_id;
    public final String support_flow_node_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenChatRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.supportal.app.OpenChatRequest$Companion$ADAPTER$1
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
                        return new OpenChatRequest((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OpenChatRequest openChatRequest = (OpenChatRequest) obj;
                reverseProtoWriter.getClass();
                openChatRequest.getClass();
                reverseProtoWriter.writeBytes(openChatRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, openChatRequest.moneybot_session_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, openChatRequest.support_flow_node_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, openChatRequest.entity_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OpenChatRequest openChatRequest = (OpenChatRequest) obj;
                openChatRequest.getClass();
                int size$okio = openChatRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, openChatRequest.moneybot_session_id) + protoAdapter2.encodedSizeWithTag(3, openChatRequest.support_flow_node_token) + protoAdapter2.encodedSizeWithTag(1, openChatRequest.entity_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OpenChatRequest openChatRequest = (OpenChatRequest) obj;
                openChatRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = openChatRequest.entity_id;
                String str2 = openChatRequest.support_flow_node_token;
                String str3 = openChatRequest.moneybot_session_id;
                byteString.getClass();
                return new OpenChatRequest(str, str2, str3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OpenChatRequest openChatRequest = (OpenChatRequest) obj;
                openChatRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, openChatRequest.entity_id);
                protoAdapter2.encodeWithTag(protoWriter, 3, openChatRequest.support_flow_node_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, openChatRequest.moneybot_session_id);
                protoWriter.writeBytes(openChatRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenChatRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entity_id = str;
        this.support_flow_node_token = str2;
        this.moneybot_session_id = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenChatRequest)) {
            return false;
        }
        OpenChatRequest openChatRequest = (OpenChatRequest) obj;
        return Intrinsics.areEqual(unknownFields(), openChatRequest.unknownFields()) && Intrinsics.areEqual(this.entity_id, openChatRequest.entity_id) && Intrinsics.areEqual(this.support_flow_node_token, openChatRequest.support_flow_node_token) && Intrinsics.areEqual(this.moneybot_session_id, openChatRequest.moneybot_session_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.entity_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.support_flow_node_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.moneybot_session_id;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(28);
        builder.contact_support_url = this.entity_id;
        builder.privacy_policy_url = this.support_flow_node_token;
        builder.terms_of_service_url = this.moneybot_session_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.entity_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
        }
        String str2 = this.support_flow_node_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "support_flow_node_token=", arrayList);
        }
        String str3 = this.moneybot_session_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "moneybot_session_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenChatRequest{", "}", 0, null, null, 56);
    }
}
