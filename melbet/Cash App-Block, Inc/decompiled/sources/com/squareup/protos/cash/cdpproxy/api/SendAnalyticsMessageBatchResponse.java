package com.squareup.protos.cash.cdpproxy.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse$Builder;", "", "invalid_error_msg", "Ljava/lang/String;", "", "", "invalid_message_indexes", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SendAnalyticsMessageBatchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SendAnalyticsMessageBatchResponse> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String invalid_error_msg;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Integer> invalid_message_indexes;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse;", "<init>", "()V", "invalid_message_indexes", "", "", "invalid_error_msg", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String invalid_error_msg;
        public List<Integer> invalid_message_indexes = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public SendAnalyticsMessageBatchResponse build() {
            return new SendAnalyticsMessageBatchResponse(this.invalid_message_indexes, this.invalid_error_msg, buildUnknownFields());
        }

        public final Builder invalid_error_msg(String invalid_error_msg) {
            this.invalid_error_msg = invalid_error_msg;
            return this;
        }

        public final Builder invalid_message_indexes(List<Integer> invalid_message_indexes) {
            invalid_message_indexes.getClass();
            TransactorKt.checkElementsNotNull(invalid_message_indexes);
            this.invalid_message_indexes = invalid_message_indexes;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SendAnalyticsMessageBatchResponse.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cdpproxy.api.SendAnalyticsMessageBatchResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SendAnalyticsMessageBatchResponse decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SendAnalyticsMessageBatchResponse(m, (String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.INT32.decode(reader));
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SendAnalyticsMessageBatchResponse value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 1, value.invalid_message_indexes);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.invalid_error_msg);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SendAnalyticsMessageBatchResponse value) {
                value.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, value.invalid_error_msg) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(1, value.invalid_message_indexes) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SendAnalyticsMessageBatchResponse redact(SendAnalyticsMessageBatchResponse value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                List<Integer> list = value.invalid_message_indexes;
                String str = value.invalid_error_msg;
                value.getClass();
                list.getClass();
                byteString.getClass();
                return new SendAnalyticsMessageBatchResponse(list, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SendAnalyticsMessageBatchResponse value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.invalid_error_msg);
                ProtoAdapter.INT32.asRepeated().encodeWithTag(writer, 1, value.invalid_message_indexes);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsMessageBatchResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.invalid_error_msg = str;
        this.invalid_message_indexes = TransactorKt.immutableCopyOf("invalid_message_indexes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendAnalyticsMessageBatchResponse)) {
            return false;
        }
        SendAnalyticsMessageBatchResponse sendAnalyticsMessageBatchResponse = (SendAnalyticsMessageBatchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), sendAnalyticsMessageBatchResponse.unknownFields()) && Intrinsics.areEqual(this.invalid_message_indexes, sendAnalyticsMessageBatchResponse.invalid_message_indexes) && Intrinsics.areEqual(this.invalid_error_msg, sendAnalyticsMessageBatchResponse.invalid_error_msg);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.invalid_message_indexes);
        String str = this.invalid_error_msg;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.invalid_message_indexes = this.invalid_message_indexes;
        builder.invalid_error_msg = this.invalid_error_msg;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.invalid_message_indexes.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("invalid_message_indexes=", arrayList, this.invalid_message_indexes);
        }
        String str = this.invalid_error_msg;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invalid_error_msg=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SendAnalyticsMessageBatchResponse{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse$Builder;", "", "body", "Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cdpproxy/api/SendAnalyticsMessageBatchResponse;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SendAnalyticsMessageBatchResponse build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
