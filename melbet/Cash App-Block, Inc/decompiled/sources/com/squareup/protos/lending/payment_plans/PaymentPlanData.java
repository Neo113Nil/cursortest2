package com.squareup.protos.lending.payment_plans;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.protos.lending.payment_plans.PaymentPlanData;
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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\b\"!#$%&'(R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$Builder;", "", "id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/ui/Color;", "accent_color", "Lcom/squareup/protos/cash/ui/Color;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "payment_progress_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "refunds_timeline_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "payments_timeline_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "summary_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "purchase_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink;", "client_route_links", "Ljava/util/List;", "Companion", "Builder", "SubmitButton", "ProgressSection", "TimelineSection", "SummarySection", "PurchasesSection", "ClientRouteLink", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentPlanData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentPlanData> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
    public final Color accent_color;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 2, tag = 3)
    public final UiAvatar avatar;

    @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$ClientRouteLink#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    public final List<ClientRouteLink> client_route_links;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$ProgressSection#ADAPTER", schemaIndex = 5, tag = 6)
    public final ProgressSection payment_progress_section;

    @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$TimelineSection#ADAPTER", schemaIndex = 7, tag = 8)
    public final TimelineSection payments_timeline_section;

    @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$PurchasesSection#ADAPTER", schemaIndex = 10, tag = 11)
    public final PurchasesSection purchase_section;

    @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$TimelineSection#ADAPTER", schemaIndex = 6, tag = 7)
    public final TimelineSection refunds_timeline_section;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalizedString subtitle;

    @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$SummarySection#ADAPTER", schemaIndex = 8, tag = 9)
    public final SummarySection summary_section;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", redacted = true, schemaIndex = 3, tag = 4)
    public final LocalizedString title;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0014\u0010\u0015\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData;", "<init>", "()V", "id", "", "accent_color", "Lcom/squareup/protos/cash/ui/Color;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "payment_progress_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "refunds_timeline_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "payments_timeline_section", "summary_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "client_route_links", "", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink;", "purchase_section", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Color accent_color;
        public UiAvatar avatar;
        public List<ClientRouteLink> client_route_links = EmptyList.INSTANCE;
        public String id;
        public ProgressSection payment_progress_section;
        public TimelineSection payments_timeline_section;
        public PurchasesSection purchase_section;
        public TimelineSection refunds_timeline_section;
        public LocalizedString subtitle;
        public SummarySection summary_section;
        public LocalizedString title;

        public final Builder accent_color(Color accent_color) {
            this.accent_color = accent_color;
            return this;
        }

        public final Builder avatar(UiAvatar avatar) {
            this.avatar = avatar;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaymentPlanData build() {
            return new PaymentPlanData(this.id, this.accent_color, this.avatar, this.title, this.subtitle, this.payment_progress_section, this.refunds_timeline_section, this.payments_timeline_section, this.summary_section, this.client_route_links, this.purchase_section, buildUnknownFields());
        }

        public final Builder client_route_links(List<ClientRouteLink> client_route_links) {
            client_route_links.getClass();
            TransactorKt.checkElementsNotNull(client_route_links);
            this.client_route_links = client_route_links;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder payment_progress_section(ProgressSection payment_progress_section) {
            this.payment_progress_section = payment_progress_section;
            return this;
        }

        public final Builder payments_timeline_section(TimelineSection payments_timeline_section) {
            this.payments_timeline_section = payments_timeline_section;
            return this;
        }

        public final Builder purchase_section(PurchasesSection purchase_section) {
            this.purchase_section = purchase_section;
            return this;
        }

        public final Builder refunds_timeline_section(TimelineSection refunds_timeline_section) {
            this.refunds_timeline_section = refunds_timeline_section;
            return this;
        }

        public final Builder subtitle(LocalizedString subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder summary_section(SummarySection summary_section) {
            this.summary_section = summary_section;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J8\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "detail_rows", "", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow;", "button", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/util/List;Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ActionButton", "DetailRow", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PurchasesSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PurchasesSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$PurchasesSection$ActionButton#ADAPTER", schemaIndex = 2, tag = 3)
        public final ActionButton button;

        @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$PurchasesSection$DetailRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<DetailRow> detail_rows;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "detail_rows", "", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow;", "button", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public ActionButton button;
            public List<DetailRow> detail_rows = EmptyList.INSTANCE;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public PurchasesSection build() {
                return new PurchasesSection(this.title, this.detail_rows, this.button, buildUnknownFields());
            }

            public final Builder button(ActionButton button) {
                this.button = button;
                return this;
            }

            public final Builder detail_rows(List<DetailRow> detail_rows) {
                detail_rows.getClass();
                TransactorKt.checkElementsNotNull(detail_rows);
                this.detail_rows = detail_rows;
                return this;
            }

            public final Builder title(LocalizedString title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PurchasesSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$PurchasesSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.PurchasesSection decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentPlanData.PurchasesSection((LocalizedString) obj, m, (PaymentPlanData.PurchasesSection.ActionButton) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            m.add(PaymentPlanData.PurchasesSection.DetailRow.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.PurchasesSection.ActionButton.ADAPTER, reader, obj2);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentPlanData.PurchasesSection value) {
                    writer.getClass();
                    value.getClass();
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.title);
                    PaymentPlanData.PurchasesSection.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.detail_rows);
                    PaymentPlanData.PurchasesSection.ActionButton.ADAPTER.encodeWithTag(writer, 3, value.button);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentPlanData.PurchasesSection value) {
                    value.getClass();
                    return PaymentPlanData.PurchasesSection.ActionButton.ADAPTER.encodedSizeWithTag(3, value.button) + PaymentPlanData.PurchasesSection.DetailRow.ADAPTER.asRepeated().encodedSizeWithTag(2, value.detail_rows) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.PurchasesSection redact(PaymentPlanData.PurchasesSection value) {
                    value.getClass();
                    LocalizedString localizedString = value.title;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.detail_rows, PaymentPlanData.PurchasesSection.DetailRow.ADAPTER);
                    PaymentPlanData.PurchasesSection.ActionButton actionButton = value.button;
                    return value.copy(localizedString2, m1169redactElements, actionButton != null ? (PaymentPlanData.PurchasesSection.ActionButton) PaymentPlanData.PurchasesSection.ActionButton.ADAPTER.redact(actionButton) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentPlanData.PurchasesSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentPlanData.PurchasesSection.ActionButton.ADAPTER.encodeWithTag(writer, 3, value.button);
                    PaymentPlanData.PurchasesSection.DetailRow.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.detail_rows);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public PurchasesSection(LocalizedString localizedString, List list, ActionButton actionButton, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? null : actionButton, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PurchasesSection copy$default(PurchasesSection purchasesSection, LocalizedString localizedString, List list, ActionButton actionButton, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = purchasesSection.title;
            }
            if ((i & 2) != 0) {
                list = purchasesSection.detail_rows;
            }
            if ((i & 4) != 0) {
                actionButton = purchasesSection.button;
            }
            if ((i & 8) != 0) {
                byteString = purchasesSection.unknownFields();
            }
            return purchasesSection.copy(localizedString, list, actionButton, byteString);
        }

        public final PurchasesSection copy(LocalizedString title, List<DetailRow> detail_rows, ActionButton button, ByteString unknownFields) {
            detail_rows.getClass();
            unknownFields.getClass();
            return new PurchasesSection(title, detail_rows, button, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PurchasesSection)) {
                return false;
            }
            PurchasesSection purchasesSection = (PurchasesSection) other;
            return Intrinsics.areEqual(unknownFields(), purchasesSection.unknownFields()) && Intrinsics.areEqual(this.title, purchasesSection.title) && Intrinsics.areEqual(this.detail_rows, purchasesSection.detail_rows) && Intrinsics.areEqual(this.button, purchasesSection.button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.detail_rows);
            ActionButton actionButton = this.button;
            int hashCode2 = m + (actionButton != null ? actionButton.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.detail_rows = this.detail_rows;
            builder.button = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            if (!this.detail_rows.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("detail_rows=", arrayList, this.detail_rows);
            }
            ActionButton actionButton = this.button;
            if (actionButton != null) {
                arrayList.add("button=" + actionButton);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PurchasesSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\bH\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton$Builder;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "image", "Lcom/squareup/protos/cash/ui/Image;", "url", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ActionButton extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ActionButton> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 1, tag = 2)
            public final Image image;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String url;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;", "<init>", "()V", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "image", "Lcom/squareup/protos/cash/ui/Image;", "url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Image image;
                public LocalizedString text;
                public String url;

                @Override // com.squareup.wire.Message.Builder
                public ActionButton build() {
                    return new ActionButton(this.text, this.image, this.url, buildUnknownFields());
                }

                public final Builder image(Image image) {
                    this.image = image;
                    return this;
                }

                public final Builder text(LocalizedString text) {
                    this.text = text;
                    return this;
                }

                public final Builder url(String url) {
                    this.url = url;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActionButton.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$PurchasesSection$ActionButton$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.PurchasesSection.ActionButton decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PaymentPlanData.PurchasesSection.ActionButton((LocalizedString) obj, (Image) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj2);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PaymentPlanData.PurchasesSection.ActionButton value) {
                        writer.getClass();
                        value.getClass();
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                        Image.ADAPTER.encodeWithTag(writer, 2, value.image);
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.url);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PaymentPlanData.PurchasesSection.ActionButton value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(3, value.url) + Image.ADAPTER.encodedSizeWithTag(2, value.image) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.PurchasesSection.ActionButton redact(PaymentPlanData.PurchasesSection.ActionButton value) {
                        value.getClass();
                        LocalizedString localizedString = value.text;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        Image image = value.image;
                        return PaymentPlanData.PurchasesSection.ActionButton.copy$default(value, localizedString2, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, ByteString.EMPTY, 4, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PaymentPlanData.PurchasesSection.ActionButton value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.url);
                        Image.ADAPTER.encodeWithTag(writer, 2, value.image);
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ActionButton(LocalizedString localizedString, Image image, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, LocalizedString localizedString, Image image, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = actionButton.text;
                }
                if ((i & 2) != 0) {
                    image = actionButton.image;
                }
                if ((i & 4) != 0) {
                    str = actionButton.url;
                }
                if ((i & 8) != 0) {
                    byteString = actionButton.unknownFields();
                }
                return actionButton.copy(localizedString, image, str, byteString);
            }

            public final ActionButton copy(LocalizedString text, Image image, String url, ByteString unknownFields) {
                unknownFields.getClass();
                return new ActionButton(text, image, url, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) other;
                return Intrinsics.areEqual(unknownFields(), actionButton.unknownFields()) && Intrinsics.areEqual(this.text, actionButton.text) && Intrinsics.areEqual(this.image, actionButton.image) && Intrinsics.areEqual(this.url, actionButton.url);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                Image image = this.image;
                int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
                String str = this.url;
                int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.image = this.image;
                builder.url = this.url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                Image image = this.image;
                if (image != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
                }
                String str = this.url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ActionButton{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$ActionButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ActionButton build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ActionButton() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionButton(LocalizedString localizedString, Image image, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = localizedString;
                this.image = image;
                this.url = str;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "detail", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/franklin/ui/UiAvatar;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DetailRow extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DetailRow> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 3, tag = 4)
            public final UiAvatar avatar;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
            public final LocalizedString detail;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizedString subtitle;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString title;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "detail", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public UiAvatar avatar;
                public LocalizedString detail;
                public LocalizedString subtitle;
                public LocalizedString title;

                public final Builder avatar(UiAvatar avatar) {
                    this.avatar = avatar;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public DetailRow build() {
                    return new DetailRow(this.title, this.subtitle, this.detail, this.avatar, buildUnknownFields());
                }

                public final Builder detail(LocalizedString detail) {
                    this.detail = detail;
                    return this;
                }

                public final Builder subtitle(LocalizedString subtitle) {
                    this.subtitle = subtitle;
                    return this;
                }

                public final Builder title(LocalizedString title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRow.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$PurchasesSection$DetailRow$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.PurchasesSection.DetailRow decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PaymentPlanData.PurchasesSection.DetailRow((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (UiAvatar) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            } else if (nextTag == 3) {
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj4 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, reader, obj4);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PaymentPlanData.PurchasesSection.DetailRow value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                        protoAdapter2.encodeWithTag(writer, 3, value.detail);
                        UiAvatar.ADAPTER.encodeWithTag(writer, 4, value.avatar);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PaymentPlanData.PurchasesSection.DetailRow value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        return UiAvatar.ADAPTER.encodedSizeWithTag(4, value.avatar) + protoAdapter2.encodedSizeWithTag(3, value.detail) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.PurchasesSection.DetailRow redact(PaymentPlanData.PurchasesSection.DetailRow value) {
                        value.getClass();
                        LocalizedString localizedString = value.title;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        LocalizedString localizedString3 = value.subtitle;
                        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                        LocalizedString localizedString5 = value.detail;
                        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                        UiAvatar uiAvatar = value.avatar;
                        return value.copy(localizedString2, localizedString4, localizedString6, uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PaymentPlanData.PurchasesSection.DetailRow value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        UiAvatar.ADAPTER.encodeWithTag(writer, 4, value.avatar);
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 3, value.detail);
                        protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DetailRow(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, UiAvatar uiAvatar, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : localizedString3, (i & 8) != 0 ? null : uiAvatar, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, UiAvatar uiAvatar, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = detailRow.title;
                }
                if ((i & 2) != 0) {
                    localizedString2 = detailRow.subtitle;
                }
                if ((i & 4) != 0) {
                    localizedString3 = detailRow.detail;
                }
                if ((i & 8) != 0) {
                    uiAvatar = detailRow.avatar;
                }
                if ((i & 16) != 0) {
                    byteString = detailRow.unknownFields();
                }
                ByteString byteString2 = byteString;
                LocalizedString localizedString4 = localizedString3;
                return detailRow.copy(localizedString, localizedString2, localizedString4, uiAvatar, byteString2);
            }

            public final DetailRow copy(LocalizedString title, LocalizedString subtitle, LocalizedString detail, UiAvatar avatar, ByteString unknownFields) {
                unknownFields.getClass();
                return new DetailRow(title, subtitle, detail, avatar, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DetailRow)) {
                    return false;
                }
                DetailRow detailRow = (DetailRow) other;
                return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle) && Intrinsics.areEqual(this.detail, detailRow.detail) && Intrinsics.areEqual(this.avatar, detailRow.avatar);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.subtitle;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.detail;
                int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
                UiAvatar uiAvatar = this.avatar;
                int hashCode5 = hashCode4 + (uiAvatar != null ? uiAvatar.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.subtitle = this.subtitle;
                builder.detail = this.detail;
                builder.avatar = this.avatar;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.subtitle;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.detail;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("detail=", localizedString3, arrayList);
                }
                UiAvatar uiAvatar = this.avatar;
                if (uiAvatar != null) {
                    Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$DetailRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
            public DetailRow(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, UiAvatar uiAvatar, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.subtitle = localizedString2;
                this.detail = localizedString3;
                this.avatar = uiAvatar;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$PurchasesSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PurchasesSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PurchasesSection() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchasesSection(LocalizedString localizedString, List<DetailRow> list, ActionButton actionButton, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.button = actionButton;
            this.detail_rows = TransactorKt.immutableCopyOf("detail_rows", list);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Builder;", "id", "", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "style", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Style;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Style;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Style", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SubmitButton extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SubmitButton> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$SubmitButton$Style#ADAPTER", schemaIndex = 2, tag = 3)
        public final Style style;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString text;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;", "<init>", "()V", "id", "", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "style", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Style;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String id;
            public Style style;
            public LocalizedString text;

            @Override // com.squareup.wire.Message.Builder
            public SubmitButton build() {
                return new SubmitButton(this.id, this.text, this.style, buildUnknownFields());
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder style(Style style) {
                this.style = style;
                return this;
            }

            public final Builder text(LocalizedString text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitButton.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$SubmitButton$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.SubmitButton decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentPlanData.SubmitButton((String) obj, (LocalizedString) obj2, (PaymentPlanData.SubmitButton.Style) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = PaymentPlanData.SubmitButton.Style.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentPlanData.SubmitButton value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 2, value.text);
                    PaymentPlanData.SubmitButton.Style.ADAPTER.encodeWithTag(writer, 3, value.style);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentPlanData.SubmitButton value) {
                    value.getClass();
                    return PaymentPlanData.SubmitButton.Style.ADAPTER.encodedSizeWithTag(3, value.style) + LocalizedString.ADAPTER.encodedSizeWithTag(2, value.text) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.SubmitButton redact(PaymentPlanData.SubmitButton value) {
                    value.getClass();
                    LocalizedString localizedString = value.text;
                    return PaymentPlanData.SubmitButton.copy$default(value, null, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, null, ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentPlanData.SubmitButton value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentPlanData.SubmitButton.Style.ADAPTER.encodeWithTag(writer, 3, value.style);
                    LocalizedString.ADAPTER.encodeWithTag(writer, 2, value.text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SubmitButton(String str, LocalizedString localizedString, Style style, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : style, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SubmitButton copy$default(SubmitButton submitButton, String str, LocalizedString localizedString, Style style, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = submitButton.id;
            }
            if ((i & 2) != 0) {
                localizedString = submitButton.text;
            }
            if ((i & 4) != 0) {
                style = submitButton.style;
            }
            if ((i & 8) != 0) {
                byteString = submitButton.unknownFields();
            }
            return submitButton.copy(str, localizedString, style, byteString);
        }

        public final SubmitButton copy(String id, LocalizedString text, Style style, ByteString unknownFields) {
            unknownFields.getClass();
            return new SubmitButton(id, text, style, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SubmitButton)) {
                return false;
            }
            SubmitButton submitButton = (SubmitButton) other;
            return Intrinsics.areEqual(unknownFields(), submitButton.unknownFields()) && Intrinsics.areEqual(this.id, submitButton.id) && Intrinsics.areEqual(this.text, submitButton.text) && this.style == submitButton.style;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.text;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Style style = this.style;
            int hashCode4 = hashCode3 + (style != null ? style.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.text = this.text;
            builder.style = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            LocalizedString localizedString = this.text;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
            }
            Style style = this.style;
            if (style != null) {
                arrayList.add("style=" + style);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitButton{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Style;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STANDARD", "PROMINENT", "SUBTLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Style implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final Style STANDARD = new Style("STANDARD", 0, 1);
            public static final Style PROMINENT = new Style("PROMINENT", 1, 2);
            public static final Style SUBTLE = new Style("SUBTLE", 2, 3);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{STANDARD, PROMINENT, SUBTLE};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Style.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$SubmitButton$Style$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public PaymentPlanData.SubmitButton.Style fromValue(int value) {
                        return PaymentPlanData.SubmitButton.Style.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Style$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Style;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Style fromValue(int value) {
                    if (value == 1) {
                        return Style.STANDARD;
                    }
                    if (value == 2) {
                        return Style.PROMINENT;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return Style.SUBTLE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SubmitButton build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SubmitButton() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitButton(String str, LocalizedString localizedString, Style style, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.text = localizedString;
            this.style = style;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\\\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "summary_text", "detail_items", "", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem;", "source_icon", "Lcom/squareup/protos/cash/ui/Image;", "source_text", "source_info", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/util/List;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "DetailItem", "SourceInfo", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SummarySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SummarySection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$SummarySection$DetailItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
        public final List<DetailItem> detail_items;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 3, tag = 4)
        public final Image source_icon;

        @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$SummarySection$SourceInfo#ADAPTER", schemaIndex = 5, tag = 6)
        public final SourceInfo source_info;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 4, tag = 5)
        public final LocalizedString source_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString summary_text;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "summary_text", "detail_items", "", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem;", "source_icon", "Lcom/squareup/protos/cash/ui/Image;", "source_text", "source_info", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<DetailItem> detail_items = EmptyList.INSTANCE;
            public Image source_icon;
            public SourceInfo source_info;
            public LocalizedString source_text;
            public LocalizedString summary_text;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public SummarySection build() {
                return new SummarySection(this.title, this.summary_text, this.detail_items, this.source_icon, this.source_text, this.source_info, buildUnknownFields());
            }

            public final Builder detail_items(List<DetailItem> detail_items) {
                detail_items.getClass();
                TransactorKt.checkElementsNotNull(detail_items);
                this.detail_items = detail_items;
                return this;
            }

            public final Builder source_icon(Image source_icon) {
                this.source_icon = source_icon;
                return this;
            }

            public final Builder source_info(SourceInfo source_info) {
                this.source_info = source_info;
                return this;
            }

            public final Builder source_text(LocalizedString source_text) {
                this.source_text = source_text;
                return this;
            }

            public final Builder summary_text(LocalizedString summary_text) {
                this.summary_text = summary_text;
                return this;
            }

            public final Builder title(LocalizedString title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SummarySection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$SummarySection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.SummarySection decode(ProtoReader reader) {
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
                            return new PaymentPlanData.SummarySection((LocalizedString) obj, (LocalizedString) obj2, m, (Image) obj3, (LocalizedString) obj4, (PaymentPlanData.SummarySection.SourceInfo) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                m.add(PaymentPlanData.SummarySection.DetailItem.ADAPTER.decode(reader));
                                break;
                            case 4:
                                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                                break;
                            case 5:
                                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                                break;
                            case 6:
                                obj5 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.SummarySection.SourceInfo.ADAPTER, reader, obj5);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentPlanData.SummarySection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.summary_text);
                    PaymentPlanData.SummarySection.DetailItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.detail_items);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.source_icon);
                    protoAdapter2.encodeWithTag(writer, 5, value.source_text);
                    PaymentPlanData.SummarySection.SourceInfo.ADAPTER.encodeWithTag(writer, 6, value.source_info);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentPlanData.SummarySection value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return PaymentPlanData.SummarySection.SourceInfo.ADAPTER.encodedSizeWithTag(6, value.source_info) + protoAdapter2.encodedSizeWithTag(5, value.source_text) + Image.ADAPTER.encodedSizeWithTag(4, value.source_icon) + PaymentPlanData.SummarySection.DetailItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.detail_items) + protoAdapter2.encodedSizeWithTag(2, value.summary_text) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.SummarySection redact(PaymentPlanData.SummarySection value) {
                    value.getClass();
                    LocalizedString localizedString = value.title;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.summary_text;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.detail_items, PaymentPlanData.SummarySection.DetailItem.ADAPTER);
                    Image image = value.source_icon;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    LocalizedString localizedString5 = value.source_text;
                    LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                    PaymentPlanData.SummarySection.SourceInfo sourceInfo = value.source_info;
                    return value.copy(localizedString2, localizedString4, m1169redactElements, image2, localizedString6, sourceInfo != null ? (PaymentPlanData.SummarySection.SourceInfo) PaymentPlanData.SummarySection.SourceInfo.ADAPTER.redact(sourceInfo) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentPlanData.SummarySection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PaymentPlanData.SummarySection.SourceInfo.ADAPTER.encodeWithTag(writer, 6, value.source_info);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.source_text);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.source_icon);
                    PaymentPlanData.SummarySection.DetailItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.detail_items);
                    protoAdapter2.encodeWithTag(writer, 2, value.summary_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public SummarySection(LocalizedString localizedString, LocalizedString localizedString2, List list, Image image, LocalizedString localizedString3, SourceInfo sourceInfo, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? null : image, (i & 16) != 0 ? null : localizedString3, (i & 32) != 0 ? null : sourceInfo, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SummarySection copy$default(SummarySection summarySection, LocalizedString localizedString, LocalizedString localizedString2, List list, Image image, LocalizedString localizedString3, SourceInfo sourceInfo, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = summarySection.title;
            }
            if ((i & 2) != 0) {
                localizedString2 = summarySection.summary_text;
            }
            if ((i & 4) != 0) {
                list = summarySection.detail_items;
            }
            if ((i & 8) != 0) {
                image = summarySection.source_icon;
            }
            if ((i & 16) != 0) {
                localizedString3 = summarySection.source_text;
            }
            if ((i & 32) != 0) {
                sourceInfo = summarySection.source_info;
            }
            if ((i & 64) != 0) {
                byteString = summarySection.unknownFields();
            }
            SourceInfo sourceInfo2 = sourceInfo;
            ByteString byteString2 = byteString;
            LocalizedString localizedString4 = localizedString3;
            List list2 = list;
            return summarySection.copy(localizedString, localizedString2, list2, image, localizedString4, sourceInfo2, byteString2);
        }

        public final SummarySection copy(LocalizedString title, LocalizedString summary_text, List<DetailItem> detail_items, Image source_icon, LocalizedString source_text, SourceInfo source_info, ByteString unknownFields) {
            detail_items.getClass();
            unknownFields.getClass();
            return new SummarySection(title, summary_text, detail_items, source_icon, source_text, source_info, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SummarySection)) {
                return false;
            }
            SummarySection summarySection = (SummarySection) other;
            return Intrinsics.areEqual(unknownFields(), summarySection.unknownFields()) && Intrinsics.areEqual(this.title, summarySection.title) && Intrinsics.areEqual(this.summary_text, summarySection.summary_text) && Intrinsics.areEqual(this.detail_items, summarySection.detail_items) && Intrinsics.areEqual(this.source_icon, summarySection.source_icon) && Intrinsics.areEqual(this.source_text, summarySection.source_text) && Intrinsics.areEqual(this.source_info, summarySection.source_info);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.summary_text;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.detail_items);
            Image image = this.source_icon;
            int hashCode3 = (m + (image != null ? image.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.source_text;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            SourceInfo sourceInfo = this.source_info;
            int hashCode5 = hashCode4 + (sourceInfo != null ? sourceInfo.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.summary_text = this.summary_text;
            builder.detail_items = this.detail_items;
            builder.source_icon = this.source_icon;
            builder.source_text = this.source_text;
            builder.source_info = this.source_info;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.summary_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("summary_text=", localizedString2, arrayList);
            }
            if (!this.detail_items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("detail_items=", arrayList, this.detail_items);
            }
            Image image = this.source_icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("source_icon=", image, arrayList);
            }
            LocalizedString localizedString3 = this.source_text;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("source_text=", localizedString3, arrayList);
            }
            SourceInfo sourceInfo = this.source_info;
            if (sourceInfo != null) {
                arrayList.add("source_info=" + sourceInfo);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SummarySection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem$Builder;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DetailItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DetailItem> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString label;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizedString value;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "value", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public LocalizedString label;
                public LocalizedString value;

                @Override // com.squareup.wire.Message.Builder
                public DetailItem build() {
                    return new DetailItem(this.label, this.value, buildUnknownFields());
                }

                public final Builder label(LocalizedString label) {
                    this.label = label;
                    return this;
                }

                public final Builder value(LocalizedString value) {
                    this.value = value;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailItem.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$SummarySection$DetailItem$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.SummarySection.DetailItem decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PaymentPlanData.SummarySection.DetailItem((LocalizedString) obj, (LocalizedString) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PaymentPlanData.SummarySection.DetailItem value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PaymentPlanData.SummarySection.DetailItem value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        return protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.SummarySection.DetailItem redact(PaymentPlanData.SummarySection.DetailItem value) {
                        value.getClass();
                        LocalizedString localizedString = value.label;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        LocalizedString localizedString3 = value.value;
                        return value.copy(localizedString2, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PaymentPlanData.SummarySection.DetailItem value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ DetailItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ DetailItem copy$default(DetailItem detailItem, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = detailItem.label;
                }
                if ((i & 2) != 0) {
                    localizedString2 = detailItem.value;
                }
                if ((i & 4) != 0) {
                    byteString = detailItem.unknownFields();
                }
                return detailItem.copy(localizedString, localizedString2, byteString);
            }

            public final DetailItem copy(LocalizedString label, LocalizedString value, ByteString unknownFields) {
                unknownFields.getClass();
                return new DetailItem(label, value, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof DetailItem)) {
                    return false;
                }
                DetailItem detailItem = (DetailItem) other;
                return Intrinsics.areEqual(unknownFields(), detailItem.unknownFields()) && Intrinsics.areEqual(this.label, detailItem.label) && Intrinsics.areEqual(this.value, detailItem.value);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.label;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.value;
                int hashCode3 = hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.value = this.value;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.label;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.value;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("value=", localizedString2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DetailItem{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$DetailItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ DetailItem build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public DetailItem() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetailItem(LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = localizedString;
                this.value = localizedString2;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "description", "close_button_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SourceInfo extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SourceInfo> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
            public final LocalizedString close_button_text;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
            public final LocalizedString description;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "description", "close_button_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public LocalizedString close_button_text;
                public LocalizedString description;
                public LocalizedString title;

                @Override // com.squareup.wire.Message.Builder
                public SourceInfo build() {
                    return new SourceInfo(this.title, this.description, this.close_button_text, buildUnknownFields());
                }

                public final Builder close_button_text(LocalizedString close_button_text) {
                    this.close_button_text = close_button_text;
                    return this;
                }

                public final Builder description(LocalizedString description) {
                    this.description = description;
                    return this;
                }

                public final Builder title(LocalizedString title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SourceInfo.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$SummarySection$SourceInfo$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.SummarySection.SourceInfo decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PaymentPlanData.SummarySection.SourceInfo((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PaymentPlanData.SummarySection.SourceInfo value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.description);
                        protoAdapter2.encodeWithTag(writer, 3, value.close_button_text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PaymentPlanData.SummarySection.SourceInfo value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        return protoAdapter2.encodedSizeWithTag(3, value.close_button_text) + protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PaymentPlanData.SummarySection.SourceInfo redact(PaymentPlanData.SummarySection.SourceInfo value) {
                        value.getClass();
                        LocalizedString localizedString = value.title;
                        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                        LocalizedString localizedString3 = value.description;
                        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                        LocalizedString localizedString5 = value.close_button_text;
                        return value.copy(localizedString2, localizedString4, localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PaymentPlanData.SummarySection.SourceInfo value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 3, value.close_button_text);
                        protoAdapter2.encodeWithTag(writer, 2, value.description);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ SourceInfo(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : localizedString3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ SourceInfo copy$default(SourceInfo sourceInfo, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = sourceInfo.title;
                }
                if ((i & 2) != 0) {
                    localizedString2 = sourceInfo.description;
                }
                if ((i & 4) != 0) {
                    localizedString3 = sourceInfo.close_button_text;
                }
                if ((i & 8) != 0) {
                    byteString = sourceInfo.unknownFields();
                }
                return sourceInfo.copy(localizedString, localizedString2, localizedString3, byteString);
            }

            public final SourceInfo copy(LocalizedString title, LocalizedString description, LocalizedString close_button_text, ByteString unknownFields) {
                unknownFields.getClass();
                return new SourceInfo(title, description, close_button_text, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof SourceInfo)) {
                    return false;
                }
                SourceInfo sourceInfo = (SourceInfo) other;
                return Intrinsics.areEqual(unknownFields(), sourceInfo.unknownFields()) && Intrinsics.areEqual(this.title, sourceInfo.title) && Intrinsics.areEqual(this.description, sourceInfo.description) && Intrinsics.areEqual(this.close_button_text, sourceInfo.close_button_text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.title;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                LocalizedString localizedString2 = this.description;
                int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
                LocalizedString localizedString3 = this.close_button_text;
                int hashCode4 = hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.description = this.description;
                builder.close_button_text = this.close_button_text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.title;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
                }
                LocalizedString localizedString2 = this.description;
                if (localizedString2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("description=", localizedString2, arrayList);
                }
                LocalizedString localizedString3 = this.close_button_text;
                if (localizedString3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("close_button_text=", localizedString3, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SourceInfo{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$SourceInfo;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ SourceInfo build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public SourceInfo() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SourceInfo(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = localizedString;
                this.description = localizedString2;
                this.close_button_text = localizedString3;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SummarySection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

        public SummarySection() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SummarySection(LocalizedString localizedString, LocalizedString localizedString2, List<DetailItem> list, Image image, LocalizedString localizedString3, SourceInfo sourceInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.title = localizedString;
            this.summary_text = localizedString2;
            this.source_icon = image;
            this.source_text = localizedString3;
            this.source_info = sourceInfo;
            this.detail_items = TransactorKt.immutableCopyOf("detail_items", list);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentPlanData.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentPlanData decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentPlanData((String) obj, (Color) obj2, (UiAvatar) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (PaymentPlanData.ProgressSection) obj6, (PaymentPlanData.TimelineSection) obj7, (PaymentPlanData.TimelineSection) obj8, (PaymentPlanData.SummarySection) obj9, m, (PaymentPlanData.PurchasesSection) obj10, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.ProgressSection.ADAPTER, reader, obj6);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.TimelineSection.ADAPTER, reader, obj7);
                            break;
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.TimelineSection.ADAPTER, reader, obj8);
                            break;
                        case 9:
                            obj9 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.SummarySection.ADAPTER, reader, obj9);
                            break;
                        case 10:
                            m.add(PaymentPlanData.ClientRouteLink.ADAPTER.decode(reader));
                            break;
                        case 11:
                            obj10 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.PurchasesSection.ADAPTER, reader, obj10);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentPlanData value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
                Color.ADAPTER.encodeWithTag(writer, 2, value.accent_color);
                UiAvatar.ADAPTER.encodeWithTag(writer, 3, value.avatar);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.title);
                protoAdapter2.encodeWithTag(writer, 5, value.subtitle);
                PaymentPlanData.ProgressSection.ADAPTER.encodeWithTag(writer, 6, value.payment_progress_section);
                ProtoAdapter protoAdapter3 = PaymentPlanData.TimelineSection.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 7, value.refunds_timeline_section);
                protoAdapter3.encodeWithTag(writer, 8, value.payments_timeline_section);
                PaymentPlanData.SummarySection.ADAPTER.encodeWithTag(writer, 9, value.summary_section);
                PaymentPlanData.ClientRouteLink.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.client_route_links);
                PaymentPlanData.PurchasesSection.ADAPTER.encodeWithTag(writer, 11, value.purchase_section);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentPlanData value) {
                value.getClass();
                int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(3, value.avatar) + Color.ADAPTER.encodedSizeWithTag(2, value.accent_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.id) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                int encodedSizeWithTag2 = PaymentPlanData.ProgressSection.ADAPTER.encodedSizeWithTag(6, value.payment_progress_section) + protoAdapter2.encodedSizeWithTag(5, value.subtitle) + protoAdapter2.encodedSizeWithTag(4, value.title) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = PaymentPlanData.TimelineSection.ADAPTER;
                return PaymentPlanData.PurchasesSection.ADAPTER.encodedSizeWithTag(11, value.purchase_section) + PaymentPlanData.ClientRouteLink.ADAPTER.asRepeated().encodedSizeWithTag(10, value.client_route_links) + PaymentPlanData.SummarySection.ADAPTER.encodedSizeWithTag(9, value.summary_section) + protoAdapter3.encodedSizeWithTag(8, value.payments_timeline_section) + protoAdapter3.encodedSizeWithTag(7, value.refunds_timeline_section) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentPlanData redact(PaymentPlanData value) {
                value.getClass();
                Color color = value.accent_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                UiAvatar uiAvatar = value.avatar;
                UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
                LocalizedString localizedString = value.subtitle;
                LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                PaymentPlanData.ProgressSection progressSection = value.payment_progress_section;
                PaymentPlanData.ProgressSection progressSection2 = progressSection != null ? (PaymentPlanData.ProgressSection) PaymentPlanData.ProgressSection.ADAPTER.redact(progressSection) : null;
                PaymentPlanData.TimelineSection timelineSection = value.refunds_timeline_section;
                PaymentPlanData.TimelineSection timelineSection2 = timelineSection != null ? (PaymentPlanData.TimelineSection) PaymentPlanData.TimelineSection.ADAPTER.redact(timelineSection) : null;
                PaymentPlanData.TimelineSection timelineSection3 = value.payments_timeline_section;
                PaymentPlanData.TimelineSection timelineSection4 = timelineSection3 != null ? (PaymentPlanData.TimelineSection) PaymentPlanData.TimelineSection.ADAPTER.redact(timelineSection3) : null;
                PaymentPlanData.SummarySection summarySection = value.summary_section;
                PaymentPlanData.SummarySection summarySection2 = summarySection != null ? (PaymentPlanData.SummarySection) PaymentPlanData.SummarySection.ADAPTER.redact(summarySection) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.client_route_links, PaymentPlanData.ClientRouteLink.ADAPTER);
                PaymentPlanData.PurchasesSection purchasesSection = value.purchase_section;
                PaymentPlanData.PurchasesSection purchasesSection2 = purchasesSection != null ? (PaymentPlanData.PurchasesSection) PaymentPlanData.PurchasesSection.ADAPTER.redact(purchasesSection) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.id;
                byteString.getClass();
                return new PaymentPlanData(str, color2, uiAvatar2, null, localizedString2, progressSection2, timelineSection2, timelineSection4, summarySection2, m1169redactElements, purchasesSection2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentPlanData value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PaymentPlanData.PurchasesSection.ADAPTER.encodeWithTag(writer, 11, value.purchase_section);
                PaymentPlanData.ClientRouteLink.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.client_route_links);
                PaymentPlanData.SummarySection.ADAPTER.encodeWithTag(writer, 9, value.summary_section);
                ProtoAdapter protoAdapter2 = PaymentPlanData.TimelineSection.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 8, value.payments_timeline_section);
                protoAdapter2.encodeWithTag(writer, 7, value.refunds_timeline_section);
                PaymentPlanData.ProgressSection.ADAPTER.encodeWithTag(writer, 6, value.payment_progress_section);
                ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 5, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 4, value.title);
                UiAvatar.ADAPTER.encodeWithTag(writer, 3, value.avatar);
                Color.ADAPTER.encodeWithTag(writer, 2, value.accent_color);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPlanData(String str, Color color, UiAvatar uiAvatar, LocalizedString localizedString, LocalizedString localizedString2, ProgressSection progressSection, TimelineSection timelineSection, TimelineSection timelineSection2, SummarySection summarySection, List list, PurchasesSection purchasesSection, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.accent_color = color;
        this.avatar = uiAvatar;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.payment_progress_section = progressSection;
        this.refunds_timeline_section = timelineSection;
        this.payments_timeline_section = timelineSection2;
        this.summary_section = summarySection;
        this.purchase_section = purchasesSection;
        this.client_route_links = TransactorKt.immutableCopyOf("client_route_links", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentPlanData)) {
            return false;
        }
        PaymentPlanData paymentPlanData = (PaymentPlanData) obj;
        return Intrinsics.areEqual(unknownFields(), paymentPlanData.unknownFields()) && Intrinsics.areEqual(this.id, paymentPlanData.id) && Intrinsics.areEqual(this.accent_color, paymentPlanData.accent_color) && Intrinsics.areEqual(this.avatar, paymentPlanData.avatar) && Intrinsics.areEqual(this.title, paymentPlanData.title) && Intrinsics.areEqual(this.subtitle, paymentPlanData.subtitle) && Intrinsics.areEqual(this.payment_progress_section, paymentPlanData.payment_progress_section) && Intrinsics.areEqual(this.refunds_timeline_section, paymentPlanData.refunds_timeline_section) && Intrinsics.areEqual(this.payments_timeline_section, paymentPlanData.payments_timeline_section) && Intrinsics.areEqual(this.summary_section, paymentPlanData.summary_section) && Intrinsics.areEqual(this.client_route_links, paymentPlanData.client_route_links) && Intrinsics.areEqual(this.purchase_section, paymentPlanData.purchase_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.accent_color;
        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode4 = (hashCode3 + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode6 = (hashCode5 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        ProgressSection progressSection = this.payment_progress_section;
        int hashCode7 = (hashCode6 + (progressSection != null ? progressSection.hashCode() : 0)) * 37;
        TimelineSection timelineSection = this.refunds_timeline_section;
        int hashCode8 = (hashCode7 + (timelineSection != null ? timelineSection.hashCode() : 0)) * 37;
        TimelineSection timelineSection2 = this.payments_timeline_section;
        int hashCode9 = (hashCode8 + (timelineSection2 != null ? timelineSection2.hashCode() : 0)) * 37;
        SummarySection summarySection = this.summary_section;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (summarySection != null ? summarySection.hashCode() : 0)) * 37, 37, this.client_route_links);
        PurchasesSection purchasesSection = this.purchase_section;
        int hashCode10 = m + (purchasesSection != null ? purchasesSection.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.accent_color = this.accent_color;
        builder.avatar = this.avatar;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.payment_progress_section = this.payment_progress_section;
        builder.refunds_timeline_section = this.refunds_timeline_section;
        builder.payments_timeline_section = this.payments_timeline_section;
        builder.summary_section = this.summary_section;
        builder.client_route_links = this.client_route_links;
        builder.purchase_section = this.purchase_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Color color = this.accent_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accent_color=", color, arrayList);
        }
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        LocalizedString localizedString = this.subtitle;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString, arrayList);
        }
        ProgressSection progressSection = this.payment_progress_section;
        if (progressSection != null) {
            arrayList.add("payment_progress_section=" + progressSection);
        }
        TimelineSection timelineSection = this.refunds_timeline_section;
        if (timelineSection != null) {
            arrayList.add("refunds_timeline_section=" + timelineSection);
        }
        TimelineSection timelineSection2 = this.payments_timeline_section;
        if (timelineSection2 != null) {
            arrayList.add("payments_timeline_section=" + timelineSection2);
        }
        SummarySection summarySection = this.summary_section;
        if (summarySection != null) {
            arrayList.add("summary_section=" + summarySection);
        }
        if (!this.client_route_links.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("client_route_links=", arrayList, this.client_route_links);
        }
        PurchasesSection purchasesSection = this.purchase_section;
        if (purchasesSection != null) {
            arrayList.add("purchase_section=" + purchasesSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentPlanData{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\bH\u0016J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink$Builder;", "icon", "Lcom/squareup/protos/cash/ui/Image;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "url", "", "accessory_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/lang/String;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ClientRouteLink extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteLink> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString accessory_text;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image icon;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String url;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink;", "<init>", "()V", "icon", "Lcom/squareup/protos/cash/ui/Image;", AnnotatedPrivateKey.LABEL, "Lcom/squareup/protos/cash/localization/LocalizedString;", "url", "", "accessory_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString accessory_text;
            public Image icon;
            public LocalizedString label;
            public String url;

            public final Builder accessory_text(LocalizedString accessory_text) {
                this.accessory_text = accessory_text;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ClientRouteLink build() {
                return new ClientRouteLink(this.icon, this.label, this.url, this.accessory_text, buildUnknownFields());
            }

            public final Builder icon(Image icon) {
                this.icon = icon;
                return this;
            }

            public final Builder label(LocalizedString label) {
                this.label = label;
                return this;
            }

            public final Builder url(String url) {
                this.url = url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientRouteLink.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$ClientRouteLink$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.ClientRouteLink decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentPlanData.ClientRouteLink((Image) obj, (LocalizedString) obj2, (String) obj3, (LocalizedString) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentPlanData.ClientRouteLink value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.label);
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.url);
                    protoAdapter2.encodeWithTag(writer, 4, value.accessory_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentPlanData.ClientRouteLink value) {
                    value.getClass();
                    int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(4, value.accessory_text) + ProtoAdapter.STRING.encodedSizeWithTag(3, value.url) + protoAdapter2.encodedSizeWithTag(2, value.label) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.ClientRouteLink redact(PaymentPlanData.ClientRouteLink value) {
                    value.getClass();
                    Image image = value.icon;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    LocalizedString localizedString = value.label;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.accessory_text;
                    return PaymentPlanData.ClientRouteLink.copy$default(value, image2, localizedString2, null, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY, 4, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentPlanData.ClientRouteLink value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.accessory_text);
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.url);
                    protoAdapter2.encodeWithTag(writer, 2, value.label);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.icon);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ClientRouteLink(Image image, LocalizedString localizedString, String str, LocalizedString localizedString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : localizedString, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : localizedString2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ClientRouteLink copy$default(ClientRouteLink clientRouteLink, Image image, LocalizedString localizedString, String str, LocalizedString localizedString2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = clientRouteLink.icon;
            }
            if ((i & 2) != 0) {
                localizedString = clientRouteLink.label;
            }
            if ((i & 4) != 0) {
                str = clientRouteLink.url;
            }
            if ((i & 8) != 0) {
                localizedString2 = clientRouteLink.accessory_text;
            }
            if ((i & 16) != 0) {
                byteString = clientRouteLink.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str2 = str;
            return clientRouteLink.copy(image, localizedString, str2, localizedString2, byteString2);
        }

        public final ClientRouteLink copy(Image icon, LocalizedString label, String url, LocalizedString accessory_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new ClientRouteLink(icon, label, url, accessory_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClientRouteLink)) {
                return false;
            }
            ClientRouteLink clientRouteLink = (ClientRouteLink) other;
            return Intrinsics.areEqual(unknownFields(), clientRouteLink.unknownFields()) && Intrinsics.areEqual(this.icon, clientRouteLink.icon) && Intrinsics.areEqual(this.label, clientRouteLink.label) && Intrinsics.areEqual(this.url, clientRouteLink.url) && Intrinsics.areEqual(this.accessory_text, clientRouteLink.accessory_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.icon;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            LocalizedString localizedString = this.label;
            int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            String str = this.url;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.accessory_text;
            int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon = this.icon;
            builder.label = this.label;
            builder.url = this.url;
            builder.accessory_text = this.accessory_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.icon;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
            }
            LocalizedString localizedString = this.label;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("label=", localizedString, arrayList);
            }
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            LocalizedString localizedString2 = this.accessory_text;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessory_text=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteLink{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ClientRouteLink;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClientRouteLink build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ClientRouteLink() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteLink(Image image, LocalizedString localizedString, String str, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon = image;
            this.label = localizedString;
            this.url = str;
            this.accessory_text = localizedString2;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection$Builder;", "current_paid", "Lcom/squareup/protos/cash/localization/LocalizedString;", "current_paid_label", "left_to_pay", "left_to_pay_label", "progress_percent", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/cash/localization/LocalizedString;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProgressSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ProgressSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString current_paid;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalizedString current_paid_label;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalizedString left_to_pay;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString left_to_pay_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 4, tag = 5)
        public final Float progress_percent;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "<init>", "()V", "current_paid", "Lcom/squareup/protos/cash/localization/LocalizedString;", "current_paid_label", "left_to_pay", "left_to_pay_label", "progress_percent", "", "Ljava/lang/Float;", "(Ljava/lang/Float;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalizedString current_paid;
            public LocalizedString current_paid_label;
            public LocalizedString left_to_pay;
            public LocalizedString left_to_pay_label;
            public Float progress_percent;

            @Override // com.squareup.wire.Message.Builder
            public ProgressSection build() {
                return new ProgressSection(this.current_paid, this.current_paid_label, this.left_to_pay, this.left_to_pay_label, this.progress_percent, buildUnknownFields());
            }

            public final Builder current_paid(LocalizedString current_paid) {
                this.current_paid = current_paid;
                return this;
            }

            public final Builder current_paid_label(LocalizedString current_paid_label) {
                this.current_paid_label = current_paid_label;
                return this;
            }

            public final Builder left_to_pay(LocalizedString left_to_pay) {
                this.left_to_pay = left_to_pay;
                return this;
            }

            public final Builder left_to_pay_label(LocalizedString left_to_pay_label) {
                this.left_to_pay_label = left_to_pay_label;
                return this;
            }

            public final Builder progress_percent(Float progress_percent) {
                this.progress_percent = progress_percent;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ProgressSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$ProgressSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.ProgressSection decode(ProtoReader reader) {
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
                            return new PaymentPlanData.ProgressSection((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (Float) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentPlanData.ProgressSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.current_paid);
                    protoAdapter2.encodeWithTag(writer, 2, value.current_paid_label);
                    protoAdapter2.encodeWithTag(writer, 3, value.left_to_pay);
                    protoAdapter2.encodeWithTag(writer, 4, value.left_to_pay_label);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, value.progress_percent);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentPlanData.ProgressSection value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return ProtoAdapter.FLOAT.encodedSizeWithTag(5, value.progress_percent) + protoAdapter2.encodedSizeWithTag(4, value.left_to_pay_label) + protoAdapter2.encodedSizeWithTag(3, value.left_to_pay) + protoAdapter2.encodedSizeWithTag(2, value.current_paid_label) + protoAdapter2.encodedSizeWithTag(1, value.current_paid) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.ProgressSection redact(PaymentPlanData.ProgressSection value) {
                    value.getClass();
                    LocalizedString localizedString = value.current_paid;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    LocalizedString localizedString3 = value.current_paid_label;
                    LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
                    LocalizedString localizedString5 = value.left_to_pay;
                    LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
                    LocalizedString localizedString7 = value.left_to_pay_label;
                    return PaymentPlanData.ProgressSection.copy$default(value, localizedString2, localizedString4, localizedString6, localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null, null, ByteString.EMPTY, 16, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentPlanData.ProgressSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 5, value.progress_percent);
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.left_to_pay_label);
                    protoAdapter2.encodeWithTag(writer, 3, value.left_to_pay);
                    protoAdapter2.encodeWithTag(writer, 2, value.current_paid_label);
                    protoAdapter2.encodeWithTag(writer, 1, value.current_paid);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ProgressSection(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, Float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : localizedString2, (i & 4) != 0 ? null : localizedString3, (i & 8) != 0 ? null : localizedString4, (i & 16) != 0 ? null : f, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ProgressSection copy$default(ProgressSection progressSection, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, Float f, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = progressSection.current_paid;
            }
            if ((i & 2) != 0) {
                localizedString2 = progressSection.current_paid_label;
            }
            if ((i & 4) != 0) {
                localizedString3 = progressSection.left_to_pay;
            }
            if ((i & 8) != 0) {
                localizedString4 = progressSection.left_to_pay_label;
            }
            if ((i & 16) != 0) {
                f = progressSection.progress_percent;
            }
            if ((i & 32) != 0) {
                byteString = progressSection.unknownFields();
            }
            Float f2 = f;
            ByteString byteString2 = byteString;
            return progressSection.copy(localizedString, localizedString2, localizedString3, localizedString4, f2, byteString2);
        }

        public final ProgressSection copy(LocalizedString current_paid, LocalizedString current_paid_label, LocalizedString left_to_pay, LocalizedString left_to_pay_label, Float progress_percent, ByteString unknownFields) {
            unknownFields.getClass();
            return new ProgressSection(current_paid, current_paid_label, left_to_pay, left_to_pay_label, progress_percent, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ProgressSection)) {
                return false;
            }
            ProgressSection progressSection = (ProgressSection) other;
            return Intrinsics.areEqual(unknownFields(), progressSection.unknownFields()) && Intrinsics.areEqual(this.current_paid, progressSection.current_paid) && Intrinsics.areEqual(this.current_paid_label, progressSection.current_paid_label) && Intrinsics.areEqual(this.left_to_pay, progressSection.left_to_pay) && Intrinsics.areEqual(this.left_to_pay_label, progressSection.left_to_pay_label) && Intrinsics.areEqual(this.progress_percent, progressSection.progress_percent);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.current_paid;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.current_paid_label;
            int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
            LocalizedString localizedString3 = this.left_to_pay;
            int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
            LocalizedString localizedString4 = this.left_to_pay_label;
            int hashCode5 = (hashCode4 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
            Float f = this.progress_percent;
            int hashCode6 = hashCode5 + (f != null ? Float.hashCode(f.floatValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.current_paid = this.current_paid;
            builder.current_paid_label = this.current_paid_label;
            builder.left_to_pay = this.left_to_pay;
            builder.left_to_pay_label = this.left_to_pay_label;
            builder.progress_percent = this.progress_percent;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.current_paid;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("current_paid=", localizedString, arrayList);
            }
            LocalizedString localizedString2 = this.current_paid_label;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("current_paid_label=", localizedString2, arrayList);
            }
            LocalizedString localizedString3 = this.left_to_pay;
            if (localizedString3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("left_to_pay=", localizedString3, arrayList);
            }
            LocalizedString localizedString4 = this.left_to_pay_label;
            if (localizedString4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("left_to_pay_label=", localizedString4, arrayList);
            }
            Float f = this.progress_percent;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("progress_percent=", f, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$ProgressSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ProgressSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ProgressSection() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressSection(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, Float f, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.current_paid = localizedString;
            this.current_paid_label = localizedString2;
            this.left_to_pay = localizedString3;
            this.left_to_pay_label = localizedString4;
            this.progress_percent = f;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection$Builder;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "timeline", "Lcom/squareup/protos/franklin/ui/Timeline;", "button", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lcom/squareup/protos/franklin/ui/Timeline;Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;Lcom/squareup/protos/cash/localization/LocalizedString;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TimelineSection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TimelineSection> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.lending.payment_plans.PaymentPlanData$SubmitButton#ADAPTER", schemaIndex = 2, tag = 3)
        public final SubmitButton button;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalizedString subtitle;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline#ADAPTER", schemaIndex = 1, tag = 2)
        public final Timeline timeline;

        @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
        public final LocalizedString title;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "<init>", "()V", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "timeline", "Lcom/squareup/protos/franklin/ui/Timeline;", "button", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$SubmitButton;", "subtitle", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public SubmitButton button;
            public LocalizedString subtitle;
            public Timeline timeline;
            public LocalizedString title;

            @Override // com.squareup.wire.Message.Builder
            public TimelineSection build() {
                return new TimelineSection(this.title, this.timeline, this.button, this.subtitle, buildUnknownFields());
            }

            public final Builder button(SubmitButton button) {
                this.button = button;
                return this;
            }

            public final Builder subtitle(LocalizedString subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }

            public final Builder title(LocalizedString title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TimelineSection.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.lending.payment_plans.PaymentPlanData$TimelineSection$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.TimelineSection decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PaymentPlanData.TimelineSection((LocalizedString) obj, (Timeline) obj2, (PaymentPlanData.SubmitButton) obj3, (LocalizedString) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(PaymentPlanData.SubmitButton.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PaymentPlanData.TimelineSection value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    Timeline.ADAPTER.encodeWithTag(writer, 2, value.timeline);
                    PaymentPlanData.SubmitButton.ADAPTER.encodeWithTag(writer, 3, value.button);
                    protoAdapter2.encodeWithTag(writer, 4, value.subtitle);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PaymentPlanData.TimelineSection value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(4, value.subtitle) + PaymentPlanData.SubmitButton.ADAPTER.encodedSizeWithTag(3, value.button) + Timeline.ADAPTER.encodedSizeWithTag(2, value.timeline) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PaymentPlanData.TimelineSection redact(PaymentPlanData.TimelineSection value) {
                    value.getClass();
                    LocalizedString localizedString = value.title;
                    LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
                    Timeline timeline = value.timeline;
                    Timeline timeline2 = timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null;
                    PaymentPlanData.SubmitButton submitButton = value.button;
                    PaymentPlanData.SubmitButton submitButton2 = submitButton != null ? (PaymentPlanData.SubmitButton) PaymentPlanData.SubmitButton.ADAPTER.redact(submitButton) : null;
                    LocalizedString localizedString3 = value.subtitle;
                    return value.copy(localizedString2, timeline2, submitButton2, localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PaymentPlanData.TimelineSection value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 4, value.subtitle);
                    PaymentPlanData.SubmitButton.ADAPTER.encodeWithTag(writer, 3, value.button);
                    Timeline.ADAPTER.encodeWithTag(writer, 2, value.timeline);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TimelineSection(LocalizedString localizedString, Timeline timeline, SubmitButton submitButton, LocalizedString localizedString2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : timeline, (i & 4) != 0 ? null : submitButton, (i & 8) != 0 ? null : localizedString2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TimelineSection copy$default(TimelineSection timelineSection, LocalizedString localizedString, Timeline timeline, SubmitButton submitButton, LocalizedString localizedString2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                localizedString = timelineSection.title;
            }
            if ((i & 2) != 0) {
                timeline = timelineSection.timeline;
            }
            if ((i & 4) != 0) {
                submitButton = timelineSection.button;
            }
            if ((i & 8) != 0) {
                localizedString2 = timelineSection.subtitle;
            }
            if ((i & 16) != 0) {
                byteString = timelineSection.unknownFields();
            }
            ByteString byteString2 = byteString;
            SubmitButton submitButton2 = submitButton;
            return timelineSection.copy(localizedString, timeline, submitButton2, localizedString2, byteString2);
        }

        public final TimelineSection copy(LocalizedString title, Timeline timeline, SubmitButton button, LocalizedString subtitle, ByteString unknownFields) {
            unknownFields.getClass();
            return new TimelineSection(title, timeline, button, subtitle, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TimelineSection)) {
                return false;
            }
            TimelineSection timelineSection = (TimelineSection) other;
            return Intrinsics.areEqual(unknownFields(), timelineSection.unknownFields()) && Intrinsics.areEqual(this.title, timelineSection.title) && Intrinsics.areEqual(this.timeline, timelineSection.timeline) && Intrinsics.areEqual(this.button, timelineSection.button) && Intrinsics.areEqual(this.subtitle, timelineSection.subtitle);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalizedString localizedString = this.title;
            int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
            Timeline timeline = this.timeline;
            int hashCode3 = (hashCode2 + (timeline != null ? timeline.hashCode() : 0)) * 37;
            SubmitButton submitButton = this.button;
            int hashCode4 = (hashCode3 + (submitButton != null ? submitButton.hashCode() : 0)) * 37;
            LocalizedString localizedString2 = this.subtitle;
            int hashCode5 = hashCode4 + (localizedString2 != null ? localizedString2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.timeline = this.timeline;
            builder.button = this.button;
            builder.subtitle = this.subtitle;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            LocalizedString localizedString = this.title;
            if (localizedString != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
            }
            Timeline timeline = this.timeline;
            if (timeline != null) {
                arrayList.add("timeline=" + timeline);
            }
            SubmitButton submitButton = this.button;
            if (submitButton != null) {
                arrayList.add("button=" + submitButton);
            }
            LocalizedString localizedString2 = this.subtitle;
            if (localizedString2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TimelineSection{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$TimelineSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TimelineSection build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TimelineSection() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimelineSection(LocalizedString localizedString, Timeline timeline, SubmitButton submitButton, LocalizedString localizedString2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = localizedString;
            this.timeline = timeline;
            this.button = submitButton;
            this.subtitle = localizedString2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData$Builder;", "", "body", "Lcom/squareup/protos/lending/payment_plans/PaymentPlanData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/lending/payment_plans/PaymentPlanData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentPlanData build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
