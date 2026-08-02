package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DeleteTriggeredActionRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteTriggeredActionRequest$Builder;", "", "id", "Ljava/lang/String;", "session_id", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "attribution_context", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeleteTriggeredActionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DeleteTriggeredActionRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.AutomationAttributionContext#ADAPTER", schemaIndex = 2, tag = 3)
    public final AutomationAttributionContext attribution_context;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String session_id;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/DeleteTriggeredActionRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/DeleteTriggeredActionRequest;", "<init>", "()V", "id", "", "session_id", "attribution_context", "Lcom/squareup/protos/cash/kgoose/api/v3/AutomationAttributionContext;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public AutomationAttributionContext attribution_context;
        public String id;
        public String session_id;

        public final Builder attribution_context(AutomationAttributionContext attribution_context) {
            this.attribution_context = attribution_context;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public DeleteTriggeredActionRequest build() {
            return new DeleteTriggeredActionRequest(this.id, this.session_id, this.attribution_context, buildUnknownFields());
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder session_id(String session_id) {
            this.session_id = session_id;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DeleteTriggeredActionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.DeleteTriggeredActionRequest$Companion$ADAPTER$1
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
                        return new DeleteTriggeredActionRequest((String) obj, (String) obj2, (AutomationAttributionContext) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(AutomationAttributionContext.ADAPTER, protoReader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                DeleteTriggeredActionRequest deleteTriggeredActionRequest = (DeleteTriggeredActionRequest) obj;
                reverseProtoWriter.getClass();
                deleteTriggeredActionRequest.getClass();
                reverseProtoWriter.writeBytes(deleteTriggeredActionRequest.unknownFields());
                AutomationAttributionContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, deleteTriggeredActionRequest.attribution_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, deleteTriggeredActionRequest.session_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, deleteTriggeredActionRequest.id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                DeleteTriggeredActionRequest deleteTriggeredActionRequest = (DeleteTriggeredActionRequest) obj;
                deleteTriggeredActionRequest.getClass();
                int size$okio = deleteTriggeredActionRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return AutomationAttributionContext.ADAPTER.encodedSizeWithTag(3, deleteTriggeredActionRequest.attribution_context) + protoAdapter2.encodedSizeWithTag(2, deleteTriggeredActionRequest.session_id) + protoAdapter2.encodedSizeWithTag(1, deleteTriggeredActionRequest.id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                DeleteTriggeredActionRequest deleteTriggeredActionRequest = (DeleteTriggeredActionRequest) obj;
                deleteTriggeredActionRequest.getClass();
                AutomationAttributionContext automationAttributionContext = deleteTriggeredActionRequest.attribution_context;
                AutomationAttributionContext automationAttributionContext2 = automationAttributionContext != null ? (AutomationAttributionContext) AutomationAttributionContext.ADAPTER.redact(automationAttributionContext) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = deleteTriggeredActionRequest.id;
                String str2 = deleteTriggeredActionRequest.session_id;
                byteString.getClass();
                return new DeleteTriggeredActionRequest(str, str2, automationAttributionContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                DeleteTriggeredActionRequest deleteTriggeredActionRequest = (DeleteTriggeredActionRequest) obj;
                deleteTriggeredActionRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, deleteTriggeredActionRequest.id);
                protoAdapter2.encodeWithTag(protoWriter, 2, deleteTriggeredActionRequest.session_id);
                AutomationAttributionContext.ADAPTER.encodeWithTag(protoWriter, 3, deleteTriggeredActionRequest.attribution_context);
                protoWriter.writeBytes(deleteTriggeredActionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteTriggeredActionRequest(String str, String str2, AutomationAttributionContext automationAttributionContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.session_id = str2;
        this.attribution_context = automationAttributionContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteTriggeredActionRequest)) {
            return false;
        }
        DeleteTriggeredActionRequest deleteTriggeredActionRequest = (DeleteTriggeredActionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), deleteTriggeredActionRequest.unknownFields()) && Intrinsics.areEqual(this.id, deleteTriggeredActionRequest.id) && Intrinsics.areEqual(this.session_id, deleteTriggeredActionRequest.session_id) && Intrinsics.areEqual(this.attribution_context, deleteTriggeredActionRequest.attribution_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.session_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AutomationAttributionContext automationAttributionContext = this.attribution_context;
        int hashCode4 = hashCode3 + (automationAttributionContext != null ? automationAttributionContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.session_id = this.session_id;
        builder.attribution_context = this.attribution_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.session_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "session_id=", arrayList);
        }
        AutomationAttributionContext automationAttributionContext = this.attribution_context;
        if (automationAttributionContext != null) {
            arrayList.add("attribution_context=" + automationAttributionContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DeleteTriggeredActionRequest{", "}", 0, null, null, 56);
    }
}
