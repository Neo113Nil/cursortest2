package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.OverflowOptionPickerBlocker;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0014\u0013\u0015\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "expand_label", "primary_button_label", "search_placeholder_text", "preselected_option_identifier", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "secondary_action", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option;", "promoted_options", "Ljava/util/List;", "all_options", "Companion", "Builder", "Option", "SecondaryAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverflowOptionPickerBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OverflowOptionPickerBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$Option#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<Option> all_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String expand_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String preselected_option_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String primary_button_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$Option#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<Option> promoted_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String search_placeholder_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$SecondaryAction#ADAPTER", schemaIndex = 8, tag = 9)
    public final SecondaryAction secondary_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker;", "<init>", "()V", "title", "", "subtitle", "promoted_options", "", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option;", "all_options", "expand_label", "primary_button_label", "search_placeholder_text", "preselected_option_identifier", "secondary_action", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<Option> all_options;
        public String expand_label;
        public String preselected_option_identifier;
        public String primary_button_label;
        public List<Option> promoted_options;
        public String search_placeholder_text;
        public SecondaryAction secondary_action;
        public String subtitle;
        public String title;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.promoted_options = emptyList;
            this.all_options = emptyList;
        }

        public final Builder all_options(List<Option> all_options) {
            all_options.getClass();
            TransactorKt.checkElementsNotNull(all_options);
            this.all_options = all_options;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public OverflowOptionPickerBlocker build() {
            return new OverflowOptionPickerBlocker(this.title, this.subtitle, this.promoted_options, this.all_options, this.expand_label, this.primary_button_label, this.search_placeholder_text, this.preselected_option_identifier, this.secondary_action, buildUnknownFields());
        }

        public final Builder expand_label(String expand_label) {
            this.expand_label = expand_label;
            return this;
        }

        public final Builder preselected_option_identifier(String preselected_option_identifier) {
            this.preselected_option_identifier = preselected_option_identifier;
            return this;
        }

        public final Builder primary_button_label(String primary_button_label) {
            this.primary_button_label = primary_button_label;
            return this;
        }

        public final Builder promoted_options(List<Option> promoted_options) {
            promoted_options.getClass();
            TransactorKt.checkElementsNotNull(promoted_options);
            this.promoted_options = promoted_options;
            return this;
        }

        public final Builder search_placeholder_text(String search_placeholder_text) {
            this.search_placeholder_text = search_placeholder_text;
            return this;
        }

        public final Builder secondary_action(SecondaryAction secondary_action) {
            this.secondary_action = secondary_action;
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

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0018\u0019BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$Builder;", "name", "", "option_identifier", "icon", "Lcom/squareup/protos/cash/ui/Image;", "confirmation_alert", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "ConfirmationAlert", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Option extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Option> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$Option$ConfirmationAlert#ADAPTER", schemaIndex = 3, tag = 4)
        public final ConfirmationAlert confirmation_alert;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
        public final Image icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String option_identifier;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option;", "<init>", "()V", "name", "", "option_identifier", "icon", "Lcom/squareup/protos/cash/ui/Image;", "confirmation_alert", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ConfirmationAlert confirmation_alert;
            public Image icon;
            public String name;
            public String option_identifier;

            @Override // com.squareup.wire.Message.Builder
            public Option build() {
                return new Option(this.name, this.option_identifier, this.icon, this.confirmation_alert, buildUnknownFields());
            }

            public final Builder confirmation_alert(ConfirmationAlert confirmation_alert) {
                this.confirmation_alert = confirmation_alert;
                return this;
            }

            public final Builder icon(Image icon) {
                this.icon = icon;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }

            public final Builder option_identifier(String option_identifier) {
                this.option_identifier = option_identifier;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Option.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$Option$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public OverflowOptionPickerBlocker.Option decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new OverflowOptionPickerBlocker.Option((String) obj, (String) obj2, (Image) obj3, (OverflowOptionPickerBlocker.Option.ConfirmationAlert) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(OverflowOptionPickerBlocker.Option.ConfirmationAlert.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, OverflowOptionPickerBlocker.Option value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.name);
                    protoAdapter2.encodeWithTag(writer, 2, value.option_identifier);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.icon);
                    OverflowOptionPickerBlocker.Option.ConfirmationAlert.ADAPTER.encodeWithTag(writer, 4, value.confirmation_alert);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OverflowOptionPickerBlocker.Option value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return OverflowOptionPickerBlocker.Option.ConfirmationAlert.ADAPTER.encodedSizeWithTag(4, value.confirmation_alert) + Image.ADAPTER.encodedSizeWithTag(3, value.icon) + protoAdapter2.encodedSizeWithTag(2, value.option_identifier) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OverflowOptionPickerBlocker.Option redact(OverflowOptionPickerBlocker.Option value) {
                    value.getClass();
                    Image image = value.icon;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    OverflowOptionPickerBlocker.Option.ConfirmationAlert confirmationAlert = value.confirmation_alert;
                    return OverflowOptionPickerBlocker.Option.copy$default(value, null, null, image2, confirmationAlert != null ? (OverflowOptionPickerBlocker.Option.ConfirmationAlert) OverflowOptionPickerBlocker.Option.ConfirmationAlert.ADAPTER.redact(confirmationAlert) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OverflowOptionPickerBlocker.Option value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    OverflowOptionPickerBlocker.Option.ConfirmationAlert.ADAPTER.encodeWithTag(writer, 4, value.confirmation_alert);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.icon);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.option_identifier);
                    protoAdapter2.encodeWithTag(writer, 1, value.name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Option(String str, String str2, Image image, ConfirmationAlert confirmationAlert, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : confirmationAlert, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Option copy$default(Option option, String str, String str2, Image image, ConfirmationAlert confirmationAlert, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = option.name;
            }
            if ((i & 2) != 0) {
                str2 = option.option_identifier;
            }
            if ((i & 4) != 0) {
                image = option.icon;
            }
            if ((i & 8) != 0) {
                confirmationAlert = option.confirmation_alert;
            }
            if ((i & 16) != 0) {
                byteString = option.unknownFields();
            }
            ByteString byteString2 = byteString;
            Image image2 = image;
            return option.copy(str, str2, image2, confirmationAlert, byteString2);
        }

        public final Option copy(String name, String option_identifier, Image icon, ConfirmationAlert confirmation_alert, ByteString unknownFields) {
            unknownFields.getClass();
            return new Option(name, option_identifier, icon, confirmation_alert, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(unknownFields(), option.unknownFields()) && Intrinsics.areEqual(this.name, option.name) && Intrinsics.areEqual(this.option_identifier, option.option_identifier) && Intrinsics.areEqual(this.icon, option.icon) && Intrinsics.areEqual(this.confirmation_alert, option.confirmation_alert);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.option_identifier;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Image image = this.icon;
            int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
            ConfirmationAlert confirmationAlert = this.confirmation_alert;
            int hashCode5 = hashCode4 + (confirmationAlert != null ? confirmationAlert.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.name = this.name;
            builder.option_identifier = this.option_identifier;
            builder.icon = this.icon;
            builder.confirmation_alert = this.confirmation_alert;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
            }
            String str2 = this.option_identifier;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "option_identifier=", arrayList);
            }
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            ConfirmationAlert confirmationAlert = this.confirmation_alert;
            if (confirmationAlert != null) {
                arrayList.add("confirmation_alert=" + confirmationAlert);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Option{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert$Builder;", "title", "", "subtitle", "confirm_button_title", "dismiss_button_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ConfirmationAlert extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ConfirmationAlert> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String confirm_button_title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String dismiss_button_title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String subtitle;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;", "<init>", "()V", "title", "", "subtitle", "confirm_button_title", "dismiss_button_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String confirm_button_title;
                public String dismiss_button_title;
                public String subtitle;
                public String title;

                @Override // com.squareup.wire.Message.Builder
                public ConfirmationAlert build() {
                    return new ConfirmationAlert(this.title, this.subtitle, this.confirm_button_title, this.dismiss_button_title, buildUnknownFields());
                }

                public final Builder confirm_button_title(String confirm_button_title) {
                    this.confirm_button_title = confirm_button_title;
                    return this;
                }

                public final Builder dismiss_button_title(String dismiss_button_title) {
                    this.dismiss_button_title = dismiss_button_title;
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
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmationAlert.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$Option$ConfirmationAlert$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public OverflowOptionPickerBlocker.Option.ConfirmationAlert decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new OverflowOptionPickerBlocker.Option.ConfirmationAlert((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, OverflowOptionPickerBlocker.Option.ConfirmationAlert value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                        protoAdapter2.encodeWithTag(writer, 3, value.confirm_button_title);
                        protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_title);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(OverflowOptionPickerBlocker.Option.ConfirmationAlert value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(4, value.dismiss_button_title) + protoAdapter2.encodedSizeWithTag(3, value.confirm_button_title) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public OverflowOptionPickerBlocker.Option.ConfirmationAlert redact(OverflowOptionPickerBlocker.Option.ConfirmationAlert value) {
                        value.getClass();
                        return OverflowOptionPickerBlocker.Option.ConfirmationAlert.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, OverflowOptionPickerBlocker.Option.ConfirmationAlert value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_title);
                        protoAdapter2.encodeWithTag(writer, 3, value.confirm_button_title);
                        protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ConfirmationAlert(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ConfirmationAlert copy$default(ConfirmationAlert confirmationAlert, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = confirmationAlert.title;
                }
                if ((i & 2) != 0) {
                    str2 = confirmationAlert.subtitle;
                }
                if ((i & 4) != 0) {
                    str3 = confirmationAlert.confirm_button_title;
                }
                if ((i & 8) != 0) {
                    str4 = confirmationAlert.dismiss_button_title;
                }
                if ((i & 16) != 0) {
                    byteString = confirmationAlert.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str5 = str3;
                return confirmationAlert.copy(str, str2, str5, str4, byteString2);
            }

            public final ConfirmationAlert copy(String title, String subtitle, String confirm_button_title, String dismiss_button_title, ByteString unknownFields) {
                unknownFields.getClass();
                return new ConfirmationAlert(title, subtitle, confirm_button_title, dismiss_button_title, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ConfirmationAlert)) {
                    return false;
                }
                ConfirmationAlert confirmationAlert = (ConfirmationAlert) other;
                return Intrinsics.areEqual(unknownFields(), confirmationAlert.unknownFields()) && Intrinsics.areEqual(this.title, confirmationAlert.title) && Intrinsics.areEqual(this.subtitle, confirmationAlert.subtitle) && Intrinsics.areEqual(this.confirm_button_title, confirmationAlert.confirm_button_title) && Intrinsics.areEqual(this.dismiss_button_title, confirmationAlert.dismiss_button_title);
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
                String str3 = this.confirm_button_title;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.dismiss_button_title;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.subtitle = this.subtitle;
                builder.confirm_button_title = this.confirm_button_title;
                builder.dismiss_button_title = this.dismiss_button_title;
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
                String str3 = this.confirm_button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "confirm_button_title=", arrayList);
                }
                String str4 = this.dismiss_button_title;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "dismiss_button_title=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmationAlert{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$ConfirmationAlert;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ConfirmationAlert build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ConfirmationAlert() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmationAlert(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.subtitle = str2;
                this.confirm_button_title = str3;
                this.dismiss_button_title = str4;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Option;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Option build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Option() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Option(String str, String str2, Image image, ConfirmationAlert confirmationAlert, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.option_identifier = str2;
            this.icon = image;
            this.confirmation_alert = confirmationAlert;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OverflowOptionPickerBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public OverflowOptionPickerBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
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
                        return new OverflowOptionPickerBlocker((String) obj, (String) obj2, m, arrayList, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (OverflowOptionPickerBlocker.SecondaryAction) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            m.add(OverflowOptionPickerBlocker.Option.ADAPTER.decode(reader));
                            break;
                        case 4:
                            arrayList.add(OverflowOptionPickerBlocker.Option.ADAPTER.decode(reader));
                            break;
                        case 5:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj7 = TransactorKt.decodeMessageOrMerge(OverflowOptionPickerBlocker.SecondaryAction.ADAPTER, reader, obj7);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OverflowOptionPickerBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                ProtoAdapter protoAdapter3 = OverflowOptionPickerBlocker.Option.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 3, value.promoted_options);
                protoAdapter3.asRepeated().encodeWithTag(writer, 4, value.all_options);
                protoAdapter2.encodeWithTag(writer, 5, value.expand_label);
                protoAdapter2.encodeWithTag(writer, 6, value.primary_button_label);
                protoAdapter2.encodeWithTag(writer, 7, value.search_placeholder_text);
                protoAdapter2.encodeWithTag(writer, 8, value.preselected_option_identifier);
                OverflowOptionPickerBlocker.SecondaryAction.ADAPTER.encodeWithTag(writer, 9, value.secondary_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OverflowOptionPickerBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = OverflowOptionPickerBlocker.Option.ADAPTER;
                return OverflowOptionPickerBlocker.SecondaryAction.ADAPTER.encodedSizeWithTag(9, value.secondary_action) + protoAdapter2.encodedSizeWithTag(8, value.preselected_option_identifier) + protoAdapter2.encodedSizeWithTag(7, value.search_placeholder_text) + protoAdapter2.encodedSizeWithTag(6, value.primary_button_label) + protoAdapter2.encodedSizeWithTag(5, value.expand_label) + protoAdapter3.asRepeated().encodedSizeWithTag(4, value.all_options) + protoAdapter3.asRepeated().encodedSizeWithTag(3, value.promoted_options) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OverflowOptionPickerBlocker redact(OverflowOptionPickerBlocker value) {
                value.getClass();
                List<OverflowOptionPickerBlocker.Option> list = value.promoted_options;
                ProtoAdapter protoAdapter2 = OverflowOptionPickerBlocker.Option.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.all_options, protoAdapter2);
                OverflowOptionPickerBlocker.SecondaryAction secondaryAction = value.secondary_action;
                OverflowOptionPickerBlocker.SecondaryAction secondaryAction2 = secondaryAction != null ? (OverflowOptionPickerBlocker.SecondaryAction) OverflowOptionPickerBlocker.SecondaryAction.ADAPTER.redact(secondaryAction) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                String str3 = value.expand_label;
                String str4 = value.primary_button_label;
                String str5 = value.search_placeholder_text;
                String str6 = value.preselected_option_identifier;
                byteString.getClass();
                return new OverflowOptionPickerBlocker(str, str2, m1169redactElements, m1169redactElements2, str3, str4, str5, str6, secondaryAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OverflowOptionPickerBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                OverflowOptionPickerBlocker.SecondaryAction.ADAPTER.encodeWithTag(writer, 9, value.secondary_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.preselected_option_identifier);
                protoAdapter2.encodeWithTag(writer, 7, value.search_placeholder_text);
                protoAdapter2.encodeWithTag(writer, 6, value.primary_button_label);
                protoAdapter2.encodeWithTag(writer, 5, value.expand_label);
                ProtoAdapter protoAdapter3 = OverflowOptionPickerBlocker.Option.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 4, value.all_options);
                protoAdapter3.asRepeated().encodeWithTag(writer, 3, value.promoted_options);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverflowOptionPickerBlocker(String str, String str2, List list, List list2, String str3, String str4, String str5, String str6, SecondaryAction secondaryAction, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = str;
        this.subtitle = str2;
        this.expand_label = str3;
        this.primary_button_label = str4;
        this.search_placeholder_text = str5;
        this.preselected_option_identifier = str6;
        this.secondary_action = secondaryAction;
        this.promoted_options = TransactorKt.immutableCopyOf("promoted_options", list);
        this.all_options = TransactorKt.immutableCopyOf("all_options", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OverflowOptionPickerBlocker)) {
            return false;
        }
        OverflowOptionPickerBlocker overflowOptionPickerBlocker = (OverflowOptionPickerBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), overflowOptionPickerBlocker.unknownFields()) && Intrinsics.areEqual(this.title, overflowOptionPickerBlocker.title) && Intrinsics.areEqual(this.subtitle, overflowOptionPickerBlocker.subtitle) && Intrinsics.areEqual(this.promoted_options, overflowOptionPickerBlocker.promoted_options) && Intrinsics.areEqual(this.all_options, overflowOptionPickerBlocker.all_options) && Intrinsics.areEqual(this.expand_label, overflowOptionPickerBlocker.expand_label) && Intrinsics.areEqual(this.primary_button_label, overflowOptionPickerBlocker.primary_button_label) && Intrinsics.areEqual(this.search_placeholder_text, overflowOptionPickerBlocker.search_placeholder_text) && Intrinsics.areEqual(this.preselected_option_identifier, overflowOptionPickerBlocker.preselected_option_identifier) && Intrinsics.areEqual(this.secondary_action, overflowOptionPickerBlocker.secondary_action);
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
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.promoted_options), 37, this.all_options);
        String str3 = this.expand_label;
        int hashCode3 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.primary_button_label;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.search_placeholder_text;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.preselected_option_identifier;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        SecondaryAction secondaryAction = this.secondary_action;
        int hashCode7 = hashCode6 + (secondaryAction != null ? secondaryAction.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.promoted_options = this.promoted_options;
        builder.all_options = this.all_options;
        builder.expand_label = this.expand_label;
        builder.primary_button_label = this.primary_button_label;
        builder.search_placeholder_text = this.search_placeholder_text;
        builder.preselected_option_identifier = this.preselected_option_identifier;
        builder.secondary_action = this.secondary_action;
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
        if (!this.promoted_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("promoted_options=", arrayList, this.promoted_options);
        }
        if (!this.all_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("all_options=", arrayList, this.all_options);
        }
        String str3 = this.expand_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "expand_label=", arrayList);
        }
        String str4 = this.primary_button_label;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "primary_button_label=", arrayList);
        }
        String str5 = this.search_placeholder_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "search_placeholder_text=", arrayList);
        }
        String str6 = this.preselected_option_identifier;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "preselected_option_identifier=", arrayList);
        }
        SecondaryAction secondaryAction = this.secondary_action;
        if (secondaryAction != null) {
            arrayList.add("secondary_action=" + secondaryAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OverflowOptionPickerBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction$Builder;", "secondary_action_identifier", "", "secondary_action_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SecondaryAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SecondaryAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String secondary_action_identifier;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String secondary_action_label;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "<init>", "()V", "secondary_action_identifier", "", "secondary_action_label", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String secondary_action_identifier;
            public String secondary_action_label;

            @Override // com.squareup.wire.Message.Builder
            public SecondaryAction build() {
                return new SecondaryAction(this.secondary_action_identifier, this.secondary_action_label, buildUnknownFields());
            }

            public final Builder secondary_action_identifier(String secondary_action_identifier) {
                this.secondary_action_identifier = secondary_action_identifier;
                return this;
            }

            public final Builder secondary_action_label(String secondary_action_label) {
                this.secondary_action_label = secondary_action_label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SecondaryAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.OverflowOptionPickerBlocker$SecondaryAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public OverflowOptionPickerBlocker.SecondaryAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new OverflowOptionPickerBlocker.SecondaryAction((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, OverflowOptionPickerBlocker.SecondaryAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.secondary_action_identifier);
                    protoAdapter2.encodeWithTag(writer, 2, value.secondary_action_label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(OverflowOptionPickerBlocker.SecondaryAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.secondary_action_label) + protoAdapter2.encodedSizeWithTag(1, value.secondary_action_identifier) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public OverflowOptionPickerBlocker.SecondaryAction redact(OverflowOptionPickerBlocker.SecondaryAction value) {
                    value.getClass();
                    return OverflowOptionPickerBlocker.SecondaryAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, OverflowOptionPickerBlocker.SecondaryAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.secondary_action_label);
                    protoAdapter2.encodeWithTag(writer, 1, value.secondary_action_identifier);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SecondaryAction(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SecondaryAction copy$default(SecondaryAction secondaryAction, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = secondaryAction.secondary_action_identifier;
            }
            if ((i & 2) != 0) {
                str2 = secondaryAction.secondary_action_label;
            }
            if ((i & 4) != 0) {
                byteString = secondaryAction.unknownFields();
            }
            return secondaryAction.copy(str, str2, byteString);
        }

        public final SecondaryAction copy(String secondary_action_identifier, String secondary_action_label, ByteString unknownFields) {
            unknownFields.getClass();
            return new SecondaryAction(secondary_action_identifier, secondary_action_label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SecondaryAction)) {
                return false;
            }
            SecondaryAction secondaryAction = (SecondaryAction) other;
            return Intrinsics.areEqual(unknownFields(), secondaryAction.unknownFields()) && Intrinsics.areEqual(this.secondary_action_identifier, secondaryAction.secondary_action_identifier) && Intrinsics.areEqual(this.secondary_action_label, secondaryAction.secondary_action_label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.secondary_action_identifier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.secondary_action_label;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.secondary_action_identifier = this.secondary_action_identifier;
            builder.secondary_action_label = this.secondary_action_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.secondary_action_identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "secondary_action_identifier=", arrayList);
            }
            String str2 = this.secondary_action_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_action_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SecondaryAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$SecondaryAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SecondaryAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SecondaryAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryAction(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.secondary_action_identifier = str;
            this.secondary_action_label = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/OverflowOptionPickerBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ OverflowOptionPickerBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
