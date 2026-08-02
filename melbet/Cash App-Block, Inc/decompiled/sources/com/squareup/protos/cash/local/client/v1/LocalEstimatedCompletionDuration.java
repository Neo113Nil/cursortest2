package com.squareup.protos.cash.local.client.v1;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u0012\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration$Builder;", "", "earliest", "Ljava/lang/Long;", "latest", "getLatest$annotations", "()V", "earliest_within_hours", "Lcom/squareup/protos/cash/local/client/v1/LocalText;", "earliest_within_hours_friendly_fulfillment_time", "Lcom/squareup/protos/cash/local/client/v1/LocalText;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalEstimatedCompletionDuration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalEstimatedCompletionDuration> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long earliest;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long earliest_within_hours;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalText#ADAPTER", schemaIndex = 3, tag = 4)
    public final LocalText earliest_within_hours_friendly_fulfillment_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long latest;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0017\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\fJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "<init>", "()V", "earliest", "", "Ljava/lang/Long;", "latest", "earliest_within_hours", "earliest_within_hours_friendly_fulfillment_time", "Lcom/squareup/protos/cash/local/client/v1/LocalText;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long earliest;
        public Long earliest_within_hours;
        public LocalText earliest_within_hours_friendly_fulfillment_time;
        public Long latest;

        @Override // com.squareup.wire.Message.Builder
        public LocalEstimatedCompletionDuration build() {
            return new LocalEstimatedCompletionDuration(this.earliest, this.latest, this.earliest_within_hours, this.earliest_within_hours_friendly_fulfillment_time, buildUnknownFields());
        }

        public final Builder earliest(Long earliest) {
            this.earliest = earliest;
            return this;
        }

        public final Builder earliest_within_hours(Long earliest_within_hours) {
            this.earliest_within_hours = earliest_within_hours;
            return this;
        }

        public final Builder earliest_within_hours_friendly_fulfillment_time(LocalText earliest_within_hours_friendly_fulfillment_time) {
            this.earliest_within_hours_friendly_fulfillment_time = earliest_within_hours_friendly_fulfillment_time;
            return this;
        }

        @Deprecated
        public final Builder latest(Long latest) {
            this.latest = latest;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalEstimatedCompletionDuration.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LocalEstimatedCompletionDuration decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LocalEstimatedCompletionDuration((Long) obj, (Long) obj2, (Long) obj3, (LocalText) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(LocalText.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalEstimatedCompletionDuration value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 1, value.earliest);
                protoAdapter2.encodeWithTag(writer, 2, value.latest);
                protoAdapter2.encodeWithTag(writer, 3, value.earliest_within_hours);
                LocalText.ADAPTER.encodeWithTag(writer, 4, value.earliest_within_hours_friendly_fulfillment_time);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalEstimatedCompletionDuration value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                return LocalText.ADAPTER.encodedSizeWithTag(4, value.earliest_within_hours_friendly_fulfillment_time) + protoAdapter2.encodedSizeWithTag(3, value.earliest_within_hours) + protoAdapter2.encodedSizeWithTag(2, value.latest) + protoAdapter2.encodedSizeWithTag(1, value.earliest) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalEstimatedCompletionDuration redact(LocalEstimatedCompletionDuration value) {
                value.getClass();
                LocalText localText = value.earliest_within_hours_friendly_fulfillment_time;
                LocalText localText2 = localText != null ? (LocalText) LocalText.ADAPTER.redact(localText) : null;
                ByteString byteString = ByteString.EMPTY;
                Long l = value.earliest;
                Long l2 = value.latest;
                Long l3 = value.earliest_within_hours;
                byteString.getClass();
                return new LocalEstimatedCompletionDuration(l, l2, l3, localText2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalEstimatedCompletionDuration value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalText.ADAPTER.encodeWithTag(writer, 4, value.earliest_within_hours_friendly_fulfillment_time);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(writer, 3, value.earliest_within_hours);
                protoAdapter2.encodeWithTag(writer, 2, value.latest);
                protoAdapter2.encodeWithTag(writer, 1, value.earliest);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalEstimatedCompletionDuration(Long l, Long l2, Long l3, LocalText localText, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.earliest = l;
        this.latest = l2;
        this.earliest_within_hours = l3;
        this.earliest_within_hours_friendly_fulfillment_time = localText;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalEstimatedCompletionDuration)) {
            return false;
        }
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = (LocalEstimatedCompletionDuration) obj;
        return Intrinsics.areEqual(unknownFields(), localEstimatedCompletionDuration.unknownFields()) && Intrinsics.areEqual(this.earliest, localEstimatedCompletionDuration.earliest) && Intrinsics.areEqual(this.latest, localEstimatedCompletionDuration.latest) && Intrinsics.areEqual(this.earliest_within_hours, localEstimatedCompletionDuration.earliest_within_hours) && Intrinsics.areEqual(this.earliest_within_hours_friendly_fulfillment_time, localEstimatedCompletionDuration.earliest_within_hours_friendly_fulfillment_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.earliest;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.latest;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.earliest_within_hours;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        LocalText localText = this.earliest_within_hours_friendly_fulfillment_time;
        int hashCode5 = hashCode4 + (localText != null ? localText.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.earliest = this.earliest;
        builder.latest = this.latest;
        builder.earliest_within_hours = this.earliest_within_hours;
        builder.earliest_within_hours_friendly_fulfillment_time = this.earliest_within_hours_friendly_fulfillment_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.earliest;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("earliest=", l, arrayList);
        }
        Long l2 = this.latest;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("latest=", l2, arrayList);
        }
        Long l3 = this.earliest_within_hours;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("earliest_within_hours=", l3, arrayList);
        }
        LocalText localText = this.earliest_within_hours_friendly_fulfillment_time;
        if (localText != null) {
            arrayList.add("earliest_within_hours_friendly_fulfillment_time=" + localText);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalEstimatedCompletionDuration{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalEstimatedCompletionDuration;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalEstimatedCompletionDuration build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
