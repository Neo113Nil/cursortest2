package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.UiCustomer;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003A@BR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u0012\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0005\u0012\u0004\b'\u0010\fR\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010\fR\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001eR\u0016\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000fR\u0016\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0005R\u0016\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0005R\u0016\u0010<\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u000fR\u0016\u0010>\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiCustomer;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiCustomer$Builder;", "", "id", "Ljava/lang/String;", "threaded_customer_id", "email_address", "full_name", "sms_number", "photo_url", "getPhoto_url$annotations", "()V", "", "is_cash_customer", "Ljava/lang/Boolean;", "can_accept_payments", "is_square", "cashtag", "is_nearby", "is_business", "is_verified_account", "Lcom/squareup/protos/franklin/ui/UiCustomer$SelectionMethod;", "selection_method", "Lcom/squareup/protos/franklin/ui/UiCustomer$SelectionMethod;", "Lcom/squareup/protos/franklin/ui/UiCheckAddress;", "check_address", "Lcom/squareup/protos/franklin/ui/UiCheckAddress;", "", "credit_card_fee_bps", "Ljava/lang/Long;", "render_data", "Lcom/squareup/protos/franklin/ui/BlockState;", "block_state", "Lcom/squareup/protos/franklin/ui/BlockState;", "Lcom/squareup/protos/franklin/ui/MerchantData;", "merchant_data", "Lcom/squareup/protos/franklin/ui/MerchantData;", "accent_color", "getAccent_color$annotations", "Lcom/squareup/protos/common/countries/Country;", "country_code", "Lcom/squareup/protos/common/countries/Country;", "getCountry_code$annotations", "Lcom/squareup/protos/franklin/ui/InvestmentEntityData;", "investment_entity_data", "Lcom/squareup/protos/franklin/ui/InvestmentEntityData;", "Lcom/squareup/protos/franklin/api/Region;", "region", "Lcom/squareup/protos/franklin/api/Region;", "customer_joined_on", "Lcom/squareup/protos/cash/ui/Image;", "photo", "Lcom/squareup/protos/cash/ui/Image;", "Lcom/squareup/protos/cash/ui/Color;", "themed_accent_color", "Lcom/squareup/protos/cash/ui/Color;", "is_suspended", "payment_url", "arcade_icon_token", "is_special_customer", "Lcom/squareup/protos/franklin/ui/ContactsStatus;", "contacts_status", "Lcom/squareup/protos/franklin/ui/ContactsStatus;", "Companion", "Builder", "SelectionMethod", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UiCustomer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiCustomer> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 19, tag = 21)
    public final String accent_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 28, tag = 30)
    public final String arcade_icon_token;

    @WireField(adapter = "com.squareup.protos.franklin.ui.BlockState#ADAPTER", schemaIndex = 17, tag = 18)
    public final BlockState block_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 7)
    public final Boolean can_accept_payments;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 9, tag = 8)
    public final String cashtag;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCheckAddress#ADAPTER", schemaIndex = 14, tag = 13)
    public final UiCheckAddress check_address;

    @WireField(adapter = "com.squareup.protos.franklin.ui.ContactsStatus#ADAPTER", schemaIndex = 30, tag = 32)
    public final ContactsStatus contacts_status;

    @WireField(adapter = "com.squareup.protos.common.countries.Country#ADAPTER", schemaIndex = 20, tag = 22)
    public final Country country_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 15, tag = 14)
    public final Long credit_card_fee_bps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 23, tag = 25)
    public final Long customer_joined_on;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 2)
    public final String email_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 3)
    public final String full_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.protos.franklin.ui.InvestmentEntityData#ADAPTER", schemaIndex = 21, tag = 23)
    public final InvestmentEntityData investment_entity_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 11, tag = 11)
    public final Boolean is_business;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 6)
    public final Boolean is_cash_customer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 10, tag = 9)
    public final Boolean is_nearby;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 29, tag = 31)
    public final Boolean is_special_customer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 16)
    public final Boolean is_square;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 26, tag = 28)
    public final Boolean is_suspended;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 12, tag = 12)
    public final Boolean is_verified_account;

    @WireField(adapter = "com.squareup.protos.franklin.ui.MerchantData#ADAPTER", schemaIndex = 18, tag = 19)
    public final MerchantData merchant_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 27, tag = 29)
    public final String payment_url;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", redacted = true, schemaIndex = 24, tag = 26)
    public final Image photo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 5)
    public final String photo_url;

    @WireField(adapter = "com.squareup.protos.franklin.api.Region#ADAPTER", schemaIndex = 22, tag = 24)
    public final Region region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 16, tag = 15)
    public final String render_data;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer$SelectionMethod#ADAPTER", schemaIndex = 13, tag = 10)
    public final SelectionMethod selection_method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 4)
    public final String sms_number;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 25, tag = 27)
    public final Color themed_accent_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 20)
    public final String threaded_customer_id;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0015\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u00104J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0012\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#H\u0007J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0015\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u00104J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,J\u0015\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0010\u0010.\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010\u0006J\u0010\u0010/\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0006J\u0015\u00100\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u00103J\u0010\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000102J\b\u00105\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0014\u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010.\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u00100\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiCustomer$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "<init>", "()V", "id", "", "threaded_customer_id", "email_address", "full_name", "sms_number", "photo_url", "is_cash_customer", "", "Ljava/lang/Boolean;", "can_accept_payments", "is_square", "cashtag", "is_nearby", "is_business", "is_verified_account", "selection_method", "Lcom/squareup/protos/franklin/ui/UiCustomer$SelectionMethod;", "check_address", "Lcom/squareup/protos/franklin/ui/UiCheckAddress;", "credit_card_fee_bps", "", "Ljava/lang/Long;", "render_data", "block_state", "Lcom/squareup/protos/franklin/ui/BlockState;", "merchant_data", "Lcom/squareup/protos/franklin/ui/MerchantData;", "accent_color", "country_code", "Lcom/squareup/protos/common/countries/Country;", "investment_entity_data", "Lcom/squareup/protos/franklin/ui/InvestmentEntityData;", "region", "Lcom/squareup/protos/franklin/api/Region;", "customer_joined_on", "photo", "Lcom/squareup/protos/cash/ui/Image;", "themed_accent_color", "Lcom/squareup/protos/cash/ui/Color;", "is_suspended", "payment_url", "arcade_icon_token", "is_special_customer", "contacts_status", "Lcom/squareup/protos/franklin/ui/ContactsStatus;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/UiCustomer$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/ui/UiCustomer$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accent_color;
        public String arcade_icon_token;
        public BlockState block_state;
        public Boolean can_accept_payments;
        public String cashtag;
        public UiCheckAddress check_address;
        public ContactsStatus contacts_status;
        public Country country_code;
        public Long credit_card_fee_bps;
        public Long customer_joined_on;
        public String email_address;
        public String full_name;
        public String id;
        public InvestmentEntityData investment_entity_data;
        public Boolean is_business;
        public Boolean is_cash_customer;
        public Boolean is_nearby;
        public Boolean is_special_customer;
        public Boolean is_square;
        public Boolean is_suspended;
        public Boolean is_verified_account;
        public MerchantData merchant_data;
        public String payment_url;
        public Image photo;
        public String photo_url;
        public Region region;
        public String render_data;
        public SelectionMethod selection_method;
        public String sms_number;
        public Color themed_accent_color;
        public String threaded_customer_id;

        @Deprecated
        public final Builder accent_color(String accent_color) {
            this.accent_color = accent_color;
            return this;
        }

        public final Builder arcade_icon_token(String arcade_icon_token) {
            this.arcade_icon_token = arcade_icon_token;
            return this;
        }

        public final Builder block_state(BlockState block_state) {
            this.block_state = block_state;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public UiCustomer build() {
            return new UiCustomer(this.id, this.threaded_customer_id, this.email_address, this.full_name, this.sms_number, this.photo_url, this.is_cash_customer, this.can_accept_payments, this.is_square, this.cashtag, this.is_nearby, this.is_business, this.is_verified_account, this.selection_method, this.check_address, this.credit_card_fee_bps, this.render_data, this.block_state, this.merchant_data, this.accent_color, this.country_code, this.investment_entity_data, this.region, this.customer_joined_on, this.photo, this.themed_accent_color, this.is_suspended, this.payment_url, this.arcade_icon_token, this.is_special_customer, this.contacts_status, buildUnknownFields());
        }

        public final Builder can_accept_payments(Boolean can_accept_payments) {
            this.can_accept_payments = can_accept_payments;
            return this;
        }

        public final Builder cashtag(String cashtag) {
            this.cashtag = cashtag;
            return this;
        }

        public final Builder check_address(UiCheckAddress check_address) {
            this.check_address = check_address;
            return this;
        }

        public final Builder contacts_status(ContactsStatus contacts_status) {
            this.contacts_status = contacts_status;
            return this;
        }

        @Deprecated
        public final Builder country_code(Country country_code) {
            this.country_code = country_code;
            return this;
        }

        public final Builder credit_card_fee_bps(Long credit_card_fee_bps) {
            this.credit_card_fee_bps = credit_card_fee_bps;
            return this;
        }

        public final Builder customer_joined_on(Long customer_joined_on) {
            this.customer_joined_on = customer_joined_on;
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

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder investment_entity_data(InvestmentEntityData investment_entity_data) {
            this.investment_entity_data = investment_entity_data;
            return this;
        }

        public final Builder is_business(Boolean is_business) {
            this.is_business = is_business;
            return this;
        }

        public final Builder is_cash_customer(Boolean is_cash_customer) {
            this.is_cash_customer = is_cash_customer;
            return this;
        }

        public final Builder is_nearby(Boolean is_nearby) {
            this.is_nearby = is_nearby;
            return this;
        }

        public final Builder is_special_customer(Boolean is_special_customer) {
            this.is_special_customer = is_special_customer;
            return this;
        }

        public final Builder is_square(Boolean is_square) {
            this.is_square = is_square;
            return this;
        }

        public final Builder is_suspended(Boolean is_suspended) {
            this.is_suspended = is_suspended;
            return this;
        }

        public final Builder is_verified_account(Boolean is_verified_account) {
            this.is_verified_account = is_verified_account;
            return this;
        }

        public final Builder merchant_data(MerchantData merchant_data) {
            this.merchant_data = merchant_data;
            return this;
        }

        public final Builder payment_url(String payment_url) {
            this.payment_url = payment_url;
            return this;
        }

        public final Builder photo(Image photo) {
            this.photo = photo;
            return this;
        }

        @Deprecated
        public final Builder photo_url(String photo_url) {
            this.photo_url = photo_url;
            return this;
        }

        public final Builder region(Region region) {
            this.region = region;
            return this;
        }

        public final Builder render_data(String render_data) {
            this.render_data = render_data;
            return this;
        }

        public final Builder selection_method(SelectionMethod selection_method) {
            this.selection_method = selection_method;
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

        public final Builder threaded_customer_id(String threaded_customer_id) {
            this.threaded_customer_id = threaded_customer_id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UiCustomer.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.UiCustomer$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v79 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v82 */
            /* JADX WARN: Type inference failed for: r0v83 */
            @Override // com.squareup.wire.ProtoAdapter
            public UiCustomer decode(ProtoReader reader) {
                Boolean bool;
                Boolean bool2;
                Boolean bool3;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Boolean bool4 = null;
                Boolean bool5 = null;
                Boolean bool6 = null;
                String str2 = null;
                Boolean bool7 = null;
                Boolean bool8 = null;
                Boolean bool9 = null;
                UiCustomer.SelectionMethod selectionMethod = null;
                Long l = null;
                String str3 = null;
                BlockState blockState = null;
                String str4 = null;
                String str5 = null;
                Country country = null;
                String str6 = null;
                Region region = null;
                Long l2 = null;
                String str7 = null;
                String str8 = null;
                Boolean bool10 = null;
                String str9 = null;
                String str10 = null;
                Boolean bool11 = null;
                ContactsStatus contactsStatus = null;
                String str11 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new UiCustomer(str, str4, str6, str7, str8, str11, bool4, bool5, bool6, str2, bool7, bool8, bool9, selectionMethod, (UiCheckAddress) obj, l, str3, blockState, (MerchantData) obj2, str5, country, (InvestmentEntityData) obj3, region, l2, (Image) obj4, (Color) obj5, bool10, str9, str10, bool11, contactsStatus, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 3:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 4:
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 5:
                            str11 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 6:
                            bool4 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 7:
                            bool5 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 8:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 9:
                            bool7 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 10:
                            bool = bool4;
                            bool2 = bool5;
                            bool3 = bool6;
                            try {
                                selectionMethod = UiCustomer.SelectionMethod.ADAPTER.decode(reader);
                                bool4 = bool;
                                bool5 = bool2;
                                bool6 = bool3;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 11:
                            bool8 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 12:
                            bool9 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 13:
                            obj = TransactorKt.decodeMessageOrMerge(UiCheckAddress.ADAPTER, reader, obj);
                            decode = str;
                            break;
                        case 14:
                            l = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 15:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 16:
                            bool6 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 17:
                        default:
                            reader.readUnknownField(nextTag);
                            bool = bool4;
                            bool2 = bool5;
                            bool3 = bool6;
                            decode = str;
                            bool4 = bool;
                            bool5 = bool2;
                            bool6 = bool3;
                            break;
                        case 18:
                            bool = bool4;
                            bool2 = bool5;
                            bool3 = bool6;
                            try {
                                blockState = BlockState.ADAPTER.decode(reader);
                                bool4 = bool;
                                bool5 = bool2;
                                bool6 = bool3;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 19:
                            obj2 = TransactorKt.decodeMessageOrMerge(MerchantData.ADAPTER, reader, obj2);
                            decode = str;
                            break;
                        case 20:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 21:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 22:
                            bool = bool4;
                            bool2 = bool5;
                            bool3 = bool6;
                            try {
                                country = Country.ADAPTER.decode(reader);
                                bool4 = bool;
                                bool5 = bool2;
                                bool6 = bool3;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 23:
                            obj3 = TransactorKt.decodeMessageOrMerge(InvestmentEntityData.ADAPTER, reader, obj3);
                            decode = str;
                            break;
                        case 24:
                            bool = bool4;
                            bool2 = bool5;
                            bool3 = bool6;
                            try {
                                region = Region.ADAPTER.decode(reader);
                                bool4 = bool;
                                bool5 = bool2;
                                bool6 = bool3;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 25:
                            l2 = ProtoAdapter.INT64.decode(reader);
                            decode = str;
                            break;
                        case 26:
                            obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                            decode = str;
                            break;
                        case 27:
                            obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj5);
                            decode = str;
                            break;
                        case 28:
                            bool10 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 29:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 30:
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 31:
                            bool11 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 32:
                            try {
                                contactsStatus = ContactsStatus.ADAPTER.decode(reader);
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                bool = bool4;
                                bool2 = bool5;
                                bool3 = bool6;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                    }
                    str = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UiCustomer value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.id);
                protoAdapter2.encodeWithTag(writer, 20, value.threaded_customer_id);
                protoAdapter2.encodeWithTag(writer, 2, value.email_address);
                protoAdapter2.encodeWithTag(writer, 3, value.full_name);
                protoAdapter2.encodeWithTag(writer, 4, value.sms_number);
                protoAdapter2.encodeWithTag(writer, 5, value.photo_url);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 6, value.is_cash_customer);
                protoAdapter3.encodeWithTag(writer, 7, value.can_accept_payments);
                protoAdapter3.encodeWithTag(writer, 16, value.is_square);
                protoAdapter2.encodeWithTag(writer, 8, value.cashtag);
                protoAdapter3.encodeWithTag(writer, 9, value.is_nearby);
                protoAdapter3.encodeWithTag(writer, 11, value.is_business);
                protoAdapter3.encodeWithTag(writer, 12, value.is_verified_account);
                UiCustomer.SelectionMethod.ADAPTER.encodeWithTag(writer, 10, value.selection_method);
                UiCheckAddress.ADAPTER.encodeWithTag(writer, 13, value.check_address);
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                protoAdapter4.encodeWithTag(writer, 14, value.credit_card_fee_bps);
                protoAdapter2.encodeWithTag(writer, 15, value.render_data);
                BlockState.ADAPTER.encodeWithTag(writer, 18, value.block_state);
                MerchantData.ADAPTER.encodeWithTag(writer, 19, value.merchant_data);
                protoAdapter2.encodeWithTag(writer, 21, value.accent_color);
                Country.ADAPTER.encodeWithTag(writer, 22, value.country_code);
                InvestmentEntityData.ADAPTER.encodeWithTag(writer, 23, value.investment_entity_data);
                Region.ADAPTER.encodeWithTag(writer, 24, value.region);
                protoAdapter4.encodeWithTag(writer, 25, value.customer_joined_on);
                Image.ADAPTER.encodeWithTag(writer, 26, value.photo);
                Color.ADAPTER.encodeWithTag(writer, 27, value.themed_accent_color);
                protoAdapter3.encodeWithTag(writer, 28, value.is_suspended);
                protoAdapter2.encodeWithTag(writer, 29, value.payment_url);
                protoAdapter2.encodeWithTag(writer, 30, value.arcade_icon_token);
                protoAdapter3.encodeWithTag(writer, 31, value.is_special_customer);
                ContactsStatus.ADAPTER.encodeWithTag(writer, 32, value.contacts_status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UiCustomer value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, value.photo_url) + protoAdapter2.encodedSizeWithTag(4, value.sms_number) + protoAdapter2.encodedSizeWithTag(3, value.full_name) + protoAdapter2.encodedSizeWithTag(2, value.email_address) + protoAdapter2.encodedSizeWithTag(20, value.threaded_customer_id) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                int encodedSizeWithTag2 = UiCheckAddress.ADAPTER.encodedSizeWithTag(13, value.check_address) + UiCustomer.SelectionMethod.ADAPTER.encodedSizeWithTag(10, value.selection_method) + protoAdapter3.encodedSizeWithTag(12, value.is_verified_account) + protoAdapter3.encodedSizeWithTag(11, value.is_business) + protoAdapter3.encodedSizeWithTag(9, value.is_nearby) + protoAdapter2.encodedSizeWithTag(8, value.cashtag) + protoAdapter3.encodedSizeWithTag(16, value.is_square) + protoAdapter3.encodedSizeWithTag(7, value.can_accept_payments) + protoAdapter3.encodedSizeWithTag(6, value.is_cash_customer) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                return ContactsStatus.ADAPTER.encodedSizeWithTag(32, value.contacts_status) + protoAdapter3.encodedSizeWithTag(31, value.is_special_customer) + protoAdapter2.encodedSizeWithTag(30, value.arcade_icon_token) + protoAdapter2.encodedSizeWithTag(29, value.payment_url) + protoAdapter3.encodedSizeWithTag(28, value.is_suspended) + Color.ADAPTER.encodedSizeWithTag(27, value.themed_accent_color) + Image.ADAPTER.encodedSizeWithTag(26, value.photo) + protoAdapter4.encodedSizeWithTag(25, value.customer_joined_on) + Region.ADAPTER.encodedSizeWithTag(24, value.region) + InvestmentEntityData.ADAPTER.encodedSizeWithTag(23, value.investment_entity_data) + Country.ADAPTER.encodedSizeWithTag(22, value.country_code) + protoAdapter2.encodedSizeWithTag(21, value.accent_color) + MerchantData.ADAPTER.encodedSizeWithTag(19, value.merchant_data) + BlockState.ADAPTER.encodedSizeWithTag(18, value.block_state) + protoAdapter2.encodedSizeWithTag(15, value.render_data) + protoAdapter4.encodedSizeWithTag(14, value.credit_card_fee_bps) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UiCustomer redact(UiCustomer value) {
                value.getClass();
                UiCheckAddress uiCheckAddress = value.check_address;
                UiCheckAddress uiCheckAddress2 = uiCheckAddress != null ? (UiCheckAddress) UiCheckAddress.ADAPTER.redact(uiCheckAddress) : null;
                MerchantData merchantData = value.merchant_data;
                MerchantData merchantData2 = merchantData != null ? (MerchantData) MerchantData.ADAPTER.redact(merchantData) : null;
                InvestmentEntityData investmentEntityData = value.investment_entity_data;
                InvestmentEntityData investmentEntityData2 = investmentEntityData != null ? (InvestmentEntityData) InvestmentEntityData.ADAPTER.redact(investmentEntityData) : null;
                Color color = value.themed_accent_color;
                return UiCustomer.copy$default(value, null, null, null, null, null, uiCheckAddress2, merchantData2, investmentEntityData2, color != null ? (Color) Color.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 2094710211);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UiCustomer value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ContactsStatus.ADAPTER.encodeWithTag(writer, 32, value.contacts_status);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 31, value.is_special_customer);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 30, value.arcade_icon_token);
                protoAdapter3.encodeWithTag(writer, 29, value.payment_url);
                protoAdapter2.encodeWithTag(writer, 28, value.is_suspended);
                Color.ADAPTER.encodeWithTag(writer, 27, value.themed_accent_color);
                Image.ADAPTER.encodeWithTag(writer, 26, value.photo);
                ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
                protoAdapter4.encodeWithTag(writer, 25, value.customer_joined_on);
                Region.ADAPTER.encodeWithTag(writer, 24, value.region);
                InvestmentEntityData.ADAPTER.encodeWithTag(writer, 23, value.investment_entity_data);
                Country.ADAPTER.encodeWithTag(writer, 22, value.country_code);
                protoAdapter3.encodeWithTag(writer, 21, value.accent_color);
                MerchantData.ADAPTER.encodeWithTag(writer, 19, value.merchant_data);
                BlockState.ADAPTER.encodeWithTag(writer, 18, value.block_state);
                protoAdapter3.encodeWithTag(writer, 15, value.render_data);
                protoAdapter4.encodeWithTag(writer, 14, value.credit_card_fee_bps);
                UiCheckAddress.ADAPTER.encodeWithTag(writer, 13, value.check_address);
                UiCustomer.SelectionMethod.ADAPTER.encodeWithTag(writer, 10, value.selection_method);
                protoAdapter2.encodeWithTag(writer, 12, value.is_verified_account);
                protoAdapter2.encodeWithTag(writer, 11, value.is_business);
                protoAdapter2.encodeWithTag(writer, 9, value.is_nearby);
                protoAdapter3.encodeWithTag(writer, 8, value.cashtag);
                protoAdapter2.encodeWithTag(writer, 16, value.is_square);
                protoAdapter2.encodeWithTag(writer, 7, value.can_accept_payments);
                protoAdapter2.encodeWithTag(writer, 6, value.is_cash_customer);
                protoAdapter3.encodeWithTag(writer, 5, value.photo_url);
                protoAdapter3.encodeWithTag(writer, 4, value.sms_number);
                protoAdapter3.encodeWithTag(writer, 3, value.full_name);
                protoAdapter3.encodeWithTag(writer, 2, value.email_address);
                protoAdapter3.encodeWithTag(writer, 20, value.threaded_customer_id);
                protoAdapter3.encodeWithTag(writer, 1, value.id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ UiCustomer(String str, String str2, String str3, Region region, Image image, ContactsStatus contactsStatus, int i) {
        this((i & 1) != 0 ? null : str, null, null, (i & 8) != 0 ? null : str2, null, null, (i & 64) != 0 ? null : Boolean.FALSE, null, null, null, null, null, null, null, null, null, (i & 65536) != 0 ? null : str3, null, null, null, null, null, (i & 4194304) != 0 ? null : region, null, (i & 16777216) != 0 ? null : image, null, null, null, null, null, (i & 1073741824) != 0 ? null : contactsStatus, ByteString.EMPTY);
    }

    public static UiCustomer copy$default(UiCustomer uiCustomer, String str, String str2, String str3, Boolean bool, String str4, UiCheckAddress uiCheckAddress, MerchantData merchantData, InvestmentEntityData investmentEntityData, Color color, ContactsStatus contactsStatus, ByteString byteString, int i) {
        String str5 = (i & 1) != 0 ? uiCustomer.id : str;
        String str6 = uiCustomer.threaded_customer_id;
        String str7 = (i & 4) != 0 ? uiCustomer.email_address : str2;
        String str8 = (i & 8) != 0 ? uiCustomer.full_name : null;
        String str9 = (i & 16) != 0 ? uiCustomer.sms_number : str3;
        String str10 = (i & 32) != 0 ? uiCustomer.photo_url : null;
        Boolean bool2 = (i & 64) != 0 ? uiCustomer.is_cash_customer : bool;
        Boolean bool3 = uiCustomer.can_accept_payments;
        Boolean bool4 = uiCustomer.is_square;
        String str11 = (i & 512) != 0 ? uiCustomer.cashtag : str4;
        Boolean bool5 = uiCustomer.is_nearby;
        Boolean bool6 = uiCustomer.is_business;
        Boolean bool7 = uiCustomer.is_verified_account;
        SelectionMethod selectionMethod = uiCustomer.selection_method;
        UiCheckAddress uiCheckAddress2 = (i & 16384) != 0 ? uiCustomer.check_address : uiCheckAddress;
        Long l = uiCustomer.credit_card_fee_bps;
        String str12 = (i & 65536) != 0 ? uiCustomer.render_data : null;
        BlockState blockState = uiCustomer.block_state;
        MerchantData merchantData2 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? uiCustomer.merchant_data : merchantData;
        String str13 = uiCustomer.accent_color;
        Country country = uiCustomer.country_code;
        InvestmentEntityData investmentEntityData2 = (i & PKIFailureInfo.badSenderNonce) != 0 ? uiCustomer.investment_entity_data : investmentEntityData;
        Region region = uiCustomer.region;
        Long l2 = uiCustomer.customer_joined_on;
        Image image = (i & 16777216) != 0 ? uiCustomer.photo : null;
        Color color2 = (i & 33554432) != 0 ? uiCustomer.themed_accent_color : color;
        Boolean bool8 = uiCustomer.is_suspended;
        String str14 = uiCustomer.payment_url;
        String str15 = uiCustomer.arcade_icon_token;
        Boolean bool9 = uiCustomer.is_special_customer;
        ContactsStatus contactsStatus2 = (i & 1073741824) != 0 ? uiCustomer.contacts_status : contactsStatus;
        ByteString unknownFields = (i & PKIFailureInfo.systemUnavail) != 0 ? uiCustomer.unknownFields() : byteString;
        uiCustomer.getClass();
        unknownFields.getClass();
        return new UiCustomer(str5, str6, str7, str8, str9, str10, bool2, bool3, bool4, str11, bool5, bool6, bool7, selectionMethod, uiCheckAddress2, l, str12, blockState, merchantData2, str13, country, investmentEntityData2, region, l2, image, color2, bool8, str14, str15, bool9, contactsStatus2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiCustomer)) {
            return false;
        }
        UiCustomer uiCustomer = (UiCustomer) obj;
        return Intrinsics.areEqual(unknownFields(), uiCustomer.unknownFields()) && Intrinsics.areEqual(this.id, uiCustomer.id) && Intrinsics.areEqual(this.threaded_customer_id, uiCustomer.threaded_customer_id) && Intrinsics.areEqual(this.email_address, uiCustomer.email_address) && Intrinsics.areEqual(this.full_name, uiCustomer.full_name) && Intrinsics.areEqual(this.sms_number, uiCustomer.sms_number) && Intrinsics.areEqual(this.photo_url, uiCustomer.photo_url) && Intrinsics.areEqual(this.is_cash_customer, uiCustomer.is_cash_customer) && Intrinsics.areEqual(this.can_accept_payments, uiCustomer.can_accept_payments) && Intrinsics.areEqual(this.is_square, uiCustomer.is_square) && Intrinsics.areEqual(this.cashtag, uiCustomer.cashtag) && Intrinsics.areEqual(this.is_nearby, uiCustomer.is_nearby) && Intrinsics.areEqual(this.is_business, uiCustomer.is_business) && Intrinsics.areEqual(this.is_verified_account, uiCustomer.is_verified_account) && this.selection_method == uiCustomer.selection_method && Intrinsics.areEqual(this.check_address, uiCustomer.check_address) && Intrinsics.areEqual(this.credit_card_fee_bps, uiCustomer.credit_card_fee_bps) && Intrinsics.areEqual(this.render_data, uiCustomer.render_data) && this.block_state == uiCustomer.block_state && Intrinsics.areEqual(this.merchant_data, uiCustomer.merchant_data) && Intrinsics.areEqual(this.accent_color, uiCustomer.accent_color) && this.country_code == uiCustomer.country_code && Intrinsics.areEqual(this.investment_entity_data, uiCustomer.investment_entity_data) && this.region == uiCustomer.region && Intrinsics.areEqual(this.customer_joined_on, uiCustomer.customer_joined_on) && Intrinsics.areEqual(this.photo, uiCustomer.photo) && Intrinsics.areEqual(this.themed_accent_color, uiCustomer.themed_accent_color) && Intrinsics.areEqual(this.is_suspended, uiCustomer.is_suspended) && Intrinsics.areEqual(this.payment_url, uiCustomer.payment_url) && Intrinsics.areEqual(this.arcade_icon_token, uiCustomer.arcade_icon_token) && Intrinsics.areEqual(this.is_special_customer, uiCustomer.is_special_customer) && this.contacts_status == uiCustomer.contacts_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.threaded_customer_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.email_address;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.full_name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.sms_number;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.photo_url;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.is_cash_customer;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.can_accept_payments;
        int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.is_square;
        int hashCode10 = (hashCode9 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        String str7 = this.cashtag;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool4 = this.is_nearby;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.is_business;
        int hashCode13 = (hashCode12 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.is_verified_account;
        int hashCode14 = (hashCode13 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        SelectionMethod selectionMethod = this.selection_method;
        int hashCode15 = (hashCode14 + (selectionMethod != null ? selectionMethod.hashCode() : 0)) * 37;
        UiCheckAddress uiCheckAddress = this.check_address;
        int hashCode16 = (hashCode15 + (uiCheckAddress != null ? uiCheckAddress.hashCode() : 0)) * 37;
        Long l = this.credit_card_fee_bps;
        int hashCode17 = (hashCode16 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str8 = this.render_data;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 37;
        BlockState blockState = this.block_state;
        int hashCode19 = (hashCode18 + (blockState != null ? blockState.hashCode() : 0)) * 37;
        MerchantData merchantData = this.merchant_data;
        int hashCode20 = (hashCode19 + (merchantData != null ? merchantData.hashCode() : 0)) * 37;
        String str9 = this.accent_color;
        int hashCode21 = (hashCode20 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Country country = this.country_code;
        int hashCode22 = (hashCode21 + (country != null ? country.hashCode() : 0)) * 37;
        InvestmentEntityData investmentEntityData = this.investment_entity_data;
        int hashCode23 = (hashCode22 + (investmentEntityData != null ? investmentEntityData.hashCode() : 0)) * 37;
        Region region = this.region;
        int hashCode24 = (hashCode23 + (region != null ? region.hashCode() : 0)) * 37;
        Long l2 = this.customer_joined_on;
        int hashCode25 = (hashCode24 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Image image = this.photo;
        int hashCode26 = (hashCode25 + (image != null ? image.hashCode() : 0)) * 37;
        Color color = this.themed_accent_color;
        int hashCode27 = (hashCode26 + (color != null ? color.hashCode() : 0)) * 37;
        Boolean bool7 = this.is_suspended;
        int hashCode28 = (hashCode27 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        String str10 = this.payment_url;
        int hashCode29 = (hashCode28 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.arcade_icon_token;
        int hashCode30 = (hashCode29 + (str11 != null ? str11.hashCode() : 0)) * 37;
        Boolean bool8 = this.is_special_customer;
        int hashCode31 = (hashCode30 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        ContactsStatus contactsStatus = this.contacts_status;
        int hashCode32 = hashCode31 + (contactsStatus != null ? contactsStatus.hashCode() : 0);
        this.hashCode = hashCode32;
        return hashCode32;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.threaded_customer_id = this.threaded_customer_id;
        builder.email_address = this.email_address;
        builder.full_name = this.full_name;
        builder.sms_number = this.sms_number;
        builder.photo_url = this.photo_url;
        builder.is_cash_customer = this.is_cash_customer;
        builder.can_accept_payments = this.can_accept_payments;
        builder.is_square = this.is_square;
        builder.cashtag = this.cashtag;
        builder.is_nearby = this.is_nearby;
        builder.is_business = this.is_business;
        builder.is_verified_account = this.is_verified_account;
        builder.selection_method = this.selection_method;
        builder.check_address = this.check_address;
        builder.credit_card_fee_bps = this.credit_card_fee_bps;
        builder.render_data = this.render_data;
        builder.block_state = this.block_state;
        builder.merchant_data = this.merchant_data;
        builder.accent_color = this.accent_color;
        builder.country_code = this.country_code;
        builder.investment_entity_data = this.investment_entity_data;
        builder.region = this.region;
        builder.customer_joined_on = this.customer_joined_on;
        builder.photo = this.photo;
        builder.themed_accent_color = this.themed_accent_color;
        builder.is_suspended = this.is_suspended;
        builder.payment_url = this.payment_url;
        builder.arcade_icon_token = this.arcade_icon_token;
        builder.is_special_customer = this.is_special_customer;
        builder.contacts_status = this.contacts_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.threaded_customer_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "threaded_customer_id=", arrayList);
        }
        if (this.email_address != null) {
            arrayList.add("email_address=██");
        }
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.sms_number != null) {
            arrayList.add("sms_number=██");
        }
        if (this.photo_url != null) {
            arrayList.add("photo_url=██");
        }
        Boolean bool = this.is_cash_customer;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool, arrayList);
        }
        Boolean bool2 = this.can_accept_payments;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_accept_payments=", bool2, arrayList);
        }
        Boolean bool3 = this.is_square;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_square=", bool3, arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        Boolean bool4 = this.is_nearby;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_nearby=", bool4, arrayList);
        }
        Boolean bool5 = this.is_business;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool5, arrayList);
        }
        Boolean bool6 = this.is_verified_account;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified_account=", bool6, arrayList);
        }
        SelectionMethod selectionMethod = this.selection_method;
        if (selectionMethod != null) {
            arrayList.add("selection_method=" + selectionMethod);
        }
        UiCheckAddress uiCheckAddress = this.check_address;
        if (uiCheckAddress != null) {
            arrayList.add("check_address=" + uiCheckAddress);
        }
        Long l = this.credit_card_fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("credit_card_fee_bps=", l, arrayList);
        }
        if (this.render_data != null) {
            arrayList.add("render_data=██");
        }
        BlockState blockState = this.block_state;
        if (blockState != null) {
            arrayList.add("block_state=" + blockState);
        }
        MerchantData merchantData = this.merchant_data;
        if (merchantData != null) {
            arrayList.add("merchant_data=" + merchantData);
        }
        String str3 = this.accent_color;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accent_color=", arrayList);
        }
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        InvestmentEntityData investmentEntityData = this.investment_entity_data;
        if (investmentEntityData != null) {
            arrayList.add("investment_entity_data=" + investmentEntityData);
        }
        Region region = this.region;
        if (region != null) {
            arrayList.add("region=" + region);
        }
        Long l2 = this.customer_joined_on;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_joined_on=", l2, arrayList);
        }
        if (this.photo != null) {
            arrayList.add("photo=██");
        }
        Color color = this.themed_accent_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("themed_accent_color=", color, arrayList);
        }
        Boolean bool7 = this.is_suspended;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_suspended=", bool7, arrayList);
        }
        String str4 = this.payment_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "payment_url=", arrayList);
        }
        String str5 = this.arcade_icon_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "arcade_icon_token=", arrayList);
        }
        Boolean bool8 = this.is_special_customer;
        if (bool8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_special_customer=", bool8, arrayList);
        }
        ContactsStatus contactsStatus = this.contacts_status;
        if (contactsStatus != null) {
            arrayList.add("contacts_status=" + contactsStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiCustomer{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiCustomer$SelectionMethod;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NEARBY", "RECENT", "CONTACT", "SEARCH", "ACTIVITY", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SelectionMethod implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SelectionMethod[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final SelectionMethod NEARBY = new SelectionMethod("NEARBY", 0, 1);
        public static final SelectionMethod RECENT = new SelectionMethod("RECENT", 1, 2);
        public static final SelectionMethod CONTACT = new SelectionMethod("CONTACT", 2, 3);
        public static final SelectionMethod SEARCH = new SelectionMethod("SEARCH", 3, 4);
        public static final SelectionMethod ACTIVITY = new SelectionMethod("ACTIVITY", 4, 5);

        private static final /* synthetic */ SelectionMethod[] $values() {
            return new SelectionMethod[]{NEARBY, RECENT, CONTACT, SEARCH, ACTIVITY};
        }

        static {
            SelectionMethod[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectionMethod.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.UiCustomer$SelectionMethod$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public UiCustomer.SelectionMethod fromValue(int value) {
                    return UiCustomer.SelectionMethod.INSTANCE.fromValue(value);
                }
            };
        }

        private SelectionMethod(String str, int i, int i2) {
            this.value = i2;
        }

        public static final SelectionMethod fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static SelectionMethod valueOf(String str) {
            return (SelectionMethod) Enum.valueOf(SelectionMethod.class, str);
        }

        public static SelectionMethod[] values() {
            return (SelectionMethod[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiCustomer$SelectionMethod$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/UiCustomer$SelectionMethod;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SelectionMethod fromValue(int value) {
                if (value == 1) {
                    return SelectionMethod.NEARBY;
                }
                if (value == 2) {
                    return SelectionMethod.RECENT;
                }
                if (value == 3) {
                    return SelectionMethod.CONTACT;
                }
                if (value == 4) {
                    return SelectionMethod.SEARCH;
                }
                if (value != 5) {
                    return null;
                }
                return SelectionMethod.ACTIVITY;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiCustomer$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/UiCustomer$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/UiCustomer;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ UiCustomer build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCustomer(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3, String str7, Boolean bool4, Boolean bool5, Boolean bool6, SelectionMethod selectionMethod, UiCheckAddress uiCheckAddress, Long l, String str8, BlockState blockState, MerchantData merchantData, String str9, Country country, InvestmentEntityData investmentEntityData, Region region, Long l2, Image image, Color color, Boolean bool7, String str10, String str11, Boolean bool8, ContactsStatus contactsStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.threaded_customer_id = str2;
        this.email_address = str3;
        this.full_name = str4;
        this.sms_number = str5;
        this.photo_url = str6;
        this.is_cash_customer = bool;
        this.can_accept_payments = bool2;
        this.is_square = bool3;
        this.cashtag = str7;
        this.is_nearby = bool4;
        this.is_business = bool5;
        this.is_verified_account = bool6;
        this.selection_method = selectionMethod;
        this.check_address = uiCheckAddress;
        this.credit_card_fee_bps = l;
        this.render_data = str8;
        this.block_state = blockState;
        this.merchant_data = merchantData;
        this.accent_color = str9;
        this.country_code = country;
        this.investment_entity_data = investmentEntityData;
        this.region = region;
        this.customer_joined_on = l2;
        this.photo = image;
        this.themed_accent_color = color;
        this.is_suspended = bool7;
        this.payment_url = str10;
        this.arcade_icon_token = str11;
        this.is_special_customer = bool8;
        this.contacts_status = contactsStatus;
    }
}
