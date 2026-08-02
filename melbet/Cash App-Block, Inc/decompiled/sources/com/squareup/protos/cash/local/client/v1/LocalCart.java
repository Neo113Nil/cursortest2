package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalCart;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006 \u001f!\"#$R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006%"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Builder;", "", "token", "Ljava/lang/String;", "version", "brand_token", "location_token", "unit_token", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "lines_subtotal", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "total", "checkout_url", "checkout_flow_token", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "charges_breakdown", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "open_tab_info", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "payment_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "lines", "Ljava/util/List;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine;", "summary_lines", "Companion", "Builder", "PaymentSummary", "OpenTabInfo", "Line", "SummaryLine", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LocalCart extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCart> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 2)
    public final String brand_token;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown#ADAPTER", schemaIndex = 11, tag = 11)
    public final DynamicChargesBreakdown charges_breakdown;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 10)
    public final String checkout_flow_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 8)
    public final String checkout_url;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 4)
    public final List<Line> lines;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 6, tag = 5)
    public final LocalMoney lines_subtotal;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 3)
    public final String location_token;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$OpenTabInfo#ADAPTER", schemaIndex = 12, tag = 13)
    public final OpenTabInfo open_tab_info;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$PaymentSummary#ADAPTER", schemaIndex = 13, tag = 14)
    public final PaymentSummary payment_summary;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$SummaryLine#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 6)
    public final List<SummaryLine> summary_lines;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String token;

    @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 8, tag = 7)
    public final LocalMoney total;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 12)
    public final String unit_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 9)
    public final String version;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "<init>", "()V", "token", "", "version", "brand_token", "location_token", "unit_token", "lines", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "lines_subtotal", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "summary_lines", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine;", "total", "checkout_url", "checkout_flow_token", "charges_breakdown", "Lcom/squareup/protos/cash/local/client/v1/DynamicChargesBreakdown;", "open_tab_info", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "payment_summary", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String brand_token;
        public DynamicChargesBreakdown charges_breakdown;
        public String checkout_flow_token;
        public String checkout_url;
        public List<Line> lines;
        public LocalMoney lines_subtotal;
        public String location_token;
        public OpenTabInfo open_tab_info;
        public PaymentSummary payment_summary;
        public List<SummaryLine> summary_lines;
        public String token;
        public LocalMoney total;
        public String unit_token;
        public String version;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.lines = emptyList;
            this.summary_lines = emptyList;
        }

        public final Builder brand_token(String brand_token) {
            this.brand_token = brand_token;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LocalCart build() {
            return new LocalCart(this.token, this.version, this.brand_token, this.location_token, this.unit_token, this.lines, this.lines_subtotal, this.summary_lines, this.total, this.checkout_url, this.checkout_flow_token, this.charges_breakdown, this.open_tab_info, this.payment_summary, buildUnknownFields());
        }

        public final Builder charges_breakdown(DynamicChargesBreakdown charges_breakdown) {
            this.charges_breakdown = charges_breakdown;
            return this;
        }

        public final Builder checkout_flow_token(String checkout_flow_token) {
            this.checkout_flow_token = checkout_flow_token;
            return this;
        }

        public final Builder checkout_url(String checkout_url) {
            this.checkout_url = checkout_url;
            return this;
        }

        public final Builder lines(List<Line> lines) {
            lines.getClass();
            TransactorKt.checkElementsNotNull(lines);
            this.lines = lines;
            return this;
        }

        public final Builder lines_subtotal(LocalMoney lines_subtotal) {
            this.lines_subtotal = lines_subtotal;
            return this;
        }

        public final Builder location_token(String location_token) {
            this.location_token = location_token;
            return this;
        }

        public final Builder open_tab_info(OpenTabInfo open_tab_info) {
            this.open_tab_info = open_tab_info;
            return this;
        }

        public final Builder payment_summary(PaymentSummary payment_summary) {
            this.payment_summary = payment_summary;
            return this;
        }

        public final Builder summary_lines(List<SummaryLine> summary_lines) {
            summary_lines.getClass();
            TransactorKt.checkElementsNotNull(summary_lines);
            this.summary_lines = summary_lines;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }

        public final Builder total(LocalMoney total) {
            this.total = total;
            return this;
        }

        public final Builder unit_token(String unit_token) {
            this.unit_token = unit_token;
            return this;
        }

        public final Builder version(String version) {
            this.version = version;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Builder;", "rounds", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "Round", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OpenTabInfo extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenTabInfo> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$OpenTabInfo$Round#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Round> rounds;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "<init>", "()V", "rounds", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Round> rounds = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public OpenTabInfo build() {
                return new OpenTabInfo(this.rounds, buildUnknownFields());
            }

            public final Builder rounds(List<Round> rounds) {
                rounds.getClass();
                TransactorKt.checkElementsNotNull(rounds);
                this.rounds = rounds;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenTabInfo.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$OpenTabInfo$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.OpenTabInfo decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalCart.OpenTabInfo(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(LocalCart.OpenTabInfo.Round.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalCart.OpenTabInfo value) {
                    writer.getClass();
                    value.getClass();
                    LocalCart.OpenTabInfo.Round.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.rounds);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalCart.OpenTabInfo value) {
                    value.getClass();
                    return LocalCart.OpenTabInfo.Round.ADAPTER.asRepeated().encodedSizeWithTag(1, value.rounds) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.OpenTabInfo redact(LocalCart.OpenTabInfo value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.rounds, LocalCart.OpenTabInfo.Round.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalCart.OpenTabInfo value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalCart.OpenTabInfo.Round.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.rounds);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenTabInfo(List<Round> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.rounds = TransactorKt.immutableCopyOf("rounds", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenTabInfo copy$default(OpenTabInfo openTabInfo, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = openTabInfo.rounds;
            }
            if ((i & 2) != 0) {
                byteString = openTabInfo.unknownFields();
            }
            return openTabInfo.copy(list, byteString);
        }

        public final OpenTabInfo copy(List<Round> rounds, ByteString unknownFields) {
            rounds.getClass();
            unknownFields.getClass();
            return new OpenTabInfo(rounds, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof OpenTabInfo)) {
                return false;
            }
            OpenTabInfo openTabInfo = (OpenTabInfo) other;
            return Intrinsics.areEqual(unknownFields(), openTabInfo.unknownFields()) && Intrinsics.areEqual(this.rounds, openTabInfo.rounds);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.rounds.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.rounds = this.rounds;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.rounds.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("rounds=", arrayList, this.rounds);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenTabInfo{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBE\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0006H\u0016JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round$Builder;", "created_at_millis", "", "status_label", "", "lines", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "subtotal", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Lokio/ByteString;)V", "Ljava/lang/Long;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Round extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Round> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 0, tag = 1)
            public final Long created_at_millis;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
            public final List<Line> lines;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String status_label;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 3, tag = 4)
            public final LocalMoney subtotal;

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000fJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "<init>", "()V", "created_at_millis", "", "Ljava/lang/Long;", "status_label", "", "lines", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "subtotal", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Long created_at_millis;
                public List<Line> lines = EmptyList.INSTANCE;
                public String status_label;
                public LocalMoney subtotal;

                @Override // com.squareup.wire.Message.Builder
                public Round build() {
                    return new Round(this.created_at_millis, this.status_label, this.lines, this.subtotal, buildUnknownFields());
                }

                public final Builder created_at_millis(Long created_at_millis) {
                    this.created_at_millis = created_at_millis;
                    return this;
                }

                public final Builder lines(List<Line> lines) {
                    lines.getClass();
                    TransactorKt.checkElementsNotNull(lines);
                    this.lines = lines;
                    return this;
                }

                public final Builder status_label(String status_label) {
                    this.status_label = status_label;
                    return this;
                }

                public final Builder subtotal(LocalMoney subtotal) {
                    this.subtotal = subtotal;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Round.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$OpenTabInfo$Round$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalCart.OpenTabInfo.Round decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new LocalCart.OpenTabInfo.Round((Long) obj, (String) obj2, m, (LocalMoney) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.INT64.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                m.add(LocalCart.Line.ADAPTER.decode(reader));
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj3);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalCart.OpenTabInfo.Round value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.INT64.encodeWithTag(writer, 1, value.created_at_millis);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.status_label);
                        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.lines);
                        LocalMoney.ADAPTER.encodeWithTag(writer, 4, value.subtotal);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalCart.OpenTabInfo.Round value) {
                        value.getClass();
                        return LocalMoney.ADAPTER.encodedSizeWithTag(4, value.subtotal) + LocalCart.Line.ADAPTER.asRepeated().encodedSizeWithTag(3, value.lines) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.status_label) + ProtoAdapter.INT64.encodedSizeWithTag(1, value.created_at_millis) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalCart.OpenTabInfo.Round redact(LocalCart.OpenTabInfo.Round value) {
                        value.getClass();
                        ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.lines, LocalCart.Line.ADAPTER);
                        LocalMoney localMoney = value.subtotal;
                        return LocalCart.OpenTabInfo.Round.copy$default(value, null, null, m1169redactElements, localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null, ByteString.EMPTY, 3, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalCart.OpenTabInfo.Round value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        LocalMoney.ADAPTER.encodeWithTag(writer, 4, value.subtotal);
                        LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.lines);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.status_label);
                        ProtoAdapter.INT64.encodeWithTag(writer, 1, value.created_at_millis);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public Round(Long l, String str, List list, LocalMoney localMoney, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? EmptyList.INSTANCE : list, (i & 8) != 0 ? null : localMoney, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Round copy$default(Round round, Long l, String str, List list, LocalMoney localMoney, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = round.created_at_millis;
                }
                if ((i & 2) != 0) {
                    str = round.status_label;
                }
                if ((i & 4) != 0) {
                    list = round.lines;
                }
                if ((i & 8) != 0) {
                    localMoney = round.subtotal;
                }
                if ((i & 16) != 0) {
                    byteString = round.unknownFields();
                }
                ByteString byteString2 = byteString;
                List list2 = list;
                return round.copy(l, str, list2, localMoney, byteString2);
            }

            public final Round copy(Long created_at_millis, String status_label, List<Line> lines, LocalMoney subtotal, ByteString unknownFields) {
                lines.getClass();
                unknownFields.getClass();
                return new Round(created_at_millis, status_label, lines, subtotal, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Round)) {
                    return false;
                }
                Round round = (Round) other;
                return Intrinsics.areEqual(unknownFields(), round.unknownFields()) && Intrinsics.areEqual(this.created_at_millis, round.created_at_millis) && Intrinsics.areEqual(this.status_label, round.status_label) && Intrinsics.areEqual(this.lines, round.lines) && Intrinsics.areEqual(this.subtotal, round.subtotal);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Long l = this.created_at_millis;
                int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                String str = this.status_label;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.lines);
                LocalMoney localMoney = this.subtotal;
                int hashCode3 = m + (localMoney != null ? localMoney.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.created_at_millis = this.created_at_millis;
                builder.status_label = this.status_label;
                builder.lines = this.lines;
                builder.subtotal = this.subtotal;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Long l = this.created_at_millis;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_millis=", l, arrayList);
                }
                String str = this.status_label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "status_label=", arrayList);
                }
                if (!this.lines.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("lines=", arrayList, this.lines);
                }
                LocalMoney localMoney = this.subtotal;
                if (localMoney != null) {
                    SizeMode$EnumUnboxingLocalUtility.m("subtotal=", localMoney, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Round{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Round;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Round build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Round() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Round(Long l, String str, List<Line> list, LocalMoney localMoney, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.created_at_millis = l;
                this.status_label = str;
                this.subtotal = localMoney;
                this.lines = TransactorKt.immutableCopyOf("lines", list);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$OpenTabInfo;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ OpenTabInfo build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public OpenTabInfo(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public OpenTabInfo() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Builder;", "description", "", "amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "type", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Type", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SummaryLine extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SummaryLine> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 1, tag = 2)
        public final LocalMoney amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String description;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$SummaryLine$Type#ADAPTER", schemaIndex = 2, tag = 3)
        public final Type type;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine;", "<init>", "()V", "description", "", "amount", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "type", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalMoney amount;
            public String description;
            public Type type;

            public final Builder amount(LocalMoney amount) {
                this.amount = amount;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public SummaryLine build() {
                return new SummaryLine(this.description, this.amount, this.type, buildUnknownFields());
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SummaryLine.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$SummaryLine$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.SummaryLine decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalCart.SummaryLine((String) obj, (LocalMoney) obj2, (LocalCart.SummaryLine.Type) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj2);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj3 = LocalCart.SummaryLine.Type.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalCart.SummaryLine value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.description);
                    LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.amount);
                    LocalCart.SummaryLine.Type.ADAPTER.encodeWithTag(writer, 3, value.type);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalCart.SummaryLine value) {
                    value.getClass();
                    return LocalCart.SummaryLine.Type.ADAPTER.encodedSizeWithTag(3, value.type) + LocalMoney.ADAPTER.encodedSizeWithTag(2, value.amount) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.description) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.SummaryLine redact(LocalCart.SummaryLine value) {
                    value.getClass();
                    LocalMoney localMoney = value.amount;
                    return LocalCart.SummaryLine.copy$default(value, null, localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null, null, ByteString.EMPTY, 5, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalCart.SummaryLine value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalCart.SummaryLine.Type.ADAPTER.encodeWithTag(writer, 3, value.type);
                    LocalMoney.ADAPTER.encodeWithTag(writer, 2, value.amount);
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.description);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ SummaryLine(String str, LocalMoney localMoney, Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : localMoney, (i & 4) != 0 ? null : type2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ SummaryLine copy$default(SummaryLine summaryLine, String str, LocalMoney localMoney, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = summaryLine.description;
            }
            if ((i & 2) != 0) {
                localMoney = summaryLine.amount;
            }
            if ((i & 4) != 0) {
                type2 = summaryLine.type;
            }
            if ((i & 8) != 0) {
                byteString = summaryLine.unknownFields();
            }
            return summaryLine.copy(str, localMoney, type2, byteString);
        }

        public final SummaryLine copy(String description, LocalMoney amount, Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new SummaryLine(description, amount, type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SummaryLine)) {
                return false;
            }
            SummaryLine summaryLine = (SummaryLine) other;
            return Intrinsics.areEqual(unknownFields(), summaryLine.unknownFields()) && Intrinsics.areEqual(this.description, summaryLine.description) && Intrinsics.areEqual(this.amount, summaryLine.amount) && this.type == summaryLine.type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.description;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.amount;
            int hashCode3 = (hashCode2 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            Type type2 = this.type;
            int hashCode4 = hashCode3 + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.description = this.description;
            builder.amount = this.amount;
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.description;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description=", arrayList);
            }
            LocalMoney localMoney = this.amount;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("amount=", localMoney, arrayList);
            }
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SummaryLine{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "TYPE_SUBTOTAL", "TYPE_DISCOUNT", "TYPE_SALES_TAX", "TYPE_DELIVERY_FEE", "TYPE_SERVICE_FEE", "TYPE_CUSTOM_SERVICE_CHARGE", "TYPE_TIP", "TYPE_GIFT_CARD", "TYPE_LOCAL_CASH", "TYPE_TOTAL_BEFORE_TIP", "TYPE_COUPON", "TYPE_REWARD", "TYPE_SHIPPING_FEE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Type TYPE_COUPON;
            public static final Type TYPE_CUSTOM_SERVICE_CHARGE;
            public static final Type TYPE_DELIVERY_FEE;
            public static final Type TYPE_DISCOUNT;
            public static final Type TYPE_GIFT_CARD;
            public static final Type TYPE_LOCAL_CASH;
            public static final Type TYPE_REWARD;
            public static final Type TYPE_SALES_TAX;
            public static final Type TYPE_SERVICE_FEE;
            public static final Type TYPE_SHIPPING_FEE;
            public static final Type TYPE_SUBTOTAL;
            public static final Type TYPE_TIP;
            public static final Type TYPE_TOTAL_BEFORE_TIP;
            public static final Type TYPE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TYPE_UNSPECIFIED, TYPE_SUBTOTAL, TYPE_DISCOUNT, TYPE_SALES_TAX, TYPE_DELIVERY_FEE, TYPE_SERVICE_FEE, TYPE_CUSTOM_SERVICE_CHARGE, TYPE_TIP, TYPE_GIFT_CARD, TYPE_LOCAL_CASH, TYPE_TOTAL_BEFORE_TIP, TYPE_COUPON, TYPE_REWARD, TYPE_SHIPPING_FEE};
            }

            static {
                final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
                TYPE_UNSPECIFIED = type2;
                TYPE_SUBTOTAL = new Type("TYPE_SUBTOTAL", 1, 1);
                TYPE_DISCOUNT = new Type("TYPE_DISCOUNT", 2, 2);
                TYPE_SALES_TAX = new Type("TYPE_SALES_TAX", 3, 3);
                TYPE_DELIVERY_FEE = new Type("TYPE_DELIVERY_FEE", 4, 4);
                TYPE_SERVICE_FEE = new Type("TYPE_SERVICE_FEE", 5, 5);
                TYPE_CUSTOM_SERVICE_CHARGE = new Type("TYPE_CUSTOM_SERVICE_CHARGE", 6, 6);
                TYPE_TIP = new Type("TYPE_TIP", 7, 7);
                TYPE_GIFT_CARD = new Type("TYPE_GIFT_CARD", 8, 8);
                TYPE_LOCAL_CASH = new Type("TYPE_LOCAL_CASH", 9, 9);
                TYPE_TOTAL_BEFORE_TIP = new Type("TYPE_TOTAL_BEFORE_TIP", 10, 10);
                TYPE_COUPON = new Type("TYPE_COUPON", 11, 11);
                TYPE_REWARD = new Type("TYPE_REWARD", 12, 12);
                TYPE_SHIPPING_FEE = new Type("TYPE_SHIPPING_FEE", 13, 13);
                Type[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, type2) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$SummaryLine$Type$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public LocalCart.SummaryLine.Type fromValue(int value) {
                        return LocalCart.SummaryLine.Type.INSTANCE.fromValue(value);
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

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Type;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Type fromValue(int value) {
                    switch (value) {
                        case 0:
                            return Type.TYPE_UNSPECIFIED;
                        case 1:
                            return Type.TYPE_SUBTOTAL;
                        case 2:
                            return Type.TYPE_DISCOUNT;
                        case 3:
                            return Type.TYPE_SALES_TAX;
                        case 4:
                            return Type.TYPE_DELIVERY_FEE;
                        case 5:
                            return Type.TYPE_SERVICE_FEE;
                        case 6:
                            return Type.TYPE_CUSTOM_SERVICE_CHARGE;
                        case 7:
                            return Type.TYPE_TIP;
                        case 8:
                            return Type.TYPE_GIFT_CARD;
                        case 9:
                            return Type.TYPE_LOCAL_CASH;
                        case 10:
                            return Type.TYPE_TOTAL_BEFORE_TIP;
                        case 11:
                            return Type.TYPE_COUPON;
                        case 12:
                            return Type.TYPE_REWARD;
                        case 13:
                            return Type.TYPE_SHIPPING_FEE;
                        default:
                            return null;
                    }
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$SummaryLine;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ SummaryLine build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public SummaryLine() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SummaryLine(String str, LocalMoney localMoney, Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.description = str;
            this.amount = localMoney;
            this.type = type2;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalCart.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0027. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public LocalCart decode(ProtoReader reader) {
                Object obj;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj2 = null;
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
                Object obj13 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    Object obj14 = obj4;
                    if (nextTag == -1) {
                        return new LocalCart((String) obj3, (String) obj13, (String) obj14, (String) obj5, (String) obj6, m, (LocalMoney) obj7, arrayList, (LocalMoney) obj8, (String) obj9, (String) obj10, (DynamicChargesBreakdown) obj11, (LocalCart.OpenTabInfo) obj12, (LocalCart.PaymentSummary) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            obj4 = obj14;
                            break;
                        case 2:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            obj = obj3;
                            break;
                        case 3:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 4:
                            m.add(LocalCart.Line.ADAPTER.decode(reader));
                            obj = obj3;
                            obj4 = obj14;
                            break;
                        case 5:
                            obj7 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj7);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 6:
                            arrayList.add(LocalCart.SummaryLine.ADAPTER.decode(reader));
                            obj = obj3;
                            obj4 = obj14;
                            break;
                        case 7:
                            obj8 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj8);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 8:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 9:
                            obj13 = ProtoAdapter.STRING.decode(reader);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 10:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 11:
                            obj11 = TransactorKt.decodeMessageOrMerge(DynamicChargesBreakdown.ADAPTER, reader, obj11);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 12:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 13:
                            obj12 = TransactorKt.decodeMessageOrMerge(LocalCart.OpenTabInfo.ADAPTER, reader, obj12);
                            obj4 = obj14;
                            obj = obj3;
                            break;
                        case 14:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalCart.PaymentSummary.ADAPTER, reader, obj2);
                            obj = obj3;
                            obj4 = obj14;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj4 = obj14;
                            break;
                    }
                    obj3 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, LocalCart value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                protoAdapter2.encodeWithTag(writer, 9, value.version);
                protoAdapter2.encodeWithTag(writer, 2, value.brand_token);
                protoAdapter2.encodeWithTag(writer, 3, value.location_token);
                protoAdapter2.encodeWithTag(writer, 12, value.unit_token);
                LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.lines);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 5, value.lines_subtotal);
                LocalCart.SummaryLine.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.summary_lines);
                protoAdapter3.encodeWithTag(writer, 7, value.total);
                protoAdapter2.encodeWithTag(writer, 8, value.checkout_url);
                protoAdapter2.encodeWithTag(writer, 10, value.checkout_flow_token);
                DynamicChargesBreakdown.ADAPTER.encodeWithTag(writer, 11, value.charges_breakdown);
                LocalCart.OpenTabInfo.ADAPTER.encodeWithTag(writer, 13, value.open_tab_info);
                LocalCart.PaymentSummary.ADAPTER.encodeWithTag(writer, 14, value.payment_summary);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(LocalCart value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = LocalCart.Line.ADAPTER.asRepeated().encodedSizeWithTag(4, value.lines) + protoAdapter2.encodedSizeWithTag(12, value.unit_token) + protoAdapter2.encodedSizeWithTag(3, value.location_token) + protoAdapter2.encodedSizeWithTag(2, value.brand_token) + protoAdapter2.encodedSizeWithTag(9, value.version) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                return LocalCart.PaymentSummary.ADAPTER.encodedSizeWithTag(14, value.payment_summary) + LocalCart.OpenTabInfo.ADAPTER.encodedSizeWithTag(13, value.open_tab_info) + DynamicChargesBreakdown.ADAPTER.encodedSizeWithTag(11, value.charges_breakdown) + protoAdapter2.encodedSizeWithTag(10, value.checkout_flow_token) + protoAdapter2.encodedSizeWithTag(8, value.checkout_url) + protoAdapter3.encodedSizeWithTag(7, value.total) + LocalCart.SummaryLine.ADAPTER.asRepeated().encodedSizeWithTag(6, value.summary_lines) + protoAdapter3.encodedSizeWithTag(5, value.lines_subtotal) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public LocalCart redact(LocalCart value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.lines, LocalCart.Line.ADAPTER);
                LocalMoney localMoney = value.lines_subtotal;
                LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.summary_lines, LocalCart.SummaryLine.ADAPTER);
                LocalMoney localMoney3 = value.total;
                LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
                DynamicChargesBreakdown dynamicChargesBreakdown = value.charges_breakdown;
                DynamicChargesBreakdown dynamicChargesBreakdown2 = dynamicChargesBreakdown != null ? (DynamicChargesBreakdown) DynamicChargesBreakdown.ADAPTER.redact(dynamicChargesBreakdown) : null;
                LocalCart.OpenTabInfo openTabInfo = value.open_tab_info;
                LocalCart.OpenTabInfo openTabInfo2 = openTabInfo != null ? (LocalCart.OpenTabInfo) LocalCart.OpenTabInfo.ADAPTER.redact(openTabInfo) : null;
                LocalCart.PaymentSummary paymentSummary = value.payment_summary;
                return LocalCart.copy$default(value, m1169redactElements, localMoney2, m1169redactElements2, localMoney4, dynamicChargesBreakdown2, openTabInfo2, paymentSummary != null ? (LocalCart.PaymentSummary) LocalCart.PaymentSummary.ADAPTER.redact(paymentSummary) : null, ByteString.EMPTY, 1567);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, LocalCart value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LocalCart.PaymentSummary.ADAPTER.encodeWithTag(writer, 14, value.payment_summary);
                LocalCart.OpenTabInfo.ADAPTER.encodeWithTag(writer, 13, value.open_tab_info);
                DynamicChargesBreakdown.ADAPTER.encodeWithTag(writer, 11, value.charges_breakdown);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 10, value.checkout_flow_token);
                protoAdapter2.encodeWithTag(writer, 8, value.checkout_url);
                ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 7, value.total);
                LocalCart.SummaryLine.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.summary_lines);
                protoAdapter3.encodeWithTag(writer, 5, value.lines_subtotal);
                LocalCart.Line.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.lines);
                protoAdapter2.encodeWithTag(writer, 12, value.unit_token);
                protoAdapter2.encodeWithTag(writer, 3, value.location_token);
                protoAdapter2.encodeWithTag(writer, 2, value.brand_token);
                protoAdapter2.encodeWithTag(writer, 9, value.version);
                protoAdapter2.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCart(String str, String str2, String str3, String str4, String str5, List list, LocalMoney localMoney, List list2, LocalMoney localMoney2, String str6, String str7, DynamicChargesBreakdown dynamicChargesBreakdown, OpenTabInfo openTabInfo, PaymentSummary paymentSummary, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.token = str;
        this.version = str2;
        this.brand_token = str3;
        this.location_token = str4;
        this.unit_token = str5;
        this.lines_subtotal = localMoney;
        this.total = localMoney2;
        this.checkout_url = str6;
        this.checkout_flow_token = str7;
        this.charges_breakdown = dynamicChargesBreakdown;
        this.open_tab_info = openTabInfo;
        this.payment_summary = paymentSummary;
        this.lines = TransactorKt.immutableCopyOf("lines", list);
        this.summary_lines = TransactorKt.immutableCopyOf("summary_lines", list2);
    }

    public static LocalCart copy$default(LocalCart localCart, ArrayList arrayList, LocalMoney localMoney, ArrayList arrayList2, LocalMoney localMoney2, DynamicChargesBreakdown dynamicChargesBreakdown, OpenTabInfo openTabInfo, PaymentSummary paymentSummary, ByteString byteString, int i) {
        String str = localCart.token;
        String str2 = localCart.version;
        String str3 = localCart.brand_token;
        String str4 = localCart.location_token;
        String str5 = localCart.unit_token;
        List<Line> list = (i & 32) != 0 ? localCart.lines : arrayList;
        LocalMoney localMoney3 = (i & 64) != 0 ? localCart.lines_subtotal : localMoney;
        List<SummaryLine> list2 = (i & 128) != 0 ? localCart.summary_lines : arrayList2;
        LocalMoney localMoney4 = (i & 256) != 0 ? localCart.total : localMoney2;
        String str6 = localCart.checkout_url;
        List<Line> list3 = list;
        LocalMoney localMoney5 = localMoney3;
        List<SummaryLine> list4 = list2;
        LocalMoney localMoney6 = localMoney4;
        String str7 = localCart.checkout_flow_token;
        DynamicChargesBreakdown dynamicChargesBreakdown2 = (i & 2048) != 0 ? localCart.charges_breakdown : dynamicChargesBreakdown;
        PaymentSummary paymentSummary2 = (i & PKIFailureInfo.certRevoked) != 0 ? localCart.payment_summary : paymentSummary;
        ByteString unknownFields = (i & 16384) != 0 ? localCart.unknownFields() : byteString;
        list3.getClass();
        list4.getClass();
        unknownFields.getClass();
        return new LocalCart(str, str2, str3, str4, str5, list3, localMoney5, list4, localMoney6, str6, str7, dynamicChargesBreakdown2, openTabInfo, paymentSummary2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCart)) {
            return false;
        }
        LocalCart localCart = (LocalCart) obj;
        return Intrinsics.areEqual(unknownFields(), localCart.unknownFields()) && Intrinsics.areEqual(this.token, localCart.token) && Intrinsics.areEqual(this.version, localCart.version) && Intrinsics.areEqual(this.brand_token, localCart.brand_token) && Intrinsics.areEqual(this.location_token, localCart.location_token) && Intrinsics.areEqual(this.unit_token, localCart.unit_token) && Intrinsics.areEqual(this.lines, localCart.lines) && Intrinsics.areEqual(this.lines_subtotal, localCart.lines_subtotal) && Intrinsics.areEqual(this.summary_lines, localCart.summary_lines) && Intrinsics.areEqual(this.total, localCart.total) && Intrinsics.areEqual(this.checkout_url, localCart.checkout_url) && Intrinsics.areEqual(this.checkout_flow_token, localCart.checkout_flow_token) && Intrinsics.areEqual(this.charges_breakdown, localCart.charges_breakdown) && Intrinsics.areEqual(this.open_tab_info, localCart.open_tab_info) && Intrinsics.areEqual(this.payment_summary, localCart.payment_summary);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.brand_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.location_token;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.unit_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.lines);
        LocalMoney localMoney = this.lines_subtotal;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (localMoney != null ? localMoney.hashCode() : 0)) * 37, 37, this.summary_lines);
        LocalMoney localMoney2 = this.total;
        int hashCode6 = (m2 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
        String str6 = this.checkout_url;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.checkout_flow_token;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 37;
        DynamicChargesBreakdown dynamicChargesBreakdown = this.charges_breakdown;
        int hashCode9 = (hashCode8 + (dynamicChargesBreakdown != null ? dynamicChargesBreakdown.hashCode() : 0)) * 37;
        OpenTabInfo openTabInfo = this.open_tab_info;
        int hashCode10 = (hashCode9 + (openTabInfo != null ? openTabInfo.hashCode() : 0)) * 37;
        PaymentSummary paymentSummary = this.payment_summary;
        int hashCode11 = hashCode10 + (paymentSummary != null ? paymentSummary.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.version = this.version;
        builder.brand_token = this.brand_token;
        builder.location_token = this.location_token;
        builder.unit_token = this.unit_token;
        builder.lines = this.lines;
        builder.lines_subtotal = this.lines_subtotal;
        builder.summary_lines = this.summary_lines;
        builder.total = this.total;
        builder.checkout_url = this.checkout_url;
        builder.checkout_flow_token = this.checkout_flow_token;
        builder.charges_breakdown = this.charges_breakdown;
        builder.open_tab_info = this.open_tab_info;
        builder.payment_summary = this.payment_summary;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.version;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "version=", arrayList);
        }
        String str3 = this.brand_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "brand_token=", arrayList);
        }
        String str4 = this.location_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "location_token=", arrayList);
        }
        String str5 = this.unit_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "unit_token=", arrayList);
        }
        if (!this.lines.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("lines=", arrayList, this.lines);
        }
        LocalMoney localMoney = this.lines_subtotal;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("lines_subtotal=", localMoney, arrayList);
        }
        if (!this.summary_lines.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("summary_lines=", arrayList, this.summary_lines);
        }
        LocalMoney localMoney2 = this.total;
        if (localMoney2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("total=", localMoney2, arrayList);
        }
        String str6 = this.checkout_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "checkout_url=", arrayList);
        }
        String str7 = this.checkout_flow_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "checkout_flow_token=", arrayList);
        }
        DynamicChargesBreakdown dynamicChargesBreakdown = this.charges_breakdown;
        if (dynamicChargesBreakdown != null) {
            arrayList.add("charges_breakdown=" + dynamicChargesBreakdown);
        }
        OpenTabInfo openTabInfo = this.open_tab_info;
        if (openTabInfo != null) {
            arrayList.add("open_tab_info=" + openTabInfo);
        }
        PaymentSummary paymentSummary = this.payment_summary;
        if (paymentSummary != null) {
            arrayList.add("payment_summary=" + paymentSummary);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCart{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001f !B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0082\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\u008c\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Builder;", "token", "", "selection", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "total_price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "total_price_before_discounts", "discount_amount", "discount_text", "discount_texts", "", "menu_item_name", "menu_item_variation_name", "image", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalImage;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Selection", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Line extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Line> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 4, tag = 10)
        public final LocalMoney discount_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 11)
        public final String discount_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 12)
        public final List<String> discount_texts;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalImage#ADAPTER", schemaIndex = 9, tag = 13)
        public final LocalImage image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
        public final String menu_item_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
        public final String menu_item_variation_name;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection#ADAPTER", schemaIndex = 1, tag = 2)
        public final Selection selection;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String token;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 2, tag = 3)
        public final LocalMoney total_price;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 3, tag = 4)
        public final LocalMoney total_price_before_discounts;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "<init>", "()V", "token", "", "selection", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "total_price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "total_price_before_discounts", "discount_amount", "discount_text", "discount_texts", "", "menu_item_name", "menu_item_variation_name", "image", "Lcom/squareup/protos/cash/local/client/v1/LocalImage;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public LocalMoney discount_amount;
            public String discount_text;
            public List<String> discount_texts = EmptyList.INSTANCE;
            public LocalImage image;
            public String menu_item_name;
            public String menu_item_variation_name;
            public Selection selection;
            public String token;
            public LocalMoney total_price;
            public LocalMoney total_price_before_discounts;

            @Override // com.squareup.wire.Message.Builder
            public Line build() {
                return new Line(this.token, this.selection, this.total_price, this.total_price_before_discounts, this.discount_amount, this.discount_text, this.discount_texts, this.menu_item_name, this.menu_item_variation_name, this.image, buildUnknownFields());
            }

            public final Builder discount_amount(LocalMoney discount_amount) {
                this.discount_amount = discount_amount;
                return this;
            }

            public final Builder discount_text(String discount_text) {
                this.discount_text = discount_text;
                return this;
            }

            public final Builder discount_texts(List<String> discount_texts) {
                discount_texts.getClass();
                TransactorKt.checkElementsNotNull(discount_texts);
                this.discount_texts = discount_texts;
                return this;
            }

            public final Builder image(LocalImage image) {
                this.image = image;
                return this;
            }

            public final Builder menu_item_name(String menu_item_name) {
                this.menu_item_name = menu_item_name;
                return this;
            }

            public final Builder menu_item_variation_name(String menu_item_variation_name) {
                this.menu_item_variation_name = menu_item_variation_name;
                return this;
            }

            public final Builder selection(Selection selection) {
                this.selection = selection;
                return this;
            }

            public final Builder token(String token) {
                this.token = token;
                return this;
            }

            public final Builder total_price(LocalMoney total_price) {
                this.total_price = total_price;
                return this;
            }

            public final Builder total_price_before_discounts(LocalMoney total_price_before_discounts) {
                this.total_price_before_discounts = total_price_before_discounts;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001d\u001e\u001f !Be\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u0006H\u0096\u0080\u0004J\b\u0010\u001a\u001a\u00020\u0004H\u0016Ji\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u001cR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Builder;", "menu_item_token", "", "quantity", "", "menu_item_variation_token", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "combo_slots", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "Builder", "Companion", "Modifier", "TextModifier", "ComboSlot", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Selection extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Selection> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$ComboSlot#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
            public final List<ComboSlot> combo_slots;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String menu_item_token;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String menu_item_variation_token;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$Modifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
            public final List<Modifier> modifiers;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
            public final Integer quantity;

            @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$TextModifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
            public final List<TextModifier> text_modifiers;

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "<init>", "()V", "menu_item_token", "", "quantity", "", "Ljava/lang/Integer;", "menu_item_variation_token", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "combo_slots", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public List<ComboSlot> combo_slots;
                public String menu_item_token;
                public String menu_item_variation_token;
                public List<Modifier> modifiers;
                public Integer quantity;
                public List<TextModifier> text_modifiers;

                public Builder() {
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.modifiers = emptyList;
                    this.text_modifiers = emptyList;
                    this.combo_slots = emptyList;
                }

                @Override // com.squareup.wire.Message.Builder
                public Selection build() {
                    return new Selection(this.menu_item_token, this.quantity, this.menu_item_variation_token, this.modifiers, this.text_modifiers, this.combo_slots, buildUnknownFields());
                }

                public final Builder combo_slots(List<ComboSlot> combo_slots) {
                    combo_slots.getClass();
                    TransactorKt.checkElementsNotNull(combo_slots);
                    this.combo_slots = combo_slots;
                    return this;
                }

                public final Builder menu_item_token(String menu_item_token) {
                    this.menu_item_token = menu_item_token;
                    return this;
                }

                public final Builder menu_item_variation_token(String menu_item_variation_token) {
                    this.menu_item_variation_token = menu_item_variation_token;
                    return this;
                }

                public final Builder modifiers(List<Modifier> modifiers) {
                    modifiers.getClass();
                    TransactorKt.checkElementsNotNull(modifiers);
                    this.modifiers = modifiers;
                    return this;
                }

                public final Builder quantity(Integer quantity) {
                    this.quantity = quantity;
                    return this;
                }

                public final Builder text_modifiers(List<TextModifier> text_modifiers) {
                    text_modifiers.getClass();
                    TransactorKt.checkElementsNotNull(text_modifiers);
                    this.text_modifiers = text_modifiers;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Selection.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalCart.Line.Selection decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new LocalCart.Line.Selection((String) obj, (Integer) obj2, (String) obj3, m, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            switch (nextTag) {
                                case 1:
                                    obj = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    obj2 = ProtoAdapter.INT32.decode(reader);
                                    break;
                                case 3:
                                    obj3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    m.add(LocalCart.Line.Selection.Modifier.ADAPTER.decode(reader));
                                    break;
                                case 5:
                                    arrayList.add(LocalCart.Line.Selection.TextModifier.ADAPTER.decode(reader));
                                    break;
                                case 6:
                                    arrayList2.add(LocalCart.Line.Selection.ComboSlot.ADAPTER.decode(reader));
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, LocalCart.Line.Selection value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.menu_item_token);
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                        protoAdapter2.encodeWithTag(writer, 3, value.menu_item_variation_token);
                        LocalCart.Line.Selection.Modifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                        LocalCart.Line.Selection.TextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.text_modifiers);
                        LocalCart.Line.Selection.ComboSlot.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.combo_slots);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(LocalCart.Line.Selection value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return LocalCart.Line.Selection.ComboSlot.ADAPTER.asRepeated().encodedSizeWithTag(6, value.combo_slots) + LocalCart.Line.Selection.TextModifier.ADAPTER.asRepeated().encodedSizeWithTag(5, value.text_modifiers) + LocalCart.Line.Selection.Modifier.ADAPTER.asRepeated().encodedSizeWithTag(4, value.modifiers) + protoAdapter2.encodedSizeWithTag(3, value.menu_item_variation_token) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.quantity) + protoAdapter2.encodedSizeWithTag(1, value.menu_item_token) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public LocalCart.Line.Selection redact(LocalCart.Line.Selection value) {
                        value.getClass();
                        return LocalCart.Line.Selection.copy$default(value, null, null, null, TransactorKt.m1169redactElements(value.modifiers, LocalCart.Line.Selection.Modifier.ADAPTER), TransactorKt.m1169redactElements(value.text_modifiers, LocalCart.Line.Selection.TextModifier.ADAPTER), TransactorKt.m1169redactElements(value.combo_slots, LocalCart.Line.Selection.ComboSlot.ADAPTER), ByteString.EMPTY, 7, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, LocalCart.Line.Selection value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        LocalCart.Line.Selection.ComboSlot.ADAPTER.asRepeated().encodeWithTag(writer, 6, value.combo_slots);
                        LocalCart.Line.Selection.TextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.text_modifiers);
                        LocalCart.Line.Selection.Modifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.menu_item_variation_token);
                        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                        protoAdapter2.encodeWithTag(writer, 1, value.menu_item_token);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public Selection(String str, Integer num, String str2, List list, List list2, List list3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? EmptyList.INSTANCE : list2, (i & 32) != 0 ? EmptyList.INSTANCE : list3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Selection copy$default(Selection selection, String str, Integer num, String str2, List list, List list2, List list3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = selection.menu_item_token;
                }
                if ((i & 2) != 0) {
                    num = selection.quantity;
                }
                if ((i & 4) != 0) {
                    str2 = selection.menu_item_variation_token;
                }
                if ((i & 8) != 0) {
                    list = selection.modifiers;
                }
                if ((i & 16) != 0) {
                    list2 = selection.text_modifiers;
                }
                if ((i & 32) != 0) {
                    list3 = selection.combo_slots;
                }
                if ((i & 64) != 0) {
                    byteString = selection.unknownFields();
                }
                List list4 = list3;
                ByteString byteString2 = byteString;
                List list5 = list2;
                String str3 = str2;
                return selection.copy(str, num, str3, list, list5, list4, byteString2);
            }

            public final Selection copy(String menu_item_token, Integer quantity, String menu_item_variation_token, List<Modifier> modifiers, List<TextModifier> text_modifiers, List<ComboSlot> combo_slots, ByteString unknownFields) {
                modifiers.getClass();
                text_modifiers.getClass();
                combo_slots.getClass();
                unknownFields.getClass();
                return new Selection(menu_item_token, quantity, menu_item_variation_token, modifiers, text_modifiers, combo_slots, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Selection)) {
                    return false;
                }
                Selection selection = (Selection) other;
                return Intrinsics.areEqual(unknownFields(), selection.unknownFields()) && Intrinsics.areEqual(this.menu_item_token, selection.menu_item_token) && Intrinsics.areEqual(this.quantity, selection.quantity) && Intrinsics.areEqual(this.menu_item_variation_token, selection.menu_item_variation_token) && Intrinsics.areEqual(this.modifiers, selection.modifiers) && Intrinsics.areEqual(this.text_modifiers, selection.text_modifiers) && Intrinsics.areEqual(this.combo_slots, selection.combo_slots);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.menu_item_token;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Integer num = this.quantity;
                int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                String str2 = this.menu_item_variation_token;
                int hashCode4 = this.combo_slots.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.modifiers), 37, this.text_modifiers);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.menu_item_token = this.menu_item_token;
                builder.quantity = this.quantity;
                builder.menu_item_variation_token = this.menu_item_variation_token;
                builder.modifiers = this.modifiers;
                builder.text_modifiers = this.text_modifiers;
                builder.combo_slots = this.combo_slots;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.menu_item_token;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "menu_item_token=", arrayList);
                }
                Integer num = this.quantity;
                if (num != null) {
                    re$$ExternalSyntheticOutline0.m("quantity=", num, arrayList);
                }
                String str2 = this.menu_item_variation_token;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "menu_item_variation_token=", arrayList);
                }
                if (!this.modifiers.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, this.modifiers);
                }
                if (!this.text_modifiers.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("text_modifiers=", arrayList, this.text_modifiers);
                }
                if (!this.combo_slots.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("combo_slots=", arrayList, this.combo_slots);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Selection{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016Jl\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot$Builder;", "menu_item_combo_slot_token", "", "menu_item_token", "menu_item_variation_token", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "menu_item_name", "menu_item_variation_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class ComboSlot extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<ComboSlot> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String menu_item_combo_slot_token;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
                public final String menu_item_name;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                public final String menu_item_token;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
                public final String menu_item_variation_name;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
                public final String menu_item_variation_token;

                @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$Modifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
                public final List<Modifier> modifiers;

                @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$TextModifier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
                public final List<TextModifier> text_modifiers;

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot;", "<init>", "()V", "menu_item_combo_slot_token", "", "menu_item_token", "menu_item_variation_token", "modifiers", "", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "text_modifiers", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "menu_item_name", "menu_item_variation_name", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String menu_item_combo_slot_token;
                    public String menu_item_name;
                    public String menu_item_token;
                    public String menu_item_variation_name;
                    public String menu_item_variation_token;
                    public List<Modifier> modifiers;
                    public List<TextModifier> text_modifiers;

                    public Builder() {
                        EmptyList emptyList = EmptyList.INSTANCE;
                        this.modifiers = emptyList;
                        this.text_modifiers = emptyList;
                    }

                    @Override // com.squareup.wire.Message.Builder
                    public ComboSlot build() {
                        return new ComboSlot(this.menu_item_combo_slot_token, this.menu_item_token, this.menu_item_variation_token, this.modifiers, this.text_modifiers, this.menu_item_name, this.menu_item_variation_name, buildUnknownFields());
                    }

                    public final Builder menu_item_combo_slot_token(String menu_item_combo_slot_token) {
                        this.menu_item_combo_slot_token = menu_item_combo_slot_token;
                        return this;
                    }

                    public final Builder menu_item_name(String menu_item_name) {
                        this.menu_item_name = menu_item_name;
                        return this;
                    }

                    public final Builder menu_item_token(String menu_item_token) {
                        this.menu_item_token = menu_item_token;
                        return this;
                    }

                    public final Builder menu_item_variation_name(String menu_item_variation_name) {
                        this.menu_item_variation_name = menu_item_variation_name;
                        return this;
                    }

                    public final Builder menu_item_variation_token(String menu_item_variation_token) {
                        this.menu_item_variation_token = menu_item_variation_token;
                        return this;
                    }

                    public final Builder modifiers(List<Modifier> modifiers) {
                        modifiers.getClass();
                        TransactorKt.checkElementsNotNull(modifiers);
                        this.modifiers = modifiers;
                        return this;
                    }

                    public final Builder text_modifiers(List<TextModifier> text_modifiers) {
                        text_modifiers.getClass();
                        TransactorKt.checkElementsNotNull(text_modifiers);
                        this.text_modifiers = text_modifiers;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ComboSlot.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$ComboSlot$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public LocalCart.Line.Selection.ComboSlot decode(ProtoReader reader) {
                            ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                            ArrayList arrayList = new ArrayList();
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            Object obj2 = null;
                            Object obj3 = null;
                            Object obj4 = null;
                            Object obj5 = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new LocalCart.Line.Selection.ComboSlot((String) obj, (String) obj2, (String) obj3, m, arrayList, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                        m.add(LocalCart.Line.Selection.Modifier.ADAPTER.decode(reader));
                                        break;
                                    case 5:
                                        arrayList.add(LocalCart.Line.Selection.TextModifier.ADAPTER.decode(reader));
                                        break;
                                    case 6:
                                        obj4 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    case 7:
                                        obj5 = ProtoAdapter.STRING.decode(reader);
                                        break;
                                    default:
                                        reader.readUnknownField(nextTag);
                                        break;
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, LocalCart.Line.Selection.ComboSlot value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.menu_item_combo_slot_token);
                            protoAdapter2.encodeWithTag(writer, 2, value.menu_item_token);
                            protoAdapter2.encodeWithTag(writer, 3, value.menu_item_variation_token);
                            LocalCart.Line.Selection.Modifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                            LocalCart.Line.Selection.TextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.text_modifiers);
                            protoAdapter2.encodeWithTag(writer, 6, value.menu_item_name);
                            protoAdapter2.encodeWithTag(writer, 7, value.menu_item_variation_name);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(LocalCart.Line.Selection.ComboSlot value) {
                            value.getClass();
                            int size$okio = value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(7, value.menu_item_variation_name) + protoAdapter2.encodedSizeWithTag(6, value.menu_item_name) + LocalCart.Line.Selection.TextModifier.ADAPTER.asRepeated().encodedSizeWithTag(5, value.text_modifiers) + LocalCart.Line.Selection.Modifier.ADAPTER.asRepeated().encodedSizeWithTag(4, value.modifiers) + protoAdapter2.encodedSizeWithTag(3, value.menu_item_variation_token) + protoAdapter2.encodedSizeWithTag(2, value.menu_item_token) + protoAdapter2.encodedSizeWithTag(1, value.menu_item_combo_slot_token) + size$okio;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public LocalCart.Line.Selection.ComboSlot redact(LocalCart.Line.Selection.ComboSlot value) {
                            value.getClass();
                            return LocalCart.Line.Selection.ComboSlot.copy$default(value, null, null, null, TransactorKt.m1169redactElements(value.modifiers, LocalCart.Line.Selection.Modifier.ADAPTER), TransactorKt.m1169redactElements(value.text_modifiers, LocalCart.Line.Selection.TextModifier.ADAPTER), null, null, ByteString.EMPTY, 103, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, LocalCart.Line.Selection.ComboSlot value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 7, value.menu_item_variation_name);
                            protoAdapter2.encodeWithTag(writer, 6, value.menu_item_name);
                            LocalCart.Line.Selection.TextModifier.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.text_modifiers);
                            LocalCart.Line.Selection.Modifier.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.modifiers);
                            protoAdapter2.encodeWithTag(writer, 3, value.menu_item_variation_token);
                            protoAdapter2.encodeWithTag(writer, 2, value.menu_item_token);
                            protoAdapter2.encodeWithTag(writer, 1, value.menu_item_combo_slot_token);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public ComboSlot(String str, String str2, String str3, List list, List list2, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? EmptyList.INSTANCE : list, (i & 16) != 0 ? EmptyList.INSTANCE : list2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ ComboSlot copy$default(ComboSlot comboSlot, String str, String str2, String str3, List list, List list2, String str4, String str5, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = comboSlot.menu_item_combo_slot_token;
                    }
                    if ((i & 2) != 0) {
                        str2 = comboSlot.menu_item_token;
                    }
                    if ((i & 4) != 0) {
                        str3 = comboSlot.menu_item_variation_token;
                    }
                    if ((i & 8) != 0) {
                        list = comboSlot.modifiers;
                    }
                    if ((i & 16) != 0) {
                        list2 = comboSlot.text_modifiers;
                    }
                    if ((i & 32) != 0) {
                        str4 = comboSlot.menu_item_name;
                    }
                    if ((i & 64) != 0) {
                        str5 = comboSlot.menu_item_variation_name;
                    }
                    if ((i & 128) != 0) {
                        byteString = comboSlot.unknownFields();
                    }
                    String str6 = str5;
                    ByteString byteString2 = byteString;
                    List list3 = list2;
                    String str7 = str4;
                    return comboSlot.copy(str, str2, str3, list, list3, str7, str6, byteString2);
                }

                public final ComboSlot copy(String menu_item_combo_slot_token, String menu_item_token, String menu_item_variation_token, List<Modifier> modifiers, List<TextModifier> text_modifiers, String menu_item_name, String menu_item_variation_name, ByteString unknownFields) {
                    modifiers.getClass();
                    text_modifiers.getClass();
                    unknownFields.getClass();
                    return new ComboSlot(menu_item_combo_slot_token, menu_item_token, menu_item_variation_token, modifiers, text_modifiers, menu_item_name, menu_item_variation_name, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof ComboSlot)) {
                        return false;
                    }
                    ComboSlot comboSlot = (ComboSlot) other;
                    return Intrinsics.areEqual(unknownFields(), comboSlot.unknownFields()) && Intrinsics.areEqual(this.menu_item_combo_slot_token, comboSlot.menu_item_combo_slot_token) && Intrinsics.areEqual(this.menu_item_token, comboSlot.menu_item_token) && Intrinsics.areEqual(this.menu_item_variation_token, comboSlot.menu_item_variation_token) && Intrinsics.areEqual(this.modifiers, comboSlot.modifiers) && Intrinsics.areEqual(this.text_modifiers, comboSlot.text_modifiers) && Intrinsics.areEqual(this.menu_item_name, comboSlot.menu_item_name) && Intrinsics.areEqual(this.menu_item_variation_name, comboSlot.menu_item_variation_name);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.menu_item_combo_slot_token;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.menu_item_token;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.menu_item_variation_token;
                    int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.modifiers), 37, this.text_modifiers);
                    String str4 = this.menu_item_name;
                    int hashCode4 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
                    String str5 = this.menu_item_variation_name;
                    int hashCode5 = hashCode4 + (str5 != null ? str5.hashCode() : 0);
                    this.hashCode = hashCode5;
                    return hashCode5;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.menu_item_combo_slot_token = this.menu_item_combo_slot_token;
                    builder.menu_item_token = this.menu_item_token;
                    builder.menu_item_variation_token = this.menu_item_variation_token;
                    builder.modifiers = this.modifiers;
                    builder.text_modifiers = this.text_modifiers;
                    builder.menu_item_name = this.menu_item_name;
                    builder.menu_item_variation_name = this.menu_item_variation_name;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.menu_item_combo_slot_token;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "menu_item_combo_slot_token=", arrayList);
                    }
                    String str2 = this.menu_item_token;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "menu_item_token=", arrayList);
                    }
                    String str3 = this.menu_item_variation_token;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "menu_item_variation_token=", arrayList);
                    }
                    if (!this.modifiers.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, this.modifiers);
                    }
                    if (!this.text_modifiers.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("text_modifiers=", arrayList, this.text_modifiers);
                    }
                    String str4 = this.menu_item_name;
                    if (str4 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "menu_item_name=", arrayList);
                    }
                    String str5 = this.menu_item_variation_name;
                    if (str5 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "menu_item_variation_name=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "ComboSlot{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$ComboSlot;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ ComboSlot build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ComboSlot(String str, String str2, String str3, List<Modifier> list, List<TextModifier> list2, String str4, String str5, ByteString byteString) {
                    super(ADAPTER, byteString);
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                    this.menu_item_combo_slot_token = str;
                    this.menu_item_token = str2;
                    this.menu_item_variation_token = str3;
                    this.menu_item_name = str4;
                    this.menu_item_variation_name = str5;
                    this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
                    this.text_modifiers = TransactorKt.immutableCopyOf("text_modifiers", list2);
                }

                public ComboSlot() {
                    this(null, null, null, null, null, null, null, null, 255, null);
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0006H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0018R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier$Builder;", "menu_item_modifier_token", "", "quantity", "", "modifier_name", "total_price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "parent_modifier_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Integer;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/LocalMoney;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Modifier extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Modifier> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String menu_item_modifier_token;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
                public final String modifier_name;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
                public final String parent_modifier_token;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
                public final Integer quantity;

                @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalMoney#ADAPTER", schemaIndex = 3, tag = 4)
                public final LocalMoney total_price;

                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "<init>", "()V", "menu_item_modifier_token", "", "quantity", "", "Ljava/lang/Integer;", "modifier_name", "total_price", "Lcom/squareup/protos/cash/local/client/v1/LocalMoney;", "parent_modifier_token", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String menu_item_modifier_token;
                    public String modifier_name;
                    public String parent_modifier_token;
                    public Integer quantity;
                    public LocalMoney total_price;

                    @Override // com.squareup.wire.Message.Builder
                    public Modifier build() {
                        return new Modifier(this.menu_item_modifier_token, this.quantity, this.modifier_name, this.total_price, this.parent_modifier_token, buildUnknownFields());
                    }

                    public final Builder menu_item_modifier_token(String menu_item_modifier_token) {
                        this.menu_item_modifier_token = menu_item_modifier_token;
                        return this;
                    }

                    public final Builder modifier_name(String modifier_name) {
                        this.modifier_name = modifier_name;
                        return this;
                    }

                    public final Builder parent_modifier_token(String parent_modifier_token) {
                        this.parent_modifier_token = parent_modifier_token;
                        return this;
                    }

                    public final Builder quantity(Integer quantity) {
                        this.quantity = quantity;
                        return this;
                    }

                    public final Builder total_price(LocalMoney total_price) {
                        this.total_price = total_price;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Modifier.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$Modifier$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public LocalCart.Line.Selection.Modifier decode(ProtoReader reader) {
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
                                    return new LocalCart.Line.Selection.Modifier((String) obj, (Integer) obj2, (String) obj3, (LocalMoney) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                                }
                                if (nextTag == 1) {
                                    obj = ProtoAdapter.STRING.decode(reader);
                                } else if (nextTag == 2) {
                                    obj2 = ProtoAdapter.INT32.decode(reader);
                                } else if (nextTag == 3) {
                                    obj3 = ProtoAdapter.STRING.decode(reader);
                                } else if (nextTag == 4) {
                                    obj4 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj4);
                                } else if (nextTag != 5) {
                                    reader.readUnknownField(nextTag);
                                } else {
                                    obj5 = ProtoAdapter.STRING.decode(reader);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, LocalCart.Line.Selection.Modifier value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.menu_item_modifier_token);
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                            protoAdapter2.encodeWithTag(writer, 3, value.modifier_name);
                            LocalMoney.ADAPTER.encodeWithTag(writer, 4, value.total_price);
                            protoAdapter2.encodeWithTag(writer, 5, value.parent_modifier_token);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(LocalCart.Line.Selection.Modifier value) {
                            value.getClass();
                            int size$okio = value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(5, value.parent_modifier_token) + LocalMoney.ADAPTER.encodedSizeWithTag(4, value.total_price) + protoAdapter2.encodedSizeWithTag(3, value.modifier_name) + ProtoAdapter.INT32.encodedSizeWithTag(2, value.quantity) + protoAdapter2.encodedSizeWithTag(1, value.menu_item_modifier_token) + size$okio;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public LocalCart.Line.Selection.Modifier redact(LocalCart.Line.Selection.Modifier value) {
                            value.getClass();
                            LocalMoney localMoney = value.total_price;
                            return LocalCart.Line.Selection.Modifier.copy$default(value, null, null, null, localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null, null, ByteString.EMPTY, 23, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, LocalCart.Line.Selection.Modifier value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 5, value.parent_modifier_token);
                            LocalMoney.ADAPTER.encodeWithTag(writer, 4, value.total_price);
                            protoAdapter2.encodeWithTag(writer, 3, value.modifier_name);
                            ProtoAdapter.INT32.encodeWithTag(writer, 2, value.quantity);
                            protoAdapter2.encodeWithTag(writer, 1, value.menu_item_modifier_token);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ Modifier(String str, Integer num, String str2, LocalMoney localMoney, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : localMoney, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ Modifier copy$default(Modifier modifier, String str, Integer num, String str2, LocalMoney localMoney, String str3, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = modifier.menu_item_modifier_token;
                    }
                    if ((i & 2) != 0) {
                        num = modifier.quantity;
                    }
                    if ((i & 4) != 0) {
                        str2 = modifier.modifier_name;
                    }
                    if ((i & 8) != 0) {
                        localMoney = modifier.total_price;
                    }
                    if ((i & 16) != 0) {
                        str3 = modifier.parent_modifier_token;
                    }
                    if ((i & 32) != 0) {
                        byteString = modifier.unknownFields();
                    }
                    String str4 = str3;
                    ByteString byteString2 = byteString;
                    return modifier.copy(str, num, str2, localMoney, str4, byteString2);
                }

                public final Modifier copy(String menu_item_modifier_token, Integer quantity, String modifier_name, LocalMoney total_price, String parent_modifier_token, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new Modifier(menu_item_modifier_token, quantity, modifier_name, total_price, parent_modifier_token, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof Modifier)) {
                        return false;
                    }
                    Modifier modifier = (Modifier) other;
                    return Intrinsics.areEqual(unknownFields(), modifier.unknownFields()) && Intrinsics.areEqual(this.menu_item_modifier_token, modifier.menu_item_modifier_token) && Intrinsics.areEqual(this.quantity, modifier.quantity) && Intrinsics.areEqual(this.modifier_name, modifier.modifier_name) && Intrinsics.areEqual(this.total_price, modifier.total_price) && Intrinsics.areEqual(this.parent_modifier_token, modifier.parent_modifier_token);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.menu_item_modifier_token;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    Integer num = this.quantity;
                    int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                    String str2 = this.modifier_name;
                    int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    LocalMoney localMoney = this.total_price;
                    int hashCode5 = (hashCode4 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
                    String str3 = this.parent_modifier_token;
                    int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
                    this.hashCode = hashCode6;
                    return hashCode6;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.menu_item_modifier_token = this.menu_item_modifier_token;
                    builder.quantity = this.quantity;
                    builder.modifier_name = this.modifier_name;
                    builder.total_price = this.total_price;
                    builder.parent_modifier_token = this.parent_modifier_token;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.menu_item_modifier_token;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "menu_item_modifier_token=", arrayList);
                    }
                    Integer num = this.quantity;
                    if (num != null) {
                        re$$ExternalSyntheticOutline0.m("quantity=", num, arrayList);
                    }
                    String str2 = this.modifier_name;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "modifier_name=", arrayList);
                    }
                    LocalMoney localMoney = this.total_price;
                    if (localMoney != null) {
                        SizeMode$EnumUnboxingLocalUtility.m("total_price=", localMoney, arrayList);
                    }
                    String str3 = this.parent_modifier_token;
                    if (str3 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "parent_modifier_token=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Modifier{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Modifier;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ Modifier build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public Modifier() {
                    this(null, null, null, null, null, null, 63, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Modifier(String str, Integer num, String str2, LocalMoney localMoney, String str3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.menu_item_modifier_token = str;
                    this.quantity = num;
                    this.modifier_name = str2;
                    this.total_price = localMoney;
                    this.parent_modifier_token = str3;
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier$Builder;", "menu_item_menu_modifier_token", "", "inputted_text", "modifier_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class TextModifier extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<TextModifier> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
                public final String inputted_text;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String menu_item_menu_modifier_token;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
                public final String modifier_name;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "<init>", "()V", "menu_item_menu_modifier_token", "", "inputted_text", "modifier_name", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String inputted_text;
                    public String menu_item_menu_modifier_token;
                    public String modifier_name;

                    @Override // com.squareup.wire.Message.Builder
                    public TextModifier build() {
                        return new TextModifier(this.menu_item_menu_modifier_token, this.inputted_text, this.modifier_name, buildUnknownFields());
                    }

                    public final Builder inputted_text(String inputted_text) {
                        this.inputted_text = inputted_text;
                        return this;
                    }

                    public final Builder menu_item_menu_modifier_token(String menu_item_menu_modifier_token) {
                        this.menu_item_menu_modifier_token = menu_item_menu_modifier_token;
                        return this;
                    }

                    public final Builder modifier_name(String modifier_name) {
                        this.modifier_name = modifier_name;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextModifier.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$Line$Selection$TextModifier$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public LocalCart.Line.Selection.TextModifier decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            Object obj2 = null;
                            Object obj3 = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new LocalCart.Line.Selection.TextModifier((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
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
                        public void encode(ProtoWriter writer, LocalCart.Line.Selection.TextModifier value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.menu_item_menu_modifier_token);
                            protoAdapter2.encodeWithTag(writer, 2, value.inputted_text);
                            protoAdapter2.encodeWithTag(writer, 3, value.modifier_name);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(LocalCart.Line.Selection.TextModifier value) {
                            value.getClass();
                            int size$okio = value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(3, value.modifier_name) + protoAdapter2.encodedSizeWithTag(2, value.inputted_text) + protoAdapter2.encodedSizeWithTag(1, value.menu_item_menu_modifier_token) + size$okio;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public LocalCart.Line.Selection.TextModifier redact(LocalCart.Line.Selection.TextModifier value) {
                            value.getClass();
                            return LocalCart.Line.Selection.TextModifier.copy$default(value, null, null, null, ByteString.EMPTY, 5, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, LocalCart.Line.Selection.TextModifier value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 3, value.modifier_name);
                            protoAdapter2.encodeWithTag(writer, 2, value.inputted_text);
                            protoAdapter2.encodeWithTag(writer, 1, value.menu_item_menu_modifier_token);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ TextModifier(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ TextModifier copy$default(TextModifier textModifier, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = textModifier.menu_item_menu_modifier_token;
                    }
                    if ((i & 2) != 0) {
                        str2 = textModifier.inputted_text;
                    }
                    if ((i & 4) != 0) {
                        str3 = textModifier.modifier_name;
                    }
                    if ((i & 8) != 0) {
                        byteString = textModifier.unknownFields();
                    }
                    return textModifier.copy(str, str2, str3, byteString);
                }

                public final TextModifier copy(String menu_item_menu_modifier_token, String inputted_text, String modifier_name, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new TextModifier(menu_item_menu_modifier_token, inputted_text, modifier_name, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof TextModifier)) {
                        return false;
                    }
                    TextModifier textModifier = (TextModifier) other;
                    return Intrinsics.areEqual(unknownFields(), textModifier.unknownFields()) && Intrinsics.areEqual(this.menu_item_menu_modifier_token, textModifier.menu_item_menu_modifier_token) && Intrinsics.areEqual(this.inputted_text, textModifier.inputted_text) && Intrinsics.areEqual(this.modifier_name, textModifier.modifier_name);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.menu_item_menu_modifier_token;
                    int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                    String str2 = this.inputted_text;
                    int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                    String str3 = this.modifier_name;
                    int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
                    this.hashCode = hashCode4;
                    return hashCode4;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.menu_item_menu_modifier_token = this.menu_item_menu_modifier_token;
                    builder.inputted_text = this.inputted_text;
                    builder.modifier_name = this.modifier_name;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.menu_item_menu_modifier_token;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "menu_item_menu_modifier_token=", arrayList);
                    }
                    if (this.inputted_text != null) {
                        arrayList.add("inputted_text=██");
                    }
                    String str2 = this.modifier_name;
                    if (str2 != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "modifier_name=", arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "TextModifier{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$TextModifier;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ TextModifier build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public TextModifier() {
                    this(null, null, null, null, 15, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TextModifier(String str, String str2, String str3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.menu_item_menu_modifier_token = str;
                    this.inputted_text = str2;
                    this.modifier_name = str3;
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Selection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Selection build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Selection(String str, Integer num, String str2, List<Modifier> list, List<TextModifier> list2, List<ComboSlot> list3, ByteString byteString) {
                super(ADAPTER, byteString);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
                this.menu_item_token = str;
                this.quantity = num;
                this.menu_item_variation_token = str2;
                this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
                this.text_modifiers = TransactorKt.immutableCopyOf("text_modifiers", list2);
                this.combo_slots = TransactorKt.immutableCopyOf("combo_slots", list3);
            }

            public Selection() {
                this(null, null, null, null, null, null, null, 127, null);
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Line.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$Line$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.Line decode(ProtoReader reader) {
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
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new LocalCart.Line((String) obj, (LocalCart.Line.Selection) obj2, (LocalMoney) obj3, (LocalMoney) obj4, (LocalMoney) obj5, (String) obj6, m, (String) obj7, (String) obj8, (LocalImage) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalCart.Line.Selection.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj3);
                        } else if (nextTag != 4) {
                            switch (nextTag) {
                                case 8:
                                    obj7 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 9:
                                    obj8 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 10:
                                    obj5 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj5);
                                    break;
                                case 11:
                                    obj6 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 12:
                                    m.add(ProtoAdapter.STRING.decode(reader));
                                    break;
                                case 13:
                                    obj9 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, reader, obj9);
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(LocalMoney.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalCart.Line value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.token);
                    LocalCart.Line.Selection.ADAPTER.encodeWithTag(writer, 2, value.selection);
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.total_price);
                    protoAdapter3.encodeWithTag(writer, 4, value.total_price_before_discounts);
                    protoAdapter3.encodeWithTag(writer, 10, value.discount_amount);
                    protoAdapter2.encodeWithTag(writer, 11, value.discount_text);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 12, value.discount_texts);
                    protoAdapter2.encodeWithTag(writer, 8, value.menu_item_name);
                    protoAdapter2.encodeWithTag(writer, 9, value.menu_item_variation_name);
                    LocalImage.ADAPTER.encodeWithTag(writer, 13, value.image);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalCart.Line value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = LocalCart.Line.Selection.ADAPTER.encodedSizeWithTag(2, value.selection) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    return LocalImage.ADAPTER.encodedSizeWithTag(13, value.image) + protoAdapter2.encodedSizeWithTag(9, value.menu_item_variation_name) + protoAdapter2.encodedSizeWithTag(8, value.menu_item_name) + protoAdapter2.asRepeated().encodedSizeWithTag(12, value.discount_texts) + protoAdapter2.encodedSizeWithTag(11, value.discount_text) + protoAdapter3.encodedSizeWithTag(10, value.discount_amount) + protoAdapter3.encodedSizeWithTag(4, value.total_price_before_discounts) + protoAdapter3.encodedSizeWithTag(3, value.total_price) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.Line redact(LocalCart.Line value) {
                    value.getClass();
                    LocalCart.Line.Selection selection = value.selection;
                    LocalCart.Line.Selection selection2 = selection != null ? (LocalCart.Line.Selection) LocalCart.Line.Selection.ADAPTER.redact(selection) : null;
                    LocalMoney localMoney = value.total_price;
                    LocalMoney localMoney2 = localMoney != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney) : null;
                    LocalMoney localMoney3 = value.total_price_before_discounts;
                    LocalMoney localMoney4 = localMoney3 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney3) : null;
                    LocalMoney localMoney5 = value.discount_amount;
                    LocalMoney localMoney6 = localMoney5 != null ? (LocalMoney) LocalMoney.ADAPTER.redact(localMoney5) : null;
                    LocalImage localImage = value.image;
                    return LocalCart.Line.copy$default(value, null, selection2, localMoney2, localMoney4, localMoney6, null, null, null, null, localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null, ByteString.EMPTY, 481, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalCart.Line value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalImage.ADAPTER.encodeWithTag(writer, 13, value.image);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 9, value.menu_item_variation_name);
                    protoAdapter2.encodeWithTag(writer, 8, value.menu_item_name);
                    protoAdapter2.asRepeated().encodeWithTag(writer, 12, value.discount_texts);
                    protoAdapter2.encodeWithTag(writer, 11, value.discount_text);
                    ProtoAdapter protoAdapter3 = LocalMoney.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 10, value.discount_amount);
                    protoAdapter3.encodeWithTag(writer, 4, value.total_price_before_discounts);
                    protoAdapter3.encodeWithTag(writer, 3, value.total_price);
                    LocalCart.Line.Selection.ADAPTER.encodeWithTag(writer, 2, value.selection);
                    protoAdapter2.encodeWithTag(writer, 1, value.token);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public Line(String str, Selection selection, LocalMoney localMoney, LocalMoney localMoney2, LocalMoney localMoney3, String str2, List list, String str3, String str4, LocalImage localImage, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : selection, (i & 4) != 0 ? null : localMoney, (i & 8) != 0 ? null : localMoney2, (i & 16) != 0 ? null : localMoney3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? EmptyList.INSTANCE : list, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : localImage, (i & 1024) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Line copy$default(Line line, String str, Selection selection, LocalMoney localMoney, LocalMoney localMoney2, LocalMoney localMoney3, String str2, List list, String str3, String str4, LocalImage localImage, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = line.token;
            }
            if ((i & 2) != 0) {
                selection = line.selection;
            }
            if ((i & 4) != 0) {
                localMoney = line.total_price;
            }
            if ((i & 8) != 0) {
                localMoney2 = line.total_price_before_discounts;
            }
            if ((i & 16) != 0) {
                localMoney3 = line.discount_amount;
            }
            if ((i & 32) != 0) {
                str2 = line.discount_text;
            }
            if ((i & 64) != 0) {
                list = line.discount_texts;
            }
            if ((i & 128) != 0) {
                str3 = line.menu_item_name;
            }
            if ((i & 256) != 0) {
                str4 = line.menu_item_variation_name;
            }
            if ((i & 512) != 0) {
                localImage = line.image;
            }
            if ((i & 1024) != 0) {
                byteString = line.unknownFields();
            }
            LocalImage localImage2 = localImage;
            ByteString byteString2 = byteString;
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            List list2 = list;
            LocalMoney localMoney4 = localMoney3;
            LocalMoney localMoney5 = localMoney;
            return line.copy(str, selection, localMoney5, localMoney2, localMoney4, str7, list2, str5, str6, localImage2, byteString2);
        }

        public final Line copy(String token, Selection selection, LocalMoney total_price, LocalMoney total_price_before_discounts, LocalMoney discount_amount, String discount_text, List<String> discount_texts, String menu_item_name, String menu_item_variation_name, LocalImage image, ByteString unknownFields) {
            discount_texts.getClass();
            unknownFields.getClass();
            return new Line(token, selection, total_price, total_price_before_discounts, discount_amount, discount_text, discount_texts, menu_item_name, menu_item_variation_name, image, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Line)) {
                return false;
            }
            Line line = (Line) other;
            return Intrinsics.areEqual(unknownFields(), line.unknownFields()) && Intrinsics.areEqual(this.token, line.token) && Intrinsics.areEqual(this.selection, line.selection) && Intrinsics.areEqual(this.total_price, line.total_price) && Intrinsics.areEqual(this.total_price_before_discounts, line.total_price_before_discounts) && Intrinsics.areEqual(this.discount_amount, line.discount_amount) && Intrinsics.areEqual(this.discount_text, line.discount_text) && Intrinsics.areEqual(this.discount_texts, line.discount_texts) && Intrinsics.areEqual(this.menu_item_name, line.menu_item_name) && Intrinsics.areEqual(this.menu_item_variation_name, line.menu_item_variation_name) && Intrinsics.areEqual(this.image, line.image);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Selection selection = this.selection;
            int hashCode3 = (hashCode2 + (selection != null ? selection.hashCode() : 0)) * 37;
            LocalMoney localMoney = this.total_price;
            int hashCode4 = (hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            LocalMoney localMoney2 = this.total_price_before_discounts;
            int hashCode5 = (hashCode4 + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37;
            LocalMoney localMoney3 = this.discount_amount;
            int hashCode6 = (hashCode5 + (localMoney3 != null ? localMoney3.hashCode() : 0)) * 37;
            String str2 = this.discount_text;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.discount_texts);
            String str3 = this.menu_item_name;
            int hashCode7 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.menu_item_variation_name;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
            LocalImage localImage = this.image;
            int hashCode9 = hashCode8 + (localImage != null ? localImage.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.token = this.token;
            builder.selection = this.selection;
            builder.total_price = this.total_price;
            builder.total_price_before_discounts = this.total_price_before_discounts;
            builder.discount_amount = this.discount_amount;
            builder.discount_text = this.discount_text;
            builder.discount_texts = this.discount_texts;
            builder.menu_item_name = this.menu_item_name;
            builder.menu_item_variation_name = this.menu_item_variation_name;
            builder.image = this.image;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            Selection selection = this.selection;
            if (selection != null) {
                arrayList.add("selection=" + selection);
            }
            LocalMoney localMoney = this.total_price;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("total_price=", localMoney, arrayList);
            }
            LocalMoney localMoney2 = this.total_price_before_discounts;
            if (localMoney2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("total_price_before_discounts=", localMoney2, arrayList);
            }
            LocalMoney localMoney3 = this.discount_amount;
            if (localMoney3 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("discount_amount=", localMoney3, arrayList);
            }
            String str2 = this.discount_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "discount_text=", arrayList);
            }
            if (!this.discount_texts.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_texts=", arrayList, this.discount_texts);
            }
            String str3 = this.menu_item_name;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "menu_item_name=", arrayList);
            }
            String str4 = this.menu_item_variation_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "menu_item_variation_name=", arrayList);
            }
            LocalImage localImage = this.image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Line{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$Line;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Line build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Line() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Line(String str, Selection selection, LocalMoney localMoney, LocalMoney localMoney2, LocalMoney localMoney3, String str2, List<String> list, String str3, String str4, LocalImage localImage, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.token = str;
            this.selection = selection;
            this.total_price = localMoney;
            this.total_price_before_discounts = localMoney2;
            this.discount_amount = localMoney3;
            this.discount_text = str2;
            this.menu_item_name = str3;
            this.menu_item_variation_name = str4;
            this.image = localImage;
            this.discount_texts = TransactorKt.immutableCopyOf("discount_texts", list);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016JL\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary$Builder;", "deprecated_card_brand_string", "", "last_4", "card_type", "card_brand", "Lcom/squareup/protos/cash/local/client/v1/CardBrandType;", "payment_option", "Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/local/client/v1/CardBrandType;Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;Lokio/ByteString;)V", "getDeprecated_card_brand_string$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaymentSummary> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.CardBrandType#ADAPTER", schemaIndex = 3, tag = 4)
        public final CardBrandType card_brand;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String card_type;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String deprecated_card_brand_string;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String last_4;

        @WireField(adapter = "com.squareup.protos.cash.local.client.v1.LocalPaymentOption#ADAPTER", schemaIndex = 4, tag = 5)
        public final LocalPaymentOption payment_option;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "<init>", "()V", "deprecated_card_brand_string", "", "last_4", "card_type", "card_brand", "Lcom/squareup/protos/cash/local/client/v1/CardBrandType;", "payment_option", "Lcom/squareup/protos/cash/local/client/v1/LocalPaymentOption;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public CardBrandType card_brand;
            public String card_type;
            public String deprecated_card_brand_string;
            public String last_4;
            public LocalPaymentOption payment_option;

            @Override // com.squareup.wire.Message.Builder
            public PaymentSummary build() {
                return new PaymentSummary(this.deprecated_card_brand_string, this.last_4, this.card_type, this.card_brand, this.payment_option, buildUnknownFields());
            }

            public final Builder card_brand(CardBrandType card_brand) {
                this.card_brand = card_brand;
                return this;
            }

            public final Builder card_type(String card_type) {
                this.card_type = card_type;
                return this;
            }

            @Deprecated
            public final Builder deprecated_card_brand_string(String deprecated_card_brand_string) {
                this.deprecated_card_brand_string = deprecated_card_brand_string;
                return this;
            }

            public final Builder last_4(String last_4) {
                this.last_4 = last_4;
                return this;
            }

            public final Builder payment_option(LocalPaymentOption payment_option) {
                this.payment_option = payment_option;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentSummary.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.local.client.v1.LocalCart$PaymentSummary$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.PaymentSummary decode(ProtoReader reader) {
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
                            return new LocalCart.PaymentSummary((String) obj, (String) obj2, (String) obj3, (CardBrandType) obj4, (LocalPaymentOption) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            try {
                                obj4 = CardBrandType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj5 = LocalPaymentOption.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, LocalCart.PaymentSummary value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.deprecated_card_brand_string);
                    protoAdapter2.encodeWithTag(writer, 2, value.last_4);
                    protoAdapter2.encodeWithTag(writer, 3, value.card_type);
                    CardBrandType.ADAPTER.encodeWithTag(writer, 4, value.card_brand);
                    LocalPaymentOption.ADAPTER.encodeWithTag(writer, 5, value.payment_option);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(LocalCart.PaymentSummary value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return LocalPaymentOption.ADAPTER.encodedSizeWithTag(5, value.payment_option) + CardBrandType.ADAPTER.encodedSizeWithTag(4, value.card_brand) + protoAdapter2.encodedSizeWithTag(3, value.card_type) + protoAdapter2.encodedSizeWithTag(2, value.last_4) + protoAdapter2.encodedSizeWithTag(1, value.deprecated_card_brand_string) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public LocalCart.PaymentSummary redact(LocalCart.PaymentSummary value) {
                    value.getClass();
                    return LocalCart.PaymentSummary.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, LocalCart.PaymentSummary value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    LocalPaymentOption.ADAPTER.encodeWithTag(writer, 5, value.payment_option);
                    CardBrandType.ADAPTER.encodeWithTag(writer, 4, value.card_brand);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.card_type);
                    protoAdapter2.encodeWithTag(writer, 2, value.last_4);
                    protoAdapter2.encodeWithTag(writer, 1, value.deprecated_card_brand_string);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PaymentSummary(String str, String str2, String str3, CardBrandType cardBrandType, LocalPaymentOption localPaymentOption, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : cardBrandType, (i & 16) != 0 ? null : localPaymentOption, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PaymentSummary copy$default(PaymentSummary paymentSummary, String str, String str2, String str3, CardBrandType cardBrandType, LocalPaymentOption localPaymentOption, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentSummary.deprecated_card_brand_string;
            }
            if ((i & 2) != 0) {
                str2 = paymentSummary.last_4;
            }
            if ((i & 4) != 0) {
                str3 = paymentSummary.card_type;
            }
            if ((i & 8) != 0) {
                cardBrandType = paymentSummary.card_brand;
            }
            if ((i & 16) != 0) {
                localPaymentOption = paymentSummary.payment_option;
            }
            if ((i & 32) != 0) {
                byteString = paymentSummary.unknownFields();
            }
            LocalPaymentOption localPaymentOption2 = localPaymentOption;
            ByteString byteString2 = byteString;
            return paymentSummary.copy(str, str2, str3, cardBrandType, localPaymentOption2, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getDeprecated_card_brand_string$annotations() {
        }

        public final PaymentSummary copy(String deprecated_card_brand_string, String last_4, String card_type, CardBrandType card_brand, LocalPaymentOption payment_option, ByteString unknownFields) {
            unknownFields.getClass();
            return new PaymentSummary(deprecated_card_brand_string, last_4, card_type, card_brand, payment_option, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PaymentSummary)) {
                return false;
            }
            PaymentSummary paymentSummary = (PaymentSummary) other;
            return Intrinsics.areEqual(unknownFields(), paymentSummary.unknownFields()) && Intrinsics.areEqual(this.deprecated_card_brand_string, paymentSummary.deprecated_card_brand_string) && Intrinsics.areEqual(this.last_4, paymentSummary.last_4) && Intrinsics.areEqual(this.card_type, paymentSummary.card_type) && this.card_brand == paymentSummary.card_brand && this.payment_option == paymentSummary.payment_option;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.deprecated_card_brand_string;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.last_4;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.card_type;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            CardBrandType cardBrandType = this.card_brand;
            int hashCode5 = (hashCode4 + (cardBrandType != null ? cardBrandType.hashCode() : 0)) * 37;
            LocalPaymentOption localPaymentOption = this.payment_option;
            int hashCode6 = hashCode5 + (localPaymentOption != null ? localPaymentOption.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.deprecated_card_brand_string = this.deprecated_card_brand_string;
            builder.last_4 = this.last_4;
            builder.card_type = this.card_type;
            builder.card_brand = this.card_brand;
            builder.payment_option = this.payment_option;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.deprecated_card_brand_string;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "deprecated_card_brand_string=", arrayList);
            }
            String str2 = this.last_4;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "last_4=", arrayList);
            }
            String str3 = this.card_type;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "card_type=", arrayList);
            }
            CardBrandType cardBrandType = this.card_brand;
            if (cardBrandType != null) {
                arrayList.add("card_brand=" + cardBrandType);
            }
            LocalPaymentOption localPaymentOption = this.payment_option;
            if (localPaymentOption != null) {
                arrayList.add("payment_option=" + localPaymentOption);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentSummary{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart$PaymentSummary;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PaymentSummary build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PaymentSummary() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentSummary(String str, String str2, String str3, CardBrandType cardBrandType, LocalPaymentOption localPaymentOption, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.deprecated_card_brand_string = str;
            this.last_4 = str2;
            this.card_type = str3;
            this.card_brand = cardBrandType;
            this.payment_option = localPaymentOption;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/LocalCart$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/local/client/v1/LocalCart$Builder;", "", "body", "Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/local/client/v1/LocalCart;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ LocalCart build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
