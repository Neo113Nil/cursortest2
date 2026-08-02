package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SelectPaymentPlanBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
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
import squareup.cash.ui.arcade.elements.ListUnordered;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0014\u0013\u0015\u0016\u0017\u0018\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "header_section", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "payments_timeline_section", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "summary_section", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "", "submit_button_title", "Ljava/lang/String;", "current_payment_option_token", "", "requires_full_scroll", "Ljava/lang/Boolean;", "Companion", "Builder", "HeaderSection", "PaymentsTimelineSection", "OptionsHalfSheetConfig", "SummarySection", "InfoHalfSheet", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectPaymentPlanBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectPaymentPlanBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 6)
    public final String current_payment_option_token;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$HeaderSection#ADAPTER", schemaIndex = 0, tag = 1)
    public final HeaderSection header_section;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$PaymentsTimelineSection#ADAPTER", schemaIndex = 1, tag = 2)
    public final PaymentsTimelineSection payments_timeline_section;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 7)
    public final Boolean requires_full_scroll;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 5)
    public final String submit_button_title;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$SummarySection#ADAPTER", schemaIndex = 2, tag = 3)
    public final SummarySection summary_section;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker;", "<init>", "()V", "header_section", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "payments_timeline_section", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "summary_section", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "submit_button_title", "", "current_payment_option_token", "requires_full_scroll", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String current_payment_option_token;
        public HeaderSection header_section;
        public PaymentsTimelineSection payments_timeline_section;
        public Boolean requires_full_scroll;
        public String submit_button_title;
        public SummarySection summary_section;

        @Override // com.squareup.wire.Message.Builder
        public SelectPaymentPlanBlocker build() {
            return new SelectPaymentPlanBlocker(this.header_section, this.payments_timeline_section, this.summary_section, this.submit_button_title, this.current_payment_option_token, this.requires_full_scroll, buildUnknownFields());
        }

        public final Builder current_payment_option_token(String current_payment_option_token) {
            this.current_payment_option_token = current_payment_option_token;
            return this;
        }

        public final Builder header_section(HeaderSection header_section) {
            this.header_section = header_section;
            return this;
        }

        public final Builder payments_timeline_section(PaymentsTimelineSection payments_timeline_section) {
            this.payments_timeline_section = payments_timeline_section;
            return this;
        }

        public final Builder requires_full_scroll(Boolean requires_full_scroll) {
            this.requires_full_scroll = requires_full_scroll;
            return this;
        }

        public final Builder submit_button_title(String submit_button_title) {
            this.submit_button_title = submit_button_title;
            return this;
        }

        public final Builder summary_section(SummarySection summary_section) {
            this.summary_section = summary_section;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dB]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\bH\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016Ja\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u001aR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Builder;", "button_title", "", "half_sheet_title", "half_sheet_subtitle", "preselected_option", "", "submit_button_title", "options", "", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "Builder", "Companion", "Option", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class OptionsHalfSheetConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OptionsHalfSheetConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String half_sheet_subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String half_sheet_title;

        @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
        public final List<Option> options;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 3, tag = 4)
        public final Integer preselected_option;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String submit_button_title;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "<init>", "()V", "button_title", "", "half_sheet_title", "half_sheet_subtitle", "preselected_option", "", "Ljava/lang/Integer;", "submit_button_title", "options", "", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String button_title;
            public String half_sheet_subtitle;
            public String half_sheet_title;
            public List<Option> options = EmptyList.INSTANCE;
            public Integer preselected_option;
            public String submit_button_title;

            @Override // com.squareup.wire.Message.Builder
            public OptionsHalfSheetConfig build() {
                return new OptionsHalfSheetConfig(this.button_title, this.half_sheet_title, this.half_sheet_subtitle, this.preselected_option, this.submit_button_title, this.options, buildUnknownFields());
            }

            public final Builder button_title(String button_title) {
                this.button_title = button_title;
                return this;
            }

            public final Builder half_sheet_subtitle(String half_sheet_subtitle) {
                this.half_sheet_subtitle = half_sheet_subtitle;
                return this;
            }

            public final Builder half_sheet_title(String half_sheet_title) {
                this.half_sheet_title = half_sheet_title;
                return this;
            }

            public final Builder options(List<Option> options) {
                options.getClass();
                TransactorKt.checkElementsNotNull(options);
                this.options = options;
                return this;
            }

            public final Builder preselected_option(Integer preselected_option) {
                this.preselected_option = preselected_option;
                return this;
            }

            public final Builder submit_button_title(String submit_button_title) {
                this.submit_button_title = submit_button_title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OptionsHalfSheetConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.OptionsHalfSheetConfig decode(ProtoReader reader) {
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
                            return new SelectPaymentPlanBlocker.OptionsHalfSheetConfig((String) obj, (String) obj2, (String) obj3, (Integer) obj4, (String) obj5, m, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                obj4 = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 5:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                m.add(SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.OptionsHalfSheetConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.button_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.half_sheet_title);
                    protoAdapter2.encodeWithTag(writer, 3, value.half_sheet_subtitle);
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.preselected_option);
                    protoAdapter2.encodeWithTag(writer, 5, value.submit_button_title);
                    SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.options);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectPaymentPlanBlocker.OptionsHalfSheetConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option.ADAPTER.asRepeated().encodedSizeWithTag(6, value.options) + protoAdapter2.encodedSizeWithTag(5, value.submit_button_title) + ProtoAdapter.UINT32.encodedSizeWithTag(4, value.preselected_option) + protoAdapter2.encodedSizeWithTag(3, value.half_sheet_subtitle) + protoAdapter2.encodedSizeWithTag(2, value.half_sheet_title) + protoAdapter2.encodedSizeWithTag(1, value.button_title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.OptionsHalfSheetConfig redact(SelectPaymentPlanBlocker.OptionsHalfSheetConfig value) {
                    value.getClass();
                    return SelectPaymentPlanBlocker.OptionsHalfSheetConfig.copy$default(value, null, null, null, null, null, TransactorKt.m1169redactElements(value.options, SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option.ADAPTER), ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.OptionsHalfSheetConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.options);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.submit_button_title);
                    ProtoAdapter.UINT32.encodeWithTag(writer, 4, value.preselected_option);
                    protoAdapter2.encodeWithTag(writer, 3, value.half_sheet_subtitle);
                    protoAdapter2.encodeWithTag(writer, 2, value.half_sheet_title);
                    protoAdapter2.encodeWithTag(writer, 1, value.button_title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public OptionsHalfSheetConfig(String str, String str2, String str3, Integer num, String str4, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? EmptyList.INSTANCE : list, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ OptionsHalfSheetConfig copy$default(OptionsHalfSheetConfig optionsHalfSheetConfig, String str, String str2, String str3, Integer num, String str4, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = optionsHalfSheetConfig.button_title;
            }
            if ((i & 2) != 0) {
                str2 = optionsHalfSheetConfig.half_sheet_title;
            }
            if ((i & 4) != 0) {
                str3 = optionsHalfSheetConfig.half_sheet_subtitle;
            }
            if ((i & 8) != 0) {
                num = optionsHalfSheetConfig.preselected_option;
            }
            if ((i & 16) != 0) {
                str4 = optionsHalfSheetConfig.submit_button_title;
            }
            if ((i & 32) != 0) {
                list = optionsHalfSheetConfig.options;
            }
            if ((i & 64) != 0) {
                byteString = optionsHalfSheetConfig.unknownFields();
            }
            List list2 = list;
            ByteString byteString2 = byteString;
            String str5 = str4;
            String str6 = str3;
            return optionsHalfSheetConfig.copy(str, str2, str6, num, str5, list2, byteString2);
        }

        public final OptionsHalfSheetConfig copy(String button_title, String half_sheet_title, String half_sheet_subtitle, Integer preselected_option, String submit_button_title, List<Option> options, ByteString unknownFields) {
            options.getClass();
            unknownFields.getClass();
            return new OptionsHalfSheetConfig(button_title, half_sheet_title, half_sheet_subtitle, preselected_option, submit_button_title, options, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OptionsHalfSheetConfig)) {
                return false;
            }
            OptionsHalfSheetConfig optionsHalfSheetConfig = (OptionsHalfSheetConfig) other;
            return Intrinsics.areEqual(unknownFields(), optionsHalfSheetConfig.unknownFields()) && Intrinsics.areEqual(this.button_title, optionsHalfSheetConfig.button_title) && Intrinsics.areEqual(this.half_sheet_title, optionsHalfSheetConfig.half_sheet_title) && Intrinsics.areEqual(this.half_sheet_subtitle, optionsHalfSheetConfig.half_sheet_subtitle) && Intrinsics.areEqual(this.preselected_option, optionsHalfSheetConfig.preselected_option) && Intrinsics.areEqual(this.submit_button_title, optionsHalfSheetConfig.submit_button_title) && Intrinsics.areEqual(this.options, optionsHalfSheetConfig.options);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.button_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.half_sheet_title;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.half_sheet_subtitle;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Integer num = this.preselected_option;
            int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            String str4 = this.submit_button_title;
            int hashCode6 = this.options.hashCode() + ((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.button_title = this.button_title;
            builder.half_sheet_title = this.half_sheet_title;
            builder.half_sheet_subtitle = this.half_sheet_subtitle;
            builder.preselected_option = this.preselected_option;
            builder.submit_button_title = this.submit_button_title;
            builder.options = this.options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.button_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_title=", arrayList);
            }
            String str2 = this.half_sheet_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "half_sheet_title=", arrayList);
            }
            String str3 = this.half_sheet_subtitle;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "half_sheet_subtitle=", arrayList);
            }
            Integer num = this.preselected_option;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("preselected_option=", num, arrayList);
            }
            String str4 = this.submit_button_title;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "submit_button_title=", arrayList);
            }
            if (!this.options.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OptionsHalfSheetConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option$Builder;", "token", "", "title", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Option extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Option> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String subtitle;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String token;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option;", "<init>", "()V", "token", "", "title", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String subtitle;
                public String title;
                public String token;

                @Override // com.squareup.wire.Message.Builder
                public Option build() {
                    return new Option(this.token, this.title, this.subtitle, buildUnknownFields());
                }

                public final Builder subtitle(String subtitle) {
                    this.subtitle = subtitle;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }

                public final Builder token(String token) {
                    this.token = token;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Option.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.token);
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option redact(SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option value) {
                        value.getClass();
                        return SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.OptionsHalfSheetConfig.Option value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                        protoAdapter2.encodeWithTag(writer, 2, value.title);
                        protoAdapter2.encodeWithTag(writer, 1, value.token);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Option(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Option copy$default(Option option, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = option.token;
                }
                if ((i & 2) != 0) {
                    str2 = option.title;
                }
                if ((i & 4) != 0) {
                    str3 = option.subtitle;
                }
                if ((i & 8) != 0) {
                    byteString = option.unknownFields();
                }
                return option.copy(str, str2, str3, byteString);
            }

            public final Option copy(String token, String title, String subtitle, ByteString unknownFields) {
                unknownFields.getClass();
                return new Option(token, title, subtitle, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Option)) {
                    return false;
                }
                Option option = (Option) other;
                return Intrinsics.areEqual(unknownFields(), option.unknownFields()) && Intrinsics.areEqual(this.token, option.token) && Intrinsics.areEqual(this.title, option.title) && Intrinsics.areEqual(this.subtitle, option.subtitle);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.title;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.subtitle;
                int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.token = this.token;
                builder.title = this.title;
                builder.subtitle = this.subtitle;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
                }
                String str2 = this.title;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
                }
                String str3 = this.subtitle;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Option{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Option;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Option(String str, String str2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.token = str;
                this.title = str2;
                this.subtitle = str3;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OptionsHalfSheetConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public OptionsHalfSheetConfig() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionsHalfSheetConfig(String str, String str2, String str3, Integer num, String str4, List<Option> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.button_title = str;
            this.half_sheet_title = str2;
            this.half_sheet_subtitle = str3;
            this.preselected_option = num;
            this.submit_button_title = str4;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Builder;", "rows", "", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Row", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SummarySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SummarySection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$SummarySection$Row#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 2)
        public final List<Row> rows;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "<init>", "()V", "rows", "", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Row> rows = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public SummarySection build() {
                return new SummarySection(this.rows, buildUnknownFields());
            }

            public final Builder rows(List<Row> rows) {
                rows.getClass();
                TransactorKt.checkElementsNotNull(rows);
                this.rows = rows;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SummarySection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$SummarySection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.SummarySection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SelectPaymentPlanBlocker.SummarySection(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 2) {
                            m.add(SelectPaymentPlanBlocker.SummarySection.Row.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.SummarySection value) {
                    writer.getClass();
                    value.getClass();
                    SelectPaymentPlanBlocker.SummarySection.Row.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.rows);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectPaymentPlanBlocker.SummarySection value) {
                    value.getClass();
                    return SelectPaymentPlanBlocker.SummarySection.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, value.rows) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.SummarySection redact(SelectPaymentPlanBlocker.SummarySection value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.rows, SelectPaymentPlanBlocker.SummarySection.Row.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.SummarySection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    SelectPaymentPlanBlocker.SummarySection.Row.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.rows);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SummarySection(List<Row> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.rows = TransactorKt.immutableCopyOf("rows", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SummarySection copy$default(SummarySection summarySection, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = summarySection.rows;
            }
            if ((i & 2) != 0) {
                byteString = summarySection.unknownFields();
            }
            return summarySection.copy(list, byteString);
        }

        public final SummarySection copy(List<Row> rows, ByteString unknownFields) {
            rows.getClass();
            unknownFields.getClass();
            return new SummarySection(rows, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SummarySection)) {
                return false;
            }
            SummarySection summarySection = (SummarySection) other;
            return Intrinsics.areEqual(unknownFields(), summarySection.unknownFields()) && Intrinsics.areEqual(this.rows, summarySection.rows);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.rows.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.rows = this.rows;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.rows.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("rows=", arrayList, this.rows);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SummarySection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row$Builder;", "primary_text", "", "info_half_sheet", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "secondary_text", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Row extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Row> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$InfoHalfSheet#ADAPTER", schemaIndex = 1, tag = 2)
            public final InfoHalfSheet info_half_sheet;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String primary_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String secondary_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String subtitle;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row;", "<init>", "()V", "primary_text", "", "info_half_sheet", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "secondary_text", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public InfoHalfSheet info_half_sheet;
                public String primary_text;
                public String secondary_text;
                public String subtitle;

                @Override // com.squareup.wire.Message.Builder
                public Row build() {
                    return new Row(this.primary_text, this.info_half_sheet, this.secondary_text, this.subtitle, buildUnknownFields());
                }

                public final Builder info_half_sheet(InfoHalfSheet info_half_sheet) {
                    this.info_half_sheet = info_half_sheet;
                    return this;
                }

                public final Builder primary_text(String primary_text) {
                    this.primary_text = primary_text;
                    return this;
                }

                public final Builder secondary_text(String secondary_text) {
                    this.secondary_text = secondary_text;
                    return this;
                }

                public final Builder subtitle(String subtitle) {
                    this.subtitle = subtitle;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Row.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$SummarySection$Row$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public SelectPaymentPlanBlocker.SummarySection.Row decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new SelectPaymentPlanBlocker.SummarySection.Row((String) obj, (SelectPaymentPlanBlocker.InfoHalfSheet) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER, reader, obj2);
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
                    public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.SummarySection.Row value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.primary_text);
                        SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.encodeWithTag(writer, 2, value.info_half_sheet);
                        protoAdapter2.encodeWithTag(writer, 3, value.secondary_text);
                        protoAdapter2.encodeWithTag(writer, 4, value.subtitle);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(SelectPaymentPlanBlocker.SummarySection.Row value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(4, value.subtitle) + protoAdapter2.encodedSizeWithTag(3, value.secondary_text) + SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.encodedSizeWithTag(2, value.info_half_sheet) + protoAdapter2.encodedSizeWithTag(1, value.primary_text) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public SelectPaymentPlanBlocker.SummarySection.Row redact(SelectPaymentPlanBlocker.SummarySection.Row value) {
                        value.getClass();
                        SelectPaymentPlanBlocker.InfoHalfSheet infoHalfSheet = value.info_half_sheet;
                        return SelectPaymentPlanBlocker.SummarySection.Row.copy$default(value, null, infoHalfSheet != null ? (SelectPaymentPlanBlocker.InfoHalfSheet) SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.redact(infoHalfSheet) : null, null, null, ByteString.EMPTY, 13, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.SummarySection.Row value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.subtitle);
                        protoAdapter2.encodeWithTag(writer, 3, value.secondary_text);
                        SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.encodeWithTag(writer, 2, value.info_half_sheet);
                        protoAdapter2.encodeWithTag(writer, 1, value.primary_text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Row(String str, InfoHalfSheet infoHalfSheet, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : infoHalfSheet, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Row copy$default(Row row, String str, InfoHalfSheet infoHalfSheet, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = row.primary_text;
                }
                if ((i & 2) != 0) {
                    infoHalfSheet = row.info_half_sheet;
                }
                if ((i & 4) != 0) {
                    str2 = row.secondary_text;
                }
                if ((i & 8) != 0) {
                    str3 = row.subtitle;
                }
                if ((i & 16) != 0) {
                    byteString = row.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str4 = str2;
                return row.copy(str, infoHalfSheet, str4, str3, byteString2);
            }

            public final Row copy(String primary_text, InfoHalfSheet info_half_sheet, String secondary_text, String subtitle, ByteString unknownFields) {
                unknownFields.getClass();
                return new Row(primary_text, info_half_sheet, secondary_text, subtitle, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Row)) {
                    return false;
                }
                Row row = (Row) other;
                return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.primary_text, row.primary_text) && Intrinsics.areEqual(this.info_half_sheet, row.info_half_sheet) && Intrinsics.areEqual(this.secondary_text, row.secondary_text) && Intrinsics.areEqual(this.subtitle, row.subtitle);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.primary_text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                InfoHalfSheet infoHalfSheet = this.info_half_sheet;
                int hashCode3 = (hashCode2 + (infoHalfSheet != null ? infoHalfSheet.hashCode() : 0)) * 37;
                String str2 = this.secondary_text;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.subtitle;
                int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.primary_text = this.primary_text;
                builder.info_half_sheet = this.info_half_sheet;
                builder.secondary_text = this.secondary_text;
                builder.subtitle = this.subtitle;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.primary_text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_text=", arrayList);
                }
                InfoHalfSheet infoHalfSheet = this.info_half_sheet;
                if (infoHalfSheet != null) {
                    arrayList.add("info_half_sheet=" + infoHalfSheet);
                }
                String str2 = this.secondary_text;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_text=", arrayList);
                }
                String str3 = this.subtitle;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Row;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Row build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Row() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Row(String str, InfoHalfSheet infoHalfSheet, String str2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.primary_text = str;
                this.info_half_sheet = infoHalfSheet;
                this.secondary_text = str2;
                this.subtitle = str3;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$SummarySection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SummarySection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SummarySection(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public SummarySection() {
            this(null, null, 3, null);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectPaymentPlanBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SelectPaymentPlanBlocker decode(ProtoReader reader) {
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
                        return new SelectPaymentPlanBlocker((SelectPaymentPlanBlocker.HeaderSection) obj, (SelectPaymentPlanBlocker.PaymentsTimelineSection) obj2, (SelectPaymentPlanBlocker.SummarySection) obj3, (String) obj4, (String) obj5, (Boolean) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.HeaderSection.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.PaymentsTimelineSection.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.SummarySection.ADAPTER, reader, obj3);
                    } else if (nextTag == 5) {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 6) {
                        obj5 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 7) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj6 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectPaymentPlanBlocker value) {
                writer.getClass();
                value.getClass();
                SelectPaymentPlanBlocker.HeaderSection.ADAPTER.encodeWithTag(writer, 1, value.header_section);
                SelectPaymentPlanBlocker.PaymentsTimelineSection.ADAPTER.encodeWithTag(writer, 2, value.payments_timeline_section);
                SelectPaymentPlanBlocker.SummarySection.ADAPTER.encodeWithTag(writer, 3, value.summary_section);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.submit_button_title);
                protoAdapter2.encodeWithTag(writer, 6, value.current_payment_option_token);
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.requires_full_scroll);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectPaymentPlanBlocker value) {
                value.getClass();
                int encodedSizeWithTag = SelectPaymentPlanBlocker.SummarySection.ADAPTER.encodedSizeWithTag(3, value.summary_section) + SelectPaymentPlanBlocker.PaymentsTimelineSection.ADAPTER.encodedSizeWithTag(2, value.payments_timeline_section) + SelectPaymentPlanBlocker.HeaderSection.ADAPTER.encodedSizeWithTag(1, value.header_section) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(7, value.requires_full_scroll) + protoAdapter2.encodedSizeWithTag(6, value.current_payment_option_token) + protoAdapter2.encodedSizeWithTag(5, value.submit_button_title) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectPaymentPlanBlocker redact(SelectPaymentPlanBlocker value) {
                value.getClass();
                SelectPaymentPlanBlocker.HeaderSection headerSection = value.header_section;
                SelectPaymentPlanBlocker.HeaderSection headerSection2 = headerSection != null ? (SelectPaymentPlanBlocker.HeaderSection) SelectPaymentPlanBlocker.HeaderSection.ADAPTER.redact(headerSection) : null;
                SelectPaymentPlanBlocker.PaymentsTimelineSection paymentsTimelineSection = value.payments_timeline_section;
                SelectPaymentPlanBlocker.PaymentsTimelineSection paymentsTimelineSection2 = paymentsTimelineSection != null ? (SelectPaymentPlanBlocker.PaymentsTimelineSection) SelectPaymentPlanBlocker.PaymentsTimelineSection.ADAPTER.redact(paymentsTimelineSection) : null;
                SelectPaymentPlanBlocker.SummarySection summarySection = value.summary_section;
                SelectPaymentPlanBlocker.SummarySection summarySection2 = summarySection != null ? (SelectPaymentPlanBlocker.SummarySection) SelectPaymentPlanBlocker.SummarySection.ADAPTER.redact(summarySection) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.submit_button_title;
                String str2 = value.current_payment_option_token;
                Boolean bool = value.requires_full_scroll;
                byteString.getClass();
                return new SelectPaymentPlanBlocker(headerSection2, paymentsTimelineSection2, summarySection2, str, str2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, value.requires_full_scroll);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.current_payment_option_token);
                protoAdapter2.encodeWithTag(writer, 5, value.submit_button_title);
                SelectPaymentPlanBlocker.SummarySection.ADAPTER.encodeWithTag(writer, 3, value.summary_section);
                SelectPaymentPlanBlocker.PaymentsTimelineSection.ADAPTER.encodeWithTag(writer, 2, value.payments_timeline_section);
                SelectPaymentPlanBlocker.HeaderSection.ADAPTER.encodeWithTag(writer, 1, value.header_section);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentPlanBlocker(HeaderSection headerSection, PaymentsTimelineSection paymentsTimelineSection, SummarySection summarySection, String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header_section = headerSection;
        this.payments_timeline_section = paymentsTimelineSection;
        this.summary_section = summarySection;
        this.submit_button_title = str;
        this.current_payment_option_token = str2;
        this.requires_full_scroll = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectPaymentPlanBlocker)) {
            return false;
        }
        SelectPaymentPlanBlocker selectPaymentPlanBlocker = (SelectPaymentPlanBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), selectPaymentPlanBlocker.unknownFields()) && Intrinsics.areEqual(this.header_section, selectPaymentPlanBlocker.header_section) && Intrinsics.areEqual(this.payments_timeline_section, selectPaymentPlanBlocker.payments_timeline_section) && Intrinsics.areEqual(this.summary_section, selectPaymentPlanBlocker.summary_section) && Intrinsics.areEqual(this.submit_button_title, selectPaymentPlanBlocker.submit_button_title) && Intrinsics.areEqual(this.current_payment_option_token, selectPaymentPlanBlocker.current_payment_option_token) && Intrinsics.areEqual(this.requires_full_scroll, selectPaymentPlanBlocker.requires_full_scroll);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        HeaderSection headerSection = this.header_section;
        int hashCode2 = (hashCode + (headerSection != null ? headerSection.hashCode() : 0)) * 37;
        PaymentsTimelineSection paymentsTimelineSection = this.payments_timeline_section;
        int hashCode3 = (hashCode2 + (paymentsTimelineSection != null ? paymentsTimelineSection.hashCode() : 0)) * 37;
        SummarySection summarySection = this.summary_section;
        int hashCode4 = (hashCode3 + (summarySection != null ? summarySection.hashCode() : 0)) * 37;
        String str = this.submit_button_title;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.current_payment_option_token;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.requires_full_scroll;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_section = this.header_section;
        builder.payments_timeline_section = this.payments_timeline_section;
        builder.summary_section = this.summary_section;
        builder.submit_button_title = this.submit_button_title;
        builder.current_payment_option_token = this.current_payment_option_token;
        builder.requires_full_scroll = this.requires_full_scroll;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        HeaderSection headerSection = this.header_section;
        if (headerSection != null) {
            arrayList.add("header_section=" + headerSection);
        }
        PaymentsTimelineSection paymentsTimelineSection = this.payments_timeline_section;
        if (paymentsTimelineSection != null) {
            arrayList.add("payments_timeline_section=" + paymentsTimelineSection);
        }
        SummarySection summarySection = this.summary_section;
        if (summarySection != null) {
            arrayList.add("summary_section=" + summarySection);
        }
        String str = this.submit_button_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "submit_button_title=", arrayList);
        }
        String str2 = this.current_payment_option_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "current_payment_option_token=", arrayList);
        }
        Boolean bool = this.requires_full_scroll;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("requires_full_scroll=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectPaymentPlanBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0016JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection$Builder;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "title", "", "body_primary_text", "body_secondary_text", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/UiAvatar;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class HeaderSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<HeaderSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 0, tag = 1)
        public final UiAvatar avatar;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String body_primary_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String body_secondary_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "<init>", "()V", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "title", "", "body_primary_text", "body_secondary_text", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public UiAvatar avatar;
            public String body_primary_text;
            public String body_secondary_text;
            public String subtitle;
            public String title;

            public final Builder avatar(UiAvatar avatar) {
                this.avatar = avatar;
                return this;
            }

            public final Builder body_primary_text(String body_primary_text) {
                this.body_primary_text = body_primary_text;
                return this;
            }

            public final Builder body_secondary_text(String body_secondary_text) {
                this.body_secondary_text = body_secondary_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public HeaderSection build() {
                return new HeaderSection(this.avatar, this.title, this.body_primary_text, this.body_secondary_text, this.subtitle, buildUnknownFields());
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
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HeaderSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$HeaderSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.HeaderSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SelectPaymentPlanBlocker.HeaderSection((UiAvatar) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.HeaderSection value) {
                    writer.getClass();
                    value.getClass();
                    UiAvatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.body_primary_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.body_secondary_text);
                    protoAdapter2.encodeWithTag(writer, 5, value.subtitle);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectPaymentPlanBlocker.HeaderSection value) {
                    value.getClass();
                    int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, value.avatar) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(5, value.subtitle) + protoAdapter2.encodedSizeWithTag(4, value.body_secondary_text) + protoAdapter2.encodedSizeWithTag(3, value.body_primary_text) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.HeaderSection redact(SelectPaymentPlanBlocker.HeaderSection value) {
                    value.getClass();
                    UiAvatar uiAvatar = value.avatar;
                    return SelectPaymentPlanBlocker.HeaderSection.copy$default(value, uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null, null, null, null, null, ByteString.EMPTY, 14, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.HeaderSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 4, value.body_secondary_text);
                    protoAdapter2.encodeWithTag(writer, 3, value.body_primary_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    UiAvatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ HeaderSection(UiAvatar uiAvatar, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiAvatar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ HeaderSection copy$default(HeaderSection headerSection, UiAvatar uiAvatar, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAvatar = headerSection.avatar;
            }
            if ((i & 2) != 0) {
                str = headerSection.title;
            }
            if ((i & 4) != 0) {
                str2 = headerSection.body_primary_text;
            }
            if ((i & 8) != 0) {
                str3 = headerSection.body_secondary_text;
            }
            if ((i & 16) != 0) {
                str4 = headerSection.subtitle;
            }
            if ((i & 32) != 0) {
                byteString = headerSection.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            return headerSection.copy(uiAvatar, str, str2, str3, str5, byteString2);
        }

        public final HeaderSection copy(UiAvatar avatar, String title, String body_primary_text, String body_secondary_text, String subtitle, ByteString unknownFields) {
            unknownFields.getClass();
            return new HeaderSection(avatar, title, body_primary_text, body_secondary_text, subtitle, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof HeaderSection)) {
                return false;
            }
            HeaderSection headerSection = (HeaderSection) other;
            return Intrinsics.areEqual(unknownFields(), headerSection.unknownFields()) && Intrinsics.areEqual(this.avatar, headerSection.avatar) && Intrinsics.areEqual(this.title, headerSection.title) && Intrinsics.areEqual(this.body_primary_text, headerSection.body_primary_text) && Intrinsics.areEqual(this.body_secondary_text, headerSection.body_secondary_text) && Intrinsics.areEqual(this.subtitle, headerSection.subtitle);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body_primary_text;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.body_secondary_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.subtitle;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.avatar = this.avatar;
            builder.title = this.title;
            builder.body_primary_text = this.body_primary_text;
            builder.body_secondary_text = this.body_secondary_text;
            builder.subtitle = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body_primary_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body_primary_text=", arrayList);
            }
            String str3 = this.body_secondary_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body_secondary_text=", arrayList);
            }
            if (this.subtitle != null) {
                arrayList.add("subtitle=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "HeaderSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$HeaderSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ HeaderSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public HeaderSection() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderSection(UiAvatar uiAvatar, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = uiAvatar;
            this.title = str;
            this.body_primary_text = str2;
            this.body_secondary_text = str3;
            this.subtitle = str4;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet$Builder;", "title", "", "body", "dismiss_button_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InfoHalfSheet extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoHalfSheet> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String dismiss_button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "<init>", "()V", "title", "", "body", "dismiss_button_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String body;
            public String dismiss_button_title;
            public String title;

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public InfoHalfSheet build() {
                return new InfoHalfSheet(this.title, this.body, this.dismiss_button_title, buildUnknownFields());
            }

            public final Builder dismiss_button_title(String dismiss_button_title) {
                this.dismiss_button_title = dismiss_button_title;
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
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$InfoHalfSheet$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.InfoHalfSheet decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SelectPaymentPlanBlocker.InfoHalfSheet((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.InfoHalfSheet value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_title);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectPaymentPlanBlocker.InfoHalfSheet value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.dismiss_button_title) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.InfoHalfSheet redact(SelectPaymentPlanBlocker.InfoHalfSheet value) {
                    value.getClass();
                    return SelectPaymentPlanBlocker.InfoHalfSheet.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.InfoHalfSheet value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InfoHalfSheet(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InfoHalfSheet copy$default(InfoHalfSheet infoHalfSheet, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoHalfSheet.title;
            }
            if ((i & 2) != 0) {
                str2 = infoHalfSheet.body;
            }
            if ((i & 4) != 0) {
                str3 = infoHalfSheet.dismiss_button_title;
            }
            if ((i & 8) != 0) {
                byteString = infoHalfSheet.unknownFields();
            }
            return infoHalfSheet.copy(str, str2, str3, byteString);
        }

        public final InfoHalfSheet copy(String title, String body, String dismiss_button_title, ByteString unknownFields) {
            unknownFields.getClass();
            return new InfoHalfSheet(title, body, dismiss_button_title, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InfoHalfSheet)) {
                return false;
            }
            InfoHalfSheet infoHalfSheet = (InfoHalfSheet) other;
            return Intrinsics.areEqual(unknownFields(), infoHalfSheet.unknownFields()) && Intrinsics.areEqual(this.title, infoHalfSheet.title) && Intrinsics.areEqual(this.body, infoHalfSheet.body) && Intrinsics.areEqual(this.dismiss_button_title, infoHalfSheet.dismiss_button_title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dismiss_button_title;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body = this.body;
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
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            String str3 = this.dismiss_button_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dismiss_button_title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoHalfSheet{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoHalfSheet(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.dismiss_button_title = str3;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cBQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016JP\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$Builder;", "title", "", "description", "options_half_sheet_config", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "timeline_events", "", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent;", "footer_list", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;Ljava/util/List;Lsquareup/cash/ui/arcade/elements/ListUnordered;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "TimelineEvent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PaymentsTimelineSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaymentsTimelineSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String description;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.ListUnordered#ADAPTER", schemaIndex = 4, tag = 5)
        public final ListUnordered footer_list;

        @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$OptionsHalfSheetConfig#ADAPTER", schemaIndex = 2, tag = 3)
        public final OptionsHalfSheetConfig options_half_sheet_config;

        @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
        public final List<TimelineEvent> timeline_events;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "<init>", "()V", "title", "", "description", "options_half_sheet_config", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$OptionsHalfSheetConfig;", "timeline_events", "", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent;", "footer_list", "Lsquareup/cash/ui/arcade/elements/ListUnordered;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String description;
            public ListUnordered footer_list;
            public OptionsHalfSheetConfig options_half_sheet_config;
            public List<TimelineEvent> timeline_events = EmptyList.INSTANCE;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public PaymentsTimelineSection build() {
                return new PaymentsTimelineSection(this.title, this.description, this.options_half_sheet_config, this.timeline_events, this.footer_list, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder footer_list(ListUnordered footer_list) {
                this.footer_list = footer_list;
                return this;
            }

            public final Builder options_half_sheet_config(OptionsHalfSheetConfig options_half_sheet_config) {
                this.options_half_sheet_config = options_half_sheet_config;
                return this;
            }

            public final Builder timeline_events(List<TimelineEvent> timeline_events) {
                timeline_events.getClass();
                TransactorKt.checkElementsNotNull(timeline_events);
                this.timeline_events = timeline_events;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016JL\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$Builder;", "title", "", "value", "state", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State;", "body", "info_half_sheet", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State;Ljava/lang/String;Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "State", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TimelineEvent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TimelineEvent> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String body;

            @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$InfoHalfSheet#ADAPTER", schemaIndex = 4, tag = 5)
            public final InfoHalfSheet info_half_sheet;

            @WireField(adapter = "com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State#ADAPTER", schemaIndex = 2, tag = 3)
            public final State state;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String value;

            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent;", "<init>", "()V", "title", "", "value", "state", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State;", "body", "info_half_sheet", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$InfoHalfSheet;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String body;
                public InfoHalfSheet info_half_sheet;
                public State state;
                public String title;
                public String value;

                public final Builder body(String body) {
                    this.body = body;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public TimelineEvent build() {
                    return new TimelineEvent(this.title, this.value, this.state, this.body, this.info_half_sheet, buildUnknownFields());
                }

                public final Builder info_half_sheet(InfoHalfSheet info_half_sheet) {
                    this.info_half_sheet = info_half_sheet;
                    return this;
                }

                public final Builder state(State state) {
                    this.state = state;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }

                public final Builder value(String value) {
                    this.value = value;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TimelineEvent.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        Object obj5 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent((String) obj, (String) obj2, (SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State) obj3, (String) obj4, (SelectPaymentPlanBlocker.InfoHalfSheet) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                try {
                                    obj3 = SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (nextTag == 4) {
                                obj4 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 5) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj5 = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER, reader, obj5);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.ADAPTER.encodeWithTag(writer, 3, value.state);
                        protoAdapter2.encodeWithTag(writer, 4, value.body);
                        SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.encodeWithTag(writer, 5, value.info_half_sheet);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.encodedSizeWithTag(5, value.info_half_sheet) + protoAdapter2.encodedSizeWithTag(4, value.body) + SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.ADAPTER.encodedSizeWithTag(3, value.state) + protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent redact(SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent value) {
                        value.getClass();
                        SelectPaymentPlanBlocker.InfoHalfSheet infoHalfSheet = value.info_half_sheet;
                        return SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.copy$default(value, null, null, null, null, infoHalfSheet != null ? (SelectPaymentPlanBlocker.InfoHalfSheet) SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.redact(infoHalfSheet) : null, ByteString.EMPTY, 15, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        SelectPaymentPlanBlocker.InfoHalfSheet.ADAPTER.encodeWithTag(writer, 5, value.info_half_sheet);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.body);
                        SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.ADAPTER.encodeWithTag(writer, 3, value.state);
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ TimelineEvent(String str, String str2, State state, String str3, InfoHalfSheet infoHalfSheet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : state, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : infoHalfSheet, (i & 32) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ TimelineEvent copy$default(TimelineEvent timelineEvent, String str, String str2, State state, String str3, InfoHalfSheet infoHalfSheet, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = timelineEvent.title;
                }
                if ((i & 2) != 0) {
                    str2 = timelineEvent.value;
                }
                if ((i & 4) != 0) {
                    state = timelineEvent.state;
                }
                if ((i & 8) != 0) {
                    str3 = timelineEvent.body;
                }
                if ((i & 16) != 0) {
                    infoHalfSheet = timelineEvent.info_half_sheet;
                }
                if ((i & 32) != 0) {
                    byteString = timelineEvent.unknownFields();
                }
                InfoHalfSheet infoHalfSheet2 = infoHalfSheet;
                ByteString byteString2 = byteString;
                return timelineEvent.copy(str, str2, state, str3, infoHalfSheet2, byteString2);
            }

            public final TimelineEvent copy(String title, String value, State state, String body, InfoHalfSheet info_half_sheet, ByteString unknownFields) {
                unknownFields.getClass();
                return new TimelineEvent(title, value, state, body, info_half_sheet, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TimelineEvent)) {
                    return false;
                }
                TimelineEvent timelineEvent = (TimelineEvent) other;
                return Intrinsics.areEqual(unknownFields(), timelineEvent.unknownFields()) && Intrinsics.areEqual(this.title, timelineEvent.title) && Intrinsics.areEqual(this.value, timelineEvent.value) && this.state == timelineEvent.state && Intrinsics.areEqual(this.body, timelineEvent.body) && Intrinsics.areEqual(this.info_half_sheet, timelineEvent.info_half_sheet);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.value;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                State state = this.state;
                int hashCode4 = (hashCode3 + (state != null ? state.hashCode() : 0)) * 37;
                String str3 = this.body;
                int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
                InfoHalfSheet infoHalfSheet = this.info_half_sheet;
                int hashCode6 = hashCode5 + (infoHalfSheet != null ? infoHalfSheet.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.value = this.value;
                builder.state = this.state;
                builder.body = this.body;
                builder.info_half_sheet = this.info_half_sheet;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.value;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
                }
                State state = this.state;
                if (state != null) {
                    arrayList.add("state=" + state);
                }
                String str3 = this.body;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body=", arrayList);
                }
                InfoHalfSheet infoHalfSheet = this.info_half_sheet;
                if (infoHalfSheet != null) {
                    arrayList.add("info_half_sheet=" + infoHalfSheet);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TimelineEvent{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NOT_STARTED", "PENDING", "DONE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class State implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ State[] $VALUES;
                public static final ProtoAdapter ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final State DONE;
                public static final State NOT_STARTED;
                public static final State PENDING;
                private final int value;

                private static final /* synthetic */ State[] $values() {
                    return new State[]{NOT_STARTED, PENDING, DONE};
                }

                static {
                    final State state = new State("NOT_STARTED", 0, 0);
                    NOT_STARTED = state;
                    PENDING = new State("PENDING", 1, 1);
                    DONE = new State("DONE", 2, 2);
                    State[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(State.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, state) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State fromValue(int value) {
                            return SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.State.INSTANCE.fromValue(value);
                        }
                    };
                }

                private State(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final State fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static State valueOf(String str) {
                    return (State) Enum.valueOf(State.class, str);
                }

                public static State[] values() {
                    return (State[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$State;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final State fromValue(int value) {
                        if (value == 0) {
                            return State.NOT_STARTED;
                        }
                        if (value == 1) {
                            return State.PENDING;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return State.DONE;
                    }

                    private Companion() {
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$TimelineEvent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ TimelineEvent build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public TimelineEvent() {
                this(null, null, null, null, null, null, 63, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimelineEvent(String str, String str2, State state, String str3, InfoHalfSheet infoHalfSheet, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.value = str2;
                this.state = state;
                this.body = str3;
                this.info_half_sheet = infoHalfSheet;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentsTimelineSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectPaymentPlanBlocker$PaymentsTimelineSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.PaymentsTimelineSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SelectPaymentPlanBlocker.PaymentsTimelineSection((String) obj, (String) obj2, (SelectPaymentPlanBlocker.OptionsHalfSheetConfig) obj3, m, (ListUnordered) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(SelectPaymentPlanBlocker.OptionsHalfSheetConfig.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            m.add(SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.ADAPTER.decode(reader));
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(ListUnordered.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SelectPaymentPlanBlocker.PaymentsTimelineSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    SelectPaymentPlanBlocker.OptionsHalfSheetConfig.ADAPTER.encodeWithTag(writer, 3, value.options_half_sheet_config);
                    SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.timeline_events);
                    ListUnordered.ADAPTER.encodeWithTag(writer, 5, value.footer_list);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectPaymentPlanBlocker.PaymentsTimelineSection value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return ListUnordered.ADAPTER.encodedSizeWithTag(5, value.footer_list) + SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.ADAPTER.asRepeated().encodedSizeWithTag(4, value.timeline_events) + SelectPaymentPlanBlocker.OptionsHalfSheetConfig.ADAPTER.encodedSizeWithTag(3, value.options_half_sheet_config) + protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectPaymentPlanBlocker.PaymentsTimelineSection redact(SelectPaymentPlanBlocker.PaymentsTimelineSection value) {
                    value.getClass();
                    SelectPaymentPlanBlocker.OptionsHalfSheetConfig optionsHalfSheetConfig = value.options_half_sheet_config;
                    SelectPaymentPlanBlocker.OptionsHalfSheetConfig optionsHalfSheetConfig2 = optionsHalfSheetConfig != null ? (SelectPaymentPlanBlocker.OptionsHalfSheetConfig) SelectPaymentPlanBlocker.OptionsHalfSheetConfig.ADAPTER.redact(optionsHalfSheetConfig) : null;
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.timeline_events, SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.ADAPTER);
                    ListUnordered listUnordered = value.footer_list;
                    return SelectPaymentPlanBlocker.PaymentsTimelineSection.copy$default(value, null, null, optionsHalfSheetConfig2, m1169redactElements, listUnordered != null ? (ListUnordered) ListUnordered.ADAPTER.redact(listUnordered) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectPaymentPlanBlocker.PaymentsTimelineSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ListUnordered.ADAPTER.encodeWithTag(writer, 5, value.footer_list);
                    SelectPaymentPlanBlocker.PaymentsTimelineSection.TimelineEvent.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.timeline_events);
                    SelectPaymentPlanBlocker.OptionsHalfSheetConfig.ADAPTER.encodeWithTag(writer, 3, value.options_half_sheet_config);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public PaymentsTimelineSection(String str, String str2, OptionsHalfSheetConfig optionsHalfSheetConfig, List list, ListUnordered listUnordered, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : optionsHalfSheetConfig, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? null : listUnordered, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PaymentsTimelineSection copy$default(PaymentsTimelineSection paymentsTimelineSection, String str, String str2, OptionsHalfSheetConfig optionsHalfSheetConfig, List list, ListUnordered listUnordered, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentsTimelineSection.title;
            }
            if ((i & 2) != 0) {
                str2 = paymentsTimelineSection.description;
            }
            if ((i & 4) != 0) {
                optionsHalfSheetConfig = paymentsTimelineSection.options_half_sheet_config;
            }
            if ((i & 8) != 0) {
                list = paymentsTimelineSection.timeline_events;
            }
            if ((i & 16) != 0) {
                listUnordered = paymentsTimelineSection.footer_list;
            }
            if ((i & 32) != 0) {
                byteString = paymentsTimelineSection.unknownFields();
            }
            ListUnordered listUnordered2 = listUnordered;
            ByteString byteString2 = byteString;
            return paymentsTimelineSection.copy(str, str2, optionsHalfSheetConfig, list, listUnordered2, byteString2);
        }

        public final PaymentsTimelineSection copy(String title, String description, OptionsHalfSheetConfig options_half_sheet_config, List<TimelineEvent> timeline_events, ListUnordered footer_list, ByteString unknownFields) {
            timeline_events.getClass();
            unknownFields.getClass();
            return new PaymentsTimelineSection(title, description, options_half_sheet_config, timeline_events, footer_list, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PaymentsTimelineSection)) {
                return false;
            }
            PaymentsTimelineSection paymentsTimelineSection = (PaymentsTimelineSection) other;
            return Intrinsics.areEqual(unknownFields(), paymentsTimelineSection.unknownFields()) && Intrinsics.areEqual(this.title, paymentsTimelineSection.title) && Intrinsics.areEqual(this.description, paymentsTimelineSection.description) && Intrinsics.areEqual(this.options_half_sheet_config, paymentsTimelineSection.options_half_sheet_config) && Intrinsics.areEqual(this.timeline_events, paymentsTimelineSection.timeline_events) && Intrinsics.areEqual(this.footer_list, paymentsTimelineSection.footer_list);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            OptionsHalfSheetConfig optionsHalfSheetConfig = this.options_half_sheet_config;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (optionsHalfSheetConfig != null ? optionsHalfSheetConfig.hashCode() : 0)) * 37, 37, this.timeline_events);
            ListUnordered listUnordered = this.footer_list;
            int hashCode4 = m + (listUnordered != null ? listUnordered.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.description = this.description;
            builder.options_half_sheet_config = this.options_half_sheet_config;
            builder.timeline_events = this.timeline_events;
            builder.footer_list = this.footer_list;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.description;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
            }
            OptionsHalfSheetConfig optionsHalfSheetConfig = this.options_half_sheet_config;
            if (optionsHalfSheetConfig != null) {
                arrayList.add("options_half_sheet_config=" + optionsHalfSheetConfig);
            }
            if (!this.timeline_events.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("timeline_events=", arrayList, this.timeline_events);
            }
            ListUnordered listUnordered = this.footer_list;
            if (listUnordered != null) {
                arrayList.add("footer_list=" + listUnordered);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentsTimelineSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$PaymentsTimelineSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PaymentsTimelineSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PaymentsTimelineSection() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentsTimelineSection(String str, String str2, OptionsHalfSheetConfig optionsHalfSheetConfig, List<TimelineEvent> list, ListUnordered listUnordered, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = str;
            this.description = str2;
            this.options_half_sheet_config = optionsHalfSheetConfig;
            this.footer_list = listUnordered;
            this.timeline_events = TransactorKt.immutableCopyOf("timeline_events", list);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectPaymentPlanBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SelectPaymentPlanBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
