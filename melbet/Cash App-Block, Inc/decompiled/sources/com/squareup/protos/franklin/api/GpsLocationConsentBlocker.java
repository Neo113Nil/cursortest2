package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.GpsLocationConsentBlocker;
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
import kotlin.Deprecated;
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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\t)(*+,-./0R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0005R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$Builder;", "", "event_token", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$TriggerSource;", "trigger_source", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$TriggerSource;", "Lcom/squareup/protos/cash/ui/Icon;", "image", "Lcom/squareup/protos/cash/ui/Icon;", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "header_text", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "message_text", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "info_sheet", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "getInfo_sheet$annotations", "()V", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "subtle_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "standard_button", "end_flow_button", "prominent_button", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "icon_button", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "confirmation_content", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "info_half_sheet", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "trigger_source_text", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$GpsConsentStatus;", "minimum_gps_consent_status", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$GpsConsentStatus;", "Companion", "Builder", "InfoSheet", "InfoHalfSheet", "RowElement", "TriggerSource", "GpsConsentStatus", "IconButtonElement", "ConfirmationContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GpsLocationConsentBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GpsLocationConsentBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$ConfirmationContent#ADAPTER", schemaIndex = 11, tag = 12)
    public final ConfirmationContent confirmation_content;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 8, tag = 9)
    public final FormBlocker.Element.ButtonElement end_flow_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String event_token;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 3, tag = 4)
    public final FormBlocker.Element.TextElement header_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$IconButtonElement#ADAPTER", schemaIndex = 10, tag = 11)
    public final IconButtonElement icon_button;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 2, tag = 3)
    public final Icon image;

    @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$InfoHalfSheet#ADAPTER", schemaIndex = 12, tag = 13)
    public final InfoHalfSheet info_half_sheet;

    @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$InfoSheet#ADAPTER", schemaIndex = 5, tag = 6)
    public final InfoSheet info_sheet;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 4, tag = 5)
    public final FormBlocker.Element.TextElement message_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$GpsConsentStatus#ADAPTER", schemaIndex = 14, tag = 15)
    public final GpsConsentStatus minimum_gps_consent_status;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 9, tag = 10)
    public final FormBlocker.Element.ButtonElement prominent_button;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 7, tag = 8)
    public final FormBlocker.Element.ButtonElement standard_button;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 6, tag = 7)
    public final FormBlocker.Element.ButtonElement subtle_button;

    @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$TriggerSource#ADAPTER", schemaIndex = 1, tag = 2)
    public final TriggerSource trigger_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 13, tag = 14)
    public final String trigger_source_text;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker;", "<init>", "()V", "event_token", "", "trigger_source", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$TriggerSource;", "image", "Lcom/squareup/protos/cash/ui/Icon;", "header_text", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "message_text", "info_sheet", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "subtle_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "standard_button", "end_flow_button", "prominent_button", "icon_button", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "confirmation_content", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "info_half_sheet", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "trigger_source_text", "minimum_gps_consent_status", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$GpsConsentStatus;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public ConfirmationContent confirmation_content;
        public FormBlocker.Element.ButtonElement end_flow_button;
        public String event_token;
        public FormBlocker.Element.TextElement header_text;
        public IconButtonElement icon_button;
        public Icon image;
        public InfoHalfSheet info_half_sheet;
        public InfoSheet info_sheet;
        public FormBlocker.Element.TextElement message_text;
        public GpsConsentStatus minimum_gps_consent_status;
        public FormBlocker.Element.ButtonElement prominent_button;
        public FormBlocker.Element.ButtonElement standard_button;
        public FormBlocker.Element.ButtonElement subtle_button;
        public TriggerSource trigger_source;
        public String trigger_source_text;

        @Override // com.squareup.wire.Message.Builder
        public GpsLocationConsentBlocker build() {
            return new GpsLocationConsentBlocker(this.event_token, this.trigger_source, this.image, this.header_text, this.message_text, this.info_sheet, this.subtle_button, this.standard_button, this.end_flow_button, this.prominent_button, this.icon_button, this.confirmation_content, this.info_half_sheet, this.trigger_source_text, this.minimum_gps_consent_status, buildUnknownFields());
        }

        public final Builder confirmation_content(ConfirmationContent confirmation_content) {
            this.confirmation_content = confirmation_content;
            return this;
        }

        public final Builder end_flow_button(FormBlocker.Element.ButtonElement end_flow_button) {
            this.end_flow_button = end_flow_button;
            return this;
        }

        public final Builder event_token(String event_token) {
            this.event_token = event_token;
            return this;
        }

        public final Builder header_text(FormBlocker.Element.TextElement header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder icon_button(IconButtonElement icon_button) {
            this.icon_button = icon_button;
            return this;
        }

        public final Builder image(Icon image) {
            this.image = image;
            return this;
        }

        public final Builder info_half_sheet(InfoHalfSheet info_half_sheet) {
            this.info_half_sheet = info_half_sheet;
            return this;
        }

        @Deprecated
        public final Builder info_sheet(InfoSheet info_sheet) {
            this.info_sheet = info_sheet;
            return this;
        }

        public final Builder message_text(FormBlocker.Element.TextElement message_text) {
            this.message_text = message_text;
            return this;
        }

        public final Builder minimum_gps_consent_status(GpsConsentStatus minimum_gps_consent_status) {
            this.minimum_gps_consent_status = minimum_gps_consent_status;
            return this;
        }

        public final Builder prominent_button(FormBlocker.Element.ButtonElement prominent_button) {
            this.prominent_button = prominent_button;
            return this;
        }

        public final Builder standard_button(FormBlocker.Element.ButtonElement standard_button) {
            this.standard_button = standard_button;
            return this;
        }

        public final Builder subtle_button(FormBlocker.Element.ButtonElement subtle_button) {
            this.subtle_button = subtle_button;
            return this;
        }

        public final Builder trigger_source(TriggerSource trigger_source) {
            this.trigger_source = trigger_source;
            return this;
        }

        public final Builder trigger_source_text(String trigger_source_text) {
            this.trigger_source_text = trigger_source_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GpsLocationConsentBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public GpsLocationConsentBlocker decode(ProtoReader reader) {
                long j;
                Object obj;
                Object obj2;
                Object obj3;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                Object obj15 = null;
                Object obj16 = null;
                Object obj17 = null;
                Object obj18 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new GpsLocationConsentBlocker((String) obj4, (GpsLocationConsentBlocker.TriggerSource) obj18, (Icon) obj6, (FormBlocker.Element.TextElement) obj7, (FormBlocker.Element.TextElement) obj8, (GpsLocationConsentBlocker.InfoSheet) obj9, (FormBlocker.Element.ButtonElement) obj10, (FormBlocker.Element.ButtonElement) obj11, (FormBlocker.Element.ButtonElement) obj12, (FormBlocker.Element.ButtonElement) obj13, (GpsLocationConsentBlocker.IconButtonElement) obj14, (GpsLocationConsentBlocker.ConfirmationContent) obj15, (GpsLocationConsentBlocker.InfoHalfSheet) obj5, (String) obj16, (GpsLocationConsentBlocker.GpsConsentStatus) obj17, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            j = beginMessage;
                            obj = obj7;
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            obj7 = obj;
                            break;
                        case 2:
                            j = beginMessage;
                            Object obj19 = obj6;
                            Object obj20 = obj7;
                            try {
                                obj18 = GpsLocationConsentBlocker.TriggerSource.ADAPTER.decode(reader);
                                obj7 = obj20;
                                obj6 = obj19;
                                obj3 = obj4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj20;
                                obj2 = obj19;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            j = beginMessage;
                            obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj6);
                            obj3 = obj4;
                            break;
                        case 4:
                            j = beginMessage;
                            obj7 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj7);
                            obj3 = obj4;
                            break;
                        case 5:
                            j = beginMessage;
                            obj8 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj8);
                            obj3 = obj4;
                            break;
                        case 6:
                            j = beginMessage;
                            obj9 = TransactorKt.decodeMessageOrMerge(GpsLocationConsentBlocker.InfoSheet.ADAPTER, reader, obj9);
                            obj3 = obj4;
                            break;
                        case 7:
                            j = beginMessage;
                            obj10 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj10);
                            obj3 = obj4;
                            break;
                        case 8:
                            j = beginMessage;
                            obj11 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj11);
                            obj3 = obj4;
                            break;
                        case 9:
                            j = beginMessage;
                            obj12 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj12);
                            obj3 = obj4;
                            break;
                        case 10:
                            j = beginMessage;
                            obj13 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj13);
                            obj3 = obj4;
                            break;
                        case 11:
                            j = beginMessage;
                            obj14 = TransactorKt.decodeMessageOrMerge(GpsLocationConsentBlocker.IconButtonElement.ADAPTER, reader, obj14);
                            obj3 = obj4;
                            break;
                        case 12:
                            j = beginMessage;
                            obj15 = TransactorKt.decodeMessageOrMerge(GpsLocationConsentBlocker.ConfirmationContent.ADAPTER, reader, obj15);
                            obj3 = obj4;
                            break;
                        case 13:
                            j = beginMessage;
                            obj5 = TransactorKt.decodeMessageOrMerge(GpsLocationConsentBlocker.InfoHalfSheet.ADAPTER, reader, obj5);
                            obj3 = obj4;
                            break;
                        case 14:
                            j = beginMessage;
                            obj16 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj4;
                            break;
                        case 15:
                            try {
                                obj17 = GpsLocationConsentBlocker.GpsConsentStatus.ADAPTER.decode(reader);
                                j = beginMessage;
                                obj3 = obj4;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                j = beginMessage;
                                obj = obj7;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                obj2 = obj6;
                                break;
                            }
                        default:
                            reader.readUnknownField(nextTag);
                            j = beginMessage;
                            obj = obj7;
                            obj2 = obj6;
                            obj3 = obj4;
                            obj6 = obj2;
                            obj7 = obj;
                            break;
                    }
                    obj4 = obj3;
                    beginMessage = j;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GpsLocationConsentBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.event_token);
                GpsLocationConsentBlocker.TriggerSource.ADAPTER.encodeWithTag(writer, 2, value.trigger_source);
                Icon.ADAPTER.encodeWithTag(writer, 3, value.image);
                ProtoAdapter protoAdapter3 = FormBlocker.Element.TextElement.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 4, value.header_text);
                protoAdapter3.encodeWithTag(writer, 5, value.message_text);
                GpsLocationConsentBlocker.InfoSheet.ADAPTER.encodeWithTag(writer, 6, value.info_sheet);
                ProtoAdapter protoAdapter4 = FormBlocker.Element.ButtonElement.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 7, value.subtle_button);
                protoAdapter4.encodeWithTag(writer, 8, value.standard_button);
                protoAdapter4.encodeWithTag(writer, 9, value.end_flow_button);
                protoAdapter4.encodeWithTag(writer, 10, value.prominent_button);
                GpsLocationConsentBlocker.IconButtonElement.ADAPTER.encodeWithTag(writer, 11, value.icon_button);
                GpsLocationConsentBlocker.ConfirmationContent.ADAPTER.encodeWithTag(writer, 12, value.confirmation_content);
                GpsLocationConsentBlocker.InfoHalfSheet.ADAPTER.encodeWithTag(writer, 13, value.info_half_sheet);
                protoAdapter2.encodeWithTag(writer, 14, value.trigger_source_text);
                GpsLocationConsentBlocker.GpsConsentStatus.ADAPTER.encodeWithTag(writer, 15, value.minimum_gps_consent_status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GpsLocationConsentBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(3, value.image) + GpsLocationConsentBlocker.TriggerSource.ADAPTER.encodedSizeWithTag(2, value.trigger_source) + protoAdapter2.encodedSizeWithTag(1, value.event_token) + size$okio;
                ProtoAdapter protoAdapter3 = FormBlocker.Element.TextElement.ADAPTER;
                int encodedSizeWithTag2 = GpsLocationConsentBlocker.InfoSheet.ADAPTER.encodedSizeWithTag(6, value.info_sheet) + protoAdapter3.encodedSizeWithTag(5, value.message_text) + protoAdapter3.encodedSizeWithTag(4, value.header_text) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = FormBlocker.Element.ButtonElement.ADAPTER;
                return GpsLocationConsentBlocker.GpsConsentStatus.ADAPTER.encodedSizeWithTag(15, value.minimum_gps_consent_status) + protoAdapter2.encodedSizeWithTag(14, value.trigger_source_text) + GpsLocationConsentBlocker.InfoHalfSheet.ADAPTER.encodedSizeWithTag(13, value.info_half_sheet) + GpsLocationConsentBlocker.ConfirmationContent.ADAPTER.encodedSizeWithTag(12, value.confirmation_content) + GpsLocationConsentBlocker.IconButtonElement.ADAPTER.encodedSizeWithTag(11, value.icon_button) + protoAdapter4.encodedSizeWithTag(10, value.prominent_button) + protoAdapter4.encodedSizeWithTag(9, value.end_flow_button) + protoAdapter4.encodedSizeWithTag(8, value.standard_button) + protoAdapter4.encodedSizeWithTag(7, value.subtle_button) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GpsLocationConsentBlocker redact(GpsLocationConsentBlocker value) {
                value.getClass();
                Icon icon = value.image;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                FormBlocker.Element.TextElement textElement = value.header_text;
                FormBlocker.Element.TextElement textElement2 = textElement != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement) : null;
                FormBlocker.Element.TextElement textElement3 = value.message_text;
                FormBlocker.Element.TextElement textElement4 = textElement3 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement3) : null;
                GpsLocationConsentBlocker.InfoSheet infoSheet = value.info_sheet;
                GpsLocationConsentBlocker.InfoSheet infoSheet2 = infoSheet != null ? (GpsLocationConsentBlocker.InfoSheet) GpsLocationConsentBlocker.InfoSheet.ADAPTER.redact(infoSheet) : null;
                FormBlocker.Element.ButtonElement buttonElement = value.subtle_button;
                FormBlocker.Element.ButtonElement buttonElement2 = buttonElement != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement) : null;
                FormBlocker.Element.ButtonElement buttonElement3 = value.standard_button;
                FormBlocker.Element.ButtonElement buttonElement4 = buttonElement3 != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement3) : null;
                FormBlocker.Element.ButtonElement buttonElement5 = value.end_flow_button;
                FormBlocker.Element.ButtonElement buttonElement6 = buttonElement5 != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement5) : null;
                FormBlocker.Element.ButtonElement buttonElement7 = value.prominent_button;
                FormBlocker.Element.ButtonElement buttonElement8 = buttonElement7 != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement7) : null;
                GpsLocationConsentBlocker.IconButtonElement iconButtonElement = value.icon_button;
                GpsLocationConsentBlocker.IconButtonElement iconButtonElement2 = iconButtonElement != null ? (GpsLocationConsentBlocker.IconButtonElement) GpsLocationConsentBlocker.IconButtonElement.ADAPTER.redact(iconButtonElement) : null;
                GpsLocationConsentBlocker.ConfirmationContent confirmationContent = value.confirmation_content;
                GpsLocationConsentBlocker.ConfirmationContent confirmationContent2 = confirmationContent != null ? (GpsLocationConsentBlocker.ConfirmationContent) GpsLocationConsentBlocker.ConfirmationContent.ADAPTER.redact(confirmationContent) : null;
                GpsLocationConsentBlocker.InfoHalfSheet infoHalfSheet = value.info_half_sheet;
                GpsLocationConsentBlocker.InfoHalfSheet infoHalfSheet2 = infoHalfSheet != null ? (GpsLocationConsentBlocker.InfoHalfSheet) GpsLocationConsentBlocker.InfoHalfSheet.ADAPTER.redact(infoHalfSheet) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.event_token;
                GpsLocationConsentBlocker.TriggerSource triggerSource = value.trigger_source;
                String str2 = value.trigger_source_text;
                GpsLocationConsentBlocker.GpsConsentStatus gpsConsentStatus = value.minimum_gps_consent_status;
                byteString.getClass();
                return new GpsLocationConsentBlocker(str, triggerSource, icon2, textElement2, textElement4, infoSheet2, buttonElement2, buttonElement4, buttonElement6, buttonElement8, iconButtonElement2, confirmationContent2, infoHalfSheet2, str2, gpsConsentStatus, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GpsLocationConsentBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                GpsLocationConsentBlocker.GpsConsentStatus.ADAPTER.encodeWithTag(writer, 15, value.minimum_gps_consent_status);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 14, value.trigger_source_text);
                GpsLocationConsentBlocker.InfoHalfSheet.ADAPTER.encodeWithTag(writer, 13, value.info_half_sheet);
                GpsLocationConsentBlocker.ConfirmationContent.ADAPTER.encodeWithTag(writer, 12, value.confirmation_content);
                GpsLocationConsentBlocker.IconButtonElement.ADAPTER.encodeWithTag(writer, 11, value.icon_button);
                ProtoAdapter protoAdapter3 = FormBlocker.Element.ButtonElement.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 10, value.prominent_button);
                protoAdapter3.encodeWithTag(writer, 9, value.end_flow_button);
                protoAdapter3.encodeWithTag(writer, 8, value.standard_button);
                protoAdapter3.encodeWithTag(writer, 7, value.subtle_button);
                GpsLocationConsentBlocker.InfoSheet.ADAPTER.encodeWithTag(writer, 6, value.info_sheet);
                ProtoAdapter protoAdapter4 = FormBlocker.Element.TextElement.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 5, value.message_text);
                protoAdapter4.encodeWithTag(writer, 4, value.header_text);
                Icon.ADAPTER.encodeWithTag(writer, 3, value.image);
                GpsLocationConsentBlocker.TriggerSource.ADAPTER.encodeWithTag(writer, 2, value.trigger_source);
                protoAdapter2.encodeWithTag(writer, 1, value.event_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsLocationConsentBlocker(String str, TriggerSource triggerSource, Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, InfoSheet infoSheet, FormBlocker.Element.ButtonElement buttonElement, FormBlocker.Element.ButtonElement buttonElement2, FormBlocker.Element.ButtonElement buttonElement3, FormBlocker.Element.ButtonElement buttonElement4, IconButtonElement iconButtonElement, ConfirmationContent confirmationContent, InfoHalfSheet infoHalfSheet, String str2, GpsConsentStatus gpsConsentStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.event_token = str;
        this.trigger_source = triggerSource;
        this.image = icon;
        this.header_text = textElement;
        this.message_text = textElement2;
        this.info_sheet = infoSheet;
        this.subtle_button = buttonElement;
        this.standard_button = buttonElement2;
        this.end_flow_button = buttonElement3;
        this.prominent_button = buttonElement4;
        this.icon_button = iconButtonElement;
        this.confirmation_content = confirmationContent;
        this.info_half_sheet = infoHalfSheet;
        this.trigger_source_text = str2;
        this.minimum_gps_consent_status = gpsConsentStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GpsLocationConsentBlocker)) {
            return false;
        }
        GpsLocationConsentBlocker gpsLocationConsentBlocker = (GpsLocationConsentBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), gpsLocationConsentBlocker.unknownFields()) && Intrinsics.areEqual(this.event_token, gpsLocationConsentBlocker.event_token) && this.trigger_source == gpsLocationConsentBlocker.trigger_source && Intrinsics.areEqual(this.image, gpsLocationConsentBlocker.image) && Intrinsics.areEqual(this.header_text, gpsLocationConsentBlocker.header_text) && Intrinsics.areEqual(this.message_text, gpsLocationConsentBlocker.message_text) && Intrinsics.areEqual(this.info_sheet, gpsLocationConsentBlocker.info_sheet) && Intrinsics.areEqual(this.subtle_button, gpsLocationConsentBlocker.subtle_button) && Intrinsics.areEqual(this.standard_button, gpsLocationConsentBlocker.standard_button) && Intrinsics.areEqual(this.end_flow_button, gpsLocationConsentBlocker.end_flow_button) && Intrinsics.areEqual(this.prominent_button, gpsLocationConsentBlocker.prominent_button) && Intrinsics.areEqual(this.icon_button, gpsLocationConsentBlocker.icon_button) && Intrinsics.areEqual(this.confirmation_content, gpsLocationConsentBlocker.confirmation_content) && Intrinsics.areEqual(this.info_half_sheet, gpsLocationConsentBlocker.info_half_sheet) && Intrinsics.areEqual(this.trigger_source_text, gpsLocationConsentBlocker.trigger_source_text) && this.minimum_gps_consent_status == gpsLocationConsentBlocker.minimum_gps_consent_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.event_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TriggerSource triggerSource = this.trigger_source;
        int hashCode3 = (hashCode2 + (triggerSource != null ? triggerSource.hashCode() : 0)) * 37;
        Icon icon = this.image;
        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
        FormBlocker.Element.TextElement textElement = this.header_text;
        int hashCode5 = (hashCode4 + (textElement != null ? textElement.hashCode() : 0)) * 37;
        FormBlocker.Element.TextElement textElement2 = this.message_text;
        int hashCode6 = (hashCode5 + (textElement2 != null ? textElement2.hashCode() : 0)) * 37;
        InfoSheet infoSheet = this.info_sheet;
        int hashCode7 = (hashCode6 + (infoSheet != null ? infoSheet.hashCode() : 0)) * 37;
        FormBlocker.Element.ButtonElement buttonElement = this.subtle_button;
        int hashCode8 = (hashCode7 + (buttonElement != null ? buttonElement.hashCode() : 0)) * 37;
        FormBlocker.Element.ButtonElement buttonElement2 = this.standard_button;
        int hashCode9 = (hashCode8 + (buttonElement2 != null ? buttonElement2.hashCode() : 0)) * 37;
        FormBlocker.Element.ButtonElement buttonElement3 = this.end_flow_button;
        int hashCode10 = (hashCode9 + (buttonElement3 != null ? buttonElement3.hashCode() : 0)) * 37;
        FormBlocker.Element.ButtonElement buttonElement4 = this.prominent_button;
        int hashCode11 = (hashCode10 + (buttonElement4 != null ? buttonElement4.hashCode() : 0)) * 37;
        IconButtonElement iconButtonElement = this.icon_button;
        int hashCode12 = (hashCode11 + (iconButtonElement != null ? iconButtonElement.hashCode() : 0)) * 37;
        ConfirmationContent confirmationContent = this.confirmation_content;
        int hashCode13 = (hashCode12 + (confirmationContent != null ? confirmationContent.hashCode() : 0)) * 37;
        InfoHalfSheet infoHalfSheet = this.info_half_sheet;
        int hashCode14 = (hashCode13 + (infoHalfSheet != null ? infoHalfSheet.hashCode() : 0)) * 37;
        String str2 = this.trigger_source_text;
        int hashCode15 = (hashCode14 + (str2 != null ? str2.hashCode() : 0)) * 37;
        GpsConsentStatus gpsConsentStatus = this.minimum_gps_consent_status;
        int hashCode16 = hashCode15 + (gpsConsentStatus != null ? gpsConsentStatus.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.event_token = this.event_token;
        builder.trigger_source = this.trigger_source;
        builder.image = this.image;
        builder.header_text = this.header_text;
        builder.message_text = this.message_text;
        builder.info_sheet = this.info_sheet;
        builder.subtle_button = this.subtle_button;
        builder.standard_button = this.standard_button;
        builder.end_flow_button = this.end_flow_button;
        builder.prominent_button = this.prominent_button;
        builder.icon_button = this.icon_button;
        builder.confirmation_content = this.confirmation_content;
        builder.info_half_sheet = this.info_half_sheet;
        builder.trigger_source_text = this.trigger_source_text;
        builder.minimum_gps_consent_status = this.minimum_gps_consent_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.event_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "event_token=", arrayList);
        }
        TriggerSource triggerSource = this.trigger_source;
        if (triggerSource != null) {
            arrayList.add("trigger_source=" + triggerSource);
        }
        Icon icon = this.image;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("image=", icon, arrayList);
        }
        FormBlocker.Element.TextElement textElement = this.header_text;
        if (textElement != null) {
            arrayList.add("header_text=" + textElement);
        }
        FormBlocker.Element.TextElement textElement2 = this.message_text;
        if (textElement2 != null) {
            arrayList.add("message_text=" + textElement2);
        }
        InfoSheet infoSheet = this.info_sheet;
        if (infoSheet != null) {
            arrayList.add("info_sheet=" + infoSheet);
        }
        FormBlocker.Element.ButtonElement buttonElement = this.subtle_button;
        if (buttonElement != null) {
            arrayList.add("subtle_button=" + buttonElement);
        }
        FormBlocker.Element.ButtonElement buttonElement2 = this.standard_button;
        if (buttonElement2 != null) {
            arrayList.add("standard_button=" + buttonElement2);
        }
        FormBlocker.Element.ButtonElement buttonElement3 = this.end_flow_button;
        if (buttonElement3 != null) {
            arrayList.add("end_flow_button=" + buttonElement3);
        }
        FormBlocker.Element.ButtonElement buttonElement4 = this.prominent_button;
        if (buttonElement4 != null) {
            arrayList.add("prominent_button=" + buttonElement4);
        }
        IconButtonElement iconButtonElement = this.icon_button;
        if (iconButtonElement != null) {
            arrayList.add("icon_button=" + iconButtonElement);
        }
        ConfirmationContent confirmationContent = this.confirmation_content;
        if (confirmationContent != null) {
            arrayList.add("confirmation_content=" + confirmationContent);
        }
        InfoHalfSheet infoHalfSheet = this.info_half_sheet;
        if (infoHalfSheet != null) {
            arrayList.add("info_half_sheet=" + infoHalfSheet);
        }
        String str2 = this.trigger_source_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "trigger_source_text=", arrayList);
        }
        GpsConsentStatus gpsConsentStatus = this.minimum_gps_consent_status;
        if (gpsConsentStatus != null) {
            arrayList.add("minimum_gps_consent_status=" + gpsConsentStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GpsLocationConsentBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent$Builder;", "image", "Lcom/squareup/protos/cash/ui/Icon;", "title", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "subtitle", "prominent_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ConfirmationContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConfirmationContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon image;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 3, tag = 4)
        public final FormBlocker.Element.ButtonElement prominent_button;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 2, tag = 3)
        public final FormBlocker.Element.TextElement subtitle;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 1, tag = 2)
        public final FormBlocker.Element.TextElement title;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Icon;", "title", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "subtitle", "prominent_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon image;
            public FormBlocker.Element.ButtonElement prominent_button;
            public FormBlocker.Element.TextElement subtitle;
            public FormBlocker.Element.TextElement title;

            @Override // com.squareup.wire.Message.Builder
            public ConfirmationContent build() {
                return new ConfirmationContent(this.image, this.title, this.subtitle, this.prominent_button, buildUnknownFields());
            }

            public final Builder image(Icon image) {
                this.image = image;
                return this;
            }

            public final Builder prominent_button(FormBlocker.Element.ButtonElement prominent_button) {
                this.prominent_button = prominent_button;
                return this;
            }

            public final Builder subtitle(FormBlocker.Element.TextElement subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder title(FormBlocker.Element.TextElement title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmationContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$ConfirmationContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.ConfirmationContent decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new GpsLocationConsentBlocker.ConfirmationContent((Icon) obj, (FormBlocker.Element.TextElement) obj2, (FormBlocker.Element.TextElement) obj3, (FormBlocker.Element.ButtonElement) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GpsLocationConsentBlocker.ConfirmationContent value) {
                    writer.getClass();
                    value.getClass();
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    FormBlocker.Element.ButtonElement.ADAPTER.encodeWithTag(writer, 4, value.prominent_button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GpsLocationConsentBlocker.ConfirmationContent value) {
                    value.getClass();
                    int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                    return FormBlocker.Element.ButtonElement.ADAPTER.encodedSizeWithTag(4, value.prominent_button) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.ConfirmationContent redact(GpsLocationConsentBlocker.ConfirmationContent value) {
                    value.getClass();
                    Icon icon = value.image;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    FormBlocker.Element.TextElement textElement = value.title;
                    FormBlocker.Element.TextElement textElement2 = textElement != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement) : null;
                    FormBlocker.Element.TextElement textElement3 = value.subtitle;
                    FormBlocker.Element.TextElement textElement4 = textElement3 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement3) : null;
                    FormBlocker.Element.ButtonElement buttonElement = value.prominent_button;
                    return value.copy(icon2, textElement2, textElement4, buttonElement != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GpsLocationConsentBlocker.ConfirmationContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FormBlocker.Element.ButtonElement.ADAPTER.encodeWithTag(writer, 4, value.prominent_button);
                    ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ConfirmationContent(Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, FormBlocker.Element.ButtonElement buttonElement, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : textElement, (i & 4) != 0 ? null : textElement2, (i & 8) != 0 ? null : buttonElement, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ConfirmationContent copy$default(ConfirmationContent confirmationContent, Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, FormBlocker.Element.ButtonElement buttonElement, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = confirmationContent.image;
            }
            if ((i & 2) != 0) {
                textElement = confirmationContent.title;
            }
            if ((i & 4) != 0) {
                textElement2 = confirmationContent.subtitle;
            }
            if ((i & 8) != 0) {
                buttonElement = confirmationContent.prominent_button;
            }
            if ((i & 16) != 0) {
                byteString = confirmationContent.unknownFields();
            }
            ByteString byteString2 = byteString;
            FormBlocker.Element.TextElement textElement3 = textElement2;
            return confirmationContent.copy(icon, textElement, textElement3, buttonElement, byteString2);
        }

        public final ConfirmationContent copy(Icon image, FormBlocker.Element.TextElement title, FormBlocker.Element.TextElement subtitle, FormBlocker.Element.ButtonElement prominent_button, ByteString unknownFields) {
            unknownFields.getClass();
            return new ConfirmationContent(image, title, subtitle, prominent_button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ConfirmationContent)) {
                return false;
            }
            ConfirmationContent confirmationContent = (ConfirmationContent) other;
            return Intrinsics.areEqual(unknownFields(), confirmationContent.unknownFields()) && Intrinsics.areEqual(this.image, confirmationContent.image) && Intrinsics.areEqual(this.title, confirmationContent.title) && Intrinsics.areEqual(this.subtitle, confirmationContent.subtitle) && Intrinsics.areEqual(this.prominent_button, confirmationContent.prominent_button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.image;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            FormBlocker.Element.TextElement textElement = this.title;
            int hashCode3 = (hashCode2 + (textElement != null ? textElement.hashCode() : 0)) * 37;
            FormBlocker.Element.TextElement textElement2 = this.subtitle;
            int hashCode4 = (hashCode3 + (textElement2 != null ? textElement2.hashCode() : 0)) * 37;
            FormBlocker.Element.ButtonElement buttonElement = this.prominent_button;
            int hashCode5 = hashCode4 + (buttonElement != null ? buttonElement.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.prominent_button = this.prominent_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.image;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("image=", icon, arrayList);
            }
            FormBlocker.Element.TextElement textElement = this.title;
            if (textElement != null) {
                arrayList.add("title=" + textElement);
            }
            FormBlocker.Element.TextElement textElement2 = this.subtitle;
            if (textElement2 != null) {
                arrayList.add("subtitle=" + textElement2);
            }
            FormBlocker.Element.ButtonElement buttonElement = this.prominent_button;
            if (buttonElement != null) {
                arrayList.add("prominent_button=" + buttonElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmationContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$ConfirmationContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ConfirmationContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ConfirmationContent() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationContent(Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, FormBlocker.Element.ButtonElement buttonElement, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = icon;
            this.title = textElement;
            this.subtitle = textElement2;
            this.prominent_button = buttonElement;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$GpsConsentStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GPS_CONSENT_STATUS_UNSPECIFIED", "GPS_CONSENT_STATUS_ALWAYS", "GPS_CONSENT_STATUS_ALLOW_ONCE", "GPS_CONSENT_STATUS_WHILE_USING_APP", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class GpsConsentStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GpsConsentStatus[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final GpsConsentStatus GPS_CONSENT_STATUS_ALLOW_ONCE;
        public static final GpsConsentStatus GPS_CONSENT_STATUS_ALWAYS;
        public static final GpsConsentStatus GPS_CONSENT_STATUS_UNSPECIFIED;
        public static final GpsConsentStatus GPS_CONSENT_STATUS_WHILE_USING_APP;
        private final int value;

        private static final /* synthetic */ GpsConsentStatus[] $values() {
            return new GpsConsentStatus[]{GPS_CONSENT_STATUS_UNSPECIFIED, GPS_CONSENT_STATUS_ALWAYS, GPS_CONSENT_STATUS_ALLOW_ONCE, GPS_CONSENT_STATUS_WHILE_USING_APP};
        }

        static {
            final GpsConsentStatus gpsConsentStatus = new GpsConsentStatus("GPS_CONSENT_STATUS_UNSPECIFIED", 0, 0);
            GPS_CONSENT_STATUS_UNSPECIFIED = gpsConsentStatus;
            GPS_CONSENT_STATUS_ALWAYS = new GpsConsentStatus("GPS_CONSENT_STATUS_ALWAYS", 1, 1);
            GPS_CONSENT_STATUS_ALLOW_ONCE = new GpsConsentStatus("GPS_CONSENT_STATUS_ALLOW_ONCE", 2, 2);
            GPS_CONSENT_STATUS_WHILE_USING_APP = new GpsConsentStatus("GPS_CONSENT_STATUS_WHILE_USING_APP", 3, 3);
            GpsConsentStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GpsConsentStatus.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, gpsConsentStatus) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$GpsConsentStatus$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public GpsLocationConsentBlocker.GpsConsentStatus fromValue(int value) {
                    return GpsLocationConsentBlocker.GpsConsentStatus.INSTANCE.fromValue(value);
                }
            };
        }

        private GpsConsentStatus(String str, int i, int i2) {
            this.value = i2;
        }

        public static final GpsConsentStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static GpsConsentStatus valueOf(String str) {
            return (GpsConsentStatus) Enum.valueOf(GpsConsentStatus.class, str);
        }

        public static GpsConsentStatus[] values() {
            return (GpsConsentStatus[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$GpsConsentStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$GpsConsentStatus;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final GpsConsentStatus fromValue(int value) {
                if (value == 0) {
                    return GpsConsentStatus.GPS_CONSENT_STATUS_UNSPECIFIED;
                }
                if (value == 1) {
                    return GpsConsentStatus.GPS_CONSENT_STATUS_ALWAYS;
                }
                if (value == 2) {
                    return GpsConsentStatus.GPS_CONSENT_STATUS_ALLOW_ONCE;
                }
                if (value != 3) {
                    return null;
                }
                return GpsConsentStatus.GPS_CONSENT_STATUS_WHILE_USING_APP;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement$Builder;", "prominent_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;Lcom/squareup/protos/cash/ui/Icon;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class IconButtonElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<IconButtonElement> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 1, tag = 2)
        public final Icon icon;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 0, tag = 1)
        public final FormBlocker.Element.ButtonElement prominent_button;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "<init>", "()V", "prominent_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon icon;
            public FormBlocker.Element.ButtonElement prominent_button;

            @Override // com.squareup.wire.Message.Builder
            public IconButtonElement build() {
                return new IconButtonElement(this.prominent_button, this.icon, buildUnknownFields());
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder prominent_button(FormBlocker.Element.ButtonElement prominent_button) {
                this.prominent_button = prominent_button;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IconButtonElement.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$IconButtonElement$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.IconButtonElement decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new GpsLocationConsentBlocker.IconButtonElement((FormBlocker.Element.ButtonElement) obj, (Icon) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GpsLocationConsentBlocker.IconButtonElement value) {
                    writer.getClass();
                    value.getClass();
                    FormBlocker.Element.ButtonElement.ADAPTER.encodeWithTag(writer, 1, value.prominent_button);
                    Icon.ADAPTER.encodeWithTag(writer, 2, value.icon);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GpsLocationConsentBlocker.IconButtonElement value) {
                    value.getClass();
                    return Icon.ADAPTER.encodedSizeWithTag(2, value.icon) + FormBlocker.Element.ButtonElement.ADAPTER.encodedSizeWithTag(1, value.prominent_button) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.IconButtonElement redact(GpsLocationConsentBlocker.IconButtonElement value) {
                    value.getClass();
                    FormBlocker.Element.ButtonElement buttonElement = value.prominent_button;
                    FormBlocker.Element.ButtonElement buttonElement2 = buttonElement != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement) : null;
                    Icon icon = value.icon;
                    return value.copy(buttonElement2, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GpsLocationConsentBlocker.IconButtonElement value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Icon.ADAPTER.encodeWithTag(writer, 2, value.icon);
                    FormBlocker.Element.ButtonElement.ADAPTER.encodeWithTag(writer, 1, value.prominent_button);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ IconButtonElement(FormBlocker.Element.ButtonElement buttonElement, Icon icon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : buttonElement, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ IconButtonElement copy$default(IconButtonElement iconButtonElement, FormBlocker.Element.ButtonElement buttonElement, Icon icon, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                buttonElement = iconButtonElement.prominent_button;
            }
            if ((i & 2) != 0) {
                icon = iconButtonElement.icon;
            }
            if ((i & 4) != 0) {
                byteString = iconButtonElement.unknownFields();
            }
            return iconButtonElement.copy(buttonElement, icon, byteString);
        }

        public final IconButtonElement copy(FormBlocker.Element.ButtonElement prominent_button, Icon icon, ByteString unknownFields) {
            unknownFields.getClass();
            return new IconButtonElement(prominent_button, icon, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof IconButtonElement)) {
                return false;
            }
            IconButtonElement iconButtonElement = (IconButtonElement) other;
            return Intrinsics.areEqual(unknownFields(), iconButtonElement.unknownFields()) && Intrinsics.areEqual(this.prominent_button, iconButtonElement.prominent_button) && Intrinsics.areEqual(this.icon, iconButtonElement.icon);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FormBlocker.Element.ButtonElement buttonElement = this.prominent_button;
            int hashCode2 = (hashCode + (buttonElement != null ? buttonElement.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode3 = hashCode2 + (icon != null ? icon.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.prominent_button = this.prominent_button;
            builder.icon = this.icon;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            FormBlocker.Element.ButtonElement buttonElement = this.prominent_button;
            if (buttonElement != null) {
                arrayList.add("prominent_button=" + buttonElement);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "IconButtonElement{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$IconButtonElement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ IconButtonElement build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public IconButtonElement() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconButtonElement(FormBlocker.Element.ButtonElement buttonElement, Icon icon, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.prominent_button = buttonElement;
            this.icon = icon;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\\\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet$Builder;", "image", "Lcom/squareup/protos/cash/ui/Icon;", "title", "", "subtitle", "row_elements", "", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement;", "privacy_text", "prominent_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InfoHalfSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoHalfSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String privacy_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String prominent_button_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.GpsLocationConsentBlocker$RowElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<RowElement> row_elements;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Icon;", "title", "", "subtitle", "row_elements", "", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement;", "privacy_text", "prominent_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon image;
            public String privacy_text;
            public String prominent_button_text;
            public List<RowElement> row_elements = EmptyList.INSTANCE;
            public String subtitle;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public InfoHalfSheet build() {
                return new InfoHalfSheet(this.image, this.title, this.subtitle, this.row_elements, this.privacy_text, this.prominent_button_text, buildUnknownFields());
            }

            public final Builder image(Icon image) {
                this.image = image;
                return this;
            }

            public final Builder privacy_text(String privacy_text) {
                this.privacy_text = privacy_text;
                return this;
            }

            public final Builder prominent_button_text(String prominent_button_text) {
                this.prominent_button_text = prominent_button_text;
                return this;
            }

            public final Builder row_elements(List<RowElement> row_elements) {
                row_elements.getClass();
                TransactorKt.checkElementsNotNull(row_elements);
                this.row_elements = row_elements;
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
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InfoHalfSheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$InfoHalfSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.InfoHalfSheet decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new GpsLocationConsentBlocker.InfoHalfSheet((Icon) obj, (String) obj2, (String) obj3, m, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                m.add(GpsLocationConsentBlocker.RowElement.ADAPTER.decode(reader));
                                break;
                            case 5:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GpsLocationConsentBlocker.InfoHalfSheet value) {
                    writer.getClass();
                    value.getClass();
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    GpsLocationConsentBlocker.RowElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.row_elements);
                    protoAdapter2.encodeWithTag(writer, 5, value.privacy_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.prominent_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GpsLocationConsentBlocker.InfoHalfSheet value) {
                    value.getClass();
                    int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(6, value.prominent_button_text) + protoAdapter2.encodedSizeWithTag(5, value.privacy_text) + GpsLocationConsentBlocker.RowElement.ADAPTER.asRepeated().encodedSizeWithTag(4, value.row_elements) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.InfoHalfSheet redact(GpsLocationConsentBlocker.InfoHalfSheet value) {
                    value.getClass();
                    Icon icon = value.image;
                    return GpsLocationConsentBlocker.InfoHalfSheet.copy$default(value, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, null, null, TransactorKt.m1169redactElements(value.row_elements, GpsLocationConsentBlocker.RowElement.ADAPTER), null, null, ByteString.EMPTY, 54, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GpsLocationConsentBlocker.InfoHalfSheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.prominent_button_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.privacy_text);
                    GpsLocationConsentBlocker.RowElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.row_elements);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public InfoHalfSheet(Icon icon, String str, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InfoHalfSheet copy$default(InfoHalfSheet infoHalfSheet, Icon icon, String str, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = infoHalfSheet.image;
            }
            if ((i & 2) != 0) {
                str = infoHalfSheet.title;
            }
            if ((i & 4) != 0) {
                str2 = infoHalfSheet.subtitle;
            }
            if ((i & 8) != 0) {
                list = infoHalfSheet.row_elements;
            }
            if ((i & 16) != 0) {
                str3 = infoHalfSheet.privacy_text;
            }
            if ((i & 32) != 0) {
                str4 = infoHalfSheet.prominent_button_text;
            }
            if ((i & 64) != 0) {
                byteString = infoHalfSheet.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            String str6 = str3;
            String str7 = str2;
            return infoHalfSheet.copy(icon, str, str7, list, str6, str5, byteString2);
        }

        public final InfoHalfSheet copy(Icon image, String title, String subtitle, List<RowElement> row_elements, String privacy_text, String prominent_button_text, ByteString unknownFields) {
            row_elements.getClass();
            unknownFields.getClass();
            return new InfoHalfSheet(image, title, subtitle, row_elements, privacy_text, prominent_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InfoHalfSheet)) {
                return false;
            }
            InfoHalfSheet infoHalfSheet = (InfoHalfSheet) other;
            return Intrinsics.areEqual(unknownFields(), infoHalfSheet.unknownFields()) && Intrinsics.areEqual(this.image, infoHalfSheet.image) && Intrinsics.areEqual(this.title, infoHalfSheet.title) && Intrinsics.areEqual(this.subtitle, infoHalfSheet.subtitle) && Intrinsics.areEqual(this.row_elements, infoHalfSheet.row_elements) && Intrinsics.areEqual(this.privacy_text, infoHalfSheet.privacy_text) && Intrinsics.areEqual(this.prominent_button_text, infoHalfSheet.prominent_button_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.image;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.row_elements);
            String str3 = this.privacy_text;
            int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.prominent_button_text;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.row_elements = this.row_elements;
            builder.privacy_text = this.privacy_text;
            builder.prominent_button_text = this.prominent_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.image;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("image=", icon, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            if (!this.row_elements.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("row_elements=", arrayList, this.row_elements);
            }
            String str3 = this.privacy_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "privacy_text=", arrayList);
            }
            String str4 = this.prominent_button_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "prominent_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoHalfSheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoHalfSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InfoHalfSheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InfoHalfSheet() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoHalfSheet(Icon icon, String str, String str2, List<RowElement> list, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.image = icon;
            this.title = str;
            this.subtitle = str2;
            this.privacy_text = str3;
            this.prominent_button_text = str4;
            this.row_elements = TransactorKt.immutableCopyOf("row_elements", list);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016Jh\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet$Builder;", "image", "Lcom/squareup/protos/cash/ui/Icon;", "title", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "subtitle", "selectable_row_elements", "", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$SelectableRowElement;", "privacy_text", "link_text_color", "Lcom/squareup/protos/cash/ui/Color;", "prominent_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;Ljava/util/List;Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Deprecated
    /* loaded from: classes8.dex */
    public static final class InfoSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon image;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 5, tag = 6)
        public final Color link_text_color;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 4, tag = 5)
        public final FormBlocker.Element.TextElement privacy_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$ButtonElement#ADAPTER", schemaIndex = 6, tag = 7)
        public final FormBlocker.Element.ButtonElement prominent_button;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$SelectableRowElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<FormBlocker.Element.SelectableRowElement> selectable_row_elements;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 2, tag = 3)
        public final FormBlocker.Element.TextElement subtitle;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$TextElement#ADAPTER", schemaIndex = 1, tag = 2)
        public final FormBlocker.Element.TextElement title;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Icon;", "title", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$TextElement;", "subtitle", "selectable_row_elements", "", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$SelectableRowElement;", "privacy_text", "link_text_color", "Lcom/squareup/protos/cash/ui/Color;", "prominent_button", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$ButtonElement;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon image;
            public Color link_text_color;
            public FormBlocker.Element.TextElement privacy_text;
            public FormBlocker.Element.ButtonElement prominent_button;
            public List<FormBlocker.Element.SelectableRowElement> selectable_row_elements = EmptyList.INSTANCE;
            public FormBlocker.Element.TextElement subtitle;
            public FormBlocker.Element.TextElement title;

            @Override // com.squareup.wire.Message.Builder
            public InfoSheet build() {
                return new InfoSheet(this.image, this.title, this.subtitle, this.selectable_row_elements, this.privacy_text, this.link_text_color, this.prominent_button, buildUnknownFields());
            }

            public final Builder image(Icon image) {
                this.image = image;
                return this;
            }

            public final Builder link_text_color(Color link_text_color) {
                this.link_text_color = link_text_color;
                return this;
            }

            public final Builder privacy_text(FormBlocker.Element.TextElement privacy_text) {
                this.privacy_text = privacy_text;
                return this;
            }

            public final Builder prominent_button(FormBlocker.Element.ButtonElement prominent_button) {
                this.prominent_button = prominent_button;
                return this;
            }

            public final Builder selectable_row_elements(List<FormBlocker.Element.SelectableRowElement> selectable_row_elements) {
                selectable_row_elements.getClass();
                TransactorKt.checkElementsNotNull(selectable_row_elements);
                this.selectable_row_elements = selectable_row_elements;
                return this;
            }

            public final Builder subtitle(FormBlocker.Element.TextElement subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder title(FormBlocker.Element.TextElement title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InfoSheet.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$InfoSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.InfoSheet decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
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
                            return new GpsLocationConsentBlocker.InfoSheet((Icon) obj, (FormBlocker.Element.TextElement) obj2, (FormBlocker.Element.TextElement) obj3, m, (FormBlocker.Element.TextElement) obj4, (Color) obj5, (FormBlocker.Element.ButtonElement) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                m.add(FormBlocker.Element.SelectableRowElement.ADAPTER.decode(reader));
                                break;
                            case 5:
                                obj4 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.TextElement.ADAPTER, reader, obj4);
                                break;
                            case 6:
                                obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj5);
                                break;
                            case 7:
                                obj6 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.ButtonElement.ADAPTER, reader, obj6);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GpsLocationConsentBlocker.InfoSheet value) {
                    writer.getClass();
                    value.getClass();
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    FormBlocker.Element.SelectableRowElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.selectable_row_elements);
                    protoAdapter2.encodeWithTag(writer, 5, value.privacy_text);
                    Color.ADAPTER.encodeWithTag(writer, 6, value.link_text_color);
                    FormBlocker.Element.ButtonElement.ADAPTER.encodeWithTag(writer, 7, value.prominent_button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GpsLocationConsentBlocker.InfoSheet value) {
                    value.getClass();
                    int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                    return FormBlocker.Element.ButtonElement.ADAPTER.encodedSizeWithTag(7, value.prominent_button) + Color.ADAPTER.encodedSizeWithTag(6, value.link_text_color) + protoAdapter2.encodedSizeWithTag(5, value.privacy_text) + FormBlocker.Element.SelectableRowElement.ADAPTER.asRepeated().encodedSizeWithTag(4, value.selectable_row_elements) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.InfoSheet redact(GpsLocationConsentBlocker.InfoSheet value) {
                    value.getClass();
                    Icon icon = value.image;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    FormBlocker.Element.TextElement textElement = value.title;
                    FormBlocker.Element.TextElement textElement2 = textElement != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement) : null;
                    FormBlocker.Element.TextElement textElement3 = value.subtitle;
                    FormBlocker.Element.TextElement textElement4 = textElement3 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement3) : null;
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.selectable_row_elements, FormBlocker.Element.SelectableRowElement.ADAPTER);
                    FormBlocker.Element.TextElement textElement5 = value.privacy_text;
                    FormBlocker.Element.TextElement textElement6 = textElement5 != null ? (FormBlocker.Element.TextElement) FormBlocker.Element.TextElement.ADAPTER.redact(textElement5) : null;
                    Color color = value.link_text_color;
                    Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                    FormBlocker.Element.ButtonElement buttonElement = value.prominent_button;
                    return value.copy(icon2, textElement2, textElement4, m1169redactElements, textElement6, color2, buttonElement != null ? (FormBlocker.Element.ButtonElement) FormBlocker.Element.ButtonElement.ADAPTER.redact(buttonElement) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GpsLocationConsentBlocker.InfoSheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FormBlocker.Element.ButtonElement.ADAPTER.encodeWithTag(writer, 7, value.prominent_button);
                    Color.ADAPTER.encodeWithTag(writer, 6, value.link_text_color);
                    ProtoAdapter protoAdapter2 = FormBlocker.Element.TextElement.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.privacy_text);
                    FormBlocker.Element.SelectableRowElement.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.selectable_row_elements);
                    protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public InfoSheet(Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, List list, FormBlocker.Element.TextElement textElement3, Color color, FormBlocker.Element.ButtonElement buttonElement, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : textElement, (i & 4) != 0 ? null : textElement2, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : textElement3, (i & 32) != 0 ? null : color, (i & 64) != 0 ? null : buttonElement, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InfoSheet copy$default(InfoSheet infoSheet, Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, List list, FormBlocker.Element.TextElement textElement3, Color color, FormBlocker.Element.ButtonElement buttonElement, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = infoSheet.image;
            }
            if ((i & 2) != 0) {
                textElement = infoSheet.title;
            }
            if ((i & 4) != 0) {
                textElement2 = infoSheet.subtitle;
            }
            if ((i & 8) != 0) {
                list = infoSheet.selectable_row_elements;
            }
            if ((i & 16) != 0) {
                textElement3 = infoSheet.privacy_text;
            }
            if ((i & 32) != 0) {
                color = infoSheet.link_text_color;
            }
            if ((i & 64) != 0) {
                buttonElement = infoSheet.prominent_button;
            }
            if ((i & 128) != 0) {
                byteString = infoSheet.unknownFields();
            }
            FormBlocker.Element.ButtonElement buttonElement2 = buttonElement;
            ByteString byteString2 = byteString;
            FormBlocker.Element.TextElement textElement4 = textElement3;
            Color color2 = color;
            return infoSheet.copy(icon, textElement, textElement2, list, textElement4, color2, buttonElement2, byteString2);
        }

        public final InfoSheet copy(Icon image, FormBlocker.Element.TextElement title, FormBlocker.Element.TextElement subtitle, List<FormBlocker.Element.SelectableRowElement> selectable_row_elements, FormBlocker.Element.TextElement privacy_text, Color link_text_color, FormBlocker.Element.ButtonElement prominent_button, ByteString unknownFields) {
            selectable_row_elements.getClass();
            unknownFields.getClass();
            return new InfoSheet(image, title, subtitle, selectable_row_elements, privacy_text, link_text_color, prominent_button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InfoSheet)) {
                return false;
            }
            InfoSheet infoSheet = (InfoSheet) other;
            return Intrinsics.areEqual(unknownFields(), infoSheet.unknownFields()) && Intrinsics.areEqual(this.image, infoSheet.image) && Intrinsics.areEqual(this.title, infoSheet.title) && Intrinsics.areEqual(this.subtitle, infoSheet.subtitle) && Intrinsics.areEqual(this.selectable_row_elements, infoSheet.selectable_row_elements) && Intrinsics.areEqual(this.privacy_text, infoSheet.privacy_text) && Intrinsics.areEqual(this.link_text_color, infoSheet.link_text_color) && Intrinsics.areEqual(this.prominent_button, infoSheet.prominent_button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.image;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            FormBlocker.Element.TextElement textElement = this.title;
            int hashCode3 = (hashCode2 + (textElement != null ? textElement.hashCode() : 0)) * 37;
            FormBlocker.Element.TextElement textElement2 = this.subtitle;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (textElement2 != null ? textElement2.hashCode() : 0)) * 37, 37, this.selectable_row_elements);
            FormBlocker.Element.TextElement textElement3 = this.privacy_text;
            int hashCode4 = (m + (textElement3 != null ? textElement3.hashCode() : 0)) * 37;
            Color color = this.link_text_color;
            int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
            FormBlocker.Element.ButtonElement buttonElement = this.prominent_button;
            int hashCode6 = hashCode5 + (buttonElement != null ? buttonElement.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.selectable_row_elements = this.selectable_row_elements;
            builder.privacy_text = this.privacy_text;
            builder.link_text_color = this.link_text_color;
            builder.prominent_button = this.prominent_button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.image;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("image=", icon, arrayList);
            }
            FormBlocker.Element.TextElement textElement = this.title;
            if (textElement != null) {
                arrayList.add("title=" + textElement);
            }
            FormBlocker.Element.TextElement textElement2 = this.subtitle;
            if (textElement2 != null) {
                arrayList.add("subtitle=" + textElement2);
            }
            if (!this.selectable_row_elements.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("selectable_row_elements=", arrayList, this.selectable_row_elements);
            }
            FormBlocker.Element.TextElement textElement3 = this.privacy_text;
            if (textElement3 != null) {
                arrayList.add("privacy_text=" + textElement3);
            }
            Color color = this.link_text_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("link_text_color=", color, arrayList);
            }
            FormBlocker.Element.ButtonElement buttonElement = this.prominent_button;
            if (buttonElement != null) {
                arrayList.add("prominent_button=" + buttonElement);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoSheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$InfoSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InfoSheet build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InfoSheet() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoSheet(Icon icon, FormBlocker.Element.TextElement textElement, FormBlocker.Element.TextElement textElement2, List<FormBlocker.Element.SelectableRowElement> list, FormBlocker.Element.TextElement textElement3, Color color, FormBlocker.Element.ButtonElement buttonElement, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.image = icon;
            this.title = textElement;
            this.subtitle = textElement2;
            this.privacy_text = textElement3;
            this.link_text_color = color;
            this.prominent_button = buttonElement;
            this.selectable_row_elements = TransactorKt.immutableCopyOf("selectable_row_elements", list);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement$Builder;", "image", "Lcom/squareup/protos/cash/ui/Icon;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class RowElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RowElement> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
        public final Icon image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Icon;", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon image;
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public RowElement build() {
                return new RowElement(this.image, this.text, buildUnknownFields());
            }

            public final Builder image(Icon image) {
                this.image = image;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RowElement.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$RowElement$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.RowElement decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new GpsLocationConsentBlocker.RowElement((Icon) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GpsLocationConsentBlocker.RowElement value) {
                    writer.getClass();
                    value.getClass();
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GpsLocationConsentBlocker.RowElement value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.text) + Icon.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GpsLocationConsentBlocker.RowElement redact(GpsLocationConsentBlocker.RowElement value) {
                    value.getClass();
                    Icon icon = value.image;
                    return GpsLocationConsentBlocker.RowElement.copy$default(value, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GpsLocationConsentBlocker.RowElement value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                    Icon.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ RowElement(Icon icon, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ RowElement copy$default(RowElement rowElement, Icon icon, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                icon = rowElement.image;
            }
            if ((i & 2) != 0) {
                str = rowElement.text;
            }
            if ((i & 4) != 0) {
                byteString = rowElement.unknownFields();
            }
            return rowElement.copy(icon, str, byteString);
        }

        public final RowElement copy(Icon image, String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new RowElement(image, text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof RowElement)) {
                return false;
            }
            RowElement rowElement = (RowElement) other;
            return Intrinsics.areEqual(unknownFields(), rowElement.unknownFields()) && Intrinsics.areEqual(this.image, rowElement.image) && Intrinsics.areEqual(this.text, rowElement.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Icon icon = this.image;
            int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
            String str = this.text;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Icon icon = this.image;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("image=", icon, arrayList);
            }
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RowElement{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$RowElement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ RowElement build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public RowElement() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowElement(Icon icon, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = icon;
            this.text = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$TriggerSource;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CARD_ACTIVATION", "CARD_TRANSACTION_AUTH_PROMPT", "SUSPENSION_CHECK", "PAYMENT_TOKEN_DEVICE_PROVISIONING", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class TriggerSource implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TriggerSource[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final TriggerSource CARD_ACTIVATION = new TriggerSource("CARD_ACTIVATION", 0, 1);
        public static final TriggerSource CARD_TRANSACTION_AUTH_PROMPT = new TriggerSource("CARD_TRANSACTION_AUTH_PROMPT", 1, 2);
        public static final TriggerSource SUSPENSION_CHECK = new TriggerSource("SUSPENSION_CHECK", 2, 3);
        public static final TriggerSource PAYMENT_TOKEN_DEVICE_PROVISIONING = new TriggerSource("PAYMENT_TOKEN_DEVICE_PROVISIONING", 3, 4);

        private static final /* synthetic */ TriggerSource[] $values() {
            return new TriggerSource[]{CARD_ACTIVATION, CARD_TRANSACTION_AUTH_PROMPT, SUSPENSION_CHECK, PAYMENT_TOKEN_DEVICE_PROVISIONING};
        }

        static {
            TriggerSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TriggerSource.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.GpsLocationConsentBlocker$TriggerSource$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public GpsLocationConsentBlocker.TriggerSource fromValue(int value) {
                    return GpsLocationConsentBlocker.TriggerSource.INSTANCE.fromValue(value);
                }
            };
        }

        private TriggerSource(String str, int i, int i2) {
            this.value = i2;
        }

        public static final TriggerSource fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static TriggerSource valueOf(String str) {
            return (TriggerSource) Enum.valueOf(TriggerSource.class, str);
        }

        public static TriggerSource[] values() {
            return (TriggerSource[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$TriggerSource$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$TriggerSource;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final TriggerSource fromValue(int value) {
                if (value == 1) {
                    return TriggerSource.CARD_ACTIVATION;
                }
                if (value == 2) {
                    return TriggerSource.CARD_TRANSACTION_AUTH_PROMPT;
                }
                if (value == 3) {
                    return TriggerSource.SUSPENSION_CHECK;
                }
                if (value != 4) {
                    return null;
                }
                return TriggerSource.PAYMENT_TOKEN_DEVICE_PROVISIONING;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/GpsLocationConsentBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ GpsLocationConsentBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
