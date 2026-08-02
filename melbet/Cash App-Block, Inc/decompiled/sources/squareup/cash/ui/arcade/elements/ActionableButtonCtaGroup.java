package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup$Builder;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "primary_button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "secondary_button", "tertiary_button", "Lsquareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction;", "direction", "Lsquareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "disclaimer_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "", "show_hairline", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActionableButtonCtaGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionableButtonCtaGroup> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ButtonCtaGroup$Direction#ADAPTER", schemaIndex = 3, tag = 4)
    public final ButtonCtaGroup.Direction direction;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalizedString disclaimer_text;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 0, tag = 1)
    public final ActionableButtonDefault primary_button;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 1, tag = 2)
    public final ActionableButtonDefault secondary_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean show_hairline;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault#ADAPTER", schemaIndex = 2, tag = 3)
    public final ActionableButtonDefault tertiary_button;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;", "<init>", "()V", "primary_button", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "secondary_button", "tertiary_button", "direction", "Lsquareup/cash/ui/arcade/elements/ButtonCtaGroup$Direction;", "disclaimer_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "show_hairline", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public ButtonCtaGroup.Direction direction;
        public LocalizedString disclaimer_text;
        public ActionableButtonDefault primary_button;
        public ActionableButtonDefault secondary_button;
        public Boolean show_hairline;
        public ActionableButtonDefault tertiary_button;

        @Override // com.squareup.wire.Message.Builder
        public ActionableButtonCtaGroup build() {
            return new ActionableButtonCtaGroup(this.primary_button, this.secondary_button, this.tertiary_button, this.direction, this.disclaimer_text, this.show_hairline, buildUnknownFields());
        }

        public final Builder direction(ButtonCtaGroup.Direction direction) {
            this.direction = direction;
            return this;
        }

        public final Builder disclaimer_text(LocalizedString disclaimer_text) {
            this.disclaimer_text = disclaimer_text;
            return this;
        }

        public final Builder primary_button(ActionableButtonDefault primary_button) {
            this.primary_button = primary_button;
            return this;
        }

        public final Builder secondary_button(ActionableButtonDefault secondary_button) {
            this.secondary_button = secondary_button;
            return this;
        }

        public final Builder show_hairline(Boolean show_hairline) {
            this.show_hairline = show_hairline;
            return this;
        }

        public final Builder tertiary_button(ActionableButtonDefault tertiary_button) {
            this.tertiary_button = tertiary_button;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActionableButtonCtaGroup.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ActionableButtonCtaGroup decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ActionableButtonCtaGroup((ActionableButtonDefault) obj, (ActionableButtonDefault) obj2, (ActionableButtonDefault) obj3, (ButtonCtaGroup.Direction) obj4, (LocalizedString) obj5, (Boolean) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            try {
                                obj4 = ButtonCtaGroup.Direction.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActionableButtonCtaGroup value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ActionableButtonDefault.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.primary_button);
                protoAdapter2.encodeWithTag(writer, 2, value.secondary_button);
                protoAdapter2.encodeWithTag(writer, 3, value.tertiary_button);
                ButtonCtaGroup.Direction.ADAPTER.encodeWithTag(writer, 4, value.direction);
                LocalizedString.ADAPTER.encodeWithTag(writer, 5, value.disclaimer_text);
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.show_hairline);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActionableButtonCtaGroup value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ActionableButtonDefault.ADAPTER;
                return ProtoAdapter.BOOL.encodedSizeWithTag(6, value.show_hairline) + LocalizedString.ADAPTER.encodedSizeWithTag(5, value.disclaimer_text) + ButtonCtaGroup.Direction.ADAPTER.encodedSizeWithTag(4, value.direction) + protoAdapter2.encodedSizeWithTag(3, value.tertiary_button) + protoAdapter2.encodedSizeWithTag(2, value.secondary_button) + protoAdapter2.encodedSizeWithTag(1, value.primary_button) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActionableButtonCtaGroup redact(ActionableButtonCtaGroup value) {
                value.getClass();
                ActionableButtonDefault actionableButtonDefault = value.primary_button;
                ActionableButtonDefault actionableButtonDefault2 = actionableButtonDefault != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault) : null;
                ActionableButtonDefault actionableButtonDefault3 = value.secondary_button;
                ActionableButtonDefault actionableButtonDefault4 = actionableButtonDefault3 != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault3) : null;
                ActionableButtonDefault actionableButtonDefault5 = value.tertiary_button;
                ActionableButtonDefault actionableButtonDefault6 = actionableButtonDefault5 != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault5) : null;
                LocalizedString localizedString = value.disclaimer_text;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                ByteString byteString = ByteString.EMPTY;
                ButtonCtaGroup.Direction direction = value.direction;
                Boolean bool = value.show_hairline;
                byteString.getClass();
                return new ActionableButtonCtaGroup(actionableButtonDefault2, actionableButtonDefault4, actionableButtonDefault6, direction, localizedString2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActionableButtonCtaGroup value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.show_hairline);
                LocalizedString.ADAPTER.encodeWithTag(writer, 5, value.disclaimer_text);
                ButtonCtaGroup.Direction.ADAPTER.encodeWithTag(writer, 4, value.direction);
                ProtoAdapter protoAdapter2 = ActionableButtonDefault.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 3, value.tertiary_button);
                protoAdapter2.encodeWithTag(writer, 2, value.secondary_button);
                protoAdapter2.encodeWithTag(writer, 1, value.primary_button);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionableButtonCtaGroup(ActionableButtonDefault actionableButtonDefault, ActionableButtonDefault actionableButtonDefault2, ActionableButtonDefault actionableButtonDefault3, ButtonCtaGroup.Direction direction, LocalizedString localizedString, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_button = actionableButtonDefault;
        this.secondary_button = actionableButtonDefault2;
        this.tertiary_button = actionableButtonDefault3;
        this.direction = direction;
        this.disclaimer_text = localizedString;
        this.show_hairline = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionableButtonCtaGroup)) {
            return false;
        }
        ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj;
        return Intrinsics.areEqual(unknownFields(), actionableButtonCtaGroup.unknownFields()) && Intrinsics.areEqual(this.primary_button, actionableButtonCtaGroup.primary_button) && Intrinsics.areEqual(this.secondary_button, actionableButtonCtaGroup.secondary_button) && Intrinsics.areEqual(this.tertiary_button, actionableButtonCtaGroup.tertiary_button) && this.direction == actionableButtonCtaGroup.direction && Intrinsics.areEqual(this.disclaimer_text, actionableButtonCtaGroup.disclaimer_text) && Intrinsics.areEqual(this.show_hairline, actionableButtonCtaGroup.show_hairline);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActionableButtonDefault actionableButtonDefault = this.primary_button;
        int hashCode2 = (hashCode + (actionableButtonDefault != null ? actionableButtonDefault.hashCode() : 0)) * 37;
        ActionableButtonDefault actionableButtonDefault2 = this.secondary_button;
        int hashCode3 = (hashCode2 + (actionableButtonDefault2 != null ? actionableButtonDefault2.hashCode() : 0)) * 37;
        ActionableButtonDefault actionableButtonDefault3 = this.tertiary_button;
        int hashCode4 = (hashCode3 + (actionableButtonDefault3 != null ? actionableButtonDefault3.hashCode() : 0)) * 37;
        ButtonCtaGroup.Direction direction = this.direction;
        int hashCode5 = (hashCode4 + (direction != null ? direction.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.disclaimer_text;
        int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Boolean bool = this.show_hairline;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.primary_button = this.primary_button;
        builder.secondary_button = this.secondary_button;
        builder.tertiary_button = this.tertiary_button;
        builder.direction = this.direction;
        builder.disclaimer_text = this.disclaimer_text;
        builder.show_hairline = this.show_hairline;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActionableButtonDefault actionableButtonDefault = this.primary_button;
        if (actionableButtonDefault != null) {
            arrayList.add("primary_button=" + actionableButtonDefault);
        }
        ActionableButtonDefault actionableButtonDefault2 = this.secondary_button;
        if (actionableButtonDefault2 != null) {
            arrayList.add("secondary_button=" + actionableButtonDefault2);
        }
        ActionableButtonDefault actionableButtonDefault3 = this.tertiary_button;
        if (actionableButtonDefault3 != null) {
            arrayList.add("tertiary_button=" + actionableButtonDefault3);
        }
        ButtonCtaGroup.Direction direction = this.direction;
        if (direction != null) {
            arrayList.add("direction=" + direction);
        }
        LocalizedString localizedString = this.disclaimer_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("disclaimer_text=", localizedString, arrayList);
        }
        Boolean bool = this.show_hairline;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_hairline=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionableButtonCtaGroup{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ActionableButtonCtaGroup;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ActionableButtonCtaGroup build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
