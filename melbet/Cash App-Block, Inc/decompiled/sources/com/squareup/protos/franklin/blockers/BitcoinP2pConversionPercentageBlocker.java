package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\f\u000e\u000f\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Builder;", "", "conversion_bps", "Ljava/lang/Long;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "ui_elements", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "exceeded_max_alert", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "Companion", "Builder", "PercentageSelectionUI", "Button", "AlertUI", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BitcoinP2pConversionPercentageBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinP2pConversionPercentageBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
    public final Long conversion_bps;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$AlertUI#ADAPTER", schemaIndex = 2, tag = 3)
    public final AlertUI exceeded_max_alert;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI#ADAPTER", schemaIndex = 1, tag = 2)
    public final PercentageSelectionUI ui_elements;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker;", "<init>", "()V", "conversion_bps", "", "Ljava/lang/Long;", "ui_elements", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "exceeded_max_alert", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Long conversion_bps;
        public AlertUI exceeded_max_alert;
        public PercentageSelectionUI ui_elements;

        @Override // com.squareup.wire.Message.Builder
        public BitcoinP2pConversionPercentageBlocker build() {
            return new BitcoinP2pConversionPercentageBlocker(this.conversion_bps, this.ui_elements, this.exceeded_max_alert, buildUnknownFields());
        }

        public final Builder conversion_bps(Long conversion_bps) {
            this.conversion_bps = conversion_bps;
            return this;
        }

        public final Builder exceeded_max_alert(AlertUI exceeded_max_alert) {
            this.exceeded_max_alert = exceeded_max_alert;
            return this;
        }

        public final Builder ui_elements(PercentageSelectionUI ui_elements) {
            this.ui_elements = ui_elements;
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$Builder;", "action", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$ButtonAction;", AnnotatedPrivateKey.LABEL, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$ButtonAction;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "ButtonAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Button extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Button> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$Button$ButtonAction#ADAPTER", schemaIndex = 0, tag = 1)
        public final ButtonAction action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String label;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;", "<init>", "()V", "action", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$ButtonAction;", AnnotatedPrivateKey.LABEL, "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ButtonAction action;
            public String label;

            public final Builder action(ButtonAction action) {
                this.action = action;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Button build() {
                return new Button(this.action, this.label, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Button.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$Button$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BitcoinP2pConversionPercentageBlocker.Button decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BitcoinP2pConversionPercentageBlocker.Button((BitcoinP2pConversionPercentageBlocker.Button.ButtonAction) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = BitcoinP2pConversionPercentageBlocker.Button.ButtonAction.ADAPTER.decode(reader);
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
                public void encode(ProtoWriter writer, BitcoinP2pConversionPercentageBlocker.Button value) {
                    writer.getClass();
                    value.getClass();
                    BitcoinP2pConversionPercentageBlocker.Button.ButtonAction.ADAPTER.encodeWithTag(writer, 1, value.action);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BitcoinP2pConversionPercentageBlocker.Button value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.label) + BitcoinP2pConversionPercentageBlocker.Button.ButtonAction.ADAPTER.encodedSizeWithTag(1, value.action) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BitcoinP2pConversionPercentageBlocker.Button redact(BitcoinP2pConversionPercentageBlocker.Button value) {
                    value.getClass();
                    return BitcoinP2pConversionPercentageBlocker.Button.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BitcoinP2pConversionPercentageBlocker.Button value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.label);
                    BitcoinP2pConversionPercentageBlocker.Button.ButtonAction.ADAPTER.encodeWithTag(writer, 1, value.action);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Button(ButtonAction buttonAction, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : buttonAction, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Button copy$default(Button button, ButtonAction buttonAction, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                buttonAction = button.action;
            }
            if ((i & 2) != 0) {
                str = button.label;
            }
            if ((i & 4) != 0) {
                byteString = button.unknownFields();
            }
            return button.copy(buttonAction, str, byteString);
        }

        public final Button copy(ButtonAction action, String label, ByteString unknownFields) {
            unknownFields.getClass();
            return new Button(action, label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && this.action == button.action && Intrinsics.areEqual(this.label, button.label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ButtonAction buttonAction = this.action;
            int hashCode2 = (hashCode + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
            String str = this.label;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.action = this.action;
            builder.label = this.label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ButtonAction buttonAction = this.action;
            if (buttonAction != null) {
                arrayList.add("action=" + buttonAction);
            }
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$ButtonAction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUTTON_ACTION_UNSPECIFIED", "CONFIRM", "DISABLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ButtonAction implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ButtonAction[] $VALUES;
            public static final ProtoAdapter ADAPTER;
            public static final ButtonAction BUTTON_ACTION_UNSPECIFIED;
            public static final ButtonAction CONFIRM;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final ButtonAction DISABLE;
            private final int value;

            private static final /* synthetic */ ButtonAction[] $values() {
                return new ButtonAction[]{BUTTON_ACTION_UNSPECIFIED, CONFIRM, DISABLE};
            }

            static {
                final ButtonAction buttonAction = new ButtonAction("BUTTON_ACTION_UNSPECIFIED", 0, 0);
                BUTTON_ACTION_UNSPECIFIED = buttonAction;
                CONFIRM = new ButtonAction("CONFIRM", 1, 1);
                DISABLE = new ButtonAction("DISABLE", 2, 2);
                ButtonAction[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ButtonAction.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, buttonAction) { // from class: com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$Button$ButtonAction$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public BitcoinP2pConversionPercentageBlocker.Button.ButtonAction fromValue(int value) {
                        return BitcoinP2pConversionPercentageBlocker.Button.ButtonAction.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$ButtonAction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$ButtonAction;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ButtonAction fromValue(int value) {
                    if (value == 0) {
                        return ButtonAction.BUTTON_ACTION_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return ButtonAction.CONFIRM;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return ButtonAction.DISABLE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(ButtonAction buttonAction, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.action = buttonAction;
            this.label = str;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BitcoinP2pConversionPercentageBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public BitcoinP2pConversionPercentageBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new BitcoinP2pConversionPercentageBlocker((Long) obj, (BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI) obj2, (BitcoinP2pConversionPercentageBlocker.AlertUI) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(BitcoinP2pConversionPercentageBlocker.AlertUI.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BitcoinP2pConversionPercentageBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.INT64.encodeWithTag(writer, 1, value.conversion_bps);
                BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI.ADAPTER.encodeWithTag(writer, 2, value.ui_elements);
                BitcoinP2pConversionPercentageBlocker.AlertUI.ADAPTER.encodeWithTag(writer, 3, value.exceeded_max_alert);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BitcoinP2pConversionPercentageBlocker value) {
                value.getClass();
                return BitcoinP2pConversionPercentageBlocker.AlertUI.ADAPTER.encodedSizeWithTag(3, value.exceeded_max_alert) + BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI.ADAPTER.encodedSizeWithTag(2, value.ui_elements) + ProtoAdapter.INT64.encodedSizeWithTag(1, value.conversion_bps) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BitcoinP2pConversionPercentageBlocker redact(BitcoinP2pConversionPercentageBlocker value) {
                value.getClass();
                BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI percentageSelectionUI = value.ui_elements;
                BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI percentageSelectionUI2 = percentageSelectionUI != null ? (BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI) BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI.ADAPTER.redact(percentageSelectionUI) : null;
                BitcoinP2pConversionPercentageBlocker.AlertUI alertUI = value.exceeded_max_alert;
                BitcoinP2pConversionPercentageBlocker.AlertUI alertUI2 = alertUI != null ? (BitcoinP2pConversionPercentageBlocker.AlertUI) BitcoinP2pConversionPercentageBlocker.AlertUI.ADAPTER.redact(alertUI) : null;
                ByteString byteString = ByteString.EMPTY;
                Long l = value.conversion_bps;
                byteString.getClass();
                return new BitcoinP2pConversionPercentageBlocker(l, percentageSelectionUI2, alertUI2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BitcoinP2pConversionPercentageBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BitcoinP2pConversionPercentageBlocker.AlertUI.ADAPTER.encodeWithTag(writer, 3, value.exceeded_max_alert);
                BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI.ADAPTER.encodeWithTag(writer, 2, value.ui_elements);
                ProtoAdapter.INT64.encodeWithTag(writer, 1, value.conversion_bps);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinP2pConversionPercentageBlocker(Long l, PercentageSelectionUI percentageSelectionUI, AlertUI alertUI, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.conversion_bps = l;
        this.ui_elements = percentageSelectionUI;
        this.exceeded_max_alert = alertUI;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinP2pConversionPercentageBlocker)) {
            return false;
        }
        BitcoinP2pConversionPercentageBlocker bitcoinP2pConversionPercentageBlocker = (BitcoinP2pConversionPercentageBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinP2pConversionPercentageBlocker.unknownFields()) && Intrinsics.areEqual(this.conversion_bps, bitcoinP2pConversionPercentageBlocker.conversion_bps) && Intrinsics.areEqual(this.ui_elements, bitcoinP2pConversionPercentageBlocker.ui_elements) && Intrinsics.areEqual(this.exceeded_max_alert, bitcoinP2pConversionPercentageBlocker.exceeded_max_alert);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.conversion_bps;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        PercentageSelectionUI percentageSelectionUI = this.ui_elements;
        int hashCode3 = (hashCode2 + (percentageSelectionUI != null ? percentageSelectionUI.hashCode() : 0)) * 37;
        AlertUI alertUI = this.exceeded_max_alert;
        int hashCode4 = hashCode3 + (alertUI != null ? alertUI.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversion_bps = this.conversion_bps;
        builder.ui_elements = this.ui_elements;
        builder.exceeded_max_alert = this.exceeded_max_alert;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.conversion_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("conversion_bps=", l, arrayList);
        }
        PercentageSelectionUI percentageSelectionUI = this.ui_elements;
        if (percentageSelectionUI != null) {
            arrayList.add("ui_elements=" + percentageSelectionUI);
        }
        AlertUI alertUI = this.exceeded_max_alert;
        if (alertUI != null) {
            arrayList.add("exceeded_max_alert=" + alertUI);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinP2pConversionPercentageBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI$Builder;", "title", "", "detail", "acknowledge_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AlertUI extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AlertUI> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String acknowledge_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String detail;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "<init>", "()V", "title", "", "detail", "acknowledge_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String acknowledge_text;
            public String detail;
            public String title;

            public final Builder acknowledge_text(String acknowledge_text) {
                this.acknowledge_text = acknowledge_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AlertUI build() {
                return new AlertUI(this.title, this.detail, this.acknowledge_text, buildUnknownFields());
            }

            public final Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AlertUI.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$AlertUI$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BitcoinP2pConversionPercentageBlocker.AlertUI decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new BitcoinP2pConversionPercentageBlocker.AlertUI((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BitcoinP2pConversionPercentageBlocker.AlertUI value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail);
                    protoAdapter2.encodeWithTag(writer, 3, value.acknowledge_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BitcoinP2pConversionPercentageBlocker.AlertUI value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.acknowledge_text) + protoAdapter2.encodedSizeWithTag(2, value.detail) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BitcoinP2pConversionPercentageBlocker.AlertUI redact(BitcoinP2pConversionPercentageBlocker.AlertUI value) {
                    value.getClass();
                    return BitcoinP2pConversionPercentageBlocker.AlertUI.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BitcoinP2pConversionPercentageBlocker.AlertUI value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.acknowledge_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AlertUI(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AlertUI copy$default(AlertUI alertUI, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alertUI.title;
            }
            if ((i & 2) != 0) {
                str2 = alertUI.detail;
            }
            if ((i & 4) != 0) {
                str3 = alertUI.acknowledge_text;
            }
            if ((i & 8) != 0) {
                byteString = alertUI.unknownFields();
            }
            return alertUI.copy(str, str2, str3, byteString);
        }

        public final AlertUI copy(String title, String detail, String acknowledge_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new AlertUI(title, detail, acknowledge_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AlertUI)) {
                return false;
            }
            AlertUI alertUI = (AlertUI) other;
            return Intrinsics.areEqual(unknownFields(), alertUI.unknownFields()) && Intrinsics.areEqual(this.title, alertUI.title) && Intrinsics.areEqual(this.detail, alertUI.detail) && Intrinsics.areEqual(this.acknowledge_text, alertUI.acknowledge_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.acknowledge_text;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.detail = this.detail;
            builder.acknowledge_text = this.acknowledge_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.detail;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail=", arrayList);
            }
            String str3 = this.acknowledge_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "acknowledge_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AlertUI{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$AlertUI;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AlertUI build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AlertUI() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlertUI(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.detail = str2;
            this.acknowledge_text = str3;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dBu\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0082\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u0096\u0080\u0004J\b\u0010\u001a\u001a\u00020\u0004H\u0016Jt\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI$Builder;", "header", "", "percentage_picker_options_in_basis_points", "", "", "percentage_option_accessibility_hint_template", "custom_amount_subtitle", "custom_amount_accessibility_hint", "primary_button", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;", "secondary_button", "sq_accessibility_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PercentageSelectionUI extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PercentageSelectionUI> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String custom_amount_accessibility_hint;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String custom_amount_subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String percentage_option_accessibility_hint_template;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<Long> percentage_picker_options_in_basis_points;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$Button#ADAPTER", schemaIndex = 5, tag = 6)
        public final Button primary_button;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$Button#ADAPTER", schemaIndex = 6, tag = 7)
        public final Button secondary_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
        public final String sq_accessibility_label;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "<init>", "()V", "header", "", "percentage_picker_options_in_basis_points", "", "", "percentage_option_accessibility_hint_template", "custom_amount_subtitle", "custom_amount_accessibility_hint", "primary_button", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Button;", "secondary_button", "sq_accessibility_label", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String custom_amount_accessibility_hint;
            public String custom_amount_subtitle;
            public String header;
            public String percentage_option_accessibility_hint_template;
            public List<Long> percentage_picker_options_in_basis_points = EmptyList.INSTANCE;
            public Button primary_button;
            public Button secondary_button;
            public String sq_accessibility_label;

            @Override // com.squareup.wire.Message.Builder
            public PercentageSelectionUI build() {
                return new PercentageSelectionUI(this.header, this.percentage_picker_options_in_basis_points, this.percentage_option_accessibility_hint_template, this.custom_amount_subtitle, this.custom_amount_accessibility_hint, this.primary_button, this.secondary_button, this.sq_accessibility_label, buildUnknownFields());
            }

            public final Builder custom_amount_accessibility_hint(String custom_amount_accessibility_hint) {
                this.custom_amount_accessibility_hint = custom_amount_accessibility_hint;
                return this;
            }

            public final Builder custom_amount_subtitle(String custom_amount_subtitle) {
                this.custom_amount_subtitle = custom_amount_subtitle;
                return this;
            }

            public final Builder header(String header) {
                this.header = header;
                return this;
            }

            public final Builder percentage_option_accessibility_hint_template(String percentage_option_accessibility_hint_template) {
                this.percentage_option_accessibility_hint_template = percentage_option_accessibility_hint_template;
                return this;
            }

            public final Builder percentage_picker_options_in_basis_points(List<Long> percentage_picker_options_in_basis_points) {
                percentage_picker_options_in_basis_points.getClass();
                TransactorKt.checkElementsNotNull(percentage_picker_options_in_basis_points);
                this.percentage_picker_options_in_basis_points = percentage_picker_options_in_basis_points;
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

            public final Builder sq_accessibility_label(String sq_accessibility_label) {
                this.sq_accessibility_label = sq_accessibility_label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PercentageSelectionUI.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI decode(ProtoReader reader) {
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
                            return new BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI((String) obj, m, (String) obj2, (String) obj3, (String) obj4, (BitcoinP2pConversionPercentageBlocker.Button) obj5, (BitcoinP2pConversionPercentageBlocker.Button) obj6, (String) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                m.add(ProtoAdapter.INT64.decode(reader));
                                break;
                            case 3:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj5 = TransactorKt.decodeMessageOrMerge(BitcoinP2pConversionPercentageBlocker.Button.ADAPTER, reader, obj5);
                                break;
                            case 7:
                                obj6 = TransactorKt.decodeMessageOrMerge(BitcoinP2pConversionPercentageBlocker.Button.ADAPTER, reader, obj6);
                                break;
                            case 8:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.header);
                    ProtoAdapter.INT64.asRepeated().encodeWithTag(writer, 2, value.percentage_picker_options_in_basis_points);
                    protoAdapter2.encodeWithTag(writer, 3, value.percentage_option_accessibility_hint_template);
                    protoAdapter2.encodeWithTag(writer, 4, value.custom_amount_subtitle);
                    protoAdapter2.encodeWithTag(writer, 5, value.custom_amount_accessibility_hint);
                    ProtoAdapter protoAdapter3 = BitcoinP2pConversionPercentageBlocker.Button.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 6, value.primary_button);
                    protoAdapter3.encodeWithTag(writer, 7, value.secondary_button);
                    protoAdapter2.encodeWithTag(writer, 8, value.sq_accessibility_label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, value.custom_amount_accessibility_hint) + protoAdapter2.encodedSizeWithTag(4, value.custom_amount_subtitle) + protoAdapter2.encodedSizeWithTag(3, value.percentage_option_accessibility_hint_template) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, value.percentage_picker_options_in_basis_points) + protoAdapter2.encodedSizeWithTag(1, value.header) + size$okio;
                    ProtoAdapter protoAdapter3 = BitcoinP2pConversionPercentageBlocker.Button.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(8, value.sq_accessibility_label) + protoAdapter3.encodedSizeWithTag(7, value.secondary_button) + protoAdapter3.encodedSizeWithTag(6, value.primary_button) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI redact(BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI value) {
                    value.getClass();
                    BitcoinP2pConversionPercentageBlocker.Button button = value.primary_button;
                    BitcoinP2pConversionPercentageBlocker.Button button2 = button != null ? (BitcoinP2pConversionPercentageBlocker.Button) BitcoinP2pConversionPercentageBlocker.Button.ADAPTER.redact(button) : null;
                    BitcoinP2pConversionPercentageBlocker.Button button3 = value.secondary_button;
                    return BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI.copy$default(value, null, null, null, null, null, button2, button3 != null ? (BitcoinP2pConversionPercentageBlocker.Button) BitcoinP2pConversionPercentageBlocker.Button.ADAPTER.redact(button3) : null, null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, BitcoinP2pConversionPercentageBlocker.PercentageSelectionUI value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 8, value.sq_accessibility_label);
                    ProtoAdapter protoAdapter3 = BitcoinP2pConversionPercentageBlocker.Button.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 7, value.secondary_button);
                    protoAdapter3.encodeWithTag(writer, 6, value.primary_button);
                    protoAdapter2.encodeWithTag(writer, 5, value.custom_amount_accessibility_hint);
                    protoAdapter2.encodeWithTag(writer, 4, value.custom_amount_subtitle);
                    protoAdapter2.encodeWithTag(writer, 3, value.percentage_option_accessibility_hint_template);
                    ProtoAdapter.INT64.asRepeated().encodeWithTag(writer, 2, value.percentage_picker_options_in_basis_points);
                    protoAdapter2.encodeWithTag(writer, 1, value.header);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public PercentageSelectionUI(String str, List list, String str2, String str3, String str4, Button button, Button button2, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : button, (i & 64) != 0 ? null : button2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PercentageSelectionUI copy$default(PercentageSelectionUI percentageSelectionUI, String str, List list, String str2, String str3, String str4, Button button, Button button2, String str5, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = percentageSelectionUI.header;
            }
            if ((i & 2) != 0) {
                list = percentageSelectionUI.percentage_picker_options_in_basis_points;
            }
            if ((i & 4) != 0) {
                str2 = percentageSelectionUI.percentage_option_accessibility_hint_template;
            }
            if ((i & 8) != 0) {
                str3 = percentageSelectionUI.custom_amount_subtitle;
            }
            if ((i & 16) != 0) {
                str4 = percentageSelectionUI.custom_amount_accessibility_hint;
            }
            if ((i & 32) != 0) {
                button = percentageSelectionUI.primary_button;
            }
            if ((i & 64) != 0) {
                button2 = percentageSelectionUI.secondary_button;
            }
            if ((i & 128) != 0) {
                str5 = percentageSelectionUI.sq_accessibility_label;
            }
            if ((i & 256) != 0) {
                byteString = percentageSelectionUI.unknownFields();
            }
            String str6 = str5;
            ByteString byteString2 = byteString;
            Button button3 = button;
            Button button4 = button2;
            String str7 = str4;
            String str8 = str2;
            return percentageSelectionUI.copy(str, list, str8, str3, str7, button3, button4, str6, byteString2);
        }

        public final PercentageSelectionUI copy(String header, List<Long> percentage_picker_options_in_basis_points, String percentage_option_accessibility_hint_template, String custom_amount_subtitle, String custom_amount_accessibility_hint, Button primary_button, Button secondary_button, String sq_accessibility_label, ByteString unknownFields) {
            percentage_picker_options_in_basis_points.getClass();
            unknownFields.getClass();
            return new PercentageSelectionUI(header, percentage_picker_options_in_basis_points, percentage_option_accessibility_hint_template, custom_amount_subtitle, custom_amount_accessibility_hint, primary_button, secondary_button, sq_accessibility_label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PercentageSelectionUI)) {
                return false;
            }
            PercentageSelectionUI percentageSelectionUI = (PercentageSelectionUI) other;
            return Intrinsics.areEqual(unknownFields(), percentageSelectionUI.unknownFields()) && Intrinsics.areEqual(this.header, percentageSelectionUI.header) && Intrinsics.areEqual(this.percentage_picker_options_in_basis_points, percentageSelectionUI.percentage_picker_options_in_basis_points) && Intrinsics.areEqual(this.percentage_option_accessibility_hint_template, percentageSelectionUI.percentage_option_accessibility_hint_template) && Intrinsics.areEqual(this.custom_amount_subtitle, percentageSelectionUI.custom_amount_subtitle) && Intrinsics.areEqual(this.custom_amount_accessibility_hint, percentageSelectionUI.custom_amount_accessibility_hint) && Intrinsics.areEqual(this.primary_button, percentageSelectionUI.primary_button) && Intrinsics.areEqual(this.secondary_button, percentageSelectionUI.secondary_button) && Intrinsics.areEqual(this.sq_accessibility_label, percentageSelectionUI.sq_accessibility_label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.percentage_picker_options_in_basis_points);
            String str2 = this.percentage_option_accessibility_hint_template;
            int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.custom_amount_subtitle;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.custom_amount_accessibility_hint;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Button button = this.primary_button;
            int hashCode5 = (hashCode4 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.secondary_button;
            int hashCode6 = (hashCode5 + (button2 != null ? button2.hashCode() : 0)) * 37;
            String str5 = this.sq_accessibility_label;
            int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header = this.header;
            builder.percentage_picker_options_in_basis_points = this.percentage_picker_options_in_basis_points;
            builder.percentage_option_accessibility_hint_template = this.percentage_option_accessibility_hint_template;
            builder.custom_amount_subtitle = this.custom_amount_subtitle;
            builder.custom_amount_accessibility_hint = this.custom_amount_accessibility_hint;
            builder.primary_button = this.primary_button;
            builder.secondary_button = this.secondary_button;
            builder.sq_accessibility_label = this.sq_accessibility_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
            }
            if (!this.percentage_picker_options_in_basis_points.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("percentage_picker_options_in_basis_points=", arrayList, this.percentage_picker_options_in_basis_points);
            }
            String str2 = this.percentage_option_accessibility_hint_template;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "percentage_option_accessibility_hint_template=", arrayList);
            }
            String str3 = this.custom_amount_subtitle;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "custom_amount_subtitle=", arrayList);
            }
            String str4 = this.custom_amount_accessibility_hint;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "custom_amount_accessibility_hint=", arrayList);
            }
            Button button = this.primary_button;
            if (button != null) {
                arrayList.add("primary_button=" + button);
            }
            Button button2 = this.secondary_button;
            if (button2 != null) {
                arrayList.add("secondary_button=" + button2);
            }
            String str5 = this.sq_accessibility_label;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "sq_accessibility_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PercentageSelectionUI{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$PercentageSelectionUI;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PercentageSelectionUI build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PercentageSelectionUI() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PercentageSelectionUI(String str, List<Long> list, String str2, String str3, String str4, Button button, Button button2, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header = str;
            this.percentage_option_accessibility_hint_template = str2;
            this.custom_amount_subtitle = str3;
            this.custom_amount_accessibility_hint = str4;
            this.primary_button = button;
            this.secondary_button = button2;
            this.sq_accessibility_label = str5;
            this.percentage_picker_options_in_basis_points = TransactorKt.immutableCopyOf("percentage_picker_options_in_basis_points", list);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/BitcoinP2pConversionPercentageBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BitcoinP2pConversionPercentageBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
