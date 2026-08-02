package com.stripe.android.payments.bankaccount.ui;

import android.content.Intent;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class CollectBankAccountActivity$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CollectBankAccountActivity f$0;

    public /* synthetic */ CollectBankAccountActivity$$ExternalSyntheticLambda0(CollectBankAccountActivity collectBankAccountActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = collectBankAccountActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CollectBankAccountActivity collectBankAccountActivity = this.f$0;
        switch (i) {
            case 0:
                int i2 = CollectBankAccountActivity.$r8$clinit;
                Intent intent = collectBankAccountActivity.getIntent();
                intent.getClass();
                return (CollectBankAccountContract.Args) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            case 1:
                int i3 = CollectBankAccountActivity.$r8$clinit;
                int i4 = 2;
                return new InitializerViewModelFactory(new CollectBankAccountActivity$$ExternalSyntheticLambda0(collectBankAccountActivity, i4), i4);
            default:
                int i5 = CollectBankAccountActivity.$r8$clinit;
                CollectBankAccountContract.Args args = (CollectBankAccountContract.Args) collectBankAccountActivity.starterArgs$delegate.getValue();
                if (args != null) {
                    return args;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
        }
    }
}
