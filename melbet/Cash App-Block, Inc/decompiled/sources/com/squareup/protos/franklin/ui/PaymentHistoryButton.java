package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007)(*+,-.R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0005¨\u0006/"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Builder;", "", "text", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ButtonAction;", "action", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ButtonAction;", "url", "tel_number", "Lcom/squareup/protos/franklin/api/ClientScenario;", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Icon;", "icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Icon;", "getIcon$annotations", "()V", "Lcom/squareup/protos/cash/ui/Icon;", "arcade_icon", "Lcom/squareup/protos/cash/ui/Icon;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "support_flow_node", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "recurring_frequency", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "opaque_data", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "dialog", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "share_sheet_details", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$UrlType;", "url_type", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$UrlType;", "accessibility_text", "Companion", "Builder", "ButtonAction", "Icon", "Dialog", "ShareSheetDetails", "UrlType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentHistoryButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentHistoryButton> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 15)
    public final String accessibility_text;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton$ButtonAction#ADAPTER", schemaIndex = 1, tag = 2)
    public final ButtonAction action;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 6, tag = 14)
    public final com.squareup.protos.cash.ui.Icon arcade_icon;

    @WireField(adapter = "com.squareup.protos.franklin.api.ClientScenario#ADAPTER", schemaIndex = 4, tag = 5)
    public final ClientScenario client_scenario;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton$Dialog#ADAPTER", schemaIndex = 11, tag = 11)
    public final Dialog dialog;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton$Icon#ADAPTER", schemaIndex = 5, tag = 6)
    public final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 10)
    public final String opaque_data;

    @WireField(adapter = "com.squareup.protos.repeatedly.common.RecurringSchedule$Frequency#ADAPTER", schemaIndex = 9, tag = 9)
    public final RecurringSchedule.Frequency recurring_frequency;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton$ShareSheetDetails#ADAPTER", schemaIndex = 12, tag = 12)
    public final ShareSheetDetails share_sheet_details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 8)
    public final String support_flow_node;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String tel_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String text;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData$UiStatusTreatment#ADAPTER", schemaIndex = 7, tag = 7)
    public final PaymentHistoryData.UiStatusTreatment treatment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String url;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton$UrlType#ADAPTER", schemaIndex = 13, tag = 13)
    public final UrlType url_type;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "<init>", "()V", "text", "", "action", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ButtonAction;", "url", "tel_number", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "icon", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Icon;", "arcade_icon", "Lcom/squareup/protos/cash/ui/Icon;", "treatment", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData$UiStatusTreatment;", "support_flow_node", "recurring_frequency", "Lcom/squareup/protos/repeatedly/common/RecurringSchedule$Frequency;", "opaque_data", "dialog", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "share_sheet_details", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "url_type", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$UrlType;", "accessibility_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accessibility_text;
        public ButtonAction action;
        public com.squareup.protos.cash.ui.Icon arcade_icon;
        public ClientScenario client_scenario;
        public Dialog dialog;
        public Icon icon;
        public String opaque_data;
        public RecurringSchedule.Frequency recurring_frequency;
        public ShareSheetDetails share_sheet_details;
        public String support_flow_node;
        public String tel_number;
        public String text;
        public PaymentHistoryData.UiStatusTreatment treatment;
        public String url;
        public UrlType url_type;

        public final Builder accessibility_text(String accessibility_text) {
            this.accessibility_text = accessibility_text;
            return this;
        }

        public final Builder action(ButtonAction action) {
            this.action = action;
            return this;
        }

        public final Builder arcade_icon(com.squareup.protos.cash.ui.Icon arcade_icon) {
            this.arcade_icon = arcade_icon;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaymentHistoryButton build() {
            return new PaymentHistoryButton(this.text, this.action, this.url, this.tel_number, this.client_scenario, this.icon, this.arcade_icon, this.treatment, this.support_flow_node, this.recurring_frequency, this.opaque_data, this.dialog, this.share_sheet_details, this.url_type, this.accessibility_text, buildUnknownFields());
        }

        public final Builder client_scenario(ClientScenario client_scenario) {
            this.client_scenario = client_scenario;
            return this;
        }

        public final Builder dialog(Dialog dialog) {
            this.dialog = dialog;
            return this;
        }

        @Deprecated
        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder opaque_data(String opaque_data) {
            this.opaque_data = opaque_data;
            return this;
        }

        public final Builder recurring_frequency(RecurringSchedule.Frequency recurring_frequency) {
            this.recurring_frequency = recurring_frequency;
            return this;
        }

        public final Builder share_sheet_details(ShareSheetDetails share_sheet_details) {
            this.share_sheet_details = share_sheet_details;
            return this;
        }

        public final Builder support_flow_node(String support_flow_node) {
            this.support_flow_node = support_flow_node;
            return this;
        }

        public final Builder tel_number(String tel_number) {
            this.tel_number = tel_number;
            return this;
        }

        public final Builder text(String text) {
            this.text = text;
            return this;
        }

        public final Builder treatment(PaymentHistoryData.UiStatusTreatment treatment) {
            this.treatment = treatment;
            return this;
        }

        public final Builder url(String url) {
            this.url = url;
            return this;
        }

        public final Builder url_type(UrlType url_type) {
            this.url_type = url_type;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentHistoryButton.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryButton$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v50 */
            /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v53 */
            /* JADX WARN: Type inference failed for: r0v54 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryButton decode(ProtoReader reader) {
                String str;
                String str2;
                ClientScenario clientScenario;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str3 = null;
                Object obj = null;
                String str4 = null;
                String str5 = null;
                ClientScenario clientScenario2 = null;
                PaymentHistoryButton.Icon icon = null;
                Object obj2 = null;
                PaymentHistoryData.UiStatusTreatment uiStatusTreatment = null;
                String str6 = null;
                RecurringSchedule.Frequency frequency = null;
                String str7 = null;
                Object obj3 = null;
                PaymentHistoryButton.UrlType urlType = null;
                String str8 = null;
                PaymentHistoryButton.ButtonAction buttonAction = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentHistoryButton(str3, buttonAction, str4, str5, clientScenario2, icon, (Icon) obj2, uiStatusTreatment, str6, frequency, str7, (PaymentHistoryButton.Dialog) obj3, (PaymentHistoryButton.ShareSheetDetails) obj, urlType, str8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str = str4;
                            str2 = str5;
                            clientScenario = clientScenario2;
                            try {
                                buttonAction = PaymentHistoryButton.ButtonAction.ADAPTER.decode(reader);
                                str4 = str;
                                str5 = str2;
                                clientScenario2 = clientScenario;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 4:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 5:
                            str = str4;
                            str2 = str5;
                            clientScenario = clientScenario2;
                            try {
                                clientScenario2 = ClientScenario.ADAPTER.decode(reader);
                                str4 = str;
                                str5 = str2;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 6:
                            str = str4;
                            str2 = str5;
                            clientScenario = clientScenario2;
                            try {
                                icon = PaymentHistoryButton.Icon.ADAPTER.decode(reader);
                                str4 = str;
                                str5 = str2;
                                clientScenario2 = clientScenario;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 7:
                            str = str4;
                            str2 = str5;
                            clientScenario = clientScenario2;
                            try {
                                uiStatusTreatment = PaymentHistoryData.UiStatusTreatment.ADAPTER.decode(reader);
                                str4 = str;
                                str5 = str2;
                                clientScenario2 = clientScenario;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 8:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 9:
                            str = str4;
                            str2 = str5;
                            clientScenario = clientScenario2;
                            try {
                                frequency = RecurringSchedule.Frequency.ADAPTER.decode(reader);
                                str4 = str;
                                str5 = str2;
                                clientScenario2 = clientScenario;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 10:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 11:
                            obj3 = TransactorKt.decodeMessageOrMerge(PaymentHistoryButton.Dialog.ADAPTER, reader, obj3);
                            decode = str3;
                            break;
                        case 12:
                            obj = TransactorKt.decodeMessageOrMerge(PaymentHistoryButton.ShareSheetDetails.ADAPTER, reader, obj);
                            decode = str3;
                            break;
                        case 13:
                            try {
                                urlType = PaymentHistoryButton.UrlType.ADAPTER.decode(reader);
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                str = str4;
                                str2 = str5;
                                clientScenario = clientScenario2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                break;
                            }
                        case 14:
                            obj2 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj2);
                            decode = str3;
                            break;
                        case 15:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            str = str4;
                            str2 = str5;
                            clientScenario = clientScenario2;
                            decode = str3;
                            str4 = str;
                            str5 = str2;
                            clientScenario2 = clientScenario;
                            break;
                    }
                    str3 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentHistoryButton value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.text);
                PaymentHistoryButton.ButtonAction.ADAPTER.encodeWithTag(writer, 2, value.action);
                protoAdapter2.encodeWithTag(writer, 3, value.url);
                protoAdapter2.encodeWithTag(writer, 4, value.tel_number);
                ClientScenario.ADAPTER.encodeWithTag(writer, 5, value.client_scenario);
                PaymentHistoryButton.Icon.ADAPTER.encodeWithTag(writer, 6, value.icon);
                Icon.ADAPTER.encodeWithTag(writer, 14, value.arcade_icon);
                PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(writer, 7, value.treatment);
                protoAdapter2.encodeWithTag(writer, 8, value.support_flow_node);
                RecurringSchedule.Frequency.ADAPTER.encodeWithTag(writer, 9, value.recurring_frequency);
                protoAdapter2.encodeWithTag(writer, 10, value.opaque_data);
                PaymentHistoryButton.Dialog.ADAPTER.encodeWithTag(writer, 11, value.dialog);
                PaymentHistoryButton.ShareSheetDetails.ADAPTER.encodeWithTag(writer, 12, value.share_sheet_details);
                PaymentHistoryButton.UrlType.ADAPTER.encodeWithTag(writer, 13, value.url_type);
                protoAdapter2.encodeWithTag(writer, 15, value.accessibility_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentHistoryButton value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(15, value.accessibility_text) + PaymentHistoryButton.UrlType.ADAPTER.encodedSizeWithTag(13, value.url_type) + PaymentHistoryButton.ShareSheetDetails.ADAPTER.encodedSizeWithTag(12, value.share_sheet_details) + PaymentHistoryButton.Dialog.ADAPTER.encodedSizeWithTag(11, value.dialog) + protoAdapter2.encodedSizeWithTag(10, value.opaque_data) + RecurringSchedule.Frequency.ADAPTER.encodedSizeWithTag(9, value.recurring_frequency) + protoAdapter2.encodedSizeWithTag(8, value.support_flow_node) + PaymentHistoryData.UiStatusTreatment.ADAPTER.encodedSizeWithTag(7, value.treatment) + Icon.ADAPTER.encodedSizeWithTag(14, value.arcade_icon) + PaymentHistoryButton.Icon.ADAPTER.encodedSizeWithTag(6, value.icon) + ClientScenario.ADAPTER.encodedSizeWithTag(5, value.client_scenario) + protoAdapter2.encodedSizeWithTag(4, value.tel_number) + protoAdapter2.encodedSizeWithTag(3, value.url) + PaymentHistoryButton.ButtonAction.ADAPTER.encodedSizeWithTag(2, value.action) + protoAdapter2.encodedSizeWithTag(1, value.text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentHistoryButton redact(PaymentHistoryButton value) {
                value.getClass();
                Icon icon = value.arcade_icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                PaymentHistoryButton.Dialog dialog = value.dialog;
                PaymentHistoryButton.Dialog dialog2 = dialog != null ? (PaymentHistoryButton.Dialog) PaymentHistoryButton.Dialog.ADAPTER.redact(dialog) : null;
                PaymentHistoryButton.ShareSheetDetails shareSheetDetails = value.share_sheet_details;
                PaymentHistoryButton.ShareSheetDetails shareSheetDetails2 = shareSheetDetails != null ? (PaymentHistoryButton.ShareSheetDetails) PaymentHistoryButton.ShareSheetDetails.ADAPTER.redact(shareSheetDetails) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.text;
                PaymentHistoryButton.ButtonAction buttonAction = value.action;
                ClientScenario clientScenario = value.client_scenario;
                PaymentHistoryButton.Icon icon3 = value.icon;
                PaymentHistoryData.UiStatusTreatment uiStatusTreatment = value.treatment;
                String str2 = value.support_flow_node;
                RecurringSchedule.Frequency frequency = value.recurring_frequency;
                String str3 = value.opaque_data;
                PaymentHistoryButton.UrlType urlType = value.url_type;
                String str4 = value.accessibility_text;
                byteString.getClass();
                return new PaymentHistoryButton(str, buttonAction, null, null, clientScenario, icon3, icon2, uiStatusTreatment, str2, frequency, str3, dialog2, shareSheetDetails2, urlType, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentHistoryButton value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 15, value.accessibility_text);
                PaymentHistoryButton.UrlType.ADAPTER.encodeWithTag(writer, 13, value.url_type);
                PaymentHistoryButton.ShareSheetDetails.ADAPTER.encodeWithTag(writer, 12, value.share_sheet_details);
                PaymentHistoryButton.Dialog.ADAPTER.encodeWithTag(writer, 11, value.dialog);
                protoAdapter2.encodeWithTag(writer, 10, value.opaque_data);
                RecurringSchedule.Frequency.ADAPTER.encodeWithTag(writer, 9, value.recurring_frequency);
                protoAdapter2.encodeWithTag(writer, 8, value.support_flow_node);
                PaymentHistoryData.UiStatusTreatment.ADAPTER.encodeWithTag(writer, 7, value.treatment);
                Icon.ADAPTER.encodeWithTag(writer, 14, value.arcade_icon);
                PaymentHistoryButton.Icon.ADAPTER.encodeWithTag(writer, 6, value.icon);
                ClientScenario.ADAPTER.encodeWithTag(writer, 5, value.client_scenario);
                protoAdapter2.encodeWithTag(writer, 4, value.tel_number);
                protoAdapter2.encodeWithTag(writer, 3, value.url);
                PaymentHistoryButton.ButtonAction.ADAPTER.encodeWithTag(writer, 2, value.action);
                protoAdapter2.encodeWithTag(writer, 1, value.text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryButton(String str, ButtonAction buttonAction, String str2, String str3, ClientScenario clientScenario, Icon icon, com.squareup.protos.cash.ui.Icon icon2, PaymentHistoryData.UiStatusTreatment uiStatusTreatment, String str4, RecurringSchedule.Frequency frequency, String str5, Dialog dialog, ShareSheetDetails shareSheetDetails, UrlType urlType, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.action = buttonAction;
        this.url = str2;
        this.tel_number = str3;
        this.client_scenario = clientScenario;
        this.icon = icon;
        this.arcade_icon = icon2;
        this.treatment = uiStatusTreatment;
        this.support_flow_node = str4;
        this.recurring_frequency = frequency;
        this.opaque_data = str5;
        this.dialog = dialog;
        this.share_sheet_details = shareSheetDetails;
        this.url_type = urlType;
        this.accessibility_text = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryButton)) {
            return false;
        }
        PaymentHistoryButton paymentHistoryButton = (PaymentHistoryButton) obj;
        return Intrinsics.areEqual(unknownFields(), paymentHistoryButton.unknownFields()) && Intrinsics.areEqual(this.text, paymentHistoryButton.text) && this.action == paymentHistoryButton.action && Intrinsics.areEqual(this.url, paymentHistoryButton.url) && Intrinsics.areEqual(this.tel_number, paymentHistoryButton.tel_number) && this.client_scenario == paymentHistoryButton.client_scenario && this.icon == paymentHistoryButton.icon && Intrinsics.areEqual(this.arcade_icon, paymentHistoryButton.arcade_icon) && this.treatment == paymentHistoryButton.treatment && Intrinsics.areEqual(this.support_flow_node, paymentHistoryButton.support_flow_node) && this.recurring_frequency == paymentHistoryButton.recurring_frequency && Intrinsics.areEqual(this.opaque_data, paymentHistoryButton.opaque_data) && Intrinsics.areEqual(this.dialog, paymentHistoryButton.dialog) && Intrinsics.areEqual(this.share_sheet_details, paymentHistoryButton.share_sheet_details) && this.url_type == paymentHistoryButton.url_type && Intrinsics.areEqual(this.accessibility_text, paymentHistoryButton.accessibility_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ButtonAction buttonAction = this.action;
        int hashCode3 = (hashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.tel_number;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode6 = (hashCode5 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode7 = (hashCode6 + (icon != null ? icon.hashCode() : 0)) * 37;
        com.squareup.protos.cash.ui.Icon icon2 = this.arcade_icon;
        int hashCode8 = (hashCode7 + (icon2 != null ? icon2.hashCode() : 0)) * 37;
        PaymentHistoryData.UiStatusTreatment uiStatusTreatment = this.treatment;
        int hashCode9 = (hashCode8 + (uiStatusTreatment != null ? uiStatusTreatment.hashCode() : 0)) * 37;
        String str4 = this.support_flow_node;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        RecurringSchedule.Frequency frequency = this.recurring_frequency;
        int hashCode11 = (hashCode10 + (frequency != null ? frequency.hashCode() : 0)) * 37;
        String str5 = this.opaque_data;
        int hashCode12 = (hashCode11 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Dialog dialog = this.dialog;
        int hashCode13 = (hashCode12 + (dialog != null ? dialog.hashCode() : 0)) * 37;
        ShareSheetDetails shareSheetDetails = this.share_sheet_details;
        int hashCode14 = (hashCode13 + (shareSheetDetails != null ? shareSheetDetails.hashCode() : 0)) * 37;
        UrlType urlType = this.url_type;
        int hashCode15 = (hashCode14 + (urlType != null ? urlType.hashCode() : 0)) * 37;
        String str6 = this.accessibility_text;
        int hashCode16 = hashCode15 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.action = this.action;
        builder.url = this.url;
        builder.tel_number = this.tel_number;
        builder.client_scenario = this.client_scenario;
        builder.icon = this.icon;
        builder.arcade_icon = this.arcade_icon;
        builder.treatment = this.treatment;
        builder.support_flow_node = this.support_flow_node;
        builder.recurring_frequency = this.recurring_frequency;
        builder.opaque_data = this.opaque_data;
        builder.dialog = this.dialog;
        builder.share_sheet_details = this.share_sheet_details;
        builder.url_type = this.url_type;
        builder.accessibility_text = this.accessibility_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        ButtonAction buttonAction = this.action;
        if (buttonAction != null) {
            arrayList.add("action=" + buttonAction);
        }
        if (this.url != null) {
            arrayList.add("url=██");
        }
        if (this.tel_number != null) {
            arrayList.add("tel_number=██");
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            arrayList.add("icon=" + icon);
        }
        com.squareup.protos.cash.ui.Icon icon2 = this.arcade_icon;
        if (icon2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("arcade_icon=", icon2, arrayList);
        }
        PaymentHistoryData.UiStatusTreatment uiStatusTreatment = this.treatment;
        if (uiStatusTreatment != null) {
            arrayList.add("treatment=" + uiStatusTreatment);
        }
        String str2 = this.support_flow_node;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "support_flow_node=", arrayList);
        }
        RecurringSchedule.Frequency frequency = this.recurring_frequency;
        if (frequency != null) {
            arrayList.add("recurring_frequency=" + frequency);
        }
        String str3 = this.opaque_data;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "opaque_data=", arrayList);
        }
        Dialog dialog = this.dialog;
        if (dialog != null) {
            arrayList.add("dialog=" + dialog);
        }
        ShareSheetDetails shareSheetDetails = this.share_sheet_details;
        if (shareSheetDetails != null) {
            arrayList.add("share_sheet_details=" + shareSheetDetails);
        }
        UrlType urlType = this.url_type;
        if (urlType != null) {
            arrayList.add("url_type=" + urlType);
        }
        String str4 = this.accessibility_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "accessibility_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentHistoryButton{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b&\b\u0086\u0081\u0002\u0018\u0000 )2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006*"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ButtonAction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONFIRM", "CANCEL", "PASSCODE_CONFIRMATION", "LINK_CARD", "OPEN_URL", "CALL_NUMBER", "VERIFY_IDENTITY", "REPORT_PROBLEM", "COMPLETE_SCENARIO_PLAN", "REFUND", "REPORT_ABUSE", "UNREPORT_ABUSE", "COMPLETE_CLIENT_SCENARIO", "SHOW_MORE_INFO_SHEET", "CHECK_STATUS", "ADD_REACTION", "BITCOIN_DEPOSIT_REVERSAL", "START_SUPPORT_FLOW", "PAY_WITH_CASH_REDIRECT", "CANCEL_INVESTMENT_ORDER", "MAKE_LOAN_PAYMENT", "SKIP_LOAN_PAYMENT", "CANCEL_RECURRING_PURCHASE", "SHOW_SUPPORT_OPTIONS", "SHOW_PAYMENT_DETAIL_VIEW", "ACCEPT_CRYPTO_PAYMENT", "ACCEPT_INVEST_PAYMENT", "VIEW_PROFILE", "CANCEL_CRYPTO_ORDER", "SHOW_BNPL_LOAN", "OPEN_DIALOG", "OPEN_SHARE_SHEET", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ButtonAction implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ButtonAction[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final ButtonAction CONFIRM = new ButtonAction("CONFIRM", 0, 1);
        public static final ButtonAction CANCEL = new ButtonAction("CANCEL", 1, 2);
        public static final ButtonAction PASSCODE_CONFIRMATION = new ButtonAction("PASSCODE_CONFIRMATION", 2, 3);
        public static final ButtonAction LINK_CARD = new ButtonAction("LINK_CARD", 3, 4);
        public static final ButtonAction OPEN_URL = new ButtonAction("OPEN_URL", 4, 5);
        public static final ButtonAction CALL_NUMBER = new ButtonAction("CALL_NUMBER", 5, 6);
        public static final ButtonAction VERIFY_IDENTITY = new ButtonAction("VERIFY_IDENTITY", 6, 7);
        public static final ButtonAction REPORT_PROBLEM = new ButtonAction("REPORT_PROBLEM", 7, 8);
        public static final ButtonAction COMPLETE_SCENARIO_PLAN = new ButtonAction("COMPLETE_SCENARIO_PLAN", 8, 9);
        public static final ButtonAction REFUND = new ButtonAction("REFUND", 9, 10);
        public static final ButtonAction REPORT_ABUSE = new ButtonAction("REPORT_ABUSE", 10, 11);
        public static final ButtonAction UNREPORT_ABUSE = new ButtonAction("UNREPORT_ABUSE", 11, 12);
        public static final ButtonAction COMPLETE_CLIENT_SCENARIO = new ButtonAction("COMPLETE_CLIENT_SCENARIO", 12, 13);
        public static final ButtonAction SHOW_MORE_INFO_SHEET = new ButtonAction("SHOW_MORE_INFO_SHEET", 13, 14);
        public static final ButtonAction CHECK_STATUS = new ButtonAction("CHECK_STATUS", 14, 15);
        public static final ButtonAction ADD_REACTION = new ButtonAction("ADD_REACTION", 15, 16);
        public static final ButtonAction BITCOIN_DEPOSIT_REVERSAL = new ButtonAction("BITCOIN_DEPOSIT_REVERSAL", 16, 17);
        public static final ButtonAction START_SUPPORT_FLOW = new ButtonAction("START_SUPPORT_FLOW", 17, 18);
        public static final ButtonAction PAY_WITH_CASH_REDIRECT = new ButtonAction("PAY_WITH_CASH_REDIRECT", 18, 19);
        public static final ButtonAction CANCEL_INVESTMENT_ORDER = new ButtonAction("CANCEL_INVESTMENT_ORDER", 19, 20);
        public static final ButtonAction MAKE_LOAN_PAYMENT = new ButtonAction("MAKE_LOAN_PAYMENT", 20, 21);
        public static final ButtonAction SKIP_LOAN_PAYMENT = new ButtonAction("SKIP_LOAN_PAYMENT", 21, 22);
        public static final ButtonAction CANCEL_RECURRING_PURCHASE = new ButtonAction("CANCEL_RECURRING_PURCHASE", 22, 23);
        public static final ButtonAction SHOW_SUPPORT_OPTIONS = new ButtonAction("SHOW_SUPPORT_OPTIONS", 23, 24);
        public static final ButtonAction SHOW_PAYMENT_DETAIL_VIEW = new ButtonAction("SHOW_PAYMENT_DETAIL_VIEW", 24, 25);
        public static final ButtonAction ACCEPT_CRYPTO_PAYMENT = new ButtonAction("ACCEPT_CRYPTO_PAYMENT", 25, 26);

        @Deprecated
        public static final ButtonAction ACCEPT_INVEST_PAYMENT = new ButtonAction("ACCEPT_INVEST_PAYMENT", 26, 27);

        @Deprecated
        public static final ButtonAction VIEW_PROFILE = new ButtonAction("VIEW_PROFILE", 27, 28);
        public static final ButtonAction CANCEL_CRYPTO_ORDER = new ButtonAction("CANCEL_CRYPTO_ORDER", 28, 29);

        @Deprecated
        public static final ButtonAction SHOW_BNPL_LOAN = new ButtonAction("SHOW_BNPL_LOAN", 29, 30);
        public static final ButtonAction OPEN_DIALOG = new ButtonAction("OPEN_DIALOG", 30, 31);
        public static final ButtonAction OPEN_SHARE_SHEET = new ButtonAction("OPEN_SHARE_SHEET", 31, 32);

        private static final /* synthetic */ ButtonAction[] $values() {
            return new ButtonAction[]{CONFIRM, CANCEL, PASSCODE_CONFIRMATION, LINK_CARD, OPEN_URL, CALL_NUMBER, VERIFY_IDENTITY, REPORT_PROBLEM, COMPLETE_SCENARIO_PLAN, REFUND, REPORT_ABUSE, UNREPORT_ABUSE, COMPLETE_CLIENT_SCENARIO, SHOW_MORE_INFO_SHEET, CHECK_STATUS, ADD_REACTION, BITCOIN_DEPOSIT_REVERSAL, START_SUPPORT_FLOW, PAY_WITH_CASH_REDIRECT, CANCEL_INVESTMENT_ORDER, MAKE_LOAN_PAYMENT, SKIP_LOAN_PAYMENT, CANCEL_RECURRING_PURCHASE, SHOW_SUPPORT_OPTIONS, SHOW_PAYMENT_DETAIL_VIEW, ACCEPT_CRYPTO_PAYMENT, ACCEPT_INVEST_PAYMENT, VIEW_PROFILE, CANCEL_CRYPTO_ORDER, SHOW_BNPL_LOAN, OPEN_DIALOG, OPEN_SHARE_SHEET};
        }

        static {
            ButtonAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ButtonAction.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryButton$ButtonAction$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryButton.ButtonAction fromValue(int value) {
                    return PaymentHistoryButton.ButtonAction.INSTANCE.fromValue(value);
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

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ButtonAction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ButtonAction;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ButtonAction fromValue(int value) {
                switch (value) {
                    case 1:
                        return ButtonAction.CONFIRM;
                    case 2:
                        return ButtonAction.CANCEL;
                    case 3:
                        return ButtonAction.PASSCODE_CONFIRMATION;
                    case 4:
                        return ButtonAction.LINK_CARD;
                    case 5:
                        return ButtonAction.OPEN_URL;
                    case 6:
                        return ButtonAction.CALL_NUMBER;
                    case 7:
                        return ButtonAction.VERIFY_IDENTITY;
                    case 8:
                        return ButtonAction.REPORT_PROBLEM;
                    case 9:
                        return ButtonAction.COMPLETE_SCENARIO_PLAN;
                    case 10:
                        return ButtonAction.REFUND;
                    case 11:
                        return ButtonAction.REPORT_ABUSE;
                    case 12:
                        return ButtonAction.UNREPORT_ABUSE;
                    case 13:
                        return ButtonAction.COMPLETE_CLIENT_SCENARIO;
                    case 14:
                        return ButtonAction.SHOW_MORE_INFO_SHEET;
                    case 15:
                        return ButtonAction.CHECK_STATUS;
                    case 16:
                        return ButtonAction.ADD_REACTION;
                    case 17:
                        return ButtonAction.BITCOIN_DEPOSIT_REVERSAL;
                    case 18:
                        return ButtonAction.START_SUPPORT_FLOW;
                    case 19:
                        return ButtonAction.PAY_WITH_CASH_REDIRECT;
                    case 20:
                        return ButtonAction.CANCEL_INVESTMENT_ORDER;
                    case 21:
                        return ButtonAction.MAKE_LOAN_PAYMENT;
                    case 22:
                        return ButtonAction.SKIP_LOAN_PAYMENT;
                    case 23:
                        return ButtonAction.CANCEL_RECURRING_PURCHASE;
                    case 24:
                        return ButtonAction.SHOW_SUPPORT_OPTIONS;
                    case 25:
                        return ButtonAction.SHOW_PAYMENT_DETAIL_VIEW;
                    case 26:
                        return ButtonAction.ACCEPT_CRYPTO_PAYMENT;
                    case 27:
                        return ButtonAction.ACCEPT_INVEST_PAYMENT;
                    case 28:
                        return ButtonAction.VIEW_PROFILE;
                    case 29:
                        return ButtonAction.CANCEL_CRYPTO_ORDER;
                    case 30:
                        return ButtonAction.SHOW_BNPL_LOAN;
                    case 31:
                        return ButtonAction.OPEN_DIALOG;
                    case 32:
                        return ButtonAction.OPEN_SHARE_SHEET;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog$Builder;", "title", "", "content", "dismiss_button_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Dialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Dialog> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 1, tag = 2)
        public final String content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 2, tag = 3)
        public final String dismiss_button_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "<init>", "()V", "title", "", "content", "dismiss_button_label", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String content;
            public String dismiss_button_label;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public Dialog build() {
                String str = this.title;
                String str2 = this.content;
                if (str2 == null) {
                    TransactorKt.missingRequiredFields(str2, "content");
                    throw null;
                }
                String str3 = this.dismiss_button_label;
                if (str3 != null) {
                    return new Dialog(str, str2, str3, buildUnknownFields());
                }
                TransactorKt.missingRequiredFields(str3, "dismiss_button_label");
                throw null;
            }

            public final Builder content(String content) {
                content.getClass();
                this.content = content;
                return this;
            }

            public final Builder dismiss_button_label(String dismiss_button_label) {
                dismiss_button_label.getClass();
                this.dismiss_button_label = dismiss_button_label;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Dialog.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryButton$Dialog$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryButton.Dialog decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            break;
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
                    ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    if (str2 == null) {
                        TransactorKt.missingRequiredFields(obj2, "content");
                        throw null;
                    }
                    String str3 = (String) obj3;
                    if (str3 != null) {
                        return new PaymentHistoryButton.Dialog(str, str2, str3, endMessageAndGetUnknownFields);
                    }
                    TransactorKt.missingRequiredFields(obj3, "dismiss_button_label");
                    throw null;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryButton.Dialog value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.content);
                    protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryButton.Dialog value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.dismiss_button_label) + protoAdapter2.encodedSizeWithTag(2, value.content) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryButton.Dialog redact(PaymentHistoryButton.Dialog value) {
                    value.getClass();
                    return PaymentHistoryButton.Dialog.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryButton.Dialog value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.dismiss_button_label);
                    protoAdapter2.encodeWithTag(writer, 2, value.content);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            str2.getClass();
            str3.getClass();
            byteString.getClass();
            this.title = str;
            this.content = str2;
            this.dismiss_button_label = str3;
        }

        public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dialog.title;
            }
            if ((i & 2) != 0) {
                str2 = dialog.content;
            }
            if ((i & 4) != 0) {
                str3 = dialog.dismiss_button_label;
            }
            if ((i & 8) != 0) {
                byteString = dialog.unknownFields();
            }
            return dialog.copy(str, str2, str3, byteString);
        }

        public final Dialog copy(String title, String content, String dismiss_button_label, ByteString unknownFields) {
            content.getClass();
            dismiss_button_label.getClass();
            unknownFields.getClass();
            return new Dialog(title, content, dismiss_button_label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return Intrinsics.areEqual(unknownFields(), dialog.unknownFields()) && Intrinsics.areEqual(this.title, dialog.title) && Intrinsics.areEqual(this.content, dialog.content) && Intrinsics.areEqual(this.dismiss_button_label, dialog.dismiss_button_label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = this.dismiss_button_label.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.content);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.content = this.content;
            builder.dismiss_button_label = this.dismiss_button_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.content, "content=", arrayList);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.dismiss_button_label, "dismiss_button_label=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Dialog{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Dialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dialog build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dialog(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Icon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHECKMARK", "INSTANT", "HEART_OUTLINE", "SHIELD", "DOUBLE_CHEVRON", "BLOCKED", "SPARKLES", "PENDING", "WARNING", "SUBTRACT_OUTLINE", "SEND", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Deprecated
    public static final class Icon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Icon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Icon CHECKMARK = new Icon("CHECKMARK", 0, 1);
        public static final Icon INSTANT = new Icon("INSTANT", 1, 2);
        public static final Icon HEART_OUTLINE = new Icon("HEART_OUTLINE", 2, 3);
        public static final Icon SHIELD = new Icon("SHIELD", 3, 4);
        public static final Icon DOUBLE_CHEVRON = new Icon("DOUBLE_CHEVRON", 4, 5);
        public static final Icon BLOCKED = new Icon("BLOCKED", 5, 6);
        public static final Icon SPARKLES = new Icon("SPARKLES", 6, 7);
        public static final Icon PENDING = new Icon("PENDING", 7, 8);
        public static final Icon WARNING = new Icon("WARNING", 8, 9);
        public static final Icon SUBTRACT_OUTLINE = new Icon("SUBTRACT_OUTLINE", 9, 10);
        public static final Icon SEND = new Icon("SEND", 10, 11);

        private static final /* synthetic */ Icon[] $values() {
            return new Icon[]{CHECKMARK, INSTANT, HEART_OUTLINE, SHIELD, DOUBLE_CHEVRON, BLOCKED, SPARKLES, PENDING, WARNING, SUBTRACT_OUTLINE, SEND};
        }

        static {
            Icon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Icon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryButton$Icon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryButton.Icon fromValue(int value) {
                    return PaymentHistoryButton.Icon.INSTANCE.fromValue(value);
                }
            };
        }

        private Icon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Icon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Icon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Icon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Icon fromValue(int value) {
                switch (value) {
                    case 1:
                        return Icon.CHECKMARK;
                    case 2:
                        return Icon.INSTANT;
                    case 3:
                        return Icon.HEART_OUTLINE;
                    case 4:
                        return Icon.SHIELD;
                    case 5:
                        return Icon.DOUBLE_CHEVRON;
                    case 6:
                        return Icon.BLOCKED;
                    case 7:
                        return Icon.SPARKLES;
                    case 8:
                        return Icon.PENDING;
                    case 9:
                        return Icon.WARNING;
                    case 10:
                        return Icon.SUBTRACT_OUTLINE;
                    case 11:
                        return Icon.SEND;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails$Builder;", "title", "", "default_phone_number", "content", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ShareSheetDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ShareSheetDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 2, tag = 3)
        public final String content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String default_phone_number;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "<init>", "()V", "title", "", "default_phone_number", "content", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String content;
            public String default_phone_number;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public ShareSheetDetails build() {
                String str = this.title;
                String str2 = this.default_phone_number;
                String str3 = this.content;
                if (str3 != null) {
                    return new ShareSheetDetails(str, str2, str3, buildUnknownFields());
                }
                TransactorKt.missingRequiredFields(str3, "content");
                throw null;
            }

            public final Builder content(String content) {
                content.getClass();
                this.content = content;
                return this;
            }

            public final Builder default_phone_number(String default_phone_number) {
                this.default_phone_number = default_phone_number;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ShareSheetDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryButton$ShareSheetDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryButton.ShareSheetDetails decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            break;
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
                    ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    String str3 = (String) obj3;
                    if (str3 != null) {
                        return new PaymentHistoryButton.ShareSheetDetails(str, str2, str3, endMessageAndGetUnknownFields);
                    }
                    TransactorKt.missingRequiredFields(obj3, "content");
                    throw null;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentHistoryButton.ShareSheetDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.default_phone_number);
                    protoAdapter2.encodeWithTag(writer, 3, value.content);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentHistoryButton.ShareSheetDetails value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.content) + protoAdapter2.encodedSizeWithTag(2, value.default_phone_number) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentHistoryButton.ShareSheetDetails redact(PaymentHistoryButton.ShareSheetDetails value) {
                    value.getClass();
                    return PaymentHistoryButton.ShareSheetDetails.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentHistoryButton.ShareSheetDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.content);
                    protoAdapter2.encodeWithTag(writer, 2, value.default_phone_number);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ShareSheetDetails(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ShareSheetDetails copy$default(ShareSheetDetails shareSheetDetails, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = shareSheetDetails.title;
            }
            if ((i & 2) != 0) {
                str2 = shareSheetDetails.default_phone_number;
            }
            if ((i & 4) != 0) {
                str3 = shareSheetDetails.content;
            }
            if ((i & 8) != 0) {
                byteString = shareSheetDetails.unknownFields();
            }
            return shareSheetDetails.copy(str, str2, str3, byteString);
        }

        public final ShareSheetDetails copy(String title, String default_phone_number, String content, ByteString unknownFields) {
            content.getClass();
            unknownFields.getClass();
            return new ShareSheetDetails(title, default_phone_number, content, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ShareSheetDetails)) {
                return false;
            }
            ShareSheetDetails shareSheetDetails = (ShareSheetDetails) other;
            return Intrinsics.areEqual(unknownFields(), shareSheetDetails.unknownFields()) && Intrinsics.areEqual(this.title, shareSheetDetails.title) && Intrinsics.areEqual(this.default_phone_number, shareSheetDetails.default_phone_number) && Intrinsics.areEqual(this.content, shareSheetDetails.content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.default_phone_number;
            int hashCode3 = this.content.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.default_phone_number = this.default_phone_number;
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.default_phone_number;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "default_phone_number=", arrayList);
            }
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.content, "content=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ShareSheetDetails{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$ShareSheetDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ShareSheetDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareSheetDetails(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            str3.getClass();
            byteString.getClass();
            this.title = str;
            this.default_phone_number = str2;
            this.content = str3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$UrlType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BLOCK_EXPLORER", "RECEIPT_UPSELL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UrlType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UrlType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final UrlType BLOCK_EXPLORER = new UrlType("BLOCK_EXPLORER", 0, 1);
        public static final UrlType RECEIPT_UPSELL = new UrlType("RECEIPT_UPSELL", 1, 2);

        private static final /* synthetic */ UrlType[] $values() {
            return new UrlType[]{BLOCK_EXPLORER, RECEIPT_UPSELL};
        }

        static {
            UrlType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UrlType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.PaymentHistoryButton$UrlType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentHistoryButton.UrlType fromValue(int value) {
                    return PaymentHistoryButton.UrlType.INSTANCE.fromValue(value);
                }
            };
        }

        private UrlType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final UrlType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static UrlType valueOf(String str) {
            return (UrlType) Enum.valueOf(UrlType.class, str);
        }

        public static UrlType[] values() {
            return (UrlType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$UrlType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$UrlType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final UrlType fromValue(int value) {
                if (value == 1) {
                    return UrlType.BLOCK_EXPLORER;
                }
                if (value != 2) {
                    return null;
                }
                return UrlType.RECEIPT_UPSELL;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentHistoryButton build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
