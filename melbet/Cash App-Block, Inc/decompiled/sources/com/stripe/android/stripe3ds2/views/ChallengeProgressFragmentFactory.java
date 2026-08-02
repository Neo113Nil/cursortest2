package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ChallengeProgressFragmentFactory extends FragmentFactory {
    public final Integer accentColor;
    public final String directoryServerName;
    public final SdkTransactionId sdkTransactionId;

    public ChallengeProgressFragmentFactory(String str, SdkTransactionId sdkTransactionId, Integer num) {
        str.getClass();
        sdkTransactionId.getClass();
        this.directoryServerName = str;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.FragmentFactory
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        if (Intrinsics.areEqual(str, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.directoryServerName, this.sdkTransactionId, this.accentColor);
        }
        Fragment instantiate = super.instantiate(classLoader, str);
        instantiate.getClass();
        return instantiate;
    }
}
