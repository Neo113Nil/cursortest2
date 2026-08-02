package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0007\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Builder;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment;", "segments", "Ljava/util/List;", "Companion", "Builder", "Segment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositionChart extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompositionChart> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CompositionChart$Segment#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<Segment> segments;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart;", "<init>", "()V", "segments", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Segment> segments = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public CompositionChart build() {
            return new CompositionChart(this.segments, buildUnknownFields());
        }

        public final Builder segments(List<Segment> segments) {
            segments.getClass();
            TransactorKt.checkElementsNotNull(segments);
            this.segments = segments;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment$Builder;", "", "fraction", "Ljava/lang/Float;", "Lcom/squareup/protos/cash/ui/Color;", "color", "Lcom/squareup/protos/cash/ui/Color;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Segment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Segment> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
        public final Color color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 0, tag = 1)
        public final Float fraction;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment;", "<init>", "()V", "fraction", "", "Ljava/lang/Float;", "color", "Lcom/squareup/protos/cash/ui/Color;", "(Ljava/lang/Float;)Lcom/squareup/protos/cash/kgoose/api/v3/CompositionChart$Segment$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Color color;
            public Float fraction;

            @Override // com.squareup.wire.Message.Builder
            public Segment build() {
                return new Segment(this.color, this.fraction, buildUnknownFields());
            }

            public final Builder color(Color color) {
                this.color = color;
                return this;
            }

            public final Builder fraction(Float fraction) {
                this.fraction = fraction;
                return this;
            }
        }

        static {
            CompositionChart$Segment$Companion$ADAPTER$1 compositionChart$Segment$Companion$ADAPTER$1 = new CompositionChart$Segment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Segment.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CompositionChart.Segment", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
            ADAPTER = compositionChart$Segment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(compositionChart$Segment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Segment(Color color, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.fraction = f;
            this.color = color;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return Intrinsics.areEqual(unknownFields(), segment.unknownFields()) && Intrinsics.areEqual(this.fraction, segment.fraction) && Intrinsics.areEqual(this.color, segment.color);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Float f = this.fraction;
            int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Color color = this.color;
            int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.fraction = this.fraction;
            builder.color = this.color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Float f = this.fraction;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("fraction=", f, arrayList);
            }
            Color color = this.color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Segment{", "}", 0, null, null, 56);
        }
    }

    static {
        CompositionChart$Companion$ADAPTER$1 compositionChart$Companion$ADAPTER$1 = new CompositionChart$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompositionChart.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CompositionChart", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
        ADAPTER = compositionChart$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(compositionChart$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositionChart(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.segments = TransactorKt.immutableCopyOf("segments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompositionChart)) {
            return false;
        }
        CompositionChart compositionChart = (CompositionChart) obj;
        return Intrinsics.areEqual(unknownFields(), compositionChart.unknownFields()) && Intrinsics.areEqual(this.segments, compositionChart.segments);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.segments.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.segments = this.segments;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.segments.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("segments=", arrayList, this.segments);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompositionChart{", "}", 0, null, null, 56);
    }
}
