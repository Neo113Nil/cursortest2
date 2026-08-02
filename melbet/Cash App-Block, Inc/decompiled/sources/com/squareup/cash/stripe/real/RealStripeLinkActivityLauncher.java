package com.squareup.cash.stripe.real;

import androidx.activity.ComponentActivity;
import androidx.activity.result.contract.ActivityResultContract;
import com.squareup.util.android.SimpleActivityForResultLauncher;

/* loaded from: classes.dex */
public final class RealStripeLinkActivityLauncher extends SimpleActivityForResultLauncher {
    @Override // com.squareup.util.android.SimpleActivityForResultLauncher
    public final ActivityResultContract contract(ComponentActivity componentActivity) {
        return new StripeActivityResultContract(componentActivity);
    }
}
