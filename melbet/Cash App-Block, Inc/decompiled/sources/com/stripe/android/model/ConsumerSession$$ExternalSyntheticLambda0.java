package com.stripe.android.model;

import androidx.compose.runtime.Updater;
import com.stripe.android.financialconnections.model.Bullet$$serializer;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution$$serializer;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.NetworkedAccount$$serializer;
import com.stripe.android.financialconnections.model.OwnershipRefresh;
import com.stripe.android.financialconnections.model.PartnerAccount$$serializer;
import com.stripe.android.financialconnections.model.ServerLink$$serializer;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.ConsumerSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class ConsumerSession$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ConsumerSession$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KSerializer _init_$_anonymous_;
        KSerializer _init_$_anonymous_2;
        KSerializer _init_$_anonymous_3;
        switch (this.$r8$classId) {
            case 0:
                return new HashSetSerializer(ConsumerSession$VerificationSession$$serializer.INSTANCE, 1);
            case 1:
                return new HashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, 1);
            case 2:
                return new HashMapSerializer(StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, 1);
            case 3:
                return new HashSetSerializer(FinancialConnectionsInstitution$$serializer.INSTANCE, 1);
            case 4:
                return new HashSetSerializer(ServerLink$$serializer.INSTANCE, 1);
            case 5:
                return LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod.INSTANCE.serializer();
            case 6:
                _init_$_anonymous_ = LinkAccountSessionPaymentAccount.MicrodepositVerificationMethod._init_$_anonymous_();
                return _init_$_anonymous_;
            case 7:
                return new HashSetSerializer(PartnerAccount$$serializer.INSTANCE, 1);
            case 8:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer, stringSerializer, 1);
            case 9:
                return new HashSetSerializer(Bullet$$serializer.INSTANCE, 1);
            case 10:
                return OwnershipRefresh.Status.INSTANCE.serializer();
            case 11:
                _init_$_anonymous_2 = OwnershipRefresh.Status._init_$_anonymous_();
                return _init_$_anonymous_2;
            case 12:
                return new HashSetSerializer(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE, 1);
            case 13:
                return new HashSetSerializer(PartnerAccount$$serializer.INSTANCE, 1);
            case 14:
                return new HashSetSerializer(NetworkedAccount$$serializer.INSTANCE, 1);
            case 15:
                return new HashSetSerializer(StringSerializer.INSTANCE, 1);
            case 16:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 17:
                int i = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                return FinancialConnectionsSheetNativeViewModel.Factory;
            case 18:
                throw new IllegalStateException("No NavHostController provided");
            case 19:
                throw new IllegalStateException("No TestMode provided");
            case 20:
                throw new IllegalStateException("No ImageLoader provided");
            case 21:
                throw new IllegalStateException("No TopAppBarHost provided");
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                throw new IllegalStateException("no Typography provided");
            case 25:
                throw new IllegalStateException("no Colors provided");
            case 26:
                return new HashSetSerializer(ConsentUi$ConsentPane$ScopesSection$Scope$$serializer.INSTANCE, 1);
            case 27:
                return ConsumerSession.AuthenticationLevel.INSTANCE.serializer();
            case 28:
                return ConsumerSession.AuthenticationLevel.INSTANCE.serializer();
            default:
                _init_$_anonymous_3 = ConsumerSession.AuthenticationLevel._init_$_anonymous_();
                return _init_$_anonymous_3;
        }
    }
}
