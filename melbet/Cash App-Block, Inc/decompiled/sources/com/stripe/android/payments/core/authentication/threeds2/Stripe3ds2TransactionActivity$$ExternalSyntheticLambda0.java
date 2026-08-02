package com.stripe.android.payments.core.authentication.threeds2;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final /* synthetic */ class Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Stripe3ds2TransactionActivity f$0;

    public /* synthetic */ Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = stripe3ds2TransactionActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = this.f$0;
        switch (i) {
            case 0:
                return stripe3ds2TransactionActivity.viewModelFactory;
            case 1:
                int i2 = Stripe3ds2TransactionActivity.$r8$clinit;
                View inflate = stripe3ds2TransactionActivity.getLayoutInflater().inflate(R.layout.stripe_3ds2_transaction_layout, (ViewGroup) null, false);
                if (inflate != null) {
                    return new Stripe3ds2TransactionLayoutBinding((FragmentContainerView) inflate);
                }
                a$$ExternalSyntheticBUOutline0.m$2("rootView");
                return null;
            default:
                int i3 = Stripe3ds2TransactionActivity.$r8$clinit;
                Stripe3ds2TransactionContract.Args args = stripe3ds2TransactionActivity.args;
                if (args != null) {
                    return args;
                }
                Intrinsics.throwUninitializedPropertyAccessException("args");
                throw null;
        }
    }
}
