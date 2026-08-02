package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.AtmPickerAmountBlocker;
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
import squareup.cash.ui.arcade.elements.ButtonDefault;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0010\u000f\u0011\u0012\u0013\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "atm_picker", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "keypad_picker", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "primary_button", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AnimationDirection;", "submit_animation_direction", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AnimationDirection;", "Companion", "Builder", "AnimationDirection", "AtmPicker", "AtmPickerOption", "KeypadPicker", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AtmPickerAmountBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AtmPickerAmountBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPicker#ADAPTER", schemaIndex = 0, tag = 1)
    public final AtmPicker atm_picker;

    @WireField(adapter = "com.squareup.protos.franklin.api.AtmPickerAmountBlocker$KeypadPicker#ADAPTER", schemaIndex = 1, tag = 2)
    public final KeypadPicker keypad_picker;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.ButtonDefault#ADAPTER", schemaIndex = 2, tag = 3)
    public final ButtonDefault primary_button;

    @WireField(adapter = "com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AnimationDirection#ADAPTER", schemaIndex = 3, tag = 4)
    public final AnimationDirection submit_animation_direction;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Builder;", "option", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Option", "Companion", "PresetAmount", "Keypad", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AtmPickerOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AtmPickerOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Option option;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption;", "<init>", "()V", "option", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Option option;

            @Override // com.squareup.wire.Message.Builder
            public AtmPickerOption build() {
                return new AtmPickerOption(this.option, buildUnknownFields());
            }

            public final Builder option(Option option) {
                this.option = option;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AtmPickerOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AtmPickerAmountBlocker.AtmPickerOption decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    AtmPickerAmountBlocker.AtmPickerOption.Option option = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AtmPickerAmountBlocker.AtmPickerOption(option, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            option = new AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount((AtmPickerAmountBlocker.AtmPickerOption.PresetAmount) AtmPickerAmountBlocker.AtmPickerOption.PresetAmount.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            option = new AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad((AtmPickerAmountBlocker.AtmPickerOption.Keypad) AtmPickerAmountBlocker.AtmPickerOption.Keypad.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AtmPickerAmountBlocker.AtmPickerOption value) {
                    writer.getClass();
                    value.getClass();
                    AtmPickerAmountBlocker.AtmPickerOption.Option option = value.option;
                    if (option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) {
                        AtmPickerAmountBlocker.AtmPickerOption.PresetAmount.ADAPTER.encodeWithTag(writer, 1, ((AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option).getValue());
                    } else if (option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) {
                        AtmPickerAmountBlocker.AtmPickerOption.Keypad.ADAPTER.encodeWithTag(writer, 2, ((AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) option).getValue());
                    } else if (option != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AtmPickerAmountBlocker.AtmPickerOption value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    AtmPickerAmountBlocker.AtmPickerOption.Option option = value.option;
                    if (option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) {
                        encodedSizeWithTag = AtmPickerAmountBlocker.AtmPickerOption.PresetAmount.ADAPTER.encodedSizeWithTag(1, ((AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option).getValue());
                    } else {
                        if (!(option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad)) {
                            if (option == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = AtmPickerAmountBlocker.AtmPickerOption.Keypad.ADAPTER.encodedSizeWithTag(2, ((AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) option).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AtmPickerAmountBlocker.AtmPickerOption redact(AtmPickerAmountBlocker.AtmPickerOption value) {
                    value.getClass();
                    return AtmPickerAmountBlocker.AtmPickerOption.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AtmPickerAmountBlocker.AtmPickerOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    AtmPickerAmountBlocker.AtmPickerOption.Option option = value.option;
                    if (option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) {
                        AtmPickerAmountBlocker.AtmPickerOption.PresetAmount.ADAPTER.encodeWithTag(writer, 1, ((AtmPickerAmountBlocker.AtmPickerOption.Option.PresetAmount) option).getValue());
                    } else if (option instanceof AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) {
                        AtmPickerAmountBlocker.AtmPickerOption.Keypad.ADAPTER.encodeWithTag(writer, 2, ((AtmPickerAmountBlocker.AtmPickerOption.Option.Keypad) option).getValue());
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

        public /* synthetic */ AtmPickerOption(Option option, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : option, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AtmPickerOption copy$default(AtmPickerOption atmPickerOption, Option option, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                option = atmPickerOption.option;
            }
            if ((i & 2) != 0) {
                byteString = atmPickerOption.unknownFields();
            }
            return atmPickerOption.copy(option, byteString);
        }

        public final AtmPickerOption copy(Option option, ByteString unknownFields) {
            unknownFields.getClass();
            return new AtmPickerOption(option, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AtmPickerOption)) {
                return false;
            }
            AtmPickerOption atmPickerOption = (AtmPickerOption) other;
            return Intrinsics.areEqual(unknownFields(), atmPickerOption.unknownFields()) && Intrinsics.areEqual(this.option, atmPickerOption.option);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "AtmPickerOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Keypad extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Keypad> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public Keypad build() {
                    return new Keypad(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Keypad.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption$Keypad$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public AtmPickerAmountBlocker.AtmPickerOption.Keypad decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new AtmPickerAmountBlocker.AtmPickerOption.Keypad(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, AtmPickerAmountBlocker.AtmPickerOption.Keypad value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(AtmPickerAmountBlocker.AtmPickerOption.Keypad value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public AtmPickerAmountBlocker.AtmPickerOption.Keypad redact(AtmPickerAmountBlocker.AtmPickerOption.Keypad value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, AtmPickerAmountBlocker.AtmPickerOption.Keypad value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Keypad(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Keypad copy$default(Keypad keypad, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = keypad.unknownFields();
                }
                return keypad.copy(byteString);
            }

            public final Keypad copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new Keypad(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof Keypad) && Intrinsics.areEqual(unknownFields(), ((Keypad) other).unknownFields());
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
                return "Keypad{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Keypad build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Keypad() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Keypad(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount$Builder;", "amount", "Lcom/squareup/protos/common/Money;", "is_disabled", "", "is_preselected", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/common/Money;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/squareup/protos/common/Money;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class PresetAmount extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<PresetAmount> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 0, tag = 1)
            public final Money amount;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
            public final Boolean is_disabled;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
            public final Boolean is_preselected;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "<init>", "()V", "amount", "Lcom/squareup/protos/common/Money;", "is_disabled", "", "Ljava/lang/Boolean;", "is_preselected", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Money amount;
                public Boolean is_disabled;
                public Boolean is_preselected;

                public final Builder amount(Money amount) {
                    this.amount = amount;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public PresetAmount build() {
                    return new PresetAmount(this.amount, this.is_disabled, this.is_preselected, buildUnknownFields());
                }

                public final Builder is_disabled(Boolean is_disabled) {
                    this.is_disabled = is_disabled;
                    return this;
                }

                public final Builder is_preselected(Boolean is_preselected) {
                    this.is_preselected = is_preselected;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PresetAmount.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption$PresetAmount$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public AtmPickerAmountBlocker.AtmPickerOption.PresetAmount decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new AtmPickerAmountBlocker.AtmPickerOption.PresetAmount((Money) obj, (Boolean) obj2, (Boolean) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.BOOL.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = ProtoAdapter.BOOL.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, AtmPickerAmountBlocker.AtmPickerOption.PresetAmount value) {
                        writer.getClass();
                        value.getClass();
                        Money.ADAPTER.encodeWithTag(writer, 1, value.amount);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                        protoAdapter2.encodeWithTag(writer, 2, value.is_disabled);
                        protoAdapter2.encodeWithTag(writer, 3, value.is_preselected);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(AtmPickerAmountBlocker.AtmPickerOption.PresetAmount value) {
                        value.getClass();
                        int encodedSizeWithTag = Money.ADAPTER.encodedSizeWithTag(1, value.amount) + value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                        return protoAdapter2.encodedSizeWithTag(3, value.is_preselected) + protoAdapter2.encodedSizeWithTag(2, value.is_disabled) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public AtmPickerAmountBlocker.AtmPickerOption.PresetAmount redact(AtmPickerAmountBlocker.AtmPickerOption.PresetAmount value) {
                        value.getClass();
                        Money money = value.amount;
                        return AtmPickerAmountBlocker.AtmPickerOption.PresetAmount.copy$default(value, money != null ? (Money) Money.ADAPTER.redact(money) : null, null, null, ByteString.EMPTY, 6, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, AtmPickerAmountBlocker.AtmPickerOption.PresetAmount value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                        protoAdapter2.encodeWithTag(writer, 3, value.is_preselected);
                        protoAdapter2.encodeWithTag(writer, 2, value.is_disabled);
                        Money.ADAPTER.encodeWithTag(writer, 1, value.amount);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ PresetAmount(Money money, Boolean bool, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ PresetAmount copy$default(PresetAmount presetAmount, Money money, Boolean bool, Boolean bool2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    money = presetAmount.amount;
                }
                if ((i & 2) != 0) {
                    bool = presetAmount.is_disabled;
                }
                if ((i & 4) != 0) {
                    bool2 = presetAmount.is_preselected;
                }
                if ((i & 8) != 0) {
                    byteString = presetAmount.unknownFields();
                }
                return presetAmount.copy(money, bool, bool2, byteString);
            }

            public final PresetAmount copy(Money amount, Boolean is_disabled, Boolean is_preselected, ByteString unknownFields) {
                unknownFields.getClass();
                return new PresetAmount(amount, is_disabled, is_preselected, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof PresetAmount)) {
                    return false;
                }
                PresetAmount presetAmount = (PresetAmount) other;
                return Intrinsics.areEqual(unknownFields(), presetAmount.unknownFields()) && Intrinsics.areEqual(this.amount, presetAmount.amount) && Intrinsics.areEqual(this.is_disabled, presetAmount.is_disabled) && Intrinsics.areEqual(this.is_preselected, presetAmount.is_preselected);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.amount;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                Boolean bool = this.is_disabled;
                int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                Boolean bool2 = this.is_preselected;
                int hashCode4 = hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.amount = this.amount;
                builder.is_disabled = this.is_disabled;
                builder.is_preselected = this.is_preselected;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
                }
                Boolean bool = this.is_disabled;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_disabled=", bool, arrayList);
                }
                Boolean bool2 = this.is_preselected;
                if (bool2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_preselected=", bool2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "PresetAmount{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ PresetAmount build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public PresetAmount() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PresetAmount(Money money, Boolean bool, Boolean bool2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.amount = money;
                this.is_disabled = bool;
                this.is_preselected = bool2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AtmPickerOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option;", "", "<init>", "()V", "PresetAmount", "Keypad", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option$Keypad;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option$PresetAmount;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Option {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption$Keypad#ADAPTER", declaredName = "keypad", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option$Keypad;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option;", "value", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;", "<init>", "(Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;)V", "getValue", "()Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Keypad;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Keypad extends Option {
                private final Keypad value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Keypad(Keypad keypad) {
                    super(null);
                    keypad.getClass();
                    this.value = keypad;
                }

                public static /* synthetic */ Keypad copy$default(Keypad keypad, Keypad keypad2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        keypad2 = keypad.value;
                    }
                    return keypad.copy(keypad2);
                }

                /* renamed from: component1, reason: from getter */
                public final Keypad getValue() {
                    return this.value;
                }

                public final Keypad copy(Keypad value) {
                    value.getClass();
                    return new Keypad(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Keypad) && Intrinsics.areEqual(this.value, ((Keypad) other).value);
                }

                public final Keypad getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Keypad(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption$PresetAmount#ADAPTER", declaredName = "preset_amount", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option$PresetAmount;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$Option;", "value", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "<init>", "(Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;)V", "getValue", "()Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption$PresetAmount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class PresetAmount extends Option {
                private final PresetAmount value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PresetAmount(PresetAmount presetAmount) {
                    super(null);
                    presetAmount.getClass();
                    this.value = presetAmount;
                }

                public static /* synthetic */ PresetAmount copy$default(PresetAmount presetAmount, PresetAmount presetAmount2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        presetAmount2 = presetAmount.value;
                    }
                    return presetAmount.copy(presetAmount2);
                }

                /* renamed from: component1, reason: from getter */
                public final PresetAmount getValue() {
                    return this.value;
                }

                public final PresetAmount copy(PresetAmount value) {
                    value.getClass();
                    return new PresetAmount(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PresetAmount) && Intrinsics.areEqual(this.value, ((PresetAmount) other).value);
                }

                public final PresetAmount getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "PresetAmount(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Option(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Option() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AtmPickerOption() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AtmPickerOption(Option option, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.option = option;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker;", "<init>", "()V", "atm_picker", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "keypad_picker", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "primary_button", "Lsquareup/cash/ui/arcade/elements/ButtonDefault;", "submit_animation_direction", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AnimationDirection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public AtmPicker atm_picker;
        public KeypadPicker keypad_picker;
        public ButtonDefault primary_button;
        public AnimationDirection submit_animation_direction;

        public final Builder atm_picker(AtmPicker atm_picker) {
            this.atm_picker = atm_picker;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AtmPickerAmountBlocker build() {
            return new AtmPickerAmountBlocker(this.atm_picker, this.keypad_picker, this.primary_button, this.submit_animation_direction, buildUnknownFields());
        }

        public final Builder keypad_picker(KeypadPicker keypad_picker) {
            this.keypad_picker = keypad_picker;
            return this;
        }

        public final Builder primary_button(ButtonDefault primary_button) {
            this.primary_button = primary_button;
            return this;
        }

        public final Builder submit_animation_direction(AnimationDirection submit_animation_direction) {
            this.submit_animation_direction = submit_animation_direction;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AtmPickerAmountBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public AtmPickerAmountBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AtmPickerAmountBlocker((AtmPickerAmountBlocker.AtmPicker) obj, (AtmPickerAmountBlocker.KeypadPicker) obj2, (ButtonDefault) obj3, (AtmPickerAmountBlocker.AnimationDirection) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(AtmPickerAmountBlocker.AtmPicker.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(AtmPickerAmountBlocker.KeypadPicker.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = AtmPickerAmountBlocker.AnimationDirection.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AtmPickerAmountBlocker value) {
                writer.getClass();
                value.getClass();
                AtmPickerAmountBlocker.AtmPicker.ADAPTER.encodeWithTag(writer, 1, value.atm_picker);
                AtmPickerAmountBlocker.KeypadPicker.ADAPTER.encodeWithTag(writer, 2, value.keypad_picker);
                ButtonDefault.ADAPTER.encodeWithTag(writer, 3, value.primary_button);
                AtmPickerAmountBlocker.AnimationDirection.ADAPTER.encodeWithTag(writer, 4, value.submit_animation_direction);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AtmPickerAmountBlocker value) {
                value.getClass();
                return AtmPickerAmountBlocker.AnimationDirection.ADAPTER.encodedSizeWithTag(4, value.submit_animation_direction) + ButtonDefault.ADAPTER.encodedSizeWithTag(3, value.primary_button) + AtmPickerAmountBlocker.KeypadPicker.ADAPTER.encodedSizeWithTag(2, value.keypad_picker) + AtmPickerAmountBlocker.AtmPicker.ADAPTER.encodedSizeWithTag(1, value.atm_picker) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AtmPickerAmountBlocker redact(AtmPickerAmountBlocker value) {
                value.getClass();
                AtmPickerAmountBlocker.AtmPicker atmPicker = value.atm_picker;
                AtmPickerAmountBlocker.AtmPicker atmPicker2 = atmPicker != null ? (AtmPickerAmountBlocker.AtmPicker) AtmPickerAmountBlocker.AtmPicker.ADAPTER.redact(atmPicker) : null;
                AtmPickerAmountBlocker.KeypadPicker keypadPicker = value.keypad_picker;
                AtmPickerAmountBlocker.KeypadPicker keypadPicker2 = keypadPicker != null ? (AtmPickerAmountBlocker.KeypadPicker) AtmPickerAmountBlocker.KeypadPicker.ADAPTER.redact(keypadPicker) : null;
                ButtonDefault buttonDefault = value.primary_button;
                ButtonDefault buttonDefault2 = buttonDefault != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault) : null;
                ByteString byteString = ByteString.EMPTY;
                AtmPickerAmountBlocker.AnimationDirection animationDirection = value.submit_animation_direction;
                byteString.getClass();
                return new AtmPickerAmountBlocker(atmPicker2, keypadPicker2, buttonDefault2, animationDirection, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AtmPickerAmountBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AtmPickerAmountBlocker.AnimationDirection.ADAPTER.encodeWithTag(writer, 4, value.submit_animation_direction);
                ButtonDefault.ADAPTER.encodeWithTag(writer, 3, value.primary_button);
                AtmPickerAmountBlocker.KeypadPicker.ADAPTER.encodeWithTag(writer, 2, value.keypad_picker);
                AtmPickerAmountBlocker.AtmPicker.ADAPTER.encodeWithTag(writer, 1, value.atm_picker);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmPickerAmountBlocker(AtmPicker atmPicker, KeypadPicker keypadPicker, ButtonDefault buttonDefault, AnimationDirection animationDirection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.atm_picker = atmPicker;
        this.keypad_picker = keypadPicker;
        this.primary_button = buttonDefault;
        this.submit_animation_direction = animationDirection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AtmPickerAmountBlocker)) {
            return false;
        }
        AtmPickerAmountBlocker atmPickerAmountBlocker = (AtmPickerAmountBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), atmPickerAmountBlocker.unknownFields()) && Intrinsics.areEqual(this.atm_picker, atmPickerAmountBlocker.atm_picker) && Intrinsics.areEqual(this.keypad_picker, atmPickerAmountBlocker.keypad_picker) && Intrinsics.areEqual(this.primary_button, atmPickerAmountBlocker.primary_button) && this.submit_animation_direction == atmPickerAmountBlocker.submit_animation_direction;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AtmPicker atmPicker = this.atm_picker;
        int hashCode2 = (hashCode + (atmPicker != null ? atmPicker.hashCode() : 0)) * 37;
        KeypadPicker keypadPicker = this.keypad_picker;
        int hashCode3 = (hashCode2 + (keypadPicker != null ? keypadPicker.hashCode() : 0)) * 37;
        ButtonDefault buttonDefault = this.primary_button;
        int hashCode4 = (hashCode3 + (buttonDefault != null ? buttonDefault.hashCode() : 0)) * 37;
        AnimationDirection animationDirection = this.submit_animation_direction;
        int hashCode5 = hashCode4 + (animationDirection != null ? animationDirection.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.atm_picker = this.atm_picker;
        builder.keypad_picker = this.keypad_picker;
        builder.primary_button = this.primary_button;
        builder.submit_animation_direction = this.submit_animation_direction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AtmPicker atmPicker = this.atm_picker;
        if (atmPicker != null) {
            arrayList.add("atm_picker=" + atmPicker);
        }
        KeypadPicker keypadPicker = this.keypad_picker;
        if (keypadPicker != null) {
            arrayList.add("keypad_picker=" + keypadPicker);
        }
        ButtonDefault buttonDefault = this.primary_button;
        if (buttonDefault != null) {
            arrayList.add("primary_button=" + buttonDefault);
        }
        AnimationDirection animationDirection = this.submit_animation_direction;
        if (animationDirection != null) {
            arrayList.add("submit_animation_direction=" + animationDirection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AtmPickerAmountBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AnimationDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FORWARD", "BACKWARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AnimationDirection$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public AtmPickerAmountBlocker.AnimationDirection fromValue(int value) {
                    return AtmPickerAmountBlocker.AnimationDirection.INSTANCE.fromValue(value);
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

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AnimationDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AnimationDirection;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker$Builder;", "title", "", "subtitle", "options", "", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AtmPicker extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AtmPicker> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPickerOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        public final List<AtmPickerOption> options;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "<init>", "()V", "title", "", "subtitle", "options", "", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPickerOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<AtmPickerOption> options = EmptyList.INSTANCE;
            public String subtitle;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public AtmPicker build() {
                return new AtmPicker(this.title, this.subtitle, this.options, buildUnknownFields());
            }

            public final Builder options(List<AtmPickerOption> options) {
                options.getClass();
                TransactorKt.checkElementsNotNull(options);
                this.options = options;
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
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AtmPicker.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$AtmPicker$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AtmPickerAmountBlocker.AtmPicker decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AtmPickerAmountBlocker.AtmPicker((String) obj, (String) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(AtmPickerAmountBlocker.AtmPickerOption.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AtmPickerAmountBlocker.AtmPicker value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    AtmPickerAmountBlocker.AtmPickerOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AtmPickerAmountBlocker.AtmPicker value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return AtmPickerAmountBlocker.AtmPickerOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.options) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AtmPickerAmountBlocker.AtmPicker redact(AtmPickerAmountBlocker.AtmPicker value) {
                    value.getClass();
                    return AtmPickerAmountBlocker.AtmPicker.copy$default(value, null, null, TransactorKt.m1169redactElements(value.options, AtmPickerAmountBlocker.AtmPickerOption.ADAPTER), ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AtmPickerAmountBlocker.AtmPicker value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    AtmPickerAmountBlocker.AtmPickerOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.options);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public AtmPicker(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AtmPicker copy$default(AtmPicker atmPicker, String str, String str2, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = atmPicker.title;
            }
            if ((i & 2) != 0) {
                str2 = atmPicker.subtitle;
            }
            if ((i & 4) != 0) {
                list = atmPicker.options;
            }
            if ((i & 8) != 0) {
                byteString = atmPicker.unknownFields();
            }
            return atmPicker.copy(str, str2, list, byteString);
        }

        public final AtmPicker copy(String title, String subtitle, List<AtmPickerOption> options, ByteString unknownFields) {
            options.getClass();
            unknownFields.getClass();
            return new AtmPicker(title, subtitle, options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AtmPicker)) {
                return false;
            }
            AtmPicker atmPicker = (AtmPicker) other;
            return Intrinsics.areEqual(unknownFields(), atmPicker.unknownFields()) && Intrinsics.areEqual(this.title, atmPicker.title) && Intrinsics.areEqual(this.subtitle, atmPicker.subtitle) && Intrinsics.areEqual(this.options, atmPicker.options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = this.options.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.options = this.options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            if (!this.options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AtmPicker{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$AtmPicker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AtmPicker build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AtmPicker() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AtmPicker(String str, String str2, List<AtmPickerOption> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker$Builder;", "title", "", "subtitle", "minimum_amount", "Lcom/squareup/protos/common/Money;", "maximum_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class KeypadPicker extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<KeypadPicker> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 3, tag = 5)
        public final Money maximum_amount;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 4)
        public final Money minimum_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "<init>", "()V", "title", "", "subtitle", "minimum_amount", "Lcom/squareup/protos/common/Money;", "maximum_amount", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Money maximum_amount;
            public Money minimum_amount;
            public String subtitle;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public KeypadPicker build() {
                return new KeypadPicker(this.title, this.subtitle, this.minimum_amount, this.maximum_amount, buildUnknownFields());
            }

            public final Builder maximum_amount(Money maximum_amount) {
                this.maximum_amount = maximum_amount;
                return this;
            }

            public final Builder minimum_amount(Money minimum_amount) {
                this.minimum_amount = minimum_amount;
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
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(KeypadPicker.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AtmPickerAmountBlocker$KeypadPicker$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AtmPickerAmountBlocker.KeypadPicker decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new AtmPickerAmountBlocker.KeypadPicker((String) obj, (String) obj2, (Money) obj3, (Money) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AtmPickerAmountBlocker.KeypadPicker value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 4, value.minimum_amount);
                    protoAdapter3.encodeWithTag(writer, 5, value.maximum_amount);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AtmPickerAmountBlocker.KeypadPicker value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    return protoAdapter3.encodedSizeWithTag(5, value.maximum_amount) + protoAdapter3.encodedSizeWithTag(4, value.minimum_amount) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AtmPickerAmountBlocker.KeypadPicker redact(AtmPickerAmountBlocker.KeypadPicker value) {
                    value.getClass();
                    Money money = value.minimum_amount;
                    Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                    Money money3 = value.maximum_amount;
                    return AtmPickerAmountBlocker.KeypadPicker.copy$default(value, null, null, money2, money3 != null ? (Money) Money.ADAPTER.redact(money3) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AtmPickerAmountBlocker.KeypadPicker value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = Money.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.maximum_amount);
                    protoAdapter2.encodeWithTag(writer, 4, value.minimum_amount);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter3.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ KeypadPicker(String str, String str2, Money money, Money money2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ KeypadPicker copy$default(KeypadPicker keypadPicker, String str, String str2, Money money, Money money2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = keypadPicker.title;
            }
            if ((i & 2) != 0) {
                str2 = keypadPicker.subtitle;
            }
            if ((i & 4) != 0) {
                money = keypadPicker.minimum_amount;
            }
            if ((i & 8) != 0) {
                money2 = keypadPicker.maximum_amount;
            }
            if ((i & 16) != 0) {
                byteString = keypadPicker.unknownFields();
            }
            ByteString byteString2 = byteString;
            Money money3 = money;
            return keypadPicker.copy(str, str2, money3, money2, byteString2);
        }

        public final KeypadPicker copy(String title, String subtitle, Money minimum_amount, Money maximum_amount, ByteString unknownFields) {
            unknownFields.getClass();
            return new KeypadPicker(title, subtitle, minimum_amount, maximum_amount, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof KeypadPicker)) {
                return false;
            }
            KeypadPicker keypadPicker = (KeypadPicker) other;
            return Intrinsics.areEqual(unknownFields(), keypadPicker.unknownFields()) && Intrinsics.areEqual(this.title, keypadPicker.title) && Intrinsics.areEqual(this.subtitle, keypadPicker.subtitle) && Intrinsics.areEqual(this.minimum_amount, keypadPicker.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, keypadPicker.maximum_amount);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Money money = this.minimum_amount;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.maximum_amount;
            int hashCode5 = hashCode4 + (money2 != null ? money2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.minimum_amount = this.minimum_amount;
            builder.maximum_amount = this.maximum_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            Money money = this.minimum_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
            }
            Money money2 = this.maximum_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "KeypadPicker{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$KeypadPicker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KeypadPicker build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public KeypadPicker() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KeypadPicker(String str, String str2, Money money, Money money2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.minimum_amount = money;
            this.maximum_amount = money2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AtmPickerAmountBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AtmPickerAmountBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
