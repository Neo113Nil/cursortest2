package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.data.Payment$CreationMechanism;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002GFR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0005R\u0016\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0005R\u0016\u0010$\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0016\u0010%\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0016\u0010&\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0016\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0005R\u0016\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0005R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0016\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0005R\u0016\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0005R\u0016\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0005R\u0016\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0005R\u0016\u0010>\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0013R\u0016\u0010A\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0013R\u0016\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010D¨\u0006H"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiPayment;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiPayment$Builder;", "", "token", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/common/Orientation;", "orientation", "Lcom/squareup/protos/franklin/common/Orientation;", "Lcom/squareup/protos/franklin/api/Role;", "role", "Lcom/squareup/protos/franklin/api/Role;", "sender_id", "recipient_id", "Lcom/squareup/protos/franklin/ui/PaymentState;", "state", "Lcom/squareup/protos/franklin/ui/PaymentState;", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "boost_amount", "sender_amount", "recipient_amount", "", "created_at", "Ljava/lang/Long;", "updated_at", "scheduled_for", "captured_at", "refunded_at", "paid_out_at", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "history_data", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "render_data", "note", "display_date", "outstanding_until", "hidden_until", "external_id", "payment_schedule_token", "Lcom/squareup/protos/franklin/ui/ScenarioPlanSource;", "scenario_plan_source", "Lcom/squareup/protos/franklin/ui/ScenarioPlanSource;", "avatar_overlay_size", "Lcom/squareup/protos/franklin/ui/RollupType;", "rollup_type", "Lcom/squareup/protos/franklin/ui/RollupType;", "Lcom/squareup/protos/franklin/api/Region;", "customer_region", "Lcom/squareup/protos/franklin/api/Region;", "Lcom/squareup/protos/franklin/data/Payment$CreationMechanism;", "creation_mechanism", "Lcom/squareup/protos/franklin/data/Payment$CreationMechanism;", "Lcom/squareup/protos/franklin/ui/RollupData;", "rollup_data", "Lcom/squareup/protos/franklin/ui/RollupData;", "payment_type", "gifted_investment_entity_token", "lending_loan_token", "associated_payment_token", "Lcom/squareup/protos/franklin/ui/TransactionType;", "transaction_type", "Lcom/squareup/protos/franklin/ui/TransactionType;", "impact", "current_balance", "", "is_business_transaction", "Ljava/lang/Boolean;", "show_customer_tagging_prompt", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UiPayment extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiPayment> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 6, tag = 7)
    public final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 33, tag = 41)
    public final String associated_payment_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", schemaIndex = 25, tag = 37)
    public final Long avatar_overlay_size;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 7, tag = 25)
    public final Money boost_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 13, tag = 10)
    public final Long captured_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 10, tag = 8)
    public final Long created_at;

    @WireField(adapter = "com.squareup.protos.franklin.data.Payment$CreationMechanism#ADAPTER", schemaIndex = 28, tag = 34)
    public final Payment$CreationMechanism creation_mechanism;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 36, tag = 44)
    public final Money current_balance;

    @WireField(adapter = "com.squareup.protos.franklin.api.Region#ADAPTER", schemaIndex = 27, tag = 33)
    public final Region customer_region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 19, tag = 20)
    public final Long display_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 22, tag = 23)
    public final String external_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 31, tag = 38)
    public final String gifted_investment_entity_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 21, tag = 30)
    public final Long hidden_until;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryData#ADAPTER", schemaIndex = 16, tag = 14)
    public final PaymentHistoryData history_data;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 35, tag = 43)
    public final Money impact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 37, tag = 45)
    public final Boolean is_business_transaction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 32, tag = 39)
    public final String lending_loan_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 18, tag = 19)
    public final String note;

    @WireField(adapter = "com.squareup.protos.franklin.common.Orientation#ADAPTER", schemaIndex = 1, tag = 2)
    public final Orientation orientation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 20, tag = 21)
    public final Long outstanding_until;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 15, tag = 12)
    public final Long paid_out_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 23, tag = 28)
    public final String payment_schedule_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 30, tag = 36)
    public final String payment_type;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 9, tag = 18)
    public final Money recipient_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String recipient_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 14, tag = 11)
    public final Long refunded_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 17, tag = 16)
    public final String render_data;

    @WireField(adapter = "com.squareup.protos.franklin.api.Role#ADAPTER", schemaIndex = 2, tag = 3)
    public final Role role;

    @WireField(adapter = "com.squareup.protos.franklin.ui.RollupData#ADAPTER", schemaIndex = 29, tag = 35)
    public final RollupData rollup_data;

    @WireField(adapter = "com.squareup.protos.franklin.ui.RollupType#ADAPTER", schemaIndex = 26, tag = 32)
    public final RollupType rollup_type;

    @WireField(adapter = "com.squareup.protos.franklin.ui.ScenarioPlanSource#ADAPTER", schemaIndex = 24, tag = 29)
    public final ScenarioPlanSource scenario_plan_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 12, tag = 26)
    public final Long scheduled_for;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 8, tag = 17)
    public final Money sender_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String sender_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 38, tag = 46)
    public final Boolean show_customer_tagging_prompt;

    @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentState#ADAPTER", schemaIndex = 5, tag = 6)
    public final PaymentState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String token;

    @WireField(adapter = "com.squareup.protos.franklin.ui.TransactionType#ADAPTER", schemaIndex = 34, tag = 42)
    public final TransactionType transaction_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 11, tag = 9)
    public final Long updated_at;

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0015\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0015\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0006J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0006J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010&J\u0015\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010<J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010+J\u0010\u0010,\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010-J\u0010\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010/J\u0010\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u0006J\u0010\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0006J\u0010\u00102\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0006J\u0010\u00103\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0006J\u0010\u00104\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000105J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0010J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0010J\u0015\u00108\u001a\u00020\u00002\b\u00108\u001a\u0004\u0018\u000109¢\u0006\u0002\u0010=J\u0015\u0010;\u001a\u00020\u00002\b\u0010;\u001a\u0004\u0018\u000109¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010!\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010(\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010:R\u0016\u0010;\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010:¨\u0006?"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiPayment$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/UiPayment;", "<init>", "()V", "token", "", "orientation", "Lcom/squareup/protos/franklin/common/Orientation;", "role", "Lcom/squareup/protos/franklin/api/Role;", "sender_id", "recipient_id", "state", "Lcom/squareup/protos/franklin/ui/PaymentState;", "amount", "Lcom/squareup/protos/common/Money;", "boost_amount", "sender_amount", "recipient_amount", "created_at", "", "Ljava/lang/Long;", "updated_at", "scheduled_for", "captured_at", "refunded_at", "paid_out_at", "history_data", "Lcom/squareup/protos/franklin/ui/PaymentHistoryData;", "render_data", "note", "display_date", "outstanding_until", "hidden_until", "external_id", "payment_schedule_token", "scenario_plan_source", "Lcom/squareup/protos/franklin/ui/ScenarioPlanSource;", "avatar_overlay_size", "rollup_type", "Lcom/squareup/protos/franklin/ui/RollupType;", "customer_region", "Lcom/squareup/protos/franklin/api/Region;", "creation_mechanism", "Lcom/squareup/protos/franklin/data/Payment$CreationMechanism;", "rollup_data", "Lcom/squareup/protos/franklin/ui/RollupData;", "payment_type", "gifted_investment_entity_token", "lending_loan_token", "associated_payment_token", "transaction_type", "Lcom/squareup/protos/franklin/ui/TransactionType;", "impact", "current_balance", "is_business_transaction", "", "Ljava/lang/Boolean;", "show_customer_tagging_prompt", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/ui/UiPayment$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/UiPayment$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Money amount;
        public String associated_payment_token;
        public Long avatar_overlay_size;
        public Money boost_amount;
        public Long captured_at;
        public Long created_at;
        public Payment$CreationMechanism creation_mechanism;
        public Money current_balance;
        public Region customer_region;
        public Long display_date;
        public String external_id;
        public String gifted_investment_entity_token;
        public Long hidden_until;
        public PaymentHistoryData history_data;
        public Money impact;
        public Boolean is_business_transaction;
        public String lending_loan_token;
        public String note;
        public Orientation orientation;
        public Long outstanding_until;
        public Long paid_out_at;
        public String payment_schedule_token;
        public String payment_type;
        public Money recipient_amount;
        public String recipient_id;
        public Long refunded_at;
        public String render_data;
        public Role role;
        public RollupData rollup_data;
        public RollupType rollup_type;
        public ScenarioPlanSource scenario_plan_source;
        public Long scheduled_for;
        public Money sender_amount;
        public String sender_id;
        public Boolean show_customer_tagging_prompt;
        public PaymentState state;
        public String token;
        public TransactionType transaction_type;
        public Long updated_at;

        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        public final Builder associated_payment_token(String associated_payment_token) {
            this.associated_payment_token = associated_payment_token;
            return this;
        }

        public final Builder avatar_overlay_size(Long avatar_overlay_size) {
            this.avatar_overlay_size = avatar_overlay_size;
            return this;
        }

        public final Builder boost_amount(Money boost_amount) {
            this.boost_amount = boost_amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public UiPayment build() {
            return new UiPayment(this.token, this.orientation, this.role, this.sender_id, this.recipient_id, this.state, this.amount, this.boost_amount, this.sender_amount, this.recipient_amount, this.created_at, this.updated_at, this.scheduled_for, this.captured_at, this.refunded_at, this.paid_out_at, this.history_data, this.render_data, this.note, this.display_date, this.outstanding_until, this.hidden_until, this.external_id, this.payment_schedule_token, this.scenario_plan_source, this.avatar_overlay_size, this.rollup_type, this.customer_region, this.creation_mechanism, this.rollup_data, this.payment_type, this.gifted_investment_entity_token, this.lending_loan_token, this.associated_payment_token, this.transaction_type, this.impact, this.current_balance, this.is_business_transaction, this.show_customer_tagging_prompt, buildUnknownFields());
        }

        public final Builder captured_at(Long captured_at) {
            this.captured_at = captured_at;
            return this;
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        public final Builder creation_mechanism(Payment$CreationMechanism creation_mechanism) {
            this.creation_mechanism = creation_mechanism;
            return this;
        }

        public final Builder current_balance(Money current_balance) {
            this.current_balance = current_balance;
            return this;
        }

        public final Builder customer_region(Region customer_region) {
            this.customer_region = customer_region;
            return this;
        }

        public final Builder display_date(Long display_date) {
            this.display_date = display_date;
            return this;
        }

        public final Builder external_id(String external_id) {
            this.external_id = external_id;
            return this;
        }

        public final Builder gifted_investment_entity_token(String gifted_investment_entity_token) {
            this.gifted_investment_entity_token = gifted_investment_entity_token;
            return this;
        }

        public final Builder hidden_until(Long hidden_until) {
            this.hidden_until = hidden_until;
            return this;
        }

        public final Builder history_data(PaymentHistoryData history_data) {
            this.history_data = history_data;
            return this;
        }

        public final Builder impact(Money impact) {
            this.impact = impact;
            return this;
        }

        public final Builder is_business_transaction(Boolean is_business_transaction) {
            this.is_business_transaction = is_business_transaction;
            return this;
        }

        public final Builder lending_loan_token(String lending_loan_token) {
            this.lending_loan_token = lending_loan_token;
            return this;
        }

        public final Builder note(String note) {
            this.note = note;
            return this;
        }

        public final Builder orientation(Orientation orientation) {
            this.orientation = orientation;
            return this;
        }

        public final Builder outstanding_until(Long outstanding_until) {
            this.outstanding_until = outstanding_until;
            return this;
        }

        public final Builder paid_out_at(Long paid_out_at) {
            this.paid_out_at = paid_out_at;
            return this;
        }

        public final Builder payment_schedule_token(String payment_schedule_token) {
            this.payment_schedule_token = payment_schedule_token;
            return this;
        }

        public final Builder payment_type(String payment_type) {
            this.payment_type = payment_type;
            return this;
        }

        public final Builder recipient_amount(Money recipient_amount) {
            this.recipient_amount = recipient_amount;
            return this;
        }

        public final Builder recipient_id(String recipient_id) {
            this.recipient_id = recipient_id;
            return this;
        }

        public final Builder refunded_at(Long refunded_at) {
            this.refunded_at = refunded_at;
            return this;
        }

        public final Builder render_data(String render_data) {
            this.render_data = render_data;
            return this;
        }

        public final Builder role(Role role) {
            this.role = role;
            return this;
        }

        public final Builder rollup_data(RollupData rollup_data) {
            this.rollup_data = rollup_data;
            return this;
        }

        public final Builder rollup_type(RollupType rollup_type) {
            this.rollup_type = rollup_type;
            return this;
        }

        public final Builder scenario_plan_source(ScenarioPlanSource scenario_plan_source) {
            this.scenario_plan_source = scenario_plan_source;
            return this;
        }

        public final Builder scheduled_for(Long scheduled_for) {
            this.scheduled_for = scheduled_for;
            return this;
        }

        public final Builder sender_amount(Money sender_amount) {
            this.sender_amount = sender_amount;
            return this;
        }

        public final Builder sender_id(String sender_id) {
            this.sender_id = sender_id;
            return this;
        }

        public final Builder show_customer_tagging_prompt(Boolean show_customer_tagging_prompt) {
            this.show_customer_tagging_prompt = show_customer_tagging_prompt;
            return this;
        }

        public final Builder state(PaymentState state) {
            this.state = state;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }

        public final Builder transaction_type(TransactionType transaction_type) {
            this.transaction_type = transaction_type;
            return this;
        }

        public final Builder updated_at(Long updated_at) {
            this.updated_at = updated_at;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UiPayment.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.UiPayment$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v104 */
            /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v107 */
            /* JADX WARN: Type inference failed for: r0v108 */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public UiPayment decode(ProtoReader reader) {
                Object obj;
                Long l;
                Long l2;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                PaymentState paymentState = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Long l3 = null;
                Long l4 = null;
                Long l5 = null;
                Long l6 = null;
                Long l7 = null;
                Long l8 = null;
                String str2 = null;
                String str3 = null;
                Long l9 = null;
                Long l10 = null;
                Long l11 = null;
                String str4 = null;
                String str5 = null;
                ScenarioPlanSource scenarioPlanSource = null;
                Long l12 = null;
                RollupType rollupType = null;
                Region region = null;
                Payment$CreationMechanism payment$CreationMechanism = null;
                Orientation orientation = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                TransactionType transactionType = null;
                Role role = null;
                String str10 = null;
                Boolean bool = null;
                Boolean bool2 = null;
                String str11 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new UiPayment(str, orientation, role, str10, str11, paymentState, (Money) obj6, (Money) obj7, (Money) obj8, (Money) obj9, l3, l4, l5, l6, l7, l8, (PaymentHistoryData) obj2, str2, str3, l9, l10, l11, str4, str5, scenarioPlanSource, l12, rollupType, region, payment$CreationMechanism, (RollupData) obj3, str6, str7, str8, str9, transactionType, (Money) obj4, (Money) obj5, bool, bool2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                orientation = Orientation.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                role = Role.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 4:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 5:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 6:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                paymentState = PaymentState.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 7:
                            obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj6);
                            decode = str;
                            break;
                        case 8:
                            l3 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 9:
                            l4 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 10:
                            l6 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 11:
                            l7 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 12:
                            l8 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 13:
                        case 15:
                        case 22:
                        case 24:
                        case 27:
                        case 31:
                        case 40:
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            decode = str;
                            obj4 = obj;
                            l3 = l;
                            l4 = l2;
                            break;
                        case 14:
                            obj2 = TransactorKt.decodeMessageOrMerge(PaymentHistoryData.ADAPTER, reader, obj2);
                            decode = str;
                            break;
                        case 16:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 17:
                            obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj8);
                            decode = str;
                            break;
                        case 18:
                            obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj9);
                            decode = str;
                            break;
                        case 19:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 20:
                            l9 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 21:
                            l10 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 23:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 25:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj7);
                            decode = str;
                            break;
                        case 26:
                            l5 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 28:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 29:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                scenarioPlanSource = ScenarioPlanSource.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 30:
                            l11 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 32:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                rollupType = RollupType.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 33:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                region = Region.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                break;
                            }
                        case 34:
                            obj = obj4;
                            l = l3;
                            l2 = l4;
                            try {
                                payment$CreationMechanism = Payment$CreationMechanism.ADAPTER.decode(reader);
                                obj4 = obj;
                                l3 = l;
                                l4 = l2;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                                break;
                            }
                        case 35:
                            obj3 = TransactorKt.decodeMessageOrMerge(RollupData.ADAPTER, reader, obj3);
                            decode = str;
                            break;
                        case 36:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 37:
                            l12 = ProtoAdapter.UINT64.decode(reader);
                            decode = str;
                            break;
                        case 38:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 39:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 41:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 42:
                            try {
                                transactionType = TransactionType.ADAPTER.decode(reader);
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                obj = obj4;
                                l = l3;
                                l2 = l4;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                        case 43:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            decode = str;
                            break;
                        case 44:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                            decode = str;
                            break;
                        case 45:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 46:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                    }
                    str = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UiPayment value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                Orientation.ADAPTER.encodeWithTag(writer, 2, value.orientation);
                Role.ADAPTER.encodeWithTag(writer, 3, value.role);
                protoAdapter2.encodeWithTag(writer, 4, value.sender_id);
                protoAdapter2.encodeWithTag(writer, 5, value.recipient_id);
                PaymentState.ADAPTER.encodeWithTag(writer, 6, value.state);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 7, value.amount);
                protoAdapter3.encodeWithTag(writer, 25, value.boost_amount);
                protoAdapter3.encodeWithTag(writer, 17, value.sender_amount);
                protoAdapter3.encodeWithTag(writer, 18, value.recipient_amount);
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                protoAdapter4.encodeWithTag(writer, 8, value.created_at);
                protoAdapter4.encodeWithTag(writer, 9, value.updated_at);
                protoAdapter4.encodeWithTag(writer, 26, value.scheduled_for);
                protoAdapter4.encodeWithTag(writer, 10, value.captured_at);
                protoAdapter4.encodeWithTag(writer, 11, value.refunded_at);
                protoAdapter4.encodeWithTag(writer, 12, value.paid_out_at);
                PaymentHistoryData.ADAPTER.encodeWithTag(writer, 14, value.history_data);
                protoAdapter2.encodeWithTag(writer, 16, value.render_data);
                protoAdapter2.encodeWithTag(writer, 19, value.note);
                protoAdapter4.encodeWithTag(writer, 20, value.display_date);
                protoAdapter4.encodeWithTag(writer, 21, value.outstanding_until);
                protoAdapter4.encodeWithTag(writer, 30, value.hidden_until);
                protoAdapter2.encodeWithTag(writer, 23, value.external_id);
                protoAdapter2.encodeWithTag(writer, 28, value.payment_schedule_token);
                ScenarioPlanSource.ADAPTER.encodeWithTag(writer, 29, value.scenario_plan_source);
                ProtoAdapter.UINT64.encodeWithTag(writer, 37, value.avatar_overlay_size);
                RollupType.ADAPTER.encodeWithTag(writer, 32, value.rollup_type);
                Region.ADAPTER.encodeWithTag(writer, 33, value.customer_region);
                Payment$CreationMechanism.ADAPTER.encodeWithTag(writer, 34, value.creation_mechanism);
                RollupData.ADAPTER.encodeWithTag(writer, 35, value.rollup_data);
                protoAdapter2.encodeWithTag(writer, 36, value.payment_type);
                protoAdapter2.encodeWithTag(writer, 38, value.gifted_investment_entity_token);
                protoAdapter2.encodeWithTag(writer, 39, value.lending_loan_token);
                protoAdapter2.encodeWithTag(writer, 41, value.associated_payment_token);
                TransactionType.ADAPTER.encodeWithTag(writer, 42, value.transaction_type);
                protoAdapter3.encodeWithTag(writer, 43, value.impact);
                protoAdapter3.encodeWithTag(writer, 44, value.current_balance);
                ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
                protoAdapter5.encodeWithTag(writer, 45, value.is_business_transaction);
                protoAdapter5.encodeWithTag(writer, 46, value.show_customer_tagging_prompt);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UiPayment value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = PaymentState.ADAPTER.encodedSizeWithTag(6, value.state) + protoAdapter2.encodedSizeWithTag(5, value.recipient_id) + protoAdapter2.encodedSizeWithTag(4, value.sender_id) + Role.ADAPTER.encodedSizeWithTag(3, value.role) + Orientation.ADAPTER.encodedSizeWithTag(2, value.orientation) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter3.encodedSizeWithTag(18, value.recipient_amount) + protoAdapter3.encodedSizeWithTag(17, value.sender_amount) + protoAdapter3.encodedSizeWithTag(25, value.boost_amount) + protoAdapter3.encodedSizeWithTag(7, value.amount) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(44, value.current_balance) + protoAdapter3.encodedSizeWithTag(43, value.impact) + TransactionType.ADAPTER.encodedSizeWithTag(42, value.transaction_type) + protoAdapter2.encodedSizeWithTag(41, value.associated_payment_token) + protoAdapter2.encodedSizeWithTag(39, value.lending_loan_token) + protoAdapter2.encodedSizeWithTag(38, value.gifted_investment_entity_token) + protoAdapter2.encodedSizeWithTag(36, value.payment_type) + RollupData.ADAPTER.encodedSizeWithTag(35, value.rollup_data) + Payment$CreationMechanism.ADAPTER.encodedSizeWithTag(34, value.creation_mechanism) + Region.ADAPTER.encodedSizeWithTag(33, value.customer_region) + RollupType.ADAPTER.encodedSizeWithTag(32, value.rollup_type) + ProtoAdapter.UINT64.encodedSizeWithTag(37, value.avatar_overlay_size) + ScenarioPlanSource.ADAPTER.encodedSizeWithTag(29, value.scenario_plan_source) + protoAdapter2.encodedSizeWithTag(28, value.payment_schedule_token) + protoAdapter2.encodedSizeWithTag(23, value.external_id) + protoAdapter4.encodedSizeWithTag(30, value.hidden_until) + protoAdapter4.encodedSizeWithTag(21, value.outstanding_until) + protoAdapter4.encodedSizeWithTag(20, value.display_date) + protoAdapter2.encodedSizeWithTag(19, value.note) + protoAdapter2.encodedSizeWithTag(16, value.render_data) + PaymentHistoryData.ADAPTER.encodedSizeWithTag(14, value.history_data) + protoAdapter4.encodedSizeWithTag(12, value.paid_out_at) + protoAdapter4.encodedSizeWithTag(11, value.refunded_at) + protoAdapter4.encodedSizeWithTag(10, value.captured_at) + protoAdapter4.encodedSizeWithTag(26, value.scheduled_for) + protoAdapter4.encodedSizeWithTag(9, value.updated_at) + protoAdapter4.encodedSizeWithTag(8, value.created_at) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
                return protoAdapter5.encodedSizeWithTag(46, value.show_customer_tagging_prompt) + protoAdapter5.encodedSizeWithTag(45, value.is_business_transaction) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UiPayment redact(UiPayment value) {
                value.getClass();
                Money money = value.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.boost_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                Money money5 = value.sender_amount;
                Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
                Money money7 = value.recipient_amount;
                Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
                PaymentHistoryData paymentHistoryData = value.history_data;
                PaymentHistoryData paymentHistoryData2 = paymentHistoryData != null ? (PaymentHistoryData) PaymentHistoryData.ADAPTER.redact(paymentHistoryData) : null;
                RollupData rollupData = value.rollup_data;
                RollupData rollupData2 = rollupData != null ? (RollupData) RollupData.ADAPTER.redact(rollupData) : null;
                Money money9 = value.impact;
                Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
                Money money11 = value.current_balance;
                Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.token;
                Orientation orientation = value.orientation;
                Role role = value.role;
                String str2 = value.sender_id;
                String str3 = value.recipient_id;
                PaymentState paymentState = value.state;
                Long l = value.created_at;
                Long l2 = value.updated_at;
                Long l3 = value.scheduled_for;
                Long l4 = value.captured_at;
                Long l5 = value.refunded_at;
                Long l6 = value.paid_out_at;
                Long l7 = value.display_date;
                Long l8 = value.outstanding_until;
                Long l9 = value.hidden_until;
                String str4 = value.external_id;
                String str5 = value.payment_schedule_token;
                ScenarioPlanSource scenarioPlanSource = value.scenario_plan_source;
                Long l10 = value.avatar_overlay_size;
                RollupType rollupType = value.rollup_type;
                Region region = value.customer_region;
                Payment$CreationMechanism payment$CreationMechanism = value.creation_mechanism;
                String str6 = value.payment_type;
                String str7 = value.gifted_investment_entity_token;
                String str8 = value.lending_loan_token;
                String str9 = value.associated_payment_token;
                TransactionType transactionType = value.transaction_type;
                Boolean bool = value.is_business_transaction;
                Boolean bool2 = value.show_customer_tagging_prompt;
                byteString.getClass();
                return new UiPayment(str, orientation, role, str2, str3, paymentState, money2, money4, money6, money8, l, l2, l3, l4, l5, l6, paymentHistoryData2, null, null, l7, l8, l9, str4, str5, scenarioPlanSource, l10, rollupType, region, payment$CreationMechanism, rollupData2, str6, str7, str8, str9, transactionType, money10, money12, bool, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UiPayment value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 46, value.show_customer_tagging_prompt);
                protoAdapter2.encodeWithTag(writer, 45, value.is_business_transaction);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 44, value.current_balance);
                protoAdapter3.encodeWithTag(writer, 43, value.impact);
                TransactionType.ADAPTER.encodeWithTag(writer, 42, value.transaction_type);
                ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                protoAdapter4.encodeWithTag(writer, 41, value.associated_payment_token);
                protoAdapter4.encodeWithTag(writer, 39, value.lending_loan_token);
                protoAdapter4.encodeWithTag(writer, 38, value.gifted_investment_entity_token);
                protoAdapter4.encodeWithTag(writer, 36, value.payment_type);
                RollupData.ADAPTER.encodeWithTag(writer, 35, value.rollup_data);
                Payment$CreationMechanism.ADAPTER.encodeWithTag(writer, 34, value.creation_mechanism);
                Region.ADAPTER.encodeWithTag(writer, 33, value.customer_region);
                RollupType.ADAPTER.encodeWithTag(writer, 32, value.rollup_type);
                ProtoAdapter.UINT64.encodeWithTag(writer, 37, value.avatar_overlay_size);
                ScenarioPlanSource.ADAPTER.encodeWithTag(writer, 29, value.scenario_plan_source);
                protoAdapter4.encodeWithTag(writer, 28, value.payment_schedule_token);
                protoAdapter4.encodeWithTag(writer, 23, value.external_id);
                ProtoAdapter protoAdapter5 = ProtoAdapter.INT64;
                protoAdapter5.encodeWithTag(writer, 30, value.hidden_until);
                protoAdapter5.encodeWithTag(writer, 21, value.outstanding_until);
                protoAdapter5.encodeWithTag(writer, 20, value.display_date);
                protoAdapter4.encodeWithTag(writer, 19, value.note);
                protoAdapter4.encodeWithTag(writer, 16, value.render_data);
                PaymentHistoryData.ADAPTER.encodeWithTag(writer, 14, value.history_data);
                protoAdapter5.encodeWithTag(writer, 12, value.paid_out_at);
                protoAdapter5.encodeWithTag(writer, 11, value.refunded_at);
                protoAdapter5.encodeWithTag(writer, 10, value.captured_at);
                protoAdapter5.encodeWithTag(writer, 26, value.scheduled_for);
                protoAdapter5.encodeWithTag(writer, 9, value.updated_at);
                protoAdapter5.encodeWithTag(writer, 8, value.created_at);
                protoAdapter3.encodeWithTag(writer, 18, value.recipient_amount);
                protoAdapter3.encodeWithTag(writer, 17, value.sender_amount);
                protoAdapter3.encodeWithTag(writer, 25, value.boost_amount);
                protoAdapter3.encodeWithTag(writer, 7, value.amount);
                PaymentState.ADAPTER.encodeWithTag(writer, 6, value.state);
                protoAdapter4.encodeWithTag(writer, 5, value.recipient_id);
                protoAdapter4.encodeWithTag(writer, 4, value.sender_id);
                Role.ADAPTER.encodeWithTag(writer, 3, value.role);
                Orientation.ADAPTER.encodeWithTag(writer, 2, value.orientation);
                protoAdapter4.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiPayment(String str, Orientation orientation, Role role, String str2, String str3, PaymentState paymentState, Money money, Money money2, Money money3, Money money4, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, PaymentHistoryData paymentHistoryData, String str4, String str5, Long l7, Long l8, Long l9, String str6, String str7, ScenarioPlanSource scenarioPlanSource, Long l10, RollupType rollupType, Region region, Payment$CreationMechanism payment$CreationMechanism, RollupData rollupData, String str8, String str9, String str10, String str11, TransactionType transactionType, Money money5, Money money6, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.orientation = orientation;
        this.role = role;
        this.sender_id = str2;
        this.recipient_id = str3;
        this.state = paymentState;
        this.amount = money;
        this.boost_amount = money2;
        this.sender_amount = money3;
        this.recipient_amount = money4;
        this.created_at = l;
        this.updated_at = l2;
        this.scheduled_for = l3;
        this.captured_at = l4;
        this.refunded_at = l5;
        this.paid_out_at = l6;
        this.history_data = paymentHistoryData;
        this.render_data = str4;
        this.note = str5;
        this.display_date = l7;
        this.outstanding_until = l8;
        this.hidden_until = l9;
        this.external_id = str6;
        this.payment_schedule_token = str7;
        this.scenario_plan_source = scenarioPlanSource;
        this.avatar_overlay_size = l10;
        this.rollup_type = rollupType;
        this.customer_region = region;
        this.creation_mechanism = payment$CreationMechanism;
        this.rollup_data = rollupData;
        this.payment_type = str8;
        this.gifted_investment_entity_token = str9;
        this.lending_loan_token = str10;
        this.associated_payment_token = str11;
        this.transaction_type = transactionType;
        this.impact = money5;
        this.current_balance = money6;
        this.is_business_transaction = bool;
        this.show_customer_tagging_prompt = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiPayment)) {
            return false;
        }
        UiPayment uiPayment = (UiPayment) obj;
        return Intrinsics.areEqual(unknownFields(), uiPayment.unknownFields()) && Intrinsics.areEqual(this.token, uiPayment.token) && this.orientation == uiPayment.orientation && this.role == uiPayment.role && Intrinsics.areEqual(this.sender_id, uiPayment.sender_id) && Intrinsics.areEqual(this.recipient_id, uiPayment.recipient_id) && this.state == uiPayment.state && Intrinsics.areEqual(this.amount, uiPayment.amount) && Intrinsics.areEqual(this.boost_amount, uiPayment.boost_amount) && Intrinsics.areEqual(this.sender_amount, uiPayment.sender_amount) && Intrinsics.areEqual(this.recipient_amount, uiPayment.recipient_amount) && Intrinsics.areEqual(this.created_at, uiPayment.created_at) && Intrinsics.areEqual(this.updated_at, uiPayment.updated_at) && Intrinsics.areEqual(this.scheduled_for, uiPayment.scheduled_for) && Intrinsics.areEqual(this.captured_at, uiPayment.captured_at) && Intrinsics.areEqual(this.refunded_at, uiPayment.refunded_at) && Intrinsics.areEqual(this.paid_out_at, uiPayment.paid_out_at) && Intrinsics.areEqual(this.history_data, uiPayment.history_data) && Intrinsics.areEqual(this.render_data, uiPayment.render_data) && Intrinsics.areEqual(this.note, uiPayment.note) && Intrinsics.areEqual(this.display_date, uiPayment.display_date) && Intrinsics.areEqual(this.outstanding_until, uiPayment.outstanding_until) && Intrinsics.areEqual(this.hidden_until, uiPayment.hidden_until) && Intrinsics.areEqual(this.external_id, uiPayment.external_id) && Intrinsics.areEqual(this.payment_schedule_token, uiPayment.payment_schedule_token) && this.scenario_plan_source == uiPayment.scenario_plan_source && Intrinsics.areEqual(this.avatar_overlay_size, uiPayment.avatar_overlay_size) && this.rollup_type == uiPayment.rollup_type && this.customer_region == uiPayment.customer_region && this.creation_mechanism == uiPayment.creation_mechanism && Intrinsics.areEqual(this.rollup_data, uiPayment.rollup_data) && Intrinsics.areEqual(this.payment_type, uiPayment.payment_type) && Intrinsics.areEqual(this.gifted_investment_entity_token, uiPayment.gifted_investment_entity_token) && Intrinsics.areEqual(this.lending_loan_token, uiPayment.lending_loan_token) && Intrinsics.areEqual(this.associated_payment_token, uiPayment.associated_payment_token) && this.transaction_type == uiPayment.transaction_type && Intrinsics.areEqual(this.impact, uiPayment.impact) && Intrinsics.areEqual(this.current_balance, uiPayment.current_balance) && Intrinsics.areEqual(this.is_business_transaction, uiPayment.is_business_transaction) && Intrinsics.areEqual(this.show_customer_tagging_prompt, uiPayment.show_customer_tagging_prompt);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Orientation orientation = this.orientation;
        int hashCode3 = (hashCode2 + (orientation != null ? orientation.hashCode() : 0)) * 37;
        Role role = this.role;
        int hashCode4 = (hashCode3 + (role != null ? role.hashCode() : 0)) * 37;
        String str2 = this.sender_id;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.recipient_id;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        PaymentState paymentState = this.state;
        int hashCode7 = (hashCode6 + (paymentState != null ? paymentState.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode8 = (hashCode7 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.boost_amount;
        int hashCode9 = (hashCode8 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.sender_amount;
        int hashCode10 = (hashCode9 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.recipient_amount;
        int hashCode11 = (hashCode10 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode12 = (hashCode11 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode13 = (hashCode12 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.scheduled_for;
        int hashCode14 = (hashCode13 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.captured_at;
        int hashCode15 = (hashCode14 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.refunded_at;
        int hashCode16 = (hashCode15 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        Long l6 = this.paid_out_at;
        int hashCode17 = (hashCode16 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        PaymentHistoryData paymentHistoryData = this.history_data;
        int hashCode18 = (hashCode17 + (paymentHistoryData != null ? paymentHistoryData.hashCode() : 0)) * 37;
        String str4 = this.render_data;
        int hashCode19 = (hashCode18 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.note;
        int hashCode20 = (hashCode19 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l7 = this.display_date;
        int hashCode21 = (hashCode20 + (l7 != null ? Long.hashCode(l7.longValue()) : 0)) * 37;
        Long l8 = this.outstanding_until;
        int hashCode22 = (hashCode21 + (l8 != null ? Long.hashCode(l8.longValue()) : 0)) * 37;
        Long l9 = this.hidden_until;
        int hashCode23 = (hashCode22 + (l9 != null ? Long.hashCode(l9.longValue()) : 0)) * 37;
        String str6 = this.external_id;
        int hashCode24 = (hashCode23 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.payment_schedule_token;
        int hashCode25 = (hashCode24 + (str7 != null ? str7.hashCode() : 0)) * 37;
        ScenarioPlanSource scenarioPlanSource = this.scenario_plan_source;
        int hashCode26 = (hashCode25 + (scenarioPlanSource != null ? scenarioPlanSource.hashCode() : 0)) * 37;
        Long l10 = this.avatar_overlay_size;
        int hashCode27 = (hashCode26 + (l10 != null ? Long.hashCode(l10.longValue()) : 0)) * 37;
        RollupType rollupType = this.rollup_type;
        int hashCode28 = (hashCode27 + (rollupType != null ? rollupType.hashCode() : 0)) * 37;
        Region region = this.customer_region;
        int hashCode29 = (hashCode28 + (region != null ? region.hashCode() : 0)) * 37;
        Payment$CreationMechanism payment$CreationMechanism = this.creation_mechanism;
        int hashCode30 = (hashCode29 + (payment$CreationMechanism != null ? payment$CreationMechanism.hashCode() : 0)) * 37;
        RollupData rollupData = this.rollup_data;
        int hashCode31 = (hashCode30 + (rollupData != null ? rollupData.hashCode() : 0)) * 37;
        String str8 = this.payment_type;
        int hashCode32 = (hashCode31 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.gifted_investment_entity_token;
        int hashCode33 = (hashCode32 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.lending_loan_token;
        int hashCode34 = (hashCode33 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.associated_payment_token;
        int hashCode35 = (hashCode34 + (str11 != null ? str11.hashCode() : 0)) * 37;
        TransactionType transactionType = this.transaction_type;
        int hashCode36 = (hashCode35 + (transactionType != null ? transactionType.hashCode() : 0)) * 37;
        Money money5 = this.impact;
        int hashCode37 = (hashCode36 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.current_balance;
        int hashCode38 = (hashCode37 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Boolean bool = this.is_business_transaction;
        int hashCode39 = (hashCode38 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.show_customer_tagging_prompt;
        int hashCode40 = hashCode39 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode40;
        return hashCode40;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.orientation = this.orientation;
        builder.role = this.role;
        builder.sender_id = this.sender_id;
        builder.recipient_id = this.recipient_id;
        builder.state = this.state;
        builder.amount = this.amount;
        builder.boost_amount = this.boost_amount;
        builder.sender_amount = this.sender_amount;
        builder.recipient_amount = this.recipient_amount;
        builder.created_at = this.created_at;
        builder.updated_at = this.updated_at;
        builder.scheduled_for = this.scheduled_for;
        builder.captured_at = this.captured_at;
        builder.refunded_at = this.refunded_at;
        builder.paid_out_at = this.paid_out_at;
        builder.history_data = this.history_data;
        builder.render_data = this.render_data;
        builder.note = this.note;
        builder.display_date = this.display_date;
        builder.outstanding_until = this.outstanding_until;
        builder.hidden_until = this.hidden_until;
        builder.external_id = this.external_id;
        builder.payment_schedule_token = this.payment_schedule_token;
        builder.scenario_plan_source = this.scenario_plan_source;
        builder.avatar_overlay_size = this.avatar_overlay_size;
        builder.rollup_type = this.rollup_type;
        builder.customer_region = this.customer_region;
        builder.creation_mechanism = this.creation_mechanism;
        builder.rollup_data = this.rollup_data;
        builder.payment_type = this.payment_type;
        builder.gifted_investment_entity_token = this.gifted_investment_entity_token;
        builder.lending_loan_token = this.lending_loan_token;
        builder.associated_payment_token = this.associated_payment_token;
        builder.transaction_type = this.transaction_type;
        builder.impact = this.impact;
        builder.current_balance = this.current_balance;
        builder.is_business_transaction = this.is_business_transaction;
        builder.show_customer_tagging_prompt = this.show_customer_tagging_prompt;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Orientation orientation = this.orientation;
        if (orientation != null) {
            arrayList.add("orientation=" + orientation);
        }
        Role role = this.role;
        if (role != null) {
            arrayList.add("role=" + role);
        }
        String str2 = this.sender_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_id=", arrayList);
        }
        String str3 = this.recipient_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "recipient_id=", arrayList);
        }
        PaymentState paymentState = this.state;
        if (paymentState != null) {
            arrayList.add("state=" + paymentState);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Money money2 = this.boost_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("boost_amount=", money2, arrayList);
        }
        Money money3 = this.sender_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("sender_amount=", money3, arrayList);
        }
        Money money4 = this.recipient_amount;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("recipient_amount=", money4, arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        Long l3 = this.scheduled_for;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_for=", l3, arrayList);
        }
        Long l4 = this.captured_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("captured_at=", l4, arrayList);
        }
        Long l5 = this.refunded_at;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refunded_at=", l5, arrayList);
        }
        Long l6 = this.paid_out_at;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("paid_out_at=", l6, arrayList);
        }
        PaymentHistoryData paymentHistoryData = this.history_data;
        if (paymentHistoryData != null) {
            arrayList.add("history_data=" + paymentHistoryData);
        }
        if (this.render_data != null) {
            arrayList.add("render_data=██");
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        Long l7 = this.display_date;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l7, arrayList);
        }
        Long l8 = this.outstanding_until;
        if (l8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("outstanding_until=", l8, arrayList);
        }
        Long l9 = this.hidden_until;
        if (l9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hidden_until=", l9, arrayList);
        }
        String str4 = this.external_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "external_id=", arrayList);
        }
        String str5 = this.payment_schedule_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "payment_schedule_token=", arrayList);
        }
        ScenarioPlanSource scenarioPlanSource = this.scenario_plan_source;
        if (scenarioPlanSource != null) {
            arrayList.add("scenario_plan_source=" + scenarioPlanSource);
        }
        Long l10 = this.avatar_overlay_size;
        if (l10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("avatar_overlay_size=", l10, arrayList);
        }
        RollupType rollupType = this.rollup_type;
        if (rollupType != null) {
            arrayList.add("rollup_type=" + rollupType);
        }
        Region region = this.customer_region;
        if (region != null) {
            arrayList.add("customer_region=" + region);
        }
        Payment$CreationMechanism payment$CreationMechanism = this.creation_mechanism;
        if (payment$CreationMechanism != null) {
            arrayList.add("creation_mechanism=" + payment$CreationMechanism);
        }
        RollupData rollupData = this.rollup_data;
        if (rollupData != null) {
            arrayList.add("rollup_data=" + rollupData);
        }
        String str6 = this.payment_type;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "payment_type=", arrayList);
        }
        String str7 = this.gifted_investment_entity_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "gifted_investment_entity_token=", arrayList);
        }
        String str8 = this.lending_loan_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "lending_loan_token=", arrayList);
        }
        String str9 = this.associated_payment_token;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "associated_payment_token=", arrayList);
        }
        TransactionType transactionType = this.transaction_type;
        if (transactionType != null) {
            arrayList.add("transaction_type=" + transactionType);
        }
        Money money5 = this.impact;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("impact=", money5, arrayList);
        }
        Money money6 = this.current_balance;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("current_balance=", money6, arrayList);
        }
        Boolean bool = this.is_business_transaction;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business_transaction=", bool, arrayList);
        }
        Boolean bool2 = this.show_customer_tagging_prompt;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_customer_tagging_prompt=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiPayment{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiPayment$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/UiPayment$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/UiPayment;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/UiPayment;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ UiPayment build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
