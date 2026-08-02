package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.TransferOptionSelectionBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import squareup.cash.ui.arcade.elements.CellDefault;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u000f\u000e\u0010\u0011\u0012\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$AnimationDirection;", "submit_animation_direction", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$AnimationDirection;", "", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption;", "transfer_options", "Ljava/util/List;", "Companion", "Builder", "AnimationDirection", "TransferOption", "TransferOptionCell", "SavingsGoalIcon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransferOptionSelectionBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransferOptionSelectionBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$AnimationDirection#ADAPTER", schemaIndex = 3, tag = 4)
    public final AnimationDirection submit_animation_direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @WireField(adapter = "com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$TransferOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<TransferOption> transfer_options;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker;", "<init>", "()V", "title", "", "subtitle", "transfer_options", "", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption;", "submit_animation_direction", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$AnimationDirection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public AnimationDirection submit_animation_direction;
        public String subtitle;
        public String title;
        public List<TransferOption> transfer_options = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public TransferOptionSelectionBlocker build() {
            return new TransferOptionSelectionBlocker(this.title, this.subtitle, this.transfer_options, this.submit_animation_direction, buildUnknownFields());
        }

        public final Builder submit_animation_direction(AnimationDirection submit_animation_direction) {
            this.submit_animation_direction = submit_animation_direction;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder transfer_options(List<TransferOption> transfer_options) {
            transfer_options.getClass();
            TransactorKt.checkElementsNotNull(transfer_options);
            this.transfer_options = transfer_options;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TransferOptionSelectionBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TransferOptionSelectionBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TransferOptionSelectionBlocker((String) obj, (String) obj2, m, (TransferOptionSelectionBlocker.AnimationDirection) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        m.add(TransferOptionSelectionBlocker.TransferOption.ADAPTER.decode(reader));
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = TransferOptionSelectionBlocker.AnimationDirection.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TransferOptionSelectionBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                TransferOptionSelectionBlocker.TransferOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.transfer_options);
                TransferOptionSelectionBlocker.AnimationDirection.ADAPTER.encodeWithTag(writer, 4, value.submit_animation_direction);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TransferOptionSelectionBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return TransferOptionSelectionBlocker.AnimationDirection.ADAPTER.encodedSizeWithTag(4, value.submit_animation_direction) + TransferOptionSelectionBlocker.TransferOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.transfer_options) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TransferOptionSelectionBlocker redact(TransferOptionSelectionBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.transfer_options, TransferOptionSelectionBlocker.TransferOption.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                TransferOptionSelectionBlocker.AnimationDirection animationDirection = value.submit_animation_direction;
                byteString.getClass();
                return new TransferOptionSelectionBlocker(str, str2, m1169redactElements, animationDirection, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TransferOptionSelectionBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                TransferOptionSelectionBlocker.AnimationDirection.ADAPTER.encodeWithTag(writer, 4, value.submit_animation_direction);
                TransferOptionSelectionBlocker.TransferOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.transfer_options);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferOptionSelectionBlocker(String str, String str2, List list, AnimationDirection animationDirection, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.submit_animation_direction = animationDirection;
        this.transfer_options = TransactorKt.immutableCopyOf("transfer_options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransferOptionSelectionBlocker)) {
            return false;
        }
        TransferOptionSelectionBlocker transferOptionSelectionBlocker = (TransferOptionSelectionBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), transferOptionSelectionBlocker.unknownFields()) && Intrinsics.areEqual(this.title, transferOptionSelectionBlocker.title) && Intrinsics.areEqual(this.subtitle, transferOptionSelectionBlocker.subtitle) && Intrinsics.areEqual(this.transfer_options, transferOptionSelectionBlocker.transfer_options) && this.submit_animation_direction == transferOptionSelectionBlocker.submit_animation_direction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.transfer_options);
        AnimationDirection animationDirection = this.submit_animation_direction;
        int hashCode3 = m + (animationDirection != null ? animationDirection.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.transfer_options = this.transfer_options;
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
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        if (!this.transfer_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("transfer_options=", arrayList, this.transfer_options);
        }
        AnimationDirection animationDirection = this.submit_animation_direction;
        if (animationDirection != null) {
            arrayList.add("submit_animation_direction=" + animationDirection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferOptionSelectionBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$AnimationDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FORWARD", "BACKWARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$AnimationDirection$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TransferOptionSelectionBlocker.AnimationDirection fromValue(int value) {
                    return TransferOptionSelectionBlocker.AnimationDirection.INSTANCE.fromValue(value);
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

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$AnimationDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$AnimationDirection;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0015R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon$Builder;", "icon_id", "", "progress", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SavingsGoalIcon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SavingsGoalIcon> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String icon_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 1, tag = 2)
        public final Float progress;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "<init>", "()V", "icon_id", "", "progress", "", "Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String icon_id;
            public Float progress;

            @Override // com.squareup.wire.Message.Builder
            public SavingsGoalIcon build() {
                return new SavingsGoalIcon(this.icon_id, this.progress, buildUnknownFields());
            }

            public final Builder icon_id(String icon_id) {
                this.icon_id = icon_id;
                return this;
            }

            public final Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SavingsGoalIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$SavingsGoalIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TransferOptionSelectionBlocker.SavingsGoalIcon decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TransferOptionSelectionBlocker.SavingsGoalIcon((String) obj, (Float) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TransferOptionSelectionBlocker.SavingsGoalIcon value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.icon_id);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.progress);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TransferOptionSelectionBlocker.SavingsGoalIcon value) {
                    value.getClass();
                    return ProtoAdapter.FLOAT.encodedSizeWithTag(2, value.progress) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.icon_id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TransferOptionSelectionBlocker.SavingsGoalIcon redact(TransferOptionSelectionBlocker.SavingsGoalIcon value) {
                    value.getClass();
                    return TransferOptionSelectionBlocker.SavingsGoalIcon.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TransferOptionSelectionBlocker.SavingsGoalIcon value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 2, value.progress);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.icon_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SavingsGoalIcon(String str, Float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SavingsGoalIcon copy$default(SavingsGoalIcon savingsGoalIcon, String str, Float f, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savingsGoalIcon.icon_id;
            }
            if ((i & 2) != 0) {
                f = savingsGoalIcon.progress;
            }
            if ((i & 4) != 0) {
                byteString = savingsGoalIcon.unknownFields();
            }
            return savingsGoalIcon.copy(str, f, byteString);
        }

        public final SavingsGoalIcon copy(String icon_id, Float progress, ByteString unknownFields) {
            unknownFields.getClass();
            return new SavingsGoalIcon(icon_id, progress, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SavingsGoalIcon)) {
                return false;
            }
            SavingsGoalIcon savingsGoalIcon = (SavingsGoalIcon) other;
            return Intrinsics.areEqual(unknownFields(), savingsGoalIcon.unknownFields()) && Intrinsics.areEqual(this.icon_id, savingsGoalIcon.icon_id) && Intrinsics.areEqual(this.progress, savingsGoalIcon.progress);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.icon_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Float f = this.progress;
            int hashCode3 = hashCode2 + (f != null ? Float.hashCode(f.floatValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon_id = this.icon_id;
            builder.progress = this.progress;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.icon_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
            }
            Float f = this.progress;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("progress=", f, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsGoalIcon{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SavingsGoalIcon build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SavingsGoalIcon() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsGoalIcon(String str, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon_id = str;
            this.progress = f;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption$Builder;", "option_id", "", "cell", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class TransferOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransferOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$TransferOptionCell#ADAPTER", schemaIndex = 1, tag = 2)
        public final TransferOptionCell cell;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String option_id;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption;", "<init>", "()V", "option_id", "", "cell", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public TransferOptionCell cell;
            public String option_id;

            @Override // com.squareup.wire.Message.Builder
            public TransferOption build() {
                return new TransferOption(this.option_id, this.cell, buildUnknownFields());
            }

            public final Builder cell(TransferOptionCell cell) {
                this.cell = cell;
                return this;
            }

            public final Builder option_id(String option_id) {
                this.option_id = option_id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TransferOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$TransferOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TransferOptionSelectionBlocker.TransferOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TransferOptionSelectionBlocker.TransferOption((String) obj, (TransferOptionSelectionBlocker.TransferOptionCell) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(TransferOptionSelectionBlocker.TransferOptionCell.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TransferOptionSelectionBlocker.TransferOption value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.option_id);
                    TransferOptionSelectionBlocker.TransferOptionCell.ADAPTER.encodeWithTag(writer, 2, value.cell);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TransferOptionSelectionBlocker.TransferOption value) {
                    value.getClass();
                    return TransferOptionSelectionBlocker.TransferOptionCell.ADAPTER.encodedSizeWithTag(2, value.cell) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.option_id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TransferOptionSelectionBlocker.TransferOption redact(TransferOptionSelectionBlocker.TransferOption value) {
                    value.getClass();
                    TransferOptionSelectionBlocker.TransferOptionCell transferOptionCell = value.cell;
                    return TransferOptionSelectionBlocker.TransferOption.copy$default(value, null, transferOptionCell != null ? (TransferOptionSelectionBlocker.TransferOptionCell) TransferOptionSelectionBlocker.TransferOptionCell.ADAPTER.redact(transferOptionCell) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TransferOptionSelectionBlocker.TransferOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    TransferOptionSelectionBlocker.TransferOptionCell.ADAPTER.encodeWithTag(writer, 2, value.cell);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.option_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TransferOption(String str, TransferOptionCell transferOptionCell, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : transferOptionCell, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TransferOption copy$default(TransferOption transferOption, String str, TransferOptionCell transferOptionCell, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transferOption.option_id;
            }
            if ((i & 2) != 0) {
                transferOptionCell = transferOption.cell;
            }
            if ((i & 4) != 0) {
                byteString = transferOption.unknownFields();
            }
            return transferOption.copy(str, transferOptionCell, byteString);
        }

        public final TransferOption copy(String option_id, TransferOptionCell cell, ByteString unknownFields) {
            unknownFields.getClass();
            return new TransferOption(option_id, cell, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TransferOption)) {
                return false;
            }
            TransferOption transferOption = (TransferOption) other;
            return Intrinsics.areEqual(unknownFields(), transferOption.unknownFields()) && Intrinsics.areEqual(this.option_id, transferOption.option_id) && Intrinsics.areEqual(this.cell, transferOption.cell);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.option_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            TransferOptionCell transferOptionCell = this.cell;
            int hashCode3 = hashCode2 + (transferOptionCell != null ? transferOptionCell.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.option_id = this.option_id;
            builder.cell = this.cell;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.option_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "option_id=", arrayList);
            }
            TransferOptionCell transferOptionCell = this.cell;
            if (transferOptionCell != null) {
                arrayList.add("cell=" + transferOptionCell);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransferOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TransferOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TransferOption() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferOption(String str, TransferOptionCell transferOptionCell, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.option_id = str;
            this.cell = transferOptionCell;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Builder;", "cell_default", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "icon", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault;Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Icon", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class TransferOptionCell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransferOptionCell> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.CellDefault#ADAPTER", schemaIndex = 0, tag = 1)
        public final CellDefault cell_default;

        @WireSealedOneof(schemaIndex = 1)
        public final Icon icon;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;", "<init>", "()V", "cell_default", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "icon", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public CellDefault cell_default;
            public Icon icon;

            @Override // com.squareup.wire.Message.Builder
            public TransferOptionCell build() {
                return new TransferOptionCell(this.cell_default, this.icon, buildUnknownFields());
            }

            public final Builder cell_default(CellDefault cell_default) {
                this.cell_default = cell_default;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TransferOptionCell.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$TransferOptionCell$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TransferOptionSelectionBlocker.TransferOptionCell decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    TransferOptionSelectionBlocker.TransferOptionCell.Icon icon = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TransferOptionSelectionBlocker.TransferOptionCell((CellDefault) obj, icon, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(CellDefault.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            icon = new TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon((TransferOptionSelectionBlocker.SavingsGoalIcon) TransferOptionSelectionBlocker.SavingsGoalIcon.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            icon = new TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar((UiAvatar) UiAvatar.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TransferOptionSelectionBlocker.TransferOptionCell value) {
                    writer.getClass();
                    value.getClass();
                    CellDefault.ADAPTER.encodeWithTag(writer, 1, value.cell_default);
                    TransferOptionSelectionBlocker.TransferOptionCell.Icon icon = value.icon;
                    if (icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) {
                        TransferOptionSelectionBlocker.SavingsGoalIcon.ADAPTER.encodeWithTag(writer, 2, ((TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) icon).getValue());
                    } else if (icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) {
                        UiAvatar.ADAPTER.encodeWithTag(writer, 3, ((TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) icon).getValue());
                    } else if (icon != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TransferOptionSelectionBlocker.TransferOptionCell value) {
                    value.getClass();
                    int encodedSizeWithTag = CellDefault.ADAPTER.encodedSizeWithTag(1, value.cell_default) + value.unknownFields().getSize$okio();
                    TransferOptionSelectionBlocker.TransferOptionCell.Icon icon = value.icon;
                    if (icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) {
                        return TransferOptionSelectionBlocker.SavingsGoalIcon.ADAPTER.encodedSizeWithTag(2, ((TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) icon).getValue()) + encodedSizeWithTag;
                    }
                    if (icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) {
                        return UiAvatar.ADAPTER.encodedSizeWithTag(3, ((TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) icon).getValue()) + encodedSizeWithTag;
                    }
                    if (icon == null) {
                        return encodedSizeWithTag;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TransferOptionSelectionBlocker.TransferOptionCell redact(TransferOptionSelectionBlocker.TransferOptionCell value) {
                    value.getClass();
                    CellDefault cellDefault = value.cell_default;
                    return TransferOptionSelectionBlocker.TransferOptionCell.copy$default(value, cellDefault != null ? (CellDefault) CellDefault.ADAPTER.redact(cellDefault) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TransferOptionSelectionBlocker.TransferOptionCell value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    TransferOptionSelectionBlocker.TransferOptionCell.Icon icon = value.icon;
                    if (icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) {
                        TransferOptionSelectionBlocker.SavingsGoalIcon.ADAPTER.encodeWithTag(writer, 2, ((TransferOptionSelectionBlocker.TransferOptionCell.Icon.GoalIcon) icon).getValue());
                    } else if (icon instanceof TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) {
                        UiAvatar.ADAPTER.encodeWithTag(writer, 3, ((TransferOptionSelectionBlocker.TransferOptionCell.Icon.UiAvatar) icon).getValue());
                    } else if (icon != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    CellDefault.ADAPTER.encodeWithTag(writer, 1, value.cell_default);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TransferOptionCell(CellDefault cellDefault, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cellDefault, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TransferOptionCell copy$default(TransferOptionCell transferOptionCell, CellDefault cellDefault, Icon icon, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                cellDefault = transferOptionCell.cell_default;
            }
            if ((i & 2) != 0) {
                icon = transferOptionCell.icon;
            }
            if ((i & 4) != 0) {
                byteString = transferOptionCell.unknownFields();
            }
            return transferOptionCell.copy(cellDefault, icon, byteString);
        }

        public final TransferOptionCell copy(CellDefault cell_default, Icon icon, ByteString unknownFields) {
            unknownFields.getClass();
            return new TransferOptionCell(cell_default, icon, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TransferOptionCell)) {
                return false;
            }
            TransferOptionCell transferOptionCell = (TransferOptionCell) other;
            return Intrinsics.areEqual(unknownFields(), transferOptionCell.unknownFields()) && Intrinsics.areEqual(this.cell_default, transferOptionCell.cell_default) && Intrinsics.areEqual(this.icon, transferOptionCell.icon);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CellDefault cellDefault = this.cell_default;
            int hashCode2 = (hashCode + (cellDefault != null ? cellDefault.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode3 = hashCode2 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.cell_default = this.cell_default;
            builder.icon = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            CellDefault cellDefault = this.cell_default;
            if (cellDefault != null) {
                arrayList.add("cell_default=" + cellDefault);
            }
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransferOptionCell{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TransferOptionCell build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon;", "", "<init>", "()V", "GoalIcon", "UiAvatar", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon$GoalIcon;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon$UiAvatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Icon {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.TransferOptionSelectionBlocker$SavingsGoalIcon#ADAPTER", declaredName = "goal_icon", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon$GoalIcon;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon;", "value", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "<init>", "(Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$SavingsGoalIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class GoalIcon extends Icon {
                private final SavingsGoalIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GoalIcon(SavingsGoalIcon savingsGoalIcon) {
                    super(null);
                    savingsGoalIcon.getClass();
                    this.value = savingsGoalIcon;
                }

                public static /* synthetic */ GoalIcon copy$default(GoalIcon goalIcon, SavingsGoalIcon savingsGoalIcon, int i, Object obj) {
                    if ((i & 1) != 0) {
                        savingsGoalIcon = goalIcon.value;
                    }
                    return goalIcon.copy(savingsGoalIcon);
                }

                /* renamed from: component1, reason: from getter */
                public final SavingsGoalIcon getValue() {
                    return this.value;
                }

                public final GoalIcon copy(SavingsGoalIcon value) {
                    value.getClass();
                    return new GoalIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof GoalIcon) && Intrinsics.areEqual(this.value, ((GoalIcon) other).value);
                }

                public final SavingsGoalIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "GoalIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "ui_avatar", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon$UiAvatar;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$TransferOptionCell$Icon;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "<init>", "(Lcom/squareup/protos/franklin/ui/UiAvatar;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class UiAvatar extends Icon {
                private final com.squareup.protos.franklin.ui.UiAvatar value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UiAvatar(com.squareup.protos.franklin.ui.UiAvatar uiAvatar) {
                    super(null);
                    uiAvatar.getClass();
                    this.value = uiAvatar;
                }

                public static /* synthetic */ UiAvatar copy$default(UiAvatar uiAvatar, com.squareup.protos.franklin.ui.UiAvatar uiAvatar2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uiAvatar2 = uiAvatar.value;
                    }
                    return uiAvatar.copy(uiAvatar2);
                }

                /* renamed from: component1, reason: from getter */
                public final com.squareup.protos.franklin.ui.UiAvatar getValue() {
                    return this.value;
                }

                public final UiAvatar copy(com.squareup.protos.franklin.ui.UiAvatar value) {
                    value.getClass();
                    return new UiAvatar(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof UiAvatar) && Intrinsics.areEqual(this.value, ((UiAvatar) other).value);
                }

                public final com.squareup.protos.franklin.ui.UiAvatar getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "UiAvatar(value=", ")");
                }
            }

            public /* synthetic */ Icon(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Icon() {
            }
        }

        public TransferOptionCell() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferOptionCell(CellDefault cellDefault, Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cell_default = cellDefault;
            this.icon = icon;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/TransferOptionSelectionBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TransferOptionSelectionBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
