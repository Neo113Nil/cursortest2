package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker;
import com.squareup.protos.franklin.ui.Avatar;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006/.0123R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0005R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0005R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0005R\u0016\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0005R\u0016\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0005R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010+¨\u00064"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "Lcom/squareup/protos/common/Money;", "sender_amount", "Lcom/squareup/protos/common/Money;", "sender_amount_label", "recipient_amount", "recipient_amount_label", "recipient_name", "", "can_edit_recipient", "Ljava/lang/Boolean;", "delivery_method_type", "delivery_notice", "can_edit_delivery", "terms_text", "primary_button_label", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "change_alert", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "Lcom/squareup/protos/franklin/ui/Avatar;", "recipient_avatar", "Lcom/squareup/protos/franklin/ui/Avatar;", "can_edit_amount", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "accept_sheet", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "pickup_location_notice", "accepted_id_notice", "accepted_id_notice_url", "formatted_sender_amount", "formatted_recipient_amount", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "payment_schedule", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "line_items", "Ljava/util/List;", "recipient_info", "delivery_method_info", "Companion", "Builder", "LineItemRow", "ChangeAlert", "DrawerActions", "PaymentSchedule", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiCurrencyPaymentReviewBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiCurrencyPaymentReviewBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$DrawerActions#ADAPTER", schemaIndex = 19, tag = 18)
    public final DrawerActions accept_sheet;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 21, tag = 20)
    public final String accepted_id_notice;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 22, tag = 21)
    public final String accepted_id_notice_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 18, tag = 17)
    public final Boolean can_edit_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 13, tag = 26)
    public final Boolean can_edit_delivery;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 25)
    public final Boolean can_edit_recipient;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$ChangeAlert#ADAPTER", schemaIndex = 16, tag = 15)
    public final ChangeAlert change_alert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 11, tag = 11)
    public final List<String> delivery_method_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 10)
    public final String delivery_method_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 12, tag = 12)
    public final String delivery_notice;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 24, tag = 23)
    public final String formatted_recipient_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 23, tag = 22)
    public final String formatted_sender_amount;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<LineItemRow> line_items;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$PaymentSchedule#ADAPTER", schemaIndex = 25, tag = 24)
    public final PaymentSchedule payment_schedule;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 20, tag = 19)
    public final String pickup_location_notice;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 14)
    public final String primary_button_label;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
    public final Money recipient_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String recipient_amount_label;

    @WireField(adapter = "com.squareup.protos.franklin.ui.Avatar#ADAPTER", schemaIndex = 17, tag = 16)
    public final Avatar recipient_avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, redacted = true, schemaIndex = 8, tag = 9)
    public final List<String> recipient_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 7, tag = 8)
    public final String recipient_name;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
    public final Money sender_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String sender_amount_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 13)
    public final String terms_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0016\u001a\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010)J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0006J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0006J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0006J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0006J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0006J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010(J\b\u0010*\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker;", "<init>", "()V", "title", "", "subtitle", "sender_amount", "Lcom/squareup/protos/common/Money;", "sender_amount_label", "recipient_amount", "recipient_amount_label", "line_items", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "recipient_name", "recipient_info", "can_edit_recipient", "", "Ljava/lang/Boolean;", "delivery_method_type", "delivery_method_info", "delivery_notice", "can_edit_delivery", "terms_text", "primary_button_label", "change_alert", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "recipient_avatar", "Lcom/squareup/protos/franklin/ui/Avatar;", "can_edit_amount", "accept_sheet", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "pickup_location_notice", "accepted_id_notice", "accepted_id_notice_url", "formatted_sender_amount", "formatted_recipient_amount", "payment_schedule", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public DrawerActions accept_sheet;
        public String accepted_id_notice;
        public String accepted_id_notice_url;
        public Boolean can_edit_amount;
        public Boolean can_edit_delivery;
        public Boolean can_edit_recipient;
        public ChangeAlert change_alert;
        public List<String> delivery_method_info;
        public String delivery_method_type;
        public String delivery_notice;
        public String formatted_recipient_amount;
        public String formatted_sender_amount;
        public List<LineItemRow> line_items;
        public PaymentSchedule payment_schedule;
        public String pickup_location_notice;
        public String primary_button_label;
        public Money recipient_amount;
        public String recipient_amount_label;
        public Avatar recipient_avatar;
        public List<String> recipient_info;
        public String recipient_name;
        public Money sender_amount;
        public String sender_amount_label;
        public String subtitle;
        public String terms_text;
        public String title;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.line_items = emptyList;
            this.recipient_info = emptyList;
            this.delivery_method_info = emptyList;
        }

        public final Builder accept_sheet(DrawerActions accept_sheet) {
            this.accept_sheet = accept_sheet;
            return this;
        }

        public final Builder accepted_id_notice(String accepted_id_notice) {
            this.accepted_id_notice = accepted_id_notice;
            return this;
        }

        public final Builder accepted_id_notice_url(String accepted_id_notice_url) {
            this.accepted_id_notice_url = accepted_id_notice_url;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public MultiCurrencyPaymentReviewBlocker build() {
            return new MultiCurrencyPaymentReviewBlocker(this.title, this.subtitle, this.sender_amount, this.sender_amount_label, this.recipient_amount, this.recipient_amount_label, this.line_items, this.recipient_name, this.recipient_info, this.can_edit_recipient, this.delivery_method_type, this.delivery_method_info, this.delivery_notice, this.can_edit_delivery, this.terms_text, this.primary_button_label, this.change_alert, this.recipient_avatar, this.can_edit_amount, this.accept_sheet, this.pickup_location_notice, this.accepted_id_notice, this.accepted_id_notice_url, this.formatted_sender_amount, this.formatted_recipient_amount, this.payment_schedule, buildUnknownFields());
        }

        public final Builder can_edit_amount(Boolean can_edit_amount) {
            this.can_edit_amount = can_edit_amount;
            return this;
        }

        public final Builder can_edit_delivery(Boolean can_edit_delivery) {
            this.can_edit_delivery = can_edit_delivery;
            return this;
        }

        public final Builder can_edit_recipient(Boolean can_edit_recipient) {
            this.can_edit_recipient = can_edit_recipient;
            return this;
        }

        public final Builder change_alert(ChangeAlert change_alert) {
            this.change_alert = change_alert;
            return this;
        }

        public final Builder delivery_method_info(List<String> delivery_method_info) {
            delivery_method_info.getClass();
            TransactorKt.checkElementsNotNull(delivery_method_info);
            this.delivery_method_info = delivery_method_info;
            return this;
        }

        public final Builder delivery_method_type(String delivery_method_type) {
            this.delivery_method_type = delivery_method_type;
            return this;
        }

        public final Builder delivery_notice(String delivery_notice) {
            this.delivery_notice = delivery_notice;
            return this;
        }

        public final Builder formatted_recipient_amount(String formatted_recipient_amount) {
            this.formatted_recipient_amount = formatted_recipient_amount;
            return this;
        }

        public final Builder formatted_sender_amount(String formatted_sender_amount) {
            this.formatted_sender_amount = formatted_sender_amount;
            return this;
        }

        public final Builder line_items(List<LineItemRow> line_items) {
            line_items.getClass();
            TransactorKt.checkElementsNotNull(line_items);
            this.line_items = line_items;
            return this;
        }

        public final Builder payment_schedule(PaymentSchedule payment_schedule) {
            this.payment_schedule = payment_schedule;
            return this;
        }

        public final Builder pickup_location_notice(String pickup_location_notice) {
            this.pickup_location_notice = pickup_location_notice;
            return this;
        }

        public final Builder primary_button_label(String primary_button_label) {
            this.primary_button_label = primary_button_label;
            return this;
        }

        public final Builder recipient_amount(Money recipient_amount) {
            this.recipient_amount = recipient_amount;
            return this;
        }

        public final Builder recipient_amount_label(String recipient_amount_label) {
            this.recipient_amount_label = recipient_amount_label;
            return this;
        }

        public final Builder recipient_avatar(Avatar recipient_avatar) {
            this.recipient_avatar = recipient_avatar;
            return this;
        }

        public final Builder recipient_info(List<String> recipient_info) {
            recipient_info.getClass();
            TransactorKt.checkElementsNotNull(recipient_info);
            this.recipient_info = recipient_info;
            return this;
        }

        public final Builder recipient_name(String recipient_name) {
            this.recipient_name = recipient_name;
            return this;
        }

        public final Builder sender_amount(Money sender_amount) {
            this.sender_amount = sender_amount;
            return this;
        }

        public final Builder sender_amount_label(String sender_amount_label) {
            this.sender_amount_label = sender_amount_label;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder terms_text(String terms_text) {
            this.terms_text = terms_text;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001e\u001f !\"Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0016Ju\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u001dR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Builder;", AnnotatedPrivateKey.LABEL, "", "detail", "bold", "", "detail_accessibility_value", "sub_items", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;", "info_dialog", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;", "detail_markdown", "treatment", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;Ljava/lang/String;Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;Ljava/lang/String;Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "Builder", "Companion", "SubItems", "InfoDialog", "Treatment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class LineItemRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItemRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
        public final Boolean bold;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String detail;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String detail_accessibility_value;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
        public final String detail_markdown;

        @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog#ADAPTER", schemaIndex = 5, tag = 6)
        public final InfoDialog info_dialog;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems#ADAPTER", schemaIndex = 4, tag = 5)
        public final SubItems sub_items;

        @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment#ADAPTER", schemaIndex = 7, tag = 8)
        public final Treatment treatment;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0013J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "detail", "bold", "", "Ljava/lang/Boolean;", "detail_accessibility_value", "sub_items", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;", "info_dialog", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;", "detail_markdown", "treatment", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Boolean bold;
            public String detail;
            public String detail_accessibility_value;
            public String detail_markdown;
            public InfoDialog info_dialog;
            public String label;
            public SubItems sub_items;
            public Treatment treatment;

            public final Builder bold(Boolean bold) {
                this.bold = bold;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public LineItemRow build() {
                return new LineItemRow(this.label, this.detail, this.bold, this.detail_accessibility_value, this.sub_items, this.info_dialog, this.detail_markdown, this.treatment, buildUnknownFields());
            }

            public final Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            public final Builder detail_accessibility_value(String detail_accessibility_value) {
                this.detail_accessibility_value = detail_accessibility_value;
                return this;
            }

            public final Builder detail_markdown(String detail_markdown) {
                this.detail_markdown = detail_markdown;
                return this;
            }

            public final Builder info_dialog(InfoDialog info_dialog) {
                this.info_dialog = info_dialog;
                return this;
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder sub_items(SubItems sub_items) {
                this.sub_items = sub_items;
                return this;
            }

            public final Builder treatment(Treatment treatment) {
                this.treatment = treatment;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LineItemRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.LineItemRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    Object obj8 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MultiCurrencyPaymentReviewBlocker.LineItemRow((String) obj, (String) obj2, (Boolean) obj3, (String) obj4, (MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems) obj5, (MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog) obj6, (String) obj7, (MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = ProtoAdapter.BOOL.decode(reader);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = TransactorKt.decodeMessageOrMerge(MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog.ADAPTER, reader, obj6);
                                break;
                            case 7:
                                obj7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                try {
                                    obj8 = MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker.LineItemRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.bold);
                    protoAdapter2.encodeWithTag(writer, 4, value.detail_accessibility_value);
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems.ADAPTER.encodeWithTag(writer, 5, value.sub_items);
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog.ADAPTER.encodeWithTag(writer, 6, value.info_dialog);
                    protoAdapter2.encodeWithTag(writer, 7, value.detail_markdown);
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment.ADAPTER.encodeWithTag(writer, 8, value.treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyPaymentReviewBlocker.LineItemRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment.ADAPTER.encodedSizeWithTag(8, value.treatment) + protoAdapter2.encodedSizeWithTag(7, value.detail_markdown) + MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog.ADAPTER.encodedSizeWithTag(6, value.info_dialog) + MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems.ADAPTER.encodedSizeWithTag(5, value.sub_items) + protoAdapter2.encodedSizeWithTag(4, value.detail_accessibility_value) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.bold) + protoAdapter2.encodedSizeWithTag(2, value.detail) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.LineItemRow redact(MultiCurrencyPaymentReviewBlocker.LineItemRow value) {
                    value.getClass();
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems subItems = value.sub_items;
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems subItems2 = subItems != null ? (MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems) MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems.ADAPTER.redact(subItems) : null;
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog infoDialog = value.info_dialog;
                    return MultiCurrencyPaymentReviewBlocker.LineItemRow.copy$default(value, null, null, null, null, subItems2, infoDialog != null ? (MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog) MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog.ADAPTER.redact(infoDialog) : null, null, null, ByteString.EMPTY, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker.LineItemRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment.ADAPTER.encodeWithTag(writer, 8, value.treatment);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 7, value.detail_markdown);
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog.ADAPTER.encodeWithTag(writer, 6, value.info_dialog);
                    MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems.ADAPTER.encodeWithTag(writer, 5, value.sub_items);
                    protoAdapter2.encodeWithTag(writer, 4, value.detail_accessibility_value);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.bold);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LineItemRow(String str, String str2, Boolean bool, String str3, SubItems subItems, InfoDialog infoDialog, String str4, Treatment treatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : subItems, (i & 32) != 0 ? null : infoDialog, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : treatment, (i & 256) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LineItemRow copy$default(LineItemRow lineItemRow, String str, String str2, Boolean bool, String str3, SubItems subItems, InfoDialog infoDialog, String str4, Treatment treatment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lineItemRow.label;
            }
            if ((i & 2) != 0) {
                str2 = lineItemRow.detail;
            }
            if ((i & 4) != 0) {
                bool = lineItemRow.bold;
            }
            if ((i & 8) != 0) {
                str3 = lineItemRow.detail_accessibility_value;
            }
            if ((i & 16) != 0) {
                subItems = lineItemRow.sub_items;
            }
            if ((i & 32) != 0) {
                infoDialog = lineItemRow.info_dialog;
            }
            if ((i & 64) != 0) {
                str4 = lineItemRow.detail_markdown;
            }
            if ((i & 128) != 0) {
                treatment = lineItemRow.treatment;
            }
            if ((i & 256) != 0) {
                byteString = lineItemRow.unknownFields();
            }
            Treatment treatment2 = treatment;
            ByteString byteString2 = byteString;
            InfoDialog infoDialog2 = infoDialog;
            String str5 = str4;
            SubItems subItems2 = subItems;
            Boolean bool2 = bool;
            return lineItemRow.copy(str, str2, bool2, str3, subItems2, infoDialog2, str5, treatment2, byteString2);
        }

        public final LineItemRow copy(String label, String detail, Boolean bold, String detail_accessibility_value, SubItems sub_items, InfoDialog info_dialog, String detail_markdown, Treatment treatment, ByteString unknownFields) {
            unknownFields.getClass();
            return new LineItemRow(label, detail, bold, detail_accessibility_value, sub_items, info_dialog, detail_markdown, treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LineItemRow)) {
                return false;
            }
            LineItemRow lineItemRow = (LineItemRow) other;
            return Intrinsics.areEqual(unknownFields(), lineItemRow.unknownFields()) && Intrinsics.areEqual(this.label, lineItemRow.label) && Intrinsics.areEqual(this.detail, lineItemRow.detail) && Intrinsics.areEqual(this.bold, lineItemRow.bold) && Intrinsics.areEqual(this.detail_accessibility_value, lineItemRow.detail_accessibility_value) && Intrinsics.areEqual(this.sub_items, lineItemRow.sub_items) && Intrinsics.areEqual(this.info_dialog, lineItemRow.info_dialog) && Intrinsics.areEqual(this.detail_markdown, lineItemRow.detail_markdown) && this.treatment == lineItemRow.treatment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.bold;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str3 = this.detail_accessibility_value;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            SubItems subItems = this.sub_items;
            int hashCode6 = (hashCode5 + (subItems != null ? subItems.hashCode() : 0)) * 37;
            InfoDialog infoDialog = this.info_dialog;
            int hashCode7 = (hashCode6 + (infoDialog != null ? infoDialog.hashCode() : 0)) * 37;
            String str4 = this.detail_markdown;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Treatment treatment = this.treatment;
            int hashCode9 = hashCode8 + (treatment != null ? treatment.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.detail = this.detail;
            builder.bold = this.bold;
            builder.detail_accessibility_value = this.detail_accessibility_value;
            builder.sub_items = this.sub_items;
            builder.info_dialog = this.info_dialog;
            builder.detail_markdown = this.detail_markdown;
            builder.treatment = this.treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.detail;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail=", arrayList);
            }
            Boolean bool = this.bold;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("bold=", bool, arrayList);
            }
            String str3 = this.detail_accessibility_value;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "detail_accessibility_value=", arrayList);
            }
            SubItems subItems = this.sub_items;
            if (subItems != null) {
                arrayList.add("sub_items=" + subItems);
            }
            InfoDialog infoDialog = this.info_dialog;
            if (infoDialog != null) {
                arrayList.add("info_dialog=" + infoDialog);
            }
            String str4 = this.detail_markdown;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "detail_markdown=", arrayList);
            }
            Treatment treatment = this.treatment;
            if (treatment != null) {
                arrayList.add("treatment=" + treatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItemRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog$Builder;", "title", "", "message", "primary_button_title", "accessibility_hint", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class InfoDialog extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<InfoDialog> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String accessibility_hint;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String message;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String primary_button_title;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String title;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;", "<init>", "()V", "title", "", "message", "primary_button_title", "accessibility_hint", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String accessibility_hint;
                public String message;
                public String primary_button_title;
                public String title;

                public final Builder accessibility_hint(String accessibility_hint) {
                    this.accessibility_hint = accessibility_hint;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public InfoDialog build() {
                    return new InfoDialog(this.title, this.message, this.primary_button_title, this.accessibility_hint, buildUnknownFields());
                }

                public final Builder message(String message) {
                    this.message = message;
                    return this;
                }

                public final Builder primary_button_title(String primary_button_title) {
                    this.primary_button_title = primary_button_title;
                    return this;
                }

                public final Builder title(String title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InfoDialog.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
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
                    public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                        protoAdapter2.encodeWithTag(writer, 2, value.message);
                        protoAdapter2.encodeWithTag(writer, 3, value.primary_button_title);
                        protoAdapter2.encodeWithTag(writer, 4, value.accessibility_hint);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(4, value.accessibility_hint) + protoAdapter2.encodedSizeWithTag(3, value.primary_button_title) + protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog redact(MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog value) {
                        value.getClass();
                        return MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker.LineItemRow.InfoDialog value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 4, value.accessibility_hint);
                        protoAdapter2.encodeWithTag(writer, 3, value.primary_button_title);
                        protoAdapter2.encodeWithTag(writer, 2, value.message);
                        protoAdapter2.encodeWithTag(writer, 1, value.title);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ InfoDialog(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ InfoDialog copy$default(InfoDialog infoDialog, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = infoDialog.title;
                }
                if ((i & 2) != 0) {
                    str2 = infoDialog.message;
                }
                if ((i & 4) != 0) {
                    str3 = infoDialog.primary_button_title;
                }
                if ((i & 8) != 0) {
                    str4 = infoDialog.accessibility_hint;
                }
                if ((i & 16) != 0) {
                    byteString = infoDialog.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str5 = str3;
                return infoDialog.copy(str, str2, str5, str4, byteString2);
            }

            public final InfoDialog copy(String title, String message, String primary_button_title, String accessibility_hint, ByteString unknownFields) {
                unknownFields.getClass();
                return new InfoDialog(title, message, primary_button_title, accessibility_hint, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof InfoDialog)) {
                    return false;
                }
                InfoDialog infoDialog = (InfoDialog) other;
                return Intrinsics.areEqual(unknownFields(), infoDialog.unknownFields()) && Intrinsics.areEqual(this.title, infoDialog.title) && Intrinsics.areEqual(this.message, infoDialog.message) && Intrinsics.areEqual(this.primary_button_title, infoDialog.primary_button_title) && Intrinsics.areEqual(this.accessibility_hint, infoDialog.accessibility_hint);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.title;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.message;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.primary_button_title;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                String str4 = this.accessibility_hint;
                int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.title = this.title;
                builder.message = this.message;
                builder.primary_button_title = this.primary_button_title;
                builder.accessibility_hint = this.accessibility_hint;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.title;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                }
                String str2 = this.message;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message=", arrayList);
                }
                String str3 = this.primary_button_title;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_button_title=", arrayList);
                }
                String str4 = this.accessibility_hint;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "accessibility_hint=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "InfoDialog{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$InfoDialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ InfoDialog build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public InfoDialog() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoDialog(String str, String str2, String str3, String str4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.title = str;
                this.message = str2;
                this.primary_button_title = str3;
                this.accessibility_hint = str4;
            }
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0007H\u0016J8\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems$Builder;", "items", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "expand_accessibility_hint", "", "collapse_accessibility_hint", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SubItems extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SubItems> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String collapse_accessibility_hint;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String expand_accessibility_hint;

            @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
            public final List<LineItemRow> items;

            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;", "<init>", "()V", "items", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "expand_accessibility_hint", "", "collapse_accessibility_hint", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String collapse_accessibility_hint;
                public String expand_accessibility_hint;
                public List<LineItemRow> items = EmptyList.INSTANCE;

                @Override // com.squareup.wire.Message.Builder
                public SubItems build() {
                    return new SubItems(this.items, this.expand_accessibility_hint, this.collapse_accessibility_hint, buildUnknownFields());
                }

                public final Builder collapse_accessibility_hint(String collapse_accessibility_hint) {
                    this.collapse_accessibility_hint = collapse_accessibility_hint;
                    return this;
                }

                public final Builder expand_accessibility_hint(String expand_accessibility_hint) {
                    this.expand_accessibility_hint = expand_accessibility_hint;
                    return this;
                }

                public final Builder items(List<LineItemRow> items) {
                    items.getClass();
                    TransactorKt.checkElementsNotNull(items);
                    this.items = items;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubItems.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems(m, (String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                m.add(MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.decode(reader));
                            } else if (nextTag == 2) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems value) {
                        writer.getClass();
                        value.getClass();
                        MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.expand_accessibility_hint);
                        protoAdapter2.encodeWithTag(writer, 3, value.collapse_accessibility_hint);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems value) {
                        value.getClass();
                        int encodedSizeWithTag = MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.items) + value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return protoAdapter2.encodedSizeWithTag(3, value.collapse_accessibility_hint) + protoAdapter2.encodedSizeWithTag(2, value.expand_accessibility_hint) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems redact(MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems value) {
                        value.getClass();
                        return MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems.copy$default(value, TransactorKt.m1169redactElements(value.items, MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER), null, null, ByteString.EMPTY, 6, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker.LineItemRow.SubItems value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 3, value.collapse_accessibility_hint);
                        protoAdapter2.encodeWithTag(writer, 2, value.expand_accessibility_hint);
                        MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public SubItems(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SubItems copy$default(SubItems subItems, List list, String str, String str2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = subItems.items;
                }
                if ((i & 2) != 0) {
                    str = subItems.expand_accessibility_hint;
                }
                if ((i & 4) != 0) {
                    str2 = subItems.collapse_accessibility_hint;
                }
                if ((i & 8) != 0) {
                    byteString = subItems.unknownFields();
                }
                return subItems.copy(list, str, str2, byteString);
            }

            public final SubItems copy(List<LineItemRow> items, String expand_accessibility_hint, String collapse_accessibility_hint, ByteString unknownFields) {
                items.getClass();
                unknownFields.getClass();
                return new SubItems(items, expand_accessibility_hint, collapse_accessibility_hint, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof SubItems)) {
                    return false;
                }
                SubItems subItems = (SubItems) other;
                return Intrinsics.areEqual(unknownFields(), subItems.unknownFields()) && Intrinsics.areEqual(this.items, subItems.items) && Intrinsics.areEqual(this.expand_accessibility_hint, subItems.expand_accessibility_hint) && Intrinsics.areEqual(this.collapse_accessibility_hint, subItems.collapse_accessibility_hint);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
                String str = this.expand_accessibility_hint;
                int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.collapse_accessibility_hint;
                int hashCode2 = hashCode + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.items = this.items;
                builder.expand_accessibility_hint = this.expand_accessibility_hint;
                builder.collapse_accessibility_hint = this.collapse_accessibility_hint;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (!this.items.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
                }
                String str = this.expand_accessibility_hint;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "expand_accessibility_hint=", arrayList);
                }
                String str2 = this.collapse_accessibility_hint;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "collapse_accessibility_hint=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SubItems{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$SubItems;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ SubItems build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public SubItems() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubItems(List<LineItemRow> list, String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.expand_accessibility_hint = str;
                this.collapse_accessibility_hint = str2;
                this.items = TransactorKt.immutableCopyOf("items", list);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNRECOGNIZED_VALUE_DO_NOT_USE", "NONE", "LINE_END_ICON_CHECK", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Treatment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Treatment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Treatment LINE_END_ICON_CHECK;
            public static final Treatment NONE;
            public static final Treatment UNRECOGNIZED_VALUE_DO_NOT_USE;
            private final int value;

            private static final /* synthetic */ Treatment[] $values() {
                return new Treatment[]{UNRECOGNIZED_VALUE_DO_NOT_USE, NONE, LINE_END_ICON_CHECK};
            }

            static {
                final Treatment treatment = new Treatment("UNRECOGNIZED_VALUE_DO_NOT_USE", 0, 0);
                UNRECOGNIZED_VALUE_DO_NOT_USE = treatment;
                NONE = new Treatment("NONE", 1, 1);
                LINE_END_ICON_CHECK = new Treatment("LINE_END_ICON_CHECK", 2, 2);
                Treatment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Treatment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, treatment) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment fromValue(int value) {
                        return MultiCurrencyPaymentReviewBlocker.LineItemRow.Treatment.INSTANCE.fromValue(value);
                    }
                };
            }

            private Treatment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final Treatment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static Treatment valueOf(String str) {
                return (Treatment) Enum.valueOf(Treatment.class, str);
            }

            public static Treatment[] values() {
                return (Treatment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Treatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Treatment fromValue(int value) {
                    if (value == 0) {
                        return Treatment.UNRECOGNIZED_VALUE_DO_NOT_USE;
                    }
                    if (value == 1) {
                        return Treatment.NONE;
                    }
                    if (value != 2) {
                        return null;
                    }
                    return Treatment.LINE_END_ICON_CHECK;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$LineItemRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LineItemRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LineItemRow() {
            this(null, null, null, null, null, null, null, null, null, 511, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItemRow(String str, String str2, Boolean bool, String str3, SubItems subItems, InfoDialog infoDialog, String str4, Treatment treatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.detail = str2;
            this.bold = bool;
            this.detail_accessibility_value = str3;
            this.sub_items = subItems;
            this.info_dialog = infoDialog;
            this.detail_markdown = str4;
            this.treatment = treatment;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MultiCurrencyPaymentReviewBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0043. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public MultiCurrencyPaymentReviewBlocker decode(ProtoReader reader) {
                Object obj;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
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
                Object obj14 = null;
                Object obj15 = null;
                Object obj16 = null;
                Object obj17 = null;
                Object obj18 = null;
                Object obj19 = null;
                Object obj20 = null;
                Object obj21 = null;
                Object obj22 = null;
                Object obj23 = null;
                Object obj24 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    Object obj25 = obj9;
                    if (nextTag == -1) {
                        return new MultiCurrencyPaymentReviewBlocker((String) obj3, (String) obj15, (Money) obj5, (String) obj17, (Money) obj7, (String) obj23, m, (String) obj24, arrayList, (Boolean) obj25, (String) obj10, arrayList2, (String) obj11, (Boolean) obj12, (String) obj13, (String) obj14, (MultiCurrencyPaymentReviewBlocker.ChangeAlert) obj2, (Avatar) obj4, (Boolean) obj16, (MultiCurrencyPaymentReviewBlocker.DrawerActions) obj6, (String) obj18, (String) obj19, (String) obj20, (String) obj21, (String) obj22, (MultiCurrencyPaymentReviewBlocker.PaymentSchedule) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            break;
                        case 2:
                            obj15 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 3:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 4:
                            obj17 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 5:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj7);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 6:
                            obj23 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 7:
                            m.add(MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.decode(reader));
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 8:
                            obj24 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 9:
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 10:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 11:
                            arrayList2.add(ProtoAdapter.STRING.decode(reader));
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 12:
                            obj11 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 13:
                            obj13 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 14:
                            obj14 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 15:
                            obj2 = TransactorKt.decodeMessageOrMerge(MultiCurrencyPaymentReviewBlocker.ChangeAlert.ADAPTER, reader, obj2);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 16:
                            obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, reader, obj4);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 17:
                            obj16 = ProtoAdapter.BOOL.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 18:
                            obj6 = TransactorKt.decodeMessageOrMerge(MultiCurrencyPaymentReviewBlocker.DrawerActions.ADAPTER, reader, obj6);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 19:
                            obj18 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 20:
                            obj19 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 21:
                            obj20 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 22:
                            obj21 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 23:
                            obj22 = ProtoAdapter.STRING.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        case 24:
                            obj8 = TransactorKt.decodeMessageOrMerge(MultiCurrencyPaymentReviewBlocker.PaymentSchedule.ADAPTER, reader, obj8);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                        case 25:
                            obj9 = ProtoAdapter.BOOL.decode(reader);
                            obj = obj3;
                            break;
                        case 26:
                            obj12 = ProtoAdapter.BOOL.decode(reader);
                            obj9 = obj25;
                            obj = obj3;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            obj9 = obj25;
                            break;
                    }
                    obj3 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.sender_amount);
                protoAdapter2.encodeWithTag(writer, 4, value.sender_amount_label);
                protoAdapter3.encodeWithTag(writer, 5, value.recipient_amount);
                protoAdapter2.encodeWithTag(writer, 6, value.recipient_amount_label);
                MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.line_items);
                protoAdapter2.encodeWithTag(writer, 8, value.recipient_name);
                protoAdapter2.asRepeated().encodeWithTag(writer, 9, value.recipient_info);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 25, value.can_edit_recipient);
                protoAdapter2.encodeWithTag(writer, 10, value.delivery_method_type);
                protoAdapter2.asRepeated().encodeWithTag(writer, 11, value.delivery_method_info);
                protoAdapter2.encodeWithTag(writer, 12, value.delivery_notice);
                protoAdapter4.encodeWithTag(writer, 26, value.can_edit_delivery);
                protoAdapter2.encodeWithTag(writer, 13, value.terms_text);
                protoAdapter2.encodeWithTag(writer, 14, value.primary_button_label);
                MultiCurrencyPaymentReviewBlocker.ChangeAlert.ADAPTER.encodeWithTag(writer, 15, value.change_alert);
                Avatar.ADAPTER.encodeWithTag(writer, 16, value.recipient_avatar);
                protoAdapter4.encodeWithTag(writer, 17, value.can_edit_amount);
                MultiCurrencyPaymentReviewBlocker.DrawerActions.ADAPTER.encodeWithTag(writer, 18, value.accept_sheet);
                protoAdapter2.encodeWithTag(writer, 19, value.pickup_location_notice);
                protoAdapter2.encodeWithTag(writer, 20, value.accepted_id_notice);
                protoAdapter2.encodeWithTag(writer, 21, value.accepted_id_notice_url);
                protoAdapter2.encodeWithTag(writer, 22, value.formatted_sender_amount);
                protoAdapter2.encodeWithTag(writer, 23, value.formatted_recipient_amount);
                MultiCurrencyPaymentReviewBlocker.PaymentSchedule.ADAPTER.encodeWithTag(writer, 24, value.payment_schedule);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MultiCurrencyPaymentReviewBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.asRepeated().encodedSizeWithTag(9, value.recipient_info) + protoAdapter2.encodedSizeWithTag(8, value.recipient_name) + MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.asRepeated().encodedSizeWithTag(7, value.line_items) + protoAdapter2.encodedSizeWithTag(6, value.recipient_amount_label) + protoAdapter3.encodedSizeWithTag(5, value.recipient_amount) + protoAdapter2.encodedSizeWithTag(4, value.sender_amount_label) + protoAdapter3.encodedSizeWithTag(3, value.sender_amount) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                return MultiCurrencyPaymentReviewBlocker.PaymentSchedule.ADAPTER.encodedSizeWithTag(24, value.payment_schedule) + protoAdapter2.encodedSizeWithTag(23, value.formatted_recipient_amount) + protoAdapter2.encodedSizeWithTag(22, value.formatted_sender_amount) + protoAdapter2.encodedSizeWithTag(21, value.accepted_id_notice_url) + protoAdapter2.encodedSizeWithTag(20, value.accepted_id_notice) + protoAdapter2.encodedSizeWithTag(19, value.pickup_location_notice) + MultiCurrencyPaymentReviewBlocker.DrawerActions.ADAPTER.encodedSizeWithTag(18, value.accept_sheet) + protoAdapter4.encodedSizeWithTag(17, value.can_edit_amount) + Avatar.ADAPTER.encodedSizeWithTag(16, value.recipient_avatar) + MultiCurrencyPaymentReviewBlocker.ChangeAlert.ADAPTER.encodedSizeWithTag(15, value.change_alert) + protoAdapter2.encodedSizeWithTag(14, value.primary_button_label) + protoAdapter2.encodedSizeWithTag(13, value.terms_text) + protoAdapter4.encodedSizeWithTag(26, value.can_edit_delivery) + protoAdapter2.encodedSizeWithTag(12, value.delivery_notice) + protoAdapter2.asRepeated().encodedSizeWithTag(11, value.delivery_method_info) + protoAdapter2.encodedSizeWithTag(10, value.delivery_method_type) + protoAdapter4.encodedSizeWithTag(25, value.can_edit_recipient) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiCurrencyPaymentReviewBlocker redact(MultiCurrencyPaymentReviewBlocker value) {
                value.getClass();
                Money money = value.sender_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.recipient_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.line_items, MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER);
                EmptyList emptyList = EmptyList.INSTANCE;
                MultiCurrencyPaymentReviewBlocker.ChangeAlert changeAlert = value.change_alert;
                MultiCurrencyPaymentReviewBlocker.ChangeAlert changeAlert2 = changeAlert != null ? (MultiCurrencyPaymentReviewBlocker.ChangeAlert) MultiCurrencyPaymentReviewBlocker.ChangeAlert.ADAPTER.redact(changeAlert) : null;
                Avatar avatar = value.recipient_avatar;
                Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
                MultiCurrencyPaymentReviewBlocker.DrawerActions drawerActions = value.accept_sheet;
                MultiCurrencyPaymentReviewBlocker.DrawerActions drawerActions2 = drawerActions != null ? (MultiCurrencyPaymentReviewBlocker.DrawerActions) MultiCurrencyPaymentReviewBlocker.DrawerActions.ADAPTER.redact(drawerActions) : null;
                MultiCurrencyPaymentReviewBlocker.PaymentSchedule paymentSchedule = value.payment_schedule;
                MultiCurrencyPaymentReviewBlocker.PaymentSchedule paymentSchedule2 = paymentSchedule != null ? (MultiCurrencyPaymentReviewBlocker.PaymentSchedule) MultiCurrencyPaymentReviewBlocker.PaymentSchedule.ADAPTER.redact(paymentSchedule) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.subtitle;
                String str2 = value.sender_amount_label;
                String str3 = value.recipient_amount_label;
                Boolean bool = value.can_edit_recipient;
                String str4 = value.delivery_method_type;
                List<String> list = value.delivery_method_info;
                Boolean bool2 = value.can_edit_delivery;
                String str5 = value.terms_text;
                String str6 = value.primary_button_label;
                Boolean bool3 = value.can_edit_amount;
                String str7 = value.pickup_location_notice;
                String str8 = value.accepted_id_notice;
                String str9 = value.accepted_id_notice_url;
                String str10 = value.formatted_sender_amount;
                String str11 = value.formatted_recipient_amount;
                emptyList.getClass();
                list.getClass();
                byteString.getClass();
                return new MultiCurrencyPaymentReviewBlocker(null, str, money2, str2, money4, str3, m1169redactElements, null, emptyList, bool, str4, list, null, bool2, str5, str6, changeAlert2, avatar2, bool3, drawerActions2, str7, str8, str9, str10, str11, paymentSchedule2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                MultiCurrencyPaymentReviewBlocker.PaymentSchedule.ADAPTER.encodeWithTag(writer, 24, value.payment_schedule);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 23, value.formatted_recipient_amount);
                protoAdapter2.encodeWithTag(writer, 22, value.formatted_sender_amount);
                protoAdapter2.encodeWithTag(writer, 21, value.accepted_id_notice_url);
                protoAdapter2.encodeWithTag(writer, 20, value.accepted_id_notice);
                protoAdapter2.encodeWithTag(writer, 19, value.pickup_location_notice);
                MultiCurrencyPaymentReviewBlocker.DrawerActions.ADAPTER.encodeWithTag(writer, 18, value.accept_sheet);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 17, value.can_edit_amount);
                Avatar.ADAPTER.encodeWithTag(writer, 16, value.recipient_avatar);
                MultiCurrencyPaymentReviewBlocker.ChangeAlert.ADAPTER.encodeWithTag(writer, 15, value.change_alert);
                protoAdapter2.encodeWithTag(writer, 14, value.primary_button_label);
                protoAdapter2.encodeWithTag(writer, 13, value.terms_text);
                protoAdapter3.encodeWithTag(writer, 26, value.can_edit_delivery);
                protoAdapter2.encodeWithTag(writer, 12, value.delivery_notice);
                protoAdapter2.asRepeated().encodeWithTag(writer, 11, value.delivery_method_info);
                protoAdapter2.encodeWithTag(writer, 10, value.delivery_method_type);
                protoAdapter3.encodeWithTag(writer, 25, value.can_edit_recipient);
                protoAdapter2.asRepeated().encodeWithTag(writer, 9, value.recipient_info);
                protoAdapter2.encodeWithTag(writer, 8, value.recipient_name);
                MultiCurrencyPaymentReviewBlocker.LineItemRow.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.line_items);
                protoAdapter2.encodeWithTag(writer, 6, value.recipient_amount_label);
                ProtoAdapter protoAdapter4 = Money.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 5, value.recipient_amount);
                protoAdapter2.encodeWithTag(writer, 4, value.sender_amount_label);
                protoAdapter4.encodeWithTag(writer, 3, value.sender_amount);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCurrencyPaymentReviewBlocker(String str, String str2, Money money, String str3, Money money2, String str4, List list, String str5, List list2, Boolean bool, String str6, List list3, String str7, Boolean bool2, String str8, String str9, ChangeAlert changeAlert, Avatar avatar, Boolean bool3, DrawerActions drawerActions, String str10, String str11, String str12, String str13, String str14, PaymentSchedule paymentSchedule, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.title = str;
        this.subtitle = str2;
        this.sender_amount = money;
        this.sender_amount_label = str3;
        this.recipient_amount = money2;
        this.recipient_amount_label = str4;
        this.recipient_name = str5;
        this.can_edit_recipient = bool;
        this.delivery_method_type = str6;
        this.delivery_notice = str7;
        this.can_edit_delivery = bool2;
        this.terms_text = str8;
        this.primary_button_label = str9;
        this.change_alert = changeAlert;
        this.recipient_avatar = avatar;
        this.can_edit_amount = bool3;
        this.accept_sheet = drawerActions;
        this.pickup_location_notice = str10;
        this.accepted_id_notice = str11;
        this.accepted_id_notice_url = str12;
        this.formatted_sender_amount = str13;
        this.formatted_recipient_amount = str14;
        this.payment_schedule = paymentSchedule;
        this.line_items = TransactorKt.immutableCopyOf("line_items", list);
        this.recipient_info = TransactorKt.immutableCopyOf("recipient_info", list2);
        this.delivery_method_info = TransactorKt.immutableCopyOf("delivery_method_info", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCurrencyPaymentReviewBlocker)) {
            return false;
        }
        MultiCurrencyPaymentReviewBlocker multiCurrencyPaymentReviewBlocker = (MultiCurrencyPaymentReviewBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), multiCurrencyPaymentReviewBlocker.unknownFields()) && Intrinsics.areEqual(this.title, multiCurrencyPaymentReviewBlocker.title) && Intrinsics.areEqual(this.subtitle, multiCurrencyPaymentReviewBlocker.subtitle) && Intrinsics.areEqual(this.sender_amount, multiCurrencyPaymentReviewBlocker.sender_amount) && Intrinsics.areEqual(this.sender_amount_label, multiCurrencyPaymentReviewBlocker.sender_amount_label) && Intrinsics.areEqual(this.recipient_amount, multiCurrencyPaymentReviewBlocker.recipient_amount) && Intrinsics.areEqual(this.recipient_amount_label, multiCurrencyPaymentReviewBlocker.recipient_amount_label) && Intrinsics.areEqual(this.line_items, multiCurrencyPaymentReviewBlocker.line_items) && Intrinsics.areEqual(this.recipient_name, multiCurrencyPaymentReviewBlocker.recipient_name) && Intrinsics.areEqual(this.recipient_info, multiCurrencyPaymentReviewBlocker.recipient_info) && Intrinsics.areEqual(this.can_edit_recipient, multiCurrencyPaymentReviewBlocker.can_edit_recipient) && Intrinsics.areEqual(this.delivery_method_type, multiCurrencyPaymentReviewBlocker.delivery_method_type) && Intrinsics.areEqual(this.delivery_method_info, multiCurrencyPaymentReviewBlocker.delivery_method_info) && Intrinsics.areEqual(this.delivery_notice, multiCurrencyPaymentReviewBlocker.delivery_notice) && Intrinsics.areEqual(this.can_edit_delivery, multiCurrencyPaymentReviewBlocker.can_edit_delivery) && Intrinsics.areEqual(this.terms_text, multiCurrencyPaymentReviewBlocker.terms_text) && Intrinsics.areEqual(this.primary_button_label, multiCurrencyPaymentReviewBlocker.primary_button_label) && Intrinsics.areEqual(this.change_alert, multiCurrencyPaymentReviewBlocker.change_alert) && Intrinsics.areEqual(this.recipient_avatar, multiCurrencyPaymentReviewBlocker.recipient_avatar) && Intrinsics.areEqual(this.can_edit_amount, multiCurrencyPaymentReviewBlocker.can_edit_amount) && Intrinsics.areEqual(this.accept_sheet, multiCurrencyPaymentReviewBlocker.accept_sheet) && Intrinsics.areEqual(this.pickup_location_notice, multiCurrencyPaymentReviewBlocker.pickup_location_notice) && Intrinsics.areEqual(this.accepted_id_notice, multiCurrencyPaymentReviewBlocker.accepted_id_notice) && Intrinsics.areEqual(this.accepted_id_notice_url, multiCurrencyPaymentReviewBlocker.accepted_id_notice_url) && Intrinsics.areEqual(this.formatted_sender_amount, multiCurrencyPaymentReviewBlocker.formatted_sender_amount) && Intrinsics.areEqual(this.formatted_recipient_amount, multiCurrencyPaymentReviewBlocker.formatted_recipient_amount) && Intrinsics.areEqual(this.payment_schedule, multiCurrencyPaymentReviewBlocker.payment_schedule);
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
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money = this.sender_amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str3 = this.sender_amount_label;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money2 = this.recipient_amount;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str4 = this.recipient_amount_label;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.line_items);
        String str5 = this.recipient_name;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.recipient_info);
        Boolean bool = this.can_edit_recipient;
        int hashCode7 = (m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str6 = this.delivery_method_type;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37, 37, this.delivery_method_info);
        String str7 = this.delivery_notice;
        int hashCode8 = (m3 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool2 = this.can_edit_delivery;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str8 = this.terms_text;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.primary_button_label;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        ChangeAlert changeAlert = this.change_alert;
        int hashCode12 = (hashCode11 + (changeAlert != null ? changeAlert.hashCode() : 0)) * 37;
        Avatar avatar = this.recipient_avatar;
        int hashCode13 = (hashCode12 + (avatar != null ? avatar.hashCode() : 0)) * 37;
        Boolean bool3 = this.can_edit_amount;
        int hashCode14 = (hashCode13 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        DrawerActions drawerActions = this.accept_sheet;
        int hashCode15 = (hashCode14 + (drawerActions != null ? drawerActions.hashCode() : 0)) * 37;
        String str10 = this.pickup_location_notice;
        int hashCode16 = (hashCode15 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.accepted_id_notice;
        int hashCode17 = (hashCode16 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.accepted_id_notice_url;
        int hashCode18 = (hashCode17 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.formatted_sender_amount;
        int hashCode19 = (hashCode18 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.formatted_recipient_amount;
        int hashCode20 = (hashCode19 + (str14 != null ? str14.hashCode() : 0)) * 37;
        PaymentSchedule paymentSchedule = this.payment_schedule;
        int hashCode21 = hashCode20 + (paymentSchedule != null ? paymentSchedule.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.sender_amount = this.sender_amount;
        builder.sender_amount_label = this.sender_amount_label;
        builder.recipient_amount = this.recipient_amount;
        builder.recipient_amount_label = this.recipient_amount_label;
        builder.line_items = this.line_items;
        builder.recipient_name = this.recipient_name;
        builder.recipient_info = this.recipient_info;
        builder.can_edit_recipient = this.can_edit_recipient;
        builder.delivery_method_type = this.delivery_method_type;
        builder.delivery_method_info = this.delivery_method_info;
        builder.delivery_notice = this.delivery_notice;
        builder.can_edit_delivery = this.can_edit_delivery;
        builder.terms_text = this.terms_text;
        builder.primary_button_label = this.primary_button_label;
        builder.change_alert = this.change_alert;
        builder.recipient_avatar = this.recipient_avatar;
        builder.can_edit_amount = this.can_edit_amount;
        builder.accept_sheet = this.accept_sheet;
        builder.pickup_location_notice = this.pickup_location_notice;
        builder.accepted_id_notice = this.accepted_id_notice;
        builder.accepted_id_notice_url = this.accepted_id_notice_url;
        builder.formatted_sender_amount = this.formatted_sender_amount;
        builder.formatted_recipient_amount = this.formatted_recipient_amount;
        builder.payment_schedule = this.payment_schedule;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        String str = this.subtitle;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "subtitle=", arrayList);
        }
        Money money = this.sender_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("sender_amount=", money, arrayList);
        }
        String str2 = this.sender_amount_label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_amount_label=", arrayList);
        }
        Money money2 = this.recipient_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("recipient_amount=", money2, arrayList);
        }
        String str3 = this.recipient_amount_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "recipient_amount_label=", arrayList);
        }
        if (!this.line_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("line_items=", arrayList, this.line_items);
        }
        if (this.recipient_name != null) {
            arrayList.add("recipient_name=██");
        }
        if (!this.recipient_info.isEmpty()) {
            arrayList.add("recipient_info=██");
        }
        Boolean bool = this.can_edit_recipient;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_edit_recipient=", bool, arrayList);
        }
        String str4 = this.delivery_method_type;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "delivery_method_type=", arrayList);
        }
        if (!this.delivery_method_info.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("delivery_method_info=", arrayList, this.delivery_method_info);
        }
        if (this.delivery_notice != null) {
            arrayList.add("delivery_notice=██");
        }
        Boolean bool2 = this.can_edit_delivery;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_edit_delivery=", bool2, arrayList);
        }
        String str5 = this.terms_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "terms_text=", arrayList);
        }
        String str6 = this.primary_button_label;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "primary_button_label=", arrayList);
        }
        ChangeAlert changeAlert = this.change_alert;
        if (changeAlert != null) {
            arrayList.add("change_alert=" + changeAlert);
        }
        Avatar avatar = this.recipient_avatar;
        if (avatar != null) {
            arrayList.add("recipient_avatar=" + avatar);
        }
        Boolean bool3 = this.can_edit_amount;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_edit_amount=", bool3, arrayList);
        }
        DrawerActions drawerActions = this.accept_sheet;
        if (drawerActions != null) {
            arrayList.add("accept_sheet=" + drawerActions);
        }
        String str7 = this.pickup_location_notice;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "pickup_location_notice=", arrayList);
        }
        String str8 = this.accepted_id_notice;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "accepted_id_notice=", arrayList);
        }
        String str9 = this.accepted_id_notice_url;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "accepted_id_notice_url=", arrayList);
        }
        String str10 = this.formatted_sender_amount;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "formatted_sender_amount=", arrayList);
        }
        String str11 = this.formatted_recipient_amount;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "formatted_recipient_amount=", arrayList);
        }
        PaymentSchedule paymentSchedule = this.payment_schedule;
        if (paymentSchedule != null) {
            arrayList.add("payment_schedule=" + paymentSchedule);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiCurrencyPaymentReviewBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert$Builder;", "title", "", "text", "button_label", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ChangeAlert extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ChangeAlert> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String button_label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "<init>", "()V", "title", "", "text", "button_label", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String button_label;
            public String text;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public ChangeAlert build() {
                return new ChangeAlert(this.title, this.text, this.button_label, buildUnknownFields());
            }

            public final Builder button_label(String button_label) {
                this.button_label = button_label;
                return this;
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ChangeAlert.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$ChangeAlert$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.ChangeAlert decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MultiCurrencyPaymentReviewBlocker.ChangeAlert((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker.ChangeAlert value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.text);
                    protoAdapter2.encodeWithTag(writer, 3, value.button_label);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyPaymentReviewBlocker.ChangeAlert value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.button_label) + protoAdapter2.encodedSizeWithTag(2, value.text) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.ChangeAlert redact(MultiCurrencyPaymentReviewBlocker.ChangeAlert value) {
                    value.getClass();
                    return MultiCurrencyPaymentReviewBlocker.ChangeAlert.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker.ChangeAlert value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.button_label);
                    protoAdapter2.encodeWithTag(writer, 2, value.text);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ChangeAlert(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ChangeAlert copy$default(ChangeAlert changeAlert, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = changeAlert.title;
            }
            if ((i & 2) != 0) {
                str2 = changeAlert.text;
            }
            if ((i & 4) != 0) {
                str3 = changeAlert.button_label;
            }
            if ((i & 8) != 0) {
                byteString = changeAlert.unknownFields();
            }
            return changeAlert.copy(str, str2, str3, byteString);
        }

        public final ChangeAlert copy(String title, String text, String button_label, ByteString unknownFields) {
            unknownFields.getClass();
            return new ChangeAlert(title, text, button_label, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ChangeAlert)) {
                return false;
            }
            ChangeAlert changeAlert = (ChangeAlert) other;
            return Intrinsics.areEqual(unknownFields(), changeAlert.unknownFields()) && Intrinsics.areEqual(this.title, changeAlert.title) && Intrinsics.areEqual(this.text, changeAlert.text) && Intrinsics.areEqual(this.button_label, changeAlert.button_label);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.button_label;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.text = this.text;
            builder.button_label = this.button_label;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
            }
            String str3 = this.button_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_label=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ChangeAlert{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$ChangeAlert;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ChangeAlert build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ChangeAlert() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChangeAlert(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.text = str2;
            this.button_label = str3;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions$Builder;", "title", "", "description", "primary_action_cta", "secondary_action_cta", "cancel_cta", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DrawerActions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DrawerActions> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String cancel_cta;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String description;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String primary_action_cta;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String secondary_action_cta;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "<init>", "()V", "title", "", "description", "primary_action_cta", "secondary_action_cta", "cancel_cta", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String cancel_cta;
            public String description;
            public String primary_action_cta;
            public String secondary_action_cta;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public DrawerActions build() {
                return new DrawerActions(this.title, this.description, this.primary_action_cta, this.secondary_action_cta, this.cancel_cta, buildUnknownFields());
            }

            public final Builder cancel_cta(String cancel_cta) {
                this.cancel_cta = cancel_cta;
                return this;
            }

            public final Builder description(String description) {
                this.description = description;
                return this;
            }

            public final Builder primary_action_cta(String primary_action_cta) {
                this.primary_action_cta = primary_action_cta;
                return this;
            }

            public final Builder secondary_action_cta(String secondary_action_cta) {
                this.secondary_action_cta = secondary_action_cta;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DrawerActions.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$DrawerActions$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.DrawerActions decode(ProtoReader reader) {
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
                            return new MultiCurrencyPaymentReviewBlocker.DrawerActions((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
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
                public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker.DrawerActions value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    protoAdapter2.encodeWithTag(writer, 3, value.primary_action_cta);
                    protoAdapter2.encodeWithTag(writer, 4, value.secondary_action_cta);
                    protoAdapter2.encodeWithTag(writer, 5, value.cancel_cta);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyPaymentReviewBlocker.DrawerActions value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(5, value.cancel_cta) + protoAdapter2.encodedSizeWithTag(4, value.secondary_action_cta) + protoAdapter2.encodedSizeWithTag(3, value.primary_action_cta) + protoAdapter2.encodedSizeWithTag(2, value.description) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.DrawerActions redact(MultiCurrencyPaymentReviewBlocker.DrawerActions value) {
                    value.getClass();
                    return MultiCurrencyPaymentReviewBlocker.DrawerActions.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker.DrawerActions value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.cancel_cta);
                    protoAdapter2.encodeWithTag(writer, 4, value.secondary_action_cta);
                    protoAdapter2.encodeWithTag(writer, 3, value.primary_action_cta);
                    protoAdapter2.encodeWithTag(writer, 2, value.description);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DrawerActions(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DrawerActions copy$default(DrawerActions drawerActions, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = drawerActions.title;
            }
            if ((i & 2) != 0) {
                str2 = drawerActions.description;
            }
            if ((i & 4) != 0) {
                str3 = drawerActions.primary_action_cta;
            }
            if ((i & 8) != 0) {
                str4 = drawerActions.secondary_action_cta;
            }
            if ((i & 16) != 0) {
                str5 = drawerActions.cancel_cta;
            }
            if ((i & 32) != 0) {
                byteString = drawerActions.unknownFields();
            }
            String str6 = str5;
            ByteString byteString2 = byteString;
            return drawerActions.copy(str, str2, str3, str4, str6, byteString2);
        }

        public final DrawerActions copy(String title, String description, String primary_action_cta, String secondary_action_cta, String cancel_cta, ByteString unknownFields) {
            unknownFields.getClass();
            return new DrawerActions(title, description, primary_action_cta, secondary_action_cta, cancel_cta, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DrawerActions)) {
                return false;
            }
            DrawerActions drawerActions = (DrawerActions) other;
            return Intrinsics.areEqual(unknownFields(), drawerActions.unknownFields()) && Intrinsics.areEqual(this.title, drawerActions.title) && Intrinsics.areEqual(this.description, drawerActions.description) && Intrinsics.areEqual(this.primary_action_cta, drawerActions.primary_action_cta) && Intrinsics.areEqual(this.secondary_action_cta, drawerActions.secondary_action_cta) && Intrinsics.areEqual(this.cancel_cta, drawerActions.cancel_cta);
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
            String str3 = this.primary_action_cta;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.secondary_action_cta;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            String str5 = this.cancel_cta;
            int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.description = this.description;
            builder.primary_action_cta = this.primary_action_cta;
            builder.secondary_action_cta = this.secondary_action_cta;
            builder.cancel_cta = this.cancel_cta;
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
            String str3 = this.primary_action_cta;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "primary_action_cta=", arrayList);
            }
            String str4 = this.secondary_action_cta;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "secondary_action_cta=", arrayList);
            }
            String str5 = this.cancel_cta;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "cancel_cta=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DrawerActions{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$DrawerActions;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DrawerActions build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DrawerActions() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DrawerActions(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.description = str2;
            this.primary_action_cta = str3;
            this.secondary_action_cta = str4;
            this.cancel_cta = str5;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016JQ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule$Builder;", "title", "", "frequency", "start_date", "scheduled_payment_terms", "can_edit_schedule", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class PaymentSchedule extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PaymentSchedule> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
        public final Boolean can_edit_schedule;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String frequency;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String scheduled_payment_terms;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String start_date;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "<init>", "()V", "title", "", "frequency", "start_date", "scheduled_payment_terms", "can_edit_schedule", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Boolean can_edit_schedule;
            public String frequency;
            public String scheduled_payment_terms;
            public String start_date;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public PaymentSchedule build() {
                return new PaymentSchedule(this.title, this.frequency, this.start_date, this.scheduled_payment_terms, this.can_edit_schedule, buildUnknownFields());
            }

            public final Builder can_edit_schedule(Boolean can_edit_schedule) {
                this.can_edit_schedule = can_edit_schedule;
                return this;
            }

            public final Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            public final Builder scheduled_payment_terms(String scheduled_payment_terms) {
                this.scheduled_payment_terms = scheduled_payment_terms;
                return this;
            }

            public final Builder start_date(String start_date) {
                this.start_date = start_date;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentSchedule.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyPaymentReviewBlocker$PaymentSchedule$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.PaymentSchedule decode(ProtoReader reader) {
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
                            return new MultiCurrencyPaymentReviewBlocker.PaymentSchedule((String) obj, (String) obj2, (String) obj3, (String) obj4, (Boolean) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.BOOL.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MultiCurrencyPaymentReviewBlocker.PaymentSchedule value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.frequency);
                    protoAdapter2.encodeWithTag(writer, 3, value.start_date);
                    protoAdapter2.encodeWithTag(writer, 4, value.scheduled_payment_terms);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.can_edit_schedule);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyPaymentReviewBlocker.PaymentSchedule value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return ProtoAdapter.BOOL.encodedSizeWithTag(5, value.can_edit_schedule) + protoAdapter2.encodedSizeWithTag(4, value.scheduled_payment_terms) + protoAdapter2.encodedSizeWithTag(3, value.start_date) + protoAdapter2.encodedSizeWithTag(2, value.frequency) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyPaymentReviewBlocker.PaymentSchedule redact(MultiCurrencyPaymentReviewBlocker.PaymentSchedule value) {
                    value.getClass();
                    return MultiCurrencyPaymentReviewBlocker.PaymentSchedule.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyPaymentReviewBlocker.PaymentSchedule value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.can_edit_schedule);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.scheduled_payment_terms);
                    protoAdapter2.encodeWithTag(writer, 3, value.start_date);
                    protoAdapter2.encodeWithTag(writer, 2, value.frequency);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PaymentSchedule(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PaymentSchedule copy$default(PaymentSchedule paymentSchedule, String str, String str2, String str3, String str4, Boolean bool, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentSchedule.title;
            }
            if ((i & 2) != 0) {
                str2 = paymentSchedule.frequency;
            }
            if ((i & 4) != 0) {
                str3 = paymentSchedule.start_date;
            }
            if ((i & 8) != 0) {
                str4 = paymentSchedule.scheduled_payment_terms;
            }
            if ((i & 16) != 0) {
                bool = paymentSchedule.can_edit_schedule;
            }
            if ((i & 32) != 0) {
                byteString = paymentSchedule.unknownFields();
            }
            Boolean bool2 = bool;
            ByteString byteString2 = byteString;
            return paymentSchedule.copy(str, str2, str3, str4, bool2, byteString2);
        }

        public final PaymentSchedule copy(String title, String frequency, String start_date, String scheduled_payment_terms, Boolean can_edit_schedule, ByteString unknownFields) {
            unknownFields.getClass();
            return new PaymentSchedule(title, frequency, start_date, scheduled_payment_terms, can_edit_schedule, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PaymentSchedule)) {
                return false;
            }
            PaymentSchedule paymentSchedule = (PaymentSchedule) other;
            return Intrinsics.areEqual(unknownFields(), paymentSchedule.unknownFields()) && Intrinsics.areEqual(this.title, paymentSchedule.title) && Intrinsics.areEqual(this.frequency, paymentSchedule.frequency) && Intrinsics.areEqual(this.start_date, paymentSchedule.start_date) && Intrinsics.areEqual(this.scheduled_payment_terms, paymentSchedule.scheduled_payment_terms) && Intrinsics.areEqual(this.can_edit_schedule, paymentSchedule.can_edit_schedule);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.frequency;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.start_date;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.scheduled_payment_terms;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool = this.can_edit_schedule;
            int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.frequency = this.frequency;
            builder.start_date = this.start_date;
            builder.scheduled_payment_terms = this.scheduled_payment_terms;
            builder.can_edit_schedule = this.can_edit_schedule;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.frequency;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "frequency=", arrayList);
            }
            String str3 = this.start_date;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "start_date=", arrayList);
            }
            String str4 = this.scheduled_payment_terms;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "scheduled_payment_terms=", arrayList);
            }
            Boolean bool = this.can_edit_schedule;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("can_edit_schedule=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentSchedule{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$PaymentSchedule;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PaymentSchedule build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PaymentSchedule() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentSchedule(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.frequency = str2;
            this.start_date = str3;
            this.scheduled_payment_terms = str4;
            this.can_edit_schedule = bool;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyPaymentReviewBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MultiCurrencyPaymentReviewBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
