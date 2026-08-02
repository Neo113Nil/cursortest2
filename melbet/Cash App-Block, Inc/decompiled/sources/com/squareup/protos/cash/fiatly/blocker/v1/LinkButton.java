package com.squareup.protos.cash.fiatly.blocker.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.fiatly.blocker.v1.LinkButton;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\r\f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$Builder;", "", "title", "Ljava/lang/String;", "", "enabled", "Ljava/lang/Boolean;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$ButtonAction;", "action", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$ButtonAction;", "Companion", "Builder", "ButtonAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LinkButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkButton> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.fiatly.blocker.v1.LinkButton$ButtonAction#ADAPTER", schemaIndex = 2, tag = 3)
    public final ButtonAction action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "<init>", "()V", "title", "", "enabled", "", "Ljava/lang/Boolean;", "action", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$ButtonAction;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ButtonAction action;
        public Boolean enabled;
        public String title;

        public final Builder action(ButtonAction action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LinkButton build() {
            return new LinkButton(this.title, this.enabled, this.action, buildUnknownFields());
        }

        public final Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LinkButton.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.fiatly.blocker.v1.LinkButton$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public LinkButton decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new LinkButton((String) obj, (Boolean) obj2, (LinkButton.ButtonAction) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = LinkButton.ButtonAction.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LinkButton value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.enabled);
                LinkButton.ButtonAction.ADAPTER.encodeWithTag(writer, 3, value.action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LinkButton value) {
                value.getClass();
                return LinkButton.ButtonAction.ADAPTER.encodedSizeWithTag(3, value.action) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.enabled) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LinkButton redact(LinkButton value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                Boolean bool = value.enabled;
                LinkButton.ButtonAction buttonAction = value.action;
                value.getClass();
                byteString.getClass();
                return new LinkButton(str, bool, buttonAction, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LinkButton value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LinkButton.ButtonAction.ADAPTER.encodeWithTag(writer, 3, value.action);
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.enabled);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkButton(String str, Boolean bool, ButtonAction buttonAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.enabled = bool;
        this.action = buttonAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkButton)) {
            return false;
        }
        LinkButton linkButton = (LinkButton) obj;
        return Intrinsics.areEqual(unknownFields(), linkButton.unknownFields()) && Intrinsics.areEqual(this.title, linkButton.title) && Intrinsics.areEqual(this.enabled, linkButton.enabled) && this.action == linkButton.action;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ButtonAction buttonAction = this.action;
        int hashCode4 = hashCode3 + (buttonAction != null ? buttonAction.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.enabled = this.enabled;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        ButtonAction buttonAction = this.action;
        if (buttonAction != null) {
            arrayList.add("action=" + buttonAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkButton{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$ButtonAction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUTTON_ACTION_UNSPECIFIED", "BUTTON_ACTION_LINK_DEBIT_CARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ButtonAction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonAction[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final ButtonAction BUTTON_ACTION_LINK_DEBIT_CARD;
        public static final ButtonAction BUTTON_ACTION_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ ButtonAction[] $values() {
            return new ButtonAction[]{BUTTON_ACTION_UNSPECIFIED, BUTTON_ACTION_LINK_DEBIT_CARD};
        }

        static {
            final ButtonAction buttonAction = new ButtonAction("BUTTON_ACTION_UNSPECIFIED", 0, 0);
            BUTTON_ACTION_UNSPECIFIED = buttonAction;
            BUTTON_ACTION_LINK_DEBIT_CARD = new ButtonAction("BUTTON_ACTION_LINK_DEBIT_CARD", 1, 1);
            ButtonAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ButtonAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, buttonAction) { // from class: com.squareup.protos.cash.fiatly.blocker.v1.LinkButton$ButtonAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public LinkButton.ButtonAction fromValue(int value) {
                    return LinkButton.ButtonAction.INSTANCE.fromValue(value);
                }
            };
        }

        private ButtonAction(String str, int i, int i2) {
            this.value = i2;
        }

        public static final ButtonAction fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ButtonAction valueOf(String str) {
            return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
        }

        public static ButtonAction[] values() {
            return (ButtonAction[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$ButtonAction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$ButtonAction;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ButtonAction fromValue(int value) {
                if (value == 0) {
                    return ButtonAction.BUTTON_ACTION_UNSPECIFIED;
                }
                if (value != 1) {
                    return null;
                }
                return ButtonAction.BUTTON_ACTION_LINK_DEBIT_CARD;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton$Builder;", "", "body", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LinkButton build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
