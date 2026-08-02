package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.StatusInterstitialBlocker;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$Builder;", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$StatusIcon;", "status_icon", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$StatusIcon;", "", "text", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "scheduled_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "Companion", "Builder", "StatusIcon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StatusInterstitialBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StatusInterstitialBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 2, tag = 3)
    public final BlockerAction scheduled_action;

    @WireField(adapter = "com.squareup.protos.franklin.api.StatusInterstitialBlocker$StatusIcon#ADAPTER", schemaIndex = 0, tag = 1)
    public final StatusIcon status_icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String text;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker;", "<init>", "()V", "status_icon", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$StatusIcon;", "text", "", "scheduled_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public BlockerAction scheduled_action;
        public StatusIcon status_icon;
        public String text;

        @Override // com.squareup.wire.Message.Builder
        public StatusInterstitialBlocker build() {
            return new StatusInterstitialBlocker(this.status_icon, this.text, this.scheduled_action, buildUnknownFields());
        }

        public final Builder scheduled_action(BlockerAction scheduled_action) {
            this.scheduled_action = scheduled_action;
            return this;
        }

        public final Builder status_icon(StatusIcon status_icon) {
            this.status_icon = status_icon;
            return this;
        }

        public final Builder text(String text) {
            this.text = text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StatusInterstitialBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.StatusInterstitialBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public StatusInterstitialBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new StatusInterstitialBlocker((StatusInterstitialBlocker.StatusIcon) obj, (String) obj2, (BlockerAction) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = StatusInterstitialBlocker.StatusIcon.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StatusInterstitialBlocker value) {
                writer.getClass();
                value.getClass();
                StatusInterstitialBlocker.StatusIcon.ADAPTER.encodeWithTag(writer, 1, value.status_icon);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                BlockerAction.ADAPTER.encodeWithTag(writer, 3, value.scheduled_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StatusInterstitialBlocker value) {
                value.getClass();
                return BlockerAction.ADAPTER.encodedSizeWithTag(3, value.scheduled_action) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.text) + StatusInterstitialBlocker.StatusIcon.ADAPTER.encodedSizeWithTag(1, value.status_icon) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StatusInterstitialBlocker redact(StatusInterstitialBlocker value) {
                value.getClass();
                BlockerAction blockerAction = value.scheduled_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                StatusInterstitialBlocker.StatusIcon statusIcon = value.status_icon;
                String str = value.text;
                byteString.getClass();
                return new StatusInterstitialBlocker(statusIcon, str, blockerAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StatusInterstitialBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.ADAPTER.encodeWithTag(writer, 3, value.scheduled_action);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                StatusInterstitialBlocker.StatusIcon.ADAPTER.encodeWithTag(writer, 1, value.status_icon);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusInterstitialBlocker(StatusIcon statusIcon, String str, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status_icon = statusIcon;
        this.text = str;
        this.scheduled_action = blockerAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StatusInterstitialBlocker)) {
            return false;
        }
        StatusInterstitialBlocker statusInterstitialBlocker = (StatusInterstitialBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), statusInterstitialBlocker.unknownFields()) && this.status_icon == statusInterstitialBlocker.status_icon && Intrinsics.areEqual(this.text, statusInterstitialBlocker.text) && Intrinsics.areEqual(this.scheduled_action, statusInterstitialBlocker.scheduled_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StatusIcon statusIcon = this.status_icon;
        int hashCode2 = (hashCode + (statusIcon != null ? statusIcon.hashCode() : 0)) * 37;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.scheduled_action;
        int hashCode4 = hashCode3 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.status_icon = this.status_icon;
        builder.text = this.text;
        builder.scheduled_action = this.scheduled_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StatusIcon statusIcon = this.status_icon;
        if (statusIcon != null) {
            arrayList.add("status_icon=" + statusIcon);
        }
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        BlockerAction blockerAction = this.scheduled_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StatusInterstitialBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$StatusIcon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "PENDING", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class StatusIcon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusIcon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final StatusIcon SUCCESS = new StatusIcon("SUCCESS", 0, 1);
        public static final StatusIcon PENDING = new StatusIcon("PENDING", 1, 2);

        private static final /* synthetic */ StatusIcon[] $values() {
            return new StatusIcon[]{SUCCESS, PENDING};
        }

        static {
            StatusIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StatusIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.StatusInterstitialBlocker$StatusIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public StatusInterstitialBlocker.StatusIcon fromValue(int value) {
                    return StatusInterstitialBlocker.StatusIcon.INSTANCE.fromValue(value);
                }
            };
        }

        private StatusIcon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final StatusIcon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static StatusIcon valueOf(String str) {
            return (StatusIcon) Enum.valueOf(StatusIcon.class, str);
        }

        public static StatusIcon[] values() {
            return (StatusIcon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$StatusIcon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$StatusIcon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final StatusIcon fromValue(int value) {
                if (value == 1) {
                    return StatusIcon.SUCCESS;
                }
                if (value != 2) {
                    return null;
                }
                return StatusIcon.PENDING;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/StatusInterstitialBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ StatusInterstitialBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
