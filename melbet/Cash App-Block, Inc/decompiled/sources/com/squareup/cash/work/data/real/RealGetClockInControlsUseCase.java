package com.squareup.cash.work.data.real;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.work.data.api.GetClockInControlsUseCase;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealSettingRepository;
import java.time.Instant;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes7.dex */
public final class RealGetClockInControlsUseCase implements GetClockInControlsUseCase {
    public static final Set END_BREAK_EARLY_PERMISSIONS = ArraysKt___ArraysKt.toSet(new String[]{"END_TIMECARD_BREAK_EARLY", "EMPLOYEE_END_TIMECARD_BREAK_EARLY", "MOBILE_EMPLOYEE_END_TIMECARD_BREAK_EARLY"});
    public final RealCurrentUserProvider currentUserProvider;
    public final RealMembershipRepository membershipRepository;
    public final RealMerchantRepository merchantRepository;
    public final RealSelectedMerchantProvider selectedMerchantProvider;
    public final RealSettingRepository settingRepository;

    public RealGetClockInControlsUseCase(RealCurrentUserProvider realCurrentUserProvider, RealMerchantRepository realMerchantRepository, RealSettingRepository realSettingRepository, RealMembershipRepository realMembershipRepository, RealSelectedMerchantProvider realSelectedMerchantProvider) {
        this.currentUserProvider = realCurrentUserProvider;
        this.merchantRepository = realMerchantRepository;
        this.settingRepository = realSettingRepository;
        this.membershipRepository = realMembershipRepository;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
    }

    /* renamed from: parseDuration-LV8wdWc, reason: not valid java name */
    public static Duration m3794parseDurationLV8wdWc(String str) {
        try {
            java.time.Duration parse = java.time.Duration.parse(str);
            parse.getClass();
            return new Duration(Duration.m4173plusLRDsOJo(DurationKt.toDuration(parse.getSeconds(), DurationUnit.SECONDS), DurationKt.toDuration(parse.getNano(), DurationUnit.NANOSECONDS)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final Flow getControls(Instant instant) {
        return FlowKt.distinctUntilChanged(FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.selectedMerchantProvider.getMerchantIdentifierFlow(), 24), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1((Continuation) null, this, instant, 28)));
    }
}
