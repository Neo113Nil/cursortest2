package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;
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

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\n-,./012345R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u000eR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u0012\u0004\b+\u0010\u000e¨\u00066"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "avatar", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "", "title", "Ljava/lang/String;", "subtitle", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "icon", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "getIcon$annotations", "()V", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", "getContent$annotations", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer.f1485type, "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "auto_dismiss_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "", "auto_dismiss_delay_ms", "Ljava/lang/Long;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "on_display_interstitial", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "getOn_display_interstitial$annotations", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$MoneyElement;", "money_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$MoneyElement;", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$CallToActionElement;", "call_to_action_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$CallToActionElement;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "in_transaction_top_up_element", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "getIn_transaction_top_up_element$annotations", "on_end_interstitial", "getOn_end_interstitial$annotations", "Companion", "Builder", "Badge", "Avatar", "Content", "Footer", "Interstitial", "StatusIcon", "InTransactionTopUpElement", "EducationalContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PayWithCashAuthorizationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PayWithCashAuthorizationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 6, tag = 7)
    public final BlockerAction auto_dismiss_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 7, tag = 8)
    public final Long auto_dismiss_delay_ms;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Avatar#ADAPTER", schemaIndex = 0, tag = 1)
    public final Avatar avatar;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$CallToActionElement#ADAPTER", schemaIndex = 10, tag = 11)
    public final FormBlocker.Element.CallToActionElement call_to_action_element;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Content#ADAPTER", schemaIndex = 4, tag = 5)
    public final Content content;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Footer#ADAPTER", schemaIndex = 5, tag = 6)
    public final Footer footer;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$StatusIcon#ADAPTER", schemaIndex = 3, tag = 4)
    public final StatusIcon icon;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$InTransactionTopUpElement#ADAPTER", schemaIndex = 11, tag = 12)
    public final InTransactionTopUpElement in_transaction_top_up_element;

    @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$MoneyElement#ADAPTER", schemaIndex = 9, tag = 10)
    public final FormBlocker.Element.MoneyElement money_element;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Interstitial#ADAPTER", schemaIndex = 8, tag = 9)
    public final Interstitial on_display_interstitial;

    @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Interstitial#ADAPTER", schemaIndex = 12, tag = 13)
    public final Interstitial on_end_interstitial;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker;", "<init>", "()V", "avatar", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "title", "", "subtitle", "icon", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer.f1485type, "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", "auto_dismiss_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "auto_dismiss_delay_ms", "", "Ljava/lang/Long;", "on_display_interstitial", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "money_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$MoneyElement;", "call_to_action_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$CallToActionElement;", "in_transaction_top_up_element", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "on_end_interstitial", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public BlockerAction auto_dismiss_action;
        public Long auto_dismiss_delay_ms;
        public Avatar avatar;
        public FormBlocker.Element.CallToActionElement call_to_action_element;
        public Content content;
        public Footer footer;
        public StatusIcon icon;
        public InTransactionTopUpElement in_transaction_top_up_element;
        public FormBlocker.Element.MoneyElement money_element;
        public Interstitial on_display_interstitial;
        public Interstitial on_end_interstitial;
        public String subtitle;
        public String title;

        public final Builder auto_dismiss_action(BlockerAction auto_dismiss_action) {
            this.auto_dismiss_action = auto_dismiss_action;
            return this;
        }

        public final Builder auto_dismiss_delay_ms(Long auto_dismiss_delay_ms) {
            this.auto_dismiss_delay_ms = auto_dismiss_delay_ms;
            return this;
        }

        public final Builder avatar(Avatar avatar) {
            this.avatar = avatar;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PayWithCashAuthorizationBlocker build() {
            return new PayWithCashAuthorizationBlocker(this.avatar, this.title, this.subtitle, this.icon, this.content, this.footer, this.auto_dismiss_action, this.auto_dismiss_delay_ms, this.on_display_interstitial, this.money_element, this.call_to_action_element, this.in_transaction_top_up_element, this.on_end_interstitial, buildUnknownFields());
        }

        public final Builder call_to_action_element(FormBlocker.Element.CallToActionElement call_to_action_element) {
            this.call_to_action_element = call_to_action_element;
            return this;
        }

        @Deprecated
        public final Builder content(Content content) {
            this.content = content;
            return this;
        }

        public final Builder footer(Footer footer) {
            this.footer = footer;
            return this;
        }

        @Deprecated
        public final Builder icon(StatusIcon icon) {
            this.icon = icon;
            return this;
        }

        @Deprecated
        public final Builder in_transaction_top_up_element(InTransactionTopUpElement in_transaction_top_up_element) {
            this.in_transaction_top_up_element = in_transaction_top_up_element;
            return this;
        }

        public final Builder money_element(FormBlocker.Element.MoneyElement money_element) {
            this.money_element = money_element;
            return this;
        }

        @Deprecated
        public final Builder on_display_interstitial(Interstitial on_display_interstitial) {
            this.on_display_interstitial = on_display_interstitial;
            return this;
        }

        @Deprecated
        public final Builder on_end_interstitial(Interstitial on_end_interstitial) {
            this.on_end_interstitial = on_end_interstitial;
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

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Builder;", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Content", "Companion", "TextContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Content extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Content> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final AbstractC0073Content content;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", "<init>", "()V", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AbstractC0073Content content;

            @Override // com.squareup.wire.Message.Builder
            public Content build() {
                return new Content(this.content, buildUnknownFields());
            }

            public final Builder content(AbstractC0073Content content) {
                this.content = content;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Content.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Content$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Content decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent textContent = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PayWithCashAuthorizationBlocker.Content(textContent, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            textContent = new PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent((PayWithCashAuthorizationBlocker.Content.TextContent) PayWithCashAuthorizationBlocker.Content.TextContent.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Content value) {
                    writer.getClass();
                    value.getClass();
                    PayWithCashAuthorizationBlocker.Content.AbstractC0073Content abstractC0073Content = value.content;
                    if (abstractC0073Content instanceof PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent) {
                        PayWithCashAuthorizationBlocker.Content.TextContent.ADAPTER.encodeWithTag(writer, 1, ((PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent) abstractC0073Content).getValue());
                    } else if (abstractC0073Content != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PayWithCashAuthorizationBlocker.Content value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    PayWithCashAuthorizationBlocker.Content.AbstractC0073Content abstractC0073Content = value.content;
                    if (abstractC0073Content instanceof PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent) {
                        return PayWithCashAuthorizationBlocker.Content.TextContent.ADAPTER.encodedSizeWithTag(1, ((PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent) abstractC0073Content).getValue()) + size$okio;
                    }
                    if (abstractC0073Content == null) {
                        return size$okio;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Content redact(PayWithCashAuthorizationBlocker.Content value) {
                    value.getClass();
                    return PayWithCashAuthorizationBlocker.Content.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Content value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PayWithCashAuthorizationBlocker.Content.AbstractC0073Content abstractC0073Content = value.content;
                    if (abstractC0073Content instanceof PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent) {
                        PayWithCashAuthorizationBlocker.Content.TextContent.ADAPTER.encodeWithTag(writer, 1, ((PayWithCashAuthorizationBlocker.Content.AbstractC0073Content.TextContent) abstractC0073Content).getValue());
                    } else {
                        if (abstractC0073Content == null) {
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

        public /* synthetic */ Content(AbstractC0073Content abstractC0073Content, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : abstractC0073Content, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Content copy$default(Content content, AbstractC0073Content abstractC0073Content, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC0073Content = content.content;
            }
            if ((i & 2) != 0) {
                byteString = content.unknownFields();
            }
            return content.copy(abstractC0073Content, byteString);
        }

        public final Content copy(AbstractC0073Content content, ByteString unknownFields) {
            unknownFields.getClass();
            return new Content(content, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(unknownFields(), content.unknownFields()) && Intrinsics.areEqual(this.content, content.content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AbstractC0073Content abstractC0073Content = this.content;
            int hashCode2 = hashCode + (abstractC0073Content != null ? abstractC0073Content.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            AbstractC0073Content abstractC0073Content = this.content;
            if (abstractC0073Content != null) {
                arrayList.add("content=" + abstractC0073Content);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Content{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TextContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TextContent> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
            public final String text;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String text;

                @Override // com.squareup.wire.Message.Builder
                public TextContent build() {
                    return new TextContent(this.text, buildUnknownFields());
                }

                public final Builder text(String text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextContent.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Content$TextContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PayWithCashAuthorizationBlocker.Content.TextContent decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PayWithCashAuthorizationBlocker.Content.TextContent((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(nextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Content.TextContent value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PayWithCashAuthorizationBlocker.Content.TextContent value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PayWithCashAuthorizationBlocker.Content.TextContent redact(PayWithCashAuthorizationBlocker.Content.TextContent value) {
                        value.getClass();
                        return value.copy(null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Content.TextContent value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ TextContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ TextContent copy$default(TextContent textContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textContent.text;
                }
                if ((i & 2) != 0) {
                    byteString = textContent.unknownFields();
                }
                return textContent.copy(str, byteString);
            }

            public final TextContent copy(String text, ByteString unknownFields) {
                unknownFields.getClass();
                return new TextContent(text, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TextContent)) {
                    return false;
                }
                TextContent textContent = (TextContent) other;
                return Intrinsics.areEqual(unknownFields(), textContent.unknownFields()) && Intrinsics.areEqual(this.text, textContent.text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.text != null) {
                    arrayList.add("text=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextContent{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ TextContent build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TextContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextContent(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Content build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content;", "", "<init>", "()V", "TextContent", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content$TextContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Content$Content, reason: collision with other inner class name */
        public static abstract class AbstractC0073Content {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Content$TextContent#ADAPTER", declaredName = "text_content", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content$TextContent;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$Content;", "value", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Content$TextContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Content$Content$TextContent */
            public static final /* data */ class TextContent extends AbstractC0073Content {
                private final TextContent value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TextContent(TextContent textContent) {
                    super(null);
                    textContent.getClass();
                    this.value = textContent;
                }

                public static /* synthetic */ TextContent copy$default(TextContent textContent, TextContent textContent2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        textContent2 = textContent.value;
                    }
                    return textContent.copy(textContent2);
                }

                /* renamed from: component1, reason: from getter */
                public final TextContent getValue() {
                    return this.value;
                }

                public final TextContent copy(TextContent value) {
                    value.getClass();
                    return new TextContent(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TextContent) && Intrinsics.areEqual(this.value, ((TextContent) other).value);
                }

                public final TextContent getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TextContent(value=" + this.value + ")";
                }
            }

            public /* synthetic */ AbstractC0073Content(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0073Content() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(AbstractC0073Content abstractC0073Content, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = abstractC0073Content;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Builder;", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content;", "disclaimer_text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Content", "Companion", "ButtonFooter", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Footer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Footer> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Content content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String disclaimer_text;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", "<init>", "()V", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content;", "disclaimer_text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Content content;
            public String disclaimer_text;

            @Override // com.squareup.wire.Message.Builder
            public Footer build() {
                return new Footer(this.content, this.disclaimer_text, buildUnknownFields());
            }

            public final Builder content(Content content) {
                this.content = content;
                return this;
            }

            public final Builder disclaimer_text(String disclaimer_text) {
                this.disclaimer_text = disclaimer_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Footer.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Footer$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Footer decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter buttonFooter = null;
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PayWithCashAuthorizationBlocker.Footer(buttonFooter, (String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            buttonFooter = new PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter((PayWithCashAuthorizationBlocker.Footer.ButtonFooter) PayWithCashAuthorizationBlocker.Footer.ButtonFooter.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Footer value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.disclaimer_text);
                    PayWithCashAuthorizationBlocker.Footer.Content content = value.content;
                    if (content instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) {
                        PayWithCashAuthorizationBlocker.Footer.ButtonFooter.ADAPTER.encodeWithTag(writer, 1, ((PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content).getValue());
                    } else if (content != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PayWithCashAuthorizationBlocker.Footer value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    PayWithCashAuthorizationBlocker.Footer.Content content = value.content;
                    if (content instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) {
                        size$okio += PayWithCashAuthorizationBlocker.Footer.ButtonFooter.ADAPTER.encodedSizeWithTag(1, ((PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content).getValue());
                    } else if (content != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.disclaimer_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Footer redact(PayWithCashAuthorizationBlocker.Footer value) {
                    value.getClass();
                    return PayWithCashAuthorizationBlocker.Footer.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Footer value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PayWithCashAuthorizationBlocker.Footer.Content content = value.content;
                    if (content instanceof PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) {
                        PayWithCashAuthorizationBlocker.Footer.ButtonFooter.ADAPTER.encodeWithTag(writer, 1, ((PayWithCashAuthorizationBlocker.Footer.Content.ButtonFooter) content).getValue());
                    } else if (content != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.disclaimer_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Footer(Content content, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : content, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Footer copy$default(Footer footer, Content content, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                content = footer.content;
            }
            if ((i & 2) != 0) {
                str = footer.disclaimer_text;
            }
            if ((i & 4) != 0) {
                byteString = footer.unknownFields();
            }
            return footer.copy(content, str, byteString);
        }

        public final Footer copy(Content content, String disclaimer_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new Footer(content, disclaimer_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return Intrinsics.areEqual(unknownFields(), footer.unknownFields()) && Intrinsics.areEqual(this.content, footer.content) && Intrinsics.areEqual(this.disclaimer_text, footer.disclaimer_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Content content = this.content;
            int hashCode2 = (hashCode + (content != null ? content.hashCode() : 0)) * 37;
            String str = this.disclaimer_text;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.content = this.content;
            builder.disclaimer_text = this.disclaimer_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Content content = this.content;
            if (content != null) {
                arrayList.add("content=" + content);
            }
            String str = this.disclaimer_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "disclaimer_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Footer{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter$Builder;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/BlockerAction;Lcom/squareup/protos/franklin/api/BlockerAction;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ButtonFooter extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ButtonFooter> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 0, tag = 1)
            public final BlockerAction primary_action;

            @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 1, tag = 2)
            public final BlockerAction secondary_action;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;", "<init>", "()V", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public BlockerAction primary_action;
                public BlockerAction secondary_action;

                @Override // com.squareup.wire.Message.Builder
                public ButtonFooter build() {
                    return new ButtonFooter(this.primary_action, this.secondary_action, buildUnknownFields());
                }

                public final Builder primary_action(BlockerAction primary_action) {
                    this.primary_action = primary_action;
                    return this;
                }

                public final Builder secondary_action(BlockerAction secondary_action) {
                    this.secondary_action = secondary_action;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ButtonFooter.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Footer$ButtonFooter$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PayWithCashAuthorizationBlocker.Footer.ButtonFooter decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PayWithCashAuthorizationBlocker.Footer.ButtonFooter((BlockerAction) obj, (BlockerAction) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj2);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Footer.ButtonFooter value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.primary_action);
                        protoAdapter2.encodeWithTag(writer, 2, value.secondary_action);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PayWithCashAuthorizationBlocker.Footer.ButtonFooter value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                        return protoAdapter2.encodedSizeWithTag(2, value.secondary_action) + protoAdapter2.encodedSizeWithTag(1, value.primary_action) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PayWithCashAuthorizationBlocker.Footer.ButtonFooter redact(PayWithCashAuthorizationBlocker.Footer.ButtonFooter value) {
                        value.getClass();
                        BlockerAction blockerAction = value.primary_action;
                        BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                        BlockerAction blockerAction3 = value.secondary_action;
                        return value.copy(blockerAction2, blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Footer.ButtonFooter value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 2, value.secondary_action);
                        protoAdapter2.encodeWithTag(writer, 1, value.primary_action);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ButtonFooter(BlockerAction blockerAction, BlockerAction blockerAction2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : blockerAction, (i & 2) != 0 ? null : blockerAction2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ButtonFooter copy$default(ButtonFooter buttonFooter, BlockerAction blockerAction, BlockerAction blockerAction2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    blockerAction = buttonFooter.primary_action;
                }
                if ((i & 2) != 0) {
                    blockerAction2 = buttonFooter.secondary_action;
                }
                if ((i & 4) != 0) {
                    byteString = buttonFooter.unknownFields();
                }
                return buttonFooter.copy(blockerAction, blockerAction2, byteString);
            }

            public final ButtonFooter copy(BlockerAction primary_action, BlockerAction secondary_action, ByteString unknownFields) {
                unknownFields.getClass();
                return new ButtonFooter(primary_action, secondary_action, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ButtonFooter)) {
                    return false;
                }
                ButtonFooter buttonFooter = (ButtonFooter) other;
                return Intrinsics.areEqual(unknownFields(), buttonFooter.unknownFields()) && Intrinsics.areEqual(this.primary_action, buttonFooter.primary_action) && Intrinsics.areEqual(this.secondary_action, buttonFooter.secondary_action);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                BlockerAction blockerAction = this.primary_action;
                int hashCode2 = (hashCode + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
                BlockerAction blockerAction2 = this.secondary_action;
                int hashCode3 = hashCode2 + (blockerAction2 != null ? blockerAction2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.primary_action = this.primary_action;
                builder.secondary_action = this.secondary_action;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                BlockerAction blockerAction = this.primary_action;
                if (blockerAction != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_action=", blockerAction, arrayList);
                }
                BlockerAction blockerAction2 = this.secondary_action;
                if (blockerAction2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_action=", blockerAction2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonFooter{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ButtonFooter build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ButtonFooter() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonFooter(BlockerAction blockerAction, BlockerAction blockerAction2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.primary_action = blockerAction;
                this.secondary_action = blockerAction2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Footer build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content;", "", "<init>", "()V", "ButtonFooter", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content$ButtonFooter;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Content {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Footer$ButtonFooter#ADAPTER", declaredName = "button_footer", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content$ButtonFooter;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$Content;", "value", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Footer$ButtonFooter;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ButtonFooter extends Content {
                private final ButtonFooter value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ButtonFooter(ButtonFooter buttonFooter) {
                    super(null);
                    buttonFooter.getClass();
                    this.value = buttonFooter;
                }

                public static /* synthetic */ ButtonFooter copy$default(ButtonFooter buttonFooter, ButtonFooter buttonFooter2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        buttonFooter2 = buttonFooter.value;
                    }
                    return buttonFooter.copy(buttonFooter2);
                }

                /* renamed from: component1, reason: from getter */
                public final ButtonFooter getValue() {
                    return this.value;
                }

                public final ButtonFooter copy(ButtonFooter value) {
                    value.getClass();
                    return new ButtonFooter(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ButtonFooter) && Intrinsics.areEqual(this.value, ((ButtonFooter) other).value);
                }

                public final ButtonFooter getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ButtonFooter(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Content(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Content() {
            }
        }

        public Footer() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Footer(Content content, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = content;
            this.disclaimer_text = str;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Builder;", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Content", "Companion", "StatusInterstitial", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Interstitial extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Interstitial> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Content content;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "<init>", "()V", "content", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Content content;

            @Override // com.squareup.wire.Message.Builder
            public Interstitial build() {
                return new Interstitial(this.content, buildUnknownFields());
            }

            public final Builder content(Content content) {
                this.content = content;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Interstitial.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Interstitial$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Interstitial decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial statusInterstitial = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PayWithCashAuthorizationBlocker.Interstitial(statusInterstitial, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            statusInterstitial = new PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial((PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial) PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Interstitial value) {
                    writer.getClass();
                    value.getClass();
                    PayWithCashAuthorizationBlocker.Interstitial.Content content = value.content;
                    if (content instanceof PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) {
                        PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial.ADAPTER.encodeWithTag(writer, 1, ((PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) content).getValue());
                    } else if (content != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PayWithCashAuthorizationBlocker.Interstitial value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    PayWithCashAuthorizationBlocker.Interstitial.Content content = value.content;
                    if (content instanceof PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) {
                        return PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial.ADAPTER.encodedSizeWithTag(1, ((PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) content).getValue()) + size$okio;
                    }
                    if (content == null) {
                        return size$okio;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Interstitial redact(PayWithCashAuthorizationBlocker.Interstitial value) {
                    value.getClass();
                    return PayWithCashAuthorizationBlocker.Interstitial.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Interstitial value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PayWithCashAuthorizationBlocker.Interstitial.Content content = value.content;
                    if (content instanceof PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) {
                        PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial.ADAPTER.encodeWithTag(writer, 1, ((PayWithCashAuthorizationBlocker.Interstitial.Content.StatusInterstitial) content).getValue());
                    } else {
                        if (content == null) {
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

        public /* synthetic */ Interstitial(Content content, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : content, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Interstitial copy$default(Interstitial interstitial, Content content, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                content = interstitial.content;
            }
            if ((i & 2) != 0) {
                byteString = interstitial.unknownFields();
            }
            return interstitial.copy(content, byteString);
        }

        public final Interstitial copy(Content content, ByteString unknownFields) {
            unknownFields.getClass();
            return new Interstitial(content, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) other;
            return Intrinsics.areEqual(unknownFields(), interstitial.unknownFields()) && Intrinsics.areEqual(this.content, interstitial.content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Content content = this.content;
            int hashCode2 = hashCode + (content != null ? content.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Content content = this.content;
            if (content != null) {
                arrayList.add("content=" + content);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Interstitial{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial$Builder;", "icon", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class StatusInterstitial extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<StatusInterstitial> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$StatusIcon#ADAPTER", schemaIndex = 0, tag = 1)
            public final StatusIcon icon;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
            public final String text;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;", "<init>", "()V", "icon", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public StatusIcon icon;
                public String text;

                @Override // com.squareup.wire.Message.Builder
                public StatusInterstitial build() {
                    return new StatusInterstitial(this.icon, this.text, buildUnknownFields());
                }

                public final Builder icon(StatusIcon icon) {
                    this.icon = icon;
                    return this;
                }

                public final Builder text(String text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StatusInterstitial.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial((PayWithCashAuthorizationBlocker.StatusIcon) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                try {
                                    obj = PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.decode(reader);
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
                    public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial value) {
                        writer.getClass();
                        value.getClass();
                        PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial value) {
                        value.getClass();
                        return ProtoAdapter.STRING.encodedSizeWithTag(2, value.text) + PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial redact(PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial value) {
                        value.getClass();
                        return PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial.copy$default(value, null, null, ByteString.EMPTY, 1, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Interstitial.StatusInterstitial value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                        PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ StatusInterstitial(StatusIcon statusIcon, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : statusIcon, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ StatusInterstitial copy$default(StatusInterstitial statusInterstitial, StatusIcon statusIcon, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    statusIcon = statusInterstitial.icon;
                }
                if ((i & 2) != 0) {
                    str = statusInterstitial.text;
                }
                if ((i & 4) != 0) {
                    byteString = statusInterstitial.unknownFields();
                }
                return statusInterstitial.copy(statusIcon, str, byteString);
            }

            public final StatusInterstitial copy(StatusIcon icon, String text, ByteString unknownFields) {
                unknownFields.getClass();
                return new StatusInterstitial(icon, text, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof StatusInterstitial)) {
                    return false;
                }
                StatusInterstitial statusInterstitial = (StatusInterstitial) other;
                return Intrinsics.areEqual(unknownFields(), statusInterstitial.unknownFields()) && this.icon == statusInterstitial.icon && Intrinsics.areEqual(this.text, statusInterstitial.text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                StatusIcon statusIcon = this.icon;
                int hashCode2 = (hashCode + (statusIcon != null ? statusIcon.hashCode() : 0)) * 37;
                String str = this.text;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.icon = this.icon;
                builder.text = this.text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                StatusIcon statusIcon = this.icon;
                if (statusIcon != null) {
                    arrayList.add("icon=" + statusIcon);
                }
                if (this.text != null) {
                    arrayList.add("text=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "StatusInterstitial{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ StatusInterstitial build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public StatusInterstitial() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StatusInterstitial(StatusIcon statusIcon, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = statusIcon;
                this.text = str;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Interstitial build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content;", "", "<init>", "()V", "StatusInterstitial", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content$StatusInterstitial;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Content {

            @WireOneofField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial#ADAPTER", declaredName = "status_interstitial", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content$StatusInterstitial;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$Content;", "value", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;", "<init>", "(Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Interstitial$StatusInterstitial;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class StatusInterstitial extends Content {
                private final StatusInterstitial value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StatusInterstitial(StatusInterstitial statusInterstitial) {
                    super(null);
                    statusInterstitial.getClass();
                    this.value = statusInterstitial;
                }

                public static /* synthetic */ StatusInterstitial copy$default(StatusInterstitial statusInterstitial, StatusInterstitial statusInterstitial2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        statusInterstitial2 = statusInterstitial.value;
                    }
                    return statusInterstitial.copy(statusInterstitial2);
                }

                /* renamed from: component1, reason: from getter */
                public final StatusInterstitial getValue() {
                    return this.value;
                }

                public final StatusInterstitial copy(StatusInterstitial value) {
                    value.getClass();
                    return new StatusInterstitial(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StatusInterstitial) && Intrinsics.areEqual(this.value, ((StatusInterstitial) other).value);
                }

                public final StatusInterstitial getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "StatusInterstitial(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Content(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Content() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Interstitial() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Interstitial(Content content, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = content;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PayWithCashAuthorizationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31 */
            /* JADX WARN: Type inference failed for: r0v34 */
            /* JADX WARN: Type inference failed for: r0v35 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public PayWithCashAuthorizationBlocker decode(ProtoReader reader) {
                Object obj;
                PayWithCashAuthorizationBlocker.StatusIcon statusIcon;
                Object obj2;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj3 = null;
                Object obj4 = null;
                PayWithCashAuthorizationBlocker.StatusIcon statusIcon2 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Long l = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                String str2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PayWithCashAuthorizationBlocker((PayWithCashAuthorizationBlocker.Avatar) obj3, str, str2, statusIcon2, (PayWithCashAuthorizationBlocker.Content) obj5, (PayWithCashAuthorizationBlocker.Footer) obj6, (BlockerAction) obj7, l, (PayWithCashAuthorizationBlocker.Interstitial) obj8, (FormBlocker.Element.MoneyElement) obj9, (FormBlocker.Element.CallToActionElement) obj10, (PayWithCashAuthorizationBlocker.InTransactionTopUpElement) obj11, (PayWithCashAuthorizationBlocker.Interstitial) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj3 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.Avatar.ADAPTER, reader, obj3);
                            decode = str;
                            break;
                        case 2:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 4:
                            try {
                                statusIcon2 = PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.decode(reader);
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj4;
                                statusIcon = statusIcon2;
                                obj2 = obj5;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.Content.ADAPTER, reader, obj5);
                            decode = str;
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.Footer.ADAPTER, reader, obj6);
                            decode = str;
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj7);
                            decode = str;
                            break;
                        case 8:
                            l = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 9:
                            obj8 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.Interstitial.ADAPTER, reader, obj8);
                            decode = str;
                            break;
                        case 10:
                            obj9 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.MoneyElement.ADAPTER, reader, obj9);
                            decode = str;
                            break;
                        case 11:
                            obj10 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.CallToActionElement.ADAPTER, reader, obj10);
                            decode = str;
                            break;
                        case 12:
                            obj11 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.InTransactionTopUpElement.ADAPTER, reader, obj11);
                            decode = str;
                            break;
                        case 13:
                            obj4 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.Interstitial.ADAPTER, reader, obj4);
                            decode = str;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj4;
                            statusIcon = statusIcon2;
                            obj2 = obj5;
                            decode = str;
                            obj4 = obj;
                            obj5 = obj2;
                            statusIcon2 = statusIcon;
                            break;
                    }
                    str = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker value) {
                writer.getClass();
                value.getClass();
                PayWithCashAuthorizationBlocker.Avatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.title);
                protoAdapter2.encodeWithTag(writer, 3, value.subtitle);
                PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.encodeWithTag(writer, 4, value.icon);
                PayWithCashAuthorizationBlocker.Content.ADAPTER.encodeWithTag(writer, 5, value.content);
                PayWithCashAuthorizationBlocker.Footer.ADAPTER.encodeWithTag(writer, 6, value.footer);
                BlockerAction.ADAPTER.encodeWithTag(writer, 7, value.auto_dismiss_action);
                ProtoAdapter.INT64.encodeWithTag(writer, 8, value.auto_dismiss_delay_ms);
                ProtoAdapter protoAdapter3 = PayWithCashAuthorizationBlocker.Interstitial.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 9, value.on_display_interstitial);
                FormBlocker.Element.MoneyElement.ADAPTER.encodeWithTag(writer, 10, value.money_element);
                FormBlocker.Element.CallToActionElement.ADAPTER.encodeWithTag(writer, 11, value.call_to_action_element);
                PayWithCashAuthorizationBlocker.InTransactionTopUpElement.ADAPTER.encodeWithTag(writer, 12, value.in_transaction_top_up_element);
                protoAdapter3.encodeWithTag(writer, 13, value.on_end_interstitial);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PayWithCashAuthorizationBlocker value) {
                value.getClass();
                int encodedSizeWithTag = PayWithCashAuthorizationBlocker.Avatar.ADAPTER.encodedSizeWithTag(1, value.avatar) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = ProtoAdapter.INT64.encodedSizeWithTag(8, value.auto_dismiss_delay_ms) + BlockerAction.ADAPTER.encodedSizeWithTag(7, value.auto_dismiss_action) + PayWithCashAuthorizationBlocker.Footer.ADAPTER.encodedSizeWithTag(6, value.footer) + PayWithCashAuthorizationBlocker.Content.ADAPTER.encodedSizeWithTag(5, value.content) + PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.encodedSizeWithTag(4, value.icon) + protoAdapter2.encodedSizeWithTag(3, value.subtitle) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = PayWithCashAuthorizationBlocker.Interstitial.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(13, value.on_end_interstitial) + PayWithCashAuthorizationBlocker.InTransactionTopUpElement.ADAPTER.encodedSizeWithTag(12, value.in_transaction_top_up_element) + FormBlocker.Element.CallToActionElement.ADAPTER.encodedSizeWithTag(11, value.call_to_action_element) + FormBlocker.Element.MoneyElement.ADAPTER.encodedSizeWithTag(10, value.money_element) + protoAdapter3.encodedSizeWithTag(9, value.on_display_interstitial) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PayWithCashAuthorizationBlocker redact(PayWithCashAuthorizationBlocker value) {
                value.getClass();
                PayWithCashAuthorizationBlocker.Avatar avatar = value.avatar;
                PayWithCashAuthorizationBlocker.Avatar avatar2 = avatar != null ? (PayWithCashAuthorizationBlocker.Avatar) PayWithCashAuthorizationBlocker.Avatar.ADAPTER.redact(avatar) : null;
                PayWithCashAuthorizationBlocker.Content content = value.content;
                PayWithCashAuthorizationBlocker.Content content2 = content != null ? (PayWithCashAuthorizationBlocker.Content) PayWithCashAuthorizationBlocker.Content.ADAPTER.redact(content) : null;
                PayWithCashAuthorizationBlocker.Footer footer = value.footer;
                PayWithCashAuthorizationBlocker.Footer footer2 = footer != null ? (PayWithCashAuthorizationBlocker.Footer) PayWithCashAuthorizationBlocker.Footer.ADAPTER.redact(footer) : null;
                BlockerAction blockerAction = value.auto_dismiss_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                PayWithCashAuthorizationBlocker.Interstitial interstitial = value.on_display_interstitial;
                PayWithCashAuthorizationBlocker.Interstitial interstitial2 = interstitial != null ? (PayWithCashAuthorizationBlocker.Interstitial) PayWithCashAuthorizationBlocker.Interstitial.ADAPTER.redact(interstitial) : null;
                FormBlocker.Element.MoneyElement moneyElement = value.money_element;
                FormBlocker.Element.MoneyElement moneyElement2 = moneyElement != null ? (FormBlocker.Element.MoneyElement) FormBlocker.Element.MoneyElement.ADAPTER.redact(moneyElement) : null;
                FormBlocker.Element.CallToActionElement callToActionElement = value.call_to_action_element;
                FormBlocker.Element.CallToActionElement callToActionElement2 = callToActionElement != null ? (FormBlocker.Element.CallToActionElement) FormBlocker.Element.CallToActionElement.ADAPTER.redact(callToActionElement) : null;
                PayWithCashAuthorizationBlocker.InTransactionTopUpElement inTransactionTopUpElement = value.in_transaction_top_up_element;
                PayWithCashAuthorizationBlocker.InTransactionTopUpElement inTransactionTopUpElement2 = inTransactionTopUpElement != null ? (PayWithCashAuthorizationBlocker.InTransactionTopUpElement) PayWithCashAuthorizationBlocker.InTransactionTopUpElement.ADAPTER.redact(inTransactionTopUpElement) : null;
                PayWithCashAuthorizationBlocker.Interstitial interstitial3 = value.on_end_interstitial;
                PayWithCashAuthorizationBlocker.Interstitial interstitial4 = interstitial3 != null ? (PayWithCashAuthorizationBlocker.Interstitial) PayWithCashAuthorizationBlocker.Interstitial.ADAPTER.redact(interstitial3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                PayWithCashAuthorizationBlocker.StatusIcon statusIcon = value.icon;
                Long l = value.auto_dismiss_delay_ms;
                byteString.getClass();
                return new PayWithCashAuthorizationBlocker(avatar2, str, str2, statusIcon, content2, footer2, blockerAction2, l, interstitial2, moneyElement2, callToActionElement2, inTransactionTopUpElement2, interstitial4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = PayWithCashAuthorizationBlocker.Interstitial.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 13, value.on_end_interstitial);
                PayWithCashAuthorizationBlocker.InTransactionTopUpElement.ADAPTER.encodeWithTag(writer, 12, value.in_transaction_top_up_element);
                FormBlocker.Element.CallToActionElement.ADAPTER.encodeWithTag(writer, 11, value.call_to_action_element);
                FormBlocker.Element.MoneyElement.ADAPTER.encodeWithTag(writer, 10, value.money_element);
                protoAdapter2.encodeWithTag(writer, 9, value.on_display_interstitial);
                ProtoAdapter.INT64.encodeWithTag(writer, 8, value.auto_dismiss_delay_ms);
                BlockerAction.ADAPTER.encodeWithTag(writer, 7, value.auto_dismiss_action);
                PayWithCashAuthorizationBlocker.Footer.ADAPTER.encodeWithTag(writer, 6, value.footer);
                PayWithCashAuthorizationBlocker.Content.ADAPTER.encodeWithTag(writer, 5, value.content);
                PayWithCashAuthorizationBlocker.StatusIcon.ADAPTER.encodeWithTag(writer, 4, value.icon);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 3, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 2, value.title);
                PayWithCashAuthorizationBlocker.Avatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayWithCashAuthorizationBlocker(Avatar avatar, String str, String str2, StatusIcon statusIcon, Content content, Footer footer, BlockerAction blockerAction, Long l, Interstitial interstitial, FormBlocker.Element.MoneyElement moneyElement, FormBlocker.Element.CallToActionElement callToActionElement, InTransactionTopUpElement inTransactionTopUpElement, Interstitial interstitial2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = avatar;
        this.title = str;
        this.subtitle = str2;
        this.icon = statusIcon;
        this.content = content;
        this.footer = footer;
        this.auto_dismiss_action = blockerAction;
        this.auto_dismiss_delay_ms = l;
        this.on_display_interstitial = interstitial;
        this.money_element = moneyElement;
        this.call_to_action_element = callToActionElement;
        this.in_transaction_top_up_element = inTransactionTopUpElement;
        this.on_end_interstitial = interstitial2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayWithCashAuthorizationBlocker)) {
            return false;
        }
        PayWithCashAuthorizationBlocker payWithCashAuthorizationBlocker = (PayWithCashAuthorizationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), payWithCashAuthorizationBlocker.unknownFields()) && Intrinsics.areEqual(this.avatar, payWithCashAuthorizationBlocker.avatar) && Intrinsics.areEqual(this.title, payWithCashAuthorizationBlocker.title) && Intrinsics.areEqual(this.subtitle, payWithCashAuthorizationBlocker.subtitle) && this.icon == payWithCashAuthorizationBlocker.icon && Intrinsics.areEqual(this.content, payWithCashAuthorizationBlocker.content) && Intrinsics.areEqual(this.footer, payWithCashAuthorizationBlocker.footer) && Intrinsics.areEqual(this.auto_dismiss_action, payWithCashAuthorizationBlocker.auto_dismiss_action) && Intrinsics.areEqual(this.auto_dismiss_delay_ms, payWithCashAuthorizationBlocker.auto_dismiss_delay_ms) && Intrinsics.areEqual(this.on_display_interstitial, payWithCashAuthorizationBlocker.on_display_interstitial) && Intrinsics.areEqual(this.money_element, payWithCashAuthorizationBlocker.money_element) && Intrinsics.areEqual(this.call_to_action_element, payWithCashAuthorizationBlocker.call_to_action_element) && Intrinsics.areEqual(this.in_transaction_top_up_element, payWithCashAuthorizationBlocker.in_transaction_top_up_element) && Intrinsics.areEqual(this.on_end_interstitial, payWithCashAuthorizationBlocker.on_end_interstitial);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Avatar avatar = this.avatar;
        int hashCode2 = (hashCode + (avatar != null ? avatar.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        StatusIcon statusIcon = this.icon;
        int hashCode5 = (hashCode4 + (statusIcon != null ? statusIcon.hashCode() : 0)) * 37;
        Content content = this.content;
        int hashCode6 = (hashCode5 + (content != null ? content.hashCode() : 0)) * 37;
        Footer footer = this.footer;
        int hashCode7 = (hashCode6 + (footer != null ? footer.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.auto_dismiss_action;
        int hashCode8 = (hashCode7 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        Long l = this.auto_dismiss_delay_ms;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Interstitial interstitial = this.on_display_interstitial;
        int hashCode10 = (hashCode9 + (interstitial != null ? interstitial.hashCode() : 0)) * 37;
        FormBlocker.Element.MoneyElement moneyElement = this.money_element;
        int hashCode11 = (hashCode10 + (moneyElement != null ? moneyElement.hashCode() : 0)) * 37;
        FormBlocker.Element.CallToActionElement callToActionElement = this.call_to_action_element;
        int hashCode12 = (hashCode11 + (callToActionElement != null ? callToActionElement.hashCode() : 0)) * 37;
        InTransactionTopUpElement inTransactionTopUpElement = this.in_transaction_top_up_element;
        int hashCode13 = (hashCode12 + (inTransactionTopUpElement != null ? inTransactionTopUpElement.hashCode() : 0)) * 37;
        Interstitial interstitial2 = this.on_end_interstitial;
        int hashCode14 = hashCode13 + (interstitial2 != null ? interstitial2.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.avatar = this.avatar;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.icon = this.icon;
        builder.content = this.content;
        builder.footer = this.footer;
        builder.auto_dismiss_action = this.auto_dismiss_action;
        builder.auto_dismiss_delay_ms = this.auto_dismiss_delay_ms;
        builder.on_display_interstitial = this.on_display_interstitial;
        builder.money_element = this.money_element;
        builder.call_to_action_element = this.call_to_action_element;
        builder.in_transaction_top_up_element = this.in_transaction_top_up_element;
        builder.on_end_interstitial = this.on_end_interstitial;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Avatar avatar = this.avatar;
        if (avatar != null) {
            arrayList.add("avatar=" + avatar);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        StatusIcon statusIcon = this.icon;
        if (statusIcon != null) {
            arrayList.add("icon=" + statusIcon);
        }
        Content content = this.content;
        if (content != null) {
            arrayList.add("content=" + content);
        }
        Footer footer = this.footer;
        if (footer != null) {
            arrayList.add("footer=" + footer);
        }
        BlockerAction blockerAction = this.auto_dismiss_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auto_dismiss_action=", blockerAction, arrayList);
        }
        Long l = this.auto_dismiss_delay_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("auto_dismiss_delay_ms=", l, arrayList);
        }
        Interstitial interstitial = this.on_display_interstitial;
        if (interstitial != null) {
            arrayList.add("on_display_interstitial=" + interstitial);
        }
        FormBlocker.Element.MoneyElement moneyElement = this.money_element;
        if (moneyElement != null) {
            arrayList.add("money_element=" + moneyElement);
        }
        FormBlocker.Element.CallToActionElement callToActionElement = this.call_to_action_element;
        if (callToActionElement != null) {
            arrayList.add("call_to_action_element=" + callToActionElement);
        }
        InTransactionTopUpElement inTransactionTopUpElement = this.in_transaction_top_up_element;
        if (inTransactionTopUpElement != null) {
            arrayList.add("in_transaction_top_up_element=" + inTransactionTopUpElement);
        }
        Interstitial interstitial2 = this.on_end_interstitial;
        if (interstitial2 != null) {
            arrayList.add("on_end_interstitial=" + interstitial2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PayWithCashAuthorizationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0006H\u0016JL\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar$Builder;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "monogram_text", "", "image", "Lcom/squareup/protos/cash/ui/Image;", "badge", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Badge;", "badge_background_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Badge;Lcom/squareup/protos/cash/ui/Color;Lokio/ByteString;)V", "getBadge_background_color$annotations", "()V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Avatar extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Avatar> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 0, tag = 1)
        public final Color background_color;

        @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Badge#ADAPTER", schemaIndex = 3, tag = 4)
        public final Badge badge;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 4, tag = 5)
        public final Color badge_background_color;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String monogram_text;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "<init>", "()V", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "monogram_text", "", "image", "Lcom/squareup/protos/cash/ui/Image;", "badge", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Badge;", "badge_background_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Color background_color;
            public Badge badge;
            public Color badge_background_color;
            public Image image;
            public String monogram_text;

            public final Builder background_color(Color background_color) {
                this.background_color = background_color;
                return this;
            }

            public final Builder badge(Badge badge) {
                this.badge = badge;
                return this;
            }

            @Deprecated
            public final Builder badge_background_color(Color badge_background_color) {
                this.badge_background_color = badge_background_color;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Avatar build() {
                return new Avatar(this.background_color, this.monogram_text, this.image, this.badge, this.badge_background_color, buildUnknownFields());
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder monogram_text(String monogram_text) {
                this.monogram_text = monogram_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Avatar.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Avatar$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Avatar decode(ProtoReader reader) {
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
                            return new PayWithCashAuthorizationBlocker.Avatar((Color) obj, (String) obj2, (Image) obj3, (PayWithCashAuthorizationBlocker.Badge) obj4, (Color) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            try {
                                obj4 = PayWithCashAuthorizationBlocker.Badge.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj5);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.Avatar value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = Color.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.background_color);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.monogram_text);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.image);
                    PayWithCashAuthorizationBlocker.Badge.ADAPTER.encodeWithTag(writer, 4, value.badge);
                    protoAdapter2.encodeWithTag(writer, 5, value.badge_background_color);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PayWithCashAuthorizationBlocker.Avatar value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = Color.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(5, value.badge_background_color) + PayWithCashAuthorizationBlocker.Badge.ADAPTER.encodedSizeWithTag(4, value.badge) + Image.ADAPTER.encodedSizeWithTag(3, value.image) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.monogram_text) + protoAdapter2.encodedSizeWithTag(1, value.background_color) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.Avatar redact(PayWithCashAuthorizationBlocker.Avatar value) {
                    value.getClass();
                    Color color = value.background_color;
                    Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    Color color3 = value.badge_background_color;
                    return PayWithCashAuthorizationBlocker.Avatar.copy$default(value, color2, null, image2, null, color3 != null ? (Color) Color.ADAPTER.redact(color3) : null, ByteString.EMPTY, 10, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.Avatar value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = Color.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 5, value.badge_background_color);
                    PayWithCashAuthorizationBlocker.Badge.ADAPTER.encodeWithTag(writer, 4, value.badge);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.image);
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.monogram_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.background_color);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Avatar(Color color, String str, Image image, Badge badge, Color color2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : color, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : badge, (i & 16) != 0 ? null : color2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Avatar copy$default(Avatar avatar, Color color, String str, Image image, Badge badge, Color color2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                color = avatar.background_color;
            }
            if ((i & 2) != 0) {
                str = avatar.monogram_text;
            }
            if ((i & 4) != 0) {
                image = avatar.image;
            }
            if ((i & 8) != 0) {
                badge = avatar.badge;
            }
            if ((i & 16) != 0) {
                color2 = avatar.badge_background_color;
            }
            if ((i & 32) != 0) {
                byteString = avatar.unknownFields();
            }
            Color color3 = color2;
            ByteString byteString2 = byteString;
            return avatar.copy(color, str, image, badge, color3, byteString2);
        }

        @Deprecated
        public static /* synthetic */ void getBadge_background_color$annotations() {
        }

        public final Avatar copy(Color background_color, String monogram_text, Image image, Badge badge, Color badge_background_color, ByteString unknownFields) {
            unknownFields.getClass();
            return new Avatar(background_color, monogram_text, image, badge, badge_background_color, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Avatar)) {
                return false;
            }
            Avatar avatar = (Avatar) other;
            return Intrinsics.areEqual(unknownFields(), avatar.unknownFields()) && Intrinsics.areEqual(this.background_color, avatar.background_color) && Intrinsics.areEqual(this.monogram_text, avatar.monogram_text) && Intrinsics.areEqual(this.image, avatar.image) && this.badge == avatar.badge && Intrinsics.areEqual(this.badge_background_color, avatar.badge_background_color);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Color color = this.background_color;
            int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
            String str = this.monogram_text;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
            Badge badge = this.badge;
            int hashCode5 = (hashCode4 + (badge != null ? badge.hashCode() : 0)) * 37;
            Color color2 = this.badge_background_color;
            int hashCode6 = hashCode5 + (color2 != null ? color2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.background_color = this.background_color;
            builder.monogram_text = this.monogram_text;
            builder.image = this.image;
            builder.badge = this.badge;
            builder.badge_background_color = this.badge_background_color;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Color color = this.background_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
            }
            String str = this.monogram_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "monogram_text=", arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Badge badge = this.badge;
            if (badge != null) {
                arrayList.add("badge=" + badge);
            }
            Color color2 = this.badge_background_color;
            if (color2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("badge_background_color=", color2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Avatar{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Avatar;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Avatar build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Avatar() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Avatar(Color color, String str, Image image, Badge badge, Color color2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.background_color = color;
            this.monogram_text = str;
            this.image = image;
            this.badge = badge;
            this.badge_background_color = color2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Badge;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LINK", "AFTERPAY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Badge implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Badge[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Badge LINK = new Badge("LINK", 0, 1);
        public static final Badge AFTERPAY = new Badge("AFTERPAY", 1, 3);

        private static final /* synthetic */ Badge[] $values() {
            return new Badge[]{LINK, AFTERPAY};
        }

        static {
            Badge[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Badge.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$Badge$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PayWithCashAuthorizationBlocker.Badge fromValue(int value) {
                    return PayWithCashAuthorizationBlocker.Badge.INSTANCE.fromValue(value);
                }
            };
        }

        private Badge(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Badge fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Badge valueOf(String str) {
            return (Badge) Enum.valueOf(Badge.class, str);
        }

        public static Badge[] values() {
            return (Badge[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Badge$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Badge;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Badge fromValue(int value) {
                if (value == 1) {
                    return Badge.LINK;
                }
                if (value != 3) {
                    return null;
                }
                return Badge.AFTERPAY;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0006H\u0016JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent$Builder;", "image_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$RemoteImageElement;", "title", "", "body", "dismissButtonText", "footer_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/FormBlocker$Element$RemoteImageElement;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class EducationalContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EducationalContent> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String dismissButtonText;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String footer_text;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$RemoteImageElement#ADAPTER", schemaIndex = 0, tag = 1)
        public final FormBlocker.Element.RemoteImageElement image_element;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String title;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;", "<init>", "()V", "image_element", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$RemoteImageElement;", "title", "", "body", "dismissButtonText", "footer_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String body;
            public String dismissButtonText;
            public String footer_text;
            public FormBlocker.Element.RemoteImageElement image_element;
            public String title;

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public EducationalContent build() {
                return new EducationalContent(this.image_element, this.title, this.body, this.dismissButtonText, this.footer_text, buildUnknownFields());
            }

            public final Builder dismissButtonText(String dismissButtonText) {
                this.dismissButtonText = dismissButtonText;
                return this;
            }

            public final Builder footer_text(String footer_text) {
                this.footer_text = footer_text;
                return this;
            }

            public final Builder image_element(FormBlocker.Element.RemoteImageElement image_element) {
                this.image_element = image_element;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EducationalContent.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$EducationalContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.EducationalContent decode(ProtoReader reader) {
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
                            return new PayWithCashAuthorizationBlocker.EducationalContent((FormBlocker.Element.RemoteImageElement) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.RemoteImageElement.ADAPTER, reader, obj);
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
                public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.EducationalContent value) {
                    writer.getClass();
                    value.getClass();
                    FormBlocker.Element.RemoteImageElement.ADAPTER.encodeWithTag(writer, 1, value.image_element);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    protoAdapter2.encodeWithTag(writer, 3, value.body);
                    protoAdapter2.encodeWithTag(writer, 4, value.dismissButtonText);
                    protoAdapter2.encodeWithTag(writer, 5, value.footer_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PayWithCashAuthorizationBlocker.EducationalContent value) {
                    value.getClass();
                    int encodedSizeWithTag = FormBlocker.Element.RemoteImageElement.ADAPTER.encodedSizeWithTag(1, value.image_element) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(5, value.footer_text) + protoAdapter2.encodedSizeWithTag(4, value.dismissButtonText) + protoAdapter2.encodedSizeWithTag(3, value.body) + protoAdapter2.encodedSizeWithTag(2, value.title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.EducationalContent redact(PayWithCashAuthorizationBlocker.EducationalContent value) {
                    value.getClass();
                    FormBlocker.Element.RemoteImageElement remoteImageElement = value.image_element;
                    return PayWithCashAuthorizationBlocker.EducationalContent.copy$default(value, remoteImageElement != null ? (FormBlocker.Element.RemoteImageElement) FormBlocker.Element.RemoteImageElement.ADAPTER.redact(remoteImageElement) : null, null, null, null, null, ByteString.EMPTY, 30, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.EducationalContent value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.footer_text);
                    protoAdapter2.encodeWithTag(writer, 4, value.dismissButtonText);
                    protoAdapter2.encodeWithTag(writer, 3, value.body);
                    protoAdapter2.encodeWithTag(writer, 2, value.title);
                    FormBlocker.Element.RemoteImageElement.ADAPTER.encodeWithTag(writer, 1, value.image_element);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ EducationalContent(FormBlocker.Element.RemoteImageElement remoteImageElement, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : remoteImageElement, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ EducationalContent copy$default(EducationalContent educationalContent, FormBlocker.Element.RemoteImageElement remoteImageElement, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                remoteImageElement = educationalContent.image_element;
            }
            if ((i & 2) != 0) {
                str = educationalContent.title;
            }
            if ((i & 4) != 0) {
                str2 = educationalContent.body;
            }
            if ((i & 8) != 0) {
                str3 = educationalContent.dismissButtonText;
            }
            if ((i & 16) != 0) {
                str4 = educationalContent.footer_text;
            }
            if ((i & 32) != 0) {
                byteString = educationalContent.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            return educationalContent.copy(remoteImageElement, str, str2, str3, str5, byteString2);
        }

        public final EducationalContent copy(FormBlocker.Element.RemoteImageElement image_element, String title, String body, String dismissButtonText, String footer_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new EducationalContent(image_element, title, body, dismissButtonText, footer_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof EducationalContent)) {
                return false;
            }
            EducationalContent educationalContent = (EducationalContent) other;
            return Intrinsics.areEqual(unknownFields(), educationalContent.unknownFields()) && Intrinsics.areEqual(this.image_element, educationalContent.image_element) && Intrinsics.areEqual(this.title, educationalContent.title) && Intrinsics.areEqual(this.body, educationalContent.body) && Intrinsics.areEqual(this.dismissButtonText, educationalContent.dismissButtonText) && Intrinsics.areEqual(this.footer_text, educationalContent.footer_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            FormBlocker.Element.RemoteImageElement remoteImageElement = this.image_element;
            int hashCode2 = (hashCode + (remoteImageElement != null ? remoteImageElement.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.dismissButtonText;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.footer_text;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image_element = this.image_element;
            builder.title = this.title;
            builder.body = this.body;
            builder.dismissButtonText = this.dismissButtonText;
            builder.footer_text = this.footer_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            FormBlocker.Element.RemoteImageElement remoteImageElement = this.image_element;
            if (remoteImageElement != null) {
                arrayList.add("image_element=" + remoteImageElement);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            String str3 = this.dismissButtonText;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dismissButtonText=", arrayList);
            }
            String str4 = this.footer_text;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "footer_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EducationalContent{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ EducationalContent build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public EducationalContent() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EducationalContent(FormBlocker.Element.RemoteImageElement remoteImageElement, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image_element = remoteImageElement;
            this.title = str;
            this.body = str2;
            this.dismissButtonText = str3;
            this.footer_text = str4;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement$Builder;", "title", "", "body", com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer.f1485type, "educationalContent", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class InTransactionTopUpElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InTransactionTopUpElement> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$EducationalContent#ADAPTER", schemaIndex = 3, tag = 14)
        public final EducationalContent educationalContent;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String footer;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "<init>", "()V", "title", "", "body", com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer.f1485type, "educationalContent", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$EducationalContent;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String body;
            public EducationalContent educationalContent;
            public String footer;
            public String title;

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public InTransactionTopUpElement build() {
                return new InTransactionTopUpElement(this.title, this.body, this.footer, this.educationalContent, buildUnknownFields());
            }

            public final Builder educationalContent(EducationalContent educationalContent) {
                this.educationalContent = educationalContent;
                return this;
            }

            public final Builder footer(String footer) {
                this.footer = footer;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InTransactionTopUpElement.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$InTransactionTopUpElement$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.InTransactionTopUpElement decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new PayWithCashAuthorizationBlocker.InTransactionTopUpElement((String) obj, (String) obj2, (String) obj3, (PayWithCashAuthorizationBlocker.EducationalContent) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 14) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = TransactorKt.decodeMessageOrMerge(PayWithCashAuthorizationBlocker.EducationalContent.ADAPTER, reader, obj4);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PayWithCashAuthorizationBlocker.InTransactionTopUpElement value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 3, value.footer);
                    PayWithCashAuthorizationBlocker.EducationalContent.ADAPTER.encodeWithTag(writer, 14, value.educationalContent);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PayWithCashAuthorizationBlocker.InTransactionTopUpElement value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return PayWithCashAuthorizationBlocker.EducationalContent.ADAPTER.encodedSizeWithTag(14, value.educationalContent) + protoAdapter2.encodedSizeWithTag(3, value.footer) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PayWithCashAuthorizationBlocker.InTransactionTopUpElement redact(PayWithCashAuthorizationBlocker.InTransactionTopUpElement value) {
                    value.getClass();
                    PayWithCashAuthorizationBlocker.EducationalContent educationalContent = value.educationalContent;
                    return PayWithCashAuthorizationBlocker.InTransactionTopUpElement.copy$default(value, null, null, null, educationalContent != null ? (PayWithCashAuthorizationBlocker.EducationalContent) PayWithCashAuthorizationBlocker.EducationalContent.ADAPTER.redact(educationalContent) : null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PayWithCashAuthorizationBlocker.InTransactionTopUpElement value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    PayWithCashAuthorizationBlocker.EducationalContent.ADAPTER.encodeWithTag(writer, 14, value.educationalContent);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.footer);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ InTransactionTopUpElement(String str, String str2, String str3, EducationalContent educationalContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : educationalContent, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ InTransactionTopUpElement copy$default(InTransactionTopUpElement inTransactionTopUpElement, String str, String str2, String str3, EducationalContent educationalContent, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inTransactionTopUpElement.title;
            }
            if ((i & 2) != 0) {
                str2 = inTransactionTopUpElement.body;
            }
            if ((i & 4) != 0) {
                str3 = inTransactionTopUpElement.footer;
            }
            if ((i & 8) != 0) {
                educationalContent = inTransactionTopUpElement.educationalContent;
            }
            if ((i & 16) != 0) {
                byteString = inTransactionTopUpElement.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str3;
            return inTransactionTopUpElement.copy(str, str2, str4, educationalContent, byteString2);
        }

        public final InTransactionTopUpElement copy(String title, String body, String footer, EducationalContent educationalContent, ByteString unknownFields) {
            unknownFields.getClass();
            return new InTransactionTopUpElement(title, body, footer, educationalContent, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InTransactionTopUpElement)) {
                return false;
            }
            InTransactionTopUpElement inTransactionTopUpElement = (InTransactionTopUpElement) other;
            return Intrinsics.areEqual(unknownFields(), inTransactionTopUpElement.unknownFields()) && Intrinsics.areEqual(this.title, inTransactionTopUpElement.title) && Intrinsics.areEqual(this.body, inTransactionTopUpElement.body) && Intrinsics.areEqual(this.footer, inTransactionTopUpElement.footer) && Intrinsics.areEqual(this.educationalContent, inTransactionTopUpElement.educationalContent);
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
            String str3 = this.footer;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            EducationalContent educationalContent = this.educationalContent;
            int hashCode5 = hashCode4 + (educationalContent != null ? educationalContent.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body = this.body;
            builder.footer = this.footer;
            builder.educationalContent = this.educationalContent;
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
            String str3 = this.footer;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "footer=", arrayList);
            }
            EducationalContent educationalContent = this.educationalContent;
            if (educationalContent != null) {
                arrayList.add("educationalContent=" + educationalContent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InTransactionTopUpElement{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$InTransactionTopUpElement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ InTransactionTopUpElement build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public InTransactionTopUpElement() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InTransactionTopUpElement(String str, String str2, String str3, EducationalContent educationalContent, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.footer = str3;
            this.educationalContent = educationalContent;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUCCESS", "PENDING", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class StatusIcon implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusIcon[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final StatusIcon SUCCESS = new StatusIcon("SUCCESS", 0, 1);
        public static final StatusIcon PENDING = new StatusIcon("PENDING", 1, 2);

        private static final /* synthetic */ StatusIcon[] $values() {
            return new StatusIcon[]{SUCCESS, PENDING};
        }

        static {
            StatusIcon[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StatusIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker$StatusIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PayWithCashAuthorizationBlocker.StatusIcon fromValue(int value) {
                    return PayWithCashAuthorizationBlocker.StatusIcon.INSTANCE.fromValue(value);
                }
            };
        }

        private StatusIcon(String str, int i, int i2) {
            this.value = i2;
        }

        public static final StatusIcon fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static StatusIcon valueOf(String str) {
            return (StatusIcon) Enum.valueOf(StatusIcon.class, str);
        }

        public static StatusIcon[] values() {
            return (StatusIcon[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$StatusIcon;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final StatusIcon fromValue(int value) {
                if (value == 1) {
                    return StatusIcon.SUCCESS;
                }
                if (value != 2) {
                    return null;
                }
                return StatusIcon.PENDING;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PayWithCashAuthorizationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PayWithCashAuthorizationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
