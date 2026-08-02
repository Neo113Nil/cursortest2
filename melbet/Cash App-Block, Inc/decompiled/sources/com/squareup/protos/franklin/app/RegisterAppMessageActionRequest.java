package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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
public final class RegisterAppMessageActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterAppMessageActionRequest> CREATOR;
    public final String action_identifier;
    public final String message_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RegisterAppMessageActionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.RegisterAppMessageActionRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RegisterAppMessageActionRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RegisterAppMessageActionRequest registerAppMessageActionRequest = (RegisterAppMessageActionRequest) obj;
                reverseProtoWriter.getClass();
                registerAppMessageActionRequest.getClass();
                reverseProtoWriter.writeBytes(registerAppMessageActionRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, registerAppMessageActionRequest.action_identifier);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, registerAppMessageActionRequest.message_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RegisterAppMessageActionRequest registerAppMessageActionRequest = (RegisterAppMessageActionRequest) obj;
                registerAppMessageActionRequest.getClass();
                int size$okio = registerAppMessageActionRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(2, registerAppMessageActionRequest.action_identifier) + protoAdapter2.encodedSizeWithTag(1, registerAppMessageActionRequest.message_token) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RegisterAppMessageActionRequest registerAppMessageActionRequest = (RegisterAppMessageActionRequest) obj;
                registerAppMessageActionRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = registerAppMessageActionRequest.message_token;
                String str2 = registerAppMessageActionRequest.action_identifier;
                byteString.getClass();
                return new RegisterAppMessageActionRequest(str, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RegisterAppMessageActionRequest registerAppMessageActionRequest = (RegisterAppMessageActionRequest) obj;
                registerAppMessageActionRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, registerAppMessageActionRequest.message_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, registerAppMessageActionRequest.action_identifier);
                protoWriter.writeBytes(registerAppMessageActionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterAppMessageActionRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message_token = str;
        this.action_identifier = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterAppMessageActionRequest)) {
            return false;
        }
        RegisterAppMessageActionRequest registerAppMessageActionRequest = (RegisterAppMessageActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), registerAppMessageActionRequest.unknownFields()) && Intrinsics.areEqual(this.message_token, registerAppMessageActionRequest.message_token) && Intrinsics.areEqual(this.action_identifier, registerAppMessageActionRequest.action_identifier);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.action_identifier;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(26);
        builder.name = this.message_token;
        builder.value = this.action_identifier;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_token=", arrayList);
        }
        String str2 = this.action_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action_identifier=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterAppMessageActionRequest{", "}", 0, null, null, 56);
    }
}
