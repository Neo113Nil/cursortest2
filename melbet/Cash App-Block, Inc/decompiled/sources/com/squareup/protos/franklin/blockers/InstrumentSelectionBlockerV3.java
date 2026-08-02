package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000b\u000e\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Builder;", "", "title", "Ljava/lang/String;", "ctaButtonLabel", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "instrument_options", "Ljava/util/List;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection;", "instrument_sections", "Companion", "Builder", "SelectInstrumentAction", "LinkInstrumentAction", "ReplaceInstrumentAction", "ShowSheetInstrumentAction", "NoInstrumentAction", "Sheet", "IconBackgroundColor", "InstrumentOption", "InstrumentSection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstrumentSelectionBlockerV3 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentSelectionBlockerV3> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String ctaButtonLabel;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<InstrumentOption> instrument_options;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentSection#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<InstrumentSection> instrument_sections;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3;", "<init>", "()V", "title", "", "instrument_options", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "ctaButtonLabel", "instrument_sections", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String ctaButtonLabel;
        public List<InstrumentOption> instrument_options;
        public List<InstrumentSection> instrument_sections;
        public String title;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.instrument_options = emptyList;
            this.instrument_sections = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public InstrumentSelectionBlockerV3 build() {
            return new InstrumentSelectionBlockerV3(this.title, this.ctaButtonLabel, this.instrument_options, this.instrument_sections, buildUnknownFields());
        }

        public final Builder ctaButtonLabel(String ctaButtonLabel) {
            this.ctaButtonLabel = ctaButtonLabel;
            return this;
        }

        public final Builder instrument_options(List<InstrumentOption> instrument_options) {
            instrument_options.getClass();
            TransactorKt.checkElementsNotNull(instrument_options);
            this.instrument_options = instrument_options;
            return this;
        }

        public final Builder instrument_sections(List<InstrumentSection> instrument_sections) {
            instrument_sections.getClass();
            TransactorKt.checkElementsNotNull(instrument_sections);
            this.instrument_sections = instrument_sections;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006#$%&'(B\u0095\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0002H\u0016J\u0014\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0082\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u0096\u0080\u0004J\b\u0010 \u001a\u00020\u0004H\u0016J\u0099\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\"R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Builder;", "title", "", "subtitle", "selection_action", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "icon", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;", "preselected", "", "info_message", "icon_background_color", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor;", "tertiary_label", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;", "card_image_url", "fallback_arcade_id", "instrument_type", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/CashInstrumentType;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/CashInstrumentType;Lokio/ByteString;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "Builder", "SelectionAction", "Icon", "Companion", "TextColor", "InstrumentLabel", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InstrumentOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstrumentOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 14)
        public final String card_image_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 15)
        public final String fallback_arcade_id;

        @WireSealedOneof(schemaIndex = 3)
        public final Icon icon;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$IconBackgroundColor#ADAPTER", schemaIndex = 6, tag = 12)
        public final IconBackgroundColor icon_background_color;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 11)
        public final String info_message;

        @WireField(adapter = "com.squareup.protos.franklin.api.CashInstrumentType#ADAPTER", schemaIndex = 10, tag = 16)
        public final CashInstrumentType instrument_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 9)
        public final Boolean preselected;

        @WireSealedOneof(schemaIndex = 2)
        public final SelectionAction selection_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel#ADAPTER", schemaIndex = 7, tag = 13)
        public final InstrumentLabel tertiary_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0018J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "<init>", "()V", "title", "", "subtitle", "selection_action", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "icon", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;", "preselected", "", "Ljava/lang/Boolean;", "info_message", "icon_background_color", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor;", "tertiary_label", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;", "card_image_url", "fallback_arcade_id", "instrument_type", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String card_image_url;
            public String fallback_arcade_id;
            public Icon icon;
            public IconBackgroundColor icon_background_color;
            public String info_message;
            public CashInstrumentType instrument_type;
            public Boolean preselected;
            public SelectionAction selection_action;
            public String subtitle;
            public InstrumentLabel tertiary_label;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public InstrumentOption build() {
                return new InstrumentOption(this.title, this.subtitle, this.selection_action, this.icon, this.preselected, this.info_message, this.icon_background_color, this.tertiary_label, this.card_image_url, this.fallback_arcade_id, this.instrument_type, buildUnknownFields());
            }

            public final Builder card_image_url(String card_image_url) {
                this.card_image_url = card_image_url;
                return this;
            }

            public final Builder fallback_arcade_id(String fallback_arcade_id) {
                this.fallback_arcade_id = fallback_arcade_id;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder icon_background_color(IconBackgroundColor icon_background_color) {
                this.icon_background_color = icon_background_color;
                return this;
            }

            public final Builder info_message(String info_message) {
                this.info_message = info_message;
                return this;
            }

            public final Builder instrument_type(CashInstrumentType instrument_type) {
                this.instrument_type = instrument_type;
                return this;
            }

            public final Builder preselected(Boolean preselected) {
                this.preselected = preselected;
                return this;
            }

            public final Builder selection_action(SelectionAction selection_action) {
                this.selection_action = selection_action;
                return this;
            }

            public final Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder tertiary_label(InstrumentLabel tertiary_label) {
                this.tertiary_label = tertiary_label;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.InstrumentOption decode(ProtoReader reader) {
                    Object obj;
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction selectInstrumentAction;
                    Object obj5;
                    InstrumentSelectionBlockerV3.InstrumentOption.Icon url;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    Object obj10 = null;
                    InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction selectionAction = null;
                    InstrumentSelectionBlockerV3.InstrumentOption.Icon icon = null;
                    Object obj11 = null;
                    Object obj12 = null;
                    Object obj13 = null;
                    Object obj14 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.InstrumentOption((String) obj6, (String) obj7, selectionAction, icon, (Boolean) obj8, (String) obj9, (InstrumentSelectionBlockerV3.IconBackgroundColor) obj10, (InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel) obj11, (String) obj12, (String) obj13, (CashInstrumentType) obj14, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj4 = obj6;
                                selectInstrumentAction = new InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction((InstrumentSelectionBlockerV3.SelectInstrumentAction) InstrumentSelectionBlockerV3.SelectInstrumentAction.ADAPTER.decode(reader));
                                obj6 = obj4;
                                selectionAction = selectInstrumentAction;
                                break;
                            case 4:
                                obj4 = obj6;
                                selectInstrumentAction = new InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction((InstrumentSelectionBlockerV3.LinkInstrumentAction) InstrumentSelectionBlockerV3.LinkInstrumentAction.ADAPTER.decode(reader));
                                obj6 = obj4;
                                selectionAction = selectInstrumentAction;
                                break;
                            case 5:
                                obj4 = obj6;
                                selectInstrumentAction = new InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction((InstrumentSelectionBlockerV3.ReplaceInstrumentAction) InstrumentSelectionBlockerV3.ReplaceInstrumentAction.ADAPTER.decode(reader));
                                obj6 = obj4;
                                selectionAction = selectInstrumentAction;
                                break;
                            case 6:
                                obj4 = obj6;
                                selectInstrumentAction = new InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction((InstrumentSelectionBlockerV3.ShowSheetInstrumentAction) InstrumentSelectionBlockerV3.ShowSheetInstrumentAction.ADAPTER.decode(reader));
                                obj6 = obj4;
                                selectionAction = selectInstrumentAction;
                                break;
                            case 7:
                                obj5 = obj6;
                                url = new InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url((String) ProtoAdapter.STRING.decode(reader));
                                obj6 = obj5;
                                icon = url;
                                break;
                            case 8:
                                obj5 = obj6;
                                url = new InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId((String) ProtoAdapter.STRING.decode(reader));
                                obj6 = obj5;
                                icon = url;
                                break;
                            case 9:
                                obj8 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 10:
                                obj4 = obj6;
                                selectInstrumentAction = new InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction((InstrumentSelectionBlockerV3.NoInstrumentAction) InstrumentSelectionBlockerV3.NoInstrumentAction.ADAPTER.decode(reader));
                                obj6 = obj4;
                                selectionAction = selectInstrumentAction;
                                break;
                            case 11:
                                obj9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                obj = obj6;
                                obj2 = obj7;
                                obj3 = obj8;
                                try {
                                    obj6 = obj;
                                    obj10 = InstrumentSelectionBlockerV3.IconBackgroundColor.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                obj7 = obj2;
                                obj8 = obj3;
                                break;
                            case 13:
                                obj11 = TransactorKt.decodeMessageOrMerge(InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER, reader, obj11);
                                break;
                            case 14:
                                obj12 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 15:
                                obj13 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 16:
                                try {
                                    obj14 = CashInstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    obj = obj6;
                                    obj2 = obj7;
                                    obj3 = obj8;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj6;
                                obj2 = obj7;
                                obj3 = obj8;
                                obj6 = obj;
                                obj7 = obj2;
                                obj8 = obj3;
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.InstrumentOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    InstrumentSelectionBlockerV3.InstrumentOption.Icon icon = value.icon;
                    if (icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 7, ((InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url) icon).getValue());
                    } else if (icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 8, ((InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId) icon).getValue());
                    } else if (icon != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction selectionAction = value.selection_action;
                    if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) {
                        InstrumentSelectionBlockerV3.SelectInstrumentAction.ADAPTER.encodeWithTag(writer, 3, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) {
                        InstrumentSelectionBlockerV3.LinkInstrumentAction.ADAPTER.encodeWithTag(writer, 4, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) {
                        InstrumentSelectionBlockerV3.ReplaceInstrumentAction.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) {
                        InstrumentSelectionBlockerV3.ShowSheetInstrumentAction.ADAPTER.encodeWithTag(writer, 6, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction) {
                        InstrumentSelectionBlockerV3.NoInstrumentAction.ADAPTER.encodeWithTag(writer, 10, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 16, value.instrument_type);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 15, value.fallback_arcade_id);
                    protoAdapter2.encodeWithTag(writer, 14, value.card_image_url);
                    InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER.encodeWithTag(writer, 13, value.tertiary_label);
                    InstrumentSelectionBlockerV3.IconBackgroundColor.ADAPTER.encodeWithTag(writer, 12, value.icon_background_color);
                    protoAdapter2.encodeWithTag(writer, 11, value.info_message);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.preselected);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
                @Override // com.squareup.wire.ProtoAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int encodedSize(InstrumentSelectionBlockerV3.InstrumentOption value) {
                    int encodedSizeWithTag;
                    InstrumentSelectionBlockerV3.InstrumentOption.Icon icon;
                    int encodedSizeWithTag2;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction selectionAction = value.selection_action;
                    if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) {
                        encodedSizeWithTag = InstrumentSelectionBlockerV3.SelectInstrumentAction.ADAPTER.encodedSizeWithTag(3, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) {
                        encodedSizeWithTag = InstrumentSelectionBlockerV3.LinkInstrumentAction.ADAPTER.encodedSizeWithTag(4, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) {
                        encodedSizeWithTag = InstrumentSelectionBlockerV3.ReplaceInstrumentAction.ADAPTER.encodedSizeWithTag(5, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) {
                        encodedSizeWithTag = InstrumentSelectionBlockerV3.ShowSheetInstrumentAction.ADAPTER.encodedSizeWithTag(6, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) selectionAction).getValue());
                    } else {
                        if (!(selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction)) {
                            if (selectionAction != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            icon = value.icon;
                            if (!(icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url)) {
                                encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(7, ((InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url) icon).getValue());
                            } else {
                                if (!(icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId)) {
                                    if (icon != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return 0;
                                    }
                                    return CashInstrumentType.ADAPTER.encodedSizeWithTag(16, value.instrument_type) + protoAdapter2.encodedSizeWithTag(15, value.fallback_arcade_id) + protoAdapter2.encodedSizeWithTag(14, value.card_image_url) + InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER.encodedSizeWithTag(13, value.tertiary_label) + InstrumentSelectionBlockerV3.IconBackgroundColor.ADAPTER.encodedSizeWithTag(12, value.icon_background_color) + protoAdapter2.encodedSizeWithTag(11, value.info_message) + ProtoAdapter.BOOL.encodedSizeWithTag(9, value.preselected) + encodedSizeWithTag3;
                                }
                                encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(8, ((InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId) icon).getValue());
                            }
                            encodedSizeWithTag3 += encodedSizeWithTag2;
                            return CashInstrumentType.ADAPTER.encodedSizeWithTag(16, value.instrument_type) + protoAdapter2.encodedSizeWithTag(15, value.fallback_arcade_id) + protoAdapter2.encodedSizeWithTag(14, value.card_image_url) + InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER.encodedSizeWithTag(13, value.tertiary_label) + InstrumentSelectionBlockerV3.IconBackgroundColor.ADAPTER.encodedSizeWithTag(12, value.icon_background_color) + protoAdapter2.encodedSizeWithTag(11, value.info_message) + ProtoAdapter.BOOL.encodedSizeWithTag(9, value.preselected) + encodedSizeWithTag3;
                        }
                        encodedSizeWithTag = InstrumentSelectionBlockerV3.NoInstrumentAction.ADAPTER.encodedSizeWithTag(10, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction) selectionAction).getValue());
                    }
                    encodedSizeWithTag3 += encodedSizeWithTag;
                    icon = value.icon;
                    if (!(icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url)) {
                    }
                    encodedSizeWithTag3 += encodedSizeWithTag2;
                    return CashInstrumentType.ADAPTER.encodedSizeWithTag(16, value.instrument_type) + protoAdapter2.encodedSizeWithTag(15, value.fallback_arcade_id) + protoAdapter2.encodedSizeWithTag(14, value.card_image_url) + InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER.encodedSizeWithTag(13, value.tertiary_label) + InstrumentSelectionBlockerV3.IconBackgroundColor.ADAPTER.encodedSizeWithTag(12, value.icon_background_color) + protoAdapter2.encodedSizeWithTag(11, value.info_message) + ProtoAdapter.BOOL.encodedSizeWithTag(9, value.preselected) + encodedSizeWithTag3;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.InstrumentOption redact(InstrumentSelectionBlockerV3.InstrumentOption value) {
                    value.getClass();
                    InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel instrumentLabel = value.tertiary_label;
                    return InstrumentSelectionBlockerV3.InstrumentOption.copy$default(value, null, null, null, null, null, null, null, instrumentLabel != null ? (InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel) InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER.redact(instrumentLabel) : null, null, null, null, ByteString.EMPTY, 1919, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.InstrumentOption value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.preselected);
                    protoAdapter2.encodeWithTag(writer, 11, value.info_message);
                    InstrumentSelectionBlockerV3.IconBackgroundColor.ADAPTER.encodeWithTag(writer, 12, value.icon_background_color);
                    InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.ADAPTER.encodeWithTag(writer, 13, value.tertiary_label);
                    protoAdapter2.encodeWithTag(writer, 14, value.card_image_url);
                    protoAdapter2.encodeWithTag(writer, 15, value.fallback_arcade_id);
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 16, value.instrument_type);
                    InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction selectionAction = value.selection_action;
                    if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) {
                        InstrumentSelectionBlockerV3.SelectInstrumentAction.ADAPTER.encodeWithTag(writer, 3, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) {
                        InstrumentSelectionBlockerV3.LinkInstrumentAction.ADAPTER.encodeWithTag(writer, 4, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) {
                        InstrumentSelectionBlockerV3.ReplaceInstrumentAction.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) {
                        InstrumentSelectionBlockerV3.ShowSheetInstrumentAction.ADAPTER.encodeWithTag(writer, 6, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction) {
                        InstrumentSelectionBlockerV3.NoInstrumentAction.ADAPTER.encodeWithTag(writer, 10, ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction) selectionAction).getValue());
                    } else if (selectionAction != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    InstrumentSelectionBlockerV3.InstrumentOption.Icon icon = value.icon;
                    if (icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url) {
                        protoAdapter2.encodeWithTag(writer, 7, ((InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url) icon).getValue());
                    } else if (icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId) {
                        protoAdapter2.encodeWithTag(writer, 8, ((InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId) icon).getValue());
                    } else if (icon != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InstrumentOption(String str, String str2, SelectionAction selectionAction, Icon icon, Boolean bool, String str3, IconBackgroundColor iconBackgroundColor, InstrumentLabel instrumentLabel, String str4, String str5, CashInstrumentType cashInstrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : selectionAction, (i & 8) != 0 ? null : icon, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : iconBackgroundColor, (i & 128) != 0 ? null : instrumentLabel, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : cashInstrumentType, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InstrumentOption copy$default(InstrumentOption instrumentOption, String str, String str2, SelectionAction selectionAction, Icon icon, Boolean bool, String str3, IconBackgroundColor iconBackgroundColor, InstrumentLabel instrumentLabel, String str4, String str5, CashInstrumentType cashInstrumentType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instrumentOption.title;
            }
            if ((i & 2) != 0) {
                str2 = instrumentOption.subtitle;
            }
            if ((i & 4) != 0) {
                selectionAction = instrumentOption.selection_action;
            }
            if ((i & 8) != 0) {
                icon = instrumentOption.icon;
            }
            if ((i & 16) != 0) {
                bool = instrumentOption.preselected;
            }
            if ((i & 32) != 0) {
                str3 = instrumentOption.info_message;
            }
            if ((i & 64) != 0) {
                iconBackgroundColor = instrumentOption.icon_background_color;
            }
            if ((i & 128) != 0) {
                instrumentLabel = instrumentOption.tertiary_label;
            }
            if ((i & 256) != 0) {
                str4 = instrumentOption.card_image_url;
            }
            if ((i & 512) != 0) {
                str5 = instrumentOption.fallback_arcade_id;
            }
            if ((i & 1024) != 0) {
                cashInstrumentType = instrumentOption.instrument_type;
            }
            if ((i & 2048) != 0) {
                byteString = instrumentOption.unknownFields();
            }
            CashInstrumentType cashInstrumentType2 = cashInstrumentType;
            ByteString byteString2 = byteString;
            String str6 = str4;
            String str7 = str5;
            IconBackgroundColor iconBackgroundColor2 = iconBackgroundColor;
            InstrumentLabel instrumentLabel2 = instrumentLabel;
            Boolean bool2 = bool;
            String str8 = str3;
            return instrumentOption.copy(str, str2, selectionAction, icon, bool2, str8, iconBackgroundColor2, instrumentLabel2, str6, str7, cashInstrumentType2, byteString2);
        }

        public final InstrumentOption copy(String title, String subtitle, SelectionAction selection_action, Icon icon, Boolean preselected, String info_message, IconBackgroundColor icon_background_color, InstrumentLabel tertiary_label, String card_image_url, String fallback_arcade_id, CashInstrumentType instrument_type, ByteString unknownFields) {
            unknownFields.getClass();
            return new InstrumentOption(title, subtitle, selection_action, icon, preselected, info_message, icon_background_color, tertiary_label, card_image_url, fallback_arcade_id, instrument_type, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InstrumentOption)) {
                return false;
            }
            InstrumentOption instrumentOption = (InstrumentOption) other;
            return Intrinsics.areEqual(unknownFields(), instrumentOption.unknownFields()) && Intrinsics.areEqual(this.title, instrumentOption.title) && Intrinsics.areEqual(this.subtitle, instrumentOption.subtitle) && Intrinsics.areEqual(this.selection_action, instrumentOption.selection_action) && Intrinsics.areEqual(this.icon, instrumentOption.icon) && Intrinsics.areEqual(this.preselected, instrumentOption.preselected) && Intrinsics.areEqual(this.info_message, instrumentOption.info_message) && this.icon_background_color == instrumentOption.icon_background_color && Intrinsics.areEqual(this.tertiary_label, instrumentOption.tertiary_label) && Intrinsics.areEqual(this.card_image_url, instrumentOption.card_image_url) && Intrinsics.areEqual(this.fallback_arcade_id, instrumentOption.fallback_arcade_id) && this.instrument_type == instrumentOption.instrument_type;
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
            SelectionAction selectionAction = this.selection_action;
            int hashCode4 = (hashCode3 + (selectionAction != null ? selectionAction.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode5 = (hashCode4 + (icon != null ? icon.hashCode() : 0)) * 37;
            Boolean bool = this.preselected;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str3 = this.info_message;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
            IconBackgroundColor iconBackgroundColor = this.icon_background_color;
            int hashCode8 = (hashCode7 + (iconBackgroundColor != null ? iconBackgroundColor.hashCode() : 0)) * 37;
            InstrumentLabel instrumentLabel = this.tertiary_label;
            int hashCode9 = (hashCode8 + (instrumentLabel != null ? instrumentLabel.hashCode() : 0)) * 37;
            String str4 = this.card_image_url;
            int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.fallback_arcade_id;
            int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
            CashInstrumentType cashInstrumentType = this.instrument_type;
            int hashCode12 = hashCode11 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.selection_action = this.selection_action;
            builder.icon = this.icon;
            builder.preselected = this.preselected;
            builder.info_message = this.info_message;
            builder.icon_background_color = this.icon_background_color;
            builder.tertiary_label = this.tertiary_label;
            builder.card_image_url = this.card_image_url;
            builder.fallback_arcade_id = this.fallback_arcade_id;
            builder.instrument_type = this.instrument_type;
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
            SelectionAction selectionAction = this.selection_action;
            if (selectionAction != null) {
                arrayList.add("selection_action=" + selectionAction);
            }
            Icon icon = this.icon;
            if (icon != null) {
                arrayList.add("icon=" + icon);
            }
            Boolean bool = this.preselected;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("preselected=", bool, arrayList);
            }
            String str3 = this.info_message;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "info_message=", arrayList);
            }
            IconBackgroundColor iconBackgroundColor = this.icon_background_color;
            if (iconBackgroundColor != null) {
                arrayList.add("icon_background_color=" + iconBackgroundColor);
            }
            InstrumentLabel instrumentLabel = this.tertiary_label;
            if (instrumentLabel != null) {
                arrayList.add("tertiary_label=" + instrumentLabel);
            }
            String str4 = this.card_image_url;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "card_image_url=", arrayList);
            }
            String str5 = this.fallback_arcade_id;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "fallback_arcade_id=", arrayList);
            }
            CashInstrumentType cashInstrumentType = this.instrument_type;
            if (cashInstrumentType != null) {
                arrayList.add("instrument_type=" + cashInstrumentType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel$Builder;", AnnotatedPrivateKey.LABEL, "", "color", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$TextColor;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$TextColor;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class InstrumentLabel extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<InstrumentLabel> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption$TextColor#ADAPTER", schemaIndex = 1, tag = 2)
            public final TextColor color;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "color", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$TextColor;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public TextColor color;
                public String label;

                @Override // com.squareup.wire.Message.Builder
                public InstrumentLabel build() {
                    return new InstrumentLabel(this.label, this.color, buildUnknownFields());
                }

                public final Builder color(TextColor color) {
                    this.color = color;
                    return this;
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentLabel.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel((String) obj, (InstrumentSelectionBlockerV3.InstrumentOption.TextColor) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                try {
                                    obj2 = InstrumentSelectionBlockerV3.InstrumentOption.TextColor.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                        InstrumentSelectionBlockerV3.InstrumentOption.TextColor.ADAPTER.encodeWithTag(writer, 2, value.color);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel value) {
                        value.getClass();
                        return InstrumentSelectionBlockerV3.InstrumentOption.TextColor.ADAPTER.encodedSizeWithTag(2, value.color) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.label) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel redact(InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel value) {
                        value.getClass();
                        return InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        InstrumentSelectionBlockerV3.InstrumentOption.TextColor.ADAPTER.encodeWithTag(writer, 2, value.color);
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ InstrumentLabel(String str, TextColor textColor, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : textColor, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ InstrumentLabel copy$default(InstrumentLabel instrumentLabel, String str, TextColor textColor, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = instrumentLabel.label;
                }
                if ((i & 2) != 0) {
                    textColor = instrumentLabel.color;
                }
                if ((i & 4) != 0) {
                    byteString = instrumentLabel.unknownFields();
                }
                return instrumentLabel.copy(str, textColor, byteString);
            }

            public final InstrumentLabel copy(String label, TextColor color, ByteString unknownFields) {
                unknownFields.getClass();
                return new InstrumentLabel(label, color, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof InstrumentLabel)) {
                    return false;
                }
                InstrumentLabel instrumentLabel = (InstrumentLabel) other;
                return Intrinsics.areEqual(unknownFields(), instrumentLabel.unknownFields()) && Intrinsics.areEqual(this.label, instrumentLabel.label) && this.color == instrumentLabel.color;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                TextColor textColor = this.color;
                int hashCode3 = hashCode2 + (textColor != null ? textColor.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.color = this.color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                TextColor textColor = this.color;
                if (textColor != null) {
                    arrayList.add("color=" + textColor);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLabel{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$InstrumentLabel;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ InstrumentLabel build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public InstrumentLabel() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstrumentLabel(String str, TextColor textColor, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.color = textColor;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$TextColor;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "DANGER", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TextColor implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TextColor[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final TextColor DANGER;
            public static final TextColor DEFAULT;
            private final int value;

            private static final /* synthetic */ TextColor[] $values() {
                return new TextColor[]{DEFAULT, DANGER};
            }

            static {
                final TextColor textColor = new TextColor("DEFAULT", 0, 0);
                DEFAULT = textColor;
                DANGER = new TextColor("DANGER", 1, 1);
                TextColor[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextColor.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, textColor) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption$TextColor$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public InstrumentSelectionBlockerV3.InstrumentOption.TextColor fromValue(int value) {
                        return InstrumentSelectionBlockerV3.InstrumentOption.TextColor.INSTANCE.fromValue(value);
                    }
                };
            }

            private TextColor(String str, int i, int i2) {
                this.value = i2;
            }

            public static final TextColor fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static TextColor valueOf(String str) {
                return (TextColor) Enum.valueOf(TextColor.class, str);
            }

            public static TextColor[] values() {
                return (TextColor[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$TextColor$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$TextColor;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final TextColor fromValue(int value) {
                    if (value == 0) {
                        return TextColor.DEFAULT;
                    }
                    if (value != 1) {
                        return null;
                    }
                    return TextColor.DANGER;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InstrumentOption build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;", "", "<init>", "()V", "Url", "ArcadeId", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon$ArcadeId;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon$Url;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Icon {

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "arcade_id", tag = 8)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon$ArcadeId;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ArcadeId extends Icon {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ArcadeId(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ ArcadeId copy$default(ArcadeId arcadeId, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = arcadeId.value;
                    }
                    return arcadeId.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final ArcadeId copy(String value) {
                    value.getClass();
                    return new ArcadeId(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ArcadeId) && Intrinsics.areEqual(this.value, ((ArcadeId) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ArcadeId(value=", this.value, ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "url", tag = 7)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon$Url;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$Icon;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Url extends Icon {
                private final String value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Url(String str) {
                    super(null);
                    str.getClass();
                    this.value = str;
                }

                public static /* synthetic */ Url copy$default(Url url, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = url.value;
                    }
                    return url.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final Url copy(String value) {
                    value.getClass();
                    return new Url(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Url) && Intrinsics.areEqual(this.value, ((Url) other).value);
                }

                public final String getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Url(value=", this.value, ")");
                }
            }

            public /* synthetic */ Icon(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Icon() {
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "", "<init>", "()V", "SelectInstrumentAction", "LinkInstrumentAction", "ReplaceInstrumentAction", "ShowSheetInstrumentAction", "NoInstrumentAction", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$LinkInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$NoInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$ReplaceInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$SelectInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$ShowSheetInstrumentAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class SelectionAction {

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$LinkInstrumentAction#ADAPTER", declaredName = "link_instrument_action", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$LinkInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class LinkInstrumentAction extends SelectionAction {
                private final LinkInstrumentAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LinkInstrumentAction(LinkInstrumentAction linkInstrumentAction) {
                    super(null);
                    linkInstrumentAction.getClass();
                    this.value = linkInstrumentAction;
                }

                public static /* synthetic */ LinkInstrumentAction copy$default(LinkInstrumentAction linkInstrumentAction, LinkInstrumentAction linkInstrumentAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        linkInstrumentAction2 = linkInstrumentAction.value;
                    }
                    return linkInstrumentAction.copy(linkInstrumentAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final LinkInstrumentAction getValue() {
                    return this.value;
                }

                public final LinkInstrumentAction copy(LinkInstrumentAction value) {
                    value.getClass();
                    return new LinkInstrumentAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof LinkInstrumentAction) && Intrinsics.areEqual(this.value, ((LinkInstrumentAction) other).value);
                }

                public final LinkInstrumentAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "LinkInstrumentAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$NoInstrumentAction#ADAPTER", declaredName = "no_instrument_action", tag = 10)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$NoInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class NoInstrumentAction extends SelectionAction {
                private final NoInstrumentAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NoInstrumentAction(NoInstrumentAction noInstrumentAction) {
                    super(null);
                    noInstrumentAction.getClass();
                    this.value = noInstrumentAction;
                }

                public static /* synthetic */ NoInstrumentAction copy$default(NoInstrumentAction noInstrumentAction, NoInstrumentAction noInstrumentAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        noInstrumentAction2 = noInstrumentAction.value;
                    }
                    return noInstrumentAction.copy(noInstrumentAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final NoInstrumentAction getValue() {
                    return this.value;
                }

                public final NoInstrumentAction copy(NoInstrumentAction value) {
                    value.getClass();
                    return new NoInstrumentAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NoInstrumentAction) && Intrinsics.areEqual(this.value, ((NoInstrumentAction) other).value);
                }

                public final NoInstrumentAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "NoInstrumentAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$ReplaceInstrumentAction#ADAPTER", declaredName = "replace_instrument_action", tag = 5)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$ReplaceInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ReplaceInstrumentAction extends SelectionAction {
                private final ReplaceInstrumentAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ReplaceInstrumentAction(ReplaceInstrumentAction replaceInstrumentAction) {
                    super(null);
                    replaceInstrumentAction.getClass();
                    this.value = replaceInstrumentAction;
                }

                public static /* synthetic */ ReplaceInstrumentAction copy$default(ReplaceInstrumentAction replaceInstrumentAction, ReplaceInstrumentAction replaceInstrumentAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        replaceInstrumentAction2 = replaceInstrumentAction.value;
                    }
                    return replaceInstrumentAction.copy(replaceInstrumentAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final ReplaceInstrumentAction getValue() {
                    return this.value;
                }

                public final ReplaceInstrumentAction copy(ReplaceInstrumentAction value) {
                    value.getClass();
                    return new ReplaceInstrumentAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ReplaceInstrumentAction) && Intrinsics.areEqual(this.value, ((ReplaceInstrumentAction) other).value);
                }

                public final ReplaceInstrumentAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ReplaceInstrumentAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$SelectInstrumentAction#ADAPTER", declaredName = "select_instrument_action", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$SelectInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class SelectInstrumentAction extends SelectionAction {
                private final SelectInstrumentAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectInstrumentAction(SelectInstrumentAction selectInstrumentAction) {
                    super(null);
                    selectInstrumentAction.getClass();
                    this.value = selectInstrumentAction;
                }

                public static /* synthetic */ SelectInstrumentAction copy$default(SelectInstrumentAction selectInstrumentAction, SelectInstrumentAction selectInstrumentAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        selectInstrumentAction2 = selectInstrumentAction.value;
                    }
                    return selectInstrumentAction.copy(selectInstrumentAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final SelectInstrumentAction getValue() {
                    return this.value;
                }

                public final SelectInstrumentAction copy(SelectInstrumentAction value) {
                    value.getClass();
                    return new SelectInstrumentAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SelectInstrumentAction) && Intrinsics.areEqual(this.value, ((SelectInstrumentAction) other).value);
                }

                public final SelectInstrumentAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "SelectInstrumentAction(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$ShowSheetInstrumentAction#ADAPTER", declaredName = "show_sheet_instrument_action", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction$ShowSheetInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ShowSheetInstrumentAction extends SelectionAction {
                private final ShowSheetInstrumentAction value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShowSheetInstrumentAction(ShowSheetInstrumentAction showSheetInstrumentAction) {
                    super(null);
                    showSheetInstrumentAction.getClass();
                    this.value = showSheetInstrumentAction;
                }

                public static /* synthetic */ ShowSheetInstrumentAction copy$default(ShowSheetInstrumentAction showSheetInstrumentAction, ShowSheetInstrumentAction showSheetInstrumentAction2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        showSheetInstrumentAction2 = showSheetInstrumentAction.value;
                    }
                    return showSheetInstrumentAction.copy(showSheetInstrumentAction2);
                }

                /* renamed from: component1, reason: from getter */
                public final ShowSheetInstrumentAction getValue() {
                    return this.value;
                }

                public final ShowSheetInstrumentAction copy(ShowSheetInstrumentAction value) {
                    value.getClass();
                    return new ShowSheetInstrumentAction(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ShowSheetInstrumentAction) && Intrinsics.areEqual(this.value, ((ShowSheetInstrumentAction) other).value);
                }

                public final ShowSheetInstrumentAction getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ShowSheetInstrumentAction(value=" + this.value + ")";
                }
            }

            public /* synthetic */ SelectionAction(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private SelectionAction() {
            }
        }

        public InstrumentOption() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentOption(String str, String str2, SelectionAction selectionAction, Icon icon, Boolean bool, String str3, IconBackgroundColor iconBackgroundColor, InstrumentLabel instrumentLabel, String str4, String str5, CashInstrumentType cashInstrumentType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.selection_action = selectionAction;
            this.icon = icon;
            this.preselected = bool;
            this.info_message = str3;
            this.icon_background_color = iconBackgroundColor;
            this.tertiary_label = instrumentLabel;
            this.card_image_url = str4;
            this.fallback_arcade_id = str5;
            this.instrument_type = cashInstrumentType;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentSelectionBlockerV3.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentSelectionBlockerV3 decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InstrumentSelectionBlockerV3((String) obj, (String) obj2, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(InstrumentSelectionBlockerV3.InstrumentSection.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3 value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.instrument_options);
                protoAdapter2.encodeWithTag(writer, 3, value.ctaButtonLabel);
                InstrumentSelectionBlockerV3.InstrumentSection.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.instrument_sections);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentSelectionBlockerV3 value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return InstrumentSelectionBlockerV3.InstrumentSection.ADAPTER.asRepeated().encodedSizeWithTag(4, value.instrument_sections) + protoAdapter2.encodedSizeWithTag(3, value.ctaButtonLabel) + InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodedSizeWithTag(2, value.instrument_options) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentSelectionBlockerV3 redact(InstrumentSelectionBlockerV3 value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.instrument_options, InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.instrument_sections, InstrumentSelectionBlockerV3.InstrumentSection.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.ctaButtonLabel;
                byteString.getClass();
                return new InstrumentSelectionBlockerV3(str, str2, m1169redactElements, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3 value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InstrumentSelectionBlockerV3.InstrumentSection.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.instrument_sections);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.ctaButtonLabel);
                InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.instrument_options);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionBlockerV3(String str, String str2, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.title = str;
        this.ctaButtonLabel = str2;
        this.instrument_options = TransactorKt.immutableCopyOf("instrument_options", list);
        this.instrument_sections = TransactorKt.immutableCopyOf("instrument_sections", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionBlockerV3)) {
            return false;
        }
        InstrumentSelectionBlockerV3 instrumentSelectionBlockerV3 = (InstrumentSelectionBlockerV3) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentSelectionBlockerV3.unknownFields()) && Intrinsics.areEqual(this.title, instrumentSelectionBlockerV3.title) && Intrinsics.areEqual(this.instrument_options, instrumentSelectionBlockerV3.instrument_options) && Intrinsics.areEqual(this.ctaButtonLabel, instrumentSelectionBlockerV3.ctaButtonLabel) && Intrinsics.areEqual(this.instrument_sections, instrumentSelectionBlockerV3.instrument_sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.instrument_options);
        String str2 = this.ctaButtonLabel;
        int hashCode2 = this.instrument_sections.hashCode() + ((m + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.instrument_options = this.instrument_options;
        builder.ctaButtonLabel = this.ctaButtonLabel;
        builder.instrument_sections = this.instrument_sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        if (!this.instrument_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_options=", arrayList, this.instrument_options);
        }
        String str2 = this.ctaButtonLabel;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ctaButtonLabel=", arrayList);
        }
        if (!this.instrument_sections.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_sections=", arrayList, this.instrument_sections);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentSelectionBlockerV3{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "BRAND", "NONE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class IconBackgroundColor implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconBackgroundColor[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final IconBackgroundColor BRAND;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final IconBackgroundColor DEFAULT;
        public static final IconBackgroundColor NONE;
        private final int value;

        private static final /* synthetic */ IconBackgroundColor[] $values() {
            return new IconBackgroundColor[]{DEFAULT, BRAND, NONE};
        }

        static {
            final IconBackgroundColor iconBackgroundColor = new IconBackgroundColor("DEFAULT", 0, 0);
            DEFAULT = iconBackgroundColor;
            BRAND = new IconBackgroundColor("BRAND", 1, 1);
            NONE = new IconBackgroundColor("NONE", 2, 2);
            IconBackgroundColor[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IconBackgroundColor.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, iconBackgroundColor) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$IconBackgroundColor$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public InstrumentSelectionBlockerV3.IconBackgroundColor fromValue(int value) {
                    return InstrumentSelectionBlockerV3.IconBackgroundColor.INSTANCE.fromValue(value);
                }
            };
        }

        private IconBackgroundColor(String str, int i, int i2) {
            this.value = i2;
        }

        public static final IconBackgroundColor fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static IconBackgroundColor valueOf(String str) {
            return (IconBackgroundColor) Enum.valueOf(IconBackgroundColor.class, str);
        }

        public static IconBackgroundColor[] values() {
            return (IconBackgroundColor[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$IconBackgroundColor;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final IconBackgroundColor fromValue(int value) {
                if (value == 0) {
                    return IconBackgroundColor.DEFAULT;
                }
                if (value == 1) {
                    return IconBackgroundColor.BRAND;
                }
                if (value != 2) {
                    return null;
                }
                return IconBackgroundColor.NONE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J,\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection$Builder;", "title", "", "instrument_options", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InstrumentSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstrumentSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<InstrumentOption> instrument_options;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection;", "<init>", "()V", "title", "", "instrument_options", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<InstrumentOption> instrument_options = EmptyList.INSTANCE;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public InstrumentSection build() {
                return new InstrumentSection(this.title, this.instrument_options, buildUnknownFields());
            }

            public final Builder instrument_options(List<InstrumentOption> instrument_options) {
                instrument_options.getClass();
                TransactorKt.checkElementsNotNull(instrument_options);
                this.instrument_options = instrument_options;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.InstrumentSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.InstrumentSection((String) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.InstrumentSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                    InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.instrument_options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.InstrumentSection value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodedSizeWithTag(2, value.instrument_options) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.InstrumentSection redact(InstrumentSelectionBlockerV3.InstrumentSection value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.InstrumentSection.copy$default(value, null, TransactorKt.m1169redactElements(value.instrument_options, InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER), ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.InstrumentSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.instrument_options);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentSection(String str, List<InstrumentOption> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.instrument_options = TransactorKt.immutableCopyOf("instrument_options", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InstrumentSection copy$default(InstrumentSection instrumentSection, String str, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instrumentSection.title;
            }
            if ((i & 2) != 0) {
                list = instrumentSection.instrument_options;
            }
            if ((i & 4) != 0) {
                byteString = instrumentSection.unknownFields();
            }
            return instrumentSection.copy(str, list, byteString);
        }

        public final InstrumentSection copy(String title, List<InstrumentOption> instrument_options, ByteString unknownFields) {
            instrument_options.getClass();
            unknownFields.getClass();
            return new InstrumentSection(title, instrument_options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InstrumentSection)) {
                return false;
            }
            InstrumentSection instrumentSection = (InstrumentSection) other;
            return Intrinsics.areEqual(unknownFields(), instrumentSection.unknownFields()) && Intrinsics.areEqual(this.title, instrumentSection.title) && Intrinsics.areEqual(this.instrument_options, instrumentSection.instrument_options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = this.instrument_options.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.instrument_options = this.instrument_options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            if (!this.instrument_options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("instrument_options=", arrayList, this.instrument_options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InstrumentSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InstrumentSection(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public InstrumentSection() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction$Builder;", "instrumentType", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/CashInstrumentType;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class LinkInstrumentAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LinkInstrumentAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.CashInstrumentType#ADAPTER", schemaIndex = 0, tag = 1)
        public final CashInstrumentType instrumentType;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;", "<init>", "()V", "instrumentType", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public CashInstrumentType instrumentType;

            @Override // com.squareup.wire.Message.Builder
            public LinkInstrumentAction build() {
                return new LinkInstrumentAction(this.instrumentType, buildUnknownFields());
            }

            public final Builder instrumentType(CashInstrumentType instrumentType) {
                this.instrumentType = instrumentType;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LinkInstrumentAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$LinkInstrumentAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.LinkInstrumentAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.LinkInstrumentAction((CashInstrumentType) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            try {
                                obj = CashInstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.LinkInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 1, value.instrumentType);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.LinkInstrumentAction value) {
                    value.getClass();
                    return CashInstrumentType.ADAPTER.encodedSizeWithTag(1, value.instrumentType) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.LinkInstrumentAction redact(InstrumentSelectionBlockerV3.LinkInstrumentAction value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.LinkInstrumentAction.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.LinkInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 1, value.instrumentType);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LinkInstrumentAction(CashInstrumentType cashInstrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cashInstrumentType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LinkInstrumentAction copy$default(LinkInstrumentAction linkInstrumentAction, CashInstrumentType cashInstrumentType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                cashInstrumentType = linkInstrumentAction.instrumentType;
            }
            if ((i & 2) != 0) {
                byteString = linkInstrumentAction.unknownFields();
            }
            return linkInstrumentAction.copy(cashInstrumentType, byteString);
        }

        public final LinkInstrumentAction copy(CashInstrumentType instrumentType, ByteString unknownFields) {
            unknownFields.getClass();
            return new LinkInstrumentAction(instrumentType, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LinkInstrumentAction)) {
                return false;
            }
            LinkInstrumentAction linkInstrumentAction = (LinkInstrumentAction) other;
            return Intrinsics.areEqual(unknownFields(), linkInstrumentAction.unknownFields()) && this.instrumentType == linkInstrumentAction.instrumentType;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CashInstrumentType cashInstrumentType = this.instrumentType;
            int hashCode2 = hashCode + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.instrumentType = this.instrumentType;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            CashInstrumentType cashInstrumentType = this.instrumentType;
            if (cashInstrumentType != null) {
                arrayList.add("instrumentType=" + cashInstrumentType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LinkInstrumentAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$LinkInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LinkInstrumentAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LinkInstrumentAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkInstrumentAction(CashInstrumentType cashInstrumentType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrumentType = cashInstrumentType;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class NoInstrumentAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NoInstrumentAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public NoInstrumentAction build() {
                return new NoInstrumentAction(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NoInstrumentAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$NoInstrumentAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.NoInstrumentAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.NoInstrumentAction(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.NoInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.NoInstrumentAction value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.NoInstrumentAction redact(InstrumentSelectionBlockerV3.NoInstrumentAction value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.NoInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ NoInstrumentAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ NoInstrumentAction copy$default(NoInstrumentAction noInstrumentAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = noInstrumentAction.unknownFields();
            }
            return noInstrumentAction.copy(byteString);
        }

        public final NoInstrumentAction copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new NoInstrumentAction(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof NoInstrumentAction) && Intrinsics.areEqual(unknownFields(), ((NoInstrumentAction) other).unknownFields());
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
            return "NoInstrumentAction{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$NoInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ NoInstrumentAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoInstrumentAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInstrumentAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction$Builder;", "instrumentToken", "", "instrumentType", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/CashInstrumentType;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ReplaceInstrumentAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ReplaceInstrumentAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String instrumentToken;

        @WireField(adapter = "com.squareup.protos.franklin.api.CashInstrumentType#ADAPTER", schemaIndex = 1, tag = 2)
        public final CashInstrumentType instrumentType;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;", "<init>", "()V", "instrumentToken", "", "instrumentType", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String instrumentToken;
            public CashInstrumentType instrumentType;

            @Override // com.squareup.wire.Message.Builder
            public ReplaceInstrumentAction build() {
                return new ReplaceInstrumentAction(this.instrumentToken, this.instrumentType, buildUnknownFields());
            }

            public final Builder instrumentToken(String instrumentToken) {
                this.instrumentToken = instrumentToken;
                return this;
            }

            public final Builder instrumentType(CashInstrumentType instrumentType) {
                this.instrumentType = instrumentType;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReplaceInstrumentAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$ReplaceInstrumentAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.ReplaceInstrumentAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.ReplaceInstrumentAction((String) obj, (CashInstrumentType) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj2 = CashInstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.ReplaceInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.instrumentToken);
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 2, value.instrumentType);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.ReplaceInstrumentAction value) {
                    value.getClass();
                    return CashInstrumentType.ADAPTER.encodedSizeWithTag(2, value.instrumentType) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.instrumentToken) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.ReplaceInstrumentAction redact(InstrumentSelectionBlockerV3.ReplaceInstrumentAction value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.ReplaceInstrumentAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.ReplaceInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 2, value.instrumentType);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.instrumentToken);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ReplaceInstrumentAction(String str, CashInstrumentType cashInstrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cashInstrumentType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ReplaceInstrumentAction copy$default(ReplaceInstrumentAction replaceInstrumentAction, String str, CashInstrumentType cashInstrumentType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = replaceInstrumentAction.instrumentToken;
            }
            if ((i & 2) != 0) {
                cashInstrumentType = replaceInstrumentAction.instrumentType;
            }
            if ((i & 4) != 0) {
                byteString = replaceInstrumentAction.unknownFields();
            }
            return replaceInstrumentAction.copy(str, cashInstrumentType, byteString);
        }

        public final ReplaceInstrumentAction copy(String instrumentToken, CashInstrumentType instrumentType, ByteString unknownFields) {
            unknownFields.getClass();
            return new ReplaceInstrumentAction(instrumentToken, instrumentType, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ReplaceInstrumentAction)) {
                return false;
            }
            ReplaceInstrumentAction replaceInstrumentAction = (ReplaceInstrumentAction) other;
            return Intrinsics.areEqual(unknownFields(), replaceInstrumentAction.unknownFields()) && Intrinsics.areEqual(this.instrumentToken, replaceInstrumentAction.instrumentToken) && this.instrumentType == replaceInstrumentAction.instrumentType;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.instrumentToken;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            CashInstrumentType cashInstrumentType = this.instrumentType;
            int hashCode3 = hashCode2 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.instrumentToken = this.instrumentToken;
            builder.instrumentType = this.instrumentType;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.instrumentToken;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrumentToken=", arrayList);
            }
            CashInstrumentType cashInstrumentType = this.instrumentType;
            if (cashInstrumentType != null) {
                arrayList.add("instrumentType=" + cashInstrumentType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ReplaceInstrumentAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ReplaceInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ReplaceInstrumentAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ReplaceInstrumentAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReplaceInstrumentAction(String str, CashInstrumentType cashInstrumentType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrumentToken = str;
            this.instrumentType = cashInstrumentType;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction$Builder;", "instrumentToken", "", "instrumentType", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/CashInstrumentType;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SelectInstrumentAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectInstrumentAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String instrumentToken;

        @WireField(adapter = "com.squareup.protos.franklin.api.CashInstrumentType#ADAPTER", schemaIndex = 1, tag = 2)
        public final CashInstrumentType instrumentType;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;", "<init>", "()V", "instrumentToken", "", "instrumentType", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String instrumentToken;
            public CashInstrumentType instrumentType;

            @Override // com.squareup.wire.Message.Builder
            public SelectInstrumentAction build() {
                return new SelectInstrumentAction(this.instrumentToken, this.instrumentType, buildUnknownFields());
            }

            public final Builder instrumentToken(String instrumentToken) {
                this.instrumentToken = instrumentToken;
                return this;
            }

            public final Builder instrumentType(CashInstrumentType instrumentType) {
                this.instrumentType = instrumentType;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectInstrumentAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$SelectInstrumentAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.SelectInstrumentAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.SelectInstrumentAction((String) obj, (CashInstrumentType) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj2 = CashInstrumentType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.SelectInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.instrumentToken);
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 2, value.instrumentType);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.SelectInstrumentAction value) {
                    value.getClass();
                    return CashInstrumentType.ADAPTER.encodedSizeWithTag(2, value.instrumentType) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.instrumentToken) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.SelectInstrumentAction redact(InstrumentSelectionBlockerV3.SelectInstrumentAction value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.SelectInstrumentAction.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.SelectInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CashInstrumentType.ADAPTER.encodeWithTag(writer, 2, value.instrumentType);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.instrumentToken);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SelectInstrumentAction(String str, CashInstrumentType cashInstrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cashInstrumentType, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SelectInstrumentAction copy$default(SelectInstrumentAction selectInstrumentAction, String str, CashInstrumentType cashInstrumentType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectInstrumentAction.instrumentToken;
            }
            if ((i & 2) != 0) {
                cashInstrumentType = selectInstrumentAction.instrumentType;
            }
            if ((i & 4) != 0) {
                byteString = selectInstrumentAction.unknownFields();
            }
            return selectInstrumentAction.copy(str, cashInstrumentType, byteString);
        }

        public final SelectInstrumentAction copy(String instrumentToken, CashInstrumentType instrumentType, ByteString unknownFields) {
            unknownFields.getClass();
            return new SelectInstrumentAction(instrumentToken, instrumentType, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SelectInstrumentAction)) {
                return false;
            }
            SelectInstrumentAction selectInstrumentAction = (SelectInstrumentAction) other;
            return Intrinsics.areEqual(unknownFields(), selectInstrumentAction.unknownFields()) && Intrinsics.areEqual(this.instrumentToken, selectInstrumentAction.instrumentToken) && this.instrumentType == selectInstrumentAction.instrumentType;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.instrumentToken;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            CashInstrumentType cashInstrumentType = this.instrumentType;
            int hashCode3 = hashCode2 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.instrumentToken = this.instrumentToken;
            builder.instrumentType = this.instrumentType;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.instrumentToken;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrumentToken=", arrayList);
            }
            CashInstrumentType cashInstrumentType = this.instrumentType;
            if (cashInstrumentType != null) {
                arrayList.add("instrumentType=" + cashInstrumentType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectInstrumentAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$SelectInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SelectInstrumentAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SelectInstrumentAction() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectInstrumentAction(String str, CashInstrumentType cashInstrumentType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.instrumentToken = str;
            this.instrumentType = cashInstrumentType;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet$Builder;", "header", "", "description", "instrument_options", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Sheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Sheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$InstrumentOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        public final List<InstrumentOption> instrument_options;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;", "<init>", "()V", "header", "", "description", "instrument_options", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$InstrumentOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String description;
            public String header;
            public List<InstrumentOption> instrument_options = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public Sheet build() {
                return new Sheet(this.header, this.description, this.instrument_options, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder header(String header) {
                this.header = header;
                return this;
            }

            public final Builder instrument_options(List<InstrumentOption> instrument_options) {
                instrument_options.getClass();
                TransactorKt.checkElementsNotNull(instrument_options);
                this.instrument_options = instrument_options;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Sheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$Sheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.Sheet decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.Sheet((String) obj, (String) obj2, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.Sheet value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.header);
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.instrument_options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.Sheet value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodedSizeWithTag(3, value.instrument_options) + protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.header) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.Sheet redact(InstrumentSelectionBlockerV3.Sheet value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.Sheet.copy$default(value, null, null, TransactorKt.m1169redactElements(value.instrument_options, InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER), ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.Sheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    InstrumentSelectionBlockerV3.InstrumentOption.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.instrument_options);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    protoAdapter2.encodeWithTag(writer, 1, value.header);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public Sheet(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Sheet copy$default(Sheet sheet, String str, String str2, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sheet.header;
            }
            if ((i & 2) != 0) {
                str2 = sheet.description;
            }
            if ((i & 4) != 0) {
                list = sheet.instrument_options;
            }
            if ((i & 8) != 0) {
                byteString = sheet.unknownFields();
            }
            return sheet.copy(str, str2, list, byteString);
        }

        public final Sheet copy(String header, String description, List<InstrumentOption> instrument_options, ByteString unknownFields) {
            instrument_options.getClass();
            unknownFields.getClass();
            return new Sheet(header, description, instrument_options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Sheet)) {
                return false;
            }
            Sheet sheet = (Sheet) other;
            return Intrinsics.areEqual(unknownFields(), sheet.unknownFields()) && Intrinsics.areEqual(this.header, sheet.header) && Intrinsics.areEqual(this.description, sheet.description) && Intrinsics.areEqual(this.instrument_options, sheet.instrument_options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = this.instrument_options.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header = this.header;
            builder.description = this.description;
            builder.instrument_options = this.instrument_options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            if (!this.instrument_options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("instrument_options=", arrayList, this.instrument_options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Sheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Sheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Sheet() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sheet(String str, String str2, List<InstrumentOption> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.header = str;
            this.description = str2;
            this.instrument_options = TransactorKt.immutableCopyOf("instrument_options", list);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction$Builder;", "sheet", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ShowSheetInstrumentAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShowSheetInstrumentAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$Sheet#ADAPTER", schemaIndex = 0, tag = 1)
        public final Sheet sheet;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;", "<init>", "()V", "sheet", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Sheet;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Sheet sheet;

            @Override // com.squareup.wire.Message.Builder
            public ShowSheetInstrumentAction build() {
                return new ShowSheetInstrumentAction(this.sheet, buildUnknownFields());
            }

            public final Builder sheet(Sheet sheet) {
                this.sheet = sheet;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShowSheetInstrumentAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3$ShowSheetInstrumentAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.ShowSheetInstrumentAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlockerV3.ShowSheetInstrumentAction((InstrumentSelectionBlockerV3.Sheet) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(InstrumentSelectionBlockerV3.Sheet.ADAPTER, reader, obj);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlockerV3.ShowSheetInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    InstrumentSelectionBlockerV3.Sheet.ADAPTER.encodeWithTag(writer, 1, value.sheet);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlockerV3.ShowSheetInstrumentAction value) {
                    value.getClass();
                    return InstrumentSelectionBlockerV3.Sheet.ADAPTER.encodedSizeWithTag(1, value.sheet) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlockerV3.ShowSheetInstrumentAction redact(InstrumentSelectionBlockerV3.ShowSheetInstrumentAction value) {
                    value.getClass();
                    InstrumentSelectionBlockerV3.Sheet sheet = value.sheet;
                    return value.copy(sheet != null ? (InstrumentSelectionBlockerV3.Sheet) InstrumentSelectionBlockerV3.Sheet.ADAPTER.redact(sheet) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlockerV3.ShowSheetInstrumentAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    InstrumentSelectionBlockerV3.Sheet.ADAPTER.encodeWithTag(writer, 1, value.sheet);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShowSheetInstrumentAction(Sheet sheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sheet, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShowSheetInstrumentAction copy$default(ShowSheetInstrumentAction showSheetInstrumentAction, Sheet sheet, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                sheet = showSheetInstrumentAction.sheet;
            }
            if ((i & 2) != 0) {
                byteString = showSheetInstrumentAction.unknownFields();
            }
            return showSheetInstrumentAction.copy(sheet, byteString);
        }

        public final ShowSheetInstrumentAction copy(Sheet sheet, ByteString unknownFields) {
            unknownFields.getClass();
            return new ShowSheetInstrumentAction(sheet, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShowSheetInstrumentAction)) {
                return false;
            }
            ShowSheetInstrumentAction showSheetInstrumentAction = (ShowSheetInstrumentAction) other;
            return Intrinsics.areEqual(unknownFields(), showSheetInstrumentAction.unknownFields()) && Intrinsics.areEqual(this.sheet, showSheetInstrumentAction.sheet);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Sheet sheet = this.sheet;
            int hashCode2 = hashCode + (sheet != null ? sheet.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.sheet = this.sheet;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Sheet sheet = this.sheet;
            if (sheet != null) {
                arrayList.add("sheet=" + sheet);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShowSheetInstrumentAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$ShowSheetInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShowSheetInstrumentAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowSheetInstrumentAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSheetInstrumentAction(Sheet sheet, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sheet = sheet;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlockerV3;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InstrumentSelectionBlockerV3 build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
