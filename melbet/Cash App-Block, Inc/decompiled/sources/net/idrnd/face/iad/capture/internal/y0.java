package net.idrnd.face.iad.capture.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.protobuf.Internal;
import com.squareup.protos.timecards.TimecardEvent;
import com.squareup.protos.timecards.scheduling.TimeOff;
import com.stripe.android.challenge.confirmation.BridgeErrorParams;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.StripeIntent;
import io.reactivex.rxjava3.functions.Function;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Clock;
import kotlin.time.Instant;
import org.json.JSONObject;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.paychecks.BenefitsStatusSection;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;

/* loaded from: classes9.dex */
public final class y0 implements ModelJsonParser, Function, Clock, Internal.ListAdapter.Converter {
    public static CardBrand fromCode(String str) {
        Object obj;
        EnumEntriesList enumEntriesList = CardBrand.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (StringsKt__StringsJVMKt.equals(((CardBrand) obj).code, str, true)) {
                break;
            }
        }
        CardBrand cardBrand = (CardBrand) obj;
        return cardBrand == null ? CardBrand.Unknown : cardBrand;
    }

    public static StripeIntent.Usage fromCode$payments_core_release(String str) {
        Object obj;
        EnumEntriesList enumEntriesList = StripeIntent.Usage.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (((StripeIntent.Usage) obj).code.equals(str)) {
                break;
            }
        }
        return (StripeIntent.Usage) obj;
    }

    public static TimecardEvent.EventType fromValue(int i) {
        switch (i) {
            case 1:
                return TimecardEvent.EventType.CLOCKIN;
            case 2:
                return TimecardEvent.EventType.CLOCKOUT;
            case 3:
                return TimecardEvent.EventType.SUPERVISOR_CLOSE;
            case 4:
                return TimecardEvent.EventType.EDIT;
            case 5:
                return TimecardEvent.EventType.CREATE;
            case 6:
                return TimecardEvent.EventType.DELETE;
            case 7:
                return TimecardEvent.EventType.API_CREATE;
            case 8:
                return TimecardEvent.EventType.API_DELETE;
            case 9:
                return TimecardEvent.EventType.API_EDIT;
            case 10:
                return TimecardEvent.EventType.UPDATE_NOTE;
            case 11:
                return TimecardEvent.EventType.AUTO_CLOCK_OUT;
            case 12:
                return TimecardEvent.EventType.LARGE_TIMECARD_SPLIT_EDIT;
            case 13:
                return TimecardEvent.EventType.LARGE_TIMECARD_SPLIT_CREATE;
            case 14:
                return TimecardEvent.EventType.EDIT_REQUEST_EDIT;
            case 15:
                return TimecardEvent.EventType.UPDATE_CASH_TIPS;
            default:
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        return Object.class.cast(obj);
    }

    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public Object convert(Object obj) {
        int intValue = ((Integer) obj).intValue();
        w0 w0Var = intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? null : w0.frida_found : w0.library_integrity_broken : w0.sandbox_shared_objects_found : w0.sandbox_paths_found : w0.image_timestamp_is_not_from_current_capture_session : w0.hack_environment_variables_or_preloads_found;
        return w0Var == null ? w0.UNRECOGNIZED : w0Var;
    }

    @Override // kotlin.time.Clock
    public Instant now() {
        Instant.Companion companion = Instant.Companion;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis / 1000;
        if ((currentTimeMillis ^ 1000) < 0 && j * 1000 != currentTimeMillis) {
            j--;
        }
        long j2 = currentTimeMillis % 1000;
        return j < -31557014167219200L ? Instant.MIN : j > 31556889864403199L ? Instant.MAX : Instant.Companion.fromEpochSeconds((int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000), j);
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    /* renamed from: parse */
    public StripeModel mo4026parse(JSONObject jSONObject) {
        String optString = jSONObject.optString("message");
        optString.getClass();
        if (StringsKt.isBlank(optString)) {
            optString = null;
        }
        String optString2 = jSONObject.optString("type");
        optString2.getClass();
        if (StringsKt.isBlank(optString2)) {
            optString2 = null;
        }
        String optString3 = jSONObject.optString("code");
        optString3.getClass();
        return new BridgeErrorParams(optString, optString2, StringsKt.isBlank(optString3) ? null : optString3);
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static PhonePlanAppletV1.State m4314fromValue(int i) {
        switch (i) {
            case 0:
                return PhonePlanAppletV1.State.STATE_UNSPECIFIED;
            case 1:
                return PhonePlanAppletV1.State.NEVER_ENROLLED;
            case 2:
                return PhonePlanAppletV1.State.PENDING;
            case 3:
                return PhonePlanAppletV1.State.TRANSFERRING;
            case 4:
                return PhonePlanAppletV1.State.PROVISIONED;
            case 5:
                return PhonePlanAppletV1.State.ACTIVE;
            case 6:
                return PhonePlanAppletV1.State.BILL_OVERDUE;
            case 7:
                return PhonePlanAppletV1.State.SUSPENDED;
            case 8:
                return PhonePlanAppletV1.State.ATTENTION_NEEDED;
            case 9:
                return PhonePlanAppletV1.State.CANCELLED_PENDING;
            case 10:
                return PhonePlanAppletV1.State.DEGRADED;
            case 11:
                return PhonePlanAppletV1.State.CANCELLED;
            default:
                return null;
        }
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static CashGreenV1.Status m4312fromValue(int i) {
        if (i == 0) {
            return CashGreenV1.Status.STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return CashGreenV1.Status.INACTIVE;
        }
        if (i == 2) {
            return CashGreenV1.Status.ACTIVE;
        }
        if (i == 3) {
            return CashGreenV1.Status.CHURN;
        }
        if (i != 4) {
            return null;
        }
        return CashGreenV1.Status.INELIGIBLE;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static TimeOff.State m4311fromValue(int i) {
        if (i == 0) {
            return TimeOff.State.DO_NOT_USE;
        }
        if (i == 2) {
            return TimeOff.State.PENDING_AUTHORIZATION;
        }
        if (i == 3) {
            return TimeOff.State.AUTHORIZED;
        }
        if (i == 5) {
            return TimeOff.State.FORBIDDEN;
        }
        if (i == 6) {
            return TimeOff.State.CANCELED;
        }
        if (i != 7) {
            return null;
        }
        return TimeOff.State.OBSOLETE;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static BenefitsStatusSection.State m4313fromValue(int i) {
        if (i == 0) {
            return BenefitsStatusSection.State.UNSPECIFIED;
        }
        if (i == 1) {
            return BenefitsStatusSection.State.NULL_STATE;
        }
        if (i == 2) {
            return BenefitsStatusSection.State.PENDING_STATE;
        }
        if (i == 3) {
            return BenefitsStatusSection.State.ACTIVE_STATE;
        }
        if (i != 4) {
            return null;
        }
        return BenefitsStatusSection.State.INACTIVE_STATE;
    }
}
