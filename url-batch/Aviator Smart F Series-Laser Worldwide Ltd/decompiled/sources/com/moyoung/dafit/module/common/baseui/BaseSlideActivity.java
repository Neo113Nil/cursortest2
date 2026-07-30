package com.moyoung.dafit.module.common.baseui;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.viewbinding.ViewBinding;
import com.moyoung.dafit.module.common.utils.t0;

/* loaded from: classes4.dex */
public class BaseSlideActivity<VB extends ViewBinding> extends BaseVBActivity<VB> {
    private void setupWindowAnimations() {
        getWindow().setEnterTransition(com.moyoung.dafit.module.common.utils.c.createBottomSlideAnimation(this));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setupWindowAnimations();
    }

    public void transitionToActivity(Intent intent) {
        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this, t0.createSafeTransitionParticipants(this, false, new Pair[0])).toBundle());
    }
}
