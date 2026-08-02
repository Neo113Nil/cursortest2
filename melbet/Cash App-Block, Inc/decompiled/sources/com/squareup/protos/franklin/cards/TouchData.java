package com.squareup.protos.franklin.cards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.cards.TouchData;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000e\r\u000f\u0010\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/TouchData$Builder;", "", "width", "Ljava/lang/Float;", "height", "", "Lcom/squareup/protos/franklin/cards/TouchData$Stroke;", "strokes", "Ljava/util/List;", "Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "stamps", "Companion", "Builder", "Point", "Stroke", "StampCustomization", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TouchData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TouchData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
    public final Float height;

    @WireField(adapter = "com.squareup.protos.franklin.cards.TouchData$StampCustomization#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<StampCustomization> stamps;

    @WireField(adapter = "com.squareup.protos.franklin.cards.TouchData$Stroke#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Stroke> strokes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 0, tag = 1)
    public final Float width;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/TouchData;", "<init>", "()V", "width", "", "Ljava/lang/Float;", "height", "strokes", "", "Lcom/squareup/protos/franklin/cards/TouchData$Stroke;", "stamps", "Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/cards/TouchData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public Float height;
        public List<StampCustomization> stamps;
        public List<Stroke> strokes;
        public Float width;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.strokes = emptyList;
            this.stamps = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public TouchData build() {
            return new TouchData(this.width, this.height, this.strokes, this.stamps, buildUnknownFields());
        }

        public final Builder height(Float height) {
            this.height = height;
            return this;
        }

        public final Builder stamps(List<StampCustomization> stamps) {
            stamps.getClass();
            TransactorKt.checkElementsNotNull(stamps);
            this.stamps = stamps;
            return this;
        }

        public final Builder strokes(List<Stroke> strokes) {
            strokes.getClass();
            TransactorKt.checkElementsNotNull(strokes);
            this.strokes = strokes;
            return this;
        }

        public final Builder width(Float width) {
            this.width = width;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TouchData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.TouchData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TouchData decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TouchData((Float) obj, (Float) obj2, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.FLOAT.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.FLOAT.decode(reader);
                    } else if (nextTag == 3) {
                        m.add(TouchData.Stroke.ADAPTER.decode(reader));
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(TouchData.StampCustomization.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TouchData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                protoAdapter2.encodeWithTag(writer, 1, value.width);
                protoAdapter2.encodeWithTag(writer, 2, value.height);
                TouchData.Stroke.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.strokes);
                TouchData.StampCustomization.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.stamps);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TouchData value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                return TouchData.StampCustomization.ADAPTER.asRepeated().encodedSizeWithTag(4, value.stamps) + TouchData.Stroke.ADAPTER.asRepeated().encodedSizeWithTag(3, value.strokes) + protoAdapter2.encodedSizeWithTag(2, value.height) + protoAdapter2.encodedSizeWithTag(1, value.width) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TouchData redact(TouchData value) {
                value.getClass();
                return TouchData.copy$default(value, null, null, TransactorKt.m1169redactElements(value.strokes, TouchData.Stroke.ADAPTER), TransactorKt.m1169redactElements(value.stamps, TouchData.StampCustomization.ADAPTER), ByteString.EMPTY, 3);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TouchData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TouchData.StampCustomization.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.stamps);
                TouchData.Stroke.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.strokes);
                ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                protoAdapter2.encodeWithTag(writer, 2, value.height);
                protoAdapter2.encodeWithTag(writer, 1, value.width);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchData(Float f, Float f2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.width = f;
        this.height = f2;
        this.strokes = TransactorKt.immutableCopyOf("strokes", list);
        this.stamps = TransactorKt.immutableCopyOf("stamps", list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TouchData copy$default(TouchData touchData, Float f, Float f2, ArrayList arrayList, ArrayList arrayList2, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            f = touchData.width;
        }
        Float f3 = f;
        if ((i & 2) != 0) {
            f2 = touchData.height;
        }
        Float f4 = f2;
        List list = arrayList2;
        if ((i & 8) != 0) {
            list = touchData.stamps;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            byteString = touchData.unknownFields();
        }
        ByteString byteString2 = byteString;
        touchData.getClass();
        list2.getClass();
        byteString2.getClass();
        return new TouchData(f3, f4, arrayList, list2, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TouchData)) {
            return false;
        }
        TouchData touchData = (TouchData) obj;
        return Intrinsics.areEqual(unknownFields(), touchData.unknownFields()) && Intrinsics.areEqual(this.width, touchData.width) && Intrinsics.areEqual(this.height, touchData.height) && Intrinsics.areEqual(this.strokes, touchData.strokes) && Intrinsics.areEqual(this.stamps, touchData.stamps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Float f = this.width;
        int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
        Float f2 = this.height;
        int hashCode3 = this.stamps.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37, 37, this.strokes);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.width = this.width;
        builder.height = this.height;
        builder.strokes = this.strokes;
        builder.stamps = this.stamps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Float f = this.width;
        if (f != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("width=", f, arrayList);
        }
        Float f2 = this.height;
        if (f2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("height=", f2, arrayList);
        }
        if (!this.strokes.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("strokes=", arrayList, this.strokes);
        }
        if (!this.stamps.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("stamps=", arrayList, this.stamps);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TouchData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Point;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/TouchData$Point$Builder;", "x_coordinate", "", "y_coordinate", "created_at", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Long;Lokio/ByteString;)V", "Ljava/lang/Float;", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Long;Lokio/ByteString;)Lcom/squareup/protos/franklin/cards/TouchData$Point;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Point extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Point> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
        public final Long created_at;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 0, tag = 1)
        public final Float x_coordinate;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float y_coordinate;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Point$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/TouchData$Point;", "<init>", "()V", "x_coordinate", "", "Ljava/lang/Float;", "y_coordinate", "created_at", "", "Ljava/lang/Long;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/cards/TouchData$Point$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/cards/TouchData$Point$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Long created_at;
            public Float x_coordinate;
            public Float y_coordinate;

            @Override // com.squareup.wire.Message.Builder
            public Point build() {
                return new Point(this.x_coordinate, this.y_coordinate, this.created_at, buildUnknownFields());
            }

            public final Builder created_at(Long created_at) {
                this.created_at = created_at;
                return this;
            }

            public final Builder x_coordinate(Float x_coordinate) {
                this.x_coordinate = x_coordinate;
                return this;
            }

            public final Builder y_coordinate(Float y_coordinate) {
                this.y_coordinate = y_coordinate;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Point.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.TouchData$Point$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TouchData.Point decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TouchData.Point((Float) obj, (Float) obj2, (Long) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.INT64.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TouchData.Point value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 1, value.x_coordinate);
                    protoAdapter2.encodeWithTag(writer, 2, value.y_coordinate);
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, value.created_at);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TouchData.Point value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    return ProtoAdapter.INT64.encodedSizeWithTag(3, value.created_at) + protoAdapter2.encodedSizeWithTag(2, value.y_coordinate) + protoAdapter2.encodedSizeWithTag(1, value.x_coordinate) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TouchData.Point redact(TouchData.Point value) {
                    value.getClass();
                    return TouchData.Point.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TouchData.Point value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT64.encodeWithTag(writer, 3, value.created_at);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 2, value.y_coordinate);
                    protoAdapter2.encodeWithTag(writer, 1, value.x_coordinate);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Point(Float f, Float f2, Long l, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Point copy$default(Point point, Float f, Float f2, Long l, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                f = point.x_coordinate;
            }
            if ((i & 2) != 0) {
                f2 = point.y_coordinate;
            }
            if ((i & 4) != 0) {
                l = point.created_at;
            }
            if ((i & 8) != 0) {
                byteString = point.unknownFields();
            }
            return point.copy(f, f2, l, byteString);
        }

        public final Point copy(Float x_coordinate, Float y_coordinate, Long created_at, ByteString unknownFields) {
            unknownFields.getClass();
            return new Point(x_coordinate, y_coordinate, created_at, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Point)) {
                return false;
            }
            Point point = (Point) other;
            return Intrinsics.areEqual(unknownFields(), point.unknownFields()) && Intrinsics.areEqual(this.x_coordinate, point.x_coordinate) && Intrinsics.areEqual(this.y_coordinate, point.y_coordinate) && Intrinsics.areEqual(this.created_at, point.created_at);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Float f = this.x_coordinate;
            int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.y_coordinate;
            int hashCode3 = (hashCode2 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
            Long l = this.created_at;
            int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.x_coordinate = this.x_coordinate;
            builder.y_coordinate = this.y_coordinate;
            builder.created_at = this.created_at;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Float f = this.x_coordinate;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("x_coordinate=", f, arrayList);
            }
            Float f2 = this.y_coordinate;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("y_coordinate=", f2, arrayList);
            }
            Long l = this.created_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Point{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Point$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/TouchData$Point$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/TouchData$Point;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/TouchData$Point;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Point build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Point() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Point(Float f, Float f2, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.x_coordinate = f;
            this.y_coordinate = f2;
            this.created_at = l;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization$Builder;", "identifier", "", "center", "Lcom/squareup/protos/franklin/cards/TouchData$Point;", "width", "", "height", "rotation", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/cards/TouchData$Point;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lcom/squareup/protos/franklin/cards/TouchData$Point;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class StampCustomization extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<StampCustomization> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.cards.TouchData$Point#ADAPTER", schemaIndex = 1, tag = 2)
        public final Point center;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 3, tag = 4)
        public final Float height;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 4, tag = 5)
        public final Float rotation;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
        public final Float width;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "<init>", "()V", "identifier", "", "center", "Lcom/squareup/protos/franklin/cards/TouchData$Point;", "width", "", "Ljava/lang/Float;", "height", "rotation", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Point center;
            public Float height;
            public String identifier;
            public Float rotation;
            public Float width;

            @Override // com.squareup.wire.Message.Builder
            public StampCustomization build() {
                return new StampCustomization(this.identifier, this.center, this.width, this.height, this.rotation, buildUnknownFields());
            }

            public final Builder center(Point center) {
                this.center = center;
                return this;
            }

            public final Builder height(Float height) {
                this.height = height;
                return this;
            }

            public final Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            public final Builder rotation(Float rotation) {
                this.rotation = rotation;
                return this;
            }

            public final Builder width(Float width) {
                this.width = width;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StampCustomization.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.TouchData$StampCustomization$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TouchData.StampCustomization decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TouchData.StampCustomization((String) obj, (TouchData.Point) obj2, (Float) obj3, (Float) obj4, (Float) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(TouchData.Point.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TouchData.StampCustomization value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identifier);
                    TouchData.Point.ADAPTER.encodeWithTag(writer, 2, value.center);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 3, value.width);
                    protoAdapter2.encodeWithTag(writer, 4, value.height);
                    protoAdapter2.encodeWithTag(writer, 5, value.rotation);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TouchData.StampCustomization value) {
                    value.getClass();
                    int encodedSizeWithTag = TouchData.Point.ADAPTER.encodedSizeWithTag(2, value.center) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.identifier) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    return protoAdapter2.encodedSizeWithTag(5, value.rotation) + protoAdapter2.encodedSizeWithTag(4, value.height) + protoAdapter2.encodedSizeWithTag(3, value.width) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TouchData.StampCustomization redact(TouchData.StampCustomization value) {
                    value.getClass();
                    TouchData.Point point = value.center;
                    return TouchData.StampCustomization.copy$default(value, null, point != null ? (TouchData.Point) TouchData.Point.ADAPTER.redact(point) : null, null, null, null, ByteString.EMPTY, 29, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TouchData.StampCustomization value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 5, value.rotation);
                    protoAdapter2.encodeWithTag(writer, 4, value.height);
                    protoAdapter2.encodeWithTag(writer, 3, value.width);
                    TouchData.Point.ADAPTER.encodeWithTag(writer, 2, value.center);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identifier);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ StampCustomization(String str, Point point, Float f, Float f2, Float f3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : point, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : f3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ StampCustomization copy$default(StampCustomization stampCustomization, String str, Point point, Float f, Float f2, Float f3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stampCustomization.identifier;
            }
            if ((i & 2) != 0) {
                point = stampCustomization.center;
            }
            if ((i & 4) != 0) {
                f = stampCustomization.width;
            }
            if ((i & 8) != 0) {
                f2 = stampCustomization.height;
            }
            if ((i & 16) != 0) {
                f3 = stampCustomization.rotation;
            }
            if ((i & 32) != 0) {
                byteString = stampCustomization.unknownFields();
            }
            Float f4 = f3;
            ByteString byteString2 = byteString;
            return stampCustomization.copy(str, point, f, f2, f4, byteString2);
        }

        public final StampCustomization copy(String identifier, Point center, Float width, Float height, Float rotation, ByteString unknownFields) {
            unknownFields.getClass();
            return new StampCustomization(identifier, center, width, height, rotation, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof StampCustomization)) {
                return false;
            }
            StampCustomization stampCustomization = (StampCustomization) other;
            return Intrinsics.areEqual(unknownFields(), stampCustomization.unknownFields()) && Intrinsics.areEqual(this.identifier, stampCustomization.identifier) && Intrinsics.areEqual(this.center, stampCustomization.center) && Intrinsics.areEqual(this.width, stampCustomization.width) && Intrinsics.areEqual(this.height, stampCustomization.height) && Intrinsics.areEqual(this.rotation, stampCustomization.rotation);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.identifier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Point point = this.center;
            int hashCode3 = (hashCode2 + (point != null ? point.hashCode() : 0)) * 37;
            Float f = this.width;
            int hashCode4 = (hashCode3 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.height;
            int hashCode5 = (hashCode4 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
            Float f3 = this.rotation;
            int hashCode6 = hashCode5 + (f3 != null ? Float.hashCode(f3.floatValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.identifier = this.identifier;
            builder.center = this.center;
            builder.width = this.width;
            builder.height = this.height;
            builder.rotation = this.rotation;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
            }
            Point point = this.center;
            if (point != null) {
                arrayList.add("center=" + point);
            }
            Float f = this.width;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("width=", f, arrayList);
            }
            Float f2 = this.height;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("height=", f2, arrayList);
            }
            Float f3 = this.rotation;
            if (f3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("rotation=", f3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StampCustomization{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/TouchData$StampCustomization;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ StampCustomization build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public StampCustomization() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StampCustomization(String str, Point point, Float f, Float f2, Float f3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.identifier = str;
            this.center = point;
            this.width = f;
            this.height = f2;
            this.rotation = f3;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Stroke;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/cards/TouchData$Stroke$Builder;", "points", "", "Lcom/squareup/protos/franklin/cards/TouchData$Point;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Stroke extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Stroke> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.cards.TouchData$Point#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Point> points;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Stroke$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/cards/TouchData$Stroke;", "<init>", "()V", "points", "", "Lcom/squareup/protos/franklin/cards/TouchData$Point;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Point> points = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public Stroke build() {
                return new Stroke(this.points, buildUnknownFields());
            }

            public final Builder points(List<Point> points) {
                points.getClass();
                TransactorKt.checkElementsNotNull(points);
                this.points = points;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Stroke.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.cards.TouchData$Stroke$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TouchData.Stroke decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TouchData.Stroke(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(TouchData.Point.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TouchData.Stroke value) {
                    writer.getClass();
                    value.getClass();
                    TouchData.Point.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.points);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TouchData.Stroke value) {
                    value.getClass();
                    return TouchData.Point.ADAPTER.asRepeated().encodedSizeWithTag(1, value.points) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TouchData.Stroke redact(TouchData.Stroke value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.points, TouchData.Point.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TouchData.Stroke value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    TouchData.Point.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.points);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Stroke(List<Point> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.points = TransactorKt.immutableCopyOf("points", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stroke copy$default(Stroke stroke, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stroke.points;
            }
            if ((i & 2) != 0) {
                byteString = stroke.unknownFields();
            }
            return stroke.copy(list, byteString);
        }

        public final Stroke copy(List<Point> points, ByteString unknownFields) {
            points.getClass();
            unknownFields.getClass();
            return new Stroke(points, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Stroke)) {
                return false;
            }
            Stroke stroke = (Stroke) other;
            return Intrinsics.areEqual(unknownFields(), stroke.unknownFields()) && Intrinsics.areEqual(this.points, stroke.points);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.points.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.points = this.points;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.points.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("points=", arrayList, this.points);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Stroke{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Stroke$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/TouchData$Stroke$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/TouchData$Stroke;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/TouchData$Stroke;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Stroke build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Stroke(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public Stroke() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/cards/TouchData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/cards/TouchData$Builder;", "", "body", "Lcom/squareup/protos/franklin/cards/TouchData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/cards/TouchData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TouchData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public TouchData(Float f, Float f2, List list, List list2, int i) {
        this(f, f2, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? EmptyList.INSTANCE : list2, ByteString.EMPTY);
    }
}
