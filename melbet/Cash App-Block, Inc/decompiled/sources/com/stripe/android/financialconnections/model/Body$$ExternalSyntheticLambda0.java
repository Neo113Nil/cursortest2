package com.stripe.android.financialconnections.model;

import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.runtime.Updater;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.financialconnections.model.AccountHolder;
import com.stripe.android.financialconnections.model.Balance;
import com.stripe.android.financialconnections.model.BalanceRefresh;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.serializer.EntrySerializer;
import com.stripe.android.payments.StripeBrowserLauncherViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class Body$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Body$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _init_$_anonymous_3;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                return new HashSetSerializer(EntrySerializer.INSTANCE, 1);
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 5:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                EnterTransitionImpl enterTransitionImpl = SuccessContentKt.FADE_IN_ANIMATION;
                return Boolean.FALSE;
            case 11:
                return Updater.mutableStateOf$default(true);
            case 12:
                return Unit.INSTANCE;
            case 13:
                int i2 = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                return new StripeBrowserLauncherViewModel.Factory(i);
            case 14:
                return AccountHolder.Type.INSTANCE.serializer();
            case 15:
                _init_$_anonymous_ = AccountHolder.Type._init_$_anonymous_();
                return _init_$_anonymous_;
            case 16:
                return new HashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE, 1);
            case 17:
                return Balance.Type.INSTANCE.serializer();
            case 18:
                _init_$_anonymous_2 = Balance.Type._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 19:
                return BalanceRefresh.BalanceRefreshStatus.INSTANCE.serializer();
            case 20:
                _init_$_anonymous_3 = BalanceRefresh.BalanceRefreshStatus._init_$_anonymous_();
                return _init_$_anonymous_3;
            case 21:
                return new HashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE, 1);
            case 22:
                return new HashSetSerializer(Bullet$$serializer.INSTANCE, 1);
            case 23:
                return new HashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE, 1);
            case 24:
                return new HashSetSerializer(Bullet$$serializer.INSTANCE, 1);
            case 25:
                return new HashSetSerializer(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE, 1);
            case 26:
                return new HashSetSerializer(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE, 1);
            case 27:
                return new HashSetSerializer(FinancialConnectionsAccount$$serializer.INSTANCE, 1);
            case 28:
                return new HashSetSerializer(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE, 1);
            default:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer, stringSerializer, 1);
        }
    }
}
