package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.protos.cash.paychecks.api.v1.EarningsMetadata;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ScheduleRFC2445;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.giftly.GiftCardPaymentData;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00045647R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\bR\u0016\u0010$\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\bR\u0016\u0010%\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\bR\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00068"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$Builder;", "Lcom/squareup/protos/franklin/common/RequestContext;", "request_context", "Lcom/squareup/protos/franklin/common/RequestContext;", "", "external_id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/common/Orientation;", "orientation", "Lcom/squareup/protos/franklin/common/Orientation;", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "note", "passcode_token", "Lcom/squareup/protos/franklin/api/InstrumentSelection;", "instrument_selection", "Lcom/squareup/protos/franklin/api/InstrumentSelection;", "creation_mechanism", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "cancel_payments_data", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "schedule", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "referrer", "launch_url", "Lcom/squareup/protos/franklin/app/AppCreationActivity;", "app_creation_activity", "Lcom/squareup/protos/franklin/app/AppCreationActivity;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData;", "payment_data", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData;", "suggestion_id", "exchange_rates_token", "sender_customer_token", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "personalization", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "personalization_input", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "earnings_metadata", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "nearby_session_token", "", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "payment_getters", "Ljava/util/List;", "Companion", "Builder", "PaymentData", "CancelPaymentsData", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InitiatePaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiatePaymentRequest> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 6)
    public final Money amount;

    @WireField(adapter = "com.squareup.protos.franklin.app.AppCreationActivity#ADAPTER", schemaIndex = 13, tag = 23)
    public final AppCreationActivity app_creation_activity;

    @WireField(adapter = "com.squareup.protos.franklin.app.InitiatePaymentRequest$CancelPaymentsData#ADAPTER", schemaIndex = 9, tag = 19)
    public final CancelPaymentsData cancel_payments_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 15)
    public final String creation_mechanism;

    @WireField(adapter = "com.squareup.protos.cash.paychecks.api.v1.EarningsMetadata#ADAPTER", schemaIndex = 20, tag = 31)
    public final EarningsMetadata earnings_metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 16, tag = 26)
    public final String exchange_rates_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 3)
    public final String external_id;

    @WireField(adapter = "com.squareup.protos.franklin.api.InstrumentSelection#ADAPTER", schemaIndex = 7, tag = 11)
    public final InstrumentSelection instrument_selection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 12, tag = 22)
    public final String launch_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 21, tag = 32)
    public final String nearby_session_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 7)
    public final String note;

    @WireField(adapter = "com.squareup.protos.franklin.common.Orientation#ADAPTER", schemaIndex = 3, tag = 5)
    public final Orientation orientation;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 8)
    public final String passcode_token;

    @WireSealedOneof(schemaIndex = 14)
    public final PaymentData payment_data;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 4)
    public final List<UiCustomer> payment_getters;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization#ADAPTER", schemaIndex = 18, tag = 29)
    public final Personalization personalization;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput#ADAPTER", schemaIndex = 19, tag = 30)
    public final PersonalizationInput personalization_input;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 21)
    public final String referrer;

    @WireField(adapter = "com.squareup.protos.franklin.common.RequestContext#ADAPTER", schemaIndex = 0, tag = 17)
    public final RequestContext request_context;

    @WireField(adapter = "com.squareup.protos.franklin.common.ScheduleRFC2445#ADAPTER", schemaIndex = 10, tag = 20)
    public final ScheduleRFC2445 schedule;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 17, tag = 28)
    public final String sender_customer_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 15, tag = 25)
    public final String suggestion_id;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\bJ\u0010\u0010 \u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\bJ\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\bJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010&\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0010\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\b\u0010)\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;", "<init>", "()V", "request_context", "Lcom/squareup/protos/franklin/common/RequestContext;", "external_id", "", "payment_getters", "", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "orientation", "Lcom/squareup/protos/franklin/common/Orientation;", "amount", "Lcom/squareup/protos/common/Money;", "note", "passcode_token", "instrument_selection", "Lcom/squareup/protos/franklin/api/InstrumentSelection;", "creation_mechanism", "cancel_payments_data", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "schedule", "Lcom/squareup/protos/franklin/common/ScheduleRFC2445;", "referrer", "launch_url", "app_creation_activity", "Lcom/squareup/protos/franklin/app/AppCreationActivity;", "payment_data", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData;", "suggestion_id", "exchange_rates_token", "sender_customer_token", "personalization", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "personalization_input", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInput;", "earnings_metadata", "Lcom/squareup/protos/cash/paychecks/api/v1/EarningsMetadata;", "nearby_session_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public Money amount;
        public AppCreationActivity app_creation_activity;
        public CancelPaymentsData cancel_payments_data;
        public String creation_mechanism;
        public EarningsMetadata earnings_metadata;
        public String exchange_rates_token;
        public String external_id;
        public InstrumentSelection instrument_selection;
        public String launch_url;
        public String nearby_session_token;
        public String note;
        public Orientation orientation;
        public String passcode_token;
        public PaymentData payment_data;
        public List<UiCustomer> payment_getters = EmptyList.INSTANCE;
        public Personalization personalization;
        public PersonalizationInput personalization_input;
        public String referrer;
        public RequestContext request_context;
        public ScheduleRFC2445 schedule;
        public String sender_customer_token;
        public String suggestion_id;

        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        public final Builder app_creation_activity(AppCreationActivity app_creation_activity) {
            this.app_creation_activity = app_creation_activity;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public InitiatePaymentRequest build() {
            return new InitiatePaymentRequest(this.request_context, this.external_id, this.payment_getters, this.orientation, this.amount, this.note, this.passcode_token, this.instrument_selection, this.creation_mechanism, this.cancel_payments_data, this.schedule, this.referrer, this.launch_url, this.app_creation_activity, this.payment_data, this.suggestion_id, this.exchange_rates_token, this.sender_customer_token, this.personalization, this.personalization_input, this.earnings_metadata, this.nearby_session_token, buildUnknownFields());
        }

        public final Builder cancel_payments_data(CancelPaymentsData cancel_payments_data) {
            this.cancel_payments_data = cancel_payments_data;
            return this;
        }

        public final Builder creation_mechanism(String creation_mechanism) {
            this.creation_mechanism = creation_mechanism;
            return this;
        }

        public final Builder earnings_metadata(EarningsMetadata earnings_metadata) {
            this.earnings_metadata = earnings_metadata;
            return this;
        }

        public final Builder exchange_rates_token(String exchange_rates_token) {
            this.exchange_rates_token = exchange_rates_token;
            return this;
        }

        public final Builder external_id(String external_id) {
            this.external_id = external_id;
            return this;
        }

        public final Builder instrument_selection(InstrumentSelection instrument_selection) {
            this.instrument_selection = instrument_selection;
            return this;
        }

        public final Builder launch_url(String launch_url) {
            this.launch_url = launch_url;
            return this;
        }

        public final Builder nearby_session_token(String nearby_session_token) {
            this.nearby_session_token = nearby_session_token;
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

        public final Builder passcode_token(String passcode_token) {
            this.passcode_token = passcode_token;
            return this;
        }

        public final Builder payment_data(PaymentData payment_data) {
            this.payment_data = payment_data;
            return this;
        }

        public final Builder payment_getters(List<UiCustomer> payment_getters) {
            payment_getters.getClass();
            TransactorKt.checkElementsNotNull(payment_getters);
            this.payment_getters = payment_getters;
            return this;
        }

        public final Builder personalization(Personalization personalization) {
            this.personalization = personalization;
            return this;
        }

        public final Builder personalization_input(PersonalizationInput personalization_input) {
            this.personalization_input = personalization_input;
            return this;
        }

        public final Builder referrer(String referrer) {
            this.referrer = referrer;
            return this;
        }

        public final Builder request_context(RequestContext request_context) {
            this.request_context = request_context;
            return this;
        }

        public final Builder schedule(ScheduleRFC2445 schedule) {
            this.schedule = schedule;
            return this;
        }

        public final Builder sender_customer_token(String sender_customer_token) {
            this.sender_customer_token = sender_customer_token;
            return this;
        }

        public final Builder suggestion_id(String suggestion_id) {
            this.suggestion_id = suggestion_id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiatePaymentRequest.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.app.InitiatePaymentRequest$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v53 */
            /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v56 */
            /* JADX WARN: Type inference failed for: r0v57 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public InitiatePaymentRequest decode(ProtoReader reader) {
                Object obj;
                long j;
                ?? decode;
                InitiatePaymentRequest.PaymentData investPaymentData;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                String str2 = null;
                Object obj8 = null;
                Object obj9 = null;
                String str3 = null;
                String str4 = null;
                AppCreationActivity appCreationActivity = null;
                InitiatePaymentRequest.PaymentData paymentData = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Orientation orientation = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InitiatePaymentRequest((RequestContext) obj2, str, m, orientation, (Money) obj5, str8, str10, (InstrumentSelection) obj7, str2, (InitiatePaymentRequest.CancelPaymentsData) obj8, (ScheduleRFC2445) obj9, str3, str4, appCreationActivity, paymentData, str5, str6, str7, (Personalization) obj3, (PersonalizationInput) obj4, (EarningsMetadata) obj6, str9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 3:
                            j = beginMessage;
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            j = beginMessage;
                            obj = obj3;
                            m.add(UiCustomer.ADAPTER.decode(reader));
                            decode = str;
                            obj3 = obj;
                            break;
                        case 5:
                            j = beginMessage;
                            obj = obj3;
                            try {
                                orientation = Orientation.ADAPTER.decode(reader);
                                obj3 = obj;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            j = beginMessage;
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                            decode = str;
                            break;
                        case 7:
                            j = beginMessage;
                            str8 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 8:
                            j = beginMessage;
                            str10 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 9:
                        case 10:
                        case 12:
                        case 13:
                        case 14:
                        case 16:
                        case 18:
                        default:
                            reader.readUnknownField(nextTag);
                            j = beginMessage;
                            obj = obj3;
                            decode = str;
                            obj3 = obj;
                            break;
                        case 11:
                            j = beginMessage;
                            obj7 = TransactorKt.decodeMessageOrMerge(InstrumentSelection.ADAPTER, reader, obj7);
                            decode = str;
                            break;
                        case 15:
                            j = beginMessage;
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 17:
                            j = beginMessage;
                            obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, reader, obj2);
                            decode = str;
                            break;
                        case 19:
                            j = beginMessage;
                            obj8 = TransactorKt.decodeMessageOrMerge(InitiatePaymentRequest.CancelPaymentsData.ADAPTER, reader, obj8);
                            decode = str;
                            break;
                        case 20:
                            j = beginMessage;
                            obj9 = TransactorKt.decodeMessageOrMerge(ScheduleRFC2445.ADAPTER, reader, obj9);
                            decode = str;
                            break;
                        case 21:
                            j = beginMessage;
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 22:
                            j = beginMessage;
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 23:
                            try {
                                appCreationActivity = AppCreationActivity.ADAPTER.decode(reader);
                                j = beginMessage;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj3;
                                j = beginMessage;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 24:
                            investPaymentData = new InitiatePaymentRequest.PaymentData.InvestPaymentData((InvestPaymentData) InvestPaymentData.ADAPTER.decode(reader));
                            paymentData = investPaymentData;
                            j = beginMessage;
                            decode = str;
                            break;
                        case 25:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 26:
                            str6 = ProtoAdapter.STRING.decode(reader);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 27:
                            investPaymentData = new InitiatePaymentRequest.PaymentData.GiftCardPaymentData((GiftCardPaymentData) GiftCardPaymentData.ADAPTER.decode(reader));
                            paymentData = investPaymentData;
                            j = beginMessage;
                            decode = str;
                            break;
                        case 28:
                            str7 = ProtoAdapter.STRING.decode(reader);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 29:
                            obj3 = TransactorKt.decodeMessageOrMerge(Personalization.ADAPTER, reader, obj3);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 30:
                            obj4 = TransactorKt.decodeMessageOrMerge(PersonalizationInput.ADAPTER, reader, obj4);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 31:
                            obj6 = TransactorKt.decodeMessageOrMerge(EarningsMetadata.ADAPTER, reader, obj6);
                            j = beginMessage;
                            decode = str;
                            break;
                        case 32:
                            str9 = ProtoAdapter.STRING.decode(reader);
                            j = beginMessage;
                            decode = str;
                            break;
                    }
                    str = decode;
                    beginMessage = j;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InitiatePaymentRequest value) {
                writer.getClass();
                value.getClass();
                RequestContext.ADAPTER.encodeWithTag(writer, 17, value.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.external_id);
                UiCustomer.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.payment_getters);
                Orientation.ADAPTER.encodeWithTag(writer, 5, value.orientation);
                Money.ADAPTER.encodeWithTag(writer, 6, value.amount);
                protoAdapter2.encodeWithTag(writer, 7, value.note);
                protoAdapter2.encodeWithTag(writer, 8, value.passcode_token);
                InstrumentSelection.ADAPTER.encodeWithTag(writer, 11, value.instrument_selection);
                protoAdapter2.encodeWithTag(writer, 15, value.creation_mechanism);
                InitiatePaymentRequest.CancelPaymentsData.ADAPTER.encodeWithTag(writer, 19, value.cancel_payments_data);
                ScheduleRFC2445.ADAPTER.encodeWithTag(writer, 20, value.schedule);
                protoAdapter2.encodeWithTag(writer, 21, value.referrer);
                protoAdapter2.encodeWithTag(writer, 22, value.launch_url);
                AppCreationActivity.ADAPTER.encodeWithTag(writer, 23, value.app_creation_activity);
                protoAdapter2.encodeWithTag(writer, 25, value.suggestion_id);
                protoAdapter2.encodeWithTag(writer, 26, value.exchange_rates_token);
                protoAdapter2.encodeWithTag(writer, 28, value.sender_customer_token);
                Personalization.ADAPTER.encodeWithTag(writer, 29, value.personalization);
                PersonalizationInput.ADAPTER.encodeWithTag(writer, 30, value.personalization_input);
                EarningsMetadata.ADAPTER.encodeWithTag(writer, 31, value.earnings_metadata);
                protoAdapter2.encodeWithTag(writer, 32, value.nearby_session_token);
                InitiatePaymentRequest.PaymentData paymentData = value.payment_data;
                if (paymentData instanceof InitiatePaymentRequest.PaymentData.InvestPaymentData) {
                    InvestPaymentData.ADAPTER.encodeWithTag(writer, 24, ((InitiatePaymentRequest.PaymentData.InvestPaymentData) paymentData).getValue());
                } else if (paymentData instanceof InitiatePaymentRequest.PaymentData.GiftCardPaymentData) {
                    GiftCardPaymentData.ADAPTER.encodeWithTag(writer, 27, ((InitiatePaymentRequest.PaymentData.GiftCardPaymentData) paymentData).getValue());
                } else if (paymentData != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InitiatePaymentRequest value) {
                int encodedSizeWithTag;
                value.getClass();
                int encodedSizeWithTag2 = RequestContext.ADAPTER.encodedSizeWithTag(17, value.request_context) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = AppCreationActivity.ADAPTER.encodedSizeWithTag(23, value.app_creation_activity) + protoAdapter2.encodedSizeWithTag(22, value.launch_url) + protoAdapter2.encodedSizeWithTag(21, value.referrer) + ScheduleRFC2445.ADAPTER.encodedSizeWithTag(20, value.schedule) + InitiatePaymentRequest.CancelPaymentsData.ADAPTER.encodedSizeWithTag(19, value.cancel_payments_data) + protoAdapter2.encodedSizeWithTag(15, value.creation_mechanism) + InstrumentSelection.ADAPTER.encodedSizeWithTag(11, value.instrument_selection) + protoAdapter2.encodedSizeWithTag(8, value.passcode_token) + protoAdapter2.encodedSizeWithTag(7, value.note) + Money.ADAPTER.encodedSizeWithTag(6, value.amount) + Orientation.ADAPTER.encodedSizeWithTag(5, value.orientation) + UiCustomer.ADAPTER.asRepeated().encodedSizeWithTag(4, value.payment_getters) + protoAdapter2.encodedSizeWithTag(3, value.external_id) + encodedSizeWithTag2;
                InitiatePaymentRequest.PaymentData paymentData = value.payment_data;
                if (paymentData instanceof InitiatePaymentRequest.PaymentData.InvestPaymentData) {
                    encodedSizeWithTag = InvestPaymentData.ADAPTER.encodedSizeWithTag(24, ((InitiatePaymentRequest.PaymentData.InvestPaymentData) paymentData).getValue());
                } else {
                    if (!(paymentData instanceof InitiatePaymentRequest.PaymentData.GiftCardPaymentData)) {
                        if (paymentData != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return protoAdapter2.encodedSizeWithTag(32, value.nearby_session_token) + EarningsMetadata.ADAPTER.encodedSizeWithTag(31, value.earnings_metadata) + PersonalizationInput.ADAPTER.encodedSizeWithTag(30, value.personalization_input) + Personalization.ADAPTER.encodedSizeWithTag(29, value.personalization) + protoAdapter2.encodedSizeWithTag(28, value.sender_customer_token) + protoAdapter2.encodedSizeWithTag(26, value.exchange_rates_token) + protoAdapter2.encodedSizeWithTag(25, value.suggestion_id) + encodedSizeWithTag3;
                    }
                    encodedSizeWithTag = GiftCardPaymentData.ADAPTER.encodedSizeWithTag(27, ((InitiatePaymentRequest.PaymentData.GiftCardPaymentData) paymentData).getValue());
                }
                encodedSizeWithTag3 += encodedSizeWithTag;
                return protoAdapter2.encodedSizeWithTag(32, value.nearby_session_token) + EarningsMetadata.ADAPTER.encodedSizeWithTag(31, value.earnings_metadata) + PersonalizationInput.ADAPTER.encodedSizeWithTag(30, value.personalization_input) + Personalization.ADAPTER.encodedSizeWithTag(29, value.personalization) + protoAdapter2.encodedSizeWithTag(28, value.sender_customer_token) + protoAdapter2.encodedSizeWithTag(26, value.exchange_rates_token) + protoAdapter2.encodedSizeWithTag(25, value.suggestion_id) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InitiatePaymentRequest redact(InitiatePaymentRequest value) {
                value.getClass();
                RequestContext requestContext = value.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.payment_getters, UiCustomer.ADAPTER);
                Money money = value.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                InstrumentSelection instrumentSelection = value.instrument_selection;
                InstrumentSelection instrumentSelection2 = instrumentSelection != null ? (InstrumentSelection) InstrumentSelection.ADAPTER.redact(instrumentSelection) : null;
                InitiatePaymentRequest.CancelPaymentsData cancelPaymentsData = value.cancel_payments_data;
                InitiatePaymentRequest.CancelPaymentsData cancelPaymentsData2 = cancelPaymentsData != null ? (InitiatePaymentRequest.CancelPaymentsData) InitiatePaymentRequest.CancelPaymentsData.ADAPTER.redact(cancelPaymentsData) : null;
                ScheduleRFC2445 scheduleRFC2445 = value.schedule;
                ScheduleRFC2445 scheduleRFC24452 = scheduleRFC2445 != null ? (ScheduleRFC2445) ScheduleRFC2445.ADAPTER.redact(scheduleRFC2445) : null;
                Personalization personalization = value.personalization;
                Personalization personalization2 = personalization != null ? (Personalization) Personalization.ADAPTER.redact(personalization) : null;
                PersonalizationInput personalizationInput = value.personalization_input;
                PersonalizationInput personalizationInput2 = personalizationInput != null ? (PersonalizationInput) PersonalizationInput.ADAPTER.redact(personalizationInput) : null;
                EarningsMetadata earningsMetadata = value.earnings_metadata;
                return InitiatePaymentRequest.copy$default(value, requestContext2, m1169redactElements, money2, instrumentSelection2, cancelPaymentsData2, scheduleRFC24452, personalization2, personalizationInput2, earningsMetadata != null ? (EarningsMetadata) EarningsMetadata.ADAPTER.redact(earningsMetadata) : null, ByteString.EMPTY, 2353418);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InitiatePaymentRequest value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InitiatePaymentRequest.PaymentData paymentData = value.payment_data;
                if (paymentData instanceof InitiatePaymentRequest.PaymentData.InvestPaymentData) {
                    InvestPaymentData.ADAPTER.encodeWithTag(writer, 24, ((InitiatePaymentRequest.PaymentData.InvestPaymentData) paymentData).getValue());
                } else if (paymentData instanceof InitiatePaymentRequest.PaymentData.GiftCardPaymentData) {
                    GiftCardPaymentData.ADAPTER.encodeWithTag(writer, 27, ((InitiatePaymentRequest.PaymentData.GiftCardPaymentData) paymentData).getValue());
                } else if (paymentData != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 32, value.nearby_session_token);
                EarningsMetadata.ADAPTER.encodeWithTag(writer, 31, value.earnings_metadata);
                PersonalizationInput.ADAPTER.encodeWithTag(writer, 30, value.personalization_input);
                Personalization.ADAPTER.encodeWithTag(writer, 29, value.personalization);
                protoAdapter2.encodeWithTag(writer, 28, value.sender_customer_token);
                protoAdapter2.encodeWithTag(writer, 26, value.exchange_rates_token);
                protoAdapter2.encodeWithTag(writer, 25, value.suggestion_id);
                AppCreationActivity.ADAPTER.encodeWithTag(writer, 23, value.app_creation_activity);
                protoAdapter2.encodeWithTag(writer, 22, value.launch_url);
                protoAdapter2.encodeWithTag(writer, 21, value.referrer);
                ScheduleRFC2445.ADAPTER.encodeWithTag(writer, 20, value.schedule);
                InitiatePaymentRequest.CancelPaymentsData.ADAPTER.encodeWithTag(writer, 19, value.cancel_payments_data);
                protoAdapter2.encodeWithTag(writer, 15, value.creation_mechanism);
                InstrumentSelection.ADAPTER.encodeWithTag(writer, 11, value.instrument_selection);
                protoAdapter2.encodeWithTag(writer, 8, value.passcode_token);
                protoAdapter2.encodeWithTag(writer, 7, value.note);
                Money.ADAPTER.encodeWithTag(writer, 6, value.amount);
                Orientation.ADAPTER.encodeWithTag(writer, 5, value.orientation);
                UiCustomer.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.payment_getters);
                protoAdapter2.encodeWithTag(writer, 3, value.external_id);
                RequestContext.ADAPTER.encodeWithTag(writer, 17, value.request_context);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiatePaymentRequest(RequestContext requestContext, String str, List list, Orientation orientation, Money money, String str2, String str3, InstrumentSelection instrumentSelection, String str4, CancelPaymentsData cancelPaymentsData, ScheduleRFC2445 scheduleRFC2445, String str5, String str6, AppCreationActivity appCreationActivity, PaymentData paymentData, String str7, String str8, String str9, Personalization personalization, PersonalizationInput personalizationInput, EarningsMetadata earningsMetadata, String str10, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.external_id = str;
        this.orientation = orientation;
        this.amount = money;
        this.note = str2;
        this.passcode_token = str3;
        this.instrument_selection = instrumentSelection;
        this.creation_mechanism = str4;
        this.cancel_payments_data = cancelPaymentsData;
        this.schedule = scheduleRFC2445;
        this.referrer = str5;
        this.launch_url = str6;
        this.app_creation_activity = appCreationActivity;
        this.payment_data = paymentData;
        this.suggestion_id = str7;
        this.exchange_rates_token = str8;
        this.sender_customer_token = str9;
        this.personalization = personalization;
        this.personalization_input = personalizationInput;
        this.earnings_metadata = earningsMetadata;
        this.nearby_session_token = str10;
        this.payment_getters = TransactorKt.immutableCopyOf("payment_getters", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InitiatePaymentRequest copy$default(InitiatePaymentRequest initiatePaymentRequest, RequestContext requestContext, ArrayList arrayList, Money money, InstrumentSelection instrumentSelection, CancelPaymentsData cancelPaymentsData, ScheduleRFC2445 scheduleRFC2445, Personalization personalization, PersonalizationInput personalizationInput, EarningsMetadata earningsMetadata, ByteString byteString, int i) {
        RequestContext requestContext2 = (i & 1) != 0 ? initiatePaymentRequest.request_context : requestContext;
        String str = initiatePaymentRequest.external_id;
        List list = (i & 4) != 0 ? initiatePaymentRequest.payment_getters : arrayList;
        Orientation orientation = initiatePaymentRequest.orientation;
        Money money2 = (i & 16) != 0 ? initiatePaymentRequest.amount : money;
        String str2 = (i & 32) != 0 ? initiatePaymentRequest.note : null;
        String str3 = (i & 64) != 0 ? initiatePaymentRequest.passcode_token : null;
        InstrumentSelection instrumentSelection2 = (i & 128) != 0 ? initiatePaymentRequest.instrument_selection : instrumentSelection;
        String str4 = initiatePaymentRequest.creation_mechanism;
        CancelPaymentsData cancelPaymentsData2 = (i & 512) != 0 ? initiatePaymentRequest.cancel_payments_data : cancelPaymentsData;
        ScheduleRFC2445 scheduleRFC24452 = (i & 1024) != 0 ? initiatePaymentRequest.schedule : scheduleRFC2445;
        String str5 = initiatePaymentRequest.referrer;
        String str6 = (i & 4096) != 0 ? initiatePaymentRequest.launch_url : null;
        AppCreationActivity appCreationActivity = initiatePaymentRequest.app_creation_activity;
        PaymentData paymentData = initiatePaymentRequest.payment_data;
        String str7 = initiatePaymentRequest.suggestion_id;
        String str8 = initiatePaymentRequest.exchange_rates_token;
        String str9 = initiatePaymentRequest.sender_customer_token;
        Personalization personalization2 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? initiatePaymentRequest.personalization : personalization;
        PersonalizationInput personalizationInput2 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? initiatePaymentRequest.personalization_input : personalizationInput;
        EarningsMetadata earningsMetadata2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? initiatePaymentRequest.earnings_metadata : earningsMetadata;
        String str10 = initiatePaymentRequest.nearby_session_token;
        ByteString unknownFields = (i & 4194304) != 0 ? initiatePaymentRequest.unknownFields() : byteString;
        initiatePaymentRequest.getClass();
        list.getClass();
        unknownFields.getClass();
        return new InitiatePaymentRequest(requestContext2, str, list, orientation, money2, str2, str3, instrumentSelection2, str4, cancelPaymentsData2, scheduleRFC24452, str5, str6, appCreationActivity, paymentData, str7, str8, str9, personalization2, personalizationInput2, earningsMetadata2, str10, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiatePaymentRequest)) {
            return false;
        }
        InitiatePaymentRequest initiatePaymentRequest = (InitiatePaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), initiatePaymentRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, initiatePaymentRequest.request_context) && Intrinsics.areEqual(this.external_id, initiatePaymentRequest.external_id) && Intrinsics.areEqual(this.payment_getters, initiatePaymentRequest.payment_getters) && this.orientation == initiatePaymentRequest.orientation && Intrinsics.areEqual(this.amount, initiatePaymentRequest.amount) && Intrinsics.areEqual(this.note, initiatePaymentRequest.note) && Intrinsics.areEqual(this.passcode_token, initiatePaymentRequest.passcode_token) && Intrinsics.areEqual(this.instrument_selection, initiatePaymentRequest.instrument_selection) && Intrinsics.areEqual(this.creation_mechanism, initiatePaymentRequest.creation_mechanism) && Intrinsics.areEqual(this.cancel_payments_data, initiatePaymentRequest.cancel_payments_data) && Intrinsics.areEqual(this.schedule, initiatePaymentRequest.schedule) && Intrinsics.areEqual(this.referrer, initiatePaymentRequest.referrer) && Intrinsics.areEqual(this.launch_url, initiatePaymentRequest.launch_url) && this.app_creation_activity == initiatePaymentRequest.app_creation_activity && Intrinsics.areEqual(this.payment_data, initiatePaymentRequest.payment_data) && Intrinsics.areEqual(this.suggestion_id, initiatePaymentRequest.suggestion_id) && Intrinsics.areEqual(this.exchange_rates_token, initiatePaymentRequest.exchange_rates_token) && Intrinsics.areEqual(this.sender_customer_token, initiatePaymentRequest.sender_customer_token) && Intrinsics.areEqual(this.personalization, initiatePaymentRequest.personalization) && Intrinsics.areEqual(this.personalization_input, initiatePaymentRequest.personalization_input) && Intrinsics.areEqual(this.earnings_metadata, initiatePaymentRequest.earnings_metadata) && Intrinsics.areEqual(this.nearby_session_token, initiatePaymentRequest.nearby_session_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.external_id;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.payment_getters);
        Orientation orientation = this.orientation;
        int hashCode3 = (m + (orientation != null ? orientation.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.note;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.passcode_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        InstrumentSelection instrumentSelection = this.instrument_selection;
        int hashCode7 = (hashCode6 + (instrumentSelection != null ? instrumentSelection.hashCode() : 0)) * 37;
        String str4 = this.creation_mechanism;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        CancelPaymentsData cancelPaymentsData = this.cancel_payments_data;
        int hashCode9 = (hashCode8 + (cancelPaymentsData != null ? cancelPaymentsData.hashCode() : 0)) * 37;
        ScheduleRFC2445 scheduleRFC2445 = this.schedule;
        int hashCode10 = (hashCode9 + (scheduleRFC2445 != null ? scheduleRFC2445.hashCode() : 0)) * 37;
        String str5 = this.referrer;
        int hashCode11 = (hashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.launch_url;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 37;
        AppCreationActivity appCreationActivity = this.app_creation_activity;
        int hashCode13 = (hashCode12 + (appCreationActivity != null ? appCreationActivity.hashCode() : 0)) * 37;
        PaymentData paymentData = this.payment_data;
        int hashCode14 = (hashCode13 + (paymentData != null ? paymentData.hashCode() : 0)) * 37;
        String str7 = this.suggestion_id;
        int hashCode15 = (hashCode14 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.exchange_rates_token;
        int hashCode16 = (hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.sender_customer_token;
        int hashCode17 = (hashCode16 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Personalization personalization = this.personalization;
        int hashCode18 = (hashCode17 + (personalization != null ? personalization.hashCode() : 0)) * 37;
        PersonalizationInput personalizationInput = this.personalization_input;
        int hashCode19 = (hashCode18 + (personalizationInput != null ? personalizationInput.hashCode() : 0)) * 37;
        EarningsMetadata earningsMetadata = this.earnings_metadata;
        int hashCode20 = (hashCode19 + (earningsMetadata != null ? earningsMetadata.hashCode() : 0)) * 37;
        String str10 = this.nearby_session_token;
        int hashCode21 = hashCode20 + (str10 != null ? str10.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_context = this.request_context;
        builder.external_id = this.external_id;
        builder.payment_getters = this.payment_getters;
        builder.orientation = this.orientation;
        builder.amount = this.amount;
        builder.note = this.note;
        builder.passcode_token = this.passcode_token;
        builder.instrument_selection = this.instrument_selection;
        builder.creation_mechanism = this.creation_mechanism;
        builder.cancel_payments_data = this.cancel_payments_data;
        builder.schedule = this.schedule;
        builder.referrer = this.referrer;
        builder.launch_url = this.launch_url;
        builder.app_creation_activity = this.app_creation_activity;
        builder.payment_data = this.payment_data;
        builder.suggestion_id = this.suggestion_id;
        builder.exchange_rates_token = this.exchange_rates_token;
        builder.sender_customer_token = this.sender_customer_token;
        builder.personalization = this.personalization;
        builder.personalization_input = this.personalization_input;
        builder.earnings_metadata = this.earnings_metadata;
        builder.nearby_session_token = this.nearby_session_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        if (!this.payment_getters.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_getters=", arrayList, this.payment_getters);
        }
        Orientation orientation = this.orientation;
        if (orientation != null) {
            arrayList.add("orientation=" + orientation);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        InstrumentSelection instrumentSelection = this.instrument_selection;
        if (instrumentSelection != null) {
            arrayList.add("instrument_selection=" + instrumentSelection);
        }
        String str2 = this.creation_mechanism;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "creation_mechanism=", arrayList);
        }
        CancelPaymentsData cancelPaymentsData = this.cancel_payments_data;
        if (cancelPaymentsData != null) {
            arrayList.add("cancel_payments_data=" + cancelPaymentsData);
        }
        ScheduleRFC2445 scheduleRFC2445 = this.schedule;
        if (scheduleRFC2445 != null) {
            arrayList.add("schedule=" + scheduleRFC2445);
        }
        String str3 = this.referrer;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "referrer=", arrayList);
        }
        if (this.launch_url != null) {
            arrayList.add("launch_url=██");
        }
        AppCreationActivity appCreationActivity = this.app_creation_activity;
        if (appCreationActivity != null) {
            arrayList.add("app_creation_activity=" + appCreationActivity);
        }
        PaymentData paymentData = this.payment_data;
        if (paymentData != null) {
            arrayList.add("payment_data=" + paymentData);
        }
        String str4 = this.suggestion_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "suggestion_id=", arrayList);
        }
        String str5 = this.exchange_rates_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "exchange_rates_token=", arrayList);
        }
        String str6 = this.sender_customer_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "sender_customer_token=", arrayList);
        }
        Personalization personalization = this.personalization;
        if (personalization != null) {
            arrayList.add("personalization=" + personalization);
        }
        PersonalizationInput personalizationInput = this.personalization_input;
        if (personalizationInput != null) {
            arrayList.add("personalization_input=" + personalizationInput);
        }
        EarningsMetadata earningsMetadata = this.earnings_metadata;
        if (earningsMetadata != null) {
            arrayList.add("earnings_metadata=" + earningsMetadata);
        }
        String str7 = this.nearby_session_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "nearby_session_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InitiatePaymentRequest{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J1\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0016R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData$Builder;", "cancel_for_all", "", "cancel_for_getters", "", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lokio/ByteString;)Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class CancelPaymentsData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CancelPaymentsData> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
        public final Boolean cancel_for_all;

        @WireField(adapter = "com.squareup.protos.franklin.ui.UiCustomer#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<UiCustomer> cancel_for_getters;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "<init>", "()V", "cancel_for_all", "", "Ljava/lang/Boolean;", "cancel_for_getters", "", "Lcom/squareup/protos/franklin/ui/UiCustomer;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Boolean cancel_for_all;
            public List<UiCustomer> cancel_for_getters = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public CancelPaymentsData build() {
                return new CancelPaymentsData(this.cancel_for_all, this.cancel_for_getters, buildUnknownFields());
            }

            public final Builder cancel_for_all(Boolean cancel_for_all) {
                this.cancel_for_all = cancel_for_all;
                return this;
            }

            public final Builder cancel_for_getters(List<UiCustomer> cancel_for_getters) {
                cancel_for_getters.getClass();
                TransactorKt.checkElementsNotNull(cancel_for_getters);
                this.cancel_for_getters = cancel_for_getters;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CancelPaymentsData.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.app.InitiatePaymentRequest$CancelPaymentsData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public InitiatePaymentRequest.CancelPaymentsData decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new InitiatePaymentRequest.CancelPaymentsData((Boolean) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.BOOL.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(UiCustomer.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, InitiatePaymentRequest.CancelPaymentsData value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.cancel_for_all);
                    UiCustomer.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.cancel_for_getters);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(InitiatePaymentRequest.CancelPaymentsData value) {
                    value.getClass();
                    return UiCustomer.ADAPTER.asRepeated().encodedSizeWithTag(2, value.cancel_for_getters) + ProtoAdapter.BOOL.encodedSizeWithTag(1, value.cancel_for_all) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public InitiatePaymentRequest.CancelPaymentsData redact(InitiatePaymentRequest.CancelPaymentsData value) {
                    value.getClass();
                    return InitiatePaymentRequest.CancelPaymentsData.copy$default(value, null, TransactorKt.m1169redactElements(value.cancel_for_getters, UiCustomer.ADAPTER), ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, InitiatePaymentRequest.CancelPaymentsData value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    UiCustomer.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.cancel_for_getters);
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.cancel_for_all);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelPaymentsData(Boolean bool, List<UiCustomer> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.cancel_for_all = bool;
            this.cancel_for_getters = TransactorKt.immutableCopyOf("cancel_for_getters", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CancelPaymentsData copy$default(CancelPaymentsData cancelPaymentsData, Boolean bool, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = cancelPaymentsData.cancel_for_all;
            }
            if ((i & 2) != 0) {
                list = cancelPaymentsData.cancel_for_getters;
            }
            if ((i & 4) != 0) {
                byteString = cancelPaymentsData.unknownFields();
            }
            return cancelPaymentsData.copy(bool, list, byteString);
        }

        public final CancelPaymentsData copy(Boolean cancel_for_all, List<UiCustomer> cancel_for_getters, ByteString unknownFields) {
            cancel_for_getters.getClass();
            unknownFields.getClass();
            return new CancelPaymentsData(cancel_for_all, cancel_for_getters, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CancelPaymentsData)) {
                return false;
            }
            CancelPaymentsData cancelPaymentsData = (CancelPaymentsData) other;
            return Intrinsics.areEqual(unknownFields(), cancelPaymentsData.unknownFields()) && Intrinsics.areEqual(this.cancel_for_all, cancelPaymentsData.cancel_for_all) && Intrinsics.areEqual(this.cancel_for_getters, cancelPaymentsData.cancel_for_getters);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.cancel_for_all;
            int hashCode2 = this.cancel_for_getters.hashCode() + ((hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.cancel_for_all = this.cancel_for_all;
            builder.cancel_for_getters = this.cancel_for_getters;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.cancel_for_all;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("cancel_for_all=", bool, arrayList);
            }
            if (!this.cancel_for_getters.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("cancel_for_getters=", arrayList, this.cancel_for_getters);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CancelPaymentsData{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData$Builder;", "", "body", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$CancelPaymentsData;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CancelPaymentsData build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public CancelPaymentsData(Boolean bool, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public CancelPaymentsData() {
            this(null, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$Builder;", "", "body", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/app/InitiatePaymentRequest;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InitiatePaymentRequest build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData;", "", "<init>", "()V", "InvestPaymentData", "GiftCardPaymentData", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData$GiftCardPaymentData;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData$InvestPaymentData;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class PaymentData {

        @WireOneofField(adapter = "com.squareup.protos.giftly.GiftCardPaymentData#ADAPTER", declaredName = "gift_card_payment_data", tag = 27)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData$GiftCardPaymentData;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData;", "value", "Lcom/squareup/protos/giftly/GiftCardPaymentData;", "<init>", "(Lcom/squareup/protos/giftly/GiftCardPaymentData;)V", "getValue", "()Lcom/squareup/protos/giftly/GiftCardPaymentData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GiftCardPaymentData extends PaymentData {
            private final com.squareup.protos.giftly.GiftCardPaymentData value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GiftCardPaymentData(com.squareup.protos.giftly.GiftCardPaymentData giftCardPaymentData) {
                super(null);
                giftCardPaymentData.getClass();
                this.value = giftCardPaymentData;
            }

            public static /* synthetic */ GiftCardPaymentData copy$default(GiftCardPaymentData giftCardPaymentData, com.squareup.protos.giftly.GiftCardPaymentData giftCardPaymentData2, int i, Object obj) {
                if ((i & 1) != 0) {
                    giftCardPaymentData2 = giftCardPaymentData.value;
                }
                return giftCardPaymentData.copy(giftCardPaymentData2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.protos.giftly.GiftCardPaymentData getValue() {
                return this.value;
            }

            public final GiftCardPaymentData copy(com.squareup.protos.giftly.GiftCardPaymentData value) {
                value.getClass();
                return new GiftCardPaymentData(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GiftCardPaymentData) && Intrinsics.areEqual(this.value, ((GiftCardPaymentData) other).value);
            }

            public final com.squareup.protos.giftly.GiftCardPaymentData getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GiftCardPaymentData(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.franklin.investing.resources.InvestPaymentData#ADAPTER", declaredName = "invest_payment_data", tag = 24)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData$InvestPaymentData;", "Lcom/squareup/protos/franklin/app/InitiatePaymentRequest$PaymentData;", "value", "Lcom/squareup/protos/franklin/investing/resources/InvestPaymentData;", "<init>", "(Lcom/squareup/protos/franklin/investing/resources/InvestPaymentData;)V", "getValue", "()Lcom/squareup/protos/franklin/investing/resources/InvestPaymentData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvestPaymentData extends PaymentData {
            private final com.squareup.protos.franklin.investing.resources.InvestPaymentData value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvestPaymentData(com.squareup.protos.franklin.investing.resources.InvestPaymentData investPaymentData) {
                super(null);
                investPaymentData.getClass();
                this.value = investPaymentData;
            }

            public static /* synthetic */ InvestPaymentData copy$default(InvestPaymentData investPaymentData, com.squareup.protos.franklin.investing.resources.InvestPaymentData investPaymentData2, int i, Object obj) {
                if ((i & 1) != 0) {
                    investPaymentData2 = investPaymentData.value;
                }
                return investPaymentData.copy(investPaymentData2);
            }

            /* renamed from: component1, reason: from getter */
            public final com.squareup.protos.franklin.investing.resources.InvestPaymentData getValue() {
                return this.value;
            }

            public final InvestPaymentData copy(com.squareup.protos.franklin.investing.resources.InvestPaymentData value) {
                value.getClass();
                return new InvestPaymentData(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvestPaymentData) && Intrinsics.areEqual(this.value, ((InvestPaymentData) other).value);
            }

            public final com.squareup.protos.franklin.investing.resources.InvestPaymentData getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InvestPaymentData(value=" + this.value + ")";
            }
        }

        public /* synthetic */ PaymentData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PaymentData() {
        }
    }

    public InitiatePaymentRequest(RequestContext requestContext, String str, ArrayList arrayList, Orientation orientation, Money money, String str2, InstrumentSelection instrumentSelection, String str3, ScheduleRFC2445 scheduleRFC2445, String str4, String str5, AppCreationActivity appCreationActivity, PaymentData paymentData, String str6, PersonalizationInput personalizationInput, String str7, int i) {
        this(requestContext, str, arrayList, orientation, money, str2, null, instrumentSelection, (i & 256) != 0 ? null : str3, null, scheduleRFC2445, str4, str5, appCreationActivity, (i & 16384) != 0 ? null : paymentData, null, str6, null, null, (524288 & i) != 0 ? null : personalizationInput, null, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : str7, ByteString.EMPTY);
    }
}
