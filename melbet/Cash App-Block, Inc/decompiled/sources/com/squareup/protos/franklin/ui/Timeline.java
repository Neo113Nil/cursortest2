package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000e\u000f\r\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/Timeline$Builder;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule;", "collapse_rule", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule;", "", "id", "Ljava/lang/String;", "", "Lcom/squareup/protos/franklin/ui/Timeline$Event;", "events", "Ljava/util/List;", "Companion", "Builder", "CollapseRule", "Event", "CollapseRanges", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Timeline extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Timeline> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final CollapseRule collapse_rule;

    @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline$Event#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Event> events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String id;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/Timeline;", "<init>", "()V", "events", "", "Lcom/squareup/protos/franklin/ui/Timeline$Event;", "collapse_rule", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule;", "id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public CollapseRule collapse_rule;
        public List<Event> events = EmptyList.INSTANCE;
        public String id;

        @Override // com.squareup.wire.Message.Builder
        public Timeline build() {
            return new Timeline(this.events, this.collapse_rule, this.id, buildUnknownFields());
        }

        public final Builder collapse_rule(CollapseRule collapse_rule) {
            this.collapse_rule = collapse_rule;
            return this;
        }

        public final Builder events(List<Event> events) {
            events.getClass();
            TransactorKt.checkElementsNotNull(events);
            this.events = events;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Builder;", "ranges", "", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Range", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CollapseRanges extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CollapseRanges> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline$CollapseRanges$Range#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Range> ranges;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;", "<init>", "()V", "ranges", "", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Range> ranges = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public CollapseRanges build() {
                return new CollapseRanges(this.ranges, buildUnknownFields());
            }

            public final Builder ranges(List<Range> ranges) {
                ranges.getClass();
                TransactorKt.checkElementsNotNull(ranges);
                this.ranges = ranges;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CollapseRanges.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.Timeline$CollapseRanges$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Timeline.CollapseRanges decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Timeline.CollapseRanges(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(Timeline.CollapseRanges.Range.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Timeline.CollapseRanges value) {
                    writer.getClass();
                    value.getClass();
                    Timeline.CollapseRanges.Range.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.ranges);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Timeline.CollapseRanges value) {
                    value.getClass();
                    return Timeline.CollapseRanges.Range.ADAPTER.asRepeated().encodedSizeWithTag(1, value.ranges) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Timeline.CollapseRanges redact(Timeline.CollapseRanges value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.ranges, Timeline.CollapseRanges.Range.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Timeline.CollapseRanges value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Timeline.CollapseRanges.Range.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.ranges);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollapseRanges(List<Range> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.ranges = TransactorKt.immutableCopyOf("ranges", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CollapseRanges copy$default(CollapseRanges collapseRanges, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = collapseRanges.ranges;
            }
            if ((i & 2) != 0) {
                byteString = collapseRanges.unknownFields();
            }
            return collapseRanges.copy(list, byteString);
        }

        public final CollapseRanges copy(List<Range> ranges, ByteString unknownFields) {
            ranges.getClass();
            unknownFields.getClass();
            return new CollapseRanges(ranges, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CollapseRanges)) {
                return false;
            }
            CollapseRanges collapseRanges = (CollapseRanges) other;
            return Intrinsics.areEqual(unknownFields(), collapseRanges.unknownFields()) && Intrinsics.areEqual(this.ranges, collapseRanges.ranges);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.ranges.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.ranges = this.ranges;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.ranges.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("ranges=", arrayList, this.ranges);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CollapseRanges{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range$Builder;", "collapse_start_index", "", "collapse_end_index", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Range extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Range> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
            public final Integer collapse_end_index;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
            public final Integer collapse_start_index;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
            public final LocalizedString label;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "<init>", "()V", "collapse_start_index", "", "Ljava/lang/Integer;", "collapse_end_index", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Integer collapse_end_index;
                public Integer collapse_start_index;
                public LocalizedString label;

                @Override // com.squareup.wire.Message.Builder
                public Range build() {
                    return new Range(this.collapse_start_index, this.collapse_end_index, this.label, buildUnknownFields());
                }

                public final Builder collapse_end_index(Integer collapse_end_index) {
                    this.collapse_end_index = collapse_end_index;
                    return this;
                }

                public final Builder collapse_start_index(Integer collapse_start_index) {
                    this.collapse_start_index = collapse_start_index;
                    return this;
                }

                public final Builder label(LocalizedString label) {
                    this.label = label;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Range.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.Timeline$CollapseRanges$Range$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public Timeline.CollapseRanges.Range decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new Timeline.CollapseRanges.Range((Integer) obj, (Integer) obj2, (LocalizedString) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.INT32.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.INT32.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, Timeline.CollapseRanges.Range value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                        protoAdapter2.encodeWithTag(writer, 1, value.collapse_start_index);
                        protoAdapter2.encodeWithTag(writer, 2, value.collapse_end_index);
                        LocalizedString.ADAPTER.encodeWithTag(writer, 3, value.label);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(Timeline.CollapseRanges.Range value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                        return LocalizedString.ADAPTER.encodedSizeWithTag(3, value.label) + protoAdapter2.encodedSizeWithTag(2, value.collapse_end_index) + protoAdapter2.encodedSizeWithTag(1, value.collapse_start_index) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public Timeline.CollapseRanges.Range redact(Timeline.CollapseRanges.Range value) {
                        value.getClass();
                        LocalizedString localizedString = value.label;
                        return Timeline.CollapseRanges.Range.copy$default(value, null, null, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, Timeline.CollapseRanges.Range value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        LocalizedString.ADAPTER.encodeWithTag(writer, 3, value.label);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                        protoAdapter2.encodeWithTag(writer, 2, value.collapse_end_index);
                        protoAdapter2.encodeWithTag(writer, 1, value.collapse_start_index);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Range(Integer num, Integer num2, LocalizedString localizedString, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : localizedString, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Range copy$default(Range range, Integer num, Integer num2, LocalizedString localizedString, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = range.collapse_start_index;
                }
                if ((i & 2) != 0) {
                    num2 = range.collapse_end_index;
                }
                if ((i & 4) != 0) {
                    localizedString = range.label;
                }
                if ((i & 8) != 0) {
                    byteString = range.unknownFields();
                }
                return range.copy(num, num2, localizedString, byteString);
            }

            public final Range copy(Integer collapse_start_index, Integer collapse_end_index, LocalizedString label, ByteString unknownFields) {
                unknownFields.getClass();
                return new Range(collapse_start_index, collapse_end_index, label, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Range)) {
                    return false;
                }
                Range range = (Range) other;
                return Intrinsics.areEqual(unknownFields(), range.unknownFields()) && Intrinsics.areEqual(this.collapse_start_index, range.collapse_start_index) && Intrinsics.areEqual(this.collapse_end_index, range.collapse_end_index) && Intrinsics.areEqual(this.label, range.label);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Integer num = this.collapse_start_index;
                int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                Integer num2 = this.collapse_end_index;
                int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
                LocalizedString localizedString = this.label;
                int hashCode4 = hashCode3 + (localizedString != null ? localizedString.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.collapse_start_index = this.collapse_start_index;
                builder.collapse_end_index = this.collapse_end_index;
                builder.label = this.label;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Integer num = this.collapse_start_index;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("collapse_start_index=", num, arrayList);
                }
                Integer num2 = this.collapse_end_index;
                if (num2 != null) {
                    re$$ExternalSyntheticOutline0.m("collapse_end_index=", num2, arrayList);
                }
                LocalizedString localizedString = this.label;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Range{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Range;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Range build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Range() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Range(Integer num, Integer num2, LocalizedString localizedString, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.collapse_start_index = num;
                this.collapse_end_index = num2;
                this.label = localizedString;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CollapseRanges build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CollapseRanges(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public CollapseRanges() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005&'()*BÅ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0082\u0004J\n\u0010\"\u001a\u00020#H\u0096\u0080\u0004J\b\u0010$\u001a\u00020\u0006H\u0016JÄ\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/Timeline$Event$Builder;", "icon", "Lcom/squareup/protos/franklin/ui/Timeline$Event$Icon;", "title", "", "detail_text", "detail_text_color", "Lcom/squareup/protos/cash/ui/Color;", "inline_description_text", "inline_description_text_format", "Lcom/squareup/protos/franklin/ui/Timeline$Event$InlineTextFormat;", "localizable_title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_detail_text", "localizable_inline_description_text", "tap_action_url", "body_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_text_color", "descriptor_text", "state", "Lcom/squareup/protos/franklin/ui/Timeline$Event$State;", "id", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/Timeline$Event$Icon;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/Timeline$Event$InlineTextFormat;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/localization/LocalizableString;Lcom/squareup/protos/cash/localization/LocalizableString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/franklin/ui/Timeline$Event$State;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Icon", "InlineTextFormat", "State", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Event extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Event> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 10, tag = 10)
        public final LocalizedString body_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 11, tag = 15)
        public final Color body_text_color;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 12, tag = 11)
        public final LocalizedString descriptor_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String detail_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 3, tag = 14)
        public final Color detail_text_color;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline$Event$Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 13)
        public final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 4)
        public final String inline_description_text;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline$Event$InlineTextFormat#ADAPTER", schemaIndex = 5, tag = 5)
        public final InlineTextFormat inline_description_text_format;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 7, tag = 7)
        public final LocalizableString localizable_detail_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 8, tag = 8)
        public final LocalizableString localizable_inline_description_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 6, tag = 6)
        public final LocalizableString localizable_title;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline$Event$State#ADAPTER", schemaIndex = 13, tag = 12)
        public final State state;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 9)
        public final String tap_action_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/Timeline$Event;", "<init>", "()V", "icon", "Lcom/squareup/protos/franklin/ui/Timeline$Event$Icon;", "title", "", "detail_text", "detail_text_color", "Lcom/squareup/protos/cash/ui/Color;", "inline_description_text", "inline_description_text_format", "Lcom/squareup/protos/franklin/ui/Timeline$Event$InlineTextFormat;", "localizable_title", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_detail_text", "localizable_inline_description_text", "tap_action_url", "body_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_text_color", "descriptor_text", "state", "Lcom/squareup/protos/franklin/ui/Timeline$Event$State;", "id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString body_text;
            public Color body_text_color;
            public LocalizedString descriptor_text;
            public String detail_text;
            public Color detail_text_color;
            public Icon icon;
            public String id;
            public String inline_description_text;
            public InlineTextFormat inline_description_text_format;
            public LocalizableString localizable_detail_text;
            public LocalizableString localizable_inline_description_text;
            public LocalizableString localizable_title;
            public State state;
            public String tap_action_url;
            public String title;

            public final Builder body_text(LocalizedString body_text) {
                this.body_text = body_text;
                return this;
            }

            public final Builder body_text_color(Color body_text_color) {
                this.body_text_color = body_text_color;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Event build() {
                return new Event(this.icon, this.title, this.detail_text, this.detail_text_color, this.inline_description_text, this.inline_description_text_format, this.localizable_title, this.localizable_detail_text, this.localizable_inline_description_text, this.tap_action_url, this.body_text, this.body_text_color, this.descriptor_text, this.state, this.id, buildUnknownFields());
            }

            public final Builder descriptor_text(LocalizedString descriptor_text) {
                this.descriptor_text = descriptor_text;
                return this;
            }

            public final Builder detail_text(String detail_text) {
                this.detail_text = detail_text;
                return this;
            }

            public final Builder detail_text_color(Color detail_text_color) {
                this.detail_text_color = detail_text_color;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder inline_description_text(String inline_description_text) {
                this.inline_description_text = inline_description_text;
                return this;
            }

            public final Builder inline_description_text_format(InlineTextFormat inline_description_text_format) {
                this.inline_description_text_format = inline_description_text_format;
                return this;
            }

            public final Builder localizable_detail_text(LocalizableString localizable_detail_text) {
                this.localizable_detail_text = localizable_detail_text;
                return this;
            }

            public final Builder localizable_inline_description_text(LocalizableString localizable_inline_description_text) {
                this.localizable_inline_description_text = localizable_inline_description_text;
                return this;
            }

            public final Builder localizable_title(LocalizableString localizable_title) {
                this.localizable_title = localizable_title;
                return this;
            }

            public final Builder state(State state) {
                this.state = state;
                return this;
            }

            public final Builder tap_action_url(String tap_action_url) {
                this.tap_action_url = tap_action_url;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Event.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.Timeline$Event$Companion$ADAPTER$1
                /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
                @Override // com.squareup.wire.ProtoAdapter
                public Timeline.Event decode(ProtoReader reader) {
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    Object obj11 = null;
                    Object obj12 = null;
                    Object obj13 = null;
                    Object obj14 = null;
                    Object obj15 = null;
                    Object obj16 = null;
                    Object obj17 = null;
                    Object obj18 = null;
                    Object obj19 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Timeline.Event((Timeline.Event.Icon) obj5, (String) obj19, (String) obj7, (Color) obj8, (String) obj9, (Timeline.Event.InlineTextFormat) obj10, (LocalizableString) obj11, (LocalizableString) obj12, (LocalizableString) obj13, (String) obj14, (LocalizedString) obj15, (Color) obj16, (LocalizedString) obj6, (Timeline.Event.State) obj17, (String) obj18, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = obj7;
                                obj2 = obj8;
                                obj3 = obj9;
                                try {
                                    obj4 = Timeline.Event.Icon.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                obj7 = obj;
                                obj9 = obj3;
                                obj8 = obj2;
                                break;
                            case 2:
                                obj19 = ProtoAdapter.STRING.decode(reader);
                                obj4 = obj5;
                                break;
                            case 3:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                obj4 = obj5;
                                break;
                            case 4:
                                obj9 = ProtoAdapter.STRING.decode(reader);
                                obj4 = obj5;
                                break;
                            case 5:
                                obj = obj7;
                                obj2 = obj8;
                                obj3 = obj9;
                                try {
                                    obj10 = Timeline.Event.InlineTextFormat.ADAPTER.decode(reader);
                                    obj7 = obj;
                                    obj9 = obj3;
                                    obj8 = obj2;
                                    obj4 = obj5;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 6:
                                obj11 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj11);
                                obj4 = obj5;
                                break;
                            case 7:
                                obj12 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj12);
                                obj4 = obj5;
                                break;
                            case 8:
                                obj13 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj13);
                                obj4 = obj5;
                                break;
                            case 9:
                                obj14 = ProtoAdapter.STRING.decode(reader);
                                obj4 = obj5;
                                break;
                            case 10:
                                obj15 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj15);
                                obj4 = obj5;
                                break;
                            case 11:
                                obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj6);
                                obj4 = obj5;
                                break;
                            case 12:
                                try {
                                    obj17 = Timeline.Event.State.ADAPTER.decode(reader);
                                    obj4 = obj5;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    obj = obj7;
                                    obj2 = obj8;
                                    obj3 = obj9;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 13:
                                obj18 = ProtoAdapter.STRING.decode(reader);
                                obj4 = obj5;
                                break;
                            case 14:
                                obj8 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj8);
                                obj4 = obj5;
                                break;
                            case 15:
                                obj16 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj16);
                                obj4 = obj5;
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj7;
                                obj2 = obj8;
                                obj3 = obj9;
                                obj4 = obj5;
                                obj7 = obj;
                                obj9 = obj3;
                                obj8 = obj2;
                                break;
                        }
                        obj5 = obj4;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Timeline.Event value) {
                    writer.getClass();
                    value.getClass();
                    Timeline.Event.Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.detail_text);
                    ProtoAdapter protoAdapter3 = Color.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 14, value.detail_text_color);
                    protoAdapter2.encodeWithTag(writer, 4, value.inline_description_text);
                    Timeline.Event.InlineTextFormat.ADAPTER.encodeWithTag(writer, 5, value.inline_description_text_format);
                    ProtoAdapter protoAdapter4 = LocalizableString.ADAPTER;
                    protoAdapter4.encodeWithTag(writer, 6, value.localizable_title);
                    protoAdapter4.encodeWithTag(writer, 7, value.localizable_detail_text);
                    protoAdapter4.encodeWithTag(writer, 8, value.localizable_inline_description_text);
                    protoAdapter2.encodeWithTag(writer, 9, value.tap_action_url);
                    ProtoAdapter protoAdapter5 = LocalizedString.ADAPTER;
                    protoAdapter5.encodeWithTag(writer, 10, value.body_text);
                    protoAdapter3.encodeWithTag(writer, 15, value.body_text_color);
                    protoAdapter5.encodeWithTag(writer, 11, value.descriptor_text);
                    Timeline.Event.State.ADAPTER.encodeWithTag(writer, 12, value.state);
                    protoAdapter2.encodeWithTag(writer, 13, value.id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Timeline.Event value) {
                    value.getClass();
                    int encodedSizeWithTag = Timeline.Event.Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, value.detail_text) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter3 = Color.ADAPTER;
                    int encodedSizeWithTag3 = Timeline.Event.InlineTextFormat.ADAPTER.encodedSizeWithTag(5, value.inline_description_text_format) + protoAdapter2.encodedSizeWithTag(4, value.inline_description_text) + protoAdapter3.encodedSizeWithTag(14, value.detail_text_color) + encodedSizeWithTag2;
                    ProtoAdapter protoAdapter4 = LocalizableString.ADAPTER;
                    int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(9, value.tap_action_url) + protoAdapter4.encodedSizeWithTag(8, value.localizable_inline_description_text) + protoAdapter4.encodedSizeWithTag(7, value.localizable_detail_text) + protoAdapter4.encodedSizeWithTag(6, value.localizable_title) + encodedSizeWithTag3;
                    ProtoAdapter protoAdapter5 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(13, value.id) + Timeline.Event.State.ADAPTER.encodedSizeWithTag(12, value.state) + protoAdapter5.encodedSizeWithTag(11, value.descriptor_text) + protoAdapter3.encodedSizeWithTag(15, value.body_text_color) + protoAdapter5.encodedSizeWithTag(10, value.body_text) + encodedSizeWithTag4;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Timeline.Event redact(Timeline.Event value) {
                    Timeline.Event copy;
                    value.getClass();
                    Color color = value.detail_text_color;
                    Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                    LocalizableString localizableString = value.localizable_title;
                    LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                    LocalizableString localizableString3 = value.localizable_detail_text;
                    LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                    LocalizableString localizableString5 = value.localizable_inline_description_text;
                    LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
                    LocalizedString localizedString = value.body_text;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    Color color3 = value.body_text_color;
                    Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
                    LocalizedString localizedString3 = value.descriptor_text;
                    copy = value.copy((r34 & 1) != 0 ? value.icon : null, (r34 & 2) != 0 ? value.title : null, (r34 & 4) != 0 ? value.detail_text : null, (r34 & 8) != 0 ? value.detail_text_color : color2, (r34 & 16) != 0 ? value.inline_description_text : null, (r34 & 32) != 0 ? value.inline_description_text_format : null, (r34 & 64) != 0 ? value.localizable_title : localizableString2, (r34 & 128) != 0 ? value.localizable_detail_text : localizableString4, (r34 & 256) != 0 ? value.localizable_inline_description_text : localizableString6, (r34 & 512) != 0 ? value.tap_action_url : null, (r34 & 1024) != 0 ? value.body_text : localizedString2, (r34 & 2048) != 0 ? value.body_text_color : color4, (r34 & 4096) != 0 ? value.descriptor_text : localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, (r34 & PKIFailureInfo.certRevoked) != 0 ? value.state : null, (r34 & 16384) != 0 ? value.id : null, (r34 & 32768) != 0 ? value.unknownFields() : ByteString.EMPTY);
                    return copy;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Timeline.Event value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 13, value.id);
                    Timeline.Event.State.ADAPTER.encodeWithTag(writer, 12, value.state);
                    ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 11, value.descriptor_text);
                    ProtoAdapter protoAdapter4 = Color.ADAPTER;
                    protoAdapter4.encodeWithTag(writer, 15, value.body_text_color);
                    protoAdapter3.encodeWithTag(writer, 10, value.body_text);
                    protoAdapter2.encodeWithTag(writer, 9, value.tap_action_url);
                    ProtoAdapter protoAdapter5 = LocalizableString.ADAPTER;
                    protoAdapter5.encodeWithTag(writer, 8, value.localizable_inline_description_text);
                    protoAdapter5.encodeWithTag(writer, 7, value.localizable_detail_text);
                    protoAdapter5.encodeWithTag(writer, 6, value.localizable_title);
                    Timeline.Event.InlineTextFormat.ADAPTER.encodeWithTag(writer, 5, value.inline_description_text_format);
                    protoAdapter2.encodeWithTag(writer, 4, value.inline_description_text);
                    protoAdapter4.encodeWithTag(writer, 14, value.detail_text_color);
                    protoAdapter2.encodeWithTag(writer, 3, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    Timeline.Event.Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Event(Icon icon, String str, String str2, Color color, String str3, InlineTextFormat inlineTextFormat, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, String str4, LocalizedString localizedString, Color color2, LocalizedString localizedString2, State state, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : color, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : inlineTextFormat, (i & 64) != 0 ? null : localizableString, (i & 128) != 0 ? null : localizableString2, (i & 256) != 0 ? null : localizableString3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : localizedString, (i & 2048) != 0 ? null : color2, (i & 4096) != 0 ? null : localizedString2, (i & PKIFailureInfo.certRevoked) != 0 ? null : state, (i & 16384) != 0 ? null : str5, (i & 32768) != 0 ? ByteString.EMPTY : byteString);
        }

        public final Event copy(Icon icon, String title, String detail_text, Color detail_text_color, String inline_description_text, InlineTextFormat inline_description_text_format, LocalizableString localizable_title, LocalizableString localizable_detail_text, LocalizableString localizable_inline_description_text, String tap_action_url, LocalizedString body_text, Color body_text_color, LocalizedString descriptor_text, State state, String id, ByteString unknownFields) {
            unknownFields.getClass();
            return new Event(icon, title, detail_text, detail_text_color, inline_description_text, inline_description_text_format, localizable_title, localizable_detail_text, localizable_inline_description_text, tap_action_url, body_text, body_text_color, descriptor_text, state, id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return Intrinsics.areEqual(unknownFields(), event.unknownFields()) && this.icon == event.icon && Intrinsics.areEqual(this.title, event.title) && Intrinsics.areEqual(this.detail_text, event.detail_text) && Intrinsics.areEqual(this.detail_text_color, event.detail_text_color) && Intrinsics.areEqual(this.inline_description_text, event.inline_description_text) && this.inline_description_text_format == event.inline_description_text_format && Intrinsics.areEqual(this.localizable_title, event.localizable_title) && Intrinsics.areEqual(this.localizable_detail_text, event.localizable_detail_text) && Intrinsics.areEqual(this.localizable_inline_description_text, event.localizable_inline_description_text) && Intrinsics.areEqual(this.tap_action_url, event.tap_action_url) && Intrinsics.areEqual(this.body_text, event.body_text) && Intrinsics.areEqual(this.body_text_color, event.body_text_color) && Intrinsics.areEqual(this.descriptor_text, event.descriptor_text) && this.state == event.state && Intrinsics.areEqual(this.id, event.id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Color color = this.detail_text_color;
            int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
            String str3 = this.inline_description_text;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
            InlineTextFormat inlineTextFormat = this.inline_description_text_format;
            int hashCode7 = (hashCode6 + (inlineTextFormat != null ? inlineTextFormat.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_title;
            int hashCode8 = (hashCode7 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            LocalizableString localizableString2 = this.localizable_detail_text;
            int hashCode9 = (hashCode8 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
            LocalizableString localizableString3 = this.localizable_inline_description_text;
            int hashCode10 = (hashCode9 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
            String str4 = this.tap_action_url;
            int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.body_text;
            int hashCode12 = (hashCode11 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Color color2 = this.body_text_color;
            int hashCode13 = (hashCode12 + (color2 != null ? color2.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.descriptor_text;
            int hashCode14 = (hashCode13 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            State state = this.state;
            int hashCode15 = (hashCode14 + (state != null ? state.hashCode() : 0)) * 37;
            String str5 = this.id;
            int hashCode16 = hashCode15 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode16;
            return hashCode16;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.title = this.title;
            builder.detail_text = this.detail_text;
            builder.detail_text_color = this.detail_text_color;
            builder.inline_description_text = this.inline_description_text;
            builder.inline_description_text_format = this.inline_description_text_format;
            builder.localizable_title = this.localizable_title;
            builder.localizable_detail_text = this.localizable_detail_text;
            builder.localizable_inline_description_text = this.localizable_inline_description_text;
            builder.tap_action_url = this.tap_action_url;
            builder.body_text = this.body_text;
            builder.body_text_color = this.body_text_color;
            builder.descriptor_text = this.descriptor_text;
            builder.state = this.state;
            builder.id = this.id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
            }
            Color color = this.detail_text_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("detail_text_color=", color, arrayList);
            }
            String str3 = this.inline_description_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "inline_description_text=", arrayList);
            }
            InlineTextFormat inlineTextFormat = this.inline_description_text_format;
            if (inlineTextFormat != null) {
                arrayList.add("inline_description_text_format=" + inlineTextFormat);
            }
            LocalizableString localizableString = this.localizable_title;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
            }
            LocalizableString localizableString2 = this.localizable_detail_text;
            if (localizableString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_detail_text=", localizableString2, arrayList);
            }
            LocalizableString localizableString3 = this.localizable_inline_description_text;
            if (localizableString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_inline_description_text=", localizableString3, arrayList);
            }
            String str4 = this.tap_action_url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "tap_action_url=", arrayList);
            }
            LocalizedString localizedString = this.body_text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString, arrayList);
            }
            Color color2 = this.body_text_color;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("body_text_color=", color2, arrayList);
            }
            LocalizedString localizedString2 = this.descriptor_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("descriptor_text=", localizedString2, arrayList);
            }
            State state = this.state;
            if (state != null) {
                arrayList.add("state=" + state);
            }
            String str5 = this.id;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Event{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$Icon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "HIGHLIGHT", "ALERT", "COMPLETED", "SKIPPED", "MISSED", "HIGHLIGHT_COMPLETED", "FAILED", "CANCELED", "REFUNDED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Icon implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Icon[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final Icon ALERT;
            public static final Icon CANCELED;
            public static final Icon COMPLETED;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Icon FAILED;
            public static final Icon HIGHLIGHT;
            public static final Icon HIGHLIGHT_COMPLETED;
            public static final Icon MISSED;
            public static final Icon NORMAL;
            public static final Icon REFUNDED;
            public static final Icon SKIPPED;
            private final int value;

            private static final /* synthetic */ Icon[] $values() {
                return new Icon[]{NORMAL, HIGHLIGHT, ALERT, COMPLETED, SKIPPED, MISSED, HIGHLIGHT_COMPLETED, FAILED, CANCELED, REFUNDED};
            }

            static {
                final Icon icon = new Icon("NORMAL", 0, 0);
                NORMAL = icon;
                HIGHLIGHT = new Icon("HIGHLIGHT", 1, 1);
                ALERT = new Icon("ALERT", 2, 2);
                COMPLETED = new Icon("COMPLETED", 3, 3);
                SKIPPED = new Icon("SKIPPED", 4, 4);
                MISSED = new Icon("MISSED", 5, 5);
                HIGHLIGHT_COMPLETED = new Icon("HIGHLIGHT_COMPLETED", 6, 6);
                FAILED = new Icon("FAILED", 7, 7);
                CANCELED = new Icon("CANCELED", 8, 8);
                REFUNDED = new Icon("REFUNDED", 9, 9);
                Icon[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Icon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, icon) { // from class: com.squareup.protos.franklin.ui.Timeline$Event$Icon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public Timeline.Event.Icon fromValue(int value) {
                        return Timeline.Event.Icon.INSTANCE.fromValue(value);
                    }
                };
            }

            private Icon(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Icon fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$Icon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/Timeline$Event$Icon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Icon fromValue(int value) {
                    switch (value) {
                        case 0:
                            return Icon.NORMAL;
                        case 1:
                            return Icon.HIGHLIGHT;
                        case 2:
                            return Icon.ALERT;
                        case 3:
                            return Icon.COMPLETED;
                        case 4:
                            return Icon.SKIPPED;
                        case 5:
                            return Icon.MISSED;
                        case 6:
                            return Icon.HIGHLIGHT_COMPLETED;
                        case 7:
                            return Icon.FAILED;
                        case 8:
                            return Icon.CANCELED;
                        case 9:
                            return Icon.REFUNDED;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$InlineTextFormat;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRIMARY", "SECONDARY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class InlineTextFormat implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InlineTextFormat[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final InlineTextFormat PRIMARY;
            public static final InlineTextFormat SECONDARY;
            private final int value;

            private static final /* synthetic */ InlineTextFormat[] $values() {
                return new InlineTextFormat[]{PRIMARY, SECONDARY};
            }

            static {
                final InlineTextFormat inlineTextFormat = new InlineTextFormat("PRIMARY", 0, 0);
                PRIMARY = inlineTextFormat;
                SECONDARY = new InlineTextFormat("SECONDARY", 1, 1);
                InlineTextFormat[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InlineTextFormat.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, inlineTextFormat) { // from class: com.squareup.protos.franklin.ui.Timeline$Event$InlineTextFormat$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public Timeline.Event.InlineTextFormat fromValue(int value) {
                        return Timeline.Event.InlineTextFormat.INSTANCE.fromValue(value);
                    }
                };
            }

            private InlineTextFormat(String str, int i, int i2) {
                this.value = i2;
            }

            public static final InlineTextFormat fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static InlineTextFormat valueOf(String str) {
                return (InlineTextFormat) Enum.valueOf(InlineTextFormat.class, str);
            }

            public static InlineTextFormat[] values() {
                return (InlineTextFormat[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$InlineTextFormat$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/Timeline$Event$InlineTextFormat;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final InlineTextFormat fromValue(int value) {
                    if (value == 0) {
                        return InlineTextFormat.PRIMARY;
                    }
                    if (value != 1) {
                        return null;
                    }
                    return InlineTextFormat.SECONDARY;
                }

                private Companion() {
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NOT_STARTED", "INCOMPLETE", "PENDING", "DONE", "BYPASSED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class State implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final State BYPASSED;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final State DONE;
            public static final State INCOMPLETE;
            public static final State NOT_STARTED;
            public static final State PENDING;
            private final int value;

            private static final /* synthetic */ State[] $values() {
                return new State[]{NOT_STARTED, INCOMPLETE, PENDING, DONE, BYPASSED};
            }

            static {
                final State state = new State("NOT_STARTED", 0, 0);
                NOT_STARTED = state;
                INCOMPLETE = new State("INCOMPLETE", 1, 1);
                PENDING = new State("PENDING", 2, 2);
                DONE = new State("DONE", 3, 3);
                BYPASSED = new State("BYPASSED", 4, 4);
                State[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(State.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, state) { // from class: com.squareup.protos.franklin.ui.Timeline$Event$State$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public Timeline.Event.State fromValue(int value) {
                        return Timeline.Event.State.INSTANCE.fromValue(value);
                    }
                };
            }

            private State(String str, int i, int i2) {
                this.value = i2;
            }

            public static final State fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/Timeline$Event$State;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final State fromValue(int value) {
                    if (value == 0) {
                        return State.NOT_STARTED;
                    }
                    if (value == 1) {
                        return State.INCOMPLETE;
                    }
                    if (value == 2) {
                        return State.PENDING;
                    }
                    if (value == 3) {
                        return State.DONE;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return State.BYPASSED;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Event$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/Timeline$Event$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/Timeline$Event;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/Timeline$Event;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Event build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Event() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(Icon icon, String str, String str2, Color color, String str3, InlineTextFormat inlineTextFormat, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, String str4, LocalizedString localizedString, Color color2, LocalizedString localizedString2, State state, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = icon;
            this.title = str;
            this.detail_text = str2;
            this.detail_text_color = color;
            this.inline_description_text = str3;
            this.inline_description_text_format = inlineTextFormat;
            this.localizable_title = localizableString;
            this.localizable_detail_text = localizableString2;
            this.localizable_inline_description_text = localizableString3;
            this.tap_action_url = str4;
            this.body_text = localizedString;
            this.body_text_color = color2;
            this.descriptor_text = localizedString2;
            this.state = state;
            this.id = str5;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Timeline.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.Timeline$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Timeline decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Timeline.CollapseRule collapseRule = null;
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Timeline(m, collapseRule, (String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(Timeline.Event.ADAPTER.decode(reader));
                    } else if (nextTag == 2) {
                        collapseRule = new Timeline.CollapseRule.CollapsedSize(((Number) ProtoAdapter.INT32.decode(reader)).intValue());
                    } else if (nextTag == 3) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        collapseRule = new Timeline.CollapseRule.CollapseRanges((Timeline.CollapseRanges) Timeline.CollapseRanges.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Timeline value) {
                writer.getClass();
                value.getClass();
                Timeline.Event.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.events);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.id);
                Timeline.CollapseRule collapseRule = value.collapse_rule;
                if (collapseRule instanceof Timeline.CollapseRule.CollapsedSize) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(((Timeline.CollapseRule.CollapsedSize) collapseRule).getValue()));
                } else if (collapseRule instanceof Timeline.CollapseRule.CollapseRanges) {
                    Timeline.CollapseRanges.ADAPTER.encodeWithTag(writer, 4, ((Timeline.CollapseRule.CollapseRanges) collapseRule).getValue());
                } else if (collapseRule != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Timeline value) {
                int encodedSizeWithTag;
                value.getClass();
                int encodedSizeWithTag2 = Timeline.Event.ADAPTER.asRepeated().encodedSizeWithTag(1, value.events) + value.unknownFields().getSize$okio();
                Timeline.CollapseRule collapseRule = value.collapse_rule;
                if (collapseRule instanceof Timeline.CollapseRule.CollapsedSize) {
                    encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(((Timeline.CollapseRule.CollapsedSize) collapseRule).getValue()));
                } else {
                    if (!(collapseRule instanceof Timeline.CollapseRule.CollapseRanges)) {
                        if (collapseRule != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return ProtoAdapter.STRING.encodedSizeWithTag(3, value.id) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = Timeline.CollapseRanges.ADAPTER.encodedSizeWithTag(4, ((Timeline.CollapseRule.CollapseRanges) collapseRule).getValue());
                }
                encodedSizeWithTag2 += encodedSizeWithTag;
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.id) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Timeline redact(Timeline value) {
                value.getClass();
                return Timeline.copy$default(value, TransactorKt.m1169redactElements(value.events, Timeline.Event.ADAPTER), ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Timeline value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Timeline.CollapseRule collapseRule = value.collapse_rule;
                if (collapseRule instanceof Timeline.CollapseRule.CollapsedSize) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(((Timeline.CollapseRule.CollapsedSize) collapseRule).getValue()));
                } else if (collapseRule instanceof Timeline.CollapseRule.CollapseRanges) {
                    Timeline.CollapseRanges.ADAPTER.encodeWithTag(writer, 4, ((Timeline.CollapseRule.CollapseRanges) collapseRule).getValue());
                } else if (collapseRule != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.id);
                Timeline.Event.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.events);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline(List list, CollapseRule collapseRule, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.collapse_rule = collapseRule;
        this.id = str;
        this.events = TransactorKt.immutableCopyOf("events", list);
    }

    public static Timeline copy$default(Timeline timeline, ArrayList arrayList, ByteString byteString, int i) {
        CollapseRule collapseRule = timeline.collapse_rule;
        String str = timeline.id;
        if ((i & 8) != 0) {
            byteString = timeline.unknownFields();
        }
        timeline.getClass();
        byteString.getClass();
        return new Timeline(arrayList, collapseRule, str, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        return Intrinsics.areEqual(unknownFields(), timeline.unknownFields()) && Intrinsics.areEqual(this.events, timeline.events) && Intrinsics.areEqual(this.collapse_rule, timeline.collapse_rule) && Intrinsics.areEqual(this.id, timeline.id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.events);
        CollapseRule collapseRule = this.collapse_rule;
        int hashCode = (m + (collapseRule != null ? collapseRule.hashCode() : 0)) * 37;
        String str = this.id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.events = this.events;
        builder.collapse_rule = this.collapse_rule;
        builder.id = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.events.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("events=", arrayList, this.events);
        }
        CollapseRule collapseRule = this.collapse_rule;
        if (collapseRule != null) {
            arrayList.add("collapse_rule=" + collapseRule);
        }
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Timeline{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule;", "", "<init>", "()V", "CollapsedSize", "CollapseRanges", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule$CollapseRanges;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule$CollapsedSize;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class CollapseRule {

        @WireOneofField(adapter = "com.squareup.protos.franklin.ui.Timeline$CollapseRanges#ADAPTER", declaredName = "collapse_ranges", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule$CollapseRanges;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule;", "value", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;", "<init>", "(Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/Timeline$CollapseRanges;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CollapseRanges extends CollapseRule {
            private final CollapseRanges value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CollapseRanges(CollapseRanges collapseRanges) {
                super(null);
                collapseRanges.getClass();
                this.value = collapseRanges;
            }

            public static /* synthetic */ CollapseRanges copy$default(CollapseRanges collapseRanges, CollapseRanges collapseRanges2, int i, Object obj) {
                if ((i & 1) != 0) {
                    collapseRanges2 = collapseRanges.value;
                }
                return collapseRanges.copy(collapseRanges2);
            }

            /* renamed from: component1, reason: from getter */
            public final CollapseRanges getValue() {
                return this.value;
            }

            public final CollapseRanges copy(CollapseRanges value) {
                value.getClass();
                return new CollapseRanges(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CollapseRanges) && Intrinsics.areEqual(this.value, ((CollapseRanges) other).value);
            }

            public final CollapseRanges getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CollapseRanges(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#INT32", declaredName = "collapsed_size", tag = 2)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule$CollapsedSize;", "Lcom/squareup/protos/franklin/ui/Timeline$CollapseRule;", "value", "", "<init>", "(I)V", "getValue", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CollapsedSize extends CollapseRule {
            private final int value;

            public CollapsedSize(int i) {
                super(null);
                this.value = i;
            }

            public static /* synthetic */ CollapsedSize copy$default(CollapsedSize collapsedSize, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = collapsedSize.value;
                }
                return collapsedSize.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            public final CollapsedSize copy(int value) {
                return new CollapsedSize(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CollapsedSize) && this.value == ((CollapsedSize) other).value;
            }

            public final int getValue() {
                return this.value;
            }

            public int hashCode() {
                return Integer.hashCode(this.value);
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.value, "CollapsedSize(value=", ")");
            }
        }

        public /* synthetic */ CollapseRule(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CollapseRule() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/Timeline$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/Timeline$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/Timeline;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/Timeline;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Timeline build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public Timeline(List list) {
        this(list, null, null, ByteString.EMPTY);
    }
}
