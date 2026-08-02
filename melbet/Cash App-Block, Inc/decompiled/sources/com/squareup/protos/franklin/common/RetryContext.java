package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.RetryContext;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0012\u0011\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/RetryContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/RetryContext$Builder;", "", "created_at", "Ljava/lang/Long;", "retry_attempt", "", "is_foreground", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "error_context", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "", "Lcom/squareup/protos/franklin/api/Instrument;", "instruments", "Ljava/util/List;", "Companion", "Builder", "ErrorContext", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetryContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RetryContext> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long created_at;

    @WireField(adapter = "com.squareup.protos.franklin.common.RetryContext$ErrorContext#ADAPTER", schemaIndex = 4, tag = 5)
    public final ErrorContext error_context;

    @WireField(adapter = "com.squareup.protos.franklin.api.Instrument#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Instrument> instruments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean is_foreground;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long retry_attempt;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0012J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/RetryContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/RetryContext;", "<init>", "()V", "created_at", "", "Ljava/lang/Long;", "retry_attempt", "instruments", "", "Lcom/squareup/protos/franklin/api/Instrument;", "is_foreground", "", "Ljava/lang/Boolean;", "error_context", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/RetryContext$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/RetryContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public Long created_at;
        public ErrorContext error_context;
        public List<Instrument> instruments = EmptyList.INSTANCE;
        public Boolean is_foreground;
        public Long retry_attempt;

        @Override // com.squareup.wire.Message.Builder
        public RetryContext build() {
            return new RetryContext(this.created_at, this.retry_attempt, this.instruments, this.is_foreground, this.error_context, buildUnknownFields());
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        public final Builder error_context(ErrorContext error_context) {
            this.error_context = error_context;
            return this;
        }

        public final Builder instruments(List<Instrument> instruments) {
            instruments.getClass();
            TransactorKt.checkElementsNotNull(instruments);
            this.instruments = instruments;
            return this;
        }

        public final Builder is_foreground(Boolean is_foreground) {
            this.is_foreground = is_foreground;
            return this;
        }

        public final Builder retry_attempt(Long retry_attempt) {
            this.retry_attempt = retry_attempt;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RetryContext.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.RetryContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RetryContext decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RetryContext((Long) obj, (Long) obj2, m, (Boolean) obj3, (RetryContext.ErrorContext) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 3) {
                        m.add(Instrument.ADAPTER.decode(reader));
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(RetryContext.ErrorContext.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RetryContext value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 1, value.created_at);
                protoAdapter2.encodeWithTag(writer, 2, value.retry_attempt);
                Instrument.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.instruments);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.is_foreground);
                RetryContext.ErrorContext.ADAPTER.encodeWithTag(writer, 5, value.error_context);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RetryContext value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                return RetryContext.ErrorContext.ADAPTER.encodedSizeWithTag(5, value.error_context) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.is_foreground) + Instrument.ADAPTER.asRepeated().encodedSizeWithTag(3, value.instruments) + protoAdapter2.encodedSizeWithTag(2, value.retry_attempt) + protoAdapter2.encodedSizeWithTag(1, value.created_at) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RetryContext redact(RetryContext value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.instruments, Instrument.ADAPTER);
                RetryContext.ErrorContext errorContext = value.error_context;
                RetryContext.ErrorContext errorContext2 = errorContext != null ? (RetryContext.ErrorContext) RetryContext.ErrorContext.ADAPTER.redact(errorContext) : null;
                ByteString byteString = ByteString.EMPTY;
                Long l = value.created_at;
                Long l2 = value.retry_attempt;
                Boolean bool = value.is_foreground;
                byteString.getClass();
                return new RetryContext(l, l2, m1169redactElements, bool, errorContext2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RetryContext value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                RetryContext.ErrorContext.ADAPTER.encodeWithTag(writer, 5, value.error_context);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.is_foreground);
                Instrument.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.instruments);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 2, value.retry_attempt);
                protoAdapter2.encodeWithTag(writer, 1, value.created_at);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryContext(Long l, Long l2, List list, Boolean bool, ErrorContext errorContext, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.created_at = l;
        this.retry_attempt = l2;
        this.is_foreground = bool;
        this.error_context = errorContext;
        this.instruments = TransactorKt.immutableCopyOf("instruments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetryContext)) {
            return false;
        }
        RetryContext retryContext = (RetryContext) obj;
        return Intrinsics.areEqual(unknownFields(), retryContext.unknownFields()) && Intrinsics.areEqual(this.created_at, retryContext.created_at) && Intrinsics.areEqual(this.retry_attempt, retryContext.retry_attempt) && Intrinsics.areEqual(this.instruments, retryContext.instruments) && Intrinsics.areEqual(this.is_foreground, retryContext.is_foreground) && Intrinsics.areEqual(this.error_context, retryContext.error_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.created_at;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.retry_attempt;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37, 37, this.instruments);
        Boolean bool = this.is_foreground;
        int hashCode3 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ErrorContext errorContext = this.error_context;
        int hashCode4 = hashCode3 + (errorContext != null ? errorContext.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.created_at = this.created_at;
        builder.retry_attempt = this.retry_attempt;
        builder.instruments = this.instruments;
        builder.is_foreground = this.is_foreground;
        builder.error_context = this.error_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.retry_attempt;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("retry_attempt=", l2, arrayList);
        }
        if (!this.instruments.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instruments=", arrayList, this.instruments);
        }
        Boolean bool = this.is_foreground;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_foreground=", bool, arrayList);
        }
        ErrorContext errorContext = this.error_context;
        if (errorContext != null) {
            arrayList.add("error_context=" + errorContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RetryContext{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0007H\u0016J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext$Builder;", "first_request_created_at", "", "first_response_created_at", "first_error_response", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ErrorContext extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ErrorContext> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String first_error_response;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
        public final Long first_request_created_at;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
        public final Long first_response_created_at;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "<init>", "()V", "first_request_created_at", "", "Ljava/lang/Long;", "first_response_created_at", "first_error_response", "", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String first_error_response;
            public Long first_request_created_at;
            public Long first_response_created_at;

            @Override // com.squareup.wire.Message.Builder
            public ErrorContext build() {
                return new ErrorContext(this.first_request_created_at, this.first_response_created_at, this.first_error_response, buildUnknownFields());
            }

            public final Builder first_error_response(String first_error_response) {
                this.first_error_response = first_error_response;
                return this;
            }

            public final Builder first_request_created_at(Long first_request_created_at) {
                this.first_request_created_at = first_request_created_at;
                return this;
            }

            public final Builder first_response_created_at(Long first_response_created_at) {
                this.first_response_created_at = first_response_created_at;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ErrorContext.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.RetryContext$ErrorContext$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public RetryContext.ErrorContext decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new RetryContext.ErrorContext((Long) obj, (Long) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, RetryContext.ErrorContext value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    protoAdapter2.encodeWithTag(writer, 1, value.first_request_created_at);
                    protoAdapter2.encodeWithTag(writer, 2, value.first_response_created_at);
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.first_error_response);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(RetryContext.ErrorContext value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    return ProtoAdapter.STRING.encodedSizeWithTag(3, value.first_error_response) + protoAdapter2.encodedSizeWithTag(2, value.first_response_created_at) + protoAdapter2.encodedSizeWithTag(1, value.first_request_created_at) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public RetryContext.ErrorContext redact(RetryContext.ErrorContext value) {
                    value.getClass();
                    return RetryContext.ErrorContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, RetryContext.ErrorContext value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.first_error_response);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                    protoAdapter2.encodeWithTag(writer, 2, value.first_response_created_at);
                    protoAdapter2.encodeWithTag(writer, 1, value.first_request_created_at);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ErrorContext(Long l, Long l2, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ErrorContext copy$default(ErrorContext errorContext, Long l, Long l2, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                l = errorContext.first_request_created_at;
            }
            if ((i & 2) != 0) {
                l2 = errorContext.first_response_created_at;
            }
            if ((i & 4) != 0) {
                str = errorContext.first_error_response;
            }
            if ((i & 8) != 0) {
                byteString = errorContext.unknownFields();
            }
            return errorContext.copy(l, l2, str, byteString);
        }

        public final ErrorContext copy(Long first_request_created_at, Long first_response_created_at, String first_error_response, ByteString unknownFields) {
            unknownFields.getClass();
            return new ErrorContext(first_request_created_at, first_response_created_at, first_error_response, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ErrorContext)) {
                return false;
            }
            ErrorContext errorContext = (ErrorContext) other;
            return Intrinsics.areEqual(unknownFields(), errorContext.unknownFields()) && Intrinsics.areEqual(this.first_request_created_at, errorContext.first_request_created_at) && Intrinsics.areEqual(this.first_response_created_at, errorContext.first_response_created_at) && Intrinsics.areEqual(this.first_error_response, errorContext.first_error_response);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.first_request_created_at;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.first_response_created_at;
            int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            String str = this.first_error_response;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.first_request_created_at = this.first_request_created_at;
            builder.first_response_created_at = this.first_response_created_at;
            builder.first_error_response = this.first_error_response;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.first_request_created_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("first_request_created_at=", l, arrayList);
            }
            Long l2 = this.first_response_created_at;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("first_response_created_at=", l2, arrayList);
            }
            String str = this.first_error_response;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "first_error_response=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ErrorContext{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/RetryContext$ErrorContext;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ErrorContext build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ErrorContext() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorContext(Long l, Long l2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.first_request_created_at = l;
            this.first_response_created_at = l2;
            this.first_error_response = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/RetryContext$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/RetryContext$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/RetryContext;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/RetryContext;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RetryContext build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public RetryContext(Long l, Long l2, ErrorContext errorContext, int i) {
        this(l, l2, EmptyList.INSTANCE, null, (i & 16) != 0 ? null : errorContext, ByteString.EMPTY);
    }
}
