package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.digitalwallet.DigitalWalletType;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b!\" #$%&'R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006("}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$Builder;", "", "header_text", "Ljava/lang/String;", "submit_button_title", "", "preselected_option_index", "Ljava/lang/Integer;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction;", "preselected_option_action", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction;", "selected_instrument_label", "preselected_secondary_option_index", "", "secondary_option_fields_take_precedence", "Ljava/lang/Boolean;", "list_header_title", "secondary_list_header_title", "list_dismiss_button_text", "use_v2_endpoint", "getUse_v2_endpoint$annotations", "()V", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$SubmissionEndpoint;", "submission_endpoint", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$SubmissionEndpoint;", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption;", "options", "Ljava/util/List;", "secondary_options", "Companion", "Builder", "PreselectedOptionAction", "OptionStyle", "ShowDialogAction", "ShowOptionsAction", "InstrumentOption", "SubmissionEndpoint", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstrumentSelectionBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentSelectionBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 7)
    public final String list_dismiss_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 6)
    public final String list_header_title;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<InstrumentOption> options;

    @WireSealedOneof(schemaIndex = 4)
    public final PreselectedOptionAction preselected_option_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 3, tag = 4)
    public final Integer preselected_option_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 7, tag = 12)
    public final Integer preselected_secondary_option_index;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 15)
    public final String secondary_list_header_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 13)
    public final Boolean secondary_option_fields_take_precedence;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 11)
    public final List<InstrumentOption> secondary_options;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 5)
    public final String selected_instrument_label;

    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$SubmissionEndpoint#ADAPTER", schemaIndex = 13, tag = 14)
    public final SubmissionEndpoint submission_endpoint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String submit_button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 12, tag = 10)
    public final Boolean use_v2_endpoint;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker;", "<init>", "()V", "header_text", "", "submit_button_title", "options", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption;", "preselected_option_index", "", "Ljava/lang/Integer;", "preselected_option_action", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction;", "selected_instrument_label", "secondary_options", "preselected_secondary_option_index", "secondary_option_fields_take_precedence", "", "Ljava/lang/Boolean;", "list_header_title", "secondary_list_header_title", "list_dismiss_button_text", "use_v2_endpoint", "submission_endpoint", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$SubmissionEndpoint;", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String header_text;
        public String list_dismiss_button_text;
        public String list_header_title;
        public List<InstrumentOption> options;
        public PreselectedOptionAction preselected_option_action;
        public Integer preselected_option_index;
        public Integer preselected_secondary_option_index;
        public String secondary_list_header_title;
        public Boolean secondary_option_fields_take_precedence;
        public List<InstrumentOption> secondary_options;
        public String selected_instrument_label;
        public SubmissionEndpoint submission_endpoint;
        public String submit_button_title;
        public Boolean use_v2_endpoint;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.options = emptyList;
            this.secondary_options = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public InstrumentSelectionBlocker build() {
            return new InstrumentSelectionBlocker(this.header_text, this.submit_button_title, this.options, this.preselected_option_index, this.preselected_option_action, this.selected_instrument_label, this.secondary_options, this.preselected_secondary_option_index, this.secondary_option_fields_take_precedence, this.list_header_title, this.secondary_list_header_title, this.list_dismiss_button_text, this.use_v2_endpoint, this.submission_endpoint, buildUnknownFields());
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder list_dismiss_button_text(String list_dismiss_button_text) {
            this.list_dismiss_button_text = list_dismiss_button_text;
            return this;
        }

        public final Builder list_header_title(String list_header_title) {
            this.list_header_title = list_header_title;
            return this;
        }

        public final Builder options(List<InstrumentOption> options) {
            options.getClass();
            TransactorKt.checkElementsNotNull(options);
            this.options = options;
            return this;
        }

        public final Builder preselected_option_action(PreselectedOptionAction preselected_option_action) {
            this.preselected_option_action = preselected_option_action;
            return this;
        }

        public final Builder preselected_option_index(Integer preselected_option_index) {
            this.preselected_option_index = preselected_option_index;
            return this;
        }

        public final Builder preselected_secondary_option_index(Integer preselected_secondary_option_index) {
            this.preselected_secondary_option_index = preselected_secondary_option_index;
            return this;
        }

        public final Builder secondary_list_header_title(String secondary_list_header_title) {
            this.secondary_list_header_title = secondary_list_header_title;
            return this;
        }

        public final Builder secondary_option_fields_take_precedence(Boolean secondary_option_fields_take_precedence) {
            this.secondary_option_fields_take_precedence = secondary_option_fields_take_precedence;
            return this;
        }

        public final Builder secondary_options(List<InstrumentOption> secondary_options) {
            secondary_options.getClass();
            TransactorKt.checkElementsNotNull(secondary_options);
            this.secondary_options = secondary_options;
            return this;
        }

        public final Builder selected_instrument_label(String selected_instrument_label) {
            this.selected_instrument_label = selected_instrument_label;
            return this;
        }

        public final Builder submission_endpoint(SubmissionEndpoint submission_endpoint) {
            this.submission_endpoint = submission_endpoint;
            return this;
        }

        public final Builder submit_button_title(String submit_button_title) {
            this.submit_button_title = submit_button_title;
            return this;
        }

        @Deprecated
        public final Builder use_v2_endpoint(Boolean use_v2_endpoint) {
            this.use_v2_endpoint = use_v2_endpoint;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\r\u001e\u001f !\"#$%&'()*B}\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0082\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u0096\u0080\u0004J\b\u0010\u001c\u001a\u00020\nH\u0016J|\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$Builder;", "avatar", "Lcom/squareup/protos/cash/ui/Image;", "icon_style", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "option_style", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$OptionStyle;", "list_title", "", "list_subtitle_primary", "list_subtitle_suffix", "list_pill_text", "list_accessibility_label", "state", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$OptionStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "IconStyle", "State", "Companion", "NewLinkIcon", "CardIcon", "BankIcon", "AppIcon", "BalanceIcon", "DigitalWalletIcon", "EmojiIcon", "EnabledState", "DisabledState", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InstrumentOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InstrumentOption> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image avatar;

        @WireSealedOneof(schemaIndex = 1)
        public final IconStyle icon_style;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 7, tag = 12)
        public final String list_accessibility_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
        public final String list_pill_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
        public final String list_subtitle_primary;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 6)
        public final String list_subtitle_suffix;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
        public final String list_title;

        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$OptionStyle#ADAPTER", schemaIndex = 2, tag = 3)
        public final OptionStyle option_style;

        @WireSealedOneof(schemaIndex = 8)
        public final State state;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption;", "<init>", "()V", "avatar", "Lcom/squareup/protos/cash/ui/Image;", "icon_style", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "option_style", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$OptionStyle;", "list_title", "", "list_subtitle_primary", "list_subtitle_suffix", "list_pill_text", "list_accessibility_label", "state", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Image avatar;
            public IconStyle icon_style;
            public String list_accessibility_label;
            public String list_pill_text;
            public String list_subtitle_primary;
            public String list_subtitle_suffix;
            public String list_title;
            public OptionStyle option_style;
            public State state;

            public final Builder avatar(Image avatar) {
                this.avatar = avatar;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public InstrumentOption build() {
                return new InstrumentOption(this.avatar, this.icon_style, this.option_style, this.list_title, this.list_subtitle_primary, this.list_subtitle_suffix, this.list_pill_text, this.list_accessibility_label, this.state, buildUnknownFields());
            }

            public final Builder icon_style(IconStyle icon_style) {
                this.icon_style = icon_style;
                return this;
            }

            public final Builder list_accessibility_label(String list_accessibility_label) {
                this.list_accessibility_label = list_accessibility_label;
                return this;
            }

            public final Builder list_pill_text(String list_pill_text) {
                this.list_pill_text = list_pill_text;
                return this;
            }

            public final Builder list_subtitle_primary(String list_subtitle_primary) {
                this.list_subtitle_primary = list_subtitle_primary;
                return this;
            }

            public final Builder list_subtitle_suffix(String list_subtitle_suffix) {
                this.list_subtitle_suffix = list_subtitle_suffix;
                return this;
            }

            public final Builder list_title(String list_title) {
                this.list_title = list_title;
                return this;
            }

            public final Builder option_style(OptionStyle option_style) {
                this.option_style = option_style;
                return this;
            }

            public final Builder state(State state) {
                this.state = state;
                return this;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$Builder;", "encoded_selected_option", "Lokio/ByteString;", "selection_action", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;", "unknownFields", "<init>", "(Lokio/ByteString;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "SelectionAction", "Companion", "SubmitInstrumentAction", "SelectInstrumentAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class EnabledState extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EnabledState> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 0, tag = 1)
            public final ByteString encoded_selected_option;

            @WireSealedOneof(schemaIndex = 1)
            public final SelectionAction selection_action;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;", "<init>", "()V", "encoded_selected_option", "Lokio/ByteString;", "selection_action", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public ByteString encoded_selected_option;
                public SelectionAction selection_action;

                @Override // com.squareup.wire.Message.Builder
                public EnabledState build() {
                    return new EnabledState(this.encoded_selected_option, this.selection_action, buildUnknownFields());
                }

                public final Builder encoded_selected_option(ByteString encoded_selected_option) {
                    this.encoded_selected_option = encoded_selected_option;
                    return this;
                }

                public final Builder selection_action(SelectionAction selection_action) {
                    this.selection_action = selection_action;
                    return this;
                }
            }

            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\u001f !\"#$%&Bu\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\b\u0010\u001d\u001a\u00020\u0007H\u0016Jt\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Builder;", "detail_rows", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow;", "selected_title", "", "selected_subtitle_primary", "selected_subtitle_suffix", "selected_accessibility_label", "instrument_details", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails;", "instrument_header_text", "digital_wallet", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet;Lokio/ByteString;)V", "getDetail_rows$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "InstrumentDetails", "Companion", "DetailRow", "Detail", "DetailList", "InstrumentDetailsDialog", "DigitalWallet", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class SelectInstrumentAction extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<SelectInstrumentAction> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 4)
                public final List<DetailRow> detail_rows;

                @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet#ADAPTER", schemaIndex = 7, tag = 9)
                public final DigitalWallet digital_wallet;

                @WireSealedOneof(schemaIndex = 5)
                public final InstrumentDetails instrument_details;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 8)
                public final String instrument_header_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 7)
                public final String selected_accessibility_label;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 2)
                public final String selected_subtitle_primary;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 3)
                public final String selected_subtitle_suffix;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 1)
                public final String selected_title;

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;", "<init>", "()V", "detail_rows", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow;", "selected_title", "", "selected_subtitle_primary", "selected_subtitle_suffix", "selected_accessibility_label", "instrument_details", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails;", "instrument_header_text", "digital_wallet", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public List<DetailRow> detail_rows = EmptyList.INSTANCE;
                    public DigitalWallet digital_wallet;
                    public InstrumentDetails instrument_details;
                    public String instrument_header_text;
                    public String selected_accessibility_label;
                    public String selected_subtitle_primary;
                    public String selected_subtitle_suffix;
                    public String selected_title;

                    @Override // com.squareup.wire.Message.Builder
                    public SelectInstrumentAction build() {
                        return new SelectInstrumentAction(this.detail_rows, this.selected_title, this.selected_subtitle_primary, this.selected_subtitle_suffix, this.selected_accessibility_label, this.instrument_details, this.instrument_header_text, this.digital_wallet, buildUnknownFields());
                    }

                    @Deprecated
                    public final Builder detail_rows(List<DetailRow> detail_rows) {
                        detail_rows.getClass();
                        TransactorKt.checkElementsNotNull(detail_rows);
                        this.detail_rows = detail_rows;
                        return this;
                    }

                    public final Builder digital_wallet(DigitalWallet digital_wallet) {
                        this.digital_wallet = digital_wallet;
                        return this;
                    }

                    public final Builder instrument_details(InstrumentDetails instrument_details) {
                        this.instrument_details = instrument_details;
                        return this;
                    }

                    public final Builder instrument_header_text(String instrument_header_text) {
                        this.instrument_header_text = instrument_header_text;
                        return this;
                    }

                    public final Builder selected_accessibility_label(String selected_accessibility_label) {
                        this.selected_accessibility_label = selected_accessibility_label;
                        return this;
                    }

                    public final Builder selected_subtitle_primary(String selected_subtitle_primary) {
                        this.selected_subtitle_primary = selected_subtitle_primary;
                        return this;
                    }

                    public final Builder selected_subtitle_suffix(String selected_subtitle_suffix) {
                        this.selected_subtitle_suffix = selected_subtitle_suffix;
                        return this;
                    }

                    public final Builder selected_title(String selected_title) {
                        this.selected_title = selected_title;
                        return this;
                    }
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$Builder;", "detail_rows", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "DetailRow", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DetailList extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<DetailList> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private static final long serialVersionUID = 0;

                    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
                    public final List<DetailRow> detail_rows;

                    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;", "<init>", "()V", "detail_rows", "", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Builder extends Message.Builder {
                        public List<DetailRow> detail_rows = EmptyList.INSTANCE;

                        @Override // com.squareup.wire.Message.Builder
                        public DetailList build() {
                            return new DetailList(this.detail_rows, buildUnknownFields());
                        }

                        public final Builder detail_rows(List<DetailRow> detail_rows) {
                            detail_rows.getClass();
                            TransactorKt.checkElementsNotNull(detail_rows);
                            this.detail_rows = detail_rows;
                            return this;
                        }
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailList.class);
                        final Syntax syntax = Syntax.PROTO_2;
                        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$Companion$ADAPTER$1
                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList decode(ProtoReader reader) {
                                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                                long beginMessage = reader.beginMessage();
                                while (true) {
                                    int nextTag = reader.nextTag();
                                    if (nextTag == -1) {
                                        return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList(m, reader.endMessageAndGetUnknownFields(beginMessage));
                                    }
                                    if (nextTag == 1) {
                                        m.add(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow.ADAPTER.decode(reader));
                                    } else {
                                        reader.readUnknownField(nextTag);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList value) {
                                writer.getClass();
                                value.getClass();
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.detail_rows);
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList value) {
                                value.getClass();
                                return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.detail_rows) + value.unknownFields().getSize$okio();
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList value) {
                                value.getClass();
                                return value.copy(TransactorKt.m1169redactElements(value.detail_rows, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow.ADAPTER), ByteString.EMPTY);
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList value) {
                                writer.getClass();
                                value.getClass();
                                writer.writeBytes(value.unknownFields());
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.detail_rows);
                            }
                        };
                        ADAPTER = protoAdapter;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public DetailList(List<DetailRow> list, ByteString byteString) {
                        super(ADAPTER, byteString);
                        list.getClass();
                        byteString.getClass();
                        this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ DetailList copy$default(DetailList detailList, List list, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = detailList.detail_rows;
                        }
                        if ((i & 2) != 0) {
                            byteString = detailList.unknownFields();
                        }
                        return detailList.copy(list, byteString);
                    }

                    public final DetailList copy(List<DetailRow> detail_rows, ByteString unknownFields) {
                        detail_rows.getClass();
                        unknownFields.getClass();
                        return new DetailList(detail_rows, unknownFields);
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof DetailList)) {
                            return false;
                        }
                        DetailList detailList = (DetailList) other;
                        return Intrinsics.areEqual(unknownFields(), detailList.unknownFields()) && Intrinsics.areEqual(this.detail_rows, detailList.detail_rows);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = this.detail_rows.hashCode() + (unknownFields().hashCode() * 37);
                        this.hashCode = hashCode;
                        return hashCode;
                    }

                    @Override // com.squareup.wire.Message
                    public Builder newBuilder() {
                        Builder builder = new Builder();
                        builder.detail_rows = this.detail_rows;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        if (!this.detail_rows.isEmpty()) {
                            re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, this.detail_rows);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailList{", "}", 0, null, null, 56);
                    }

                    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow$Builder;", AnnotatedPrivateKey.LABEL, "", "value", "dialog", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class DetailRow extends AndroidMessage {
                        public static final ProtoAdapter ADAPTER;
                        public static final Parcelable.Creator<DetailRow> CREATOR;

                        /* renamed from: Companion, reason: from kotlin metadata */
                        public static final Companion INSTANCE = new Companion(null);
                        private static final long serialVersionUID = 0;

                        @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog#ADAPTER", schemaIndex = 2, tag = 3)
                        public final InstrumentDetailsDialog dialog;

                        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                        public final String label;

                        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                        public final String value;

                        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "value", "dialog", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                        public static final class Builder extends Message.Builder {
                            public InstrumentDetailsDialog dialog;
                            public String label;
                            public String value;

                            @Override // com.squareup.wire.Message.Builder
                            public DetailRow build() {
                                return new DetailRow(this.label, this.value, this.dialog, buildUnknownFields());
                            }

                            public final Builder dialog(InstrumentDetailsDialog dialog) {
                                this.dialog = dialog;
                                return this;
                            }

                            public final Builder label(String label) {
                                this.label = label;
                                return this;
                            }

                            public final Builder value(String value) {
                                this.value = value;
                                return this;
                            }
                        }

                        static {
                            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRow.class);
                            final Syntax syntax = Syntax.PROTO_2;
                            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow$Companion$ADAPTER$1
                                @Override // com.squareup.wire.ProtoAdapter
                                public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow decode(ProtoReader reader) {
                                    reader.getClass();
                                    long beginMessage = reader.beginMessage();
                                    Object obj = null;
                                    Object obj2 = null;
                                    Object obj3 = null;
                                    while (true) {
                                        int nextTag = reader.nextTag();
                                        if (nextTag == -1) {
                                            return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow((String) obj, (String) obj2, (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                                        }
                                        if (nextTag == 1) {
                                            obj = ProtoAdapter.STRING.decode(reader);
                                        } else if (nextTag == 2) {
                                            obj2 = ProtoAdapter.STRING.decode(reader);
                                        } else if (nextTag != 3) {
                                            reader.readUnknownField(nextTag);
                                        } else {
                                            obj3 = TransactorKt.decodeMessageOrMerge(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER, reader, obj3);
                                        }
                                    }
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow value) {
                                    writer.getClass();
                                    value.getClass();
                                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.encodeWithTag(writer, 3, value.dialog);
                                    writer.writeBytes(value.unknownFields());
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow value) {
                                    value.getClass();
                                    int size$okio = value.unknownFields().getSize$okio();
                                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                    return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.encodedSizeWithTag(3, value.dialog) + protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow value) {
                                    value.getClass();
                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog instrumentDetailsDialog = value.dialog;
                                    return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow.copy$default(value, null, null, instrumentDetailsDialog != null ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog) InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.redact(instrumentDetailsDialog) : null, ByteString.EMPTY, 3, null);
                                }

                                @Override // com.squareup.wire.ProtoAdapter
                                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.DetailRow value) {
                                    writer.getClass();
                                    value.getClass();
                                    writer.writeBytes(value.unknownFields());
                                    InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.encodeWithTag(writer, 3, value.dialog);
                                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                    protoAdapter2.encodeWithTag(writer, 2, value.value);
                                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                                }
                            };
                            ADAPTER = protoAdapter;
                            AndroidMessage.Companion.getClass();
                            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                        }

                        public /* synthetic */ DetailRow(String str, String str2, InstrumentDetailsDialog instrumentDetailsDialog, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : instrumentDetailsDialog, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                        }

                        public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, String str, String str2, InstrumentDetailsDialog instrumentDetailsDialog, ByteString byteString, int i, Object obj) {
                            if ((i & 1) != 0) {
                                str = detailRow.label;
                            }
                            if ((i & 2) != 0) {
                                str2 = detailRow.value;
                            }
                            if ((i & 4) != 0) {
                                instrumentDetailsDialog = detailRow.dialog;
                            }
                            if ((i & 8) != 0) {
                                byteString = detailRow.unknownFields();
                            }
                            return detailRow.copy(str, str2, instrumentDetailsDialog, byteString);
                        }

                        public final DetailRow copy(String label, String value, InstrumentDetailsDialog dialog, ByteString unknownFields) {
                            unknownFields.getClass();
                            return new DetailRow(label, value, dialog, unknownFields);
                        }

                        public boolean equals(Object other) {
                            if (other == this) {
                                return true;
                            }
                            if (!(other instanceof DetailRow)) {
                                return false;
                            }
                            DetailRow detailRow = (DetailRow) other;
                            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.label, detailRow.label) && Intrinsics.areEqual(this.value, detailRow.value) && Intrinsics.areEqual(this.dialog, detailRow.dialog);
                        }

                        public int hashCode() {
                            int i = this.hashCode;
                            if (i != 0) {
                                return i;
                            }
                            int hashCode = unknownFields().hashCode() * 37;
                            String str = this.label;
                            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                            String str2 = this.value;
                            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                            InstrumentDetailsDialog instrumentDetailsDialog = this.dialog;
                            int hashCode4 = hashCode3 + (instrumentDetailsDialog != null ? instrumentDetailsDialog.hashCode() : 0);
                            this.hashCode = hashCode4;
                            return hashCode4;
                        }

                        @Override // com.squareup.wire.Message
                        public Builder newBuilder() {
                            Builder builder = new Builder();
                            builder.label = this.label;
                            builder.value = this.value;
                            builder.dialog = this.dialog;
                            builder.addUnknownFields(unknownFields());
                            return builder;
                        }

                        public String toString() {
                            ArrayList arrayList = new ArrayList();
                            String str = this.label;
                            if (str != null) {
                                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                            }
                            String str2 = this.value;
                            if (str2 != null) {
                                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
                            }
                            InstrumentDetailsDialog instrumentDetailsDialog = this.dialog;
                            if (instrumentDetailsDialog != null) {
                                arrayList.add("dialog=" + instrumentDetailsDialog);
                            }
                            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
                        }

                        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$DetailRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                        public static final class Companion {
                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                this();
                            }

                            public final /* synthetic */ DetailRow build(Function1<? super Builder, Unit> body) {
                                body.getClass();
                                Builder builder = new Builder();
                                body.invoke(builder);
                                return builder.build();
                            }

                            private Companion() {
                            }
                        }

                        public DetailRow() {
                            this(null, null, null, null, 15, null);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public DetailRow(String str, String str2, InstrumentDetailsDialog instrumentDetailsDialog, ByteString byteString) {
                            super(ADAPTER, byteString);
                            byteString.getClass();
                            this.label = str;
                            this.value = str2;
                            this.dialog = instrumentDetailsDialog;
                        }
                    }

                    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final /* synthetic */ DetailList build(Function1<? super Builder, Unit> body) {
                            body.getClass();
                            Builder builder = new Builder();
                            body.invoke(builder);
                            return builder.build();
                        }

                        private Companion() {
                        }
                    }

                    public DetailList(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                    }

                    public DetailList() {
                        this(null, null, 3, null);
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectInstrumentAction.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction decode(ProtoReader reader) {
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails detail;
                            ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            Object obj2 = null;
                            Object obj3 = null;
                            Object obj4 = null;
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails = null;
                            Object obj5 = null;
                            Object obj6 = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction(m, (String) obj, (String) obj2, (String) obj3, (String) obj4, instrumentDetails, (String) obj5, (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                switch (nextTag) {
                                    case 1:
                                        obj = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 2:
                                        obj2 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 3:
                                        obj3 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 4:
                                        m.add(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow.ADAPTER.decode(reader));
                                        continue;
                                    case 5:
                                        detail = new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail) InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail.ADAPTER.decode(reader));
                                        break;
                                    case 6:
                                        detail = new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList) InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.ADAPTER.decode(reader));
                                        break;
                                    case 7:
                                        obj4 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 8:
                                        obj5 = ProtoAdapter.STRING.decode(reader);
                                        continue;
                                    case 9:
                                        try {
                                            obj6 = InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet.ADAPTER.decode(reader);
                                            continue;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                            break;
                                        }
                                    default:
                                        reader.readUnknownField(nextTag);
                                        continue;
                                }
                                instrumentDetails = detail;
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction value) {
                            writer.getClass();
                            value.getClass();
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.detail_rows);
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.selected_title);
                            protoAdapter2.encodeWithTag(writer, 2, value.selected_subtitle_primary);
                            protoAdapter2.encodeWithTag(writer, 3, value.selected_subtitle_suffix);
                            protoAdapter2.encodeWithTag(writer, 7, value.selected_accessibility_label);
                            protoAdapter2.encodeWithTag(writer, 8, value.instrument_header_text);
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet.ADAPTER.encodeWithTag(writer, 9, value.digital_wallet);
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails = value.instrument_details;
                            if (instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) {
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) instrumentDetails).getValue());
                            } else if (instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) {
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.ADAPTER.encodeWithTag(writer, 6, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) instrumentDetails).getValue());
                            } else if (instrumentDetails != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction value) {
                            int encodedSizeWithTag;
                            value.getClass();
                            int encodedSizeWithTag2 = InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(4, value.detail_rows) + value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(7, value.selected_accessibility_label) + protoAdapter2.encodedSizeWithTag(3, value.selected_subtitle_suffix) + protoAdapter2.encodedSizeWithTag(2, value.selected_subtitle_primary) + protoAdapter2.encodedSizeWithTag(1, value.selected_title) + encodedSizeWithTag2;
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails = value.instrument_details;
                            if (instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) {
                                encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail.ADAPTER.encodedSizeWithTag(5, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) instrumentDetails).getValue());
                            } else {
                                if (!(instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList)) {
                                    if (instrumentDetails != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return 0;
                                    }
                                    return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet.ADAPTER.encodedSizeWithTag(9, value.digital_wallet) + protoAdapter2.encodedSizeWithTag(8, value.instrument_header_text) + encodedSizeWithTag3;
                                }
                                encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.ADAPTER.encodedSizeWithTag(6, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) instrumentDetails).getValue());
                            }
                            encodedSizeWithTag3 += encodedSizeWithTag;
                            return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet.ADAPTER.encodedSizeWithTag(9, value.digital_wallet) + protoAdapter2.encodedSizeWithTag(8, value.instrument_header_text) + encodedSizeWithTag3;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction value) {
                            value.getClass();
                            return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.copy$default(value, TransactorKt.m1169redactElements(value.detail_rows, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow.ADAPTER), null, null, null, null, null, null, null, ByteString.EMPTY, 224, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails instrumentDetails = value.instrument_details;
                            if (instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) {
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.Detail) instrumentDetails).getValue());
                            } else if (instrumentDetails instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) {
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailList.ADAPTER.encodeWithTag(writer, 6, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetails.DetailList) instrumentDetails).getValue());
                            } else if (instrumentDetails != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet.ADAPTER.encodeWithTag(writer, 9, value.digital_wallet);
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 8, value.instrument_header_text);
                            protoAdapter2.encodeWithTag(writer, 7, value.selected_accessibility_label);
                            protoAdapter2.encodeWithTag(writer, 3, value.selected_subtitle_suffix);
                            protoAdapter2.encodeWithTag(writer, 2, value.selected_subtitle_primary);
                            protoAdapter2.encodeWithTag(writer, 1, value.selected_title);
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.detail_rows);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public SelectInstrumentAction(List list, String str, String str2, String str3, String str4, InstrumentDetails instrumentDetails, String str5, DigitalWallet digitalWallet, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : instrumentDetails, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : digitalWallet, (i & 256) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ SelectInstrumentAction copy$default(SelectInstrumentAction selectInstrumentAction, List list, String str, String str2, String str3, String str4, InstrumentDetails instrumentDetails, String str5, DigitalWallet digitalWallet, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        list = selectInstrumentAction.detail_rows;
                    }
                    if ((i & 2) != 0) {
                        str = selectInstrumentAction.selected_title;
                    }
                    if ((i & 4) != 0) {
                        str2 = selectInstrumentAction.selected_subtitle_primary;
                    }
                    if ((i & 8) != 0) {
                        str3 = selectInstrumentAction.selected_subtitle_suffix;
                    }
                    if ((i & 16) != 0) {
                        str4 = selectInstrumentAction.selected_accessibility_label;
                    }
                    if ((i & 32) != 0) {
                        instrumentDetails = selectInstrumentAction.instrument_details;
                    }
                    if ((i & 64) != 0) {
                        str5 = selectInstrumentAction.instrument_header_text;
                    }
                    if ((i & 128) != 0) {
                        digitalWallet = selectInstrumentAction.digital_wallet;
                    }
                    if ((i & 256) != 0) {
                        byteString = selectInstrumentAction.unknownFields();
                    }
                    DigitalWallet digitalWallet2 = digitalWallet;
                    ByteString byteString2 = byteString;
                    InstrumentDetails instrumentDetails2 = instrumentDetails;
                    String str6 = str5;
                    String str7 = str4;
                    String str8 = str2;
                    return selectInstrumentAction.copy(list, str, str8, str3, str7, instrumentDetails2, str6, digitalWallet2, byteString2);
                }

                @Deprecated
                public static /* synthetic */ void getDetail_rows$annotations() {
                }

                public final SelectInstrumentAction copy(List<DetailRow> detail_rows, String selected_title, String selected_subtitle_primary, String selected_subtitle_suffix, String selected_accessibility_label, InstrumentDetails instrument_details, String instrument_header_text, DigitalWallet digital_wallet, ByteString unknownFields) {
                    detail_rows.getClass();
                    unknownFields.getClass();
                    return new SelectInstrumentAction(detail_rows, selected_title, selected_subtitle_primary, selected_subtitle_suffix, selected_accessibility_label, instrument_details, instrument_header_text, digital_wallet, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof SelectInstrumentAction)) {
                        return false;
                    }
                    SelectInstrumentAction selectInstrumentAction = (SelectInstrumentAction) other;
                    return Intrinsics.areEqual(unknownFields(), selectInstrumentAction.unknownFields()) && Intrinsics.areEqual(this.detail_rows, selectInstrumentAction.detail_rows) && Intrinsics.areEqual(this.selected_title, selectInstrumentAction.selected_title) && Intrinsics.areEqual(this.selected_subtitle_primary, selectInstrumentAction.selected_subtitle_primary) && Intrinsics.areEqual(this.selected_subtitle_suffix, selectInstrumentAction.selected_subtitle_suffix) && Intrinsics.areEqual(this.selected_accessibility_label, selectInstrumentAction.selected_accessibility_label) && Intrinsics.areEqual(this.instrument_details, selectInstrumentAction.instrument_details) && Intrinsics.areEqual(this.instrument_header_text, selectInstrumentAction.instrument_header_text) && this.digital_wallet == selectInstrumentAction.digital_wallet;
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.detail_rows);
                    String str = this.selected_title;
                    int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.selected_subtitle_primary;
                    int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.selected_subtitle_suffix;
                    int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
                    String str4 = this.selected_accessibility_label;
                    int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
                    InstrumentDetails instrumentDetails = this.instrument_details;
                    int hashCode5 = (hashCode4 + (instrumentDetails != null ? instrumentDetails.hashCode() : 0)) * 37;
                    String str5 = this.instrument_header_text;
                    int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
                    DigitalWallet digitalWallet = this.digital_wallet;
                    int hashCode7 = hashCode6 + (digitalWallet != null ? digitalWallet.hashCode() : 0);
                    this.hashCode = hashCode7;
                    return hashCode7;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.detail_rows = this.detail_rows;
                    builder.selected_title = this.selected_title;
                    builder.selected_subtitle_primary = this.selected_subtitle_primary;
                    builder.selected_subtitle_suffix = this.selected_subtitle_suffix;
                    builder.selected_accessibility_label = this.selected_accessibility_label;
                    builder.instrument_details = this.instrument_details;
                    builder.instrument_header_text = this.instrument_header_text;
                    builder.digital_wallet = this.digital_wallet;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    if (!this.detail_rows.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, this.detail_rows);
                    }
                    if (this.selected_title != null) {
                        arrayList.add("selected_title=██");
                    }
                    if (this.selected_subtitle_primary != null) {
                        arrayList.add("selected_subtitle_primary=██");
                    }
                    if (this.selected_subtitle_suffix != null) {
                        arrayList.add("selected_subtitle_suffix=██");
                    }
                    if (this.selected_accessibility_label != null) {
                        arrayList.add("selected_accessibility_label=██");
                    }
                    InstrumentDetails instrumentDetails = this.instrument_details;
                    if (instrumentDetails != null) {
                        arrayList.add("instrument_details=" + instrumentDetails);
                    }
                    String str = this.instrument_header_text;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_header_text=", arrayList);
                    }
                    DigitalWallet digitalWallet = this.digital_wallet;
                    if (digitalWallet != null) {
                        arrayList.add("digital_wallet=" + digitalWallet);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "SelectInstrumentAction{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail$Builder;", "text", "", "dialog", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Detail extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Detail> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private static final long serialVersionUID = 0;

                    @WireField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog#ADAPTER", schemaIndex = 1, tag = 2)
                    public final InstrumentDetailsDialog dialog;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                    public final String text;

                    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;", "<init>", "()V", "text", "", "dialog", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Builder extends Message.Builder {
                        public InstrumentDetailsDialog dialog;
                        public String text;

                        @Override // com.squareup.wire.Message.Builder
                        public Detail build() {
                            return new Detail(this.text, this.dialog, buildUnknownFields());
                        }

                        public final Builder dialog(InstrumentDetailsDialog dialog) {
                            this.dialog = dialog;
                            return this;
                        }

                        public final Builder text(String text) {
                            this.text = text;
                            return this;
                        }
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Detail.class);
                        final Syntax syntax = Syntax.PROTO_2;
                        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail$Companion$ADAPTER$1
                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail decode(ProtoReader reader) {
                                reader.getClass();
                                long beginMessage = reader.beginMessage();
                                Object obj = null;
                                Object obj2 = null;
                                while (true) {
                                    int nextTag = reader.nextTag();
                                    if (nextTag == -1) {
                                        return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail((String) obj, (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                                    }
                                    if (nextTag == 1) {
                                        obj = ProtoAdapter.STRING.decode(reader);
                                    } else if (nextTag != 2) {
                                        reader.readUnknownField(nextTag);
                                    } else {
                                        obj2 = TransactorKt.decodeMessageOrMerge(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER, reader, obj2);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail value) {
                                writer.getClass();
                                value.getClass();
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.encodeWithTag(writer, 2, value.dialog);
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail value) {
                                value.getClass();
                                return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.encodedSizeWithTag(2, value.dialog) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail value) {
                                value.getClass();
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog instrumentDetailsDialog = value.dialog;
                                return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail.copy$default(value, null, instrumentDetailsDialog != null ? (InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog) InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.redact(instrumentDetailsDialog) : null, ByteString.EMPTY, 1, null);
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.Detail value) {
                                writer.getClass();
                                value.getClass();
                                writer.writeBytes(value.unknownFields());
                                InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.ADAPTER.encodeWithTag(writer, 2, value.dialog);
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                            }
                        };
                        ADAPTER = protoAdapter;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                    }

                    public /* synthetic */ Detail(String str, InstrumentDetailsDialog instrumentDetailsDialog, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : instrumentDetailsDialog, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                    }

                    public static /* synthetic */ Detail copy$default(Detail detail, String str, InstrumentDetailsDialog instrumentDetailsDialog, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = detail.text;
                        }
                        if ((i & 2) != 0) {
                            instrumentDetailsDialog = detail.dialog;
                        }
                        if ((i & 4) != 0) {
                            byteString = detail.unknownFields();
                        }
                        return detail.copy(str, instrumentDetailsDialog, byteString);
                    }

                    public final Detail copy(String text, InstrumentDetailsDialog dialog, ByteString unknownFields) {
                        unknownFields.getClass();
                        return new Detail(text, dialog, unknownFields);
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof Detail)) {
                            return false;
                        }
                        Detail detail = (Detail) other;
                        return Intrinsics.areEqual(unknownFields(), detail.unknownFields()) && Intrinsics.areEqual(this.text, detail.text) && Intrinsics.areEqual(this.dialog, detail.dialog);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.text;
                        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                        InstrumentDetailsDialog instrumentDetailsDialog = this.dialog;
                        int hashCode3 = hashCode2 + (instrumentDetailsDialog != null ? instrumentDetailsDialog.hashCode() : 0);
                        this.hashCode = hashCode3;
                        return hashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public Builder newBuilder() {
                        Builder builder = new Builder();
                        builder.text = this.text;
                        builder.dialog = this.dialog;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.text;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                        }
                        InstrumentDetailsDialog instrumentDetailsDialog = this.dialog;
                        if (instrumentDetailsDialog != null) {
                            arrayList.add("dialog=" + instrumentDetailsDialog);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Detail{", "}", 0, null, null, 56);
                    }

                    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final /* synthetic */ Detail build(Function1<? super Builder, Unit> body) {
                            body.getClass();
                            Builder builder = new Builder();
                            body.invoke(builder);
                            return builder.build();
                        }

                        private Companion() {
                        }
                    }

                    public Detail() {
                        this(null, null, null, 7, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Detail(String str, InstrumentDetailsDialog instrumentDetailsDialog, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.text = str;
                        this.dialog = instrumentDetailsDialog;
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016J@\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow$Builder;", "title", "", "detail_text", "info_dialog_text", "info_dialog_dismiss_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle$annotations", "()V", "getDetail_text$annotations", "getInfo_dialog_text$annotations", "getInfo_dialog_dismiss_button_text$annotations", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DetailRow extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<DetailRow> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private static final long serialVersionUID = 0;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                    public final String detail_text;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
                    public final String info_dialog_dismiss_button_text;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
                    public final String info_dialog_text;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                    public final String title;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow;", "<init>", "()V", "title", "", "detail_text", "info_dialog_text", "info_dialog_dismiss_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Builder extends Message.Builder {
                        public String detail_text;
                        public String info_dialog_dismiss_button_text;
                        public String info_dialog_text;
                        public String title;

                        @Override // com.squareup.wire.Message.Builder
                        public DetailRow build() {
                            return new DetailRow(this.title, this.detail_text, this.info_dialog_text, this.info_dialog_dismiss_button_text, buildUnknownFields());
                        }

                        @Deprecated
                        public final Builder detail_text(String detail_text) {
                            this.detail_text = detail_text;
                            return this;
                        }

                        @Deprecated
                        public final Builder info_dialog_dismiss_button_text(String info_dialog_dismiss_button_text) {
                            this.info_dialog_dismiss_button_text = info_dialog_dismiss_button_text;
                            return this;
                        }

                        @Deprecated
                        public final Builder info_dialog_text(String info_dialog_text) {
                            this.info_dialog_text = info_dialog_text;
                            return this;
                        }

                        @Deprecated
                        public final Builder title(String title) {
                            this.title = title;
                            return this;
                        }
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRow.class);
                        final Syntax syntax = Syntax.PROTO_2;
                        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow$Companion$ADAPTER$1
                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow decode(ProtoReader reader) {
                                reader.getClass();
                                long beginMessage = reader.beginMessage();
                                Object obj = null;
                                Object obj2 = null;
                                Object obj3 = null;
                                Object obj4 = null;
                                while (true) {
                                    int nextTag = reader.nextTag();
                                    if (nextTag == -1) {
                                        return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow value) {
                                writer.getClass();
                                value.getClass();
                                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                protoAdapter2.encodeWithTag(writer, 1, value.title);
                                protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                                protoAdapter2.encodeWithTag(writer, 3, value.info_dialog_text);
                                protoAdapter2.encodeWithTag(writer, 4, value.info_dialog_dismiss_button_text);
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow value) {
                                value.getClass();
                                int size$okio = value.unknownFields().getSize$okio();
                                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                return protoAdapter2.encodedSizeWithTag(4, value.info_dialog_dismiss_button_text) + protoAdapter2.encodedSizeWithTag(3, value.info_dialog_text) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow value) {
                                value.getClass();
                                return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DetailRow value) {
                                writer.getClass();
                                value.getClass();
                                writer.writeBytes(value.unknownFields());
                                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                protoAdapter2.encodeWithTag(writer, 4, value.info_dialog_dismiss_button_text);
                                protoAdapter2.encodeWithTag(writer, 3, value.info_dialog_text);
                                protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                                protoAdapter2.encodeWithTag(writer, 1, value.title);
                            }
                        };
                        ADAPTER = protoAdapter;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                    }

                    public /* synthetic */ DetailRow(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
                    }

                    public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = detailRow.title;
                        }
                        if ((i & 2) != 0) {
                            str2 = detailRow.detail_text;
                        }
                        if ((i & 4) != 0) {
                            str3 = detailRow.info_dialog_text;
                        }
                        if ((i & 8) != 0) {
                            str4 = detailRow.info_dialog_dismiss_button_text;
                        }
                        if ((i & 16) != 0) {
                            byteString = detailRow.unknownFields();
                        }
                        ByteString byteString2 = byteString;
                        String str5 = str3;
                        return detailRow.copy(str, str2, str5, str4, byteString2);
                    }

                    @Deprecated
                    public static /* synthetic */ void getDetail_text$annotations() {
                    }

                    @Deprecated
                    public static /* synthetic */ void getInfo_dialog_dismiss_button_text$annotations() {
                    }

                    @Deprecated
                    public static /* synthetic */ void getInfo_dialog_text$annotations() {
                    }

                    @Deprecated
                    public static /* synthetic */ void getTitle$annotations() {
                    }

                    public final DetailRow copy(String title, String detail_text, String info_dialog_text, String info_dialog_dismiss_button_text, ByteString unknownFields) {
                        unknownFields.getClass();
                        return new DetailRow(title, detail_text, info_dialog_text, info_dialog_dismiss_button_text, unknownFields);
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof DetailRow)) {
                            return false;
                        }
                        DetailRow detailRow = (DetailRow) other;
                        return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.detail_text, detailRow.detail_text) && Intrinsics.areEqual(this.info_dialog_text, detailRow.info_dialog_text) && Intrinsics.areEqual(this.info_dialog_dismiss_button_text, detailRow.info_dialog_dismiss_button_text);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.title;
                        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                        String str2 = this.detail_text;
                        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                        String str3 = this.info_dialog_text;
                        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                        String str4 = this.info_dialog_dismiss_button_text;
                        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                        this.hashCode = hashCode5;
                        return hashCode5;
                    }

                    @Override // com.squareup.wire.Message
                    public Builder newBuilder() {
                        Builder builder = new Builder();
                        builder.title = this.title;
                        builder.detail_text = this.detail_text;
                        builder.info_dialog_text = this.info_dialog_text;
                        builder.info_dialog_dismiss_button_text = this.info_dialog_dismiss_button_text;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.title;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                        }
                        String str2 = this.detail_text;
                        if (str2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
                        }
                        String str3 = this.info_dialog_text;
                        if (str3 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "info_dialog_text=", arrayList);
                        }
                        String str4 = this.info_dialog_dismiss_button_text;
                        if (str4 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "info_dialog_dismiss_button_text=", arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
                    }

                    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final /* synthetic */ DetailRow build(Function1<? super Builder, Unit> body) {
                            body.getClass();
                            Builder builder = new Builder();
                            body.invoke(builder);
                            return builder.build();
                        }

                        private Companion() {
                        }
                    }

                    public DetailRow() {
                        this(null, null, null, null, null, 31, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public DetailRow(String str, String str2, String str3, String str4, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.title = str;
                        this.detail_text = str2;
                        this.info_dialog_text = str3;
                        this.info_dialog_dismiss_button_text = str4;
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APPLE_PAY", "GOOGLE_PAY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class DigitalWallet implements WireEnum {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ DigitalWallet[] $VALUES;
                    public static final ProtoAdapter ADAPTER;
                    public static final DigitalWallet APPLE_PAY;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE;
                    public static final DigitalWallet GOOGLE_PAY;
                    private final int value;

                    private static final /* synthetic */ DigitalWallet[] $values() {
                        return new DigitalWallet[]{APPLE_PAY, GOOGLE_PAY};
                    }

                    static {
                        final DigitalWallet digitalWallet = new DigitalWallet("APPLE_PAY", 0, 0);
                        APPLE_PAY = digitalWallet;
                        GOOGLE_PAY = new DigitalWallet("GOOGLE_PAY", 1, 1);
                        DigitalWallet[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = Tags.enumEntries($values);
                        INSTANCE = new Companion(null);
                        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DigitalWallet.class);
                        final Syntax syntax = Syntax.PROTO_2;
                        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, digitalWallet) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet$Companion$ADAPTER$1
                            @Override // com.squareup.wire.EnumAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet fromValue(int value) {
                                return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.DigitalWallet.INSTANCE.fromValue(value);
                            }
                        };
                    }

                    private DigitalWallet(String str, int i, int i2) {
                        this.value = i2;
                    }

                    public static final DigitalWallet fromValue(int i) {
                        return INSTANCE.fromValue(i);
                    }

                    public static EnumEntries getEntries() {
                        return $ENTRIES;
                    }

                    public static DigitalWallet valueOf(String str) {
                        return (DigitalWallet) Enum.valueOf(DigitalWallet.class, str);
                    }

                    public static DigitalWallet[] values() {
                        return (DigitalWallet[]) $VALUES.clone();
                    }

                    @Override // com.squareup.wire.WireEnum
                    public int getValue() {
                        return this.value;
                    }

                    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DigitalWallet;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final DigitalWallet fromValue(int value) {
                            if (value == 0) {
                                return DigitalWallet.APPLE_PAY;
                            }
                            if (value != 1) {
                                return null;
                            }
                            return DigitalWallet.GOOGLE_PAY;
                        }

                        private Companion() {
                        }
                    }
                }

                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog$Builder;", "info_dialog_text", "", "info_dialog_dismiss_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class InstrumentDetailsDialog extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<InstrumentDetailsDialog> CREATOR;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    private static final long serialVersionUID = 0;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                    public final String info_dialog_dismiss_button_text;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                    public final String info_dialog_text;

                    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "<init>", "()V", "info_dialog_text", "", "info_dialog_dismiss_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Builder extends Message.Builder {
                        public String info_dialog_dismiss_button_text;
                        public String info_dialog_text;

                        @Override // com.squareup.wire.Message.Builder
                        public InstrumentDetailsDialog build() {
                            return new InstrumentDetailsDialog(this.info_dialog_text, this.info_dialog_dismiss_button_text, buildUnknownFields());
                        }

                        public final Builder info_dialog_dismiss_button_text(String info_dialog_dismiss_button_text) {
                            this.info_dialog_dismiss_button_text = info_dialog_dismiss_button_text;
                            return this;
                        }

                        public final Builder info_dialog_text(String info_dialog_text) {
                            this.info_dialog_text = info_dialog_text;
                            return this;
                        }
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentDetailsDialog.class);
                        final Syntax syntax = Syntax.PROTO_2;
                        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog$Companion$ADAPTER$1
                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog decode(ProtoReader reader) {
                                reader.getClass();
                                long beginMessage = reader.beginMessage();
                                Object obj = null;
                                Object obj2 = null;
                                while (true) {
                                    int nextTag = reader.nextTag();
                                    if (nextTag == -1) {
                                        return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog value) {
                                writer.getClass();
                                value.getClass();
                                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                protoAdapter2.encodeWithTag(writer, 1, value.info_dialog_text);
                                protoAdapter2.encodeWithTag(writer, 2, value.info_dialog_dismiss_button_text);
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog value) {
                                value.getClass();
                                int size$okio = value.unknownFields().getSize$okio();
                                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                return protoAdapter2.encodedSizeWithTag(2, value.info_dialog_dismiss_button_text) + protoAdapter2.encodedSizeWithTag(1, value.info_dialog_text) + size$okio;
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog value) {
                                value.getClass();
                                return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.InstrumentDetailsDialog value) {
                                writer.getClass();
                                value.getClass();
                                writer.writeBytes(value.unknownFields());
                                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                                protoAdapter2.encodeWithTag(writer, 2, value.info_dialog_dismiss_button_text);
                                protoAdapter2.encodeWithTag(writer, 1, value.info_dialog_text);
                            }
                        };
                        ADAPTER = protoAdapter;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                    }

                    public /* synthetic */ InstrumentDetailsDialog(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                    }

                    public static /* synthetic */ InstrumentDetailsDialog copy$default(InstrumentDetailsDialog instrumentDetailsDialog, String str, String str2, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = instrumentDetailsDialog.info_dialog_text;
                        }
                        if ((i & 2) != 0) {
                            str2 = instrumentDetailsDialog.info_dialog_dismiss_button_text;
                        }
                        if ((i & 4) != 0) {
                            byteString = instrumentDetailsDialog.unknownFields();
                        }
                        return instrumentDetailsDialog.copy(str, str2, byteString);
                    }

                    public final InstrumentDetailsDialog copy(String info_dialog_text, String info_dialog_dismiss_button_text, ByteString unknownFields) {
                        unknownFields.getClass();
                        return new InstrumentDetailsDialog(info_dialog_text, info_dialog_dismiss_button_text, unknownFields);
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof InstrumentDetailsDialog)) {
                            return false;
                        }
                        InstrumentDetailsDialog instrumentDetailsDialog = (InstrumentDetailsDialog) other;
                        return Intrinsics.areEqual(unknownFields(), instrumentDetailsDialog.unknownFields()) && Intrinsics.areEqual(this.info_dialog_text, instrumentDetailsDialog.info_dialog_text) && Intrinsics.areEqual(this.info_dialog_dismiss_button_text, instrumentDetailsDialog.info_dialog_dismiss_button_text);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.info_dialog_text;
                        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                        String str2 = this.info_dialog_dismiss_button_text;
                        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                        this.hashCode = hashCode3;
                        return hashCode3;
                    }

                    @Override // com.squareup.wire.Message
                    public Builder newBuilder() {
                        Builder builder = new Builder();
                        builder.info_dialog_text = this.info_dialog_text;
                        builder.info_dialog_dismiss_button_text = this.info_dialog_dismiss_button_text;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.info_dialog_text;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "info_dialog_text=", arrayList);
                        }
                        String str2 = this.info_dialog_dismiss_button_text;
                        if (str2 != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "info_dialog_dismiss_button_text=", arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentDetailsDialog{", "}", 0, null, null, 56);
                    }

                    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetailsDialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final /* synthetic */ InstrumentDetailsDialog build(Function1<? super Builder, Unit> body) {
                            body.getClass();
                            Builder builder = new Builder();
                            body.invoke(builder);
                            return builder.build();
                        }

                        private Companion() {
                        }
                    }

                    public InstrumentDetailsDialog() {
                        this(null, null, null, 7, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public InstrumentDetailsDialog(String str, String str2, ByteString byteString) {
                        super(ADAPTER, byteString);
                        byteString.getClass();
                        this.info_dialog_text = str;
                        this.info_dialog_dismiss_button_text = str2;
                    }
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails;", "", "<init>", "()V", "Detail", "DetailList", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails$Detail;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails$DetailList;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static abstract class InstrumentDetails {

                    @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail#ADAPTER", declaredName = "detail", tag = 5)
                    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails$Detail;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$Detail;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final /* data */ class Detail extends InstrumentDetails {
                        private final Detail value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public Detail(Detail detail) {
                            super(null);
                            detail.getClass();
                            this.value = detail;
                        }

                        public static /* synthetic */ Detail copy$default(Detail detail, Detail detail2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                detail2 = detail.value;
                            }
                            return detail.copy(detail2);
                        }

                        /* renamed from: component1, reason: from getter */
                        public final Detail getValue() {
                            return this.value;
                        }

                        public final Detail copy(Detail value) {
                            value.getClass();
                            return new Detail(value);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof Detail) && Intrinsics.areEqual(this.value, ((Detail) other).value);
                        }

                        public final Detail getValue() {
                            return this.value;
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "Detail(value=" + this.value + ")";
                        }
                    }

                    @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList#ADAPTER", declaredName = "detail_list", tag = 6)
                    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails$DetailList;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$InstrumentDetails;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction$DetailList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    public static final /* data */ class DetailList extends InstrumentDetails {
                        private final DetailList value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public DetailList(DetailList detailList) {
                            super(null);
                            detailList.getClass();
                            this.value = detailList;
                        }

                        public static /* synthetic */ DetailList copy$default(DetailList detailList, DetailList detailList2, int i, Object obj) {
                            if ((i & 1) != 0) {
                                detailList2 = detailList.value;
                            }
                            return detailList.copy(detailList2);
                        }

                        /* renamed from: component1, reason: from getter */
                        public final DetailList getValue() {
                            return this.value;
                        }

                        public final DetailList copy(DetailList value) {
                            value.getClass();
                            return new DetailList(value);
                        }

                        public boolean equals(Object other) {
                            if (this == other) {
                                return true;
                            }
                            return (other instanceof DetailList) && Intrinsics.areEqual(this.value, ((DetailList) other).value);
                        }

                        public final DetailList getValue() {
                            return this.value;
                        }

                        public int hashCode() {
                            return this.value.hashCode();
                        }

                        public String toString() {
                            return "DetailList(value=" + this.value + ")";
                        }
                    }

                    public /* synthetic */ InstrumentDetails(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private InstrumentDetails() {
                    }
                }

                public SelectInstrumentAction() {
                    this(null, null, null, null, null, null, null, null, null, 511, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectInstrumentAction(List<DetailRow> list, String str, String str2, String str3, String str4, InstrumentDetails instrumentDetails, String str5, DigitalWallet digitalWallet, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.selected_title = str;
                    this.selected_subtitle_primary = str2;
                    this.selected_subtitle_suffix = str3;
                    this.selected_accessibility_label = str4;
                    this.instrument_details = instrumentDetails;
                    this.instrument_header_text = str5;
                    this.digital_wallet = digitalWallet;
                    this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EnabledState.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.EnabledState decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.EnabledState((ByteString) obj, selectionAction, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.BYTES.decode(reader);
                            } else if (nextTag == 4) {
                                selectionAction = new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction) InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction.ADAPTER.decode(reader));
                            } else if (nextTag == 5) {
                                selectionAction = new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction) InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.ADAPTER.decode(reader));
                            } else if (nextTag != 6) {
                                reader.readUnknownField(nextTag);
                            } else {
                                selectionAction = new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction((InstrumentSelectionBlocker.ShowDialogAction) InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.decode(reader));
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.encoded_selected_option);
                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction = value.selection_action;
                        if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) {
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction.ADAPTER.encodeWithTag(writer, 4, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) selectionAction).getValue());
                        } else if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) {
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) selectionAction).getValue());
                        } else if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) {
                            InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.encodeWithTag(writer, 6, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) selectionAction).getValue());
                        } else if (selectionAction != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState value) {
                        value.getClass();
                        int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, value.encoded_selected_option) + value.unknownFields().getSize$okio();
                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction = value.selection_action;
                        if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) {
                            return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction.ADAPTER.encodedSizeWithTag(4, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) selectionAction).getValue()) + encodedSizeWithTag;
                        }
                        if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) {
                            return InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.ADAPTER.encodedSizeWithTag(5, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) selectionAction).getValue()) + encodedSizeWithTag;
                        }
                        if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) {
                            return InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.encodedSizeWithTag(6, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) selectionAction).getValue()) + encodedSizeWithTag;
                        }
                        if (selectionAction == null) {
                            return encodedSizeWithTag;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.EnabledState redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState value) {
                        value.getClass();
                        return InstrumentSelectionBlocker.InstrumentOption.EnabledState.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction selectionAction = value.selection_action;
                        if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) {
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction.ADAPTER.encodeWithTag(writer, 4, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SubmitInstrumentAction) selectionAction).getValue());
                        } else if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) {
                            InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectInstrumentAction.ADAPTER.encodeWithTag(writer, 5, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.SelectInstrumentAction) selectionAction).getValue());
                        } else if (selectionAction instanceof InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) {
                            InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.encodeWithTag(writer, 6, ((InstrumentSelectionBlocker.InstrumentOption.EnabledState.SelectionAction.ShowDialogAction) selectionAction).getValue());
                        } else if (selectionAction != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.encoded_selected_option);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ EnabledState(ByteString byteString, SelectionAction selectionAction, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : byteString, (i & 2) != 0 ? null : selectionAction, (i & 4) != 0 ? ByteString.EMPTY : byteString2);
            }

            public static /* synthetic */ EnabledState copy$default(EnabledState enabledState, ByteString byteString, SelectionAction selectionAction, ByteString byteString2, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = enabledState.encoded_selected_option;
                }
                if ((i & 2) != 0) {
                    selectionAction = enabledState.selection_action;
                }
                if ((i & 4) != 0) {
                    byteString2 = enabledState.unknownFields();
                }
                return enabledState.copy(byteString, selectionAction, byteString2);
            }

            public final EnabledState copy(ByteString encoded_selected_option, SelectionAction selection_action, ByteString unknownFields) {
                unknownFields.getClass();
                return new EnabledState(encoded_selected_option, selection_action, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EnabledState)) {
                    return false;
                }
                EnabledState enabledState = (EnabledState) other;
                return Intrinsics.areEqual(unknownFields(), enabledState.unknownFields()) && Intrinsics.areEqual(this.encoded_selected_option, enabledState.encoded_selected_option) && Intrinsics.areEqual(this.selection_action, enabledState.selection_action);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                ByteString byteString = this.encoded_selected_option;
                int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
                SelectionAction selectionAction = this.selection_action;
                int hashCode3 = hashCode2 + (selectionAction != null ? selectionAction.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.encoded_selected_option = this.encoded_selected_option;
                builder.selection_action = this.selection_action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                ByteString byteString = this.encoded_selected_option;
                if (byteString != null) {
                    Request$Priority$EnumUnboxingLocalUtility.m("encoded_selected_option=", byteString, arrayList);
                }
                SelectionAction selectionAction = this.selection_action;
                if (selectionAction != null) {
                    arrayList.add("selection_action=" + selectionAction);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EnabledState{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class SubmitInstrumentAction extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<SubmitInstrumentAction> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    @Override // com.squareup.wire.Message.Builder
                    public SubmitInstrumentAction build() {
                        return new SubmitInstrumentAction(buildUnknownFields());
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitInstrumentAction.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction(reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                reader.readUnknownField(nextTag);
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction value) {
                            value.getClass();
                            return value.unknownFields().getSize$okio();
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction redact(InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction value) {
                            value.getClass();
                            return value.copy(ByteString.EMPTY);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EnabledState.SubmitInstrumentAction value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ SubmitInstrumentAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ SubmitInstrumentAction copy$default(SubmitInstrumentAction submitInstrumentAction, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        byteString = submitInstrumentAction.unknownFields();
                    }
                    return submitInstrumentAction.copy(byteString);
                }

                public final SubmitInstrumentAction copy(ByteString unknownFields) {
                    unknownFields.getClass();
                    return new SubmitInstrumentAction(unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    return (other instanceof SubmitInstrumentAction) && Intrinsics.areEqual(unknownFields(), ((SubmitInstrumentAction) other).unknownFields());
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
                    return "SubmitInstrumentAction{}";
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ SubmitInstrumentAction build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public SubmitInstrumentAction() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SubmitInstrumentAction(ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ EnabledState build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;", "", "<init>", "()V", "SubmitInstrumentAction", "SelectInstrumentAction", "ShowDialogAction", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction$SelectInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction$ShowDialogAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction$SubmitInstrumentAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class SelectionAction {

                @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction#ADAPTER", declaredName = "select_instrument_action", tag = 5)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction$SelectInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

                @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$ShowDialogAction#ADAPTER", declaredName = "show_dialog_action", tag = 6)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction$ShowDialogAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class ShowDialogAction extends SelectionAction {
                    private final ShowDialogAction value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public ShowDialogAction(ShowDialogAction showDialogAction) {
                        super(null);
                        showDialogAction.getClass();
                        this.value = showDialogAction;
                    }

                    public static /* synthetic */ ShowDialogAction copy$default(ShowDialogAction showDialogAction, ShowDialogAction showDialogAction2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            showDialogAction2 = showDialogAction.value;
                        }
                        return showDialogAction.copy(showDialogAction2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final ShowDialogAction getValue() {
                        return this.value;
                    }

                    public final ShowDialogAction copy(ShowDialogAction value) {
                        value.getClass();
                        return new ShowDialogAction(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof ShowDialogAction) && Intrinsics.areEqual(this.value, ((ShowDialogAction) other).value);
                    }

                    public final ShowDialogAction getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "ShowDialogAction(value=" + this.value + ")";
                    }
                }

                @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction#ADAPTER", declaredName = "submit_instrument_action", tag = 4)
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction$SubmitInstrumentAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SelectionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState$SubmitInstrumentAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class SubmitInstrumentAction extends SelectionAction {
                    private final SubmitInstrumentAction value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public SubmitInstrumentAction(SubmitInstrumentAction submitInstrumentAction) {
                        super(null);
                        submitInstrumentAction.getClass();
                        this.value = submitInstrumentAction;
                    }

                    public static /* synthetic */ SubmitInstrumentAction copy$default(SubmitInstrumentAction submitInstrumentAction, SubmitInstrumentAction submitInstrumentAction2, int i, Object obj) {
                        if ((i & 1) != 0) {
                            submitInstrumentAction2 = submitInstrumentAction.value;
                        }
                        return submitInstrumentAction.copy(submitInstrumentAction2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final SubmitInstrumentAction getValue() {
                        return this.value;
                    }

                    public final SubmitInstrumentAction copy(SubmitInstrumentAction value) {
                        value.getClass();
                        return new SubmitInstrumentAction(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof SubmitInstrumentAction) && Intrinsics.areEqual(this.value, ((SubmitInstrumentAction) other).value);
                    }

                    public final SubmitInstrumentAction getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "SubmitInstrumentAction(value=" + this.value + ")";
                    }
                }

                public /* synthetic */ SelectionAction(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private SelectionAction() {
                }
            }

            public EnabledState() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EnabledState(ByteString byteString, SelectionAction selectionAction, ByteString byteString2) {
                super(ADAPTER, byteString2);
                byteString2.getClass();
                this.encoded_selected_option = byteString;
                this.selection_action = selectionAction;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentOption.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlocker.InstrumentOption decode(ProtoReader reader) {
                    Object obj;
                    Object obj2;
                    InstrumentSelectionBlocker.InstrumentOption.State enabledState;
                    InstrumentSelectionBlocker.InstrumentOption.IconStyle cardIcon;
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    InstrumentSelectionBlocker.InstrumentOption.IconStyle iconStyle = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    Object obj9 = null;
                    InstrumentSelectionBlocker.InstrumentOption.State state = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlocker.InstrumentOption((Image) obj3, iconStyle, (InstrumentSelectionBlocker.OptionStyle) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, state, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                                break;
                            case 2:
                                obj = obj4;
                                iconStyle = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon((InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon) InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon.ADAPTER.decode(reader));
                                obj4 = obj;
                                break;
                            case 3:
                                try {
                                    obj4 = InstrumentSelectionBlocker.OptionStyle.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    obj = obj4;
                                    obj2 = obj5;
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 4:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                obj8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                enabledState = new InstrumentSelectionBlocker.InstrumentOption.State.EnabledState((InstrumentSelectionBlocker.InstrumentOption.EnabledState) InstrumentSelectionBlocker.InstrumentOption.EnabledState.ADAPTER.decode(reader));
                                state = enabledState;
                                break;
                            case 9:
                                enabledState = new InstrumentSelectionBlocker.InstrumentOption.State.DisabledState((InstrumentSelectionBlocker.InstrumentOption.DisabledState) InstrumentSelectionBlocker.InstrumentOption.DisabledState.ADAPTER.decode(reader));
                                state = enabledState;
                                break;
                            case 10:
                                cardIcon = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon((InstrumentSelectionBlocker.InstrumentOption.CardIcon) InstrumentSelectionBlocker.InstrumentOption.CardIcon.ADAPTER.decode(reader));
                                iconStyle = cardIcon;
                                break;
                            case 11:
                                cardIcon = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon((InstrumentSelectionBlocker.InstrumentOption.BankIcon) InstrumentSelectionBlocker.InstrumentOption.BankIcon.ADAPTER.decode(reader));
                                iconStyle = cardIcon;
                                break;
                            case 12:
                                obj9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                cardIcon = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon((InstrumentSelectionBlocker.InstrumentOption.BalanceIcon) InstrumentSelectionBlocker.InstrumentOption.BalanceIcon.ADAPTER.decode(reader));
                                iconStyle = cardIcon;
                                break;
                            case 14:
                                cardIcon = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon((InstrumentSelectionBlocker.InstrumentOption.AppIcon) InstrumentSelectionBlocker.InstrumentOption.AppIcon.ADAPTER.decode(reader));
                                iconStyle = cardIcon;
                                break;
                            case 15:
                                cardIcon = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon((InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon) InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon.ADAPTER.decode(reader));
                                iconStyle = cardIcon;
                                break;
                            case 16:
                                cardIcon = new InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon((InstrumentSelectionBlocker.InstrumentOption.EmojiIcon) InstrumentSelectionBlocker.InstrumentOption.EmojiIcon.ADAPTER.decode(reader));
                                iconStyle = cardIcon;
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                obj = obj4;
                                obj2 = obj5;
                                obj5 = obj2;
                                obj4 = obj;
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                    InstrumentSelectionBlocker.OptionStyle.ADAPTER.encodeWithTag(writer, 3, value.option_style);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.list_title);
                    protoAdapter2.encodeWithTag(writer, 5, value.list_subtitle_primary);
                    protoAdapter2.encodeWithTag(writer, 6, value.list_subtitle_suffix);
                    protoAdapter2.encodeWithTag(writer, 7, value.list_pill_text);
                    protoAdapter2.encodeWithTag(writer, 12, value.list_accessibility_label);
                    InstrumentSelectionBlocker.InstrumentOption.IconStyle iconStyle = value.icon_style;
                    if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon.ADAPTER.encodeWithTag(writer, 2, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.CardIcon.ADAPTER.encodeWithTag(writer, 10, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.BankIcon.ADAPTER.encodeWithTag(writer, 11, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.BalanceIcon.ADAPTER.encodeWithTag(writer, 13, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.AppIcon.ADAPTER.encodeWithTag(writer, 14, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon.ADAPTER.encodeWithTag(writer, 15, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.EmojiIcon.ADAPTER.encodeWithTag(writer, 16, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) iconStyle).getValue());
                    } else if (iconStyle != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    InstrumentSelectionBlocker.InstrumentOption.State state = value.state;
                    if (state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) {
                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.ADAPTER.encodeWithTag(writer, 8, ((InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) state).getValue());
                    } else if (state instanceof InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) {
                        InstrumentSelectionBlocker.InstrumentOption.DisabledState.ADAPTER.encodeWithTag(writer, 9, ((InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) state).getValue());
                    } else if (state != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x00db  */
                @Override // com.squareup.wire.ProtoAdapter
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public int encodedSize(InstrumentSelectionBlocker.InstrumentOption value) {
                    int encodedSizeWithTag;
                    InstrumentSelectionBlocker.InstrumentOption.State state;
                    int encodedSizeWithTag2;
                    value.getClass();
                    int encodedSizeWithTag3 = Image.ADAPTER.encodedSizeWithTag(1, value.avatar) + value.unknownFields().getSize$okio();
                    InstrumentSelectionBlocker.InstrumentOption.IconStyle iconStyle = value.icon_style;
                    if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) {
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon.ADAPTER.encodedSizeWithTag(2, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) {
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.CardIcon.ADAPTER.encodedSizeWithTag(10, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) {
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.BankIcon.ADAPTER.encodedSizeWithTag(11, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) {
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.BalanceIcon.ADAPTER.encodedSizeWithTag(13, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) {
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.AppIcon.ADAPTER.encodedSizeWithTag(14, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) {
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon.ADAPTER.encodedSizeWithTag(15, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) iconStyle).getValue());
                    } else {
                        if (!(iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon)) {
                            if (iconStyle != null) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return 0;
                            }
                            int encodedSizeWithTag4 = InstrumentSelectionBlocker.OptionStyle.ADAPTER.encodedSizeWithTag(3, value.option_style) + encodedSizeWithTag3;
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            int encodedSizeWithTag5 = protoAdapter2.encodedSizeWithTag(12, value.list_accessibility_label) + protoAdapter2.encodedSizeWithTag(7, value.list_pill_text) + protoAdapter2.encodedSizeWithTag(6, value.list_subtitle_suffix) + protoAdapter2.encodedSizeWithTag(5, value.list_subtitle_primary) + protoAdapter2.encodedSizeWithTag(4, value.list_title) + encodedSizeWithTag4;
                            state = value.state;
                            if (!(state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState)) {
                                encodedSizeWithTag2 = InstrumentSelectionBlocker.InstrumentOption.EnabledState.ADAPTER.encodedSizeWithTag(8, ((InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) state).getValue());
                            } else {
                                if (!(state instanceof InstrumentSelectionBlocker.InstrumentOption.State.DisabledState)) {
                                    if (state == null) {
                                        return encodedSizeWithTag5;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return 0;
                                }
                                encodedSizeWithTag2 = InstrumentSelectionBlocker.InstrumentOption.DisabledState.ADAPTER.encodedSizeWithTag(9, ((InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) state).getValue());
                            }
                            return encodedSizeWithTag2 + encodedSizeWithTag5;
                        }
                        encodedSizeWithTag = InstrumentSelectionBlocker.InstrumentOption.EmojiIcon.ADAPTER.encodedSizeWithTag(16, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) iconStyle).getValue());
                    }
                    encodedSizeWithTag3 += encodedSizeWithTag;
                    int encodedSizeWithTag42 = InstrumentSelectionBlocker.OptionStyle.ADAPTER.encodedSizeWithTag(3, value.option_style) + encodedSizeWithTag3;
                    ProtoAdapter protoAdapter22 = ProtoAdapter.STRING;
                    int encodedSizeWithTag52 = protoAdapter22.encodedSizeWithTag(12, value.list_accessibility_label) + protoAdapter22.encodedSizeWithTag(7, value.list_pill_text) + protoAdapter22.encodedSizeWithTag(6, value.list_subtitle_suffix) + protoAdapter22.encodedSizeWithTag(5, value.list_subtitle_primary) + protoAdapter22.encodedSizeWithTag(4, value.list_title) + encodedSizeWithTag42;
                    state = value.state;
                    if (!(state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState)) {
                    }
                    return encodedSizeWithTag2 + encodedSizeWithTag52;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlocker.InstrumentOption redact(InstrumentSelectionBlocker.InstrumentOption value) {
                    value.getClass();
                    Image image = value.avatar;
                    return InstrumentSelectionBlocker.InstrumentOption.copy$default(value, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, null, null, null, null, null, null, null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    InstrumentSelectionBlocker.InstrumentOption.State state = value.state;
                    if (state instanceof InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) {
                        InstrumentSelectionBlocker.InstrumentOption.EnabledState.ADAPTER.encodeWithTag(writer, 8, ((InstrumentSelectionBlocker.InstrumentOption.State.EnabledState) state).getValue());
                    } else if (state instanceof InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) {
                        InstrumentSelectionBlocker.InstrumentOption.DisabledState.ADAPTER.encodeWithTag(writer, 9, ((InstrumentSelectionBlocker.InstrumentOption.State.DisabledState) state).getValue());
                    } else if (state != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    InstrumentSelectionBlocker.InstrumentOption.IconStyle iconStyle = value.icon_style;
                    if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon.ADAPTER.encodeWithTag(writer, 2, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.NewLinkIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.CardIcon.ADAPTER.encodeWithTag(writer, 10, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.CardIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.BankIcon.ADAPTER.encodeWithTag(writer, 11, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.BankIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.BalanceIcon.ADAPTER.encodeWithTag(writer, 13, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.BalanceIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.AppIcon.ADAPTER.encodeWithTag(writer, 14, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.AppIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon.ADAPTER.encodeWithTag(writer, 15, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.DigitalWalletIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) {
                        InstrumentSelectionBlocker.InstrumentOption.EmojiIcon.ADAPTER.encodeWithTag(writer, 16, ((InstrumentSelectionBlocker.InstrumentOption.IconStyle.EmojiIcon) iconStyle).getValue());
                    } else if (iconStyle != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 12, value.list_accessibility_label);
                    protoAdapter2.encodeWithTag(writer, 7, value.list_pill_text);
                    protoAdapter2.encodeWithTag(writer, 6, value.list_subtitle_suffix);
                    protoAdapter2.encodeWithTag(writer, 5, value.list_subtitle_primary);
                    protoAdapter2.encodeWithTag(writer, 4, value.list_title);
                    InstrumentSelectionBlocker.OptionStyle.ADAPTER.encodeWithTag(writer, 3, value.option_style);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InstrumentOption(Image image, IconStyle iconStyle, OptionStyle optionStyle, String str, String str2, String str3, String str4, String str5, State state, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : iconStyle, (i & 4) != 0 ? null : optionStyle, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : state, (i & 512) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InstrumentOption copy$default(InstrumentOption instrumentOption, Image image, IconStyle iconStyle, OptionStyle optionStyle, String str, String str2, String str3, String str4, String str5, State state, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = instrumentOption.avatar;
            }
            if ((i & 2) != 0) {
                iconStyle = instrumentOption.icon_style;
            }
            if ((i & 4) != 0) {
                optionStyle = instrumentOption.option_style;
            }
            if ((i & 8) != 0) {
                str = instrumentOption.list_title;
            }
            if ((i & 16) != 0) {
                str2 = instrumentOption.list_subtitle_primary;
            }
            if ((i & 32) != 0) {
                str3 = instrumentOption.list_subtitle_suffix;
            }
            if ((i & 64) != 0) {
                str4 = instrumentOption.list_pill_text;
            }
            if ((i & 128) != 0) {
                str5 = instrumentOption.list_accessibility_label;
            }
            if ((i & 256) != 0) {
                state = instrumentOption.state;
            }
            if ((i & 512) != 0) {
                byteString = instrumentOption.unknownFields();
            }
            State state2 = state;
            ByteString byteString2 = byteString;
            String str6 = str4;
            String str7 = str5;
            String str8 = str2;
            String str9 = str3;
            return instrumentOption.copy(image, iconStyle, optionStyle, str, str8, str9, str6, str7, state2, byteString2);
        }

        public final InstrumentOption copy(Image avatar, IconStyle icon_style, OptionStyle option_style, String list_title, String list_subtitle_primary, String list_subtitle_suffix, String list_pill_text, String list_accessibility_label, State state, ByteString unknownFields) {
            unknownFields.getClass();
            return new InstrumentOption(avatar, icon_style, option_style, list_title, list_subtitle_primary, list_subtitle_suffix, list_pill_text, list_accessibility_label, state, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InstrumentOption)) {
                return false;
            }
            InstrumentOption instrumentOption = (InstrumentOption) other;
            return Intrinsics.areEqual(unknownFields(), instrumentOption.unknownFields()) && Intrinsics.areEqual(this.avatar, instrumentOption.avatar) && Intrinsics.areEqual(this.icon_style, instrumentOption.icon_style) && this.option_style == instrumentOption.option_style && Intrinsics.areEqual(this.list_title, instrumentOption.list_title) && Intrinsics.areEqual(this.list_subtitle_primary, instrumentOption.list_subtitle_primary) && Intrinsics.areEqual(this.list_subtitle_suffix, instrumentOption.list_subtitle_suffix) && Intrinsics.areEqual(this.list_pill_text, instrumentOption.list_pill_text) && Intrinsics.areEqual(this.list_accessibility_label, instrumentOption.list_accessibility_label) && Intrinsics.areEqual(this.state, instrumentOption.state);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.avatar;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            IconStyle iconStyle = this.icon_style;
            int hashCode3 = (hashCode2 + (iconStyle != null ? iconStyle.hashCode() : 0)) * 37;
            OptionStyle optionStyle = this.option_style;
            int hashCode4 = (hashCode3 + (optionStyle != null ? optionStyle.hashCode() : 0)) * 37;
            String str = this.list_title;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.list_subtitle_primary;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.list_subtitle_suffix;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.list_pill_text;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.list_accessibility_label;
            int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
            State state = this.state;
            int hashCode10 = hashCode9 + (state != null ? state.hashCode() : 0);
            this.hashCode = hashCode10;
            return hashCode10;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.avatar = this.avatar;
            builder.icon_style = this.icon_style;
            builder.option_style = this.option_style;
            builder.list_title = this.list_title;
            builder.list_subtitle_primary = this.list_subtitle_primary;
            builder.list_subtitle_suffix = this.list_subtitle_suffix;
            builder.list_pill_text = this.list_pill_text;
            builder.list_accessibility_label = this.list_accessibility_label;
            builder.state = this.state;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.avatar;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("avatar=", image, arrayList);
            }
            IconStyle iconStyle = this.icon_style;
            if (iconStyle != null) {
                arrayList.add("icon_style=" + iconStyle);
            }
            OptionStyle optionStyle = this.option_style;
            if (optionStyle != null) {
                arrayList.add("option_style=" + optionStyle);
            }
            if (this.list_title != null) {
                arrayList.add("list_title=██");
            }
            if (this.list_subtitle_primary != null) {
                arrayList.add("list_subtitle_primary=██");
            }
            if (this.list_subtitle_suffix != null) {
                arrayList.add("list_subtitle_suffix=██");
            }
            String str = this.list_pill_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "list_pill_text=", arrayList);
            }
            if (this.list_accessibility_label != null) {
                arrayList.add("list_accessibility_label=██");
            }
            State state = this.state;
            if (state != null) {
                arrayList.add("state=" + state);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentOption{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AppIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AppIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public AppIcon build() {
                    return new AppIcon(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AppIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$AppIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.AppIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.AppIcon(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.AppIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.AppIcon value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.AppIcon redact(InstrumentSelectionBlocker.InstrumentOption.AppIcon value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.AppIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ AppIcon(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ AppIcon copy$default(AppIcon appIcon, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = appIcon.unknownFields();
                }
                return appIcon.copy(byteString);
            }

            public final AppIcon copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new AppIcon(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof AppIcon) && Intrinsics.areEqual(unknownFields(), ((AppIcon) other).unknownFields());
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
                return "AppIcon{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ AppIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AppIcon() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AppIcon(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon$Builder;", "currency_code", "Lcom/squareup/protos/common/CurrencyCode;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/common/CurrencyCode;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BalanceIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BalanceIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 0, tag = 1)
            public final CurrencyCode currency_code;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;", "<init>", "()V", "currency_code", "Lcom/squareup/protos/common/CurrencyCode;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public CurrencyCode currency_code;

                @Override // com.squareup.wire.Message.Builder
                public BalanceIcon build() {
                    return new BalanceIcon(this.currency_code, buildUnknownFields());
                }

                public final Builder currency_code(CurrencyCode currency_code) {
                    this.currency_code = currency_code;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BalanceIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$BalanceIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.BalanceIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.BalanceIcon((CurrencyCode) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                try {
                                    obj = CurrencyCode.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.BalanceIcon value) {
                        writer.getClass();
                        value.getClass();
                        CurrencyCode.ADAPTER.encodeWithTag(writer, 1, value.currency_code);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.BalanceIcon value) {
                        value.getClass();
                        return CurrencyCode.ADAPTER.encodedSizeWithTag(1, value.currency_code) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.BalanceIcon redact(InstrumentSelectionBlocker.InstrumentOption.BalanceIcon value) {
                        value.getClass();
                        return InstrumentSelectionBlocker.InstrumentOption.BalanceIcon.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.BalanceIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        CurrencyCode.ADAPTER.encodeWithTag(writer, 1, value.currency_code);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ BalanceIcon(CurrencyCode currencyCode, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : currencyCode, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ BalanceIcon copy$default(BalanceIcon balanceIcon, CurrencyCode currencyCode, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    currencyCode = balanceIcon.currency_code;
                }
                if ((i & 2) != 0) {
                    byteString = balanceIcon.unknownFields();
                }
                return balanceIcon.copy(currencyCode, byteString);
            }

            public final BalanceIcon copy(CurrencyCode currency_code, ByteString unknownFields) {
                unknownFields.getClass();
                return new BalanceIcon(currency_code, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof BalanceIcon)) {
                    return false;
                }
                BalanceIcon balanceIcon = (BalanceIcon) other;
                return Intrinsics.areEqual(unknownFields(), balanceIcon.unknownFields()) && this.currency_code == balanceIcon.currency_code;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                CurrencyCode currencyCode = this.currency_code;
                int hashCode2 = hashCode + (currencyCode != null ? currencyCode.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.currency_code = this.currency_code;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                CurrencyCode currencyCode = this.currency_code;
                if (currencyCode != null) {
                    Matcher$$ExternalSyntheticOutline0.m("currency_code=", currencyCode, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "BalanceIcon{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ BalanceIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public BalanceIcon() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BalanceIcon(CurrencyCode currencyCode, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.currency_code = currencyCode;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class BankIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<BankIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public BankIcon build() {
                    return new BankIcon(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BankIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$BankIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.BankIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.BankIcon(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.BankIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.BankIcon value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.BankIcon redact(InstrumentSelectionBlocker.InstrumentOption.BankIcon value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.BankIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ BankIcon(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ BankIcon copy$default(BankIcon bankIcon, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = bankIcon.unknownFields();
                }
                return bankIcon.copy(byteString);
            }

            public final BankIcon copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new BankIcon(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof BankIcon) && Intrinsics.areEqual(unknownFields(), ((BankIcon) other).unknownFields());
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
                return "BankIcon{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ BankIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public BankIcon() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BankIcon(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CardIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CardIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public CardIcon build() {
                    return new CardIcon(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CardIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$CardIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.CardIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.CardIcon(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.CardIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.CardIcon value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.CardIcon redact(InstrumentSelectionBlocker.InstrumentOption.CardIcon value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.CardIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ CardIcon(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ CardIcon copy$default(CardIcon cardIcon, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = cardIcon.unknownFields();
                }
                return cardIcon.copy(byteString);
            }

            public final CardIcon copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new CardIcon(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof CardIcon) && Intrinsics.areEqual(unknownFields(), ((CardIcon) other).unknownFields());
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
                return "CardIcon{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ CardIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public CardIcon() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CardIcon(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon$Builder;", "type", "Lcom/squareup/protos/cash/digitalwallet/DigitalWalletType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/digitalwallet/DigitalWalletType;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DigitalWalletIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DigitalWalletIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.digitalwallet.DigitalWalletType#ADAPTER", schemaIndex = 0, tag = 1)
            public final DigitalWalletType type;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;", "<init>", "()V", "type", "Lcom/squareup/protos/cash/digitalwallet/DigitalWalletType;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public DigitalWalletType type;

                @Override // com.squareup.wire.Message.Builder
                public DigitalWalletIcon build() {
                    return new DigitalWalletIcon(this.type, buildUnknownFields());
                }

                public final Builder type(DigitalWalletType type2) {
                    this.type = type2;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DigitalWalletIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon((DigitalWalletType) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                try {
                                    obj = DigitalWalletType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon value) {
                        writer.getClass();
                        value.getClass();
                        DigitalWalletType.ADAPTER.encodeWithTag(writer, 1, value.type);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon value) {
                        value.getClass();
                        return DigitalWalletType.ADAPTER.encodedSizeWithTag(1, value.type) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon redact(InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon value) {
                        value.getClass();
                        return InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.DigitalWalletIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        DigitalWalletType.ADAPTER.encodeWithTag(writer, 1, value.type);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DigitalWalletIcon(DigitalWalletType digitalWalletType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : digitalWalletType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DigitalWalletIcon copy$default(DigitalWalletIcon digitalWalletIcon, DigitalWalletType digitalWalletType, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    digitalWalletType = digitalWalletIcon.type;
                }
                if ((i & 2) != 0) {
                    byteString = digitalWalletIcon.unknownFields();
                }
                return digitalWalletIcon.copy(digitalWalletType, byteString);
            }

            public final DigitalWalletIcon copy(DigitalWalletType type2, ByteString unknownFields) {
                unknownFields.getClass();
                return new DigitalWalletIcon(type2, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DigitalWalletIcon)) {
                    return false;
                }
                DigitalWalletIcon digitalWalletIcon = (DigitalWalletIcon) other;
                return Intrinsics.areEqual(unknownFields(), digitalWalletIcon.unknownFields()) && this.type == digitalWalletIcon.type;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                DigitalWalletType digitalWalletType = this.type;
                int hashCode2 = hashCode + (digitalWalletType != null ? digitalWalletType.hashCode() : 0);
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
                DigitalWalletType digitalWalletType = this.type;
                if (digitalWalletType != null) {
                    arrayList.add("type=" + digitalWalletType);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DigitalWalletIcon{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DigitalWalletIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public DigitalWalletIcon() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DigitalWalletIcon(DigitalWalletType digitalWalletType, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.type = digitalWalletType;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState$Builder;", "selected_title", "", "selected_subtitle_primary", "selected_subtitle_suffix", "list_reason", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DisabledState extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DisabledState> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
            public final String list_reason;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
            public final String selected_subtitle_primary;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
            public final String selected_subtitle_suffix;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
            public final String selected_title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;", "<init>", "()V", "selected_title", "", "selected_subtitle_primary", "selected_subtitle_suffix", "list_reason", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String list_reason;
                public String selected_subtitle_primary;
                public String selected_subtitle_suffix;
                public String selected_title;

                @Override // com.squareup.wire.Message.Builder
                public DisabledState build() {
                    return new DisabledState(this.selected_title, this.selected_subtitle_primary, this.selected_subtitle_suffix, this.list_reason, buildUnknownFields());
                }

                public final Builder list_reason(String list_reason) {
                    this.list_reason = list_reason;
                    return this;
                }

                public final Builder selected_subtitle_primary(String selected_subtitle_primary) {
                    this.selected_subtitle_primary = selected_subtitle_primary;
                    return this;
                }

                public final Builder selected_subtitle_suffix(String selected_subtitle_suffix) {
                    this.selected_subtitle_suffix = selected_subtitle_suffix;
                    return this;
                }

                public final Builder selected_title(String selected_title) {
                    this.selected_title = selected_title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DisabledState.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$DisabledState$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.DisabledState decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.DisabledState((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.DisabledState value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.selected_title);
                        protoAdapter2.encodeWithTag(writer, 2, value.selected_subtitle_primary);
                        protoAdapter2.encodeWithTag(writer, 3, value.selected_subtitle_suffix);
                        protoAdapter2.encodeWithTag(writer, 4, value.list_reason);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.DisabledState value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(4, value.list_reason) + protoAdapter2.encodedSizeWithTag(3, value.selected_subtitle_suffix) + protoAdapter2.encodedSizeWithTag(2, value.selected_subtitle_primary) + protoAdapter2.encodedSizeWithTag(1, value.selected_title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.DisabledState redact(InstrumentSelectionBlocker.InstrumentOption.DisabledState value) {
                        value.getClass();
                        return value.copy(null, null, null, null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.DisabledState value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.list_reason);
                        protoAdapter2.encodeWithTag(writer, 3, value.selected_subtitle_suffix);
                        protoAdapter2.encodeWithTag(writer, 2, value.selected_subtitle_primary);
                        protoAdapter2.encodeWithTag(writer, 1, value.selected_title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DisabledState(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DisabledState copy$default(DisabledState disabledState, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = disabledState.selected_title;
                }
                if ((i & 2) != 0) {
                    str2 = disabledState.selected_subtitle_primary;
                }
                if ((i & 4) != 0) {
                    str3 = disabledState.selected_subtitle_suffix;
                }
                if ((i & 8) != 0) {
                    str4 = disabledState.list_reason;
                }
                if ((i & 16) != 0) {
                    byteString = disabledState.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str5 = str3;
                return disabledState.copy(str, str2, str5, str4, byteString2);
            }

            public final DisabledState copy(String selected_title, String selected_subtitle_primary, String selected_subtitle_suffix, String list_reason, ByteString unknownFields) {
                unknownFields.getClass();
                return new DisabledState(selected_title, selected_subtitle_primary, selected_subtitle_suffix, list_reason, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DisabledState)) {
                    return false;
                }
                DisabledState disabledState = (DisabledState) other;
                return Intrinsics.areEqual(unknownFields(), disabledState.unknownFields()) && Intrinsics.areEqual(this.selected_title, disabledState.selected_title) && Intrinsics.areEqual(this.selected_subtitle_primary, disabledState.selected_subtitle_primary) && Intrinsics.areEqual(this.selected_subtitle_suffix, disabledState.selected_subtitle_suffix) && Intrinsics.areEqual(this.list_reason, disabledState.list_reason);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.selected_title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.selected_subtitle_primary;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.selected_subtitle_suffix;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.list_reason;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.selected_title = this.selected_title;
                builder.selected_subtitle_primary = this.selected_subtitle_primary;
                builder.selected_subtitle_suffix = this.selected_subtitle_suffix;
                builder.list_reason = this.list_reason;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.selected_title != null) {
                    arrayList.add("selected_title=██");
                }
                if (this.selected_subtitle_primary != null) {
                    arrayList.add("selected_subtitle_primary=██");
                }
                if (this.selected_subtitle_suffix != null) {
                    arrayList.add("selected_subtitle_suffix=██");
                }
                if (this.list_reason != null) {
                    arrayList.add("list_reason=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DisabledState{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DisabledState build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public DisabledState() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisabledState(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.selected_title = str;
                this.selected_subtitle_primary = str2;
                this.selected_subtitle_suffix = str3;
                this.list_reason = str4;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon$Builder;", "code", "", "icon_id", "arcade_icon_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class EmojiIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EmojiIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String arcade_icon_id;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String code;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String icon_id;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;", "<init>", "()V", "code", "", "icon_id", "arcade_icon_id", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String arcade_icon_id;
                public String code;
                public String icon_id;

                public final Builder arcade_icon_id(String arcade_icon_id) {
                    this.arcade_icon_id = arcade_icon_id;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public EmojiIcon build() {
                    return new EmojiIcon(this.code, this.icon_id, this.arcade_icon_id, buildUnknownFields());
                }

                public final Builder code(String code) {
                    this.code = code;
                    return this;
                }

                public final Builder icon_id(String icon_id) {
                    this.icon_id = icon_id;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EmojiIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EmojiIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.EmojiIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.EmojiIcon((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EmojiIcon value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.code);
                        protoAdapter2.encodeWithTag(writer, 2, value.icon_id);
                        protoAdapter2.encodeWithTag(writer, 3, value.arcade_icon_id);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.EmojiIcon value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(3, value.arcade_icon_id) + protoAdapter2.encodedSizeWithTag(2, value.icon_id) + protoAdapter2.encodedSizeWithTag(1, value.code) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.EmojiIcon redact(InstrumentSelectionBlocker.InstrumentOption.EmojiIcon value) {
                        value.getClass();
                        return InstrumentSelectionBlocker.InstrumentOption.EmojiIcon.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.EmojiIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.arcade_icon_id);
                        protoAdapter2.encodeWithTag(writer, 2, value.icon_id);
                        protoAdapter2.encodeWithTag(writer, 1, value.code);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ EmojiIcon(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ EmojiIcon copy$default(EmojiIcon emojiIcon, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = emojiIcon.code;
                }
                if ((i & 2) != 0) {
                    str2 = emojiIcon.icon_id;
                }
                if ((i & 4) != 0) {
                    str3 = emojiIcon.arcade_icon_id;
                }
                if ((i & 8) != 0) {
                    byteString = emojiIcon.unknownFields();
                }
                return emojiIcon.copy(str, str2, str3, byteString);
            }

            public final EmojiIcon copy(String code, String icon_id, String arcade_icon_id, ByteString unknownFields) {
                unknownFields.getClass();
                return new EmojiIcon(code, icon_id, arcade_icon_id, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EmojiIcon)) {
                    return false;
                }
                EmojiIcon emojiIcon = (EmojiIcon) other;
                return Intrinsics.areEqual(unknownFields(), emojiIcon.unknownFields()) && Intrinsics.areEqual(this.code, emojiIcon.code) && Intrinsics.areEqual(this.icon_id, emojiIcon.icon_id) && Intrinsics.areEqual(this.arcade_icon_id, emojiIcon.arcade_icon_id);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.code;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.icon_id;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.arcade_icon_id;
                int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.code = this.code;
                builder.icon_id = this.icon_id;
                builder.arcade_icon_id = this.arcade_icon_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.code;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "code=", arrayList);
                }
                String str2 = this.icon_id;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_id=", arrayList);
                }
                String str3 = this.arcade_icon_id;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "arcade_icon_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EmojiIcon{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ EmojiIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public EmojiIcon() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmojiIcon(String str, String str2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.code = str;
                this.icon_id = str2;
                this.arcade_icon_id = str3;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NewLinkIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<NewLinkIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                @Override // com.squareup.wire.Message.Builder
                public NewLinkIcon build() {
                    return new NewLinkIcon(buildUnknownFields());
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NewLinkIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon(reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            reader.readUnknownField(nextTag);
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon value) {
                        value.getClass();
                        return value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon redact(InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon value) {
                        value.getClass();
                        return value.copy(ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.InstrumentOption.NewLinkIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ NewLinkIcon(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ NewLinkIcon copy$default(NewLinkIcon newLinkIcon, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    byteString = newLinkIcon.unknownFields();
                }
                return newLinkIcon.copy(byteString);
            }

            public final NewLinkIcon copy(ByteString unknownFields) {
                unknownFields.getClass();
                return new NewLinkIcon(unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                return (other instanceof NewLinkIcon) && Intrinsics.areEqual(unknownFields(), ((NewLinkIcon) other).unknownFields());
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
                return "NewLinkIcon{}";
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ NewLinkIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NewLinkIcon() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewLinkIcon(ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "", "<init>", "()V", "NewLinkIcon", "CardIcon", "BankIcon", "BalanceIcon", "AppIcon", "DigitalWalletIcon", "EmojiIcon", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$AppIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$BalanceIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$BankIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$CardIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$DigitalWalletIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$EmojiIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$NewLinkIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class IconStyle {

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$AppIcon#ADAPTER", declaredName = "app_icon", tag = 14)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$AppIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$AppIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class AppIcon extends IconStyle {
                private final AppIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AppIcon(AppIcon appIcon) {
                    super(null);
                    appIcon.getClass();
                    this.value = appIcon;
                }

                public static /* synthetic */ AppIcon copy$default(AppIcon appIcon, AppIcon appIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        appIcon2 = appIcon.value;
                    }
                    return appIcon.copy(appIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final AppIcon getValue() {
                    return this.value;
                }

                public final AppIcon copy(AppIcon value) {
                    value.getClass();
                    return new AppIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AppIcon) && Intrinsics.areEqual(this.value, ((AppIcon) other).value);
                }

                public final AppIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "AppIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$BalanceIcon#ADAPTER", declaredName = "balance_icon", tag = 13)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$BalanceIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BalanceIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class BalanceIcon extends IconStyle {
                private final BalanceIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BalanceIcon(BalanceIcon balanceIcon) {
                    super(null);
                    balanceIcon.getClass();
                    this.value = balanceIcon;
                }

                public static /* synthetic */ BalanceIcon copy$default(BalanceIcon balanceIcon, BalanceIcon balanceIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        balanceIcon2 = balanceIcon.value;
                    }
                    return balanceIcon.copy(balanceIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final BalanceIcon getValue() {
                    return this.value;
                }

                public final BalanceIcon copy(BalanceIcon value) {
                    value.getClass();
                    return new BalanceIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BalanceIcon) && Intrinsics.areEqual(this.value, ((BalanceIcon) other).value);
                }

                public final BalanceIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "BalanceIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$BankIcon#ADAPTER", declaredName = "bank_icon", tag = 11)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$BankIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$BankIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class BankIcon extends IconStyle {
                private final BankIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BankIcon(BankIcon bankIcon) {
                    super(null);
                    bankIcon.getClass();
                    this.value = bankIcon;
                }

                public static /* synthetic */ BankIcon copy$default(BankIcon bankIcon, BankIcon bankIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        bankIcon2 = bankIcon.value;
                    }
                    return bankIcon.copy(bankIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final BankIcon getValue() {
                    return this.value;
                }

                public final BankIcon copy(BankIcon value) {
                    value.getClass();
                    return new BankIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BankIcon) && Intrinsics.areEqual(this.value, ((BankIcon) other).value);
                }

                public final BankIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "BankIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$CardIcon#ADAPTER", declaredName = "card_icon", tag = 10)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$CardIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$CardIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class CardIcon extends IconStyle {
                private final CardIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CardIcon(CardIcon cardIcon) {
                    super(null);
                    cardIcon.getClass();
                    this.value = cardIcon;
                }

                public static /* synthetic */ CardIcon copy$default(CardIcon cardIcon, CardIcon cardIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        cardIcon2 = cardIcon.value;
                    }
                    return cardIcon.copy(cardIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final CardIcon getValue() {
                    return this.value;
                }

                public final CardIcon copy(CardIcon value) {
                    value.getClass();
                    return new CardIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CardIcon) && Intrinsics.areEqual(this.value, ((CardIcon) other).value);
                }

                public final CardIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "CardIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon#ADAPTER", declaredName = "digital_wallet_icon", tag = 15)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$DigitalWalletIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DigitalWalletIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class DigitalWalletIcon extends IconStyle {
                private final DigitalWalletIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DigitalWalletIcon(DigitalWalletIcon digitalWalletIcon) {
                    super(null);
                    digitalWalletIcon.getClass();
                    this.value = digitalWalletIcon;
                }

                public static /* synthetic */ DigitalWalletIcon copy$default(DigitalWalletIcon digitalWalletIcon, DigitalWalletIcon digitalWalletIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        digitalWalletIcon2 = digitalWalletIcon.value;
                    }
                    return digitalWalletIcon.copy(digitalWalletIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final DigitalWalletIcon getValue() {
                    return this.value;
                }

                public final DigitalWalletIcon copy(DigitalWalletIcon value) {
                    value.getClass();
                    return new DigitalWalletIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DigitalWalletIcon) && Intrinsics.areEqual(this.value, ((DigitalWalletIcon) other).value);
                }

                public final DigitalWalletIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "DigitalWalletIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EmojiIcon#ADAPTER", declaredName = "emoji_icon", tag = 16)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$EmojiIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EmojiIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class EmojiIcon extends IconStyle {
                private final EmojiIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EmojiIcon(EmojiIcon emojiIcon) {
                    super(null);
                    emojiIcon.getClass();
                    this.value = emojiIcon;
                }

                public static /* synthetic */ EmojiIcon copy$default(EmojiIcon emojiIcon, EmojiIcon emojiIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        emojiIcon2 = emojiIcon.value;
                    }
                    return emojiIcon.copy(emojiIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final EmojiIcon getValue() {
                    return this.value;
                }

                public final EmojiIcon copy(EmojiIcon value) {
                    value.getClass();
                    return new EmojiIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EmojiIcon) && Intrinsics.areEqual(this.value, ((EmojiIcon) other).value);
                }

                public final EmojiIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EmojiIcon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon#ADAPTER", declaredName = "new_link_icon", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle$NewLinkIcon;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$IconStyle;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$NewLinkIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class NewLinkIcon extends IconStyle {
                private final NewLinkIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NewLinkIcon(NewLinkIcon newLinkIcon) {
                    super(null);
                    newLinkIcon.getClass();
                    this.value = newLinkIcon;
                }

                public static /* synthetic */ NewLinkIcon copy$default(NewLinkIcon newLinkIcon, NewLinkIcon newLinkIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        newLinkIcon2 = newLinkIcon.value;
                    }
                    return newLinkIcon.copy(newLinkIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final NewLinkIcon getValue() {
                    return this.value;
                }

                public final NewLinkIcon copy(NewLinkIcon value) {
                    value.getClass();
                    return new NewLinkIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NewLinkIcon) && Intrinsics.areEqual(this.value, ((NewLinkIcon) other).value);
                }

                public final NewLinkIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "NewLinkIcon(value=" + this.value + ")";
                }
            }

            public /* synthetic */ IconStyle(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IconStyle() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State;", "", "<init>", "()V", "EnabledState", "DisabledState", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State$DisabledState;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State$EnabledState;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class State {

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$DisabledState#ADAPTER", declaredName = "disabled_state", tag = 9)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State$DisabledState;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$DisabledState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class DisabledState extends State {
                private final DisabledState value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DisabledState(DisabledState disabledState) {
                    super(null);
                    disabledState.getClass();
                    this.value = disabledState;
                }

                public static /* synthetic */ DisabledState copy$default(DisabledState disabledState, DisabledState disabledState2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        disabledState2 = disabledState.value;
                    }
                    return disabledState.copy(disabledState2);
                }

                /* renamed from: component1, reason: from getter */
                public final DisabledState getValue() {
                    return this.value;
                }

                public final DisabledState copy(DisabledState value) {
                    value.getClass();
                    return new DisabledState(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DisabledState) && Intrinsics.areEqual(this.value, ((DisabledState) other).value);
                }

                public final DisabledState getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "DisabledState(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$InstrumentOption$EnabledState#ADAPTER", declaredName = "enabled_state", tag = 8)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State$EnabledState;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$State;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$InstrumentOption$EnabledState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class EnabledState extends State {
                private final EnabledState value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EnabledState(EnabledState enabledState) {
                    super(null);
                    enabledState.getClass();
                    this.value = enabledState;
                }

                public static /* synthetic */ EnabledState copy$default(EnabledState enabledState, EnabledState enabledState2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        enabledState2 = enabledState.value;
                    }
                    return enabledState.copy(enabledState2);
                }

                /* renamed from: component1, reason: from getter */
                public final EnabledState getValue() {
                    return this.value;
                }

                public final EnabledState copy(EnabledState value) {
                    value.getClass();
                    return new EnabledState(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof EnabledState) && Intrinsics.areEqual(this.value, ((EnabledState) other).value);
                }

                public final EnabledState getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "EnabledState(value=" + this.value + ")";
                }
            }

            public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private State() {
            }
        }

        public InstrumentOption() {
            this(null, null, null, null, null, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentOption(Image image, IconStyle iconStyle, OptionStyle optionStyle, String str, String str2, String str3, String str4, String str5, State state, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = image;
            this.icon_style = iconStyle;
            this.option_style = optionStyle;
            this.list_title = str;
            this.list_subtitle_primary = str2;
            this.list_subtitle_suffix = str3;
            this.list_pill_text = str4;
            this.list_accessibility_label = str5;
            this.state = state;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InstrumentSelectionBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37 */
            /* JADX WARN: Type inference failed for: r0v38 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentSelectionBlocker decode(ProtoReader reader) {
                String str;
                Integer num;
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction;
                ?? decode;
                InstrumentSelectionBlocker.PreselectedOptionAction showOptionsAction;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                String str2 = null;
                String str3 = null;
                Integer num2 = null;
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction2 = null;
                String str4 = null;
                Integer num3 = null;
                Boolean bool = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Boolean bool2 = null;
                InstrumentSelectionBlocker.SubmissionEndpoint submissionEndpoint = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InstrumentSelectionBlocker(str2, str3, m, num2, preselectedOptionAction2, str4, arrayList, num3, bool, str5, str6, str7, bool2, submissionEndpoint, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 3:
                            str = str3;
                            num = num2;
                            preselectedOptionAction = preselectedOptionAction2;
                            m.add(InstrumentSelectionBlocker.InstrumentOption.ADAPTER.decode(reader));
                            decode = str2;
                            str3 = str;
                            num2 = num;
                            preselectedOptionAction2 = preselectedOptionAction;
                            break;
                        case 4:
                            num2 = ProtoAdapter.UINT32.decode(reader);
                            decode = str2;
                            break;
                        case 5:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 6:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 7:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 8:
                            showOptionsAction = new InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction((InstrumentSelectionBlocker.ShowOptionsAction) InstrumentSelectionBlocker.ShowOptionsAction.ADAPTER.decode(reader));
                            preselectedOptionAction2 = showOptionsAction;
                            decode = str2;
                            break;
                        case 9:
                            showOptionsAction = new InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction((InstrumentSelectionBlocker.ShowDialogAction) InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.decode(reader));
                            preselectedOptionAction2 = showOptionsAction;
                            decode = str2;
                            break;
                        case 10:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str2;
                            break;
                        case 11:
                            str = str3;
                            num = num2;
                            preselectedOptionAction = preselectedOptionAction2;
                            arrayList.add(InstrumentSelectionBlocker.InstrumentOption.ADAPTER.decode(reader));
                            decode = str2;
                            str3 = str;
                            num2 = num;
                            preselectedOptionAction2 = preselectedOptionAction;
                            break;
                        case 12:
                            num3 = ProtoAdapter.UINT32.decode(reader);
                            decode = str2;
                            break;
                        case 13:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str2;
                            break;
                        case 14:
                            try {
                                submissionEndpoint = InstrumentSelectionBlocker.SubmissionEndpoint.ADAPTER.decode(reader);
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                str = str3;
                                num = num2;
                                preselectedOptionAction = preselectedOptionAction2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 15:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            str = str3;
                            num = num2;
                            preselectedOptionAction = preselectedOptionAction2;
                            decode = str2;
                            str3 = str;
                            num2 = num;
                            preselectedOptionAction2 = preselectedOptionAction;
                            break;
                    }
                    str2 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentSelectionBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.header_text);
                protoAdapter2.encodeWithTag(writer, 2, value.submit_button_title);
                ProtoAdapter protoAdapter3 = InstrumentSelectionBlocker.InstrumentOption.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 3, value.options);
                ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
                protoAdapter4.encodeWithTag(writer, 4, value.preselected_option_index);
                protoAdapter2.encodeWithTag(writer, 5, value.selected_instrument_label);
                protoAdapter3.asRepeated().encodeWithTag(writer, 11, value.secondary_options);
                protoAdapter4.encodeWithTag(writer, 12, value.preselected_secondary_option_index);
                ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
                protoAdapter5.encodeWithTag(writer, 13, value.secondary_option_fields_take_precedence);
                protoAdapter2.encodeWithTag(writer, 6, value.list_header_title);
                protoAdapter2.encodeWithTag(writer, 15, value.secondary_list_header_title);
                protoAdapter2.encodeWithTag(writer, 7, value.list_dismiss_button_text);
                protoAdapter5.encodeWithTag(writer, 10, value.use_v2_endpoint);
                InstrumentSelectionBlocker.SubmissionEndpoint.ADAPTER.encodeWithTag(writer, 14, value.submission_endpoint);
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction = value.preselected_option_action;
                if (preselectedOptionAction instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) {
                    InstrumentSelectionBlocker.ShowOptionsAction.ADAPTER.encodeWithTag(writer, 8, ((InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) preselectedOptionAction).getValue());
                } else if (preselectedOptionAction instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) {
                    InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.encodeWithTag(writer, 9, ((InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) preselectedOptionAction).getValue());
                } else if (preselectedOptionAction != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentSelectionBlocker value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value.submit_button_title) + protoAdapter2.encodedSizeWithTag(1, value.header_text) + size$okio;
                ProtoAdapter protoAdapter3 = InstrumentSelectionBlocker.InstrumentOption.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter3.asRepeated().encodedSizeWithTag(3, value.options) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
                int encodedSizeWithTag4 = protoAdapter4.encodedSizeWithTag(4, value.preselected_option_index) + encodedSizeWithTag3;
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction = value.preselected_option_action;
                if (preselectedOptionAction instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) {
                    encodedSizeWithTag = InstrumentSelectionBlocker.ShowOptionsAction.ADAPTER.encodedSizeWithTag(8, ((InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) preselectedOptionAction).getValue());
                } else {
                    if (!(preselectedOptionAction instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction)) {
                        if (preselectedOptionAction != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        int encodedSizeWithTag5 = protoAdapter4.encodedSizeWithTag(12, value.preselected_secondary_option_index) + protoAdapter3.asRepeated().encodedSizeWithTag(11, value.secondary_options) + protoAdapter2.encodedSizeWithTag(5, value.selected_instrument_label) + encodedSizeWithTag4;
                        ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
                        return InstrumentSelectionBlocker.SubmissionEndpoint.ADAPTER.encodedSizeWithTag(14, value.submission_endpoint) + protoAdapter5.encodedSizeWithTag(10, value.use_v2_endpoint) + protoAdapter2.encodedSizeWithTag(7, value.list_dismiss_button_text) + protoAdapter2.encodedSizeWithTag(15, value.secondary_list_header_title) + protoAdapter2.encodedSizeWithTag(6, value.list_header_title) + protoAdapter5.encodedSizeWithTag(13, value.secondary_option_fields_take_precedence) + encodedSizeWithTag5;
                    }
                    encodedSizeWithTag = InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.encodedSizeWithTag(9, ((InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) preselectedOptionAction).getValue());
                }
                encodedSizeWithTag4 += encodedSizeWithTag;
                int encodedSizeWithTag52 = protoAdapter4.encodedSizeWithTag(12, value.preselected_secondary_option_index) + protoAdapter3.asRepeated().encodedSizeWithTag(11, value.secondary_options) + protoAdapter2.encodedSizeWithTag(5, value.selected_instrument_label) + encodedSizeWithTag4;
                ProtoAdapter protoAdapter52 = ProtoAdapter.BOOL;
                return InstrumentSelectionBlocker.SubmissionEndpoint.ADAPTER.encodedSizeWithTag(14, value.submission_endpoint) + protoAdapter52.encodedSizeWithTag(10, value.use_v2_endpoint) + protoAdapter2.encodedSizeWithTag(7, value.list_dismiss_button_text) + protoAdapter2.encodedSizeWithTag(15, value.secondary_list_header_title) + protoAdapter2.encodedSizeWithTag(6, value.list_header_title) + protoAdapter52.encodedSizeWithTag(13, value.secondary_option_fields_take_precedence) + encodedSizeWithTag52;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentSelectionBlocker redact(InstrumentSelectionBlocker value) {
                value.getClass();
                List<InstrumentSelectionBlocker.InstrumentOption> list = value.options;
                ProtoAdapter protoAdapter2 = InstrumentSelectionBlocker.InstrumentOption.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.secondary_options, protoAdapter2);
                ByteString byteString = ByteString.EMPTY;
                String str = value.header_text;
                String str2 = value.submit_button_title;
                Integer num = value.preselected_option_index;
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction = value.preselected_option_action;
                String str3 = value.selected_instrument_label;
                Integer num2 = value.preselected_secondary_option_index;
                Boolean bool = value.secondary_option_fields_take_precedence;
                String str4 = value.list_header_title;
                String str5 = value.secondary_list_header_title;
                String str6 = value.list_dismiss_button_text;
                Boolean bool2 = value.use_v2_endpoint;
                InstrumentSelectionBlocker.SubmissionEndpoint submissionEndpoint = value.submission_endpoint;
                byteString.getClass();
                return new InstrumentSelectionBlocker(str, str2, m1169redactElements, num, preselectedOptionAction, str3, m1169redactElements2, num2, bool, str4, str5, str6, bool2, submissionEndpoint, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InstrumentSelectionBlocker.PreselectedOptionAction preselectedOptionAction = value.preselected_option_action;
                if (preselectedOptionAction instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) {
                    InstrumentSelectionBlocker.ShowOptionsAction.ADAPTER.encodeWithTag(writer, 8, ((InstrumentSelectionBlocker.PreselectedOptionAction.ShowOptionsAction) preselectedOptionAction).getValue());
                } else if (preselectedOptionAction instanceof InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) {
                    InstrumentSelectionBlocker.ShowDialogAction.ADAPTER.encodeWithTag(writer, 9, ((InstrumentSelectionBlocker.PreselectedOptionAction.ShowDialogAction) preselectedOptionAction).getValue());
                } else if (preselectedOptionAction != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                InstrumentSelectionBlocker.SubmissionEndpoint.ADAPTER.encodeWithTag(writer, 14, value.submission_endpoint);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 10, value.use_v2_endpoint);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 7, value.list_dismiss_button_text);
                protoAdapter3.encodeWithTag(writer, 15, value.secondary_list_header_title);
                protoAdapter3.encodeWithTag(writer, 6, value.list_header_title);
                protoAdapter2.encodeWithTag(writer, 13, value.secondary_option_fields_take_precedence);
                ProtoAdapter protoAdapter4 = ProtoAdapter.UINT32;
                protoAdapter4.encodeWithTag(writer, 12, value.preselected_secondary_option_index);
                ProtoAdapter protoAdapter5 = InstrumentSelectionBlocker.InstrumentOption.ADAPTER;
                protoAdapter5.asRepeated().encodeWithTag(writer, 11, value.secondary_options);
                protoAdapter3.encodeWithTag(writer, 5, value.selected_instrument_label);
                protoAdapter4.encodeWithTag(writer, 4, value.preselected_option_index);
                protoAdapter5.asRepeated().encodeWithTag(writer, 3, value.options);
                protoAdapter3.encodeWithTag(writer, 2, value.submit_button_title);
                protoAdapter3.encodeWithTag(writer, 1, value.header_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionBlocker(String str, String str2, List list, Integer num, PreselectedOptionAction preselectedOptionAction, String str3, List list2, Integer num2, Boolean bool, String str4, String str5, String str6, Boolean bool2, SubmissionEndpoint submissionEndpoint, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.header_text = str;
        this.submit_button_title = str2;
        this.preselected_option_index = num;
        this.preselected_option_action = preselectedOptionAction;
        this.selected_instrument_label = str3;
        this.preselected_secondary_option_index = num2;
        this.secondary_option_fields_take_precedence = bool;
        this.list_header_title = str4;
        this.secondary_list_header_title = str5;
        this.list_dismiss_button_text = str6;
        this.use_v2_endpoint = bool2;
        this.submission_endpoint = submissionEndpoint;
        this.options = TransactorKt.immutableCopyOf("options", list);
        this.secondary_options = TransactorKt.immutableCopyOf("secondary_options", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionBlocker)) {
            return false;
        }
        InstrumentSelectionBlocker instrumentSelectionBlocker = (InstrumentSelectionBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentSelectionBlocker.unknownFields()) && Intrinsics.areEqual(this.header_text, instrumentSelectionBlocker.header_text) && Intrinsics.areEqual(this.submit_button_title, instrumentSelectionBlocker.submit_button_title) && Intrinsics.areEqual(this.options, instrumentSelectionBlocker.options) && Intrinsics.areEqual(this.preselected_option_index, instrumentSelectionBlocker.preselected_option_index) && Intrinsics.areEqual(this.preselected_option_action, instrumentSelectionBlocker.preselected_option_action) && Intrinsics.areEqual(this.selected_instrument_label, instrumentSelectionBlocker.selected_instrument_label) && Intrinsics.areEqual(this.secondary_options, instrumentSelectionBlocker.secondary_options) && Intrinsics.areEqual(this.preselected_secondary_option_index, instrumentSelectionBlocker.preselected_secondary_option_index) && Intrinsics.areEqual(this.secondary_option_fields_take_precedence, instrumentSelectionBlocker.secondary_option_fields_take_precedence) && Intrinsics.areEqual(this.list_header_title, instrumentSelectionBlocker.list_header_title) && Intrinsics.areEqual(this.secondary_list_header_title, instrumentSelectionBlocker.secondary_list_header_title) && Intrinsics.areEqual(this.list_dismiss_button_text, instrumentSelectionBlocker.list_dismiss_button_text) && Intrinsics.areEqual(this.use_v2_endpoint, instrumentSelectionBlocker.use_v2_endpoint) && this.submission_endpoint == instrumentSelectionBlocker.submission_endpoint;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.submit_button_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.options);
        Integer num = this.preselected_option_index;
        int hashCode3 = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        PreselectedOptionAction preselectedOptionAction = this.preselected_option_action;
        int hashCode4 = (hashCode3 + (preselectedOptionAction != null ? preselectedOptionAction.hashCode() : 0)) * 37;
        String str3 = this.selected_instrument_label;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.secondary_options);
        Integer num2 = this.preselected_secondary_option_index;
        int hashCode5 = (m2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Boolean bool = this.secondary_option_fields_take_precedence;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.list_header_title;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.secondary_list_header_title;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.list_dismiss_button_text;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool2 = this.use_v2_endpoint;
        int hashCode10 = (hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        SubmissionEndpoint submissionEndpoint = this.submission_endpoint;
        int hashCode11 = hashCode10 + (submissionEndpoint != null ? submissionEndpoint.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_text = this.header_text;
        builder.submit_button_title = this.submit_button_title;
        builder.options = this.options;
        builder.preselected_option_index = this.preselected_option_index;
        builder.preselected_option_action = this.preselected_option_action;
        builder.selected_instrument_label = this.selected_instrument_label;
        builder.secondary_options = this.secondary_options;
        builder.preselected_secondary_option_index = this.preselected_secondary_option_index;
        builder.secondary_option_fields_take_precedence = this.secondary_option_fields_take_precedence;
        builder.list_header_title = this.list_header_title;
        builder.secondary_list_header_title = this.secondary_list_header_title;
        builder.list_dismiss_button_text = this.list_dismiss_button_text;
        builder.use_v2_endpoint = this.use_v2_endpoint;
        builder.submission_endpoint = this.submission_endpoint;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
        }
        String str2 = this.submit_button_title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "submit_button_title=", arrayList);
        }
        if (!this.options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("options=", arrayList, this.options);
        }
        Integer num = this.preselected_option_index;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("preselected_option_index=", num, arrayList);
        }
        PreselectedOptionAction preselectedOptionAction = this.preselected_option_action;
        if (preselectedOptionAction != null) {
            arrayList.add("preselected_option_action=" + preselectedOptionAction);
        }
        String str3 = this.selected_instrument_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "selected_instrument_label=", arrayList);
        }
        if (!this.secondary_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("secondary_options=", arrayList, this.secondary_options);
        }
        Integer num2 = this.preselected_secondary_option_index;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("preselected_secondary_option_index=", num2, arrayList);
        }
        Boolean bool = this.secondary_option_fields_take_precedence;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_option_fields_take_precedence=", bool, arrayList);
        }
        String str4 = this.list_header_title;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "list_header_title=", arrayList);
        }
        String str5 = this.secondary_list_header_title;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "secondary_list_header_title=", arrayList);
        }
        String str6 = this.list_dismiss_button_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "list_dismiss_button_text=", arrayList);
        }
        Boolean bool2 = this.use_v2_endpoint;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_v2_endpoint=", bool2, arrayList);
        }
        SubmissionEndpoint submissionEndpoint = this.submission_endpoint;
        if (submissionEndpoint != null) {
            arrayList.add("submission_endpoint=" + submissionEndpoint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentSelectionBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$OptionStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "INELIGIBLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class OptionStyle implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OptionStyle[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final OptionStyle NORMAL = new OptionStyle("NORMAL", 0, 1);
        public static final OptionStyle INELIGIBLE = new OptionStyle("INELIGIBLE", 1, 2);

        private static final /* synthetic */ OptionStyle[] $values() {
            return new OptionStyle[]{NORMAL, INELIGIBLE};
        }

        static {
            OptionStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OptionStyle.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$OptionStyle$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public InstrumentSelectionBlocker.OptionStyle fromValue(int value) {
                    return InstrumentSelectionBlocker.OptionStyle.INSTANCE.fromValue(value);
                }
            };
        }

        private OptionStyle(String str, int i, int i2) {
            this.value = i2;
        }

        public static final OptionStyle fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static OptionStyle valueOf(String str) {
            return (OptionStyle) Enum.valueOf(OptionStyle.class, str);
        }

        public static OptionStyle[] values() {
            return (OptionStyle[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$OptionStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$OptionStyle;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final OptionStyle fromValue(int value) {
                if (value == 1) {
                    return OptionStyle.NORMAL;
                }
                if (value != 2) {
                    return null;
                }
                return OptionStyle.INELIGIBLE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction$Builder;", "title", "", "body", "submit_button_text", "blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "dismiss_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/BlockerAction;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ShowDialogAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShowDialogAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 3, tag = 5)
        public final BlockerAction blocker_action;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 4)
        public final String dismiss_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String submit_button_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "<init>", "()V", "title", "", "body", "submit_button_text", "blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "dismiss_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public BlockerAction blocker_action;
            public String body;
            public String dismiss_button_text;
            public String submit_button_text;
            public String title;

            public final Builder blocker_action(BlockerAction blocker_action) {
                this.blocker_action = blocker_action;
                return this;
            }

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ShowDialogAction build() {
                return new ShowDialogAction(this.title, this.body, this.submit_button_text, this.blocker_action, this.dismiss_button_text, buildUnknownFields());
            }

            public final Builder dismiss_button_text(String dismiss_button_text) {
                this.dismiss_button_text = dismiss_button_text;
                return this;
            }

            public final Builder submit_button_text(String submit_button_text) {
                this.submit_button_text = submit_button_text;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShowDialogAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$ShowDialogAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlocker.ShowDialogAction decode(ProtoReader reader) {
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
                            return new InstrumentSelectionBlocker.ShowDialogAction((String) obj, (String) obj2, (String) obj3, (BlockerAction) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj5 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlocker.ShowDialogAction value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 3, value.submit_button_text);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 5, value.blocker_action);
                    protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlocker.ShowDialogAction value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.dismiss_button_text) + BlockerAction.ADAPTER.encodedSizeWithTag(5, value.blocker_action) + protoAdapter2.encodedSizeWithTag(3, value.submit_button_text) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlocker.ShowDialogAction redact(InstrumentSelectionBlocker.ShowDialogAction value) {
                    value.getClass();
                    BlockerAction blockerAction = value.blocker_action;
                    return InstrumentSelectionBlocker.ShowDialogAction.copy$default(value, null, null, null, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, null, ByteString.EMPTY, 20, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.ShowDialogAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_text);
                    BlockerAction.ADAPTER.encodeWithTag(writer, 5, value.blocker_action);
                    protoAdapter2.encodeWithTag(writer, 3, value.submit_button_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShowDialogAction(String str, String str2, String str3, BlockerAction blockerAction, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : blockerAction, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShowDialogAction copy$default(ShowDialogAction showDialogAction, String str, String str2, String str3, BlockerAction blockerAction, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showDialogAction.title;
            }
            if ((i & 2) != 0) {
                str2 = showDialogAction.body;
            }
            if ((i & 4) != 0) {
                str3 = showDialogAction.submit_button_text;
            }
            if ((i & 8) != 0) {
                blockerAction = showDialogAction.blocker_action;
            }
            if ((i & 16) != 0) {
                str4 = showDialogAction.dismiss_button_text;
            }
            if ((i & 32) != 0) {
                byteString = showDialogAction.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            return showDialogAction.copy(str, str2, str3, blockerAction, str5, byteString2);
        }

        public final ShowDialogAction copy(String title, String body, String submit_button_text, BlockerAction blocker_action, String dismiss_button_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new ShowDialogAction(title, body, submit_button_text, blocker_action, dismiss_button_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShowDialogAction)) {
                return false;
            }
            ShowDialogAction showDialogAction = (ShowDialogAction) other;
            return Intrinsics.areEqual(unknownFields(), showDialogAction.unknownFields()) && Intrinsics.areEqual(this.title, showDialogAction.title) && Intrinsics.areEqual(this.body, showDialogAction.body) && Intrinsics.areEqual(this.submit_button_text, showDialogAction.submit_button_text) && Intrinsics.areEqual(this.blocker_action, showDialogAction.blocker_action) && Intrinsics.areEqual(this.dismiss_button_text, showDialogAction.dismiss_button_text);
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
            String str3 = this.submit_button_text;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            BlockerAction blockerAction = this.blocker_action;
            int hashCode5 = (hashCode4 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
            String str4 = this.dismiss_button_text;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body = this.body;
            builder.submit_button_text = this.submit_button_text;
            builder.blocker_action = this.blocker_action;
            builder.dismiss_button_text = this.dismiss_button_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.body != null) {
                arrayList.add("body=██");
            }
            String str = this.submit_button_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "submit_button_text=", arrayList);
            }
            BlockerAction blockerAction = this.blocker_action;
            if (blockerAction != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("blocker_action=", blockerAction, arrayList);
            }
            String str2 = this.dismiss_button_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dismiss_button_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShowDialogAction{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShowDialogAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ShowDialogAction() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDialogAction(String str, String str2, String str3, BlockerAction blockerAction, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.submit_button_text = str3;
            this.blocker_action = blockerAction;
            this.dismiss_button_text = str4;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0082\u0004J\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction$Builder;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ShowOptionsAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShowOptionsAction> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;", "<init>", "()V", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            @Override // com.squareup.wire.Message.Builder
            public ShowOptionsAction build() {
                return new ShowOptionsAction(buildUnknownFields());
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShowOptionsAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$ShowOptionsAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlocker.ShowOptionsAction decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InstrumentSelectionBlocker.ShowOptionsAction(reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        reader.readUnknownField(nextTag);
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InstrumentSelectionBlocker.ShowOptionsAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InstrumentSelectionBlocker.ShowOptionsAction value) {
                    value.getClass();
                    return value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InstrumentSelectionBlocker.ShowOptionsAction redact(InstrumentSelectionBlocker.ShowOptionsAction value) {
                    value.getClass();
                    return value.copy(ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InstrumentSelectionBlocker.ShowOptionsAction value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShowOptionsAction(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShowOptionsAction copy$default(ShowOptionsAction showOptionsAction, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                byteString = showOptionsAction.unknownFields();
            }
            return showOptionsAction.copy(byteString);
        }

        public final ShowOptionsAction copy(ByteString unknownFields) {
            unknownFields.getClass();
            return new ShowOptionsAction(unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof ShowOptionsAction) && Intrinsics.areEqual(unknownFields(), ((ShowOptionsAction) other).unknownFields());
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
            return "ShowOptionsAction{}";
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShowOptionsAction build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ShowOptionsAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowOptionsAction(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$SubmissionEndpoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUBMISSION_ENDPOINT_UNSPECIFIED", "V_2_0_SELECT_INSTRUMENT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SubmissionEndpoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SubmissionEndpoint[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SubmissionEndpoint SUBMISSION_ENDPOINT_UNSPECIFIED;
        public static final SubmissionEndpoint V_2_0_SELECT_INSTRUMENT;
        private final int value;

        private static final /* synthetic */ SubmissionEndpoint[] $values() {
            return new SubmissionEndpoint[]{SUBMISSION_ENDPOINT_UNSPECIFIED, V_2_0_SELECT_INSTRUMENT};
        }

        static {
            final SubmissionEndpoint submissionEndpoint = new SubmissionEndpoint("SUBMISSION_ENDPOINT_UNSPECIFIED", 0, 0);
            SUBMISSION_ENDPOINT_UNSPECIFIED = submissionEndpoint;
            V_2_0_SELECT_INSTRUMENT = new SubmissionEndpoint("V_2_0_SELECT_INSTRUMENT", 1, 2);
            SubmissionEndpoint[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmissionEndpoint.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, submissionEndpoint) { // from class: com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$SubmissionEndpoint$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public InstrumentSelectionBlocker.SubmissionEndpoint fromValue(int value) {
                    return InstrumentSelectionBlocker.SubmissionEndpoint.INSTANCE.fromValue(value);
                }
            };
        }

        private SubmissionEndpoint(String str, int i, int i2) {
            this.value = i2;
        }

        public static final SubmissionEndpoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static SubmissionEndpoint valueOf(String str) {
            return (SubmissionEndpoint) Enum.valueOf(SubmissionEndpoint.class, str);
        }

        public static SubmissionEndpoint[] values() {
            return (SubmissionEndpoint[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$SubmissionEndpoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$SubmissionEndpoint;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SubmissionEndpoint fromValue(int value) {
                if (value == 0) {
                    return SubmissionEndpoint.SUBMISSION_ENDPOINT_UNSPECIFIED;
                }
                if (value != 2) {
                    return null;
                }
                return SubmissionEndpoint.V_2_0_SELECT_INSTRUMENT;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InstrumentSelectionBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction;", "", "<init>", "()V", "ShowOptionsAction", "ShowDialogAction", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction$ShowDialogAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction$ShowOptionsAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static abstract class PreselectedOptionAction {

        @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$ShowDialogAction#ADAPTER", declaredName = "show_dialog_action", tag = 9)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction$ShowDialogAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowDialogAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowDialogAction extends PreselectedOptionAction {
            private final ShowDialogAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowDialogAction(ShowDialogAction showDialogAction) {
                super(null);
                showDialogAction.getClass();
                this.value = showDialogAction;
            }

            public static /* synthetic */ ShowDialogAction copy$default(ShowDialogAction showDialogAction, ShowDialogAction showDialogAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    showDialogAction2 = showDialogAction.value;
                }
                return showDialogAction.copy(showDialogAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final ShowDialogAction getValue() {
                return this.value;
            }

            public final ShowDialogAction copy(ShowDialogAction value) {
                value.getClass();
                return new ShowDialogAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowDialogAction) && Intrinsics.areEqual(this.value, ((ShowDialogAction) other).value);
            }

            public final ShowDialogAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowDialogAction(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.blockers.InstrumentSelectionBlocker$ShowOptionsAction#ADAPTER", declaredName = "show_options_action", tag = 8)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction$ShowOptionsAction;", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$PreselectedOptionAction;", "value", "Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;", "<init>", "(Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;)V", "getValue", "()Lcom/squareup/protos/franklin/blockers/InstrumentSelectionBlocker$ShowOptionsAction;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ShowOptionsAction extends PreselectedOptionAction {
            private final ShowOptionsAction value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowOptionsAction(ShowOptionsAction showOptionsAction) {
                super(null);
                showOptionsAction.getClass();
                this.value = showOptionsAction;
            }

            public static /* synthetic */ ShowOptionsAction copy$default(ShowOptionsAction showOptionsAction, ShowOptionsAction showOptionsAction2, int i, Object obj) {
                if ((i & 1) != 0) {
                    showOptionsAction2 = showOptionsAction.value;
                }
                return showOptionsAction.copy(showOptionsAction2);
            }

            /* renamed from: component1, reason: from getter */
            public final ShowOptionsAction getValue() {
                return this.value;
            }

            public final ShowOptionsAction copy(ShowOptionsAction value) {
                value.getClass();
                return new ShowOptionsAction(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowOptionsAction) && Intrinsics.areEqual(this.value, ((ShowOptionsAction) other).value);
            }

            public final ShowOptionsAction getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShowOptionsAction(value=" + this.value + ")";
            }
        }

        public /* synthetic */ PreselectedOptionAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PreselectedOptionAction() {
        }
    }
}
