package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker;
import com.squareup.protos.franklin.common.Orientation;
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

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\t102345678R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0005R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0005R\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0005R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00069"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$Builder;", "", "header", "Ljava/lang/String;", "Lcom/squareup/protos/common/Money;", "sender_amount", "Lcom/squareup/protos/common/Money;", "sender_label", "", "show_arrows", "Ljava/lang/Boolean;", "receiver_amount", "receiver_label", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyField;", "focused_field", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyField;", "exchange_rate_label", "Lcom/squareup/protos/franklin/api/BlockerAction;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "instrument_token", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "recipient", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$AmountEntryType;", "amount_entry_type", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$AmountEntryType;", "note_prefill_value", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "confirm_dialog_config", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType;", "focused_currency_field_type", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$RoundingLogicType;", "rounding_logic_type", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$RoundingLogicType;", "Lcom/squareup/protos/franklin/common/Orientation;", "orientation", "Lcom/squareup/protos/franklin/common/Orientation;", "accessibility_header", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier;", "cost_tiers", "Ljava/util/List;", "Companion", "Builder", "FocusedCurrencyField", "CostTier", "CustomerDetails", "AmountEntryType", "ConfirmDialogConfig", "FocusedCurrencyFieldType", "RoundingLogicType", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiCurrencyAmountEntryBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MultiCurrencyAmountEntryBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 20)
    public final String accessibility_header;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$AmountEntryType#ADAPTER", schemaIndex = 13, tag = 14)
    public final AmountEntryType amount_entry_type;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig#ADAPTER", schemaIndex = 15, tag = 16)
    public final ConfirmDialogConfig confirm_dialog_config;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CostTier#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    public final List<CostTier> cost_tiers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String exchange_rate_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType#ADAPTER", schemaIndex = 16, tag = 17)
    public final FocusedCurrencyFieldType focused_currency_field_type;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$FocusedCurrencyField#ADAPTER", schemaIndex = 6, tag = 7)
    public final FocusedCurrencyField focused_field;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    public final String instrument_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 14, tag = 15)
    public final String note_prefill_value;

    @WireField(adapter = "com.squareup.protos.franklin.common.Orientation#ADAPTER", schemaIndex = 18, tag = 19)
    public final Orientation orientation;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 9, tag = 10)
    public final BlockerAction primary_action;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 5)
    public final Money receiver_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String receiver_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CustomerDetails#ADAPTER", schemaIndex = 12, tag = 13)
    public final CustomerDetails recipient;

    @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$RoundingLogicType#ADAPTER", schemaIndex = 17, tag = 18)
    public final RoundingLogicType rounding_logic_type;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 10, tag = 11)
    public final BlockerAction secondary_action;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
    public final Money sender_amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String sender_label;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean show_arrows;

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010'J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0006J\b\u0010(\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker;", "<init>", "()V", "header", "", "sender_amount", "Lcom/squareup/protos/common/Money;", "sender_label", "show_arrows", "", "Ljava/lang/Boolean;", "receiver_amount", "receiver_label", "focused_field", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyField;", "exchange_rate_label", "cost_tiers", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "instrument_token", "recipient", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "amount_entry_type", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$AmountEntryType;", "note_prefill_value", "confirm_dialog_config", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "focused_currency_field_type", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType;", "rounding_logic_type", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$RoundingLogicType;", "orientation", "Lcom/squareup/protos/franklin/common/Orientation;", "accessibility_header", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String accessibility_header;
        public AmountEntryType amount_entry_type;
        public ConfirmDialogConfig confirm_dialog_config;
        public List<CostTier> cost_tiers = EmptyList.INSTANCE;
        public String exchange_rate_label;
        public FocusedCurrencyFieldType focused_currency_field_type;
        public FocusedCurrencyField focused_field;
        public String header;
        public String instrument_token;
        public String note_prefill_value;
        public Orientation orientation;
        public BlockerAction primary_action;
        public Money receiver_amount;
        public String receiver_label;
        public CustomerDetails recipient;
        public RoundingLogicType rounding_logic_type;
        public BlockerAction secondary_action;
        public Money sender_amount;
        public String sender_label;
        public Boolean show_arrows;

        public final Builder accessibility_header(String accessibility_header) {
            this.accessibility_header = accessibility_header;
            return this;
        }

        public final Builder amount_entry_type(AmountEntryType amount_entry_type) {
            this.amount_entry_type = amount_entry_type;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public MultiCurrencyAmountEntryBlocker build() {
            return new MultiCurrencyAmountEntryBlocker(this.header, this.sender_amount, this.sender_label, this.show_arrows, this.receiver_amount, this.receiver_label, this.focused_field, this.exchange_rate_label, this.cost_tiers, this.primary_action, this.secondary_action, this.instrument_token, this.recipient, this.amount_entry_type, this.note_prefill_value, this.confirm_dialog_config, this.focused_currency_field_type, this.rounding_logic_type, this.orientation, this.accessibility_header, buildUnknownFields());
        }

        public final Builder confirm_dialog_config(ConfirmDialogConfig confirm_dialog_config) {
            this.confirm_dialog_config = confirm_dialog_config;
            return this;
        }

        public final Builder cost_tiers(List<CostTier> cost_tiers) {
            cost_tiers.getClass();
            TransactorKt.checkElementsNotNull(cost_tiers);
            this.cost_tiers = cost_tiers;
            return this;
        }

        public final Builder exchange_rate_label(String exchange_rate_label) {
            this.exchange_rate_label = exchange_rate_label;
            return this;
        }

        public final Builder focused_currency_field_type(FocusedCurrencyFieldType focused_currency_field_type) {
            this.focused_currency_field_type = focused_currency_field_type;
            return this;
        }

        public final Builder focused_field(FocusedCurrencyField focused_field) {
            this.focused_field = focused_field;
            return this;
        }

        public final Builder header(String header) {
            this.header = header;
            return this;
        }

        public final Builder instrument_token(String instrument_token) {
            this.instrument_token = instrument_token;
            return this;
        }

        public final Builder note_prefill_value(String note_prefill_value) {
            this.note_prefill_value = note_prefill_value;
            return this;
        }

        public final Builder orientation(Orientation orientation) {
            this.orientation = orientation;
            return this;
        }

        public final Builder primary_action(BlockerAction primary_action) {
            this.primary_action = primary_action;
            return this;
        }

        public final Builder receiver_amount(Money receiver_amount) {
            this.receiver_amount = receiver_amount;
            return this;
        }

        public final Builder receiver_label(String receiver_label) {
            this.receiver_label = receiver_label;
            return this;
        }

        public final Builder recipient(CustomerDetails recipient) {
            this.recipient = recipient;
            return this;
        }

        public final Builder rounding_logic_type(RoundingLogicType rounding_logic_type) {
            this.rounding_logic_type = rounding_logic_type;
            return this;
        }

        public final Builder secondary_action(BlockerAction secondary_action) {
            this.secondary_action = secondary_action;
            return this;
        }

        public final Builder sender_amount(Money sender_amount) {
            this.sender_amount = sender_amount;
            return this;
        }

        public final Builder sender_label(String sender_label) {
            this.sender_label = sender_label;
            return this;
        }

        public final Builder show_arrows(Boolean show_arrows) {
            this.show_arrows = show_arrows;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MultiCurrencyAmountEntryBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v57 */
            /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v60 */
            /* JADX WARN: Type inference failed for: r0v61 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public MultiCurrencyAmountEntryBlocker decode(ProtoReader reader) {
                String str;
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField;
                String str2;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                String str3 = null;
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                String str4 = null;
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField2 = null;
                String str5 = null;
                Object obj5 = null;
                Object obj6 = null;
                String str6 = null;
                MultiCurrencyAmountEntryBlocker.AmountEntryType amountEntryType = null;
                String str7 = null;
                String str8 = null;
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType focusedCurrencyFieldType = null;
                MultiCurrencyAmountEntryBlocker.RoundingLogicType roundingLogicType = null;
                Orientation orientation = null;
                String str9 = null;
                Boolean bool = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new MultiCurrencyAmountEntryBlocker(str3, (Money) obj2, str8, bool, (Money) obj4, str4, focusedCurrencyField2, str5, m, (BlockerAction) obj5, (BlockerAction) obj6, str6, (MultiCurrencyAmountEntryBlocker.CustomerDetails) obj, amountEntryType, str7, (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig) obj3, focusedCurrencyFieldType, roundingLogicType, orientation, str9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj2);
                            decode = str3;
                            break;
                        case 3:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 4:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        case 5:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            decode = str3;
                            break;
                        case 6:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 7:
                            str = str4;
                            focusedCurrencyField = focusedCurrencyField2;
                            str2 = str5;
                            try {
                                focusedCurrencyField2 = MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.decode(reader);
                                str4 = str;
                                str5 = str2;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 9:
                            str = str4;
                            focusedCurrencyField = focusedCurrencyField2;
                            str2 = str5;
                            m.add(MultiCurrencyAmountEntryBlocker.CostTier.ADAPTER.decode(reader));
                            decode = str3;
                            str4 = str;
                            focusedCurrencyField2 = focusedCurrencyField;
                            str5 = str2;
                            break;
                        case 10:
                            obj5 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj5);
                            decode = str3;
                            break;
                        case 11:
                            obj6 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj6);
                            decode = str3;
                            break;
                        case 12:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 13:
                            obj = TransactorKt.decodeMessageOrMerge(MultiCurrencyAmountEntryBlocker.CustomerDetails.ADAPTER, reader, obj);
                            decode = str3;
                            break;
                        case 14:
                            str = str4;
                            focusedCurrencyField = focusedCurrencyField2;
                            str2 = str5;
                            try {
                                amountEntryType = MultiCurrencyAmountEntryBlocker.AmountEntryType.ADAPTER.decode(reader);
                                str4 = str;
                                focusedCurrencyField2 = focusedCurrencyField;
                                str5 = str2;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 15:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 16:
                            obj3 = TransactorKt.decodeMessageOrMerge(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ADAPTER, reader, obj3);
                            decode = str3;
                            break;
                        case 17:
                            str = str4;
                            focusedCurrencyField = focusedCurrencyField2;
                            str2 = str5;
                            try {
                                focusedCurrencyFieldType = MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType.ADAPTER.decode(reader);
                                str4 = str;
                                focusedCurrencyField2 = focusedCurrencyField;
                                str5 = str2;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 18:
                            str = str4;
                            focusedCurrencyField = focusedCurrencyField2;
                            str2 = str5;
                            try {
                                roundingLogicType = MultiCurrencyAmountEntryBlocker.RoundingLogicType.ADAPTER.decode(reader);
                                str4 = str;
                                focusedCurrencyField2 = focusedCurrencyField;
                                str5 = str2;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 19:
                            try {
                                orientation = Orientation.ADAPTER.decode(reader);
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                str = str4;
                                focusedCurrencyField = focusedCurrencyField2;
                                str2 = str5;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 20:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            str = str4;
                            focusedCurrencyField = focusedCurrencyField2;
                            str2 = str5;
                            decode = str3;
                            str4 = str;
                            focusedCurrencyField2 = focusedCurrencyField;
                            str5 = str2;
                            break;
                    }
                    str3 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.header);
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.sender_amount);
                protoAdapter2.encodeWithTag(writer, 3, value.sender_label);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.show_arrows);
                protoAdapter3.encodeWithTag(writer, 5, value.receiver_amount);
                protoAdapter2.encodeWithTag(writer, 6, value.receiver_label);
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.encodeWithTag(writer, 7, value.focused_field);
                protoAdapter2.encodeWithTag(writer, 8, value.exchange_rate_label);
                MultiCurrencyAmountEntryBlocker.CostTier.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.cost_tiers);
                ProtoAdapter protoAdapter4 = BlockerAction.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 10, value.primary_action);
                protoAdapter4.encodeWithTag(writer, 11, value.secondary_action);
                protoAdapter2.encodeWithTag(writer, 12, value.instrument_token);
                MultiCurrencyAmountEntryBlocker.CustomerDetails.ADAPTER.encodeWithTag(writer, 13, value.recipient);
                MultiCurrencyAmountEntryBlocker.AmountEntryType.ADAPTER.encodeWithTag(writer, 14, value.amount_entry_type);
                protoAdapter2.encodeWithTag(writer, 15, value.note_prefill_value);
                MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ADAPTER.encodeWithTag(writer, 16, value.confirm_dialog_config);
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType.ADAPTER.encodeWithTag(writer, 17, value.focused_currency_field_type);
                MultiCurrencyAmountEntryBlocker.RoundingLogicType.ADAPTER.encodeWithTag(writer, 18, value.rounding_logic_type);
                Orientation.ADAPTER.encodeWithTag(writer, 19, value.orientation);
                protoAdapter2.encodeWithTag(writer, 20, value.accessibility_header);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MultiCurrencyAmountEntryBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.header) + size$okio;
                ProtoAdapter protoAdapter3 = Money.ADAPTER;
                int encodedSizeWithTag2 = MultiCurrencyAmountEntryBlocker.CostTier.ADAPTER.asRepeated().encodedSizeWithTag(9, value.cost_tiers) + protoAdapter2.encodedSizeWithTag(8, value.exchange_rate_label) + MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.encodedSizeWithTag(7, value.focused_field) + protoAdapter2.encodedSizeWithTag(6, value.receiver_label) + protoAdapter3.encodedSizeWithTag(5, value.receiver_amount) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.show_arrows) + protoAdapter2.encodedSizeWithTag(3, value.sender_label) + protoAdapter3.encodedSizeWithTag(2, value.sender_amount) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = BlockerAction.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(20, value.accessibility_header) + Orientation.ADAPTER.encodedSizeWithTag(19, value.orientation) + MultiCurrencyAmountEntryBlocker.RoundingLogicType.ADAPTER.encodedSizeWithTag(18, value.rounding_logic_type) + MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType.ADAPTER.encodedSizeWithTag(17, value.focused_currency_field_type) + MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ADAPTER.encodedSizeWithTag(16, value.confirm_dialog_config) + protoAdapter2.encodedSizeWithTag(15, value.note_prefill_value) + MultiCurrencyAmountEntryBlocker.AmountEntryType.ADAPTER.encodedSizeWithTag(14, value.amount_entry_type) + MultiCurrencyAmountEntryBlocker.CustomerDetails.ADAPTER.encodedSizeWithTag(13, value.recipient) + protoAdapter2.encodedSizeWithTag(12, value.instrument_token) + protoAdapter4.encodedSizeWithTag(11, value.secondary_action) + protoAdapter4.encodedSizeWithTag(10, value.primary_action) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MultiCurrencyAmountEntryBlocker redact(MultiCurrencyAmountEntryBlocker value) {
                value.getClass();
                Money money = value.sender_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.receiver_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.cost_tiers, MultiCurrencyAmountEntryBlocker.CostTier.ADAPTER);
                BlockerAction blockerAction = value.primary_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                BlockerAction blockerAction3 = value.secondary_action;
                BlockerAction blockerAction4 = blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null;
                MultiCurrencyAmountEntryBlocker.CustomerDetails customerDetails = value.recipient;
                MultiCurrencyAmountEntryBlocker.CustomerDetails customerDetails2 = customerDetails != null ? (MultiCurrencyAmountEntryBlocker.CustomerDetails) MultiCurrencyAmountEntryBlocker.CustomerDetails.ADAPTER.redact(customerDetails) : null;
                MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig confirmDialogConfig = value.confirm_dialog_config;
                MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig confirmDialogConfig2 = confirmDialogConfig != null ? (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig) MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ADAPTER.redact(confirmDialogConfig) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.header;
                String str2 = value.sender_label;
                Boolean bool = value.show_arrows;
                String str3 = value.receiver_label;
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField focusedCurrencyField = value.focused_field;
                String str4 = value.exchange_rate_label;
                String str5 = value.instrument_token;
                MultiCurrencyAmountEntryBlocker.AmountEntryType amountEntryType = value.amount_entry_type;
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType focusedCurrencyFieldType = value.focused_currency_field_type;
                MultiCurrencyAmountEntryBlocker.RoundingLogicType roundingLogicType = value.rounding_logic_type;
                Orientation orientation = value.orientation;
                String str6 = value.accessibility_header;
                byteString.getClass();
                return new MultiCurrencyAmountEntryBlocker(str, money2, str2, bool, money4, str3, focusedCurrencyField, str4, m1169redactElements, blockerAction2, blockerAction4, str5, customerDetails2, amountEntryType, null, confirmDialogConfig2, focusedCurrencyFieldType, roundingLogicType, orientation, str6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 20, value.accessibility_header);
                Orientation.ADAPTER.encodeWithTag(writer, 19, value.orientation);
                MultiCurrencyAmountEntryBlocker.RoundingLogicType.ADAPTER.encodeWithTag(writer, 18, value.rounding_logic_type);
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType.ADAPTER.encodeWithTag(writer, 17, value.focused_currency_field_type);
                MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ADAPTER.encodeWithTag(writer, 16, value.confirm_dialog_config);
                protoAdapter2.encodeWithTag(writer, 15, value.note_prefill_value);
                MultiCurrencyAmountEntryBlocker.AmountEntryType.ADAPTER.encodeWithTag(writer, 14, value.amount_entry_type);
                MultiCurrencyAmountEntryBlocker.CustomerDetails.ADAPTER.encodeWithTag(writer, 13, value.recipient);
                protoAdapter2.encodeWithTag(writer, 12, value.instrument_token);
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 11, value.secondary_action);
                protoAdapter3.encodeWithTag(writer, 10, value.primary_action);
                MultiCurrencyAmountEntryBlocker.CostTier.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.cost_tiers);
                protoAdapter2.encodeWithTag(writer, 8, value.exchange_rate_label);
                MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.ADAPTER.encodeWithTag(writer, 7, value.focused_field);
                protoAdapter2.encodeWithTag(writer, 6, value.receiver_label);
                ProtoAdapter protoAdapter4 = Money.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 5, value.receiver_amount);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.show_arrows);
                protoAdapter2.encodeWithTag(writer, 3, value.sender_label);
                protoAdapter4.encodeWithTag(writer, 2, value.sender_amount);
                protoAdapter2.encodeWithTag(writer, 1, value.header);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiCurrencyAmountEntryBlocker(String str, Money money, String str2, Boolean bool, Money money2, String str3, FocusedCurrencyField focusedCurrencyField, String str4, List list, BlockerAction blockerAction, BlockerAction blockerAction2, String str5, CustomerDetails customerDetails, AmountEntryType amountEntryType, String str6, ConfirmDialogConfig confirmDialogConfig, FocusedCurrencyFieldType focusedCurrencyFieldType, RoundingLogicType roundingLogicType, Orientation orientation, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header = str;
        this.sender_amount = money;
        this.sender_label = str2;
        this.show_arrows = bool;
        this.receiver_amount = money2;
        this.receiver_label = str3;
        this.focused_field = focusedCurrencyField;
        this.exchange_rate_label = str4;
        this.primary_action = blockerAction;
        this.secondary_action = blockerAction2;
        this.instrument_token = str5;
        this.recipient = customerDetails;
        this.amount_entry_type = amountEntryType;
        this.note_prefill_value = str6;
        this.confirm_dialog_config = confirmDialogConfig;
        this.focused_currency_field_type = focusedCurrencyFieldType;
        this.rounding_logic_type = roundingLogicType;
        this.orientation = orientation;
        this.accessibility_header = str7;
        this.cost_tiers = TransactorKt.immutableCopyOf("cost_tiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCurrencyAmountEntryBlocker)) {
            return false;
        }
        MultiCurrencyAmountEntryBlocker multiCurrencyAmountEntryBlocker = (MultiCurrencyAmountEntryBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), multiCurrencyAmountEntryBlocker.unknownFields()) && Intrinsics.areEqual(this.header, multiCurrencyAmountEntryBlocker.header) && Intrinsics.areEqual(this.sender_amount, multiCurrencyAmountEntryBlocker.sender_amount) && Intrinsics.areEqual(this.sender_label, multiCurrencyAmountEntryBlocker.sender_label) && Intrinsics.areEqual(this.show_arrows, multiCurrencyAmountEntryBlocker.show_arrows) && Intrinsics.areEqual(this.receiver_amount, multiCurrencyAmountEntryBlocker.receiver_amount) && Intrinsics.areEqual(this.receiver_label, multiCurrencyAmountEntryBlocker.receiver_label) && this.focused_field == multiCurrencyAmountEntryBlocker.focused_field && Intrinsics.areEqual(this.exchange_rate_label, multiCurrencyAmountEntryBlocker.exchange_rate_label) && Intrinsics.areEqual(this.cost_tiers, multiCurrencyAmountEntryBlocker.cost_tiers) && Intrinsics.areEqual(this.primary_action, multiCurrencyAmountEntryBlocker.primary_action) && Intrinsics.areEqual(this.secondary_action, multiCurrencyAmountEntryBlocker.secondary_action) && Intrinsics.areEqual(this.instrument_token, multiCurrencyAmountEntryBlocker.instrument_token) && Intrinsics.areEqual(this.recipient, multiCurrencyAmountEntryBlocker.recipient) && this.amount_entry_type == multiCurrencyAmountEntryBlocker.amount_entry_type && Intrinsics.areEqual(this.note_prefill_value, multiCurrencyAmountEntryBlocker.note_prefill_value) && Intrinsics.areEqual(this.confirm_dialog_config, multiCurrencyAmountEntryBlocker.confirm_dialog_config) && this.focused_currency_field_type == multiCurrencyAmountEntryBlocker.focused_currency_field_type && this.rounding_logic_type == multiCurrencyAmountEntryBlocker.rounding_logic_type && this.orientation == multiCurrencyAmountEntryBlocker.orientation && Intrinsics.areEqual(this.accessibility_header, multiCurrencyAmountEntryBlocker.accessibility_header);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.sender_amount;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.sender_label;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.show_arrows;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Money money2 = this.receiver_amount;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str3 = this.receiver_label;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        FocusedCurrencyField focusedCurrencyField = this.focused_field;
        int hashCode8 = (hashCode7 + (focusedCurrencyField != null ? focusedCurrencyField.hashCode() : 0)) * 37;
        String str4 = this.exchange_rate_label;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.cost_tiers);
        BlockerAction blockerAction = this.primary_action;
        int hashCode9 = (m + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        BlockerAction blockerAction2 = this.secondary_action;
        int hashCode10 = (hashCode9 + (blockerAction2 != null ? blockerAction2.hashCode() : 0)) * 37;
        String str5 = this.instrument_token;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        CustomerDetails customerDetails = this.recipient;
        int hashCode12 = (hashCode11 + (customerDetails != null ? customerDetails.hashCode() : 0)) * 37;
        AmountEntryType amountEntryType = this.amount_entry_type;
        int hashCode13 = (hashCode12 + (amountEntryType != null ? amountEntryType.hashCode() : 0)) * 37;
        String str6 = this.note_prefill_value;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 37;
        ConfirmDialogConfig confirmDialogConfig = this.confirm_dialog_config;
        int hashCode15 = (hashCode14 + (confirmDialogConfig != null ? confirmDialogConfig.hashCode() : 0)) * 37;
        FocusedCurrencyFieldType focusedCurrencyFieldType = this.focused_currency_field_type;
        int hashCode16 = (hashCode15 + (focusedCurrencyFieldType != null ? focusedCurrencyFieldType.hashCode() : 0)) * 37;
        RoundingLogicType roundingLogicType = this.rounding_logic_type;
        int hashCode17 = (hashCode16 + (roundingLogicType != null ? roundingLogicType.hashCode() : 0)) * 37;
        Orientation orientation = this.orientation;
        int hashCode18 = (hashCode17 + (orientation != null ? orientation.hashCode() : 0)) * 37;
        String str7 = this.accessibility_header;
        int hashCode19 = hashCode18 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header = this.header;
        builder.sender_amount = this.sender_amount;
        builder.sender_label = this.sender_label;
        builder.show_arrows = this.show_arrows;
        builder.receiver_amount = this.receiver_amount;
        builder.receiver_label = this.receiver_label;
        builder.focused_field = this.focused_field;
        builder.exchange_rate_label = this.exchange_rate_label;
        builder.cost_tiers = this.cost_tiers;
        builder.primary_action = this.primary_action;
        builder.secondary_action = this.secondary_action;
        builder.instrument_token = this.instrument_token;
        builder.recipient = this.recipient;
        builder.amount_entry_type = this.amount_entry_type;
        builder.note_prefill_value = this.note_prefill_value;
        builder.confirm_dialog_config = this.confirm_dialog_config;
        builder.focused_currency_field_type = this.focused_currency_field_type;
        builder.rounding_logic_type = this.rounding_logic_type;
        builder.orientation = this.orientation;
        builder.accessibility_header = this.accessibility_header;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
        }
        Money money = this.sender_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("sender_amount=", money, arrayList);
        }
        String str2 = this.sender_label;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "sender_label=", arrayList);
        }
        Boolean bool = this.show_arrows;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_arrows=", bool, arrayList);
        }
        Money money2 = this.receiver_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("receiver_amount=", money2, arrayList);
        }
        String str3 = this.receiver_label;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "receiver_label=", arrayList);
        }
        FocusedCurrencyField focusedCurrencyField = this.focused_field;
        if (focusedCurrencyField != null) {
            arrayList.add("focused_field=" + focusedCurrencyField);
        }
        String str4 = this.exchange_rate_label;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "exchange_rate_label=", arrayList);
        }
        if (!this.cost_tiers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cost_tiers=", arrayList, this.cost_tiers);
        }
        BlockerAction blockerAction = this.primary_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_action=", blockerAction, arrayList);
        }
        BlockerAction blockerAction2 = this.secondary_action;
        if (blockerAction2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_action=", blockerAction2, arrayList);
        }
        String str5 = this.instrument_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "instrument_token=", arrayList);
        }
        CustomerDetails customerDetails = this.recipient;
        if (customerDetails != null) {
            arrayList.add("recipient=" + customerDetails);
        }
        AmountEntryType amountEntryType = this.amount_entry_type;
        if (amountEntryType != null) {
            arrayList.add("amount_entry_type=" + amountEntryType);
        }
        if (this.note_prefill_value != null) {
            arrayList.add("note_prefill_value=██");
        }
        ConfirmDialogConfig confirmDialogConfig = this.confirm_dialog_config;
        if (confirmDialogConfig != null) {
            arrayList.add("confirm_dialog_config=" + confirmDialogConfig);
        }
        FocusedCurrencyFieldType focusedCurrencyFieldType = this.focused_currency_field_type;
        if (focusedCurrencyFieldType != null) {
            arrayList.add("focused_currency_field_type=" + focusedCurrencyFieldType);
        }
        RoundingLogicType roundingLogicType = this.rounding_logic_type;
        if (roundingLogicType != null) {
            arrayList.add("rounding_logic_type=" + roundingLogicType);
        }
        Orientation orientation = this.orientation;
        if (orientation != null) {
            arrayList.add("orientation=" + orientation);
        }
        String str6 = this.accessibility_header;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "accessibility_header=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MultiCurrencyAmountEntryBlocker{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$AmountEntryType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "REMITTANCE", "CROSS_BORDER", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AmountEntryType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AmountEntryType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final AmountEntryType REMITTANCE = new AmountEntryType("REMITTANCE", 0, 1);
        public static final AmountEntryType CROSS_BORDER = new AmountEntryType("CROSS_BORDER", 1, 2);

        private static final /* synthetic */ AmountEntryType[] $values() {
            return new AmountEntryType[]{REMITTANCE, CROSS_BORDER};
        }

        static {
            AmountEntryType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AmountEntryType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$AmountEntryType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public MultiCurrencyAmountEntryBlocker.AmountEntryType fromValue(int value) {
                    return MultiCurrencyAmountEntryBlocker.AmountEntryType.INSTANCE.fromValue(value);
                }
            };
        }

        private AmountEntryType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final AmountEntryType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AmountEntryType valueOf(String str) {
            return (AmountEntryType) Enum.valueOf(AmountEntryType.class, str);
        }

        public static AmountEntryType[] values() {
            return (AmountEntryType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$AmountEntryType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$AmountEntryType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AmountEntryType fromValue(int value) {
                if (value == 1) {
                    return AmountEntryType.REMITTANCE;
                }
                if (value != 2) {
                    return null;
                }
                return AmountEntryType.CROSS_BORDER;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0007H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$Builder;", "primary_action_confirm_content", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;", "secondary_action_confirm_content", "confirm_action_title", "", "cancel_action_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "ConfirmContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ConfirmDialogConfig extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConfirmDialogConfig> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String cancel_action_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String confirm_action_title;

        @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent#ADAPTER", schemaIndex = 0, tag = 1)
        public final ConfirmContent primary_action_confirm_content;

        @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent#ADAPTER", schemaIndex = 1, tag = 2)
        public final ConfirmContent secondary_action_confirm_content;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "<init>", "()V", "primary_action_confirm_content", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;", "secondary_action_confirm_content", "confirm_action_title", "", "cancel_action_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String cancel_action_title;
            public String confirm_action_title;
            public ConfirmContent primary_action_confirm_content;
            public ConfirmContent secondary_action_confirm_content;

            @Override // com.squareup.wire.Message.Builder
            public ConfirmDialogConfig build() {
                return new ConfirmDialogConfig(this.primary_action_confirm_content, this.secondary_action_confirm_content, this.confirm_action_title, this.cancel_action_title, buildUnknownFields());
            }

            public final Builder cancel_action_title(String cancel_action_title) {
                this.cancel_action_title = cancel_action_title;
                return this;
            }

            public final Builder confirm_action_title(String confirm_action_title) {
                this.confirm_action_title = confirm_action_title;
                return this;
            }

            public final Builder primary_action_confirm_content(ConfirmContent primary_action_confirm_content) {
                this.primary_action_confirm_content = primary_action_confirm_content;
                return this;
            }

            public final Builder secondary_action_confirm_content(ConfirmContent secondary_action_confirm_content) {
                this.secondary_action_confirm_content = secondary_action_confirm_content;
                return this;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0015\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$Builder;", "sender_selected", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;", "recipient_selected", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ConfirmPrompt", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ConfirmContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ConfirmContent> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt#ADAPTER", schemaIndex = 1, tag = 2)
            public final ConfirmPrompt recipient_selected;

            @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt#ADAPTER", schemaIndex = 0, tag = 1)
            public final ConfirmPrompt sender_selected;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;", "<init>", "()V", "sender_selected", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;", "recipient_selected", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public ConfirmPrompt recipient_selected;
                public ConfirmPrompt sender_selected;

                @Override // com.squareup.wire.Message.Builder
                public ConfirmContent build() {
                    return new ConfirmContent(this.sender_selected, this.recipient_selected, buildUnknownFields());
                }

                public final Builder recipient_selected(ConfirmPrompt recipient_selected) {
                    this.recipient_selected = recipient_selected;
                    return this;
                }

                public final Builder sender_selected(ConfirmPrompt sender_selected) {
                    this.sender_selected = sender_selected;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmContent.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent((MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt) obj, (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER, reader, obj);
                            } else if (nextTag != 2) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj2 = TransactorKt.decodeMessageOrMerge(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER, reader, obj2);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 1, value.sender_selected);
                        protoAdapter2.encodeWithTag(writer, 2, value.recipient_selected);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER;
                        return protoAdapter2.encodedSizeWithTag(2, value.recipient_selected) + protoAdapter2.encodedSizeWithTag(1, value.sender_selected) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent redact(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent value) {
                        value.getClass();
                        MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt confirmPrompt = value.sender_selected;
                        MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt confirmPrompt2 = confirmPrompt != null ? (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt) MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER.redact(confirmPrompt) : null;
                        MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt confirmPrompt3 = value.recipient_selected;
                        return value.copy(confirmPrompt2, confirmPrompt3 != null ? (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt) MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER.redact(confirmPrompt3) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 2, value.recipient_selected);
                        protoAdapter2.encodeWithTag(writer, 1, value.sender_selected);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ ConfirmContent(ConfirmPrompt confirmPrompt, ConfirmPrompt confirmPrompt2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : confirmPrompt, (i & 2) != 0 ? null : confirmPrompt2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ ConfirmContent copy$default(ConfirmContent confirmContent, ConfirmPrompt confirmPrompt, ConfirmPrompt confirmPrompt2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    confirmPrompt = confirmContent.sender_selected;
                }
                if ((i & 2) != 0) {
                    confirmPrompt2 = confirmContent.recipient_selected;
                }
                if ((i & 4) != 0) {
                    byteString = confirmContent.unknownFields();
                }
                return confirmContent.copy(confirmPrompt, confirmPrompt2, byteString);
            }

            public final ConfirmContent copy(ConfirmPrompt sender_selected, ConfirmPrompt recipient_selected, ByteString unknownFields) {
                unknownFields.getClass();
                return new ConfirmContent(sender_selected, recipient_selected, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof ConfirmContent)) {
                    return false;
                }
                ConfirmContent confirmContent = (ConfirmContent) other;
                return Intrinsics.areEqual(unknownFields(), confirmContent.unknownFields()) && Intrinsics.areEqual(this.sender_selected, confirmContent.sender_selected) && Intrinsics.areEqual(this.recipient_selected, confirmContent.recipient_selected);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                ConfirmPrompt confirmPrompt = this.sender_selected;
                int hashCode2 = (hashCode + (confirmPrompt != null ? confirmPrompt.hashCode() : 0)) * 37;
                ConfirmPrompt confirmPrompt2 = this.recipient_selected;
                int hashCode3 = hashCode2 + (confirmPrompt2 != null ? confirmPrompt2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.sender_selected = this.sender_selected;
                builder.recipient_selected = this.recipient_selected;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                ConfirmPrompt confirmPrompt = this.sender_selected;
                if (confirmPrompt != null) {
                    arrayList.add("sender_selected=" + confirmPrompt);
                }
                ConfirmPrompt confirmPrompt2 = this.recipient_selected;
                if (confirmPrompt2 != null) {
                    arrayList.add("recipient_selected=" + confirmPrompt2);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmContent{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt$Builder;", "title", "", "message", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class ConfirmPrompt extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<ConfirmPrompt> CREATOR;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final long serialVersionUID = 0;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
                public final String message;

                @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
                public final String title;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;", "<init>", "()V", "title", "", "message", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Builder extends Message.Builder {
                    public String message;
                    public String title;

                    @Override // com.squareup.wire.Message.Builder
                    public ConfirmPrompt build() {
                        return new ConfirmPrompt(this.title, this.message, buildUnknownFields());
                    }

                    public final Builder message(String message) {
                        this.message = message;
                        return this;
                    }

                    public final Builder title(String title) {
                        this.title = title;
                        return this;
                    }
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmPrompt.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt$Companion$ADAPTER$1
                        @Override // com.squareup.wire.ProtoAdapter
                        public MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt decode(ProtoReader reader) {
                            reader.getClass();
                            long beginMessage = reader.beginMessage();
                            Object obj = null;
                            Object obj2 = null;
                            while (true) {
                                int nextTag = reader.nextTag();
                                if (nextTag == -1) {
                                    return new MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                        public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt value) {
                            writer.getClass();
                            value.getClass();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 1, value.title);
                            protoAdapter2.encodeWithTag(writer, 2, value.message);
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt value) {
                            value.getClass();
                            int size$okio = value.unknownFields().getSize$okio();
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            return protoAdapter2.encodedSizeWithTag(2, value.message) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt redact(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt value) {
                            value.getClass();
                            return MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ConfirmPrompt value) {
                            writer.getClass();
                            value.getClass();
                            writer.writeBytes(value.unknownFields());
                            ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                            protoAdapter2.encodeWithTag(writer, 2, value.message);
                            protoAdapter2.encodeWithTag(writer, 1, value.title);
                        }
                    };
                    ADAPTER = protoAdapter;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
                }

                public /* synthetic */ ConfirmPrompt(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                }

                public static /* synthetic */ ConfirmPrompt copy$default(ConfirmPrompt confirmPrompt, String str, String str2, ByteString byteString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = confirmPrompt.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = confirmPrompt.message;
                    }
                    if ((i & 4) != 0) {
                        byteString = confirmPrompt.unknownFields();
                    }
                    return confirmPrompt.copy(str, str2, byteString);
                }

                public final ConfirmPrompt copy(String title, String message, ByteString unknownFields) {
                    unknownFields.getClass();
                    return new ConfirmPrompt(title, message, unknownFields);
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof ConfirmPrompt)) {
                        return false;
                    }
                    ConfirmPrompt confirmPrompt = (ConfirmPrompt) other;
                    return Intrinsics.areEqual(unknownFields(), confirmPrompt.unknownFields()) && Intrinsics.areEqual(this.title, confirmPrompt.title) && Intrinsics.areEqual(this.message, confirmPrompt.message);
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
                    int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public Builder newBuilder() {
                    Builder builder = new Builder();
                    builder.title = this.title;
                    builder.message = this.message;
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
                    return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmPrompt{", "}", 0, null, null, 56);
                }

                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$ConfirmPrompt;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final /* synthetic */ ConfirmPrompt build(Function1<? super Builder, Unit> body) {
                        body.getClass();
                        Builder builder = new Builder();
                        body.invoke(builder);
                        return builder.build();
                    }

                    private Companion() {
                    }
                }

                public ConfirmPrompt() {
                    this(null, null, null, 7, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ConfirmPrompt(String str, String str2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.title = str;
                    this.message = str2;
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$ConfirmContent;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ ConfirmContent build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public ConfirmContent() {
                this(null, null, null, 7, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmContent(ConfirmPrompt confirmPrompt, ConfirmPrompt confirmPrompt2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.sender_selected = confirmPrompt;
                this.recipient_selected = confirmPrompt2;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ConfirmDialogConfig.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig((MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent) obj, (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER, reader, obj2);
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
                public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.primary_action_confirm_content);
                    protoAdapter2.encodeWithTag(writer, 2, value.secondary_action_confirm_content);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    protoAdapter3.encodeWithTag(writer, 3, value.confirm_action_title);
                    protoAdapter3.encodeWithTag(writer, 4, value.cancel_action_title);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, value.secondary_action_confirm_content) + protoAdapter2.encodedSizeWithTag(1, value.primary_action_confirm_content) + size$okio;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                    return protoAdapter3.encodedSizeWithTag(4, value.cancel_action_title) + protoAdapter3.encodedSizeWithTag(3, value.confirm_action_title) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig redact(MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig value) {
                    value.getClass();
                    MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent confirmContent = value.primary_action_confirm_content;
                    MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent confirmContent2 = confirmContent != null ? (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent) MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER.redact(confirmContent) : null;
                    MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent confirmContent3 = value.secondary_action_confirm_content;
                    return MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.copy$default(value, confirmContent2, confirmContent3 != null ? (MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent) MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER.redact(confirmContent3) : null, null, null, ByteString.EMPTY, 12, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.cancel_action_title);
                    protoAdapter2.encodeWithTag(writer, 3, value.confirm_action_title);
                    ProtoAdapter protoAdapter3 = MultiCurrencyAmountEntryBlocker.ConfirmDialogConfig.ConfirmContent.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 2, value.secondary_action_confirm_content);
                    protoAdapter3.encodeWithTag(writer, 1, value.primary_action_confirm_content);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ConfirmDialogConfig(ConfirmContent confirmContent, ConfirmContent confirmContent2, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : confirmContent, (i & 2) != 0 ? null : confirmContent2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ConfirmDialogConfig copy$default(ConfirmDialogConfig confirmDialogConfig, ConfirmContent confirmContent, ConfirmContent confirmContent2, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                confirmContent = confirmDialogConfig.primary_action_confirm_content;
            }
            if ((i & 2) != 0) {
                confirmContent2 = confirmDialogConfig.secondary_action_confirm_content;
            }
            if ((i & 4) != 0) {
                str = confirmDialogConfig.confirm_action_title;
            }
            if ((i & 8) != 0) {
                str2 = confirmDialogConfig.cancel_action_title;
            }
            if ((i & 16) != 0) {
                byteString = confirmDialogConfig.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str3 = str;
            return confirmDialogConfig.copy(confirmContent, confirmContent2, str3, str2, byteString2);
        }

        public final ConfirmDialogConfig copy(ConfirmContent primary_action_confirm_content, ConfirmContent secondary_action_confirm_content, String confirm_action_title, String cancel_action_title, ByteString unknownFields) {
            unknownFields.getClass();
            return new ConfirmDialogConfig(primary_action_confirm_content, secondary_action_confirm_content, confirm_action_title, cancel_action_title, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ConfirmDialogConfig)) {
                return false;
            }
            ConfirmDialogConfig confirmDialogConfig = (ConfirmDialogConfig) other;
            return Intrinsics.areEqual(unknownFields(), confirmDialogConfig.unknownFields()) && Intrinsics.areEqual(this.primary_action_confirm_content, confirmDialogConfig.primary_action_confirm_content) && Intrinsics.areEqual(this.secondary_action_confirm_content, confirmDialogConfig.secondary_action_confirm_content) && Intrinsics.areEqual(this.confirm_action_title, confirmDialogConfig.confirm_action_title) && Intrinsics.areEqual(this.cancel_action_title, confirmDialogConfig.cancel_action_title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ConfirmContent confirmContent = this.primary_action_confirm_content;
            int hashCode2 = (hashCode + (confirmContent != null ? confirmContent.hashCode() : 0)) * 37;
            ConfirmContent confirmContent2 = this.secondary_action_confirm_content;
            int hashCode3 = (hashCode2 + (confirmContent2 != null ? confirmContent2.hashCode() : 0)) * 37;
            String str = this.confirm_action_title;
            int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.cancel_action_title;
            int hashCode5 = hashCode4 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.primary_action_confirm_content = this.primary_action_confirm_content;
            builder.secondary_action_confirm_content = this.secondary_action_confirm_content;
            builder.confirm_action_title = this.confirm_action_title;
            builder.cancel_action_title = this.cancel_action_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            ConfirmContent confirmContent = this.primary_action_confirm_content;
            if (confirmContent != null) {
                arrayList.add("primary_action_confirm_content=" + confirmContent);
            }
            ConfirmContent confirmContent2 = this.secondary_action_confirm_content;
            if (confirmContent2 != null) {
                arrayList.add("secondary_action_confirm_content=" + confirmContent2);
            }
            String str = this.confirm_action_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "confirm_action_title=", arrayList);
            }
            String str2 = this.cancel_action_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cancel_action_title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConfirmDialogConfig{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$ConfirmDialogConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ConfirmDialogConfig build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ConfirmDialogConfig() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmDialogConfig(ConfirmContent confirmContent, ConfirmContent confirmContent2, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.primary_action_confirm_content = confirmContent;
            this.secondary_action_confirm_content = confirmContent2;
            this.confirm_action_title = str;
            this.cancel_action_title = str2;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dBi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016Jh\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Builder;", "identifier", "", "min", "Lcom/squareup/protos/common/Money;", "max", "customer_exchange_rate", "fees", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "error_message_title", "error_message_details", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/common/Money;Lcom/squareup/protos/common/Money;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "Fee", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CostTier extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CostTier> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String customer_exchange_rate;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 7)
        public final String error_message_details;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String error_message_title;

        @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CostTier$Fee#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
        public final List<Fee> fees;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String identifier;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 2, tag = 3)
        public final Money max;

        @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
        public final Money min;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier;", "<init>", "()V", "identifier", "", "min", "Lcom/squareup/protos/common/Money;", "max", "customer_exchange_rate", "fees", "", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "error_message_title", "error_message_details", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String customer_exchange_rate;
            public String error_message_details;
            public String error_message_title;
            public List<Fee> fees = EmptyList.INSTANCE;
            public String identifier;
            public Money max;
            public Money min;

            @Override // com.squareup.wire.Message.Builder
            public CostTier build() {
                return new CostTier(this.identifier, this.min, this.max, this.customer_exchange_rate, this.fees, this.error_message_title, this.error_message_details, buildUnknownFields());
            }

            public final Builder customer_exchange_rate(String customer_exchange_rate) {
                this.customer_exchange_rate = customer_exchange_rate;
                return this;
            }

            public final Builder error_message_details(String error_message_details) {
                this.error_message_details = error_message_details;
                return this;
            }

            public final Builder error_message_title(String error_message_title) {
                this.error_message_title = error_message_title;
                return this;
            }

            public final Builder fees(List<Fee> fees) {
                fees.getClass();
                TransactorKt.checkElementsNotNull(fees);
                this.fees = fees;
                return this;
            }

            public final Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            public final Builder max(Money max) {
                this.max = max;
                return this;
            }

            public final Builder min(Money min) {
                this.min = min;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0082\u0004J\n\u0010\u0016\u001a\u00020\u0017H\u0096\u0080\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0016J]\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u001aR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Builder;", AnnotatedPrivateKey.LABEL, "", "amount", "Lcom/squareup/protos/common/Money;", "blend", "", "identifier", "formatted_amount", "treatment", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/common/Money;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lcom/squareup/protos/common/Money;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment;Lokio/ByteString;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "Builder", "Companion", "Treatment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Fee extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Fee> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 1, tag = 2)
            public final Money amount;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
            public final Boolean blend;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
            public final String formatted_amount;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
            public final String identifier;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @WireField(adapter = "com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment#ADAPTER", schemaIndex = 5, tag = 6)
            public final Treatment treatment;

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "amount", "Lcom/squareup/protos/common/Money;", "blend", "", "Ljava/lang/Boolean;", "identifier", "formatted_amount", "treatment", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Money amount;
                public Boolean blend;
                public String formatted_amount;
                public String identifier;
                public String label;
                public Treatment treatment;

                public final Builder amount(Money amount) {
                    this.amount = amount;
                    return this;
                }

                public final Builder blend(Boolean blend) {
                    this.blend = blend;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public Fee build() {
                    return new Fee(this.label, this.amount, this.blend, this.identifier, this.formatted_amount, this.treatment, buildUnknownFields());
                }

                public final Builder formatted_amount(String formatted_amount) {
                    this.formatted_amount = formatted_amount;
                    return this;
                }

                public final Builder identifier(String identifier) {
                    this.identifier = identifier;
                    return this;
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }

                public final Builder treatment(Treatment treatment) {
                    this.treatment = treatment;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Fee.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CostTier$Fee$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyAmountEntryBlocker.CostTier.Fee decode(ProtoReader reader) {
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
                                return new MultiCurrencyAmountEntryBlocker.CostTier.Fee((String) obj, (Money) obj2, (Boolean) obj3, (String) obj4, (String) obj5, (MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            switch (nextTag) {
                                case 1:
                                    obj = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj2);
                                    break;
                                case 3:
                                    obj3 = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 4:
                                    obj4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    obj5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 6:
                                    try {
                                        obj6 = MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment.ADAPTER.decode(reader);
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
                    public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker.CostTier.Fee value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                        Money.ADAPTER.encodeWithTag(writer, 2, value.amount);
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.blend);
                        protoAdapter2.encodeWithTag(writer, 4, value.identifier);
                        protoAdapter2.encodeWithTag(writer, 5, value.formatted_amount);
                        MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment.ADAPTER.encodeWithTag(writer, 6, value.treatment);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(MultiCurrencyAmountEntryBlocker.CostTier.Fee value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment.ADAPTER.encodedSizeWithTag(6, value.treatment) + protoAdapter2.encodedSizeWithTag(5, value.formatted_amount) + protoAdapter2.encodedSizeWithTag(4, value.identifier) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.blend) + Money.ADAPTER.encodedSizeWithTag(2, value.amount) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public MultiCurrencyAmountEntryBlocker.CostTier.Fee redact(MultiCurrencyAmountEntryBlocker.CostTier.Fee value) {
                        value.getClass();
                        Money money = value.amount;
                        return MultiCurrencyAmountEntryBlocker.CostTier.Fee.copy$default(value, null, money != null ? (Money) Money.ADAPTER.redact(money) : null, null, null, null, null, ByteString.EMPTY, 61, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker.CostTier.Fee value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment.ADAPTER.encodeWithTag(writer, 6, value.treatment);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 5, value.formatted_amount);
                        protoAdapter2.encodeWithTag(writer, 4, value.identifier);
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.blend);
                        Money.ADAPTER.encodeWithTag(writer, 2, value.amount);
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Fee(String str, Money money, Boolean bool, String str2, String str3, Treatment treatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : treatment, (i & 64) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Fee copy$default(Fee fee, String str, Money money, Boolean bool, String str2, String str3, Treatment treatment, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fee.label;
                }
                if ((i & 2) != 0) {
                    money = fee.amount;
                }
                if ((i & 4) != 0) {
                    bool = fee.blend;
                }
                if ((i & 8) != 0) {
                    str2 = fee.identifier;
                }
                if ((i & 16) != 0) {
                    str3 = fee.formatted_amount;
                }
                if ((i & 32) != 0) {
                    treatment = fee.treatment;
                }
                if ((i & 64) != 0) {
                    byteString = fee.unknownFields();
                }
                Treatment treatment2 = treatment;
                ByteString byteString2 = byteString;
                String str4 = str3;
                Boolean bool2 = bool;
                return fee.copy(str, money, bool2, str2, str4, treatment2, byteString2);
            }

            public final Fee copy(String label, Money amount, Boolean blend, String identifier, String formatted_amount, Treatment treatment, ByteString unknownFields) {
                unknownFields.getClass();
                return new Fee(label, amount, blend, identifier, formatted_amount, treatment, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Fee)) {
                    return false;
                }
                Fee fee = (Fee) other;
                return Intrinsics.areEqual(unknownFields(), fee.unknownFields()) && Intrinsics.areEqual(this.label, fee.label) && Intrinsics.areEqual(this.amount, fee.amount) && Intrinsics.areEqual(this.blend, fee.blend) && Intrinsics.areEqual(this.identifier, fee.identifier) && Intrinsics.areEqual(this.formatted_amount, fee.formatted_amount) && this.treatment == fee.treatment;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Money money = this.amount;
                int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
                Boolean bool = this.blend;
                int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str2 = this.identifier;
                int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.formatted_amount;
                int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
                Treatment treatment = this.treatment;
                int hashCode7 = hashCode6 + (treatment != null ? treatment.hashCode() : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.amount = this.amount;
                builder.blend = this.blend;
                builder.identifier = this.identifier;
                builder.formatted_amount = this.formatted_amount;
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
                Money money = this.amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
                }
                Boolean bool = this.blend;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("blend=", bool, arrayList);
                }
                String str2 = this.identifier;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "identifier=", arrayList);
                }
                String str3 = this.formatted_amount;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "formatted_amount=", arrayList);
                }
                Treatment treatment = this.treatment;
                if (treatment != null) {
                    arrayList.add("treatment=" + treatment);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Fee{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNRECOGNIZED_VALUE_DO_NOT_USE", "NONE", "LINE_END_ICON_CHECK", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, treatment) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment fromValue(int value) {
                            return MultiCurrencyAmountEntryBlocker.CostTier.Fee.Treatment.INSTANCE.fromValue(value);
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

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Treatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Fee;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Fee build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Fee() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fee(String str, Money money, Boolean bool, String str2, String str3, Treatment treatment, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.amount = money;
                this.blend = bool;
                this.identifier = str2;
                this.formatted_amount = str3;
                this.treatment = treatment;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CostTier.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CostTier$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyAmountEntryBlocker.CostTier decode(ProtoReader reader) {
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
                            return new MultiCurrencyAmountEntryBlocker.CostTier((String) obj, (Money) obj2, (Money) obj3, (String) obj4, m, (String) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                m.add(MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.decode(reader));
                                break;
                            case 6:
                                obj5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker.CostTier value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.identifier);
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 2, value.min);
                    protoAdapter3.encodeWithTag(writer, 3, value.max);
                    protoAdapter2.encodeWithTag(writer, 4, value.customer_exchange_rate);
                    MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.fees);
                    protoAdapter2.encodeWithTag(writer, 6, value.error_message_title);
                    protoAdapter2.encodeWithTag(writer, 7, value.error_message_details);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyAmountEntryBlocker.CostTier value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.identifier) + size$okio;
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    return protoAdapter2.encodedSizeWithTag(7, value.error_message_details) + protoAdapter2.encodedSizeWithTag(6, value.error_message_title) + MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.asRepeated().encodedSizeWithTag(5, value.fees) + protoAdapter2.encodedSizeWithTag(4, value.customer_exchange_rate) + protoAdapter3.encodedSizeWithTag(3, value.max) + protoAdapter3.encodedSizeWithTag(2, value.min) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyAmountEntryBlocker.CostTier redact(MultiCurrencyAmountEntryBlocker.CostTier value) {
                    value.getClass();
                    Money money = value.min;
                    Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                    Money money3 = value.max;
                    return MultiCurrencyAmountEntryBlocker.CostTier.copy$default(value, null, money2, money3 != null ? (Money) Money.ADAPTER.redact(money3) : null, null, TransactorKt.m1169redactElements(value.fees, MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER), null, null, ByteString.EMPTY, 41, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker.CostTier value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 7, value.error_message_details);
                    protoAdapter2.encodeWithTag(writer, 6, value.error_message_title);
                    MultiCurrencyAmountEntryBlocker.CostTier.Fee.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.fees);
                    protoAdapter2.encodeWithTag(writer, 4, value.customer_exchange_rate);
                    ProtoAdapter protoAdapter3 = Money.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.max);
                    protoAdapter3.encodeWithTag(writer, 2, value.min);
                    protoAdapter2.encodeWithTag(writer, 1, value.identifier);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public CostTier(String str, Money money, Money money2, String str2, List list, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : money, (i & 4) != 0 ? null : money2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? EmptyList.INSTANCE : list, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CostTier copy$default(CostTier costTier, String str, Money money, Money money2, String str2, List list, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = costTier.identifier;
            }
            if ((i & 2) != 0) {
                money = costTier.min;
            }
            if ((i & 4) != 0) {
                money2 = costTier.max;
            }
            if ((i & 8) != 0) {
                str2 = costTier.customer_exchange_rate;
            }
            if ((i & 16) != 0) {
                list = costTier.fees;
            }
            if ((i & 32) != 0) {
                str3 = costTier.error_message_title;
            }
            if ((i & 64) != 0) {
                str4 = costTier.error_message_details;
            }
            if ((i & 128) != 0) {
                byteString = costTier.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            List list2 = list;
            String str6 = str3;
            return costTier.copy(str, money, money2, str2, list2, str6, str5, byteString2);
        }

        public final CostTier copy(String identifier, Money min, Money max, String customer_exchange_rate, List<Fee> fees, String error_message_title, String error_message_details, ByteString unknownFields) {
            fees.getClass();
            unknownFields.getClass();
            return new CostTier(identifier, min, max, customer_exchange_rate, fees, error_message_title, error_message_details, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CostTier)) {
                return false;
            }
            CostTier costTier = (CostTier) other;
            return Intrinsics.areEqual(unknownFields(), costTier.unknownFields()) && Intrinsics.areEqual(this.identifier, costTier.identifier) && Intrinsics.areEqual(this.min, costTier.min) && Intrinsics.areEqual(this.max, costTier.max) && Intrinsics.areEqual(this.customer_exchange_rate, costTier.customer_exchange_rate) && Intrinsics.areEqual(this.fees, costTier.fees) && Intrinsics.areEqual(this.error_message_title, costTier.error_message_title) && Intrinsics.areEqual(this.error_message_details, costTier.error_message_details);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.identifier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.min;
            int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.max;
            int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
            String str2 = this.customer_exchange_rate;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.fees);
            String str3 = this.error_message_title;
            int hashCode5 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.error_message_details;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.identifier = this.identifier;
            builder.min = this.min;
            builder.max = this.max;
            builder.customer_exchange_rate = this.customer_exchange_rate;
            builder.fees = this.fees;
            builder.error_message_title = this.error_message_title;
            builder.error_message_details = this.error_message_details;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.identifier;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "identifier=", arrayList);
            }
            Money money = this.min;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("min=", money, arrayList);
            }
            Money money2 = this.max;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("max=", money2, arrayList);
            }
            String str2 = this.customer_exchange_rate;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_exchange_rate=", arrayList);
            }
            if (!this.fees.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("fees=", arrayList, this.fees);
            }
            String str3 = this.error_message_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "error_message_title=", arrayList);
            }
            if (this.error_message_details != null) {
                arrayList.add("error_message_details=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CostTier{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CostTier;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CostTier build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CostTier() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CostTier(String str, Money money, Money money2, String str2, List<Fee> list, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.identifier = str;
            this.min = money;
            this.max = money2;
            this.customer_exchange_rate = str2;
            this.error_message_title = str3;
            this.error_message_details = str4;
            this.fees = TransactorKt.immutableCopyOf("fees", list);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aBY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0004H\u0016JX\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails$Builder;", "full_name", "", "email_address", "sms_number", "photo", "Lcom/squareup/protos/cash/ui/Image;", "themed_accent_color", "Lcom/squareup/protos/cash/ui/Color;", "customer_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CustomerDetails extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CustomerDetails> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String customer_token;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String email_address;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String full_name;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 3, tag = 4)
        public final Image photo;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
        public final String sms_number;

        @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 4, tag = 5)
        public final Color themed_accent_color;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "<init>", "()V", "full_name", "", "email_address", "sms_number", "photo", "Lcom/squareup/protos/cash/ui/Image;", "themed_accent_color", "Lcom/squareup/protos/cash/ui/Color;", "customer_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String customer_token;
            public String email_address;
            public String full_name;
            public Image photo;
            public String sms_number;
            public Color themed_accent_color;

            @Override // com.squareup.wire.Message.Builder
            public CustomerDetails build() {
                return new CustomerDetails(this.full_name, this.email_address, this.sms_number, this.photo, this.themed_accent_color, this.customer_token, buildUnknownFields());
            }

            public final Builder customer_token(String customer_token) {
                this.customer_token = customer_token;
                return this;
            }

            public final Builder email_address(String email_address) {
                this.email_address = email_address;
                return this;
            }

            public final Builder full_name(String full_name) {
                this.full_name = full_name;
                return this;
            }

            public final Builder photo(Image photo) {
                this.photo = photo;
                return this;
            }

            public final Builder sms_number(String sms_number) {
                this.sms_number = sms_number;
                return this;
            }

            public final Builder themed_accent_color(Color themed_accent_color) {
                this.themed_accent_color = themed_accent_color;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CustomerDetails.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$CustomerDetails$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyAmountEntryBlocker.CustomerDetails decode(ProtoReader reader) {
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
                            return new MultiCurrencyAmountEntryBlocker.CustomerDetails((String) obj, (String) obj2, (String) obj3, (Image) obj4, (Color) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                                obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, MultiCurrencyAmountEntryBlocker.CustomerDetails value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.full_name);
                    protoAdapter2.encodeWithTag(writer, 2, value.email_address);
                    protoAdapter2.encodeWithTag(writer, 3, value.sms_number);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.photo);
                    Color.ADAPTER.encodeWithTag(writer, 5, value.themed_accent_color);
                    protoAdapter2.encodeWithTag(writer, 6, value.customer_token);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(MultiCurrencyAmountEntryBlocker.CustomerDetails value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(6, value.customer_token) + Color.ADAPTER.encodedSizeWithTag(5, value.themed_accent_color) + Image.ADAPTER.encodedSizeWithTag(4, value.photo) + protoAdapter2.encodedSizeWithTag(3, value.sms_number) + protoAdapter2.encodedSizeWithTag(2, value.email_address) + protoAdapter2.encodedSizeWithTag(1, value.full_name) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public MultiCurrencyAmountEntryBlocker.CustomerDetails redact(MultiCurrencyAmountEntryBlocker.CustomerDetails value) {
                    value.getClass();
                    Image image = value.photo;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    Color color = value.themed_accent_color;
                    return MultiCurrencyAmountEntryBlocker.CustomerDetails.copy$default(value, null, null, null, image2, color != null ? (Color) Color.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 32, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, MultiCurrencyAmountEntryBlocker.CustomerDetails value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.customer_token);
                    Color.ADAPTER.encodeWithTag(writer, 5, value.themed_accent_color);
                    Image.ADAPTER.encodeWithTag(writer, 4, value.photo);
                    protoAdapter2.encodeWithTag(writer, 3, value.sms_number);
                    protoAdapter2.encodeWithTag(writer, 2, value.email_address);
                    protoAdapter2.encodeWithTag(writer, 1, value.full_name);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CustomerDetails(String str, String str2, String str3, Image image, Color color, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : image, (i & 16) != 0 ? null : color, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CustomerDetails copy$default(CustomerDetails customerDetails, String str, String str2, String str3, Image image, Color color, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customerDetails.full_name;
            }
            if ((i & 2) != 0) {
                str2 = customerDetails.email_address;
            }
            if ((i & 4) != 0) {
                str3 = customerDetails.sms_number;
            }
            if ((i & 8) != 0) {
                image = customerDetails.photo;
            }
            if ((i & 16) != 0) {
                color = customerDetails.themed_accent_color;
            }
            if ((i & 32) != 0) {
                str4 = customerDetails.customer_token;
            }
            if ((i & 64) != 0) {
                byteString = customerDetails.unknownFields();
            }
            String str5 = str4;
            ByteString byteString2 = byteString;
            Color color2 = color;
            String str6 = str3;
            return customerDetails.copy(str, str2, str6, image, color2, str5, byteString2);
        }

        public final CustomerDetails copy(String full_name, String email_address, String sms_number, Image photo, Color themed_accent_color, String customer_token, ByteString unknownFields) {
            unknownFields.getClass();
            return new CustomerDetails(full_name, email_address, sms_number, photo, themed_accent_color, customer_token, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CustomerDetails)) {
                return false;
            }
            CustomerDetails customerDetails = (CustomerDetails) other;
            return Intrinsics.areEqual(unknownFields(), customerDetails.unknownFields()) && Intrinsics.areEqual(this.full_name, customerDetails.full_name) && Intrinsics.areEqual(this.email_address, customerDetails.email_address) && Intrinsics.areEqual(this.sms_number, customerDetails.sms_number) && Intrinsics.areEqual(this.photo, customerDetails.photo) && Intrinsics.areEqual(this.themed_accent_color, customerDetails.themed_accent_color) && Intrinsics.areEqual(this.customer_token, customerDetails.customer_token);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.full_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.email_address;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.sms_number;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Image image = this.photo;
            int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
            Color color = this.themed_accent_color;
            int hashCode6 = (hashCode5 + (color != null ? color.hashCode() : 0)) * 37;
            String str4 = this.customer_token;
            int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.full_name = this.full_name;
            builder.email_address = this.email_address;
            builder.sms_number = this.sms_number;
            builder.photo = this.photo;
            builder.themed_accent_color = this.themed_accent_color;
            builder.customer_token = this.customer_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.full_name != null) {
                arrayList.add("full_name=██");
            }
            if (this.email_address != null) {
                arrayList.add("email_address=██");
            }
            if (this.sms_number != null) {
                arrayList.add("sms_number=██");
            }
            Image image = this.photo;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("photo=", image, arrayList);
            }
            Color color = this.themed_accent_color;
            if (color != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("themed_accent_color=", color, arrayList);
            }
            String str = this.customer_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerDetails{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$CustomerDetails;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CustomerDetails build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CustomerDetails() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerDetails(String str, String str2, String str3, Image image, Color color, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.full_name = str;
            this.email_address = str2;
            this.sms_number = str3;
            this.photo = image;
            this.themed_accent_color = color;
            this.customer_token = str4;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyField;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SENDER", "RECEIVER", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FocusedCurrencyField implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FocusedCurrencyField[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final FocusedCurrencyField SENDER = new FocusedCurrencyField("SENDER", 0, 1);
        public static final FocusedCurrencyField RECEIVER = new FocusedCurrencyField("RECEIVER", 1, 2);

        private static final /* synthetic */ FocusedCurrencyField[] $values() {
            return new FocusedCurrencyField[]{SENDER, RECEIVER};
        }

        static {
            FocusedCurrencyField[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FocusedCurrencyField.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$FocusedCurrencyField$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public MultiCurrencyAmountEntryBlocker.FocusedCurrencyField fromValue(int value) {
                    return MultiCurrencyAmountEntryBlocker.FocusedCurrencyField.INSTANCE.fromValue(value);
                }
            };
        }

        private FocusedCurrencyField(String str, int i, int i2) {
            this.value = i2;
        }

        public static final FocusedCurrencyField fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FocusedCurrencyField valueOf(String str) {
            return (FocusedCurrencyField) Enum.valueOf(FocusedCurrencyField.class, str);
        }

        public static FocusedCurrencyField[] values() {
            return (FocusedCurrencyField[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyField$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyField;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FocusedCurrencyField fromValue(int value) {
                if (value == 1) {
                    return FocusedCurrencyField.SENDER;
                }
                if (value != 2) {
                    return null;
                }
                return FocusedCurrencyField.RECEIVER;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LAST_EDITED", "LAST_SELECTED", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class FocusedCurrencyFieldType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FocusedCurrencyFieldType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final FocusedCurrencyFieldType LAST_EDITED = new FocusedCurrencyFieldType("LAST_EDITED", 0, 1);
        public static final FocusedCurrencyFieldType LAST_SELECTED = new FocusedCurrencyFieldType("LAST_SELECTED", 1, 2);
        private final int value;

        private static final /* synthetic */ FocusedCurrencyFieldType[] $values() {
            return new FocusedCurrencyFieldType[]{LAST_EDITED, LAST_SELECTED};
        }

        static {
            FocusedCurrencyFieldType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FocusedCurrencyFieldType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType fromValue(int value) {
                    return MultiCurrencyAmountEntryBlocker.FocusedCurrencyFieldType.INSTANCE.fromValue(value);
                }
            };
        }

        private FocusedCurrencyFieldType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final FocusedCurrencyFieldType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static FocusedCurrencyFieldType valueOf(String str) {
            return (FocusedCurrencyFieldType) Enum.valueOf(FocusedCurrencyFieldType.class, str);
        }

        public static FocusedCurrencyFieldType[] values() {
            return (FocusedCurrencyFieldType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$FocusedCurrencyFieldType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FocusedCurrencyFieldType fromValue(int value) {
                if (value == 1) {
                    return FocusedCurrencyFieldType.LAST_EDITED;
                }
                if (value != 2) {
                    return null;
                }
                return FocusedCurrencyFieldType.LAST_SELECTED;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$RoundingLogicType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UP_DOWN", "HALF_UP", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class RoundingLogicType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RoundingLogicType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final RoundingLogicType UP_DOWN = new RoundingLogicType("UP_DOWN", 0, 1);
        public static final RoundingLogicType HALF_UP = new RoundingLogicType("HALF_UP", 1, 2);

        private static final /* synthetic */ RoundingLogicType[] $values() {
            return new RoundingLogicType[]{UP_DOWN, HALF_UP};
        }

        static {
            RoundingLogicType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RoundingLogicType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.MultiCurrencyAmountEntryBlocker$RoundingLogicType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public MultiCurrencyAmountEntryBlocker.RoundingLogicType fromValue(int value) {
                    return MultiCurrencyAmountEntryBlocker.RoundingLogicType.INSTANCE.fromValue(value);
                }
            };
        }

        private RoundingLogicType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final RoundingLogicType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static RoundingLogicType valueOf(String str) {
            return (RoundingLogicType) Enum.valueOf(RoundingLogicType.class, str);
        }

        public static RoundingLogicType[] values() {
            return (RoundingLogicType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$RoundingLogicType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$RoundingLogicType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final RoundingLogicType fromValue(int value) {
                if (value == 1) {
                    return RoundingLogicType.UP_DOWN;
                }
                if (value != 2) {
                    return null;
                }
                return RoundingLogicType.HALF_UP;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/MultiCurrencyAmountEntryBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ MultiCurrencyAmountEntryBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
