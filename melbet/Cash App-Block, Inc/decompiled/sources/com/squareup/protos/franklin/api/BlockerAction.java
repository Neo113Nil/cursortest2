package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.BackNavigationPrompt;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u001d\u0010\u0011\u0012\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006,"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$Builder;", "", "text", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localized_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "confirmation_element", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "action", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "Companion", "Builder", "ConfirmationElement", "Action", "ConfirmationDialog", "ConfirmationSheet", "ConditionalConfirmation", "DelayedAction", "EndFlowAction", "MenuAction", "OpenURLAction", "SkipBlockerAction", "SubmitAction", "InternalNavigationAction", "SignOutAction", "ShareFileAction", "ShareTextAction", "ViewFileAction", "DialogAction", "CopyAction", "BackNavigationAction", "EndActivityAction", "EndActivityResult", "ChangeElementTextAction", "ShowOverlayScreenAction", "HapticFeedbackAction", "AdvanceAction", "RetreatAction", "OpenExternalURLAndSubmitAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockerAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockerAction> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 3)
    public final Action action;

    @WireSealedOneof(schemaIndex = 2)
    public final ConfirmationElement confirmation_element;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", redacted = true, schemaIndex = 1, tag = 16)
    public final LocalizableString localized_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String text;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "<init>", "()V", "text", "", "localized_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "confirmation_element", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "action", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Action action;
        public ConfirmationElement confirmation_element;
        public LocalizableString localized_text;
        public String text;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BlockerAction build() {
            return new BlockerAction(this.text, this.localized_text, this.confirmation_element, this.action, buildUnknownFields());
        }

        public final Builder confirmation_element(ConfirmationElement confirmation_element) {
            this.confirmation_element = confirmation_element;
            return this;
        }

        public final Builder localized_text(LocalizableString localized_text) {
            this.localized_text = localized_text;
            return this;
        }

        public final Builder text(String text) {
            this.text = text;
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Builder;", "text", "", "target", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Target", "Companion", "PrimaryActionTarget", "SecondaryActionTarget", "ElementTarget", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ChangeElementTextAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ChangeElementTextAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 1)
        public final Target target;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;", "<init>", "()V", "text", "", "target", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Target target;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public ChangeElementTextAction build() {
                return new ChangeElementTextAction(this.text, this.target, buildUnknownFields());
            }

            public final Builder target(Target target) {
                this.target = target;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ChangeElementTextAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ChangeElementTextAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    BlockerAction.ChangeElementTextAction.Target target = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ChangeElementTextAction((String) obj, target, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            target = new BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget((BlockerAction.ChangeElementTextAction.PrimaryActionTarget) BlockerAction.ChangeElementTextAction.PrimaryActionTarget.ADAPTER.decode(reader));
                        } else if (nextTag == 3) {
                            target = new BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget((BlockerAction.ChangeElementTextAction.SecondaryActionTarget) BlockerAction.ChangeElementTextAction.SecondaryActionTarget.ADAPTER.decode(reader));
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            target = new BlockerAction.ChangeElementTextAction.Target.ElementTarget((BlockerAction.ChangeElementTextAction.ElementTarget) BlockerAction.ChangeElementTextAction.ElementTarget.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ChangeElementTextAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    BlockerAction.ChangeElementTextAction.Target target = value.target;
                    if (target instanceof BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget) {
                        BlockerAction.ChangeElementTextAction.PrimaryActionTarget.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget) target).getValue());
                    } else if (target instanceof BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget) {
                        BlockerAction.ChangeElementTextAction.SecondaryActionTarget.ADAPTER.encodeWithTag(writer, 3, ((BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget) target).getValue());
                    } else if (target instanceof BlockerAction.ChangeElementTextAction.Target.ElementTarget) {
                        BlockerAction.ChangeElementTextAction.ElementTarget.ADAPTER.encodeWithTag(writer, 4, ((BlockerAction.ChangeElementTextAction.Target.ElementTarget) target).getValue());
                    } else if (target != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ChangeElementTextAction value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    BlockerAction.ChangeElementTextAction.Target target = value.target;
                    if (target instanceof BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget) {
                        return BlockerAction.ChangeElementTextAction.PrimaryActionTarget.ADAPTER.encodedSizeWithTag(2, ((BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget) target).getValue()) + encodedSizeWithTag;
                    }
                    if (target instanceof BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget) {
                        return BlockerAction.ChangeElementTextAction.SecondaryActionTarget.ADAPTER.encodedSizeWithTag(3, ((BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget) target).getValue()) + encodedSizeWithTag;
                    }
                    if (target instanceof BlockerAction.ChangeElementTextAction.Target.ElementTarget) {
                        return BlockerAction.ChangeElementTextAction.ElementTarget.ADAPTER.encodedSizeWithTag(4, ((BlockerAction.ChangeElementTextAction.Target.ElementTarget) target).getValue()) + encodedSizeWithTag;
                    }
                    if (target == null) {
                        return encodedSizeWithTag;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ChangeElementTextAction redact(BlockerAction.ChangeElementTextAction value) {
                    value.getClass();
                    return BlockerAction.ChangeElementTextAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ChangeElementTextAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ChangeElementTextAction.Target target = value.target;
                    if (target instanceof BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget) {
                        BlockerAction.ChangeElementTextAction.PrimaryActionTarget.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ChangeElementTextAction.Target.PrimaryActionTarget) target).getValue());
                    } else if (target instanceof BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget) {
                        BlockerAction.ChangeElementTextAction.SecondaryActionTarget.ADAPTER.encodeWithTag(writer, 3, ((BlockerAction.ChangeElementTextAction.Target.SecondaryActionTarget) target).getValue());
                    } else if (target instanceof BlockerAction.ChangeElementTextAction.Target.ElementTarget) {
                        BlockerAction.ChangeElementTextAction.ElementTarget.ADAPTER.encodeWithTag(writer, 4, ((BlockerAction.ChangeElementTextAction.Target.ElementTarget) target).getValue());
                    } else if (target != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ChangeElementTextAction(String str, Target target, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : target, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ChangeElementTextAction copy$default(ChangeElementTextAction changeElementTextAction, String str, Target target, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = changeElementTextAction.text;
            }
            if ((i & 2) != 0) {
                target = changeElementTextAction.target;
            }
            if ((i & 4) != 0) {
                byteString = changeElementTextAction.unknownFields();
            }
            return changeElementTextAction.copy(str, target, byteString);
        }

        public final ChangeElementTextAction copy(String text, Target target, ByteString unknownFields) {
            unknownFields.getClass();
            return new ChangeElementTextAction(text, target, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ChangeElementTextAction)) {
                return false;
            }
            ChangeElementTextAction changeElementTextAction = (ChangeElementTextAction) other;
            return Intrinsics.areEqual(unknownFields(), changeElementTextAction.unknownFields()) && Intrinsics.areEqual(this.text, changeElementTextAction.text) && Intrinsics.areEqual(this.target, changeElementTextAction.target);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Target target = this.target;
            int hashCode3 = hashCode2 + (target != null ? target.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.target = this.target;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            Target target = this.target;
            if (target != null) {
                arrayList.add("target=" + target);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ChangeElementTextAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget$Builder;", "element_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ElementTarget extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ElementTarget> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String element_id;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;", "<init>", "()V", "element_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String element_id;

                @Override // com.squareup.wire.Message.Builder
                public ElementTarget build() {
                    return new ElementTarget(this.element_id, buildUnknownFields());
                }

                public final Builder element_id(String element_id) {
                    this.element_id = element_id;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ElementTarget.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$ElementTarget$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ChangeElementTextAction.ElementTarget decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.ChangeElementTextAction.ElementTarget((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.ChangeElementTextAction.ElementTarget value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.element_id);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.ChangeElementTextAction.ElementTarget value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(1, value.element_id) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ChangeElementTextAction.ElementTarget redact(BlockerAction.ChangeElementTextAction.ElementTarget value) {
                        value.getClass();
                        return BlockerAction.ChangeElementTextAction.ElementTarget.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.ChangeElementTextAction.ElementTarget value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.element_id);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ElementTarget(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ElementTarget copy$default(ElementTarget elementTarget, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = elementTarget.element_id;
                }
                if ((i & 2) != 0) {
                    byteString = elementTarget.unknownFields();
                }
                return elementTarget.copy(str, byteString);
            }

            public final ElementTarget copy(String element_id, ByteString unknownFields) {
                unknownFields.getClass();
                return new ElementTarget(element_id, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ElementTarget)) {
                    return false;
                }
                ElementTarget elementTarget = (ElementTarget) other;
                return Intrinsics.areEqual(unknownFields(), elementTarget.unknownFields()) && Intrinsics.areEqual(this.element_id, elementTarget.element_id);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.element_id;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.element_id = this.element_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.element_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "element_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ElementTarget{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ElementTarget build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ElementTarget() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ElementTarget(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.element_id = str;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PrimaryActionTarget extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PrimaryActionTarget> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public PrimaryActionTarget build() {
                    return new PrimaryActionTarget(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PrimaryActionTarget.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$PrimaryActionTarget$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ChangeElementTextAction.PrimaryActionTarget decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.ChangeElementTextAction.PrimaryActionTarget(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.ChangeElementTextAction.PrimaryActionTarget value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.ChangeElementTextAction.PrimaryActionTarget value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ChangeElementTextAction.PrimaryActionTarget redact(BlockerAction.ChangeElementTextAction.PrimaryActionTarget value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.ChangeElementTextAction.PrimaryActionTarget value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ PrimaryActionTarget(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ PrimaryActionTarget copy$default(PrimaryActionTarget primaryActionTarget, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = primaryActionTarget.unknownFields();
                }
                return primaryActionTarget.copy(byteString);
            }

            public final PrimaryActionTarget copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new PrimaryActionTarget(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof PrimaryActionTarget) && Intrinsics.areEqual(unknownFields(), ((PrimaryActionTarget) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                return "PrimaryActionTarget{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ PrimaryActionTarget build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public PrimaryActionTarget() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimaryActionTarget(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SecondaryActionTarget extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SecondaryActionTarget> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public SecondaryActionTarget build() {
                    return new SecondaryActionTarget(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SecondaryActionTarget.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$SecondaryActionTarget$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ChangeElementTextAction.SecondaryActionTarget decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.ChangeElementTextAction.SecondaryActionTarget(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.ChangeElementTextAction.SecondaryActionTarget value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.ChangeElementTextAction.SecondaryActionTarget value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ChangeElementTextAction.SecondaryActionTarget redact(BlockerAction.ChangeElementTextAction.SecondaryActionTarget value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.ChangeElementTextAction.SecondaryActionTarget value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ SecondaryActionTarget(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ SecondaryActionTarget copy$default(SecondaryActionTarget secondaryActionTarget, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = secondaryActionTarget.unknownFields();
                }
                return secondaryActionTarget.copy(byteString);
            }

            public final SecondaryActionTarget copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new SecondaryActionTarget(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof SecondaryActionTarget) && Intrinsics.areEqual(unknownFields(), ((SecondaryActionTarget) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                return "SecondaryActionTarget{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ SecondaryActionTarget build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public SecondaryActionTarget() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SecondaryActionTarget(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ChangeElementTextAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;", "", "<init>", "()V", "PrimaryActionTarget", "SecondaryActionTarget", "ElementTarget", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target$ElementTarget;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target$PrimaryActionTarget;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target$SecondaryActionTarget;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Target {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$ElementTarget#ADAPTER", declaredName = "element_target", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target$ElementTarget;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$ElementTarget;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ElementTarget extends Target {
                private final ElementTarget value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ElementTarget(ElementTarget elementTarget) {
                    super(null);
                    elementTarget.getClass();
                    this.value = elementTarget;
                }

                public static /* synthetic */ ElementTarget copy$default(ElementTarget elementTarget, ElementTarget elementTarget2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        elementTarget2 = elementTarget.value;
                    }
                    return elementTarget.copy(elementTarget2);
                }

                /* renamed from: component1, reason: from getter */
                public final ElementTarget getValue() {
                    return this.value;
                }

                public final ElementTarget copy(ElementTarget value) {
                    value.getClass();
                    return new ElementTarget(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ElementTarget) && Intrinsics.areEqual(this.value, ((ElementTarget) other).value);
                }

                public final ElementTarget getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ElementTarget(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$PrimaryActionTarget#ADAPTER", declaredName = "primary_action_target", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target$PrimaryActionTarget;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$PrimaryActionTarget;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class PrimaryActionTarget extends Target {
                private final PrimaryActionTarget value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PrimaryActionTarget(PrimaryActionTarget primaryActionTarget) {
                    super(null);
                    primaryActionTarget.getClass();
                    this.value = primaryActionTarget;
                }

                public static /* synthetic */ PrimaryActionTarget copy$default(PrimaryActionTarget primaryActionTarget, PrimaryActionTarget primaryActionTarget2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        primaryActionTarget2 = primaryActionTarget.value;
                    }
                    return primaryActionTarget.copy(primaryActionTarget2);
                }

                /* renamed from: component1, reason: from getter */
                public final PrimaryActionTarget getValue() {
                    return this.value;
                }

                public final PrimaryActionTarget copy(PrimaryActionTarget value) {
                    value.getClass();
                    return new PrimaryActionTarget(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PrimaryActionTarget) && Intrinsics.areEqual(this.value, ((PrimaryActionTarget) other).value);
                }

                public final PrimaryActionTarget getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "PrimaryActionTarget(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction$SecondaryActionTarget#ADAPTER", declaredName = "secondary_action_target", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target$SecondaryActionTarget;", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$Target;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction$SecondaryActionTarget;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class SecondaryActionTarget extends Target {
                private final SecondaryActionTarget value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SecondaryActionTarget(SecondaryActionTarget secondaryActionTarget) {
                    super(null);
                    secondaryActionTarget.getClass();
                    this.value = secondaryActionTarget;
                }

                public static /* synthetic */ SecondaryActionTarget copy$default(SecondaryActionTarget secondaryActionTarget, SecondaryActionTarget secondaryActionTarget2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        secondaryActionTarget2 = secondaryActionTarget.value;
                    }
                    return secondaryActionTarget.copy(secondaryActionTarget2);
                }

                /* renamed from: component1, reason: from getter */
                public final SecondaryActionTarget getValue() {
                    return this.value;
                }

                public final SecondaryActionTarget copy(SecondaryActionTarget value) {
                    value.getClass();
                    return new SecondaryActionTarget(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SecondaryActionTarget) && Intrinsics.areEqual(this.value, ((SecondaryActionTarget) other).value);
                }

                public final SecondaryActionTarget getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "SecondaryActionTarget(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Target(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Target() {
            }
        }

        public ChangeElementTextAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeElementTextAction(String str, Target target, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.target = target;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016J\u0014\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0082\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u0096\u0080\u0004J\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u008d\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010!R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Builder;", "avatar", "Lcom/squareup/protos/franklin/ui/Avatar;", "title", "", "subtitle", "message", "confirm_button_text", "return_button_text", "invert_button_treatment", "", "scheduled_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "scheduled_action_delay_ms", "", "variant", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/Avatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/BlockerAction;Ljava/lang/Long;Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lcom/squareup/protos/franklin/ui/Avatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/BlockerAction;Ljava/lang/Long;Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "Builder", "Companion", "Variant", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ConfirmationSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConfirmationSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Avatar#ADAPTER", schemaIndex = 0, tag = 1)
        public final Avatar avatar;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String confirm_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
        public final Boolean invert_button_treatment;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String message;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String return_button_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 7, tag = 8)
        public final BlockerAction scheduled_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 8, tag = 9)
        public final Long scheduled_action_delay_ms;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ConfirmationSheet$Variant#ADAPTER", schemaIndex = 9, tag = 10)
        public final Variant variant;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "<init>", "()V", "avatar", "Lcom/squareup/protos/franklin/ui/Avatar;", "title", "", "subtitle", "message", "confirm_button_text", "return_button_text", "invert_button_treatment", "", "Ljava/lang/Boolean;", "scheduled_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "scheduled_action_delay_ms", "", "Ljava/lang/Long;", "variant", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Avatar avatar;
            public String confirm_button_text;
            public Boolean invert_button_treatment;
            public String message;
            public String return_button_text;
            public BlockerAction scheduled_action;
            public Long scheduled_action_delay_ms;
            public String subtitle;
            public String title;
            public Variant variant;

            public final Builder avatar(Avatar avatar) {
                this.avatar = avatar;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ConfirmationSheet build() {
                return new ConfirmationSheet(this.avatar, this.title, this.subtitle, this.message, this.confirm_button_text, this.return_button_text, this.invert_button_treatment, this.scheduled_action, this.scheduled_action_delay_ms, this.variant, buildUnknownFields());
            }

            public final Builder confirm_button_text(String confirm_button_text) {
                this.confirm_button_text = confirm_button_text;
                return this;
            }

            public final Builder invert_button_treatment(Boolean invert_button_treatment) {
                this.invert_button_treatment = invert_button_treatment;
                return this;
            }

            public final Builder message(String message) {
                this.message = message;
                return this;
            }

            public final Builder return_button_text(String return_button_text) {
                this.return_button_text = return_button_text;
                return this;
            }

            public final Builder scheduled_action(BlockerAction scheduled_action) {
                this.scheduled_action = scheduled_action;
                return this;
            }

            public final Builder scheduled_action_delay_ms(Long scheduled_action_delay_ms) {
                this.scheduled_action_delay_ms = scheduled_action_delay_ms;
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

            public final Builder variant(Variant variant) {
                this.variant = variant;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmationSheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ConfirmationSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ConfirmationSheet decode(ProtoReader reader) {
                    Object obj;
                    Object obj2;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    Object obj11 = null;
                    Object obj12 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ConfirmationSheet((Avatar) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (Boolean) obj9, (BlockerAction) obj10, (Long) obj11, (BlockerAction.ConfirmationSheet.Variant) obj12, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj3 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, reader, obj3);
                                continue;
                            case 2:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                obj8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                obj9 = ProtoAdapter.BOOL.decode(reader);
                                continue;
                            case 8:
                                obj10 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj10);
                                continue;
                            case 9:
                                obj11 = ProtoAdapter.INT64.decode(reader);
                                continue;
                            case 10:
                                try {
                                    obj12 = BlockerAction.ConfirmationSheet.Variant.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    obj = obj4;
                                    obj2 = obj5;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj4;
                                obj2 = obj5;
                                break;
                        }
                        obj4 = obj;
                        obj5 = obj2;
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ConfirmationSheet value) {
                    writer.getClass();
                    value.getClass();
                    Avatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 4, value.message);
                    protoAdapter2.encodeWithTag(writer, 5, value.confirm_button_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.return_button_text);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.invert_button_treatment);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 8, value.scheduled_action);
                    ProtoAdapter.INT64.encodeWithTag(writer, 9, value.scheduled_action_delay_ms);
                    BlockerAction.ConfirmationSheet.Variant.ADAPTER.encodeWithTag(writer, 10, value.variant);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ConfirmationSheet value) {
                    value.getClass();
                    int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(1, value.avatar) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return BlockerAction.ConfirmationSheet.Variant.ADAPTER.encodedSizeWithTag(10, value.variant) + ProtoAdapter.INT64.encodedSizeWithTag(9, value.scheduled_action_delay_ms) + BlockerAction.ADAPTER.encodedSizeWithTag(8, value.scheduled_action) + ProtoAdapter.BOOL.encodedSizeWithTag(7, value.invert_button_treatment) + protoAdapter2.encodedSizeWithTag(6, value.return_button_text) + protoAdapter2.encodedSizeWithTag(5, value.confirm_button_text) + protoAdapter2.encodedSizeWithTag(4, value.message) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ConfirmationSheet redact(BlockerAction.ConfirmationSheet value) {
                    value.getClass();
                    Avatar avatar = value.avatar;
                    Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
                    BlockerAction blockerAction = value.scheduled_action;
                    return BlockerAction.ConfirmationSheet.copy$default(value, avatar2, null, null, null, null, null, null, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, null, null, ByteString.EMPTY, 894, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ConfirmationSheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ConfirmationSheet.Variant.ADAPTER.encodeWithTag(writer, 10, value.variant);
                    ProtoAdapter.INT64.encodeWithTag(writer, 9, value.scheduled_action_delay_ms);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 8, value.scheduled_action);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.invert_button_treatment);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.return_button_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.confirm_button_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.message);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    Avatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ConfirmationSheet(Avatar avatar, String str, String str2, String str3, String str4, String str5, Boolean bool, BlockerAction blockerAction, Long l, Variant variant, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : avatar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : blockerAction, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : variant, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ConfirmationSheet copy$default(ConfirmationSheet confirmationSheet, Avatar avatar, String str, String str2, String str3, String str4, String str5, Boolean bool, BlockerAction blockerAction, Long l, Variant variant, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                avatar = confirmationSheet.avatar;
            }
            if ((i & 2) != 0) {
                str = confirmationSheet.title;
            }
            if ((i & 4) != 0) {
                str2 = confirmationSheet.subtitle;
            }
            if ((i & 8) != 0) {
                str3 = confirmationSheet.message;
            }
            if ((i & 16) != 0) {
                str4 = confirmationSheet.confirm_button_text;
            }
            if ((i & 32) != 0) {
                str5 = confirmationSheet.return_button_text;
            }
            if ((i & 64) != 0) {
                bool = confirmationSheet.invert_button_treatment;
            }
            if ((i & 128) != 0) {
                blockerAction = confirmationSheet.scheduled_action;
            }
            if ((i & 256) != 0) {
                l = confirmationSheet.scheduled_action_delay_ms;
            }
            if ((i & 512) != 0) {
                variant = confirmationSheet.variant;
            }
            if ((i & 1024) != 0) {
                byteString = confirmationSheet.unknownFields();
            }
            Variant variant2 = variant;
            ByteString byteString2 = byteString;
            BlockerAction blockerAction2 = blockerAction;
            Long l2 = l;
            String str6 = str5;
            Boolean bool2 = bool;
            String str7 = str4;
            String str8 = str2;
            return confirmationSheet.copy(avatar, str, str8, str3, str7, str6, bool2, blockerAction2, l2, variant2, byteString2);
        }

        public final ConfirmationSheet copy(Avatar avatar, String title, String subtitle, String message, String confirm_button_text, String return_button_text, Boolean invert_button_treatment, BlockerAction scheduled_action, Long scheduled_action_delay_ms, Variant variant, ByteString unknownFields) {
            unknownFields.getClass();
            return new ConfirmationSheet(avatar, title, subtitle, message, confirm_button_text, return_button_text, invert_button_treatment, scheduled_action, scheduled_action_delay_ms, variant, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ConfirmationSheet)) {
                return false;
            }
            ConfirmationSheet confirmationSheet = (ConfirmationSheet) other;
            return Intrinsics.areEqual(unknownFields(), confirmationSheet.unknownFields()) && Intrinsics.areEqual(this.avatar, confirmationSheet.avatar) && Intrinsics.areEqual(this.title, confirmationSheet.title) && Intrinsics.areEqual(this.subtitle, confirmationSheet.subtitle) && Intrinsics.areEqual(this.message, confirmationSheet.message) && Intrinsics.areEqual(this.confirm_button_text, confirmationSheet.confirm_button_text) && Intrinsics.areEqual(this.return_button_text, confirmationSheet.return_button_text) && Intrinsics.areEqual(this.invert_button_treatment, confirmationSheet.invert_button_treatment) && Intrinsics.areEqual(this.scheduled_action, confirmationSheet.scheduled_action) && Intrinsics.areEqual(this.scheduled_action_delay_ms, confirmationSheet.scheduled_action_delay_ms) && this.variant == confirmationSheet.variant;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Avatar avatar = this.avatar;
            int hashCode2 = (hashCode + (avatar != null ? avatar.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.message;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.confirm_button_text;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.return_button_text;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Boolean bool = this.invert_button_treatment;
            int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            BlockerAction blockerAction = this.scheduled_action;
            int hashCode9 = (hashCode8 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
            Long l = this.scheduled_action_delay_ms;
            int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Variant variant = this.variant;
            int hashCode11 = hashCode10 + (variant != null ? variant.hashCode() : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.avatar = this.avatar;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.message = this.message;
            builder.confirm_button_text = this.confirm_button_text;
            builder.return_button_text = this.return_button_text;
            builder.invert_button_treatment = this.invert_button_treatment;
            builder.scheduled_action = this.scheduled_action;
            builder.scheduled_action_delay_ms = this.scheduled_action_delay_ms;
            builder.variant = this.variant;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Avatar avatar = this.avatar;
            if (avatar != null) {
                arrayList.add("avatar=" + avatar);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            String str3 = this.message;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "message=", arrayList);
            }
            String str4 = this.confirm_button_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "confirm_button_text=", arrayList);
            }
            String str5 = this.return_button_text;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "return_button_text=", arrayList);
            }
            Boolean bool = this.invert_button_treatment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("invert_button_treatment=", bool, arrayList);
            }
            BlockerAction blockerAction = this.scheduled_action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_action=", blockerAction, arrayList);
            }
            Long l = this.scheduled_action_delay_ms;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_action_delay_ms=", l, arrayList);
            }
            Variant variant = this.variant;
            if (variant != null) {
                arrayList.add("variant=" + variant);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmationSheet{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTROL", "VARIANT_A", "VARIANT_C", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Variant implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Variant CONTROL = new Variant("CONTROL", 0, 1);
            public static final Variant VARIANT_A = new Variant("VARIANT_A", 1, 2);
            public static final Variant VARIANT_C = new Variant("VARIANT_C", 2, 3);

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, VARIANT_A, VARIANT_C};
            }

            static {
                Variant[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Variant.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ConfirmationSheet$Variant$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BlockerAction.ConfirmationSheet.Variant fromValue(int value) {
                        return BlockerAction.ConfirmationSheet.Variant.INSTANCE.fromValue(value);
                    }
                };
            }

            private Variant(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Variant fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Variant;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Variant fromValue(int value) {
                    if (value == 1) {
                        return Variant.CONTROL;
                    }
                    if (value == 2) {
                        return Variant.VARIANT_A;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Variant.VARIANT_C;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ConfirmationSheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ConfirmationSheet() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationSheet(Avatar avatar, String str, String str2, String str3, String str4, String str5, Boolean bool, BlockerAction blockerAction, Long l, Variant variant, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = avatar;
            this.title = str;
            this.subtitle = str2;
            this.message = str3;
            this.confirm_button_text = str4;
            this.return_button_text = str5;
            this.invert_button_treatment = bool;
            this.scheduled_action = blockerAction;
            this.scheduled_action_delay_ms = l;
            this.variant = variant;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Builder;", "result", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Result;", "notify_end_flow_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Result;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Result", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class EndFlowAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EndFlowAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String notify_end_flow_id;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$EndFlowAction$Result#ADAPTER", schemaIndex = 0, tag = 1)
        public final Result result;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;", "<init>", "()V", "result", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Result;", "notify_end_flow_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String notify_end_flow_id;
            public Result result;

            @Override // com.squareup.wire.Message.Builder
            public EndFlowAction build() {
                return new EndFlowAction(this.result, this.notify_end_flow_id, buildUnknownFields());
            }

            public final Builder notify_end_flow_id(String notify_end_flow_id) {
                this.notify_end_flow_id = notify_end_flow_id;
                return this;
            }

            public final Builder result(Result result) {
                this.result = result;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EndFlowAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$EndFlowAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.EndFlowAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.EndFlowAction((BlockerAction.EndFlowAction.Result) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = BlockerAction.EndFlowAction.Result.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.EndFlowAction value) {
                    writer.getClass();
                    value.getClass();
                    BlockerAction.EndFlowAction.Result.ADAPTER.encodeWithTag(writer, 1, value.result);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.notify_end_flow_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.EndFlowAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.notify_end_flow_id) + BlockerAction.EndFlowAction.Result.ADAPTER.encodedSizeWithTag(1, value.result) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.EndFlowAction redact(BlockerAction.EndFlowAction value) {
                    value.getClass();
                    return BlockerAction.EndFlowAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.EndFlowAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.notify_end_flow_id);
                    BlockerAction.EndFlowAction.Result.ADAPTER.encodeWithTag(writer, 1, value.result);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ EndFlowAction(Result result, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ EndFlowAction copy$default(EndFlowAction endFlowAction, Result result, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                result = endFlowAction.result;
            }
            if ((i & 2) != 0) {
                str = endFlowAction.notify_end_flow_id;
            }
            if ((i & 4) != 0) {
                byteString = endFlowAction.unknownFields();
            }
            return endFlowAction.copy(result, str, byteString);
        }

        public final EndFlowAction copy(Result result, String notify_end_flow_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new EndFlowAction(result, notify_end_flow_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EndFlowAction)) {
                return false;
            }
            EndFlowAction endFlowAction = (EndFlowAction) other;
            return Intrinsics.areEqual(unknownFields(), endFlowAction.unknownFields()) && this.result == endFlowAction.result && Intrinsics.areEqual(this.notify_end_flow_id, endFlowAction.notify_end_flow_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Result result = this.result;
            int hashCode2 = (hashCode + (result != null ? result.hashCode() : 0)) * 37;
            String str = this.notify_end_flow_id;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.result = this.result;
            builder.notify_end_flow_id = this.notify_end_flow_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Result result = this.result;
            if (result != null) {
                arrayList.add("result=" + result);
            }
            String str = this.notify_end_flow_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "notify_end_flow_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EndFlowAction{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Result;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "COMPLETE", "CANCELLED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Result implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Result[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Result COMPLETE = new Result("COMPLETE", 0, 1);
            public static final Result CANCELLED = new Result("CANCELLED", 1, 2);

            private static final /* synthetic */ Result[] $values() {
                return new Result[]{COMPLETE, CANCELLED};
            }

            static {
                Result[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Result.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$EndFlowAction$Result$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BlockerAction.EndFlowAction.Result fromValue(int value) {
                        return BlockerAction.EndFlowAction.Result.INSTANCE.fromValue(value);
                    }
                };
            }

            private Result(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Result fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Result$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Result;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Result fromValue(int value) {
                    if (value == 1) {
                        return Result.COMPLETE;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Result.CANCELLED;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EndFlowAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EndFlowAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndFlowAction(Result result, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.result = result;
            this.notify_end_flow_id = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Builder;", "type", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Type", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class HapticFeedbackAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HapticFeedbackAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$HapticFeedbackAction$Type#ADAPTER", schemaIndex = 0, tag = 1)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;", "<init>", "()V", "type", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public HapticFeedbackAction build() {
                return new HapticFeedbackAction(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HapticFeedbackAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$HapticFeedbackAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.HapticFeedbackAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.HapticFeedbackAction((BlockerAction.HapticFeedbackAction.Type) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = BlockerAction.HapticFeedbackAction.Type.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.HapticFeedbackAction value) {
                    writer.getClass();
                    value.getClass();
                    BlockerAction.HapticFeedbackAction.Type.ADAPTER.encodeWithTag(writer, 1, value.type);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.HapticFeedbackAction value) {
                    value.getClass();
                    return BlockerAction.HapticFeedbackAction.Type.ADAPTER.encodedSizeWithTag(1, value.type) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.HapticFeedbackAction redact(BlockerAction.HapticFeedbackAction value) {
                    value.getClass();
                    return BlockerAction.HapticFeedbackAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.HapticFeedbackAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.HapticFeedbackAction.Type.ADAPTER.encodeWithTag(writer, 1, value.type);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ HapticFeedbackAction(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ HapticFeedbackAction copy$default(HapticFeedbackAction hapticFeedbackAction, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = hapticFeedbackAction.type;
            }
            if ((i & 2) != 0) {
                byteString = hapticFeedbackAction.unknownFields();
            }
            return hapticFeedbackAction.copy(type2, byteString);
        }

        public final HapticFeedbackAction copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new HapticFeedbackAction(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HapticFeedbackAction)) {
                return false;
            }
            HapticFeedbackAction hapticFeedbackAction = (HapticFeedbackAction) other;
            return Intrinsics.areEqual(unknownFields(), hapticFeedbackAction.unknownFields()) && this.type == hapticFeedbackAction.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.type;
            int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HapticFeedbackAction{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "ERROR", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Type SUCCESS = new Type("SUCCESS", 0, 1);
            public static final Type ERROR = new Type("ERROR", 1, 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{SUCCESS, ERROR};
            }

            static {
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$HapticFeedbackAction$Type$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BlockerAction.HapticFeedbackAction.Type fromValue(int value) {
                        return BlockerAction.HapticFeedbackAction.Type.INSTANCE.fromValue(value);
                    }
                };
            }

            private Type(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Type fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Type;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Type fromValue(int value) {
                    if (value == 1) {
                        return Type.SUCCESS;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Type.ERROR;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ HapticFeedbackAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public HapticFeedbackAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HapticFeedbackAction(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Builder;", "destination", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination;", "necessity", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Necessity;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination;Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Necessity;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Destination", "Companion", "Support", "ClientRoute", "Necessity", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InternalNavigationAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InternalNavigationAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Destination destination;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$Necessity#ADAPTER", schemaIndex = 1, tag = 3)
        public final Necessity necessity;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;", "<init>", "()V", "destination", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination;", "necessity", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Necessity;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Destination destination;
            public Necessity necessity;

            @Override // com.squareup.wire.Message.Builder
            public InternalNavigationAction build() {
                return new InternalNavigationAction(this.destination, this.necessity, buildUnknownFields());
            }

            public final Builder destination(Destination destination) {
                this.destination = destination;
                return this;
            }

            public final Builder necessity(Necessity necessity) {
                this.necessity = necessity;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InternalNavigationAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.InternalNavigationAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    BlockerAction.InternalNavigationAction.Destination destination = null;
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.InternalNavigationAction(destination, (BlockerAction.InternalNavigationAction.Necessity) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            destination = new BlockerAction.InternalNavigationAction.Destination.Support((BlockerAction.InternalNavigationAction.Support) BlockerAction.InternalNavigationAction.Support.ADAPTER.decode(reader));
                        } else if (nextTag == 2) {
                            destination = new BlockerAction.InternalNavigationAction.Destination.ClientRoute((BlockerAction.InternalNavigationAction.ClientRoute) BlockerAction.InternalNavigationAction.ClientRoute.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj = BlockerAction.InternalNavigationAction.Necessity.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.InternalNavigationAction value) {
                    writer.getClass();
                    value.getClass();
                    BlockerAction.InternalNavigationAction.Necessity.ADAPTER.encodeWithTag(writer, 3, value.necessity);
                    BlockerAction.InternalNavigationAction.Destination destination = value.destination;
                    if (destination instanceof BlockerAction.InternalNavigationAction.Destination.Support) {
                        BlockerAction.InternalNavigationAction.Support.ADAPTER.encodeWithTag(writer, 1, ((BlockerAction.InternalNavigationAction.Destination.Support) destination).getValue());
                    } else if (destination instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute) {
                        BlockerAction.InternalNavigationAction.ClientRoute.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination).getValue());
                    } else if (destination != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.InternalNavigationAction value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    BlockerAction.InternalNavigationAction.Destination destination = value.destination;
                    if (destination instanceof BlockerAction.InternalNavigationAction.Destination.Support) {
                        encodedSizeWithTag = BlockerAction.InternalNavigationAction.Support.ADAPTER.encodedSizeWithTag(1, ((BlockerAction.InternalNavigationAction.Destination.Support) destination).getValue());
                    } else {
                        if (!(destination instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute)) {
                            if (destination != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            return BlockerAction.InternalNavigationAction.Necessity.ADAPTER.encodedSizeWithTag(3, value.necessity) + size$okio;
                        }
                        encodedSizeWithTag = BlockerAction.InternalNavigationAction.ClientRoute.ADAPTER.encodedSizeWithTag(2, ((BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination).getValue());
                    }
                    size$okio += encodedSizeWithTag;
                    return BlockerAction.InternalNavigationAction.Necessity.ADAPTER.encodedSizeWithTag(3, value.necessity) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.InternalNavigationAction redact(BlockerAction.InternalNavigationAction value) {
                    value.getClass();
                    return BlockerAction.InternalNavigationAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.InternalNavigationAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.InternalNavigationAction.Destination destination = value.destination;
                    if (destination instanceof BlockerAction.InternalNavigationAction.Destination.Support) {
                        BlockerAction.InternalNavigationAction.Support.ADAPTER.encodeWithTag(writer, 1, ((BlockerAction.InternalNavigationAction.Destination.Support) destination).getValue());
                    } else if (destination instanceof BlockerAction.InternalNavigationAction.Destination.ClientRoute) {
                        BlockerAction.InternalNavigationAction.ClientRoute.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.InternalNavigationAction.Destination.ClientRoute) destination).getValue());
                    } else if (destination != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    BlockerAction.InternalNavigationAction.Necessity.ADAPTER.encodeWithTag(writer, 3, value.necessity);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InternalNavigationAction(Destination destination, Necessity necessity, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : destination, (i & 2) != 0 ? null : necessity, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InternalNavigationAction copy$default(InternalNavigationAction internalNavigationAction, Destination destination, Necessity necessity, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                destination = internalNavigationAction.destination;
            }
            if ((i & 2) != 0) {
                necessity = internalNavigationAction.necessity;
            }
            if ((i & 4) != 0) {
                byteString = internalNavigationAction.unknownFields();
            }
            return internalNavigationAction.copy(destination, necessity, byteString);
        }

        public final InternalNavigationAction copy(Destination destination, Necessity necessity, ByteString unknownFields) {
            unknownFields.getClass();
            return new InternalNavigationAction(destination, necessity, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InternalNavigationAction)) {
                return false;
            }
            InternalNavigationAction internalNavigationAction = (InternalNavigationAction) other;
            return Intrinsics.areEqual(unknownFields(), internalNavigationAction.unknownFields()) && Intrinsics.areEqual(this.destination, internalNavigationAction.destination) && this.necessity == internalNavigationAction.necessity;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Destination destination = this.destination;
            int hashCode2 = (hashCode + (destination != null ? destination.hashCode() : 0)) * 37;
            Necessity necessity = this.necessity;
            int hashCode3 = hashCode2 + (necessity != null ? necessity.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.destination = this.destination;
            builder.necessity = this.necessity;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Destination destination = this.destination;
            if (destination != null) {
                arrayList.add("destination=" + destination);
            }
            Necessity necessity = this.necessity;
            if (necessity != null) {
                arrayList.add("necessity=" + necessity);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InternalNavigationAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute$Builder;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ClientRoute extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ClientRoute> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
            public final String url;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;", "<init>", "()V", "url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String url;

                @Override // com.squareup.wire.Message.Builder
                public ClientRoute build() {
                    return new ClientRoute(this.url, buildUnknownFields());
                }

                public final Builder url(String url) {
                    this.url = url;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientRoute.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$ClientRoute$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.InternalNavigationAction.ClientRoute decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.InternalNavigationAction.ClientRoute((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.InternalNavigationAction.ClientRoute value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.InternalNavigationAction.ClientRoute value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(1, value.url) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.InternalNavigationAction.ClientRoute redact(BlockerAction.InternalNavigationAction.ClientRoute value) {
                        value.getClass();
                        return value.copy(null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.InternalNavigationAction.ClientRoute value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ClientRoute(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ClientRoute copy$default(ClientRoute clientRoute, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = clientRoute.url;
                }
                if ((i & 2) != 0) {
                    byteString = clientRoute.unknownFields();
                }
                return clientRoute.copy(str, byteString);
            }

            public final ClientRoute copy(String url, ByteString unknownFields) {
                unknownFields.getClass();
                return new ClientRoute(url, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ClientRoute)) {
                    return false;
                }
                ClientRoute clientRoute = (ClientRoute) other;
                return Intrinsics.areEqual(unknownFields(), clientRoute.unknownFields()) && Intrinsics.areEqual(this.url, clientRoute.url);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.url;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.url = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.url != null) {
                    arrayList.add("url=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRoute{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ClientRoute build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ClientRoute() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClientRoute(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.url = str;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Necessity;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MANDATORY", "PREFERRED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Necessity implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Necessity[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Necessity MANDATORY = new Necessity("MANDATORY", 0, 1);
            public static final Necessity PREFERRED = new Necessity("PREFERRED", 1, 2);
            private final int value;

            private static final /* synthetic */ Necessity[] $values() {
                return new Necessity[]{MANDATORY, PREFERRED};
            }

            static {
                Necessity[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Necessity.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$Necessity$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BlockerAction.InternalNavigationAction.Necessity fromValue(int value) {
                        return BlockerAction.InternalNavigationAction.Necessity.INSTANCE.fromValue(value);
                    }
                };
            }

            private Necessity(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Necessity fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Necessity valueOf(String str) {
                return (Necessity) Enum.valueOf(Necessity.class, str);
            }

            public static Necessity[] values() {
                return (Necessity[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Necessity$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Necessity;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Necessity fromValue(int value) {
                    if (value == 1) {
                        return Necessity.MANDATORY;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Necessity.PREFERRED;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support$Builder;", "support_flow_node", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Support extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Support> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String support_flow_node;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;", "<init>", "()V", "support_flow_node", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String support_flow_node;

                @Override // com.squareup.wire.Message.Builder
                public Support build() {
                    return new Support(this.support_flow_node, buildUnknownFields());
                }

                public final Builder support_flow_node(String support_flow_node) {
                    this.support_flow_node = support_flow_node;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Support.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$Support$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.InternalNavigationAction.Support decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.InternalNavigationAction.Support((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.InternalNavigationAction.Support value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.support_flow_node);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.InternalNavigationAction.Support value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(1, value.support_flow_node) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.InternalNavigationAction.Support redact(BlockerAction.InternalNavigationAction.Support value) {
                        value.getClass();
                        return BlockerAction.InternalNavigationAction.Support.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.InternalNavigationAction.Support value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.support_flow_node);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Support(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Support copy$default(Support support, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = support.support_flow_node;
                }
                if ((i & 2) != 0) {
                    byteString = support.unknownFields();
                }
                return support.copy(str, byteString);
            }

            public final Support copy(String support_flow_node, ByteString unknownFields) {
                unknownFields.getClass();
                return new Support(support_flow_node, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Support)) {
                    return false;
                }
                Support support = (Support) other;
                return Intrinsics.areEqual(unknownFields(), support.unknownFields()) && Intrinsics.areEqual(this.support_flow_node, support.support_flow_node);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.support_flow_node;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.support_flow_node = this.support_flow_node;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.support_flow_node;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "support_flow_node=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Support{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Support build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Support() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Support(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.support_flow_node = str;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InternalNavigationAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination;", "", "<init>", "()V", "Support", "ClientRoute", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination$ClientRoute;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination$Support;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Destination {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$ClientRoute#ADAPTER", declaredName = "client_route", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination$ClientRoute;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$ClientRoute;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ClientRoute extends Destination {
                private final ClientRoute value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ClientRoute(ClientRoute clientRoute) {
                    super(null);
                    clientRoute.getClass();
                    this.value = clientRoute;
                }

                public static /* synthetic */ ClientRoute copy$default(ClientRoute clientRoute, ClientRoute clientRoute2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        clientRoute2 = clientRoute.value;
                    }
                    return clientRoute.copy(clientRoute2);
                }

                /* renamed from: component1, reason: from getter */
                public final ClientRoute getValue() {
                    return this.value;
                }

                public final ClientRoute copy(ClientRoute value) {
                    value.getClass();
                    return new ClientRoute(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ClientRoute) && Intrinsics.areEqual(this.value, ((ClientRoute) other).value);
                }

                public final ClientRoute getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ClientRoute(value=" + this.value + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination$Support;", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Destination;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction$Support;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction$Support#ADAPTER", declaredName = "support", tag = 1)
            @Deprecated
            public static final /* data */ class Support extends Destination {
                private final Support value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Support(Support support) {
                    super(null);
                    support.getClass();
                    this.value = support;
                }

                public static /* synthetic */ Support copy$default(Support support, Support support2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        support2 = support.value;
                    }
                    return support.copy(support2);
                }

                /* renamed from: component1, reason: from getter */
                public final Support getValue() {
                    return this.value;
                }

                public final Support copy(Support value) {
                    value.getClass();
                    return new Support(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Support) && Intrinsics.areEqual(this.value, ((Support) other).value);
                }

                public final Support getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Support(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Destination(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Destination() {
            }
        }

        public InternalNavigationAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalNavigationAction(Destination destination, Necessity necessity, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.destination = destination;
            this.necessity = necessity;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0018\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Builder;", "url", "", "end_flow", "", "behavior", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "Builder", "Companion", "Behavior", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class OpenURLAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenURLAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$OpenURLAction$Behavior#ADAPTER", schemaIndex = 2, tag = 3)
        public final Behavior behavior;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
        public final Boolean end_flow;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String url;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "<init>", "()V", "url", "", "end_flow", "", "Ljava/lang/Boolean;", "behavior", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Behavior behavior;
            public Boolean end_flow;
            public String url;

            public final Builder behavior(Behavior behavior) {
                this.behavior = behavior;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public OpenURLAction build() {
                return new OpenURLAction(this.url, this.end_flow, this.behavior, buildUnknownFields());
            }

            public final Builder end_flow(Boolean end_flow) {
                this.end_flow = end_flow;
                return this;
            }

            public final Builder url(String url) {
                this.url = url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenURLAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$OpenURLAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.OpenURLAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.OpenURLAction((String) obj, (Boolean) obj2, (BlockerAction.OpenURLAction.Behavior) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = BlockerAction.OpenURLAction.Behavior.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.OpenURLAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.end_flow);
                    BlockerAction.OpenURLAction.Behavior.ADAPTER.encodeWithTag(writer, 3, value.behavior);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.OpenURLAction value) {
                    value.getClass();
                    return BlockerAction.OpenURLAction.Behavior.ADAPTER.encodedSizeWithTag(3, value.behavior) + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.end_flow) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.url) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.OpenURLAction redact(BlockerAction.OpenURLAction value) {
                    value.getClass();
                    return BlockerAction.OpenURLAction.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.OpenURLAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.OpenURLAction.Behavior.ADAPTER.encodeWithTag(writer, 3, value.behavior);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.end_flow);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ OpenURLAction(String str, Boolean bool, Behavior behavior, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : behavior, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ OpenURLAction copy$default(OpenURLAction openURLAction, String str, Boolean bool, Behavior behavior, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openURLAction.url;
            }
            if ((i & 2) != 0) {
                bool = openURLAction.end_flow;
            }
            if ((i & 4) != 0) {
                behavior = openURLAction.behavior;
            }
            if ((i & 8) != 0) {
                byteString = openURLAction.unknownFields();
            }
            return openURLAction.copy(str, bool, behavior, byteString);
        }

        public final OpenURLAction copy(String url, Boolean end_flow, Behavior behavior, ByteString unknownFields) {
            unknownFields.getClass();
            return new OpenURLAction(url, end_flow, behavior, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OpenURLAction)) {
                return false;
            }
            OpenURLAction openURLAction = (OpenURLAction) other;
            return Intrinsics.areEqual(unknownFields(), openURLAction.unknownFields()) && Intrinsics.areEqual(this.url, openURLAction.url) && Intrinsics.areEqual(this.end_flow, openURLAction.end_flow) && this.behavior == openURLAction.behavior;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.end_flow;
            int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Behavior behavior = this.behavior;
            int hashCode4 = hashCode3 + (behavior != null ? behavior.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.url = this.url;
            builder.end_flow = this.end_flow;
            builder.behavior = this.behavior;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            Boolean bool = this.end_flow;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("end_flow=", bool, arrayList);
            }
            Behavior behavior = this.behavior;
            if (behavior != null) {
                arrayList.add("behavior=" + behavior);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenURLAction{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "REDIRECT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Behavior implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Behavior[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Behavior DEFAULT;
            public static final Behavior REDIRECT;
            private final int value;

            private static final /* synthetic */ Behavior[] $values() {
                return new Behavior[]{DEFAULT, REDIRECT};
            }

            static {
                final Behavior behavior = new Behavior("DEFAULT", 0, 0);
                DEFAULT = behavior;
                REDIRECT = new Behavior("REDIRECT", 1, 1);
                Behavior[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Behavior.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, behavior) { // from class: com.squareup.protos.franklin.api.BlockerAction$OpenURLAction$Behavior$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BlockerAction.OpenURLAction.Behavior fromValue(int value) {
                        return BlockerAction.OpenURLAction.Behavior.INSTANCE.fromValue(value);
                    }
                };
            }

            private Behavior(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Behavior fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Behavior valueOf(String str) {
                return (Behavior) Enum.valueOf(Behavior.class, str);
            }

            public static Behavior[] values() {
                return (Behavior[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Behavior;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Behavior fromValue(int value) {
                    if (value == 0) {
                        return Behavior.DEFAULT;
                    }
                    if (value != 1) {
                        return null;
                    }
                    return Behavior.REDIRECT;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OpenURLAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public OpenURLAction() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenURLAction(String str, Boolean bool, Behavior behavior, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
            this.end_flow = bool;
            this.behavior = behavior;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cBQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016JP\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$Builder;", "file_url", "", "title", "extension", "loading_text", "options", "", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "EmailOption", "ViewOption", "ShareOption", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ShareFileAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShareFileAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 4)
        public final String extension;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String file_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 5)
        public final String loading_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$ShareOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 2)
        public final List<ShareOption> options;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 3)
        public final String title;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;", "<init>", "()V", "file_url", "", "title", "extension", "loading_text", "options", "", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String extension;
            public String file_url;
            public String loading_text;
            public List<ShareOption> options = EmptyList.INSTANCE;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public ShareFileAction build() {
                return new ShareFileAction(this.file_url, this.title, this.extension, this.loading_text, this.options, buildUnknownFields());
            }

            public final Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            public final Builder file_url(String file_url) {
                this.file_url = file_url;
                return this;
            }

            public final Builder loading_text(String loading_text) {
                this.loading_text = loading_text;
                return this;
            }

            public final Builder options(List<ShareOption> options) {
                options.getClass();
                TransactorKt.checkElementsNotNull(options);
                this.options = options;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShareFileAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ShareFileAction decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ShareFileAction((String) obj, (String) obj2, (String) obj3, (String) obj4, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            m.add(BlockerAction.ShareFileAction.ShareOption.ADAPTER.decode(reader));
                        } else if (nextTag == 3) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ShareFileAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.file_url);
                    protoAdapter2.encodeWithTag(writer, 3, value.title);
                    protoAdapter2.encodeWithTag(writer, 4, value.extension);
                    protoAdapter2.encodeWithTag(writer, 5, value.loading_text);
                    BlockerAction.ShareFileAction.ShareOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ShareFileAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return BlockerAction.ShareFileAction.ShareOption.ADAPTER.asRepeated().encodedSizeWithTag(2, value.options) + protoAdapter2.encodedSizeWithTag(5, value.loading_text) + protoAdapter2.encodedSizeWithTag(4, value.extension) + protoAdapter2.encodedSizeWithTag(3, value.title) + protoAdapter2.encodedSizeWithTag(1, value.file_url) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ShareFileAction redact(BlockerAction.ShareFileAction value) {
                    value.getClass();
                    return BlockerAction.ShareFileAction.copy$default(value, null, null, null, null, TransactorKt.m1169redactElements(value.options, BlockerAction.ShareFileAction.ShareOption.ADAPTER), ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ShareFileAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ShareFileAction.ShareOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.options);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.loading_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.extension);
                    protoAdapter2.encodeWithTag(writer, 3, value.title);
                    protoAdapter2.encodeWithTag(writer, 1, value.file_url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public ShareFileAction(String str, String str2, String str3, String str4, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? EmptyList.INSTANCE : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShareFileAction copy$default(ShareFileAction shareFileAction, String str, String str2, String str3, String str4, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareFileAction.file_url;
            }
            if ((i & 2) != 0) {
                str2 = shareFileAction.title;
            }
            if ((i & 4) != 0) {
                str3 = shareFileAction.extension;
            }
            if ((i & 8) != 0) {
                str4 = shareFileAction.loading_text;
            }
            if ((i & 16) != 0) {
                list = shareFileAction.options;
            }
            if ((i & 32) != 0) {
                byteString = shareFileAction.unknownFields();
            }
            List list2 = list;
            ByteString byteString2 = byteString;
            return shareFileAction.copy(str, str2, str3, str4, list2, byteString2);
        }

        public final ShareFileAction copy(String file_url, String title, String extension, String loading_text, List<ShareOption> options, ByteString unknownFields) {
            options.getClass();
            unknownFields.getClass();
            return new ShareFileAction(file_url, title, extension, loading_text, options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShareFileAction)) {
                return false;
            }
            ShareFileAction shareFileAction = (ShareFileAction) other;
            return Intrinsics.areEqual(unknownFields(), shareFileAction.unknownFields()) && Intrinsics.areEqual(this.file_url, shareFileAction.file_url) && Intrinsics.areEqual(this.title, shareFileAction.title) && Intrinsics.areEqual(this.extension, shareFileAction.extension) && Intrinsics.areEqual(this.loading_text, shareFileAction.loading_text) && Intrinsics.areEqual(this.options, shareFileAction.options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.file_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.extension;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.loading_text;
            int hashCode5 = this.options.hashCode() + ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.file_url = this.file_url;
            builder.title = this.title;
            builder.extension = this.extension;
            builder.loading_text = this.loading_text;
            builder.options = this.options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.file_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_url=", arrayList);
            }
            String str2 = this.title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
            }
            String str3 = this.extension;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "extension=", arrayList);
            }
            String str4 = this.loading_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "loading_text=", arrayList);
            }
            if (!this.options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShareFileAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption$Builder;", "subject", "", "body", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class EmailOption extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EmailOption> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
            public final String body;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
            public final String subject;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;", "<init>", "()V", "subject", "", "body", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String body;
                public String subject;

                public final Builder body(String body) {
                    this.body = body;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public EmailOption build() {
                    return new EmailOption(this.subject, this.body, buildUnknownFields());
                }

                public final Builder subject(String subject) {
                    this.subject = subject;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EmailOption.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$EmailOption$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ShareFileAction.EmailOption decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.ShareFileAction.EmailOption((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.ShareFileAction.EmailOption value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.subject);
                        protoAdapter2.encodeWithTag(writer, 2, value.body);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.ShareFileAction.EmailOption value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.subject) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ShareFileAction.EmailOption redact(BlockerAction.ShareFileAction.EmailOption value) {
                        value.getClass();
                        return value.copy(null, null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.ShareFileAction.EmailOption value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.body);
                        protoAdapter2.encodeWithTag(writer, 1, value.subject);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ EmailOption(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ EmailOption copy$default(EmailOption emailOption, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = emailOption.subject;
                }
                if ((i & 2) != 0) {
                    str2 = emailOption.body;
                }
                if ((i & 4) != 0) {
                    byteString = emailOption.unknownFields();
                }
                return emailOption.copy(str, str2, byteString);
            }

            public final EmailOption copy(String subject, String body, ByteString unknownFields) {
                unknownFields.getClass();
                return new EmailOption(subject, body, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EmailOption)) {
                    return false;
                }
                EmailOption emailOption = (EmailOption) other;
                return Intrinsics.areEqual(unknownFields(), emailOption.unknownFields()) && Intrinsics.areEqual(this.subject, emailOption.subject) && Intrinsics.areEqual(this.body, emailOption.body);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.subject;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.body;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.subject = this.subject;
                builder.body = this.body;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.subject != null) {
                    arrayList.add("subject=██");
                }
                if (this.body != null) {
                    arrayList.add("body=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EmailOption{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ EmailOption build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public EmailOption() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmailOption(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.subject = str;
                this.body = str2;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Builder;", "option", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Option", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ShareOption extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ShareOption> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireSealedOneof(schemaIndex = 0)
            public final Option option;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption;", "<init>", "()V", "option", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Option option;

                @Override // com.squareup.wire.Message.Builder
                public ShareOption build() {
                    return new ShareOption(this.option, buildUnknownFields());
                }

                public final Builder option(Option option) {
                    this.option = option;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShareOption.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$ShareOption$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ShareFileAction.ShareOption decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        BlockerAction.ShareFileAction.ShareOption.Option option = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.ShareFileAction.ShareOption(option, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                option = new BlockerAction.ShareFileAction.ShareOption.Option.Email((BlockerAction.ShareFileAction.EmailOption) BlockerAction.ShareFileAction.EmailOption.ADAPTER.decode(reader));
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                option = new BlockerAction.ShareFileAction.ShareOption.Option.View((BlockerAction.ShareFileAction.ViewOption) BlockerAction.ShareFileAction.ViewOption.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.ShareFileAction.ShareOption value) {
                        writer.getClass();
                        value.getClass();
                        BlockerAction.ShareFileAction.ShareOption.Option option = value.option;
                        if (option instanceof BlockerAction.ShareFileAction.ShareOption.Option.Email) {
                            BlockerAction.ShareFileAction.EmailOption.ADAPTER.encodeWithTag(writer, 1, ((BlockerAction.ShareFileAction.ShareOption.Option.Email) option).getValue());
                        } else if (option instanceof BlockerAction.ShareFileAction.ShareOption.Option.View) {
                            BlockerAction.ShareFileAction.ViewOption.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ShareFileAction.ShareOption.Option.View) option).getValue());
                        } else if (option != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.ShareFileAction.ShareOption value) {
                        int encodedSizeWithTag;
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        BlockerAction.ShareFileAction.ShareOption.Option option = value.option;
                        if (option instanceof BlockerAction.ShareFileAction.ShareOption.Option.Email) {
                            encodedSizeWithTag = BlockerAction.ShareFileAction.EmailOption.ADAPTER.encodedSizeWithTag(1, ((BlockerAction.ShareFileAction.ShareOption.Option.Email) option).getValue());
                        } else {
                            if (!(option instanceof BlockerAction.ShareFileAction.ShareOption.Option.View)) {
                                if (option == null) {
                                    return size$okio;
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            encodedSizeWithTag = BlockerAction.ShareFileAction.ViewOption.ADAPTER.encodedSizeWithTag(2, ((BlockerAction.ShareFileAction.ShareOption.Option.View) option).getValue());
                        }
                        return encodedSizeWithTag + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ShareFileAction.ShareOption redact(BlockerAction.ShareFileAction.ShareOption value) {
                        value.getClass();
                        return BlockerAction.ShareFileAction.ShareOption.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.ShareFileAction.ShareOption value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        BlockerAction.ShareFileAction.ShareOption.Option option = value.option;
                        if (option instanceof BlockerAction.ShareFileAction.ShareOption.Option.Email) {
                            BlockerAction.ShareFileAction.EmailOption.ADAPTER.encodeWithTag(writer, 1, ((BlockerAction.ShareFileAction.ShareOption.Option.Email) option).getValue());
                        } else if (option instanceof BlockerAction.ShareFileAction.ShareOption.Option.View) {
                            BlockerAction.ShareFileAction.ViewOption.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ShareFileAction.ShareOption.Option.View) option).getValue());
                        } else {
                            if (option == null) {
                                return;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        }
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ShareOption(Option option, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : option, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ShareOption copy$default(ShareOption shareOption, Option option, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    option = shareOption.option;
                }
                if ((i & 2) != 0) {
                    byteString = shareOption.unknownFields();
                }
                return shareOption.copy(option, byteString);
            }

            public final ShareOption copy(Option option, ByteString unknownFields) {
                unknownFields.getClass();
                return new ShareOption(option, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ShareOption)) {
                    return false;
                }
                ShareOption shareOption = (ShareOption) other;
                return Intrinsics.areEqual(unknownFields(), shareOption.unknownFields()) && Intrinsics.areEqual(this.option, shareOption.option);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Option option = this.option;
                int hashCode2 = hashCode + (option != null ? option.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.option = this.option;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Option option = this.option;
                if (option != null) {
                    arrayList.add("option=" + option);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ShareOption{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ShareOption build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option;", "", "<init>", "()V", "Email", "View", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option$Email;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option$View;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class Option {

                @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$EmailOption#ADAPTER", declaredName = "email", tag = 1)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option$Email;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$EmailOption;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class Email extends Option {
                    private final EmailOption value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Email(EmailOption emailOption) {
                        super(null);
                        emailOption.getClass();
                        this.value = emailOption;
                    }

                    public static /* synthetic */ Email copy$default(Email email, EmailOption emailOption, int i, Object obj) {
                        if ((i & 1) != 0) {
                            emailOption = email.value;
                        }
                        return email.copy(emailOption);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final EmailOption getValue() {
                        return this.value;
                    }

                    public final Email copy(EmailOption value) {
                        value.getClass();
                        return new Email(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Email) && Intrinsics.areEqual(this.value, ((Email) other).value);
                    }

                    public final EmailOption getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Email(value=" + this.value + ")";
                    }
                }

                @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$ViewOption#ADAPTER", declaredName = "view", tag = 2)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option$View;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ShareOption$Option;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class View extends Option {
                    private final ViewOption value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public View(ViewOption viewOption) {
                        super(null);
                        viewOption.getClass();
                        this.value = viewOption;
                    }

                    public static /* synthetic */ View copy$default(View view, ViewOption viewOption, int i, Object obj) {
                        if ((i & 1) != 0) {
                            viewOption = view.value;
                        }
                        return view.copy(viewOption);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ViewOption getValue() {
                        return this.value;
                    }

                    public final View copy(ViewOption value) {
                        value.getClass();
                        return new View(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof View) && Intrinsics.areEqual(this.value, ((View) other).value);
                    }

                    public final ViewOption getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "View(value=" + this.value + ")";
                    }
                }

                public /* synthetic */ Option(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Option() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ShareOption() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareOption(Option option, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.option = option;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ViewOption extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ViewOption> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public ViewOption build() {
                    return new ViewOption(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ViewOption.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ShareFileAction$ViewOption$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ShareFileAction.ViewOption decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.ShareFileAction.ViewOption(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.ShareFileAction.ViewOption value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.ShareFileAction.ViewOption value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.ShareFileAction.ViewOption redact(BlockerAction.ShareFileAction.ViewOption value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.ShareFileAction.ViewOption value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ViewOption(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ViewOption copy$default(ViewOption viewOption, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = viewOption.unknownFields();
                }
                return viewOption.copy(byteString);
            }

            public final ViewOption copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new ViewOption(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof ViewOption) && Intrinsics.areEqual(unknownFields(), ((ViewOption) other).unknownFields());
            }

            public int hashCode() {
                return unknownFields().hashCode();
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                return "ViewOption{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$ViewOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ViewOption build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ViewOption() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewOption(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShareFileAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ShareFileAction() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareFileAction(String str, String str2, String str3, String str4, List<ShareOption> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.file_url = str;
            this.title = str2;
            this.extension = str3;
            this.loading_text = str4;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$Builder;", "id", "", "loading_label", "direction", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "AnimationDirection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SubmitAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SubmitAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$SubmitAction$AnimationDirection#ADAPTER", schemaIndex = 2, tag = 3)
        public final AnimationDirection direction;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String loading_label;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "<init>", "()V", "id", "", "loading_label", "direction", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AnimationDirection direction;
            public String id;
            public String loading_label;

            @Override // com.squareup.wire.Message.Builder
            public SubmitAction build() {
                return new SubmitAction(this.id, this.loading_label, this.direction, buildUnknownFields());
            }

            public final Builder direction(AnimationDirection direction) {
                this.direction = direction;
                return this;
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder loading_label(String loading_label) {
                this.loading_label = loading_label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$SubmitAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.SubmitAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.SubmitAction((String) obj, (String) obj2, (BlockerAction.SubmitAction.AnimationDirection) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = BlockerAction.SubmitAction.AnimationDirection.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.SubmitAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.id);
                    protoAdapter2.encodeWithTag(writer, 2, value.loading_label);
                    BlockerAction.SubmitAction.AnimationDirection.ADAPTER.encodeWithTag(writer, 3, value.direction);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.SubmitAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return BlockerAction.SubmitAction.AnimationDirection.ADAPTER.encodedSizeWithTag(3, value.direction) + protoAdapter2.encodedSizeWithTag(2, value.loading_label) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.SubmitAction redact(BlockerAction.SubmitAction value) {
                    value.getClass();
                    return BlockerAction.SubmitAction.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.SubmitAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.SubmitAction.AnimationDirection.ADAPTER.encodeWithTag(writer, 3, value.direction);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.loading_label);
                    protoAdapter2.encodeWithTag(writer, 1, value.id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SubmitAction(String str, String str2, AnimationDirection animationDirection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : animationDirection, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SubmitAction copy$default(SubmitAction submitAction, String str, String str2, AnimationDirection animationDirection, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = submitAction.id;
            }
            if ((i & 2) != 0) {
                str2 = submitAction.loading_label;
            }
            if ((i & 4) != 0) {
                animationDirection = submitAction.direction;
            }
            if ((i & 8) != 0) {
                byteString = submitAction.unknownFields();
            }
            return submitAction.copy(str, str2, animationDirection, byteString);
        }

        public final SubmitAction copy(String id, String loading_label, AnimationDirection direction, ByteString unknownFields) {
            unknownFields.getClass();
            return new SubmitAction(id, loading_label, direction, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SubmitAction)) {
                return false;
            }
            SubmitAction submitAction = (SubmitAction) other;
            return Intrinsics.areEqual(unknownFields(), submitAction.unknownFields()) && Intrinsics.areEqual(this.id, submitAction.id) && Intrinsics.areEqual(this.loading_label, submitAction.loading_label) && this.direction == submitAction.direction;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.loading_label;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            AnimationDirection animationDirection = this.direction;
            int hashCode4 = hashCode3 + (animationDirection != null ? animationDirection.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.loading_label = this.loading_label;
            builder.direction = this.direction;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            String str2 = this.loading_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "loading_label=", arrayList);
            }
            AnimationDirection animationDirection = this.direction;
            if (animationDirection != null) {
                arrayList.add("direction=" + animationDirection);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitAction{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FORWARD", "BACKWARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$SubmitAction$AnimationDirection$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BlockerAction.SubmitAction.AnimationDirection fromValue(int value) {
                        return BlockerAction.SubmitAction.AnimationDirection.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SubmitAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SubmitAction() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitAction(String str, String str2, AnimationDirection animationDirection, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.loading_label = str2;
            this.direction = animationDirection;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BlockerAction.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BlockerAction decode(ProtoReader reader) {
                BlockerAction.ConfirmationElement confirmationDialog;
                BlockerAction.Action endFlowAction;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                BlockerAction.ConfirmationElement confirmationElement = null;
                BlockerAction.Action action = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BlockerAction((String) obj, (LocalizableString) obj2, confirmationElement, action, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            confirmationDialog = new BlockerAction.ConfirmationElement.ConfirmationDialog((BlockerAction.ConfirmationDialog) BlockerAction.ConfirmationDialog.ADAPTER.decode(reader));
                            confirmationElement = confirmationDialog;
                            break;
                        case 3:
                            endFlowAction = new BlockerAction.Action.EndFlowAction((BlockerAction.EndFlowAction) BlockerAction.EndFlowAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 4:
                            endFlowAction = new BlockerAction.Action.MenuAction((BlockerAction.MenuAction) BlockerAction.MenuAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 5:
                            endFlowAction = new BlockerAction.Action.OpenUrlAction((BlockerAction.OpenURLAction) BlockerAction.OpenURLAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 6:
                            endFlowAction = new BlockerAction.Action.SkipBlockerAction((BlockerAction.SkipBlockerAction) BlockerAction.SkipBlockerAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 7:
                            endFlowAction = new BlockerAction.Action.SubmitAction((BlockerAction.SubmitAction) BlockerAction.SubmitAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 8:
                            endFlowAction = new BlockerAction.Action.InternalNavigationAction((BlockerAction.InternalNavigationAction) BlockerAction.InternalNavigationAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 9:
                            endFlowAction = new BlockerAction.Action.SignOutAction((BlockerAction.SignOutAction) BlockerAction.SignOutAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 10:
                            endFlowAction = new BlockerAction.Action.ShareAction((BlockerAction.ShareFileAction) BlockerAction.ShareFileAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 11:
                            endFlowAction = new BlockerAction.Action.ViewAction((BlockerAction.ViewFileAction) BlockerAction.ViewFileAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 12:
                            endFlowAction = new BlockerAction.Action.DialogAction((BlockerAction.DialogAction) BlockerAction.DialogAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 13:
                            endFlowAction = new BlockerAction.Action.CopyAction((BlockerAction.CopyAction) BlockerAction.CopyAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 14:
                            endFlowAction = new BlockerAction.Action.BackNavigationAction((BlockerAction.BackNavigationAction) BlockerAction.BackNavigationAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 15:
                            endFlowAction = new BlockerAction.Action.ShareTextAction((BlockerAction.ShareTextAction) BlockerAction.ShareTextAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 16:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                            break;
                        case 17:
                            confirmationDialog = new BlockerAction.ConfirmationElement.ConfirmationSheet((BlockerAction.ConfirmationSheet) BlockerAction.ConfirmationSheet.ADAPTER.decode(reader));
                            confirmationElement = confirmationDialog;
                            break;
                        case 18:
                            endFlowAction = new BlockerAction.Action.EndActivityAction((BlockerAction.EndActivityAction) BlockerAction.EndActivityAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 19:
                            endFlowAction = new BlockerAction.Action.ChangeElementTextAction((BlockerAction.ChangeElementTextAction) BlockerAction.ChangeElementTextAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 20:
                            endFlowAction = new BlockerAction.Action.DelayedAction((BlockerAction.DelayedAction) BlockerAction.DelayedAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 21:
                            endFlowAction = new BlockerAction.Action.ShowOverlayScreenAction((BlockerAction.ShowOverlayScreenAction) BlockerAction.ShowOverlayScreenAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 22:
                            endFlowAction = new BlockerAction.Action.HapticFeedbackAction((BlockerAction.HapticFeedbackAction) BlockerAction.HapticFeedbackAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 23:
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                        case 24:
                            endFlowAction = new BlockerAction.Action.AdvanceAction((BlockerAction.AdvanceAction) BlockerAction.AdvanceAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 25:
                            endFlowAction = new BlockerAction.Action.RetreatAction((BlockerAction.RetreatAction) BlockerAction.RetreatAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                        case 26:
                            confirmationDialog = new BlockerAction.ConfirmationElement.ConditionalConfirmation((BlockerAction.ConditionalConfirmation) BlockerAction.ConditionalConfirmation.ADAPTER.decode(reader));
                            confirmationElement = confirmationDialog;
                            break;
                        case 27:
                            endFlowAction = new BlockerAction.Action.OpenExternalUrlAndSubmitAction((BlockerAction.OpenExternalURLAndSubmitAction) BlockerAction.OpenExternalURLAndSubmitAction.ADAPTER.decode(reader));
                            action = endFlowAction;
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BlockerAction value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                LocalizableString.ADAPTER.encodeWithTag(writer, 16, value.localized_text);
                BlockerAction.ConfirmationElement confirmationElement = value.confirmation_element;
                if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationDialog) {
                    BlockerAction.ConfirmationDialog.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement).getValue());
                } else if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet) {
                    BlockerAction.ConfirmationSheet.ADAPTER.encodeWithTag(writer, 17, ((BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement).getValue());
                } else if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation) {
                    BlockerAction.ConditionalConfirmation.ADAPTER.encodeWithTag(writer, 26, ((BlockerAction.ConfirmationElement.ConditionalConfirmation) confirmationElement).getValue());
                } else if (confirmationElement != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                BlockerAction.Action action = value.action;
                if (action instanceof BlockerAction.Action.DelayedAction) {
                    BlockerAction.DelayedAction.ADAPTER.encodeWithTag(writer, 20, ((BlockerAction.Action.DelayedAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.DialogAction) {
                    BlockerAction.DialogAction.ADAPTER.encodeWithTag(writer, 12, ((BlockerAction.Action.DialogAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.MenuAction) {
                    BlockerAction.MenuAction.ADAPTER.encodeWithTag(writer, 4, ((BlockerAction.Action.MenuAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ChangeElementTextAction) {
                    BlockerAction.ChangeElementTextAction.ADAPTER.encodeWithTag(writer, 19, ((BlockerAction.Action.ChangeElementTextAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.EndFlowAction) {
                    BlockerAction.EndFlowAction.ADAPTER.encodeWithTag(writer, 3, ((BlockerAction.Action.EndFlowAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.OpenUrlAction) {
                    BlockerAction.OpenURLAction.ADAPTER.encodeWithTag(writer, 5, ((BlockerAction.Action.OpenUrlAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.SkipBlockerAction) {
                    BlockerAction.SkipBlockerAction.ADAPTER.encodeWithTag(writer, 6, ((BlockerAction.Action.SkipBlockerAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.SubmitAction) {
                    BlockerAction.SubmitAction.ADAPTER.encodeWithTag(writer, 7, ((BlockerAction.Action.SubmitAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.InternalNavigationAction) {
                    BlockerAction.InternalNavigationAction.ADAPTER.encodeWithTag(writer, 8, ((BlockerAction.Action.InternalNavigationAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.SignOutAction) {
                    BlockerAction.SignOutAction.ADAPTER.encodeWithTag(writer, 9, ((BlockerAction.Action.SignOutAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ShareAction) {
                    BlockerAction.ShareFileAction.ADAPTER.encodeWithTag(writer, 10, ((BlockerAction.Action.ShareAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ViewAction) {
                    BlockerAction.ViewFileAction.ADAPTER.encodeWithTag(writer, 11, ((BlockerAction.Action.ViewAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.CopyAction) {
                    BlockerAction.CopyAction.ADAPTER.encodeWithTag(writer, 13, ((BlockerAction.Action.CopyAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.BackNavigationAction) {
                    BlockerAction.BackNavigationAction.ADAPTER.encodeWithTag(writer, 14, ((BlockerAction.Action.BackNavigationAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ShareTextAction) {
                    BlockerAction.ShareTextAction.ADAPTER.encodeWithTag(writer, 15, ((BlockerAction.Action.ShareTextAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.EndActivityAction) {
                    BlockerAction.EndActivityAction.ADAPTER.encodeWithTag(writer, 18, ((BlockerAction.Action.EndActivityAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ShowOverlayScreenAction) {
                    BlockerAction.ShowOverlayScreenAction.ADAPTER.encodeWithTag(writer, 21, ((BlockerAction.Action.ShowOverlayScreenAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.HapticFeedbackAction) {
                    BlockerAction.HapticFeedbackAction.ADAPTER.encodeWithTag(writer, 22, ((BlockerAction.Action.HapticFeedbackAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.AdvanceAction) {
                    BlockerAction.AdvanceAction.ADAPTER.encodeWithTag(writer, 24, ((BlockerAction.Action.AdvanceAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.RetreatAction) {
                    BlockerAction.RetreatAction.ADAPTER.encodeWithTag(writer, 25, ((BlockerAction.Action.RetreatAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.OpenExternalUrlAndSubmitAction) {
                    BlockerAction.OpenExternalURLAndSubmitAction.ADAPTER.encodeWithTag(writer, 27, ((BlockerAction.Action.OpenExternalUrlAndSubmitAction) action).getValue());
                } else if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
            @Override // com.squareup.wire.ProtoAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int encodedSize(BlockerAction value) {
                int encodedSizeWithTag;
                BlockerAction.Action action;
                int encodedSizeWithTag2;
                value.getClass();
                int encodedSizeWithTag3 = LocalizableString.ADAPTER.encodedSizeWithTag(16, value.localized_text) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                BlockerAction.ConfirmationElement confirmationElement = value.confirmation_element;
                if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationDialog) {
                    encodedSizeWithTag = BlockerAction.ConfirmationDialog.ADAPTER.encodedSizeWithTag(2, ((BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement).getValue());
                } else if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet) {
                    encodedSizeWithTag = BlockerAction.ConfirmationSheet.ADAPTER.encodedSizeWithTag(17, ((BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement).getValue());
                } else {
                    if (!(confirmationElement instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation)) {
                        if (confirmationElement != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        action = value.action;
                        if (!(action instanceof BlockerAction.Action.DelayedAction)) {
                            encodedSizeWithTag2 = BlockerAction.DelayedAction.ADAPTER.encodedSizeWithTag(20, ((BlockerAction.Action.DelayedAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.DialogAction) {
                            encodedSizeWithTag2 = BlockerAction.DialogAction.ADAPTER.encodedSizeWithTag(12, ((BlockerAction.Action.DialogAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.MenuAction) {
                            encodedSizeWithTag2 = BlockerAction.MenuAction.ADAPTER.encodedSizeWithTag(4, ((BlockerAction.Action.MenuAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.ChangeElementTextAction) {
                            encodedSizeWithTag2 = BlockerAction.ChangeElementTextAction.ADAPTER.encodedSizeWithTag(19, ((BlockerAction.Action.ChangeElementTextAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.EndFlowAction) {
                            encodedSizeWithTag2 = BlockerAction.EndFlowAction.ADAPTER.encodedSizeWithTag(3, ((BlockerAction.Action.EndFlowAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.OpenUrlAction) {
                            encodedSizeWithTag2 = BlockerAction.OpenURLAction.ADAPTER.encodedSizeWithTag(5, ((BlockerAction.Action.OpenUrlAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.SkipBlockerAction) {
                            encodedSizeWithTag2 = BlockerAction.SkipBlockerAction.ADAPTER.encodedSizeWithTag(6, ((BlockerAction.Action.SkipBlockerAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.SubmitAction) {
                            encodedSizeWithTag2 = BlockerAction.SubmitAction.ADAPTER.encodedSizeWithTag(7, ((BlockerAction.Action.SubmitAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.InternalNavigationAction) {
                            encodedSizeWithTag2 = BlockerAction.InternalNavigationAction.ADAPTER.encodedSizeWithTag(8, ((BlockerAction.Action.InternalNavigationAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.SignOutAction) {
                            encodedSizeWithTag2 = BlockerAction.SignOutAction.ADAPTER.encodedSizeWithTag(9, ((BlockerAction.Action.SignOutAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.ShareAction) {
                            encodedSizeWithTag2 = BlockerAction.ShareFileAction.ADAPTER.encodedSizeWithTag(10, ((BlockerAction.Action.ShareAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.ViewAction) {
                            encodedSizeWithTag2 = BlockerAction.ViewFileAction.ADAPTER.encodedSizeWithTag(11, ((BlockerAction.Action.ViewAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.CopyAction) {
                            encodedSizeWithTag2 = BlockerAction.CopyAction.ADAPTER.encodedSizeWithTag(13, ((BlockerAction.Action.CopyAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.BackNavigationAction) {
                            encodedSizeWithTag2 = BlockerAction.BackNavigationAction.ADAPTER.encodedSizeWithTag(14, ((BlockerAction.Action.BackNavigationAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.ShareTextAction) {
                            encodedSizeWithTag2 = BlockerAction.ShareTextAction.ADAPTER.encodedSizeWithTag(15, ((BlockerAction.Action.ShareTextAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.EndActivityAction) {
                            encodedSizeWithTag2 = BlockerAction.EndActivityAction.ADAPTER.encodedSizeWithTag(18, ((BlockerAction.Action.EndActivityAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.ShowOverlayScreenAction) {
                            encodedSizeWithTag2 = BlockerAction.ShowOverlayScreenAction.ADAPTER.encodedSizeWithTag(21, ((BlockerAction.Action.ShowOverlayScreenAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.HapticFeedbackAction) {
                            encodedSizeWithTag2 = BlockerAction.HapticFeedbackAction.ADAPTER.encodedSizeWithTag(22, ((BlockerAction.Action.HapticFeedbackAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.AdvanceAction) {
                            encodedSizeWithTag2 = BlockerAction.AdvanceAction.ADAPTER.encodedSizeWithTag(24, ((BlockerAction.Action.AdvanceAction) action).getValue());
                        } else if (action instanceof BlockerAction.Action.RetreatAction) {
                            encodedSizeWithTag2 = BlockerAction.RetreatAction.ADAPTER.encodedSizeWithTag(25, ((BlockerAction.Action.RetreatAction) action).getValue());
                        } else {
                            if (!(action instanceof BlockerAction.Action.OpenExternalUrlAndSubmitAction)) {
                                if (action == null) {
                                    return encodedSizeWithTag3;
                                }
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            encodedSizeWithTag2 = BlockerAction.OpenExternalURLAndSubmitAction.ADAPTER.encodedSizeWithTag(27, ((BlockerAction.Action.OpenExternalUrlAndSubmitAction) action).getValue());
                        }
                        return encodedSizeWithTag2 + encodedSizeWithTag3;
                    }
                    encodedSizeWithTag = BlockerAction.ConditionalConfirmation.ADAPTER.encodedSizeWithTag(26, ((BlockerAction.ConfirmationElement.ConditionalConfirmation) confirmationElement).getValue());
                }
                encodedSizeWithTag3 += encodedSizeWithTag;
                action = value.action;
                if (!(action instanceof BlockerAction.Action.DelayedAction)) {
                }
                return encodedSizeWithTag2 + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BlockerAction redact(BlockerAction value) {
                value.getClass();
                return BlockerAction.copy$default(value, null, ByteString.EMPTY, 12);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BlockerAction value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.Action action = value.action;
                if (action instanceof BlockerAction.Action.DelayedAction) {
                    BlockerAction.DelayedAction.ADAPTER.encodeWithTag(writer, 20, ((BlockerAction.Action.DelayedAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.DialogAction) {
                    BlockerAction.DialogAction.ADAPTER.encodeWithTag(writer, 12, ((BlockerAction.Action.DialogAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.MenuAction) {
                    BlockerAction.MenuAction.ADAPTER.encodeWithTag(writer, 4, ((BlockerAction.Action.MenuAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ChangeElementTextAction) {
                    BlockerAction.ChangeElementTextAction.ADAPTER.encodeWithTag(writer, 19, ((BlockerAction.Action.ChangeElementTextAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.EndFlowAction) {
                    BlockerAction.EndFlowAction.ADAPTER.encodeWithTag(writer, 3, ((BlockerAction.Action.EndFlowAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.OpenUrlAction) {
                    BlockerAction.OpenURLAction.ADAPTER.encodeWithTag(writer, 5, ((BlockerAction.Action.OpenUrlAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.SkipBlockerAction) {
                    BlockerAction.SkipBlockerAction.ADAPTER.encodeWithTag(writer, 6, ((BlockerAction.Action.SkipBlockerAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.SubmitAction) {
                    BlockerAction.SubmitAction.ADAPTER.encodeWithTag(writer, 7, ((BlockerAction.Action.SubmitAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.InternalNavigationAction) {
                    BlockerAction.InternalNavigationAction.ADAPTER.encodeWithTag(writer, 8, ((BlockerAction.Action.InternalNavigationAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.SignOutAction) {
                    BlockerAction.SignOutAction.ADAPTER.encodeWithTag(writer, 9, ((BlockerAction.Action.SignOutAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ShareAction) {
                    BlockerAction.ShareFileAction.ADAPTER.encodeWithTag(writer, 10, ((BlockerAction.Action.ShareAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ViewAction) {
                    BlockerAction.ViewFileAction.ADAPTER.encodeWithTag(writer, 11, ((BlockerAction.Action.ViewAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.CopyAction) {
                    BlockerAction.CopyAction.ADAPTER.encodeWithTag(writer, 13, ((BlockerAction.Action.CopyAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.BackNavigationAction) {
                    BlockerAction.BackNavigationAction.ADAPTER.encodeWithTag(writer, 14, ((BlockerAction.Action.BackNavigationAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ShareTextAction) {
                    BlockerAction.ShareTextAction.ADAPTER.encodeWithTag(writer, 15, ((BlockerAction.Action.ShareTextAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.EndActivityAction) {
                    BlockerAction.EndActivityAction.ADAPTER.encodeWithTag(writer, 18, ((BlockerAction.Action.EndActivityAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.ShowOverlayScreenAction) {
                    BlockerAction.ShowOverlayScreenAction.ADAPTER.encodeWithTag(writer, 21, ((BlockerAction.Action.ShowOverlayScreenAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.HapticFeedbackAction) {
                    BlockerAction.HapticFeedbackAction.ADAPTER.encodeWithTag(writer, 22, ((BlockerAction.Action.HapticFeedbackAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.AdvanceAction) {
                    BlockerAction.AdvanceAction.ADAPTER.encodeWithTag(writer, 24, ((BlockerAction.Action.AdvanceAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.RetreatAction) {
                    BlockerAction.RetreatAction.ADAPTER.encodeWithTag(writer, 25, ((BlockerAction.Action.RetreatAction) action).getValue());
                } else if (action instanceof BlockerAction.Action.OpenExternalUrlAndSubmitAction) {
                    BlockerAction.OpenExternalURLAndSubmitAction.ADAPTER.encodeWithTag(writer, 27, ((BlockerAction.Action.OpenExternalUrlAndSubmitAction) action).getValue());
                } else if (action != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                BlockerAction.ConfirmationElement confirmationElement = value.confirmation_element;
                if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationDialog) {
                    BlockerAction.ConfirmationDialog.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ConfirmationElement.ConfirmationDialog) confirmationElement).getValue());
                } else if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConfirmationSheet) {
                    BlockerAction.ConfirmationSheet.ADAPTER.encodeWithTag(writer, 17, ((BlockerAction.ConfirmationElement.ConfirmationSheet) confirmationElement).getValue());
                } else if (confirmationElement instanceof BlockerAction.ConfirmationElement.ConditionalConfirmation) {
                    BlockerAction.ConditionalConfirmation.ADAPTER.encodeWithTag(writer, 26, ((BlockerAction.ConfirmationElement.ConditionalConfirmation) confirmationElement).getValue());
                } else if (confirmationElement != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                LocalizableString.ADAPTER.encodeWithTag(writer, 16, value.localized_text);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ BlockerAction(String str, Action action, int i) {
        this((i & 1) != 0 ? null : str, null, null, (i & 8) != 0 ? null : action, ByteString.EMPTY);
    }

    public static BlockerAction copy$default(BlockerAction blockerAction, ConfirmationElement confirmationElement, ByteString byteString, int i) {
        String str = (i & 1) != 0 ? blockerAction.text : null;
        LocalizableString localizableString = (i & 2) != 0 ? blockerAction.localized_text : null;
        if ((i & 4) != 0) {
            confirmationElement = blockerAction.confirmation_element;
        }
        ConfirmationElement confirmationElement2 = confirmationElement;
        Action action = blockerAction.action;
        if ((i & 16) != 0) {
            byteString = blockerAction.unknownFields();
        }
        ByteString byteString2 = byteString;
        blockerAction.getClass();
        byteString2.getClass();
        return new BlockerAction(str, localizableString, confirmationElement2, action, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockerAction)) {
            return false;
        }
        BlockerAction blockerAction = (BlockerAction) obj;
        return Intrinsics.areEqual(unknownFields(), blockerAction.unknownFields()) && Intrinsics.areEqual(this.text, blockerAction.text) && Intrinsics.areEqual(this.localized_text, blockerAction.localized_text) && Intrinsics.areEqual(this.confirmation_element, blockerAction.confirmation_element) && Intrinsics.areEqual(this.action, blockerAction.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localized_text;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        ConfirmationElement confirmationElement = this.confirmation_element;
        int hashCode4 = (hashCode3 + (confirmationElement != null ? confirmationElement.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode5 = hashCode4 + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.localized_text = this.localized_text;
        builder.confirmation_element = this.confirmation_element;
        builder.action = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.text != null) {
            arrayList.add("text=██");
        }
        if (this.localized_text != null) {
            arrayList.add("localized_text=██");
        }
        ConfirmationElement confirmationElement = this.confirmation_element;
        if (confirmationElement != null) {
            arrayList.add("confirmation_element=" + confirmationElement);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockerAction{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction$Builder;", "blocker_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AdvanceAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AdvanceAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String blocker_id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;", "<init>", "()V", "blocker_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String blocker_id;

            public final Builder blocker_id(String blocker_id) {
                this.blocker_id = blocker_id;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AdvanceAction build() {
                return new AdvanceAction(this.blocker_id, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AdvanceAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$AdvanceAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.AdvanceAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.AdvanceAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.AdvanceAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.blocker_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.AdvanceAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.blocker_id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.AdvanceAction redact(BlockerAction.AdvanceAction value) {
                    value.getClass();
                    return BlockerAction.AdvanceAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.AdvanceAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.blocker_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AdvanceAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AdvanceAction copy$default(AdvanceAction advanceAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = advanceAction.blocker_id;
            }
            if ((i & 2) != 0) {
                byteString = advanceAction.unknownFields();
            }
            return advanceAction.copy(str, byteString);
        }

        public final AdvanceAction copy(String blocker_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new AdvanceAction(blocker_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AdvanceAction)) {
                return false;
            }
            AdvanceAction advanceAction = (AdvanceAction) other;
            return Intrinsics.areEqual(unknownFields(), advanceAction.unknownFields()) && Intrinsics.areEqual(this.blocker_id, advanceAction.blocker_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.blocker_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.blocker_id = this.blocker_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.blocker_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "blocker_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AdvanceAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AdvanceAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdvanceAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdvanceAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.blocker_id = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$Builder;", "fallbackBehavior", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "FallbackBehavior", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class BackNavigationAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BackNavigationAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final FallbackBehavior fallbackBehavior;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;", "<init>", "()V", "fallbackBehavior", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public FallbackBehavior fallbackBehavior;

            @Override // com.squareup.wire.Message.Builder
            public BackNavigationAction build() {
                return new BackNavigationAction(this.fallbackBehavior, buildUnknownFields());
            }

            public final Builder fallbackBehavior(FallbackBehavior fallbackBehavior) {
                this.fallbackBehavior = fallbackBehavior;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BackNavigationAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$BackNavigationAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.BackNavigationAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    BlockerAction.BackNavigationAction.FallbackBehavior fallbackBehavior = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.BackNavigationAction(fallbackBehavior, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            fallbackBehavior = new BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl((String) ProtoAdapter.STRING.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            fallbackBehavior = new BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt((BackNavigationPrompt) BackNavigationPrompt.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.BackNavigationAction value) {
                    writer.getClass();
                    value.getClass();
                    BlockerAction.BackNavigationAction.FallbackBehavior fallbackBehavior = value.fallbackBehavior;
                    if (fallbackBehavior instanceof BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, ((BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl) fallbackBehavior).getValue());
                    } else if (fallbackBehavior instanceof BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt) {
                        BackNavigationPrompt.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt) fallbackBehavior).getValue());
                    } else if (fallbackBehavior != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.BackNavigationAction value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    BlockerAction.BackNavigationAction.FallbackBehavior fallbackBehavior = value.fallbackBehavior;
                    if (fallbackBehavior instanceof BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl) {
                        encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, ((BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl) fallbackBehavior).getValue());
                    } else {
                        if (!(fallbackBehavior instanceof BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt)) {
                            if (fallbackBehavior == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = BackNavigationPrompt.ADAPTER.encodedSizeWithTag(2, ((BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt) fallbackBehavior).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.BackNavigationAction redact(BlockerAction.BackNavigationAction value) {
                    value.getClass();
                    return BlockerAction.BackNavigationAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.BackNavigationAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.BackNavigationAction.FallbackBehavior fallbackBehavior = value.fallbackBehavior;
                    if (fallbackBehavior instanceof BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, ((BlockerAction.BackNavigationAction.FallbackBehavior.RedirectUrl) fallbackBehavior).getValue());
                    } else if (fallbackBehavior instanceof BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt) {
                        BackNavigationPrompt.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.BackNavigationAction.FallbackBehavior.BackNavigationPrompt) fallbackBehavior).getValue());
                    } else {
                        if (fallbackBehavior == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ BackNavigationAction(FallbackBehavior fallbackBehavior, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : fallbackBehavior, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ BackNavigationAction copy$default(BackNavigationAction backNavigationAction, FallbackBehavior fallbackBehavior, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                fallbackBehavior = backNavigationAction.fallbackBehavior;
            }
            if ((i & 2) != 0) {
                byteString = backNavigationAction.unknownFields();
            }
            return backNavigationAction.copy(fallbackBehavior, byteString);
        }

        public final BackNavigationAction copy(FallbackBehavior fallbackBehavior, ByteString unknownFields) {
            unknownFields.getClass();
            return new BackNavigationAction(fallbackBehavior, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof BackNavigationAction)) {
                return false;
            }
            BackNavigationAction backNavigationAction = (BackNavigationAction) other;
            return Intrinsics.areEqual(unknownFields(), backNavigationAction.unknownFields()) && Intrinsics.areEqual(this.fallbackBehavior, backNavigationAction.fallbackBehavior);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FallbackBehavior fallbackBehavior = this.fallbackBehavior;
            int hashCode2 = hashCode + (fallbackBehavior != null ? fallbackBehavior.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.fallbackBehavior = this.fallbackBehavior;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            FallbackBehavior fallbackBehavior = this.fallbackBehavior;
            if (fallbackBehavior != null) {
                arrayList.add("fallbackBehavior=" + fallbackBehavior);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BackNavigationAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BackNavigationAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior;", "", "<init>", "()V", "RedirectUrl", "BackNavigationPrompt", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior$BackNavigationPrompt;", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior$RedirectUrl;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class FallbackBehavior {

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.BackNavigationPrompt#ADAPTER", declaredName = "back_navigation_prompt", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior$BackNavigationPrompt;", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior;", "value", "Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;", "<init>", "(Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/BackNavigationPrompt;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class BackNavigationPrompt extends FallbackBehavior {
                private final com.squareup.protos.franklin.ui.BackNavigationPrompt value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BackNavigationPrompt(com.squareup.protos.franklin.ui.BackNavigationPrompt backNavigationPrompt) {
                    super(null);
                    backNavigationPrompt.getClass();
                    this.value = backNavigationPrompt;
                }

                public static /* synthetic */ BackNavigationPrompt copy$default(BackNavigationPrompt backNavigationPrompt, com.squareup.protos.franklin.ui.BackNavigationPrompt backNavigationPrompt2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        backNavigationPrompt2 = backNavigationPrompt.value;
                    }
                    return backNavigationPrompt.copy(backNavigationPrompt2);
                }

                /* renamed from: component1, reason: from getter */
                public final com.squareup.protos.franklin.ui.BackNavigationPrompt getValue() {
                    return this.value;
                }

                public final BackNavigationPrompt copy(com.squareup.protos.franklin.ui.BackNavigationPrompt value) {
                    value.getClass();
                    return new BackNavigationPrompt(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BackNavigationPrompt) && Intrinsics.areEqual(this.value, ((BackNavigationPrompt) other).value);
                }

                public final com.squareup.protos.franklin.ui.BackNavigationPrompt getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "BackNavigationPrompt(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "redirect_url", tag = 1)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior$RedirectUrl;", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction$FallbackBehavior;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class RedirectUrl extends FallbackBehavior {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RedirectUrl(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ RedirectUrl copy$default(RedirectUrl redirectUrl, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = redirectUrl.value;
                    }
                    return redirectUrl.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final RedirectUrl copy(String value) {
                    value.getClass();
                    return new RedirectUrl(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof RedirectUrl) && Intrinsics.areEqual(this.value, ((RedirectUrl) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RedirectUrl(value=", this.value, ")");
                }
            }

            public /* synthetic */ FallbackBehavior(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private FallbackBehavior() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BackNavigationAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackNavigationAction(FallbackBehavior fallbackBehavior, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.fallbackBehavior = fallbackBehavior;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Builder;", "element_id", "", "element", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Element", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ConditionalConfirmation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConditionalConfirmation> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 1)
        public final Element element;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String element_id;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;", "<init>", "()V", "element_id", "", "element", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Element element;
            public String element_id;

            @Override // com.squareup.wire.Message.Builder
            public ConditionalConfirmation build() {
                return new ConditionalConfirmation(this.element_id, this.element, buildUnknownFields());
            }

            public final Builder element(Element element) {
                this.element = element;
                return this;
            }

            public final Builder element_id(String element_id) {
                this.element_id = element_id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConditionalConfirmation.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ConditionalConfirmation$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ConditionalConfirmation decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    BlockerAction.ConditionalConfirmation.Element element = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ConditionalConfirmation((String) obj, element, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            element = new BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog((BlockerAction.ConfirmationDialog) BlockerAction.ConfirmationDialog.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            element = new BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet((BlockerAction.ConfirmationSheet) BlockerAction.ConfirmationSheet.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ConditionalConfirmation value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.element_id);
                    BlockerAction.ConditionalConfirmation.Element element = value.element;
                    if (element instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) {
                        BlockerAction.ConfirmationDialog.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) element).getValue());
                    } else if (element instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet) {
                        BlockerAction.ConfirmationSheet.ADAPTER.encodeWithTag(writer, 3, ((BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet) element).getValue());
                    } else if (element != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ConditionalConfirmation value) {
                    value.getClass();
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, value.element_id) + value.unknownFields().getSize$okio();
                    BlockerAction.ConditionalConfirmation.Element element = value.element;
                    if (element instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) {
                        return BlockerAction.ConfirmationDialog.ADAPTER.encodedSizeWithTag(2, ((BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) element).getValue()) + encodedSizeWithTag;
                    }
                    if (element instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet) {
                        return BlockerAction.ConfirmationSheet.ADAPTER.encodedSizeWithTag(3, ((BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet) element).getValue()) + encodedSizeWithTag;
                    }
                    if (element == null) {
                        return encodedSizeWithTag;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ConditionalConfirmation redact(BlockerAction.ConditionalConfirmation value) {
                    value.getClass();
                    return BlockerAction.ConditionalConfirmation.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ConditionalConfirmation value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ConditionalConfirmation.Element element = value.element;
                    if (element instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) {
                        BlockerAction.ConfirmationDialog.ADAPTER.encodeWithTag(writer, 2, ((BlockerAction.ConditionalConfirmation.Element.ConfirmationDialog) element).getValue());
                    } else if (element instanceof BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet) {
                        BlockerAction.ConfirmationSheet.ADAPTER.encodeWithTag(writer, 3, ((BlockerAction.ConditionalConfirmation.Element.ConfirmationSheet) element).getValue());
                    } else if (element != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.element_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ConditionalConfirmation(String str, Element element, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : element, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ConditionalConfirmation copy$default(ConditionalConfirmation conditionalConfirmation, String str, Element element, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conditionalConfirmation.element_id;
            }
            if ((i & 2) != 0) {
                element = conditionalConfirmation.element;
            }
            if ((i & 4) != 0) {
                byteString = conditionalConfirmation.unknownFields();
            }
            return conditionalConfirmation.copy(str, element, byteString);
        }

        public final ConditionalConfirmation copy(String element_id, Element element, ByteString unknownFields) {
            unknownFields.getClass();
            return new ConditionalConfirmation(element_id, element, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ConditionalConfirmation)) {
                return false;
            }
            ConditionalConfirmation conditionalConfirmation = (ConditionalConfirmation) other;
            return Intrinsics.areEqual(unknownFields(), conditionalConfirmation.unknownFields()) && Intrinsics.areEqual(this.element_id, conditionalConfirmation.element_id) && Intrinsics.areEqual(this.element, conditionalConfirmation.element);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.element_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Element element = this.element;
            int hashCode3 = hashCode2 + (element != null ? element.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.element_id = this.element_id;
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.element_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "element_id=", arrayList);
            }
            Element element = this.element;
            if (element != null) {
                arrayList.add("element=" + element);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConditionalConfirmation{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ConditionalConfirmation build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element;", "", "<init>", "()V", "ConfirmationDialog", "ConfirmationSheet", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element$ConfirmationDialog;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element$ConfirmationSheet;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Element {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ConfirmationDialog#ADAPTER", declaredName = "confirmation_dialog", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element$ConfirmationDialog;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ConfirmationDialog extends Element {
                private final ConfirmationDialog value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ConfirmationDialog(ConfirmationDialog confirmationDialog) {
                    super(null);
                    confirmationDialog.getClass();
                    this.value = confirmationDialog;
                }

                public static /* synthetic */ ConfirmationDialog copy$default(ConfirmationDialog confirmationDialog, ConfirmationDialog confirmationDialog2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        confirmationDialog2 = confirmationDialog.value;
                    }
                    return confirmationDialog.copy(confirmationDialog2);
                }

                /* renamed from: component1, reason: from getter */
                public final ConfirmationDialog getValue() {
                    return this.value;
                }

                public final ConfirmationDialog copy(ConfirmationDialog value) {
                    value.getClass();
                    return new ConfirmationDialog(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ConfirmationDialog) && Intrinsics.areEqual(this.value, ((ConfirmationDialog) other).value);
                }

                public final ConfirmationDialog getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ConfirmationDialog(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ConfirmationSheet#ADAPTER", declaredName = "confirmation_sheet", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element$ConfirmationSheet;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation$Element;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ConfirmationSheet extends Element {
                private final ConfirmationSheet value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ConfirmationSheet(ConfirmationSheet confirmationSheet) {
                    super(null);
                    confirmationSheet.getClass();
                    this.value = confirmationSheet;
                }

                public static /* synthetic */ ConfirmationSheet copy$default(ConfirmationSheet confirmationSheet, ConfirmationSheet confirmationSheet2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        confirmationSheet2 = confirmationSheet.value;
                    }
                    return confirmationSheet.copy(confirmationSheet2);
                }

                /* renamed from: component1, reason: from getter */
                public final ConfirmationSheet getValue() {
                    return this.value;
                }

                public final ConfirmationSheet copy(ConfirmationSheet value) {
                    value.getClass();
                    return new ConfirmationSheet(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ConfirmationSheet) && Intrinsics.areEqual(this.value, ((ConfirmationSheet) other).value);
                }

                public final ConfirmationSheet getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ConfirmationSheet(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Element(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Element() {
            }
        }

        public ConditionalConfirmation() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConditionalConfirmation(String str, Element element, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element_id = str;
            this.element = element;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog$Builder;", "title", "", "message", "confirm_button_text", "cancel_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ConfirmationDialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConfirmationDialog> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
        public final String cancel_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
        public final String confirm_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String message;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "<init>", "()V", "title", "", "message", "confirm_button_text", "cancel_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String cancel_button_text;
            public String confirm_button_text;
            public String message;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public ConfirmationDialog build() {
                return new ConfirmationDialog(this.title, this.message, this.confirm_button_text, this.cancel_button_text, buildUnknownFields());
            }

            public final Builder cancel_button_text(String cancel_button_text) {
                this.cancel_button_text = cancel_button_text;
                return this;
            }

            public final Builder confirm_button_text(String confirm_button_text) {
                this.confirm_button_text = confirm_button_text;
                return this;
            }

            public final Builder message(String message) {
                this.message = message;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmationDialog.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ConfirmationDialog$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ConfirmationDialog decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ConfirmationDialog((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ConfirmationDialog value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.message);
                    protoAdapter2.encodeWithTag(writer, 3, value.confirm_button_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.cancel_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ConfirmationDialog value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.cancel_button_text) + protoAdapter2.encodedSizeWithTag(3, value.confirm_button_text) + protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ConfirmationDialog redact(BlockerAction.ConfirmationDialog value) {
                    value.getClass();
                    return value.copy(null, null, null, null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ConfirmationDialog value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.cancel_button_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.confirm_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.message);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ConfirmationDialog(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ConfirmationDialog copy$default(ConfirmationDialog confirmationDialog, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmationDialog.title;
            }
            if ((i & 2) != 0) {
                str2 = confirmationDialog.message;
            }
            if ((i & 4) != 0) {
                str3 = confirmationDialog.confirm_button_text;
            }
            if ((i & 8) != 0) {
                str4 = confirmationDialog.cancel_button_text;
            }
            if ((i & 16) != 0) {
                byteString = confirmationDialog.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str5 = str3;
            return confirmationDialog.copy(str, str2, str5, str4, byteString2);
        }

        public final ConfirmationDialog copy(String title, String message, String confirm_button_text, String cancel_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new ConfirmationDialog(title, message, confirm_button_text, cancel_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ConfirmationDialog)) {
                return false;
            }
            ConfirmationDialog confirmationDialog = (ConfirmationDialog) other;
            return Intrinsics.areEqual(unknownFields(), confirmationDialog.unknownFields()) && Intrinsics.areEqual(this.title, confirmationDialog.title) && Intrinsics.areEqual(this.message, confirmationDialog.message) && Intrinsics.areEqual(this.confirm_button_text, confirmationDialog.confirm_button_text) && Intrinsics.areEqual(this.cancel_button_text, confirmationDialog.cancel_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.message;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.confirm_button_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.cancel_button_text;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.message = this.message;
            builder.confirm_button_text = this.confirm_button_text;
            builder.cancel_button_text = this.cancel_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.message != null) {
                arrayList.add("message=██");
            }
            if (this.confirm_button_text != null) {
                arrayList.add("confirm_button_text=██");
            }
            if (this.cancel_button_text != null) {
                arrayList.add("cancel_button_text=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmationDialog{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ConfirmationDialog build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ConfirmationDialog() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationDialog(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.message = str2;
            this.confirm_button_text = str3;
            this.cancel_button_text = str4;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CopyAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CopyAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public CopyAction build() {
                return new CopyAction(this.text, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CopyAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$CopyAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.CopyAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.CopyAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.CopyAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.CopyAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.CopyAction redact(BlockerAction.CopyAction value) {
                    value.getClass();
                    return BlockerAction.CopyAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.CopyAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CopyAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CopyAction copy$default(CopyAction copyAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = copyAction.text;
            }
            if ((i & 2) != 0) {
                byteString = copyAction.unknownFields();
            }
            return copyAction.copy(str, byteString);
        }

        public final CopyAction copy(String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new CopyAction(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CopyAction)) {
                return false;
            }
            CopyAction copyAction = (CopyAction) other;
            return Intrinsics.areEqual(unknownFields(), copyAction.unknownFields()) && Intrinsics.areEqual(this.text, copyAction.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CopyAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CopyAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CopyAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CopyAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction$Builder;", "delay_ms", "", "action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Long;Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DelayedAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DelayedAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 1, tag = 2)
        public final BlockerAction action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
        public final Long delay_ms;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "<init>", "()V", "delay_ms", "", "Ljava/lang/Long;", "action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public BlockerAction action;
            public Long delay_ms;

            public final Builder action(BlockerAction action) {
                this.action = action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public DelayedAction build() {
                return new DelayedAction(this.delay_ms, this.action, buildUnknownFields());
            }

            public final Builder delay_ms(Long delay_ms) {
                this.delay_ms = delay_ms;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DelayedAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$DelayedAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.DelayedAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.DelayedAction((Long) obj, (BlockerAction) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT64.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.DelayedAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, value.delay_ms);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 2, value.action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.DelayedAction value) {
                    value.getClass();
                    return BlockerAction.ADAPTER.encodedSizeWithTag(2, value.action) + ProtoAdapter.INT64.encodedSizeWithTag(1, value.delay_ms) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.DelayedAction redact(BlockerAction.DelayedAction value) {
                    value.getClass();
                    BlockerAction blockerAction = value.action;
                    return BlockerAction.DelayedAction.copy$default(value, null, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.DelayedAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ADAPTER.encodeWithTag(writer, 2, value.action);
                    ProtoAdapter.INT64.encodeWithTag(writer, 1, value.delay_ms);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DelayedAction(Long l, BlockerAction blockerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : blockerAction, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DelayedAction copy$default(DelayedAction delayedAction, Long l, BlockerAction blockerAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                l = delayedAction.delay_ms;
            }
            if ((i & 2) != 0) {
                blockerAction = delayedAction.action;
            }
            if ((i & 4) != 0) {
                byteString = delayedAction.unknownFields();
            }
            return delayedAction.copy(l, blockerAction, byteString);
        }

        public final DelayedAction copy(Long delay_ms, BlockerAction action, ByteString unknownFields) {
            unknownFields.getClass();
            return new DelayedAction(delay_ms, action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DelayedAction)) {
                return false;
            }
            DelayedAction delayedAction = (DelayedAction) other;
            return Intrinsics.areEqual(unknownFields(), delayedAction.unknownFields()) && Intrinsics.areEqual(this.delay_ms, delayedAction.delay_ms) && Intrinsics.areEqual(this.action, delayedAction.action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.delay_ms;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            BlockerAction blockerAction = this.action;
            int hashCode3 = hashCode2 + (blockerAction != null ? blockerAction.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.delay_ms = this.delay_ms;
            builder.action = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.delay_ms;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("delay_ms=", l, arrayList);
            }
            BlockerAction blockerAction = this.action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("action=", blockerAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DelayedAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DelayedAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DelayedAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DelayedAction(Long l, BlockerAction blockerAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.delay_ms = l;
            this.action = blockerAction;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Builder;", "title", "", "message", "primary_button", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;", "secondary_button", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Button", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DialogAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DialogAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String message;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$DialogAction$Button#ADAPTER", schemaIndex = 2, tag = 3)
        public final Button primary_button;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$DialogAction$Button#ADAPTER", schemaIndex = 3, tag = 4)
        public final Button secondary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;", "<init>", "()V", "title", "", "message", "primary_button", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;", "secondary_button", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String message;
            public Button primary_button;
            public Button secondary_button;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public DialogAction build() {
                return new DialogAction(this.title, this.message, this.primary_button, this.secondary_button, buildUnknownFields());
            }

            public final Builder message(String message) {
                this.message = message;
                return this;
            }

            public final Builder primary_button(Button primary_button) {
                this.primary_button = primary_button;
                return this;
            }

            public final Builder secondary_button(Button secondary_button) {
                this.secondary_button = secondary_button;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Builder;", "text", "", "action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "style", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Style;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction;Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Style;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Style", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Button extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Button> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 1, tag = 2)
            public final BlockerAction action;

            @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$DialogAction$Button$Style#ADAPTER", schemaIndex = 2, tag = 3)
            public final Style style;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String text;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;", "<init>", "()V", "text", "", "action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "style", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Style;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public BlockerAction action;
                public Style style;
                public String text;

                public final Builder action(BlockerAction action) {
                    this.action = action;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public Button build() {
                    return new Button(this.text, this.action, this.style, buildUnknownFields());
                }

                public final Builder style(Style style) {
                    this.style = style;
                    return this;
                }

                public final Builder text(String text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$DialogAction$Button$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.DialogAction.Button decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new BlockerAction.DialogAction.Button((String) obj, (BlockerAction) obj2, (BlockerAction.DialogAction.Button.Style) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj2);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                try {
                                    obj3 = BlockerAction.DialogAction.Button.Style.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, BlockerAction.DialogAction.Button value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                        BlockerAction.ADAPTER.encodeWithTag(writer, 2, value.action);
                        BlockerAction.DialogAction.Button.Style.ADAPTER.encodeWithTag(writer, 3, value.style);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(BlockerAction.DialogAction.Button value) {
                        value.getClass();
                        return BlockerAction.DialogAction.Button.Style.ADAPTER.encodedSizeWithTag(3, value.style) + BlockerAction.ADAPTER.encodedSizeWithTag(2, value.action) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public BlockerAction.DialogAction.Button redact(BlockerAction.DialogAction.Button value) {
                        value.getClass();
                        BlockerAction blockerAction = value.action;
                        return BlockerAction.DialogAction.Button.copy$default(value, null, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, null, ByteString.EMPTY, 5, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, BlockerAction.DialogAction.Button value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        BlockerAction.DialogAction.Button.Style.ADAPTER.encodeWithTag(writer, 3, value.style);
                        BlockerAction.ADAPTER.encodeWithTag(writer, 2, value.action);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Button(String str, BlockerAction blockerAction, Style style, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : blockerAction, (i & 4) != 0 ? null : style, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Button copy$default(Button button, String str, BlockerAction blockerAction, Style style, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.text;
                }
                if ((i & 2) != 0) {
                    blockerAction = button.action;
                }
                if ((i & 4) != 0) {
                    style = button.style;
                }
                if ((i & 8) != 0) {
                    byteString = button.unknownFields();
                }
                return button.copy(str, blockerAction, style, byteString);
            }

            public final Button copy(String text, BlockerAction action, Style style, ByteString unknownFields) {
                unknownFields.getClass();
                return new Button(text, action, style, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.action, button.action) && this.style == button.style;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                BlockerAction blockerAction = this.action;
                int hashCode3 = (hashCode2 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
                Style style = this.style;
                int hashCode4 = hashCode3 + (style != null ? style.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.action = this.action;
                builder.style = this.style;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                BlockerAction blockerAction = this.action;
                if (blockerAction != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("action=", blockerAction, arrayList);
                }
                Style style = this.style;
                if (style != null) {
                    arrayList.add("style=" + style);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Style;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "CANCEL", "DESTRUCTIVE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Style implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;
                public static final ProtoAdapter ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                private final int value;
                public static final Style DEFAULT = new Style("DEFAULT", 0, 1);
                public static final Style CANCEL = new Style("CANCEL", 1, 2);
                public static final Style DESTRUCTIVE = new Style("DESTRUCTIVE", 2, 3);

                private static final /* synthetic */ Style[] $values() {
                    return new Style[]{DEFAULT, CANCEL, DESTRUCTIVE};
                }

                static {
                    Style[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Style.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$DialogAction$Button$Style$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public BlockerAction.DialogAction.Button.Style fromValue(int value) {
                            return BlockerAction.DialogAction.Button.Style.INSTANCE.fromValue(value);
                        }
                    };
                }

                private Style(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final Style fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Style$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Style;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final Style fromValue(int value) {
                        if (value == 1) {
                            return Style.DEFAULT;
                        }
                        if (value == 2) {
                            return Style.CANCEL;
                        }
                        if (value != 3) {
                            return null;
                        }
                        return Style.DESTRUCTIVE;
                    }

                    private Companion() {
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Button build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Button() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String str, BlockerAction blockerAction, Style style, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.action = blockerAction;
                this.style = style;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DialogAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$DialogAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.DialogAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.DialogAction((String) obj, (String) obj2, (BlockerAction.DialogAction.Button) obj3, (BlockerAction.DialogAction.Button) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(BlockerAction.DialogAction.Button.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(BlockerAction.DialogAction.Button.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.DialogAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.message);
                    ProtoAdapter protoAdapter3 = BlockerAction.DialogAction.Button.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.primary_button);
                    protoAdapter3.encodeWithTag(writer, 4, value.secondary_button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.DialogAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = BlockerAction.DialogAction.Button.ADAPTER;
                    return protoAdapter3.encodedSizeWithTag(4, value.secondary_button) + protoAdapter3.encodedSizeWithTag(3, value.primary_button) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.DialogAction redact(BlockerAction.DialogAction value) {
                    value.getClass();
                    BlockerAction.DialogAction.Button button = value.primary_button;
                    BlockerAction.DialogAction.Button button2 = button != null ? (BlockerAction.DialogAction.Button) BlockerAction.DialogAction.Button.ADAPTER.redact(button) : null;
                    BlockerAction.DialogAction.Button button3 = value.secondary_button;
                    return value.copy(null, null, button2, button3 != null ? (BlockerAction.DialogAction.Button) BlockerAction.DialogAction.Button.ADAPTER.redact(button3) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.DialogAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = BlockerAction.DialogAction.Button.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.secondary_button);
                    protoAdapter2.encodeWithTag(writer, 3, value.primary_button);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 2, value.message);
                    protoAdapter3.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DialogAction(String str, String str2, Button button, Button button2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : button, (i & 8) != 0 ? null : button2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DialogAction copy$default(DialogAction dialogAction, String str, String str2, Button button, Button button2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dialogAction.title;
            }
            if ((i & 2) != 0) {
                str2 = dialogAction.message;
            }
            if ((i & 4) != 0) {
                button = dialogAction.primary_button;
            }
            if ((i & 8) != 0) {
                button2 = dialogAction.secondary_button;
            }
            if ((i & 16) != 0) {
                byteString = dialogAction.unknownFields();
            }
            ByteString byteString2 = byteString;
            Button button3 = button;
            return dialogAction.copy(str, str2, button3, button2, byteString2);
        }

        public final DialogAction copy(String title, String message, Button primary_button, Button secondary_button, ByteString unknownFields) {
            unknownFields.getClass();
            return new DialogAction(title, message, primary_button, secondary_button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DialogAction)) {
                return false;
            }
            DialogAction dialogAction = (DialogAction) other;
            return Intrinsics.areEqual(unknownFields(), dialogAction.unknownFields()) && Intrinsics.areEqual(this.title, dialogAction.title) && Intrinsics.areEqual(this.message, dialogAction.message) && Intrinsics.areEqual(this.primary_button, dialogAction.primary_button) && Intrinsics.areEqual(this.secondary_button, dialogAction.secondary_button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.message;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode4 = (hashCode3 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode5 = hashCode4 + (button2 != null ? button2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.message = this.message;
            builder.primary_button = this.primary_button;
            builder.secondary_button = this.secondary_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.message != null) {
                arrayList.add("message=██");
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DialogAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DialogAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DialogAction() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogAction(String str, String str2, Button button, Button button2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.message = str2;
            this.primary_button = button;
            this.secondary_button = button2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0007H\u0016J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction$Builder;", "end_activity_result_status", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "intent_resolution_data", "", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;Ljava/util/Map;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class EndActivityAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EndActivityAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$EndActivityResult#ADAPTER", schemaIndex = 0, tag = 1)
        public final EndActivityResult end_activity_result_status;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final Map<String, String> intent_resolution_data;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "<init>", "()V", "end_activity_result_status", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "intent_resolution_data", "", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public EndActivityResult end_activity_result_status;
            public Map<String, String> intent_resolution_data;

            public Builder() {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.intent_resolution_data = emptyMap;
            }

            @Override // com.squareup.wire.Message.Builder
            public EndActivityAction build() {
                return new EndActivityAction(this.end_activity_result_status, this.intent_resolution_data, buildUnknownFields());
            }

            public final Builder end_activity_result_status(EndActivityResult end_activity_result_status) {
                this.end_activity_result_status = end_activity_result_status;
                return this;
            }

            public final Builder intent_resolution_data(Map<String, String> intent_resolution_data) {
                intent_resolution_data.getClass();
                this.intent_resolution_data = intent_resolution_data;
                return this;
            }
        }

        static {
            BlockerAction$EndActivityAction$Companion$ADAPTER$1 blockerAction$EndActivityAction$Companion$ADAPTER$1 = new BlockerAction$EndActivityAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EndActivityAction.class), Syntax.PROTO_2);
            ADAPTER = blockerAction$EndActivityAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(blockerAction$EndActivityAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EndActivityAction(EndActivityResult endActivityResult, Map map, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(endActivityResult, map, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            endActivityResult = (i & 1) != 0 ? null : endActivityResult;
            if ((i & 2) != 0) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EndActivityAction copy$default(EndActivityAction endActivityAction, EndActivityResult endActivityResult, Map map, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                endActivityResult = endActivityAction.end_activity_result_status;
            }
            if ((i & 2) != 0) {
                map = endActivityAction.intent_resolution_data;
            }
            if ((i & 4) != 0) {
                byteString = endActivityAction.unknownFields();
            }
            return endActivityAction.copy(endActivityResult, map, byteString);
        }

        public final EndActivityAction copy(EndActivityResult end_activity_result_status, Map<String, String> intent_resolution_data, ByteString unknownFields) {
            intent_resolution_data.getClass();
            unknownFields.getClass();
            return new EndActivityAction(end_activity_result_status, intent_resolution_data, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EndActivityAction)) {
                return false;
            }
            EndActivityAction endActivityAction = (EndActivityAction) other;
            return Intrinsics.areEqual(unknownFields(), endActivityAction.unknownFields()) && Intrinsics.areEqual(this.end_activity_result_status, endActivityAction.end_activity_result_status) && Intrinsics.areEqual(this.intent_resolution_data, endActivityAction.intent_resolution_data);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            EndActivityResult endActivityResult = this.end_activity_result_status;
            int hashCode2 = this.intent_resolution_data.hashCode() + ((hashCode + (endActivityResult != null ? endActivityResult.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.end_activity_result_status = this.end_activity_result_status;
            builder.intent_resolution_data = this.intent_resolution_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            EndActivityResult endActivityResult = this.end_activity_result_status;
            if (endActivityResult != null) {
                arrayList.add("end_activity_result_status=" + endActivityResult);
            }
            if (!this.intent_resolution_data.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("intent_resolution_data=", this.intent_resolution_data, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EndActivityAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EndActivityAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EndActivityAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndActivityAction(EndActivityResult endActivityResult, Map<String, String> map, ByteString byteString) {
            super(ADAPTER, byteString);
            map.getClass();
            byteString.getClass();
            this.end_activity_result_status = endActivityResult;
            this.intent_resolution_data = TransactorKt.immutableCopyOf("intent_resolution_data", map);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult$Builder;", "result_status", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class EndActivityResult extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EndActivityResult> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
        public final Integer result_status;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "<init>", "()V", "result_status", "", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Integer result_status;

            @Override // com.squareup.wire.Message.Builder
            public EndActivityResult build() {
                return new EndActivityResult(this.result_status, buildUnknownFields());
            }

            public final Builder result_status(Integer result_status) {
                this.result_status = result_status;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EndActivityResult.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$EndActivityResult$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.EndActivityResult decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.EndActivityResult((Integer) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT32.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.EndActivityResult value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, value.result_status);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.EndActivityResult value) {
                    value.getClass();
                    return ProtoAdapter.INT32.encodedSizeWithTag(1, value.result_status) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.EndActivityResult redact(BlockerAction.EndActivityResult value) {
                    value.getClass();
                    return BlockerAction.EndActivityResult.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.EndActivityResult value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, value.result_status);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ EndActivityResult(Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ EndActivityResult copy$default(EndActivityResult endActivityResult, Integer num, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = endActivityResult.result_status;
            }
            if ((i & 2) != 0) {
                byteString = endActivityResult.unknownFields();
            }
            return endActivityResult.copy(num, byteString);
        }

        public final EndActivityResult copy(Integer result_status, ByteString unknownFields) {
            unknownFields.getClass();
            return new EndActivityResult(result_status, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EndActivityResult)) {
                return false;
            }
            EndActivityResult endActivityResult = (EndActivityResult) other;
            return Intrinsics.areEqual(unknownFields(), endActivityResult.unknownFields()) && Intrinsics.areEqual(this.result_status, endActivityResult.result_status);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.result_status;
            int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.result_status = this.result_status;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.result_status;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("result_status=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EndActivityResult{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityResult;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EndActivityResult build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EndActivityResult() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EndActivityResult(Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.result_status = num;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction$Builder;", "actions", "", "Lcom/squareup/protos/franklin/api/BlockerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class MenuAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MenuAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<BlockerAction> actions;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;", "<init>", "()V", "actions", "", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<BlockerAction> actions = EmptyList.INSTANCE;

            public final Builder actions(List<BlockerAction> actions) {
                actions.getClass();
                TransactorKt.checkElementsNotNull(actions);
                this.actions = actions;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public MenuAction build() {
                return new MenuAction(this.actions, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MenuAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$MenuAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.MenuAction decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.MenuAction(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(BlockerAction.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.MenuAction value) {
                    writer.getClass();
                    value.getClass();
                    BlockerAction.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.actions);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.MenuAction value) {
                    value.getClass();
                    return BlockerAction.ADAPTER.asRepeated().encodedSizeWithTag(1, value.actions) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.MenuAction redact(BlockerAction.MenuAction value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.actions, BlockerAction.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.MenuAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.actions);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MenuAction(List<BlockerAction> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.actions = TransactorKt.immutableCopyOf("actions", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MenuAction copy$default(MenuAction menuAction, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = menuAction.actions;
            }
            if ((i & 2) != 0) {
                byteString = menuAction.unknownFields();
            }
            return menuAction.copy(list, byteString);
        }

        public final MenuAction copy(List<BlockerAction> actions, ByteString unknownFields) {
            actions.getClass();
            unknownFields.getClass();
            return new MenuAction(actions, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MenuAction)) {
                return false;
            }
            MenuAction menuAction = (MenuAction) other;
            return Intrinsics.areEqual(unknownFields(), menuAction.unknownFields()) && Intrinsics.areEqual(this.actions, menuAction.actions);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.actions.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.actions = this.actions;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.actions.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("actions=", arrayList, this.actions);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MenuAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ MenuAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public MenuAction(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public MenuAction() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction$Builder;", "url", "", "submit_id", "direction", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class OpenExternalURLAndSubmitAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenExternalURLAndSubmitAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$SubmitAction$AnimationDirection#ADAPTER", schemaIndex = 2, tag = 3)
        public final SubmitAction.AnimationDirection direction;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String submit_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String url;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;", "<init>", "()V", "url", "", "submit_id", "direction", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction$AnimationDirection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public SubmitAction.AnimationDirection direction;
            public String submit_id;
            public String url;

            @Override // com.squareup.wire.Message.Builder
            public OpenExternalURLAndSubmitAction build() {
                return new OpenExternalURLAndSubmitAction(this.url, this.submit_id, this.direction, buildUnknownFields());
            }

            public final Builder direction(SubmitAction.AnimationDirection direction) {
                this.direction = direction;
                return this;
            }

            public final Builder submit_id(String submit_id) {
                this.submit_id = submit_id;
                return this;
            }

            public final Builder url(String url) {
                this.url = url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenExternalURLAndSubmitAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$OpenExternalURLAndSubmitAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.OpenExternalURLAndSubmitAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.OpenExternalURLAndSubmitAction((String) obj, (String) obj2, (BlockerAction.SubmitAction.AnimationDirection) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = BlockerAction.SubmitAction.AnimationDirection.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.OpenExternalURLAndSubmitAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.url);
                    protoAdapter2.encodeWithTag(writer, 2, value.submit_id);
                    BlockerAction.SubmitAction.AnimationDirection.ADAPTER.encodeWithTag(writer, 3, value.direction);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.OpenExternalURLAndSubmitAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return BlockerAction.SubmitAction.AnimationDirection.ADAPTER.encodedSizeWithTag(3, value.direction) + protoAdapter2.encodedSizeWithTag(2, value.submit_id) + protoAdapter2.encodedSizeWithTag(1, value.url) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.OpenExternalURLAndSubmitAction redact(BlockerAction.OpenExternalURLAndSubmitAction value) {
                    value.getClass();
                    return BlockerAction.OpenExternalURLAndSubmitAction.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.OpenExternalURLAndSubmitAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.SubmitAction.AnimationDirection.ADAPTER.encodeWithTag(writer, 3, value.direction);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.submit_id);
                    protoAdapter2.encodeWithTag(writer, 1, value.url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ OpenExternalURLAndSubmitAction(String str, String str2, SubmitAction.AnimationDirection animationDirection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : animationDirection, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ OpenExternalURLAndSubmitAction copy$default(OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction, String str, String str2, SubmitAction.AnimationDirection animationDirection, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openExternalURLAndSubmitAction.url;
            }
            if ((i & 2) != 0) {
                str2 = openExternalURLAndSubmitAction.submit_id;
            }
            if ((i & 4) != 0) {
                animationDirection = openExternalURLAndSubmitAction.direction;
            }
            if ((i & 8) != 0) {
                byteString = openExternalURLAndSubmitAction.unknownFields();
            }
            return openExternalURLAndSubmitAction.copy(str, str2, animationDirection, byteString);
        }

        public final OpenExternalURLAndSubmitAction copy(String url, String submit_id, SubmitAction.AnimationDirection direction, ByteString unknownFields) {
            unknownFields.getClass();
            return new OpenExternalURLAndSubmitAction(url, submit_id, direction, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OpenExternalURLAndSubmitAction)) {
                return false;
            }
            OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction = (OpenExternalURLAndSubmitAction) other;
            return Intrinsics.areEqual(unknownFields(), openExternalURLAndSubmitAction.unknownFields()) && Intrinsics.areEqual(this.url, openExternalURLAndSubmitAction.url) && Intrinsics.areEqual(this.submit_id, openExternalURLAndSubmitAction.submit_id) && this.direction == openExternalURLAndSubmitAction.direction;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.submit_id;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            SubmitAction.AnimationDirection animationDirection = this.direction;
            int hashCode4 = hashCode3 + (animationDirection != null ? animationDirection.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.url = this.url;
            builder.submit_id = this.submit_id;
            builder.direction = this.direction;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            String str2 = this.submit_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "submit_id=", arrayList);
            }
            SubmitAction.AnimationDirection animationDirection = this.direction;
            if (animationDirection != null) {
                arrayList.add("direction=" + animationDirection);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenExternalURLAndSubmitAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OpenExternalURLAndSubmitAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public OpenExternalURLAndSubmitAction() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenExternalURLAndSubmitAction(String str, String str2, SubmitAction.AnimationDirection animationDirection, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
            this.submit_id = str2;
            this.direction = animationDirection;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction$Builder;", "blocker_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class RetreatAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RetreatAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String blocker_id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;", "<init>", "()V", "blocker_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String blocker_id;

            public final Builder blocker_id(String blocker_id) {
                this.blocker_id = blocker_id;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public RetreatAction build() {
                return new RetreatAction(this.blocker_id, buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RetreatAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$RetreatAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.RetreatAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.RetreatAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.RetreatAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.blocker_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.RetreatAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.blocker_id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.RetreatAction redact(BlockerAction.RetreatAction value) {
                    value.getClass();
                    return BlockerAction.RetreatAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.RetreatAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.blocker_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ RetreatAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ RetreatAction copy$default(RetreatAction retreatAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = retreatAction.blocker_id;
            }
            if ((i & 2) != 0) {
                byteString = retreatAction.unknownFields();
            }
            return retreatAction.copy(str, byteString);
        }

        public final RetreatAction copy(String blocker_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new RetreatAction(blocker_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof RetreatAction)) {
                return false;
            }
            RetreatAction retreatAction = (RetreatAction) other;
            return Intrinsics.areEqual(unknownFields(), retreatAction.unknownFields()) && Intrinsics.areEqual(this.blocker_id, retreatAction.blocker_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.blocker_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.blocker_id = this.blocker_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.blocker_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "blocker_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RetreatAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ RetreatAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RetreatAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetreatAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.blocker_id = str;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction$Builder;", "text_data", "", "title", "email_subject", "sms_recipient", "after_successful_sms_action", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "after_successful_sms_blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ShareTextAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShareTextAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction$SubmitAction#ADAPTER", schemaIndex = 4, tag = 5)
        public final SubmitAction after_successful_sms_action;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 5, tag = 6)
        public final BlockerAction after_successful_sms_blocker_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String email_subject;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String sms_recipient;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String text_data;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;", "<init>", "()V", "text_data", "", "title", "email_subject", "sms_recipient", "after_successful_sms_action", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "after_successful_sms_blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public SubmitAction after_successful_sms_action;
            public BlockerAction after_successful_sms_blocker_action;
            public String email_subject;
            public String sms_recipient;
            public String text_data;
            public String title;

            public final Builder after_successful_sms_action(SubmitAction after_successful_sms_action) {
                this.after_successful_sms_action = after_successful_sms_action;
                return this;
            }

            public final Builder after_successful_sms_blocker_action(BlockerAction after_successful_sms_blocker_action) {
                this.after_successful_sms_blocker_action = after_successful_sms_blocker_action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ShareTextAction build() {
                return new ShareTextAction(this.text_data, this.title, this.email_subject, this.sms_recipient, this.after_successful_sms_action, this.after_successful_sms_blocker_action, buildUnknownFields());
            }

            public final Builder email_subject(String email_subject) {
                this.email_subject = email_subject;
                return this;
            }

            public final Builder sms_recipient(String sms_recipient) {
                this.sms_recipient = sms_recipient;
                return this;
            }

            public final Builder text_data(String text_data) {
                this.text_data = text_data;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShareTextAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ShareTextAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ShareTextAction decode(ProtoReader reader) {
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
                            return new BlockerAction.ShareTextAction((String) obj, (String) obj2, (String) obj3, (String) obj4, (BlockerAction.SubmitAction) obj5, (BlockerAction) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                obj5 = TransactorKt.decodeMessageOrMerge(BlockerAction.SubmitAction.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj6);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ShareTextAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.text_data);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.email_subject);
                    protoAdapter2.encodeWithTag(writer, 4, value.sms_recipient);
                    BlockerAction.SubmitAction.ADAPTER.encodeWithTag(writer, 5, value.after_successful_sms_action);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 6, value.after_successful_sms_blocker_action);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ShareTextAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return BlockerAction.ADAPTER.encodedSizeWithTag(6, value.after_successful_sms_blocker_action) + BlockerAction.SubmitAction.ADAPTER.encodedSizeWithTag(5, value.after_successful_sms_action) + protoAdapter2.encodedSizeWithTag(4, value.sms_recipient) + protoAdapter2.encodedSizeWithTag(3, value.email_subject) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.text_data) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ShareTextAction redact(BlockerAction.ShareTextAction value) {
                    value.getClass();
                    BlockerAction.SubmitAction submitAction = value.after_successful_sms_action;
                    BlockerAction.SubmitAction submitAction2 = submitAction != null ? (BlockerAction.SubmitAction) BlockerAction.SubmitAction.ADAPTER.redact(submitAction) : null;
                    BlockerAction blockerAction = value.after_successful_sms_blocker_action;
                    return BlockerAction.ShareTextAction.copy$default(value, null, null, null, null, submitAction2, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, ByteString.EMPTY, 15, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ShareTextAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    BlockerAction.ADAPTER.encodeWithTag(writer, 6, value.after_successful_sms_blocker_action);
                    BlockerAction.SubmitAction.ADAPTER.encodeWithTag(writer, 5, value.after_successful_sms_action);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.sms_recipient);
                    protoAdapter2.encodeWithTag(writer, 3, value.email_subject);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 1, value.text_data);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShareTextAction(String str, String str2, String str3, String str4, SubmitAction submitAction, BlockerAction blockerAction, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : submitAction, (i & 32) != 0 ? null : blockerAction, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShareTextAction copy$default(ShareTextAction shareTextAction, String str, String str2, String str3, String str4, SubmitAction submitAction, BlockerAction blockerAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareTextAction.text_data;
            }
            if ((i & 2) != 0) {
                str2 = shareTextAction.title;
            }
            if ((i & 4) != 0) {
                str3 = shareTextAction.email_subject;
            }
            if ((i & 8) != 0) {
                str4 = shareTextAction.sms_recipient;
            }
            if ((i & 16) != 0) {
                submitAction = shareTextAction.after_successful_sms_action;
            }
            if ((i & 32) != 0) {
                blockerAction = shareTextAction.after_successful_sms_blocker_action;
            }
            if ((i & 64) != 0) {
                byteString = shareTextAction.unknownFields();
            }
            BlockerAction blockerAction2 = blockerAction;
            ByteString byteString2 = byteString;
            SubmitAction submitAction2 = submitAction;
            String str5 = str3;
            return shareTextAction.copy(str, str2, str5, str4, submitAction2, blockerAction2, byteString2);
        }

        public final ShareTextAction copy(String text_data, String title, String email_subject, String sms_recipient, SubmitAction after_successful_sms_action, BlockerAction after_successful_sms_blocker_action, ByteString unknownFields) {
            unknownFields.getClass();
            return new ShareTextAction(text_data, title, email_subject, sms_recipient, after_successful_sms_action, after_successful_sms_blocker_action, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShareTextAction)) {
                return false;
            }
            ShareTextAction shareTextAction = (ShareTextAction) other;
            return Intrinsics.areEqual(unknownFields(), shareTextAction.unknownFields()) && Intrinsics.areEqual(this.text_data, shareTextAction.text_data) && Intrinsics.areEqual(this.title, shareTextAction.title) && Intrinsics.areEqual(this.email_subject, shareTextAction.email_subject) && Intrinsics.areEqual(this.sms_recipient, shareTextAction.sms_recipient) && Intrinsics.areEqual(this.after_successful_sms_action, shareTextAction.after_successful_sms_action) && Intrinsics.areEqual(this.after_successful_sms_blocker_action, shareTextAction.after_successful_sms_blocker_action);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text_data;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.email_subject;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.sms_recipient;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            SubmitAction submitAction = this.after_successful_sms_action;
            int hashCode6 = (hashCode5 + (submitAction != null ? submitAction.hashCode() : 0)) * 37;
            BlockerAction blockerAction = this.after_successful_sms_blocker_action;
            int hashCode7 = hashCode6 + (blockerAction != null ? blockerAction.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text_data = this.text_data;
            builder.title = this.title;
            builder.email_subject = this.email_subject;
            builder.sms_recipient = this.sms_recipient;
            builder.after_successful_sms_action = this.after_successful_sms_action;
            builder.after_successful_sms_blocker_action = this.after_successful_sms_blocker_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text_data;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text_data=", arrayList);
            }
            String str2 = this.title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
            }
            String str3 = this.email_subject;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "email_subject=", arrayList);
            }
            String str4 = this.sms_recipient;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sms_recipient=", arrayList);
            }
            SubmitAction submitAction = this.after_successful_sms_action;
            if (submitAction != null) {
                arrayList.add("after_successful_sms_action=" + submitAction);
            }
            BlockerAction blockerAction = this.after_successful_sms_blocker_action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("after_successful_sms_blocker_action=", blockerAction, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShareTextAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShareTextAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ShareTextAction() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareTextAction(String str, String str2, String str3, String str4, SubmitAction submitAction, BlockerAction blockerAction, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text_data = str;
            this.title = str2;
            this.email_subject = str3;
            this.sms_recipient = str4;
            this.after_successful_sms_action = submitAction;
            this.after_successful_sms_blocker_action = blockerAction;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction$Builder;", "subform_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ShowOverlayScreenAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShowOverlayScreenAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String subform_id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;", "<init>", "()V", "subform_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String subform_id;

            @Override // com.squareup.wire.Message.Builder
            public ShowOverlayScreenAction build() {
                return new ShowOverlayScreenAction(this.subform_id, buildUnknownFields());
            }

            public final Builder subform_id(String subform_id) {
                this.subform_id = subform_id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShowOverlayScreenAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ShowOverlayScreenAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ShowOverlayScreenAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ShowOverlayScreenAction((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ShowOverlayScreenAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.subform_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ShowOverlayScreenAction value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.subform_id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ShowOverlayScreenAction redact(BlockerAction.ShowOverlayScreenAction value) {
                    value.getClass();
                    return BlockerAction.ShowOverlayScreenAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ShowOverlayScreenAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.subform_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShowOverlayScreenAction(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShowOverlayScreenAction copy$default(ShowOverlayScreenAction showOverlayScreenAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showOverlayScreenAction.subform_id;
            }
            if ((i & 2) != 0) {
                byteString = showOverlayScreenAction.unknownFields();
            }
            return showOverlayScreenAction.copy(str, byteString);
        }

        public final ShowOverlayScreenAction copy(String subform_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new ShowOverlayScreenAction(subform_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShowOverlayScreenAction)) {
                return false;
            }
            ShowOverlayScreenAction showOverlayScreenAction = (ShowOverlayScreenAction) other;
            return Intrinsics.areEqual(unknownFields(), showOverlayScreenAction.unknownFields()) && Intrinsics.areEqual(this.subform_id, showOverlayScreenAction.subform_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.subform_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.subform_id = this.subform_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.subform_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subform_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShowOverlayScreenAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShowOverlayScreenAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowOverlayScreenAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowOverlayScreenAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.subform_id = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SignOutAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SignOutAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public SignOutAction build() {
                return new SignOutAction(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SignOutAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$SignOutAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.SignOutAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.SignOutAction(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.SignOutAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.SignOutAction value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.SignOutAction redact(BlockerAction.SignOutAction value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.SignOutAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SignOutAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SignOutAction copy$default(SignOutAction signOutAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = signOutAction.unknownFields();
            }
            return signOutAction.copy(byteString);
        }

        public final SignOutAction copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new SignOutAction(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof SignOutAction) && Intrinsics.areEqual(unknownFields(), ((SignOutAction) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "SignOutAction{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SignOutAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SignOutAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignOutAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SkipBlockerAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SkipBlockerAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public SkipBlockerAction build() {
                return new SkipBlockerAction(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SkipBlockerAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$SkipBlockerAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.SkipBlockerAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.SkipBlockerAction(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.SkipBlockerAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.SkipBlockerAction value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.SkipBlockerAction redact(BlockerAction.SkipBlockerAction value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.SkipBlockerAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SkipBlockerAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SkipBlockerAction copy$default(SkipBlockerAction skipBlockerAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = skipBlockerAction.unknownFields();
            }
            return skipBlockerAction.copy(byteString);
        }

        public final SkipBlockerAction copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new SkipBlockerAction(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof SkipBlockerAction) && Intrinsics.areEqual(unknownFields(), ((SkipBlockerAction) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            return "SkipBlockerAction{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SkipBlockerAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SkipBlockerAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SkipBlockerAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction$Builder;", "file_url", "", "title", "extension", "loading_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ViewFileAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ViewFileAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String extension;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String file_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String loading_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;", "<init>", "()V", "file_url", "", "title", "extension", "loading_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String extension;
            public String file_url;
            public String loading_text;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public ViewFileAction build() {
                return new ViewFileAction(this.file_url, this.title, this.extension, this.loading_text, buildUnknownFields());
            }

            public final Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            public final Builder file_url(String file_url) {
                this.file_url = file_url;
                return this;
            }

            public final Builder loading_text(String loading_text) {
                this.loading_text = loading_text;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ViewFileAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.BlockerAction$ViewFileAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ViewFileAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BlockerAction.ViewFileAction((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BlockerAction.ViewFileAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.file_url);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.extension);
                    protoAdapter2.encodeWithTag(writer, 4, value.loading_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BlockerAction.ViewFileAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.loading_text) + protoAdapter2.encodedSizeWithTag(3, value.extension) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.file_url) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BlockerAction.ViewFileAction redact(BlockerAction.ViewFileAction value) {
                    value.getClass();
                    return BlockerAction.ViewFileAction.copy$default(value, null, null, null, null, ByteString.EMPTY, 13, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BlockerAction.ViewFileAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.loading_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.extension);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 1, value.file_url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ViewFileAction(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ViewFileAction copy$default(ViewFileAction viewFileAction, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewFileAction.file_url;
            }
            if ((i & 2) != 0) {
                str2 = viewFileAction.title;
            }
            if ((i & 4) != 0) {
                str3 = viewFileAction.extension;
            }
            if ((i & 8) != 0) {
                str4 = viewFileAction.loading_text;
            }
            if ((i & 16) != 0) {
                byteString = viewFileAction.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str5 = str3;
            return viewFileAction.copy(str, str2, str5, str4, byteString2);
        }

        public final ViewFileAction copy(String file_url, String title, String extension, String loading_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new ViewFileAction(file_url, title, extension, loading_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ViewFileAction)) {
                return false;
            }
            ViewFileAction viewFileAction = (ViewFileAction) other;
            return Intrinsics.areEqual(unknownFields(), viewFileAction.unknownFields()) && Intrinsics.areEqual(this.file_url, viewFileAction.file_url) && Intrinsics.areEqual(this.title, viewFileAction.title) && Intrinsics.areEqual(this.extension, viewFileAction.extension) && Intrinsics.areEqual(this.loading_text, viewFileAction.loading_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.file_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.extension;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.loading_text;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.file_url = this.file_url;
            builder.title = this.title;
            builder.extension = this.extension;
            builder.loading_text = this.loading_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.file_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "file_url=", arrayList);
            }
            if (this.title != null) {
                arrayList.add("title=██");
            }
            String str2 = this.extension;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "extension=", arrayList);
            }
            String str3 = this.loading_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loading_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ViewFileAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ViewFileAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ViewFileAction() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewFileAction(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.file_url = str;
            this.title = str2;
            this.extension = str3;
            this.loading_text = str4;
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0015\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "", "<init>", "()V", "DelayedAction", "DialogAction", "MenuAction", "ChangeElementTextAction", "EndFlowAction", "OpenUrlAction", "SkipBlockerAction", "SubmitAction", "InternalNavigationAction", "SignOutAction", "ShareAction", "ViewAction", "CopyAction", "BackNavigationAction", "ShareTextAction", "EndActivityAction", "ShowOverlayScreenAction", "HapticFeedbackAction", "AdvanceAction", "RetreatAction", "OpenExternalUrlAndSubmitAction", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$AdvanceAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$BackNavigationAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$ChangeElementTextAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$CopyAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$DelayedAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$DialogAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$EndActivityAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$EndFlowAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$HapticFeedbackAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$InternalNavigationAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$MenuAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$OpenExternalUrlAndSubmitAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$OpenUrlAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$RetreatAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$ShareAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$ShareTextAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$ShowOverlayScreenAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$SignOutAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$SkipBlockerAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$SubmitAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action$ViewAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class Action {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$AdvanceAction#ADAPTER", declaredName = "advance_action", tag = 24)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$AdvanceAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$AdvanceAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AdvanceAction extends Action {
            private final AdvanceAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdvanceAction(AdvanceAction advanceAction) {
                super(null);
                advanceAction.getClass();
                this.value = advanceAction;
            }

            public static /* synthetic */ AdvanceAction copy$default(AdvanceAction advanceAction, AdvanceAction advanceAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    advanceAction2 = advanceAction.value;
                }
                return advanceAction.copy(advanceAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final AdvanceAction getValue() {
                return this.value;
            }

            public final AdvanceAction copy(AdvanceAction value) {
                value.getClass();
                return new AdvanceAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AdvanceAction) && Intrinsics.areEqual(this.value, ((AdvanceAction) other).value);
            }

            public final AdvanceAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AdvanceAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$BackNavigationAction#ADAPTER", declaredName = "back_navigation_action", tag = 14)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$BackNavigationAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$BackNavigationAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class BackNavigationAction extends Action {
            private final BackNavigationAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BackNavigationAction(BackNavigationAction backNavigationAction) {
                super(null);
                backNavigationAction.getClass();
                this.value = backNavigationAction;
            }

            public static /* synthetic */ BackNavigationAction copy$default(BackNavigationAction backNavigationAction, BackNavigationAction backNavigationAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    backNavigationAction2 = backNavigationAction.value;
                }
                return backNavigationAction.copy(backNavigationAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final BackNavigationAction getValue() {
                return this.value;
            }

            public final BackNavigationAction copy(BackNavigationAction value) {
                value.getClass();
                return new BackNavigationAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BackNavigationAction) && Intrinsics.areEqual(this.value, ((BackNavigationAction) other).value);
            }

            public final BackNavigationAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "BackNavigationAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ChangeElementTextAction#ADAPTER", declaredName = "change_element_text_action", tag = 19)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$ChangeElementTextAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ChangeElementTextAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ChangeElementTextAction extends Action {
            private final ChangeElementTextAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChangeElementTextAction(ChangeElementTextAction changeElementTextAction) {
                super(null);
                changeElementTextAction.getClass();
                this.value = changeElementTextAction;
            }

            public static /* synthetic */ ChangeElementTextAction copy$default(ChangeElementTextAction changeElementTextAction, ChangeElementTextAction changeElementTextAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    changeElementTextAction2 = changeElementTextAction.value;
                }
                return changeElementTextAction.copy(changeElementTextAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final ChangeElementTextAction getValue() {
                return this.value;
            }

            public final ChangeElementTextAction copy(ChangeElementTextAction value) {
                value.getClass();
                return new ChangeElementTextAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChangeElementTextAction) && Intrinsics.areEqual(this.value, ((ChangeElementTextAction) other).value);
            }

            public final ChangeElementTextAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ChangeElementTextAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$CopyAction#ADAPTER", declaredName = "copy_action", tag = 13)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$CopyAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$CopyAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CopyAction extends Action {
            private final CopyAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CopyAction(CopyAction copyAction) {
                super(null);
                copyAction.getClass();
                this.value = copyAction;
            }

            public static /* synthetic */ CopyAction copy$default(CopyAction copyAction, CopyAction copyAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    copyAction2 = copyAction.value;
                }
                return copyAction.copy(copyAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final CopyAction getValue() {
                return this.value;
            }

            public final CopyAction copy(CopyAction value) {
                value.getClass();
                return new CopyAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CopyAction) && Intrinsics.areEqual(this.value, ((CopyAction) other).value);
            }

            public final CopyAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CopyAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$DelayedAction#ADAPTER", declaredName = "delayed_action", tag = 20)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$DelayedAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$DelayedAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DelayedAction extends Action {
            private final DelayedAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DelayedAction(DelayedAction delayedAction) {
                super(null);
                delayedAction.getClass();
                this.value = delayedAction;
            }

            public static /* synthetic */ DelayedAction copy$default(DelayedAction delayedAction, DelayedAction delayedAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    delayedAction2 = delayedAction.value;
                }
                return delayedAction.copy(delayedAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final DelayedAction getValue() {
                return this.value;
            }

            public final DelayedAction copy(DelayedAction value) {
                value.getClass();
                return new DelayedAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DelayedAction) && Intrinsics.areEqual(this.value, ((DelayedAction) other).value);
            }

            public final DelayedAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DelayedAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$DialogAction#ADAPTER", declaredName = "dialog_action", tag = 12)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$DialogAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$DialogAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DialogAction extends Action {
            private final DialogAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DialogAction(DialogAction dialogAction) {
                super(null);
                dialogAction.getClass();
                this.value = dialogAction;
            }

            public static /* synthetic */ DialogAction copy$default(DialogAction dialogAction, DialogAction dialogAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    dialogAction2 = dialogAction.value;
                }
                return dialogAction.copy(dialogAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final DialogAction getValue() {
                return this.value;
            }

            public final DialogAction copy(DialogAction value) {
                value.getClass();
                return new DialogAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DialogAction) && Intrinsics.areEqual(this.value, ((DialogAction) other).value);
            }

            public final DialogAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DialogAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$EndActivityAction#ADAPTER", declaredName = "end_activity_action", tag = 18)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$EndActivityAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$EndActivityAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EndActivityAction extends Action {
            private final EndActivityAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EndActivityAction(EndActivityAction endActivityAction) {
                super(null);
                endActivityAction.getClass();
                this.value = endActivityAction;
            }

            public static /* synthetic */ EndActivityAction copy$default(EndActivityAction endActivityAction, EndActivityAction endActivityAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    endActivityAction2 = endActivityAction.value;
                }
                return endActivityAction.copy(endActivityAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final EndActivityAction getValue() {
                return this.value;
            }

            public final EndActivityAction copy(EndActivityAction value) {
                value.getClass();
                return new EndActivityAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EndActivityAction) && Intrinsics.areEqual(this.value, ((EndActivityAction) other).value);
            }

            public final EndActivityAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EndActivityAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$EndFlowAction#ADAPTER", declaredName = "end_flow_action", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$EndFlowAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$EndFlowAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class EndFlowAction extends Action {
            private final EndFlowAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EndFlowAction(EndFlowAction endFlowAction) {
                super(null);
                endFlowAction.getClass();
                this.value = endFlowAction;
            }

            public static /* synthetic */ EndFlowAction copy$default(EndFlowAction endFlowAction, EndFlowAction endFlowAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    endFlowAction2 = endFlowAction.value;
                }
                return endFlowAction.copy(endFlowAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final EndFlowAction getValue() {
                return this.value;
            }

            public final EndFlowAction copy(EndFlowAction value) {
                value.getClass();
                return new EndFlowAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EndFlowAction) && Intrinsics.areEqual(this.value, ((EndFlowAction) other).value);
            }

            public final EndFlowAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EndFlowAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$HapticFeedbackAction#ADAPTER", declaredName = "haptic_feedback_action", tag = 22)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$HapticFeedbackAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$HapticFeedbackAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HapticFeedbackAction extends Action {
            private final HapticFeedbackAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HapticFeedbackAction(HapticFeedbackAction hapticFeedbackAction) {
                super(null);
                hapticFeedbackAction.getClass();
                this.value = hapticFeedbackAction;
            }

            public static /* synthetic */ HapticFeedbackAction copy$default(HapticFeedbackAction hapticFeedbackAction, HapticFeedbackAction hapticFeedbackAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    hapticFeedbackAction2 = hapticFeedbackAction.value;
                }
                return hapticFeedbackAction.copy(hapticFeedbackAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final HapticFeedbackAction getValue() {
                return this.value;
            }

            public final HapticFeedbackAction copy(HapticFeedbackAction value) {
                value.getClass();
                return new HapticFeedbackAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HapticFeedbackAction) && Intrinsics.areEqual(this.value, ((HapticFeedbackAction) other).value);
            }

            public final HapticFeedbackAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "HapticFeedbackAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$InternalNavigationAction#ADAPTER", declaredName = "internal_navigation_action", tag = 8)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$InternalNavigationAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$InternalNavigationAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InternalNavigationAction extends Action {
            private final InternalNavigationAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InternalNavigationAction(InternalNavigationAction internalNavigationAction) {
                super(null);
                internalNavigationAction.getClass();
                this.value = internalNavigationAction;
            }

            public static /* synthetic */ InternalNavigationAction copy$default(InternalNavigationAction internalNavigationAction, InternalNavigationAction internalNavigationAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    internalNavigationAction2 = internalNavigationAction.value;
                }
                return internalNavigationAction.copy(internalNavigationAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final InternalNavigationAction getValue() {
                return this.value;
            }

            public final InternalNavigationAction copy(InternalNavigationAction value) {
                value.getClass();
                return new InternalNavigationAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InternalNavigationAction) && Intrinsics.areEqual(this.value, ((InternalNavigationAction) other).value);
            }

            public final InternalNavigationAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InternalNavigationAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$MenuAction#ADAPTER", declaredName = "menu_action", tag = 4)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$MenuAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$MenuAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MenuAction extends Action {
            private final MenuAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MenuAction(MenuAction menuAction) {
                super(null);
                menuAction.getClass();
                this.value = menuAction;
            }

            public static /* synthetic */ MenuAction copy$default(MenuAction menuAction, MenuAction menuAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    menuAction2 = menuAction.value;
                }
                return menuAction.copy(menuAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final MenuAction getValue() {
                return this.value;
            }

            public final MenuAction copy(MenuAction value) {
                value.getClass();
                return new MenuAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MenuAction) && Intrinsics.areEqual(this.value, ((MenuAction) other).value);
            }

            public final MenuAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MenuAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$OpenExternalURLAndSubmitAction#ADAPTER", declaredName = "open_external_url_and_submit_action", tag = 27)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$OpenExternalUrlAndSubmitAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$OpenExternalURLAndSubmitAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OpenExternalUrlAndSubmitAction extends Action {
            private final OpenExternalURLAndSubmitAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenExternalUrlAndSubmitAction(OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction) {
                super(null);
                openExternalURLAndSubmitAction.getClass();
                this.value = openExternalURLAndSubmitAction;
            }

            public static /* synthetic */ OpenExternalUrlAndSubmitAction copy$default(OpenExternalUrlAndSubmitAction openExternalUrlAndSubmitAction, OpenExternalURLAndSubmitAction openExternalURLAndSubmitAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    openExternalURLAndSubmitAction = openExternalUrlAndSubmitAction.value;
                }
                return openExternalUrlAndSubmitAction.copy(openExternalURLAndSubmitAction);
            }

            /* renamed from: component1, reason: from getter */
            public final OpenExternalURLAndSubmitAction getValue() {
                return this.value;
            }

            public final OpenExternalUrlAndSubmitAction copy(OpenExternalURLAndSubmitAction value) {
                value.getClass();
                return new OpenExternalUrlAndSubmitAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenExternalUrlAndSubmitAction) && Intrinsics.areEqual(this.value, ((OpenExternalUrlAndSubmitAction) other).value);
            }

            public final OpenExternalURLAndSubmitAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpenExternalUrlAndSubmitAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$OpenURLAction#ADAPTER", declaredName = "open_url_action", tag = 5)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$OpenUrlAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$OpenURLAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OpenUrlAction extends Action {
            private final OpenURLAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrlAction(OpenURLAction openURLAction) {
                super(null);
                openURLAction.getClass();
                this.value = openURLAction;
            }

            public static /* synthetic */ OpenUrlAction copy$default(OpenUrlAction openUrlAction, OpenURLAction openURLAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    openURLAction = openUrlAction.value;
                }
                return openUrlAction.copy(openURLAction);
            }

            /* renamed from: component1, reason: from getter */
            public final OpenURLAction getValue() {
                return this.value;
            }

            public final OpenUrlAction copy(OpenURLAction value) {
                value.getClass();
                return new OpenUrlAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenUrlAction) && Intrinsics.areEqual(this.value, ((OpenUrlAction) other).value);
            }

            public final OpenURLAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpenUrlAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$RetreatAction#ADAPTER", declaredName = "retreat_action", tag = 25)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$RetreatAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$RetreatAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RetreatAction extends Action {
            private final RetreatAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetreatAction(RetreatAction retreatAction) {
                super(null);
                retreatAction.getClass();
                this.value = retreatAction;
            }

            public static /* synthetic */ RetreatAction copy$default(RetreatAction retreatAction, RetreatAction retreatAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    retreatAction2 = retreatAction.value;
                }
                return retreatAction.copy(retreatAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final RetreatAction getValue() {
                return this.value;
            }

            public final RetreatAction copy(RetreatAction value) {
                value.getClass();
                return new RetreatAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RetreatAction) && Intrinsics.areEqual(this.value, ((RetreatAction) other).value);
            }

            public final RetreatAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RetreatAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ShareFileAction#ADAPTER", declaredName = "share_action", tag = 10)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$ShareAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ShareFileAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShareAction extends Action {
            private final ShareFileAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareAction(ShareFileAction shareFileAction) {
                super(null);
                shareFileAction.getClass();
                this.value = shareFileAction;
            }

            public static /* synthetic */ ShareAction copy$default(ShareAction shareAction, ShareFileAction shareFileAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    shareFileAction = shareAction.value;
                }
                return shareAction.copy(shareFileAction);
            }

            /* renamed from: component1, reason: from getter */
            public final ShareFileAction getValue() {
                return this.value;
            }

            public final ShareAction copy(ShareFileAction value) {
                value.getClass();
                return new ShareAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShareAction) && Intrinsics.areEqual(this.value, ((ShareAction) other).value);
            }

            public final ShareFileAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShareAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ShareTextAction#ADAPTER", declaredName = "share_text_action", tag = 15)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$ShareTextAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ShareTextAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShareTextAction extends Action {
            private final ShareTextAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShareTextAction(ShareTextAction shareTextAction) {
                super(null);
                shareTextAction.getClass();
                this.value = shareTextAction;
            }

            public static /* synthetic */ ShareTextAction copy$default(ShareTextAction shareTextAction, ShareTextAction shareTextAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    shareTextAction2 = shareTextAction.value;
                }
                return shareTextAction.copy(shareTextAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final ShareTextAction getValue() {
                return this.value;
            }

            public final ShareTextAction copy(ShareTextAction value) {
                value.getClass();
                return new ShareTextAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShareTextAction) && Intrinsics.areEqual(this.value, ((ShareTextAction) other).value);
            }

            public final ShareTextAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShareTextAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ShowOverlayScreenAction#ADAPTER", declaredName = "show_overlay_screen_action", tag = 21)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$ShowOverlayScreenAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ShowOverlayScreenAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowOverlayScreenAction extends Action {
            private final ShowOverlayScreenAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowOverlayScreenAction(ShowOverlayScreenAction showOverlayScreenAction) {
                super(null);
                showOverlayScreenAction.getClass();
                this.value = showOverlayScreenAction;
            }

            public static /* synthetic */ ShowOverlayScreenAction copy$default(ShowOverlayScreenAction showOverlayScreenAction, ShowOverlayScreenAction showOverlayScreenAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    showOverlayScreenAction2 = showOverlayScreenAction.value;
                }
                return showOverlayScreenAction.copy(showOverlayScreenAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final ShowOverlayScreenAction getValue() {
                return this.value;
            }

            public final ShowOverlayScreenAction copy(ShowOverlayScreenAction value) {
                value.getClass();
                return new ShowOverlayScreenAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowOverlayScreenAction) && Intrinsics.areEqual(this.value, ((ShowOverlayScreenAction) other).value);
            }

            public final ShowOverlayScreenAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowOverlayScreenAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$SignOutAction#ADAPTER", declaredName = "sign_out_action", tag = 9)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$SignOutAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$SignOutAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SignOutAction extends Action {
            private final SignOutAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutAction(SignOutAction signOutAction) {
                super(null);
                signOutAction.getClass();
                this.value = signOutAction;
            }

            public static /* synthetic */ SignOutAction copy$default(SignOutAction signOutAction, SignOutAction signOutAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    signOutAction2 = signOutAction.value;
                }
                return signOutAction.copy(signOutAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final SignOutAction getValue() {
                return this.value;
            }

            public final SignOutAction copy(SignOutAction value) {
                value.getClass();
                return new SignOutAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SignOutAction) && Intrinsics.areEqual(this.value, ((SignOutAction) other).value);
            }

            public final SignOutAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SignOutAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$SkipBlockerAction#ADAPTER", declaredName = "skip_blocker_action", tag = 6)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$SkipBlockerAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$SkipBlockerAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SkipBlockerAction extends Action {
            private final SkipBlockerAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SkipBlockerAction(SkipBlockerAction skipBlockerAction) {
                super(null);
                skipBlockerAction.getClass();
                this.value = skipBlockerAction;
            }

            public static /* synthetic */ SkipBlockerAction copy$default(SkipBlockerAction skipBlockerAction, SkipBlockerAction skipBlockerAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    skipBlockerAction2 = skipBlockerAction.value;
                }
                return skipBlockerAction.copy(skipBlockerAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final SkipBlockerAction getValue() {
                return this.value;
            }

            public final SkipBlockerAction copy(SkipBlockerAction value) {
                value.getClass();
                return new SkipBlockerAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SkipBlockerAction) && Intrinsics.areEqual(this.value, ((SkipBlockerAction) other).value);
            }

            public final SkipBlockerAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SkipBlockerAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$SubmitAction#ADAPTER", declaredName = "submit_action", tag = 7)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$SubmitAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$SubmitAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SubmitAction extends Action {
            private final SubmitAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubmitAction(SubmitAction submitAction) {
                super(null);
                submitAction.getClass();
                this.value = submitAction;
            }

            public static /* synthetic */ SubmitAction copy$default(SubmitAction submitAction, SubmitAction submitAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    submitAction2 = submitAction.value;
                }
                return submitAction.copy(submitAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final SubmitAction getValue() {
                return this.value;
            }

            public final SubmitAction copy(SubmitAction value) {
                value.getClass();
                return new SubmitAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SubmitAction) && Intrinsics.areEqual(this.value, ((SubmitAction) other).value);
            }

            public final SubmitAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SubmitAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ViewFileAction#ADAPTER", declaredName = "view_action", tag = 11)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Action$ViewAction;", "Lcom/squareup/protos/franklin/api/BlockerAction$Action;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ViewFileAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ViewAction extends Action {
            private final ViewFileAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ViewAction(ViewFileAction viewFileAction) {
                super(null);
                viewFileAction.getClass();
                this.value = viewFileAction;
            }

            public static /* synthetic */ ViewAction copy$default(ViewAction viewAction, ViewFileAction viewFileAction, int i, Object obj) {
                if ((i & 1) != 0) {
                    viewFileAction = viewAction.value;
                }
                return viewAction.copy(viewFileAction);
            }

            /* renamed from: component1, reason: from getter */
            public final ViewFileAction getValue() {
                return this.value;
            }

            public final ViewAction copy(ViewFileAction value) {
                value.getClass();
                return new ViewAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ViewAction) && Intrinsics.areEqual(this.value, ((ViewAction) other).value);
            }

            public final ViewFileAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ViewAction(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/BlockerAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/BlockerAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BlockerAction build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "", "<init>", "()V", "ConfirmationDialog", "ConfirmationSheet", "ConditionalConfirmation", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement$ConditionalConfirmation;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement$ConfirmationDialog;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement$ConfirmationSheet;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class ConfirmationElement {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ConditionalConfirmation#ADAPTER", declaredName = "conditional_confirmation", tag = 26)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement$ConditionalConfirmation;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ConditionalConfirmation;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConditionalConfirmation extends ConfirmationElement {
            private final ConditionalConfirmation value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConditionalConfirmation(ConditionalConfirmation conditionalConfirmation) {
                super(null);
                conditionalConfirmation.getClass();
                this.value = conditionalConfirmation;
            }

            public static /* synthetic */ ConditionalConfirmation copy$default(ConditionalConfirmation conditionalConfirmation, ConditionalConfirmation conditionalConfirmation2, int i, Object obj) {
                if ((i & 1) != 0) {
                    conditionalConfirmation2 = conditionalConfirmation.value;
                }
                return conditionalConfirmation.copy(conditionalConfirmation2);
            }

            /* renamed from: component1, reason: from getter */
            public final ConditionalConfirmation getValue() {
                return this.value;
            }

            public final ConditionalConfirmation copy(ConditionalConfirmation value) {
                value.getClass();
                return new ConditionalConfirmation(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConditionalConfirmation) && Intrinsics.areEqual(this.value, ((ConditionalConfirmation) other).value);
            }

            public final ConditionalConfirmation getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ConditionalConfirmation(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ConfirmationDialog#ADAPTER", declaredName = "confirmation_dialog", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement$ConfirmationDialog;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationDialog;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmationDialog extends ConfirmationElement {
            private final ConfirmationDialog value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmationDialog(ConfirmationDialog confirmationDialog) {
                super(null);
                confirmationDialog.getClass();
                this.value = confirmationDialog;
            }

            public static /* synthetic */ ConfirmationDialog copy$default(ConfirmationDialog confirmationDialog, ConfirmationDialog confirmationDialog2, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmationDialog2 = confirmationDialog.value;
                }
                return confirmationDialog.copy(confirmationDialog2);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmationDialog getValue() {
                return this.value;
            }

            public final ConfirmationDialog copy(ConfirmationDialog value) {
                value.getClass();
                return new ConfirmationDialog(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmationDialog) && Intrinsics.areEqual(this.value, ((ConfirmationDialog) other).value);
            }

            public final ConfirmationDialog getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ConfirmationDialog(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.BlockerAction$ConfirmationSheet#ADAPTER", declaredName = "confirmation_sheet", tag = 17)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement$ConfirmationSheet;", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationElement;", "value", "Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;)V", "getValue", "()Lcom/squareup/protos/franklin/api/BlockerAction$ConfirmationSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ConfirmationSheet extends ConfirmationElement {
            private final ConfirmationSheet value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmationSheet(ConfirmationSheet confirmationSheet) {
                super(null);
                confirmationSheet.getClass();
                this.value = confirmationSheet;
            }

            public static /* synthetic */ ConfirmationSheet copy$default(ConfirmationSheet confirmationSheet, ConfirmationSheet confirmationSheet2, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmationSheet2 = confirmationSheet.value;
                }
                return confirmationSheet.copy(confirmationSheet2);
            }

            /* renamed from: component1, reason: from getter */
            public final ConfirmationSheet getValue() {
                return this.value;
            }

            public final ConfirmationSheet copy(ConfirmationSheet value) {
                value.getClass();
                return new ConfirmationSheet(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmationSheet) && Intrinsics.areEqual(this.value, ((ConfirmationSheet) other).value);
            }

            public final ConfirmationSheet getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ConfirmationSheet(value=" + this.value + ")";
            }
        }

        public /* synthetic */ ConfirmationElement(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConfirmationElement() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockerAction(String str, LocalizableString localizableString, ConfirmationElement confirmationElement, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.localized_text = localizableString;
        this.confirmation_element = confirmationElement;
        this.action = action;
    }
}
