package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
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
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\n\u000b\t\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Builder;", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "button", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action;", "action", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action;", "Companion", "Builder", "Action", "ClientRouteAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActionableButtonDefault extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionableButtonDefault> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Action action;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ButtonDefault#ADAPTER", schemaIndex = 0, tag = 1)
    public final ButtonDefault button;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "<init>", "()V", "button", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "action", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Action action;
        public ButtonDefault button;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActionableButtonDefault build() {
            return new ActionableButtonDefault(this.button, this.action, buildUnknownFields());
        }

        public final Builder button(ButtonDefault button) {
            this.button = button;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActionableButtonDefault.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ActionableButtonDefault$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ActionableButtonDefault decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                ActionableButtonDefault.Action.ClientRouteAction clientRouteAction = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ActionableButtonDefault((ButtonDefault) obj, clientRouteAction, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, reader, obj);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        clientRouteAction = new ActionableButtonDefault.Action.ClientRouteAction((ActionableButtonDefault.ClientRouteAction) ActionableButtonDefault.ClientRouteAction.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ActionableButtonDefault value) {
                writer.getClass();
                value.getClass();
                ButtonDefault.ADAPTER.encodeWithTag(writer, 1, value.button);
                ActionableButtonDefault.Action action = value.action;
                if (action instanceof ActionableButtonDefault.Action.ClientRouteAction) {
                    ActionableButtonDefault.ClientRouteAction.ADAPTER.encodeWithTag(writer, 2, ((ActionableButtonDefault.Action.ClientRouteAction) action).getValue());
                } else if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ActionableButtonDefault value) {
                value.getClass();
                int encodedSizeWithTag = ButtonDefault.ADAPTER.encodedSizeWithTag(1, value.button) + value.unknownFields().getSize$okio();
                ActionableButtonDefault.Action action = value.action;
                if (action instanceof ActionableButtonDefault.Action.ClientRouteAction) {
                    return ActionableButtonDefault.ClientRouteAction.ADAPTER.encodedSizeWithTag(2, ((ActionableButtonDefault.Action.ClientRouteAction) action).getValue()) + encodedSizeWithTag;
                }
                if (action == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ActionableButtonDefault redact(ActionableButtonDefault value) {
                value.getClass();
                ButtonDefault buttonDefault = value.button;
                ButtonDefault buttonDefault2 = buttonDefault != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault) : null;
                ByteString byteString = ByteString.EMPTY;
                ActionableButtonDefault.Action action = value.action;
                byteString.getClass();
                return new ActionableButtonDefault(buttonDefault2, action, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ActionableButtonDefault value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ActionableButtonDefault.Action action = value.action;
                if (action instanceof ActionableButtonDefault.Action.ClientRouteAction) {
                    ActionableButtonDefault.ClientRouteAction.ADAPTER.encodeWithTag(writer, 2, ((ActionableButtonDefault.Action.ClientRouteAction) action).getValue());
                } else if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ButtonDefault.ADAPTER.encodeWithTag(writer, 1, value.button);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionableButtonDefault(ButtonDefault buttonDefault, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button = buttonDefault;
        this.action = action;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionableButtonDefault)) {
            return false;
        }
        ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
        return Intrinsics.areEqual(unknownFields(), actionableButtonDefault.unknownFields()) && Intrinsics.areEqual(this.button, actionableButtonDefault.button) && Intrinsics.areEqual(this.action, actionableButtonDefault.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonDefault buttonDefault = this.button;
        int hashCode2 = (hashCode + (buttonDefault != null ? buttonDefault.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.button = this.button;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonDefault buttonDefault = this.button;
        if (buttonDefault != null) {
            arrayList.add("button=" + buttonDefault);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionableButtonDefault{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction$Builder;", "client_route_url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String client_route_url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;", "<init>", "()V", "client_route_url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String client_route_url;

            @Override // com.squareup.wire.Message.Builder
            public ClientRouteAction build() {
                return new ClientRouteAction(this.client_route_url, buildUnknownFields());
            }

            public final Builder client_route_url(String client_route_url) {
                this.client_route_url = client_route_url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.ActionableButtonDefault$ClientRouteAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ActionableButtonDefault.ClientRouteAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ActionableButtonDefault.ClientRouteAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ActionableButtonDefault.ClientRouteAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.client_route_url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ActionableButtonDefault.ClientRouteAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.client_route_url) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ActionableButtonDefault.ClientRouteAction redact(ActionableButtonDefault.ClientRouteAction value) {
                    value.getClass();
                    return ActionableButtonDefault.ClientRouteAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ActionableButtonDefault.ClientRouteAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.client_route_url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ClientRouteAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ClientRouteAction copy$default(ClientRouteAction clientRouteAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientRouteAction.client_route_url;
            }
            if ((i & 2) != 0) {
                byteString = clientRouteAction.unknownFields();
            }
            return clientRouteAction.copy(str, byteString);
        }

        public final ClientRouteAction copy(String client_route_url, ByteString unknownFields) {
            unknownFields.getClass();
            return new ClientRouteAction(client_route_url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClientRouteAction)) {
                return false;
            }
            ClientRouteAction clientRouteAction = (ClientRouteAction) other;
            return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, clientRouteAction.client_route_url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.client_route_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.client_route_url = this.client_route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.client_route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClientRouteAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClientRouteAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route_url = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action;", "", "<init>", "()V", "ClientRouteAction", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action$ClientRouteAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Action {

        @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.ActionableButtonDefault$ClientRouteAction#ADAPTER", declaredName = "client_route_action", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action$ClientRouteAction;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Action;", "value", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;", "<init>", "(Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$ClientRouteAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClientRouteAction extends Action {
            private final ClientRouteAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientRouteAction(ClientRouteAction clientRouteAction) {
                super(null);
                clientRouteAction.getClass();
                this.value = clientRouteAction;
            }

            public static /* synthetic */ ClientRouteAction copy$default(ClientRouteAction clientRouteAction, ClientRouteAction clientRouteAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    clientRouteAction2 = clientRouteAction.value;
                }
                return clientRouteAction.copy(clientRouteAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final ClientRouteAction getValue() {
                return this.value;
            }

            public final ClientRouteAction copy(ClientRouteAction value) {
                value.getClass();
                return new ClientRouteAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ClientRouteAction) && Intrinsics.areEqual(this.value, ((ClientRouteAction) other).value);
            }

            public final ClientRouteAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ClientRouteAction(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/ActionableButtonDefault;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ActionableButtonDefault build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
