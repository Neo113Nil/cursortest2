package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003231R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0005R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0005R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0016\u0010 \u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0015R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0005R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0005R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0005R\u001c\u0010'\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u0012\u0004\b(\u0010)R\u0016\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0005R\u0016\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0005R\u0016\u0010,\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0016\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0005R\u0016\u0010.\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0016\u0010/\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u0016\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0005¨\u00064"}, d2 = {"Lcom/squareup/protos/franklin/api/Instrument;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/Instrument$Builder;", "", "token", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "cash_instrument_type", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "Lcom/squareup/protos/common/instrument/InstrumentType;", "card_brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "suffix", "bank_name", "icon_url", "detail_icon_url", "Lcom/squareup/protos/common/Money;", "available_balance", "Lcom/squareup/protos/common/Money;", "", "version", "Ljava/lang/Long;", "display_name", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_display_name", "Lcom/squareup/protos/cash/localization/LocalizableString;", "bank_short_name", "wallet_address", "", "pending_verification", "Ljava/lang/Boolean;", "selection_icon_url", "occurred_at", "card_theme_token", "prefix", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken;", "digital_wallet_payment_token", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken;", "payment_account_reference", "default_for_instrument_type", "getDefault_for_instrument_type$annotations", "()V", "accessory_icon_id", "accessory_text", "localizable_accessory_text", "display_name_compact", "localizable_display_name_compact", "is_default_for_instrument_type", "card_art_url", "Companion", "Builder", "DigitalWalletPaymentToken", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Instrument extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Instrument> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 21, tag = 27)
    public final String accessory_icon_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 22, tag = 28)
    public final String accessory_text;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 7, tag = 7)
    public final Money available_balance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
    public final String bank_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 11, tag = 12)
    public final String bank_short_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 27, tag = 31)
    public final String card_art_url;

    @WireField(adapter = "com.squareup.protos.common.instrument.InstrumentType#ADAPTER", schemaIndex = 2, tag = 3)
    public final InstrumentType card_brand;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 16, tag = 21)
    public final String card_theme_token;

    @WireField(adapter = "com.squareup.protos.franklin.api.CashInstrumentType#ADAPTER", schemaIndex = 1, tag = 2)
    public final CashInstrumentType cash_instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 20, tag = 26)
    public final Boolean default_for_instrument_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 10)
    public final String detail_icon_url;

    @WireSealedOneof(schemaIndex = 18)
    public final DigitalWalletPaymentToken digital_wallet_payment_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 11)
    public final String display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 24, tag = 29)
    public final String display_name_compact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 26, tag = 30)
    public final Boolean is_default_for_instrument_type;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 23, tag = 32)
    public final LocalizableString localizable_accessory_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 10, tag = 20)
    public final LocalizableString localizable_display_name;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 25, tag = 33)
    public final LocalizableString localizable_display_name_compact;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 15, tag = 19)
    public final Long occurred_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 25)
    public final String payment_account_reference;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 13, tag = 15)
    public final Boolean pending_verification;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 17, tag = 22)
    public final String prefix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 14, tag = 16)
    public final String selection_icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String suffix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 8, tag = 8)
    public final Long version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final String wallet_address;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010+J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010,J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010+J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0006J\u0017\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010,J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0006J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0006J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0016J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0006J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0016J\u0015\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010,J\u0010\u0010*\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0006J\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\b\u0010-\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010$\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/squareup/protos/franklin/api/Instrument$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/Instrument;", "<init>", "()V", "token", "", "cash_instrument_type", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "card_brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "suffix", "bank_name", "icon_url", "detail_icon_url", "available_balance", "Lcom/squareup/protos/common/Money;", "version", "", "Ljava/lang/Long;", "display_name", "localizable_display_name", "Lcom/squareup/protos/cash/localization/LocalizableString;", "bank_short_name", "wallet_address", "pending_verification", "", "Ljava/lang/Boolean;", "selection_icon_url", "occurred_at", "card_theme_token", "prefix", "digital_wallet_payment_token", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken;", "payment_account_reference", "default_for_instrument_type", "accessory_icon_id", "accessory_text", "localizable_accessory_text", "display_name_compact", "localizable_display_name_compact", "is_default_for_instrument_type", "card_art_url", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/api/Instrument$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/Instrument$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public String accessory_icon_id;
        public String accessory_text;
        public Money available_balance;
        public String bank_name;
        public String bank_short_name;
        public String card_art_url;
        public InstrumentType card_brand;
        public String card_theme_token;
        public CashInstrumentType cash_instrument_type;
        public Boolean default_for_instrument_type;
        public String detail_icon_url;
        public DigitalWalletPaymentToken digital_wallet_payment_token;
        public String display_name;
        public String display_name_compact;
        public String icon_url;
        public Boolean is_default_for_instrument_type;
        public LocalizableString localizable_accessory_text;
        public LocalizableString localizable_display_name;
        public LocalizableString localizable_display_name_compact;
        public Long occurred_at;
        public String payment_account_reference;
        public Boolean pending_verification;
        public String prefix;
        public String selection_icon_url;
        public String suffix;
        public String token;
        public Long version;
        public String wallet_address;

        public final Builder accessory_icon_id(String accessory_icon_id) {
            this.accessory_icon_id = accessory_icon_id;
            return this;
        }

        public final Builder accessory_text(String accessory_text) {
            this.accessory_text = accessory_text;
            return this;
        }

        public final Builder available_balance(Money available_balance) {
            this.available_balance = available_balance;
            return this;
        }

        public final Builder bank_name(String bank_name) {
            this.bank_name = bank_name;
            return this;
        }

        public final Builder bank_short_name(String bank_short_name) {
            this.bank_short_name = bank_short_name;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Instrument build() {
            return new Instrument(this.token, this.cash_instrument_type, this.card_brand, this.suffix, this.bank_name, this.icon_url, this.detail_icon_url, this.available_balance, this.version, this.display_name, this.localizable_display_name, this.bank_short_name, this.wallet_address, this.pending_verification, this.selection_icon_url, this.occurred_at, this.card_theme_token, this.prefix, this.digital_wallet_payment_token, this.payment_account_reference, this.default_for_instrument_type, this.accessory_icon_id, this.accessory_text, this.localizable_accessory_text, this.display_name_compact, this.localizable_display_name_compact, this.is_default_for_instrument_type, this.card_art_url, buildUnknownFields());
        }

        public final Builder card_art_url(String card_art_url) {
            this.card_art_url = card_art_url;
            return this;
        }

        public final Builder card_brand(InstrumentType card_brand) {
            this.card_brand = card_brand;
            return this;
        }

        public final Builder card_theme_token(String card_theme_token) {
            this.card_theme_token = card_theme_token;
            return this;
        }

        public final Builder cash_instrument_type(CashInstrumentType cash_instrument_type) {
            this.cash_instrument_type = cash_instrument_type;
            return this;
        }

        @Deprecated
        public final Builder default_for_instrument_type(Boolean default_for_instrument_type) {
            this.default_for_instrument_type = default_for_instrument_type;
            return this;
        }

        public final Builder detail_icon_url(String detail_icon_url) {
            this.detail_icon_url = detail_icon_url;
            return this;
        }

        public final Builder digital_wallet_payment_token(DigitalWalletPaymentToken digital_wallet_payment_token) {
            this.digital_wallet_payment_token = digital_wallet_payment_token;
            return this;
        }

        public final Builder display_name(String display_name) {
            this.display_name = display_name;
            return this;
        }

        public final Builder display_name_compact(String display_name_compact) {
            this.display_name_compact = display_name_compact;
            return this;
        }

        public final Builder icon_url(String icon_url) {
            this.icon_url = icon_url;
            return this;
        }

        public final Builder is_default_for_instrument_type(Boolean is_default_for_instrument_type) {
            this.is_default_for_instrument_type = is_default_for_instrument_type;
            return this;
        }

        public final Builder localizable_accessory_text(LocalizableString localizable_accessory_text) {
            this.localizable_accessory_text = localizable_accessory_text;
            return this;
        }

        public final Builder localizable_display_name(LocalizableString localizable_display_name) {
            this.localizable_display_name = localizable_display_name;
            return this;
        }

        public final Builder localizable_display_name_compact(LocalizableString localizable_display_name_compact) {
            this.localizable_display_name_compact = localizable_display_name_compact;
            return this;
        }

        public final Builder occurred_at(Long occurred_at) {
            this.occurred_at = occurred_at;
            return this;
        }

        public final Builder payment_account_reference(String payment_account_reference) {
            this.payment_account_reference = payment_account_reference;
            return this;
        }

        public final Builder pending_verification(Boolean pending_verification) {
            this.pending_verification = pending_verification;
            return this;
        }

        public final Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public final Builder selection_icon_url(String selection_icon_url) {
            this.selection_icon_url = selection_icon_url;
            return this;
        }

        public final Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public final Builder token(String token) {
            this.token = token;
            return this;
        }

        public final Builder version(Long version) {
            this.version = version;
            return this;
        }

        public final Builder wallet_address(String wallet_address) {
            this.wallet_address = wallet_address;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Instrument.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.Instrument$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v65 */
            /* JADX WARN: Type inference failed for: r0v68 */
            /* JADX WARN: Type inference failed for: r0v69 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public Instrument decode(ProtoReader reader) {
                Object obj;
                String str;
                String str2;
                ?? decode;
                Instrument.DigitalWalletPaymentToken applePayPaymentToken;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str3 = null;
                Object obj2 = null;
                Object obj3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Object obj4 = null;
                Long l = null;
                String str8 = null;
                Object obj5 = null;
                String str9 = null;
                String str10 = null;
                Boolean bool = null;
                String str11 = null;
                Long l2 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                Boolean bool2 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                CashInstrumentType cashInstrumentType = null;
                Boolean bool3 = null;
                String str18 = null;
                InstrumentType instrumentType = null;
                Instrument.DigitalWalletPaymentToken digitalWalletPaymentToken = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Instrument(str3, cashInstrumentType, instrumentType, str4, str5, str6, str7, (Money) obj4, l, str8, (LocalizableString) obj5, str9, str10, bool, str11, l2, str12, str13, digitalWalletPaymentToken, str14, bool2, str15, str16, (LocalizableString) obj2, str17, (LocalizableString) obj3, bool3, str18, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj = obj2;
                            str = str4;
                            str2 = str5;
                            try {
                                cashInstrumentType = CashInstrumentType.ADAPTER.decode(reader);
                                obj2 = obj;
                                str5 = str2;
                                str4 = str;
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            try {
                                instrumentType = InstrumentType.ADAPTER.decode(reader);
                                decode = str3;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj2;
                                str = str4;
                                str2 = str5;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 4:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 5:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 6:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 7:
                            obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj4);
                            decode = str3;
                            break;
                        case 8:
                            l = ProtoAdapter.INT64.decode(reader);
                            decode = str3;
                            break;
                        case 9:
                        case 14:
                        case 17:
                        case 18:
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj2;
                            str = str4;
                            str2 = str5;
                            decode = str3;
                            obj2 = obj;
                            str5 = str2;
                            str4 = str;
                            break;
                        case 10:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 11:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 12:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 13:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 15:
                            bool = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        case 16:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 19:
                            l2 = ProtoAdapter.INT64.decode(reader);
                            decode = str3;
                            break;
                        case 20:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                            decode = str3;
                            break;
                        case 21:
                            str12 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 22:
                            str13 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 23:
                            applePayPaymentToken = new Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken((ApplePayPaymentToken) ApplePayPaymentToken.ADAPTER.decode(reader));
                            digitalWalletPaymentToken = applePayPaymentToken;
                            decode = str3;
                            break;
                        case 24:
                            applePayPaymentToken = new Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken((GooglePayPaymentToken) GooglePayPaymentToken.ADAPTER.decode(reader));
                            digitalWalletPaymentToken = applePayPaymentToken;
                            decode = str3;
                            break;
                        case 25:
                            str14 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 26:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        case 27:
                            str15 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 28:
                            str16 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 29:
                            str17 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 30:
                            bool3 = ProtoAdapter.BOOL.decode(reader);
                            decode = str3;
                            break;
                        case 31:
                            str18 = ProtoAdapter.STRING.decode(reader);
                            decode = str3;
                            break;
                        case 32:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj2);
                            decode = str3;
                            break;
                        case 33:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj3);
                            decode = str3;
                            break;
                    }
                    str3 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Instrument value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.token);
                CashInstrumentType.ADAPTER.encodeWithTag(writer, 2, value.cash_instrument_type);
                InstrumentType.ADAPTER.encodeWithTag(writer, 3, value.card_brand);
                protoAdapter2.encodeWithTag(writer, 4, value.suffix);
                protoAdapter2.encodeWithTag(writer, 5, value.bank_name);
                protoAdapter2.encodeWithTag(writer, 6, value.icon_url);
                protoAdapter2.encodeWithTag(writer, 10, value.detail_icon_url);
                Money.ADAPTER.encodeWithTag(writer, 7, value.available_balance);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(writer, 8, value.version);
                protoAdapter2.encodeWithTag(writer, 11, value.display_name);
                ProtoAdapter protoAdapter4 = LocalizableString.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 20, value.localizable_display_name);
                protoAdapter2.encodeWithTag(writer, 12, value.bank_short_name);
                protoAdapter2.encodeWithTag(writer, 13, value.wallet_address);
                ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
                protoAdapter5.encodeWithTag(writer, 15, value.pending_verification);
                protoAdapter2.encodeWithTag(writer, 16, value.selection_icon_url);
                protoAdapter3.encodeWithTag(writer, 19, value.occurred_at);
                protoAdapter2.encodeWithTag(writer, 21, value.card_theme_token);
                protoAdapter2.encodeWithTag(writer, 22, value.prefix);
                protoAdapter2.encodeWithTag(writer, 25, value.payment_account_reference);
                protoAdapter5.encodeWithTag(writer, 26, value.default_for_instrument_type);
                protoAdapter2.encodeWithTag(writer, 27, value.accessory_icon_id);
                protoAdapter2.encodeWithTag(writer, 28, value.accessory_text);
                protoAdapter4.encodeWithTag(writer, 32, value.localizable_accessory_text);
                protoAdapter2.encodeWithTag(writer, 29, value.display_name_compact);
                protoAdapter4.encodeWithTag(writer, 33, value.localizable_display_name_compact);
                protoAdapter5.encodeWithTag(writer, 30, value.is_default_for_instrument_type);
                protoAdapter2.encodeWithTag(writer, 31, value.card_art_url);
                Instrument.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                if (digitalWalletPaymentToken instanceof Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken) {
                    ApplePayPaymentToken.ADAPTER.encodeWithTag(writer, 23, ((Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken instanceof Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken) {
                    GooglePayPaymentToken.ADAPTER.encodeWithTag(writer, 24, ((Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Instrument value) {
                int encodedSizeWithTag;
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = Money.ADAPTER.encodedSizeWithTag(7, value.available_balance) + protoAdapter2.encodedSizeWithTag(10, value.detail_icon_url) + protoAdapter2.encodedSizeWithTag(6, value.icon_url) + protoAdapter2.encodedSizeWithTag(5, value.bank_name) + protoAdapter2.encodedSizeWithTag(4, value.suffix) + InstrumentType.ADAPTER.encodedSizeWithTag(3, value.card_brand) + CashInstrumentType.ADAPTER.encodedSizeWithTag(2, value.cash_instrument_type) + protoAdapter2.encodedSizeWithTag(1, value.token) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(11, value.display_name) + protoAdapter3.encodedSizeWithTag(8, value.version) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter4 = LocalizableString.ADAPTER;
                int encodedSizeWithTag4 = protoAdapter2.encodedSizeWithTag(13, value.wallet_address) + protoAdapter2.encodedSizeWithTag(12, value.bank_short_name) + protoAdapter4.encodedSizeWithTag(20, value.localizable_display_name) + encodedSizeWithTag3;
                ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
                int encodedSizeWithTag5 = protoAdapter2.encodedSizeWithTag(22, value.prefix) + protoAdapter2.encodedSizeWithTag(21, value.card_theme_token) + protoAdapter3.encodedSizeWithTag(19, value.occurred_at) + protoAdapter2.encodedSizeWithTag(16, value.selection_icon_url) + protoAdapter5.encodedSizeWithTag(15, value.pending_verification) + encodedSizeWithTag4;
                Instrument.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                if (digitalWalletPaymentToken instanceof Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken) {
                    encodedSizeWithTag = ApplePayPaymentToken.ADAPTER.encodedSizeWithTag(23, ((Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else {
                    if (!(digitalWalletPaymentToken instanceof Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken)) {
                        if (digitalWalletPaymentToken != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(31, value.card_art_url) + protoAdapter5.encodedSizeWithTag(30, value.is_default_for_instrument_type) + protoAdapter4.encodedSizeWithTag(33, value.localizable_display_name_compact) + protoAdapter2.encodedSizeWithTag(29, value.display_name_compact) + protoAdapter4.encodedSizeWithTag(32, value.localizable_accessory_text) + protoAdapter2.encodedSizeWithTag(28, value.accessory_text) + protoAdapter2.encodedSizeWithTag(27, value.accessory_icon_id) + protoAdapter5.encodedSizeWithTag(26, value.default_for_instrument_type) + protoAdapter2.encodedSizeWithTag(25, value.payment_account_reference) + encodedSizeWithTag5;
                    }
                    encodedSizeWithTag = GooglePayPaymentToken.ADAPTER.encodedSizeWithTag(24, ((Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken) digitalWalletPaymentToken).getValue());
                }
                encodedSizeWithTag5 += encodedSizeWithTag;
                return protoAdapter2.encodedSizeWithTag(31, value.card_art_url) + protoAdapter5.encodedSizeWithTag(30, value.is_default_for_instrument_type) + protoAdapter4.encodedSizeWithTag(33, value.localizable_display_name_compact) + protoAdapter2.encodedSizeWithTag(29, value.display_name_compact) + protoAdapter4.encodedSizeWithTag(32, value.localizable_accessory_text) + protoAdapter2.encodedSizeWithTag(28, value.accessory_text) + protoAdapter2.encodedSizeWithTag(27, value.accessory_icon_id) + protoAdapter5.encodedSizeWithTag(26, value.default_for_instrument_type) + protoAdapter2.encodedSizeWithTag(25, value.payment_account_reference) + encodedSizeWithTag5;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Instrument redact(Instrument value) {
                value.getClass();
                Money money = value.available_balance;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                LocalizableString localizableString = value.localizable_display_name;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                LocalizableString localizableString3 = value.localizable_accessory_text;
                LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                LocalizableString localizableString5 = value.localizable_display_name_compact;
                LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.token;
                CashInstrumentType cashInstrumentType = value.cash_instrument_type;
                InstrumentType instrumentType = value.card_brand;
                String str2 = value.suffix;
                String str3 = value.icon_url;
                String str4 = value.detail_icon_url;
                Long l = value.version;
                String str5 = value.display_name;
                String str6 = value.wallet_address;
                Boolean bool = value.pending_verification;
                String str7 = value.selection_icon_url;
                Long l2 = value.occurred_at;
                String str8 = value.card_theme_token;
                String str9 = value.prefix;
                Instrument.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                String str10 = value.payment_account_reference;
                Boolean bool2 = value.default_for_instrument_type;
                String str11 = value.accessory_icon_id;
                String str12 = value.accessory_text;
                String str13 = value.display_name_compact;
                Boolean bool3 = value.is_default_for_instrument_type;
                String str14 = value.card_art_url;
                byteString.getClass();
                return new Instrument(str, cashInstrumentType, instrumentType, str2, null, str3, str4, money2, l, str5, localizableString2, null, str6, bool, str7, l2, str8, str9, digitalWalletPaymentToken, str10, bool2, str11, str12, localizableString4, str13, localizableString6, bool3, str14, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Instrument value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Instrument.DigitalWalletPaymentToken digitalWalletPaymentToken = value.digital_wallet_payment_token;
                if (digitalWalletPaymentToken instanceof Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken) {
                    ApplePayPaymentToken.ADAPTER.encodeWithTag(writer, 23, ((Instrument.DigitalWalletPaymentToken.ApplePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken instanceof Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken) {
                    GooglePayPaymentToken.ADAPTER.encodeWithTag(writer, 24, ((Instrument.DigitalWalletPaymentToken.GooglePayPaymentToken) digitalWalletPaymentToken).getValue());
                } else if (digitalWalletPaymentToken != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 31, value.card_art_url);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 30, value.is_default_for_instrument_type);
                ProtoAdapter protoAdapter4 = LocalizableString.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 33, value.localizable_display_name_compact);
                protoAdapter2.encodeWithTag(writer, 29, value.display_name_compact);
                protoAdapter4.encodeWithTag(writer, 32, value.localizable_accessory_text);
                protoAdapter2.encodeWithTag(writer, 28, value.accessory_text);
                protoAdapter2.encodeWithTag(writer, 27, value.accessory_icon_id);
                protoAdapter3.encodeWithTag(writer, 26, value.default_for_instrument_type);
                protoAdapter2.encodeWithTag(writer, 25, value.payment_account_reference);
                protoAdapter2.encodeWithTag(writer, 22, value.prefix);
                protoAdapter2.encodeWithTag(writer, 21, value.card_theme_token);
                ProtoAdapter protoAdapter5 = ProtoAdapter.INT64;
                protoAdapter5.encodeWithTag(writer, 19, value.occurred_at);
                protoAdapter2.encodeWithTag(writer, 16, value.selection_icon_url);
                protoAdapter3.encodeWithTag(writer, 15, value.pending_verification);
                protoAdapter2.encodeWithTag(writer, 13, value.wallet_address);
                protoAdapter2.encodeWithTag(writer, 12, value.bank_short_name);
                protoAdapter4.encodeWithTag(writer, 20, value.localizable_display_name);
                protoAdapter2.encodeWithTag(writer, 11, value.display_name);
                protoAdapter5.encodeWithTag(writer, 8, value.version);
                Money.ADAPTER.encodeWithTag(writer, 7, value.available_balance);
                protoAdapter2.encodeWithTag(writer, 10, value.detail_icon_url);
                protoAdapter2.encodeWithTag(writer, 6, value.icon_url);
                protoAdapter2.encodeWithTag(writer, 5, value.bank_name);
                protoAdapter2.encodeWithTag(writer, 4, value.suffix);
                InstrumentType.ADAPTER.encodeWithTag(writer, 3, value.card_brand);
                CashInstrumentType.ADAPTER.encodeWithTag(writer, 2, value.cash_instrument_type);
                protoAdapter2.encodeWithTag(writer, 1, value.token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ Instrument(String str, CashInstrumentType cashInstrumentType, InstrumentType instrumentType, String str2, String str3, String str4, String str5, Money money, Long l, String str6, String str7, Long l2, String str8, String str9, String str10, Boolean bool, String str11, int i) {
        this(str, cashInstrumentType, instrumentType, str2, str3, str4, (i & 64) != 0 ? null : str5, money, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str6, null, null, null, null, (i & 16384) != 0 ? null : str7, (32768 & i) != 0 ? null : l2, null, null, null, null, null, (2097152 & i) != 0 ? null : str8, (4194304 & i) != 0 ? null : str9, null, (16777216 & i) != 0 ? null : str10, null, (67108864 & i) != 0 ? null : bool, (i & 134217728) != 0 ? null : str11, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Instrument)) {
            return false;
        }
        Instrument instrument = (Instrument) obj;
        return Intrinsics.areEqual(unknownFields(), instrument.unknownFields()) && Intrinsics.areEqual(this.token, instrument.token) && this.cash_instrument_type == instrument.cash_instrument_type && this.card_brand == instrument.card_brand && Intrinsics.areEqual(this.suffix, instrument.suffix) && Intrinsics.areEqual(this.bank_name, instrument.bank_name) && Intrinsics.areEqual(this.icon_url, instrument.icon_url) && Intrinsics.areEqual(this.detail_icon_url, instrument.detail_icon_url) && Intrinsics.areEqual(this.available_balance, instrument.available_balance) && Intrinsics.areEqual(this.version, instrument.version) && Intrinsics.areEqual(this.display_name, instrument.display_name) && Intrinsics.areEqual(this.localizable_display_name, instrument.localizable_display_name) && Intrinsics.areEqual(this.bank_short_name, instrument.bank_short_name) && Intrinsics.areEqual(this.wallet_address, instrument.wallet_address) && Intrinsics.areEqual(this.pending_verification, instrument.pending_verification) && Intrinsics.areEqual(this.selection_icon_url, instrument.selection_icon_url) && Intrinsics.areEqual(this.occurred_at, instrument.occurred_at) && Intrinsics.areEqual(this.card_theme_token, instrument.card_theme_token) && Intrinsics.areEqual(this.prefix, instrument.prefix) && Intrinsics.areEqual(this.digital_wallet_payment_token, instrument.digital_wallet_payment_token) && Intrinsics.areEqual(this.payment_account_reference, instrument.payment_account_reference) && Intrinsics.areEqual(this.default_for_instrument_type, instrument.default_for_instrument_type) && Intrinsics.areEqual(this.accessory_icon_id, instrument.accessory_icon_id) && Intrinsics.areEqual(this.accessory_text, instrument.accessory_text) && Intrinsics.areEqual(this.localizable_accessory_text, instrument.localizable_accessory_text) && Intrinsics.areEqual(this.display_name_compact, instrument.display_name_compact) && Intrinsics.areEqual(this.localizable_display_name_compact, instrument.localizable_display_name_compact) && Intrinsics.areEqual(this.is_default_for_instrument_type, instrument.is_default_for_instrument_type) && Intrinsics.areEqual(this.card_art_url, instrument.card_art_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CashInstrumentType cashInstrumentType = this.cash_instrument_type;
        int hashCode3 = (hashCode2 + (cashInstrumentType != null ? cashInstrumentType.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.card_brand;
        int hashCode4 = (hashCode3 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str2 = this.suffix;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.bank_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.icon_url;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.detail_icon_url;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money = this.available_balance;
        int hashCode9 = (hashCode8 + (money != null ? money.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str6 = this.display_name;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_display_name;
        int hashCode12 = (hashCode11 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str7 = this.bank_short_name;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.wallet_address;
        int hashCode14 = (hashCode13 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Boolean bool = this.pending_verification;
        int hashCode15 = (hashCode14 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str9 = this.selection_icon_url;
        int hashCode16 = (hashCode15 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Long l2 = this.occurred_at;
        int hashCode17 = (hashCode16 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str10 = this.card_theme_token;
        int hashCode18 = (hashCode17 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.prefix;
        int hashCode19 = (hashCode18 + (str11 != null ? str11.hashCode() : 0)) * 37;
        DigitalWalletPaymentToken digitalWalletPaymentToken = this.digital_wallet_payment_token;
        int hashCode20 = (hashCode19 + (digitalWalletPaymentToken != null ? digitalWalletPaymentToken.hashCode() : 0)) * 37;
        String str12 = this.payment_account_reference;
        int hashCode21 = (hashCode20 + (str12 != null ? str12.hashCode() : 0)) * 37;
        Boolean bool2 = this.default_for_instrument_type;
        int hashCode22 = (hashCode21 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str13 = this.accessory_icon_id;
        int hashCode23 = (hashCode22 + (str13 != null ? str13.hashCode() : 0)) * 37;
        String str14 = this.accessory_text;
        int hashCode24 = (hashCode23 + (str14 != null ? str14.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_accessory_text;
        int hashCode25 = (hashCode24 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        String str15 = this.display_name_compact;
        int hashCode26 = (hashCode25 + (str15 != null ? str15.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_display_name_compact;
        int hashCode27 = (hashCode26 + (localizableString3 != null ? localizableString3.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_default_for_instrument_type;
        int hashCode28 = (hashCode27 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        String str16 = this.card_art_url;
        int hashCode29 = hashCode28 + (str16 != null ? str16.hashCode() : 0);
        this.hashCode = hashCode29;
        return hashCode29;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token = this.token;
        builder.cash_instrument_type = this.cash_instrument_type;
        builder.card_brand = this.card_brand;
        builder.suffix = this.suffix;
        builder.bank_name = this.bank_name;
        builder.icon_url = this.icon_url;
        builder.detail_icon_url = this.detail_icon_url;
        builder.available_balance = this.available_balance;
        builder.version = this.version;
        builder.display_name = this.display_name;
        builder.localizable_display_name = this.localizable_display_name;
        builder.bank_short_name = this.bank_short_name;
        builder.wallet_address = this.wallet_address;
        builder.pending_verification = this.pending_verification;
        builder.selection_icon_url = this.selection_icon_url;
        builder.occurred_at = this.occurred_at;
        builder.card_theme_token = this.card_theme_token;
        builder.prefix = this.prefix;
        builder.digital_wallet_payment_token = this.digital_wallet_payment_token;
        builder.payment_account_reference = this.payment_account_reference;
        builder.default_for_instrument_type = this.default_for_instrument_type;
        builder.accessory_icon_id = this.accessory_icon_id;
        builder.accessory_text = this.accessory_text;
        builder.localizable_accessory_text = this.localizable_accessory_text;
        builder.display_name_compact = this.display_name_compact;
        builder.localizable_display_name_compact = this.localizable_display_name_compact;
        builder.is_default_for_instrument_type = this.is_default_for_instrument_type;
        builder.card_art_url = this.card_art_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        CashInstrumentType cashInstrumentType = this.cash_instrument_type;
        if (cashInstrumentType != null) {
            arrayList.add("cash_instrument_type=" + cashInstrumentType);
        }
        InstrumentType instrumentType = this.card_brand;
        if (instrumentType != null) {
            arrayList.add("card_brand=" + instrumentType);
        }
        String str2 = this.suffix;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "suffix=", arrayList);
        }
        if (this.bank_name != null) {
            arrayList.add("bank_name=██");
        }
        String str3 = this.icon_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "icon_url=", arrayList);
        }
        String str4 = this.detail_icon_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "detail_icon_url=", arrayList);
        }
        Money money = this.available_balance;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("available_balance=", money, arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        String str5 = this.display_name;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "display_name=", arrayList);
        }
        LocalizableString localizableString = this.localizable_display_name;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_display_name=", localizableString, arrayList);
        }
        if (this.bank_short_name != null) {
            arrayList.add("bank_short_name=██");
        }
        String str6 = this.wallet_address;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "wallet_address=", arrayList);
        }
        Boolean bool = this.pending_verification;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("pending_verification=", bool, arrayList);
        }
        String str7 = this.selection_icon_url;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "selection_icon_url=", arrayList);
        }
        Long l2 = this.occurred_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("occurred_at=", l2, arrayList);
        }
        String str8 = this.card_theme_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "card_theme_token=", arrayList);
        }
        String str9 = this.prefix;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "prefix=", arrayList);
        }
        DigitalWalletPaymentToken digitalWalletPaymentToken = this.digital_wallet_payment_token;
        if (digitalWalletPaymentToken != null) {
            arrayList.add("digital_wallet_payment_token=" + digitalWalletPaymentToken);
        }
        String str10 = this.payment_account_reference;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "payment_account_reference=", arrayList);
        }
        Boolean bool2 = this.default_for_instrument_type;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("default_for_instrument_type=", bool2, arrayList);
        }
        String str11 = this.accessory_icon_id;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "accessory_icon_id=", arrayList);
        }
        String str12 = this.accessory_text;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "accessory_text=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_accessory_text;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_accessory_text=", localizableString2, arrayList);
        }
        String str13 = this.display_name_compact;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "display_name_compact=", arrayList);
        }
        LocalizableString localizableString3 = this.localizable_display_name_compact;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_display_name_compact=", localizableString3, arrayList);
        }
        Boolean bool3 = this.is_default_for_instrument_type;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_default_for_instrument_type=", bool3, arrayList);
        }
        String str14 = this.card_art_url;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "card_art_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Instrument{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/Instrument$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/Instrument$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/Instrument;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/Instrument;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Instrument build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken;", "", "<init>", "()V", "ApplePayPaymentToken", "GooglePayPaymentToken", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken$ApplePayPaymentToken;", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken$GooglePayPaymentToken;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class DigitalWalletPaymentToken {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.ApplePayPaymentToken#ADAPTER", declaredName = "apple_pay_payment_token", tag = 23)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken$ApplePayPaymentToken;", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken;", "value", "Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;", "<init>", "(Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;)V", "getValue", "()Lcom/squareup/protos/franklin/api/ApplePayPaymentToken;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final /* data */ class ApplePayPaymentToken extends DigitalWalletPaymentToken {
            private final com.squareup.protos.franklin.api.ApplePayPaymentToken value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplePayPaymentToken(com.squareup.protos.franklin.api.ApplePayPaymentToken applePayPaymentToken) {
                super(null);
                applePayPaymentToken.getClass();
                this.value = applePayPaymentToken;
            }

            public static /* synthetic */ ApplePayPaymentToken copy$default(ApplePayPaymentToken applePayPaymentToken, com.squareup.protos.franklin.api.ApplePayPaymentToken applePayPaymentToken2, int i, Object obj) {
                if ((i & 1) != 0) {
                    applePayPaymentToken2 = applePayPaymentToken.value;
                }
                return applePayPaymentToken.copy(applePayPaymentToken2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.protos.franklin.api.ApplePayPaymentToken getValue() {
                return this.value;
            }

            public final ApplePayPaymentToken copy(com.squareup.protos.franklin.api.ApplePayPaymentToken value) {
                value.getClass();
                return new ApplePayPaymentToken(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ApplePayPaymentToken) && Intrinsics.areEqual(this.value, ((ApplePayPaymentToken) other).value);
            }

            public final com.squareup.protos.franklin.api.ApplePayPaymentToken getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ApplePayPaymentToken(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.GooglePayPaymentToken#ADAPTER", declaredName = "google_pay_payment_token", tag = 24)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken$GooglePayPaymentToken;", "Lcom/squareup/protos/franklin/api/Instrument$DigitalWalletPaymentToken;", "value", "Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;", "<init>", "(Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;)V", "getValue", "()Lcom/squareup/protos/franklin/api/GooglePayPaymentToken;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes8.dex */
        public static final /* data */ class GooglePayPaymentToken extends DigitalWalletPaymentToken {
            private final com.squareup.protos.franklin.api.GooglePayPaymentToken value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GooglePayPaymentToken(com.squareup.protos.franklin.api.GooglePayPaymentToken googlePayPaymentToken) {
                super(null);
                googlePayPaymentToken.getClass();
                this.value = googlePayPaymentToken;
            }

            public static /* synthetic */ GooglePayPaymentToken copy$default(GooglePayPaymentToken googlePayPaymentToken, com.squareup.protos.franklin.api.GooglePayPaymentToken googlePayPaymentToken2, int i, Object obj) {
                if ((i & 1) != 0) {
                    googlePayPaymentToken2 = googlePayPaymentToken.value;
                }
                return googlePayPaymentToken.copy(googlePayPaymentToken2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.protos.franklin.api.GooglePayPaymentToken getValue() {
                return this.value;
            }

            public final GooglePayPaymentToken copy(com.squareup.protos.franklin.api.GooglePayPaymentToken value) {
                value.getClass();
                return new GooglePayPaymentToken(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GooglePayPaymentToken) && Intrinsics.areEqual(this.value, ((GooglePayPaymentToken) other).value);
            }

            public final com.squareup.protos.franklin.api.GooglePayPaymentToken getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GooglePayPaymentToken(value=" + this.value + ")";
            }
        }

        public /* synthetic */ DigitalWalletPaymentToken(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DigitalWalletPaymentToken() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Instrument(String str, CashInstrumentType cashInstrumentType, InstrumentType instrumentType, String str2, String str3, String str4, String str5, Money money, Long l, String str6, LocalizableString localizableString, String str7, String str8, Boolean bool, String str9, Long l2, String str10, String str11, DigitalWalletPaymentToken digitalWalletPaymentToken, String str12, Boolean bool2, String str13, String str14, LocalizableString localizableString2, String str15, LocalizableString localizableString3, Boolean bool3, String str16, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.cash_instrument_type = cashInstrumentType;
        this.card_brand = instrumentType;
        this.suffix = str2;
        this.bank_name = str3;
        this.icon_url = str4;
        this.detail_icon_url = str5;
        this.available_balance = money;
        this.version = l;
        this.display_name = str6;
        this.localizable_display_name = localizableString;
        this.bank_short_name = str7;
        this.wallet_address = str8;
        this.pending_verification = bool;
        this.selection_icon_url = str9;
        this.occurred_at = l2;
        this.card_theme_token = str10;
        this.prefix = str11;
        this.digital_wallet_payment_token = digitalWalletPaymentToken;
        this.payment_account_reference = str12;
        this.default_for_instrument_type = bool2;
        this.accessory_icon_id = str13;
        this.accessory_text = str14;
        this.localizable_accessory_text = localizableString2;
        this.display_name_compact = str15;
        this.localizable_display_name_compact = localizableString3;
        this.is_default_for_instrument_type = bool3;
        this.card_art_url = str16;
    }
}
