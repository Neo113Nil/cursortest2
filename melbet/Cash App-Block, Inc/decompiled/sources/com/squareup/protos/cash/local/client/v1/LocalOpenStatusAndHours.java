package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatus;", "open_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatus;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "open_hours", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalOpenStatusAndHours extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalOpenStatusAndHours> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenHours#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalOpenHours open_hours;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalOpenStatus#ADAPTER", schemaIndex = 0, tag = 1)
    public final LocalOpenStatus open_status;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "<init>", "()V", "open_status", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatus;", "open_hours", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenHours;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public LocalOpenHours open_hours;
        public LocalOpenStatus open_status;

        @Override // com.squareup.wire.Message.Builder
        public LocalOpenStatusAndHours build() {
            return new LocalOpenStatusAndHours(this.open_status, this.open_hours, buildUnknownFields());
        }

        public final Builder open_hours(LocalOpenHours open_hours) {
            this.open_hours = open_hours;
            return this;
        }

        public final Builder open_status(LocalOpenStatus open_status) {
            this.open_status = open_status;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalOpenStatusAndHours.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalOpenStatusAndHours$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalOpenStatusAndHours decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalOpenStatusAndHours((LocalOpenStatus) obj, (LocalOpenHours) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = LocalOpenStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(LocalOpenHours.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalOpenStatusAndHours value) {
                writer.getClass();
                value.getClass();
                LocalOpenStatus.ADAPTER.encodeWithTag(writer, 1, value.open_status);
                LocalOpenHours.ADAPTER.encodeWithTag(writer, 2, value.open_hours);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalOpenStatusAndHours value) {
                value.getClass();
                return LocalOpenHours.ADAPTER.encodedSizeWithTag(2, value.open_hours) + LocalOpenStatus.ADAPTER.encodedSizeWithTag(1, value.open_status) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalOpenStatusAndHours redact(LocalOpenStatusAndHours value) {
                value.getClass();
                LocalOpenHours localOpenHours = value.open_hours;
                LocalOpenHours localOpenHours2 = localOpenHours != null ? (LocalOpenHours) LocalOpenHours.ADAPTER.redact(localOpenHours) : null;
                ByteString byteString = ByteString.EMPTY;
                LocalOpenStatus localOpenStatus = value.open_status;
                byteString.getClass();
                return new LocalOpenStatusAndHours(localOpenStatus, localOpenHours2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalOpenStatusAndHours value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalOpenHours.ADAPTER.encodeWithTag(writer, 2, value.open_hours);
                LocalOpenStatus.ADAPTER.encodeWithTag(writer, 1, value.open_status);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalOpenStatusAndHours(LocalOpenStatus localOpenStatus, LocalOpenHours localOpenHours, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.open_status = localOpenStatus;
        this.open_hours = localOpenHours;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalOpenStatusAndHours)) {
            return false;
        }
        LocalOpenStatusAndHours localOpenStatusAndHours = (LocalOpenStatusAndHours) obj;
        return Intrinsics.areEqual(unknownFields(), localOpenStatusAndHours.unknownFields()) && this.open_status == localOpenStatusAndHours.open_status && Intrinsics.areEqual(this.open_hours, localOpenStatusAndHours.open_hours);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalOpenStatus localOpenStatus = this.open_status;
        int hashCode2 = (hashCode + (localOpenStatus != null ? localOpenStatus.hashCode() : 0)) * 37;
        LocalOpenHours localOpenHours = this.open_hours;
        int hashCode3 = hashCode2 + (localOpenHours != null ? localOpenHours.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.open_status = this.open_status;
        builder.open_hours = this.open_hours;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalOpenStatus localOpenStatus = this.open_status;
        if (localOpenStatus != null) {
            arrayList.add("open_status=" + localOpenStatus);
        }
        LocalOpenHours localOpenHours = this.open_hours;
        if (localOpenHours != null) {
            arrayList.add("open_hours=" + localOpenHours);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalOpenStatusAndHours{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalOpenStatusAndHours;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalOpenStatusAndHours build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
