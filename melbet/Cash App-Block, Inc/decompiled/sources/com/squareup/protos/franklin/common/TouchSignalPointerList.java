package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.TouchSignalPointerList;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0007\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalPointerList;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$Builder;", "", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "pointers", "Ljava/util/List;", "Companion", "Builder", "TouchSignalPointer", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TouchSignalPointerList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TouchSignalPointerList> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.TouchSignalPointerList$TouchSignalPointer#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<TouchSignalPointer> pointers;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalPointerList$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList;", "<init>", "()V", "pointers", "", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<TouchSignalPointer> pointers = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public TouchSignalPointerList build() {
            return new TouchSignalPointerList(this.pointers, buildUnknownFields());
        }

        public final Builder pointers(List<TouchSignalPointer> pointers) {
            pointers.getClass();
            TransactorKt.checkElementsNotNull(pointers);
            this.pointers = pointers;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TouchSignalPointerList.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.TouchSignalPointerList$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TouchSignalPointerList decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TouchSignalPointerList(m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(TouchSignalPointerList.TouchSignalPointer.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TouchSignalPointerList value) {
                writer.getClass();
                value.getClass();
                TouchSignalPointerList.TouchSignalPointer.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.pointers);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TouchSignalPointerList value) {
                value.getClass();
                return TouchSignalPointerList.TouchSignalPointer.ADAPTER.asRepeated().encodedSizeWithTag(1, value.pointers) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TouchSignalPointerList redact(TouchSignalPointerList value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.pointers, TouchSignalPointerList.TouchSignalPointer.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new TouchSignalPointerList(m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TouchSignalPointerList value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TouchSignalPointerList.TouchSignalPointer.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.pointers);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchSignalPointerList(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pointers = TransactorKt.immutableCopyOf("pointers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TouchSignalPointerList)) {
            return false;
        }
        TouchSignalPointerList touchSignalPointerList = (TouchSignalPointerList) obj;
        return Intrinsics.areEqual(unknownFields(), touchSignalPointerList.unknownFields()) && Intrinsics.areEqual(this.pointers, touchSignalPointerList.pointers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.pointers.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.pointers = this.pointers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.pointers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pointers=", arrayList, this.pointers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TouchSignalPointerList{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0082\u0004J\n\u0010\u001a\u001a\u00020\tH\u0096\u0080\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u008d\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001eR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006!"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer$Builder;", "x", "", "y", "pressure", "size", "tool_type", "", "touch_major", "touch_minor", "tool_major", "tool_minor", "orientation", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TouchSignalPointer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TouchSignalPointer> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 9, tag = 10)
        public final Float orientation;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
        public final Float pressure;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 3, tag = 4)
        public final Float size;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 7, tag = 8)
        public final Float tool_major;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 8, tag = 9)
        public final Float tool_minor;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
        public final Integer tool_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 5, tag = 6)
        public final Float touch_major;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 6, tag = 7)
        public final Float touch_minor;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 0, tag = 1)
        public final Float x;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float y;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0014J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "<init>", "()V", "x", "", "Ljava/lang/Float;", "y", "pressure", "size", "tool_type", "", "Ljava/lang/Integer;", "touch_major", "touch_minor", "tool_major", "tool_minor", "orientation", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer$Builder;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Float orientation;
            public Float pressure;
            public Float size;
            public Float tool_major;
            public Float tool_minor;
            public Integer tool_type;
            public Float touch_major;
            public Float touch_minor;
            public Float x;
            public Float y;

            @Override // com.squareup.wire.Message.Builder
            public TouchSignalPointer build() {
                return new TouchSignalPointer(this.x, this.y, this.pressure, this.size, this.tool_type, this.touch_major, this.touch_minor, this.tool_major, this.tool_minor, this.orientation, buildUnknownFields());
            }

            public final Builder orientation(Float orientation) {
                this.orientation = orientation;
                return this;
            }

            public final Builder pressure(Float pressure) {
                this.pressure = pressure;
                return this;
            }

            public final Builder size(Float size) {
                this.size = size;
                return this;
            }

            public final Builder tool_major(Float tool_major) {
                this.tool_major = tool_major;
                return this;
            }

            public final Builder tool_minor(Float tool_minor) {
                this.tool_minor = tool_minor;
                return this;
            }

            public final Builder tool_type(Integer tool_type) {
                this.tool_type = tool_type;
                return this;
            }

            public final Builder touch_major(Float touch_major) {
                this.touch_major = touch_major;
                return this;
            }

            public final Builder touch_minor(Float touch_minor) {
                this.touch_minor = touch_minor;
                return this;
            }

            public final Builder x(Float x) {
                this.x = x;
                return this;
            }

            public final Builder y(Float y) {
                this.y = y;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TouchSignalPointer.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.TouchSignalPointerList$TouchSignalPointer$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TouchSignalPointerList.TouchSignalPointer decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TouchSignalPointerList.TouchSignalPointer((Float) obj, (Float) obj2, (Float) obj3, (Float) obj4, (Integer) obj5, (Float) obj6, (Float) obj7, (Float) obj8, (Float) obj9, (Float) obj10, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.INT32.decode(reader);
                                break;
                            case 6:
                                obj6 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 7:
                                obj7 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 8:
                                obj8 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 9:
                                obj9 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            case 10:
                                obj10 = ProtoAdapter.FLOAT.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TouchSignalPointerList.TouchSignalPointer value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 1, value.x);
                    protoAdapter2.encodeWithTag(writer, 2, value.y);
                    protoAdapter2.encodeWithTag(writer, 3, value.pressure);
                    protoAdapter2.encodeWithTag(writer, 4, value.size);
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, value.tool_type);
                    protoAdapter2.encodeWithTag(writer, 6, value.touch_major);
                    protoAdapter2.encodeWithTag(writer, 7, value.touch_minor);
                    protoAdapter2.encodeWithTag(writer, 8, value.tool_major);
                    protoAdapter2.encodeWithTag(writer, 9, value.tool_minor);
                    protoAdapter2.encodeWithTag(writer, 10, value.orientation);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TouchSignalPointerList.TouchSignalPointer value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    return protoAdapter2.encodedSizeWithTag(10, value.orientation) + protoAdapter2.encodedSizeWithTag(9, value.tool_minor) + protoAdapter2.encodedSizeWithTag(8, value.tool_major) + protoAdapter2.encodedSizeWithTag(7, value.touch_minor) + protoAdapter2.encodedSizeWithTag(6, value.touch_major) + ProtoAdapter.INT32.encodedSizeWithTag(5, value.tool_type) + protoAdapter2.encodedSizeWithTag(4, value.size) + protoAdapter2.encodedSizeWithTag(3, value.pressure) + protoAdapter2.encodedSizeWithTag(2, value.y) + protoAdapter2.encodedSizeWithTag(1, value.x) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TouchSignalPointerList.TouchSignalPointer redact(TouchSignalPointerList.TouchSignalPointer value) {
                    value.getClass();
                    return TouchSignalPointerList.TouchSignalPointer.copy$default(value, null, null, null, null, null, null, null, null, null, null, ByteString.EMPTY, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TouchSignalPointerList.TouchSignalPointer value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 10, value.orientation);
                    protoAdapter2.encodeWithTag(writer, 9, value.tool_minor);
                    protoAdapter2.encodeWithTag(writer, 8, value.tool_major);
                    protoAdapter2.encodeWithTag(writer, 7, value.touch_minor);
                    protoAdapter2.encodeWithTag(writer, 6, value.touch_major);
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, value.tool_type);
                    protoAdapter2.encodeWithTag(writer, 4, value.size);
                    protoAdapter2.encodeWithTag(writer, 3, value.pressure);
                    protoAdapter2.encodeWithTag(writer, 2, value.y);
                    protoAdapter2.encodeWithTag(writer, 1, value.x);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TouchSignalPointer(Float f, Float f2, Float f3, Float f4, Integer num, Float f5, Float f6, Float f7, Float f8, Float f9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : f5, (i & 64) != 0 ? null : f6, (i & 128) != 0 ? null : f7, (i & 256) != 0 ? null : f8, (i & 512) != 0 ? null : f9, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TouchSignalPointer copy$default(TouchSignalPointer touchSignalPointer, Float f, Float f2, Float f3, Float f4, Integer num, Float f5, Float f6, Float f7, Float f8, Float f9, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                f = touchSignalPointer.x;
            }
            if ((i & 2) != 0) {
                f2 = touchSignalPointer.y;
            }
            if ((i & 4) != 0) {
                f3 = touchSignalPointer.pressure;
            }
            if ((i & 8) != 0) {
                f4 = touchSignalPointer.size;
            }
            if ((i & 16) != 0) {
                num = touchSignalPointer.tool_type;
            }
            if ((i & 32) != 0) {
                f5 = touchSignalPointer.touch_major;
            }
            if ((i & 64) != 0) {
                f6 = touchSignalPointer.touch_minor;
            }
            if ((i & 128) != 0) {
                f7 = touchSignalPointer.tool_major;
            }
            if ((i & 256) != 0) {
                f8 = touchSignalPointer.tool_minor;
            }
            if ((i & 512) != 0) {
                f9 = touchSignalPointer.orientation;
            }
            if ((i & 1024) != 0) {
                byteString = touchSignalPointer.unknownFields();
            }
            Float f10 = f9;
            ByteString byteString2 = byteString;
            Float f11 = f7;
            Float f12 = f8;
            Float f13 = f5;
            Float f14 = f6;
            Integer num2 = num;
            Float f15 = f3;
            return touchSignalPointer.copy(f, f2, f15, f4, num2, f13, f14, f11, f12, f10, byteString2);
        }

        public final TouchSignalPointer copy(Float x, Float y, Float pressure, Float size, Integer tool_type, Float touch_major, Float touch_minor, Float tool_major, Float tool_minor, Float orientation, ByteString unknownFields) {
            unknownFields.getClass();
            return new TouchSignalPointer(x, y, pressure, size, tool_type, touch_major, touch_minor, tool_major, tool_minor, orientation, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TouchSignalPointer)) {
                return false;
            }
            TouchSignalPointer touchSignalPointer = (TouchSignalPointer) other;
            return Intrinsics.areEqual(unknownFields(), touchSignalPointer.unknownFields()) && Intrinsics.areEqual(this.x, touchSignalPointer.x) && Intrinsics.areEqual(this.y, touchSignalPointer.y) && Intrinsics.areEqual(this.pressure, touchSignalPointer.pressure) && Intrinsics.areEqual(this.size, touchSignalPointer.size) && Intrinsics.areEqual(this.tool_type, touchSignalPointer.tool_type) && Intrinsics.areEqual(this.touch_major, touchSignalPointer.touch_major) && Intrinsics.areEqual(this.touch_minor, touchSignalPointer.touch_minor) && Intrinsics.areEqual(this.tool_major, touchSignalPointer.tool_major) && Intrinsics.areEqual(this.tool_minor, touchSignalPointer.tool_minor) && Intrinsics.areEqual(this.orientation, touchSignalPointer.orientation);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Float f = this.x;
            int hashCode2 = (hashCode + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.y;
            int hashCode3 = (hashCode2 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
            Float f3 = this.pressure;
            int hashCode4 = (hashCode3 + (f3 != null ? Float.hashCode(f3.floatValue()) : 0)) * 37;
            Float f4 = this.size;
            int hashCode5 = (hashCode4 + (f4 != null ? Float.hashCode(f4.floatValue()) : 0)) * 37;
            Integer num = this.tool_type;
            int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Float f5 = this.touch_major;
            int hashCode7 = (hashCode6 + (f5 != null ? Float.hashCode(f5.floatValue()) : 0)) * 37;
            Float f6 = this.touch_minor;
            int hashCode8 = (hashCode7 + (f6 != null ? Float.hashCode(f6.floatValue()) : 0)) * 37;
            Float f7 = this.tool_major;
            int hashCode9 = (hashCode8 + (f7 != null ? Float.hashCode(f7.floatValue()) : 0)) * 37;
            Float f8 = this.tool_minor;
            int hashCode10 = (hashCode9 + (f8 != null ? Float.hashCode(f8.floatValue()) : 0)) * 37;
            Float f9 = this.orientation;
            int hashCode11 = hashCode10 + (f9 != null ? Float.hashCode(f9.floatValue()) : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.x = this.x;
            builder.y = this.y;
            builder.pressure = this.pressure;
            builder.size = this.size;
            builder.tool_type = this.tool_type;
            builder.touch_major = this.touch_major;
            builder.touch_minor = this.touch_minor;
            builder.tool_major = this.tool_major;
            builder.tool_minor = this.tool_minor;
            builder.orientation = this.orientation;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Float f = this.x;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("x=", f, arrayList);
            }
            Float f2 = this.y;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("y=", f2, arrayList);
            }
            Float f3 = this.pressure;
            if (f3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("pressure=", f3, arrayList);
            }
            Float f4 = this.size;
            if (f4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("size=", f4, arrayList);
            }
            Integer num = this.tool_type;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("tool_type=", num, arrayList);
            }
            Float f5 = this.touch_major;
            if (f5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("touch_major=", f5, arrayList);
            }
            Float f6 = this.touch_minor;
            if (f6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("touch_minor=", f6, arrayList);
            }
            Float f7 = this.tool_major;
            if (f7 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tool_major=", f7, arrayList);
            }
            Float f8 = this.tool_minor;
            if (f8 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("tool_minor=", f8, arrayList);
            }
            Float f9 = this.orientation;
            if (f9 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("orientation=", f9, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TouchSignalPointer{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/TouchSignalPointerList$TouchSignalPointer;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TouchSignalPointer build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TouchSignalPointer() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TouchSignalPointer(Float f, Float f2, Float f3, Float f4, Integer num, Float f5, Float f6, Float f7, Float f8, Float f9, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.x = f;
            this.y = f2;
            this.pressure = f3;
            this.size = f4;
            this.tool_type = num;
            this.touch_major = f5;
            this.touch_minor = f6;
            this.tool_major = f7;
            this.tool_minor = f8;
            this.orientation = f9;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalPointerList$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/TouchSignalPointerList;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TouchSignalPointerList build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public TouchSignalPointerList(ArrayList arrayList) {
        this(arrayList, ByteString.EMPTY);
    }
}
