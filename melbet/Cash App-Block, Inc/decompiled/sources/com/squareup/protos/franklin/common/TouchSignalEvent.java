package com.squareup.protos.franklin.common;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalEvent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/TouchSignalEvent$Builder;", "", "time", "Ljava/lang/Long;", "", "device_id", "Ljava/lang/Integer;", "action_value", "edge_flag", "meta_state", "flags", "button_states", "", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList;", "pointers", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TouchSignalEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TouchSignalEvent> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer action_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 6, tag = 7)
    public final Integer button_states;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", redacted = true, schemaIndex = 1, tag = 2)
    public final Integer device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer edge_flag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    public final Integer flags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    public final Integer meta_state;

    @WireField(adapter = "com.squareup.protos.franklin.common.TouchSignalPointerList#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<TouchSignalPointerList> pointers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long time;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalEvent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/TouchSignalEvent;", "<init>", "()V", "time", "", "Ljava/lang/Long;", "device_id", "", "Ljava/lang/Integer;", "action_value", "edge_flag", "meta_state", "flags", "button_states", "pointers", "", "Lcom/squareup/protos/franklin/common/TouchSignalPointerList;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/TouchSignalEvent$Builder;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/TouchSignalEvent$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Integer action_value;
        public Integer button_states;
        public Integer device_id;
        public Integer edge_flag;
        public Integer flags;
        public Integer meta_state;
        public List<TouchSignalPointerList> pointers = EmptyList.INSTANCE;
        public Long time;

        public final Builder action_value(Integer action_value) {
            this.action_value = action_value;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TouchSignalEvent build() {
            return new TouchSignalEvent(this.time, this.device_id, this.action_value, this.edge_flag, this.meta_state, this.flags, this.button_states, this.pointers, buildUnknownFields());
        }

        public final Builder button_states(Integer button_states) {
            this.button_states = button_states;
            return this;
        }

        public final Builder device_id(Integer device_id) {
            this.device_id = device_id;
            return this;
        }

        public final Builder edge_flag(Integer edge_flag) {
            this.edge_flag = edge_flag;
            return this;
        }

        public final Builder flags(Integer flags) {
            this.flags = flags;
            return this;
        }

        public final Builder meta_state(Integer meta_state) {
            this.meta_state = meta_state;
            return this;
        }

        public final Builder pointers(List<TouchSignalPointerList> pointers) {
            pointers.getClass();
            TransactorKt.checkElementsNotNull(pointers);
            this.pointers = pointers;
            return this;
        }

        public final Builder time(Long time) {
            this.time = time;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TouchSignalEvent.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.TouchSignalEvent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TouchSignalEvent decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TouchSignalEvent((Long) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Integer) obj6, (Integer) obj7, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 8:
                            m.add(TouchSignalPointerList.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TouchSignalEvent value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.INT64.encodeWithTag(writer, 1, value.time);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 2, value.device_id);
                protoAdapter2.encodeWithTag(writer, 3, value.action_value);
                protoAdapter2.encodeWithTag(writer, 4, value.edge_flag);
                protoAdapter2.encodeWithTag(writer, 5, value.meta_state);
                protoAdapter2.encodeWithTag(writer, 6, value.flags);
                protoAdapter2.encodeWithTag(writer, 7, value.button_states);
                TouchSignalPointerList.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.pointers);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TouchSignalEvent value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, value.time) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                return TouchSignalPointerList.ADAPTER.asRepeated().encodedSizeWithTag(8, value.pointers) + protoAdapter2.encodedSizeWithTag(7, value.button_states) + protoAdapter2.encodedSizeWithTag(6, value.flags) + protoAdapter2.encodedSizeWithTag(5, value.meta_state) + protoAdapter2.encodedSizeWithTag(4, value.edge_flag) + protoAdapter2.encodedSizeWithTag(3, value.action_value) + protoAdapter2.encodedSizeWithTag(2, value.device_id) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TouchSignalEvent redact(TouchSignalEvent value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.pointers, TouchSignalPointerList.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Long l = value.time;
                Integer num = value.action_value;
                Integer num2 = value.edge_flag;
                Integer num3 = value.meta_state;
                Integer num4 = value.flags;
                Integer num5 = value.button_states;
                byteString.getClass();
                return new TouchSignalEvent(l, null, num, num2, num3, num4, num5, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TouchSignalEvent value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TouchSignalPointerList.ADAPTER.asRepeated().encodeWithTag(writer, 8, value.pointers);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.encodeWithTag(writer, 7, value.button_states);
                protoAdapter2.encodeWithTag(writer, 6, value.flags);
                protoAdapter2.encodeWithTag(writer, 5, value.meta_state);
                protoAdapter2.encodeWithTag(writer, 4, value.edge_flag);
                protoAdapter2.encodeWithTag(writer, 3, value.action_value);
                protoAdapter2.encodeWithTag(writer, 2, value.device_id);
                ProtoAdapter.INT64.encodeWithTag(writer, 1, value.time);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchSignalEvent(Long l, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.time = l;
        this.device_id = num;
        this.action_value = num2;
        this.edge_flag = num3;
        this.meta_state = num4;
        this.flags = num5;
        this.button_states = num6;
        this.pointers = TransactorKt.immutableCopyOf("pointers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TouchSignalEvent)) {
            return false;
        }
        TouchSignalEvent touchSignalEvent = (TouchSignalEvent) obj;
        return Intrinsics.areEqual(unknownFields(), touchSignalEvent.unknownFields()) && Intrinsics.areEqual(this.time, touchSignalEvent.time) && Intrinsics.areEqual(this.device_id, touchSignalEvent.device_id) && Intrinsics.areEqual(this.action_value, touchSignalEvent.action_value) && Intrinsics.areEqual(this.edge_flag, touchSignalEvent.edge_flag) && Intrinsics.areEqual(this.meta_state, touchSignalEvent.meta_state) && Intrinsics.areEqual(this.flags, touchSignalEvent.flags) && Intrinsics.areEqual(this.button_states, touchSignalEvent.button_states) && Intrinsics.areEqual(this.pointers, touchSignalEvent.pointers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.time;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Integer num = this.device_id;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.action_value;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.edge_flag;
        int hashCode5 = (hashCode4 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.meta_state;
        int hashCode6 = (hashCode5 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Integer num5 = this.flags;
        int hashCode7 = (hashCode6 + (num5 != null ? Integer.hashCode(num5.intValue()) : 0)) * 37;
        Integer num6 = this.button_states;
        int hashCode8 = this.pointers.hashCode() + ((hashCode7 + (num6 != null ? Integer.hashCode(num6.intValue()) : 0)) * 37);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.time = this.time;
        builder.device_id = this.device_id;
        builder.action_value = this.action_value;
        builder.edge_flag = this.edge_flag;
        builder.meta_state = this.meta_state;
        builder.flags = this.flags;
        builder.button_states = this.button_states;
        builder.pointers = this.pointers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("time=", l, arrayList);
        }
        if (this.device_id != null) {
            arrayList.add("device_id=██");
        }
        Integer num = this.action_value;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("action_value=", num, arrayList);
        }
        Integer num2 = this.edge_flag;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("edge_flag=", num2, arrayList);
        }
        Integer num3 = this.meta_state;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("meta_state=", num3, arrayList);
        }
        Integer num4 = this.flags;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("flags=", num4, arrayList);
        }
        Integer num5 = this.button_states;
        if (num5 != null) {
            re$$ExternalSyntheticOutline0.m("button_states=", num5, arrayList);
        }
        if (!this.pointers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pointers=", arrayList, this.pointers);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TouchSignalEvent{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/TouchSignalEvent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/TouchSignalEvent$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/TouchSignalEvent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/TouchSignalEvent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TouchSignalEvent build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public TouchSignalEvent(Long l, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, ArrayList arrayList) {
        this(l, num, num2, num3, num4, num5, num6, arrayList, ByteString.EMPTY);
    }
}
