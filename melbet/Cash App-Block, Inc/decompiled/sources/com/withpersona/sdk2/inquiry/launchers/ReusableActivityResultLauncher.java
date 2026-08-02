package com.withpersona.sdk2.inquiry.launchers;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;

/* loaded from: classes9.dex */
public final class ReusableActivityResultLauncher extends ActivityResultLauncher {
    public final ActivityResultCallback callback;
    public final ActivityResultContract contract;
    public ActivityResultLauncher currentLauncher;

    public ReusableActivityResultLauncher(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        this.contract = activityResultContract;
        this.callback = activityResultCallback;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final ActivityResultContract getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void launch(Object obj) {
        ActivityResultLauncher activityResultLauncher = this.currentLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(obj);
        }
    }

    public final void register(InquiryFragment inquiryFragment) {
        this.currentLauncher = inquiryFragment.registerForActivityResult(this.contract, this.callback);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void unregister() {
        ActivityResultLauncher activityResultLauncher = this.currentLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
    }
}
