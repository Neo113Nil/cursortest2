package com.squareup.cash.transfers.backend.real;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.tracing.Trace;
import com.fillr.e;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.cashoclock.api.v1_0.syncvalues.RecurringSchedule;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsPreference;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import java.time.Instant;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealScheduledReloadsManager implements ScheduledReloadsManager {
    public final AndroidDateFormatManager dateFormatManager;
    public final FeatureFlagManager featureFlagManager;
    public final RealInstrumentManager instrumentManager;
    public final RealProfileManager profileManager;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                e eVar = RecurringSchedule.Frequency.Companion;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e eVar2 = RecurringSchedule.Frequency.Companion;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e eVar3 = RecurringSchedule.Frequency.Companion;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e eVar4 = RecurringSchedule.Frequency.Companion;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_TWO_WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealScheduledReloadsManager(SyncValueReader syncValueReader, RealProfileManager realProfileManager, FeatureFlagManager featureFlagManager, AndroidStringManager androidStringManager, AndroidDateFormatManager androidDateFormatManager, RealInstrumentManager realInstrumentManager, RealIcuStringFormatter realIcuStringFormatter) {
        this.syncValueReader = syncValueReader;
        this.profileManager = realProfileManager;
        this.featureFlagManager = featureFlagManager;
        this.stringManager = androidStringManager;
        this.dateFormatManager = androidDateFormatManager;
        this.instrumentManager = realInstrumentManager;
    }

    public static ScheduledReloadsPreference disabledPreference$default(RealScheduledReloadsManager realScheduledReloadsManager, String str, ScheduledReloadsPreference.Source source, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        AndroidStringManager androidStringManager = realScheduledReloadsManager.stringManager;
        if (str == null) {
            str = androidStringManager.get(R.string.recurring_transfer_preference);
        }
        return new ScheduledReloadsPreference(str, androidStringManager.get(R.string.recurring_transfer_preference_disabled_description), ScheduledReloadsPreference.State.Disabled.INSTANCE, source);
    }

    public final String buildEnabledSubtitle(Long l, String str) {
        String str2;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        if (str == null) {
            str = androidStringManager.get(R.string.recurring_transfer_preference_default_source);
        }
        if (l != null) {
            Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
            AndroidDateFormatManager androidDateFormatManager = this.dateFormatManager;
            str2 = androidDateFormatManager.getDateFormat("MMMM d", androidDateFormatManager.clock.timeZone()).formatter.format(ofEpochMilli);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str.getClass();
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.recurring_transfer_preference_enabled_description_with_date)).format(new Object[]{str, str2});
            format2.getClass();
            return format2;
        }
        str.getClass();
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.recurring_transfer_preference_enabled_description)).format(new Object[]{str});
        format3.getClass();
        return format3;
    }

    public final ChannelFlowTransformLatest preferences() {
        SyncValueType syncValueType = SyncValueType.CASH_O_CLOCK_PREFERENCE;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashOClockPreference), this.instrumentManager.forType(CashInstrumentType.DEBIT_CARD), new CardModelView$getActiveHeat$2$2(this, (Continuation) null, 20), 0);
        return Trace.selectClientSyncValues(this.featureFlagManager, syncValueType, new FlowExtensionsKt$combine$$inlined$combine$1(11, this.profileManager.balanceData(), this), flowKt__ZipKt$combine$$inlined$unsafeFlow$1);
    }
}
