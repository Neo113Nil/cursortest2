package com.moyoung.classes;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.moyoung.classes.databinding.ActivityClassesTestBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes4.dex */
public class ClassesTestActivity extends BaseVBActivity<ActivityClassesTestBinding> {
    private void setupDao() {
        new com.moyoung.classes.db.a().setup(getApplicationContext());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        com.moyoung.dafit.module.common.utils.d.setContext(this);
        setupDao();
        super.onCreate(bundle);
    }
}
