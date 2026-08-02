package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 M2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002NMR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u0007R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u0007R\u0016\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\u0004\u0018\u0001078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u0007R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "name", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "getName$annotations", "()V", "Lcom/squareup/protos/franklin/common/scenarios/ResolveMergeBlockerSupplement;", "resolve_merge", "Lcom/squareup/protos/franklin/common/scenarios/ResolveMergeBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "rate_plan", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "getRate_plan$annotations", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "card", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "confirm", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/EmailBlockerSupplement;", "email", "Lcom/squareup/protos/franklin/common/scenarios/EmailBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/AddressBlockerSupplement;", "address", "Lcom/squareup/protos/franklin/common/scenarios/AddressBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "passcode_verification", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/InstrumentVerificationBlockerSupplement;", "instrument_verification", "Lcom/squareup/protos/franklin/common/scenarios/InstrumentVerificationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "email_verification", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "phone_verification", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "passcode_creation", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "identity_verification", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "passcode_and_expiration", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "getPasscode_and_expiration$annotations", "Lcom/squareup/protos/franklin/common/scenarios/SelectionBlockerSupplement;", "selection", "Lcom/squareup/protos/franklin/common/scenarios/SelectionBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/FileBlockerSupplement;", "file", "Lcom/squareup/protos/franklin/common/scenarios/FileBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/RegionBlockerSupplement;", "region", "Lcom/squareup/protos/franklin/common/scenarios/RegionBlockerSupplement;", "getRegion$annotations", "Lcom/squareup/protos/franklin/common/scenarios/PhoneNumberBlockerSupplement;", "phone_number", "Lcom/squareup/protos/franklin/common/scenarios/PhoneNumberBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/ContactVerificationBlockerSupplement;", "contact_verification", "Lcom/squareup/protos/franklin/common/scenarios/ContactVerificationBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/CashWaitingBlockerSupplement;", "cash_waiting", "Lcom/squareup/protos/franklin/common/scenarios/CashWaitingBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/InviteFriendsBlockerSupplement;", "invite_friends", "Lcom/squareup/protos/franklin/common/scenarios/InviteFriendsBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/ScheduledTransactionBlockerSupplement;", "scheduled_transaction", "Lcom/squareup/protos/franklin/common/scenarios/ScheduledTransactionBlockerSupplement;", "Lcom/squareup/protos/franklin/common/scenarios/GovernmentIdBlockerSupplement;", "government_id", "Lcom/squareup/protos/franklin/common/scenarios/GovernmentIdBlockerSupplement;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockersSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockersSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.AddressBlockerSupplement#ADAPTER", schemaIndex = 6, tag = 7)
    public final AddressBlockerSupplement address;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement#ADAPTER", schemaIndex = 3, tag = 4)
    public final CardBlockerSupplement card;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.CashWaitingBlockerSupplement#ADAPTER", schemaIndex = 19, tag = 21)
    public final CashWaitingBlockerSupplement cash_waiting;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ConfirmBlockerSupplement#ADAPTER", schemaIndex = 4, tag = 5)
    public final ConfirmBlockerSupplement confirm;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ContactVerificationBlockerSupplement#ADAPTER", schemaIndex = 18, tag = 20)
    public final ContactVerificationBlockerSupplement contact_verification;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.EmailBlockerSupplement#ADAPTER", schemaIndex = 5, tag = 6)
    public final EmailBlockerSupplement email;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.EmailVerificationBlockerSupplement#ADAPTER", schemaIndex = 9, tag = 10)
    public final EmailVerificationBlockerSupplement email_verification;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.FileBlockerSupplement#ADAPTER", schemaIndex = 15, tag = 17)
    public final FileBlockerSupplement file;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.GovernmentIdBlockerSupplement#ADAPTER", schemaIndex = 22, tag = 27)
    public final GovernmentIdBlockerSupplement government_id;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.IdentityVerificationBlockerSupplement#ADAPTER", schemaIndex = 12, tag = 13)
    public final IdentityVerificationBlockerSupplement identity_verification;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.InstrumentVerificationBlockerSupplement#ADAPTER", schemaIndex = 8, tag = 9)
    public final InstrumentVerificationBlockerSupplement instrument_verification;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.InviteFriendsBlockerSupplement#ADAPTER", schemaIndex = 20, tag = 22)
    public final InviteFriendsBlockerSupplement invite_friends;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.NameBlockerSupplement#ADAPTER", schemaIndex = 0, tag = 1)
    public final NameBlockerSupplement name;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.CardPasscodeAndExpirationBlockerSupplement#ADAPTER", schemaIndex = 13, tag = 14)
    public final CardPasscodeAndExpirationBlockerSupplement passcode_and_expiration;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PasscodeCreationBlockerSupplement#ADAPTER", schemaIndex = 11, tag = 12)
    public final PasscodeCreationBlockerSupplement passcode_creation;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PasscodeVerificationBlockerSupplement#ADAPTER", schemaIndex = 7, tag = 8)
    public final PasscodeVerificationBlockerSupplement passcode_verification;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PhoneNumberBlockerSupplement#ADAPTER", schemaIndex = 17, tag = 19)
    public final PhoneNumberBlockerSupplement phone_number;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PhoneVerificationBlockerSupplement#ADAPTER", schemaIndex = 10, tag = 11)
    public final PhoneVerificationBlockerSupplement phone_verification;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.RatePlanBlockerSupplement#ADAPTER", schemaIndex = 2, tag = 3)
    public final RatePlanBlockerSupplement rate_plan;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.RegionBlockerSupplement#ADAPTER", schemaIndex = 16, tag = 18)
    public final RegionBlockerSupplement region;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ResolveMergeBlockerSupplement#ADAPTER", schemaIndex = 1, tag = 2)
    public final ResolveMergeBlockerSupplement resolve_merge;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.ScheduledTransactionBlockerSupplement#ADAPTER", schemaIndex = 21, tag = 23)
    public final ScheduledTransactionBlockerSupplement scheduled_transaction;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.SelectionBlockerSupplement#ADAPTER", schemaIndex = 14, tag = 15)
    public final SelectionBlockerSupplement selection;

    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0010\u0010!\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010$J\u0012\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010)\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010/\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u00101\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u000102J\b\u00103\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "<init>", "()V", "name", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "resolve_merge", "Lcom/squareup/protos/franklin/common/scenarios/ResolveMergeBlockerSupplement;", "rate_plan", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanBlockerSupplement;", "card", "Lcom/squareup/protos/franklin/common/scenarios/CardBlockerSupplement;", "confirm", "Lcom/squareup/protos/franklin/common/scenarios/ConfirmBlockerSupplement;", "email", "Lcom/squareup/protos/franklin/common/scenarios/EmailBlockerSupplement;", "address", "Lcom/squareup/protos/franklin/common/scenarios/AddressBlockerSupplement;", "passcode_verification", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "instrument_verification", "Lcom/squareup/protos/franklin/common/scenarios/InstrumentVerificationBlockerSupplement;", "email_verification", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "phone_verification", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "passcode_creation", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "identity_verification", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "passcode_and_expiration", "Lcom/squareup/protos/franklin/common/scenarios/CardPasscodeAndExpirationBlockerSupplement;", "selection", "Lcom/squareup/protos/franklin/common/scenarios/SelectionBlockerSupplement;", "file", "Lcom/squareup/protos/franklin/common/scenarios/FileBlockerSupplement;", "region", "Lcom/squareup/protos/franklin/common/scenarios/RegionBlockerSupplement;", "phone_number", "Lcom/squareup/protos/franklin/common/scenarios/PhoneNumberBlockerSupplement;", "contact_verification", "Lcom/squareup/protos/franklin/common/scenarios/ContactVerificationBlockerSupplement;", "cash_waiting", "Lcom/squareup/protos/franklin/common/scenarios/CashWaitingBlockerSupplement;", "invite_friends", "Lcom/squareup/protos/franklin/common/scenarios/InviteFriendsBlockerSupplement;", "scheduled_transaction", "Lcom/squareup/protos/franklin/common/scenarios/ScheduledTransactionBlockerSupplement;", "government_id", "Lcom/squareup/protos/franklin/common/scenarios/GovernmentIdBlockerSupplement;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public AddressBlockerSupplement address;
        public CardBlockerSupplement card;
        public CashWaitingBlockerSupplement cash_waiting;
        public ConfirmBlockerSupplement confirm;
        public ContactVerificationBlockerSupplement contact_verification;
        public EmailBlockerSupplement email;
        public EmailVerificationBlockerSupplement email_verification;
        public FileBlockerSupplement file;
        public GovernmentIdBlockerSupplement government_id;
        public IdentityVerificationBlockerSupplement identity_verification;
        public InstrumentVerificationBlockerSupplement instrument_verification;
        public InviteFriendsBlockerSupplement invite_friends;
        public NameBlockerSupplement name;
        public CardPasscodeAndExpirationBlockerSupplement passcode_and_expiration;
        public PasscodeCreationBlockerSupplement passcode_creation;
        public PasscodeVerificationBlockerSupplement passcode_verification;
        public PhoneNumberBlockerSupplement phone_number;
        public PhoneVerificationBlockerSupplement phone_verification;
        public RatePlanBlockerSupplement rate_plan;
        public RegionBlockerSupplement region;
        public ResolveMergeBlockerSupplement resolve_merge;
        public ScheduledTransactionBlockerSupplement scheduled_transaction;
        public SelectionBlockerSupplement selection;

        public final Builder address(AddressBlockerSupplement address) {
            this.address = address;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public BlockersSupplement build() {
            return new BlockersSupplement(this.name, this.resolve_merge, this.rate_plan, this.card, this.confirm, this.email, this.address, this.passcode_verification, this.instrument_verification, this.email_verification, this.phone_verification, this.passcode_creation, this.identity_verification, this.passcode_and_expiration, this.selection, this.file, this.region, this.phone_number, this.contact_verification, this.cash_waiting, this.invite_friends, this.scheduled_transaction, this.government_id, buildUnknownFields());
        }

        public final Builder card(CardBlockerSupplement card) {
            this.card = card;
            return this;
        }

        public final Builder cash_waiting(CashWaitingBlockerSupplement cash_waiting) {
            this.cash_waiting = cash_waiting;
            return this;
        }

        public final Builder confirm(ConfirmBlockerSupplement confirm) {
            this.confirm = confirm;
            return this;
        }

        public final Builder contact_verification(ContactVerificationBlockerSupplement contact_verification) {
            this.contact_verification = contact_verification;
            return this;
        }

        public final Builder email(EmailBlockerSupplement email) {
            this.email = email;
            return this;
        }

        public final Builder email_verification(EmailVerificationBlockerSupplement email_verification) {
            this.email_verification = email_verification;
            return this;
        }

        public final Builder file(FileBlockerSupplement file) {
            this.file = file;
            return this;
        }

        public final Builder government_id(GovernmentIdBlockerSupplement government_id) {
            this.government_id = government_id;
            return this;
        }

        public final Builder identity_verification(IdentityVerificationBlockerSupplement identity_verification) {
            this.identity_verification = identity_verification;
            return this;
        }

        public final Builder instrument_verification(InstrumentVerificationBlockerSupplement instrument_verification) {
            this.instrument_verification = instrument_verification;
            return this;
        }

        public final Builder invite_friends(InviteFriendsBlockerSupplement invite_friends) {
            this.invite_friends = invite_friends;
            return this;
        }

        @Deprecated
        public final Builder name(NameBlockerSupplement name) {
            this.name = name;
            return this;
        }

        @Deprecated
        public final Builder passcode_and_expiration(CardPasscodeAndExpirationBlockerSupplement passcode_and_expiration) {
            this.passcode_and_expiration = passcode_and_expiration;
            return this;
        }

        public final Builder passcode_creation(PasscodeCreationBlockerSupplement passcode_creation) {
            this.passcode_creation = passcode_creation;
            return this;
        }

        public final Builder passcode_verification(PasscodeVerificationBlockerSupplement passcode_verification) {
            this.passcode_verification = passcode_verification;
            return this;
        }

        public final Builder phone_number(PhoneNumberBlockerSupplement phone_number) {
            this.phone_number = phone_number;
            return this;
        }

        public final Builder phone_verification(PhoneVerificationBlockerSupplement phone_verification) {
            this.phone_verification = phone_verification;
            return this;
        }

        @Deprecated
        public final Builder rate_plan(RatePlanBlockerSupplement rate_plan) {
            this.rate_plan = rate_plan;
            return this;
        }

        @Deprecated
        public final Builder region(RegionBlockerSupplement region) {
            this.region = region;
            return this;
        }

        public final Builder resolve_merge(ResolveMergeBlockerSupplement resolve_merge) {
            this.resolve_merge = resolve_merge;
            return this;
        }

        public final Builder scheduled_transaction(ScheduledTransactionBlockerSupplement scheduled_transaction) {
            this.scheduled_transaction = scheduled_transaction;
            return this;
        }

        public final Builder selection(SelectionBlockerSupplement selection) {
            this.selection = selection;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BlockersSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.BlockersSupplement$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v31 */
            /* JADX WARN: Type inference failed for: r1v33 */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public BlockersSupplement decode(ProtoReader reader) {
                Object obj;
                ?? decodeMessageOrMerge;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj2 = null;
                NameBlockerSupplement nameBlockerSupplement = null;
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
                ResolveMergeBlockerSupplement resolveMergeBlockerSupplement = null;
                RatePlanBlockerSupplement ratePlanBlockerSupplement = null;
                CardBlockerSupplement cardBlockerSupplement = null;
                ConfirmBlockerSupplement confirmBlockerSupplement = null;
                EmailBlockerSupplement emailBlockerSupplement = null;
                AddressBlockerSupplement addressBlockerSupplement = null;
                PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement = null;
                InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    Object obj16 = obj12;
                    if (nextTag == -1) {
                        return new BlockersSupplement(nameBlockerSupplement, resolveMergeBlockerSupplement, ratePlanBlockerSupplement, cardBlockerSupplement, confirmBlockerSupplement, emailBlockerSupplement, addressBlockerSupplement, passcodeVerificationBlockerSupplement, instrumentVerificationBlockerSupplement, (EmailVerificationBlockerSupplement) obj16, (PhoneVerificationBlockerSupplement) obj13, (PasscodeCreationBlockerSupplement) obj14, (IdentityVerificationBlockerSupplement) obj15, (CardPasscodeAndExpirationBlockerSupplement) obj3, (SelectionBlockerSupplement) obj4, (FileBlockerSupplement) obj2, (RegionBlockerSupplement) obj5, (PhoneNumberBlockerSupplement) obj6, (ContactVerificationBlockerSupplement) obj7, (CashWaitingBlockerSupplement) obj8, (InviteFriendsBlockerSupplement) obj9, (ScheduledTransactionBlockerSupplement) obj10, (GovernmentIdBlockerSupplement) obj11, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = TransactorKt.decodeMessageOrMerge(NameBlockerSupplement.ADAPTER, reader, nameBlockerSupplement);
                            break;
                        case 2:
                            obj12 = obj16;
                            obj = obj3;
                            resolveMergeBlockerSupplement = TransactorKt.decodeMessageOrMerge(ResolveMergeBlockerSupplement.ADAPTER, reader, resolveMergeBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 3:
                            obj12 = obj16;
                            obj = obj3;
                            ratePlanBlockerSupplement = TransactorKt.decodeMessageOrMerge(RatePlanBlockerSupplement.ADAPTER, reader, ratePlanBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 4:
                            obj12 = obj16;
                            obj = obj3;
                            cardBlockerSupplement = TransactorKt.decodeMessageOrMerge(CardBlockerSupplement.ADAPTER, reader, cardBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 5:
                            obj12 = obj16;
                            obj = obj3;
                            confirmBlockerSupplement = TransactorKt.decodeMessageOrMerge(ConfirmBlockerSupplement.ADAPTER, reader, confirmBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 6:
                            obj12 = obj16;
                            obj = obj3;
                            emailBlockerSupplement = TransactorKt.decodeMessageOrMerge(EmailBlockerSupplement.ADAPTER, reader, emailBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 7:
                            obj12 = obj16;
                            obj = obj3;
                            addressBlockerSupplement = TransactorKt.decodeMessageOrMerge(AddressBlockerSupplement.ADAPTER, reader, addressBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 8:
                            obj12 = obj16;
                            obj = obj3;
                            passcodeVerificationBlockerSupplement = TransactorKt.decodeMessageOrMerge(PasscodeVerificationBlockerSupplement.ADAPTER, reader, passcodeVerificationBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 9:
                            obj12 = obj16;
                            obj = obj3;
                            instrumentVerificationBlockerSupplement = TransactorKt.decodeMessageOrMerge(InstrumentVerificationBlockerSupplement.ADAPTER, reader, instrumentVerificationBlockerSupplement);
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 10:
                            Object decodeMessageOrMerge2 = TransactorKt.decodeMessageOrMerge(EmailVerificationBlockerSupplement.ADAPTER, reader, obj16);
                            obj = obj3;
                            obj12 = decodeMessageOrMerge2;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 11:
                            obj13 = TransactorKt.decodeMessageOrMerge(PhoneVerificationBlockerSupplement.ADAPTER, reader, obj13);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 12:
                            obj14 = TransactorKt.decodeMessageOrMerge(PasscodeCreationBlockerSupplement.ADAPTER, reader, obj14);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 13:
                            obj15 = TransactorKt.decodeMessageOrMerge(IdentityVerificationBlockerSupplement.ADAPTER, reader, obj15);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 14:
                            obj3 = TransactorKt.decodeMessageOrMerge(CardPasscodeAndExpirationBlockerSupplement.ADAPTER, reader, obj3);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 15:
                            obj4 = TransactorKt.decodeMessageOrMerge(SelectionBlockerSupplement.ADAPTER, reader, obj4);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 16:
                        case 24:
                        case 25:
                        case 26:
                        default:
                            reader.readUnknownField(nextTag);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 17:
                            obj2 = TransactorKt.decodeMessageOrMerge(FileBlockerSupplement.ADAPTER, reader, obj2);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 18:
                            obj5 = TransactorKt.decodeMessageOrMerge(RegionBlockerSupplement.ADAPTER, reader, obj5);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 19:
                            obj6 = TransactorKt.decodeMessageOrMerge(PhoneNumberBlockerSupplement.ADAPTER, reader, obj6);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 20:
                            obj7 = TransactorKt.decodeMessageOrMerge(ContactVerificationBlockerSupplement.ADAPTER, reader, obj7);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 21:
                            obj8 = TransactorKt.decodeMessageOrMerge(CashWaitingBlockerSupplement.ADAPTER, reader, obj8);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 22:
                            obj9 = TransactorKt.decodeMessageOrMerge(InviteFriendsBlockerSupplement.ADAPTER, reader, obj9);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 23:
                            obj10 = TransactorKt.decodeMessageOrMerge(ScheduledTransactionBlockerSupplement.ADAPTER, reader, obj10);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                        case 27:
                            obj11 = TransactorKt.decodeMessageOrMerge(GovernmentIdBlockerSupplement.ADAPTER, reader, obj11);
                            obj12 = obj16;
                            obj = obj3;
                            decodeMessageOrMerge = nameBlockerSupplement;
                            break;
                    }
                    nameBlockerSupplement = decodeMessageOrMerge;
                    obj3 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BlockersSupplement value) {
                writer.getClass();
                value.getClass();
                NameBlockerSupplement.ADAPTER.encodeWithTag(writer, 1, value.name);
                ResolveMergeBlockerSupplement.ADAPTER.encodeWithTag(writer, 2, value.resolve_merge);
                RatePlanBlockerSupplement.ADAPTER.encodeWithTag(writer, 3, value.rate_plan);
                CardBlockerSupplement.ADAPTER.encodeWithTag(writer, 4, value.card);
                ConfirmBlockerSupplement.ADAPTER.encodeWithTag(writer, 5, value.confirm);
                EmailBlockerSupplement.ADAPTER.encodeWithTag(writer, 6, value.email);
                AddressBlockerSupplement.ADAPTER.encodeWithTag(writer, 7, value.address);
                PasscodeVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 8, value.passcode_verification);
                InstrumentVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 9, value.instrument_verification);
                EmailVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 10, value.email_verification);
                PhoneVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 11, value.phone_verification);
                PasscodeCreationBlockerSupplement.ADAPTER.encodeWithTag(writer, 12, value.passcode_creation);
                IdentityVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 13, value.identity_verification);
                CardPasscodeAndExpirationBlockerSupplement.ADAPTER.encodeWithTag(writer, 14, value.passcode_and_expiration);
                SelectionBlockerSupplement.ADAPTER.encodeWithTag(writer, 15, value.selection);
                FileBlockerSupplement.ADAPTER.encodeWithTag(writer, 17, value.file);
                RegionBlockerSupplement.ADAPTER.encodeWithTag(writer, 18, value.region);
                PhoneNumberBlockerSupplement.ADAPTER.encodeWithTag(writer, 19, value.phone_number);
                ContactVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 20, value.contact_verification);
                CashWaitingBlockerSupplement.ADAPTER.encodeWithTag(writer, 21, value.cash_waiting);
                InviteFriendsBlockerSupplement.ADAPTER.encodeWithTag(writer, 22, value.invite_friends);
                ScheduledTransactionBlockerSupplement.ADAPTER.encodeWithTag(writer, 23, value.scheduled_transaction);
                GovernmentIdBlockerSupplement.ADAPTER.encodeWithTag(writer, 27, value.government_id);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BlockersSupplement value) {
                value.getClass();
                return GovernmentIdBlockerSupplement.ADAPTER.encodedSizeWithTag(27, value.government_id) + ScheduledTransactionBlockerSupplement.ADAPTER.encodedSizeWithTag(23, value.scheduled_transaction) + InviteFriendsBlockerSupplement.ADAPTER.encodedSizeWithTag(22, value.invite_friends) + CashWaitingBlockerSupplement.ADAPTER.encodedSizeWithTag(21, value.cash_waiting) + ContactVerificationBlockerSupplement.ADAPTER.encodedSizeWithTag(20, value.contact_verification) + PhoneNumberBlockerSupplement.ADAPTER.encodedSizeWithTag(19, value.phone_number) + RegionBlockerSupplement.ADAPTER.encodedSizeWithTag(18, value.region) + FileBlockerSupplement.ADAPTER.encodedSizeWithTag(17, value.file) + SelectionBlockerSupplement.ADAPTER.encodedSizeWithTag(15, value.selection) + CardPasscodeAndExpirationBlockerSupplement.ADAPTER.encodedSizeWithTag(14, value.passcode_and_expiration) + IdentityVerificationBlockerSupplement.ADAPTER.encodedSizeWithTag(13, value.identity_verification) + PasscodeCreationBlockerSupplement.ADAPTER.encodedSizeWithTag(12, value.passcode_creation) + PhoneVerificationBlockerSupplement.ADAPTER.encodedSizeWithTag(11, value.phone_verification) + EmailVerificationBlockerSupplement.ADAPTER.encodedSizeWithTag(10, value.email_verification) + InstrumentVerificationBlockerSupplement.ADAPTER.encodedSizeWithTag(9, value.instrument_verification) + PasscodeVerificationBlockerSupplement.ADAPTER.encodedSizeWithTag(8, value.passcode_verification) + AddressBlockerSupplement.ADAPTER.encodedSizeWithTag(7, value.address) + EmailBlockerSupplement.ADAPTER.encodedSizeWithTag(6, value.email) + ConfirmBlockerSupplement.ADAPTER.encodedSizeWithTag(5, value.confirm) + CardBlockerSupplement.ADAPTER.encodedSizeWithTag(4, value.card) + RatePlanBlockerSupplement.ADAPTER.encodedSizeWithTag(3, value.rate_plan) + ResolveMergeBlockerSupplement.ADAPTER.encodedSizeWithTag(2, value.resolve_merge) + NameBlockerSupplement.ADAPTER.encodedSizeWithTag(1, value.name) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BlockersSupplement redact(BlockersSupplement value) {
                value.getClass();
                NameBlockerSupplement nameBlockerSupplement = value.name;
                NameBlockerSupplement nameBlockerSupplement2 = nameBlockerSupplement != null ? (NameBlockerSupplement) NameBlockerSupplement.ADAPTER.redact(nameBlockerSupplement) : null;
                ResolveMergeBlockerSupplement resolveMergeBlockerSupplement = value.resolve_merge;
                ResolveMergeBlockerSupplement resolveMergeBlockerSupplement2 = resolveMergeBlockerSupplement != null ? (ResolveMergeBlockerSupplement) ResolveMergeBlockerSupplement.ADAPTER.redact(resolveMergeBlockerSupplement) : null;
                RatePlanBlockerSupplement ratePlanBlockerSupplement = value.rate_plan;
                RatePlanBlockerSupplement ratePlanBlockerSupplement2 = ratePlanBlockerSupplement != null ? (RatePlanBlockerSupplement) RatePlanBlockerSupplement.ADAPTER.redact(ratePlanBlockerSupplement) : null;
                CardBlockerSupplement cardBlockerSupplement = value.card;
                CardBlockerSupplement cardBlockerSupplement2 = cardBlockerSupplement != null ? (CardBlockerSupplement) CardBlockerSupplement.ADAPTER.redact(cardBlockerSupplement) : null;
                ConfirmBlockerSupplement confirmBlockerSupplement = value.confirm;
                ConfirmBlockerSupplement confirmBlockerSupplement2 = confirmBlockerSupplement != null ? (ConfirmBlockerSupplement) ConfirmBlockerSupplement.ADAPTER.redact(confirmBlockerSupplement) : null;
                EmailBlockerSupplement emailBlockerSupplement = value.email;
                EmailBlockerSupplement emailBlockerSupplement2 = emailBlockerSupplement != null ? (EmailBlockerSupplement) EmailBlockerSupplement.ADAPTER.redact(emailBlockerSupplement) : null;
                AddressBlockerSupplement addressBlockerSupplement = value.address;
                AddressBlockerSupplement addressBlockerSupplement2 = addressBlockerSupplement != null ? (AddressBlockerSupplement) AddressBlockerSupplement.ADAPTER.redact(addressBlockerSupplement) : null;
                PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement = value.passcode_verification;
                PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement2 = passcodeVerificationBlockerSupplement != null ? (PasscodeVerificationBlockerSupplement) PasscodeVerificationBlockerSupplement.ADAPTER.redact(passcodeVerificationBlockerSupplement) : null;
                InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement = value.instrument_verification;
                InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement2 = instrumentVerificationBlockerSupplement != null ? (InstrumentVerificationBlockerSupplement) InstrumentVerificationBlockerSupplement.ADAPTER.redact(instrumentVerificationBlockerSupplement) : null;
                EmailVerificationBlockerSupplement emailVerificationBlockerSupplement = value.email_verification;
                EmailVerificationBlockerSupplement emailVerificationBlockerSupplement2 = emailVerificationBlockerSupplement != null ? (EmailVerificationBlockerSupplement) EmailVerificationBlockerSupplement.ADAPTER.redact(emailVerificationBlockerSupplement) : null;
                PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement = value.phone_verification;
                PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement2 = phoneVerificationBlockerSupplement != null ? (PhoneVerificationBlockerSupplement) PhoneVerificationBlockerSupplement.ADAPTER.redact(phoneVerificationBlockerSupplement) : null;
                PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement = value.passcode_creation;
                PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement2 = passcodeCreationBlockerSupplement != null ? (PasscodeCreationBlockerSupplement) PasscodeCreationBlockerSupplement.ADAPTER.redact(passcodeCreationBlockerSupplement) : null;
                IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement = value.identity_verification;
                IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement2 = identityVerificationBlockerSupplement != null ? (IdentityVerificationBlockerSupplement) IdentityVerificationBlockerSupplement.ADAPTER.redact(identityVerificationBlockerSupplement) : null;
                CardPasscodeAndExpirationBlockerSupplement cardPasscodeAndExpirationBlockerSupplement = value.passcode_and_expiration;
                CardPasscodeAndExpirationBlockerSupplement cardPasscodeAndExpirationBlockerSupplement2 = cardPasscodeAndExpirationBlockerSupplement != null ? (CardPasscodeAndExpirationBlockerSupplement) CardPasscodeAndExpirationBlockerSupplement.ADAPTER.redact(cardPasscodeAndExpirationBlockerSupplement) : null;
                SelectionBlockerSupplement selectionBlockerSupplement = value.selection;
                SelectionBlockerSupplement selectionBlockerSupplement2 = selectionBlockerSupplement != null ? (SelectionBlockerSupplement) SelectionBlockerSupplement.ADAPTER.redact(selectionBlockerSupplement) : null;
                FileBlockerSupplement fileBlockerSupplement = value.file;
                FileBlockerSupplement fileBlockerSupplement2 = fileBlockerSupplement != null ? (FileBlockerSupplement) FileBlockerSupplement.ADAPTER.redact(fileBlockerSupplement) : null;
                RegionBlockerSupplement regionBlockerSupplement = value.region;
                RegionBlockerSupplement regionBlockerSupplement2 = regionBlockerSupplement != null ? (RegionBlockerSupplement) RegionBlockerSupplement.ADAPTER.redact(regionBlockerSupplement) : null;
                PhoneNumberBlockerSupplement phoneNumberBlockerSupplement = value.phone_number;
                PhoneNumberBlockerSupplement phoneNumberBlockerSupplement2 = phoneNumberBlockerSupplement != null ? (PhoneNumberBlockerSupplement) PhoneNumberBlockerSupplement.ADAPTER.redact(phoneNumberBlockerSupplement) : null;
                ContactVerificationBlockerSupplement contactVerificationBlockerSupplement = value.contact_verification;
                ContactVerificationBlockerSupplement contactVerificationBlockerSupplement2 = contactVerificationBlockerSupplement != null ? (ContactVerificationBlockerSupplement) ContactVerificationBlockerSupplement.ADAPTER.redact(contactVerificationBlockerSupplement) : null;
                CashWaitingBlockerSupplement cashWaitingBlockerSupplement = value.cash_waiting;
                CashWaitingBlockerSupplement cashWaitingBlockerSupplement2 = cashWaitingBlockerSupplement != null ? (CashWaitingBlockerSupplement) CashWaitingBlockerSupplement.ADAPTER.redact(cashWaitingBlockerSupplement) : null;
                InviteFriendsBlockerSupplement inviteFriendsBlockerSupplement = value.invite_friends;
                InviteFriendsBlockerSupplement inviteFriendsBlockerSupplement2 = inviteFriendsBlockerSupplement != null ? (InviteFriendsBlockerSupplement) InviteFriendsBlockerSupplement.ADAPTER.redact(inviteFriendsBlockerSupplement) : null;
                ScheduledTransactionBlockerSupplement scheduledTransactionBlockerSupplement = value.scheduled_transaction;
                ScheduledTransactionBlockerSupplement scheduledTransactionBlockerSupplement2 = scheduledTransactionBlockerSupplement != null ? (ScheduledTransactionBlockerSupplement) ScheduledTransactionBlockerSupplement.ADAPTER.redact(scheduledTransactionBlockerSupplement) : null;
                GovernmentIdBlockerSupplement governmentIdBlockerSupplement = value.government_id;
                GovernmentIdBlockerSupplement governmentIdBlockerSupplement2 = governmentIdBlockerSupplement != null ? (GovernmentIdBlockerSupplement) GovernmentIdBlockerSupplement.ADAPTER.redact(governmentIdBlockerSupplement) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new BlockersSupplement(nameBlockerSupplement2, resolveMergeBlockerSupplement2, ratePlanBlockerSupplement2, cardBlockerSupplement2, confirmBlockerSupplement2, emailBlockerSupplement2, addressBlockerSupplement2, passcodeVerificationBlockerSupplement2, instrumentVerificationBlockerSupplement2, emailVerificationBlockerSupplement2, phoneVerificationBlockerSupplement2, passcodeCreationBlockerSupplement2, identityVerificationBlockerSupplement2, cardPasscodeAndExpirationBlockerSupplement2, selectionBlockerSupplement2, fileBlockerSupplement2, regionBlockerSupplement2, phoneNumberBlockerSupplement2, contactVerificationBlockerSupplement2, cashWaitingBlockerSupplement2, inviteFriendsBlockerSupplement2, scheduledTransactionBlockerSupplement2, governmentIdBlockerSupplement2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BlockersSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                GovernmentIdBlockerSupplement.ADAPTER.encodeWithTag(writer, 27, value.government_id);
                ScheduledTransactionBlockerSupplement.ADAPTER.encodeWithTag(writer, 23, value.scheduled_transaction);
                InviteFriendsBlockerSupplement.ADAPTER.encodeWithTag(writer, 22, value.invite_friends);
                CashWaitingBlockerSupplement.ADAPTER.encodeWithTag(writer, 21, value.cash_waiting);
                ContactVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 20, value.contact_verification);
                PhoneNumberBlockerSupplement.ADAPTER.encodeWithTag(writer, 19, value.phone_number);
                RegionBlockerSupplement.ADAPTER.encodeWithTag(writer, 18, value.region);
                FileBlockerSupplement.ADAPTER.encodeWithTag(writer, 17, value.file);
                SelectionBlockerSupplement.ADAPTER.encodeWithTag(writer, 15, value.selection);
                CardPasscodeAndExpirationBlockerSupplement.ADAPTER.encodeWithTag(writer, 14, value.passcode_and_expiration);
                IdentityVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 13, value.identity_verification);
                PasscodeCreationBlockerSupplement.ADAPTER.encodeWithTag(writer, 12, value.passcode_creation);
                PhoneVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 11, value.phone_verification);
                EmailVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 10, value.email_verification);
                InstrumentVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 9, value.instrument_verification);
                PasscodeVerificationBlockerSupplement.ADAPTER.encodeWithTag(writer, 8, value.passcode_verification);
                AddressBlockerSupplement.ADAPTER.encodeWithTag(writer, 7, value.address);
                EmailBlockerSupplement.ADAPTER.encodeWithTag(writer, 6, value.email);
                ConfirmBlockerSupplement.ADAPTER.encodeWithTag(writer, 5, value.confirm);
                CardBlockerSupplement.ADAPTER.encodeWithTag(writer, 4, value.card);
                RatePlanBlockerSupplement.ADAPTER.encodeWithTag(writer, 3, value.rate_plan);
                ResolveMergeBlockerSupplement.ADAPTER.encodeWithTag(writer, 2, value.resolve_merge);
                NameBlockerSupplement.ADAPTER.encodeWithTag(writer, 1, value.name);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockersSupplement(NameBlockerSupplement nameBlockerSupplement, ResolveMergeBlockerSupplement resolveMergeBlockerSupplement, RatePlanBlockerSupplement ratePlanBlockerSupplement, CardBlockerSupplement cardBlockerSupplement, ConfirmBlockerSupplement confirmBlockerSupplement, EmailBlockerSupplement emailBlockerSupplement, AddressBlockerSupplement addressBlockerSupplement, PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement, InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement, EmailVerificationBlockerSupplement emailVerificationBlockerSupplement, PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement, PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement, IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement, CardPasscodeAndExpirationBlockerSupplement cardPasscodeAndExpirationBlockerSupplement, SelectionBlockerSupplement selectionBlockerSupplement, FileBlockerSupplement fileBlockerSupplement, RegionBlockerSupplement regionBlockerSupplement, PhoneNumberBlockerSupplement phoneNumberBlockerSupplement, ContactVerificationBlockerSupplement contactVerificationBlockerSupplement, CashWaitingBlockerSupplement cashWaitingBlockerSupplement, InviteFriendsBlockerSupplement inviteFriendsBlockerSupplement, ScheduledTransactionBlockerSupplement scheduledTransactionBlockerSupplement, GovernmentIdBlockerSupplement governmentIdBlockerSupplement, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = nameBlockerSupplement;
        this.resolve_merge = resolveMergeBlockerSupplement;
        this.rate_plan = ratePlanBlockerSupplement;
        this.card = cardBlockerSupplement;
        this.confirm = confirmBlockerSupplement;
        this.email = emailBlockerSupplement;
        this.address = addressBlockerSupplement;
        this.passcode_verification = passcodeVerificationBlockerSupplement;
        this.instrument_verification = instrumentVerificationBlockerSupplement;
        this.email_verification = emailVerificationBlockerSupplement;
        this.phone_verification = phoneVerificationBlockerSupplement;
        this.passcode_creation = passcodeCreationBlockerSupplement;
        this.identity_verification = identityVerificationBlockerSupplement;
        this.passcode_and_expiration = cardPasscodeAndExpirationBlockerSupplement;
        this.selection = selectionBlockerSupplement;
        this.file = fileBlockerSupplement;
        this.region = regionBlockerSupplement;
        this.phone_number = phoneNumberBlockerSupplement;
        this.contact_verification = contactVerificationBlockerSupplement;
        this.cash_waiting = cashWaitingBlockerSupplement;
        this.invite_friends = inviteFriendsBlockerSupplement;
        this.scheduled_transaction = scheduledTransactionBlockerSupplement;
        this.government_id = governmentIdBlockerSupplement;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockersSupplement)) {
            return false;
        }
        BlockersSupplement blockersSupplement = (BlockersSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), blockersSupplement.unknownFields()) && Intrinsics.areEqual(this.name, blockersSupplement.name) && Intrinsics.areEqual(this.resolve_merge, blockersSupplement.resolve_merge) && Intrinsics.areEqual(this.rate_plan, blockersSupplement.rate_plan) && Intrinsics.areEqual(this.card, blockersSupplement.card) && Intrinsics.areEqual(this.confirm, blockersSupplement.confirm) && Intrinsics.areEqual(this.email, blockersSupplement.email) && Intrinsics.areEqual(this.address, blockersSupplement.address) && Intrinsics.areEqual(this.passcode_verification, blockersSupplement.passcode_verification) && Intrinsics.areEqual(this.instrument_verification, blockersSupplement.instrument_verification) && Intrinsics.areEqual(this.email_verification, blockersSupplement.email_verification) && Intrinsics.areEqual(this.phone_verification, blockersSupplement.phone_verification) && Intrinsics.areEqual(this.passcode_creation, blockersSupplement.passcode_creation) && Intrinsics.areEqual(this.identity_verification, blockersSupplement.identity_verification) && Intrinsics.areEqual(this.passcode_and_expiration, blockersSupplement.passcode_and_expiration) && Intrinsics.areEqual(this.selection, blockersSupplement.selection) && Intrinsics.areEqual(this.file, blockersSupplement.file) && Intrinsics.areEqual(this.region, blockersSupplement.region) && Intrinsics.areEqual(this.phone_number, blockersSupplement.phone_number) && Intrinsics.areEqual(this.contact_verification, blockersSupplement.contact_verification) && Intrinsics.areEqual(this.cash_waiting, blockersSupplement.cash_waiting) && Intrinsics.areEqual(this.invite_friends, blockersSupplement.invite_friends) && Intrinsics.areEqual(this.scheduled_transaction, blockersSupplement.scheduled_transaction) && Intrinsics.areEqual(this.government_id, blockersSupplement.government_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NameBlockerSupplement nameBlockerSupplement = this.name;
        int hashCode2 = (hashCode + (nameBlockerSupplement != null ? nameBlockerSupplement.hashCode() : 0)) * 37;
        ResolveMergeBlockerSupplement resolveMergeBlockerSupplement = this.resolve_merge;
        int hashCode3 = (hashCode2 + (resolveMergeBlockerSupplement != null ? resolveMergeBlockerSupplement.hashCode() : 0)) * 37;
        RatePlanBlockerSupplement ratePlanBlockerSupplement = this.rate_plan;
        int hashCode4 = (hashCode3 + (ratePlanBlockerSupplement != null ? ratePlanBlockerSupplement.hashCode() : 0)) * 37;
        CardBlockerSupplement cardBlockerSupplement = this.card;
        int hashCode5 = (hashCode4 + (cardBlockerSupplement != null ? cardBlockerSupplement.hashCode() : 0)) * 37;
        ConfirmBlockerSupplement confirmBlockerSupplement = this.confirm;
        int hashCode6 = (hashCode5 + (confirmBlockerSupplement != null ? confirmBlockerSupplement.hashCode() : 0)) * 37;
        EmailBlockerSupplement emailBlockerSupplement = this.email;
        int hashCode7 = (hashCode6 + (emailBlockerSupplement != null ? emailBlockerSupplement.hashCode() : 0)) * 37;
        AddressBlockerSupplement addressBlockerSupplement = this.address;
        int hashCode8 = (hashCode7 + (addressBlockerSupplement != null ? addressBlockerSupplement.hashCode() : 0)) * 37;
        PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement = this.passcode_verification;
        int hashCode9 = (hashCode8 + (passcodeVerificationBlockerSupplement != null ? passcodeVerificationBlockerSupplement.hashCode() : 0)) * 37;
        InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement = this.instrument_verification;
        int hashCode10 = (hashCode9 + (instrumentVerificationBlockerSupplement != null ? instrumentVerificationBlockerSupplement.hashCode() : 0)) * 37;
        EmailVerificationBlockerSupplement emailVerificationBlockerSupplement = this.email_verification;
        int hashCode11 = (hashCode10 + (emailVerificationBlockerSupplement != null ? emailVerificationBlockerSupplement.hashCode() : 0)) * 37;
        PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement = this.phone_verification;
        int hashCode12 = (hashCode11 + (phoneVerificationBlockerSupplement != null ? phoneVerificationBlockerSupplement.hashCode() : 0)) * 37;
        PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement = this.passcode_creation;
        int hashCode13 = (hashCode12 + (passcodeCreationBlockerSupplement != null ? passcodeCreationBlockerSupplement.hashCode() : 0)) * 37;
        IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement = this.identity_verification;
        int hashCode14 = (hashCode13 + (identityVerificationBlockerSupplement != null ? identityVerificationBlockerSupplement.hashCode() : 0)) * 37;
        CardPasscodeAndExpirationBlockerSupplement cardPasscodeAndExpirationBlockerSupplement = this.passcode_and_expiration;
        int hashCode15 = (hashCode14 + (cardPasscodeAndExpirationBlockerSupplement != null ? cardPasscodeAndExpirationBlockerSupplement.hashCode() : 0)) * 37;
        SelectionBlockerSupplement selectionBlockerSupplement = this.selection;
        int hashCode16 = (hashCode15 + (selectionBlockerSupplement != null ? selectionBlockerSupplement.hashCode() : 0)) * 37;
        FileBlockerSupplement fileBlockerSupplement = this.file;
        int hashCode17 = (hashCode16 + (fileBlockerSupplement != null ? fileBlockerSupplement.hashCode() : 0)) * 37;
        RegionBlockerSupplement regionBlockerSupplement = this.region;
        int hashCode18 = (hashCode17 + (regionBlockerSupplement != null ? regionBlockerSupplement.hashCode() : 0)) * 37;
        PhoneNumberBlockerSupplement phoneNumberBlockerSupplement = this.phone_number;
        int hashCode19 = (hashCode18 + (phoneNumberBlockerSupplement != null ? phoneNumberBlockerSupplement.hashCode() : 0)) * 37;
        ContactVerificationBlockerSupplement contactVerificationBlockerSupplement = this.contact_verification;
        int hashCode20 = (hashCode19 + (contactVerificationBlockerSupplement != null ? contactVerificationBlockerSupplement.hashCode() : 0)) * 37;
        CashWaitingBlockerSupplement cashWaitingBlockerSupplement = this.cash_waiting;
        int hashCode21 = (hashCode20 + (cashWaitingBlockerSupplement != null ? cashWaitingBlockerSupplement.hashCode() : 0)) * 37;
        InviteFriendsBlockerSupplement inviteFriendsBlockerSupplement = this.invite_friends;
        int hashCode22 = (hashCode21 + (inviteFriendsBlockerSupplement != null ? inviteFriendsBlockerSupplement.hashCode() : 0)) * 37;
        ScheduledTransactionBlockerSupplement scheduledTransactionBlockerSupplement = this.scheduled_transaction;
        int hashCode23 = (hashCode22 + (scheduledTransactionBlockerSupplement != null ? scheduledTransactionBlockerSupplement.hashCode() : 0)) * 37;
        GovernmentIdBlockerSupplement governmentIdBlockerSupplement = this.government_id;
        int hashCode24 = hashCode23 + (governmentIdBlockerSupplement != null ? governmentIdBlockerSupplement.hashCode() : 0);
        this.hashCode = hashCode24;
        return hashCode24;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.resolve_merge = this.resolve_merge;
        builder.rate_plan = this.rate_plan;
        builder.card = this.card;
        builder.confirm = this.confirm;
        builder.email = this.email;
        builder.address = this.address;
        builder.passcode_verification = this.passcode_verification;
        builder.instrument_verification = this.instrument_verification;
        builder.email_verification = this.email_verification;
        builder.phone_verification = this.phone_verification;
        builder.passcode_creation = this.passcode_creation;
        builder.identity_verification = this.identity_verification;
        builder.passcode_and_expiration = this.passcode_and_expiration;
        builder.selection = this.selection;
        builder.file = this.file;
        builder.region = this.region;
        builder.phone_number = this.phone_number;
        builder.contact_verification = this.contact_verification;
        builder.cash_waiting = this.cash_waiting;
        builder.invite_friends = this.invite_friends;
        builder.scheduled_transaction = this.scheduled_transaction;
        builder.government_id = this.government_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NameBlockerSupplement nameBlockerSupplement = this.name;
        if (nameBlockerSupplement != null) {
            arrayList.add("name=" + nameBlockerSupplement);
        }
        ResolveMergeBlockerSupplement resolveMergeBlockerSupplement = this.resolve_merge;
        if (resolveMergeBlockerSupplement != null) {
            arrayList.add("resolve_merge=" + resolveMergeBlockerSupplement);
        }
        RatePlanBlockerSupplement ratePlanBlockerSupplement = this.rate_plan;
        if (ratePlanBlockerSupplement != null) {
            arrayList.add("rate_plan=" + ratePlanBlockerSupplement);
        }
        CardBlockerSupplement cardBlockerSupplement = this.card;
        if (cardBlockerSupplement != null) {
            arrayList.add("card=" + cardBlockerSupplement);
        }
        ConfirmBlockerSupplement confirmBlockerSupplement = this.confirm;
        if (confirmBlockerSupplement != null) {
            arrayList.add("confirm=" + confirmBlockerSupplement);
        }
        EmailBlockerSupplement emailBlockerSupplement = this.email;
        if (emailBlockerSupplement != null) {
            arrayList.add("email=" + emailBlockerSupplement);
        }
        AddressBlockerSupplement addressBlockerSupplement = this.address;
        if (addressBlockerSupplement != null) {
            arrayList.add("address=" + addressBlockerSupplement);
        }
        PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement = this.passcode_verification;
        if (passcodeVerificationBlockerSupplement != null) {
            arrayList.add("passcode_verification=" + passcodeVerificationBlockerSupplement);
        }
        InstrumentVerificationBlockerSupplement instrumentVerificationBlockerSupplement = this.instrument_verification;
        if (instrumentVerificationBlockerSupplement != null) {
            arrayList.add("instrument_verification=" + instrumentVerificationBlockerSupplement);
        }
        EmailVerificationBlockerSupplement emailVerificationBlockerSupplement = this.email_verification;
        if (emailVerificationBlockerSupplement != null) {
            arrayList.add("email_verification=" + emailVerificationBlockerSupplement);
        }
        PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement = this.phone_verification;
        if (phoneVerificationBlockerSupplement != null) {
            arrayList.add("phone_verification=" + phoneVerificationBlockerSupplement);
        }
        PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement = this.passcode_creation;
        if (passcodeCreationBlockerSupplement != null) {
            arrayList.add("passcode_creation=" + passcodeCreationBlockerSupplement);
        }
        IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement = this.identity_verification;
        if (identityVerificationBlockerSupplement != null) {
            arrayList.add("identity_verification=" + identityVerificationBlockerSupplement);
        }
        CardPasscodeAndExpirationBlockerSupplement cardPasscodeAndExpirationBlockerSupplement = this.passcode_and_expiration;
        if (cardPasscodeAndExpirationBlockerSupplement != null) {
            arrayList.add("passcode_and_expiration=" + cardPasscodeAndExpirationBlockerSupplement);
        }
        SelectionBlockerSupplement selectionBlockerSupplement = this.selection;
        if (selectionBlockerSupplement != null) {
            arrayList.add("selection=" + selectionBlockerSupplement);
        }
        FileBlockerSupplement fileBlockerSupplement = this.file;
        if (fileBlockerSupplement != null) {
            arrayList.add("file=" + fileBlockerSupplement);
        }
        RegionBlockerSupplement regionBlockerSupplement = this.region;
        if (regionBlockerSupplement != null) {
            arrayList.add("region=" + regionBlockerSupplement);
        }
        PhoneNumberBlockerSupplement phoneNumberBlockerSupplement = this.phone_number;
        if (phoneNumberBlockerSupplement != null) {
            arrayList.add("phone_number=" + phoneNumberBlockerSupplement);
        }
        ContactVerificationBlockerSupplement contactVerificationBlockerSupplement = this.contact_verification;
        if (contactVerificationBlockerSupplement != null) {
            arrayList.add("contact_verification=" + contactVerificationBlockerSupplement);
        }
        CashWaitingBlockerSupplement cashWaitingBlockerSupplement = this.cash_waiting;
        if (cashWaitingBlockerSupplement != null) {
            arrayList.add("cash_waiting=" + cashWaitingBlockerSupplement);
        }
        InviteFriendsBlockerSupplement inviteFriendsBlockerSupplement = this.invite_friends;
        if (inviteFriendsBlockerSupplement != null) {
            arrayList.add("invite_friends=" + inviteFriendsBlockerSupplement);
        }
        ScheduledTransactionBlockerSupplement scheduledTransactionBlockerSupplement = this.scheduled_transaction;
        if (scheduledTransactionBlockerSupplement != null) {
            arrayList.add("scheduled_transaction=" + scheduledTransactionBlockerSupplement);
        }
        GovernmentIdBlockerSupplement governmentIdBlockerSupplement = this.government_id;
        if (governmentIdBlockerSupplement != null) {
            arrayList.add("government_id=" + governmentIdBlockerSupplement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockersSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/BlockersSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ BlockersSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
