package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CalendarBlocker;
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
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/CalendarBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/CalendarBlocker$Builder;", "", "title", "Ljava/lang/String;", "start_date", "end_date", "preselected_date", "disabling_toggle_label", "", "disabling_toggle_initial_value", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/api/CalendarBlocker$AnimationDirection;", "submit_animation_direction", "Lcom/squareup/protos/franklin/api/CalendarBlocker$AnimationDirection;", "Companion", "Builder", "AnimationDirection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CalendarBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CalendarBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean disabling_toggle_initial_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String disabling_toggle_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String end_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String preselected_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String start_date;

    @WireField(adapter = "com.squareup.protos.franklin.api.CalendarBlocker$AnimationDirection#ADAPTER", schemaIndex = 6, tag = 7)
    public final AnimationDirection submit_animation_direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/CalendarBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/CalendarBlocker;", "<init>", "()V", "title", "", "start_date", "end_date", "preselected_date", "disabling_toggle_label", "disabling_toggle_initial_value", "", "Ljava/lang/Boolean;", "submit_animation_direction", "Lcom/squareup/protos/franklin/api/CalendarBlocker$AnimationDirection;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/CalendarBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean disabling_toggle_initial_value;
        public String disabling_toggle_label;
        public String end_date;
        public String preselected_date;
        public String start_date;
        public AnimationDirection submit_animation_direction;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public CalendarBlocker build() {
            return new CalendarBlocker(this.title, this.start_date, this.end_date, this.preselected_date, this.disabling_toggle_label, this.disabling_toggle_initial_value, this.submit_animation_direction, buildUnknownFields());
        }

        public final Builder disabling_toggle_initial_value(Boolean disabling_toggle_initial_value) {
            this.disabling_toggle_initial_value = disabling_toggle_initial_value;
            return this;
        }

        public final Builder disabling_toggle_label(String disabling_toggle_label) {
            this.disabling_toggle_label = disabling_toggle_label;
            return this;
        }

        public final Builder end_date(String end_date) {
            this.end_date = end_date;
            return this;
        }

        public final Builder preselected_date(String preselected_date) {
            this.preselected_date = preselected_date;
            return this;
        }

        public final Builder start_date(String start_date) {
            this.start_date = start_date;
            return this;
        }

        public final Builder submit_animation_direction(AnimationDirection submit_animation_direction) {
            this.submit_animation_direction = submit_animation_direction;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CalendarBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CalendarBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CalendarBlocker decode(ProtoReader reader) {
                reader.getClass();
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
                        return new CalendarBlocker((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (Boolean) obj6, (CalendarBlocker.AnimationDirection) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 7:
                            try {
                                obj7 = CalendarBlocker.AnimationDirection.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CalendarBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.start_date);
                protoAdapter2.encodeWithTag(writer, 3, value.end_date);
                protoAdapter2.encodeWithTag(writer, 4, value.preselected_date);
                protoAdapter2.encodeWithTag(writer, 5, value.disabling_toggle_label);
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.disabling_toggle_initial_value);
                CalendarBlocker.AnimationDirection.ADAPTER.encodeWithTag(writer, 7, value.submit_animation_direction);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CalendarBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return CalendarBlocker.AnimationDirection.ADAPTER.encodedSizeWithTag(7, value.submit_animation_direction) + ProtoAdapter.BOOL.encodedSizeWithTag(6, value.disabling_toggle_initial_value) + protoAdapter2.encodedSizeWithTag(5, value.disabling_toggle_label) + protoAdapter2.encodedSizeWithTag(4, value.preselected_date) + protoAdapter2.encodedSizeWithTag(3, value.end_date) + protoAdapter2.encodedSizeWithTag(2, value.start_date) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CalendarBlocker redact(CalendarBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.start_date;
                String str3 = value.end_date;
                String str4 = value.preselected_date;
                String str5 = value.disabling_toggle_label;
                Boolean bool = value.disabling_toggle_initial_value;
                CalendarBlocker.AnimationDirection animationDirection = value.submit_animation_direction;
                value.getClass();
                byteString.getClass();
                return new CalendarBlocker(str, str2, str3, str4, str5, bool, animationDirection, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CalendarBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                CalendarBlocker.AnimationDirection.ADAPTER.encodeWithTag(writer, 7, value.submit_animation_direction);
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.disabling_toggle_initial_value);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.disabling_toggle_label);
                protoAdapter2.encodeWithTag(writer, 4, value.preselected_date);
                protoAdapter2.encodeWithTag(writer, 3, value.end_date);
                protoAdapter2.encodeWithTag(writer, 2, value.start_date);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarBlocker(String str, String str2, String str3, String str4, String str5, Boolean bool, AnimationDirection animationDirection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.start_date = str2;
        this.end_date = str3;
        this.preselected_date = str4;
        this.disabling_toggle_label = str5;
        this.disabling_toggle_initial_value = bool;
        this.submit_animation_direction = animationDirection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalendarBlocker)) {
            return false;
        }
        CalendarBlocker calendarBlocker = (CalendarBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), calendarBlocker.unknownFields()) && Intrinsics.areEqual(this.title, calendarBlocker.title) && Intrinsics.areEqual(this.start_date, calendarBlocker.start_date) && Intrinsics.areEqual(this.end_date, calendarBlocker.end_date) && Intrinsics.areEqual(this.preselected_date, calendarBlocker.preselected_date) && Intrinsics.areEqual(this.disabling_toggle_label, calendarBlocker.disabling_toggle_label) && Intrinsics.areEqual(this.disabling_toggle_initial_value, calendarBlocker.disabling_toggle_initial_value) && this.submit_animation_direction == calendarBlocker.submit_animation_direction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.start_date;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.end_date;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.preselected_date;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.disabling_toggle_label;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.disabling_toggle_initial_value;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        AnimationDirection animationDirection = this.submit_animation_direction;
        int hashCode8 = hashCode7 + (animationDirection != null ? animationDirection.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.start_date = this.start_date;
        builder.end_date = this.end_date;
        builder.preselected_date = this.preselected_date;
        builder.disabling_toggle_label = this.disabling_toggle_label;
        builder.disabling_toggle_initial_value = this.disabling_toggle_initial_value;
        builder.submit_animation_direction = this.submit_animation_direction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.start_date;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "start_date=", arrayList);
        }
        String str3 = this.end_date;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "end_date=", arrayList);
        }
        String str4 = this.preselected_date;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "preselected_date=", arrayList);
        }
        String str5 = this.disabling_toggle_label;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "disabling_toggle_label=", arrayList);
        }
        Boolean bool = this.disabling_toggle_initial_value;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("disabling_toggle_initial_value=", bool, arrayList);
        }
        AnimationDirection animationDirection = this.submit_animation_direction;
        if (animationDirection != null) {
            arrayList.add("submit_animation_direction=" + animationDirection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalendarBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/CalendarBlocker$AnimationDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FORWARD", "BACKWARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AnimationDirection implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationDirection[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final AnimationDirection FORWARD = new AnimationDirection("FORWARD", 0, 1);
        public static final AnimationDirection BACKWARD = new AnimationDirection("BACKWARD", 1, 2);

        private static final /* synthetic */ AnimationDirection[] $values() {
            return new AnimationDirection[]{FORWARD, BACKWARD};
        }

        static {
            AnimationDirection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AnimationDirection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.CalendarBlocker$AnimationDirection$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public CalendarBlocker.AnimationDirection fromValue(int value) {
                    return CalendarBlocker.AnimationDirection.INSTANCE.fromValue(value);
                }
            };
        }

        private AnimationDirection(String str, int i, int i2) {
            this.value = i2;
        }

        public static final AnimationDirection fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AnimationDirection valueOf(String str) {
            return (AnimationDirection) Enum.valueOf(AnimationDirection.class, str);
        }

        public static AnimationDirection[] values() {
            return (AnimationDirection[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/CalendarBlocker$AnimationDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/CalendarBlocker$AnimationDirection;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AnimationDirection fromValue(int value) {
                if (value == 1) {
                    return AnimationDirection.FORWARD;
                }
                if (value != 2) {
                    return null;
                }
                return AnimationDirection.BACKWARD;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/CalendarBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/CalendarBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/CalendarBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/CalendarBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CalendarBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
