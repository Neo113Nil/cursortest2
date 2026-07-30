package com.crrepa.band.my.health.ecg;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityEcgMeasureBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class BandEcgMeasureActivity extends BaseVBActivity<ActivityEcgMeasureBinding> {
    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) BandEcgMeasureActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        loadRootFragment(R.id.ecg_measure_content, BandEcgStartMeasureFragment.newInstance());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityEcgMeasureBinding) this.binding).includedTitle.ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgMeasureActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getWindow().addFlags(128);
    }

    public void setTitle(String str) {
        ((ActivityEcgMeasureBinding) this.binding).includedTitle.tvTitle.setText(str);
    }
}
