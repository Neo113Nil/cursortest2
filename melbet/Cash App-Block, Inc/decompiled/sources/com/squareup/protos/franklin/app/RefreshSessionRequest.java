package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.BankingConfig;
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
public final class RefreshSessionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshSessionRequest> CREATOR;
    public final String backup_tag;
    public final ClientSecurityContext client_security_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RefreshSessionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.RefreshSessionRequest$Companion$ADAPTER$1
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
                        return new RefreshSessionRequest((String) obj, (ClientSecurityContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(ClientSecurityContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RefreshSessionRequest refreshSessionRequest = (RefreshSessionRequest) obj;
                reverseProtoWriter.getClass();
                refreshSessionRequest.getClass();
                reverseProtoWriter.writeBytes(refreshSessionRequest.unknownFields());
                ClientSecurityContext.ADAPTER.encodeWithTag(reverseProtoWriter, 5, refreshSessionRequest.client_security_context);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, refreshSessionRequest.backup_tag);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RefreshSessionRequest refreshSessionRequest = (RefreshSessionRequest) obj;
                refreshSessionRequest.getClass();
                return ClientSecurityContext.ADAPTER.encodedSizeWithTag(5, refreshSessionRequest.client_security_context) + ProtoAdapter.STRING.encodedSizeWithTag(3, refreshSessionRequest.backup_tag) + refreshSessionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RefreshSessionRequest refreshSessionRequest = (RefreshSessionRequest) obj;
                refreshSessionRequest.getClass();
                ClientSecurityContext clientSecurityContext = refreshSessionRequest.client_security_context;
                ClientSecurityContext clientSecurityContext2 = clientSecurityContext != null ? (ClientSecurityContext) ClientSecurityContext.ADAPTER.redact(clientSecurityContext) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new RefreshSessionRequest(null, clientSecurityContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RefreshSessionRequest refreshSessionRequest = (RefreshSessionRequest) obj;
                refreshSessionRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, refreshSessionRequest.backup_tag);
                ClientSecurityContext.ADAPTER.encodeWithTag(protoWriter, 5, refreshSessionRequest.client_security_context);
                protoWriter.writeBytes(refreshSessionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshSessionRequest(String str, ClientSecurityContext clientSecurityContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.backup_tag = str;
        this.client_security_context = clientSecurityContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshSessionRequest)) {
            return false;
        }
        RefreshSessionRequest refreshSessionRequest = (RefreshSessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), refreshSessionRequest.unknownFields()) && Intrinsics.areEqual(this.backup_tag, refreshSessionRequest.backup_tag) && Intrinsics.areEqual(this.client_security_context, refreshSessionRequest.client_security_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.backup_tag;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        int hashCode3 = hashCode2 + (clientSecurityContext != null ? clientSecurityContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(24);
        builder.strings = this.backup_tag;
        builder.recurring_deposits_dda_upsell = this.client_security_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.backup_tag != null) {
            arrayList.add("backup_tag=██");
        }
        ClientSecurityContext clientSecurityContext = this.client_security_context;
        if (clientSecurityContext != null) {
            arrayList.add("client_security_context=" + clientSecurityContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshSessionRequest{", "}", 0, null, null, 56);
    }
}
