package com.squareup.cash.tabprovider.real;

import com.squareup.cash.db2.profile.BalanceData;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.work.applets.views.WorkApplet$appletAvailabilityState$1$WhenMappings;
import com.squareup.protos.cash.local.client.app.v1.account.LocalAccount;
import com.squareup.protos.cash.staff.syncvalues.CashForWorkAppletV1;
import com.squareup.protos.cash.staff.syncvalues.VersionedCashForWorkApplet;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.wire.AndroidMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealLocalTabProvider$showLocal$1$2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ AndroidMessage L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealLocalTabProvider$showLocal$1$2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        switch (this.$r8$classId) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                RealLocalTabProvider$showLocal$1$2 realLocalTabProvider$showLocal$1$2 = new RealLocalTabProvider$showLocal$1$2(i, (Continuation) obj4, 0);
                realLocalTabProvider$showLocal$1$2.Z$0 = booleanValue;
                realLocalTabProvider$showLocal$1$2.L$0 = (LocalAccount) obj2;
                realLocalTabProvider$showLocal$1$2.L$1 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj3;
                return realLocalTabProvider$showLocal$1$2.invokeSuspend(Unit.INSTANCE);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                RealLocalTabProvider$showLocal$1$2 realLocalTabProvider$showLocal$1$22 = new RealLocalTabProvider$showLocal$1$2(i, (Continuation) obj4, 1);
                realLocalTabProvider$showLocal$1$22.L$0 = (DirectDepositAccount) obj;
                realLocalTabProvider$showLocal$1$22.Z$0 = booleanValue2;
                realLocalTabProvider$showLocal$1$22.L$1 = (BalanceData) obj3;
                return realLocalTabProvider$showLocal$1$22.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                RealLocalTabProvider$showLocal$1$2 realLocalTabProvider$showLocal$1$23 = new RealLocalTabProvider$showLocal$1$2(i, (Continuation) obj4, 2);
                realLocalTabProvider$showLocal$1$23.Z$0 = booleanValue3;
                realLocalTabProvider$showLocal$1$23.L$1 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj2;
                realLocalTabProvider$showLocal$1$23.L$0 = (VersionedCashForWorkApplet) obj3;
                return realLocalTabProvider$showLocal$1$23.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r0 == false) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CashForWorkAppletV1 cashForWorkAppletV1;
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                boolean z2 = this.Z$0;
                LocalAccount localAccount = (LocalAccount) this.L$0;
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!(localAccount != null ? Intrinsics.areEqual(localAccount.show_geo_tab, Boolean.TRUE) : false) || !featureFlag$EnabledDisabledFeatureFlag$Options.enabled()) {
                    if (!(localAccount != null ? Intrinsics.areEqual(localAccount.show_tab, Boolean.TRUE) : false)) {
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 1:
                DirectDepositAccount directDepositAccount = (DirectDepositAccount) this.L$0;
                boolean z3 = this.Z$0;
                BalanceData balanceData = (BalanceData) this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new UiDda(directDepositAccount, Boolean.valueOf(z3), balanceData.direct_deposit, balanceData.dda_form, ByteString.EMPTY);
            default:
                boolean z4 = this.Z$0;
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options2 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) this.L$1;
                VersionedCashForWorkApplet versionedCashForWorkApplet = (VersionedCashForWorkApplet) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!featureFlag$EnabledDisabledFeatureFlag$Options2.enabled()) {
                    return AppletAvailabilityState.UNAVAILABLE;
                }
                CashForWorkAppletV1.Visibility visibility = (versionedCashForWorkApplet == null || (cashForWorkAppletV1 = versionedCashForWorkApplet.cash_for_work_applet_v1) == null) ? null : cashForWorkAppletV1.visibility;
                int i = visibility == null ? -1 : WorkApplet$appletAvailabilityState$1$WhenMappings.$EnumSwitchMapping$0[visibility.ordinal()];
                if (i == 1) {
                    z = true;
                } else if (i != 2) {
                    z = z4;
                }
                return z ? AppletAvailabilityState.AVAILABLE : AppletAvailabilityState.UNAVAILABLE;
        }
    }
}
